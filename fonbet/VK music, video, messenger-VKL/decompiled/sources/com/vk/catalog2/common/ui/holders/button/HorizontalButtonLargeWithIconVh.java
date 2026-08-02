package com.vk.catalog2.common.ui.holders.button;

import android.graphics.Rect;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.vk.catalog2.common.dto.api.CatalogButtonOpenUrl;
import com.vk.catalog2.common.dto.api.ui.UIBlock;
import com.vk.catalog2.common.dto.ui.subscriptions.UIBlockHorizontalButtonLarge;
import com.vk.catalog2.common.ui.holders.api.CatalogViewHolder;
import com.vk.catalog2.common.ui.holders.button.HorizontalButtonLargeWithIconVh;
import com.vk.common.links.LaunchContext;
import com.vk.core.ui.tracking.UiTrackingScreen;
import com.vk.dto.common.actions.ActionOpenUrl;
import com.vk.stat.scheme.MobileOfficialAppsVideoStat$TypeMoveYoutubeSubsClickItem;
import com.vkontakte.android.R;
import xsna.j5g;
import xsna.maz;
import xsna.qdz;
import xsna.w36;

/* compiled from: HorizontalButtonLargeWithIconVh.kt */
/* loaded from: classes16.dex */
public final class HorizontalButtonLargeWithIconVh implements CatalogViewHolder {
    public final qdz b;
    public View c;
    public TextView d;
    public View e;
    public TextView f;

    public HorizontalButtonLargeWithIconVh(qdz qdzVar) {
        this.b = qdzVar;
    }

    @Override // com.vk.catalog2.common.ui.holders.api.CatalogViewHolder
    public final void N6(final UIBlock uIBlock) {
        String str;
        final String str2;
        if (uIBlock instanceof UIBlockHorizontalButtonLarge) {
            UIBlockHorizontalButtonLarge uIBlockHorizontalButtonLarge = (UIBlockHorizontalButtonLarge) uIBlock;
            CatalogButtonOpenUrl catalogButtonOpenUrl = (CatalogButtonOpenUrl) j5g.b0(0, uIBlockHorizontalButtonLarge.y);
            CatalogButtonOpenUrl catalogButtonOpenUrl2 = (CatalogButtonOpenUrl) j5g.b0(1, uIBlockHorizontalButtonLarge.y);
            if (catalogButtonOpenUrl == null) {
                View view = this.c;
                if (view == null) {
                    view = null;
                }
                view.setVisibility(8);
            } else {
                TextView textView = this.d;
                if (textView == null) {
                    textView = null;
                }
                textView.setText(catalogButtonOpenUrl.e);
                ActionOpenUrl actionOpenUrl = catalogButtonOpenUrl.f;
                if (actionOpenUrl != null && (str = actionOpenUrl.c) != null) {
                    View view2 = this.c;
                    if (view2 == null) {
                        view2 = null;
                    }
                    view2.setOnClickListener(new w36(this, str, uIBlock, 1));
                }
            }
            if (catalogButtonOpenUrl2 == null) {
                View view3 = this.e;
                (view3 != null ? view3 : null).setVisibility(8);
                return;
            }
            TextView textView2 = this.f;
            if (textView2 == null) {
                textView2 = null;
            }
            textView2.setText(catalogButtonOpenUrl2.e);
            ActionOpenUrl actionOpenUrl2 = catalogButtonOpenUrl2.f;
            if (actionOpenUrl2 == null || (str2 = actionOpenUrl2.c) == null) {
                return;
            }
            View view4 = this.e;
            (view4 != null ? view4 : null).setOnClickListener(new View.OnClickListener() { // from class: xsna.ocv
                @Override // android.view.View.OnClickListener
                public final void onClick(View view5) {
                    UIBlock uIBlock2 = uIBlock;
                    HorizontalButtonLargeWithIconVh.this.a(str2, uIBlock2.f);
                    s1v s1vVar = p1s0.a;
                    p1s0.c(uIBlock2, new MobileOfficialAppsVideoStat$TypeMoveYoutubeSubsClickItem(MobileOfficialAppsVideoStat$TypeMoveYoutubeSubsClickItem.EventType.MOVE_YOUTUBE_SUBS_PROMO_START));
                }
            });
        }
    }

    public final void a(String str, String str2) {
        LaunchContext.a aVar = new LaunchContext.a();
        aVar.d = str2;
        LaunchContext a = aVar.a();
        maz e = this.b.e();
        View view = this.c;
        if (view == null) {
            view = null;
        }
        maz.c(e, view.getContext(), str, a, null, null, 24);
    }

    @Override // com.vk.catalog2.common.ui.holders.api.CatalogViewHolder
    public final View k5(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(R.layout.catalog2_horizontal_button_large, viewGroup, false);
        this.c = inflate.findViewById(R.id.btn_change_author);
        this.d = (TextView) inflate.findViewById(R.id.title_btn_authors);
        this.e = inflate.findViewById(R.id.btn_setting_youtube);
        this.f = (TextView) inflate.findViewById(R.id.title_btn_settings);
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
