package defpackage;

import com.inmobi.media.core.config.models.AdConfig;
import com.mbridge.msdk.playercommon.exoplayer2.C;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public final class h9 implements kl6 {
    public final f9 a = new f9(null, 1);
    public final nkk b = new nkk(16384);
    public boolean c;

    @Override // defpackage.kl6
    public final int b(ml6 ml6Var, b78 b78Var) {
        nkk nkkVar = this.b;
        int read = ((ap4) ml6Var).read(nkkVar.a, 0, 16384);
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

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0089, code lost:
    
        return false;
     */
    @Override // defpackage.kl6
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean d(ml6 ml6Var) {
        ap4 ap4Var;
        int i;
        nkk nkkVar = new nkk(10);
        int i2 = 0;
        while (true) {
            ap4Var = (ap4) ml6Var;
            ap4Var.peekFully(nkkVar.a, 0, 10, false);
            nkkVar.E(0);
            if (nkkVar.u() != 4801587) {
                break;
            }
            nkkVar.F(3);
            int r = nkkVar.r();
            i2 += r + 10;
            ap4Var.b(r, false);
        }
        ap4Var.f = 0;
        ap4Var.b(i2, false);
        int i3 = 0;
        int i4 = i2;
        while (true) {
            int i5 = 7;
            ap4Var.peekFully(nkkVar.a, 0, 7, false);
            nkkVar.E(0);
            int x = nkkVar.x();
            if (x == 44096 || x == 44097) {
                i3++;
                if (i3 >= 4) {
                    return true;
                }
                byte[] bArr = nkkVar.a;
                if (bArr.length < 7) {
                    i = -1;
                } else {
                    int i6 = ((bArr[2] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) << 8) | (bArr[3] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED);
                    if (i6 == 65535) {
                        i6 = ((bArr[4] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) << 16) | ((bArr[5] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) << 8) | (bArr[6] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED);
                    } else {
                        i5 = 4;
                    }
                    if (x == 44097) {
                        i5 += 2;
                    }
                    i = i6 + i5;
                }
                if (i == -1) {
                    break;
                }
                ap4Var.b(i - 7, false);
            } else {
                ap4Var.f = 0;
                i4++;
                if (i4 - i2 >= 8192) {
                    break;
                }
                ap4Var.b(i4, false);
                i3 = 0;
            }
        }
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
