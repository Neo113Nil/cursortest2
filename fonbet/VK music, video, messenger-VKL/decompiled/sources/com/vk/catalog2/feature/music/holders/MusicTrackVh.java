package com.vk.catalog2.feature.music.holders;

import android.app.Activity;
import android.content.Context;
import android.graphics.Rect;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.vk.catalog2.common.dto.api.ShowAllInfo;
import com.vk.catalog2.common.dto.api.style.CatalogViewStyle;
import com.vk.catalog2.common.dto.api.style.MusicTrackCatalogViewStyle;
import com.vk.catalog2.common.dto.api.ui.UIBlock;
import com.vk.catalog2.common.ui.holders.analytics.MusicAnalyticsInfo;
import com.vk.catalog2.common.ui.holders.api.CatalogViewHolder;
import com.vk.catalog2.common.ui.holders.api.search.SearchStatInfoProvider;
import com.vk.catalog2.feature.music.dto.ui.UIBlockMusicTrack;
import com.vk.core.ui.tracking.UiTrackingScreen;
import com.vk.core.utils.newtork.b;
import com.vk.dto.common.DownloadingState;
import com.vk.dto.music.MusicTrack;
import com.vk.dto.search.SearchStatsLoggingInfo;
import com.vk.music.bottomsheets.MusicBottomSheetLaunchPoint;
import com.vk.music.common.MusicPlaybackLaunchContext;
import com.vk.music.design.view.download.DownloadingView;
import com.vk.music.player.PlayRequestTrigger;
import com.vk.music.player.PlaySourceMeta;
import com.vk.music.player.ShuffleMode;
import com.vk.music.player.StartPlayCatalogSource;
import com.vk.music.stats.AdsAudioPixelsContainer;
import com.vk.stat.scheme.SchemeStat$EventItem;
import com.vk.toggle.features.MusicFeatures;
import com.vkontakte.android.R;
import io.reactivex.rxjava3.core.q;
import io.reactivex.rxjava3.disposables.c;
import io.reactivex.rxjava3.disposables.g;
import java.util.Set;
import kotlin.LazyThreadSafetyMode;
import kotlin.jvm.internal.FunctionReferenceImpl;
import xsna.b5a;
import xsna.be50;
import xsna.bpn0;
import xsna.brm0;
import xsna.bwt0;
import xsna.c98;
import xsna.cfp0;
import xsna.cho;
import xsna.dhb0;
import xsna.e3m;
import xsna.epx;
import xsna.f4m;
import xsna.fl4;
import xsna.gzs;
import xsna.ic40;
import xsna.itx0;
import xsna.iz3;
import xsna.j5g;
import xsna.jnj;
import xsna.jtx0;
import xsna.lqk0;
import xsna.lyd;
import xsna.ms1;
import xsna.msy;
import xsna.n3a;
import xsna.nsp0;
import xsna.o010;
import xsna.o25;
import xsna.ow2;
import xsna.p9a;
import xsna.q3a;
import xsna.rl3;
import xsna.sq40;
import xsna.sv0;
import xsna.t5a;
import xsna.u2b0;
import xsna.ub50;
import xsna.vq40;
import xsna.zf40;

/* compiled from: MusicTrackVh.kt */
/* loaded from: classes16.dex */
public final class MusicTrackVh implements CatalogViewHolder, View.OnLongClickListener, View.OnClickListener, itx0, cho, jtx0 {
    public static final Set<String> v = rl3.y0(new String[]{"offline_music_replacement_artist", "offline_music_replacement_default", "offline_music_replacement_name", "offline_music_replacement_new_first", "offline_music_replacement_date_new", "offline_music_replacement_date_old"});
    public final u2b0 b;
    public final int c;
    public final t5a<MusicTrack> d;
    public final b5a e;
    public final SearchStatInfoProvider f;
    public final int g;
    public final bpn0 h;
    public final boolean i;
    public final q3a j;
    public final sq40 k;
    public UIBlockMusicTrack l;
    public dhb0 m;
    public final g n;
    public ow2 o;
    public View p;
    public final vq40 q;
    public final Object r;
    public boolean s;
    public zf40 t;
    public zf40 u;

