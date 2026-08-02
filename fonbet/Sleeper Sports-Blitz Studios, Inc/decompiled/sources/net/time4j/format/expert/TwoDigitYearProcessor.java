package net.time4j.format.expert;

import java.io.IOException;
import java.util.Set;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import net.time4j.base.MathUtils;
import net.time4j.engine.AttributeQuery;
import net.time4j.engine.ChronoDisplay;
import net.time4j.engine.ChronoElement;
import net.time4j.format.Attributes;
import net.time4j.format.Leniency;

/* loaded from: classes10.dex */
final class TwoDigitYearProcessor implements FormatProcessor<Integer> {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    private final ChronoElement<Integer> element;
    private final Leniency lenientMode;
    private final int pivotYear;
    private final int protectedLength;
    private final int reserved;
    private final char zeroDigit;

    @Override // net.time4j.format.expert.FormatProcessor
    public boolean isNumerical() {
        return true;
    }

    TwoDigitYearProcessor(ChronoElement<Integer> chronoElement) {
        if (chronoElement.name().startsWith("YEAR")) {
            this.element = chronoElement;
            this.reserved = 0;
            this.zeroDigit = '0';
            this.lenientMode = Leniency.SMART;
            this.protectedLength = 0;
            this.pivotYear = 100;
            return;
        }
        throw new IllegalArgumentException("Year element required: " + chronoElement);
    }

    private TwoDigitYearProcessor(ChronoElement<Integer> chronoElement, int i, char c, Leniency leniency, int i2, int i3) {
        this.element = chronoElement;
        this.reserved = i;
        this.zeroDigit = c;
        this.lenientMode = leniency;
        this.protectedLength = i2;
        this.pivotYear = i3;
    }

    @Override // net.time4j.format.expert.FormatProcessor
    public int print(ChronoDisplay chronoDisplay, Appendable appendable, AttributeQuery attributeQuery, Set<ElementPosition> set, boolean z) throws IOException {
        char charValue;
        int i = chronoDisplay.getInt(this.element);
        if (i < 0) {
            if (i == Integer.MIN_VALUE) {
                throw new IllegalArgumentException("Format context has no year: " + chronoDisplay);
            }
            throw new IllegalArgumentException("Negative year cannot be printed as two-digit-year: " + i);
        }
        if (getPivotYear(z, attributeQuery) != 100) {
            i = MathUtils.floorModulo(i, 100);
        }
        String num = Integer.toString(i);
        if (z) {
            charValue = this.zeroDigit;
        } else {
            charValue = ((Character) attributeQuery.get(Attributes.ZERO_DIGIT, '0')).charValue();
        }
        int i2 = 0;
        if (charValue != '0') {
            int i3 = charValue - '0';
            char[] charArray = num.toCharArray();
            for (int i4 = 0; i4 < charArray.length; i4++) {
                charArray[i4] = (char) (charArray[i4] + i3);
            }
            num = new String(charArray);
        }
        int length = appendable instanceof CharSequence ? ((CharSequence) appendable).length() : -1;
        if (i < 10) {
            appendable.append(charValue);
            i2 = 1;
        }
        appendable.append(num);
        int length2 = i2 + num.length();
        if (length != -1 && length2 > 0 && set != null) {
            set.add(new ElementPosition(this.element, length, length + length2));
        }
        return length2;
    }

