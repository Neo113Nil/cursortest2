package com.vk.catalog2.common.ui.holders.group;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.appcompat.widget.Toolbar;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.appbar.CollapsingToolbarLayout;
import com.vk.catalog2.common.dto.api.ui.UIBlock;
import com.vk.catalog2.common.dto.ui.UIBlockGroupsCollection;
import com.vk.catalog2.common.ui.holders.CatalogClickableViewHolder;
import com.vk.catalog2.common.ui.holders.group.GroupsCollectionHeaderVh;
import com.vk.core.ui.themes.VKTheme;
import com.vk.dto.common.Image;
import com.vk.dto.common.ImageSize;
import com.vk.imageloader.view.VKImageView;
import com.vkontakte.android.R;
import java.util.HashSet;
import java.util.WeakHashMap;
import xsna.abg0;
import xsna.b0u0;
import xsna.baf0;
import xsna.c98;
import xsna.dhr0;
import xsna.enj;
import xsna.fnj;
import xsna.iah0;
import xsna.iut0;
import xsna.jpu;
import xsna.m33;
import xsna.p90;
import xsna.u080;

/* compiled from: GroupsCollectionHeaderVh.kt */
/* loaded from: classes16.dex */
public final class GroupsCollectionHeaderVh extends CatalogClickableViewHolder implements dhr0.e {
    public Toolbar e;
    public CollapsingToolbarLayout f;
    public TextView g;
    public VKImageView h;
    public AppBarLayout i;

    @Override // com.vk.catalog2.common.ui.holders.CatalogClickableViewHolder
    public final void b(UIBlock uIBlock) {
        ImageSize Cb;
        if (uIBlock instanceof UIBlockGroupsCollection) {
            Toolbar toolbar = this.e;
            if (toolbar == null) {
                toolbar = null;
            }
            UIBlockGroupsCollection uIBlockGroupsCollection = (UIBlockGroupsCollection) uIBlock;
            String str = uIBlockGroupsCollection.A;
            String str2 = uIBlockGroupsCollection.z;
            toolbar.setTitle(str2);
            TextView textView = this.g;
            if (textView == null) {
                textView = null;
            }
            textView.setText(str);
            AppBarLayout appBarLayout = this.i;
            if (appBarLayout == null) {
                appBarLayout = null;
            }
            appBarLayout.setContentDescription(str2 + " " + str);
            Image image = uIBlockGroupsCollection.D;
            String str3 = (image == null || (Cb = image.Cb(iah0.f().widthPixels, true, false)) == null) ? null : Cb.d.d;
            VKImageView vKImageView = this.h;
            (vKImageView != null ? vKImageView : null).load(str3);
        }
    }

    @Override // com.vk.catalog2.common.ui.holders.api.CatalogViewHolder
    public final View k5(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(R.layout.catalog_groups_collection_header, viewGroup, false);
        Toolbar toolbar = (Toolbar) inflate.findViewById(R.id.toolbar);
        Context context = toolbar.getContext();
        HashSet hashSet = iah0.a;
        if (!fnj.d(context)) {
            toolbar.setNavigationIcon(new baf0(m33.a(R.drawable.vk_icon_arrow_left_outline_28, toolbar.getContext()), -1));
            toolbar.setNavigationContentDescription(R.string.accessibility_back);
            toolbar.setNavigationOnClickListener(new c98(this, 1));
        }
        this.e = toolbar;
        CollapsingToolbarLayout collapsingToolbarLayout = (CollapsingToolbarLayout) inflate.findViewById(R.id.collapsing_layout);
        abg0 abg0Var = dhr0.t;
        collapsingToolbarLayout.setCollapsedTitleTextColor(abg0Var.c(R.attr.vk_ui_text_primary));
        collapsingToolbarLayout.setExpandedTitleColor(abg0Var.c(R.attr.vk_ui_text_primary));
        this.f = collapsingToolbarLayout;
        this.g = (TextView) inflate.findViewById(R.id.block_subtitle);
        this.h = (VKImageView) inflate.findViewById(R.id.block_cover);
        this.i = (AppBarLayout) inflate.findViewById(R.id.app_bar_layout);
        AppBarLayout appBarLayout = (AppBarLayout) inflate.findViewById(R.id.app_bar_layout);
        final CollapsingToolbarLayout collapsingToolbarLayout2 = this.f;
        if (collapsingToolbarLayout2 == null) {
            collapsingToolbarLayout2 = null;
        }
        collapsingToolbarLayout2.setScrimAnimationDuration(300L);
        appBarLayout.a(new jpu(this, 0));
        u080 u080Var = new u080() { // from class: xsna.kpu
            @Override // xsna.u080
            public final bqx0 b(View view, bqx0 bqx0Var) {
                int i = bqx0Var.a.i(519).b;
                Toolbar toolbar2 = GroupsCollectionHeaderVh.this.e;
                if (toolbar2 == null) {
                    toolbar2 = null;
                }
                f4m.t(i, toolbar2);
                collapsingToolbarLayout2.setExpandedTitleMarginTop(cn70.b(204) - i);
                return bqx0.b;
            }
        };
        WeakHashMap<View, b0u0> weakHashMap = iut0.a;
        iut0.d.c(appBarLayout, u080Var);
        dhr0.f(this);
        return inflate;
    }

    @Override // xsna.dhr0.e
    public final void sb(VKTheme vKTheme) {
        CollapsingToolbarLayout collapsingToolbarLayout = this.f;
        if (collapsingToolbarLayout == null) {
            collapsingToolbarLayout = null;
        }
        abg0 abg0Var = dhr0.t;
        collapsingToolbarLayout.setCollapsedTitleTextColor(abg0Var.c(R.attr.vk_ui_text_primary));
        collapsingToolbarLayout.setExpandedTitleColor(abg0Var.c(R.attr.vk_ui_text_primary));
        Activity b = enj.b(collapsingToolbarLayout);
        if (b != null) {
            p90.b(b, collapsingToolbarLayout.getResources().getColor(android.R.color.transparent, null), false);
        }
    }

    @Override // com.vk.catalog2.common.ui.holders.api.CatalogViewHolder
    public final void L() {
    }
}
