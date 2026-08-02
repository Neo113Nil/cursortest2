package defpackage;

import com.ironsource.U3;
import java.util.Collection;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.collections.a;
import kotlin.text.CharsKt;
import kotlin.text.StringsKt;
import kotlin.text.StringsKt__StringsKt;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public abstract class n8k {
    public static final List a = a.c("");

    public static final int a(int i, int i2, String str) {
        boolean z = false;
        while (i < i2) {
            char charAt = str.charAt(i);
            if (charAt != ':') {
                if (charAt == '[') {
                    z = true;
                } else if (charAt == ']') {
                    z = false;
                }
            } else if (!z) {
                return i;
            }
            i++;
        }
        return -1;
    }

    public static final m8k b(m8k m8kVar, String str) {
        str.getClass();
        if (StringsKt.R(str)) {
            return m8kVar;
        }
        try {
            c(m8kVar, str);
            return m8kVar;
        } catch (Throwable th) {
            throw new kx2(8, "Fail to parse url: ".concat(str), th);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:81:0x0100, code lost:
    
        if (r14 >= 128) goto L90;
     */
    /* JADX WARN: Removed duplicated region for block: B:100:0x013e  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x010c A[LOOP:4: B:71:0x00ee->B:78:0x010c, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0111 A[EDGE_INSN: B:79:0x0111->B:84:0x0111 BREAK  A[LOOP:4: B:71:0x00ee->B:78:0x010c], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0137  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void c(m8k m8kVar, String str) {
        int i;
        char charAt;
        int i2;
        int i3;
        int i4;
        int i5;
        int y;
        int y2;
        int intValue;
        str.getClass();
        int length = str.length();
        int i6 = 0;
        while (true) {
            if (i6 >= length) {
                i6 = -1;
                break;
            } else if (!CharsKt.b(str.charAt(i6))) {
                break;
            } else {
                i6++;
            }
        }
        int length2 = str.length() - 1;
        if (length2 >= 0) {
            while (true) {
                int i7 = length2 - 1;
                if (!CharsKt.b(str.charAt(length2))) {
                    break;
                } else if (i7 < 0) {
                    break;
                } else {
                    length2 = i7;
                }
            }
            i = length2 + 1;
            charAt = str.charAt(i6);
            char c = 'A';
            if (('a' <= charAt || charAt >= '{') && ('A' > charAt || charAt >= '[')) {
                i2 = i6;
                i3 = i2;
            } else {
                i2 = i6;
                i3 = -1;
            }
            while (i2 < i) {
                char charAt2 = str.charAt(i2);
                if (charAt2 == ':') {
                    if (i3 != -1) {
                        a70.p(ljg.j(i3, "Illegal character in scheme at position "));
                        return;
                    }
                    i4 = i2 - i6;
                    if (i4 > 0) {
                        String substring = str.substring(i6, i6 + i4);
                        o8k o8kVar = o8k.c;
                        int length3 = substring.length();
                        int i8 = 0;
                        while (true) {
                            if (i8 >= length3) {
                                i8 = -1;
                                break;
                            }
                            char charAt3 = substring.charAt(i8);
                            if ((('A' > charAt3 || charAt3 >= '[') ? (charAt3 < 0 || charAt3 >= 128) ? Character.toLowerCase(charAt3) : charAt3 : (char) (charAt3 + ' ')) != charAt3) {
                                break;
                            } else {
                                i8++;
                            }
                        }
                        if (i8 != -1) {
                            StringBuilder sb = new StringBuilder(substring.length());
                            sb.append((CharSequence) substring, 0, i8);
                            int length4 = substring.length() - 1;
                            if (i8 <= length4) {
                                while (true) {
                                    char charAt4 = substring.charAt(i8);
                                    if (c <= charAt4 && charAt4 < '[') {
                                        charAt4 = (char) (charAt4 + ' ');
                                        sb.append(charAt4);
                                        if (i8 != length4) {
                                            break;
                                        }
                                        i8++;
                                        c = 'A';
                                    }
                                    charAt4 = Character.toLowerCase(charAt4);
                                    sb.append(charAt4);
                                    if (i8 != length4) {
                                    }
                                }
                            }
                            substring = sb.toString();
                        }
                        o8k o8kVar2 = (o8k) o8k.d.get(substring);
                        if (o8kVar2 == null) {
                            o8kVar2 = new o8k(substring, 0);
                        }
                        m8kVar.d = o8kVar2;
                        i6 += i4 + 1;
                    }
                    if (m8kVar.c().a.equals("data")) {
                        m8kVar.a = str.substring(i6, i);
                        return;
                    }
                    int i9 = 0;
                    while (true) {
                        i5 = i6 + i9;
                        if (i5 >= i || str.charAt(i5) != '/') {
                            break;
                        } else {
                            i9++;
                        }
                    }
                    if (m8kVar.c().a.equals(U3.i.b)) {
                        if (i9 == 1) {
                            m8kVar.a = "";
                            s6a.M(m8kVar, str.substring(i5, i));
                            return;
                        }
                        if (i9 != 2) {
                            if (i9 != 3) {
                                a70.p("Invalid file url: ".concat(str));
                                return;
                            } else {
                                m8kVar.a = "";
                                s6a.M(m8kVar, "/".concat(str.substring(i5, i)));
                                return;
                            }
                        }
                        int O = StringsKt.O(str, '/', i5, 4);
                        if (O == -1 || O == i) {
                            m8kVar.a = str.substring(i5, i);
                            return;
                        } else {
                            m8kVar.a = str.substring(i5, O);
                            s6a.M(m8kVar, str.substring(O, i));
                            return;
                        }
                    }
                    if (m8kVar.c().a.equals("mailto")) {
                        if (i9 != 0) {
                            a70.p("Failed requirement.");
                            return;
                        }
                        int P = StringsKt.P(str, "@", i5, false, 4);
                        if (P == -1) {
                            a70.p(lnb.o("Invalid mailto url: ", str, ", it should contain '@'."));
                            return;
                        }
                        String c2 = xz2.c(str.substring(i5, P));
                        m8kVar.e = c2 != null ? xz2.e(c2, false) : null;
                        m8kVar.a = str.substring(P + 1, i);
                        return;
                    }
                    if (m8kVar.c().a.equals("about")) {
                        if (i9 == 0) {
                            m8kVar.a = str.substring(i5, i);
                            return;
                        } else {
                            a70.p("Failed requirement.");
                            return;
                        }
                    }
                    if (m8kVar.c().a.equals("tel")) {
                        if (i9 == 0) {
                            m8kVar.a = str.substring(i5, i);
                            return;
                        } else {
                            a70.p("Failed requirement.");
                            return;
                        }
                    }
                    if (i9 >= 2) {
                        while (true) {
                            char[] cArr = new char[5];
                            int i10 = 0;
                            for (int i11 = 5; i10 < i11; i11 = 5) {
                                cArr[i10] = "@/\\?#".charAt(i10);
                                i10++;
                            }
                            y2 = StringsKt__StringsKt.y(str, cArr, i5, false);
                            Integer valueOf = Integer.valueOf(y2);
                            if (y2 <= 0) {
                                valueOf = null;
                            }
                            intValue = valueOf != null ? valueOf.intValue() : i;
                            if (intValue >= i || str.charAt(intValue) != '@') {
                                break;
                            }
                            int a2 = a(i5, intValue, str);
                            if (a2 != -1) {
                                m8kVar.e = str.substring(i5, a2);
                                m8kVar.f = str.substring(a2 + 1, intValue);
                            } else {
                                m8kVar.e = str.substring(i5, intValue);
                            }
                            i5 = intValue + 1;
                        }
                        int a3 = a(i5, intValue, str);
                        Integer valueOf2 = Integer.valueOf(a3);
                        if (a3 <= 0) {
                            valueOf2 = null;
                        }
                        int intValue2 = valueOf2 != null ? valueOf2.intValue() : intValue;
                        m8kVar.a = str.substring(i5, intValue2);
                        int i12 = intValue2 + 1;
                        m8kVar.e(i12 < intValue ? Integer.parseInt(str.substring(i12, intValue)) : 0);
                        i5 = intValue;
                    }
                    List list = a;
                    if (i5 >= i) {
                        if (str.charAt(length2) != '/') {
                            list = km5.a;
                        }
                        m8kVar.d(list);
                        return;
                    }
                    m8kVar.d(i9 == 0 ? CollectionsKt.T(m8kVar.h) : km5.a);
                    char[] cArr2 = new char[2];
                    for (int i13 = 0; i13 < 2; i13++) {
                        cArr2[i13] = "?#".charAt(i13);
                    }
                    y = StringsKt__StringsKt.y(str, cArr2, i5, false);
                    Integer valueOf3 = Integer.valueOf(y);
                    if (y <= 0) {
                        valueOf3 = null;
                    }
                    int intValue3 = valueOf3 != null ? valueOf3.intValue() : i;
                    if (intValue3 > i5) {
                        String substring2 = str.substring(i5, intValue3);
                        Collection collection = (m8kVar.h.size() == 1 && ((CharSequence) CollectionsKt.Y(m8kVar.h)).length() == 0) ? km5.a : m8kVar.h;
                        List Y = substring2.equals("/") ? list : StringsKt.Y(substring2, new char[]{'/'});
                        if (i9 != 1) {
                            list = km5.a;
                        }
                        m8kVar.h = CollectionsKt.w0(CollectionsKt.w0(Y, list), collection);
                        i5 = intValue3;
                    }
                    if (i5 < i && str.charAt(i5) == '?') {
                        int i14 = i5 + 1;
                        if (i14 == i) {
                            m8kVar.b = true;
                            i5 = i;
                        } else {
                            int O2 = StringsKt.O(str, '#', i14, 4);
                            Integer valueOf4 = O2 > 0 ? Integer.valueOf(O2) : null;
                            int intValue4 = valueOf4 != null ? valueOf4.intValue() : i;
                            w3a.L(str.substring(i14, intValue4)).d(new lqj(m8kVar, 7));
                            i5 = intValue4;
                        }
                    }
                    if (i5 >= i || str.charAt(i5) != '#') {
                        return;
                    }
                    m8kVar.g = str.substring(i5 + 1, i);
                    return;
                }
                if (charAt2 == '#' || charAt2 == '/' || charAt2 == '?') {
                    break;
                }
                if (i3 == -1 && (('a' > charAt2 || charAt2 >= '{') && (('A' > charAt2 || charAt2 >= '[') && (('0' > charAt2 || charAt2 >= ':') && charAt2 != '.' && charAt2 != '+' && charAt2 != '-')))) {
                    i3 = i2;
                }
                i2++;
            }
            i4 = -1;
            if (i4 > 0) {
            }
            if (m8kVar.c().a.equals("data")) {
            }
        }
        length2 = -1;
        i = length2 + 1;
        charAt = str.charAt(i6);
        char c3 = 'A';
        if ('a' <= charAt) {
        }
        i2 = i6;
        i3 = i2;
        while (i2 < i) {
        }
        i4 = -1;
        if (i4 > 0) {
        }
        if (m8kVar.c().a.equals("data")) {
        }
    }
}
