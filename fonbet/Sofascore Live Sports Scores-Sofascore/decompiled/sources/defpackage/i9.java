package defpackage;

import com.inmobi.media.core.config.models.AdConfig;
import com.mbridge.msdk.playercommon.exoplayer2.C;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class i9 implements ll6 {
    public final g9 a = new g9(null, 0, "audio/ac4", 1);
    public final j9e b = new j9e(16384);
    public boolean c;

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0089, code lost:
    
        return false;
     */
    @Override // defpackage.ll6
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean a(nl6 nl6Var) {
        bp4 bp4Var;
        int i;
        j9e j9eVar = new j9e(10);
        int i2 = 0;
        while (true) {
            bp4Var = (bp4) nl6Var;
            bp4Var.peekFully(j9eVar.a, 0, 10, false);
            j9eVar.N(0);
            if (j9eVar.D() != 4801587) {
                break;
            }
            j9eVar.O(3);
            int z = j9eVar.z();
            i2 += z + 10;
            bp4Var.c(z, false);
        }
        bp4Var.f = 0;
        bp4Var.c(i2, false);
        int i3 = 0;
        int i4 = i2;
        while (true) {
            int i5 = 7;
            bp4Var.peekFully(j9eVar.a, 0, 7, false);
            j9eVar.N(0);
            int H = j9eVar.H();
            if (H == 44096 || H == 44097) {
                i3++;
                if (i3 >= 4) {
                    return true;
                }
                byte[] bArr = j9eVar.a;
                if (bArr.length < 7) {
                    i = -1;
                } else {
                    int i6 = ((bArr[2] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) << 8) | (bArr[3] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED);
                    if (i6 == 65535) {
                        i6 = ((bArr[4] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) << 16) | ((bArr[5] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) << 8) | (bArr[6] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED);
                    } else {
                        i5 = 4;
                    }
                    if (H == 44097) {
                        i5 += 2;
                    }
                    i = i6 + i5;
                }
                if (i == -1) {
                    break;
                }
                bp4Var.c(i - 7, false);
            } else {
                bp4Var.f = 0;
                i4++;
                if (i4 - i2 >= 8192) {
                    break;
                }
                bp4Var.c(i4, false);
                i3 = 0;
            }
        }
    }

    @Override // defpackage.ll6
    public final int b(nl6 nl6Var, b78 b78Var) {
        j9e j9eVar = this.b;
        int read = nl6Var.read(j9eVar.a, 0, 16384);
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
