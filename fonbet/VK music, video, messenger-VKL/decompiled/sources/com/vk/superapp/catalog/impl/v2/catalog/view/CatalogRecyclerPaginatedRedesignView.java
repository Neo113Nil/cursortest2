package com.vk.superapp.catalog.impl.v2.catalog.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.airbnb.lottie.LottieAnimationView;
import com.vk.lists.DefaultErrorView;
import com.vk.lists.RecyclerPaginatedView;
import com.vkontakte.android.R;
import xsna.dhr0;
import xsna.e370;
import xsna.ee;
import xsna.gfx0;
import xsna.gxp;

/* compiled from: CatalogRecyclerPaginatedRedesignView.kt */
/* loaded from: classes6.dex */
public final class CatalogRecyclerPaginatedRedesignView extends RecyclerPaginatedView {

    /* compiled from: CatalogRecyclerPaginatedRedesignView.kt */
    public static final class a extends DefaultErrorView {
        @Override // com.vk.lists.DefaultErrorView
        public final ViewGroup.LayoutParams getContainerLayoutParams() {
            getResources();
            return new FrameLayout.LayoutParams(-1, -1, 17);
        }

        @Override // com.vk.lists.DefaultErrorView
        public final int getLayoutId() {
            return R.layout.vk_apps_catalog_error_view_redesign;
        }
    }

    public CatalogRecyclerPaginatedRedesignView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
    }

    @Override // com.vk.lists.AbstractPaginatedView
    public final ee d(Context context, AttributeSet attributeSet) {
        return new a(context);
    }

    @Override // com.vk.lists.AbstractPaginatedView, com.vk.lists.c.n
    public final void fj(Throwable th, gxp gxpVar) {
        ee eeVar = this.c;
        a aVar = eeVar instanceof a ? (a) eeVar : null;
        if (aVar != null) {
            LottieAnimationView lottieAnimationView = (LottieAnimationView) aVar.findViewById(R.id.rlottie_view_icon);
            gfx0 gfx0Var = e370.b;
            (gfx0Var != null ? gfx0Var : null).getClass();
            lottieAnimationView.setAnimation(dhr0.M() ? R.raw.vk_antenna_dark_56 : R.raw.vk_antenna_light_56);
            try {
                aVar.performHapticFeedback(17);
            } catch (Throwable unused) {
            }
        }
        super.fj(th, gxpVar);
    }
}
