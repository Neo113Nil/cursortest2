package defpackage;

import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class x95 extends k95 {
    public f4a J;
    public ewd K;
    public boolean L;
    public ct8 M;
    public ct8 N;

    @Override // defpackage.k95
    public final boolean C1() {
        return this.L;
    }

    @Override // defpackage.k95
    public final Object o1(j95 j95Var, j95 j95Var2) {
        f4a f4aVar = this.J;
        m1d m1dVar = m1d.a;
        rh4 rh4Var = new rh4(j95Var, this, (rq3) null, 4);
        f4aVar.getClass();
        Object a = ((dx) f4aVar.c).a(m1d.b, new bx(f4aVar, rh4Var, (rq3) null), j95Var2);
        if (a != lu3.a) {
            a = Unit.a;
        }
        return a == lu3.a ? a : Unit.a;
    }

    @Override // defpackage.k95
    public final void t1(long j) {
        if (!this.n || Intrinsics.c(this.M, w95.a)) {
            return;
        }
        xw3.L(Y0(), null, nu3.d, new a74(this, j, (rq3) null, 1), 1);
    }

    @Override // defpackage.k95
    public final void u1(s85 s85Var) {
        if (!this.n || Intrinsics.c(this.N, w95.b)) {
            return;
        }
        xw3.L(Y0(), null, nu3.d, new rh4(this, s85Var, (rq3) null, 5), 1);
    }
}
