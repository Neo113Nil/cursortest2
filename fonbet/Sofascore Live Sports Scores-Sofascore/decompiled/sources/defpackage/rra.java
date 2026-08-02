package defpackage;

import androidx.compose.foundation.lazy.layout.b;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class rra extends b implements esa {
    public final b10 a = new b10((byte) 0, 10);
    public tzc b;

    public rra(Function1 function1) {
        function1.invoke(this);
    }

    @Override // defpackage.esa
    public final void a(int i, Function1 function1, Function1 function12, tc3 tc3Var) {
        this.a.b(i, new qra(function1, function12, tc3Var));
    }

    @Override // defpackage.esa
    public final void c(Object obj, Object obj2, tc3 tc3Var) {
        tzc tzcVar = this.b;
        if (tzcVar == null) {
            tzcVar = new tzc();
            this.b = tzcVar;
        }
        b10 b10Var = this.a;
        tzcVar.a(b10Var.b);
        f(obj, obj2, new tc3(-1588696110, new yw6(b10Var.b, 1, tc3Var), true));
    }

    @Override // defpackage.esa
    public final void f(Object obj, Object obj2, ct8 ct8Var) {
        this.a.b(1, new qra(obj != null ? new xoa(obj, 1) : null, new xoa(obj2, 1), new tc3(-857469575, new jw5(ct8Var, 7), true)));
    }

    @Override // androidx.compose.foundation.lazy.layout.b
    public final b10 h() {
        return this.a;
    }
}
