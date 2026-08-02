package defpackage;

import com.inmobi.media.core.config.models.AdConfig;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class e9 implements ll6 {
    public final g9 a = new g9(MimeTypes.AUDIO_AC3);
    public final j9e b = new j9e(2786);
    public boolean c;

    @Override // defpackage.ll6
    public final boolean a(nl6 nl6Var) {
        bp4 bp4Var;
        int v;
        j9e j9eVar = new j9e(10);
        int i = 0;
        while (true) {
            bp4Var = (bp4) nl6Var;
            bp4Var.peekFully(j9eVar.a, 0, 10, false);
            j9eVar.N(0);
            if (j9eVar.D() != 4801587) {
                break;
            }
            j9eVar.O(3);
            int z = j9eVar.z();
            i += z + 10;
            bp4Var.c(z, false);
        }
        bp4Var.f = 0;
        bp4Var.c(i, false);
        int i2 = 0;
        int i3 = i;
        while (true) {
            bp4Var.peekFully(j9eVar.a, 0, 6, false);
            j9eVar.N(0);
            if (j9eVar.H() != 2935) {
                bp4Var.f = 0;
                i3++;
                if (i3 - i >= 8192) {
                    break;
                }
                bp4Var.c(i3, false);
                i2 = 0;
            } else {
                i2++;
                if (i2 >= 4) {
                    return true;
                }
                byte[] bArr = j9eVar.a;
                if (bArr.length < 6) {
                    v = -1;
                } else if (((bArr[5] & 248) >> 3) > 10) {
                    v = ((((bArr[2] & 7) << 8) | (bArr[3] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED)) + 1) * 2;
                } else {
                    byte b = bArr[4];
                    v = dy0.v((b & 192) >> 6, b & 63);
                }
                if (v == -1) {
                    break;
                }
                bp4Var.c(v - 6, false);
            }
        }
        return false;
    }

    @Override // defpackage.ll6
    public final int b(nl6 nl6Var, b78 b78Var) {
        j9e j9eVar = this.b;
        int read = nl6Var.read(j9eVar.a, 0, 2786);
        if (read == -1) {
            return -1;
        }
        j9eVar.N(0);
        j9eVar.M(read);
        boolean z = this.c;
        g9 g9Var = this.a;
        if (!z) {
            g9Var.o = 0L;
            this.c = true;
        }
        g9Var.b(j9eVar);
        return 0;
    }

    @Override // defpackage.ll6
    public final void e(pl6 pl6Var) {
        this.a.d(pl6Var, new c2k(0, 1, 1, (byte) 0));
        pl6Var.endTracks();
        pl6Var.m(new bw0(C.TIME_UNSET));
    }

    @Override // defpackage.ll6
    public final void seek(long j, long j2) {
        this.c = false;
        this.a.seek();
    }

    @Override // defpackage.ll6
    public final void release() {
    }
}
