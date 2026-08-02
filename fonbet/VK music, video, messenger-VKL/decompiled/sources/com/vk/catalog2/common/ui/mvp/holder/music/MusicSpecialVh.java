package com.vk.catalog2.common.ui.mvp.holder.music;

import android.content.Context;
import android.graphics.Rect;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.mbridge.msdk.playercommon.exoplayer2.extractor.ts.PsExtractor;
import com.vk.catalog2.common.dto.api.ui.UIBlock;
import com.vk.catalog2.common.dto.ui.actions.UIBlockActionOpenSection;
import com.vk.catalog2.common.dto.ui.actions.UIBlockActionPlayAudiosFromBlock;
import com.vk.catalog2.common.ui.holders.api.CatalogViewHolder;
import com.vk.catalog2.common.ui.mvp.configuration.a;
import com.vk.catalog2.feature.music.dto.ui.UIBlockMusicSpecial;
import com.vk.core.ui.tracking.UiTrackingScreen;
import com.vk.core.view.components.button.VkButton;
import com.vk.dto.music.MusicTrack;
import com.vk.dto.music.Thumb;
import com.vk.music.common.MusicPlaybackLaunchContext;
import com.vk.music.player.PlayRequestTrigger;
import com.vk.music.player.ShuffleMode;
import com.vk.music.player.StartPlayCatalogSource;
import com.vk.music.stats.AdsAudioPixelsContainer;
import com.vk.music.view.ThumbsImageView;
import com.vkontakte.android.R;
import java.util.List;
import kotlin.collections.EmptyList;
import xsna.bwt0;
import xsna.c98;
import xsna.e3m;
import xsna.e43;
import xsna.ey2;
import xsna.lqk0;
import xsna.nda;
import xsna.u2b0;

/* compiled from: MusicSpecialVh.kt */
/* loaded from: classes16.dex */
public final class MusicSpecialVh implements CatalogViewHolder, View.OnClickListener {
    public final a b;
    public final nda c;
    public final u2b0 d;
    public UIBlockMusicSpecial e;
    public List<ThumbsImageView> f = EmptyList.b;
    public TextView g;
    public TextView h;

    public MusicSpecialVh(a aVar, nda ndaVar, u2b0 u2b0Var) {
        this.b = aVar;
        this.c = ndaVar;
        this.d = u2b0Var;
    }

    @Override // com.vk.catalog2.common.ui.holders.api.CatalogViewHolder
    public final void N6(UIBlock uIBlock) {
        UIBlockMusicSpecial uIBlockMusicSpecial;
        ThumbsImageView thumbsImageView;
        if (uIBlock instanceof UIBlockMusicSpecial) {
            int i = 0;
            while (true) {
                uIBlockMusicSpecial = (UIBlockMusicSpecial) uIBlock;
                List<Thumb> list = uIBlockMusicSpecial.y;
                if (i >= list.size() || i >= this.f.size() || (thumbsImageView = this.f.get(i)) == null) {
                    break;
                }
                thumbsImageView.setThumb(list.get(i));
                i++;
            }
            TextView textView = this.g;
            if (textView == null) {
                textView = null;
            }
            textView.setText(uIBlockMusicSpecial.z);
            TextView textView2 = this.h;
            ey2.i(textView2 != null ? textView2 : null, uIBlockMusicSpecial.A);
            this.e = uIBlockMusicSpecial;
        }
    }

