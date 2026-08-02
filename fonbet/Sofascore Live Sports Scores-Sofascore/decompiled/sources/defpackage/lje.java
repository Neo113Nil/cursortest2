package defpackage;

import android.content.Context;
import android.os.Build;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public abstract class lje {
    public static final ff5 a = new ff5(1, new t2e(16));
    public static final pr1 b = new pr1(11);

    public static final void a(d8j d8jVar, Context context, boolean z, CharSequence charSequence, pej pejVar, eje ejeVar, Function1 function1) {
        if (Build.VERSION.SDK_INT >= 28 && charSequence != null && pejVar != null && ejeVar != null && (ejeVar instanceof kje)) {
            ((kje) ejeVar).a(d8jVar, charSequence, pejVar.a, function1);
            g7a.p(d8jVar, context, z, charSequence, pejVar.a);
            return;
        }
        function1.invoke(d8jVar);
        if (charSequence == null || pejVar == null) {
            return;
        }
        g7a.p(d8jVar, context, z, charSequence, pejVar.a);
    }

    public static final eje b(eib eibVar, of3 of3Var) {
        u2h u2hVar = u2h.a;
        av8 av8Var = (av8) of3Var;
        av8Var.d0(430530635);
        if (Build.VERSION.SDK_INT < 28) {
            av8Var.s(false);
            return null;
        }
        Context context = (Context) av8Var.k(nz.b);
        CoroutineContext coroutineContext = (CoroutineContext) av8Var.k(a);
        boolean g = av8Var.g(coroutineContext) | av8Var.g(context) | av8Var.g(eibVar);
        Object O = av8Var.O();
        if (g || O == nf3.a) {
            b.getClass();
            O = new kje(coroutineContext, context, u2hVar, eibVar);
            av8Var.n0(O);
        }
        eje ejeVar = (eje) O;
        av8Var.s(false);
        return ejeVar;
    }
}
