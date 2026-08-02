package com.vk.catalog2.common.ui.mvp.holder;

import android.graphics.Rect;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.vk.catalog2.common.dto.api.market.CatalogClassifiedYoulaCity;
import com.vk.catalog2.common.dto.api.market.CatalogNavigationTab;
import com.vk.catalog2.common.dto.api.ui.UIBlock;
import com.vk.catalog2.common.dto.ui.market.UIBlockNavigationTab;
import com.vk.catalog2.common.ui.holders.api.CatalogViewHolder;
import com.vk.core.ui.tracking.UiTrackingScreen;
import com.vk.dto.market.catalog.CatalogMarketSorting;
import com.vk.ecomm.api.analytics.MarketAnalyticsParams;
import com.vk.ecomm.categories.api.MarketCategoriesComponent;
import com.vk.ecomm.market.api.filters.di.MarketProductFilterComponent;
import com.vk.imageloader.view.VKImageView;
import com.vkontakte.android.R;
import java.util.Iterator;
import java.util.List;
import xsna.ahc;
import xsna.av00;
import xsna.bwt0;
import xsna.chc;
import xsna.epx;
import xsna.fpf0;
import xsna.k7m;
import xsna.kz50;
import xsna.m4w;
import xsna.m7m;
import xsna.mu00;
import xsna.nu00;
import xsna.qu00;
import xsna.u4a;
import xsna.w8i;

/* compiled from: NavigationTabVh.kt */
/* loaded from: classes16.dex */
public final class NavigationTabVh implements CatalogViewHolder, w8i {
    public final u4a b;
    public final MarketAnalyticsParams c;
    public final boolean d;
    public final int e;
    public ViewGroup f;
    public VKImageView g;
    public TextView h;
    public View i;
    public TextView j;
    public ImageView k;
    public UIBlockNavigationTab l;
    public CatalogNavigationTab m;
    public String n;
    public kz50 o;

    public /* synthetic */ NavigationTabVh(u4a u4aVar, MarketAnalyticsParams marketAnalyticsParams, int i) {
        this(u4aVar, (i & 2) != 0 ? null : marketAnalyticsParams, false, R.layout.catalog_navigation_tab_vh);
    }

