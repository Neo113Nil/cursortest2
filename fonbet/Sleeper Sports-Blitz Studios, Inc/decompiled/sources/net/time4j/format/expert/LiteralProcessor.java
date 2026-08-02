package net.time4j.format.expert;

import java.io.IOException;
import java.util.Locale;
import java.util.Set;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import net.time4j.engine.AttributeKey;
import net.time4j.engine.AttributeQuery;
import net.time4j.engine.ChronoDisplay;
import net.time4j.engine.ChronoElement;
import net.time4j.format.Attributes;
import net.time4j.format.CalendarText;

/* loaded from: classes10.dex */
final class LiteralProcessor implements FormatProcessor<Void> {
    private final char alt;
    private final AttributeKey<Character> attribute;
    private final boolean caseInsensitive;
    private final boolean interpunctuationMode;
    private final String multi;
    private final boolean rtl;
    private final char single;

    private static boolean isBidi(char c) {
        return c == 8206 || c == 8207 || c == 1564;
    }

    @Override // net.time4j.format.expert.FormatProcessor
    public ChronoElement<Void> getElement() {
        return null;
    }

    @Override // net.time4j.format.expert.FormatProcessor
    public FormatProcessor<Void> withElement(ChronoElement<Void> chronoElement) {
        return this;
    }

    LiteralProcessor(String str) {
        if (str.isEmpty()) {
            throw new IllegalArgumentException("Missing literal.");
        }
        char charAt = str.charAt(0);
        this.single = charAt;
        this.alt = charAt;
        this.attribute = null;
        this.multi = str;
        if (charAt < ' ') {
            throw new IllegalArgumentException("Literal must not start with non-printable char.");
        }
        this.caseInsensitive = true;
        this.interpunctuationMode = str.length() == 1 && isInterpunctuation(charAt);
        this.rtl = false;
    }

    LiteralProcessor(char c, char c2) {
        this.single = c;
        this.alt = c2;
        this.attribute = null;
        this.multi = null;
        if (c < ' ' || c2 < ' ') {
            throw new IllegalArgumentException("Literal must not start with non-printable char.");
        }
        if (Character.isDigit(c) || Character.isDigit(c2)) {
            throw new IllegalArgumentException("Literal must not be a decimal digit.");
        }
        this.caseInsensitive = true;
        this.interpunctuationMode = false;
        this.rtl = false;
    }

    LiteralProcessor(AttributeKey<Character> attributeKey) {
        if (attributeKey == null) {
            throw new NullPointerException("Missing format attribute.");
        }
        this.single = (char) 0;
        this.alt = (char) 0;
        this.attribute = attributeKey;
        this.multi = null;
        this.caseInsensitive = true;
        this.interpunctuationMode = false;
        this.rtl = false;
    }

    private LiteralProcessor(char c, char c2, String str, AttributeKey<Character> attributeKey, boolean z, boolean z2, boolean z3) {
        this.single = c;
        this.alt = c2;
        this.multi = str;
        this.attribute = attributeKey;
        this.caseInsensitive = z;
        this.interpunctuationMode = z2;
        this.rtl = z3;
    }

    @Override // net.time4j.format.expert.FormatProcessor
    public int print(ChronoDisplay chronoDisplay, Appendable appendable, AttributeQuery attributeQuery, Set<ElementPosition> set, boolean z) throws IOException {
        AttributeKey<Character> attributeKey = this.attribute;
        if (attributeKey != null) {
            appendable.append(((Character) attributeQuery.get(attributeKey, null)).charValue());
            return 1;
        }
        String str = this.multi;
        if (str == null) {
            appendable.append(this.single);
            return 1;
        }
        appendable.append(str);
        return this.multi.length();
    }

