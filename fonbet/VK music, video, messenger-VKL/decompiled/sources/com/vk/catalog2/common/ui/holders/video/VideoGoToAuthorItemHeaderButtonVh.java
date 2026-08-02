package com.vk.catalog2.common.ui.holders.video;

import android.graphics.Rect;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.facebook.soloader.MinElf;
import com.vk.catalog2.common.dto.api.ui.UIBlock;
import com.vk.catalog2.common.dto.ui.actions.UIBlockActionGoToAuthor;
import com.vk.catalog2.common.ui.holders.api.CatalogViewHolder;
import com.vk.core.ui.tracking.UiTrackingScreen;
import com.vk.dto.group.Group;
import com.vkontakte.android.R;
import xsna.o0r0;

/* compiled from: VideoGoToAuthorItemHeaderButtonVh.kt */
/* loaded from: classes16.dex */
public final class VideoGoToAuthorItemHeaderButtonVh implements CatalogViewHolder, View.OnClickListener {
    public final int b;
    public final o0r0 c;
    public UIBlockActionGoToAuthor d;
    public View e;
    public TextView f;
    public TextView g;

    public VideoGoToAuthorItemHeaderButtonVh(int i, o0r0 o0r0Var) {
        this.b = i;
        this.c = o0r0Var;
    }

    @Override // com.vk.catalog2.common.ui.holders.api.CatalogViewHolder
    public final void N6(UIBlock uIBlock) {
        String str;
        UIBlockActionGoToAuthor uIBlockActionGoToAuthor = uIBlock instanceof UIBlockActionGoToAuthor ? (UIBlockActionGoToAuthor) uIBlock : null;
        if (uIBlockActionGoToAuthor == null) {
            return;
        }
        this.d = uIBlockActionGoToAuthor;
        TextView textView = this.f;
        if (textView != null) {
            Group group = uIBlockActionGoToAuthor.A;
            if (group == null || (str = group.d) == null) {
                str = "";
            }
            textView.setText(str);
        }
        TextView textView2 = this.g;
        if (textView2 != null) {
            textView2.setText(uIBlockActionGoToAuthor.z);
        }
    }

    @Override // com.vk.catalog2.common.ui.holders.api.CatalogViewHolder
    public final View k5(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(this.b, viewGroup, false);
        this.e = inflate;
        this.f = inflate != null ? (TextView) inflate.findViewById(R.id.title) : null;
        View view = this.e;
        TextView textView = view != null ? (TextView) view.findViewById(R.id.button) : null;
        this.g = textView;
        if (textView != null) {
            textView.setOnClickListener(this);
        }
        return inflate;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        UIBlockActionGoToAuthor uIBlockActionGoToAuthor;
        if (view == null || (uIBlockActionGoToAuthor = this.d) == null) {
            return;
        }
        this.c.m(view.getContext(), uIBlockActionGoToAuthor.g, new o0r0.a(false, null, null, null, null, null, null, false, false, false, false, null, null, null, MinElf.PN_XNUM));
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