    /* JADX WARN: Code restructure failed: missing block: B:39:0x007c, code lost:
    
        if (r5 != null) goto L54;
     */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00e4  */
    @Override // com.vk.catalog2.common.ui.holders.api.CatalogViewHolder
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void N6(UIBlock uIBlock) {
        String str;
        kz50 chcVar;
        ViewGroup viewGroup;
        List<CatalogMarketSorting.SortOption> list;
        Object obj;
        UIBlockNavigationTab uIBlockNavigationTab = uIBlock instanceof UIBlockNavigationTab ? (UIBlockNavigationTab) uIBlock : null;
        if (uIBlockNavigationTab == null) {
            return;
        }
        UIBlockNavigationTab uIBlockNavigationTab2 = (UIBlockNavigationTab) uIBlock;
        this.l = uIBlockNavigationTab2;
        CatalogNavigationTab catalogNavigationTab = uIBlockNavigationTab.y;
        this.m = catalogNavigationTab;
        this.n = uIBlockNavigationTab.b;
        VKImageView vKImageView = this.g;
        if (vKImageView == null) {
            vKImageView = null;
        }
        if (catalogNavigationTab == null) {
            catalogNavigationTab = null;
        }
        bwt0.L(vKImageView, catalogNavigationTab.g);
        TextView textView = this.h;
        if (textView == null) {
            textView = null;
        }
        CatalogNavigationTab catalogNavigationTab2 = this.m;
        if (catalogNavigationTab2 == null) {
            catalogNavigationTab2 = null;
        }
        if (epx.f(catalogNavigationTab2.d, "sorting")) {
            CatalogNavigationTab catalogNavigationTab3 = this.m;
            CatalogMarketSorting catalogMarketSorting = (catalogNavigationTab3 == null ? null : catalogNavigationTab3).l;
            String str2 = catalogMarketSorting != null ? catalogMarketSorting.c : null;
            if (catalogNavigationTab3 == null) {
                catalogNavigationTab3 = null;
            }
            CatalogMarketSorting catalogMarketSorting2 = catalogNavigationTab3.l;
            if (catalogMarketSorting2 != null && (list = catalogMarketSorting2.b) != null) {
                Iterator<T> it = list.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        obj = null;
                        break;
                    } else {
                        obj = it.next();
                        if (epx.f(((CatalogMarketSorting.SortOption) obj).b, str2)) {
                            break;
                        }
                    }
                }
                CatalogMarketSorting.SortOption sortOption = (CatalogMarketSorting.SortOption) obj;
                if (sortOption != null) {
                    str = sortOption.c;
                }
            }
            CatalogNavigationTab catalogNavigationTab4 = this.m;
            if (catalogNavigationTab4 == null) {
                catalogNavigationTab4 = null;
            }
            str = catalogNavigationTab4.c;
        } else {
            CatalogNavigationTab catalogNavigationTab5 = this.m;
            if (catalogNavigationTab5 == null) {
                catalogNavigationTab5 = null;
            }
            str = catalogNavigationTab5.c;
        }
        textView.setText(str);
        View view = this.i;
        if (view == null) {
            view = null;
        }
        CatalogNavigationTab catalogNavigationTab6 = this.m;
        if (catalogNavigationTab6 == null) {
            catalogNavigationTab6 = null;
        }
        bwt0.p0(view, catalogNavigationTab6.h);
        TextView textView2 = this.j;
        if (textView2 == null) {
            textView2 = null;
        }
        bwt0.p0(textView2, false);
        ImageView imageView = this.k;
        if (imageView == null) {
            imageView = null;
        }
        bwt0.p0(imageView, false);
        String str3 = uIBlockNavigationTab2.y.d;
        int hashCode = str3.hashCode();
        u4a u4aVar = this.b;
        if (hashCode == -854547461) {
            if (str3.equals("filters")) {
                ViewGroup viewGroup2 = this.f;
                if (viewGroup2 == null) {
                    viewGroup2 = null;
                }
                chcVar = new chc(viewGroup2.getContext(), ((MarketProductFilterComponent) ((k7m) m7m.f(this)).mo408a(fpf0.a(MarketProductFilterComponent.class))).a(), u4aVar.b.a);
            }
            chcVar = null;
        } else if (hashCode != 1296516636) {
            viewGroup = this.f;
            if (viewGroup == null) {
                viewGroup = null;
            }
            chcVar = new ahc(viewGroup.getContext(), ((MarketCategoriesComponent) ((k7m) m7m.f(this)).mo408a(fpf0.a(MarketCategoriesComponent.class))).a(), this.c);
        } else {
            viewGroup = this.f;
            if (viewGroup == null) {
            }
            chcVar = new ahc(viewGroup.getContext(), ((MarketCategoriesComponent) ((k7m) m7m.f(this)).mo408a(fpf0.a(MarketCategoriesComponent.class))).a(), this.c);
        }
        this.o = chcVar;
        CatalogNavigationTab catalogNavigationTab7 = this.m;
        if (catalogNavigationTab7 == null) {
            catalogNavigationTab7 = null;
        }
        String str4 = catalogNavigationTab7.d;
        if (!epx.f(str4, "filters")) {
            if (epx.f(str4, "sorting")) {
                String str5 = u4aVar.b.a;
                CatalogNavigationTab catalogNavigationTab8 = this.m;
                av00.a(new nu00(str5, (catalogNavigationTab8 != null ? catalogNavigationTab8 : null).l));
                return;
            }
            return;
        }
        CatalogClassifiedYoulaCity catalogClassifiedYoulaCity = uIBlockNavigationTab.B;
        if (catalogClassifiedYoulaCity != null) {
            av00.a(new qu00(u4aVar.b.a, catalogClassifiedYoulaCity.c, catalogClassifiedYoulaCity.d, catalogClassifiedYoulaCity.e, false));
        }
        String str6 = u4aVar.b.a;
        CatalogNavigationTab catalogNavigationTab9 = this.m;
        av00.a(new mu00(str6, (catalogNavigationTab9 != null ? catalogNavigationTab9 : null).k));
    }

    @Override // com.vk.catalog2.common.ui.holders.api.CatalogViewHolder
    public final View k5(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        ViewGroup viewGroup2 = (ViewGroup) layoutInflater.inflate(this.e, viewGroup, false);
        this.f = viewGroup2;
        if (viewGroup2 == null) {
            viewGroup2 = null;
        }
        ViewGroup.LayoutParams layoutParams = viewGroup2.getLayoutParams();
        if (layoutParams == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
        }
        layoutParams.width = this.d ? 0 : -2;
        viewGroup2.setLayoutParams(layoutParams);
        ViewGroup viewGroup3 = this.f;
        if (viewGroup3 == null) {
            viewGroup3 = null;
        }
        this.g = (VKImageView) viewGroup3.findViewById(R.id.icon);
        ViewGroup viewGroup4 = this.f;
        if (viewGroup4 == null) {
            viewGroup4 = null;
        }
        this.h = (TextView) viewGroup4.findViewById(R.id.title);
        ViewGroup viewGroup5 = this.f;
        if (viewGroup5 == null) {
            viewGroup5 = null;
        }
        this.i = viewGroup5.findViewById(R.id.featuring_badge);
        ViewGroup viewGroup6 = this.f;
        if (viewGroup6 == null) {
            viewGroup6 = null;
        }
        this.j = (TextView) viewGroup6.findViewById(R.id.counter_badge);
        ViewGroup viewGroup7 = this.f;
        if (viewGroup7 == null) {
            viewGroup7 = null;
        }
        this.k = (ImageView) viewGroup7.findViewById(R.id.expand_button);
        ViewGroup viewGroup8 = this.f;
        if (viewGroup8 == null) {
            viewGroup8 = null;
        }
        viewGroup8.setOnClickListener(new m4w(this, 2));
        ViewGroup viewGroup9 = this.f;
        if (viewGroup9 == null) {
            return null;
        }
        return viewGroup9;
    }

    @Override // com.vk.catalog2.common.ui.holders.api.CatalogViewHolder
    public final void yh(int i, UIBlock uIBlock) {
        N6(uIBlock);
    }

    @Override // com.vk.catalog2.common.ui.holders.api.CatalogViewHolder
    public final boolean ze(Rect rect) {
        return false;
    }

    public NavigationTabVh(u4a u4aVar, MarketAnalyticsParams marketAnalyticsParams, boolean z, int i) {
        this.b = u4aVar;
        this.c = marketAnalyticsParams;
        this.d = z;
        this.e = i;
    }

    @Override // com.vk.catalog2.common.ui.holders.api.CatalogViewHolder
    public final void L() {
    }

    @Override // xsna.m0q0
    public final void y(UiTrackingScreen uiTrackingScreen) {
    }
}
