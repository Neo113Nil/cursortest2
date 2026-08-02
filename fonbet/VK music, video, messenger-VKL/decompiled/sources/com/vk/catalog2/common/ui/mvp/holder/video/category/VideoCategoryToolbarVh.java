package com.vk.catalog2.common.ui.mvp.holder.video.category;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.appcompat.widget.Toolbar;
import com.vk.catalog2.common.dto.api.ui.UIBlock;
import com.vk.catalog2.common.dto.ui.UIBlockVideoCategory;
import com.vk.catalog2.common.ui.holders.CatalogClickableViewHolder;
import com.vk.dto.video.LiveCategory;
import com.vkontakte.android.R;
import xsna.b5a;
import xsna.bwt0;
import xsna.c98;
import xsna.f1p0;
import xsna.mba;
import xsna.u4a;

/* compiled from: VideoCategoryToolbarVh.kt */
/* loaded from: classes16.dex */
public final class VideoCategoryToolbarVh extends CatalogClickableViewHolder {
    public final u4a.a e;
    public ImageView f;

    public VideoCategoryToolbarVh(mba mbaVar, b5a b5aVar, u4a.a aVar) {
        super(mbaVar, b5aVar);
        this.e = aVar;
    }

    @Override // com.vk.catalog2.common.ui.holders.CatalogClickableViewHolder
    public final void b(UIBlock uIBlock) {
        if (uIBlock instanceof UIBlockVideoCategory) {
            LiveCategory liveCategory = ((UIBlockVideoCategory) uIBlock).y;
            ImageView imageView = this.f;
            if (imageView != null) {
                imageView.setVisibility(0);
                bwt0.i0(imageView, new f1p0(3, liveCategory, this));
            }
        }
    }

    @Override // com.vk.catalog2.common.ui.holders.api.CatalogViewHolder
    public final View k5(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(R.layout.catalog_video_category_toolbar, viewGroup, false);
        Toolbar toolbar = (Toolbar) inflate;
        if (toolbar != null) {
            toolbar.setOnClickListener(new c98(this, 1));
        }
        this.f = (ImageView) inflate.findViewById(R.id.menu_button);
        toolbar.setNavigationOnClickListener(new c98(this, 1));
        return inflate;
    }

    @Override // com.vk.catalog2.common.ui.holders.api.CatalogViewHolder
    public final void L() {
    }
}
