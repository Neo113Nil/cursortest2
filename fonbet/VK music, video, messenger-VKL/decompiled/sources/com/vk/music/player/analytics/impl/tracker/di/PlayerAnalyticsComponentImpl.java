package com.vk.music.player.analytics.impl.tracker.di;

import com.vk.bridges.di.AuthBridgeComponent;
import com.vk.di.component.DiScopedComponent;
import com.vk.music.api.di.MusicPlaybackQueueComponent;
import com.vk.music.offline.api.di.OfflineAudioComponent;
import com.vk.music.player.analytics.api.di.PlayerAnalyticsComponent;
import kotlin.jvm.internal.PropertyReference1Impl;
import xsna.c6;
import xsna.c8m;
import xsna.fpf0;
import xsna.g8m;
import xsna.nn40;
import xsna.nwy;
import xsna.pwj0;
import xsna.qcy;

/* compiled from: PlayerAnalyticsComponentImpl.kt */
/* loaded from: classes3.dex */
public final class PlayerAnalyticsComponentImpl extends AbstractPlayerAnalyticsComponent {
    public static final /* synthetic */ qcy<Object>[] i;
    public final nwy h;

    /* compiled from: PlayerAnalyticsComponentImpl.kt */
    public static final class a implements c8m<PlayerAnalyticsComponent, pwj0> {
        @Override // xsna.c8m
        public final DiScopedComponent a(g8m g8mVar, pwj0 pwj0Var) {
            return new PlayerAnalyticsComponentImpl((MusicPlaybackQueueComponent) g8mVar.a(fpf0.a(MusicPlaybackQueueComponent.class)), (OfflineAudioComponent) g8mVar.a(fpf0.a(OfflineAudioComponent.class)), (AuthBridgeComponent) g8mVar.a(fpf0.a(AuthBridgeComponent.class)));
        }
    }

    static {
        PropertyReference1Impl propertyReference1Impl = new PropertyReference1Impl(PlayerAnalyticsComponentImpl.class, "musicMediaScopeService", "getMusicMediaScopeService()Lcom/vk/music/player/analytics/api/mediascope/MusicMediaScopeService;", 0);
        fpf0.a.getClass();
        i = new qcy[]{propertyReference1Impl};
    }

    public PlayerAnalyticsComponentImpl(MusicPlaybackQueueComponent musicPlaybackQueueComponent, OfflineAudioComponent offlineAudioComponent, AuthBridgeComponent authBridgeComponent) {
        super(musicPlaybackQueueComponent, offlineAudioComponent, authBridgeComponent);
        this.h = new nwy(new c6(22));
    }

    @Override // com.vk.music.player.analytics.api.di.PlayerAnalyticsComponent
    public final nn40 Ia() {
        qcy<Object> qcyVar = i[0];
        return (nn40) this.h.c();
    }
}
