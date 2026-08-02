package com.vk.superapp.ui;

import android.content.Context;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.unity3d.services.UnityAdsConstants;
import com.vk.core.design.lego.LegoCustomRedesignedScreen;
import com.vkontakte.android.R;
import xsna.fnj;
import xsna.swe0;
import xsna.y1z;

/* compiled from: HorizontalExpandableMenuBehavior.kt */
/* loaded from: classes6.dex */
public final class HorizontalExpandableMenuBehavior extends CoordinatorLayout.c<RecyclerView> {
    public final LinearLayoutManager b;
    public final float c;
    public final float d;

    public HorizontalExpandableMenuBehavior(Context context, LinearLayoutManager linearLayoutManager) {
        super(context, null);
        this.b = linearLayoutManager;
        this.c = context.getResources().getDimensionPixelSize(R.dimen.vk_expandable_menu_dialog_hidden_height);
        this.d = context.getResources().getDimensionPixelSize(R.dimen.vk_expandable_menu_dialog_start_collapse);
        fnj.a(context);
        int i = y1z.a;
        LegoCustomRedesignedScreen legoCustomRedesignedScreen = LegoCustomRedesignedScreen.EXAMPLE;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public final void u(CoordinatorLayout coordinatorLayout, RecyclerView recyclerView, View view, int i, int i2, int i3, int i4, int i5, int[] iArr) {
        RecyclerView recyclerView2 = recyclerView;
        if (i2 == 0) {
            return;
        }
        LinearLayoutManager linearLayoutManager = this.b;
        int v = linearLayoutManager.v();
        View findViewByPosition = linearLayoutManager.findViewByPosition(v);
        float f = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        if (v <= 0) {
            float f2 = this.c;
            f = (v != 0 || findViewByPosition == null) ? -f2 : swe0.f(((-findViewByPosition.getY()) - this.d) - f2, -f2, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        }
        if (recyclerView2.getTranslationY() == f) {
            return;
        }
        recyclerView2.setTranslationY(f);
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public final boolean z(CoordinatorLayout coordinatorLayout, RecyclerView recyclerView, View view, View view2, int i, int i2) {
        return i == 2;
    }
}