    @Override // net.time4j.format.expert.FormatProcessor
    public void parse(CharSequence charSequence, ParseLog parseLog, AttributeQuery attributeQuery, ParsedEntity<?> parsedEntity, boolean z) {
        if (z && this.interpunctuationMode) {
            int position = parseLog.getPosition();
            if (position < charSequence.length() && charSequence.charAt(position) == this.single) {
                parseLog.setPosition(position + 1);
                return;
            } else {
                if (this.single == '.' && ((Boolean) attributeQuery.get(Attributes.PARSE_MULTIPLE_CONTEXT, Boolean.TRUE)).booleanValue()) {
                    return;
                }
                logError(charSequence, parseLog);
                return;
            }
        }
        if (this.multi == null) {
            parseChar(charSequence, parseLog, attributeQuery, z);
        } else {
            parseMulti(charSequence, parseLog, attributeQuery, z);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:30:0x008a, code lost:
    
        if (charEqualsIgnoreCase(r2, r5) != false) goto L39;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void parseChar(CharSequence charSequence, ParseLog parseLog, AttributeQuery attributeQuery, boolean z) {
        char c;
        boolean booleanValue;
        int position = parseLog.getPosition();
        char c2 = this.single;
        AttributeKey<Character> attributeKey = this.attribute;
        boolean z2 = false;
        if (attributeKey != null) {
            c2 = ((Character) attributeQuery.get(attributeKey, (char) 0)).charValue();
        }
        if (position >= charSequence.length() || c2 == 0 || Character.isDigit(c2)) {
            c = 0;
            z2 = true;
        } else {
            c = charSequence.charAt(position);
            char c3 = this.alt;
            if (this.attribute != null && Attributes.DECIMAL_SEPARATOR.name().equals(this.attribute.name()) && Locale.ROOT.equals(attributeQuery.get(Attributes.LANGUAGE, Locale.ROOT))) {
                c3 = '.';
                if (c2 != ',') {
                    c3 = c2 == '.' ? ',' : c2;
                }
            }
            boolean z3 = (c == c2 || c == c3) ? false : true;
            if (z3) {
                if (z) {
                    booleanValue = this.caseInsensitive;
                } else {
                    booleanValue = ((Boolean) attributeQuery.get(Attributes.PARSE_CASE_INSENSITIVE, Boolean.TRUE)).booleanValue();
                }
                if (booleanValue) {
                    if (!charEqualsIgnoreCase(c, c2)) {
                    }
                }
            }
            z2 = z3;
        }
        if (z2) {
            StringBuilder sb = new StringBuilder("Cannot parse: \"");
            sb.append(charSequence);
            sb.append("\" (expected: [");
            sb.append(c2);
            sb.append("], found: [");
            if (c != 0) {
                sb.append(c);
            }
            sb.append("])");
            parseLog.setError(position, sb.toString());
            return;
        }
        parseLog.setPosition(position + 1);
    }

    private void parseMulti(CharSequence charSequence, ParseLog parseLog, AttributeQuery attributeQuery, boolean z) {
        boolean booleanValue;
        boolean isRTL;
        int position = parseLog.getPosition();
        if (z) {
            booleanValue = this.caseInsensitive;
        } else {
            booleanValue = ((Boolean) attributeQuery.get(Attributes.PARSE_CASE_INSENSITIVE, Boolean.TRUE)).booleanValue();
        }
        if (z) {
            isRTL = this.rtl;
        } else {
            isRTL = CalendarText.isRTL((Locale) attributeQuery.get(Attributes.LANGUAGE, Locale.ROOT));
        }
        int subSequenceEquals = subSequenceEquals(charSequence, position, this.multi, booleanValue, isRTL);
        if (subSequenceEquals == -1) {
            logError(charSequence, parseLog);
        } else {
            parseLog.setPosition(position + subSequenceEquals);
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof LiteralProcessor) {
            LiteralProcessor literalProcessor = (LiteralProcessor) obj;
            AttributeKey<Character> attributeKey = this.attribute;
            if (attributeKey != null) {
                return attributeKey.equals(literalProcessor.attribute);
            }
            String str = this.multi;
            if (str == null) {
                return literalProcessor.multi == null && this.single == literalProcessor.single && this.alt == literalProcessor.alt;
            }
            if (str.equals(literalProcessor.multi) && this.interpunctuationMode == literalProcessor.interpunctuationMode) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        String name;
        AttributeKey<Character> attributeKey = this.attribute;
        if (attributeKey == null) {
            name = this.multi;
            if (name == null) {
                name = "";
            }
        } else {
            name = attributeKey.name();
        }
        return name.hashCode() ^ this.single;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getName());
        sb.append("[literal=");
        if (this.attribute != null) {
            sb.append(AbstractJsonLexerKt.BEGIN_OBJ);
            sb.append(this.attribute);
            sb.append(AbstractJsonLexerKt.END_OBJ);
        } else {
            String str = this.multi;
            if (str == null) {
                sb.append(this.single);
                if (this.alt != this.single) {
                    sb.append(", alternative=");
                    sb.append(this.alt);
                }
            } else {
                sb.append(str);
            }
        }
        sb.append(AbstractJsonLexerKt.END_LIST);
        return sb.toString();
    }

    @Override // net.time4j.format.expert.FormatProcessor
    public boolean isNumerical() {
        return this.multi != null && getPrefixedDigitArea() == this.multi.length();
    }

    @Override // net.time4j.format.expert.FormatProcessor
    public FormatProcessor<Void> quickPath(ChronoFormatter<?> chronoFormatter, AttributeQuery attributeQuery, int i) {
        boolean isRTL = CalendarText.isRTL((Locale) attributeQuery.get(Attributes.LANGUAGE, Locale.ROOT));
        return new LiteralProcessor(this.single, this.alt, this.multi, this.attribute, ((Boolean) attributeQuery.get(Attributes.PARSE_CASE_INSENSITIVE, Boolean.TRUE)).booleanValue(), this.interpunctuationMode && !isRTL, isRTL);
    }

    int getPrefixedDigitArea() {
        String str = this.multi;
        if (str == null) {
            return 0;
        }
        int length = str.length();
        int i = 0;
        for (int i2 = 0; i2 < length && Character.isDigit(this.multi.charAt(i2)); i2++) {
            i++;
        }
        return i;
    }

    static int subSequenceEquals(CharSequence charSequence, int i, CharSequence charSequence2, boolean z, boolean z2) {
        char charAt;
        int length = charSequence.length();
        int length2 = charSequence2.length();
        int i2 = 0;
        for (int i3 = 0; i3 < length2; i3++) {
            char charAt2 = charSequence2.charAt(i3);
            if (!isBidi(charAt2)) {
                if (z2) {
                    charAt = 0;
                    while (true) {
                        int i4 = i2 + i;
                        if (i4 >= length) {
                            break;
                        }
                        charAt = charSequence.charAt(i4);
                        if (!isBidi(charAt)) {
                            break;
                        }
                        i2++;
                    }
                } else {
                    int i5 = i2 + i;
                    charAt = i5 < length ? charSequence.charAt(i5) : (char) 0;
                }
                if (i2 + i >= length) {
                    return -1;
                }
                i2++;
                if (z) {
                    if (!charEqualsIgnoreCase(charAt, charAt2)) {
                        return -1;
                    }
                } else if (charAt != charAt2) {
                    return -1;
                }
            }
        }
        if (z2) {
            while (true) {
                int i6 = i2 + i;
                if (i6 >= length || !isBidi(charSequence.charAt(i6))) {
                    break;
                }
                i2++;
            }
        }
        return i2;
    }

    private static boolean charEqualsIgnoreCase(char c, char c2) {
        return c == c2 || Character.toUpperCase(c) == Character.toUpperCase(c2) || Character.toLowerCase(c) == Character.toLowerCase(c2);
    }

    private static boolean isInterpunctuation(char c) {
        return (Character.isLetter(c) || Character.isDigit(c) || isBidi(c)) ? false : true;
    }

    private void logError(CharSequence charSequence, ParseLog parseLog) {
        int position = parseLog.getPosition();
        parseLog.setError(position, "Cannot parse: \"" + charSequence + "\" (expected: [" + this.multi + "], found: [" + charSequence.subSequence(position, Math.min(this.multi.length() + position, charSequence.length())) + "])");
    }
}
