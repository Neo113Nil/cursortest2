package defpackage;

import android.view.View;
import android.view.ViewGroup;
import android.widget.PopupWindow;
import java.util.WeakHashMap;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class mb0 extends wuk {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ mb0(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // defpackage.wuk, defpackage.vuk
    public void b() {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                ((lb0) obj).b.u.setVisibility(0);
                break;
            case 1:
                ub0 ub0Var = (ub0) obj;
                ub0Var.u.setVisibility(0);
                if (ub0Var.u.getParent() instanceof View) {
                    View view = (View) ub0Var.u.getParent();
                    WeakHashMap weakHashMap = bsk.a;
                    view.requestApplyInsets();
                    break;
                }
                break;
        }
    }

    @Override // defpackage.vuk
    public final void c() {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                ub0 ub0Var = ((lb0) obj).b;
                ub0Var.u.setAlpha(1.0f);
                ub0Var.x.d(null);
                ub0Var.x = null;
                break;
            case 1:
                ub0 ub0Var2 = (ub0) obj;
                ub0Var2.u.setAlpha(1.0f);
                ub0Var2.x.d(null);
                ub0Var2.x = null;
                break;
            default:
                ub0 ub0Var3 = (ub0) ((f4a) obj).c;
                ub0Var3.u.setVisibility(8);
                PopupWindow popupWindow = ub0Var3.v;
                if (popupWindow != null) {
                    popupWindow.dismiss();
                } else if (ub0Var3.u.getParent() instanceof View) {
                    View view = (View) ub0Var3.u.getParent();
                    WeakHashMap weakHashMap = bsk.a;
                    view.requestApplyInsets();
                }
                ub0Var3.u.e();
                ub0Var3.x.d(null);
                ub0Var3.x = null;
                ViewGroup viewGroup = ub0Var3.A;
                WeakHashMap weakHashMap2 = bsk.a;
                viewGroup.requestApplyInsets();
                break;
        }
    }
}
