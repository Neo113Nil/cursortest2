package net.time4j.format;

import java.text.ParsePosition;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import oi.InterfaceC5907c;
import oi.InterfaceC5908d;

/* loaded from: classes5.dex */
public final class s {

    /* renamed from: a, reason: collision with root package name */
    public final List f58117a;

    public s(String[] strArr) {
        this.f58117a = Collections.unmodifiableList(Arrays.asList(strArr));
    }

    public final boolean a(char c10, char c11) {
        if (c10 >= 'a' && c10 <= 'z') {
            if (c11 >= 'A' && c11 <= 'Z') {
                c11 = (char) (c11 + ' ');
            }
            return c10 == c11;
        }
        if (c10 < 'A' || c10 > 'Z') {
            return Character.toUpperCase(c10) == Character.toUpperCase(c11) || Character.toLowerCase(c10) == Character.toLowerCase(c11);
        }
        char c12 = (char) (c10 + ' ');
        if (c11 >= 'A' && c11 <= 'Z') {
            c11 = (char) (c11 + ' ');
        }
        return c12 == c11;
    }

    public List b() {
        return this.f58117a;
    }

    public Enum c(CharSequence charSequence, ParsePosition parsePosition, Class cls, g gVar) {
        s sVar;
        CharSequence charSequence2;
        ParsePosition parsePosition2;
        Class cls2;
        boolean z10;
        boolean z11;
        boolean z12;
        if (gVar == g.STRICT) {
            sVar = this;
            charSequence2 = charSequence;
            parsePosition2 = parsePosition;
            cls2 = cls;
            z11 = false;
        } else {
            sVar = this;
            charSequence2 = charSequence;
            parsePosition2 = parsePosition;
            cls2 = cls;
            if (gVar != g.LAX) {
                z10 = false;
                z11 = true;
                z12 = true;
                return sVar.e(charSequence2, parsePosition2, cls2, z11, z10, z12);
            }
            z11 = true;
        }
        z10 = z11;
        z12 = z10;
        return sVar.e(charSequence2, parsePosition2, cls2, z11, z10, z12);
    }

    public Enum d(CharSequence charSequence, ParsePosition parsePosition, Class cls, InterfaceC5908d interfaceC5908d) {
        InterfaceC5907c interfaceC5907c = a.f57810i;
        Boolean bool = Boolean.TRUE;
        return e(charSequence, parsePosition, cls, ((Boolean) interfaceC5908d.b(interfaceC5907c, bool)).booleanValue(), ((Boolean) interfaceC5908d.b(a.f57811j, Boolean.FALSE)).booleanValue(), ((Boolean) interfaceC5908d.b(a.f57812k, bool)).booleanValue());
    }

    public final Enum e(CharSequence charSequence, ParsePosition parsePosition, Class cls, boolean z10, boolean z11, boolean z12) {
        int i10;
        int i11;
        String str;
        Enum[] enumArr = (Enum[]) cls.getEnumConstants();
        int size = this.f58117a.size();
        int index = parsePosition.getIndex();
        int length = charSequence.length();
        String str2 = "";
        String str3 = "";
        int i12 = 0;
        Enum r11 = null;
        int i13 = 0;
        while (i12 < enumArr.length) {
            boolean isEmpty = str3.isEmpty();
            if (isEmpty) {
                str3 = i12 >= size ? enumArr[i12].name() : (String) this.f58117a.get(i12);
            }
            int length2 = str3.length();
            int i14 = index;
            int i15 = 0;
            boolean z13 = true;
            while (z13 && i15 < length2) {
                Enum[] enumArr2 = enumArr;
                int i16 = index + i15;
                if (i16 >= length) {
                    i11 = size;
                    str = str2;
                    z13 = false;
                } else {
                    char charAt = charSequence.charAt(i16);
                    i11 = size;
                    char charAt2 = str3.charAt(i15);
                    if (z12) {
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
                    boolean z14 = !z10 ? charAt != charAt2 : !(charAt == charAt2 || a(charAt, charAt2));
                    if (z14) {
                        i14++;
                    }
                    z13 = z14;
                }
                i15++;
                enumArr = enumArr2;
                size = i11;
                str2 = str;
            }
            Enum[] enumArr3 = enumArr;
            int i17 = size;
            String str4 = str2;
            if (z12 && isEmpty && length2 == 5 && str3.charAt(4) == '.' && i14 == (i10 = index + 3) && i10 < length && charSequence.charAt(i10) == '.') {
                i12--;
                str3 = ((Object) str3.subSequence(index, i10)) + ".";
            } else {
                if (z11 || length2 == 1) {
                    int i18 = i14 - index;
                    if (i13 < i18) {
                        r11 = enumArr3[i12];
                        i13 = i18;
                    } else if (i13 == i18) {
                        str3 = str4;
                        r11 = null;
                    }
                } else if (z13) {
                    parsePosition.setIndex(i14);
                    return enumArr3[i12];
                }
                str3 = str4;
            }
            i12++;
            enumArr = enumArr3;
            size = i17;
            str2 = str4;
        }
        if (r11 == null) {
            parsePosition.setErrorIndex(index);
            return r11;
        }
        parsePosition.setIndex(index + i13);
        return r11;
    }

    public String f(Enum r32) {
        int ordinal = r32.ordinal();
        return this.f58117a.size() <= ordinal ? r32.name() : (String) this.f58117a.get(ordinal);
    }

    public String toString() {
        int size = this.f58117a.size();
        StringBuilder sb2 = new StringBuilder((size * 16) + 2);
        sb2.append('{');
        boolean z10 = true;
        for (int i10 = 0; i10 < size; i10++) {
            if (z10) {
                z10 = false;
            } else {
                sb2.append(',');
            }
            sb2.append((String) this.f58117a.get(i10));
        }
        sb2.append('}');
        return sb2.toString();
    }
}
