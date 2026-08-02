package com.vk.catalog2.common.ui.holders.group;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.vk.catalog2.common.dto.api.ui.UIBlock;
import com.vk.catalog2.common.dto.ui.UIBlockGroup;
import com.vk.dto.group.GroupLikes;
import com.vkontakte.android.R;
import kotlin.Pair;
import xsna.b5a;
import xsna.c98;
import xsna.m3a;
import xsna.omw;
import xsna.v01;

/* compiled from: GroupLikeRecentBusinessesVh.kt */
/* loaded from: classes16.dex */
public final class GroupLikeRecentBusinessesVh extends GroupVh implements View.OnClickListener {
    public GroupLikeRecentBusinessesVh(m3a m3aVar, b5a b5aVar) {
        super(R.layout.catalog_group_list_item, 12224, null, m3aVar, null, b5aVar, false);
    }

    @Override // com.vk.catalog2.common.ui.holders.group.GroupVh, com.vk.catalog2.common.ui.holders.group.BaseGroupVh, com.vk.catalog2.common.ui.holders.api.CatalogViewHolder
    public final void N6(UIBlock uIBlock) {
        super.N6(uIBlock);
        if (uIBlock instanceof UIBlockGroup) {
            ImageView imageView = this.A;
            if (imageView != null) {
                imageView.setVisibility(0);
            }
            GroupLikes groupLikes = ((UIBlockGroup) uIBlock).y.T;
            if (groupLikes != null) {
                Pair pair = groupLikes.c ? new Pair(Integer.valueOf(R.drawable.vk_icon_done_outline_28), Integer.valueOf(R.attr.vk_ui_icon_secondary)) : new Pair(Integer.valueOf(R.drawable.vk_icon_thumbs_up_outline_28), Integer.valueOf(R.attr.vk_ui_text_accent));
                int intValue = ((Number) pair.d()).intValue();
                int intValue2 = ((Number) pair.g()).intValue();
                ImageView imageView2 = this.A;
                if (imageView2 != null) {
                    imageView2.setImageResource(intValue);
                }
                ImageView imageView3 = this.A;
                if (imageView3 != null) {
                    omw.b(imageView3, intValue2);
                }
            }
        }
    }

    @Override // com.vk.catalog2.common.ui.holders.group.GroupVh, com.vk.catalog2.common.ui.holders.api.CatalogViewHolder
    public final View k5(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View k5 = super.k5(layoutInflater, viewGroup, bundle);
        ImageView imageView = this.A;
        if (imageView != null) {
            imageView.setOnClickListener(new c98(new v01(this, 5), 1));
        }
        return k5;
    }
}
