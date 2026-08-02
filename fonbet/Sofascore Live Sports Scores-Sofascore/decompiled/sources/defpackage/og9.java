package defpackage;

import androidx.core.app.NotificationCompat;
import java.util.Locale;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes7.dex */
public abstract class og9 {
    public static final String[] a = {"DATA", "HEADERS", "PRIORITY", "RST_STREAM", "SETTINGS", "PUSH_PROMISE", "PING", "GOAWAY", "WINDOW_UPDATE", "CONTINUATION"};
    public static final String[] b = new String[64];
    public static final String[] c = new String[NotificationCompat.FLAG_LOCAL_ONLY];

    static {
        int i = 0;
        int i2 = 0;
        while (true) {
            String[] strArr = c;
            if (i2 >= strArr.length) {
                break;
            }
            strArr[i2] = String.format("%8s", Integer.toBinaryString(i2)).replace(' ', '0');
            i2++;
        }
        String[] strArr2 = b;
        strArr2[0] = "";
        strArr2[1] = "END_STREAM";
        int[] iArr = {1};
        strArr2[8] = "PADDED";
        int i3 = iArr[0];
        strArr2[i3 | 8] = mz1.o(new StringBuilder(), strArr2[i3], "|PADDED");
        strArr2[4] = "END_HEADERS";
        strArr2[32] = "PRIORITY";
        strArr2[36] = "END_HEADERS|PRIORITY";
        int[] iArr2 = {4, 32, 36};
        for (int i4 = 0; i4 < 3; i4++) {
            int i5 = iArr2[i4];
            int i6 = iArr[0];
            String[] strArr3 = b;
            int i7 = i6 | i5;
            strArr3[i7] = strArr3[i6] + '|' + strArr3[i5];
            StringBuilder sb = new StringBuilder();
            sb.append(strArr3[i6]);
            sb.append('|');
            strArr3[i7 | 8] = mz1.o(sb, strArr3[i5], "|PADDED");
        }
        while (true) {
            String[] strArr4 = b;
            if (i >= strArr4.length) {
                return;
            }
            if (strArr4[i] == null) {
                strArr4[i] = c[i];
            }
            i++;
        }
    }

    public static String a(boolean z, int i, int i2, byte b2, byte b3) {
        String str;
        String format = b2 < 10 ? a[b2] : String.format("0x%02x", Byte.valueOf(b2));
        if (b3 == 0) {
            str = "";
        } else {
            String[] strArr = c;
            if (b2 != 2 && b2 != 3) {
                if (b2 == 4 || b2 == 6) {
                    str = b3 == 1 ? "ACK" : strArr[b3];
                } else if (b2 != 7 && b2 != 8) {
                    String str2 = b3 < 64 ? b[b3] : strArr[b3];
                    str = (b2 != 5 || (b3 & 4) == 0) ? (b2 != 0 || (b3 & 32) == 0) ? str2 : str2.replace("PRIORITY", "COMPRESSED") : str2.replace("HEADERS", "PUSH_PROMISE");
                }
            }
            str = strArr[b3];
        }
        return String.format(Locale.US, "%s 0x%08x %5d %-13s %s", z ? "<<" : ">>", Integer.valueOf(i), Integer.valueOf(i2), format, str);
    }
}
