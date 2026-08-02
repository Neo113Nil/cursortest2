package com.vk.music.player.analytics.impl.tracker.di;

import com.vk.bridges.di.AuthBridgeComponent;
import com.vk.music.api.di.MusicPlaybackQueueComponent;
import com.vk.music.offline.api.di.OfflineAudioComponent;
import com.vk.music.player.analytics.api.di.PlayerAnalyticsComponent;
import kotlin.jvm.internal.PropertyReference1Impl;
import xsna.ca50;
import xsna.cs4;
import xsna.dv40;
import xsna.ep;
import xsna.ewy;
import xsna.ex40;
import xsna.fp;
import xsna.fpf0;
import xsna.hg;
import xsna.hpf0;
import xsna.ig;
import xsna.iwa0;
import xsna.jg;
import xsna.kg;
import xsna.lg;
import xsna.mg;
import xsna.ml40;
import xsna.nwy;
import xsna.qcy;
import xsna.qx40;
import xsna.r05;
import xsna.sva0;
import xsna.uw1;
import xsna.x2b0;

/* compiled from: AbstractPlayerAnalyticsComponent.kt */
/* loaded from: classes3.dex */
public abstract class AbstractPlayerAnalyticsComponent implements PlayerAnalyticsComponent {
    public static final /* synthetic */ qcy<Object>[] g;
    public final ewy a;
    public final nwy c;
    public final nwy d;
    public final nwy b = new nwy(new ig(0));
    public final nwy e = new nwy(new lg(0));
    public final ewy f = new ewy(new mg(0));

    static {
        PropertyReference1Impl propertyReference1Impl = new PropertyReference1Impl(AbstractPlayerAnalyticsComponent.class, "musicPlaybackAnalyticsTracker", "getMusicPlaybackAnalyticsTracker()Lcom/vk/music/player/analytics/api/tracker/MusicPlaybackAnalyticsTracker;", 0);
        hpf0 hpf0Var = fpf0.a;
        g = new qcy[]{propertyReference1Impl, fp.c(0, AbstractPlayerAnalyticsComponent.class, "musicTimespentTracker", "getMusicTimespentTracker()Lcom/vk/music/player/analytics/api/timespent/MusicTimespentTracker;", hpf0Var), ep.a(0, AbstractPlayerAnalyticsComponent.class, "audiobookChapterProgressTracker", "getAudiobookChapterProgressTracker()Lcom/vk/music/player/analytics/api/tracker/audiobook/AudiobookChapterProgressTracker;", hpf0Var), ep.a(0, AbstractPlayerAnalyticsComponent.class, "playbackAnalyticsBuffer", "getPlaybackAnalyticsBuffer()Lcom/vk/music/analytics/api/buffer/AnalyticsBuffer;", hpf0Var), ep.a(0, AbstractPlayerAnalyticsComponent.class, "playerNavigationAnalyticsTracker", "getPlayerNavigationAnalyticsTracker()Lcom/vk/music/player/analytics/api/tracker/navigation/PlayerNavigationAnalyticsTracker;", hpf0Var), ep.a(0, AbstractPlayerAnalyticsComponent.class, "audioPixelTracker", "getAudioPixelTracker()Lcom/vk/music/player/analytics/api/tracker/AudioPixelTracker;", hpf0Var)};
    }

    public AbstractPlayerAnalyticsComponent(MusicPlaybackQueueComponent musicPlaybackQueueComponent, OfflineAudioComponent offlineAudioComponent, AuthBridgeComponent authBridgeComponent) {
        this.a = new ewy(new hg(offlineAudioComponent, 0));
        this.c = new nwy(new jg(musicPlaybackQueueComponent, offlineAudioComponent, authBridgeComponent, 0));
        this.d = new nwy(new kg(0, musicPlaybackQueueComponent, offlineAudioComponent));
    }

    @Override // com.vk.music.player.analytics.api.di.PlayerAnalyticsComponent
    public final qx40 D0(boolean z, ex40 ex40Var, uw1 uw1Var) {
        return new sva0(z, ex40Var, uw1Var);
    }

    @Override // com.vk.music.player.analytics.api.di.PlayerAnalyticsComponent
    public final dv40 Ec(boolean z) {
        return new ml40(z);
    }

    @Override // com.vk.music.player.analytics.api.di.PlayerAnalyticsComponent
    public final cs4 Xe() {
        qcy<Object> qcyVar = g[5];
        return (cs4) this.f.c();
    }

    @Override // com.vk.music.player.analytics.api.di.PlayerAnalyticsComponent
    public final ca50 a1() {
        qcy<Object> qcyVar = g[1];
        return (ca50) this.b.c();
    }

    @Override // com.vk.music.player.analytics.api.di.PlayerAnalyticsComponent
    public final r05 c2() {
        qcy<Object> qcyVar = g[2];
        return (r05) this.c.c();
    }

    @Override // com.vk.music.player.analytics.api.di.PlayerAnalyticsComponent
    public final uw1<iwa0> he() {
        qcy<Object> qcyVar = g[3];
        return (uw1) this.d.c();
    }

    @Override // com.vk.music.player.analytics.api.di.PlayerAnalyticsComponent
    public final dv40 mb() {
        qcy<Object> qcyVar = g[0];
        return (dv40) this.a.c();
    }

    @Override // com.vk.music.player.analytics.api.di.PlayerAnalyticsComponent
    public final x2b0 z7() {
        qcy<Object> qcyVar = g[4];
        return (x2b0) this.e.c();
    }
}
