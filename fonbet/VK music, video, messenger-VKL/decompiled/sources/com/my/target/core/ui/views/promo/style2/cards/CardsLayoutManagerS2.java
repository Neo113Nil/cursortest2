package com.my.target.core.ui.views.promo.style2.cards;

import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import xsna.c1z0;
import xsna.n2z0;
import xsna.zey0;

/* compiled from: r8-map-id-8a00ff42af949b1913775377e888ba3d64200bdaff78f642603b0d3aafb83a92 */
/* loaded from: classes14.dex */
public class CardsLayoutManagerS2 extends LinearLayoutManager {
    public zey0 r;

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public final void measureChildWithMargins(View view, int i, int i2) {
        int d = c1z0.d(10, view.getContext());
        if (getPosition(view) > 0) {
            ((ViewGroup.MarginLayoutParams) ((RecyclerView.p) view.getLayoutParams())).leftMargin = d;
            ((ViewGroup.MarginLayoutParams) ((RecyclerView.p) view.getLayoutParams())).rightMargin = 0;
        }
        view.measure(View.MeasureSpec.makeMeasureSpec(((int) (getWidth() * 0.7f)) - d, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(getHeight(), Integer.MIN_VALUE));
        int measuredHeight = view.getMeasuredHeight();
        if (measuredHeight > getHeight()) {
            view.measure(View.MeasureSpec.makeMeasureSpec(((int) (getWidth() * (((getHeight() - (d * 2)) * 0.7f) / measuredHeight))) - d, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(getHeight(), Integer.MIN_VALUE));
        }
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.o
    public final void onLayoutCompleted(RecyclerView.a0 a0Var) {
        super.onLayoutCompleted(a0Var);
        zey0 zey0Var = this.r;
        if (zey0Var != null) {
            n2z0 n2z0Var = zey0Var.d;
            CardsLayoutManagerS2 cardsLayoutManagerS2 = zey0Var.c;
            int s = cardsLayoutManagerS2.s();
            View findViewByPosition = s >= 0 ? cardsLayoutManagerS2.findViewByPosition(s) : null;
            if (zey0Var.b.getChildCount() == 0 || findViewByPosition == null || zey0Var.getWidth() > findViewByPosition.getWidth() * 1.7d) {
                n2z0Var.j(8388611);
            } else {
                n2z0Var.j(17);
            }
            zey0Var.a();
        }
    }
}
