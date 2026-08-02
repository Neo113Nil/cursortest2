package net.time4j.format.expert;

import com.google.android.gms.internal.measurement.zzai$$ExternalSyntheticBackportWithForwarding0;
import java.io.IOException;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Set;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import net.time4j.engine.AttributeQuery;
import net.time4j.engine.ChronoDisplay;
import net.time4j.engine.ChronoElement;
import net.time4j.engine.ChronoEntity;
import net.time4j.format.Attributes;
import net.time4j.format.Leniency;

/* loaded from: classes10.dex */
final class FractionProcessor implements FormatProcessor<Integer> {
    private static final int MRD_MINUS_1 = 999999999;
    private final FormatProcessor<Void> decimalSeparator;
    private final ChronoElement<Integer> element;
    private final boolean fixedWidth;
    private final Leniency lenientMode;
    private final int maxDigits;
    private final int minDigits;
    private final char zeroDigit;

    @Override // net.time4j.format.expert.FormatProcessor
    public boolean isNumerical() {
        return true;
    }

    FractionProcessor(ChronoElement<Integer> chronoElement, int i, int i2, boolean z) {
        this.element = chronoElement;
        this.minDigits = i;
        this.maxDigits = i2;
        this.fixedWidth = !z && i == i2;
        this.decimalSeparator = z ? new LiteralProcessor(Attributes.DECIMAL_SEPARATOR) : null;
        if (chronoElement == null) {
            throw new NullPointerException("Missing element.");
        }
        if (i < 0) {
            throw new IllegalArgumentException("Negative min digits: " + i);
        }
        if (i > i2) {
            throw new IllegalArgumentException("Max smaller than min: " + i2 + " < " + i);
        }
        if (i > 9) {
            throw new IllegalArgumentException("Min digits out of range: " + i);
        }
        if (i2 > 9) {
            throw new IllegalArgumentException("Max digits out of range: " + i2);
        }
        this.zeroDigit = '0';
        this.lenientMode = Leniency.SMART;
    }

    private FractionProcessor(FormatProcessor<Void> formatProcessor, ChronoElement<Integer> chronoElement, int i, int i2, boolean z, char c, Leniency leniency) {
        this.decimalSeparator = formatProcessor;
        this.element = chronoElement;
        this.minDigits = i;
        this.maxDigits = i2;
        this.fixedWidth = z;
        this.zeroDigit = c;
        this.lenientMode = leniency;
    }

    @Override // net.time4j.format.expert.FormatProcessor
    public int print(ChronoDisplay chronoDisplay, Appendable appendable, AttributeQuery attributeQuery, Set<ElementPosition> set, boolean z) throws IOException {
        AttributeQuery attributeQuery2;
        char charValue;
        Set<ElementPosition> set2;
        int i;
        int i2;
        BigDecimal decimal = toDecimal((Number) chronoDisplay.get(this.element));
        BigDecimal decimal2 = toDecimal((Number) chronoDisplay.getMinimum(this.element));
        BigDecimal decimal3 = toDecimal((Number) chronoDisplay.getMaximum(this.element));
        if (decimal.compareTo(decimal3) > 0) {
            decimal = decimal3;
        }
        BigDecimal divide = decimal.subtract(decimal2).divide(decimal3.subtract(decimal2).add(BigDecimal.ONE), 9, RoundingMode.FLOOR);
        BigDecimal m = divide.compareTo(BigDecimal.ZERO) == 0 ? BigDecimal.ZERO : zzai$$ExternalSyntheticBackportWithForwarding0.m(divide);
        if (z) {
            charValue = this.zeroDigit;
            attributeQuery2 = attributeQuery;
        } else {
            attributeQuery2 = attributeQuery;
            charValue = ((Character) attributeQuery2.get(Attributes.ZERO_DIGIT, '0')).charValue();
        }
        char c = charValue;
        int length = appendable instanceof CharSequence ? ((CharSequence) appendable).length() : -1;
        int i3 = 0;
        if (m.scale() == 0) {
            if (this.minDigits > 0) {
                if (hasDecimalSeparator()) {
                    this.decimalSeparator.print(chronoDisplay, appendable, attributeQuery2, set, z);
                    i = 1;
                } else {
                    i = 0;
                }
                while (true) {
                    i2 = this.minDigits;
                    if (i3 >= i2) {
                        break;
                    }
                    appendable.append(c);
                    i3++;
                }
                i3 = i + i2;
            }
            set2 = set;
        } else {
            if (hasDecimalSeparator()) {
                set2 = set;
                this.decimalSeparator.print(chronoDisplay, appendable, attributeQuery, set2, z);
                i3 = 1;
            } else {
                set2 = set;
            }
            String plainString = m.setScale(Math.min(Math.max(m.scale(), this.minDigits), this.maxDigits), RoundingMode.FLOOR).toPlainString();
            int i4 = c - '0';
            int length2 = plainString.length();
            for (int i5 = 2; i5 < length2; i5++) {
                appendable.append((char) (plainString.charAt(i5) + i4));
                i3++;
            }
        }
        if (length != -1 && i3 > 1 && set2 != null) {
            set2.add(new ElementPosition(this.element, length + 1, length + i3));
        }
        return i3;
    }

