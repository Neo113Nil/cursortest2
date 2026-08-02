package defpackage;

import com.inmobi.media.core.config.models.AdConfig;
import com.mbridge.msdk.playercommon.exoplayer2.C;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public final class d9 implements kl6 {
    public final f9 a = new f9(null, 0);
    public final nkk b = new nkk(2786);
    public boolean c;

    @Override // defpackage.kl6
    public final int b(ml6 ml6Var, b78 b78Var) {
        nkk nkkVar = this.b;
        int read = ((ap4) ml6Var).read(nkkVar.a, 0, 2786);
        if (read == -1) {
            return -1;
        }
        nkkVar.E(0);
        nkkVar.D(read);
        boolean z = this.c;
        f9 f9Var = this.a;
        if (!z) {
            f9Var.g(4, 0L);
            this.c = true;
        }
        f9Var.f(nkkVar);
        return 0;
    }

    @Override // defpackage.kl6
    public final void c(ol6 ol6Var) {
        this.a.h(ol6Var, new c2k(0, 1, 0, (byte) 0));
        ol6Var.endTracks();
        ol6Var.d(new aw0(C.TIME_UNSET));
    }

    @Override // defpackage.kl6
    public final boolean d(ml6 ml6Var) {
        ap4 ap4Var;
        int x;
        nkk nkkVar = new nkk(10);
        int i = 0;
        while (true) {
            ap4Var = (ap4) ml6Var;
            ap4Var.peekFully(nkkVar.a, 0, 10, false);
            nkkVar.E(0);
            if (nkkVar.u() != 4801587) {
                break;
            }
            nkkVar.F(3);
            int r = nkkVar.r();
            i += r + 10;
            ap4Var.b(r, false);
        }
        ap4Var.f = 0;
        ap4Var.b(i, false);
        int i2 = 0;
        int i3 = i;
        while (true) {
            ap4Var.peekFully(nkkVar.a, 0, 6, false);
            nkkVar.E(0);
            if (nkkVar.x() != 2935) {
                ap4Var.f = 0;
                i3++;
                if (i3 - i >= 8192) {
                    break;
                }
                ap4Var.b(i3, false);
                i2 = 0;
            } else {
                i2++;
                if (i2 >= 4) {
                    return true;
                }
                byte[] bArr = nkkVar.a;
                if (bArr.length < 6) {
                    x = -1;
                } else if (((bArr[5] & 248) >> 3) > 10) {
                    x = ((((bArr[2] & 7) << 8) | (bArr[3] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED)) + 1) * 2;
                } else {
                    byte b = bArr[4];
                    x = un0.x((b & 192) >> 6, b & 63);
                }
                if (x == -1) {
                    break;
                }
                ap4Var.b(x - 6, false);
            }
        }
        return false;
    }

    @Override // defpackage.kl6
    public final void seek(long j, long j2) {
        this.c = false;
        this.a.seek();
    }

    @Override // defpackage.kl6
    public final void release() {
    }
}
