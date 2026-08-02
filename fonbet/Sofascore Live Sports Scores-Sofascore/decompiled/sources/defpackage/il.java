package defpackage;

import com.ironsource.mediationsdk.metadata.a;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class il implements ll6 {
    public final j9e c;
    public final nm2 d;
    public pl6 e;
    public long f;
    public boolean h;
    public boolean i;
    public final kl a = new kl(0, null, MimeTypes.AUDIO_AAC, true);
    public final j9e b = new j9e(a.o);
    public long g = -1;

    public il(int i) {
        j9e j9eVar = new j9e(10);
        this.c = j9eVar;
        byte[] bArr = j9eVar.a;
        this.d = new nm2(bArr, bArr.length, 3, (byte) 0);
    }

    @Override // defpackage.ll6
    public final boolean a(nl6 nl6Var) {
        j9e j9eVar;
        int i = 0;
        while (true) {
            j9eVar = this.c;
            nl6Var.peekFully(j9eVar.a, 0, 10);
            j9eVar.N(0);
            if (j9eVar.D() != 4801587) {
                break;
            }
            j9eVar.O(3);
            int z = j9eVar.z();
            i += z + 10;
            nl6Var.advancePeekPosition(z);
        }
        nl6Var.resetPeekPosition();
        nl6Var.advancePeekPosition(i);
        if (this.g == -1) {
            this.g = i;
        }
        int i2 = 0;
        int i3 = 0;
        int i4 = i;
        do {
            bp4 bp4Var = (bp4) nl6Var;
            bp4Var.peekFully(j9eVar.a, 0, 2, false);
            j9eVar.N(0);
            if ((j9eVar.H() & 65526) == 65520) {
                i2++;
                if (i2 >= 4 && i3 > 188) {
                    return true;
                }
                bp4Var.peekFully(j9eVar.a, 0, 4, false);
                nm2 nm2Var = this.d;
                nm2Var.q(14);
                int i5 = nm2Var.i(13);
                if (i5 <= 6) {
                    i4++;
                    bp4Var.f = 0;
                    bp4Var.c(i4, false);
                } else {
                    bp4Var.c(i5 - 6, false);
                    i3 += i5;
                }
            } else {
                i4++;
                bp4Var.f = 0;
                bp4Var.c(i4, false);
            }
            i2 = 0;
            i3 = 0;
        } while (i4 - i < 8192);
        return false;
    }

    @Override // defpackage.ll6
    public final int b(nl6 nl6Var, b78 b78Var) {
        this.e.getClass();
        nl6Var.getLength();
        j9e j9eVar = this.b;
        int read = nl6Var.read(j9eVar.a, 0, a.o);
        boolean z = read == -1;
        if (!this.i) {
            this.e.m(new bw0(C.TIME_UNSET));
            this.i = true;
        }
        if (z) {
            return -1;
        }
        j9eVar.N(0);
        j9eVar.M(read);
        boolean z2 = this.h;
        kl klVar = this.a;
        if (!z2) {
            klVar.u = this.f;
            this.h = true;
        }
        klVar.b(j9eVar);
        return 0;
    }

    @Override // defpackage.ll6
    public final void e(pl6 pl6Var) {
        this.e = pl6Var;
        this.a.d(pl6Var, new c2k(0, 1, 1, (byte) 0));
        pl6Var.endTracks();
    }

    @Override // defpackage.ll6
    public final void seek(long j, long j2) {
        this.h = false;
        this.a.seek();
        this.f = j2;
    }

    @Override // defpackage.ll6
    public final void release() {
    }
}
