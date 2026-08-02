package net.time4j.format.expert;

import com.tencent.mmkv.MMKV;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import net.time4j.base.UnixTime;
import net.time4j.engine.AttributeQuery;
import net.time4j.engine.ChronoDisplay;
import net.time4j.engine.ChronoElement;
import net.time4j.format.Attributes;
import net.time4j.format.DisplayMode;
import net.time4j.format.Leniency;
import net.time4j.tz.OffsetSign;
import net.time4j.tz.TZID;
import net.time4j.tz.Timezone;
import net.time4j.tz.ZonalOffset;
import org.objectweb.asm.signature.SignatureVisitor;

/* loaded from: classes10.dex */
final class TimezoneOffsetProcessor implements FormatProcessor<TZID> {
    static final TimezoneOffsetProcessor EXTENDED_LONG_PARSER = new TimezoneOffsetProcessor();
    private final boolean caseInsensitive;
    private final boolean extended;
    private final Leniency lenientMode;
    private final DisplayMode precision;
    private final List<String> zeroOffsets;

    @Override // net.time4j.format.expert.FormatProcessor
    public boolean isNumerical() {
        return false;
    }

    @Override // net.time4j.format.expert.FormatProcessor
    public FormatProcessor<TZID> withElement(ChronoElement<TZID> chronoElement) {
        return this;
    }

