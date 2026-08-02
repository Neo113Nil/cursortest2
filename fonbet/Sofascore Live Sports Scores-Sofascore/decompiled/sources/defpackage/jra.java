package defpackage;

import kotlin.Unit;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class jra implements ira {
    public final /* synthetic */ a6e a;
    public final /* synthetic */ boolean b;

    public jra(a6e a6eVar, boolean z) {
        this.a = a6eVar;
        this.b = z;
    }

    @Override // defpackage.ira
    public final int a() {
        a6e a6eVar = this.a;
        return (-a6eVar.m().f) + a6eVar.m().d;
    }

    @Override // defpackage.ira
    public final float b() {
        a6e a6eVar = this.a;
        return c6e.a(a6eVar.m(), a6eVar.n());
    }

    @Override // defpackage.ira
    public final f13 c() {
        boolean z = this.b;
        a6e a6eVar = this.a;
        return z ? new f13(a6eVar.n(), 1) : new f13(1, a6eVar.n());
    }

    @Override // defpackage.ira
    public final int d() {
        a6e a6eVar = this.a;
        return (int) (a6eVar.m().e == ewd.a ? a6eVar.m().e() & 4294967295L : a6eVar.m().e() >> 32);
    }

    @Override // defpackage.ira
    public final float e() {
        return t6a.u(this.a);
    }

    @Override // defpackage.ira
    public final Object f(int i, qu1 qu1Var) {
        Object t = a6e.t(this.a, i, qu1Var);
        return t == lu3.a ? t : Unit.a;
    }
}
