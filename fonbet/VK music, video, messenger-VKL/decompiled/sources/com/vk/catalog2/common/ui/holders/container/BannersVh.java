package com.vk.catalog2.common.ui.holders.container;

import android.content.Context;
import android.content.res.Configuration;
import android.graphics.Rect;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.viewpager.widget.PagerAdapter;
import com.vk.catalog2.common.dto.api.banner.Banner;
import com.vk.catalog2.common.dto.api.ui.UIBlock;
import com.vk.catalog2.common.dto.ui.UIBlockBanner;
import com.vk.catalog2.common.dto.ui.UIBlockList;
import com.vk.catalog2.common.ui.holders.api.CatalogVisibleViewHolder;
import com.vk.core.ui.tracking.UiTrackingScreen;
import com.vk.core.view.infiniteviewpager.ViewPagerInfinite;
import com.vk.dto.common.NotificationImage;
import com.vk.imageloader.view.VKImageView;
import com.vkontakte.android.R;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.EmptyList;
import xsna.b5a;
import xsna.bwt0;
import xsna.c5g;
import xsna.e43;
import xsna.f4m;
import xsna.fnj;
import xsna.g380;
import xsna.iah0;
import xsna.ozl;
import xsna.s3q0;
import xsna.w36;
import xsna.wzs;
import xsna.x36;
import xsna.xuw;

/* compiled from: BannersVh.kt */
@ozl
/* loaded from: classes16.dex */
public final class BannersVh implements CatalogVisibleViewHolder, g380 {
    public final b5a b;
    public final int c;
    public final int d;
    public final boolean e;
    public final wzs<Context, String, s3q0> f;
    public Context g;
    public ViewPagerInfinite h;
    public final a i;
    public Rect j;
    public final float k;
    public View l;

    /* compiled from: BannersVh.kt */
    public static final class a extends PagerAdapter {
        public final x36 b;
        public List<Banner> c = EmptyList.b;

        public a(x36 x36Var) {
            this.b = x36Var;
        }

        @Override // androidx.viewpager.widget.PagerAdapter
        public final void destroyItem(ViewGroup viewGroup, int i, Object obj) {
            viewGroup.removeView((View) obj);
        }

        @Override // androidx.viewpager.widget.PagerAdapter
        public final int getCount() {
            return this.c.size();
        }

        @Override // androidx.viewpager.widget.PagerAdapter
        public final Object instantiateItem(ViewGroup viewGroup, int i) {
            Context context = viewGroup.getContext();
            View inflate = LayoutInflater.from(context).inflate(R.layout.catalog_banner_item, viewGroup, false);
            VKImageView vKImageView = (VKImageView) inflate.findViewById(R.id.banner_image);
            vKImageView.setContentDescription(context.getString(R.string.stickers_accessibility_banner));
            Banner banner = this.c.get(i);
            NotificationImage notificationImage = banner.d;
            HashSet hashSet = iah0.a;
            vKImageView.load(NotificationImage.Db(notificationImage, context.getResources().getDisplayMetrics().widthPixels - (viewGroup.getPaddingRight() + viewGroup.getPaddingLeft())));
            viewGroup.addView(inflate);
            inflate.setOnClickListener(new w36(this, context, banner, 0));
            return inflate;
        }

        @Override // androidx.viewpager.widget.PagerAdapter
        public final boolean isViewFromObject(View view, Object obj) {
            return view == obj;
        }
    }

    public BannersVh() {
        throw null;
    }

    public BannersVh(b5a b5aVar, wzs wzsVar) {
        Context context = e43.a;
        context = context == null ? null : context;
        HashSet hashSet = iah0.a;
        int i = !fnj.b(context) ? 3 : 5;
        int a2 = iah0.a(8);
        this.b = b5aVar;
        this.c = i;
        this.d = a2;
        this.e = true;
        this.f = wzsVar;
        this.i = new a(new x36(2, this, BannersVh.class, "onBannerClicked", "onBannerClicked(Landroid/content/Context;Lcom/vk/catalog2/common/dto/api/banner/Banner;)V", 0));
        this.k = 1.7777778f;
    }

    @Override // com.vk.catalog2.common.ui.holders.api.CatalogViewHolder
    public final void L() {
        ViewPagerInfinite viewPagerInfinite = this.h;
        ViewPagerInfinite viewPagerInfinite2 = viewPagerInfinite;
        if (viewPagerInfinite == null) {
            viewPagerInfinite2 = null;
        }
        viewPagerInfinite2.g = false;
        viewPagerInfinite2.removeCallbacks(viewPagerInfinite2);
    }

