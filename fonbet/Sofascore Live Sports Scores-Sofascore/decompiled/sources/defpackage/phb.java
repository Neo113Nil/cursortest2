package defpackage;

import android.content.Context;
import android.content.ContextWrapper;
import android.view.View;
import com.sofascore.results.R;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public abstract class phb {
    public static final ff5 a = new ff5(0, new ogb(11));

    public static vpd a(of3 of3Var) {
        av8 av8Var = (av8) of3Var;
        vpd vpdVar = (vpd) av8Var.k(a);
        Object obj = null;
        if (vpdVar == null) {
            av8Var.d0(1208426157);
            View view = (View) av8Var.k(nz.f);
            view.getClass();
            while (true) {
                if (view == null) {
                    vpdVar = null;
                    break;
                }
                Object tag = view.getTag(R.id.view_tree_on_back_pressed_dispatcher_owner);
                vpd vpdVar2 = tag instanceof vpd ? (vpd) tag : null;
                if (vpdVar2 != null) {
                    vpdVar = vpdVar2;
                    break;
                }
                Object r = mha.r(view);
                view = r instanceof View ? (View) r : null;
            }
        } else {
            av8Var.d0(1208423708);
        }
        av8Var.s(false);
        if (vpdVar != null) {
            av8Var.d0(1208423789);
            av8Var.s(false);
            return vpdVar;
        }
        av8Var.d0(1208428160);
        Context context = (Context) av8Var.k(nz.b);
        while (true) {
            if (!(context instanceof ContextWrapper)) {
                break;
            }
            if (context instanceof vpd) {
                obj = context;
                break;
            }
            context = ((ContextWrapper) context).getBaseContext();
        }
        vpd vpdVar3 = (vpd) obj;
        av8Var.s(false);
        return vpdVar3;
    }
}
