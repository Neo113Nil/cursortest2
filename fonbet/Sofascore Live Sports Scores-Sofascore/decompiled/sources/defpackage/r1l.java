package defpackage;

import java.util.regex.Pattern;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class r1l {
    public static final Pattern c = Pattern.compile("\\[voice=\"([^\"]*)\"\\]");
    public static final Pattern d = Pattern.compile("^((?:[0-9]*\\.)?[0-9]+)(px|em|%)$");
    public final j9e a = new j9e();
    public final StringBuilder b = new StringBuilder();

    public static String a(j9e j9eVar, StringBuilder sb) {
        boolean z = false;
        sb.setLength(0);
        int i = j9eVar.b;
        int i2 = j9eVar.c;
        while (i < i2 && !z) {
            char c2 = (char) j9eVar.a[i];
            if ((c2 < 'A' || c2 > 'Z') && ((c2 < 'a' || c2 > 'z') && !((c2 >= '0' && c2 <= '9') || c2 == '#' || c2 == '-' || c2 == '.' || c2 == '_'))) {
                z = true;
            } else {
                i++;
                sb.append(c2);
            }
        }
        j9eVar.O(i - j9eVar.b);
        return sb.toString();
    }

    public static String b(j9e j9eVar, StringBuilder sb) {
        c(j9eVar);
        if (j9eVar.a() == 0) {
            return null;
        }
        String a = a(j9eVar, sb);
        if (!a.isEmpty()) {
            return a;
        }
        return "" + ((char) j9eVar.A());
    }

    public static void c(j9e j9eVar) {
        while (true) {
            for (boolean z = true; j9eVar.a() > 0 && z; z = false) {
                int i = j9eVar.b;
                byte[] bArr = j9eVar.a;
                byte b = bArr[i];
                char c2 = (char) b;
                if (c2 == '\t' || c2 == '\n' || c2 == '\f' || c2 == '\r' || c2 == ' ') {
                    j9eVar.O(1);
                } else {
                    int i2 = j9eVar.c;
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
                            j9eVar.O(i2 - j9eVar.b);
                        }
                    }
                }
            }
            return;
        }
    }
}
