package defpackage;

import com.google.android.gms.internal.ads.zzagi;
import com.google.android.gms.internal.ads.zzeu;
import com.google.android.gms.internal.ads.zzfj;
import com.google.android.gms.internal.ads.zzfm;
import com.inmobi.media.core.config.models.AdConfig;
import com.mbridge.msdk.playercommon.exoplayer2.C;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class djn {
    public final zzfj a;
    public final zzeu b;
    public boolean c;
    public boolean d;
    public boolean e;
    public long f;
    public long g;
    public long h;

    public djn(int i) {
        switch (i) {
            case 1:
                this.a = new zzfj();
                this.f = C.TIME_UNSET;
                this.g = C.TIME_UNSET;
                this.h = C.TIME_UNSET;
                this.b = new zzeu();
                break;
            default:
                this.a = new zzfj();
                this.f = C.TIME_UNSET;
                this.g = C.TIME_UNSET;
                this.h = C.TIME_UNSET;
                this.b = new zzeu();
                break;
        }
    }

    public static long a(zzeu zzeuVar) {
        int i = zzeuVar.b;
        if (zzeuVar.B() < 9) {
            return C.TIME_UNSET;
        }
        byte[] bArr = new byte[9];
        zzeuVar.F(0, 9, bArr);
        zzeuVar.D(i);
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
        long j3 = (248 & j2) >> 3;
        long j4 = (j2 & 3) << 13;
        return j4 | ((bArr[1] & 255) << 20) | ((j & 3) << 28) | (((j & 56) >> 3) << 30) | (j3 << 15) | ((bArr[3] & 255) << 5) | ((b3 & 248) >> 3);
    }

    public static final int c(int i, byte[] bArr) {
        return (bArr[i + 3] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) | ((bArr[i] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) << 24) | ((bArr[i + 1] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) << 16) | ((bArr[i + 2] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) << 8);
    }

    public void b(zzagi zzagiVar) {
        byte[] bArr = zzfm.b;
        int length = bArr.length;
        this.b.z(0, bArr);
        this.c = true;
        zzagiVar.zzl();
    }
}
