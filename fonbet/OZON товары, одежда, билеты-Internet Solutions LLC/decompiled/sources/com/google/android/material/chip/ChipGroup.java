package com.google.android.material.chip;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityNodeInfo;
import androidx.annotation.NonNull;
import androidx.core.view.Y;
import i7.C7017a;
import ru.ozon.app.android.R;
import s7.C9607b;
import s7.C9610e;
import s7.C9619n;
import y2.q;

/* loaded from: classes9.dex */
public class ChipGroup extends C9610e {

    /* renamed from: j, reason: collision with root package name */
    public static final /* synthetic */ int f58139j = 0;

    /* renamed from: e, reason: collision with root package name */
    private int f58140e;

    /* renamed from: f, reason: collision with root package name */
    private int f58141f;

    /* renamed from: g, reason: collision with root package name */
    private final C9607b<Chip> f58142g;

    /* renamed from: h, reason: collision with root package name */
    private final int f58143h;

    /* renamed from: i, reason: collision with root package name */
    @NonNull
    private final b f58144i;

    public static class a extends ViewGroup.MarginLayoutParams {
    }

    private class b implements ViewGroup.OnHierarchyChangeListener {

        /* renamed from: a, reason: collision with root package name */
        private ViewGroup.OnHierarchyChangeListener f58145a;

        b() {
        }

        @Override // android.view.ViewGroup.OnHierarchyChangeListener
        public final void onChildViewAdded(View view, View view2) {
            ChipGroup chipGroup = ChipGroup.this;
            if (view == chipGroup && (view2 instanceof Chip)) {
                if (view2.getId() == -1) {
                    int i11 = Y.f42258g;
                    view2.setId(View.generateViewId());
                }
                chipGroup.f58142g.e((Chip) view2);
            }
            ViewGroup.OnHierarchyChangeListener onHierarchyChangeListener = this.f58145a;
            if (onHierarchyChangeListener != null) {
                onHierarchyChangeListener.onChildViewAdded(view, view2);
            }
        }

        @Override // android.view.ViewGroup.OnHierarchyChangeListener
        public final void onChildViewRemoved(View view, View view2) {
            ChipGroup chipGroup = ChipGroup.this;
            if (view == chipGroup && (view2 instanceof Chip)) {
                chipGroup.f58142g.i((Chip) view2);
            }
            ViewGroup.OnHierarchyChangeListener onHierarchyChangeListener = this.f58145a;
            if (onHierarchyChangeListener != null) {
                onHierarchyChangeListener.onChildViewRemoved(view, view2);
            }
        }
    }

    public ChipGroup(Context context, AttributeSet attributeSet) {
        super(B7.a.a(context, attributeSet, R.attr.chipGroupStyle, R.style.Widget_MaterialComponents_ChipGroup), attributeSet, R.attr.chipGroupStyle);
        C9607b<Chip> c9607b = new C9607b<>();
        this.f58142g = c9607b;
        b bVar = new b();
        this.f58144i = bVar;
        TypedArray e11 = C9619n.e(getContext(), attributeSet, C7017a.f65942h, R.attr.chipGroupStyle, R.style.Widget_MaterialComponents_ChipGroup, new int[0]);
        int dimensionPixelOffset = e11.getDimensionPixelOffset(1, 0);
        int dimensionPixelOffset2 = e11.getDimensionPixelOffset(2, dimensionPixelOffset);
        if (this.f58140e != dimensionPixelOffset2) {
            this.f58140e = dimensionPixelOffset2;
            c(dimensionPixelOffset2);
            requestLayout();
        }
        int dimensionPixelOffset3 = e11.getDimensionPixelOffset(3, dimensionPixelOffset);
        if (this.f58141f != dimensionPixelOffset3) {
            this.f58141f = dimensionPixelOffset3;
            d(dimensionPixelOffset3);
            requestLayout();
        }
        super.e(e11.getBoolean(5, false));
        c9607b.l(e11.getBoolean(6, false));
        c9607b.k(e11.getBoolean(4, false));
        this.f58143h = e11.getResourceId(0, -1);
        e11.recycle();
        c9607b.j(new d());
        super.setOnHierarchyChangeListener(bVar);
        int i11 = Y.f42258g;
        setImportantForAccessibility(1);
    }

    @Override // android.view.ViewGroup
    protected final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return super.checkLayoutParams(layoutParams) && (layoutParams instanceof a);
    }

    public final boolean g() {
        return this.f58142g.h();
    }

    @Override // android.view.ViewGroup
    @NonNull
    protected final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new a(-2, -2);
    }

    @Override // android.view.ViewGroup
    @NonNull
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new a(getContext(), attributeSet);
    }

    @Override // android.view.View
    protected final void onFinishInflate() {
        super.onFinishInflate();
        int i11 = this.f58143h;
        if (i11 != -1) {
            this.f58142g.f(i11);
        }
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(@NonNull AccessibilityNodeInfo accessibilityNodeInfo) {
        int i11;
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        q A02 = q.A0(accessibilityNodeInfo);
        if (super.b()) {
            i11 = 0;
            for (int i12 = 0; i12 < getChildCount(); i12++) {
                if (getChildAt(i12) instanceof Chip) {
                    i11++;
                }
            }
        } else {
            i11 = -1;
        }
        A02.M(q.e.a(a(), i11, this.f58142g.h() ? 1 : 2, false));
    }

    @Override // android.view.ViewGroup
    public final void setOnHierarchyChangeListener(ViewGroup.OnHierarchyChangeListener onHierarchyChangeListener) {
        this.f58144i.f58145a = onHierarchyChangeListener;
    }

    @Override // android.view.ViewGroup
    @NonNull
    protected final ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new a(layoutParams);
    }
}
