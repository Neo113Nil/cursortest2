package com.vk.profile.community.address.impl.presentation;

import android.view.MotionEvent;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.unity3d.services.UnityAdsConstants;
import com.vk.core.view.components.topbar.VkTopBar;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.TreeSet;
import java.util.WeakHashMap;
import xsna.b0u0;
import xsna.erg;
import xsna.iut0;
import xsna.zut0;

/* loaded from: classes5.dex */
public class CommunityAddressesListBehavior<V extends View> extends CoordinatorLayout.c<V> {
    public zut0 h;
    public WeakReference<V> i;
    public boolean k;
    public int n;
    public int o;
    public erg p;
    public WeakReference<CoordinatorLayout> r;
    public int b = -3;
    public int c = 0;
    public int d = 0;
    public int e = 0;
    public final TreeSet<Integer> f = new TreeSet<>();
    public int g = 0;
    public boolean j = false;
    public boolean l = true;
    public boolean m = false;
    public boolean q = false;
    public final a s = new a();

    public class a extends zut0.c {
        public a() {
        }

        @Override // xsna.zut0.c
        public final int clampViewPositionVertical(View view, int i, int i2) {
            CommunityAddressesListBehavior communityAddressesListBehavior = CommunityAddressesListBehavior.this;
            int i3 = communityAddressesListBehavior.c;
            int i4 = communityAddressesListBehavior.d;
            return i < i3 ? i3 : i > i4 ? i4 : i;
        }

        @Override // xsna.zut0.c
        public final int getViewVerticalDragRange(View view) {
            CommunityAddressesListBehavior communityAddressesListBehavior = CommunityAddressesListBehavior.this;
            return communityAddressesListBehavior.d - communityAddressesListBehavior.c;
        }

        @Override // xsna.zut0.c
        public final void onViewDragStateChanged(int i) {
            WeakReference<CoordinatorLayout> weakReference;
            WeakReference<V> weakReference2;
            super.onViewDragStateChanged(i);
            CommunityAddressesListBehavior communityAddressesListBehavior = CommunityAddressesListBehavior.this;
            if (!communityAddressesListBehavior.q || (weakReference = communityAddressesListBehavior.r) == null || weakReference.get() == null || (weakReference2 = communityAddressesListBehavior.i) == null || weakReference2.get() == null) {
                return;
            }
            V v = communityAddressesListBehavior.i.get();
            int top = v.getTop();
            communityAddressesListBehavior.r.get().R(communityAddressesListBehavior.o, communityAddressesListBehavior.i.get());
            communityAddressesListBehavior.E(top, v);
            communityAddressesListBehavior.q = false;
        }

        @Override // xsna.zut0.c
        public final void onViewPositionChanged(@NonNull View view, int i, int i2, int i3, int i4) {
            CommunityAddressesListBehavior.this.D();
        }

        @Override // xsna.zut0.c
        public final boolean tryCaptureView(@NonNull View view, int i) {
            CommunityAddressesListBehavior communityAddressesListBehavior = CommunityAddressesListBehavior.this;
            WeakReference<V> weakReference = communityAddressesListBehavior.i;
            return (weakReference == null || weakReference.get() == null || communityAddressesListBehavior.i.get() != view) ? false : true;
        }
    }

    public class b implements Runnable {
        public final View b;

        public b(View view) {
            this.b = view;
        }

        @Override // java.lang.Runnable
        public final void run() {
            zut0 zut0Var = CommunityAddressesListBehavior.this.h;
            if (zut0Var == null || !zut0Var.h()) {
                return;
            }
            WeakHashMap<View, b0u0> weakHashMap = iut0.a;
            this.b.postOnAnimation(this);
        }
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public final void B(@NonNull CoordinatorLayout coordinatorLayout, @NonNull V v, @NonNull View view, int i) {
        int top;
        int i2;
        super.B(coordinatorLayout, v, view, i);
        if (this.l && (top = v.getTop()) != this.c && this.k) {
            int i3 = this.g;
            TreeSet<Integer> treeSet = this.f;
            if (i3 > 0) {
                Integer lower = treeSet.lower(Integer.valueOf(top));
                i2 = lower == null ? this.c : lower.intValue();
            } else if (i3 < 0) {
                Integer higher = treeSet.higher(Integer.valueOf(top));
                i2 = higher == null ? this.d : higher.intValue();
            } else {
                Integer lower2 = treeSet.lower(Integer.valueOf(top));
                int intValue = lower2 == null ? this.d : lower2.intValue();
                Integer higher2 = treeSet.higher(Integer.valueOf(top));
                int intValue2 = higher2 == null ? this.d : higher2.intValue();
                i2 = Math.abs(top - intValue2) > Math.abs(top - intValue) ? intValue : intValue2;
            }
            H(i2);
            G(i2, v);
        }
    }

