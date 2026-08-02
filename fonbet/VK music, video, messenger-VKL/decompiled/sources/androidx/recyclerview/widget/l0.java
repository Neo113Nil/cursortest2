package androidx.recyclerview.widget;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.Map;
import java.util.WeakHashMap;
import xsna.am;
import xsna.bm;
import xsna.hk;
import xsna.iut0;

/* compiled from: RecyclerViewAccessibilityDelegate.java */
/* loaded from: classes.dex */
public class l0 extends hk {
    private final a mItemDelegate;
    final RecyclerView mRecyclerView;

    /* compiled from: RecyclerViewAccessibilityDelegate.java */
    public static class a extends hk {
        private Map<View, hk> mOriginalItemDelegates = new WeakHashMap();
        final l0 mRecyclerViewDelegate;

        public a(@NonNull l0 l0Var) {
            this.mRecyclerViewDelegate = l0Var;
        }

        @Override // xsna.hk
        public boolean dispatchPopulateAccessibilityEvent(@NonNull View view, @NonNull AccessibilityEvent accessibilityEvent) {
            hk hkVar = this.mOriginalItemDelegates.get(view);
            return hkVar != null ? hkVar.dispatchPopulateAccessibilityEvent(view, accessibilityEvent) : super.dispatchPopulateAccessibilityEvent(view, accessibilityEvent);
        }

        @Override // xsna.hk
        @Nullable
        public bm getAccessibilityNodeProvider(@NonNull View view) {
            hk hkVar = this.mOriginalItemDelegates.get(view);
            return hkVar != null ? hkVar.getAccessibilityNodeProvider(view) : super.getAccessibilityNodeProvider(view);
        }

        public hk getAndRemoveOriginalDelegateForItem(View view) {
            return this.mOriginalItemDelegates.remove(view);
        }

        @Override // xsna.hk
        public void onInitializeAccessibilityEvent(@NonNull View view, @NonNull AccessibilityEvent accessibilityEvent) {
            hk hkVar = this.mOriginalItemDelegates.get(view);
            if (hkVar != null) {
                hkVar.onInitializeAccessibilityEvent(view, accessibilityEvent);
            } else {
                super.onInitializeAccessibilityEvent(view, accessibilityEvent);
            }
        }

        @Override // xsna.hk
        public void onInitializeAccessibilityNodeInfo(@NonNull @SuppressLint({"InvalidNullabilityOverride"}) View view, @NonNull @SuppressLint({"InvalidNullabilityOverride"}) am amVar) {
            if (this.mRecyclerViewDelegate.shouldIgnore() || this.mRecyclerViewDelegate.mRecyclerView.getLayoutManager() == null) {
                super.onInitializeAccessibilityNodeInfo(view, amVar);
                return;
            }
            this.mRecyclerViewDelegate.mRecyclerView.getLayoutManager().onInitializeAccessibilityNodeInfoForItem(view, amVar);
            hk hkVar = this.mOriginalItemDelegates.get(view);
            if (hkVar != null) {
                hkVar.onInitializeAccessibilityNodeInfo(view, amVar);
            } else {
                super.onInitializeAccessibilityNodeInfo(view, amVar);
            }
        }

        @Override // xsna.hk
        public void onPopulateAccessibilityEvent(@NonNull View view, @NonNull AccessibilityEvent accessibilityEvent) {
            hk hkVar = this.mOriginalItemDelegates.get(view);
            if (hkVar != null) {
                hkVar.onPopulateAccessibilityEvent(view, accessibilityEvent);
            } else {
                super.onPopulateAccessibilityEvent(view, accessibilityEvent);
            }
        }

        @Override // xsna.hk
        public boolean onRequestSendAccessibilityEvent(@NonNull ViewGroup viewGroup, @NonNull View view, @NonNull AccessibilityEvent accessibilityEvent) {
            hk hkVar = this.mOriginalItemDelegates.get(viewGroup);
            return hkVar != null ? hkVar.onRequestSendAccessibilityEvent(viewGroup, view, accessibilityEvent) : super.onRequestSendAccessibilityEvent(viewGroup, view, accessibilityEvent);
        }

