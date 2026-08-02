package androidx.recyclerview.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import java.util.NoSuchElementException;
import xsna.a9b;
import xsna.ccr;
import xsna.g5z;
import xsna.i5g;
import xsna.pli0;
import xsna.rli0;
import xsna.swe0;
import xsna.vki0;
import xsna.wzs;
import xsna.xl1;

/* compiled from: FillingLinearLayoutManager.kt */
/* loaded from: classes12.dex */
public final class FillingLinearLayoutManager extends LinearLayoutManager {
    public wzs<? super LinearLayoutManager, ? super View, Boolean> r;

    public FillingLinearLayoutManager(Context context) {
        super(1, false);
        this.r = new a9b(2);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public final void measureChildWithMargins(View view, int i, int i2) {
        int paddingTop;
        if (!this.r.invoke(this, view).booleanValue()) {
            super.measureChildWithMargins(view, i, i2);
            return;
        }
        int j = this.mChildHelper.j(view);
        int height = getHeight() - getPaddingBottom();
        if (1 > j || j > getChildCount()) {
            paddingTop = getPaddingTop();
        } else {
            vki0 b = g5z.b(new pli0(Integer.valueOf(getPaddingTop()), rli0.l(new i5g(swe0.m(j - 1, 0)), new xl1(j, 2)), new ccr(this, j, 0), null));
            if (!b.hasNext()) {
                throw new NoSuchElementException("Sequence is empty.");
            }
            Object next = b.next();
            while (b.hasNext()) {
                next = b.next();
            }
            paddingTop = ((Number) next).intValue();
        }
        int i3 = height - paddingTop;
        RecyclerView.p pVar = (RecyclerView.p) view.getLayoutParams();
        if (i3 == 0) {
            i3 = ((ViewGroup.MarginLayoutParams) pVar).height;
        } else if (i3 < 0) {
            i3 = -2;
        }
        ((ViewGroup.MarginLayoutParams) pVar).height = i3;
        super.measureChildWithMargins(view, i, i2);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.o
    public final boolean supportsPredictiveItemAnimations() {
        return false;
    }

    public FillingLinearLayoutManager(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        this.r = new a9b(2);
    }
}
