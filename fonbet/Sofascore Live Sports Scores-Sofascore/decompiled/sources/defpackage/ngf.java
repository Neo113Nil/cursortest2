package defpackage;

import com.inmobi.media.core.config.models.AdConfig;
import com.mbridge.msdk.playercommon.exoplayer2.C;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class ngf {
    public final /* synthetic */ int a;
    public final djj b;
    public final j9e c;
    public boolean d;
    public boolean e;
    public boolean f;
    public long g;
    public long h;
    public long i;

    public ngf(int i) {
        this.a = i;
        switch (i) {
            case 1:
                this.b = new djj(0L);
                this.g = C.TIME_UNSET;
                this.h = C.TIME_UNSET;
                this.i = C.TIME_UNSET;
                this.c = new j9e();
                break;
            default:
                this.b = new djj(0L);
                this.g = C.TIME_UNSET;
                this.h = C.TIME_UNSET;
                this.i = C.TIME_UNSET;
                this.c = new j9e();
                break;
        }
    }

    public static int b(int i, byte[] bArr) {
        return (bArr[i + 3] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) | ((bArr[i] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) << 24) | ((bArr[i + 1] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) << 16) | ((bArr[i + 2] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) << 8);
    }

    public static long c(j9e j9eVar) {
        int i = j9eVar.b;
        if (j9eVar.a() < 9) {
            return C.TIME_UNSET;
        }
        byte[] bArr = new byte[9];
        j9eVar.k(bArr, 0, 9);
        j9eVar.N(i);
        byte b = bArr[0];
        if ((b & 196) != 68) {
            return C.TIME_UNSET;
        }
        byte b2 = bArr[2];
        if ((b2 & 4) != 4) {
            return C.TIME_UNSET;
        }
        byte b3 = bArr[4];
        if ((b3 & 4) != 4 || (bArr[5] & 1) != 1 || (bArr[8] & 3) != 3) {
            return C.TIME_UNSET;
        }
        long j = b;
        long j2 = b2;
        return ((j2 & 3) << 13) | ((bArr[1] & 255) << 20) | ((j & 3) << 28) | (((56 & j) >> 3) << 30) | (((j2 & 248) >> 3) << 15) | ((bArr[3] & 255) << 5) | ((b3 & 248) >> 3);
    }

    public final void a(nl6 nl6Var) {
        int i = this.a;
        j9e j9eVar = this.c;
        switch (i) {
            case 0:
                byte[] bArr = nik.b;
                j9eVar.L(bArr, bArr.length);
                this.d = true;
                nl6Var.resetPeekPosition();
                break;
            default:
                byte[] bArr2 = nik.b;
                j9eVar.L(bArr2, bArr2.length);
                this.d = true;
                nl6Var.resetPeekPosition();
                break;
        }
    }
}
