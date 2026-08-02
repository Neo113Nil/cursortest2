package com.vk.sharing.core.view.grid;

import android.content.ContextWrapper;
import android.view.View;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

/* compiled from: AutoGridLayoutManager.kt */
/* loaded from: classes5.dex */
public final class AutoGridLayoutManager extends GridLayoutManager {
    public final int A;
    public int B;

    public AutoGridLayoutManager(ContextWrapper contextWrapper, int i) {
        super(1);
        this.A = i;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public final void onMeasure(RecyclerView.v vVar, RecyclerView.a0 a0Var, int i, int i2) {
        int size = (View.MeasureSpec.getSize(i) - getPaddingLeft()) - getPaddingRight();
        if (size > 0 && size != this.B) {
            this.B = size;
            int i3 = size / this.A;
            if (i3 < 1) {
                i3 = 1;
            }
            if (this.s != i3) {
                setSpanCount(i3);
            }
        }
        super.onMeasure(vVar, a0Var, i, i2);
    }
}
