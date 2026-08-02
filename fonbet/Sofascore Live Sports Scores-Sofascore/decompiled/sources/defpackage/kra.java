package defpackage;

import kotlin.Unit;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class kra implements ira {
    public final ay4 a;
    public final /* synthetic */ ksa b;
    public final /* synthetic */ boolean c;

    public kra(ksa ksaVar, boolean z) {
        this.b = ksaVar;
        this.c = z;
        this.a = goh.b(new ni4(ksaVar, 9));
    }

    @Override // defpackage.ira
    public final int a() {
        ksa ksaVar = this.b;
        return (-ksaVar.j().l) + ksaVar.j().p;
    }

    @Override // defpackage.ira
    public final float b() {
        ksa ksaVar = this.b;
        int h = ksaVar.h();
        int i = ksaVar.i();
        return ksaVar.d() ? (h * 500) + i + 100.0f : (h * 500) + i;
    }

    @Override // defpackage.ira
    public final f13 c() {
        boolean z = this.c;
        ay4 ay4Var = this.a;
        return z ? new f13(((Number) ay4Var.getValue()).intValue(), 1) : new f13(1, ((Number) ay4Var.getValue()).intValue());
    }

    @Override // defpackage.ira
    public final int d() {
        ksa ksaVar = this.b;
        return (int) (ksaVar.j().o == ewd.a ? ksaVar.j().e() & 4294967295L : ksaVar.j().e() >> 32);
    }

    @Override // defpackage.ira
    public final float e() {
        ksa ksaVar = this.b;
        return (ksaVar.h() * 500) + ksaVar.i();
    }

    @Override // defpackage.ira
    public final Object f(int i, qu1 qu1Var) {
        Object l = ksa.l(i, qu1Var, this.b);
        return l == lu3.a ? l : Unit.a;
    }
}
