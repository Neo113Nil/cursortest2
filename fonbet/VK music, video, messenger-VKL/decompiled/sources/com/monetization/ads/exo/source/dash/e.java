package com.monetization.ads.exo.source.dash;

import android.net.Uri;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import java.io.FileNotFoundException;
import java.io.IOException;
import yads.ah1;
import yads.c30;
import yads.ch1;
import yads.co1;
import yads.f30;
import yads.fh1;
import yads.gd2;
import yads.gh1;
import yads.in1;
import yads.ji1;
import yads.lc3;
import yads.mc3;
import yads.pc2;
import yads.q30;
import yads.r11;
import yads.rc2;
import yads.wg1;
import yads.zg1;

/* loaded from: classes14.dex */
public final class e implements zg1 {
    public final /* synthetic */ i b;

    public e(i iVar) {
        this.b = iVar;
    }

    @Override // yads.zg1
    public final void a(ch1 ch1Var, long j, long j2, boolean z) {
        rc2 rc2Var = (rc2) ch1Var;
        i iVar = this.b;
        iVar.getClass();
        long j3 = rc2Var.a;
        Uri uri = rc2Var.d.c;
        wg1 wg1Var = new wg1();
        iVar.n.getClass();
        co1 co1Var = iVar.q;
        co1Var.a(wg1Var, new in1(rc2Var.c, -1, null, 0, null, co1Var.a(C.TIME_UNSET), co1Var.a(C.TIME_UNSET)));
    }

