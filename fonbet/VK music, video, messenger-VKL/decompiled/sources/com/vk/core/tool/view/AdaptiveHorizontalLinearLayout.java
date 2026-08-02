package com.vk.core.tool.view;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.unity3d.services.UnityAdsConstants;
import com.vk.core.view.components.R$styleable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import xsna.asp;
import xsna.e43;
import xsna.ek0;
import xsna.g5g;
import xsna.hfr;
import xsna.izs;
import xsna.jxt0;
import xsna.rl3;
import xsna.rli0;
import xsna.s3q0;
import xsna.zrp;

/* compiled from: AdaptiveHorizontalLinearLayout.kt */
/* loaded from: classes17.dex */
public class AdaptiveHorizontalLinearLayout extends LinearLayout {

    /* compiled from: AdaptiveHorizontalLinearLayout.kt */
    public static final class a implements izs<View, Boolean> {
        @Override // xsna.izs
        public final Boolean invoke(View view) {
            return Boolean.valueOf(((LayoutParams) view.getLayoutParams()).a != LayoutParams.Adaptivity.NONE);
        }
    }

    /* compiled from: AdaptiveHorizontalLinearLayout.kt */
    public static final class b implements izs<View, Boolean> {
        @Override // xsna.izs
        public final Boolean invoke(View view) {
            return Boolean.valueOf(((LayoutParams) view.getLayoutParams()).a == LayoutParams.Adaptivity.SHRINK);
        }
    }

    /* compiled from: AdaptiveHorizontalLinearLayout.kt */
    public static final class c implements izs<View, Boolean> {
        @Override // xsna.izs
        public final Boolean invoke(View view) {
            return Boolean.valueOf(((LayoutParams) view.getLayoutParams()).a == LayoutParams.Adaptivity.GROW_SHRINK);
        }
    }

