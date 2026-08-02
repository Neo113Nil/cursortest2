package com.vk.music.playlist.display.presentation;

import android.content.Intent;
import android.graphics.Rect;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.LruCache;
import android.view.View;
import com.vk.bridges.di.BridgeComponent;
import com.vk.core.ui.measuring.UiMeasuringScreen;
import com.vk.core.ui.tracking.UiTrackingScreen;
import com.vk.dto.common.id.UserId;
import com.vk.dto.music.Playlist;
import com.vk.dto.search.SearchStatsLoggingInfo;
import com.vk.feed.core.models.news.NewsEntry;
import com.vk.musc.kidsmode.api.KidsModeRestrictionRenderer;
import com.vk.music.common.MusicPlaybackLaunchContext;
import com.vk.music.playlist.display.data.LoadPlaylistStateValue;
import com.vk.music.playlist.display.domain.LoadPlaylistTracksRequest;
import com.vk.music.playlist.display.domain.a;
import com.vk.music.playlist.display.domain.f;
import com.vk.music.playlist.display.domain.i;
import com.vk.music.playlist.framework.presentation.track.MusicTrackPlayState;
import com.vk.mvi.androidx.MviImplFragment;
import com.vk.newsfeed.api.di.NewsFeedBridgeComponent;
import com.vk.stat.scheme.MobileOfficialAppsCoreNavStat$EventScreen;
import com.vk.stat.scheme.SchemeStat$EventItem;
import java.util.LinkedHashMap;
import java.util.UUID;
import kotlin.LazyThreadSafetyMode;
import kotlin.Pair;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.FunctionReferenceImpl;
import xsna.abo;
import xsna.ao50;
import xsna.b25;
import xsna.c550;
import xsna.cwg;
import xsna.ef50;
import xsna.epx;
import xsna.ffn;
import xsna.g950;
import xsna.gb;
import xsna.gd60;
import xsna.geb0;
import xsna.gzs;
import xsna.ikv0;
import xsna.jgp;
import xsna.k840;
import xsna.km50;
import xsna.lq40;
import xsna.lz40;
import xsna.m4g;
import xsna.mk50;
import xsna.msy;
import xsna.mzp0;
import xsna.ne7;
import xsna.ocg;
import xsna.oz50;
import xsna.r5i;
import xsna.r5v0;
import xsna.r6m;
import xsna.r8;
import xsna.rzp0;
import xsna.s750;
import xsna.sje;
import xsna.u2b0;
import xsna.vak0;
import xsna.vk50;
import xsna.w950;
import xsna.x2b0;
import xsna.x3i;
import xsna.x5i;
import xsna.xl40;
import xsna.xn50;
import xsna.xqf;
import xsna.y3i;
import xsna.yfn;
import xsna.z0h;
import xsna.z3i;
import xsna.zak0;

/* compiled from: DisplayMusicPlaylistFragment.kt */
/* loaded from: classes3.dex */
public final class DisplayMusicPlaylistFragment extends MviImplFragment<com.vk.music.playlist.display.domain.b, i, com.vk.music.playlist.display.domain.a> {
    public static final /* synthetic */ int b0 = 0;
    public final Object Q;
    public final Object R;
    public final Object S;
    public final Object T;
    public final Object U;
    public final Object V;
    public final Object W;
    public final Object X;
    public final Object Y;
    public final Object Z;
    public ffn a0;

    /* compiled from: DisplayMusicPlaylistFragment.kt */
    public static final /* synthetic */ class b extends FunctionReferenceImpl implements gzs<Boolean> {
        @Override // xsna.gzs
        public final Boolean invoke() {
            return Boolean.valueOf(((g950) this.receiver).b());
        }
    }

