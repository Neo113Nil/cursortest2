package defpackage;

import com.mbridge.msdk.playercommon.exoplayer2.C;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class l99 implements ll6 {
    public pl6 b;
    public nl6 c;
    public am0 d;
    public gxc e;
    public int g;
    public long h;
    public int i;
    public final j9e a = new j9e(16);
    public long j = -1;
    public int f = 0;

    @Override // defpackage.ll6
    public final boolean a(nl6 nl6Var) {
        return wkn.O((bp4) nl6Var, true);
    }

    @Override // defpackage.ll6
    public final int b(nl6 nl6Var, b78 b78Var) {
        while (true) {
            int i = this.f;
            if (i == 0) {
                int i2 = this.i;
                j9e j9eVar = this.a;
                if (i2 == 0) {
                    if (!nl6Var.readFully(j9eVar.a, 0, 8, true)) {
                        pl6 pl6Var = this.b;
                        pl6Var.getClass();
                        pl6Var.endTracks();
                        this.b.m(new bw0(C.TIME_UNSET));
                        this.f = 4;
                        return -1;
                    }
                    this.i = 8;
                    j9eVar.N(0);
                    this.h = j9eVar.C();
                    this.g = j9eVar.m();
                }
                if (this.h == 1) {
                    nl6Var.readFully(j9eVar.a, 8, 8);
                    this.i += 8;
                    this.h = j9eVar.G();
                }
                if (this.g == 1836086884) {
                    long position = nl6Var.getPosition();
                    this.j = position;
                    long j = this.i;
                    yvc yvcVar = new yvc(0L, position - j, C.TIME_UNSET, position, this.h - j);
                    pl6 pl6Var2 = this.b;
                    pl6Var2.getClass();
                    vsj mo2track = pl6Var2.mo2track(1024, 4);
                    qm8 qm8Var = new qm8();
                    qm8Var.m = sjc.p("image/heic");
                    qm8Var.k = new ric(yvcVar);
                    w1l.r(qm8Var, mo2track);
                    this.f = 2;
                } else {
                    this.f = 1;
                }
            } else if (i == 1) {
                nl6Var.skipFully((int) (this.h - this.i));
                this.i = 0;
                this.f = 0;
            } else {
                if (i != 2) {
                    if (i != 3) {
                        if (i == 4) {
                            return -1;
                        }
                        zzl.s();
                        return 0;
                    }
                    if (this.d == null || nl6Var != this.c) {
                        this.c = nl6Var;
                        this.d = new am0(nl6Var, this.j);
                    }
                    gxc gxcVar = this.e;
                    gxcVar.getClass();
                    int b = gxcVar.b(this.d, b78Var);
                    if (b == 1) {
                        b78Var.a += this.j;
                    }
                    return b;
                }
                if (this.e == null) {
                    this.e = new gxc(xli.A7, 8);
                }
                am0 am0Var = new am0(nl6Var, this.j);
                this.d = am0Var;
                if (this.e.a(am0Var)) {
                    gxc gxcVar2 = this.e;
                    long j2 = this.j;
                    pl6 pl6Var3 = this.b;
                    pl6Var3.getClass();
                    gxcVar2.e(new am0(j2, pl6Var3, 9));
                    this.f = 3;
                } else {
                    pl6 pl6Var4 = this.b;
                    pl6Var4.getClass();
                    pl6Var4.endTracks();
                    this.b.m(new bw0(C.TIME_UNSET));
                    this.f = 4;
                }
            }
        }
    }

    @Override // defpackage.ll6
    public final void e(pl6 pl6Var) {
        this.b = pl6Var;
    }

    @Override // defpackage.ll6
    public final void release() {
        gxc gxcVar = this.e;
        if (gxcVar != null) {
            gxcVar.getClass();
            this.e = null;
        }
    }

    @Override // defpackage.ll6
    public final void seek(long j, long j2) {
        if (j != 0) {
            if (this.f == 3) {
                gxc gxcVar = this.e;
                gxcVar.getClass();
                gxcVar.seek(j, j2);
                return;
            }
            return;
        }
        this.f = 0;
        this.i = 0;
        this.j = -1L;
        if (this.e != null) {
            this.e = null;
        }
    }
}
