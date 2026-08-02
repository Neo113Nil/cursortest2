package defpackage;

import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class m55 implements swf {
    public final Function1 a;
    public n55 b;

    public m55(Function1 function1) {
        this.a = function1;
    }

    @Override // defpackage.swf
    public final void a() {
        this.b = (n55) this.a.invoke(hz8.f);
    }

    @Override // defpackage.swf
    public final void d() {
        n55 n55Var = this.b;
        if (n55Var != null) {
            n55Var.d();
        }
        this.b = null;
    }

    @Override // defpackage.swf
    public final void b() {
    }
}