    public final void D() {
        erg ergVar = this.p;
        if (ergVar != null) {
            CommunityAddressesFragment communityAddressesFragment = ergVar.a;
            int i = ergVar.b;
            int i2 = communityAddressesFragment.q0;
            int mo = communityAddressesFragment.mo();
            float f = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
            if (i2 < mo) {
                RecyclerView recyclerView = communityAddressesFragment.V;
                if (recyclerView == null) {
                    recyclerView = null;
                }
                recyclerView.setTranslationY(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                VkTopBar vkTopBar = communityAddressesFragment.c0;
                (vkTopBar != null ? vkTopBar : null).setVisibility(4);
                return;
            }
            CommunityAddressesListBehavior<RecyclerView> communityAddressesListBehavior = communityAddressesFragment.u0;
            if (communityAddressesListBehavior == null) {
                communityAddressesListBehavior = null;
            }
            WeakReference<RecyclerView> weakReference = communityAddressesListBehavior.i;
            if (weakReference != null && weakReference.get() != null && communityAddressesListBehavior.i.get().getTop() == CommunityAddressesFragment.E0) {
                VkTopBar vkTopBar2 = communityAddressesFragment.c0;
                (vkTopBar2 != null ? vkTopBar2 : null).setAlpha(1.0f);
                return;
            }
            View view = communityAddressesFragment.Y;
            if (view == null) {
                view = null;
            }
            if (view.getTop() < communityAddressesFragment.mo() / 2) {
                View view2 = communityAddressesFragment.Y;
                if (view2 == null) {
                    view2 = null;
                }
                float top = 1.0f - (view2.getTop() / (communityAddressesFragment.mo() / 2));
                if (top >= UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                    f = top;
                }
                RecyclerView recyclerView2 = communityAddressesFragment.V;
                if (recyclerView2 == null) {
                    recyclerView2 = null;
                }
                VkTopBar vkTopBar3 = communityAddressesFragment.c0;
                if (vkTopBar3 == null) {
                    vkTopBar3 = null;
                }
                recyclerView2.setTranslationY((vkTopBar3.getHeight() - i) * f);
            } else {
                RecyclerView recyclerView3 = communityAddressesFragment.V;
                if (recyclerView3 == null) {
                    recyclerView3 = null;
                }
                recyclerView3.setTranslationY(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
            }
            View view3 = communityAddressesFragment.Y;
            if (view3 == null) {
                view3 = null;
            }
            int top2 = view3.getTop();
            VkTopBar vkTopBar4 = communityAddressesFragment.X;
            if (vkTopBar4 == null) {
                vkTopBar4 = null;
            }
            if (top2 >= vkTopBar4.getBottom()) {
                VkTopBar vkTopBar5 = communityAddressesFragment.c0;
                (vkTopBar5 != null ? vkTopBar5 : null).setVisibility(4);
                return;
            }
            View view4 = communityAddressesFragment.Y;
            if (view4 == null) {
                view4 = null;
            }
            float top3 = view4.getTop();
            VkTopBar vkTopBar6 = communityAddressesFragment.X;
            if (vkTopBar6 == null) {
                vkTopBar6 = null;
            }
            float bottom = top3 / vkTopBar6.getBottom();
            VkTopBar vkTopBar7 = communityAddressesFragment.c0;
            if (vkTopBar7 == null) {
                vkTopBar7 = null;
            }
            vkTopBar7.setVisibility(0);
            VkTopBar vkTopBar8 = communityAddressesFragment.c0;
            if (vkTopBar8 == null) {
                vkTopBar8 = null;
            }
            vkTopBar8.setAlpha(1.0f - bottom);
            View view5 = communityAddressesFragment.b0;
            (view5 != null ? view5 : null).setAlpha(bottom);
        }
    }

    public final void E(int i, View view) {
        if (!this.m || i == this.e) {
            int top = i - view.getTop();
            WeakHashMap<View, b0u0> weakHashMap = iut0.a;
            view.offsetTopAndBottom(top);
        }
    }

    public final void F() {
        WeakReference<V> weakReference = this.i;
        V v = weakReference == null ? null : weakReference.get();
        if (v == null) {
            return;
        }
        int top = v.getTop();
        int i = this.n;
        if (top != i) {
            G(i, v);
            H(this.n);
        }
    }

    public final void G(int i, View view) {
        if (!this.m || i == this.e) {
            this.h.u(view.getLeft(), i, view);
            b bVar = new b(view);
            WeakHashMap<View, b0u0> weakHashMap = iut0.a;
            view.postOnAnimation(bVar);
        }
    }

    public final void H(int i) {
        if (i == this.n) {
            this.b = -4;
            return;
        }
        if (i == this.c) {
            this.b = -2;
            return;
        }
        if (i == this.d) {
            this.b = -1;
            return;
        }
        Integer valueOf = Integer.valueOf(i);
        TreeSet<Integer> treeSet = this.f;
        if (treeSet.contains(valueOf)) {
            this.b = new ArrayList(treeSet).indexOf(Integer.valueOf(i));
        } else {
            this.b = -3;
        }
    }

    public final void I(int i, boolean z) {
        this.b = i;
        WeakReference<V> weakReference = this.i;
        V v = weakReference == null ? null : weakReference.get();
        if (v != null) {
            J(v, z);
        }
    }

    public final void J(V v, boolean z) {
        int i = this.b;
        if (i != -3) {
            int i2 = i == -2 ? this.c : 0;
            if (i == -1) {
                i2 = this.d;
            }
            if (i == -4) {
                i2 = this.n;
            }
            TreeSet<Integer> treeSet = this.f;
            if (i < treeSet.size() && this.b >= 0) {
                i2 = ((Integer) new ArrayList(treeSet).get(this.b)).intValue();
            }
            if (z) {
                G(i2, v);
            } else {
                E(i2, v);
            }
        }
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public final boolean m(CoordinatorLayout coordinatorLayout, V v, MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            this.j = false;
            if (this.m || !this.l) {
                int x = (int) motionEvent.getX();
                int y = (int) motionEvent.getY();
                if (coordinatorLayout.O(x, y, v)) {
                    int childCount = coordinatorLayout.getChildCount();
                    boolean z = false;
                    for (int i = 0; i < childCount; i++) {
                        View childAt = coordinatorLayout.getChildAt(i);
                        if (v == childAt) {
                            z = true;
                        } else if (z && coordinatorLayout.O(x, y, childAt)) {
                        }
                    }
                    return true;
                }
            }
        }
        return false;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public final boolean n(CoordinatorLayout coordinatorLayout, V v, int i) {
        this.n = coordinatorLayout.getMeasuredHeight();
        this.o = i;
        if (this.h == null) {
            this.h = new zut0(coordinatorLayout.getContext(), coordinatorLayout, this.s);
        }
        try {
            if (this.h.a != 2) {
                int top = v.getTop();
                coordinatorLayout.R(i, v);
                if (this.m) {
                    E(this.e, v);
                } else if (this.h.a != 0 || this.b == -3) {
                    E(top, v);
                } else {
                    J(v, false);
                }
            } else {
                this.q = true;
            }
        } catch (Exception unused) {
        }
        D();
        this.i = new WeakReference<>(v);
        this.r = new WeakReference<>(coordinatorLayout);
        return true;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public final boolean p(View view, View view2, float f) {
        boolean z = view.getTop() == this.c;
        this.j = z;
        return !z;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public final void r(@NonNull CoordinatorLayout coordinatorLayout, @NonNull V v, @NonNull View view, int i, int i2, @NonNull int[] iArr, int i3) {
        if (this.j && v.getTop() == this.c) {
            return;
        }
        int top = v.getTop() - i2;
        if (i2 > 0) {
            int i4 = this.c;
            if (top < i4) {
                int i5 = ((-i2) - top) + i4;
                WeakHashMap<View, b0u0> weakHashMap = iut0.a;
                v.offsetTopAndBottom(i5);
                iArr[1] = v.getTop();
                this.b = -2;
            } else {
                WeakHashMap<View, b0u0> weakHashMap2 = iut0.a;
                v.offsetTopAndBottom(-i2);
                iArr[1] = i2;
            }
        } else if (i2 < 0 && !view.canScrollVertically(-1)) {
            if (top <= this.d) {
                iArr[1] = i2;
                WeakHashMap<View, b0u0> weakHashMap3 = iut0.a;
                v.offsetTopAndBottom(-i2);
            } else {
                int top2 = v.getTop() - this.d;
                iArr[1] = top2;
                WeakHashMap<View, b0u0> weakHashMap4 = iut0.a;
                v.offsetTopAndBottom(-top2);
            }
        }
        D();
        this.g = i2;
        this.k = true;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public final boolean z(@NonNull CoordinatorLayout coordinatorLayout, @NonNull V v, @NonNull View view, @NonNull View view2, int i, int i2) {
        this.k = false;
        return (i & 2) != 0 && i2 == 0 && this.l && !this.m;
    }
}