    /* JADX WARN: Removed duplicated region for block: B:41:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00cc  */
    @Override // net.time4j.format.expert.FormatProcessor
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void parse(CharSequence charSequence, ParseLog parseLog, AttributeQuery attributeQuery, ParsedEntity<?> parsedEntity, boolean z) {
        char charValue;
        int length = charSequence.length();
        int position = parseLog.getPosition();
        int intValue = z ? this.protectedLength : ((Integer) attributeQuery.get(Attributes.PROTECTED_CHARACTERS, 0)).intValue();
        if (intValue > 0) {
            length -= intValue;
        }
        if (position >= length) {
            parseLog.setError(position, "Missing digits for: " + this.element.name());
            parseLog.setWarning();
            return;
        }
        int i = (z ? this.lenientMode : (Leniency) attributeQuery.get(Attributes.LENIENCY, Leniency.SMART)).isStrict() ? 2 : 9;
        if (z) {
            charValue = this.zeroDigit;
        } else {
            charValue = ((Character) attributeQuery.get(Attributes.ZERO_DIGIT, '0')).charValue();
        }
        if (this.reserved > 0 && intValue <= 0) {
            int i2 = 0;
            for (int i3 = position; i3 < length; i3++) {
                int charAt = charSequence.charAt(i3) - charValue;
                if (charAt < 0 || charAt > 9) {
                    break;
                }
                i2++;
            }
            i = Math.min(i, i2 - this.reserved);
        }
        int i4 = position + 2;
        int min = Math.min(length, i + position);
        boolean z2 = true;
        int i5 = position;
        int i6 = 0;
        while (i5 < min) {
            int charAt2 = charSequence.charAt(i5) - charValue;
            if (charAt2 < 0 || charAt2 > 9) {
                if (z2) {
                    parseLog.setError(position, "Digit expected.");
                    return;
                }
                if (i5 >= i4) {
                    parseLog.setError(position, "Not enough digits found for: " + this.element.name());
                    return;
                }
                if (i5 == i4) {
                    i6 = toYear(i6, getPivotYear(z, attributeQuery));
                }
                parsedEntity.put(this.element, i6);
                parseLog.setPosition(i5);
                return;
            }
            i6 = (i6 * 10) + charAt2;
            i5++;
            z2 = false;
        }
        if (i5 >= i4) {
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof TwoDigitYearProcessor) {
            return this.element.equals(((TwoDigitYearProcessor) obj).element);
        }
        return false;
    }

    public int hashCode() {
        return this.element.hashCode();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(64);
        sb.append(getClass().getName());
        sb.append("[element=");
        sb.append(this.element.name());
        sb.append(AbstractJsonLexerKt.END_LIST);
        return sb.toString();
    }

    @Override // net.time4j.format.expert.FormatProcessor
    public ChronoElement<Integer> getElement() {
        return this.element;
    }

    @Override // net.time4j.format.expert.FormatProcessor
    public FormatProcessor<Integer> withElement(ChronoElement<Integer> chronoElement) {
        return this.element == chronoElement ? this : new TwoDigitYearProcessor(chronoElement);
    }

    @Override // net.time4j.format.expert.FormatProcessor
    public FormatProcessor<Integer> quickPath(ChronoFormatter<?> chronoFormatter, AttributeQuery attributeQuery, int i) {
        return new TwoDigitYearProcessor(this.element, i, ((Character) attributeQuery.get(Attributes.ZERO_DIGIT, '0')).charValue(), (Leniency) attributeQuery.get(Attributes.LENIENCY, Leniency.SMART), ((Integer) attributeQuery.get(Attributes.PROTECTED_CHARACTERS, 0)).intValue(), ((Integer) attributeQuery.get(Attributes.PIVOT_YEAR, Integer.valueOf(chronoFormatter.getChronology().getDefaultPivotYear()))).intValue());
    }

    private static int toYear(int i, int i2) {
        int i3;
        if (i >= i2 % 100) {
            i3 = (i2 / 100) - 1;
        } else {
            i3 = i2 / 100;
        }
        return (i3 * 100) + i;
    }

    private int getPivotYear(boolean z, AttributeQuery attributeQuery) {
        int intValue = z ? this.pivotYear : ((Integer) attributeQuery.get(Attributes.PIVOT_YEAR, Integer.valueOf(this.pivotYear))).intValue();
        if (intValue >= 100) {
            return intValue;
        }
        throw new IllegalArgumentException("Pivot year must not be smaller than 100: " + intValue);
    }
}
