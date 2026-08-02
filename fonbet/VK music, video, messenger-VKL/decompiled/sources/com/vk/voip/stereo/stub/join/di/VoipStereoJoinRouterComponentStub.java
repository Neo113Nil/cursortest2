package com.vk.voip.stereo.stub.join.di;

import com.vk.di.component.DiUnscopedComponent;
import kotlin.jvm.internal.PropertyReference1Impl;
import xsna.b7m;
import xsna.e7m;
import xsna.fpf0;
import xsna.nwy;
import xsna.qcy;
import xsna.u3c0;

/* compiled from: VoipStereoJoinRouterComponentStub.kt */
/* loaded from: classes7.dex */
public final class VoipStereoJoinRouterComponentStub implements DiUnscopedComponent {
    public static final /* synthetic */ qcy<Object>[] a;

    /* compiled from: VoipStereoJoinRouterComponentStub.kt */
    public static final class a implements b7m<Object> {
        @Override // xsna.b7m
        public final DiUnscopedComponent a(e7m e7mVar) {
            return new VoipStereoJoinRouterComponentStub();
        }
    }

    /* compiled from: VoipStereoJoinRouterComponentStub.kt */
    public static final class b {
    }

    static {
        PropertyReference1Impl propertyReference1Impl = new PropertyReference1Impl(VoipStereoJoinRouterComponentStub.class, "router", "getRouter()Lcom/vk/voip/stereo/api/join/presentation/router/VoipStereoJoinRouter;", 0);
        fpf0.a.getClass();
        a = new qcy[]{propertyReference1Impl};
    }

    public VoipStereoJoinRouterComponentStub() {
        new nwy(new u3c0(9));
    }
}
