package defpackage;

import com.mbridge.msdk.playercommon.exoplayer2.C;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class lsj {
    public final boolean a;
    public final String b;
    public final tsj c;
    public final int d;
    public final byte[] e;

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0052, code lost:
    
        if (r6.equals(com.mbridge.msdk.playercommon.exoplayer2.C.CENC_TYPE_cbc1) == false) goto L14;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public lsj(boolean z, String str, int i, byte[] bArr, int i2, int i3, byte[] bArr2) {
        char c = 0;
        int i4 = 1;
        z1a.s((i == 0) ^ (bArr2 == null));
        this.a = z;
        this.b = str;
        this.d = i;
        this.e = bArr2;
        if (str != null) {
            switch (str.hashCode()) {
                case 3046605:
                    break;
                case 3046671:
                    if (str.equals(C.CENC_TYPE_cbcs)) {
                        c = 1;
                        break;
                    }
                    c = 65535;
                    break;
                case 3049879:
                    if (str.equals(C.CENC_TYPE_cenc)) {
                        c = 2;
                        break;
                    }
                    c = 65535;
                    break;
                case 3049895:
                    if (str.equals(C.CENC_TYPE_cens)) {
                        c = 3;
                        break;
                    }
                    c = 65535;
                    break;
                default:
                    c = 65535;
                    break;
            }
            switch (c) {
                case 0:
                case 1:
                    i4 = 2;
                    break;
                case 2:
                case 3:
                    break;
                default:
                    tgj.d0("Unsupported protection scheme type '" + str + "'. Assuming AES-CTR crypto mode.");
                    break;
            }
        }
        this.c = new tsj(i4, bArr, i2, i3);
    }
}
