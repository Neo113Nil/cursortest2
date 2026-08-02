package net.time4j.format.expert;

import com.tencent.mmkv.MMKV;
import java.io.IOException;
import java.util.Locale;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import net.time4j.base.UnixTime;
import net.time4j.engine.AttributeQuery;
import net.time4j.engine.ChronoDisplay;
import net.time4j.engine.ChronoElement;
import net.time4j.format.Attributes;
import net.time4j.format.CalendarText;
import net.time4j.format.Leniency;
import net.time4j.tz.OffsetSign;
import net.time4j.tz.TZID;
import net.time4j.tz.Timezone;
import net.time4j.tz.ZonalOffset;
import org.apache.commons.lang3.time.TimeZones;
import org.slf4j.Marker;

/* loaded from: classes10.dex */
final class LocalizedGMTProcessor implements FormatProcessor<TZID> {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    private final boolean abbreviated;
    private final boolean caseInsensitive;
    private final Leniency lenientMode;
    private final Locale locale;
    private final String minusSign;
    private final boolean noPrefix;
    private final String plusSign;
    private final char zeroDigit;
    private static final ZonalOffset PROTOTYPE = ZonalOffset.ofTotalSeconds(64800);
    private static final ConcurrentMap<Locale, String> UTC_LITERALS = new ConcurrentHashMap();
    private static final ConcurrentMap<Locale, Info> STD_PATTERN_INFOS = new ConcurrentHashMap();

    @Override // net.time4j.format.expert.FormatProcessor
    public boolean isNumerical() {
        return false;
    }

    @Override // net.time4j.format.expert.FormatProcessor
    public FormatProcessor<TZID> withElement(ChronoElement<TZID> chronoElement) {
        return this;
    }

    LocalizedGMTProcessor(boolean z) {
        this(z, true, false, Locale.ROOT, Marker.ANY_NON_NULL_MARKER, "-", '0', Leniency.SMART);
    }

    private LocalizedGMTProcessor(boolean z, boolean z2, boolean z3, Locale locale, String str, String str2, char c, Leniency leniency) {
        this.abbreviated = z;
        this.caseInsensitive = z2;
        this.noPrefix = z3;
        this.locale = locale;
        this.plusSign = str;
        this.minusSign = str2;
        this.zeroDigit = c;
        this.lenientMode = leniency;
    }

