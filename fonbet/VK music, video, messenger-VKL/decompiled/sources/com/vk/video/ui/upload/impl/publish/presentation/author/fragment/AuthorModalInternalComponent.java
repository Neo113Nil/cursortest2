package com.vk.video.ui.upload.impl.publish.presentation.author.fragment;

import com.vk.bridges.di.BridgeComponent;
import com.vk.di.component.DiScopedComponent;
import com.vk.video.channel.common.di.VideoChannelComponent;
import kotlin.jvm.internal.PropertyReference1Impl;
import xsna.cj4;
import xsna.dc5;
import xsna.ep;
import xsna.fp;
import xsna.fpf0;
import xsna.hpf0;
import xsna.in0;
import xsna.nwy;
import xsna.qcy;
import xsna.ry0;
import xsna.s4;
import xsna.xu0;

/* compiled from: AuthorModalInternalComponent.kt */
/* loaded from: classes7.dex */
public final class AuthorModalInternalComponent implements DiScopedComponent<dc5> {
    public static final a i;
    public static final /* synthetic */ qcy<Object>[] j;
    public final dc5 a;
    public final VideoChannelComponent b;
    public final BridgeComponent c;
    public final nwy d = new nwy(new xu0(2));
    public final nwy e = new nwy(new s4(this, 7));
    public final nwy f = new nwy(new ry0(this, 4));
    public final nwy g = new nwy(new cj4(1));
    public final nwy h = new nwy(new in0(this, 4));

    /* compiled from: AuthorModalInternalComponent.kt */
    public static final class a {
    }

    static {
        PropertyReference1Impl propertyReference1Impl = new PropertyReference1Impl(AuthorModalInternalComponent.class, "videoBridge", "getVideoBridge()Lcom/vk/bridges/VideoBridge;", 0);
        hpf0 hpf0Var = fpf0.a;
        j = new qcy[]{propertyReference1Impl, fp.c(0, AuthorModalInternalComponent.class, "videoFeaturesRepository", "getVideoFeaturesRepository()Lcom/vk/libvideo/api/features/VideoFeaturesRepository;", hpf0Var), ep.a(0, AuthorModalInternalComponent.class, "hintsManager", "getHintsManager()Lcom/vk/hints/api/HintsManager;", hpf0Var), ep.a(0, AuthorModalInternalComponent.class, "publishSharedPrefs", "getPublishSharedPrefs()Lcom/vk/video/ui/upload/impl/publish/domain/repository/PublishSharedPrefs;", hpf0Var), ep.a(0, AuthorModalInternalComponent.class, "videoChannelLauncher", "getVideoChannelLauncher()Lcom/vk/video/channel/common/VideoChannelLauncher;", hpf0Var)};
        i = new a();
    }

    public AuthorModalInternalComponent(dc5 dc5Var, VideoChannelComponent videoChannelComponent, BridgeComponent bridgeComponent) {
        this.a = dc5Var;
        this.b = videoChannelComponent;
        this.c = bridgeComponent;
    }
}
