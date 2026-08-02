package com.vk.superapp.ui.views.horizontalscroll;

import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.jvm.internal.Ref$IntRef;
import xsna.c3b;
import xsna.eni0;
import xsna.iiu0;
import xsna.izs;
import xsna.s3q0;

/* compiled from: WidthSpreaderLayoutManager.kt */
/* loaded from: classes6.dex */
public abstract class WidthSpreaderLayoutManager extends LinearLayoutManager {
    public RecyclerView r;

    public static /* synthetic */ void Q(WidthSpreaderLayoutManager widthSpreaderLayoutManager, izs izsVar) {
        widthSpreaderLayoutManager.P(new iiu0(8), izsVar);
    }

    public void P(izs<? super Integer, Boolean> izsVar, izs<? super View, s3q0> izsVar2) {
        View childAt;
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            if (izsVar.invoke(Integer.valueOf(i)).booleanValue() && (childAt = getChildAt(i)) != null) {
                izsVar2.invoke(childAt);
            }
        }
    }

    public abstract void S(int i);

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public final void onAttachedToWindow(RecyclerView recyclerView) {
        super.onAttachedToWindow(recyclerView);
        this.r = recyclerView;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.o
    public final void onDetachedFromWindow(RecyclerView recyclerView, RecyclerView.v vVar) {
        super.onDetachedFromWindow(recyclerView, vVar);
        this.r = null;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.o
    public void onLayoutChildren(RecyclerView.v vVar, RecyclerView.a0 a0Var) {
        Q(this, new eni0(21));
        super.onLayoutChildren(vVar, a0Var);
        RecyclerView recyclerView = this.r;
        int n = n();
        if (recyclerView == null || n <= 0) {
            return;
        }
        Ref$IntRef ref$IntRef = new Ref$IntRef();
        Ref$IntRef ref$IntRef2 = new Ref$IntRef();
        Q(this, new c3b(this, ref$IntRef, ref$IntRef2, 7));
        int width = (getWidth() - getPaddingStart()) - getPaddingEnd();
        int i = width - ref$IntRef.element;
        int i2 = width - ref$IntRef2.element;
        if (i > 0) {
            S(i);
        } else {
            R(i2);
        }
        super.onLayoutChildren(vVar, a0Var);
    }

    public void R(int i) {
    }
}
