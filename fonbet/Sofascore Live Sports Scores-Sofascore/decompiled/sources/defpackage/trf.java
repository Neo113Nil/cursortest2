package defpackage;

import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import androidx.recyclerview.widget.RecyclerView;
import java.util.WeakHashMap;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class trf extends p9 {
    public final urf d;
    public final WeakHashMap e = new WeakHashMap();

    public trf(urf urfVar) {
        this.d = urfVar;
    }

    @Override // defpackage.p9
    public final boolean a(View view, AccessibilityEvent accessibilityEvent) {
        p9 p9Var = (p9) this.e.get(view);
        return p9Var != null ? p9Var.a(view, accessibilityEvent) : this.a.dispatchPopulateAccessibilityEvent(view, accessibilityEvent);
    }

    @Override // defpackage.p9
    public final j0l b(View view) {
        p9 p9Var = (p9) this.e.get(view);
        return p9Var != null ? p9Var.b(view) : super.b(view);
    }

    @Override // defpackage.p9
    public final void c(View view, AccessibilityEvent accessibilityEvent) {
        p9 p9Var = (p9) this.e.get(view);
        if (p9Var != null) {
            p9Var.c(view, accessibilityEvent);
        } else {
            super.c(view, accessibilityEvent);
        }
    }

    @Override // defpackage.p9
    public final void d(View view, da daVar) {
        AccessibilityNodeInfo accessibilityNodeInfo = daVar.a;
        urf urfVar = this.d;
        RecyclerView recyclerView = urfVar.d;
        RecyclerView recyclerView2 = urfVar.d;
        boolean hasPendingAdapterUpdates = recyclerView.hasPendingAdapterUpdates();
        View.AccessibilityDelegate accessibilityDelegate = this.a;
        if (hasPendingAdapterUpdates || recyclerView2.getLayoutManager() == null) {
            accessibilityDelegate.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
            return;
        }
        recyclerView2.getLayoutManager().onInitializeAccessibilityNodeInfoForItem(view, daVar);
        p9 p9Var = (p9) this.e.get(view);
        if (p9Var != null) {
            p9Var.d(view, daVar);
        } else {
            accessibilityDelegate.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
        }
    }

    @Override // defpackage.p9
    public final void e(View view, AccessibilityEvent accessibilityEvent) {
        p9 p9Var = (p9) this.e.get(view);
        if (p9Var != null) {
            p9Var.e(view, accessibilityEvent);
        } else {
            super.e(view, accessibilityEvent);
        }
    }

    @Override // defpackage.p9
    public final boolean f(ViewGroup viewGroup, View view, AccessibilityEvent accessibilityEvent) {
        p9 p9Var = (p9) this.e.get(viewGroup);
        return p9Var != null ? p9Var.f(viewGroup, view, accessibilityEvent) : this.a.onRequestSendAccessibilityEvent(viewGroup, view, accessibilityEvent);
    }

    @Override // defpackage.p9
    public final boolean g(View view, int i, Bundle bundle) {
        urf urfVar = this.d;
        RecyclerView recyclerView = urfVar.d;
        RecyclerView recyclerView2 = urfVar.d;
        if (recyclerView.hasPendingAdapterUpdates() || recyclerView2.getLayoutManager() == null) {
            return super.g(view, i, bundle);
        }
        p9 p9Var = (p9) this.e.get(view);
        if (p9Var != null) {
            if (p9Var.g(view, i, bundle)) {
                return true;
            }
        } else if (super.g(view, i, bundle)) {
            return true;
        }
        return recyclerView2.getLayoutManager().performAccessibilityActionForItem(view, i, bundle);
    }

    @Override // defpackage.p9
    public final void h(View view, int i) {
        p9 p9Var = (p9) this.e.get(view);
        if (p9Var != null) {
            p9Var.h(view, i);
        } else {
            super.h(view, i);
        }
    }

    @Override // defpackage.p9
    public final void i(View view, AccessibilityEvent accessibilityEvent) {
        p9 p9Var = (p9) this.e.get(view);
        if (p9Var != null) {
            p9Var.i(view, accessibilityEvent);
        } else {
            super.i(view, accessibilityEvent);
        }
    }
}
