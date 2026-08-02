package com.vk.catalog2.common.ui.mvp.holder;

import android.content.Context;
import android.graphics.Rect;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.mbridge.msdk.playercommon.exoplayer2.extractor.ts.PsExtractor;
import com.vk.catalog2.common.dto.api.ui.UIBlock;
import com.vk.catalog2.common.dto.api.ui.action.UIBlockAction;
import com.vk.catalog2.common.dto.ui.UIBlockPreview;
import com.vk.catalog2.common.dto.ui.actions.UIBlockActionOpenSection;
import com.vk.catalog2.common.dto.ui.actions.UIBlockActionOpenUrl;
import com.vk.catalog2.common.ui.holders.api.CatalogViewHolder;
import com.vk.catalog2.common.ui.mvp.configuration.a;
import com.vk.core.ui.tracking.UiTrackingScreen;
import com.vk.core.view.PhotoStackView;
import com.vkontakte.android.R;
import java.util.List;
import xsna.bwt0;
import xsna.c98;
import xsna.e43;
import xsna.j5g;
import xsna.nda;

/* compiled from: PreviewVh.kt */
/* loaded from: classes16.dex */
public final class PreviewVh implements CatalogViewHolder, View.OnClickListener {
    public final a b;
    public final nda c;
    public TextView d;
    public TextView e;
    public PhotoStackView f;
    public View g;
    public UIBlockPreview h;

    public PreviewVh(a aVar, nda ndaVar) {
        this.b = aVar;
        this.c = ndaVar;
    }

    @Override // com.vk.catalog2.common.ui.holders.api.CatalogViewHolder
    public final void N6(UIBlock uIBlock) {
        UIBlockPreview uIBlockPreview = uIBlock instanceof UIBlockPreview ? (UIBlockPreview) uIBlock : null;
        if (uIBlockPreview == null) {
            return;
        }
        TextView textView = this.d;
        if (textView == null) {
            textView = null;
        }
        textView.setText(uIBlockPreview.z);
        TextView textView2 = this.e;
        if (textView2 == null) {
            textView2 = null;
        }
        textView2.setText(uIBlockPreview.A);
        View view = this.g;
        if (view == null) {
            view = null;
        }
        bwt0.p0(view, j5g.a0(uIBlockPreview.B) instanceof UIBlockActionOpenUrl);
        List<String> list = uIBlockPreview.y;
        if (list != null) {
            PhotoStackView photoStackView = this.f;
            if (photoStackView == null) {
                photoStackView = null;
            }
            photoStackView.setMarginBetweenImages(2.0f);
            PhotoStackView photoStackView2 = this.f;
            if (photoStackView2 == null) {
                photoStackView2 = null;
            }
            photoStackView2.setOverlapOffset(0.33f);
            int min = Math.min(list.size(), 3);
            PhotoStackView photoStackView3 = this.f;
            if (photoStackView3 == null) {
                photoStackView3 = null;
            }
            photoStackView3.setCount(min);
            int i = 0;
            for (Object obj : list) {
                int i2 = i + 1;
                if (i < 0) {
                    e43.t();
                    throw null;
                }
                String str = (String) obj;
                PhotoStackView photoStackView4 = this.f;
                if (photoStackView4 == null) {
                    photoStackView4 = null;
                }
                photoStackView4.h(i, str);
                i = i2;
            }
        }
        this.h = uIBlockPreview;
    }

    @Override // com.vk.catalog2.common.ui.holders.api.CatalogViewHolder
    public final View k5(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(R.layout.catalog_preview_item, viewGroup, false);
        this.d = (TextView) inflate.findViewById(R.id.title);
        this.e = (TextView) inflate.findViewById(R.id.subtitle);
        this.f = (PhotoStackView) inflate.findViewById(R.id.photos);
        this.g = inflate.findViewById(R.id.icon);
        inflate.setOnClickListener(new c98(this, 1));
        return inflate;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        UIBlockPreview uIBlockPreview;
        UIBlockAction uIBlockAction;
        if (view == null || (uIBlockPreview = this.h) == null || (uIBlockAction = (UIBlockAction) j5g.a0(uIBlockPreview.B)) == null || !(uIBlockAction instanceof UIBlockActionOpenSection)) {
            return;
        }
        Context context = view.getContext();
        String str = ((UIBlockActionOpenSection) uIBlockAction).B;
        String str2 = uIBlockPreview.z;
        if (str2 == null) {
            str2 = "";
        }
        nda.e(this.c, context, this.b, str, str2, null, null, null, PsExtractor.VIDEO_STREAM_MASK);
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