    @Override // net.time4j.format.expert.FormatProcessor
    public int print(ChronoDisplay chronoDisplay, Appendable appendable, AttributeQuery attributeQuery, Set<ElementPosition> set, boolean z) throws IOException {
        ZonalOffset offset;
        char charValue;
        boolean booleanValue;
        int i;
        ZonalOffset zonalOffset;
        int length;
        int length2 = appendable instanceof CharSequence ? ((CharSequence) appendable).length() : -1;
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
        Locale locale = z ? this.locale : (Locale) attributeQuery.get(Attributes.LANGUAGE, Locale.ROOT);
        char c = '0';
        if (z) {
            charValue = this.zeroDigit;
        } else {
            charValue = ((Character) attributeQuery.get(Attributes.ZERO_DIGIT, '0')).charValue();
        }
        String str = z ? this.plusSign : (String) attributeQuery.get(AttributeSet.PLUS_SIGN, Marker.ANY_NON_NULL_MARKER);
        String str2 = z ? this.minusSign : (String) attributeQuery.get(AttributeSet.MINUS_SIGN, "-");
        if (z) {
            booleanValue = this.noPrefix;
        } else {
            booleanValue = ((Boolean) attributeQuery.get(Attributes.NO_GMT_PREFIX, Boolean.FALSE)).booleanValue();
        }
        int integralAmount = offset.getIntegralAmount();
        int fractionalAmount = offset.getFractionalAmount();
        if (!booleanValue && integralAmount == 0 && fractionalAmount == 0) {
            String literalUTC = getLiteralUTC(locale);
            appendable.append(literalUTC);
            i = literalUTC.length();
        } else {
            Info patternInfo = getPatternInfo(locale);
            int length3 = patternInfo.pattern.length();
            int i2 = 0;
            int i3 = 0;
            while (i3 < length3) {
                char c2 = c;
                char charAt = patternInfo.pattern.charAt(i3);
                if (patternInfo.start > i3 || patternInfo.end <= i3) {
                    zonalOffset = offset;
                    if (!booleanValue) {
                        appendable.append(charAt);
                        i2++;
                    }
                } else {
                    if (offset.getSign() == OffsetSign.BEHIND_UTC) {
                        appendable.append(str2);
                        length = str2.length();
                    } else {
                        appendable.append(str);
                        length = str.length();
                    }
                    i2 += length;
                    int absoluteHours = offset.getAbsoluteHours();
                    int absoluteMinutes = offset.getAbsoluteMinutes();
                    int absoluteSeconds = offset.getAbsoluteSeconds();
                    if (absoluteHours < 10 && !this.abbreviated) {
                        appendable.append(charValue);
                        i2++;
                    }
                    String valueOf = String.valueOf(absoluteHours);
                    zonalOffset = offset;
                    for (int i4 = 0; i4 < valueOf.length(); i4++) {
                        appendable.append((char) ((valueOf.charAt(i4) - '0') + charValue));
                        i2++;
                    }
                    if (absoluteMinutes != 0 || absoluteSeconds != 0 || !this.abbreviated) {
                        appendable.append(patternInfo.separator);
                        i2 += patternInfo.separator.length();
                        if (absoluteMinutes < 10) {
                            appendable.append(charValue);
                            i2++;
                        }
                        String valueOf2 = String.valueOf(absoluteMinutes);
                        for (int i5 = 0; i5 < valueOf2.length(); i5++) {
                            appendable.append((char) ((valueOf2.charAt(i5) - '0') + charValue));
                            i2++;
                        }
                        if (absoluteSeconds != 0) {
                            appendable.append(patternInfo.separator);
                            i2 += patternInfo.separator.length();
                            if (absoluteSeconds < 10) {
                                appendable.append(charValue);
                                i2++;
                            }
                            String valueOf3 = String.valueOf(absoluteSeconds);
                            for (int i6 = 0; i6 < valueOf3.length(); i6++) {
                                appendable.append((char) ((valueOf3.charAt(i6) - '0') + charValue));
                                i2++;
                            }
                        }
                    }
                    i3 = patternInfo.end - 1;
                }
                i3++;
                c = c2;
                offset = zonalOffset;
            }
            i = i2;
        }
        if (length2 != -1 && i > 0 && set != null) {
            set.add(new ElementPosition(TimezoneElement.TIMEZONE_ID, length2, length2 + i));
        }
        return i;
    }

