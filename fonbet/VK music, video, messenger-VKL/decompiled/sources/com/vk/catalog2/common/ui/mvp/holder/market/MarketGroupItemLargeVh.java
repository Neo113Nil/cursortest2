package com.vk.catalog2.common.ui.mvp.holder.market;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.vk.catalog2.common.dto.api.link.CatalogLink;
import com.vk.catalog2.common.dto.api.market.CatalogMarketGroupInfo;
import com.vk.catalog2.common.dto.api.ui.UIBlock;
import com.vk.catalog2.common.dto.ui.market.UIBlockMarketGroupInfoItem;
import com.vk.catalog2.common.ui.holders.api.CatalogViewHolder;
import com.vk.core.ui.tracking.UiTrackingScreen;
import com.vk.core.utils.VerifyInfoHelper;
import com.vk.dto.common.Good;
import com.vk.dto.common.VerifyInfo;
import com.vk.imageloader.view.VKImageView;
import com.vk.stat.scheme.CommonMarketStat$TypeRefSource;
import com.vkontakte.android.R;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import xsna.bn1;
import xsna.bwt0;
import xsna.dhr0;
import xsna.e3m;
import xsna.f4m;
import xsna.iah0;
import xsna.k6p;
import xsna.k87;
import xsna.r8u;
import xsna.u4a;
import xsna.v98;
import xsna.znr0;

/* compiled from: MarketGroupItemLargeVh.kt */
/* loaded from: classes16.dex */
public final class MarketGroupItemLargeVh implements CatalogViewHolder {
    public final u4a b;
    public ViewGroup c;
    public VKImageView d;
    public TextView e;
    public TextView f;
    public ImageView g;
    public View h;
    public RecyclerView i;
    public r8u j;
    public UIBlockMarketGroupInfoItem k;
    public final znr0 l = new znr0();

    public MarketGroupItemLargeVh(u4a u4aVar) {
        this.b = u4aVar;
    }

    @Override // com.vk.catalog2.common.ui.holders.api.CatalogViewHolder
    public final void N6(UIBlock uIBlock) {
        throw new UnsupportedOperationException();
    }

    @Override // com.vk.catalog2.common.ui.holders.api.CatalogViewHolder
    public final View k5(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        ViewGroup viewGroup2 = (ViewGroup) layoutInflater.inflate(R.layout.catalog_market_group_item_large_vh, viewGroup, false);
        this.c = viewGroup2;
        if (viewGroup2 == null) {
            viewGroup2 = null;
        }
        VKImageView vKImageView = (VKImageView) viewGroup2.findViewById(R.id.group_icon);
        this.d = vKImageView;
        float b = iah0.b(0.5f);
        ViewGroup viewGroup3 = this.c;
        if (viewGroup3 == null) {
            viewGroup3 = null;
        }
        vKImageView.y0(b, e3m.f(R.attr.vk_ui_image_border_alpha, viewGroup3.getContext()));
        ViewGroup viewGroup4 = this.c;
        if (viewGroup4 == null) {
            viewGroup4 = null;
        }
        this.e = (TextView) viewGroup4.findViewById(R.id.group_title);
        ViewGroup viewGroup5 = this.c;
        if (viewGroup5 == null) {
            viewGroup5 = null;
        }
        this.f = (TextView) viewGroup5.findViewById(R.id.group_subtitle);
        ViewGroup viewGroup6 = this.c;
        if (viewGroup6 == null) {
            viewGroup6 = null;
        }
        this.g = (ImageView) viewGroup6.findViewById(R.id.verification_tick);
        ViewGroup viewGroup7 = this.c;
        if (viewGroup7 == null) {
            viewGroup7 = null;
        }
        this.h = viewGroup7.findViewById(R.id.show_more_btn);
        ViewGroup viewGroup8 = this.c;
        if (viewGroup8 == null) {
            viewGroup8 = null;
        }
        RecyclerView recyclerView = (RecyclerView) viewGroup8.findViewById(R.id.goods_list);
        this.i = recyclerView;
        u4a u4aVar = this.b;
        recyclerView.setRecycledViewPool(u4aVar.b.g.getValue());
        RecyclerView recyclerView2 = this.i;
        if (recyclerView2 == null) {
            recyclerView2 = null;
        }
        ViewGroup viewGroup9 = this.c;
        if (viewGroup9 == null) {
            viewGroup9 = null;
        }
        viewGroup9.getContext();
        recyclerView2.setLayoutManager(new LinearLayoutManager(0, false));
        r8u r8uVar = new r8u(u4aVar.b.G, CommonMarketStat$TypeRefSource.MARKETPLACE, new k87(this, 7));
        this.j = r8uVar;
        RecyclerView recyclerView3 = this.i;
        if (recyclerView3 == null) {
            recyclerView3 = null;
        }
        recyclerView3.setAdapter(r8uVar);
        RecyclerView recyclerView4 = this.i;
        if (recyclerView4 == null) {
            recyclerView4 = null;
        }
        int a = iah0.a(6);
        recyclerView4.addItemDecoration(new v98(0, a, a, true));
        ViewGroup viewGroup10 = this.c;
        if (viewGroup10 == null) {
            viewGroup10 = null;
        }
        viewGroup10.setOnClickListener(new k6p(this, 4));
        View view = this.h;
        if (view == null) {
            view = null;
        }
        view.setOnClickListener(new bn1(this, 8));
        ViewGroup viewGroup11 = this.c;
        if (viewGroup11 == null) {
            viewGroup11 = null;
        }
        viewGroup11.setBackgroundTintList(dhr0.M() ? ColorStateList.valueOf(dhr0.t.c(R.attr.vk_ui_background_modal)) : null);
        ViewGroup viewGroup12 = this.c;
        if (viewGroup12 == null) {
            return null;
        }
        return viewGroup12;
    }