    /* compiled from: MusicTrackVh.kt */
    public static final /* synthetic */ class a extends FunctionReferenceImpl implements gzs<Boolean> {
        @Override // xsna.gzs
        public final Boolean invoke() {
            ((b) this.receiver).getClass();
            return Boolean.valueOf(b.d());
        }
    }

    public MusicTrackVh() {
        throw null;
    }

    public MusicTrackVh(u2b0 u2b0Var, int i, t5a t5aVar, b5a b5aVar, SearchStatInfoProvider searchStatInfoProvider, int i2, q3a q3aVar, sq40 sq40Var, int i3) {
        i2 = (i3 & 32) != 0 ? 1 : i2;
        bpn0 bpn0Var = new bpn0(new sv0(28));
        boolean z = (i3 & 128) == 0;
        this.b = u2b0Var;
        this.c = i;
        this.d = t5aVar;
        this.e = b5aVar;
        this.f = searchStatInfoProvider;
        this.g = i2;
        this.h = bpn0Var;
        this.i = z;
        this.j = q3aVar;
        this.k = sq40Var;
        this.n = new g();
        this.q = new vq40();
        this.r = msy.a(LazyThreadSafetyMode.NONE, new iz3(15));
    }

    @Override // com.vk.catalog2.common.ui.holders.api.CatalogViewHolder
    public final void L() {
        this.n.dispose();
    }

    @Override // com.vk.catalog2.common.ui.holders.api.CatalogViewHolder
    public final void N6(UIBlock uIBlock) {
        q<n3a> a2;
        c subscribe;
        UIBlockMusicTrack uIBlockMusicTrack = uIBlock instanceof UIBlockMusicTrack ? (UIBlockMusicTrack) uIBlock : null;
        if (uIBlockMusicTrack != null) {
            this.l = uIBlockMusicTrack;
            CatalogViewStyle catalogViewStyle = uIBlockMusicTrack.l;
            MusicTrackCatalogViewStyle musicTrackCatalogViewStyle = catalogViewStyle instanceof MusicTrackCatalogViewStyle ? (MusicTrackCatalogViewStyle) catalogViewStyle : null;
            boolean z = musicTrackCatalogViewStyle != null && musicTrackCatalogViewStyle.b == MusicTrackCatalogViewStyle.Style.MagicWand;
            ow2 ow2Var = this.o;
            ow2 ow2Var2 = ow2Var != null ? ow2Var : null;
            MusicTrack musicTrack = uIBlockMusicTrack.z;
            ow2Var2.V5(uIBlockMusicTrack.B, uIBlockMusicTrack.C.b && z, uIBlockMusicTrack.y - 1, musicTrack);
            q3a q3aVar = this.j;
            if (q3aVar == null || (a2 = q3aVar.a()) == null || (subscribe = a2.b0(nsp0.class).t0(1L).subscribe(new be50(new o010(this, 11), 0))) == null) {
                return;
            }
            this.n.b(subscribe);
        }
    }

    @Override // xsna.itx0
    public final void a(boolean z) {
        this.s = z;
    }

    @Override // xsna.jtx0
    public final void b(zf40 zf40Var) {
        this.u = zf40Var;
    }

    @Override // xsna.itx0
    public final void c(zf40 zf40Var) {
        this.t = zf40Var;
    }

