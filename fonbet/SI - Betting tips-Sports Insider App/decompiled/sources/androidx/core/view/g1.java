package androidx.core.view;

import android.view.View;
import java.lang.ref.WeakReference;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class g1 {

    /* renamed from: a, reason: collision with root package name */
    public final WeakReference f1322a;

    public g1(View view) {
        this.f1322a = new WeakReference(view);
    }

    public final void a(float f6) {
        View view = (View) this.f1322a.get();
        if (view != null) {
            view.animate().alpha(f6);
        }
    }

    public final void b() {
        View view = (View) this.f1322a.get();
        if (view != null) {
            view.animate().cancel();
        }
    }

    public final void c(long j) {
        View view = (View) this.f1322a.get();
        if (view != null) {
            view.animate().setDuration(j);
        }
    }

    public final void d(h1 h1Var) {
        View view = (View) this.f1322a.get();
        if (view != null) {
            if (h1Var != null) {
                view.animate().setListener(new androidx.appcompat.widget.d(h1Var, view));
            } else {
                view.animate().setListener(null);
            }
        }
    }

    public final void e(float f6) {
        View view = (View) this.f1322a.get();
        if (view != null) {
            view.animate().translationY(f6);
        }
    }
}
