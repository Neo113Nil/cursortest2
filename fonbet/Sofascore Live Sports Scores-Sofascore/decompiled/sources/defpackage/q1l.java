package defpackage;

import java.util.regex.Pattern;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public final class q1l {
    public static final Pattern c = Pattern.compile("\\[voice=\"([^\"]*)\"\\]");
    public static final Pattern d = Pattern.compile("^((?:[0-9]*\\.)?[0-9]+)(px|em|%)$");
    public final nkk a = new nkk(4, false);
    public final StringBuilder b = new StringBuilder();

    public static String a(nkk nkkVar, StringBuilder sb) {
        boolean z = false;
        sb.setLength(0);
        int i = nkkVar.b;
        int i2 = nkkVar.c;
        while (i < i2 && !z) {
            char c2 = (char) nkkVar.a[i];
            if ((c2 < 'A' || c2 > 'Z') && ((c2 < 'a' || c2 > 'z') && !((c2 >= '0' && c2 <= '9') || c2 == '#' || c2 == '-' || c2 == '.' || c2 == '_'))) {
                z = true;
            } else {
                i++;
                sb.append(c2);
            }
        }
        nkkVar.F(i - nkkVar.b);
        return sb.toString();
    }

    public static String b(nkk nkkVar, StringBuilder sb) {
        c(nkkVar);
        if (nkkVar.c() == 0) {
            return null;
        }
        String a = a(nkkVar, sb);
        if (!"".equals(a)) {
            return a;
        }
        return "" + ((char) nkkVar.s());
    }

    public static void c(nkk nkkVar) {
        while (true) {
            for (boolean z = true; nkkVar.c() > 0 && z; z = false) {
                int i = nkkVar.b;
                byte[] bArr = nkkVar.a;
                byte b = bArr[i];
                char c2 = (char) b;
                if (c2 == '\t' || c2 == '\n' || c2 == '\f' || c2 == '\r' || c2 == ' ') {
                    nkkVar.F(1);
                } else {
                    int i2 = nkkVar.c;
                    int i3 = i + 2;
                    if (i3 <= i2) {
                        int i4 = i + 1;
                        if (b == 47 && bArr[i4] == 42) {
                            while (true) {
                                int i5 = i3 + 1;
                                if (i5 >= i2) {
                                    break;
                                }
                                if (((char) bArr[i3]) == '*' && ((char) bArr[i5]) == '/') {
                                    i3 += 2;
                                    i2 = i3;
                                } else {
                                    i3 = i5;
                                }
                            }
                            nkkVar.F(i2 - nkkVar.b);
                        }
                    }
                }
            }
            return;
        }
    }
}
