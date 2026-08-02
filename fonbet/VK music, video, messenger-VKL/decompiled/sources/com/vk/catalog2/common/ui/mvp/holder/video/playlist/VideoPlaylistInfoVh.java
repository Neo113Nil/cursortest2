package com.vk.catalog2.common.ui.mvp.holder.video.playlist;

import android.graphics.Rect;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.vk.catalog2.common.dto.api.ui.UIBlock;
import com.vk.catalog2.common.dto.ui.UIBlockTitleSubtitleAvatar;
import com.vk.catalog2.common.ui.holders.api.CatalogViewHolder;
import com.vk.common.links.LinksParserData;
import com.vk.core.ui.tracking.UiTrackingScreen;
import com.vk.core.view.components.avatar.VkAvatar;
import com.vk.core.view.components.picture.VkImage;
import com.vk.core.view.components.text.VkText;
import com.vk.dto.common.Image;
import com.vk.dto.common.ImageSize;
import com.vkontakte.android.R;
import xsna.b5a;
import xsna.enj;
import xsna.g86;
import xsna.og;
import xsna.saz;
import xsna.taz;
import xsna.u4a;
import xsna.ucp;
import xsna.uqm0;
import xsna.x4t0;
import xsna.xwk;

/* compiled from: VideoPlaylistInfoVh.kt */
/* loaded from: classes16.dex */
public final class VideoPlaylistInfoVh implements CatalogViewHolder {
    public final b5a b;
    public final u4a.a c;
    public VkText d;
    public VkText e;
    public VkText f;
    public VkAvatar g;
    public VkImage h;

    public VideoPlaylistInfoVh(b5a b5aVar, u4a.a aVar) {
        this.b = b5aVar;
        this.c = aVar;
    }

    @Override // com.vk.catalog2.common.ui.holders.api.CatalogViewHolder
    public final void N6(UIBlock uIBlock) {
        String str;
        if (uIBlock instanceof UIBlockTitleSubtitleAvatar) {
            VkText vkText = this.d;
            if (vkText == null) {
                vkText = null;
            }
            UIBlockTitleSubtitleAvatar uIBlockTitleSubtitleAvatar = (UIBlockTitleSubtitleAvatar) uIBlock;
            String str2 = uIBlockTitleSubtitleAvatar.A;
            vkText.setText(uIBlockTitleSubtitleAvatar.y);
            vkText.setTextSize(0, vkText.getResources().getDimensionPixelSize(R.dimen.video_catalog_playlist_info_title_text_size));
            VkText vkText2 = this.e;
            if (vkText2 == null) {
                vkText2 = null;
            }
            String str3 = uIBlockTitleSubtitleAvatar.z;
            if (str3 == null) {
                Integer num = uIBlockTitleSubtitleAvatar.B;
                if (num != null) {
                    int intValue = num.intValue();
                    VkText vkText3 = this.e;
                    if (vkText3 == null) {
                        vkText3 = null;
                    }
                    str3 = enj.i(vkText3.getResources(), R.plurals.followers_count, intValue, R.string.video_catalog_playlist_zero_subscribers, uqm0.f(intValue));
                } else {
                    str3 = "";
                }
            }
            vkText2.setText(str3);
            VkText vkText4 = this.f;
            if (vkText4 == null) {
                vkText4 = null;
            }
            vkText4.setVisibility((str2 == null || str2.length() == 0) ? 8 : 0);
            if (str2 != null) {
                ucp ucpVar = ucp.a;
                vkText4.setText(ucp.i(xwk.d().a().d(str2, new LinksParserData(41739, (Bundle) null, 0, 0, (String) null, (String) null, 0, 0, (LinksParserData.HashtagService) null, (saz) null, 0, (taz) null, false, 16382))));
            }
            VkAvatar vkAvatar = this.g;
            if (vkAvatar == null) {
                vkAvatar = null;
            }
            Image image = uIBlockTitleSubtitleAvatar.C;
            if (image != null) {
                vkAvatar.setVisibility(0);
                this.c.getClass();
                vkAvatar.setOnClickListener(new og(new g86(25, this, uIBlockTitleSubtitleAvatar), 9));
                if (!vkAvatar.isLaidOut() || vkAvatar.isLayoutRequested()) {
                    vkAvatar.addOnLayoutChangeListener(new x4t0(image, vkAvatar));
                } else {
                    ImageSize Cb = image.Cb(vkAvatar.getWidth(), true, false);
                    if (Cb != null && (str = Cb.d.d) != null) {
                        vkAvatar.o0(str, null);
                    }
                }
            }
            VkImage vkImage = this.h;
            (vkImage != null ? vkImage : null).setVisibility(uIBlockTitleSubtitleAvatar.D ? 8 : 0);
        }
    }

    @Override // com.vk.catalog2.common.ui.holders.api.CatalogViewHolder
    public final View k5(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(R.layout.catalog2_video_owner_info, viewGroup, false);
        this.d = (VkText) inflate.findViewById(R.id.video_owner_title);
        this.e = (VkText) inflate.findViewById(R.id.video_owner_subtitle);
        this.f = (VkText) inflate.findViewById(R.id.playlist_description);
        this.g = (VkAvatar) inflate.findViewById(R.id.video_owner_avatar);
        VkImage vkImage = (VkImage) inflate.findViewById(R.id.video_lock_icon);
        vkImage.setImageResource(R.drawable.vk_icon_lock_outline_16);
        this.h = vkImage;
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