    public static LayoutParams b(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams instanceof LayoutParams) {
            LayoutParams layoutParams2 = (LayoutParams) layoutParams;
            LayoutParams layoutParams3 = new LayoutParams((LinearLayout.LayoutParams) layoutParams2);
            layoutParams3.a = LayoutParams.Adaptivity.NONE;
            layoutParams3.a = layoutParams2.a;
            return layoutParams3;
        }
        if (layoutParams instanceof LinearLayout.LayoutParams) {
            return new LayoutParams((LinearLayout.LayoutParams) layoutParams);
        }
        if (!(layoutParams instanceof ViewGroup.MarginLayoutParams)) {
            return new LayoutParams(layoutParams);
        }
        LayoutParams layoutParams4 = new LayoutParams((ViewGroup.MarginLayoutParams) layoutParams);
        layoutParams4.a = LayoutParams.Adaptivity.NONE;
        return layoutParams4;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v5, types: [java.lang.Enum] */
    @Override // android.widget.LinearLayout, android.view.ViewGroup
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        Context context = getContext();
        LayoutParams layoutParams = new LayoutParams(context, attributeSet);
        layoutParams.a = LayoutParams.Adaptivity.NONE;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.a);
        LayoutParams.Adaptivity adaptivity = layoutParams.a;
        ?? r2 = (Enum) rl3.S(obtainStyledAttributes.getInt(0, adaptivity.ordinal()), LayoutParams.Adaptivity.values());
        if (r2 != 0) {
            adaptivity = r2;
        }
        layoutParams.a = adaptivity;
        s3q0 s3q0Var = s3q0.a;
        obtainStyledAttributes.recycle();
        return layoutParams;
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof LayoutParams;
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup
    public final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        LayoutParams layoutParams = new LayoutParams(-2, -2);
        layoutParams.a = LayoutParams.Adaptivity.NONE;
        return layoutParams;
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        int mode = View.MeasureSpec.getMode(i);
        int size = View.MeasureSpec.getSize(i);
        if (mode == 0) {
            super.onMeasure(i, i2);
            return;
        }
        hfr j = rli0.j(new jxt0(this), new a());
        hfr j2 = rli0.j(j, new b());
        hfr.a aVar = new hfr.a(rli0.j(j, new c()));
        int i3 = 0;
        int i4 = 0;
        while (aVar.hasNext()) {
            Object next = aVar.next();
            int i5 = i4 + 1;
            if (i4 < 0) {
                e43.t();
                throw null;
            }
            LayoutParams layoutParams = (LayoutParams) ((View) next).getLayoutParams();
            ((LinearLayout.LayoutParams) layoutParams).width = 0;
            ((LinearLayout.LayoutParams) layoutParams).weight = 1.0f;
            i4 = i5;
        }
        if (rli0.g(j2) == 0) {
            super.onMeasure(i, i2);
            return;
        }
        int i6 = 0;
        int i7 = 0;
        int i8 = 0;
        int i9 = 0;
        while (true) {
            if (!(i9 < getChildCount())) {
                if (size >= i6) {
                    hfr.a aVar2 = new hfr.a(j2);
                    while (aVar2.hasNext()) {
                        Object next2 = aVar2.next();
                        int i10 = i3 + 1;
                        if (i3 < 0) {
                            e43.t();
                            throw null;
                        }
                        View view = (View) next2;
                        LayoutParams layoutParams2 = (LayoutParams) view.getLayoutParams();
                        ((LinearLayout.LayoutParams) layoutParams2).width = view.getMeasuredWidth();
                        ((LinearLayout.LayoutParams) layoutParams2).weight = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
                        i3 = i10;
                    }
                } else if (size >= i8) {
                    int i11 = size - i8;
                    int g = rli0.g(j);
                    ek0 ek0Var = new ek0(0);
                    List B = rli0.B(j);
                    g5g.L(B, ek0Var);
                    Iterator it = ((ArrayList) B).iterator();
                    int i12 = 0;
                    while (it.hasNext()) {
                        Object next3 = it.next();
                        int i13 = i12 + 1;
                        if (i12 < 0) {
                            e43.t();
                            throw null;
                        }
                        View view2 = (View) next3;
                        LayoutParams layoutParams3 = (LayoutParams) view2.getLayoutParams();
                        int i14 = i11 / (g - i12);
                        int measuredWidth = view2.getMeasuredWidth();
                        int i15 = ((LinearLayout.LayoutParams) layoutParams3).leftMargin;
                        int i16 = ((LinearLayout.LayoutParams) layoutParams3).rightMargin;
                        int i17 = measuredWidth + i15 + i16;
                        if (i17 <= i14) {
                            i14 = i17;
                        }
                        i11 -= i14;
                        if (layoutParams3.a == LayoutParams.Adaptivity.SHRINK) {
                            ((LinearLayout.LayoutParams) layoutParams3).weight = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
                            int i18 = i14 - (i15 + i16);
                            if (i18 < 0) {
                                i18 = 0;
                            }
                            ((LinearLayout.LayoutParams) layoutParams3).width = i18;
                        }
                        i12 = i13;
                    }
                }
                super.onMeasure(i, i2);
                return;
            }
            int i19 = i9 + 1;
            View childAt = getChildAt(i9);
            if (childAt == null) {
                throw new IndexOutOfBoundsException();
            }
            int i20 = i7 + 1;
            if (i7 < 0) {
                e43.t();
                throw null;
            }
            LayoutParams layoutParams4 = (LayoutParams) childAt.getLayoutParams();
            childAt.measure(0, i2);
            int measuredWidth2 = childAt.getMeasuredWidth() + ((LinearLayout.LayoutParams) layoutParams4).leftMargin + ((LinearLayout.LayoutParams) layoutParams4).rightMargin;
            i6 += measuredWidth2;
            if (layoutParams4.a == LayoutParams.Adaptivity.NONE) {
                i8 += measuredWidth2;
            }
            i9 = i19;
            i7 = i20;
        }
    }

    /* compiled from: AdaptiveHorizontalLinearLayout.kt */
    public static final class LayoutParams extends LinearLayout.LayoutParams {
        public Adaptivity a;

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        /* compiled from: AdaptiveHorizontalLinearLayout.kt */
        public static final class Adaptivity {
            private static final /* synthetic */ zrp $ENTRIES;
            private static final /* synthetic */ Adaptivity[] $VALUES;
            public static final Adaptivity GROW_SHRINK;
            public static final Adaptivity NONE;
            public static final Adaptivity SHRINK;

            static {
                Adaptivity adaptivity = new Adaptivity("NONE", 0);
                NONE = adaptivity;
                Adaptivity adaptivity2 = new Adaptivity("SHRINK", 1);
                SHRINK = adaptivity2;
                Adaptivity adaptivity3 = new Adaptivity("GROW_SHRINK", 2);
                GROW_SHRINK = adaptivity3;
                Adaptivity[] adaptivityArr = {adaptivity, adaptivity2, adaptivity3};
                $VALUES = adaptivityArr;
                $ENTRIES = new asp(adaptivityArr);
            }

            public Adaptivity() {
                throw null;
            }

            public static Adaptivity valueOf(String str) {
                return (Adaptivity) Enum.valueOf(Adaptivity.class, str);
            }

            public static Adaptivity[] values() {
                return (Adaptivity[]) $VALUES.clone();
            }
        }

        public LayoutParams(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
            this.a = Adaptivity.NONE;
        }

        public LayoutParams(LinearLayout.LayoutParams layoutParams) {
            super(layoutParams);
            this.a = Adaptivity.NONE;
        }
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup
    public final /* bridge */ /* synthetic */ ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return b(layoutParams);
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup
    public final LinearLayout.LayoutParams generateDefaultLayoutParams() {
        LayoutParams layoutParams = new LayoutParams(-2, -2);
        layoutParams.a = LayoutParams.Adaptivity.NONE;
        return layoutParams;
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup
    public final /* bridge */ /* synthetic */ LinearLayout.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return b(layoutParams);
    }
}
