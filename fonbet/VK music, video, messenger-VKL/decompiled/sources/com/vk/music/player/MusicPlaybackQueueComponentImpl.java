package com.vk.music.player;

import com.vk.di.component.DiScopedComponent;
import com.vk.musc.kidsmode.api.di.MusicKidsModeComponent;
import com.vk.music.api.di.MusicPlaybackQueueComponent;
import com.vk.music.mix.MixSettingsComponent;
import kotlin.jvm.internal.PropertyReference1Impl;
import xsna.atm;
import xsna.b010;
import xsna.btm;
import xsna.c8m;
import xsna.ep;
import xsna.fp;
import xsna.fpf0;
import xsna.g8m;
import xsna.hpf0;
import xsna.kg;
import xsna.khz;
import xsna.m1o;
import xsna.nwy;
import xsna.nxa0;
import xsna.p05;
import xsna.pwj0;
import xsna.qcy;

/* compiled from: MusicPlaybackQueueComponentImpl.kt */
/* loaded from: classes3.dex */
public final class MusicPlaybackQueueComponentImpl implements MusicPlaybackQueueComponent {
    public static final /* synthetic */ qcy<Object>[] f;
    public final nwy a;
    public final nwy c;
    public final nwy b = new nwy(new atm(this, 25));
    public final nwy d = new nwy(new btm(this, 26));
    public final nwy e = new nwy(new b010(this, 10));

    /* compiled from: MusicPlaybackQueueComponentImpl.kt */
    public static final class a implements c8m<MusicPlaybackQueueComponent, pwj0> {
        @Override // xsna.c8m
        public final DiScopedComponent a(g8m g8mVar, pwj0 pwj0Var) {
            return new MusicPlaybackQueueComponentImpl((MixSettingsComponent) g8mVar.a(fpf0.a(MixSettingsComponent.class)), (MusicKidsModeComponent) g8mVar.a(fpf0.a(MusicKidsModeComponent.class)));
        }
    }

    static {
        PropertyReference1Impl propertyReference1Impl = new PropertyReference1Impl(MusicPlaybackQueueComponentImpl.class, "playbackCacheController", "getPlaybackCacheController()Lcom/vk/music/player/playback/cache/PlaybackQueueCacheController;", 0);
        hpf0 hpf0Var = fpf0.a;
        f = new qcy[]{propertyReference1Impl, fp.c(0, MusicPlaybackQueueComponentImpl.class, "listeningTimeCacheRepository", "getListeningTimeCacheRepository()Lcom/vk/music/player/playback/cache/ListeningTimeCacheRepository;", hpf0Var), ep.a(0, MusicPlaybackQueueComponentImpl.class, "playbackQueueDatabaseHelper", "getPlaybackQueueDatabaseHelper()Lcom/vk/music/player/playback/database/PlaybackQueueDatabaseHelper;", hpf0Var), ep.a(0, MusicPlaybackQueueComponentImpl.class, "audiobookChapterProgressRepository", "getAudiobookChapterProgressRepository()Lcom/vk/music/player/playback/cache/AudiobookChapterProgressRepository;", hpf0Var), ep.a(0, MusicPlaybackQueueComponentImpl.class, "playbackQueueCacheRepository", "getPlaybackQueueCacheRepository()Lcom/vk/music/player/playback/cache/PlaybackQueueCacheRepository;", hpf0Var)};
    }

    public MusicPlaybackQueueComponentImpl(MixSettingsComponent mixSettingsComponent, MusicKidsModeComponent musicKidsModeComponent) {
        this.a = new nwy(new kg(18, mixSettingsComponent, this));
        this.c = new nwy(new m1o(musicKidsModeComponent, 27));
    }

    @Override // com.vk.music.api.di.MusicPlaybackQueueComponent
    public final p05 P2() {
        qcy<Object> qcyVar = f[3];
        return (p05) this.d.c();
    }

    @Override // com.vk.music.api.di.MusicPlaybackQueueComponent
    public final khz e4() {
        qcy<Object> qcyVar = f[1];
        return (khz) this.b.c();
    }

    @Override // com.vk.music.api.di.MusicPlaybackQueueComponent
    public final nxa0 za() {
        qcy<Object> qcyVar = f[0];
        return (nxa0) this.a.c();
    }
}