    @Override // com.vk.catalog2.common.ui.holders.api.CatalogViewHolder
    public final void yh(int i, UIBlock uIBlock) {
        UIBlockMarketGroupInfoItem uIBlockMarketGroupInfoItem = uIBlock instanceof UIBlockMarketGroupInfoItem ? (UIBlockMarketGroupInfoItem) uIBlock : null;
        if (uIBlockMarketGroupInfoItem == null) {
            return;
        }
        this.k = uIBlockMarketGroupInfoItem;
        CatalogMarketGroupInfo catalogMarketGroupInfo = uIBlockMarketGroupInfoItem.y;
        r8u r8uVar = this.j;
        if (r8uVar == null) {
            r8uVar = null;
        }
        List<Good> list = uIBlockMarketGroupInfoItem.A;
        ArrayList<Good> arrayList = r8uVar.h;
        arrayList.clear();
        arrayList.addAll(list);
        r8uVar.notifyDataSetChanged();
        VKImageView vKImageView = this.d;
        if (vKImageView == null) {
            vKImageView = null;
        }
        CatalogLink catalogLink = catalogMarketGroupInfo.c;
        bwt0.L(vKImageView, catalogLink.f);
        TextView textView = this.e;
        if (textView == null) {
            textView = null;
        }
        textView.setText(catalogLink.c);
        TextView textView2 = this.f;
        if (textView2 == null) {
            textView2 = null;
        }
        textView2.setText(catalogLink.d);
        VerifyInfo verifyInfo = uIBlockMarketGroupInfoItem.z.y;
        if (!verifyInfo.Cb()) {
            ImageView imageView = this.g;
            f4m.j(imageView != null ? imageView : null);
            return;
        }
        ImageView imageView2 = this.g;
        if (imageView2 == null) {
            imageView2 = null;
        }
        imageView2.setVisibility(0);
        ImageView imageView3 = this.g;
        ImageView imageView4 = imageView3 == null ? null : imageView3;
        if (imageView3 == null) {
            imageView3 = null;
        }
        Context context = imageView3.getContext();
        HashMap<VerifyInfo, Drawable> hashMap = this.l.a;
        Drawable drawable = hashMap.get(verifyInfo);
        if (drawable == null) {
            drawable = VerifyInfoHelper.h(VerifyInfoHelper.a, verifyInfo, context, null, 28);
            hashMap.put(verifyInfo, drawable);
            if (drawable == null) {
                throw new NullPointerException("verifyInfo drawable cached value must be not null");
            }
        }
        imageView4.setImageDrawable(drawable);
    }

    @Override // com.vk.catalog2.common.ui.holders.api.CatalogViewHolder
    public final boolean ze(Rect rect) {
        return false;
    }

    @Override // com.vk.catalog2.common.ui.holders.api.CatalogViewHolder
    public final void L() {
    }

    @Override // xsna.m0q0
    public final void y(UiTrackingScreen uiTrackingScreen) {
    }
}
