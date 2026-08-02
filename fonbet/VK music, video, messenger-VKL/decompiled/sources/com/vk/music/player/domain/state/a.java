package com.vk.music.player.domain.state;

import com.mbridge.msdk.playercommon.exoplayer2.source.ExtractorMediaSource;
import com.vk.dto.common.DownloadingState;
import com.vk.dto.music.MusicTrack;
import com.vk.music.common.MusicPlaybackLaunchContext;
import com.vk.music.player.AdvertisementInfo;
import com.vk.music.player.LoopMode;
import com.vk.music.player.PlayState;
import com.vk.music.player.PlayerTrack;
import com.vk.music.player.domain.state.b;
import com.vk.music.player.f;
import io.requery.android.database.sqlite.SQLiteDatabase;
import java.util.List;
import kotlin.collections.EmptyList;
import xsna.da00;
import xsna.ft4;
import xsna.ggp;
import xsna.ugp0;
import xsna.vu5;

/* compiled from: MusicBigPlayerState.kt */
/* loaded from: classes3.dex */
public final class a {
    public f a;
    public boolean f;
    public int h;
    public MusicBigPlayerPage i;
    public boolean j;
    public boolean k;
    public LyricsMode l;
    public da00 m;
    public LyricsScrollMode n;
    public PlayerControlsMode o;
    public DownloadingState p;
    public b q;
    public boolean r;
    public boolean s;
    public boolean t;
    public boolean u;
    public int v;
    public ugp0 b = new ugp0(0, 0, 0);
    public PlayState c = PlayState.IDLE;
    public List<PlayerTrack> d = EmptyList.b;
    public MusicPlaybackLaunchContext e = MusicPlaybackLaunchContext.A;
    public LoopMode g = LoopMode.NONE;

    public a() {
        MusicBigPlayerPage musicBigPlayerPage;
        MusicBigPlayerPage.Companion.getClass();
        musicBigPlayerPage = MusicBigPlayerPage.DEFAULT_PAGE;
        this.i = musicBigPlayerPage;
        this.l = LyricsMode.COLLAPSED;
        this.m = ggp.a;
        this.n = LyricsScrollMode.AUTO;
        this.o = PlayerControlsMode.SHOWN;
        this.p = DownloadingState.NotLoaded.b;
        this.q = b.d.a;
    }

    public static a a(a aVar, PlayState playState, List list, MusicPlaybackLaunchContext musicPlaybackLaunchContext, boolean z, LoopMode loopMode, MusicBigPlayerPage musicBigPlayerPage, boolean z2, boolean z3, LyricsMode lyricsMode, da00 da00Var, LyricsScrollMode lyricsScrollMode, PlayerControlsMode playerControlsMode, DownloadingState downloadingState, boolean z4, boolean z5, boolean z6, boolean z7, int i, int i2) {
        f fVar = aVar.a;
        ugp0 ugp0Var = aVar.b;
        PlayState playState2 = (i2 & 4) != 0 ? aVar.c : playState;
        List list2 = (i2 & 8) != 0 ? aVar.d : list;
        MusicPlaybackLaunchContext musicPlaybackLaunchContext2 = (i2 & 16) != 0 ? aVar.e : musicPlaybackLaunchContext;
        boolean z8 = (i2 & 32) != 0 ? aVar.f : z;
        LoopMode loopMode2 = (i2 & 64) != 0 ? aVar.g : loopMode;
        int i3 = aVar.h;
        MusicBigPlayerPage musicBigPlayerPage2 = (i2 & 256) != 0 ? aVar.i : musicBigPlayerPage;
        boolean z9 = (i2 & 512) != 0 ? aVar.j : z2;
        boolean z10 = (i2 & 1024) != 0 ? aVar.k : z3;
        LyricsMode lyricsMode2 = (i2 & 2048) != 0 ? aVar.l : lyricsMode;
        da00 da00Var2 = (i2 & 4096) != 0 ? aVar.m : da00Var;
        LyricsScrollMode lyricsScrollMode2 = (i2 & 8192) != 0 ? aVar.n : lyricsScrollMode;
        PlayerControlsMode playerControlsMode2 = (i2 & 16384) != 0 ? aVar.o : playerControlsMode;
        DownloadingState downloadingState2 = (i2 & 32768) != 0 ? aVar.p : downloadingState;
        boolean z11 = (i2 & 65536) != 0 ? aVar.r : z4;
        boolean z12 = (i2 & 131072) != 0 ? aVar.s : z5;
        boolean z13 = (i2 & SQLiteDatabase.OPEN_PRIVATECACHE) != 0 ? aVar.t : z6;
        boolean z14 = (i2 & 524288) != 0 ? aVar.u : z7;
        int i4 = (i2 & ExtractorMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES) != 0 ? aVar.v : i;
        aVar.getClass();
        a aVar2 = new a();
        aVar2.b(fVar, ugp0Var, playState2, list2, musicPlaybackLaunchContext2, z8, loopMode2, i3, musicBigPlayerPage2, z9, z10, lyricsMode2, da00Var2, lyricsScrollMode2, playerControlsMode2, downloadingState2, z11, z12, z13, z14, i4);
        return aVar2;
    }

