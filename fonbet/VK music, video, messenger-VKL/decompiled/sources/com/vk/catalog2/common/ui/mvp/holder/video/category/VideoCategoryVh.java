package com.vk.catalog2.common.ui.mvp.holder.video.category;

import android.app.Activity;
import android.content.Context;
import android.graphics.Rect;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.vk.catalog2.common.dto.api.ui.UIBlock;
import com.vk.catalog2.common.dto.ui.UIBlockVideoCategory;
import com.vk.catalog2.common.ui.holders.api.CatalogViewHolder;
import com.vk.catalog2.common.ui.mvp.video.VideoCategoryCatalogFragment;
import com.vk.core.ui.tracking.UiTrackingScreen;
import com.vk.dto.video.LiveCategory;
import com.vk.imageloader.view.VKImageView;
import com.vkontakte.android.R;
import java.text.DecimalFormat;
import xsna.bwt0;
import xsna.c98;
import xsna.e3m;
import xsna.m33;
import xsna.qcy;
import xsna.z8s;

/* compiled from: VideoCategoryVh.kt */
/* loaded from: classes16.dex */
public final class VideoCategoryVh implements CatalogViewHolder, View.OnClickListener {
    public TextView b;
    public VKImageView c;
    public LinearLayout d;
    public TextView e;
    public UIBlockVideoCategory f;

    @Override // com.vk.catalog2.common.ui.holders.api.CatalogViewHolder
    public final void N6(UIBlock uIBlock) {
        UIBlockVideoCategory uIBlockVideoCategory = uIBlock instanceof UIBlockVideoCategory ? (UIBlockVideoCategory) uIBlock : null;
        if (uIBlockVideoCategory == null) {
            return;
        }
        LiveCategory liveCategory = uIBlockVideoCategory.y;
        TextView textView = this.b;
        if (textView == null) {
            textView = null;
        }
        String str = liveCategory.c;
        int i = liveCategory.f;
        textView.setText(str);
        VKImageView vKImageView = this.c;
        if (vKImageView == null) {
            vKImageView = null;
        }
        vKImageView.load(liveCategory.d);
        LinearLayout linearLayout = this.d;
        if (linearLayout == null) {
            linearLayout = null;
        }
        linearLayout.setVisibility(i > 0 ? 0 : 8);
        TextView textView2 = this.e;
        TextView textView3 = textView2 == null ? null : textView2;
        DecimalFormat decimalFormat = z8s.a;
        textView3.setText(z8s.b((textView2 != null ? textView2 : null).getResources(), i, R.plurals.vk_video_live_category_counter_plurals_template, R.string.vk_video_live_category_counter_template));
        this.f = uIBlockVideoCategory;
    }

    @Override // com.vk.catalog2.common.ui.holders.api.CatalogViewHolder
    public final View k5(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(R.layout.catalog2_category_video, viewGroup, false);
        this.b = (TextView) inflate.findViewById(R.id.title);
        VKImageView vKImageView = (VKImageView) inflate.findViewById(R.id.preview);
        this.c = vKImageView;
        vKImageView.setPlaceholderImage(m33.a(R.drawable.catalog_album_placeholder_old, inflate.getContext()));
        this.d = (LinearLayout) inflate.findViewById(R.id.viewers_counter);
        this.e = (TextView) inflate.findViewById(R.id.viewers_count);
        inflate.setOnClickListener(new c98(this, 1));
        if (inflate.getWidth() > 0) {
            inflate.getWidth();
            return inflate;
        }
        if (inflate.getMeasuredWidth() > 0) {
            inflate.getMeasuredWidth();
            return inflate;
        }
        qcy<Object>[] qcyVarArr = bwt0.a;
        inflate.getResources().getDimension(R.dimen.video_catalog_vertical_playlist_item_max_width);
        return inflate;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        Context context;
        Activity h;
        UIBlockVideoCategory uIBlockVideoCategory;
        LiveCategory liveCategory;
        String str;
        if (view == null || (context = view.getContext()) == null || (h = e3m.h(context)) == null || (uIBlockVideoCategory = this.f) == null || (str = (liveCategory = uIBlockVideoCategory.y).b) == null) {
            return;
        }
        VideoCategoryCatalogFragment.a aVar = new VideoCategoryCatalogFragment.a(VideoCategoryCatalogFragment.class, null, null);
        Bundle bundle = aVar.j;
        bundle.putString("category_id", str);
        String str2 = uIBlockVideoCategory.f;
        if (str2 != null) {
            bundle.putString("ref", str2);
        }
        String str3 = liveCategory.b;
        if (str3 != null) {
            bundle.putString("track_code", str3);
        }
        aVar.k(h);
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
