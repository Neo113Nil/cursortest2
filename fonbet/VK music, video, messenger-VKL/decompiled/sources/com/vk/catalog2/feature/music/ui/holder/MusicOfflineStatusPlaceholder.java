package com.vk.catalog2.feature.music.ui.holder;

import android.content.SharedPreferences;
import android.graphics.Rect;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.vk.catalog2.common.dto.api.ui.UIBlock;
import com.vk.catalog2.common.ui.holders.api.CatalogViewHolder;
import com.vk.catalog2.common.ui.mvp.holder.placeholder.PlaceholderVh;
import com.vk.core.ui.tracking.UiTrackingScreen;
import com.vkontakte.android.R;
import xsna.bwt0;
import xsna.c98;
import xsna.ky6;

/* compiled from: MusicOfflineStatusPlaceholder.kt */
/* loaded from: classes16.dex */
public final class MusicOfflineStatusPlaceholder implements CatalogViewHolder, View.OnClickListener {
    public final SharedPreferences b;
    public View c;
    public View d;
    public TextView e;
    public View f;

    public MusicOfflineStatusPlaceholder(ky6 ky6Var) {
        this.b = ky6Var;
    }

    public final void a() {
        if (this.b.getBoolean("placeholder_collapse_needed", true)) {
            return;
        }
        View view = this.c;
        if (view == null) {
            view = null;
        }
        bwt0.p0(view, true);
        View view2 = this.f;
        if (view2 == null) {
            view2 = null;
        }
        bwt0.p0(view2, false);
        View view3 = this.d;
        bwt0.p0(view3 != null ? view3 : null, false);
    }

    @Override // com.vk.catalog2.common.ui.holders.api.CatalogViewHolder
    public final View k5(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(R.layout.catalog_offline_status_placeholder, viewGroup, false);
        ViewGroup viewGroup2 = (ViewGroup) inflate;
        this.c = viewGroup2.findViewById(R.id.collapsed_status);
        View findViewById = viewGroup2.findViewById(R.id.expanded_container);
        this.d = findViewById;
        new PlaceholderVh.b(R.drawable.vk_icon_download_outline_28, 0.12f, R.color.vk_purple, R.color.vk_purple, 15).a((ImageView) findViewById.findViewById(R.id.catalog_placeholder_view_image));
        View view = this.d;
        if (view == null) {
            view = null;
        }
        TextView textView = (TextView) view.findViewById(R.id.catalog_placeholder_view_title);
        this.e = textView;
        bwt0.p0(textView, true);
        TextView textView2 = this.e;
        if (textView2 == null) {
            textView2 = null;
        }
        textView2.setText(viewGroup2.getContext().getString(R.string.catalog_offline_status));
        View view2 = this.d;
        ((TextView) (view2 != null ? view2 : null).findViewById(R.id.catalog_placeholder_view_description)).setText(viewGroup2.getContext().getString(R.string.catalog_offline_status_description));
        View findViewById2 = viewGroup2.findViewById(R.id.dismiss_button);
        this.f = findViewById2;
        findViewById2.setOnClickListener(new c98(this, 1));
        a();
        return inflate;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        if (view == null) {
            return;
        }
        SharedPreferences.Editor edit = this.b.edit();
        edit.putBoolean("placeholder_collapse_needed", false);
        edit.commit();
        a();
    }

    @Override // com.vk.catalog2.common.ui.holders.api.CatalogViewHolder
    public final boolean ze(Rect rect) {
        return false;
    }

    @Override // com.vk.catalog2.common.ui.holders.api.CatalogViewHolder
    public final void L() {
    }

    @Override // com.vk.catalog2.common.ui.holders.api.CatalogViewHolder
    public final void N6(UIBlock uIBlock) {
    }

    @Override // xsna.m0q0
    public final void y(UiTrackingScreen uiTrackingScreen) {
    }

    @Override // com.vk.catalog2.common.ui.holders.api.CatalogViewHolder
    public final void yh(int i, UIBlock uIBlock) {
    }
}
