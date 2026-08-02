package defpackage;

import androidx.compose.runtime.e;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class pwj {
    public final q4k a;
    public final e1d b = e.f(null);
    public final /* synthetic */ axj c;

    public pwj(axj axjVar, q4k q4kVar, String str) {
        this.c = axjVar;
        this.a = q4kVar;
    }

    public final owj a(Function1 function1, Function1 function12) {
        e1d e1dVar = this.b;
        owj owjVar = (owj) ((eoh) e1dVar).getValue();
        axj axjVar = this.c;
        if (owjVar == null) {
            Object invoke = function12.invoke(axjVar.a.w());
            Object invoke2 = function12.invoke(axjVar.a.w());
            q4k q4kVar = this.a;
            j80 j80Var = (j80) q4kVar.a.invoke(invoke2);
            j80Var.d();
            vwj vwjVar = new vwj(axjVar, invoke, j80Var, q4kVar);
            owjVar = new owj(this, vwjVar, function1, function12);
            ((eoh) e1dVar).setValue(owjVar);
            axjVar.i.add(vwjVar);
        }
        owjVar.c = function12;
        owjVar.b = function1;
        owjVar.c(axjVar.f());
        return owjVar;
    }
}
