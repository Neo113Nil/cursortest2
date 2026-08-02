package defpackage;

import com.google.android.gms.internal.ads.zzeu;
import java.util.regex.Pattern;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class oin {
    public static final Pattern c = Pattern.compile("\\[voice=\"([^\"]*)\"\\]");
    public static final Pattern d = Pattern.compile("^((?:[0-9]*\\.)?[0-9]+)(px|em|%)$");
    public final zzeu a = new zzeu();
    public final StringBuilder b = new StringBuilder();

    public static void a(zzeu zzeuVar) {
        while (true) {
            for (boolean z = true; zzeuVar.B() > 0 && z; z = false) {
                int i = zzeuVar.b;
                byte[] bArr = zzeuVar.a;
                byte b = bArr[i];
                char c2 = (char) b;
                if (c2 == '\t' || c2 == '\n' || c2 == '\f' || c2 == '\r' || c2 == ' ') {
                    zzeuVar.E(1);
                } else {
                    int i2 = zzeuVar.c;
                    if (i + 2 <= i2) {
                        int i3 = i + 1;
                        if (b == 47) {
                            int i4 = i + 2;
                            if (bArr[i3] == 42) {
                                while (true) {
                                    int i5 = i4 + 1;
                                    if (i5 >= i2) {
                                        break;
                                    }
                                    if (((char) bArr[i4]) == '*' && ((char) bArr[i5]) == '/') {
                                        i2 = i4 + 2;
                                        i4 = i2;
                                    } else {
                                        i4 = i5;
                                    }
                                }
                                zzeuVar.E(i2 - zzeuVar.b);
                            }
                        } else {
                            continue;
                        }
                    }
                }
            }
            return;
        }
    }

    public static String b(zzeu zzeuVar, StringBuilder sb) {
        a(zzeuVar);
        if (zzeuVar.B() == 0) {
            return null;
        }
        String c2 = c(zzeuVar, sb);
        if (!c2.isEmpty()) {
            return c2;
        }
        char I = (char) zzeuVar.I();
        StringBuilder sb2 = new StringBuilder(String.valueOf(I).length());
        sb2.append(I);
        return sb2.toString();
    }

    public static String c(zzeu zzeuVar, StringBuilder sb) {
        sb.setLength(0);
        int i = zzeuVar.b;
        int i2 = zzeuVar.c;
        loop0: while (true) {
            for (boolean z = false; i < i2 && !z; z = true) {
                char c2 = (char) zzeuVar.a[i];
                if ((c2 >= 'A' && c2 <= 'Z') || ((c2 >= 'a' && c2 <= 'z') || ((c2 >= '0' && c2 <= '9') || c2 == '#' || c2 == '-' || c2 == '.' || c2 == '_'))) {
                    sb.append(c2);
                    i++;
                }
            }
        }
        zzeuVar.E(i - zzeuVar.b);
        return sb.toString();
    }
}
