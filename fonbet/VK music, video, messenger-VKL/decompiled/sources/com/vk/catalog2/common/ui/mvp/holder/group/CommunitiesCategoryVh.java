package com.vk.catalog2.common.ui.mvp.holder.group;

import android.graphics.Rect;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.vk.catalog2.common.dto.api.ui.UIBlock;
import com.vk.catalog2.common.dto.ui.UIBlockGroupsCategory;
import com.vk.catalog2.common.ui.holders.api.CatalogViewHolder;
import com.vk.catalog2.common.ui.mvp.configuration.CatalogConfiguration;
import com.vk.core.ui.tracking.UiTrackingScreen;
import com.vk.dto.common.Image;
import com.vk.dto.common.ImageSize;
import com.vk.dto.group.GroupsCategory;
import com.vk.imageloader.view.VKImageView;
import com.vkontakte.android.R;
import xsna.b5a;
import xsna.c98;
import xsna.cn70;
import xsna.dhr0;
import xsna.lpg0;
import xsna.nda;
import xsna.sg0;

/* compiled from: CommunitiesCategoryVh.kt */
/* loaded from: classes16.dex */
public final class CommunitiesCategoryVh implements CatalogViewHolder {
    public final int b;
    public final CatalogConfiguration c;
    public final nda d;
    public final com.vk.catalog2.common.ui.mvp.util.a e;
    public final b5a f;
    public final lpg0 g;
    public VKImageView h;
    public TextView i;
    public UIBlockGroupsCategory j;

    public CommunitiesCategoryVh(int i, CatalogConfiguration catalogConfiguration, nda ndaVar, com.vk.catalog2.common.ui.mvp.util.a aVar, b5a b5aVar, lpg0 lpg0Var) {
        this.b = i;
        this.c = catalogConfiguration;
        this.d = ndaVar;
        this.e = aVar;
        this.f = b5aVar;
        this.g = lpg0Var;
    }

    @Override // com.vk.catalog2.common.ui.holders.api.CatalogViewHolder
    public final void N6(UIBlock uIBlock) {
        ImageSize Cb;
        if (uIBlock instanceof UIBlockGroupsCategory) {
            UIBlockGroupsCategory uIBlockGroupsCategory = (UIBlockGroupsCategory) uIBlock;
            GroupsCategory groupsCategory = uIBlockGroupsCategory.y;
            this.j = uIBlockGroupsCategory;
            TextView textView = this.i;
            String str = null;
            if (textView == null) {
                textView = null;
            }
            textView.setText(groupsCategory.c);
            VKImageView vKImageView = this.h;
            if (vKImageView == null) {
                vKImageView = null;
            }
            Image image = groupsCategory.g;
            if (image != null && (Cb = image.Cb(cn70.b(44), true, false)) != null) {
                str = Cb.d.d;
            }
            vKImageView.load(str);
        }
    }

    @Override // com.vk.catalog2.common.ui.holders.api.CatalogViewHolder
    public final View k5(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(this.b, viewGroup, false);
        this.h = (VKImageView) inflate.findViewById(R.id.category_image);
        this.i = (TextView) inflate.findViewById(R.id.category_title);
        VKImageView vKImageView = this.h;
        if (vKImageView == null) {
            vKImageView = null;
        }
        vKImageView.setPlaceholderColor(dhr0.t.c(R.attr.vk_ui_image_placeholder));
        inflate.setOnClickListener(new c98(new sg0(this, 3), 1));
        return inflate;
    }

    @Override // com.vk.catalog2.common.ui.holders.api.CatalogViewHolder
    public final void yh(int i, UIBlock uIBlock) {
        N6(uIBlock);
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
