package com.my.target.core.ui.views.nativeslider;

import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import xsna.b920;
import xsna.pu50;
import xsna.s4e0;

/* compiled from: r8-map-id-8a00ff42af949b1913775377e888ba3d64200bdaff78f642603b0d3aafb83a92 */
/* loaded from: classes14.dex */
public class CardRecyclerLayoutManager extends LinearLayoutManager {
    public final float r;
    public pu50 s;

    public CardRecyclerLayoutManager() {
        super(0, false);
        this.r = b920.b(0.58f, -1.0f) == 0 ? 0.75f : 0.58f;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public final void measureChildWithMargins(View view, int i, int i2) {
        ((ViewGroup.MarginLayoutParams) ((RecyclerView.p) view.getLayoutParams())).width = (int) (getWidth() * this.r);
        super.measureChildWithMargins(view, i, i2);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.o
    public final void onLayoutCompleted(RecyclerView.a0 a0Var) {
        super.onLayoutCompleted(a0Var);
        pu50 pu50Var = this.s;
        if (pu50Var != null) {
            ((s4e0) pu50Var.c).a();
        }
    }
}