    public final void b(f fVar, ugp0 ugp0Var, PlayState playState, List list, MusicPlaybackLaunchContext musicPlaybackLaunchContext, boolean z, LoopMode loopMode, int i, MusicBigPlayerPage musicBigPlayerPage, boolean z2, boolean z3, LyricsMode lyricsMode, da00 da00Var, LyricsScrollMode lyricsScrollMode, PlayerControlsMode playerControlsMode, DownloadingState downloadingState, boolean z4, boolean z5, boolean z6, boolean z7, int i2) {
        b fVar2;
        this.a = fVar;
        this.b = ugp0Var;
        this.c = playState;
        this.d = list;
        this.e = musicPlaybackLaunchContext;
        this.f = z;
        this.g = loopMode;
        this.h = i;
        this.i = musicBigPlayerPage;
        this.j = z2;
        this.k = z3;
        this.l = lyricsMode;
        this.m = da00Var;
        this.n = lyricsScrollMode;
        this.o = playerControlsMode;
        this.p = downloadingState;
        Object obj = this.q;
        b bVar = b.d.a;
        b bVar2 = bVar;
        if (fVar != null) {
            if (fVar.n()) {
                MusicTrack f = fVar.f();
                bVar2 = bVar;
                if (f != null) {
                    if (f.Ub()) {
                        if (obj instanceof b.g) {
                            ft4 ft4Var = (ft4) obj;
                            ft4Var.c = f;
                            ft4Var.f(fVar);
                            bVar2 = (b.g) ft4Var;
                        } else {
                            fVar2 = new b.g(f, fVar.b(), new ugp0(fVar.e(), fVar.h(), fVar.d()));
                            bVar2 = fVar2;
                        }
                    } else if (f.Vb()) {
                        if (obj instanceof b.h) {
                            ft4 ft4Var2 = (ft4) obj;
                            ft4Var2.c = f;
                            ft4Var2.f(fVar);
                            bVar2 = (b.h) ft4Var2;
                        } else {
                            fVar2 = new b.h(f, fVar.b(), new ugp0(fVar.e(), fVar.h(), fVar.d()));
                            bVar2 = fVar2;
                        }
                    } else if (f.Wb()) {
                        if (obj instanceof b.i) {
                            ft4 ft4Var3 = (ft4) obj;
                            ft4Var3.c = f;
                            ft4Var3.f(fVar);
                            bVar2 = (b.i) ft4Var3;
                        } else {
                            fVar2 = new b.i(f, fVar.b(), new ugp0(fVar.e(), fVar.h(), fVar.d()));
                            bVar2 = fVar2;
                        }
                    } else if (f.Mb()) {
                        if (obj instanceof b.C1334b) {
                            ft4 ft4Var4 = (ft4) obj;
                            ft4Var4.c = f;
                            ft4Var4.f(fVar);
                            bVar2 = (b.C1334b) ft4Var4;
                        } else {
                            fVar2 = new b.C1334b(f, fVar.b(), new ugp0(fVar.e(), fVar.h(), fVar.d()));
                            bVar2 = fVar2;
                        }
                    } else if (f.Nb()) {
                        if (obj instanceof b.c) {
                            ft4 ft4Var5 = (ft4) obj;
                            ft4Var5.c = f;
                            ft4Var5.f(fVar);
                            bVar2 = (b.c) ft4Var5;
                        } else {
                            fVar2 = new b.c(f, fVar.b(), new ugp0(fVar.e(), fVar.h(), fVar.d()));
                            bVar2 = fVar2;
                        }
                    } else if (f.Qb()) {
                        if (obj instanceof b.e) {
                            ft4 ft4Var6 = (ft4) obj;
                            ft4Var6.c = f;
                            ft4Var6.f(fVar);
                            bVar2 = (b.e) ft4Var6;
                        } else {
                            fVar2 = new b.e(f, fVar.b(), new ugp0(fVar.e(), fVar.h(), fVar.d()));
                            bVar2 = fVar2;
                        }
                    } else if (obj instanceof b.f) {
                        ft4 ft4Var7 = (ft4) obj;
                        ft4Var7.c = f;
                        ft4Var7.f(fVar);
                        bVar2 = (b.f) ft4Var7;
                    } else {
                        fVar2 = new b.f(f, fVar.b(), new ugp0(fVar.e(), fVar.h(), fVar.d()));
                        bVar2 = fVar2;
                    }
                }
            } else if (obj instanceof b.a) {
                b.a aVar = (b.a) obj;
                aVar.f(fVar);
                bVar2 = aVar;
            } else {
                AdvertisementInfo c = fVar.c();
                b.a aVar2 = new b.a(fVar.b(), new ugp0(fVar.e(), fVar.h(), fVar.d()));
                aVar2.c = c;
                bVar2 = aVar2;
            }
        }
        this.q = bVar2;
        this.r = z4;
        this.s = z5;
        this.t = z6;
        this.u = z7;
        this.v = i2;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("trackProgress=");
        sb.append(this.b);
        sb.append(" playerState=");
        sb.append(this.c);
        sb.append(" playerRefer=");
        sb.append(this.e);
        sb.append(" isShuffleEnabled=");
        sb.append(this.f);
        sb.append(" loopMode=");
        sb.append(this.g);
        sb.append(" numOfPages=");
        sb.append(this.h);
        sb.append(" currentPage=");
        sb.append(this.i);
        sb.append(" isScrollToCurrentTrackAllowed=");
        sb.append(this.j);
        sb.append(" isScrollingPagesState=");
        sb.append(this.k);
        sb.append(" trackInfo=");
        sb.append(this.a);
        sb.append(" lyricsMode=");
        sb.append(this.l);
        sb.append(" lyricsContent=");
        sb.append(this.m);
        sb.append(" lyricsScrollMode=");
        sb.append(this.n);
        sb.append(" playerControlsMode=");
        sb.append(this.o);
        sb.append(" downloadingState=");
        sb.append(this.p);
        sb.append(" playerSkin=");
        sb.append(this.q);
        sb.append(" canAddAudio=");
        sb.append(this.r);
        sb.append(" canDownloadAudio=");
        sb.append(this.s);
        sb.append(" canRemoveAudio=");
        sb.append(this.t);
        sb.append(" dislikeActive=");
        sb.append(this.u);
        sb.append(" color=");
        return vu5.b(sb, this.v, ' ');
    }
}
