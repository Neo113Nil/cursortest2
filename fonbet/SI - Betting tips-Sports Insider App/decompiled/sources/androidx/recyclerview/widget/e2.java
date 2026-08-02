package androidx.recyclerview.widget;

import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import java.util.WeakHashMap;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class e2 extends androidx.core.view.b {

    /* renamed from: a, reason: collision with root package name */
    public final f2 f2377a;

    /* renamed from: b, reason: collision with root package name */
    public final WeakHashMap f2378b = new WeakHashMap();

    public e2(f2 f2Var) {
        this.f2377a = f2Var;
    }

    @Override // androidx.core.view.b
    public final boolean dispatchPopulateAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
        androidx.core.view.b bVar = (androidx.core.view.b) this.f2378b.get(view);
        return bVar != null ? bVar.dispatchPopulateAccessibilityEvent(view, accessibilityEvent) : super.dispatchPopulateAccessibilityEvent(view, accessibilityEvent);
    }

    @Override // androidx.core.view.b
    public final q0.f getAccessibilityNodeProvider(View view) {
        androidx.core.view.b bVar = (androidx.core.view.b) this.f2378b.get(view);
        return bVar != null ? bVar.getAccessibilityNodeProvider(view) : super.getAccessibilityNodeProvider(view);
    }

    @Override // androidx.core.view.b
    public final void onInitializeAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
        androidx.core.view.b bVar = (androidx.core.view.b) this.f2378b.get(view);
        if (bVar != null) {
            bVar.onInitializeAccessibilityEvent(view, accessibilityEvent);
        } else {
            super.onInitializeAccessibilityEvent(view, accessibilityEvent);
        }
    }

    @Override // androidx.core.view.b
    public final void onInitializeAccessibilityNodeInfo(View view, q0.c cVar) {
        f2 f2Var = this.f2377a;
        if (f2Var.shouldIgnore() || f2Var.mRecyclerView.getLayoutManager() == null) {
            super.onInitializeAccessibilityNodeInfo(view, cVar);
            return;
        }
        f2Var.mRecyclerView.getLayoutManager().onInitializeAccessibilityNodeInfoForItem(view, cVar);
        androidx.core.view.b bVar = (androidx.core.view.b) this.f2378b.get(view);
        if (bVar != null) {
            bVar.onInitializeAccessibilityNodeInfo(view, cVar);
        } else {
            super.onInitializeAccessibilityNodeInfo(view, cVar);
        }
    }

    @Override // androidx.core.view.b
    public final void onPopulateAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
        androidx.core.view.b bVar = (androidx.core.view.b) this.f2378b.get(view);
        if (bVar != null) {
            bVar.onPopulateAccessibilityEvent(view, accessibilityEvent);
        } else {
            super.onPopulateAccessibilityEvent(view, accessibilityEvent);
        }
    }

    @Override // androidx.core.view.b
    public final boolean onRequestSendAccessibilityEvent(ViewGroup viewGroup, View view, AccessibilityEvent accessibilityEvent) {
        androidx.core.view.b bVar = (androidx.core.view.b) this.f2378b.get(viewGroup);
        return bVar != null ? bVar.onRequestSendAccessibilityEvent(viewGroup, view, accessibilityEvent) : super.onRequestSendAccessibilityEvent(viewGroup, view, accessibilityEvent);
    }

    @Override // androidx.core.view.b
    public final boolean performAccessibilityAction(View view, int i5, Bundle bundle) {
        f2 f2Var = this.f2377a;
        if (f2Var.shouldIgnore() || f2Var.mRecyclerView.getLayoutManager() == null) {
            return super.performAccessibilityAction(view, i5, bundle);
        }
        androidx.core.view.b bVar = (androidx.core.view.b) this.f2378b.get(view);
        if (bVar != null) {
            if (bVar.performAccessibilityAction(view, i5, bundle)) {
                return true;
            }
        } else if (super.performAccessibilityAction(view, i5, bundle)) {
            return true;
        }
        return f2Var.mRecyclerView.getLayoutManager().performAccessibilityActionForItem(view, i5, bundle);
    }

    @Override // androidx.core.view.b
    public final void sendAccessibilityEvent(View view, int i5) {
        androidx.core.view.b bVar = (androidx.core.view.b) this.f2378b.get(view);
        if (bVar != null) {
            bVar.sendAccessibilityEvent(view, i5);
        } else {
            super.sendAccessibilityEvent(view, i5);
        }
    }

    @Override // androidx.core.view.b
    public final void sendAccessibilityEventUnchecked(View view, AccessibilityEvent accessibilityEvent) {
        androidx.core.view.b bVar = (androidx.core.view.b) this.f2378b.get(view);
        if (bVar != null) {
            bVar.sendAccessibilityEventUnchecked(view, accessibilityEvent);
        } else {
            super.sendAccessibilityEventUnchecked(view, accessibilityEvent);
        }
    }
}
