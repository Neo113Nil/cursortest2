package defpackage;

import com.mbridge.msdk.playercommon.exoplayer2.extractor.ogg.OggPageHeader;
import java.util.Arrays;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public final class snd implements kl6 {
    public ol6 a;
    public qgi b;
    public boolean c;

    public final boolean a(ml6 ml6Var) {
        boolean z;
        wnd wndVar = new wnd(0);
        if (wndVar.a(ml6Var, true) && (wndVar.a & 2) == 2) {
            int min = Math.min(wndVar.e, 8);
            nkk nkkVar = new nkk(min);
            ml6Var.peekFully(nkkVar.a, 0, min);
            nkkVar.E(0);
            if (nkkVar.c() >= 5 && nkkVar.s() == 127 && nkkVar.t() == 1179402563) {
                this.b = new d78(0);
                return true;
            }
            nkkVar.E(0);
            try {
                z = xxk.c(1, nkkVar, true);
            } catch (r9e unused) {
                z = false;
            }
            if (z) {
                this.b = new uxk(0);
            } else {
                nkkVar.E(0);
                if (yvd.k(nkkVar, yvd.p)) {
                    this.b = new yvd(0);
                }
            }
            return true;
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:60:0x017e A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:61:0x017f  */
    @Override // defpackage.kl6
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int b(ml6 ml6Var, b78 b78Var) {
        int i;
        byte[] bArr;
        qx9.u(this.a);
        if (this.b == null) {
            if (!a(ml6Var)) {
                throw r9e.a("Failed to determine bitstream type", null);
            }
            ((ap4) ml6Var).f = 0;
        }
        if (!this.c) {
            usj track = this.a.track(0, 1);
            this.a.endTracks();
            qgi qgiVar = this.b;
            qgiVar.l = this.a;
            qgiVar.k = track;
            qgiVar.f(true);
            this.c = true;
        }
        qgi qgiVar2 = this.b;
        vnd vndVar = (vnd) qgiVar2.j;
        nkk nkkVar = (nkk) vndVar.f;
        qx9.u((usj) qgiVar2.k);
        int i2 = lik.a;
        int i3 = qgiVar2.e;
        if (i3 != 0) {
            if (i3 == 1) {
                ((ap4) ml6Var).skipFully((int) qgiVar2.c);
                qgiVar2.e = 2;
                return 0;
            }
            if (i3 != 2) {
                if (i3 == 3) {
                    return -1;
                }
                zzl.s();
                return 0;
            }
            long g = ((xnd) qgiVar2.m).g(ml6Var);
            if (g >= 0) {
                b78Var.a = g;
                return 1;
            }
            if (g < -1) {
                qgiVar2.a(-(g + 2));
            }
            if (!qgiVar2.h) {
                a0h createSeekMap = ((xnd) qgiVar2.m).createSeekMap();
                qx9.u(createSeekMap);
                ((ol6) qgiVar2.l).d(createSeekMap);
                qgiVar2.h = true;
            }
            if (qgiVar2.g <= 0 && !vndVar.b(ml6Var)) {
                qgiVar2.e = 3;
                return -1;
            }
            qgiVar2.g = 0L;
            long c = qgiVar2.c(nkkVar);
            if (c >= 0) {
                long j = qgiVar2.d;
                if (j + c >= qgiVar2.b) {
                    ((usj) qgiVar2.k).d(nkkVar.c, nkkVar);
                    ((usj) qgiVar2.k).c((j * 1000000) / qgiVar2.f, 1, nkkVar.c, 0, null);
                    qgiVar2.b = -1L;
                }
            }
            qgiVar2.d += c;
            return 0;
        }
        while (vndVar.b(ml6Var)) {
            long j2 = ((ap4) ml6Var).d;
            long j3 = qgiVar2.c;
            qgiVar2.g = j2 - j3;
            if (qgiVar2.e(nkkVar, j3, (y3g) qgiVar2.n)) {
                qgiVar2.c = ((ap4) ml6Var).d;
            } else {
                sm8 sm8Var = (sm8) ((y3g) qgiVar2.n).b;
                qgiVar2.f = sm8Var.z;
                if (!qgiVar2.i) {
                    ((usj) qgiVar2.k).a(sm8Var);
                    qgiVar2.i = true;
                }
                c78 c78Var = (c78) ((y3g) qgiVar2.n).c;
                if (c78Var != null) {
                    qgiVar2.m = c78Var;
                } else {
                    long j4 = ((ap4) ml6Var).c;
                    if (j4 != -1) {
                        wnd wndVar = (wnd) vndVar.e;
                        boolean z = (wndVar.a & 4) != 0;
                        long j5 = qgiVar2.c;
                        long j6 = wndVar.d + wndVar.e;
                        long j7 = wndVar.b;
                        i = 2;
                        qgiVar2.m = new lr4(qgiVar2, j5, j4, j6, j7, z);
                        qgiVar2.e = i;
                        bArr = nkkVar.a;
                        if (bArr.length != 65025) {
                            return 0;
                        }
                        nkkVar.C(Arrays.copyOf(bArr, Math.max(OggPageHeader.MAX_PAGE_PAYLOAD, nkkVar.c)), nkkVar.c);
                        return 0;
                    }
                    qgiVar2.m = new jpe(3);
                }
                i = 2;
                qgiVar2.e = i;
                bArr = nkkVar.a;
                if (bArr.length != 65025) {
                }
            }
        }
        qgiVar2.e = 3;
        return -1;
    }

    @Override // defpackage.kl6
    public final void c(ol6 ol6Var) {
        this.a = ol6Var;
    }

    @Override // defpackage.kl6
    public final boolean d(ml6 ml6Var) {
        try {
            return a(ml6Var);
        } catch (r9e unused) {
            return false;
        }
    }

    @Override // defpackage.kl6
    public final void seek(long j, long j2) {
        qgi qgiVar = this.b;
        if (qgiVar != null) {
            vnd vndVar = (vnd) qgiVar.j;
            wnd wndVar = (wnd) vndVar.e;
            wndVar.a = 0;
            wndVar.b = 0L;
            wndVar.c = 0;
            wndVar.d = 0;
            wndVar.e = 0;
            ((nkk) vndVar.f).B(0);
            vndVar.b = -1;
            vndVar.d = false;
            if (j == 0) {
                qgiVar.f(!qgiVar.h);
                return;
            }
            if (qgiVar.e != 0) {
                long j3 = (qgiVar.f * j2) / 1000000;
                qgiVar.b = j3;
                xnd xndVar = (xnd) qgiVar.m;
                int i = lik.a;
                xndVar.startSeek(j3);
                qgiVar.e = 2;
            }
        }
    }

    @Override // defpackage.kl6
    public final void release() {
    }
}
