package net.time4j.format.expert;

import androidx.collection.SieveCacheKt;
import androidx.datastore.preferences.protobuf.DescriptorProtos;
import java.io.IOException;
import java.util.Set;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import net.time4j.PlainDate;
import net.time4j.engine.AttributeQuery;
import net.time4j.engine.ChronoDisplay;
import net.time4j.engine.ChronoElement;
import net.time4j.format.Attributes;
import net.time4j.format.Leniency;
import net.time4j.format.NumberSystem;
import net.time4j.format.NumericalElement;
import net.time4j.format.internal.DualFormatElement;
import org.objectweb.asm.signature.SignatureVisitor;

/* loaded from: classes10.dex */
class NumberProcessor<V> implements FormatProcessor<V> {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    private static final int[] THRESHOLDS = {9, 99, 999, 9999, DescriptorProtos.Edition.EDITION_99999_TEST_ONLY_VALUE, 999999, 9999999, 99999999, 999999999, Integer.MAX_VALUE};
    private final ChronoElement<V> element;
    private final boolean fixedInt;
    private final boolean fixedWidth;
    private final Leniency lenientMode;
    private final int maxDigits;
    private final int minDigits;
    private final NumberSystem numberSystem;
    private final int protectedLength;
    private final boolean protectedMode;
    private final int reserved;
    private final int scaleOfNumsys;
    private final SignPolicy signPolicy;
    private final boolean yearOfEra;
    private final char zeroDigit;

    @Override // net.time4j.format.expert.FormatProcessor
    public boolean isNumerical() {
        return true;
    }

    NumberProcessor(ChronoElement<V> chronoElement, boolean z, int i, int i2, SignPolicy signPolicy, boolean z2) {
        this(chronoElement, z, i, i2, signPolicy, z2, 0, '0', NumberSystem.ARABIC, Leniency.SMART, 0, false);
    }

