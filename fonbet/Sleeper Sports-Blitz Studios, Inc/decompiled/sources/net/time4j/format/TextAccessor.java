package net.time4j.format;

import java.text.ParsePosition;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import net.time4j.engine.AttributeQuery;

/* loaded from: classes10.dex */
public final class TextAccessor {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    private static final char PROTECTED_SPACE = 160;
    private final List<String> textForms;

    TextAccessor(String[] strArr) {
        this.textForms = Collections.unmodifiableList(Arrays.asList(strArr));
    }

    public String print(Enum<?> r3) {
        int ordinal = r3.ordinal();
        if (this.textForms.size() <= ordinal) {
            return r3.name();
        }
        return this.textForms.get(ordinal);
    }

    public <V extends Enum<V>> V parse(CharSequence charSequence, ParsePosition parsePosition, Class<V> cls) {
        return (V) parse(charSequence, parsePosition, cls, true, false, true);
    }

    public <V extends Enum<V>> V parse(CharSequence charSequence, ParsePosition parsePosition, Class<V> cls, Leniency leniency) {
        TextAccessor textAccessor;
        CharSequence charSequence2;
        ParsePosition parsePosition2;
        Class<V> cls2;
        boolean z;
        boolean z2;
        boolean z3;
        if (leniency == Leniency.STRICT) {
            textAccessor = this;
            charSequence2 = charSequence;
            parsePosition2 = parsePosition;
            cls2 = cls;
            z2 = false;
        } else {
            textAccessor = this;
            charSequence2 = charSequence;
            parsePosition2 = parsePosition;
            cls2 = cls;
            if (leniency != Leniency.LAX) {
                z = false;
                z2 = true;
                z3 = true;
                return (V) textAccessor.parse(charSequence2, parsePosition2, cls2, z2, z, z3);
            }
            z2 = true;
        }
        z = z2;
        z3 = z;
        return (V) textAccessor.parse(charSequence2, parsePosition2, cls2, z2, z, z3);
    }

    public <V extends Enum<V>> V parse(CharSequence charSequence, ParsePosition parsePosition, Class<V> cls, AttributeQuery attributeQuery) {
        return (V) parse(charSequence, parsePosition, cls, ((Boolean) attributeQuery.get(Attributes.PARSE_CASE_INSENSITIVE, Boolean.TRUE)).booleanValue(), ((Boolean) attributeQuery.get(Attributes.PARSE_PARTIAL_COMPARE, Boolean.FALSE)).booleanValue(), ((Boolean) attributeQuery.get(Attributes.PARSE_MULTIPLE_CONTEXT, Boolean.TRUE)).booleanValue());
    }

    public List<String> getTextForms() {
        return this.textForms;
    }

    public String toString() {
        int size = this.textForms.size();
        StringBuilder sb = new StringBuilder((size * 16) + 2);
        sb.append(AbstractJsonLexerKt.BEGIN_OBJ);
        boolean z = true;
        for (int i = 0; i < size; i++) {
            if (z) {
                z = false;
            } else {
                sb.append(AbstractJsonLexerKt.COMMA);
            }
            sb.append(this.textForms.get(i));
        }
        sb.append(AbstractJsonLexerKt.END_OBJ);
        return sb.toString();
    }

    private <V extends Enum<V>> V parse(CharSequence charSequence, ParsePosition parsePosition, Class<V> cls, boolean z, boolean z2, boolean z3) {
        int i;
        int i2;
        String str;
        V[] enumConstants = cls.getEnumConstants();
        int size = this.textForms.size();
        int index = parsePosition.getIndex();
        int length = charSequence.length();
        String str2 = "";
        String str3 = "";
        int i3 = 0;
        V v = null;
        int i4 = 0;
        while (i3 < enumConstants.length) {
            boolean isEmpty = str3.isEmpty();
            if (isEmpty) {
                str3 = i3 >= size ? enumConstants[i3].name() : this.textForms.get(i3);
            }
            int length2 = str3.length();
            int i5 = index;
            int i6 = 0;
            boolean z4 = true;
            while (z4 && i6 < length2) {
                V[] vArr = enumConstants;
                int i7 = index + i6;
                if (i7 >= length) {
                    i2 = size;
                    str = str2;
                    z4 = false;
                } else {
                    char charAt = charSequence.charAt(i7);
                    i2 = size;
                    char charAt2 = str3.charAt(i6);
                    if (z3) {
                        str = str2;
                        if (charAt == 160) {
                            charAt = ' ';
                        }
                        if (charAt2 == 160) {
                            charAt2 = ' ';
                        }
                    } else {
                        str = str2;
                    }
                    boolean z5 = !z ? charAt != charAt2 : !(charAt == charAt2 || compareIgnoreCase(charAt, charAt2));
                    if (z5) {
                        i5++;
                    }
                    z4 = z5;
                }
                i6++;
                enumConstants = vArr;
                size = i2;
                str2 = str;
            }
            V[] vArr2 = enumConstants;
            int i8 = size;
            String str4 = str2;
            if (z3 && isEmpty && length2 == 5 && str3.charAt(4) == '.' && i5 == (i = index + 3) && i < length && charSequence.charAt(i) == '.') {
                i3--;
                str3 = ((Object) str3.subSequence(index, i)) + ".";
            } else {
                if (z2 || length2 == 1) {
                    int i9 = i5 - index;
                    if (i4 < i9) {
                        v = vArr2[i3];
                        i4 = i9;
                    } else if (i4 == i9) {
                        str3 = str4;
                        v = null;
                    }
                } else if (z4) {
                    parsePosition.setIndex(i5);
                    return vArr2[i3];
                }
                str3 = str4;
            }
            i3++;
            enumConstants = vArr2;
            size = i8;
            str2 = str4;
        }
        if (v == null) {
            parsePosition.setErrorIndex(index);
            return v;
        }
        parsePosition.setIndex(index + i4);
        return v;
    }

    private boolean compareIgnoreCase(char c, char c2) {
        if (c >= 'a' && c <= 'z') {
            if (c2 >= 'A' && c2 <= 'Z') {
                c2 = (char) (c2 + ' ');
            }
            return c == c2;
        }
        if (c < 'A' || c > 'Z') {
            return Character.toUpperCase(c) == Character.toUpperCase(c2) || Character.toLowerCase(c) == Character.toLowerCase(c2);
        }
        char c3 = (char) (c + ' ');
        if (c2 >= 'A' && c2 <= 'Z') {
            c2 = (char) (c2 + ' ');
        }
        return c3 == c2;
    }
}