    @Override // xsna.cho
    public final void d(boolean z) {
        MusicTrack musicTrack;
        ow2 ow2Var = this.o;
        DownloadingState downloadingState = null;
        if (ow2Var == null) {
            ow2Var = null;
        }
        View q = bwt0.q(ow2Var.itemView, R.id.audio_menu, null, 6);
        ow2 ow2Var2 = this.o;
        if (ow2Var2 == null) {
            ow2Var2 = null;
        }
        View q2 = bwt0.q(ow2Var2.itemView, R.id.downloaded_state, null, 6);
        ow2 ow2Var3 = this.o;
        if (ow2Var3 == null) {
            ow2Var3 = null;
        }
        View q3 = bwt0.q(ow2Var3.itemView, R.id.audio_duration, null, 6);
        if (z) {
            if (q != null) {
                f4m.j(q);
            }
            if (q3 != null) {
                f4m.j(q3);
            }
            if (q2 != null) {
                f4m.j(q2);
                return;
            }
            return;
        }
        if (q != null) {
            q.setVisibility(0);
        }
        if (q3 != null) {
            q3.setVisibility(0);
        }
        DownloadingView downloadingView = q2 instanceof DownloadingView ? (DownloadingView) q2 : null;
        boolean z2 = downloadingView != null && downloadingView.getShowNotLoaded();
        if (q2 != null) {
            UIBlockMusicTrack uIBlockMusicTrack = this.l;
            if (uIBlockMusicTrack != null && (musicTrack = uIBlockMusicTrack.z) != null) {
                downloadingState = musicTrack.J;
            }
            bwt0.p0(q2, !(downloadingState instanceof DownloadingState.NotLoaded) || z2);
        }
    }

    public final void e(UIBlockMusicTrack uIBlockMusicTrack, boolean z, String str) {
        boolean a2 = this.f.a();
        String str2 = uIBlockMusicTrack.c;
        MusicTrack musicTrack = uIBlockMusicTrack.z;
        String str3 = uIBlockMusicTrack.b;
        MusicPlaybackLaunchContext Cb = (brm0.B(str2, "synthetic_section_similar_tracks", false) ? MusicPlaybackLaunchContext.F : a2 ? MusicPlaybackLaunchContext.o.Bb(str3) : MusicPlaybackLaunchContext.Fb(str)).Cb(uIBlockMusicTrack.p.h());
        u2b0 u2b0Var = this.b;
        this.e.a(new cfp0(uIBlockMusicTrack, new MusicAnalyticsInfo((u2b0Var.h() && epx.f(u2b0Var.b(), musicTrack)) ? MusicAnalyticsInfo.ClickTarget.Pause : MusicAnalyticsInfo.ClickTarget.Play)));
        ShowAllInfo showAllInfo = uIBlockMusicTrack.D;
        boolean z2 = this.i;
        u2b0Var.N0(new lqk0(new StartPlayCatalogSource(uIBlockMusicTrack.b, uIBlockMusicTrack.c, uIBlockMusicTrack.A, musicTrack.Ib(), z, showAllInfo != null ? new PlaySourceMeta.CatalogPlaySourceMeta(showAllInfo.b, showAllInfo.c, z2) : z2 ? new PlaySourceMeta.RecentlyListened(z2) : PlaySourceMeta.Default.b), uIBlockMusicTrack.z, (MusicFeatures.AUDIO_FIX_SEARCH_MUSIC_LAUNCH.h() && uIBlockMusicTrack.E) ? null : this.d.b(str3), Cb, 0, (ShuffleMode) null, (PlayRequestTrigger) null, (AdsAudioPixelsContainer) null, 0L, 1008));
    }

