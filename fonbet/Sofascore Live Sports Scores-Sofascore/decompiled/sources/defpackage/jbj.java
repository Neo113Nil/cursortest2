package defpackage;

import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import kotlin.Unit;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class jbj implements PointerInputEventHandler {
    public final /* synthetic */ ku3 a;
    public final /* synthetic */ e1d b;
    public final /* synthetic */ wzc c;
    public final /* synthetic */ e1d d;

    public jbj(ku3 ku3Var, e1d e1dVar, wzc wzcVar, e1d e1dVar2) {
        this.a = ku3Var;
        this.b = e1dVar;
        this.c = wzcVar;
        this.d = e1dVar2;
    }

    @Override // androidx.compose.ui.input.pointer.PointerInputEventHandler
    public final Object invoke(qze qzeVar, rq3 rq3Var) {
        ibj ibjVar = new ibj(this.a, this.b, this.c, null);
        eqh eqhVar = new eqh(7, this.d);
        xf2 xf2Var = rti.a;
        Object r = s9a.r(new h10(qzeVar, ibjVar, eqhVar, new j6f(qzeVar), (rq3) null), rq3Var);
        lu3 lu3Var = lu3.a;
        if (r != lu3Var) {
            r = Unit.a;
        }
        return r == lu3Var ? r : Unit.a;
    }
}
