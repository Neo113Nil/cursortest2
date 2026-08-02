package com.vk.newsfeed.posting.impl.presentation.base.view.steps.mediapicker;

import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager.widget.ViewPager;
import androidx.viewpager2.widget.ViewPager2;
import com.vk.core.ui.bottomsheet.internal.ModalBottomSheetBehavior;
import xsna.cn70;
import xsna.f4m;
import xsna.ht10;
import xsna.jz70;

/* compiled from: MediaPickerBottomSheetBehavior.kt */
/* loaded from: classes4.dex */
public final class MediaPickerBottomSheetBehavior extends ModalBottomSheetBehavior<View> {
    public final jz70 M;
    public float N;

    public MediaPickerBottomSheetBehavior(jz70 jz70Var) {
        super(new ht10(cn70.b(261), cn70.b(52)), null);
        this.M = jz70Var;
    }

    @Override // com.vk.core.ui.bottomsheet.internal.ModalBottomSheetBehavior
    public final boolean E(View view) {
        int i = this.k;
        if (i == 1 || i == 4) {
            return false;
        }
        return view.canScrollVertically(-1);
    }

    @Override // com.vk.core.ui.bottomsheet.internal.ModalBottomSheetBehavior
    public final View G(View view) {
        View view2 = null;
        if (!f4m.g(view)) {
            if (view instanceof RecyclerView) {
                RecyclerView.o layoutManager = ((RecyclerView) view).getLayoutManager();
                if ((layoutManager instanceof LinearLayoutManager) && ((LinearLayoutManager) layoutManager).b == 1) {
                    return view;
                }
            }
            int i = 0;
            if (view instanceof ViewPager2) {
                ViewPager2 viewPager2 = (ViewPager2) view;
                View childAt = viewPager2.getChildAt(0);
                if (childAt instanceof RecyclerView) {
                    RecyclerView.o layoutManager2 = ((RecyclerView) childAt).getLayoutManager();
                    int currentItem = viewPager2.getCurrentItem();
                    if (layoutManager2 != null) {
                        view2 = layoutManager2.findViewByPosition(currentItem);
                    }
                }
                return G(view2);
            }
            if (view instanceof ViewPager) {
                return G(ModalBottomSheetBehavior.K((ViewPager) view));
            }
            if (view instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view;
                while (i < viewGroup.getChildCount()) {
                    int i2 = i + 1;
                    View childAt2 = viewGroup.getChildAt(i);
                    if (childAt2 == null) {
                        throw new IndexOutOfBoundsException();
                    }
                    View G = G(childAt2);
                    if (G != null) {
                        return G;
                    }
                    i = i2;
                }
            }
        }
        return null;
    }

    @Override // com.vk.core.ui.bottomsheet.internal.ModalBottomSheetBehavior, androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public final boolean m(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
        int i = this.k;
        boolean z = i == 1 || i == 2;
        if (motionEvent.getAction() != 0 || !z) {
            return (motionEvent.getAction() == 2 && z) ? Math.abs(motionEvent.getY() - this.N) > 5.0f : super.m(coordinatorLayout, view, motionEvent);
        }
        this.N = motionEvent.getY();
        return super.m(coordinatorLayout, view, motionEvent);
    }

    @Override // com.vk.core.ui.bottomsheet.internal.ModalBottomSheetBehavior, androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public final boolean n(CoordinatorLayout coordinatorLayout, View view, int i) {
        super.n(coordinatorLayout, view, i);
        this.M.invoke();
        return true;
    }
}