    @Override // net.time4j.format.expert.FormatProcessor
    public void parse(CharSequence charSequence, ParseLog parseLog, AttributeQuery attributeQuery, ParsedEntity<?> parsedEntity, boolean z) {
        boolean booleanValue;
        boolean booleanValue2;
        char charValue;
        String str;
        String str2;
        OffsetSign offsetSign;
        int i;
        Leniency leniency;
        int i2;
        int i3;
        ZonalOffset ofHoursMinutes;
        int subSequenceEquals;
        LocalizedGMTProcessor localizedGMTProcessor = this;
        AttributeQuery attributeQuery2 = attributeQuery;
        int length = charSequence.length();
        int position = parseLog.getPosition();
        if (position >= length) {
            parseLog.setError(position, "Missing localized time zone offset.");
            return;
        }
        Locale locale = z ? localizedGMTProcessor.locale : (Locale) attributeQuery2.get(Attributes.LANGUAGE, Locale.ROOT);
        boolean isRTL = CalendarText.isRTL(locale);
        if (z) {
            booleanValue = localizedGMTProcessor.noPrefix;
        } else {
            booleanValue = ((Boolean) attributeQuery2.get(Attributes.NO_GMT_PREFIX, Boolean.FALSE)).booleanValue();
        }
        if (z) {
            booleanValue2 = localizedGMTProcessor.caseInsensitive;
        } else {
            booleanValue2 = ((Boolean) attributeQuery2.get(Attributes.PARSE_CASE_INSENSITIVE, Boolean.TRUE)).booleanValue();
        }
        if (z) {
            charValue = localizedGMTProcessor.zeroDigit;
        } else {
            charValue = ((Character) attributeQuery2.get(Attributes.ZERO_DIGIT, '0')).charValue();
        }
        String str3 = z ? localizedGMTProcessor.plusSign : (String) attributeQuery2.get(AttributeSet.PLUS_SIGN, Marker.ANY_NON_NULL_MARKER);
        String str4 = z ? localizedGMTProcessor.minusSign : (String) attributeQuery2.get(AttributeSet.MINUS_SIGN, "-");
        Info patternInfo = getPatternInfo(locale);
        int length2 = patternInfo.pattern.length();
        boolean z2 = booleanValue;
        ZonalOffset zonalOffset = null;
        int i4 = position;
        int i5 = 0;
        while (i5 < length2) {
            int i6 = length2;
            char charAt = patternInfo.pattern.charAt(i5);
            if (patternInfo.start > i5 || patternInfo.end <= i5) {
                str = str3;
                str2 = str4;
                if (z2) {
                    continue;
                } else {
                    char charAt2 = i4 < length ? charSequence.charAt(i4) : (char) 0;
                    if ((booleanValue2 || charAt != charAt2) && !(booleanValue2 && charEqualsIgnoreCase(charAt, charAt2))) {
                        int parseUTC = parseUTC(charSequence, length, position, locale, booleanValue2);
                        if (parseUTC > 0) {
                            parsedEntity.put(TimezoneElement.TIMEZONE_OFFSET, ZonalOffset.UTC);
                            parseLog.setPosition(position + parseUTC);
                            return;
                        } else {
                            parseLog.setError(position, "Literal mismatched in localized time zone offset.");
                            return;
                        }
                    }
                    i4++;
                }
            } else {
                int subSequenceEquals2 = LiteralProcessor.subSequenceEquals(charSequence, i4, str3, booleanValue2, isRTL);
                if (subSequenceEquals2 == -1) {
                    subSequenceEquals2 = LiteralProcessor.subSequenceEquals(charSequence, i4, str4, booleanValue2, isRTL);
                    if (subSequenceEquals2 == -1) {
                        int parseUTC2 = z2 ? 0 : parseUTC(charSequence, length, position, locale, booleanValue2);
                        if (parseUTC2 > 0) {
                            parsedEntity.put(TimezoneElement.TIMEZONE_OFFSET, ZonalOffset.UTC);
                            parseLog.setPosition(position + parseUTC2);
                            return;
                        } else {
                            parseLog.setError(position, "Missing sign in localized time zone offset.");
                            return;
                        }
                    }
                    offsetSign = OffsetSign.BEHIND_UTC;
                } else {
                    offsetSign = OffsetSign.AHEAD_OF_UTC;
                }
                OffsetSign offsetSign2 = offsetSign;
                int i7 = i4 + subSequenceEquals2;
                int parseHours = parseHours(charSequence, i7, charValue);
                str = str3;
                if (parseHours == -1000) {
                    parseLog.setError(i7, "Missing hour part in localized time zone offset.");
                    return;
                }
                if (parseHours < 0) {
                    parseHours = ~parseHours;
                    i = i7 + 1;
                } else {
                    i = i7 + 2;
                }
                if (i >= length) {
                    if (localizedGMTProcessor.abbreviated) {
                        parsedEntity.put(TimezoneElement.TIMEZONE_OFFSET, ZonalOffset.ofHours(offsetSign2, parseHours));
                        parseLog.setPosition(i);
                        return;
                    } else {
                        parseLog.setError(i, "Missing minute part in localized time zone offset.");
                        return;
                    }
                }
                if (z) {
                    leniency = localizedGMTProcessor.lenientMode;
                    str2 = str4;
                } else {
                    str2 = str4;
                    leniency = (Leniency) attributeQuery2.get(Attributes.LENIENCY, Leniency.SMART);
                }
                int subSequenceEquals3 = LiteralProcessor.subSequenceEquals(charSequence, i, patternInfo.separator, booleanValue2, isRTL);
                if (subSequenceEquals3 != -1) {
                    i += subSequenceEquals3;
                } else if (localizedGMTProcessor.abbreviated) {
                    parsedEntity.put(TimezoneElement.TIMEZONE_OFFSET, ZonalOffset.ofHours(offsetSign2, parseHours));
                    parseLog.setPosition(i);
                    return;
                } else if (leniency.isStrict()) {
                    parseLog.setError(i, "Mismatch of localized time zone offset separator.");
                    return;
                }
                int parseTwoDigits = parseTwoDigits(charSequence, i, charValue);
                if (parseTwoDigits == -1000) {
                    parseLog.setError(i, "Minute part in localized time zone offset does not match expected pattern mm.");
                    return;
                }
                i4 = i + 2;
                if (i4 >= length || (subSequenceEquals = LiteralProcessor.subSequenceEquals(charSequence, i4, patternInfo.separator, booleanValue2, isRTL)) == -1) {
                    i2 = -1000;
                    i3 = 0;
                } else {
                    int i8 = i4 + subSequenceEquals;
                    i3 = parseTwoDigits(charSequence, i8, charValue);
                    i2 = -1000;
                    i4 = i3 == -1000 ? i8 - subSequenceEquals : i8 + 2;
                }
                if (i3 == 0 || i3 == i2) {
                    ofHoursMinutes = ZonalOffset.ofHoursMinutes(offsetSign2, parseHours, parseTwoDigits);
                } else {
                    int i9 = (parseHours * MMKV.ExpireInHour) + (parseTwoDigits * 60) + i3;
                    if (offsetSign2 == OffsetSign.BEHIND_UTC) {
                        i9 = -i9;
                    }
                    ofHoursMinutes = ZonalOffset.ofTotalSeconds(i9);
                }
                i5 = patternInfo.end - 1;
                zonalOffset = ofHoursMinutes;
            }
            i5++;
            localizedGMTProcessor = this;
            attributeQuery2 = attributeQuery;
            length2 = i6;
            str3 = str;
            str4 = str2;
        }
        if (zonalOffset == null) {
            parseLog.setError(i4, "Unable to determine localized time zone offset.");
        } else {
            parsedEntity.put(TimezoneElement.TIMEZONE_OFFSET, zonalOffset);
            parseLog.setPosition(i4);
        }
    }

