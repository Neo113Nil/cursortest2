package defpackage;

import java.util.concurrent.Executor;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes7.dex */
public final class xn4 implements zg2 {
    public final Executor a;
    public final zg2 b;

    public xn4(Executor executor, zg2 zg2Var) {
        this.a = executor;
        this.b = zg2Var;
    }

    @Override // defpackage.zg2
    public final qzf H() {
        return this.b.H();
    }

    @Override // defpackage.zg2
    public final void M(ph2 ph2Var) {
        this.b.M(new z41(this, ph2Var, false, 25));
    }

    @Override // defpackage.zg2
    public final boolean Z() {
        return this.b.Z();
    }

    @Override // defpackage.zg2
    public final void cancel() {
        this.b.cancel();
    }

    @Override // defpackage.zg2
    public final zg2 clone() {
        return new xn4(this.a, this.b.clone());
    }
}
