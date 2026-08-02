package com.vk.catalog2.feature.music.holders;

import android.app.Activity;
import android.content.Context;
import android.graphics.Rect;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.vk.catalog2.common.dto.api.CatalogLaunchOrigin;
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
import com.vk.core.view.components.cell.VkCell;
import com.vk.dto.common.DownloadingState;
import com.vk.dto.music.MusicTrack;
import com.vk.movika.sdk.base.ui.s0;
import com.vk.music.common.MusicPlaybackLaunchContext;
import com.vk.music.player.PlayRequestTrigger;
import com.vk.music.player.PlaySourceMeta;
import com.vk.music.player.ShuffleMode;
import com.vk.music.player.StartPlayCatalogSource;
import com.vk.music.stats.AdsAudioPixelsContainer;
import com.vk.toggle.features.MusicFeatures;
import com.vkontakte.android.R;
import io.reactivex.rxjava3.core.q;
import io.reactivex.rxjava3.disposables.c;
import io.reactivex.rxjava3.disposables.g;
import java.util.Set;
import kotlin.LazyThreadSafetyMode;
import kotlin.jvm.internal.FunctionReferenceImpl;
import xsna.a630;
import xsna.b5a;
import xsna.b7;
import xsna.bdn;
import xsna.bpn0;
import xsna.bwt0;
import xsna.cfp0;
import xsna.e3m;
import xsna.epx;
import xsna.f4m;
import xsna.fl4;
import xsna.gl30;
import xsna.gzs;
import xsna.hpj;
import xsna.ie00;
import xsna.ikv0;
import xsna.itx0;
import xsna.iyx;
import xsna.j5g;
import xsna.jtx0;
import xsna.l22;
import xsna.lna;
import xsna.lo10;
import xsna.lqk0;
import xsna.ma;
import xsna.mp3;
import xsna.msy;
import xsna.n3a;
import xsna.nm8;
import xsna.nsp0;
import xsna.pkv0;
import xsna.q3a;
import xsna.qc00;
import xsna.rh4;
import xsna.rl3;
import xsna.s77;
import xsna.se50;
import xsna.sq40;
import xsna.t5a;
import xsna.tuq;
import xsna.u2b0;
import xsna.u6k;
import xsna.ub50;
import xsna.ut6;
import xsna.vq40;
import xsna.w0b;
import xsna.w9;
import xsna.zf40;
import xsna.zvj;

/* compiled from: MusicTrackCellVh.kt */
/* loaded from: classes16.dex */
public final class MusicTrackCellVh implements CatalogViewHolder, itx0, jtx0 {
    public static final Set<String> A = rl3.y0(new String[]{"offline_music_replacement_artist", "offline_music_replacement_default", "offline_music_replacement_name", "offline_music_replacement_new_first", "offline_music_replacement_date_new", "offline_music_replacement_date_old"});
    public final u2b0 b;
    public final int c;
    public final t5a<MusicTrack> d;
    public final b5a e;
    public final SearchStatInfoProvider f;
    public final int g;
    public final bpn0 h;
    public final q3a i;
    public final boolean j;
    public final boolean k;
    public final sq40 l;
    public final boolean m;
    public final boolean n;
    public final boolean o;
    public UIBlockMusicTrack p;
    public se50<MusicTrack> q;
    public final g r;
    public final nm8 s;
    public final hpj t;
    public final Object u;
    public final Object v;
    public final vq40 w;
    public boolean x;
    public zf40 y;
    public zf40 z;

    /* compiled from: MusicTrackCellVh.kt */
    public static final /* synthetic */ class a extends FunctionReferenceImpl implements gzs<Boolean> {
        @Override // xsna.gzs
        public final Boolean invoke() {
            ((b) this.receiver).getClass();
            return Boolean.valueOf(b.d());
        }
    }

