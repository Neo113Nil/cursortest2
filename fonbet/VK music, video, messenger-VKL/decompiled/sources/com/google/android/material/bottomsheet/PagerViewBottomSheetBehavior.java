package com.google.android.material.bottomsheet;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.widget.NestedScrollView;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager.widget.PagerAdapter;
import androidx.viewpager.widget.ViewPager;
import androidx.viewpager2.widget.ViewPager2;
import java.lang.reflect.Field;
import ru.ok.android.utils.Logger;

/* compiled from: PagerViewBottomSheetBehavior.kt */
/* loaded from: classes13.dex */
public class PagerViewBottomSheetBehavior<V extends View> extends BottomSheetBehavior<V> {
    public Field j0;

    public PagerViewBottomSheetBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public static final <V extends View> PagerViewBottomSheetBehavior<V> g0(V v) {
        ViewGroup.LayoutParams layoutParams = v.getLayoutParams();
        CoordinatorLayout.f fVar = layoutParams instanceof CoordinatorLayout.f ? (CoordinatorLayout.f) layoutParams : null;
        if (fVar == null) {
            throw new IllegalArgumentException("The view is not a child of CoordinatorLayout");
        }
        CoordinatorLayout.c cVar = fVar.a;
        BottomSheetBehavior bottomSheetBehavior = cVar instanceof BottomSheetBehavior ? (BottomSheetBehavior) cVar : null;
        if (bottomSheetBehavior != null) {
            return (PagerViewBottomSheetBehavior) bottomSheetBehavior;
        }
        throw new IllegalArgumentException("The view is not associated with BottomSheetBehavior");
    }

    @Override // com.google.android.material.bottomsheet.BottomSheetBehavior
    public final View K(View view) {
        View view2;
        if ((view instanceof RecyclerView) && ((RecyclerView) view).getVisibility() == 0) {
            return view;
        }
        View view3 = null;
        int i = 0;
        if (view instanceof ViewPager) {
            ViewPager viewPager = (ViewPager) view;
            PagerAdapter adapter = viewPager.getAdapter();
            if (adapter != null && adapter.getCount() != 0 && viewPager.getChildCount() != 0) {
                if (this.j0 == null) {
                    try {
                        Field declaredField = ViewPager.g.class.getDeclaredField(Logger.METHOD_E);
                        this.j0 = declaredField;
                        if (declaredField != null) {
                            declaredField.setAccessible(true);
                        }
                    } catch (Exception unused) {
                        throw new RuntimeException("position field not found");
                    }
                }
                int currentItem = viewPager.getCurrentItem();
                int childCount = viewPager.getChildCount();
                while (true) {
                    if (i >= childCount) {
                        break;
                    }
                    View childAt = viewPager.getChildAt(i);
                    ViewPager.g gVar = (ViewPager.g) childAt.getLayoutParams();
                    if (!gVar.a) {
                        try {
                            if (this.j0.getInt(gVar) == currentItem) {
                                view3 = childAt;
                                break;
                            }
                        } catch (Exception unused2) {
                        }
                    }
                    i++;
                }
            }
            return K(view3);
        }
        if (!(view instanceof ViewPager2)) {
            if (view instanceof NestedScrollView) {
                return view;
            }
            if (view instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view;
                while (i < viewGroup.getChildCount()) {
                    View K = K(viewGroup.getChildAt(i));
                    if (K != null) {
                        return K;
                    }
                    i++;
                }
            }
            return null;
        }
        ViewPager2 viewPager2 = (ViewPager2) view;
        RecyclerView.Adapter adapter2 = viewPager2.getAdapter();
        if (adapter2 != null && adapter2.getItemCount() != 0 && viewPager2.getChildCount() != 0) {
            int currentItem2 = viewPager2.getCurrentItem();
            int i2 = 0;
            while (true) {
                if (i2 >= viewPager2.getChildCount()) {
                    view2 = null;
                    break;
                }
                int i3 = i2 + 1;
                view2 = viewPager2.getChildAt(i2);
                if (view2 == null) {
                    throw new IndexOutOfBoundsException();
                }
                if (view2 instanceof RecyclerView) {
                    break;
                }
                i2 = i3;
            }
            RecyclerView recyclerView = view2 instanceof RecyclerView ? (RecyclerView) view2 : null;
            if (recyclerView != null) {
                int childCount2 = recyclerView.getChildCount();
                while (true) {
                    if (i >= childCount2) {
                        break;
                    }
                    View childAt2 = recyclerView.getChildAt(i);
                    if (((RecyclerView.p) childAt2.getLayoutParams()).b.getBindingAdapterPosition() == currentItem2) {
                        view3 = childAt2;
                        break;
                    }
                    i++;
                }
            }
        }
        return K(view3);
    }

    public PagerViewBottomSheetBehavior() {
    }
}
