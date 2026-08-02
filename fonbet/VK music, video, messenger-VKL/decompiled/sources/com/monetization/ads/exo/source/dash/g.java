package com.monetization.ads.exo.source.dash;

import android.net.Uri;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import java.io.IOException;
import yads.ah1;
import yads.ch1;
import yads.co1;
import yads.gh1;
import yads.in1;
import yads.rc2;
import yads.wg1;
import yads.zg1;

/* loaded from: classes14.dex */
public final class g implements zg1 {
    public final /* synthetic */ i b;

    public g(i iVar) {
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
        iVar.L = ((Long) rc2Var.f).longValue() - j;
        iVar.a(true);
    }

    @Override // yads.zg1
    public final ah1 a(ch1 ch1Var, long j, long j2, IOException iOException, int i) {
        rc2 rc2Var = (rc2) ch1Var;
        i iVar = this.b;
        co1 co1Var = iVar.q;
        long j3 = rc2Var.a;
        Uri uri = rc2Var.d.c;
        co1Var.a(new wg1(), new in1(rc2Var.c, -1, null, 0, null, co1Var.a(C.TIME_UNSET), co1Var.a(C.TIME_UNSET)), iOException, true);
        iVar.n.getClass();
        iVar.a(iOException);
        return gh1.d;
    }
}
