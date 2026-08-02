package com.google.android.material.progressindicator;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.material.R$attr;
import com.google.android.material.R$style;
import com.google.android.material.R$styleable;
import java.util.WeakHashMap;
import xsna.a8z;
import xsna.b0u0;
import xsna.d8z;
import xsna.fpo0;
import xsna.h5m;
import xsna.iut0;
import xsna.m8z;
import xsna.ptw;
import xsna.w7z;

/* loaded from: classes13.dex */
public class LinearProgressIndicator extends a<m8z> {
    public static final int o = R$style.Widget_MaterialComponents_LinearProgressIndicator;

    public LinearProgressIndicator(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet, R$attr.linearProgressIndicatorStyle, o);
        m8z m8zVar = (m8z) this.b;
        w7z w7zVar = new w7z(m8zVar);
        w7zVar.b = 300.0f;
        Context context2 = getContext();
        setIndeterminateDrawable(new ptw(context2, m8zVar, w7zVar, m8zVar.h == 0 ? new a8z(m8zVar) : new d8z(context2, m8zVar)));
        setProgressDrawable(new h5m(getContext(), m8zVar, w7zVar));
    }

    @Override // com.google.android.material.progressindicator.a
    public final m8z a(@NonNull Context context, @NonNull AttributeSet attributeSet) {
        int i = R$attr.linearProgressIndicatorStyle;
        int i2 = o;
        m8z m8zVar = new m8z(context, attributeSet, i, i2);
        int[] iArr = R$styleable.LinearProgressIndicator;
        int i3 = R$attr.linearProgressIndicatorStyle;
        fpo0.a(context, attributeSet, i3, i2);
        fpo0.b(context, attributeSet, iArr, i3, i2, new int[0]);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr, i3, i2);
        m8zVar.h = obtainStyledAttributes.getInt(R$styleable.LinearProgressIndicator_indeterminateAnimationType, 1);
        m8zVar.i = obtainStyledAttributes.getInt(R$styleable.LinearProgressIndicator_indicatorDirectionLinear, 0);
        m8zVar.k = Math.min(obtainStyledAttributes.getDimensionPixelSize(R$styleable.LinearProgressIndicator_trackStopIndicatorSize, 0), m8zVar.a);
        obtainStyledAttributes.recycle();
        m8zVar.a();
        m8zVar.j = m8zVar.i == 1;
        return m8zVar;
    }

    @Override // com.google.android.material.progressindicator.a
    public final void b(int i, boolean z) {
        S s = this.b;
        if (s != 0 && ((m8z) s).h == 0 && isIndeterminate()) {
            return;
        }
        super.b(i, z);
    }

    public int getIndeterminateAnimationType() {
        return ((m8z) this.b).h;
    }

    public int getIndicatorDirection() {
        return ((m8z) this.b).i;
    }

    public int getTrackStopIndicatorSize() {
        return ((m8z) this.b).k;
    }

    @Override // android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        S s = this.b;
        m8z m8zVar = (m8z) s;
        boolean z2 = true;
        if (((m8z) s).i != 1) {
            WeakHashMap<View, b0u0> weakHashMap = iut0.a;
            if ((getLayoutDirection() != 1 || ((m8z) s).i != 2) && (getLayoutDirection() != 0 || ((m8z) s).i != 3)) {
                z2 = false;
            }
        }
        m8zVar.j = z2;
    }

    @Override // android.widget.ProgressBar, android.view.View
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        int paddingRight = i - (getPaddingRight() + getPaddingLeft());
        int paddingBottom = i2 - (getPaddingBottom() + getPaddingTop());
        ptw<m8z> indeterminateDrawable = getIndeterminateDrawable();
        if (indeterminateDrawable != null) {
            indeterminateDrawable.setBounds(0, 0, paddingRight, paddingBottom);
        }
        h5m<m8z> progressDrawable = getProgressDrawable();
        if (progressDrawable != null) {
            progressDrawable.setBounds(0, 0, paddingRight, paddingBottom);
        }
    }

    public void setIndeterminateAnimationType(int i) {
        S s = this.b;
        if (((m8z) s).h == i) {
            return;
        }
        if (c() && isIndeterminate()) {
            throw new IllegalStateException("Cannot change indeterminate animation type while the progress indicator is show in indeterminate mode.");
        }
        ((m8z) s).h = i;
        ((m8z) s).a();
        if (i == 0) {
            ptw<m8z> indeterminateDrawable = getIndeterminateDrawable();
            a8z a8zVar = new a8z((m8z) s);
            indeterminateDrawable.n = a8zVar;
            a8zVar.a = indeterminateDrawable;
        } else {
            ptw<m8z> indeterminateDrawable2 = getIndeterminateDrawable();
            d8z d8zVar = new d8z(getContext(), (m8z) s);
            indeterminateDrawable2.n = d8zVar;
            d8zVar.a = indeterminateDrawable2;
        }
        invalidate();
    }

    @Override // com.google.android.material.progressindicator.a
    public void setIndicatorColor(@NonNull int... iArr) {
        super.setIndicatorColor(iArr);
        ((m8z) this.b).a();
    }

    public void setIndicatorDirection(int i) {
        S s = this.b;
        ((m8z) s).i = i;
        m8z m8zVar = (m8z) s;
        boolean z = true;
        if (i != 1) {
            WeakHashMap<View, b0u0> weakHashMap = iut0.a;
            if ((getLayoutDirection() != 1 || ((m8z) s).i != 2) && (getLayoutDirection() != 0 || i != 3)) {
                z = false;
            }
        }
        m8zVar.j = z;
        invalidate();
    }

    @Override // com.google.android.material.progressindicator.a
    public void setTrackCornerRadius(int i) {
        super.setTrackCornerRadius(i);
        ((m8z) this.b).a();
        invalidate();
    }

    public void setTrackStopIndicatorSize(int i) {
        S s = this.b;
        if (((m8z) s).k != i) {
            ((m8z) s).k = Math.min(i, ((m8z) s).a);
            ((m8z) s).a();
            invalidate();
        }
    }
}
