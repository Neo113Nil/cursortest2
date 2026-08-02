package y9;

import com.google.android.gms.wallet.WalletConstants;
import java.util.Arrays;
import java.util.EnumMap;
import o9.C8659a;

/* loaded from: classes9.dex */
public final class g extends r {

    /* renamed from: c, reason: collision with root package name */
    private static final char[] f106322c = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ-. $/+%abcd*".toCharArray();

    /* renamed from: d, reason: collision with root package name */
    static final int[] f106323d;

    /* renamed from: e, reason: collision with root package name */
    static final int f106324e;

    /* renamed from: a, reason: collision with root package name */
    private final StringBuilder f106325a = new StringBuilder(20);

    /* renamed from: b, reason: collision with root package name */
    private final int[] f106326b = new int[6];

    static {
        int[] iArr = {276, 328, 324, 322, 296, 292, 290, 336, 274, 266, 424, 420, 418, WalletConstants.ERROR_CODE_INVALID_PARAMETERS, WalletConstants.ERROR_CODE_SERVICE_UNAVAILABLE, 394, 360, 356, 354, 308, 282, 344, 332, 326, 300, 278, 436, 434, 428, 422, WalletConstants.ERROR_CODE_SPENDING_LIMIT_EXCEEDED, WalletConstants.ERROR_CODE_INVALID_TRANSACTION, 364, 358, 310, 314, 302, 468, 466, 458, 366, 374, 430, 294, 474, 470, 306, 350};
        f106323d = iArr;
        f106324e = iArr[47];
    }

    private static void g(int i11, int i12, CharSequence charSequence) throws h9.d {
        int i13 = 0;
        int i14 = 1;
        for (int i15 = i11 - 1; i15 >= 0; i15--) {
            i13 += "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ-. $/+%abcd*".indexOf(charSequence.charAt(i15)) * i14;
            i14++;
            if (i14 > i12) {
                i14 = 1;
            }
        }
        if (charSequence.charAt(i11) != f106322c[i13 % 47]) {
            throw h9.d.a();
        }
    }

    private static int h(int[] iArr) {
        int i11 = 0;
        for (int i12 : iArr) {
            i11 += i12;
        }
        int length = iArr.length;
        int i13 = 0;
        for (int i14 = 0; i14 < length; i14++) {
            int round = Math.round((iArr[i14] * 9.0f) / i11);
            if (round <= 0 || round > 4) {
                return -1;
            }
            if ((i14 & 1) == 0) {
                for (int i15 = 0; i15 < round; i15++) {
                    i13 = (i13 << 1) | 1;
                }
            } else {
                i13 <<= round;
            }
        }
        return i13;
    }

