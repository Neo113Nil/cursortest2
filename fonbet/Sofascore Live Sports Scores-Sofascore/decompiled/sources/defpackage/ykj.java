package defpackage;

import kotlin.Unit;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class ykj {
    public final q1d a;
    public final h1d b = new h1d(Boolean.FALSE);
    public lj2 c;

    public ykj(q1d q1dVar) {
        this.a = q1dVar;
    }

    public final void a() {
        this.b.R(Boolean.FALSE);
    }

    public final boolean b() {
        h1d h1dVar = this.b;
        return ((Boolean) ((eoh) h1dVar.c).getValue()).booleanValue() || ((Boolean) ((eoh) h1dVar.d).getValue()).booleanValue();
    }

    public final Object c(m1d m1dVar, hoi hoiVar) {
        rq3 rq3Var = null;
        yw ywVar = new yw(this, new r3(this, rq3Var, 25), m1dVar, rq3Var, 17);
        q1d q1dVar = this.a;
        q1dVar.getClass();
        Object r = s9a.r(new ts2(m1dVar, q1dVar, ywVar, rq3Var, 11), hoiVar);
        return r == lu3.a ? r : Unit.a;
    }
}
