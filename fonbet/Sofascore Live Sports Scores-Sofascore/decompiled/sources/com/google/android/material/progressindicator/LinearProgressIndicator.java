package com.google.android.material.progressindicator;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.Pair;
import android.util.TypedValue;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.sofascore.results.R;
import defpackage.a70;
import defpackage.e8b;
import defpackage.k51;
import defpackage.l51;
import defpackage.lb5;
import defpackage.m6k;
import defpackage.my4;
import defpackage.pjf;
import defpackage.t7b;
import defpackage.v0a;
import defpackage.w7b;
import defpackage.y7b;
import java.util.Objects;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public class LinearProgressIndicator extends k51 {
    public LinearProgressIndicator(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.linearProgressIndicatorStyle, R.style.Widget_MaterialComponents_LinearProgressIndicator);
        e8b e8bVar = (e8b) this.a;
        t7b t7bVar = new t7b(e8bVar);
        t7bVar.f = 300.0f;
        t7bVar.o = new Pair(new lb5(), new lb5());
        Context context2 = getContext();
        setIndeterminateDrawable(new v0a(context2, e8bVar, t7bVar, e8bVar.q == 0 ? new w7b(e8bVar) : new y7b(context2, e8bVar)));
        setProgressDrawable(new my4(getContext(), e8bVar, t7bVar));
        this.i = true;
    }

    @Override // defpackage.k51
    public final l51 a(Context context, AttributeSet attributeSet) {
        e8b e8bVar = new e8b(context, attributeSet, R.attr.linearProgressIndicatorStyle, R.style.Widget_MaterialComponents_LinearProgressIndicator);
        m6k.v(context, attributeSet, R.attr.linearProgressIndicatorStyle, R.style.Widget_MaterialComponents_LinearProgressIndicator);
        int[] iArr = pjf.s;
        m6k.w(context, attributeSet, iArr, R.attr.linearProgressIndicatorStyle, R.style.Widget_MaterialComponents_LinearProgressIndicator, new int[0]);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr, R.attr.linearProgressIndicatorStyle, R.style.Widget_MaterialComponents_LinearProgressIndicator);
        e8bVar.q = obtainStyledAttributes.getInt(0, 1);
        e8bVar.r = obtainStyledAttributes.getInt(1, 0);
        e8bVar.t = obtainStyledAttributes.getDimensionPixelSize(4, 0);
        if (obtainStyledAttributes.hasValue(3)) {
            e8bVar.u = Integer.valueOf(obtainStyledAttributes.getDimensionPixelSize(3, 0));
        }
        TypedValue peekValue = obtainStyledAttributes.peekValue(2);
        if (peekValue != null) {
            int i = peekValue.type;
            if (i == 5) {
                e8bVar.v = Math.min(TypedValue.complexToDimensionPixelSize(peekValue.data, obtainStyledAttributes.getResources().getDisplayMetrics()), e8bVar.a / 2);
                e8bVar.x = false;
                e8bVar.y = true;
            } else if (i == 6) {
                e8bVar.w = Math.min(peekValue.getFraction(1.0f, 1.0f), 0.5f);
                e8bVar.x = true;
                e8bVar.y = true;
            }
        }
        obtainStyledAttributes.recycle();
        e8bVar.d();
        e8bVar.s = e8bVar.r == 1;
        return e8bVar;
    }

    @Override // defpackage.k51
    public final void c(int i) {
        l51 l51Var = this.a;
        if (l51Var != null && ((e8b) l51Var).q == 0 && isIndeterminate()) {
            return;
        }
        super.c(i);
    }

    public int getIndeterminateAnimationType() {
        return ((e8b) this.a).q;
    }

    public int getIndicatorDirection() {
        return ((e8b) this.a).r;
    }

    public int getTrackInnerCornerRadius() {
        return ((e8b) this.a).v;
    }

    @Nullable
    public Integer getTrackStopIndicatorPadding() {
        return ((e8b) this.a).u;
    }

    public int getTrackStopIndicatorSize() {
        return ((e8b) this.a).t;
    }

    @Override // defpackage.k51, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        l51 l51Var = this.a;
        e8b e8bVar = (e8b) l51Var;
        boolean z2 = true;
        if (((e8b) l51Var).r != 1 && ((getLayoutDirection() != 1 || ((e8b) l51Var).r != 2) && (getLayoutDirection() != 0 || ((e8b) l51Var).r != 3))) {
            z2 = false;
        }
        e8bVar.s = z2;
    }

    @Override // android.widget.ProgressBar, android.view.View
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        int paddingRight = i - (getPaddingRight() + getPaddingLeft());
        int paddingBottom = i2 - (getPaddingBottom() + getPaddingTop());
        v0a indeterminateDrawable = getIndeterminateDrawable();
        if (indeterminateDrawable != null) {
            indeterminateDrawable.setBounds(0, 0, paddingRight, paddingBottom);
        }
        my4 progressDrawable = getProgressDrawable();
        if (progressDrawable != null) {
            progressDrawable.setBounds(0, 0, paddingRight, paddingBottom);
        }
    }

    public void setIndeterminateAnimationType(int i) {
        l51 l51Var = this.a;
        if (((e8b) l51Var).q == i) {
            return;
        }
        if (d() && isIndeterminate()) {
            a70.r("Cannot change indeterminate animation type while the progress indicator is show in indeterminate mode.");
            return;
        }
        ((e8b) l51Var).q = i;
        ((e8b) l51Var).d();
        if (i == 0) {
            v0a indeterminateDrawable = getIndeterminateDrawable();
            w7b w7bVar = new w7b((e8b) l51Var);
            indeterminateDrawable.o = w7bVar;
            w7bVar.a = indeterminateDrawable;
        } else {
            v0a indeterminateDrawable2 = getIndeterminateDrawable();
            y7b y7bVar = new y7b(getContext(), (e8b) l51Var);
            indeterminateDrawable2.o = y7bVar;
            y7bVar.a = indeterminateDrawable2;
        }
        b();
        invalidate();
    }

    @Override // defpackage.k51
    public void setIndicatorColor(@NonNull int... iArr) {
        super.setIndicatorColor(iArr);
        ((e8b) this.a).d();
    }

    public void setIndicatorDirection(int i) {
        l51 l51Var = this.a;
        ((e8b) l51Var).r = i;
        e8b e8bVar = (e8b) l51Var;
        boolean z = true;
        if (i != 1 && ((getLayoutDirection() != 1 || ((e8b) l51Var).r != 2) && (getLayoutDirection() != 0 || i != 3))) {
            z = false;
        }
        e8bVar.s = z;
        invalidate();
    }

    @Override // defpackage.k51
    public void setTrackCornerRadius(int i) {
        super.setTrackCornerRadius(i);
        ((e8b) this.a).d();
        invalidate();
    }

    public void setTrackInnerCornerRadius(int i) {
        l51 l51Var = this.a;
        if (((e8b) l51Var).v != i) {
            ((e8b) l51Var).v = Math.round(Math.min(i, ((e8b) l51Var).a / 2.0f));
            ((e8b) l51Var).x = false;
            ((e8b) l51Var).y = true;
            ((e8b) l51Var).d();
            invalidate();
        }
    }

    public void setTrackInnerCornerRadiusFraction(float f) {
        l51 l51Var = this.a;
        if (((e8b) l51Var).w != f) {
            ((e8b) l51Var).w = Math.min(f, 0.5f);
            ((e8b) l51Var).x = true;
            ((e8b) l51Var).y = true;
            ((e8b) l51Var).d();
            invalidate();
        }
    }

    public void setTrackStopIndicatorPadding(@Nullable Integer num) {
        l51 l51Var = this.a;
        if (Objects.equals(((e8b) l51Var).u, num)) {
            return;
        }
        ((e8b) l51Var).u = num;
        invalidate();
    }

    public void setTrackStopIndicatorSize(int i) {
        l51 l51Var = this.a;
        if (((e8b) l51Var).t != i) {
            ((e8b) l51Var).t = i;
            ((e8b) l51Var).d();
            invalidate();
        }
    }
}