    public MusicTrackCellVh(u2b0 u2b0Var, int i, t5a t5aVar, b5a b5aVar, SearchStatInfoProvider searchStatInfoProvider, q3a q3aVar, sq40 sq40Var, boolean z, int i2) {
        i = (i2 & 2) != 0 ? R.layout.catalog_music_cell_audio_item : i;
        bpn0 bpn0Var = new bpn0(new w9(21));
        boolean z2 = (i2 & 512) == 0;
        boolean z3 = (i2 & 1024) == 0;
        boolean z4 = (i2 & 4096) == 0;
        boolean z5 = (i2 & 8192) == 0;
        boolean z6 = (i2 & 16384) != 0 ? true : z;
        this.b = u2b0Var;
        this.c = i;
        this.d = t5aVar;
        this.e = b5aVar;
        this.f = searchStatInfoProvider;
        this.g = 1;
        this.h = bpn0Var;
        this.i = q3aVar;
        this.j = z2;
        this.k = z3;
        this.l = sq40Var;
        this.m = z4;
        this.n = z5;
        this.o = z6;
        this.r = new g();
        this.s = w0b.a(0, null, new tuq(18), 3);
        bdn bdnVar = bdn.a;
        this.t = zvj.a(ie00.a.U().plus(iyx.a()));
        qc00 qc00Var = new qc00(3);
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
        this.u = msy.a(lazyThreadSafetyMode, qc00Var);
        this.v = msy.a(lazyThreadSafetyMode, new lo10(this, 5));
        this.w = new vq40();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void h(Context context) {
        if (e3m.h(context) != null) {
            ikv0.a aVar = new ikv0.a(context);
            aVar.u = new ikv0.d(context.getString(R.string.music_catalog_generic_error_message), (String) null, (ikv0.d.a) (0 == true ? 1 : 0), 6);
            aVar.e = 4000L;
            pkv0.f(aVar);
        }
    }

    @Override // com.vk.catalog2.common.ui.holders.api.CatalogViewHolder
    public final void L() {
        this.r.dispose();
        this.s.B(null);
        zvj.c(this.t, null);
    }

    @Override // com.vk.catalog2.common.ui.holders.api.CatalogViewHolder
    public final void N6(UIBlock uIBlock) {
        q<n3a> a2;
        c subscribe;
        VkCell.Right.d right;
        lna a3;
        UIBlockMusicTrack uIBlockMusicTrack = uIBlock instanceof UIBlockMusicTrack ? (UIBlockMusicTrack) uIBlock : null;
        if (uIBlockMusicTrack != null) {
            this.p = uIBlockMusicTrack;
            CatalogViewStyle catalogViewStyle = uIBlockMusicTrack.l;
            MusicTrackCatalogViewStyle musicTrackCatalogViewStyle = catalogViewStyle instanceof MusicTrackCatalogViewStyle ? (MusicTrackCatalogViewStyle) catalogViewStyle : null;
            boolean z = musicTrackCatalogViewStyle != null && musicTrackCatalogViewStyle.b == MusicTrackCatalogViewStyle.Style.MagicWand;
            se50<MusicTrack> se50Var = this.q;
            if (se50Var == null) {
                se50Var = null;
            }
            se50Var.V5(uIBlockMusicTrack.B, uIBlockMusicTrack.C.b && z, uIBlockMusicTrack.y - 1, uIBlockMusicTrack.z);
            UIBlockMusicTrack uIBlockMusicTrack2 = (UIBlockMusicTrack) uIBlock;
            se50<MusicTrack> se50Var2 = this.q;
            if (se50Var2 == null) {
                se50Var2 = null;
            }
            View view = se50Var2.itemView;
            VkCell vkCell = view instanceof VkCell ? (VkCell) view : null;
            if (vkCell != null && (right = vkCell.getRight()) != null) {
                VkCell.Right.e eVar = right.b;
                VkCell.Right.e.d dVar = eVar instanceof VkCell.Right.e.d ? (VkCell.Right.e.d) eVar : null;
                if (dVar != null) {
                    VkCell.f fVar = dVar.a;
                    lna lnaVar = fVar instanceof lna ? (lna) fVar : null;
                    if (lnaVar != null) {
                        if (!this.o) {
                            CatalogViewStyle catalogViewStyle2 = uIBlockMusicTrack2.l;
                            MusicTrack musicTrack = uIBlockMusicTrack2.z;
                            MusicTrackCatalogViewStyle musicTrackCatalogViewStyle2 = catalogViewStyle2 instanceof MusicTrackCatalogViewStyle ? (MusicTrackCatalogViewStyle) catalogViewStyle2 : null;
                            if ((musicTrackCatalogViewStyle2 == null || musicTrackCatalogViewStyle2.b != MusicTrackCatalogViewStyle.Style.MyMusic) && epx.f(musicTrack.J, DownloadingState.NotLoaded.b)) {
                                a3 = e().i0(musicTrack) ? lna.a(lnaVar, true, R.drawable.vk_icon_done_16, vkCell.getContext().getString(R.string.music_talkback_remove_from_my_music), 135) : e().i(musicTrack) ? lna.a(lnaVar, true, R.drawable.vk_icon_add_outline_16, vkCell.getContext().getString(R.string.music_talkback_add_to_my_music), 135) : lna.a(lnaVar, false, 0, null, 143);
                                vkCell.setRight(VkCell.Right.d.a(right, null, new VkCell.Right.e.d(a3, dVar.b), null, null, null, 29));
                            }
                        }
                        a3 = lna.a(lnaVar, false, 0, null, 143);
                        vkCell.setRight(VkCell.Right.d.a(right, null, new VkCell.Right.e.d(a3, dVar.b), null, null, null, 29));
                    }
                }
            }
            q3a q3aVar = this.i;
            if (q3aVar == null || (a2 = q3aVar.a()) == null || (subscribe = a2.b0(nsp0.class).t0(1L).subscribe(new gl30(new u6k(this, 29), 5))) == null) {
                return;
            }
            this.r.b(subscribe);
        }
    }

    @Override // xsna.itx0
    public final void a(boolean z) {
        this.x = z;
    }

    @Override // xsna.jtx0
    public final void b(zf40 zf40Var) {
        this.z = zf40Var;
    }

    @Override // xsna.itx0
    public final void c(zf40 zf40Var) {
        this.y = zf40Var;
    }

    public final boolean d() {
        se50<MusicTrack> se50Var = this.q;
        if (se50Var == null) {
            se50Var = null;
        }
        Context context = se50Var.itemView.getContext();
        Activity h = context != null ? e3m.h(context) : null;
        if (h == null) {
            return false;
        }
        UIBlockMusicTrack uIBlockMusicTrack = this.p;
        return j5g.P(A, uIBlockMusicTrack != null ? uIBlockMusicTrack.f : null) && this.l != null && this.w.a(h);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    public final a630 e() {
        return (a630) this.u.getValue();
    }

    public final void g(View view) {
        UIBlockMusicTrack uIBlockMusicTrack;
        if (d() || (uIBlockMusicTrack = this.p) == null) {
            return;
        }
        MusicTrack musicTrack = uIBlockMusicTrack.z;
        String str = uIBlockMusicTrack.f;
        if (musicTrack.Vb()) {
            ((fl4) this.h.getValue()).O(view.getContext(), musicTrack.c, musicTrack.b, MusicPlaybackLaunchContext.Fb(str).Cb(uIBlockMusicTrack.p.h()), musicTrack.I);
            return;
        }
        boolean contains = A.contains(str);
        if (contains) {
            b.a.getClass();
            str = b.d() ? MusicPlaybackLaunchContext.J.t() : MusicPlaybackLaunchContext.I.t();
        }
        j(uIBlockMusicTrack, contains, str);
    }

    public final void j(UIBlockMusicTrack uIBlockMusicTrack, boolean z, String str) {
        MusicPlaybackLaunchContext Bb = this.f.a() ? MusicPlaybackLaunchContext.o.Bb(uIBlockMusicTrack.b) : MusicPlaybackLaunchContext.Fb(str);
        CatalogLaunchOrigin catalogLaunchOrigin = uIBlockMusicTrack.p;
        MusicTrack musicTrack = uIBlockMusicTrack.z;
        MusicPlaybackLaunchContext Cb = Bb.Cb(catalogLaunchOrigin.h());
        u2b0 u2b0Var = this.b;
        this.e.a(new cfp0(uIBlockMusicTrack, new MusicAnalyticsInfo((u2b0Var.h() && epx.f(u2b0Var.b(), musicTrack)) ? MusicAnalyticsInfo.ClickTarget.Pause : MusicAnalyticsInfo.ClickTarget.Play)));
        ShowAllInfo showAllInfo = uIBlockMusicTrack.D;
        u2b0Var.N0(new lqk0(new StartPlayCatalogSource(uIBlockMusicTrack.b, uIBlockMusicTrack.c, uIBlockMusicTrack.A, musicTrack.Ib(), z, showAllInfo != null ? new PlaySourceMeta.CatalogPlaySourceMeta(showAllInfo.b, showAllInfo.c, false, 4, null) : PlaySourceMeta.Default.b), uIBlockMusicTrack.z, (MusicFeatures.AUDIO_FIX_SEARCH_MUSIC_LAUNCH.h() && uIBlockMusicTrack.E) ? null : this.d.b(uIBlockMusicTrack.b), Cb, 0, (ShuffleMode) null, (PlayRequestTrigger) null, (AdsAudioPixelsContainer) null, 0L, 1008));
    }

    @Override // com.vk.catalog2.common.ui.holders.api.CatalogViewHolder
    public final View k5(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(this.c, viewGroup, false);
        if (this.k) {
            bwt0.r0(-1, inflate);
        }
        if (this.j && viewGroup != null) {
            f4m.x(0, viewGroup);
        }
        ub50 ub50Var = new ub50(null);
        int i = this.g;
        if (i == 1) {
            ub50Var.d();
        } else if (i == 3) {
            ub50Var.f = 3;
            ub50Var.d = false;
            if (ub50Var.g == 0 && ub50Var.h == null) {
                ub50Var.g = R.layout.music_audio_item_ordered_playlist;
            }
        } else if (i != 5) {
            ub50Var.d();
        } else {
            ub50Var.f = 5;
            if (ub50Var.g == 0 && ub50Var.h == null) {
                ub50Var.g = R.layout.music_item_listened_track;
            }
        }
        ub50Var.h = inflate;
        ub50Var.i = new a(0, b.a, b.class, "isConnected", "isConnected()Z", 0);
        ub50Var.a = true;
        ub50Var.e(new s77(this, 9));
        ub50Var.m = this.b;
        int i2 = 20;
        this.q = ub50Var.b(null, this.s, new rh4(21, this, inflate), new b7(13, this, inflate), new l22(i2, this, inflate), new ma(i2, this, inflate), new s0(i2, this, inflate), new ut6(22, this, inflate), new mp3(20, this, inflate), this.m, this.n);
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

    @Override // xsna.m0q0
    public final void y(UiTrackingScreen uiTrackingScreen) {
    }
}
