package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class dfh {
    public final boolean a;
    public final Function1 b;
    public j38 c;
    public final dx d;
    public j38 e;
    public j38 f;

    public dfh(boolean z, Function0 function0, Function0 function02, efh efhVar, Function1 function1) {
        this.a = z;
        this.b = function1;
        if (z && efhVar == efh.c) {
            a70.p("The initial value must not be set to PartiallyExpanded if skipPartiallyExpanded is set to true.");
            throw null;
        }
        this.c = bfh.a;
        this.d = new dx(efhVar, new ma0(19, function0), function02, new e6g(this, 20), function1);
        this.e = s02.d0();
        this.f = s02.d0();
    }

    public static Object a(dfh dfhVar, efh efhVar, j38 j38Var, hoi hoiVar) {
        Object c = dfhVar.d.c(efhVar, m1d.a, new cfh(dfhVar, ((xnh) dfhVar.d.g).h(), j38Var, null), hoiVar);
        return c == lu3.a ? c : Unit.a;
    }

    public final Object b(hoi hoiVar) {
        efh efhVar = efh.b;
        if (!((Boolean) this.b.invoke(efhVar)).booleanValue()) {
            return Unit.a;
        }
        Object a = a(this, efhVar, this.e, hoiVar);
        return a == lu3.a ? a : Unit.a;
    }

    public final Object c(hoi hoiVar) {
        efh efhVar = efh.a;
        if (!((Boolean) this.b.invoke(efhVar)).booleanValue()) {
            return Unit.a;
        }
        Object a = a(this, efhVar, this.f, hoiVar);
        return a == lu3.a ? a : Unit.a;
    }

    public final boolean d() {
        return ((eoh) ((e1d) this.d.c)).getValue() != efh.a;
    }

    public final Object e(hoi hoiVar) {
        if (this.a) {
            a70.r("Attempted to animate to partial expanded when skipPartiallyExpanded was enabled. Set skipPartiallyExpanded to false to use this function.");
            return null;
        }
        efh efhVar = efh.c;
        if (!((Boolean) this.b.invoke(efhVar)).booleanValue()) {
            return Unit.a;
        }
        Object a = a(this, efhVar, this.f, hoiVar);
        return a == lu3.a ? a : Unit.a;
    }

    public final Object f(hoi hoiVar) {
        ptb g = this.d.g();
        efh efhVar = efh.c;
        if (!g.a.containsKey(efhVar)) {
            efhVar = efh.b;
        }
        if (!((Boolean) this.b.invoke(efhVar)).booleanValue()) {
            return Unit.a;
        }
        Object a = a(this, efhVar, this.e, hoiVar);
        return a == lu3.a ? a : Unit.a;
    }
}
