package gf;

import C.o0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import sf.C9684j;

/* loaded from: classes6.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    public static final C9684j f64323a;

    /* renamed from: b, reason: collision with root package name */
    private static final String[] f64324b;

    /* renamed from: c, reason: collision with root package name */
    private static final String[] f64325c;

    /* renamed from: d, reason: collision with root package name */
    private static final String[] f64326d;

    /* renamed from: e, reason: collision with root package name */
    public static final e f64327e = new e();

    static {
        C9684j c9684j = C9684j.f98719d;
        f64323a = C9684j.a.c("PRI * HTTP/2.0\r\n\r\nSM\r\n\r\n");
        f64324b = new String[]{"DATA", "HEADERS", "PRIORITY", "RST_STREAM", "SETTINGS", "PUSH_PROMISE", "PING", "GOAWAY", "WINDOW_UPDATE", "CONTINUATION"};
        f64325c = new String[64];
        String[] strArr = new String[256];
        for (int i11 = 0; i11 < 256; i11++) {
            String binaryString = Integer.toBinaryString(i11);
            Intrinsics.checkNotNullExpressionValue(binaryString, "Integer.toBinaryString(it)");
            strArr[i11] = kotlin.text.h.Y(Ye.b.k("%8s", binaryString), ' ', '0');
        }
        f64326d = strArr;
        String[] strArr2 = f64325c;
        strArr2[0] = "";
        strArr2[1] = "END_STREAM";
        int[] iArr = {1};
        strArr2[8] = "PADDED";
        int i12 = iArr[0];
        strArr2[i12 | 8] = Intrinsics.l("|PADDED", strArr2[i12]);
        strArr2[4] = "END_HEADERS";
        strArr2[32] = "PRIORITY";
        strArr2[36] = "END_HEADERS|PRIORITY";
        int[] iArr2 = {4, 32, 36};
        for (int i13 = 0; i13 < 3; i13++) {
            int i14 = iArr2[i13];
            int i15 = iArr[0];
            String[] strArr3 = f64325c;
            int i16 = i15 | i14;
            strArr3[i16] = strArr3[i15] + "|" + strArr3[i14];
            StringBuilder sb2 = new StringBuilder();
            sb2.append(strArr3[i15]);
            sb2.append("|");
            strArr3[i16 | 8] = o0.c(sb2, strArr3[i14], "|PADDED");
        }
        int length = f64325c.length;
        for (int i17 = 0; i17 < length; i17++) {
            String[] strArr4 = f64325c;
            if (strArr4[i17] == null) {
                strArr4[i17] = f64326d[i17];
            }
        }
    }

    private e() {
    }

    @NotNull
    public static String a(int i11) {
        String[] strArr = f64324b;
        return i11 < strArr.length ? strArr[i11] : Ye.b.k("0x%02x", Integer.valueOf(i11));
    }

    @NotNull
    public static String b(int i11, int i12, int i13, int i14, boolean z11) {
        String str;
        String str2;
        String a11 = a(i13);
        if (i14 == 0) {
            str = "";
        } else {
            String[] strArr = f64326d;
            if (i13 != 2 && i13 != 3) {
                if (i13 == 4 || i13 == 6) {
                    str = i14 == 1 ? "ACK" : strArr[i14];
                } else if (i13 != 7 && i13 != 8) {
                    String[] strArr2 = f64325c;
                    if (i14 < strArr2.length) {
                        str2 = strArr2[i14];
                        Intrinsics.f(str2);
                    } else {
                        str2 = strArr[i14];
                    }
                    str = (i13 != 5 || (i14 & 4) == 0) ? (i13 != 0 || (i14 & 32) == 0) ? str2 : kotlin.text.h.X(str2, "PRIORITY", "COMPRESSED", false) : kotlin.text.h.X(str2, "HEADERS", "PUSH_PROMISE", false);
                }
            }
            str = strArr[i14];
        }
        return Ye.b.k("%s 0x%08x %5d %-13s %s", z11 ? "<<" : ">>", Integer.valueOf(i11), Integer.valueOf(i12), a11, str);
    }
}
