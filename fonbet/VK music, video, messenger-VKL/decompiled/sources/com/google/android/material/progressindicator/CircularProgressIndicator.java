package com.google.android.material.progressindicator;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.material.R$attr;
import com.google.android.material.R$dimen;
import com.google.android.material.R$drawable;
import com.google.android.material.R$style;
import com.google.android.material.R$styleable;
import xsna.elr0;
import xsna.fpo0;
import xsna.gdc;
import xsna.h5m;
import xsna.jdc;
import xsna.ptw;
import xsna.qdc;
import xsna.qm10;

/* loaded from: classes13.dex */
public class CircularProgressIndicator extends a<qdc> {
    public static final int o = R$style.Widget_MaterialComponents_CircularProgressIndicator;

    public CircularProgressIndicator(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet, R$attr.circularProgressIndicatorStyle, o);
        qdc qdcVar = (qdc) this.b;
        gdc gdcVar = new gdc(qdcVar);
        Context context2 = getContext();
        ptw ptwVar = new ptw(context2, qdcVar, gdcVar, new jdc(qdcVar));
        ptwVar.o = elr0.a(R$drawable.indeterminate_static, null, context2.getResources());
        setIndeterminateDrawable(ptwVar);
        setProgressDrawable(new h5m(getContext(), qdcVar, gdcVar));
    }

    @Override // com.google.android.material.progressindicator.a
    public final qdc a(@NonNull Context context, @NonNull AttributeSet attributeSet) {
        int i = R$attr.circularProgressIndicatorStyle;
        int i2 = o;
        qdc qdcVar = new qdc(context, attributeSet, i, i2);
        int dimensionPixelSize = context.getResources().getDimensionPixelSize(R$dimen.mtrl_progress_circular_size_medium);
        int dimensionPixelSize2 = context.getResources().getDimensionPixelSize(R$dimen.mtrl_progress_circular_inset_medium);
        int[] iArr = R$styleable.CircularProgressIndicator;
        fpo0.a(context, attributeSet, i, i2);
        fpo0.b(context, attributeSet, iArr, i, i2, new int[0]);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr, i, i2);
        qdcVar.h = Math.max(qm10.c(context, obtainStyledAttributes, R$styleable.CircularProgressIndicator_indicatorSize, dimensionPixelSize), qdcVar.a * 2);
        qdcVar.i = qm10.c(context, obtainStyledAttributes, R$styleable.CircularProgressIndicator_indicatorInset, dimensionPixelSize2);
        qdcVar.j = obtainStyledAttributes.getInt(R$styleable.CircularProgressIndicator_indicatorDirectionCircular, 0);
        obtainStyledAttributes.recycle();
        qdcVar.a();
        return qdcVar;
    }

    public int getIndicatorDirection() {
        return ((qdc) this.b).j;
    }

    public int getIndicatorInset() {
        return ((qdc) this.b).i;
    }

    public int getIndicatorSize() {
        return ((qdc) this.b).h;
    }

    public void setIndicatorDirection(int i) {
        ((qdc) this.b).j = i;
        invalidate();
    }

    public void setIndicatorInset(int i) {
        S s = this.b;
        if (((qdc) s).i != i) {
            ((qdc) s).i = i;
            invalidate();
        }
    }

    public void setIndicatorSize(int i) {
        int max = Math.max(i, getTrackThickness() * 2);
        S s = this.b;
        if (((qdc) s).h != max) {
            ((qdc) s).h = max;
            ((qdc) s).a();
            requestLayout();
            invalidate();
        }
    }

    @Override // com.google.android.material.progressindicator.a
    public void setTrackThickness(int i) {
        super.setTrackThickness(i);
        ((qdc) this.b).a();
    }
}
