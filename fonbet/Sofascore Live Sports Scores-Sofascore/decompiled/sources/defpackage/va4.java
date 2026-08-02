package defpackage;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class va4 implements mt9 {
    public final /* synthetic */ Function1 a;
    public final /* synthetic */ Function1 b;
    public final /* synthetic */ Function1 c;
    public final /* synthetic */ Function2 d;

    public va4(Function1 function1, Function1 function12, Function1 function13, Function2 function2) {
        this.a = function1;
        this.b = function12;
        this.c = function13;
        this.d = function2;
    }

    @Override // defpackage.mt9
    public final void a(ot9 ot9Var) {
        this.b.invoke(ot9Var);
    }

    @Override // defpackage.mt9
    public final void b(ot9 ot9Var) {
        this.a.invoke(ot9Var);
    }

    @Override // defpackage.mt9
    public final void c(gq5 gq5Var) {
        this.c.invoke(gq5Var);
    }

    @Override // defpackage.mt9
    public final void d(ot9 ot9Var, fmi fmiVar) {
        this.d.invoke(ot9Var, fmiVar);
    }
}
