package defpackage;

import android.content.Context;
import android.view.View;
import android.view.ViewTreeObserver;
import android.view.accessibility.AccessibilityManager;
import com.google.android.material.behavior.HideBottomViewOnScrollBehavior;
import com.google.android.material.behavior.HideViewOnScrollBehavior;
import com.sofascore.results.R;
import java.util.WeakHashMap;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class y00 implements View.OnAttachStateChangeListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ y00(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                z00 z00Var = (z00) obj;
                Context context = view.getContext();
                if (!z00Var.d) {
                    context.getApplicationContext().registerComponentCallbacks(z00Var.e);
                    z00Var.d = true;
                    break;
                }
                break;
            case 2:
                qn5 qn5Var = (qn5) obj;
                AccessibilityManager accessibilityManager = qn5Var.t;
                if (qn5Var.u != null && accessibilityManager != null && qn5Var.isAttachedToWindow()) {
                    accessibilityManager.addTouchExplorationStateChangeListener(qn5Var.u);
                    break;
                }
                break;
            case 3:
                View view2 = (View) obj;
                view2.removeOnAttachStateChangeListener(this);
                WeakHashMap weakHashMap = bsk.a;
                view2.requestApplyInsets();
                break;
            case 6:
                view.getClass();
                geb gebVar = (geb) obj;
                gebVar.getViewTreeObserver().addOnScrollChangedListener(gebVar.j);
                gebVar.post(new yp8(gebVar, 7));
                break;
        }
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        AccessibilityManager accessibilityManager;
        AccessibilityManager accessibilityManager2;
        AccessibilityManager accessibilityManager3;
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                z00 z00Var = (z00) obj;
                Context context = view.getContext();
                if (z00Var.d) {
                    context.getApplicationContext().unregisterComponentCallbacks(z00Var.e);
                    z00Var.d = false;
                    break;
                }
                break;
            case 1:
                ql2 ql2Var = (ql2) obj;
                ViewTreeObserver viewTreeObserver = ql2Var.y;
                if (viewTreeObserver != null) {
                    if (!viewTreeObserver.isAlive()) {
                        ql2Var.y = view.getViewTreeObserver();
                    }
                    ql2Var.y.removeGlobalOnLayoutListener(ql2Var.j);
                }
                view.removeOnAttachStateChangeListener(this);
                break;
            case 2:
                qn5 qn5Var = (qn5) obj;
                AccessibilityManager.TouchExplorationStateChangeListener touchExplorationStateChangeListener = qn5Var.u;
                if (touchExplorationStateChangeListener != null && (accessibilityManager = qn5Var.t) != null) {
                    accessibilityManager.removeTouchExplorationStateChangeListener(touchExplorationStateChangeListener);
                    break;
                }
                break;
            case 3:
                break;
            case 4:
                HideBottomViewOnScrollBehavior hideBottomViewOnScrollBehavior = (HideBottomViewOnScrollBehavior) obj;
                z99 z99Var = hideBottomViewOnScrollBehavior.h;
                if (z99Var != null && (accessibilityManager2 = hideBottomViewOnScrollBehavior.g) != null) {
                    accessibilityManager2.removeTouchExplorationStateChangeListener(z99Var);
                    hideBottomViewOnScrollBehavior.h = null;
                    break;
                }
                break;
            case 5:
                HideViewOnScrollBehavior hideViewOnScrollBehavior = (HideViewOnScrollBehavior) obj;
                z99 z99Var2 = hideViewOnScrollBehavior.c;
                if (z99Var2 != null && (accessibilityManager3 = hideViewOnScrollBehavior.b) != null) {
                    accessibilityManager3.removeTouchExplorationStateChangeListener(z99Var2);
                    hideViewOnScrollBehavior.c = null;
                    break;
                }
                break;
            case 6:
                view.getClass();
                geb gebVar = (geb) obj;
                gebVar.getViewTreeObserver().removeOnScrollChangedListener(gebVar.j);
                g9i g9iVar = gebVar.g;
                if (g9iVar != null) {
                    g9iVar.e(null);
                }
                gebVar.g = null;
                vg6 vg6Var = gebVar.o;
                if (vg6Var != null) {
                    vg6Var.setPlayWhenReady(false);
                    break;
                }
                break;
            case 7:
                m9i m9iVar = (m9i) obj;
                ViewTreeObserver viewTreeObserver2 = m9iVar.p;
                if (viewTreeObserver2 != null) {
                    if (!viewTreeObserver2.isAlive()) {
                        m9iVar.p = view.getViewTreeObserver();
                    }
                    m9iVar.p.removeGlobalOnLayoutListener(m9iVar.j);
                }
                view.removeOnAttachStateChangeListener(this);
                break;
            case 8:
                a3 a3Var = (a3) obj;
                for (Object obj2 : e5h.e(a3Var.getParent(), gtk.b)) {
                    if (obj2 instanceof View) {
                        View view2 = (View) obj2;
                        view2.getClass();
                        Object tag = view2.getTag(R.id.is_pooling_container_tag);
                        Boolean bool = tag instanceof Boolean ? (Boolean) tag : null;
                        if (bool != null ? bool.booleanValue() : false) {
                            break;
                        }
                    }
                }
                a3Var.e();
                break;
            default:
                view.removeOnAttachStateChangeListener(this);
                ((g9i) obj).e(null);
                break;
        }
    }

    private final void a(View view) {
    }

    private final void b(View view) {
    }

    private final void c(View view) {
    }

    private final void d(View view) {
    }

    private final void e(View view) {
    }

    private final void f(View view) {
    }

    private final void g(View view) {
    }
}