    @Override // com.vk.catalog2.common.ui.holders.api.CatalogViewHolder
    public final View k5(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(R.layout.catalog_music_special, viewGroup, false);
        inflate.setClipToOutline(true);
        e3m.a(R.dimen.music_special_size, inflate.getContext());
        ViewGroup viewGroup2 = (ViewGroup) bwt0.q(inflate, R.id.music_special_img_1, null, 6);
        View childAt = viewGroup2 != null ? viewGroup2.getChildAt(0) : null;
        ThumbsImageView thumbsImageView = childAt instanceof ThumbsImageView ? (ThumbsImageView) childAt : null;
        ViewGroup viewGroup3 = (ViewGroup) bwt0.q(inflate, R.id.music_special_img_2, null, 6);
        View childAt2 = viewGroup3 != null ? viewGroup3.getChildAt(0) : null;
        ThumbsImageView thumbsImageView2 = childAt2 instanceof ThumbsImageView ? (ThumbsImageView) childAt2 : null;
        ViewGroup viewGroup4 = (ViewGroup) bwt0.q(inflate, R.id.music_special_img_3, null, 6);
        View childAt3 = viewGroup4 != null ? viewGroup4.getChildAt(0) : null;
        ThumbsImageView thumbsImageView3 = childAt3 instanceof ThumbsImageView ? (ThumbsImageView) childAt3 : null;
        ViewGroup viewGroup5 = (ViewGroup) bwt0.q(inflate, R.id.music_special_img_4, null, 6);
        View childAt4 = viewGroup5 != null ? viewGroup5.getChildAt(0) : null;
        ThumbsImageView thumbsImageView4 = childAt4 instanceof ThumbsImageView ? (ThumbsImageView) childAt4 : null;
        ViewGroup viewGroup6 = (ViewGroup) bwt0.q(inflate, R.id.music_special_img_5, null, 6);
        View childAt5 = viewGroup6 != null ? viewGroup6.getChildAt(0) : null;
        ThumbsImageView thumbsImageView5 = childAt5 instanceof ThumbsImageView ? (ThumbsImageView) childAt5 : null;
        ViewGroup viewGroup7 = (ViewGroup) bwt0.q(inflate, R.id.music_special_img_6, null, 6);
        View childAt6 = viewGroup7 != null ? viewGroup7.getChildAt(0) : null;
        ThumbsImageView thumbsImageView6 = childAt6 instanceof ThumbsImageView ? (ThumbsImageView) childAt6 : null;
        ViewGroup viewGroup8 = (ViewGroup) bwt0.q(inflate, R.id.music_special_img_7, null, 6);
        View childAt7 = viewGroup8 != null ? viewGroup8.getChildAt(0) : null;
        ThumbsImageView thumbsImageView7 = childAt7 instanceof ThumbsImageView ? (ThumbsImageView) childAt7 : null;
        ViewGroup viewGroup9 = (ViewGroup) bwt0.q(inflate, R.id.music_special_img_8, null, 6);
        View childAt8 = viewGroup9 != null ? viewGroup9.getChildAt(0) : null;
        this.f = e43.l(thumbsImageView, thumbsImageView2, thumbsImageView3, thumbsImageView4, thumbsImageView5, thumbsImageView6, thumbsImageView7, childAt8 instanceof ThumbsImageView ? (ThumbsImageView) childAt8 : null);
        this.g = (TextView) bwt0.p(inflate, R.id.music_special_title, null, null, 6);
        this.h = (TextView) bwt0.p(inflate, R.id.music_special_description, null, null, 6);
        VkButton vkButton = (VkButton) bwt0.p(inflate, R.id.music_special_action_btn, null, null, 6);
        Integer valueOf = Integer.valueOf(R.drawable.vk_icon_play_24);
        int[] iArr = VkButton.W;
        vkButton.a5(true, valueOf);
        vkButton.setOnClickListener(new c98(this, 1));
        inflate.setOnClickListener(new c98(this, 1));
        return inflate;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        Context context;
        String str;
        UIBlockActionPlayAudiosFromBlock uIBlockActionPlayAudiosFromBlock;
        String str2;
        if (view == null || (context = view.getContext()) == null) {
            return;
        }
        if (view.getId() != R.id.music_special_action_btn) {
            UIBlockMusicSpecial uIBlockMusicSpecial = this.e;
            if (uIBlockMusicSpecial != null) {
                UIBlockActionOpenSection uIBlockActionOpenSection = uIBlockMusicSpecial.B;
                if (uIBlockActionOpenSection == null || (str = uIBlockActionOpenSection.B) == null) {
                    str = "";
                }
                String str3 = uIBlockMusicSpecial.z;
                nda.e(this.c, context, this.b, str, str3 == null ? "" : str3, null, null, null, PsExtractor.VIDEO_STREAM_MASK);
                return;
            }
            return;
        }
        UIBlockMusicSpecial uIBlockMusicSpecial2 = this.e;
        if (uIBlockMusicSpecial2 == null || (uIBlockActionPlayAudiosFromBlock = uIBlockMusicSpecial2.C) == null || (str2 = uIBlockActionPlayAudiosFromBlock.z) == null) {
            return;
        }
        boolean z = uIBlockActionPlayAudiosFromBlock.B;
        UIBlockMusicSpecial uIBlockMusicSpecial3 = this.e;
        String str4 = uIBlockMusicSpecial3 != null ? uIBlockMusicSpecial3.c : null;
        StartPlayCatalogSource startPlayCatalogSource = new StartPlayCatalogSource(str2, str4 == null ? "" : str4, null, null, false, null, 60, null);
        ShuffleMode shuffleMode = z ? ShuffleMode.SHUFFLE_ON : ShuffleMode.SHUFFLE_OFF;
        UIBlockMusicSpecial uIBlockMusicSpecial4 = this.e;
        MusicPlaybackLaunchContext Fb = MusicPlaybackLaunchContext.Fb(uIBlockMusicSpecial4 != null ? uIBlockMusicSpecial4.f : null);
        if (z) {
            Fb = Fb.Ab();
        }
        this.d.N0(new lqk0(startPlayCatalogSource, (MusicTrack) null, (List) null, Fb, 0, shuffleMode, PlayRequestTrigger.FAST_PLAY_TRACK_LIST, (AdsAudioPixelsContainer) null, 0L, 822));
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
