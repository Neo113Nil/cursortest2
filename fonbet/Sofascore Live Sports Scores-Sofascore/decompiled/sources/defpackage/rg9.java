package defpackage;

import androidx.core.app.NotificationCompat;
import kotlin.text.c;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes7.dex */
public abstract class rg9 {
    public static final gc2 a;
    public static final String[] b;
    public static final String[] c;
    public static final String[] d;

    static {
        gc2 gc2Var = gc2.d;
        a = q1f.o("PRI * HTTP/2.0\r\n\r\nSM\r\n\r\n");
        b = new String[]{"DATA", "HEADERS", "PRIORITY", "RST_STREAM", "SETTINGS", "PUSH_PROMISE", "PING", "GOAWAY", "WINDOW_UPDATE", "CONTINUATION"};
        c = new String[64];
        String[] strArr = new String[NotificationCompat.FLAG_LOCAL_ONLY];
        for (int i = 0; i < 256; i++) {
            String binaryString = Integer.toBinaryString(i);
            binaryString.getClass();
            String replace = yol.d("%8s", binaryString).replace(' ', '0');
            replace.getClass();
            strArr[i] = replace;
        }
        d = strArr;
        String[] strArr2 = c;
        strArr2[0] = "";
        strArr2[1] = "END_STREAM";
        int[] iArr = {1};
        strArr2[8] = "PADDED";
        int i2 = iArr[0];
        strArr2[i2 | 8] = mz1.o(new StringBuilder(), strArr2[i2], "|PADDED");
        strArr2[4] = "END_HEADERS";
        strArr2[32] = "PRIORITY";
        strArr2[36] = "END_HEADERS|PRIORITY";
        int[] iArr2 = {4, 32, 36};
        for (int i3 = 0; i3 < 3; i3++) {
            int i4 = iArr2[i3];
            int i5 = iArr[0];
            String[] strArr3 = c;
            int i6 = i5 | i4;
            strArr3[i6] = strArr3[i5] + '|' + strArr3[i4];
            StringBuilder sb = new StringBuilder();
            sb.append(strArr3[i5]);
            sb.append('|');
            strArr3[i6 | 8] = mz1.o(sb, strArr3[i4], "|PADDED");
        }
        int length = c.length;
        for (int i7 = 0; i7 < length; i7++) {
            String[] strArr4 = c;
            if (strArr4[i7] == null) {
                strArr4[i7] = d[i7];
            }
        }
    }

    public static String a(int i) {
        String[] strArr = b;
        return i < strArr.length ? strArr[i] : yol.d("0x%02x", Integer.valueOf(i));
    }

    public static String b(int i, int i2, int i3, int i4, boolean z) {
        String str;
        String str2;
        String a2 = a(i3);
        if (i4 == 0) {
            str = "";
        } else {
            String[] strArr = d;
            if (i3 != 2 && i3 != 3) {
                if (i3 == 4 || i3 == 6) {
                    str = i4 == 1 ? "ACK" : strArr[i4];
                } else if (i3 != 7 && i3 != 8) {
                    String[] strArr2 = c;
                    if (i4 < strArr2.length) {
                        str2 = strArr2[i4];
                        str2.getClass();
                    } else {
                        str2 = strArr[i4];
                    }
                    str = (i3 != 5 || (i4 & 4) == 0) ? (i3 != 0 || (i4 & 32) == 0) ? str2 : c.r(str2, "PRIORITY", "COMPRESSED", false) : c.r(str2, "HEADERS", "PUSH_PROMISE", false);
                }
            }
            str = strArr[i4];
        }
        return yol.d("%s 0x%08x %5d %-13s %s", z ? "<<" : ">>", Integer.valueOf(i), Integer.valueOf(i2), a2, str);
    }

    public static String c(int i, int i2, long j, boolean z) {
        return yol.d("%s 0x%08x %5d %-13s %d", z ? "<<" : ">>", Integer.valueOf(i), Integer.valueOf(i2), a(8), Long.valueOf(j));
    }
}
