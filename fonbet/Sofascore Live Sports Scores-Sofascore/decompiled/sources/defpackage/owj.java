package defpackage;

import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class owj implements cdi {
    public final vwj a;
    public Function1 b;
    public Function1 c;
    public final /* synthetic */ pwj d;

    public owj(pwj pwjVar, vwj vwjVar, Function1 function1, Function1 function12) {
        this.d = pwjVar;
        this.a = vwjVar;
        this.b = function1;
        this.c = function12;
    }

    public final void c(twj twjVar) {
        Object invoke = this.c.invoke(twjVar.a());
        boolean i = this.d.c.i();
        vwj vwjVar = this.a;
        if (i) {
            vwjVar.g(this.c.invoke(twjVar.b()), invoke, (j38) this.b.invoke(twjVar));
        } else {
            vwjVar.h(invoke, (j38) this.b.invoke(twjVar));
        }
    }

    @Override // defpackage.cdi
    public final Object getValue() {
        c(this.d.c.f());
        return ((eoh) this.a.j).getValue();
    }
}
