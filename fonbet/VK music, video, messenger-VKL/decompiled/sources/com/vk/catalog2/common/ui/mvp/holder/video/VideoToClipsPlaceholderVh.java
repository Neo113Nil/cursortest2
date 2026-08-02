package com.vk.catalog2.common.ui.mvp.holder.video;

import android.graphics.Rect;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.vk.catalog2.common.dto.api.ui.UIBlock;
import com.vk.catalog2.common.dto.api.ui.action.UIBlockAction;
import com.vk.catalog2.common.dto.ui.UIBlockPlaceholder;
import com.vk.catalog2.common.ui.holders.api.CatalogViewHolder;
import com.vk.core.ui.tracking.UiTrackingScreen;
import com.vkontakte.android.R;
import java.util.ArrayList;
import xsna.bwt0;
import xsna.f4m;
import xsna.his0;
import xsna.iah0;

/* compiled from: VideoToClipsPlaceholderVh.kt */
/* loaded from: classes16.dex */
public final class VideoToClipsPlaceholderVh implements CatalogViewHolder, View.OnClickListener {
    public static final int h = iah0.a(16);
    public final com.vk.catalog2.common.ui.mvp.util.a b;
    public TextView c;
    public TextView d;
    public TextView e;
    public UIBlockPlaceholder f;
    public UIBlockAction g;

    public VideoToClipsPlaceholderVh(com.vk.catalog2.common.ui.mvp.util.a aVar) {
        this.b = aVar;
    }

    @Override // com.vk.catalog2.common.ui.holders.api.CatalogViewHolder
    public final void N6(UIBlock uIBlock) {
        com.vk.catalog2.common.ui.mvp.util.a aVar;
        UIBlockPlaceholder uIBlockPlaceholder = uIBlock instanceof UIBlockPlaceholder ? (UIBlockPlaceholder) uIBlock : null;
        if (uIBlockPlaceholder == null) {
            return;
        }
        this.f = uIBlockPlaceholder;
        TextView textView = this.c;
        if (textView == null) {
            textView = null;
        }
        UIBlockPlaceholder uIBlockPlaceholder2 = (UIBlockPlaceholder) uIBlock;
        textView.setText(uIBlockPlaceholder2.A);
        TextView textView2 = this.d;
        if (textView2 == null) {
            textView2 = null;
        }
        textView2.setText(uIBlockPlaceholder2.D);
        this.g = null;
        ArrayList<UIBlockAction> arrayList = uIBlockPlaceholder2.G;
        int size = arrayList.size();
        int i = 0;
        while (true) {
            aVar = this.b;
            if (i >= size) {
                break;
            }
            if (this.g == null) {
                UIBlockAction uIBlockAction = arrayList.get(i);
                aVar.getClass();
                if (com.vk.catalog2.common.ui.mvp.util.a.d(uIBlockAction)) {
                    this.g = arrayList.get(i);
                }
            }
            i++;
        }
        TextView textView3 = this.e;
        if (textView3 == null) {
            textView3 = null;
        }
        aVar.a(textView3, this.g);
        TextView textView4 = this.e;
        TextView textView5 = textView4 != null ? textView4 : null;
        his0.w(textView5, R.drawable.vk_icon_sync_16, R.attr.vk_ui_text_accent_themed);
        textView5.setCompoundDrawablePadding(iah0.a(6));
    }

    @Override // com.vk.catalog2.common.ui.holders.api.CatalogViewHolder
    public final View k5(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        ViewGroup viewGroup2 = (ViewGroup) layoutInflater.inflate(R.layout.catalog_video_to_clips_placeholder_empty, viewGroup, false);
        this.c = (TextView) viewGroup2.findViewById(R.id.catalog_placeholder_title);
        this.d = (TextView) viewGroup2.findViewById(R.id.catalog_placeholder_subtitle);
        View findViewById = viewGroup2.findViewById(R.id.catalog_placeholder_make_clips_action);
        bwt0.h0(this, (TextView) findViewById);
        this.e = (TextView) findViewById;
        int i = h;
        f4m.s(i, viewGroup2);
        f4m.r(i, viewGroup2);
        bwt0.h0(this, viewGroup2);
        return viewGroup2;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        if (view == null) {
            return;
        }
        int id = view.getId();
        TextView textView = this.e;
        if (textView == null) {
            textView = null;
        }
        if (id == textView.getId()) {
            UIBlockPlaceholder uIBlockPlaceholder = this.f;
            UIBlockAction uIBlockAction = this.g;
            if (uIBlockPlaceholder == null || uIBlockAction == null) {
                return;
            }
            com.vk.catalog2.common.ui.mvp.util.a.e(this.b, view.getContext(), uIBlockPlaceholder, uIBlockAction, null, 56);
        }
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
