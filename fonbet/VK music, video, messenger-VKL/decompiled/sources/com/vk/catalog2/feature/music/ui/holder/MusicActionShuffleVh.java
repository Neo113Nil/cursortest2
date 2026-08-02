package com.vk.catalog2.feature.music.ui.holder;

import android.view.View;
import com.vk.catalog2.common.dto.api.ShowAllInfo;
import com.vk.catalog2.common.dto.api.ui.UIBlock;
import com.vk.catalog2.common.dto.ui.actions.UIBlockActionPlayAudiosFromBlock;
import com.vk.catalog2.feature.music.holders.MusicActionColorfulVkButtonVh;
import com.vk.dto.music.MusicTrack;
import com.vk.music.common.MusicPlaybackLaunchContext;
import com.vk.music.player.PlayRequestTrigger;
import com.vk.music.player.PlaySourceMeta;
import com.vk.music.player.ShuffleMode;
import com.vk.music.player.StartPlayCatalogSource;
import com.vk.music.stats.AdsAudioPixelsContainer;
import com.vkontakte.android.R;
import java.util.List;
import xsna.iah0;
import xsna.lqk0;
import xsna.s9a;
import xsna.u2b0;

/* compiled from: MusicActionShuffleVh.kt */
/* loaded from: classes16.dex */
public final class MusicActionShuffleVh extends MusicActionColorfulVkButtonVh {
    public final u2b0 f;
    public UIBlockActionPlayAudiosFromBlock g;

    public MusicActionShuffleVh(u2b0 u2b0Var) {
        super(new MusicActionColorfulVkButtonVh.b.a(), new MusicActionColorfulVkButtonVh.a(R.drawable.vk_icon_shuffle_outline_20, iah0.a(20), 8));
        this.f = u2b0Var;
    }

    @Override // com.vk.catalog2.common.ui.holders.api.CatalogViewHolder
    public final void N6(UIBlock uIBlock) {
        this.g = uIBlock instanceof UIBlockActionPlayAudiosFromBlock ? (UIBlockActionPlayAudiosFromBlock) uIBlock : null;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        UIBlockActionPlayAudiosFromBlock uIBlockActionPlayAudiosFromBlock = this.g;
        if (uIBlockActionPlayAudiosFromBlock == null) {
            return;
        }
        boolean z = uIBlockActionPlayAudiosFromBlock.B;
        String str = uIBlockActionPlayAudiosFromBlock.z;
        boolean contains = s9a.c.contains(str);
        ShowAllInfo showAllInfo = uIBlockActionPlayAudiosFromBlock.D;
        StartPlayCatalogSource startPlayCatalogSource = new StartPlayCatalogSource(str, uIBlockActionPlayAudiosFromBlock.c, null, null, contains, showAllInfo != null ? new PlaySourceMeta.CatalogPlaySourceMeta(showAllInfo.b, showAllInfo.c, false, 4, null) : PlaySourceMeta.Default.b, 12, null);
        List<MusicTrack> list = contains ? uIBlockActionPlayAudiosFromBlock.C : null;
        ShuffleMode shuffleMode = z ? ShuffleMode.SHUFFLE_ON : ShuffleMode.SHUFFLE_OFF;
        MusicPlaybackLaunchContext Cb = MusicPlaybackLaunchContext.Fb(uIBlockActionPlayAudiosFromBlock.f).Cb(uIBlockActionPlayAudiosFromBlock.p.h());
        if (z) {
            Cb = Cb.Ab();
        }
        this.f.N0(new lqk0(startPlayCatalogSource, (MusicTrack) null, list, Cb, 0, shuffleMode, z ? PlayRequestTrigger.SHUFFLE_BUTTON : PlayRequestTrigger.FAST_PLAY_TRACK_LIST, (AdsAudioPixelsContainer) null, 0L, 818));
    }
}
