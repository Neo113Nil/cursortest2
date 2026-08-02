package com.vk.music.podcast.impl.di;

import com.vk.bridges.di.AuthBridgeComponent;
import com.vk.di.component.DiScopedComponent;
import com.vk.music.offline.api.di.OfflineAudioComponent;
import com.vk.music.podcast.api.di.PodcastComponent;
import kotlin.jvm.internal.PropertyReference1Impl;
import xsna.c8m;
import xsna.dgb0;
import xsna.ep;
import xsna.fp;
import xsna.fpf0;
import xsna.g8m;
import xsna.ho4;
import xsna.hpf0;
import xsna.nwy;
import xsna.phb0;
import xsna.pwj0;
import xsna.qcy;
import xsna.shb0;
import xsna.u35;
import xsna.v0f;
import xsna.w0f;

/* compiled from: PodcastComponentImpl.kt */
/* loaded from: classes.dex */
public final class PodcastComponentImpl implements PodcastComponent {
    public static final /* synthetic */ qcy<Object>[] g;
    public final AuthBridgeComponent a;
    public final OfflineAudioComponent b;
    public final nwy c = new nwy(new ho4(this, 4));
    public final nwy d = new nwy(new v0f(7));
    public final nwy e = new nwy(new u35(11));
    public final nwy f = new nwy(new w0f(9));

    /* compiled from: PodcastComponentImpl.kt */
    public static final class a implements c8m<PodcastComponent, pwj0> {
        @Override // xsna.c8m
        public final DiScopedComponent a(g8m g8mVar, pwj0 pwj0Var) {
            return new PodcastComponentImpl((AuthBridgeComponent) g8mVar.a(fpf0.a(AuthBridgeComponent.class)), (OfflineAudioComponent) g8mVar.a(fpf0.a(OfflineAudioComponent.class)));
        }
    }

    static {
        PropertyReference1Impl propertyReference1Impl = new PropertyReference1Impl(PodcastComponentImpl.class, "podcastInteractor", "getPodcastInteractor()Lcom/vk/music/podcast/api/domain/PodcastInteractor;", 0);
        hpf0 hpf0Var = fpf0.a;
        g = new qcy[]{propertyReference1Impl, fp.c(0, PodcastComponentImpl.class, "podcastLauncher", "getPodcastLauncher()Lcom/vk/music/podcast/api/PodcastLauncher;", hpf0Var), ep.a(0, PodcastComponentImpl.class, "podcastViewHolderFactory", "getPodcastViewHolderFactory()Lcom/vk/music/podcast/api/di/PodcastViewHolderFactory;", hpf0Var), ep.a(0, PodcastComponentImpl.class, "podcastAvailableMenuItems", "getPodcastAvailableMenuItems()Lcom/vk/music/podcast/api/menu/PodcastAvailableMenuItems;", hpf0Var)};
    }

    public PodcastComponentImpl(AuthBridgeComponent authBridgeComponent, OfflineAudioComponent offlineAudioComponent) {
        this.a = authBridgeComponent;
        this.b = offlineAudioComponent;
    }

    @Override // com.vk.music.podcast.api.di.PodcastComponent
    public final dgb0 O0() {
        qcy<Object> qcyVar = g[3];
        return (dgb0) this.f.c();
    }

    @Override // com.vk.music.podcast.api.di.PodcastComponent
    public final com.vk.music.podcast.api.di.a cf() {
        qcy<Object> qcyVar = g[2];
        return (com.vk.music.podcast.api.di.a) this.e.c();
    }

    @Override // com.vk.music.podcast.api.di.PodcastComponent
    public final shb0 t5() {
        qcy<Object> qcyVar = g[1];
        return (shb0) this.d.c();
    }

    @Override // com.vk.music.podcast.api.di.PodcastComponent
    public final phb0 x2() {
        qcy<Object> qcyVar = g[0];
        return (phb0) this.c.c();
    }
}
