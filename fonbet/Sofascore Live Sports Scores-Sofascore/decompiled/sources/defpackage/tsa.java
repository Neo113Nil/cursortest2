package defpackage;

import kotlin.Unit;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class tsa implements ira {
    public final /* synthetic */ qpa a;

    public tsa(qpa qpaVar) {
        this.a = qpaVar;
    }

    @Override // defpackage.ira
    public final int a() {
        qpa qpaVar = this.a;
        return (-qpaVar.h().n) + qpaVar.h().r;
    }

    @Override // defpackage.ira
    public final float b() {
        qpa qpaVar = this.a;
        int g = qpaVar.g();
        int h = qpaVar.d.c.h();
        return qpaVar.d() ? (g * 500) + h + 100.0f : (g * 500) + h;
    }

    @Override // defpackage.ira
    public final f13 c() {
        return new f13(-1, -1);
    }

    @Override // defpackage.ira
    public final int d() {
        qpa qpaVar = this.a;
        return (int) (qpaVar.h().q == ewd.a ? qpaVar.h().e() & 4294967295L : qpaVar.h().e() >> 32);
    }

    @Override // defpackage.ira
    public final float e() {
        qpa qpaVar = this.a;
        return (qpaVar.g() * 500) + qpaVar.d.c.h();
    }

    @Override // defpackage.ira
    public final Object f(int i, qu1 qu1Var) {
        y3g y3gVar = qpa.w;
        qpa qpaVar = this.a;
        qpaVar.getClass();
        Object a = qpaVar.a(m1d.a, new ppa(qpaVar, i, null, 0), qu1Var);
        lu3 lu3Var = lu3.a;
        if (a != lu3Var) {
            a = Unit.a;
        }
        return a == lu3Var ? a : Unit.a;
    }
}
