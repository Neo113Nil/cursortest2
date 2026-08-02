package com.vk.superapp.ui.views.horizontalscroll;

import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.jvm.internal.Ref$IntRef;
import xsna.iob;
import xsna.izs;
import xsna.o3w;
import xsna.r9k;
import xsna.s3q0;
import xsna.ugm;

/* compiled from: MiniWidgetsSpreaderLayoutManagerV2.kt */
/* loaded from: classes6.dex */
public final class MiniWidgetsSpreaderLayoutManagerV2 extends WidthSpreaderLayoutManager {
    @Override // com.vk.superapp.ui.views.horizontalscroll.WidthSpreaderLayoutManager
    public final void P(izs<? super Integer, Boolean> izsVar, izs<? super View, s3q0> izsVar2) {
        super.P(new r9k(this, 26), izsVar2);
    }

    @Override // com.vk.superapp.ui.views.horizontalscroll.WidthSpreaderLayoutManager
    public final void R(int i) {
        View childAt;
        if (T() > 3) {
            return;
        }
        int i2 = 0;
        if (getItemCount() > 3 && (childAt = getChildAt(2)) != null) {
            i2 = getLeftDecorationWidth(childAt) + getRightDecorationWidth(childAt);
        }
        final int T = (i2 + i) / T();
        WidthSpreaderLayoutManager.Q(this, new izs() { // from class: xsna.xr20
            @Override // xsna.izs
            public final Object invoke(Object obj) {
                ViewGroup.LayoutParams layoutParams = ((View) obj).getLayoutParams();
                if (layoutParams != null) {
                    layoutParams.width = T;
                }
                return s3q0.a;
            }
        });
    }

    @Override // com.vk.superapp.ui.views.horizontalscroll.WidthSpreaderLayoutManager
    public final void S(int i) {
        View childAt;
        int i2 = 0;
        if (getItemCount() > 3 && (childAt = getChildAt(2)) != null) {
            i2 = getLeftDecorationWidth(childAt) + getRightDecorationWidth(childAt);
        }
        WidthSpreaderLayoutManager.Q(this, new iob(this, (i2 + i) / T(), 2));
    }

    public final int T() {
        if (getItemCount() > 3) {
            return 3;
        }
        return getItemCount();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public final int n() {
        return T();
    }

    @Override // com.vk.superapp.ui.views.horizontalscroll.WidthSpreaderLayoutManager, androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.o
    public final void onLayoutChildren(RecyclerView.v vVar, RecyclerView.a0 a0Var) {
        super.onLayoutChildren(vVar, a0Var);
        Ref$IntRef ref$IntRef = new Ref$IntRef();
        WidthSpreaderLayoutManager.Q(this, new ugm(ref$IntRef, 20));
        WidthSpreaderLayoutManager.Q(this, new o3w(ref$IntRef, 13));
    }
}
