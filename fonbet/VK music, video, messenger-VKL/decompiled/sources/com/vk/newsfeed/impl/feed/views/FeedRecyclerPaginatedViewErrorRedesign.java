package com.vk.newsfeed.impl.feed.views;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.airbnb.lottie.LottieAnimationView;
import com.vk.lists.DefaultErrorView;
import com.vkontakte.android.R;
import xsna.dhr0;
import xsna.ee;
import xsna.gxp;
import xsna.n6s;
import xsna.rhl;

/* compiled from: FeedRecyclerPaginatedViewErrorRedesign.kt */
/* loaded from: classes4.dex */
public class FeedRecyclerPaginatedViewErrorRedesign extends FeedRecyclerPaginatedView {

    /* compiled from: FeedRecyclerPaginatedViewErrorRedesign.kt */
    public static final class a extends n6s {
        @Override // xsna.n6s
        public final ee a(Context context, ViewGroup viewGroup) {
            rhl rhlVar = new rhl(context);
            rhlVar.setActionTitle(R.string.network_error_retry);
            return rhlVar;
        }
    }

    /* compiled from: FeedRecyclerPaginatedViewErrorRedesign.kt */
    public static final class b extends DefaultErrorView {
        @Override // com.vk.lists.DefaultErrorView
        public final ViewGroup.LayoutParams getContainerLayoutParams() {
            getResources();
            return new FrameLayout.LayoutParams(-1, -1, 17);
        }

        @Override // com.vk.lists.DefaultErrorView
        public final int getLayoutId() {
            return R.layout.view_no_connection_error_with_lottie;
        }
    }

    public FeedRecyclerPaginatedViewErrorRedesign(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
    }

    @Override // com.vk.newsfeed.impl.feed.views.FeedRecyclerPaginatedView, com.vk.lists.AbstractPaginatedView
    public final ee d(Context context, AttributeSet attributeSet) {
        return new b(context);
    }

    @Override // com.vk.newsfeed.impl.feed.views.FeedRecyclerPaginatedView, com.vk.lists.AbstractPaginatedView, com.vk.lists.c.n
    public final void fj(Throwable th, gxp gxpVar) {
        ee eeVar = this.c;
        b bVar = eeVar instanceof b ? (b) eeVar : null;
        if (bVar != null) {
            ((LottieAnimationView) bVar.findViewById(R.id.rlottie_view_icon)).setAnimation(dhr0.M() ? R.raw.vk_antenna_dark_56 : R.raw.vk_antenna_light_56);
            try {
                bVar.performHapticFeedback(17);
            } catch (Throwable unused) {
            }
        }
        super.fj(th, gxpVar);
    }

    @Override // com.vk.newsfeed.impl.feed.views.FeedRecyclerPaginatedView, com.vk.lists.RecyclerPaginatedView, com.vk.lists.AbstractPaginatedView
    public final View q(Context context, AttributeSet attributeSet) {
        setFooterErrorViewProvider(new a());
        return super.q(context, attributeSet);
    }
}
