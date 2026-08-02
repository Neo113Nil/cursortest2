package com.vk.im.ui.views;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.vk.im.engine.models.InfoBar;
import com.vk.ui.R$styleable;
import com.vkontakte.android.R;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.EmptyList;
import xsna.a2u0;
import xsna.bwt0;
import xsna.fh1;
import xsna.iah0;
import xsna.izs;
import xsna.kkm;
import xsna.s3q0;

/* compiled from: InfoBarButtonsView.kt */
/* loaded from: classes2.dex */
public final class InfoBarButtonsView extends ViewGroup {
    public LayoutInflater b;
    public int c;
    public int d;
    public int e;
    public List<InfoBar.Button> f;
    public izs<? super InfoBar.Button, s3q0> g;
    public kkm h;

    /* compiled from: InfoBarButtonsView.kt */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        static {
            int[] iArr = new int[InfoBar.ButtonLayout.values().length];
            try {
                iArr[InfoBar.ButtonLayout.PRIMARY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[InfoBar.ButtonLayout.SECONDARY.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[InfoBar.ButtonLayout.TERTIARY.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[InfoBar.ButtonStyle.values().length];
            try {
                iArr2[InfoBar.ButtonStyle.DESTRUCTIVE.ordinal()] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$1 = iArr2;
        }
    }

    public InfoBarButtonsView(Context context) {
        super(context);
        this.f = EmptyList.b;
        this.h = new kkm(0);
        c(this, context, null, 0, 14);
    }

    public static /* synthetic */ void c(InfoBarButtonsView infoBarButtonsView, Context context, AttributeSet attributeSet, int i, int i2) {
        if ((i2 & 2) != 0) {
            attributeSet = null;
        }
        if ((i2 & 4) != 0) {
            i = 0;
        }
        infoBarButtonsView.b(context, attributeSet, i, 0);
    }

    public final float a(InfoBar.Button button) {
        return (this.f.size() == 1 && button.c == InfoBar.ButtonLayout.TERTIARY) ? 15.0f : 14.0f;
    }

    public final void b(Context context, AttributeSet attributeSet, int i, int i2) {
        this.b = LayoutInflater.from(context);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.m, i, i2);
        setMaximumWidth(obtainStyledAttributes.getDimensionPixelSize(0, Integer.MAX_VALUE));
        setMaximumHeight(obtainStyledAttributes.getDimensionPixelSize(1, Integer.MAX_VALUE));
        setDividerSize(obtainStyledAttributes.getDimensionPixelSize(2, 0));
        obtainStyledAttributes.recycle();
    }

    public final void d() {
        boolean z;
        TextView textView;
        removeAllViews();
        List<InfoBar.Button> list = this.f;
        if (!(list instanceof Collection) || !list.isEmpty()) {
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                if (((InfoBar.Button) it.next()).c != InfoBar.ButtonLayout.TERTIARY) {
                    z = false;
                    break;
                }
            }
        }
        z = true;
        int a2 = z ? 0 : iah0.a(6);
        int a3 = z ? 0 : iah0.a(4);
        for (InfoBar.Button button : this.f) {
            InfoBar.ButtonLayout buttonLayout = button.c;
            InfoBar.ButtonStyle buttonStyle = button.e;
            String str = button.b;
            int i = a.$EnumSwitchMapping$0[buttonLayout.ordinal()];
            if (i == 1) {
                LayoutInflater layoutInflater = this.b;
                textView = (TextView) (layoutInflater != null ? layoutInflater : null).inflate(R.layout.vkim_dialog_bar_button_primary, (ViewGroup) this, false);
                textView.setText(str);
                textView.setTextSize(a(button));
                textView.setTextColor(this.h.f(R.attr.vk_legacy_button_primary_foreground));
            } else if (i == 2) {
                LayoutInflater layoutInflater2 = this.b;
                textView = (TextView) (layoutInflater2 != null ? layoutInflater2 : null).inflate(R.layout.vkim_dialog_bar_button_secondary, (ViewGroup) this, false);
                textView.setText(str);
                textView.setTextSize(a(button));
                textView.setTextColor(a.$EnumSwitchMapping$1[buttonStyle.ordinal()] == 1 ? this.h.f(R.attr.vk_legacy_button_secondary_destructive_foreground) : this.h.f(R.attr.vk_legacy_button_secondary_foreground));
            } else {
                if (i != 3) {
                    throw new NoWhenBranchMatchedException();
                }
                LayoutInflater layoutInflater3 = this.b;
                textView = (TextView) (layoutInflater3 != null ? layoutInflater3 : null).inflate(R.layout.vkim_dialog_bar_button_tertiary, (ViewGroup) this, false);
                textView.setText(str);
                textView.setTextSize(a(button));
                textView.setTextColor(a.$EnumSwitchMapping$1[buttonStyle.ordinal()] == 1 ? this.h.f(R.attr.vk_legacy_button_secondary_destructive_foreground) : this.h.f(R.attr.vk_legacy_text_link));
            }
            ViewGroup.MarginLayoutParams marginLayoutParams = new ViewGroup.MarginLayoutParams(-2, -2);
            marginLayoutParams.setMargins(0, a2, 0, a3);
            bwt0.i0(textView, new fh1(14, this, button));
            addView(textView, marginLayoutParams);
        }
        requestLayout();
        invalidate();
    }

    public final List<InfoBar.Button> getButtons() {
        return this.f;
    }

    public final kkm getDialogThemeBinder() {
        return this.h;
    }

    public final int getDividerSize() {
        return this.e;
    }

    public final int getMaximumHeight() {
        return this.d;
    }

    public final int getMaximumWidth() {
        return this.c;
    }

    public final izs<InfoBar.Button, s3q0> getOnButtonClickListener() {
        return this.g;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int paddingLeft = getPaddingLeft();
        int childCount = getChildCount();
        for (int i5 = 0; i5 < childCount; i5++) {
            View childAt = getChildAt(i5);
            int P = bwt0.P(childAt) + getPaddingTop();
            childAt.layout(paddingLeft, P, childAt.getMeasuredWidth() + paddingLeft, childAt.getMeasuredHeight() + P);
            paddingLeft = childAt.getRight() + this.e;
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        int paddingRight = getPaddingRight() + getPaddingLeft();
        int paddingBottom = getPaddingBottom() + getPaddingTop();
        int max = Math.max(0, (getChildCount() - 1) * this.e) + paddingRight;
        if (getChildCount() == 0) {
            setMeasuredDimension(max, paddingBottom);
            return;
        }
        int mode = View.MeasureSpec.getMode(i);
        int i3 = Integer.MAX_VALUE;
        int size = mode != Integer.MIN_VALUE ? (mode == 0 || mode != 1073741824) ? Integer.MAX_VALUE : View.MeasureSpec.getSize(i) : View.MeasureSpec.getSize(i);
        int mode2 = View.MeasureSpec.getMode(i2);
        if (mode2 == Integer.MIN_VALUE) {
            i3 = View.MeasureSpec.getSize(i2);
        } else if (mode2 != 0 && mode2 == 1073741824) {
            i3 = View.MeasureSpec.getSize(i2);
        }
        int min = Math.min(Math.max(0, size - max), this.c);
        int min2 = Math.min(Math.max(0, i3 - paddingBottom), this.d);
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
        int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(0, 0);
        int childCount = getChildCount();
        for (int i4 = 0; i4 < childCount; i4++) {
            int i5 = a2u0.a;
            a2u0.c(getChildAt(i4), makeMeasureSpec, 0, makeMeasureSpec2);
        }
        int childCount2 = getChildCount();
        int i6 = 0;
        for (int i7 = 0; i7 < childCount2; i7++) {
            i6 += bwt0.v0(getChildAt(i7));
        }
        int i8 = i6 + max;
        int childCount3 = getChildCount();
        int i9 = 0;
        for (int i10 = 0; i10 < childCount3; i10++) {
            i9 = Math.max(i9, bwt0.u0(getChildAt(i10)));
        }
        int i11 = i9 + paddingBottom;
        if (i8 > min || i11 > min2) {
            int childCount4 = min / getChildCount();
            int childCount5 = getChildCount();
            int i12 = 0;
            int i13 = 0;
            for (int i14 = 0; i14 < childCount5; i14++) {
                View childAt = getChildAt(i14);
                if (childAt.getMeasuredWidth() <= childCount4) {
                    i13 += childAt.getMeasuredWidth();
                    i12++;
                }
            }
            int childCount6 = getChildCount() - i12;
            if (childCount6 != 0) {
                int makeMeasureSpec3 = View.MeasureSpec.makeMeasureSpec((min - i13) / childCount6, Integer.MIN_VALUE);
                int makeMeasureSpec4 = View.MeasureSpec.makeMeasureSpec(min2, Integer.MIN_VALUE);
                int childCount7 = getChildCount();
                for (int i15 = 0; i15 < childCount7; i15++) {
                    View childAt2 = getChildAt(i15);
                    if (childAt2.getMeasuredWidth() > childCount4) {
                        a2u0.c(childAt2, makeMeasureSpec3, 0, makeMeasureSpec4);
                    }
                }
            }
            int childCount8 = getChildCount();
            int i16 = 0;
            for (int i17 = 0; i17 < childCount8; i17++) {
                i16 += bwt0.v0(getChildAt(i17));
            }
            i8 = i16 + max;
            int childCount9 = getChildCount();
            int i18 = 0;
            for (int i19 = 0; i19 < childCount9; i19++) {
                i18 = Math.max(i18, bwt0.u0(getChildAt(i19)));
            }
            i11 = i18 + paddingBottom;
        }
        setMeasuredDimension(i8, i11);
    }

    public final void setButtons(List<InfoBar.Button> list) {
        this.f = list;
        d();
    }

    public final void setDialogThemeBinder(kkm kkmVar) {
        this.h = kkmVar;
        d();
    }

    public final void setDividerSize(int i) {
        this.e = i;
        requestLayout();
        invalidate();
    }

    public final void setMaximumHeight(int i) {
        this.d = i;
        requestLayout();
        invalidate();
    }

    public final void setMaximumWidth(int i) {
        this.c = i;
        requestLayout();
        invalidate();
    }

    public final void setOnButtonClickListener(izs<? super InfoBar.Button, s3q0> izsVar) {
        this.g = izsVar;
    }

    public InfoBarButtonsView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f = EmptyList.b;
        this.h = new kkm(0);
        c(this, context, attributeSet, 0, 12);
    }

    public InfoBarButtonsView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f = EmptyList.b;
        this.h = new kkm(0);
        c(this, context, attributeSet, i, 8);
    }

    public InfoBarButtonsView(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        this.f = EmptyList.b;
        this.h = new kkm(0);
        b(context, attributeSet, i, i2);
    }
}
