package defpackage;

import androidx.compose.runtime.e;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class ls4 implements jvg {
    public final Function1 a;
    public final ks4 b = new ks4(this);
    public final q1d c = new q1d();
    public final e1d d;
    public final e1d e;
    public final e1d f;

    public ls4(Function1 function1) {
        this.a = function1;
        Boolean bool = Boolean.FALSE;
        this.d = e.f(bool);
        this.e = e.f(bool);
        this.f = e.f(bool);
    }

    @Override // defpackage.jvg
    public final Object a(m1d m1dVar, Function2 function2, rq3 rq3Var) {
        Object r = s9a.r(new rh4(this, m1dVar, function2, (rq3) null, 2), rq3Var);
        return r == lu3.a ? r : Unit.a;
    }

    @Override // defpackage.jvg
    public final boolean b() {
        return ((Boolean) ((eoh) this.d).getValue()).booleanValue();
    }

    @Override // defpackage.jvg
    public final float e(float f) {
        return ((Number) this.a.invoke(Float.valueOf(f))).floatValue();
    }
}
