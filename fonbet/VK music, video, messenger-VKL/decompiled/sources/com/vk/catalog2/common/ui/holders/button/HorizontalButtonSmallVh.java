package com.vk.catalog2.common.ui.holders.button;

import android.graphics.Rect;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.vk.catalog2.common.dto.api.CatalogButtonOpenUrl;
import com.vk.catalog2.common.dto.api.ui.UIBlock;
import com.vk.catalog2.common.dto.ui.subscriptions.UIBlockHorizontalButtonSmall;
import com.vk.catalog2.common.ui.holders.api.CatalogViewHolder;
import com.vk.catalog2.common.ui.holders.button.HorizontalButtonSmallVh;
import com.vk.common.links.LaunchContext;
import com.vk.core.ui.tracking.UiTrackingScreen;
import com.vk.core.view.components.button.VkButton;
import com.vk.dto.common.actions.ActionOpenUrl;
import com.vk.stat.scheme.MobileOfficialAppsVideoStat$TypeMoveYoutubeSubsClickItem;
import com.vkontakte.android.R;
import xsna.j5g;
import xsna.maz;
import xsna.qdz;

/* compiled from: HorizontalButtonSmallVh.kt */
/* loaded from: classes16.dex */
public final class HorizontalButtonSmallVh implements CatalogViewHolder {
    public final qdz b;
    public VkButton c;
    public VkButton d;

    public HorizontalButtonSmallVh(qdz qdzVar) {
        this.b = qdzVar;
    }

    @Override // com.vk.catalog2.common.ui.holders.api.CatalogViewHolder
    public final void N6(final UIBlock uIBlock) {
        ActionOpenUrl actionOpenUrl;
        ActionOpenUrl actionOpenUrl2;
        if (uIBlock instanceof UIBlockHorizontalButtonSmall) {
            UIBlockHorizontalButtonSmall uIBlockHorizontalButtonSmall = (UIBlockHorizontalButtonSmall) uIBlock;
            CatalogButtonOpenUrl catalogButtonOpenUrl = (CatalogButtonOpenUrl) j5g.b0(0, uIBlockHorizontalButtonSmall.y);
            CatalogButtonOpenUrl catalogButtonOpenUrl2 = (CatalogButtonOpenUrl) j5g.b0(1, uIBlockHorizontalButtonSmall.y);
            if (catalogButtonOpenUrl == null || (actionOpenUrl2 = catalogButtonOpenUrl.f) == null) {
                VkButton vkButton = this.c;
                if (vkButton == null) {
                    vkButton = null;
                }
                vkButton.setVisibility(8);
            } else {
                VkButton vkButton2 = this.c;
                if (vkButton2 == null) {
                    vkButton2 = null;
                }
                vkButton2.setVisibility(0);
                VkButton vkButton3 = this.c;
                if (vkButton3 == null) {
                    vkButton3 = null;
                }
                vkButton3.setText(catalogButtonOpenUrl.e);
                final String str = actionOpenUrl2.c;
                if (str != null) {
                    VkButton vkButton4 = this.c;
                    if (vkButton4 == null) {
                        vkButton4 = null;
                    }
                    vkButton4.setOnClickListener(new View.OnClickListener() { // from class: xsna.pcv
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            UIBlock uIBlock2 = uIBlock;
                            HorizontalButtonSmallVh.this.a(str, uIBlock2.f);
                            s1v s1vVar = p1s0.a;
                            p1s0.c(uIBlock2, new com.vk.stat.scheme.j0());
                        }
                    });
                }
            }
            if (catalogButtonOpenUrl2 == null || (actionOpenUrl = catalogButtonOpenUrl2.f) == null) {
                VkButton vkButton5 = this.d;
                (vkButton5 != null ? vkButton5 : null).setVisibility(8);
                return;
            }
            VkButton vkButton6 = this.d;
            if (vkButton6 == null) {
                vkButton6 = null;
            }
            vkButton6.setVisibility(0);
            VkButton vkButton7 = this.d;
            if (vkButton7 == null) {
                vkButton7 = null;
            }
            vkButton7.setText(catalogButtonOpenUrl2.e);
            final String str2 = actionOpenUrl.c;
            if (str2 != null) {
                VkButton vkButton8 = this.d;
                (vkButton8 != null ? vkButton8 : null).setOnClickListener(new View.OnClickListener() { // from class: xsna.qcv
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        UIBlock uIBlock2 = uIBlock;
                        HorizontalButtonSmallVh.this.a(str2, uIBlock2.f);
                        s1v s1vVar = p1s0.a;
                        p1s0.c(uIBlock2, new MobileOfficialAppsVideoStat$TypeMoveYoutubeSubsClickItem(MobileOfficialAppsVideoStat$TypeMoveYoutubeSubsClickItem.EventType.MOVE_YOUTUBE_SUBS_PROMO_START));
                    }
                });
            }
        }
    }

    public final void a(String str, String str2) {
        LaunchContext.a aVar = new LaunchContext.a();
        aVar.d = str2;
        LaunchContext a = aVar.a();
        maz e = this.b.e();
        VkButton vkButton = this.c;
        if (vkButton == null) {
            vkButton = null;
        }
        maz.c(e, vkButton.getContext(), str, a, null, null, 24);
    }

    @Override // com.vk.catalog2.common.ui.holders.api.CatalogViewHolder
    public final View k5(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(R.layout.catalog2_horizontal_button_small, viewGroup, false);
        this.c = (VkButton) inflate.findViewById(R.id.btn_change_author);
        this.d = (VkButton) inflate.findViewById(R.id.btn_setting_youtube);
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