    @Override // net.time4j.format.expert.FormatProcessor
    public ChronoElement<TZID> getElement() {
        return TimezoneElement.TIMEZONE_OFFSET;
    }

    @Override // net.time4j.format.expert.FormatProcessor
    public FormatProcessor<TZID> quickPath(ChronoFormatter<?> chronoFormatter, AttributeQuery attributeQuery, int i) {
        return new LocalizedGMTProcessor(this.abbreviated, ((Boolean) attributeQuery.get(Attributes.PARSE_CASE_INSENSITIVE, Boolean.TRUE)).booleanValue(), ((Boolean) attributeQuery.get(Attributes.NO_GMT_PREFIX, Boolean.FALSE)).booleanValue(), (Locale) attributeQuery.get(Attributes.LANGUAGE, Locale.ROOT), (String) attributeQuery.get(AttributeSet.PLUS_SIGN, Marker.ANY_NON_NULL_MARKER), (String) attributeQuery.get(AttributeSet.MINUS_SIGN, "-"), ((Character) attributeQuery.get(Attributes.ZERO_DIGIT, '0')).charValue(), (Leniency) attributeQuery.get(Attributes.LENIENCY, Leniency.SMART));
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof LocalizedGMTProcessor) && this.abbreviated == ((LocalizedGMTProcessor) obj).abbreviated;
    }

    public int hashCode() {
        return this.abbreviated ? 1 : 0;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(64);
        sb.append(getClass().getName());
        sb.append("[abbreviated=");
        sb.append(this.abbreviated);
        sb.append(AbstractJsonLexerKt.END_LIST);
        return sb.toString();
    }

    private static ZonalOffset getOffset(ChronoDisplay chronoDisplay, AttributeQuery attributeQuery) {
        if (attributeQuery.contains(Attributes.TIMEZONE_ID)) {
            TZID tzid = (TZID) attributeQuery.get(Attributes.TIMEZONE_ID);
            if (tzid instanceof ZonalOffset) {
                return (ZonalOffset) tzid;
            }
        }
        throw new IllegalArgumentException("Cannot extract timezone offset from format attributes for: " + chronoDisplay);
    }

    private static int parseUTC(CharSequence charSequence, int i, int i2, Locale locale, boolean z) {
        String[] strArr = {TimeZones.GMT_ID, getLiteralUTC(locale), "UTC", "UT"};
        for (int i3 = 0; i3 < 4; i3++) {
            String str = strArr[i3];
            int length = str.length();
            if (i - i2 >= length) {
                String charSequence2 = charSequence.subSequence(i2, i2 + length).toString();
                if ((z && charSequence2.equalsIgnoreCase(str)) || (!z && charSequence2.equals(str))) {
                    return length;
                }
            }
        }
        return 0;
    }

    private static int parseTwoDigits(CharSequence charSequence, int i, char c) {
        int charAt;
        int i2 = 0;
        for (int i3 = 0; i3 < 2; i3++) {
            int i4 = i + i3;
            if (i4 >= charSequence.length() || (charAt = charSequence.charAt(i4) - c) < 0 || charAt > 9) {
                return -1000;
            }
            i2 = (i2 * 10) + charAt;
        }
        return i2;
    }

    private static int parseHours(CharSequence charSequence, int i, char c) {
        int i2 = 0;
        for (int i3 = 0; i3 < 2; i3++) {
            int i4 = i + i3;
            if (i4 >= charSequence.length()) {
                if (i3 == 0) {
                    return -1000;
                }
                return ~i2;
            }
            int charAt = charSequence.charAt(i4) - c;
            if (charAt < 0 || charAt > 9) {
                if (i3 == 0) {
                    return -1000;
                }
                return ~i2;
            }
            i2 = (i2 * 10) + charAt;
        }
        return i2;
    }

    private static boolean charEqualsIgnoreCase(char c, char c2) {
        return c == c2 || Character.toUpperCase(c) == Character.toUpperCase(c2) || Character.toLowerCase(c) == Character.toLowerCase(c2);
    }

    private static String getLiteralUTC(Locale locale) {
        String putIfAbsent;
        ConcurrentMap<Locale, String> concurrentMap = UTC_LITERALS;
        String str = concurrentMap.get(locale);
        return (str != null || (putIfAbsent = concurrentMap.putIfAbsent(locale, (str = ZonalOffset.UTC.getStdFormatPattern(locale)))) == null) ? str : putIfAbsent;
    }

    private static Info getPatternInfo(Locale locale) {
        Info info = STD_PATTERN_INFOS.get(locale);
        if (info != null) {
            return info;
        }
        String stdFormatPattern = PROTOTYPE.getStdFormatPattern(locale);
        int length = stdFormatPattern.length();
        for (int i = 0; i < length; i++) {
            if (stdFormatPattern.charAt(i) == 177) {
                int indexOf = stdFormatPattern.indexOf("hh", i) + 2;
                int indexOf2 = stdFormatPattern.indexOf("mm", indexOf);
                Info info2 = new Info(stdFormatPattern, stdFormatPattern.substring(indexOf, indexOf2), i, indexOf2 + 2);
                Info putIfAbsent = STD_PATTERN_INFOS.putIfAbsent(locale, info2);
                return putIfAbsent != null ? putIfAbsent : info2;
            }
        }
        return info;
    }

    private static class Info {
        private final int end;
        private final String pattern;
        private final String separator;
        private final int start;

        Info(String str, String str2, int i, int i2) {
            this.pattern = str;
            this.separator = str2;
            this.start = i;
            this.end = i2;
        }
    }
}
