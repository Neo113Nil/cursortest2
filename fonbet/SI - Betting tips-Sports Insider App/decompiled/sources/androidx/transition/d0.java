package androidx.transition;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import java.util.ArrayList;
import java.util.Iterator;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class d0 implements ViewTreeObserver.OnPreDrawListener, View.OnAttachStateChangeListener {

    /* renamed from: a, reason: collision with root package name */
    public a0 f2683a;

    /* renamed from: b, reason: collision with root package name */
    public ViewGroup f2684b;

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public final boolean onPreDraw() {
        a0 a0Var = this.f2683a;
        ViewGroup viewGroup = this.f2684b;
        viewGroup.getViewTreeObserver().removeOnPreDrawListener(this);
        viewGroup.removeOnAttachStateChangeListener(this);
        if (!e0.f2694c.remove(viewGroup)) {
            return true;
        }
        s.e b10 = e0.b();
        ArrayList arrayList = (ArrayList) b10.get(viewGroup);
        ArrayList arrayList2 = null;
        if (arrayList == null) {
            arrayList = new ArrayList();
            b10.put(viewGroup, arrayList);
        } else if (arrayList.size() > 0) {
            arrayList2 = new ArrayList(arrayList);
        }
        arrayList.add(a0Var);
        a0Var.addListener(new c0(this, b10));
        a0Var.captureValues(viewGroup, false);
        if (arrayList2 != null) {
            Iterator it = arrayList2.iterator();
            while (it.hasNext()) {
                ((a0) it.next()).resume(viewGroup);
            }
        }
        a0Var.playTransition(viewGroup);
        return true;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        ViewGroup viewGroup = this.f2684b;
        viewGroup.getViewTreeObserver().removeOnPreDrawListener(this);
        viewGroup.removeOnAttachStateChangeListener(this);
        e0.f2694c.remove(viewGroup);
        ArrayList arrayList = (ArrayList) e0.b().get(viewGroup);
        if (arrayList != null && arrayList.size() > 0) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                ((a0) it.next()).resume(viewGroup);
            }
        }
        this.f2683a.clearValues(true);
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
    }
}