    /* JADX WARN: Removed duplicated region for block: B:46:0x010e  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x011c  */
    @Override // net.time4j.format.expert.FormatProcessor
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void parse(CharSequence charSequence, ParseLog parseLog, AttributeQuery attributeQuery, ParsedEntity<?> parsedEntity, boolean z) {
        int i;
        int i2;
        char charValue;
        Leniency leniency = z ? this.lenientMode : (Leniency) attributeQuery.get(Attributes.LENIENCY, Leniency.SMART);
        int i3 = 9;
        if (!leniency.isLax() || this.fixedWidth) {
            i = this.minDigits;
            i2 = this.maxDigits;
        } else {
            i2 = 9;
            i = 0;
        }
        int length = charSequence.length();
        if (parseLog.getPosition() >= length) {
            if (i > 0) {
                parseLog.setError(parseLog.getPosition(), "Expected fraction digits not found for: " + this.element.name());
                return;
            }
            return;
        }
        if (hasDecimalSeparator()) {
            this.decimalSeparator.parse(charSequence, parseLog, attributeQuery, null, z);
            if (parseLog.isError()) {
                if (i == 0) {
                    parseLog.clearError();
                    return;
                }
                return;
            }
        }
        int position = parseLog.getPosition();
        int i4 = position + i;
        int min = Math.min(i2 + position, length);
        if (i4 > length && leniency.isStrict()) {
            parseLog.setError(parseLog.getPosition(), "Expected at least " + i + " digits.");
            return;
        }
        if (z) {
            charValue = this.zeroDigit;
        } else {
            charValue = ((Character) attributeQuery.get(Attributes.ZERO_DIGIT, '0')).charValue();
        }
        long j = 0;
        while (position < min) {
            int charAt = charSequence.charAt(position) - charValue;
            if (charAt < 0 || charAt > i3) {
                if (position < i4 && leniency.isStrict()) {
                    parseLog.setError(parseLog.getPosition(), "Expected at least " + i + " digits.");
                    return;
                }
                BigDecimal movePointLeft = new BigDecimal(j).movePointLeft(position - parseLog.getPosition());
                if (!this.element.name().equals("NANO_OF_SECOND")) {
                    parsedEntity.put(this.element, getRealValue(movePointLeft, 0, 999999999));
                } else {
                    parsedEntity.put(FractionalElement.FRACTION, movePointLeft);
                    ChronoElement<Integer> chronoElement = this.element;
                    parsedEntity.put(chronoElement, chronoElement.getDefaultMinimum());
                }
                parseLog.setPosition(position);
            }
            j = (j * 10) + charAt;
            position++;
            i3 = 9;
        }
        BigDecimal movePointLeft2 = new BigDecimal(j).movePointLeft(position - parseLog.getPosition());
        if (!this.element.name().equals("NANO_OF_SECOND")) {
        }
        parseLog.setPosition(position);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof FractionProcessor) {
            FractionProcessor fractionProcessor = (FractionProcessor) obj;
            if (this.element.equals(fractionProcessor.element) && this.minDigits == fractionProcessor.minDigits && this.maxDigits == fractionProcessor.maxDigits && hasDecimalSeparator() == fractionProcessor.hasDecimalSeparator()) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return (this.element.hashCode() * 7) + ((this.minDigits + (this.maxDigits * 10)) * 31);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(64);
        sb.append(getClass().getName());
        sb.append("[element=");
        sb.append(this.element.name());
        sb.append(", min-digits=");
        sb.append(this.minDigits);
        sb.append(", max-digits=");
        sb.append(this.maxDigits);
        sb.append(AbstractJsonLexerKt.END_LIST);
        return sb.toString();
    }

    @Override // net.time4j.format.expert.FormatProcessor
    public ChronoElement<Integer> getElement() {
        return this.element;
    }

    @Override // net.time4j.format.expert.FormatProcessor
    public FormatProcessor<Integer> withElement(ChronoElement<Integer> chronoElement) {
        return this.element == chronoElement ? this : new FractionProcessor(chronoElement, this.minDigits, this.maxDigits, hasDecimalSeparator());
    }

    @Override // net.time4j.format.expert.FormatProcessor
    public FormatProcessor<Integer> quickPath(ChronoFormatter<?> chronoFormatter, AttributeQuery attributeQuery, int i) {
        return new FractionProcessor(this.decimalSeparator, this.element, this.minDigits, this.maxDigits, this.fixedWidth, ((Character) attributeQuery.get(Attributes.ZERO_DIGIT, '0')).charValue(), (Leniency) attributeQuery.get(Attributes.LENIENCY, Leniency.SMART));
    }

    /* JADX WARN: Type inference failed for: r4v1, types: [net.time4j.engine.ChronoEntity, net.time4j.engine.ChronoEntity<?>] */
    ChronoEntity<?> update(ChronoEntity<?> chronoEntity, ChronoEntity<?> chronoEntity2) {
        if (!chronoEntity2.contains(FractionalElement.FRACTION)) {
            return chronoEntity;
        }
        int realValue = getRealValue((BigDecimal) chronoEntity2.get(FractionalElement.FRACTION), ((Integer) chronoEntity.getMinimum(this.element)).intValue(), ((Integer) chronoEntity.getMaximum(this.element)).intValue());
        chronoEntity2.with(FractionalElement.FRACTION, (FractionalElement) null);
        chronoEntity2.with(this.element, realValue);
        return chronoEntity.with(this.element, realValue);
    }

    private int getRealValue(BigDecimal bigDecimal, int i, int i2) {
        BigDecimal valueOf = BigDecimal.valueOf(i);
        return bigDecimal.multiply(BigDecimal.valueOf(i2).subtract(valueOf).add(BigDecimal.ONE)).setScale(0, RoundingMode.FLOOR).add(valueOf).intValueExact();
    }

    private static BigDecimal toDecimal(Number number) {
        return BigDecimal.valueOf(number.longValue());
    }

    private boolean hasDecimalSeparator() {
        return this.decimalSeparator != null;
    }
}
