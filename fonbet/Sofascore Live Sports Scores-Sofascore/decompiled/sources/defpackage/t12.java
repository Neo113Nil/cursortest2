package defpackage;

import android.view.View;
import kotlin.Pair;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final /* synthetic */ class t12 implements View.OnClickListener {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ m22 b;
    public final /* synthetic */ x12 c;
    public final /* synthetic */ Function1 d;

    public /* synthetic */ t12(m22 m22Var, x12 x12Var, Function1 function1) {
        this.b = m22Var;
        this.c = x12Var;
        this.d = function1;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i = this.a;
        Function1 function1 = this.d;
        x12 x12Var = this.c;
        m22 m22Var = this.b;
        switch (i) {
            case 0:
                if (m22Var.d) {
                    function1.invoke(new Pair(m22Var, x12Var));
                    break;
                }
                break;
            default:
                if (m22Var.d && x12Var != null) {
                    function1.invoke(new Pair(m22Var, x12Var));
                    break;
                }
                break;
        }
    }

    public /* synthetic */ t12(m22 m22Var, Function1 function1, x12 x12Var) {
        this.b = m22Var;
        this.d = function1;
        this.c = x12Var;
    }
}
