package defpackage;

import androidx.compose.foundation.lazy.layout.b;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class yoa extends b {
    public static final nl8 d = new nl8(29);
    public final lpa a = new lpa(this);
    public final b10 b = new b10((byte) 0, 10);
    public boolean c;

    public yoa(Function1 function1) {
        function1.invoke(this);
    }

    public static /* synthetic */ void m(yoa yoaVar, int i, x83 x83Var, a7d a7dVar, tc3 tc3Var, int i2) {
        if ((i2 & 2) != 0) {
            x83Var = null;
        }
        Function1 function1 = a7dVar;
        if ((i2 & 8) != 0) {
            function1 = rg2.j;
        }
        yoaVar.l(i, x83Var, function1, tc3Var);
    }

    @Override // androidx.compose.foundation.lazy.layout.b
    public final b10 h() {
        return this.b;
    }

    public final void j(String str, Function1 function1, String str2, tc3 tc3Var) {
        this.b.b(1, new woa(str != null ? new xoa(str, 0) : null, new o34(8, function1), new xoa(str2, 1), new tc3(-291643851, new fak(tc3Var, 1), true)));
        this.c = true;
    }

    public final void l(int i, Function1 function1, Function1 function12, tc3 tc3Var) {
        this.b.b(i, new woa(function1, d, function12, tc3Var));
    }
}