    /* JADX WARN: Code restructure failed: missing block: B:101:0x0136, code lost:
    
        if (r6 < 'X') goto L128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:102:0x0138, code lost:
    
        if (r6 > 'Z') goto L129;
     */
    /* JADX WARN: Code restructure failed: missing block: B:103:0x013a, code lost:
    
        r5 = 127;
     */
    /* JADX WARN: Code restructure failed: missing block: B:106:0x0141, code lost:
    
        throw h9.h.a();
     */
    /* JADX WARN: Code restructure failed: missing block: B:108:0x0142, code lost:
    
        if (r6 < 'A') goto L130;
     */
    /* JADX WARN: Code restructure failed: missing block: B:109:0x0144, code lost:
    
        if (r6 > 'Z') goto L131;
     */
    /* JADX WARN: Code restructure failed: missing block: B:110:0x0146, code lost:
    
        r6 = r6 - '@';
     */
    /* JADX WARN: Code restructure failed: missing block: B:113:0x0151, code lost:
    
        throw h9.h.a();
     */
    /* JADX WARN: Code restructure failed: missing block: B:117:0x0156, code lost:
    
        throw h9.h.a();
     */
    /* JADX WARN: Code restructure failed: missing block: B:118:0x0157, code lost:
    
        r2.append(r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:121:0x015d, code lost:
    
        r13 = r13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:122:0x0185, code lost:
    
        return new h9.q(r2.toString(), null, new h9.s[]{new h9.s((r15[1] + r15[0]) / 2.0f, r13), new h9.s((r9 / 2.0f) + r1, r13)}, h9.EnumC6876a.CODE_93);
     */
    /* JADX WARN: Code restructure failed: missing block: B:124:0x018a, code lost:
    
        throw h9.m.a();
     */
    /* JADX WARN: Code restructure failed: missing block: B:126:0x018f, code lost:
    
        throw h9.m.a();
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0058, code lost:
    
        r5 = y9.g.f106322c[r6];
        r4.append(r5);
        r6 = r2.length;
        r7 = 0;
        r9 = r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0062, code lost:
    
        if (r7 >= r6) goto L125;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0064, code lost:
    
        r9 = r9 + r2[r7];
        r7 = r7 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x006a, code lost:
    
        r6 = r14.h(r9);
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0070, code lost:
    
        if (r5 != '*') goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0072, code lost:
    
        r4.deleteCharAt(r4.length() - 1);
        r5 = r2.length;
        r7 = 0;
        r9 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x007d, code lost:
    
        if (r7 >= r5) goto L126;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x007f, code lost:
    
        r9 = r9 + r2[r7];
        r7 = r7 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x0085, code lost:
    
        if (r6 == r3) goto L103;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x008b, code lost:
    
        if (r14.f(r6) == false) goto L103;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x0091, code lost:
    
        if (r4.length() < 2) goto L101;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x0093, code lost:
    
        r14 = r4.length();
        g(r14 - 2, 20, r4);
        g(r14 - 1, 15, r4);
        r4.setLength(r4.length() - 2);
        r14 = r4.length();
        r2 = new java.lang.StringBuilder(r14);
        r3 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x00b6, code lost:
    
        if (r3 >= r14) goto L127;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x00b8, code lost:
    
        r5 = r4.charAt(r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x00be, code lost:
    
        if (r5 < 'a') goto L97;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x00c2, code lost:
    
        if (r5 > 'd') goto L97;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x00c6, code lost:
    
        if (r3 >= (r14 - 1)) goto L132;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x00c8, code lost:
    
        r3 = r3 + 1;
        r6 = r4.charAt(r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x00d4, code lost:
    
        switch(r5) {
            case 97: goto L89;
            case 98: goto L56;
            case 99: goto L49;
            case 100: goto L43;
            default: goto L42;
        };
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x00d7, code lost:
    
        r5 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x0149, code lost:
    
        r2.append(r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x015a, code lost:
    
        r3 = r3 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x00da, code lost:
    
        if (r6 < 'A') goto L133;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x00dc, code lost:
    
        if (r6 > 'Z') goto L134;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x00de, code lost:
    
        r6 = r6 + ' ';
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x00e0, code lost:
    
        r5 = (char) r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x00e7, code lost:
    
        throw h9.h.a();
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x00e8, code lost:
    
        if (r6 < 'A') goto L52;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x00ea, code lost:
    
        if (r6 > 'O') goto L52;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x00ec, code lost:
    
        r6 = r6 - ' ';
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x00ef, code lost:
    
        if (r6 != 'Z') goto L135;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x00f1, code lost:
    
        r5 = ':';
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x00f8, code lost:
    
        throw h9.h.a();
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x00f9, code lost:
    
        if (r6 < 'A') goto L60;
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x00fd, code lost:
    
        if (r6 > 'E') goto L60;
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x00ff, code lost:
    
        r6 = r6 - '&';
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x0104, code lost:
    
        if (r6 < 'F') goto L65;
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x0108, code lost:
    
        if (r6 > 'J') goto L65;
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x010a, code lost:
    
        r6 = r6 - 11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x010f, code lost:
    
        if (r6 < 'K') goto L69;
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x0111, code lost:
    
        if (r6 > 'O') goto L69;
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x0113, code lost:
    
        r6 = r6 + 16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x0118, code lost:
    
        if (r6 < 'P') goto L74;
     */
    /* JADX WARN: Code restructure failed: missing block: B:90:0x011c, code lost:
    
        if (r6 > 'T') goto L74;
     */
    /* JADX WARN: Code restructure failed: missing block: B:91:0x011e, code lost:
    
        r6 = r6 + '+';
     */
    /* JADX WARN: Code restructure failed: missing block: B:93:0x0123, code lost:
    
        if (r6 != 'U') goto L77;
     */
    /* JADX WARN: Code restructure failed: missing block: B:95:0x0128, code lost:
    
        if (r6 != 'V') goto L80;
     */
    /* JADX WARN: Code restructure failed: missing block: B:96:0x012a, code lost:
    
        r5 = '@';
     */
    /* JADX WARN: Code restructure failed: missing block: B:98:0x012f, code lost:
    
        if (r6 != 'W') goto L83;
     */
    /* JADX WARN: Code restructure failed: missing block: B:99:0x0131, code lost:
    
        r5 = '`';
     */
    @Override // y9.r
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final h9.q b(int i11, C8659a c8659a, EnumMap enumMap) throws h9.m, h9.d, h9.h {
        int h11;
        int j11 = c8659a.j();
        int h12 = c8659a.h(0);
        int[] iArr = this.f106326b;
        Arrays.fill(iArr, 0);
        int length = iArr.length;
        boolean z11 = false;
        int i12 = 0;
        int i13 = h12;
        while (h12 < j11) {
            if (c8659a.f(h12) != z11) {
                iArr[i12] = iArr[i12] + 1;
            } else {
                if (i12 != length - 1) {
                    i12++;
                } else if (h(iArr) == f106324e) {
                    int h13 = c8659a.h(new int[]{i13, h12}[1]);
                    int j12 = c8659a.j();
                    Arrays.fill(iArr, 0);
                    StringBuilder sb2 = this.f106325a;
                    sb2.setLength(0);
                    while (true) {
                        r.e(h13, c8659a, iArr);
                        int h14 = h(iArr);
                        if (h14 < 0) {
                            throw h9.m.a();
                        }
                        int i14 = 0;
                        while (true) {
                            int[] iArr2 = f106323d;
                            if (i14 >= iArr2.length) {
                                throw h9.m.a();
                            }
                            if (iArr2[i14] == h14) {
                                break;
                            }
                            i14++;
                        }
                        h13 = h11;
                    }
                } else {
                    i13 += iArr[0] + iArr[1];
                    int i15 = i12 - 1;
                    System.arraycopy(iArr, 2, iArr, 0, i15);
                    iArr[i15] = 0;
                    iArr[i12] = 0;
                    i12--;
                }
                iArr[i12] = 1;
                z11 = !z11;
            }
            h12++;
        }
        throw h9.m.a();
    }
}
