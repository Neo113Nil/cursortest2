package com.google.android.gms.internal.ads;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzamx {
    public final boolean a;
    public final String b;
    public final zzahs c;
    public final int d;
    public final byte[] e;

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x002c, code lost:
    
        if (r5.equals(com.mbridge.msdk.playercommon.exoplayer2.C.CENC_TYPE_cens) != false) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0035, code lost:
    
        if (r5.equals(com.mbridge.msdk.playercommon.exoplayer2.C.CENC_TYPE_cenc) != false) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x003e, code lost:
    
        if (r5.equals(com.mbridge.msdk.playercommon.exoplayer2.C.CENC_TYPE_cbcs) != false) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0049, code lost:
    
        r1 = 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0047, code lost:
    
        if (r5.equals(com.mbridge.msdk.playercommon.exoplayer2.C.CENC_TYPE_cbc1) != false) goto L25;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public zzamx(boolean z, String str, int i, byte[] bArr, int i2, int i3, byte[] bArr2) {
        int i4 = 1;
        zzguk.a((bArr2 == null) ^ (i == 0));
        this.a = z;
        this.b = str;
        this.d = i;
        this.e = bArr2;
        if (str != null) {
            switch (str.hashCode()) {
                case 3046605:
                    break;
                case 3046671:
                    break;
                case 3049879:
                    break;
                case 3049895:
                    break;
                default:
                    StringBuilder sb = new StringBuilder(str.length() + 68);
                    sb.append("Unsupported protection scheme type '");
                    sb.append(str);
                    sb.append("'. Assuming AES-CTR crypto mode.");
                    zzeh.c(sb.toString());
                    break;
            }
        }
        this.c = new zzahs(i4, bArr, i2, i3);
    }
}