    private NumberProcessor(ChronoElement<V> chronoElement, boolean z, int i, int i2, SignPolicy signPolicy, boolean z2, int i3, char c, NumberSystem numberSystem, Leniency leniency, int i4, boolean z3) {
        this.element = chronoElement;
        this.fixedWidth = z;
        this.minDigits = i;
        this.maxDigits = i2;
        this.signPolicy = signPolicy;
        this.protectedMode = z2;
        this.fixedInt = z3;
        if (chronoElement == null) {
            throw new NullPointerException("Missing element.");
        }
        if (signPolicy == null) {
            throw new NullPointerException("Missing sign policy.");
        }
        if (i < 1) {
            throw new IllegalArgumentException("Not positive: " + i);
        }
        if (i > i2) {
            throw new IllegalArgumentException("Max smaller than min: " + i2 + " < " + i);
        }
        if (z && i != i2) {
            throw new IllegalArgumentException("Variable width in fixed-width-mode: " + i2 + " != " + i);
        }
        if (z && signPolicy != SignPolicy.SHOW_NEVER) {
            throw new IllegalArgumentException("Sign policy must be SHOW_NEVER in fixed-width-mode.");
        }
        int scale = getScale(numberSystem);
        if (numberSystem.isDecimal()) {
            if (i > scale) {
                throw new IllegalArgumentException("Min digits out of range: " + i);
            }
            if (i2 > scale) {
                throw new IllegalArgumentException("Max digits out of range: " + i2);
            }
        }
        this.yearOfEra = chronoElement.name().equals("YEAR_OF_ERA");
        this.reserved = i3;
        this.zeroDigit = c;
        this.numberSystem = numberSystem;
        this.lenientMode = leniency;
        this.protectedLength = i4;
        this.scaleOfNumsys = scale;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:111:0x02c6  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0268  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x027a  */
    @Override // net.time4j.format.expert.FormatProcessor
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public int print(ChronoDisplay chronoDisplay, Appendable appendable, AttributeQuery attributeQuery, Set<ElementPosition> set, boolean z) throws IOException {
        NumberSystem numberSystem;
        char charAt;
        boolean z2;
        int i;
        int abs;
        boolean z3;
        int length;
        String l;
        boolean z4;
        int i2;
        int i3;
        int length2 = appendable instanceof CharSequence ? ((CharSequence) appendable).length() : -1;
        if (z) {
            numberSystem = this.numberSystem;
            charAt = this.zeroDigit;
        } else {
            numberSystem = (NumberSystem) attributeQuery.get(Attributes.NUMBER_SYSTEM, NumberSystem.ARABIC);
            if (attributeQuery.contains(Attributes.ZERO_DIGIT)) {
                charAt = ((Character) attributeQuery.get(Attributes.ZERO_DIGIT)).charValue();
            } else {
                charAt = numberSystem.isDecimal() ? numberSystem.getDigits().charAt(0) : '0';
            }
        }
        if (z && this.fixedInt) {
            int i4 = chronoDisplay.getInt(this.element);
            if (i4 < 0) {
                if (i4 == Integer.MIN_VALUE) {
                    return -1;
                }
                throw new IllegalArgumentException("Negative value not allowed according to sign policy.");
            }
            int length3 = length(i4);
            if (length3 > this.maxDigits) {
                throw new IllegalArgumentException("Element " + this.element.name() + " cannot be printed as the formatted value " + i4 + " exceeds the maximum width of " + this.maxDigits + ".");
            }
            int i5 = this.minDigits - length3;
            int i6 = 0;
            for (int i7 = 0; i7 < i5; i7++) {
                appendable.append('0');
                i6++;
            }
            if (length3 == 2) {
                appendTwoDigits(i4, appendable, '0');
            } else if (length3 == 1) {
                appendable.append((char) (i4 + 48));
            } else if (i4 >= 2000 && i4 < 2100) {
                appendable.append('2');
                appendable.append('0');
                appendTwoDigits(i4 - 2000, appendable, '0');
            } else if (i4 >= 1900 && i4 < 2000) {
                appendable.append('1');
                appendable.append('9');
                appendTwoDigits(i4 - 1900, appendable, '0');
            } else {
                appendable.append(Integer.toString(i4));
            }
            i3 = i6 + length3;
        } else {
            if (this.yearOfEra) {
                ChronoElement<V> chronoElement = this.element;
                if (chronoElement instanceof DualFormatElement) {
                    DualFormatElement dualFormatElement = (DualFormatElement) DualFormatElement.class.cast(chronoElement);
                    StringBuilder sb = new StringBuilder();
                    dualFormatElement.print(chronoDisplay, sb, attributeQuery, numberSystem, charAt, this.minDigits, this.maxDigits);
                    appendable.append(sb.toString());
                    i3 = sb.length();
                }
            }
            char charAt2 = numberSystem.getDigits().charAt(0);
            Class<V> type = this.element.getType();
            boolean isDecimal = numberSystem.isDecimal();
            String str = null;
            if (type == Integer.class) {
                int i8 = chronoDisplay.getInt(this.element);
                if (i8 == Integer.MIN_VALUE) {
                    return -1;
                }
                z3 = i8 < 0;
                abs = Math.abs(i8);
                length = length(abs);
            } else if (type == Long.class) {
                long longValue = ((Long) Long.class.cast(chronoDisplay.get(this.element))).longValue();
                z3 = longValue < 0;
                if (longValue == Long.MIN_VALUE) {
                    l = "9223372036854775808";
                } else {
                    l = Long.toString(Math.abs(longValue));
                }
                str = l;
                length = str.length();
                charAt2 = '0';
                abs = Integer.MIN_VALUE;
            } else if (Enum.class.isAssignableFrom(type)) {
                ChronoElement<V> chronoElement2 = this.element;
                if (chronoElement2 instanceof NumericalElement) {
                    i = ((NumericalElement) this.element).printToInt(chronoDisplay.get(chronoElement2), chronoDisplay, attributeQuery);
                    z2 = i < 0;
                } else {
                    z2 = false;
                    i = Integer.MIN_VALUE;
                }
                if (i == Integer.MIN_VALUE) {
                    throw new IllegalArgumentException("Cannot print: " + this.element);
                }
                abs = Math.abs(i);
                z3 = z2;
                length = length(abs);
            } else {
                throw new IllegalArgumentException("Not formattable: " + this.element);
            }
            if (isDecimal) {
                if (charAt != charAt2) {
                    int i9 = charAt - charAt2;
                    if (str == null) {
                        str = numberSystem.toNumeral(abs);
                    }
                    char[] charArray = str.toCharArray();
                    z4 = z3;
                    for (int i10 = 0; i10 < charArray.length; i10++) {
                        charArray[i10] = (char) (charArray[i10] + i9);
                    }
                    str = new String(charArray);
                } else {
                    z4 = z3;
                }
                if (length > this.maxDigits) {
                    if (str == null) {
                        str = numberSystem.toNumeral(abs);
                    }
                    throw new IllegalArgumentException("Element " + this.element.name() + " cannot be printed as the formatted value " + str + " exceeds the maximum width of " + this.maxDigits + ".");
                }
            } else {
                z4 = z3;
            }
            String str2 = str;
            if (z4) {
                if (this.signPolicy == SignPolicy.SHOW_NEVER) {
                    throw new IllegalArgumentException("Negative value not allowed according to sign policy.");
                }
                appendable.append('-');
            } else {
                int i11 = AnonymousClass1.$SwitchMap$net$time4j$format$expert$SignPolicy[this.signPolicy.ordinal()];
                if (i11 == 1) {
                    appendable.append(SignatureVisitor.EXTENDS);
                } else if (i11 == 2 && isDecimal && length > this.minDigits) {
                    appendable.append(SignatureVisitor.EXTENDS);
                } else {
                    i2 = 0;
                    if (isDecimal) {
                        int i12 = this.minDigits - length;
                        int i13 = i2;
                        for (int i14 = 0; i14 < i12; i14++) {
                            appendable.append(charAt);
                            i13++;
                        }
                        i2 = i13;
                    }
                    if (str2 == null) {
                        appendable.append(str2);
                        length = str2.length();
                    } else if (!isDecimal) {
                        length = numberSystem.toNumeral(abs, appendable);
                    } else if (length == 2) {
                        appendTwoDigits(abs, appendable, charAt);
                    } else if (length == 1) {
                        appendable.append((char) (abs + charAt));
                    } else if (abs >= 2000 && abs < 2100) {
                        appendable.append((char) (charAt + 2));
                        appendable.append(charAt);
                        appendTwoDigits(abs - 2000, appendable, charAt);
                    } else if (abs >= 1900 && abs < 2000) {
                        appendable.append((char) (charAt + 1));
                        appendable.append((char) (charAt + '\t'));
                        appendTwoDigits(abs - 1900, appendable, charAt);
                    } else {
                        appendable.append(numberSystem.toNumeral(abs));
                    }
                    i3 = i2 + length;
                }
            }
            i2 = 1;
            if (isDecimal) {
            }
            if (str2 == null) {
            }
            i3 = i2 + length;
        }
        if (length2 != -1 && i3 > 0 && set != null) {
            set.add(new ElementPosition(this.element, length2, length2 + i3));
        }
        return i3;
    }

    /* renamed from: net.time4j.format.expert.NumberProcessor$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$net$time4j$format$expert$SignPolicy;

        static {
            int[] iArr = new int[SignPolicy.values().length];
            $SwitchMap$net$time4j$format$expert$SignPolicy = iArr;
            try {
                iArr[SignPolicy.SHOW_ALWAYS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$net$time4j$format$expert$SignPolicy[SignPolicy.SHOW_WHEN_BIG_NUMBER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    @Override // net.time4j.format.expert.FormatProcessor
    public void parse(CharSequence charSequence, ParseLog parseLog, AttributeQuery attributeQuery, ParsedEntity<?> parsedEntity, boolean z) {
        int i;
        NumberSystem numberSystem;
        char c;
        int i2;
        boolean z2;
        NumberSystem numberSystem2;
        char c2;
        Leniency leniency;
        boolean z3;
        int i3;
        int i4;
        boolean z4;
        boolean z5;
        int i5;
        int i6;
        long j;
        int i7;
        int length = charSequence.length();
        int position = parseLog.getPosition();
        if (z && this.fixedInt) {
            if (position >= length) {
                parseLog.setError(position, "Missing digits for: " + this.element.name());
                parseLog.setWarning();
                return;
            }
            char charAt = charSequence.charAt(position);
            if (charAt == '-' || charAt == '+') {
                parseLog.setError(position, "Sign not allowed due to sign policy.");
                return;
            }
            int i8 = this.minDigits + position;
            int min = Math.min(length, i8);
            int i9 = position;
            long j2 = 0;
            while (i9 < min) {
                int charAt2 = charSequence.charAt(i9) - '0';
                if (charAt2 < 0 || charAt2 > 9) {
                    break;
                }
                j2 = (j2 * 10) + charAt2;
                i9++;
            }
            if (j2 > SieveCacheKt.NodeLinkMask) {
                parseLog.setError(position, "Parsed number does not fit into an integer: " + j2);
                return;
            }
            if (i9 < i8) {
                if (i9 == position) {
                    parseLog.setError(position, "Digit expected.");
                    return;
                }
                parseLog.setError(position, "Not enough digits found for: " + this.element.name());
                return;
            }
            parsedEntity.put((ChronoElement<?>) this.element, (int) j2);
            parseLog.setPosition(i9);
            return;
        }
        int intValue = z ? this.protectedLength : ((Integer) attributeQuery.get(Attributes.PROTECTED_CHARACTERS, 0)).intValue();
        if (intValue > 0) {
            length -= intValue;
        }
        if (position >= length) {
            parseLog.setError(position, "Missing digits for: " + this.element.name());
            parseLog.setWarning();
            return;
        }
        if (this.yearOfEra) {
            ChronoElement<V> chronoElement = this.element;
            if (chronoElement instanceof DualFormatElement) {
                Integer parse = ((DualFormatElement) DualFormatElement.class.cast(chronoElement)).parse(charSequence, parseLog.getPP(), attributeQuery, parsedEntity);
                if (parseLog.isError()) {
                    parseLog.setError(parseLog.getErrorIndex(), "Unparseable element: " + this.element.name());
                    return;
                }
                if (parse == null) {
                    parseLog.setError(position, "No interpretable value.");
                    return;
                } else {
                    parsedEntity.put((ChronoElement<?>) this.element, (Object) parse);
                    return;
                }
            }
        }
        if (z) {
            NumberSystem numberSystem3 = this.numberSystem;
            boolean isDecimal = numberSystem3.isDecimal();
            int i10 = this.scaleOfNumsys;
            i = intValue;
            c = this.zeroDigit;
            i2 = i10;
            z2 = isDecimal;
            numberSystem2 = numberSystem3;
        } else {
            i = intValue;
            NumberSystem numberSystem4 = (NumberSystem) attributeQuery.get(Attributes.NUMBER_SYSTEM, NumberSystem.ARABIC);
            boolean isDecimal2 = numberSystem4.isDecimal();
            int scale = getScale(numberSystem4);
            if (attributeQuery.contains(Attributes.ZERO_DIGIT)) {
                c = ((Character) attributeQuery.get(Attributes.ZERO_DIGIT)).charValue();
                numberSystem = numberSystem4;
            } else if (isDecimal2) {
                numberSystem = numberSystem4;
                c = numberSystem4.getDigits().charAt(0);
            } else {
                numberSystem = numberSystem4;
                c = '0';
            }
            i2 = scale;
            z2 = isDecimal2;
            numberSystem2 = numberSystem;
        }
        if (z) {
            leniency = this.lenientMode;
            c2 = c;
        } else {
            c2 = c;
            leniency = (Leniency) attributeQuery.get(Attributes.LENIENCY, Leniency.SMART);
        }
        if (!z2 || (!this.fixedWidth && leniency.isLax())) {
            z3 = true;
            i3 = 1;
            i4 = i2;
        } else {
            int i11 = this.minDigits;
            z3 = true;
            i4 = this.maxDigits;
            i3 = i11;
        }
        char charAt3 = charSequence.charAt(position);
        boolean z6 = z2;
        if (charAt3 == '-' || charAt3 == '+') {
            if (this.signPolicy == SignPolicy.SHOW_NEVER && (this.fixedWidth || leniency.isStrict())) {
                parseLog.setError(position, "Sign not allowed due to sign policy.");
                return;
            } else if (this.signPolicy == SignPolicy.SHOW_WHEN_NEGATIVE && charAt3 == '+' && leniency.isStrict()) {
                parseLog.setError(position, "Positive sign not allowed due to sign policy.");
                return;
            } else {
                z4 = charAt3 == '-' ? z3 : false;
                position++;
            }
        } else {
            if (this.signPolicy == SignPolicy.SHOW_ALWAYS && leniency.isStrict()) {
                parseLog.setError(position, "Missing sign of number.");
                return;
            }
            z4 = false;
        }
        int i12 = position;
        if (position >= length) {
            parseLog.setError(i12, "Missing digits for: " + this.element.name());
            return;
        }
        if (this.fixedWidth || this.reserved <= 0 || i > 0) {
            z5 = z4;
            i5 = position;
        } else {
            if (z6) {
                int i13 = position;
                i7 = 0;
                while (true) {
                    if (i13 >= length) {
                        z5 = z4;
                        i5 = position;
                        break;
                    }
                    z5 = z4;
                    int charAt4 = charSequence.charAt(i13) - c2;
                    i5 = position;
                    if (charAt4 < 0 || charAt4 > 9) {
                        break;
                    }
                    i7++;
                    i13++;
                    position = i5;
                    z4 = z5;
                }
            } else {
                z5 = z4;
                i5 = position;
                i7 = 0;
                for (int i14 = i5; i14 < length && numberSystem2.contains(charSequence.charAt(i14)); i14++) {
                    i7++;
                }
            }
            i4 = Math.min(i4, i7 - this.reserved);
        }
        int i15 = i5 + i3;
        int min2 = Math.min(length, i5 + i4);
        if (z6) {
            j = 0;
            i6 = i5;
            while (i6 < min2) {
                int charAt5 = charSequence.charAt(i6) - c2;
                if (charAt5 < 0 || charAt5 > 9) {
                    break;
                }
                j = (j * 10) + charAt5;
                i6++;
            }
        } else {
            i6 = i5;
            int i16 = 0;
            while (i6 < min2 && numberSystem2.contains(charSequence.charAt(i6))) {
                i16++;
                i6++;
            }
            if (i16 > 0) {
                try {
                    j = numberSystem2.toInteger(charSequence.subSequence(i6 - i16, i6).toString(), leniency);
                } catch (NumberFormatException e) {
                    parseLog.setError(i12, e.getMessage());
                    return;
                }
            } else {
                j = 0;
            }
        }
        Class<V> type = this.element.getType();
        if (j > SieveCacheKt.NodeLinkMask && type == Integer.class) {
            parseLog.setError(i12, "Parsed number does not fit into an integer: " + j);
            return;
        }
        if (i6 < i15) {
            if (i6 == i12) {
                parseLog.setError(i12, "Digit expected.");
                return;
            } else if (this.fixedWidth || !leniency.isLax()) {
                parseLog.setError(i12, "Not enough digits found for: " + this.element.name());
                return;
            }
        }
        if (z5) {
            if (j == 0 && leniency.isStrict()) {
                parseLog.setError(i12 - 1, "Negative zero is not allowed.");
                return;
            }
            j = -j;
        } else if (this.signPolicy == SignPolicy.SHOW_WHEN_BIG_NUMBER && leniency.isStrict() && z6) {
            if (charAt3 == '+' && i6 <= i15) {
                parseLog.setError(i12 - 1, "Positive sign only allowed for big number.");
            } else if (charAt3 != '+' && i6 > i15) {
                parseLog.setError(i12, "Positive sign must be present for big number.");
            }
        }
        if (type == Integer.class) {
            parsedEntity.put((ChronoElement<?>) this.element, (int) j);
        } else if (type == Long.class) {
            parsedEntity.put((ChronoElement<?>) this.element, (Object) Long.valueOf(j));
        } else if (this.element == PlainDate.MONTH_OF_YEAR) {
            parsedEntity.put(PlainDate.MONTH_AS_NUMBER, (int) j);
        } else if (Enum.class.isAssignableFrom(type)) {
            ChronoElement<V> chronoElement2 = this.element;
            if (!(chronoElement2 instanceof NumericalElement ? ((NumericalElement) chronoElement2).parseFromInt(parsedEntity, (int) j) : false)) {
                if (charAt3 == '-' || charAt3 == '+') {
                    i12--;
                }
                parseLog.setError(i12, "[" + this.element.name() + "] No enum found for value: " + j);
                return;
            }
        } else {
            throw new IllegalArgumentException("Not parseable: " + this.element);
        }
        parseLog.setPosition(i6);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof NumberProcessor) {
            NumberProcessor numberProcessor = (NumberProcessor) obj;
            if (this.element.equals(numberProcessor.element) && this.fixedWidth == numberProcessor.fixedWidth && this.minDigits == numberProcessor.minDigits && this.maxDigits == numberProcessor.maxDigits && this.signPolicy == numberProcessor.signPolicy && this.protectedMode == numberProcessor.protectedMode) {
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
        sb.append(", fixed-width-mode=");
        sb.append(this.fixedWidth);
        sb.append(", min-digits=");
        sb.append(this.minDigits);
        sb.append(", max-digits=");
        sb.append(this.maxDigits);
        sb.append(", sign-policy=");
        sb.append(this.signPolicy);
        sb.append(", protected-mode=");
        sb.append(this.protectedMode);
        sb.append(AbstractJsonLexerKt.END_LIST);
        return sb.toString();
    }

    @Override // net.time4j.format.expert.FormatProcessor
    public ChronoElement<V> getElement() {
        return this.element;
    }

    @Override // net.time4j.format.expert.FormatProcessor
    public FormatProcessor<V> withElement(ChronoElement<V> chronoElement) {
        return (this.protectedMode || this.element == chronoElement) ? this : new NumberProcessor(chronoElement, this.fixedWidth, this.minDigits, this.maxDigits, this.signPolicy, false);
    }

    @Override // net.time4j.format.expert.FormatProcessor
    public FormatProcessor<V> quickPath(ChronoFormatter<?> chronoFormatter, AttributeQuery attributeQuery, int i) {
        char c;
        char charAt;
        NumberSystem numberSystem = (NumberSystem) attributeQuery.get(Attributes.NUMBER_SYSTEM, NumberSystem.ARABIC);
        boolean z = false;
        if (attributeQuery.contains(Attributes.ZERO_DIGIT)) {
            charAt = ((Character) attributeQuery.get(Attributes.ZERO_DIGIT)).charValue();
        } else {
            if (!numberSystem.isDecimal()) {
                c = '0';
                int intValue = ((Integer) attributeQuery.get(Attributes.PROTECTED_CHARACTERS, 0)).intValue();
                if (numberSystem == NumberSystem.ARABIC && c == '0' && this.fixedWidth && intValue == 0 && this.element.getType() == Integer.class && !this.yearOfEra) {
                    z = true;
                }
                return new NumberProcessor(this.element, this.fixedWidth, this.minDigits, this.maxDigits, this.signPolicy, this.protectedMode, i, c, numberSystem, (Leniency) attributeQuery.get(Attributes.LENIENCY, Leniency.SMART), intValue, z);
            }
            charAt = numberSystem.getDigits().charAt(0);
        }
        c = charAt;
        int intValue2 = ((Integer) attributeQuery.get(Attributes.PROTECTED_CHARACTERS, 0)).intValue();
        if (numberSystem == NumberSystem.ARABIC) {
            z = true;
        }
        return new NumberProcessor(this.element, this.fixedWidth, this.minDigits, this.maxDigits, this.signPolicy, this.protectedMode, i, c, numberSystem, (Leniency) attributeQuery.get(Attributes.LENIENCY, Leniency.SMART), intValue2, z);
    }

    private int getScale(NumberSystem numberSystem) {
        if (!numberSystem.isDecimal()) {
            return 100;
        }
        Class<V> type = this.element.getType();
        if (type == Integer.class) {
            return 10;
        }
        return type == Long.class ? 18 : 9;
    }

    private static int length(int i) {
        int i2 = 0;
        while (i > THRESHOLDS[i2]) {
            i2++;
        }
        return i2 + 1;
    }

    private static void appendTwoDigits(int i, Appendable appendable, char c) throws IOException {
        int i2 = (i * 103) >>> 10;
        appendable.append((char) (i2 + c));
        appendable.append((char) ((i - ((i2 << 3) + (i2 << 1))) + c));
    }
}
