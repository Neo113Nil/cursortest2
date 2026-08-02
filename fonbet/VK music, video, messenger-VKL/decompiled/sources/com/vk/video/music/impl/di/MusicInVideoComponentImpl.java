package com.vk.video.music.impl.di;

import com.vk.bridges.di.AuthBridgeComponent;
import com.vk.di.component.DiScopedComponent;
import com.vk.libvideo.api.di.VideoKidsComponent;
import com.vk.video.music.api.di.MusicInVideoComponent;
import kotlin.jvm.internal.PropertyReference1Impl;
import xsna.c8m;
import xsna.fp;
import xsna.fpf0;
import xsna.g8m;
import xsna.jsf0;
import xsna.n1;
import xsna.nwy;
import xsna.nxs0;
import xsna.pwj0;
import xsna.qcy;
import xsna.xsw;

/* compiled from: MusicInVideoComponentImpl.kt */
/* loaded from: classes6.dex */
public final class MusicInVideoComponentImpl implements MusicInVideoComponent {
    public static final /* synthetic */ qcy<Object>[] e = {new PropertyReference1Impl(MusicInVideoComponentImpl.class, "relatedMusicInVideoInteractor", "getRelatedMusicInVideoInteractor()Lcom/vk/video/music/api/domain/RelatedMusicInVideoInteractor;", 0), fp.c(0, MusicInVideoComponentImpl.class, "videoMusicMixInteractor", "getVideoMusicMixInteractor()Lcom/vk/video/music/api/domain/VideoMusicMixInteractor;", fpf0.a)};
    public final VideoKidsComponent a;
    public final AuthBridgeComponent b;
    public final nwy c = new nwy(new xsw(this, 12));
    public final nwy d = new nwy(new n1(25));

    /* compiled from: MusicInVideoComponentImpl.kt */
    public static final class a implements c8m<MusicInVideoComponent, pwj0> {
        @Override // xsna.c8m
        public final DiScopedComponent a(g8m g8mVar, pwj0 pwj0Var) {
            return new MusicInVideoComponentImpl((VideoKidsComponent) g8mVar.a(fpf0.a(VideoKidsComponent.class)), (AuthBridgeComponent) g8mVar.a(fpf0.a(AuthBridgeComponent.class)));
        }
    }

    public MusicInVideoComponentImpl(VideoKidsComponent videoKidsComponent, AuthBridgeComponent authBridgeComponent) {
        this.a = videoKidsComponent;
        this.b = authBridgeComponent;
    }

    @Override // com.vk.video.music.api.di.MusicInVideoComponent
    public final nxs0 T0() {
        qcy<Object> qcyVar = e[1];
        return (nxs0) this.d.c();
    }

    @Override // com.vk.video.music.api.di.MusicInVideoComponent
    public final jsf0 pb() {
        qcy<Object> qcyVar = e[0];
        return (jsf0) this.c.c();
    }
}
