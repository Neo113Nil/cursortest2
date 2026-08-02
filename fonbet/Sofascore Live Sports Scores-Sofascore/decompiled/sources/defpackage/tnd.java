package defpackage;

import androidx.media3.common.b;
import com.mbridge.msdk.playercommon.exoplayer2.extractor.ogg.OggPageHeader;
import java.util.Arrays;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public final class tnd implements ll6 {
    public pl6 a;
    public qgi b;
    public boolean c;

    @Override // defpackage.ll6
    public final boolean a(nl6 nl6Var) {
        try {
            return f(nl6Var);
        } catch (s9e unused) {
            return false;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:60:0x0190 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0191  */
    @Override // defpackage.ll6
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int b(nl6 nl6Var, b78 b78Var) {
        int i;
        byte[] bArr;
        this.a.getClass();
        if (this.b == null) {
            if (!f(nl6Var)) {
                throw s9e.a(null, "Failed to determine bitstream type");
            }
            nl6Var.resetPeekPosition();
        }
        if (!this.c) {
            vsj mo2track = this.a.mo2track(0, 1);
            this.a.endTracks();
            qgi qgiVar = this.b;
            qgiVar.l = this.a;
            qgiVar.k = mo2track;
            qgiVar.f(true);
            this.c = true;
        }
        qgi qgiVar2 = this.b;
        vnd vndVar = (vnd) qgiVar2.j;
        j9e j9eVar = (j9e) vndVar.f;
        ((vsj) qgiVar2.k).getClass();
        String str = nik.a;
        int i2 = qgiVar2.e;
        if (i2 != 0) {
            if (i2 == 1) {
                nl6Var.skipFully((int) qgiVar2.c);
                qgiVar2.e = 2;
                return 0;
            }
            if (i2 != 2) {
                if (i2 == 3) {
                    return -1;
                }
                zzl.s();
                return 0;
            }
            long a = ((ynd) qgiVar2.m).a(nl6Var);
            if (a >= 0) {
                b78Var.a = a;
                return 1;
            }
            if (a < -1) {
                qgiVar2.a(-(a + 2));
            }
            if (!qgiVar2.h) {
                b0h mo18createSeekMap = ((ynd) qgiVar2.m).mo18createSeekMap();
                mo18createSeekMap.getClass();
                ((pl6) qgiVar2.l).m(mo18createSeekMap);
                ((vsj) qgiVar2.k).f(mo18createSeekMap.getDurationUs());
                qgiVar2.h = true;
            }
            if (qgiVar2.g <= 0 && !vndVar.c(nl6Var)) {
                qgiVar2.e = 3;
                return -1;
            }
            qgiVar2.g = 0L;
            long b = qgiVar2.b(j9eVar);
            if (b >= 0) {
                long j = qgiVar2.d;
                if (j + b >= qgiVar2.b) {
                    ((vsj) qgiVar2.k).g(j9eVar.c, j9eVar);
                    ((vsj) qgiVar2.k).a((j * 1000000) / qgiVar2.f, 1, j9eVar.c, 0, null);
                    qgiVar2.b = -1L;
                }
            }
            qgiVar2.d += b;
            return 0;
        }
        while (vndVar.c(nl6Var)) {
            long position = nl6Var.getPosition();
            long j2 = qgiVar2.c;
            qgiVar2.g = position - j2;
            if (qgiVar2.d(j9eVar, j2, (y3g) qgiVar2.n)) {
                qgiVar2.c = nl6Var.getPosition();
            } else {
                b bVar = (b) ((y3g) qgiVar2.n).b;
                qgiVar2.f = bVar.H;
                if (!qgiVar2.i) {
                    ((vsj) qgiVar2.k).d(bVar);
                    qgiVar2.i = true;
                }
                c78 c78Var = (c78) ((y3g) qgiVar2.n).c;
                if (c78Var != null) {
                    qgiVar2.m = c78Var;
                } else {
                    if (nl6Var.getLength() != -1) {
                        wnd wndVar = (wnd) vndVar.e;
                        boolean z = (wndVar.a & 4) != 0;
                        long j3 = qgiVar2.c;
                        long length = nl6Var.getLength();
                        long j4 = wndVar.d + wndVar.e;
                        long j5 = wndVar.b;
                        i = 2;
                        qgiVar2.m = new lr4(qgiVar2, j3, length, j4, j5, z, (byte) 0);
                        qgiVar2.e = i;
                        bArr = j9eVar.a;
                        if (bArr.length != 65025) {
                            return 0;
                        }
                        j9eVar.L(Arrays.copyOf(bArr, Math.max(OggPageHeader.MAX_PAGE_PAYLOAD, j9eVar.c)), j9eVar.c);
                        return 0;
                    }
                    qgiVar2.m = new e2f(3);
                }
                i = 2;
                qgiVar2.e = i;
                bArr = j9eVar.a;
                if (bArr.length != 65025) {
                }
            }
        }
        qgiVar2.e = 3;
        return -1;
    }

    @Override // defpackage.ll6
    public final void e(pl6 pl6Var) {
        this.a = pl6Var;
    }

    public final boolean f(nl6 nl6Var) {
        boolean z;
        wnd wndVar = new wnd(1);
        if (wndVar.b(nl6Var, true) && (wndVar.a & 2) == 2) {
            int min = Math.min(wndVar.e, 8);
            j9e j9eVar = new j9e(min);
            nl6Var.peekFully(j9eVar.a, 0, min);
            j9eVar.N(0);
            if (j9eVar.a() >= 5 && j9eVar.A() == 127 && j9eVar.C() == 1179402563) {
                this.b = new e78(1);
                return true;
            }
            j9eVar.N(0);
            try {
                z = w1a.G(1, j9eVar, true);
            } catch (s9e unused) {
                z = false;
            }
            if (z) {
                this.b = new vxk(1);
            } else {
                j9eVar.N(0);
                if (zvd.k(j9eVar, zvd.p)) {
                    this.b = new zvd(1);
                }
            }
            return true;
        }
        return false;
    }

    @Override // defpackage.ll6
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
            ((j9e) vndVar.f).K(0);
            vndVar.b = -1;
            vndVar.d = false;
            if (j == 0) {
                qgiVar.f(!qgiVar.h);
                return;
            }
            if (qgiVar.e != 0) {
                long j3 = (qgiVar.f * j2) / 1000000;
                qgiVar.b = j3;
                ynd yndVar = (ynd) qgiVar.m;
                String str = nik.a;
                yndVar.startSeek(j3);
                qgiVar.e = 2;
            }
        }
    }

    @Override // defpackage.ll6
    public final void release() {
    }
}
