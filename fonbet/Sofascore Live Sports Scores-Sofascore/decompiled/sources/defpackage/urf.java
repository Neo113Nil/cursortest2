package defpackage;

import android.os.Bundle;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import androidx.recyclerview.widget.RecyclerView;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public class urf extends p9 {
    public final RecyclerView d;
    public final trf e;

    public urf(RecyclerView recyclerView) {
        this.d = recyclerView;
        p9 j = j();
        if (j == null || !(j instanceof trf)) {
            this.e = new trf(this);
        } else {
            this.e = (trf) j;
        }
    }

    @Override // defpackage.p9
    public final void c(View view, AccessibilityEvent accessibilityEvent) {
        super.c(view, accessibilityEvent);
        if (!(view instanceof RecyclerView) || this.d.hasPendingAdapterUpdates()) {
            return;
        }
        RecyclerView recyclerView = (RecyclerView) view;
        if (recyclerView.getLayoutManager() != null) {
            recyclerView.getLayoutManager().onInitializeAccessibilityEvent(accessibilityEvent);
        }
    }

    @Override // defpackage.p9
    public final void d(View view, da daVar) {
        this.a.onInitializeAccessibilityNodeInfo(view, daVar.a);
        RecyclerView recyclerView = this.d;
        if (recyclerView.hasPendingAdapterUpdates() || recyclerView.getLayoutManager() == null) {
            return;
        }
        recyclerView.getLayoutManager().onInitializeAccessibilityNodeInfo(daVar);
    }

    @Override // defpackage.p9
    public final boolean g(View view, int i, Bundle bundle) {
        if (super.g(view, i, bundle)) {
            return true;
        }
        RecyclerView recyclerView = this.d;
        if (recyclerView.hasPendingAdapterUpdates() || recyclerView.getLayoutManager() == null) {
            return false;
        }
        return recyclerView.getLayoutManager().performAccessibilityAction(i, bundle);
    }

    public p9 j() {
        return this.e;
    }
}
