package com.vk.video.profile.di;

import com.vk.di.component.DiScopedWithParamsComponent;
import kotlin.jvm.internal.PropertyReference1Impl;
import xsna.a9t0;
import xsna.bpn0;
import xsna.fp;
import xsna.fpf0;
import xsna.g8m;
import xsna.gqh0;
import xsna.i8t0;
import xsna.l7t0;
import xsna.l9i;
import xsna.nof0;
import xsna.nwy;
import xsna.o8m;
import xsna.pwj0;
import xsna.qah0;
import xsna.qcy;
import xsna.s8t0;

/* compiled from: VideoProfileComponentImpl.kt */
/* loaded from: classes6.dex */
public final class VideoProfileComponentImpl implements VideoProfileComponent {
    public static final /* synthetic */ qcy<Object>[] e = {new PropertyReference1Impl(VideoProfileComponentImpl.class, "router", "getRouter()Lcom/vk/video/profile/di/VideoProfileRouter;", 0), fp.c(0, VideoProfileComponentImpl.class, "metaBridge", "getMetaBridge()Lcom/vk/video/profile/meta/VideoProfileMetaBridge;", fpf0.a)};
    public final s8t0 a;
    public final bpn0 b;
    public final nwy c = new nwy(new qah0(this, 18));
    public final nwy d = new nwy(new nof0(7));

    /* compiled from: VideoProfileComponentImpl.kt */
    public static final class a implements o8m<VideoProfileComponent, pwj0, l7t0> {
        public final s8t0 a;

        public a(s8t0 s8t0Var) {
            this.a = s8t0Var;
        }

        @Override // xsna.o8m
        public final DiScopedWithParamsComponent a(l9i l9iVar, g8m g8mVar, pwj0 pwj0Var) {
            return new VideoProfileComponentImpl(this.a, new bpn0(new gqh0(g8mVar, 17)));
        }
    }

    public VideoProfileComponentImpl(s8t0 s8t0Var, bpn0 bpn0Var) {
        this.a = s8t0Var;
        this.b = bpn0Var;
    }

    @Override // com.vk.video.profile.di.VideoProfileComponent
    public final i8t0 K4() {
        qcy<Object> qcyVar = e[1];
        return (i8t0) this.d.c();
    }

    @Override // com.vk.video.profile.di.VideoProfileComponent
    public final a9t0 a() {
        qcy<Object> qcyVar = e[0];
        return (a9t0) this.c.c();
    }

    @Override // com.vk.video.profile.di.VideoProfileComponent
    public final i8t0 d8() {
        qcy<Object> qcyVar = e[1];
        return (i8t0) this.d.c();
    }
}
