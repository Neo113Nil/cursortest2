package com.vk.catalog2.feature.music.holders;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.vk.catalog2.common.dto.api.ShowAllInfo;
import com.vk.catalog2.common.dto.api.ui.UIBlock;
import com.vk.catalog2.common.dto.ui.actions.UIBlockActionPlayAudiosFromBlock;
import com.vk.catalog2.common.ui.holders.SimpleTextIconButtonVh;
import com.vk.dto.music.MusicTrack;
import com.vk.music.common.MusicPlaybackLaunchContext;
import com.vk.music.player.PlayRequestTrigger;
import com.vk.music.player.PlaySourceMeta;
import com.vk.music.player.ShuffleMode;
import com.vk.music.player.StartPlayCatalogSource;
import com.vk.music.stats.AdsAudioPixelsContainer;
import com.vkontakte.android.R;
import java.util.List;
import xsna.jno0;
import xsna.lqk0;
import xsna.s9a;
import xsna.u2b0;

/* compiled from: MusicActionPlayAudiosFromBlockIdVh.kt */
/* loaded from: classes16.dex */
public final class MusicActionPlayAudiosFromBlockIdVh extends SimpleTextIconButtonVh {
    public final int i;
    public final u2b0 j;
    public final int k;
    public UIBlockActionPlayAudiosFromBlock l;

    public MusicActionPlayAudiosFromBlockIdVh(int i, int i2, u2b0 u2b0Var) {
        super(i, R.layout.catalog_music_action_with_icon_background_btn, 10);
        this.i = i2;
        this.j = u2b0Var;
        this.k = R.attr.vk_ui_text_accent;
    }

    @Override // com.vk.catalog2.common.ui.holders.SimpleTextIconButtonVh, com.vk.catalog2.common.ui.holders.api.CatalogViewHolder
    public final void N6(UIBlock uIBlock) {
        this.l = uIBlock instanceof UIBlockActionPlayAudiosFromBlock ? (UIBlockActionPlayAudiosFromBlock) uIBlock : null;
    }

    @Override // com.vk.catalog2.common.ui.holders.SimpleTextIconButtonVh, com.vk.catalog2.common.ui.holders.api.CatalogViewHolder
    public final View k5(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View k5 = super.k5(layoutInflater, viewGroup, bundle);
        TextView textView = this.f;
        if (textView == null) {
            textView = null;
        }
        textView.setText(this.i);
        TextView textView2 = this.f;
        jno0.c(textView2 != null ? textView2 : null, this.k);
        return k5;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        UIBlockActionPlayAudiosFromBlock uIBlockActionPlayAudiosFromBlock = this.l;
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
        this.j.N0(new lqk0(startPlayCatalogSource, (MusicTrack) null, list, Cb, 0, shuffleMode, z ? PlayRequestTrigger.SHUFFLE_BUTTON : PlayRequestTrigger.FAST_PLAY_TRACK_LIST, (AdsAudioPixelsContainer) null, 0L, 818));
    }
}
