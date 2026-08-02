package com.vk.catalog2.common.ui.mvp.holder.music;

import android.graphics.Rect;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.vk.catalog2.common.dto.api.ui.UIBlock;
import com.vk.catalog2.common.dto.api.ui.action.UIBlockAction;
import com.vk.catalog2.common.dto.ui.actions.UIBlockActionPlayAudiosFromBlock;
import com.vk.catalog2.common.ui.holders.api.CatalogViewHolder;
import com.vk.catalog2.common.ui.mvp.util.a;
import com.vk.catalog2.feature.music.dto.ui.UIBlockMusicAggregatedUpdate;
import com.vk.core.serialize.Serializer;
import com.vk.core.ui.tracking.UiTrackingScreen;
import com.vk.core.view.PhotoStackView;
import com.vk.core.view.components.button.VkButton;
import com.vk.dto.music.AudioFollowingsUpdateInfo;
import com.vk.dto.music.Thumb;
import com.vkontakte.android.R;
import java.util.ArrayList;
import java.util.List;
import xsna.c98;
import xsna.cn70;
import xsna.e3m;

/* compiled from: MusicAggregatedUpdatesVh.kt */
/* loaded from: classes16.dex */
public final class MusicAggregatedUpdatesVh implements CatalogViewHolder, View.OnClickListener {
    public final a b;
    public int c;
    public View d;
    public PhotoStackView e;
    public TextView f;
    public VkButton g;
    public UIBlockMusicAggregatedUpdate h;

    public MusicAggregatedUpdatesVh(a aVar) {
        this.b = aVar;
    }

    @Override // com.vk.catalog2.common.ui.holders.api.CatalogViewHolder
    public final void N6(UIBlock uIBlock) {
        PhotoStackView photoStackView;
        if (uIBlock instanceof UIBlockMusicAggregatedUpdate) {
            UIBlockMusicAggregatedUpdate uIBlockMusicAggregatedUpdate = (UIBlockMusicAggregatedUpdate) uIBlock;
            UIBlockAction uIBlockAction = uIBlockMusicAggregatedUpdate.z;
            AudioFollowingsUpdateInfo audioFollowingsUpdateInfo = uIBlockMusicAggregatedUpdate.y;
            this.h = uIBlockMusicAggregatedUpdate;
            List<Thumb> list = audioFollowingsUpdateInfo.d;
            if (list != null && (photoStackView = this.e) != null) {
                ArrayList arrayList = new ArrayList();
                for (Thumb thumb : list) {
                    int i = this.c;
                    Serializer.c<Thumb> cVar = Thumb.CREATOR;
                    String Ab = thumb.Ab(i, false);
                    if (Ab != null) {
                        arrayList.add(Ab);
                    }
                }
                photoStackView.r(3, arrayList);
            }
            TextView textView = this.f;
            if (textView != null) {
                textView.setText(audioFollowingsUpdateInfo.b);
            }
            VkButton vkButton = this.g;
            if (vkButton != null) {
                this.b.a(vkButton, uIBlockAction);
                if (uIBlockAction instanceof UIBlockActionPlayAudiosFromBlock) {
                    vkButton.setText(R.string.catalog_play_all);
                    vkButton.a5(true, Integer.valueOf(R.drawable.vk_icon_play_24));
                } else {
                    int[] iArr = VkButton.W;
                    vkButton.a5(true, null);
                }
            }
        }
    }

    @Override // com.vk.catalog2.common.ui.holders.api.CatalogViewHolder
    public final View k5(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(R.layout.catalog_music_aggregated_updates, viewGroup, false);
        this.c = e3m.a(R.dimen.catalog_music_updates_thumb_size, inflate.getContext());
        this.d = inflate;
        PhotoStackView photoStackView = (PhotoStackView) inflate.findViewById(R.id.update_thumbs);
        photoStackView.setRoundedImages(false);
        photoStackView.setRoundedCut(false);
        photoStackView.setCornerRadiusImages(8.0f);
        photoStackView.setReverseStack(true);
        photoStackView.setOverlapOffset(0.7f);
        this.e = photoStackView;
        this.f = (TextView) inflate.findViewById(R.id.update_text);
        VkButton vkButton = (VkButton) inflate.findViewById(R.id.button);
        vkButton.setOnClickListener(new c98(this, 1));
        vkButton.setIconSize(Integer.valueOf(cn70.b(16)));
        this.g = vkButton;
        return inflate;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        UIBlockMusicAggregatedUpdate uIBlockMusicAggregatedUpdate;
        Integer valueOf = view != null ? Integer.valueOf(view.getId()) : null;
        if (valueOf == null || valueOf.intValue() != R.id.button || (uIBlockMusicAggregatedUpdate = this.h) == null) {
            return;
        }
        UIBlockAction uIBlockAction = uIBlockMusicAggregatedUpdate.z;
        this.b.getClass();
        if (a.d(uIBlockAction)) {
            a.e(this.b, view.getContext(), uIBlockMusicAggregatedUpdate, uIBlockMusicAggregatedUpdate.z, null, 56);
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
