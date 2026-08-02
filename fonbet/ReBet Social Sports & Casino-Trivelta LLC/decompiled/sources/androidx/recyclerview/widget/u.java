package androidx.recyclerview.widget;

import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import androidx.core.view.AbstractC2082d0;
import androidx.core.view.C2075a;
import java.util.Map;
import java.util.WeakHashMap;
import y0.C6835A;

/* loaded from: classes.dex */
public class u extends C2075a {

    /* renamed from: a, reason: collision with root package name */
    public final RecyclerView f23219a;

    /* renamed from: b, reason: collision with root package name */
    public final a f23220b;

    public static class a extends C2075a {

        /* renamed from: a, reason: collision with root package name */
        public final u f23221a;

        /* renamed from: b, reason: collision with root package name */
        public Map f23222b = new WeakHashMap();

        public a(u uVar) {
            this.f23221a = uVar;
        }

        public C2075a c(View view) {
            return (C2075a) this.f23222b.remove(view);
        }

        public void d(View view) {
            C2075a l10 = AbstractC2082d0.l(view);
            if (l10 == null || l10 == this) {
                return;
            }
            this.f23222b.put(view, l10);
        }

        @Override // androidx.core.view.C2075a
        public boolean dispatchPopulateAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
            C2075a c2075a = (C2075a) this.f23222b.get(view);
            return c2075a != null ? c2075a.dispatchPopulateAccessibilityEvent(view, accessibilityEvent) : super.dispatchPopulateAccessibilityEvent(view, accessibilityEvent);
        }

        @Override // androidx.core.view.C2075a
        public C6835A getAccessibilityNodeProvider(View view) {
            C2075a c2075a = (C2075a) this.f23222b.get(view);
            return c2075a != null ? c2075a.getAccessibilityNodeProvider(view) : super.getAccessibilityNodeProvider(view);
        }

        @Override // androidx.core.view.C2075a
        public void onInitializeAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
            C2075a c2075a = (C2075a) this.f23222b.get(view);
            if (c2075a != null) {
                c2075a.onInitializeAccessibilityEvent(view, accessibilityEvent);
            } else {
                super.onInitializeAccessibilityEvent(view, accessibilityEvent);
            }
        }

        @Override // androidx.core.view.C2075a
        public void onInitializeAccessibilityNodeInfo(View view, y0.z zVar) {
            if (this.f23221a.d() || this.f23221a.f23219a.getLayoutManager() == null) {
                super.onInitializeAccessibilityNodeInfo(view, zVar);
                return;
            }
            this.f23221a.f23219a.getLayoutManager().b1(view, zVar);
            C2075a c2075a = (C2075a) this.f23222b.get(view);
            if (c2075a != null) {
                c2075a.onInitializeAccessibilityNodeInfo(view, zVar);
            } else {
                super.onInitializeAccessibilityNodeInfo(view, zVar);
            }
        }

        @Override // androidx.core.view.C2075a
        public void onPopulateAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
            C2075a c2075a = (C2075a) this.f23222b.get(view);
            if (c2075a != null) {
                c2075a.onPopulateAccessibilityEvent(view, accessibilityEvent);
            } else {
                super.onPopulateAccessibilityEvent(view, accessibilityEvent);
            }
        }

        @Override // androidx.core.view.C2075a
        public boolean onRequestSendAccessibilityEvent(ViewGroup viewGroup, View view, AccessibilityEvent accessibilityEvent) {
            C2075a c2075a = (C2075a) this.f23222b.get(viewGroup);
            return c2075a != null ? c2075a.onRequestSendAccessibilityEvent(viewGroup, view, accessibilityEvent) : super.onRequestSendAccessibilityEvent(viewGroup, view, accessibilityEvent);
        }

        @Override // androidx.core.view.C2075a
        public boolean performAccessibilityAction(View view, int i10, Bundle bundle) {
            if (this.f23221a.d() || this.f23221a.f23219a.getLayoutManager() == null) {
                return super.performAccessibilityAction(view, i10, bundle);
            }
            C2075a c2075a = (C2075a) this.f23222b.get(view);
            if (c2075a != null) {
                if (c2075a.performAccessibilityAction(view, i10, bundle)) {
                    return true;
                }
            } else if (super.performAccessibilityAction(view, i10, bundle)) {
                return true;
            }
            return this.f23221a.f23219a.getLayoutManager().v1(view, i10, bundle);
        }

        @Override // androidx.core.view.C2075a
        public void sendAccessibilityEvent(View view, int i10) {
            C2075a c2075a = (C2075a) this.f23222b.get(view);
            if (c2075a != null) {
                c2075a.sendAccessibilityEvent(view, i10);
            } else {
                super.sendAccessibilityEvent(view, i10);
            }
        }

        @Override // androidx.core.view.C2075a
        public void sendAccessibilityEventUnchecked(View view, AccessibilityEvent accessibilityEvent) {
            C2075a c2075a = (C2075a) this.f23222b.get(view);
            if (c2075a != null) {
                c2075a.sendAccessibilityEventUnchecked(view, accessibilityEvent);
            } else {
                super.sendAccessibilityEventUnchecked(view, accessibilityEvent);
            }
        }
    }

    public u(RecyclerView recyclerView) {
        this.f23219a = recyclerView;
        C2075a c10 = c();
        if (c10 == null || !(c10 instanceof a)) {
            this.f23220b = new a(this);
        } else {
            this.f23220b = (a) c10;
        }
    }

    public C2075a c() {
        return this.f23220b;
    }

    public boolean d() {
        return this.f23219a.x0();
    }

    @Override // androidx.core.view.C2075a
    public void onInitializeAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(view, accessibilityEvent);
        if (!(view instanceof RecyclerView) || d()) {
            return;
        }
        RecyclerView recyclerView = (RecyclerView) view;
        if (recyclerView.getLayoutManager() != null) {
            recyclerView.getLayoutManager().X0(accessibilityEvent);
        }
    }

    @Override // androidx.core.view.C2075a
    public void onInitializeAccessibilityNodeInfo(View view, y0.z zVar) {
        super.onInitializeAccessibilityNodeInfo(view, zVar);
        if (d() || this.f23219a.getLayoutManager() == null) {
            return;
        }
        this.f23219a.getLayoutManager().a1(zVar);
    }

    @Override // androidx.core.view.C2075a
    public boolean performAccessibilityAction(View view, int i10, Bundle bundle) {
        if (super.performAccessibilityAction(view, i10, bundle)) {
            return true;
        }
        if (d() || this.f23219a.getLayoutManager() == null) {
            return false;
        }
        return this.f23219a.getLayoutManager().t1(i10, bundle);
    }
}
