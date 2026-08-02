package ru.ozon.android.messenger.utils.view;

import Gl.C3124a;
import Sc.v;
import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.LinearLayoutManager;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.messenger.R$styleable;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0001\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lru/ozon/android/messenger/utils/view/TripleBalancedCenterLayout;", "Landroid/view/ViewGroup;", "a", "messenger_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class TripleBalancedCenterLayout extends ViewGroup {

    /* renamed from: a, reason: collision with root package name */
    private int f91999a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TripleBalancedCenterLayout(@NotNull Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(context, "context");
        this.f91999a = 16;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, new int[]{R.attr.gravity}, 0, 0);
        Intrinsics.checkNotNullExpressionValue(obtainStyledAttributes, "obtainStyledAttributes(...)");
        this.f91999a = obtainStyledAttributes.getInt(0, 16);
        requestLayout();
        obtainStyledAttributes.recycle();
    }

    private final int a(View view, a aVar, int i11) {
        int paddingTop = (i11 - getPaddingTop()) - getPaddingBottom();
        int a11 = (aVar.a() != -1 ? aVar.a() : this.f91999a) & 112;
        if (a11 == 16 || a11 == 17) {
            return C3124a.a((paddingTop - view.getMeasuredHeight()) - ((ViewGroup.MarginLayoutParams) aVar).topMargin, ((ViewGroup.MarginLayoutParams) aVar).bottomMargin, 2, getPaddingTop() + ((ViewGroup.MarginLayoutParams) aVar).topMargin);
        }
        if (a11 != 48 && a11 == 80) {
            return ((i11 - getPaddingBottom()) - ((ViewGroup.MarginLayoutParams) aVar).bottomMargin) - view.getMeasuredHeight();
        }
        return getPaddingTop() + ((ViewGroup.MarginLayoutParams) aVar).topMargin;
    }

    private final v<View, View, View> b() {
        int childCount = getChildCount();
        View view = null;
        View view2 = null;
        View view3 = null;
        for (int i11 = 0; i11 < childCount; i11++) {
            View childAt = getChildAt(i11);
            if (childAt.getVisibility() != 8) {
                ViewGroup.LayoutParams layoutParams = childAt.getLayoutParams();
                Intrinsics.g(layoutParams, "null cannot be cast to non-null type ru.ozon.android.messenger.utils.view.TripleBalancedCenterLayout.LayoutParams");
                int b11 = ((a) layoutParams).b();
                if (b11 != 1) {
                    if (b11 != 2) {
                        if (b11 == 3 && view2 == null) {
                            view2 = childAt;
                        }
                    } else if (view3 == null) {
                        view3 = childAt;
                    }
                } else if (view == null) {
                    view = childAt;
                }
            }
        }
        return new v<>(view, view3, view2);
    }

    private final int c(View view, int i11, int i12) {
        if (view == null || view.getVisibility() == 8) {
            return 0;
        }
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        Intrinsics.g(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        measureChildWithMargins(view, i11, 0, i12, 0);
        return view.getMeasuredWidth() + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin;
    }

    @Override // android.view.ViewGroup
    protected final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof a;
    }

    @Override // android.view.ViewGroup
    @NotNull
    protected final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new a();
    }

    @Override // android.view.ViewGroup
    @NotNull
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        return new a(context, attributeSet);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected final void onLayout(boolean z11, int i11, int i12, int i13, int i14) {
        int i15 = i13 - i11;
        int i16 = i14 - i12;
        v<View, View, View> b11 = b();
        View e11 = b11.e();
        View f7 = b11.f();
        View g10 = b11.g();
        if (e11 != null) {
            ViewGroup.LayoutParams layoutParams = e11.getLayoutParams();
            Intrinsics.g(layoutParams, "null cannot be cast to non-null type ru.ozon.android.messenger.utils.view.TripleBalancedCenterLayout.LayoutParams");
            a aVar = (a) layoutParams;
            int a11 = a(e11, aVar, i16);
            int paddingLeft = getPaddingLeft() + ((ViewGroup.MarginLayoutParams) aVar).leftMargin;
            e11.layout(paddingLeft, a11, e11.getMeasuredWidth() + paddingLeft, e11.getMeasuredHeight() + a11);
        }
        if (g10 != null) {
            ViewGroup.LayoutParams layoutParams2 = g10.getLayoutParams();
            Intrinsics.g(layoutParams2, "null cannot be cast to non-null type ru.ozon.android.messenger.utils.view.TripleBalancedCenterLayout.LayoutParams");
            a aVar2 = (a) layoutParams2;
            int a12 = a(g10, aVar2, i16);
            int paddingRight = (i15 - getPaddingRight()) - ((ViewGroup.MarginLayoutParams) aVar2).rightMargin;
            g10.layout(paddingRight - g10.getMeasuredWidth(), a12, paddingRight, g10.getMeasuredHeight() + a12);
        }
        if (f7 != null) {
            ViewGroup.LayoutParams layoutParams3 = f7.getLayoutParams();
            Intrinsics.g(layoutParams3, "null cannot be cast to non-null type ru.ozon.android.messenger.utils.view.TripleBalancedCenterLayout.LayoutParams");
            int a13 = a(f7, (a) layoutParams3, i16);
            int measuredWidth = (i15 / 2) - (f7.getMeasuredWidth() / 2);
            f7.layout(measuredWidth, a13, f7.getMeasuredWidth() + measuredWidth, f7.getMeasuredHeight() + a13);
        }
    }

    @Override // android.view.View
    protected final void onMeasure(int i11, int i12) {
        int size = View.MeasureSpec.getSize(i11);
        v<View, View, View> b11 = b();
        View e11 = b11.e();
        View f7 = b11.f();
        int max = Math.max(c(e11, i11, i12), c(b11.g(), i11, i12));
        ViewGroup.LayoutParams layoutParams = f7 != null ? f7.getLayoutParams() : null;
        Intrinsics.g(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        int paddingLeft = (((size - getPaddingLeft()) - getPaddingRight()) - (max * 2)) - (marginLayoutParams.leftMargin + marginLayoutParams.rightMargin);
        if (paddingLeft < 0) {
            paddingLeft = 0;
        }
        measureChildWithMargins(f7, View.MeasureSpec.makeMeasureSpec(paddingLeft, LinearLayoutManager.INVALID_OFFSET), 0, i12, 0);
        int paddingBottom = getPaddingBottom() + getPaddingTop();
        int childCount = getChildCount();
        for (int i13 = 0; i13 < childCount; i13++) {
            View childAt = getChildAt(i13);
            if (childAt.getVisibility() != 8) {
                ViewGroup.LayoutParams layoutParams2 = childAt.getLayoutParams();
                Intrinsics.g(layoutParams2, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
                ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) layoutParams2;
                paddingBottom = Math.max(paddingBottom, childAt.getMeasuredHeight() + getPaddingBottom() + getPaddingTop() + marginLayoutParams2.topMargin + marginLayoutParams2.bottomMargin);
            }
        }
        setMeasuredDimension(View.resolveSize(size, i11), View.resolveSize(paddingBottom, i12));
    }

    @Override // android.view.ViewGroup
    @NotNull
    protected final ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof a ? new a((a) layoutParams) : layoutParams instanceof ViewGroup.MarginLayoutParams ? new a((ViewGroup.MarginLayoutParams) layoutParams) : new a(layoutParams);
    }

    public static final class a extends ViewGroup.MarginLayoutParams {

        /* renamed from: a, reason: collision with root package name */
        private int f92000a;

        /* renamed from: b, reason: collision with root package name */
        private int f92001b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(@NotNull Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            Intrinsics.checkNotNullParameter(context, "context");
            this.f92000a = -1;
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.m_TripleBalancedCenterLayout);
            Intrinsics.checkNotNullExpressionValue(obtainStyledAttributes, "obtainStyledAttributes(...)");
            this.f92000a = obtainStyledAttributes.getInt(R$styleable.m_TripleBalancedCenterLayout_android_layout_gravity, -1);
            this.f92001b = obtainStyledAttributes.getInt(R$styleable.m_TripleBalancedCenterLayout_m_layout_role, 0);
            obtainStyledAttributes.recycle();
        }

        public final int a() {
            return this.f92000a;
        }

        public final int b() {
            return this.f92001b;
        }

        public a() {
            super(-2, -2);
            this.f92000a = -1;
        }

        public a(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
            this.f92000a = -1;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(@NotNull ViewGroup.MarginLayoutParams source) {
            super(source);
            Intrinsics.checkNotNullParameter(source, "source");
            this.f92000a = -1;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(@NotNull a source) {
            super((ViewGroup.MarginLayoutParams) source);
            Intrinsics.checkNotNullParameter(source, "source");
            this.f92000a = -1;
        }
    }
}
