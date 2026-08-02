package com.vk.catalog2.common.ui.mvp.holder.video.category;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.vk.catalog2.common.dto.api.ui.UIBlock;
import com.vk.catalog2.common.dto.ui.UIBlockVideoCategory;
import com.vk.catalog2.common.ui.holders.CatalogClickableViewHolder;
import com.vk.dto.video.LiveCategory;
import com.vk.imageloader.view.VKImageView;
import com.vkontakte.android.R;
import java.text.DecimalFormat;
import java.util.HashSet;
import xsna.bwt0;
import xsna.cn70;
import xsna.f4m;
import xsna.fnj;
import xsna.iah0;
import xsna.m33;
import xsna.qcy;
import xsna.z8s;

/* compiled from: VideoCategoryCoverVh.kt */
/* loaded from: classes16.dex */
public final class VideoCategoryCoverVh extends CatalogClickableViewHolder {
    public TextView e;
    public TextView f;
    public VKImageView g;

    @Override // com.vk.catalog2.common.ui.holders.CatalogClickableViewHolder
    public final void b(UIBlock uIBlock) {
        String string;
        if (uIBlock instanceof UIBlockVideoCategory) {
            LiveCategory liveCategory = ((UIBlockVideoCategory) uIBlock).y;
            TextView textView = this.e;
            if (textView == null) {
                textView = null;
            }
            textView.setText(liveCategory.c);
            VKImageView vKImageView = this.g;
            if (vKImageView == null) {
                vKImageView = null;
            }
            vKImageView.load(liveCategory.d);
            TextView textView2 = this.f;
            TextView textView3 = textView2 == null ? null : textView2;
            long j = liveCategory.f;
            if (j > 0) {
                DecimalFormat decimalFormat = z8s.a;
                string = z8s.b((textView2 != null ? textView2 : null).getResources(), j, R.plurals.video_spectators_count, R.string.video_spectators_count_formatted);
            } else {
                string = (textView2 != null ? textView2 : null).getResources().getString(R.string.video_catalog_playlist_zero_viewers);
            }
            textView3.setText(string);
        }
    }

    @Override // com.vk.catalog2.common.ui.holders.api.CatalogViewHolder
    public final View k5(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(R.layout.catalog2_category_info, viewGroup, false);
        this.e = (TextView) inflate.findViewById(R.id.title);
        this.f = (TextView) inflate.findViewById(R.id.viewers);
        this.g = (VKImageView) inflate.findViewById(R.id.preview);
        Context context = inflate.getContext();
        HashSet hashSet = iah0.a;
        boolean d = fnj.d(context);
        VKImageView vKImageView = this.g;
        if (vKImageView == null) {
            vKImageView = null;
        }
        f4m.s(cn70.b(d ? 32 : 12), vKImageView);
        VKImageView vKImageView2 = this.g;
        (vKImageView2 != null ? vKImageView2 : null).setPlaceholderImage(m33.a(R.drawable.catalog_album_placeholder_old, inflate.getContext()));
        qcy<Object>[] qcyVarArr = bwt0.a;
        inflate.getResources().getDimension(R.dimen.video_catalog_vertical_playlist_item_max_width);
        return inflate;
    }

    @Override // com.vk.catalog2.common.ui.holders.api.CatalogViewHolder
    public final void L() {
    }
}