        @Override // xsna.hk
        public boolean performAccessibilityAction(@NonNull @SuppressLint({"InvalidNullabilityOverride"}) View view, int i, @Nullable @SuppressLint({"InvalidNullabilityOverride"}) Bundle bundle) {
            if (this.mRecyclerViewDelegate.shouldIgnore() || this.mRecyclerViewDelegate.mRecyclerView.getLayoutManager() == null) {
                return super.performAccessibilityAction(view, i, bundle);
            }
            hk hkVar = this.mOriginalItemDelegates.get(view);
            if (hkVar != null) {
                if (hkVar.performAccessibilityAction(view, i, bundle)) {
                    return true;
                }
            } else if (super.performAccessibilityAction(view, i, bundle)) {
                return true;
            }
            return this.mRecyclerViewDelegate.mRecyclerView.getLayoutManager().performAccessibilityActionForItem(view, i, bundle);
        }

        public void saveOriginalDelegate(View view) {
            hk d = iut0.d(view);
            if (d == null || d == this) {
                return;
            }
            this.mOriginalItemDelegates.put(view, d);
        }

        @Override // xsna.hk
        public void sendAccessibilityEvent(@NonNull View view, int i) {
            hk hkVar = this.mOriginalItemDelegates.get(view);
            if (hkVar != null) {
                hkVar.sendAccessibilityEvent(view, i);
            } else {
                super.sendAccessibilityEvent(view, i);
            }
        }

        @Override // xsna.hk
        public void sendAccessibilityEventUnchecked(@NonNull View view, @NonNull AccessibilityEvent accessibilityEvent) {
            hk hkVar = this.mOriginalItemDelegates.get(view);
            if (hkVar != null) {
                hkVar.sendAccessibilityEventUnchecked(view, accessibilityEvent);
            } else {
                super.sendAccessibilityEventUnchecked(view, accessibilityEvent);
            }
        }
    }

    public l0(@NonNull RecyclerView recyclerView) {
        this.mRecyclerView = recyclerView;
        hk itemDelegate = getItemDelegate();
        if (itemDelegate == null || !(itemDelegate instanceof a)) {
            this.mItemDelegate = new a(this);
        } else {
            this.mItemDelegate = (a) itemDelegate;
        }
    }

    @NonNull
    public hk getItemDelegate() {
        return this.mItemDelegate;
    }

    @Override // xsna.hk
    public void onInitializeAccessibilityEvent(@NonNull @SuppressLint({"InvalidNullabilityOverride"}) View view, @NonNull @SuppressLint({"InvalidNullabilityOverride"}) AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(view, accessibilityEvent);
        if (!(view instanceof RecyclerView) || shouldIgnore()) {
            return;
        }
        RecyclerView recyclerView = (RecyclerView) view;
        if (recyclerView.getLayoutManager() != null) {
            recyclerView.getLayoutManager().onInitializeAccessibilityEvent(accessibilityEvent);
        }
    }

    @Override // xsna.hk
    public void onInitializeAccessibilityNodeInfo(@NonNull @SuppressLint({"InvalidNullabilityOverride"}) View view, @NonNull @SuppressLint({"InvalidNullabilityOverride"}) am amVar) {
        super.onInitializeAccessibilityNodeInfo(view, amVar);
        if (shouldIgnore() || this.mRecyclerView.getLayoutManager() == null) {
            return;
        }
        this.mRecyclerView.getLayoutManager().onInitializeAccessibilityNodeInfo(amVar);
    }

    @Override // xsna.hk
    public boolean performAccessibilityAction(@NonNull @SuppressLint({"InvalidNullabilityOverride"}) View view, int i, @Nullable @SuppressLint({"InvalidNullabilityOverride"}) Bundle bundle) {
        if (super.performAccessibilityAction(view, i, bundle)) {
            return true;
        }
        if (shouldIgnore() || this.mRecyclerView.getLayoutManager() == null) {
            return false;
        }
        return this.mRecyclerView.getLayoutManager().performAccessibilityAction(i, bundle);
    }

    public boolean shouldIgnore() {
        return this.mRecyclerView.hasPendingAdapterUpdates();
    }
}
