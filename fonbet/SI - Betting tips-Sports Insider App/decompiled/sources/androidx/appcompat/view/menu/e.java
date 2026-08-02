package androidx.appcompat.view.menu;

import android.view.View;
import android.view.ViewTreeObserver;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class e implements View.OnAttachStateChangeListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f450a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f451b;

    public /* synthetic */ e(int i5, Object obj) {
        this.f450a = i5;
        this.f451b = obj;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        switch (this.f450a) {
            case 0:
            case 1:
                break;
            default:
                view.getViewTreeObserver().addOnDrawListener((io.sentry.android.core.internal.util.i) this.f451b);
                view.removeOnAttachStateChangeListener(this);
                break;
        }
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        switch (this.f450a) {
            case 0:
                h hVar = (h) this.f451b;
                ViewTreeObserver viewTreeObserver = hVar.f497x;
                if (viewTreeObserver != null) {
                    if (!viewTreeObserver.isAlive()) {
                        hVar.f497x = view.getViewTreeObserver();
                    }
                    hVar.f497x.removeGlobalOnLayoutListener(hVar.f484i);
                }
                view.removeOnAttachStateChangeListener(this);
                break;
            case 1:
                e0 e0Var = (e0) this.f451b;
                ViewTreeObserver viewTreeObserver2 = e0Var.f464o;
                if (viewTreeObserver2 != null) {
                    if (!viewTreeObserver2.isAlive()) {
                        e0Var.f464o = view.getViewTreeObserver();
                    }
                    e0Var.f464o.removeGlobalOnLayoutListener(e0Var.f459i);
                }
                view.removeOnAttachStateChangeListener(this);
                break;
            default:
                view.removeOnAttachStateChangeListener(this);
                break;
        }
    }

    private final void a(View view) {
    }

    private final void b(View view) {
    }
}