    public DisplayMusicPlaylistFragment() {
        z0h z0hVar = new z0h(this, 8);
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
        this.Q = msy.a(lazyThreadSafetyMode, z0hVar);
        this.R = msy.a(lazyThreadSafetyMode, new r5i(this, 9));
        this.S = msy.a(lazyThreadSafetyMode, new ocg(this, 13));
        this.T = msy.a(lazyThreadSafetyMode, new x3i(this, 7));
        this.U = msy.a(lazyThreadSafetyMode, new y3i(this, 5));
        this.V = msy.a(lazyThreadSafetyMode, new x5i(this, 11));
        this.W = msy.a(lazyThreadSafetyMode, new xqf(this, 16));
        this.X = msy.a(lazyThreadSafetyMode, new sje(this, 22));
        this.Y = msy.a(lazyThreadSafetyMode, new cwg(this, 13));
        this.Z = msy.a(lazyThreadSafetyMode, new z3i(this, 7));
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.xn50
    public final mk50 Fl() {
        Playlist i;
        Playlist i2;
        Bundle arguments = getArguments();
        boolean z = false;
        boolean Eb = (arguments == null || (i2 = ne7.i(arguments)) == null) ? false : i2.Eb();
        Bundle arguments2 = getArguments();
        if (arguments2 != null && (i = ne7.i(arguments2)) != null && i.v == 0) {
            z = true;
        }
        ffn ffnVar = new ffn(new geb0(kn()), Eb, z, (KidsModeRestrictionRenderer) this.X.getValue(), this.J, getViewLifecycleOwner(), requireContext());
        this.a0 = ffnVar;
        return new mk50.c(ffnVar.d);
    }

    @Override // xsna.xn50
    public final void Jh(ao50 ao50Var, View view) {
        i iVar = (i) ao50Var;
        ffn ffnVar = this.a0;
        if (ffnVar == null) {
            ffnVar = null;
        }
        ffnVar.f(iVar, new r8(1, this, DisplayMusicPlaylistFragment.class, "sendAction", "sendAction(Lcom/vk/mvi/core/data/MviAction;)V", 0, 7));
    }

    @Override // com.vk.mvi.androidx.MviImplFragment, xsna.xn50
    public final void R4(vk50 vk50Var) {
        com.vk.music.playlist.display.domain.b bVar = (com.vk.music.playlist.display.domain.b) vk50Var;
        bVar.p.a(new gb(15, this, bVar), this);
        bVar.q.a(new m4g(this, 15), this);
    }

    @Override // com.vk.core.fragments.FragmentImpl
    public final boolean Wn(Rect rect, Rect rect2) {
        ffn ffnVar = this.a0;
        if (ffnVar == null) {
            ffnVar = null;
        }
        ffnVar.getClass();
        int i = rect2.top;
        if (i > 0) {
            ((zak0) ffnVar.k).setValue(Integer.valueOf(i));
        }
        rect2.top = 0;
        return true;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    public final BridgeComponent fo() {
        return (BridgeComponent) this.Q.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.vk.core.fragments.FragmentImpl, androidx.fragment.app.Fragment
    public final void onPause() {
        ((c550) this.Z.getValue()).b(false);
        ef50 ef50Var = (ef50) this.T.getValue();
        ikv0 ikv0Var = ef50Var.e;
        if (ikv0Var != null) {
            ikv0Var.a();
        }
        ef50Var.e = null;
        super.onPause();
    }

    /* JADX WARN: Type inference failed for: r0v10, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.vk.core.fragments.FragmentImpl, androidx.fragment.app.Fragment
    public final void onResume() {
        ffn ffnVar = this.a0;
        if (ffnVar == null) {
            ffnVar = null;
        }
        ffnVar.f.a(((vak0) ffnVar.l).getFloatValue());
        ((c550) this.Z.getValue()).b(true);
        com.vk.core.utils.newtork.b.a.getClass();
        if (com.vk.core.utils.newtork.b.d()) {
            ef50 ef50Var = (ef50) this.T.getValue();
            ef50Var.getClass();
            boolean z = !r6m.i() && ef50Var.f;
            if (z) {
                ef50Var.f = false;
            }
            if (z) {
                xn50.a.c(this, a.c.C1343c.b);
            } else {
                ef50Var.a(requireContext(), false);
            }
        }
        super.onResume();
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x01d1  */
    /* JADX WARN: Type inference failed for: r1v18, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r2v11, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r2v5, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r2v9, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.xn50
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final vk50 x8(Bundle bundle, km50 km50Var) {
        a.c c1342a;
        UserId userId;
        UserId userId2;
        Playlist playlist;
        com.vk.music.stats.a aVar;
        Parcelable parcelable;
        Object parcelable2;
        String string;
        Playlist i;
        Playlist i2;
        Bundle arguments = getArguments();
        if (arguments == null || (i2 = ne7.i(arguments)) == null) {
            Bundle arguments2 = getArguments();
            if (arguments2 == null || (userId = ne7.h(arguments2)) == null) {
                userId = UserId.d;
            }
            Bundle arguments3 = getArguments();
            int i3 = arguments3 != null ? arguments3.getInt("PLAYLIST_ID") : 0;
            Bundle arguments4 = getArguments();
            c1342a = new a.c.C1342a(userId, i3, arguments4 != null ? arguments4.getString("ACCESS_KEY") : null);
        } else {
            c1342a = new a.c.b(i2);
        }
        a.c cVar = c1342a;
        Bundle arguments5 = getArguments();
        if (arguments5 == null || (i = ne7.i(arguments5)) == null) {
            Bundle arguments6 = getArguments();
            int i4 = arguments6 != null ? arguments6.getInt("PLAYLIST_ID") : 0;
            Bundle arguments7 = getArguments();
            if (arguments7 == null || (userId2 = ne7.h(arguments7)) == null) {
                userId2 = UserId.d;
            }
            UserId userId3 = userId2;
            Bundle arguments8 = getArguments();
            playlist = new Playlist(i4, userId3, 0, null, null, null, null, null, null, false, 0, null, null, null, null, null, null, null, false, 0, 0, 0L, arguments8 != null ? arguments8.getString("ACCESS_KEY") : null, null, null, null, null, false, false, false, null, null, null, 0, false, null, null, false, null, 0, -4194308, 255, null);
        } else {
            playlist = i;
        }
        LoadPlaylistStateValue loadPlaylistStateValue = LoadPlaylistStateValue.LOADING;
        boolean b2 = k840.a.i.b();
        Bundle arguments9 = getArguments();
        MusicPlaybackLaunchContext Fb = (arguments9 == null || (string = arguments9.getString("REFER")) == null) ? null : MusicPlaybackLaunchContext.Fb(string);
        Bundle arguments10 = getArguments();
        String string2 = arguments10 != null ? arguments10.getString("LAUNCH_ORIGIN", "unknown") : "unknown";
        UserId c = fo().s().c();
        boolean booleanValue = ((xl40) this.W.getValue()).isEnabled().getValue().booleanValue();
        EmptyList emptyList = EmptyList.b;
        f fVar = new f(new yfn(loadPlaylistStateValue, playlist, b2, string2, null, emptyList, null, null, emptyList, MusicTrackPlayState.NONE, null, emptyList, new LinkedHashMap(), 0L, false, Fb, c, LoadPlaylistTracksRequest.g, null, true, booleanValue, jgp.b, emptyList), fo().p().a());
        u2b0 b3 = k840.a.g().b();
        r5v0 r5v0Var = k840.a.h;
        r5v0 r5v0Var2 = r5v0Var != null ? r5v0Var : null;
        b25 s = fo().s();
        abo c2 = k840.a.c();
        lq40 d = k840.a.d();
        lq40 d2 = k840.a.d();
        mzp0 mzp0Var = this.J;
        s750 s750Var = k840.a.e;
        s750 s750Var2 = s750Var != null ? s750Var : null;
        Bundle arguments11 = getArguments();
        if (arguments11 != null) {
            if (Build.VERSION.SDK_INT >= 33) {
                parcelable2 = arguments11.getParcelable("SEARCH_STATS_LOGGING_INFO", SearchStatsLoggingInfo.class);
                parcelable = (Parcelable) parcelable2;
            } else {
                Parcelable parcelable3 = arguments11.getParcelable("SEARCH_STATS_LOGGING_INFO");
                if (!(parcelable3 instanceof SearchStatsLoggingInfo)) {
                    parcelable3 = null;
                }
                parcelable = (SearchStatsLoggingInfo) parcelable3;
            }
            SearchStatsLoggingInfo searchStatsLoggingInfo = (SearchStatsLoggingInfo) parcelable;
            if (searchStatsLoggingInfo != null) {
                aVar = new com.vk.music.stats.a(searchStatsLoggingInfo);
                gd60 Ad = ((NewsFeedBridgeComponent) this.R.getValue()).Ad();
                Bundle arguments12 = getArguments();
                return new com.vk.music.playlist.display.domain.b(fVar, cVar, b3, r5v0Var2, s, c2, d, d2, new lz40(s750Var2, aVar, Ad, arguments12 != null ? ne7.g(arguments12) : null, (w950) this.U.getValue(), (x2b0) this.Y.getValue()), mzp0Var);
            }
        }
        aVar = null;
        gd60 Ad2 = ((NewsFeedBridgeComponent) this.R.getValue()).Ad();
        Bundle arguments122 = getArguments();
        return new com.vk.music.playlist.display.domain.b(fVar, cVar, b3, r5v0Var2, s, c2, d, d2, new lz40(s750Var2, aVar, Ad2, arguments122 != null ? ne7.g(arguments122) : null, (w950) this.U.getValue(), (x2b0) this.Y.getValue()), mzp0Var);
    }

    @Override // com.vk.core.fragments.FragmentImpl, xsna.m0q0
    public final void y(UiTrackingScreen uiTrackingScreen) {
        Playlist i;
        UserId h;
        SchemeStat$EventItem.Type type = SchemeStat$EventItem.Type.PLAYLIST;
        Bundle arguments = getArguments();
        uiTrackingScreen.f = new SchemeStat$EventItem(type, getArguments() != null ? Long.valueOf(r0.getInt("PLAYLIST_ID")) : null, (arguments == null || (h = ne7.h(arguments)) == null) ? null : Long.valueOf(h.b), null, null, null, 56, null);
        Bundle arguments2 = getArguments();
        if (epx.f(arguments2 != null ? arguments2.getString("CATALOG_BLOCK_ID") : null, "synthetic_offline_playlists")) {
            uiTrackingScreen.a = MobileOfficialAppsCoreNavStat$EventScreen.MUSIC_OFFLINE_LIBRARY_PLAYLISTS;
            return;
        }
        Bundle arguments3 = getArguments();
        if (epx.f(arguments3 != null ? arguments3.getString("CATALOG_BLOCK_ID") : null, "synthetic_offline_albums")) {
            uiTrackingScreen.a = MobileOfficialAppsCoreNavStat$EventScreen.MUSIC_OFFLINE_LIBRARY_PLAYLISTS;
            return;
        }
        Bundle arguments4 = getArguments();
        if (epx.f(arguments4 != null ? arguments4.getString("CATALOG_BLOCK_ID") : null, "offline_music_replacement_default")) {
            uiTrackingScreen.a = MobileOfficialAppsCoreNavStat$EventScreen.MUSIC_OFFLINE_LIBRARY_PLAYLISTS;
            return;
        }
        Bundle arguments5 = getArguments();
        if (epx.f(arguments5 != null ? arguments5.getString("LAUNCH_ORIGIN", "unknown") : null, "kids_section")) {
            Bundle arguments6 = getArguments();
            if (arguments6 == null || (i = ne7.i(arguments6)) == null || !i.Eb()) {
                uiTrackingScreen.a = MobileOfficialAppsCoreNavStat$EventScreen.MUSIC_KIDS_PLAYLIST;
            } else {
                uiTrackingScreen.a = MobileOfficialAppsCoreNavStat$EventScreen.MUSIC_KIDS_ALBUM;
            }
        }
    }

    /* compiled from: DisplayMusicPlaylistFragment.kt */
    public static final class a extends oz50 {
        public a(UserId userId, int i, String str) {
            super(DisplayMusicPlaylistFragment.class, null, null);
            this.j.putParcelable("OWNER_ID", userId);
            this.j.putInt("PLAYLIST_ID", i);
            this.j.putString("ACCESS_KEY", str);
        }

        public final void A(NewsEntry newsEntry) {
            this.j.putParcelable("NEWS_ENTRY", newsEntry);
        }

        public final void B(String str) {
            this.j.putString("REFER", str);
        }

        public final void C(SearchStatsLoggingInfo searchStatsLoggingInfo) {
            this.j.putParcelable("SEARCH_STATS_LOGGING_INFO", searchStatsLoggingInfo);
        }

        @Override // xsna.oz50
        public final void r(Intent intent) {
            LruCache<UUID, mzp0> lruCache = rzp0.a;
            Pair c = rzp0.c(UiMeasuringScreen.MUSIC_PLAYLIST_FULL, null, false, 62);
            UUID uuid = (UUID) c.d();
            ((mzp0) c.g()).init();
            Bundle bundleExtra = intent.getBundleExtra("args");
            if (bundleExtra != null) {
                rzp0.f(bundleExtra, uuid);
            }
        }

        public final void y(String str) {
            this.j.putString("CATALOG_BLOCK_ID", str);
        }

        public final void z(String str) {
            this.j.putString("LAUNCH_ORIGIN", str);
        }

        public a(Playlist playlist) {
            this(playlist.c, playlist.b, playlist.x);
            this.j.putParcelable("USER_PLAYLIST", Playlist.zb(playlist, null, null, EmptyList.b, null, -8388609, 255));
        }
    }
}
