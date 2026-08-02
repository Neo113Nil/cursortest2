package com.vk.ecomm.reviews.impl.marketitem.itemsforreview.view;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager2.widget.ViewPager2;
import com.vk.common.view.DotsIndicatorView;
import com.vk.ecomm.reviews.impl.marketitem.itemsforreview.view.MarketItemsForReviewView;
import com.vkontakte.android.R;
import io.reactivex.rxjava3.subjects.f;
import xsna.abg0;
import xsna.cn70;
import xsna.dhr0;
import xsna.e7b0;
import xsna.j610;
import xsna.l610;
import xsna.m610;
import xsna.slh;

/* compiled from: MarketItemsForReviewView.kt */
/* loaded from: classes18.dex */
public final class MarketItemsForReviewView extends FrameLayout {
    public static final /* synthetic */ int g = 0;
    public final ViewPager2 b;
    public final DotsIndicatorView c;
    public final l610 d;
    public final e7b0 e;
    public final f<m610> f;

    /* compiled from: MarketItemsForReviewView.kt */
    public static final class a extends RecyclerView.n {
        public final int b;

        public a(int i) {
            this.b = i;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.n
        public final void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, RecyclerView.a0 a0Var) {
            int i = this.b;
            rect.right = i;
            rect.left = i;
        }
    }

    public MarketItemsForReviewView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.e = new e7b0();
        this.f = new f<>();
        slh slhVar = new slh(this, 1);
        View.inflate(context, R.layout.market_items_for_review_view, this);
        DotsIndicatorView dotsIndicatorView = (DotsIndicatorView) findViewById(R.id.page_indicator);
        this.c = dotsIndicatorView;
        dotsIndicatorView.setDotSize(cn70.b(6));
        DotsIndicatorView dotsIndicatorView2 = this.c;
        (dotsIndicatorView2 == null ? null : dotsIndicatorView2).setSmallDotSize(cn70.b(4));
        DotsIndicatorView dotsIndicatorView3 = this.c;
        (dotsIndicatorView3 == null ? null : dotsIndicatorView3).setSpacing(cn70.b(4));
        DotsIndicatorView dotsIndicatorView4 = this.c;
        (dotsIndicatorView4 == null ? null : dotsIndicatorView4).setSelectedDotSize(cn70.b(8));
        DotsIndicatorView dotsIndicatorView5 = this.c;
        dotsIndicatorView5 = dotsIndicatorView5 == null ? null : dotsIndicatorView5;
        abg0 abg0Var = dhr0.t;
        dotsIndicatorView5.setDotColor(abg0Var.c(R.attr.vk_ui_vkontakte_color_background_keyboard));
        DotsIndicatorView dotsIndicatorView6 = this.c;
        (dotsIndicatorView6 == null ? null : dotsIndicatorView6).setSelectedDotColor(abg0Var.c(R.attr.vk_ui_icon_secondary));
        this.d = new l610(slhVar);
        float dimension = getResources().getDimension(R.dimen.market_items_for_review_view_next_visible_item);
        float dimension2 = getResources().getDimension(R.dimen.market_items_for_review_view_pager_items_horisontal_margin);
        final float f = dimension + dimension2;
        ViewPager2.i iVar = new ViewPager2.i() { // from class: xsna.i610
            @Override // androidx.viewpager2.widget.ViewPager2.i
            public final void transformPage(View view, float f2) {
                int i = MarketItemsForReviewView.g;
                view.setTranslationX((-f) * f2);
            }
        };
        ViewPager2 viewPager2 = (ViewPager2) findViewById(R.id.view_pager);
        l610 l610Var = this.d;
        viewPager2.setAdapter(l610Var != null ? l610Var : null);
        viewPager2.setOffscreenPageLimit(1);
        viewPager2.setPageTransformer(iVar);
        viewPager2.k.addItemDecoration(new a((int) dimension2));
        this.b = viewPager2;
        viewPager2.b(new j610(this));
    }
}
