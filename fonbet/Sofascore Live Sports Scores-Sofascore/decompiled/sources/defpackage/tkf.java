package defpackage;

import android.view.View;
import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class tkf implements PointerInputEventHandler {
    public final /* synthetic */ View a;
    public final /* synthetic */ float b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ int d;
    public final /* synthetic */ int e;
    public final /* synthetic */ dsf f;
    public final /* synthetic */ Function1 g;
    public final /* synthetic */ z69 h;
    public final /* synthetic */ e1d i;

    public tkf(View view, float f, boolean z, int i, int i2, dsf dsfVar, Function1 function1, z69 z69Var, e1d e1dVar) {
        this.a = view;
        this.b = f;
        this.c = z;
        this.d = i;
        this.e = i2;
        this.f = dsfVar;
        this.g = function1;
        this.h = z69Var;
        this.i = e1dVar;
    }

    @Override // androidx.compose.ui.input.pointer.PointerInputEventHandler
    public final Object invoke(qze qzeVar, rq3 rq3Var) {
        esf esfVar = new esf();
        esfVar.a = 0L;
        Object k1 = ((ooi) qzeVar).k1(new skf(esfVar, new fsf(), this.a, this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, null), rq3Var);
        return k1 == lu3.a ? k1 : Unit.a;
    }
}
