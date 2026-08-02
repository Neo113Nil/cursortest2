package com.vk.catalog2.feature.music.holders;

import android.view.View;
import com.vk.catalog2.common.dto.api.ShowAllInfo;
import com.vk.catalog2.common.dto.api.ui.UIBlock;
import com.vk.catalog2.common.dto.ui.actions.UIBlockActionPlayAudiosFromBlock;
import com.vk.core.view.components.button.VkButton;
import com.vk.dto.music.MusicTrack;
import com.vk.music.common.MusicPlaybackLaunchContext;
import com.vk.music.player.PlayRequestTrigger;
import com.vk.music.player.PlaySourceMeta;
import com.vk.music.player.ShuffleMode;
import com.vk.music.player.StartPlayCatalogSource;
import com.vk.music.player.StartPlaySource;
import com.vk.music.stats.AdsAudioPixelsContainer;
import com.vkontakte.android.R;
import java.util.List;
import xsna.brm0;
import xsna.lqk0;
import xsna.u2b0;

/* compiled from: MusicActionPlayAllButtonVh.kt */
/* loaded from: classes16.dex */
public final class MusicActionPlayAllButtonVh extends MusicActionButtonVh {
    public final u2b0 g;

    public MusicActionPlayAllButtonVh(int i, int i2, u2b0 u2b0Var) {
        super(i, R.layout.catalog_action_horizontal_list_music, i2);
        this.g = u2b0Var;
    }

    @Override // com.vk.catalog2.feature.music.holders.MusicActionButtonVh, com.vk.catalog2.common.ui.holders.api.CatalogViewHolder
    public final void N6(UIBlock uIBlock) {
        super.N6(uIBlock);
        if (uIBlock instanceof UIBlockActionPlayAudiosFromBlock) {
            UIBlockActionPlayAudiosFromBlock uIBlockActionPlayAudiosFromBlock = (UIBlockActionPlayAudiosFromBlock) uIBlock;
            if (brm0.B(uIBlockActionPlayAudiosFromBlock.z, "synthetic_section_similar_tracks", false)) {
                VkButton vkButton = this.e;
                if (vkButton == null) {
                    vkButton = null;
                }
                vkButton.setText(uIBlockActionPlayAudiosFromBlock.A);
            }
        }
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        UIBlock uIBlock = this.f;
        boolean z = uIBlock instanceof UIBlockActionPlayAudiosFromBlock;
        UIBlockActionPlayAudiosFromBlock uIBlockActionPlayAudiosFromBlock = z ? (UIBlockActionPlayAudiosFromBlock) uIBlock : null;
        UIBlockActionPlayAudiosFromBlock uIBlockActionPlayAudiosFromBlock2 = z ? (UIBlockActionPlayAudiosFromBlock) uIBlock : null;
        String str = uIBlockActionPlayAudiosFromBlock2 != null ? uIBlockActionPlayAudiosFromBlock2.z : null;
        if (uIBlockActionPlayAudiosFromBlock == null || str == null) {
            return;
        }
        boolean z2 = uIBlockActionPlayAudiosFromBlock.B;
        PlayRequestTrigger playRequestTrigger = z2 ? PlayRequestTrigger.SHUFFLE_BUTTON : PlayRequestTrigger.FAST_PLAY_TRACK_LIST;
        ShowAllInfo showAllInfo = uIBlockActionPlayAudiosFromBlock.D;
        PlaySourceMeta catalogPlaySourceMeta = showAllInfo != null ? new PlaySourceMeta.CatalogPlaySourceMeta(showAllInfo.b, showAllInfo.c, false, 4, null) : PlaySourceMeta.Default.b;
        boolean B = brm0.B(str, "synthetic_section_similar_tracks", false);
        u2b0 u2b0Var = this.g;
        if (B) {
            u2b0Var.N0(new lqk0((StartPlaySource) null, (MusicTrack) null, uIBlockActionPlayAudiosFromBlock.C, MusicPlaybackLaunchContext.F, 0, z2 ? ShuffleMode.SHUFFLE_ON : ShuffleMode.SHUFFLE_AUTO, playRequestTrigger, (AdsAudioPixelsContainer) null, 0L, 819));
            return;
        }
        StartPlayCatalogSource startPlayCatalogSource = new StartPlayCatalogSource(str, uIBlockActionPlayAudiosFromBlock.c, null, null, false, catalogPlaySourceMeta, 28, null);
        ShuffleMode shuffleMode = z2 ? ShuffleMode.SHUFFLE_ON : ShuffleMode.SHUFFLE_OFF;
        MusicPlaybackLaunchContext Fb = MusicPlaybackLaunchContext.Fb(uIBlockActionPlayAudiosFromBlock.f);
        if (z2) {
            Fb = Fb.Ab();
        }
        u2b0Var.N0(new lqk0(startPlayCatalogSource, (MusicTrack) null, (List) null, Fb, 0, shuffleMode, playRequestTrigger, (AdsAudioPixelsContainer) null, 0L, 822));
    }
}
