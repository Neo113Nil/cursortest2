package com.vk.video.ui.smartcrop.impl.presentation.fragment;

import com.vk.di.component.DiScopedComponent;
import kotlin.jvm.internal.PropertyReference1Impl;
import xsna.bbb0;
import xsna.daz;
import xsna.ep;
import xsna.fp;
import xsna.fpf0;
import xsna.hpf0;
import xsna.j4k0;
import xsna.ku70;
import xsna.nwy;
import xsna.qbc0;
import xsna.qcy;
import xsna.uv80;

/* compiled from: SmartCropFragmentInternalComponent.kt */
/* loaded from: classes7.dex */
public final class SmartCropFragmentInternalComponent implements DiScopedComponent<j4k0> {
    public static final a g;
    public static final /* synthetic */ qcy<Object>[] h;
    public final j4k0 a;
    public final nwy b = new nwy(new qbc0(this, 14));
    public final nwy c = new nwy(new ku70(10));
    public final nwy d = new nwy(new daz(20));
    public final nwy e = new nwy(new bbb0(this, 20));
    public final nwy f = new nwy(new uv80(6));

    /* compiled from: SmartCropFragmentInternalComponent.kt */
    public static final class a {
    }

    static {
        PropertyReference1Impl propertyReference1Impl = new PropertyReference1Impl(SmartCropFragmentInternalComponent.class, "repository", "getRepository()Lcom/vk/video/ui/smartcrop/impl/domain/repository/SmartCropRepository;", 0);
        hpf0 hpf0Var = fpf0.a;
        h = new qcy[]{propertyReference1Impl, fp.c(0, SmartCropFragmentInternalComponent.class, "playerFactory", "getPlayerFactory()Lcom/vk/media/player/PlayerFactory;", hpf0Var), ep.a(0, SmartCropFragmentInternalComponent.class, "networkManager", "getNetworkManager()Lcom/vk/core/utils/newtork/NetworkManager;", hpf0Var), ep.a(0, SmartCropFragmentInternalComponent.class, "viewStateMapper", "getViewStateMapper()Lcom/vk/video/ui/smartcrop/impl/presentation/feature/store/SmartCropViewStateMapper;", hpf0Var), ep.a(0, SmartCropFragmentInternalComponent.class, "videoBridge", "getVideoBridge()Lcom/vk/bridges/VideoBridge;", hpf0Var)};
        g = new a();
    }

    public SmartCropFragmentInternalComponent(j4k0 j4k0Var) {
        this.a = j4k0Var;
    }
}