    @Override // com.vk.catalog2.common.ui.holders.api.CatalogViewHolder
    public final View k5(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(this.c, viewGroup, false);
        ub50 ub50Var = new ub50(null);
        ub50Var.h = inflate;
        int i = this.g;
        if (i == 1) {
            ub50Var.d();
        } else if (i == 3) {
            ub50Var.f = 3;
            ub50Var.d = false;
            if (ub50Var.g == 0 && inflate == null) {
                ub50Var.g = R.layout.music_audio_item_ordered_playlist;
            }
        } else if (i != 5) {
            ub50Var.d();
        } else {
            ub50Var.f = 5;
            if (ub50Var.g == 0 && inflate == null) {
                ub50Var.g = R.layout.music_item_listened_track;
            }
        }
        ub50Var.n = this.m;
        ub50Var.i = new a(0, b.a, b.class, "isConnected", "isConnected()Z", 0);
        ub50Var.a = true;
        ub50Var.e(null);
        ub50Var.m = this.b;
        ow2 a2 = ub50Var.a(null);
        this.o = a2;
        View q = bwt0.q(a2.itemView, R.id.audio_menu, null, 6);
        if (q != null) {
            q.setOnClickListener(new c98(this, 1));
        }
        ow2 ow2Var = this.o;
        if (ow2Var == null) {
            ow2Var = null;
        }
        View q2 = bwt0.q(ow2Var.itemView, R.id.audio_image, null, 6);
        if (q2 != null) {
            q2.setOnClickListener(new c98(this, 1));
        }
        ow2 ow2Var2 = this.o;
        if (ow2Var2 == null) {
            ow2Var2 = null;
        }
        View q3 = bwt0.q(ow2Var2.itemView, R.id.image_button_play, null, 6);
        if (q3 != null) {
            q3.setOnClickListener(new c98(this, 1));
        }
        ow2 ow2Var3 = this.o;
        if (ow2Var3 == null) {
            ow2Var3 = null;
        }
        View q4 = bwt0.q(ow2Var3.itemView, R.id.downloaded_state, null, 6);
        if (q4 != null) {
            q4.setOnClickListener(new c98(this, 1));
        }
        ow2 ow2Var4 = this.o;
        if (ow2Var4 == null) {
            ow2Var4 = null;
        }
        View q5 = bwt0.q(ow2Var4.itemView, R.id.magic_wand, null, 6);
        if (q5 != null) {
            q5.setOnClickListener(new c98(this, 1));
        } else {
            q5 = null;
        }
        this.p = q5;
        ow2 ow2Var5 = this.o;
        if (ow2Var5 == null) {
            ow2Var5 = null;
        }
        ow2Var5.itemView.setOnClickListener(new c98(this, 1));
        ow2 ow2Var6 = this.o;
        (ow2Var6 != null ? ow2Var6 : null).itemView.setOnLongClickListener(this);
        return inflate;
    }

