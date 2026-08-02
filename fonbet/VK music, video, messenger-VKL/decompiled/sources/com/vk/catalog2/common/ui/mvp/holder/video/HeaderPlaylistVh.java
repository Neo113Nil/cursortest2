package com.vk.catalog2.common.ui.mvp.holder.video;

import android.graphics.Rect;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.vk.catalog2.common.dto.api.badge.CatalogBadge;
import com.vk.catalog2.common.dto.api.ui.UIBlock;
import com.vk.catalog2.common.dto.ui.UIBlockBadge;
import com.vk.catalog2.common.dto.ui.UIBlockHeader;
import com.vk.catalog2.common.ui.holders.HeaderVh;
import com.vkontakte.android.R;
import xsna.arm0;
import xsna.b5a;
import xsna.baf0;
import xsna.bpn0;
import xsna.c98;
import xsna.ejf0;
import xsna.fyd0;
import xsna.iz3;

/* compiled from: HeaderPlaylistVh.kt */
/* loaded from: classes16.dex */
public final class HeaderPlaylistVh extends HeaderVh {
    public final ejf0 s;
    public final fyd0 t;
    public final boolean u;
    public final bpn0 v;

    public HeaderPlaylistVh(b5a b5aVar, ejf0 ejf0Var, fyd0 fyd0Var, boolean z) {
        super(R.layout.catalog_header_playlist, null, b5aVar, 8);
        this.s = ejf0Var;
        this.t = fyd0Var;
        this.u = z;
        this.v = new bpn0(new iz3(11));
    }

    @Override // com.vk.catalog2.common.ui.holders.HeaderVh, com.vk.catalog2.common.ui.holders.api.CatalogViewHolder
    public final void N6(UIBlock uIBlock) {
        CatalogBadge catalogBadge;
        String str;
        Integer m;
        super.N6(uIBlock);
        UIBlockHeader uIBlockHeader = uIBlock instanceof UIBlockHeader ? (UIBlockHeader) uIBlock : null;
        if (uIBlockHeader == null) {
            return;
        }
        UIBlockBadge uIBlockBadge = uIBlockHeader.C;
        if (uIBlockBadge != null && (catalogBadge = uIBlockBadge.y) != null && (str = catalogBadge.b) != null && (m = arm0.m(10, str)) != null) {
            if (m.intValue() > 1) {
                ImageView imageView = this.m;
                if (imageView != null) {
                    imageView.setOnClickListener(new c98(this, 1));
                }
                ImageView imageView2 = this.m;
                if (imageView2 != null) {
                    imageView2.setAlpha(1.0f);
                }
            } else {
                ImageView imageView3 = this.m;
                if (imageView3 != null) {
                    imageView3.setOnClickListener(null);
                }
                ImageView imageView4 = this.m;
                if (imageView4 != null) {
                    imageView4.setAlpha(0.64f);
                }
            }
        }
        ImageView imageView5 = this.m;
        if (imageView5 != null) {
            View view = this.f;
            imageView5.setContentDescription((view != null ? view : null).getContext().getString(((Boolean) this.s.invoke()).booleanValue() ? R.string.playlist_sort_description : R.string.playlist_sort_inverse_description));
        }
    }

    @Override // com.vk.catalog2.common.ui.holders.HeaderVh, com.vk.catalog2.common.ui.holders.api.CatalogViewHolder
    public final View k5(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View k5 = super.k5(layoutInflater, viewGroup, bundle);
        ImageView imageView = this.m;
        if (imageView != null) {
            imageView.setImageDrawable((baf0) this.v.getValue());
        }
        ImageView imageView2 = this.m;
        if (imageView2 != null) {
            imageView2.setVisibility(this.u ? 0 : 8);
        }
        return k5;
    }

    @Override // com.vk.catalog2.common.ui.holders.HeaderVh, android.view.View.OnClickListener
    public final void onClick(View view) {
        Integer valueOf = view != null ? Integer.valueOf(view.getId()) : null;
        if (valueOf != null && valueOf.intValue() == R.id.sort) {
            this.t.invoke();
        }
    }

    @Override // com.vk.catalog2.common.ui.holders.HeaderVh, com.vk.catalog2.common.ui.holders.api.CatalogViewHolder
    public final boolean ze(Rect rect) {
        TextView textView = this.g;
        if (textView == null) {
            textView = null;
        }
        textView.getGlobalVisibleRect(rect);
        return true;
    }

    @Override // com.vk.catalog2.common.ui.holders.HeaderVh, com.vk.catalog2.common.ui.holders.api.CatalogViewHolder
    public final void L() {
    }
}
