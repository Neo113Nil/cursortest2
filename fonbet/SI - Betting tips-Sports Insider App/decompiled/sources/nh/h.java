package nh;

import kotlin.jvm.internal.Intrinsics;
import okio.ByteString;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes3.dex */
public abstract class h {

    /* renamed from: a, reason: collision with root package name */
    public static final ByteString f20955a = ByteString.INSTANCE.encodeUtf8("PRI * HTTP/2.0\r\n\r\nSM\r\n\r\n");

    /* renamed from: b, reason: collision with root package name */
    public static final String[] f20956b = {"DATA", "HEADERS", "PRIORITY", "RST_STREAM", "SETTINGS", "PUSH_PROMISE", "PING", "GOAWAY", "WINDOW_UPDATE", "CONTINUATION"};

    /* renamed from: c, reason: collision with root package name */
    public static final String[] f20957c = new String[64];

    /* renamed from: d, reason: collision with root package name */
    public static final String[] f20958d;

    static {
        String[] strArr = new String[256];
        for (int i5 = 0; i5 < 256; i5++) {
            String binaryString = Integer.toBinaryString(i5);
            Intrinsics.checkNotNullExpressionValue(binaryString, "toBinaryString(...)");
            strArr[i5] = kotlin.text.z.l(hh.g.d("%8s", binaryString), ' ', '0', false);
        }
        f20958d = strArr;
        String[] strArr2 = f20957c;
        strArr2[0] = "";
        strArr2[1] = "END_STREAM";
        int[] iArr = {1};
        strArr2[8] = "PADDED";
        int i10 = iArr[0];
        strArr2[i10 | 8] = d9.e.l(new StringBuilder(), strArr2[i10], "|PADDED");
        strArr2[4] = "END_HEADERS";
        strArr2[32] = "PRIORITY";
        strArr2[36] = "END_HEADERS|PRIORITY";
        int[] iArr2 = {4, 32, 36};
        for (int i11 = 0; i11 < 3; i11++) {
            int i12 = iArr2[i11];
            int i13 = iArr[0];
            String[] strArr3 = f20957c;
            int i14 = i13 | i12;
            strArr3[i14] = strArr3[i13] + '|' + strArr3[i12];
            StringBuilder sb2 = new StringBuilder();
            sb2.append(strArr3[i13]);
            sb2.append('|');
            strArr3[i14 | 8] = d9.e.l(sb2, strArr3[i12], "|PADDED");
        }
        int length = f20957c.length;
        for (int i15 = 0; i15 < length; i15++) {
            String[] strArr4 = f20957c;
            if (strArr4[i15] == null) {
                strArr4[i15] = f20958d[i15];
            }
        }
    }

    public static String a(int i5) {
        String[] strArr = f20956b;
        return i5 < strArr.length ? strArr[i5] : hh.g.d("0x%02x", Integer.valueOf(i5));
    }

    public static String b(int i5, int i10, int i11, int i12, boolean z5) {
        String str;
        String str2;
        String a7 = a(i11);
        if (i12 == 0) {
            str = "";
        } else {
            String[] strArr = f20958d;
            if (i11 != 2 && i11 != 3) {
                if (i11 == 4 || i11 == 6) {
                    str = i12 == 1 ? "ACK" : strArr[i12];
                } else if (i11 != 7 && i11 != 8) {
                    String[] strArr2 = f20957c;
                    if (i12 < strArr2.length) {
                        str2 = strArr2[i12];
                        Intrinsics.checkNotNull(str2);
                    } else {
                        str2 = strArr[i12];
                    }
                    str = (i11 != 5 || (i12 & 4) == 0) ? (i11 != 0 || (i12 & 32) == 0) ? str2 : kotlin.text.z.m(str2, "PRIORITY", "COMPRESSED") : kotlin.text.z.m(str2, "HEADERS", "PUSH_PROMISE");
                }
            }
            str = strArr[i12];
        }
        return hh.g.d("%s 0x%08x %5d %-13s %s", z5 ? "<<" : ">>", Integer.valueOf(i5), Integer.valueOf(i10), a7, str);
    }

    public static String c(long j, int i5, int i10, boolean z5) {
        return hh.g.d("%s 0x%08x %5d %-13s %d", z5 ? "<<" : ">>", Integer.valueOf(i5), Integer.valueOf(i10), a(8), Long.valueOf(j));
    }
}
