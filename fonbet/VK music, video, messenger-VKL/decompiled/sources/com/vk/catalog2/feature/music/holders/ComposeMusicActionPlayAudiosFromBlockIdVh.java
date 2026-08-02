package com.vk.catalog2.feature.music.holders;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.ui.platform.ComposeView;
import com.vk.catalog2.common.dto.api.CatalogViewType;
import com.vk.catalog2.common.dto.api.ShowAllInfo;
import com.vk.catalog2.common.dto.api.ui.UIBlock;
import com.vk.catalog2.common.dto.ui.actions.UIBlockActionPlayAudiosFromBlock;
import com.vk.catalog2.common.dto.ui.actions.UIBlockActionTextButton;
import com.vk.catalog2.common.ui.holders.ActionVh;
import com.vk.core.view.components.cell.VkCell;
import com.vk.dto.music.MusicTrack;
import com.vk.music.common.MusicPlaybackLaunchContext;
import com.vk.music.player.PlayRequestTrigger;
import com.vk.music.player.PlaySourceMeta;
import com.vk.music.player.ShuffleMode;
import com.vk.music.player.StartPlayCatalogSource;
import com.vk.music.stats.AdsAudioPixelsContainer;
import com.vkontakte.android.R;
import java.util.List;
import xsna.fl4;
import xsna.gx;
import xsna.jai;
import xsna.jjc;
import xsna.lqk0;
import xsna.mut0;
import xsna.s9a;
import xsna.u2b0;

/* compiled from: ComposeMusicActionPlayAudiosFromBlockIdVh.kt */
/* loaded from: classes16.dex */
public final class ComposeMusicActionPlayAudiosFromBlockIdVh extends ActionVh {
    public final int b;
    public final u2b0 c;
    public final Integer d;
    public final VkCell.Left.Main.Size e;
    public final fl4 f;
    public UIBlock g;

    public ComposeMusicActionPlayAudiosFromBlockIdVh(int i, u2b0 u2b0Var, Integer num, VkCell.Left.Main.Size size, fl4 fl4Var) {
        this.b = i;
        this.c = u2b0Var;
        this.d = num;
        this.e = size;
        this.f = fl4Var;
    }

    @Override // com.vk.catalog2.common.ui.holders.api.CatalogViewHolder
    public final void N6(UIBlock uIBlock) {
        this.g = uIBlock;
    }

    @Override // com.vk.catalog2.common.ui.holders.api.CatalogViewHolder
    public final View k5(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(R.layout.catalog_compose_music_action_btn, viewGroup, false);
        ComposeView composeView = (ComposeView) inflate;
        composeView.setViewCompositionStrategy(mut0.c.a);
        composeView.setContent(new jai(-1192984879, new gx(4, this, inflate), true));
        return inflate;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        UIBlock uIBlock;
        if (jjc.c(400L) || (uIBlock = this.g) == null) {
            return;
        }
        if (!(uIBlock instanceof UIBlockActionPlayAudiosFromBlock)) {
            if ((uIBlock instanceof UIBlockActionTextButton) && uIBlock.d == CatalogViewType.SYNTHETIC_ACTION_CREATE_PLAYLIST) {
                UIBlockActionTextButton uIBlockActionTextButton = (UIBlockActionTextButton) uIBlock;
                Context context = view.getContext();
                fl4 fl4Var = this.f;
                if (fl4Var == null || context == null) {
                    return;
                }
                fl4Var.g().e(context, uIBlockActionTextButton.g, MusicPlaybackLaunchContext.Fb(uIBlockActionTextButton.f).t());
                return;
            }
            return;
        }
        UIBlockActionPlayAudiosFromBlock uIBlockActionPlayAudiosFromBlock = (UIBlockActionPlayAudiosFromBlock) uIBlock;
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
        this.c.N0(new lqk0(startPlayCatalogSource, (MusicTrack) null, list, Cb, 0, shuffleMode, z ? PlayRequestTrigger.SHUFFLE_BUTTON : PlayRequestTrigger.FAST_PLAY_TRACK_LIST, (AdsAudioPixelsContainer) null, 0L, 818));
    }

    @Override // com.vk.catalog2.common.ui.holders.api.CatalogViewHolder
    public final void L() {
    }
}