    @Override // com.vk.catalog2.common.ui.holders.api.CatalogViewHolder
    public final void N6(UIBlock uIBlock) {
        UIBlockList uIBlockList = uIBlock instanceof UIBlockList ? (UIBlockList) uIBlock : null;
        if (uIBlockList == null) {
            return;
        }
        ArrayList<UIBlock> arrayList = uIBlockList.y;
        ArrayList arrayList2 = new ArrayList();
        for (UIBlock uIBlock2 : arrayList) {
            UIBlockBanner uIBlockBanner = uIBlock2 instanceof UIBlockBanner ? (UIBlockBanner) uIBlock2 : null;
            if (uIBlockBanner != null) {
                arrayList2.add(uIBlockBanner);
            }
        }
        ArrayList arrayList3 = new ArrayList(c5g.u(arrayList2, 10));
        Iterator it = arrayList2.iterator();
        while (it.hasNext()) {
            arrayList3.add(((UIBlockBanner) it.next()).y);
        }
        if (arrayList3.isEmpty()) {
            ViewPagerInfinite viewPagerInfinite = this.h;
            f4m.j(viewPagerInfinite != null ? viewPagerInfinite : null);
            return;
        }
        ViewPagerInfinite viewPagerInfinite2 = this.h;
        if (viewPagerInfinite2 == null) {
            viewPagerInfinite2 = null;
        }
        viewPagerInfinite2.setVisibility(0);
        ViewPagerInfinite viewPagerInfinite3 = this.h;
        if (viewPagerInfinite3 == null) {
            viewPagerInfinite3 = null;
        }
        PagerAdapter adapter = viewPagerInfinite3.getAdapter();
        xuw xuwVar = adapter instanceof xuw ? (xuw) adapter : null;
        if (xuwVar != null) {
            xuwVar.c = Boolean.valueOf(this.e);
        }
        a aVar = this.i;
        aVar.c = arrayList3;
        aVar.notifyDataSetChanged();
        ViewPagerInfinite viewPagerInfinite4 = this.h;
        if (viewPagerInfinite4 == null) {
            viewPagerInfinite4 = null;
        }
        int currentItem = viewPagerInfinite4.getCurrentItem() % arrayList3.size();
        ViewPagerInfinite viewPagerInfinite5 = this.h;
        if (viewPagerInfinite5 == null) {
            viewPagerInfinite5 = null;
        }
        viewPagerInfinite5.setCurrentItem(currentItem + 5, false);
        ViewPagerInfinite viewPagerInfinite6 = this.h;
        ViewPagerInfinite viewPagerInfinite7 = viewPagerInfinite6 != null ? viewPagerInfinite6 : null;
        viewPagerInfinite7.g = true;
        viewPagerInfinite7.setCurrentItem(viewPagerInfinite7.getCurrentItem(), false);
        viewPagerInfinite7.b();
    }

    public final Rect a() {
        Context context = this.g;
        if (context == null) {
            context = null;
        }
        HashSet hashSet = iah0.a;
        if (!fnj.b(context)) {
            float f = 4;
            return new Rect(iah0.a(24), iah0.a(f), iah0.a(26), iah0.a(f));
        }
        int a2 = (iah0.f().widthPixels - iah0.a(iah0.a(200))) / 2;
        float f2 = 4;
        return new Rect(a2, iah0.a(f2), a2, iah0.a(f2));
    }

    @Override // com.vk.catalog2.common.ui.holders.api.CatalogViewHolder
    public final View k5(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.g = layoutInflater.getContext();
        this.j = a();
        View inflate = layoutInflater.inflate(R.layout.catalog_banners, viewGroup, false);
        ViewPagerInfinite viewPagerInfinite = (ViewPagerInfinite) inflate.findViewById(R.id.banners_pager);
        Rect rect = this.j;
        int i = (rect == null ? null : rect).left + (rect == null ? null : rect).right;
        int i2 = (rect == null ? null : rect).left;
        int i3 = (rect == null ? null : rect).top;
        int i4 = (rect == null ? null : rect).right;
        if (rect == null) {
            rect = null;
        }
        viewPagerInfinite.setPadding(i2, i3, i4, rect.bottom);
        bwt0.c0((int) ((iah0.z(viewPagerInfinite.getContext()) - i) / this.k), viewPagerInfinite);
        viewPagerInfinite.setPageMargin(this.d);
        viewPagerInfinite.setOffscreenPageLimit(this.c);
        viewPagerInfinite.setClipToPadding(false);
        viewPagerInfinite.setAdapter(new xuw(this.i));
        f4m.j(viewPagerInfinite);
        this.h = viewPagerInfinite;
        this.l = inflate;
        return inflate;
    }

    @Override // xsna.g380
    public final void onConfigurationChanged(Configuration configuration) {
        Rect a2 = a();
        this.j = a2;
        ViewPagerInfinite viewPagerInfinite = this.h;
        if (viewPagerInfinite == null) {
            viewPagerInfinite = null;
        }
        viewPagerInfinite.setPadding(a2.left, a2.top, a2.right, a2.bottom);
    }

    @Override // com.vk.catalog2.common.ui.holders.api.CatalogViewHolder
    public final void yh(int i, UIBlock uIBlock) {
        N6(uIBlock);
    }

    @Override // com.vk.catalog2.common.ui.holders.api.CatalogViewHolder
    public final boolean ze(Rect rect) {
        return false;
    }

    @Override // xsna.m0q0
    public final void y(UiTrackingScreen uiTrackingScreen) {
    }
}
