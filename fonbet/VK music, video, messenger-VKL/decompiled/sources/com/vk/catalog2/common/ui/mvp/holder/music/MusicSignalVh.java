package com.vk.catalog2.common.ui.mvp.holder.music;

import android.app.Activity;
import android.content.Context;
import android.graphics.Rect;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.mbridge.msdk.playercommon.exoplayer2.extractor.ts.PsExtractor;
import com.vk.catalog2.common.dto.api.ui.UIBlock;
import com.vk.catalog2.common.dto.ui.actions.UIBlockActionOpenSection;
import com.vk.catalog2.common.dto.ui.actions.UIBlockActionPlayAudiosFromBlock;
import com.vk.catalog2.common.ui.holders.api.CatalogViewHolder;
import com.vk.catalog2.common.ui.mvp.configuration.a;
import com.vk.catalog2.feature.music.dto.ui.UIBlockMusicSignal;
import com.vk.core.ui.tracking.UiTrackingScreen;
import com.vk.dto.music.MusicTrack;
import com.vk.imageloader.view.VKImageView;
import com.vk.music.bottomsheets.MusicBottomSheetLaunchPoint;
import com.vk.music.common.MusicPlaybackLaunchContext;
import com.vk.music.player.PlayRequestTrigger;
import com.vk.music.player.PlayState;
import com.vk.music.player.PlaybackActionMeta;
import com.vk.music.player.ShuffleMode;
import com.vk.music.player.StartPlayCatalogSource;
import com.vk.music.player.StartPlaySource;
import com.vk.music.stats.AdsAudioPixelsContainer;
import com.vkontakte.android.R;
import io.reactivex.rxjava3.disposables.g;
import java.util.List;
import xsna.b5a;
import xsna.bpn0;
import xsna.bwt0;
import xsna.c98;
import xsna.cfp0;
import xsna.e3m;
import xsna.epx;
import xsna.fl4;
import xsna.ic40;
import xsna.lqk0;
import xsna.lyd;
import xsna.nda;
import xsna.ow2;
import xsna.r550;
import xsna.se50;
import xsna.u2b0;
import xsna.ub50;
import xsna.v95;

/* compiled from: MusicSignalVh.kt */
/* loaded from: classes16.dex */
public final class MusicSignalVh implements CatalogViewHolder, View.OnClickListener {
    public final u2b0 b;
    public final a c;
    public final nda d;
    public final b5a e;
    public final int f;
    public VKImageView g;
    public ImageView h;
    public TextView i;
    public TextView j;
    public TextView k;
    public ow2 l;
    public UIBlockMusicSignal m;
    public final g n = new g();
    public final int o;
    public final int p;
    public final r550 q;

    public MusicSignalVh(u2b0 u2b0Var, a aVar, nda ndaVar, b5a b5aVar, boolean z, int i) {
        this.b = u2b0Var;
        this.c = aVar;
        this.d = ndaVar;
        this.e = b5aVar;
        this.f = i;
        this.o = z ? R.drawable.vk_icon_play_32 : R.drawable.vk_icon_play_24;
        this.p = z ? R.drawable.vk_icon_pause_32 : R.drawable.vk_icon_pause_24;
        this.q = new r550(this);
    }

    @Override // com.vk.catalog2.common.ui.holders.api.CatalogViewHolder
    public final void L() {
        this.n.dispose();
        this.b.n0(this.q);
    }

    @Override // com.vk.catalog2.common.ui.holders.api.CatalogViewHolder
    public final void N6(UIBlock uIBlock) {
        ow2 ow2Var;
        if (uIBlock instanceof UIBlockMusicSignal) {
            UIBlockMusicSignal uIBlockMusicSignal = (UIBlockMusicSignal) uIBlock;
            this.m = uIBlockMusicSignal;
            VKImageView vKImageView = this.g;
            if (vKImageView != null) {
                vKImageView.s0(uIBlockMusicSignal.z);
            }
            TextView textView = this.i;
            if (textView != null) {
                textView.setText(uIBlockMusicSignal.C);
            }
            TextView textView2 = this.j;
            if (textView2 != null) {
                textView2.setText(uIBlockMusicSignal.A);
            }
            TextView textView3 = this.k;
            if (textView3 != null) {
                textView3.setText(uIBlockMusicSignal.B);
            }
            MusicTrack musicTrack = uIBlockMusicSignal.D;
            if (musicTrack != null && (ow2Var = this.l) != null) {
                int i = se50.m;
                ow2Var.V5("", false, 0, musicTrack);
            }
            b();
        }
    }

