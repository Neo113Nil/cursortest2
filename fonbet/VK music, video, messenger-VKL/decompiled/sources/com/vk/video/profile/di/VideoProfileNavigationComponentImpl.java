package com.vk.video.profile.di;

import com.vk.accountmanager.di.VideoAccountHolderComponent;
import com.vk.di.component.DiScopedComponent;
import com.vk.libvideo.api.di.VideoProfileNavigationComponent;
import kotlin.Lazy;
import kotlin.LazyThreadSafetyMode;
import kotlin.jvm.internal.PropertyReference1Impl;
import xsna.afl0;
import xsna.c8m;
import xsna.fpf0;
import xsna.g8m;
import xsna.j6l0;
import xsna.msy;
import xsna.nwy;
import xsna.p8t0;
import xsna.pwj0;
import xsna.q6s0;
import xsna.qcy;
import xsna.stg0;

/* compiled from: VideoProfileNavigationComponentImpl.kt */
/* loaded from: classes6.dex */
public final class VideoProfileNavigationComponentImpl implements VideoProfileNavigationComponent {
    public static final /* synthetic */ qcy<Object>[] f;
    public final VideoAccountHolderComponent a;
    public final j6l0 b;
    public final Object c;
    public final Object d;
    public final nwy e = new nwy(new stg0(this, 25));

    /* compiled from: VideoProfileNavigationComponentImpl.kt */
    public static final class a implements c8m<VideoProfileNavigationComponent, pwj0> {
        @Override // xsna.c8m
        public final DiScopedComponent a(g8m g8mVar, pwj0 pwj0Var) {
            VideoAccountHolderComponent videoAccountHolderComponent = (VideoAccountHolderComponent) g8mVar.a(fpf0.a(VideoAccountHolderComponent.class));
            j6l0 j6l0Var = new j6l0(g8mVar, 19);
            q6s0 q6s0Var = new q6s0(g8mVar, 6);
            LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
            return new VideoProfileNavigationComponentImpl(videoAccountHolderComponent, j6l0Var, msy.a(lazyThreadSafetyMode, q6s0Var), msy.a(lazyThreadSafetyMode, new afl0(g8mVar, 17)));
        }
    }

    static {
        PropertyReference1Impl propertyReference1Impl = new PropertyReference1Impl(VideoProfileNavigationComponentImpl.class, "profileNavigator", "getProfileNavigator()Lcom/vk/libvideo/api/VideoProfileNavigator;", 0);
        fpf0.a.getClass();
        f = new qcy[]{propertyReference1Impl};
    }

    public VideoProfileNavigationComponentImpl(VideoAccountHolderComponent videoAccountHolderComponent, j6l0 j6l0Var, Lazy lazy, Lazy lazy2) {
        this.a = videoAccountHolderComponent;
        this.b = j6l0Var;
        this.c = lazy;
        this.d = lazy2;
    }

    @Override // com.vk.libvideo.api.di.VideoProfileNavigationComponent
    public final p8t0 q8() {
        qcy<Object> qcyVar = f[0];
        return (p8t0) this.e.c();
    }
}