    TimezoneOffsetProcessor(DisplayMode displayMode, boolean z, List<String> list) {
        if (displayMode == null) {
            throw new NullPointerException("Missing display mode.");
        }
        if (list.isEmpty()) {
            throw new IllegalArgumentException("Missing zero offsets.");
        }
        ArrayList arrayList = new ArrayList(list);
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            if (((String) it.next()).trim().isEmpty()) {
                throw new IllegalArgumentException("Zero offset must not be white-space-only.");
            }
        }
        this.precision = displayMode;
        this.extended = z;
        this.zeroOffsets = Collections.unmodifiableList(arrayList);
        this.caseInsensitive = true;
        this.lenientMode = Leniency.SMART;
    }

    private TimezoneOffsetProcessor() {
        this.precision = DisplayMode.LONG;
        this.extended = true;
        this.zeroOffsets = Collections.EMPTY_LIST;
        this.caseInsensitive = true;
        this.lenientMode = Leniency.SMART;
    }

    private TimezoneOffsetProcessor(DisplayMode displayMode, boolean z, List<String> list, boolean z2, Leniency leniency) {
        this.precision = displayMode;
        this.extended = z;
        this.zeroOffsets = list;
        this.caseInsensitive = z2;
        this.lenientMode = leniency;
    }

    @Override // net.time4j.format.expert.FormatProcessor
    public int print(ChronoDisplay chronoDisplay, Appendable appendable, AttributeQuery attributeQuery, Set<ElementPosition> set, boolean z) throws IOException {
        ZonalOffset offset;
        int i;
        int i2;
        int length = appendable instanceof CharSequence ? ((CharSequence) appendable).length() : -1;
        TZID timezone = chronoDisplay.hasTimezone() ? chronoDisplay.getTimezone() : null;
        if (timezone == null) {
            offset = getOffset(chronoDisplay, attributeQuery);
        } else if (timezone instanceof ZonalOffset) {
            offset = (ZonalOffset) timezone;
        } else if (chronoDisplay instanceof UnixTime) {
            offset = Timezone.of(timezone).getOffset((UnixTime) chronoDisplay);
        } else {
            throw new IllegalArgumentException("Cannot extract timezone offset from: " + chronoDisplay);
        }
        int integralAmount = offset.getIntegralAmount();
        int fractionalAmount = offset.getFractionalAmount();
        if ((integralAmount | fractionalAmount) == 0) {
            String str = this.zeroOffsets.get(0);
            appendable.append(str);
            i2 = str.length();
        } else {
            appendable.append((integralAmount < 0 || fractionalAmount < 0) ? '-' : SignatureVisitor.EXTENDS);
            int abs = Math.abs(integralAmount);
            int i3 = abs / MMKV.ExpireInHour;
            int i4 = (abs / 60) % 60;
            int i5 = abs % 60;
            if (i3 < 10) {
                appendable.append('0');
                i = 2;
            } else {
                i = 1;
            }
            String valueOf = String.valueOf(i3);
            appendable.append(valueOf);
            int length2 = valueOf.length() + i;
            if (this.precision != DisplayMode.SHORT || i4 != 0) {
                if (this.extended) {
                    appendable.append(AbstractJsonLexerKt.COLON);
                    length2++;
                }
                if (i4 < 10) {
                    appendable.append('0');
                    length2++;
                }
                String valueOf2 = String.valueOf(i4);
                appendable.append(valueOf2);
                length2 += valueOf2.length();
                if (this.precision != DisplayMode.SHORT && this.precision != DisplayMode.MEDIUM && (this.precision == DisplayMode.FULL || (i5 | fractionalAmount) != 0)) {
                    if (this.extended) {
                        appendable.append(AbstractJsonLexerKt.COLON);
                        length2++;
                    }
                    if (i5 < 10) {
                        appendable.append('0');
                        length2++;
                    }
                    String valueOf3 = String.valueOf(i5);
                    appendable.append(valueOf3);
                    int length3 = valueOf3.length() + length2;
                    if (fractionalAmount != 0) {
                        appendable.append('.');
                        int i6 = length3 + 1;
                        String valueOf4 = String.valueOf(Math.abs(fractionalAmount));
                        int length4 = 9 - valueOf4.length();
                        for (int i7 = 0; i7 < length4; i7++) {
                            appendable.append('0');
                            i6++;
                        }
                        appendable.append(valueOf4);
                        i2 = valueOf4.length() + i6;
                    } else {
                        i2 = length3;
                    }
                }
            }
            i2 = length2;
        }
        if (length != -1 && i2 > 0 && set != null) {
            set.add(new ElementPosition(TimezoneElement.TIMEZONE_ID, length, length + i2));
        }
        return i2;
    }

    /* JADX WARN: Removed duplicated region for block: B:105:0x01a7  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0151  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x015d  */
    @Override // net.time4j.format.expert.FormatProcessor
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void parse(CharSequence charSequence, ParseLog parseLog, AttributeQuery attributeQuery, ParsedEntity<?> parsedEntity, boolean z) {
        OffsetSign offsetSign;
        int parseNum;
        int i;
        int i2;
        int i3;
        ZonalOffset ofTotalSeconds;
        int parseNum2;
        int i4;
        boolean booleanValue;
        int length = charSequence.length();
        int position = parseLog.getPosition();
        if (position >= length) {
            parseLog.setError(position, "Missing timezone offset.");
            return;
        }
        for (String str : this.zeroOffsets) {
            int length2 = str.length();
            if (length - position >= length2) {
                int i5 = length2 + position;
                String charSequence2 = charSequence.subSequence(position, i5).toString();
                if (z) {
                    booleanValue = this.caseInsensitive;
                } else {
                    booleanValue = ((Boolean) attributeQuery.get(Attributes.PARSE_CASE_INSENSITIVE, Boolean.TRUE)).booleanValue();
                }
                if ((booleanValue && charSequence2.equalsIgnoreCase(str)) || (!booleanValue && charSequence2.equals(str))) {
                    parsedEntity.put(TimezoneElement.TIMEZONE_OFFSET, ZonalOffset.UTC);
                    parseLog.setPosition(i5);
                    return;
                }
            }
        }
        Leniency leniency = z ? this.lenientMode : (Leniency) attributeQuery.get(Attributes.LENIENCY, Leniency.SMART);
        char charAt = charSequence.charAt(position);
        if (charAt == '+') {
            offsetSign = OffsetSign.AHEAD_OF_UTC;
        } else if (charAt == '-') {
            offsetSign = OffsetSign.BEHIND_UTC;
        } else {
            if (Character.isDigit(charAt) && leniency.isLax()) {
                offsetSign = OffsetSign.AHEAD_OF_UTC;
                parseNum = parseNum(charSequence, position, leniency);
                if (parseNum != -1000) {
                    parseLog.setError(position, "Hour part in timezone offset does not match expected pattern HH.");
                    return;
                }
                if (parseNum < 0) {
                    parseNum = ~parseNum;
                    i = position + 1;
                } else {
                    i = position + 2;
                }
                if (i >= length) {
                    if (this.precision == DisplayMode.SHORT) {
                        parsedEntity.put(TimezoneElement.TIMEZONE_OFFSET, ZonalOffset.ofHours(offsetSign, parseNum));
                        parseLog.setPosition(i);
                        return;
                    } else {
                        parseLog.setError(i, "Missing minute part in timezone offset.");
                        return;
                    }
                }
                int i6 = 0;
                if (!this.extended) {
                    i2 = 0;
                } else {
                    if (charSequence.charAt(i) != ':') {
                        if (this.precision == DisplayMode.SHORT) {
                            parsedEntity.put(TimezoneElement.TIMEZONE_OFFSET, ZonalOffset.ofHours(offsetSign, parseNum));
                            parseLog.setPosition(i);
                            return;
                        } else {
                            parseLog.setError(i, "Colon expected in timezone offset.");
                            return;
                        }
                    }
                    i2 = 1;
                }
                int i7 = i2 + i;
                int parseNum3 = parseNum(charSequence, i7, Leniency.STRICT);
                if (parseNum3 == -1000) {
                    if (this.precision == DisplayMode.SHORT) {
                        parsedEntity.put(TimezoneElement.TIMEZONE_OFFSET, ZonalOffset.ofHours(offsetSign, parseNum));
                        parseLog.setPosition(i);
                        return;
                    } else {
                        parseLog.setError(i7, "Minute part in timezone offset does not match expected pattern mm.");
                        return;
                    }
                }
                int i8 = i7 + 2;
                if (i8 < length && (this.precision == DisplayMode.LONG || this.precision == DisplayMode.FULL)) {
                    if (this.extended) {
                        if (charSequence.charAt(i8) == ':') {
                            parseNum2 = parseNum(charSequence, i7 + 3, Leniency.STRICT);
                            i4 = 1;
                            if (parseNum2 != -1000) {
                                if (this.precision == DisplayMode.FULL) {
                                    parseLog.setError(i8, "Second part in timezone offset does not match expected pattern ss.");
                                    return;
                                }
                            } else {
                                int i9 = i8 + i4;
                                int i10 = i9 + 2;
                                if (i9 + 12 <= length && charSequence.charAt(i10) == '.') {
                                    int i11 = i9 + 3;
                                    int i12 = i9 + 12;
                                    i10 = i11;
                                    while (i11 < i12) {
                                        char charAt2 = charSequence.charAt(i11);
                                        if (charAt2 < '0' || charAt2 > '9') {
                                            parseLog.setError(i10, "9 digits in fractional part of timezone offset expected.");
                                            return;
                                        } else {
                                            i6 = (i6 * 10) + (charAt2 - '0');
                                            i10++;
                                            i11++;
                                        }
                                    }
                                }
                                i8 = i10;
                                i3 = i6;
                                i6 = parseNum2;
                                if (i6 != 0 && i3 == 0) {
                                    ofTotalSeconds = ZonalOffset.ofHoursMinutes(offsetSign, parseNum, parseNum3);
                                } else {
                                    int i13 = (parseNum * MMKV.ExpireInHour) + (parseNum3 * 60) + i6;
                                    if (offsetSign == OffsetSign.BEHIND_UTC) {
                                        i13 = -i13;
                                        i3 = -i3;
                                    }
                                    ofTotalSeconds = ZonalOffset.ofTotalSeconds(i13, i3);
                                }
                                parsedEntity.put(TimezoneElement.TIMEZONE_OFFSET, ofTotalSeconds);
                                parseLog.setPosition(i8);
                                return;
                            }
                        } else {
                            if (this.precision == DisplayMode.FULL) {
                                parseLog.setError(i8, "Colon expected in timezone offset.");
                                return;
                            }
                            parseNum2 = -1000;
                        }
                    } else {
                        parseNum2 = parseNum(charSequence, i8, Leniency.STRICT);
                    }
                    i4 = 0;
                    if (parseNum2 != -1000) {
                    }
                }
                i3 = 0;
                if (i6 != 0) {
                }
                int i132 = (parseNum * MMKV.ExpireInHour) + (parseNum3 * 60) + i6;
                if (offsetSign == OffsetSign.BEHIND_UTC) {
                }
                ofTotalSeconds = ZonalOffset.ofTotalSeconds(i132, i3);
                parsedEntity.put(TimezoneElement.TIMEZONE_OFFSET, ofTotalSeconds);
                parseLog.setPosition(i8);
                return;
            }
            parseLog.setError(position, "Missing sign of timezone offset.");
            return;
        }
        position++;
        parseNum = parseNum(charSequence, position, leniency);
        if (parseNum != -1000) {
        }
    }

    @Override // net.time4j.format.expert.FormatProcessor
    public ChronoElement<TZID> getElement() {
        return TimezoneElement.TIMEZONE_OFFSET;
    }

    @Override // net.time4j.format.expert.FormatProcessor
    public FormatProcessor<TZID> quickPath(ChronoFormatter<?> chronoFormatter, AttributeQuery attributeQuery, int i) {
        return new TimezoneOffsetProcessor(this.precision, this.extended, this.zeroOffsets, ((Boolean) attributeQuery.get(Attributes.PARSE_CASE_INSENSITIVE, Boolean.TRUE)).booleanValue(), (Leniency) attributeQuery.get(Attributes.LENIENCY, Leniency.SMART));
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof TimezoneOffsetProcessor) {
            TimezoneOffsetProcessor timezoneOffsetProcessor = (TimezoneOffsetProcessor) obj;
            if (this.precision == timezoneOffsetProcessor.precision && this.extended == timezoneOffsetProcessor.extended && this.zeroOffsets.equals(timezoneOffsetProcessor.zeroOffsets)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return (this.precision.hashCode() * 7) + (this.zeroOffsets.hashCode() * 31) + (this.extended ? 1 : 0);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(64);
        sb.append(getClass().getName());
        sb.append("[precision=");
        sb.append(this.precision);
        sb.append(", extended=");
        sb.append(this.extended);
        sb.append(", zero-offsets=");
        sb.append(this.zeroOffsets);
        sb.append(AbstractJsonLexerKt.END_LIST);
        return sb.toString();
    }

    private static ZonalOffset getOffset(ChronoDisplay chronoDisplay, AttributeQuery attributeQuery) {
        if (attributeQuery.contains(Attributes.TIMEZONE_ID)) {
            TZID tzid = (TZID) attributeQuery.get(Attributes.TIMEZONE_ID);
            if (tzid instanceof ZonalOffset) {
                return (ZonalOffset) tzid;
            }
            if (tzid != null) {
                throw new IllegalArgumentException("Use a timezone offset instead of [" + tzid.canonical() + "] when formatting [" + chronoDisplay + "].");
            }
        }
        throw new IllegalArgumentException("Cannot extract timezone offset from format attributes for: " + chronoDisplay);
    }

    private static int parseNum(CharSequence charSequence, int i, Leniency leniency) {
        int i2 = 0;
        for (int i3 = 0; i3 < 2; i3++) {
            int i4 = i + i3;
            char charAt = i4 >= charSequence.length() ? (char) 0 : charSequence.charAt(i4);
            if (charAt < '0' || charAt > '9') {
                if (i3 == 0 || leniency.isStrict()) {
                    return -1000;
                }
                return ~i2;
            }
            i2 = (i2 * 10) + (charAt - '0');
        }
        return i2;
    }
}