    public final boolean a() {
        UIBlockActionPlayAudiosFromBlock uIBlockActionPlayAudiosFromBlock;
        UIBlockMusicSignal uIBlockMusicSignal = this.m;
        String str = (uIBlockMusicSignal == null || (uIBlockActionPlayAudiosFromBlock = uIBlockMusicSignal.E) == null) ? null : uIBlockActionPlayAudiosFromBlock.z;
        StartPlaySource j = this.b.j();
        StartPlayCatalogSource startPlayCatalogSource = j instanceof StartPlayCatalogSource ? (StartPlayCatalogSource) j : null;
        if (str != null) {
            return epx.f(startPlayCatalogSource != null ? startPlayCatalogSource.c : null, str);
        }
        return false;
    }

    public final void b() {
        ImageView imageView = this.h;
        if (imageView != null) {
            u2b0 u2b0Var = this.b;
            imageView.setImageResource(((!u2b0Var.m0().h() || !a()) ? PlayState.STOPPED : u2b0Var.m0()).h() ? this.p : this.o);
        }
    }

    @Override // com.vk.catalog2.common.ui.holders.api.CatalogViewHolder
    public final View k5(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        r550 r550Var = this.q;
        u2b0 u2b0Var = this.b;
        u2b0Var.P0(r550Var, true);
        View inflate = layoutInflater.inflate(this.f, viewGroup, false);
        VKImageView vKImageView = (VKImageView) inflate.findViewById(R.id.signal_banner);
        int i = 1;
        vKImageView.setOnClickListener(new c98(this, i));
        this.g = vKImageView;
        ImageView imageView = (ImageView) inflate.findViewById(R.id.signal_play);
        imageView.setOnClickListener(new c98(this, i));
        this.h = imageView;
        this.i = (TextView) inflate.findViewById(R.id.signal_month);
        this.j = (TextView) inflate.findViewById(R.id.signal_title);
        this.k = (TextView) inflate.findViewById(R.id.signal_summary);
        View findViewById = inflate.findViewById(R.id.signal_track);
        if (findViewById == null) {
            return inflate;
        }
        findViewById.setOnClickListener(new c98(this, 1));
        View q = bwt0.q(findViewById, R.id.audio_menu, null, 6);
        if (q != null) {
            q.setOnClickListener(new c98(this, 1));
        }
        findViewById.setOnClickListener(new c98(this, 1));
        ub50 ub50Var = new ub50(null);
        ub50Var.h = findViewById;
        ub50Var.d();
        ub50Var.e(new v95(this, 6));
        ub50Var.m = u2b0Var;
        this.l = ub50Var.a(null);
        return inflate;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        Context context;
        Activity h;
        UIBlockMusicSignal uIBlockMusicSignal;
        UIBlockActionOpenSection uIBlockActionOpenSection;
        UIBlockActionPlayAudiosFromBlock uIBlockActionPlayAudiosFromBlock;
        String str;
        UIBlockActionPlayAudiosFromBlock uIBlockActionPlayAudiosFromBlock2;
        String str2;
        MusicTrack musicTrack;
        MusicTrack musicTrack2;
        if (view == null || (context = view.getContext()) == null || (h = e3m.h(context)) == null) {
            return;
        }
        int id = view.getId();
        if (id == R.id.audio_menu) {
            UIBlockMusicSignal uIBlockMusicSignal2 = this.m;
            if (uIBlockMusicSignal2 == null || (musicTrack2 = uIBlockMusicSignal2.D) == null) {
                return;
            }
            bpn0 bpn0Var = lyd.d;
            if (bpn0Var == null) {
                bpn0Var = null;
            }
            ic40 w = ((fl4) bpn0Var.getValue()).w();
            String str3 = null;
            MusicBottomSheetLaunchPoint.App app2 = MusicBottomSheetLaunchPoint.App.b;
            UIBlockMusicSignal uIBlockMusicSignal3 = this.m;
            MusicPlaybackLaunchContext Fb = MusicPlaybackLaunchContext.Fb(uIBlockMusicSignal3 != null ? uIBlockMusicSignal3.f : null);
            UIBlockMusicSignal uIBlockMusicSignal4 = this.m;
            String str4 = uIBlockMusicSignal4 != null ? uIBlockMusicSignal4.b : null;
            if (uIBlockMusicSignal4 != null) {
                str3 = uIBlockMusicSignal4.c;
            }
            ic40.r(w, h, app2, musicTrack2, Fb, null, false, false, str4, str3, 112);
            return;
        }
        u2b0 u2b0Var = this.b;
        if (id == R.id.signal_track) {
            UIBlockMusicSignal uIBlockMusicSignal5 = this.m;
            if (uIBlockMusicSignal5 == null || (uIBlockActionPlayAudiosFromBlock2 = uIBlockMusicSignal5.E) == null || (str2 = uIBlockActionPlayAudiosFromBlock2.z) == null || (musicTrack = uIBlockMusicSignal5.D) == null) {
                return;
            }
            if (u2b0Var.y0(musicTrack)) {
                u2b0Var.w1(new PlaybackActionMeta(6, 0L, 2, null));
                return;
            }
            UIBlockMusicSignal uIBlockMusicSignal6 = this.m;
            String str5 = uIBlockMusicSignal6 != null ? uIBlockMusicSignal6.c : null;
            StartPlayCatalogSource startPlayCatalogSource = new StartPlayCatalogSource(str2, str5 == null ? "" : str5, null, null, false, null, 60, null);
            UIBlockMusicSignal uIBlockMusicSignal7 = this.m;
            u2b0Var.N0(new lqk0(startPlayCatalogSource, musicTrack, (List) null, MusicPlaybackLaunchContext.Fb(uIBlockMusicSignal7 != null ? uIBlockMusicSignal7.f : null), 0, ShuffleMode.SHUFFLE_OFF, (PlayRequestTrigger) null, (AdsAudioPixelsContainer) null, 0L, 948));
            return;
        }
        if (id != R.id.signal_play) {
            if (id != R.id.signal_banner || (uIBlockMusicSignal = this.m) == null || (uIBlockActionOpenSection = uIBlockMusicSignal.F) == null) {
                return;
            }
            this.e.a(new cfp0(uIBlockActionOpenSection, null));
            String str6 = uIBlockActionOpenSection.B;
            String str7 = uIBlockActionOpenSection.z;
            nda.e(this.d, h, this.c, str6, str7 == null ? "" : str7, null, null, null, PsExtractor.VIDEO_STREAM_MASK);
            return;
        }
        UIBlockMusicSignal uIBlockMusicSignal8 = this.m;
        if (uIBlockMusicSignal8 == null || (uIBlockActionPlayAudiosFromBlock = uIBlockMusicSignal8.E) == null || (str = uIBlockActionPlayAudiosFromBlock.z) == null) {
            return;
        }
        if (a()) {
            u2b0Var.w1(new PlaybackActionMeta(6, 0L, 2, null));
            return;
        }
        UIBlockMusicSignal uIBlockMusicSignal9 = this.m;
        String str8 = uIBlockMusicSignal9 != null ? uIBlockMusicSignal9.c : null;
        StartPlayCatalogSource startPlayCatalogSource2 = new StartPlayCatalogSource(str, str8 == null ? "" : str8, null, null, false, null, 60, null);
        UIBlockMusicSignal uIBlockMusicSignal10 = this.m;
        u2b0Var.N0(new lqk0(startPlayCatalogSource2, (MusicTrack) null, (List) null, MusicPlaybackLaunchContext.Fb(uIBlockMusicSignal10 != null ? uIBlockMusicSignal10.f : null), 0, ShuffleMode.SHUFFLE_OFF, PlayRequestTrigger.FAST_PLAY_TRACK_LIST, (AdsAudioPixelsContainer) null, 0L, 822));
    }

    @Override // com.vk.catalog2.common.ui.holders.api.CatalogViewHolder
    public final void yh(int i, UIBlock uIBlock) {
        N6(uIBlock);
    }

    @Override // com.vk.catalog2.common.ui.holders.api.CatalogViewHolder
    public final boolean ze(Rect rect) {
        return false;
    }

    @Override // xsna.m0q0
    public final void y(UiTrackingScreen uiTrackingScreen) {
    }
}