    /* JADX WARN: Type inference failed for: r13v8, types: [java.lang.Object, kotlin.Lazy] */
    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        Context context;
        Activity h;
        String str;
        MusicTrack musicTrack;
        if (view == null || (context = view.getContext()) == null || (h = e3m.h(context)) == null) {
            return;
        }
        UIBlockMusicTrack uIBlockMusicTrack = this.l;
        Set<String> set = v;
        Set<String> set2 = set;
        if (j5g.P(set2, uIBlockMusicTrack != null ? uIBlockMusicTrack.f : null) && this.k != null && this.q.a(h)) {
            return;
        }
        SchemeStat$EventItem.Type type = SchemeStat$EventItem.Type.MUSIC;
        UIBlockMusicTrack uIBlockMusicTrack2 = this.l;
        if (uIBlockMusicTrack2 == null || (str = uIBlockMusicTrack2.z.y) == null) {
            str = "";
        }
        SearchStatsLoggingInfo b = this.f.b(type, str, false);
        UIBlockMusicTrack uIBlockMusicTrack3 = this.l;
        b5a b5aVar = this.e;
        p9a p9aVar = uIBlockMusicTrack3 != null ? new p9a(b5aVar, uIBlockMusicTrack3, b) : null;
        boolean P = j5g.P(set2, uIBlockMusicTrack3 != null ? uIBlockMusicTrack3.f : null);
        int id = view.getId();
        bpn0 bpn0Var = this.h;
        if (id == R.id.audio_menu) {
            UIBlockMusicTrack uIBlockMusicTrack4 = this.l;
            if (uIBlockMusicTrack4 != null) {
                ic40.r(((fl4) bpn0Var.getValue()).w(), h, MusicBottomSheetLaunchPoint.App.b, uIBlockMusicTrack4.z, (brm0.B(uIBlockMusicTrack4.c, "synthetic_section_similar_tracks", false) ? MusicPlaybackLaunchContext.F : MusicPlaybackLaunchContext.Fb(uIBlockMusicTrack4.f)).Cb(jnj.a(uIBlockMusicTrack4.z.V)), p9aVar, this.i, false, uIBlockMusicTrack4.b, uIBlockMusicTrack4.c, 64);
                return;
            }
            return;
        }
        if (id == R.id.audio_image || id == R.id.image_button_play) {
            UIBlockMusicTrack uIBlockMusicTrack5 = this.l;
            if (uIBlockMusicTrack5 != null) {
                e(uIBlockMusicTrack5, P, uIBlockMusicTrack5.f);
                return;
            }
            return;
        }
        if (id == R.id.downloaded_state) {
            UIBlockMusicTrack uIBlockMusicTrack6 = this.l;
            if (uIBlockMusicTrack6 == null || (musicTrack = uIBlockMusicTrack6.z) == null) {
                return;
            }
            if (!epx.f(musicTrack.J, DownloadingState.NotLoaded.b)) {
                e(uIBlockMusicTrack6, P, uIBlockMusicTrack6.f);
                return;
            } else {
                if (o25.a().i().C) {
                    ((ms1) this.r.getValue()).M(h, musicTrack);
                    return;
                }
                return;
            }
        }
        if (id == R.id.magic_wand) {
            UIBlockMusicTrack uIBlockMusicTrack7 = this.l;
            if (uIBlockMusicTrack7 != null) {
                MusicTrack musicTrack2 = uIBlockMusicTrack7.z;
                Context context2 = view.getContext();
                zf40 zf40Var = this.u;
                if (zf40Var != null) {
                    zf40Var.b();
                }
                b5aVar.a(new cfp0(uIBlockMusicTrack7, new MusicAnalyticsInfo(MusicAnalyticsInfo.ClickTarget.ShowSimilarSerp)));
                lyd.g().M(context2, musicTrack2.Fb(), b, Boolean.valueOf(jnj.c(musicTrack2.V)));
                return;
            }
            return;
        }
        UIBlockMusicTrack uIBlockMusicTrack8 = this.l;
        if (uIBlockMusicTrack8 == null) {
            return;
        }
        MusicTrack musicTrack3 = uIBlockMusicTrack8.z;
        String str2 = uIBlockMusicTrack8.f;
        if (musicTrack3.Vb()) {
            ((fl4) bpn0Var.getValue()).O(view.getContext(), musicTrack3.c, musicTrack3.b, MusicPlaybackLaunchContext.Fb(str2).Cb(uIBlockMusicTrack8.p.h()), musicTrack3.I);
            return;
        }
        boolean contains = set.contains(str2);
        if (contains) {
            b.a.getClass();
            str2 = b.d() ? MusicPlaybackLaunchContext.J.t() : MusicPlaybackLaunchContext.I.t();
        }
        e(uIBlockMusicTrack8, contains, str2);
    }

    @Override // android.view.View.OnLongClickListener
    public final boolean onLongClick(View view) {
        UIBlockMusicTrack uIBlockMusicTrack;
        Context context;
        MusicTrack musicTrack;
        Set<String> set = v;
        UIBlockMusicTrack uIBlockMusicTrack2 = this.l;
        Activity activity = null;
        boolean P = j5g.P(set, uIBlockMusicTrack2 != null ? uIBlockMusicTrack2.f : null);
        UIBlockMusicTrack uIBlockMusicTrack3 = this.l;
        if ((uIBlockMusicTrack3 != null && (musicTrack = uIBlockMusicTrack3.z) != null && musicTrack.Vb()) || P || ((uIBlockMusicTrack = this.l) != null && uIBlockMusicTrack.Ob())) {
            return false;
        }
        if (view != null && (context = view.getContext()) != null) {
            activity = e3m.h(context);
        }
        UIBlockMusicTrack uIBlockMusicTrack4 = this.l;
        if (activity != null && uIBlockMusicTrack4 != null) {
            this.e.a(new cfp0(uIBlockMusicTrack4, new MusicAnalyticsInfo(MusicAnalyticsInfo.ClickTarget.LongTap)));
            lyd.g().k(activity, uIBlockMusicTrack4.z, MusicPlaybackLaunchContext.Fb(uIBlockMusicTrack4.f), uIBlockMusicTrack4.c);
            return true;
        }
        return false;
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