    @Override // yads.zg1
    public final void a(ch1 ch1Var, long j, long j2) {
        rc2 rc2Var = (rc2) ch1Var;
        i iVar = this.b;
        iVar.getClass();
        long j3 = rc2Var.a;
        Uri uri = rc2Var.d.c;
        wg1 wg1Var = new wg1();
        iVar.n.getClass();
        co1 co1Var = iVar.q;
        co1Var.b(wg1Var, new in1(rc2Var.c, -1, null, 0, null, co1Var.a(C.TIME_UNSET), co1Var.a(C.TIME_UNSET)));
        c30 c30Var = (c30) rc2Var.f;
        c30 c30Var2 = iVar.H;
        int size = c30Var2 == null ? 0 : c30Var2.m.size();
        long j4 = ((gd2) c30Var.m.get(0)).b;
        int i = 0;
        while (i < size && ((gd2) iVar.H.m.get(i)).b < j4) {
            i++;
        }
        if (c30Var.d) {
            if (size - i > c30Var.m.size()) {
                ji1.d("DashMediaSource", "Loaded out of sync manifest");
            } else {
                long j5 = iVar.N;
                if (j5 != C.TIME_UNSET && c30Var.h * 1000 <= j5) {
                    ji1.d("DashMediaSource", "Loaded stale dynamic manifest: " + c30Var.h + ", " + iVar.N);
                } else {
                    iVar.M = 0;
                }
            }
            int i2 = iVar.M;
            iVar.M = i2 + 1;
            if (i2 < iVar.n.a(rc2Var.c)) {
                iVar.D.postDelayed(iVar.v, Math.min((iVar.M - 1) * 1000, 5000));
                return;
            } else {
                iVar.C = new f30();
                return;
            }
        }
        iVar.H = c30Var;
        iVar.I = c30Var.d & iVar.I;
        iVar.J = j - j2;
        iVar.K = j;
        synchronized (iVar.t) {
            try {
                if (rc2Var.b.a == iVar.F) {
                    Uri uri2 = iVar.H.k;
                    if (uri2 == null) {
                        uri2 = rc2Var.d.c;
                    }
                    iVar.F = uri2;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (size == 0) {
            c30 c30Var3 = iVar.H;
            if (c30Var3.d) {
                lc3 lc3Var = c30Var3.i;
                if (lc3Var != null) {
                    String str = lc3Var.a;
                    if (!mc3.a(str, "urn:mpeg:dash:utc:direct:2014") && !mc3.a(str, "urn:mpeg:dash:utc:direct:2012")) {
                        if (!mc3.a(str, "urn:mpeg:dash:utc:http-iso:2014") && !mc3.a(str, "urn:mpeg:dash:utc:http-iso:2012")) {
                            if (!mc3.a(str, "urn:mpeg:dash:utc:http-xsdate:2014") && !mc3.a(str, "urn:mpeg:dash:utc:http-xsdate:2012")) {
                                if (!mc3.a(str, "urn:mpeg:dash:utc:ntp:2014") && !mc3.a(str, "urn:mpeg:dash:utc:ntp:2012")) {
                                    iVar.a(new IOException("Unsupported UTC timing scheme"));
                                    return;
                                } else {
                                    iVar.g();
                                    return;
                                }
                            }
                            rc2 rc2Var2 = new rc2(iVar.z, Uri.parse(lc3Var.b), 5, new h());
                            iVar.A.a(rc2Var2, new g(iVar), 1);
                            co1 co1Var2 = iVar.q;
                            Uri uri3 = rc2Var2.b.a;
                            co1Var2.c(new wg1(), new in1(rc2Var2.c, -1, null, 0, null, co1Var2.a(C.TIME_UNSET), co1Var2.a(C.TIME_UNSET)));
                            return;
                        }
                        rc2 rc2Var3 = new rc2(iVar.z, Uri.parse(lc3Var.b), 5, new d());
                        iVar.A.a(rc2Var3, new g(iVar), 1);
                        co1 co1Var3 = iVar.q;
                        Uri uri4 = rc2Var3.b.a;
                        co1Var3.c(new wg1(), new in1(rc2Var3.c, -1, null, 0, null, co1Var3.a(C.TIME_UNSET), co1Var3.a(C.TIME_UNSET)));
                        return;
                    }
                    try {
                        iVar.L = mc3.f(lc3Var.b) - iVar.K;
                        iVar.a(true);
                        return;
                    } catch (pc2 e) {
                        iVar.a(e);
                        return;
                    }
                }
                iVar.g();
                return;
            }
            iVar.a(true);
            return;
        }
        iVar.O += i;
        iVar.a(true);
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0060  */
    @Override // yads.zg1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final ah1 a(ch1 ch1Var, long j, long j2, IOException iOException, int i) {
        long j3;
        ah1 ah1Var;
        int i2;
        rc2 rc2Var = (rc2) ch1Var;
        i iVar = this.b;
        iVar.getClass();
        long j4 = rc2Var.a;
        Uri uri = rc2Var.d.c;
        wg1 wg1Var = new wg1();
        iVar.n.getClass();
        boolean z = true;
        if (!(iOException instanceof pc2) && !(iOException instanceof FileNotFoundException) && !(iOException instanceof r11) && !(iOException instanceof fh1)) {
            int i3 = q30.c;
            for (Throwable th = iOException; th != null; th = th.getCause()) {
                if (!(th instanceof q30) || ((q30) th).b != 2008) {
                }
            }
            j3 = Math.min((i - 1) * 1000, 5000);
            if (j3 != C.TIME_UNSET) {
                ah1Var = gh1.e;
            } else {
                ah1Var = new ah1(0, j3);
            }
            i2 = ah1Var.a;
            if (i2 != 0 && i2 != 1) {
                z = false;
            }
            co1 co1Var = iVar.q;
            co1Var.a(wg1Var, new in1(rc2Var.c, -1, null, 0, null, co1Var.a(C.TIME_UNSET), co1Var.a(C.TIME_UNSET)), iOException, !z);
            if (!z) {
                iVar.n.getClass();
            }
            return ah1Var;
        }
        j3 = -9223372036854775807L;
        if (j3 != C.TIME_UNSET) {
        }
        i2 = ah1Var.a;
        if (i2 != 0) {
            z = false;
        }
        co1 co1Var2 = iVar.q;
        co1Var2.a(wg1Var, new in1(rc2Var.c, -1, null, 0, null, co1Var2.a(C.TIME_UNSET), co1Var2.a(C.TIME_UNSET)), iOException, !z);
        if (!z) {
        }
        return ah1Var;
    }
}
