package androidx.constraintlayout.helper.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.View;
import androidx.constraintlayout.core.widgets.h;
import androidx.constraintlayout.core.widgets.i;
import xsna.a2v;
import xsna.o4u0;

/* loaded from: classes11.dex */
public class MotionPlaceholder extends o4u0 {
    public MotionPlaceholder(Context context) {
        super(context);
    }

    @Override // xsna.o4u0, androidx.constraintlayout.widget.a
    public final void n(AttributeSet attributeSet) {
        super.n(attributeSet);
        this.e = new h();
        t();
    }

    @Override // androidx.constraintlayout.widget.a, android.view.View
    @SuppressLint({"WrongCall"})
    public final void onMeasure(int i, int i2) {
        u(null, i, i2);
    }

    @Override // xsna.o4u0
    public final void u(i iVar, int i, int i2) {
        int mode = View.MeasureSpec.getMode(i);
        int size = View.MeasureSpec.getSize(i);
        int mode2 = View.MeasureSpec.getMode(i2);
        int size2 = View.MeasureSpec.getSize(i2);
        if (iVar == null) {
            setMeasuredDimension(0, 0);
        } else {
            iVar.a0(mode, size, mode2, size2);
            setMeasuredDimension(iVar.E0, iVar.F0);
        }
    }

    public MotionPlaceholder(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public MotionPlaceholder(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    public MotionPlaceholder(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i);
    }

    @Override // androidx.constraintlayout.widget.a
    public final void s(a2v a2vVar, SparseArray sparseArray) {
    }
}
