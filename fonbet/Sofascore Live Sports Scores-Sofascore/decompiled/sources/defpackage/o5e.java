package defpackage;

import androidx.compose.foundation.lazy.layout.b;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class o5e extends b {
    public final et8 a;
    public final Function1 b;
    public final b10 c;

    public o5e(et8 et8Var, Function1 function1, int i) {
        this.a = et8Var;
        this.b = function1;
        b10 b10Var = new b10((byte) 0, 10);
        b10Var.b(i, new k5e(function1, et8Var));
        this.c = b10Var;
    }

    @Override // androidx.compose.foundation.lazy.layout.b
    public final b10 h() {
        return this.c;
    }
}
