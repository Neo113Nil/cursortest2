package androidx.appcompat.app;

import android.view.View;
import androidx.appcompat.widget.ActionBarOverlayLayout;
import androidx.core.view.z0;
import java.util.WeakHashMap;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class w0 extends y4.a {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f369b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ y0 f370c;

    public /* synthetic */ w0(y0 y0Var, int i5) {
        this.f369b = i5;
        this.f370c = y0Var;
    }

    @Override // androidx.core.view.h1
    public final void onAnimationEnd() {
        View view;
        int i5 = this.f369b;
        y0 y0Var = this.f370c;
        switch (i5) {
            case 0:
                if (y0Var.f395o && (view = y0Var.f388g) != null) {
                    view.setTranslationY(0.0f);
                    y0Var.f385d.setTranslationY(0.0f);
                }
                y0Var.f385d.setVisibility(8);
                y0Var.f385d.setTransitioning(false);
                y0Var.f398s = null;
                l1.a aVar = y0Var.f391k;
                if (aVar != null) {
                    aVar.v(y0Var.j);
                    y0Var.j = null;
                    y0Var.f391k = null;
                }
                ActionBarOverlayLayout actionBarOverlayLayout = y0Var.f384c;
                if (actionBarOverlayLayout != null) {
                    WeakHashMap weakHashMap = z0.f1413a;
                    androidx.core.view.o0.c(actionBarOverlayLayout);
                    break;
                }
                break;
            default:
                y0Var.f398s = null;
                y0Var.f385d.requestLayout();
                break;
        }
    }
}
