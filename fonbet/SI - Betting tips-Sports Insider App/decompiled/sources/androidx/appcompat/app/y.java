package androidx.appcompat.app;

import android.view.View;
import android.view.ViewGroup;
import android.widget.PopupWindow;
import androidx.core.view.z0;
import java.util.WeakHashMap;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class y extends y4.a {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f378b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f379c;

    public /* synthetic */ y(int i5, Object obj) {
        this.f378b = i5;
        this.f379c = obj;
    }

    @Override // y4.a, androidx.core.view.h1
    public void a() {
        int i5 = this.f378b;
        Object obj = this.f379c;
        switch (i5) {
            case 0:
                ((w) obj).f368b.f324v.setVisibility(0);
                break;
            case 1:
                l0 l0Var = (l0) obj;
                l0Var.f324v.setVisibility(0);
                if (l0Var.f324v.getParent() instanceof View) {
                    View view = (View) l0Var.f324v.getParent();
                    WeakHashMap weakHashMap = z0.f1413a;
                    androidx.core.view.o0.c(view);
                    break;
                }
                break;
        }
    }

    @Override // androidx.core.view.h1
    public final void onAnimationEnd() {
        int i5 = this.f378b;
        Object obj = this.f379c;
        switch (i5) {
            case 0:
                l0 l0Var = ((w) obj).f368b;
                l0Var.f324v.setAlpha(1.0f);
                l0Var.f329y.d(null);
                l0Var.f329y = null;
                break;
            case 1:
                l0 l0Var2 = (l0) obj;
                l0Var2.f324v.setAlpha(1.0f);
                l0Var2.f329y.d(null);
                l0Var2.f329y = null;
                break;
            default:
                l0 l0Var3 = (l0) ((l1.a) obj).f19315c;
                l0Var3.f324v.setVisibility(8);
                PopupWindow popupWindow = l0Var3.f326w;
                if (popupWindow != null) {
                    popupWindow.dismiss();
                } else if (l0Var3.f324v.getParent() instanceof View) {
                    View view = (View) l0Var3.f324v.getParent();
                    WeakHashMap weakHashMap = z0.f1413a;
                    androidx.core.view.o0.c(view);
                }
                l0Var3.f324v.e();
                l0Var3.f329y.d(null);
                l0Var3.f329y = null;
                ViewGroup viewGroup = l0Var3.A;
                WeakHashMap weakHashMap2 = z0.f1413a;
                androidx.core.view.o0.c(viewGroup);
                break;
        }
    }
}
