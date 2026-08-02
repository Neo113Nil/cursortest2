package com.vk.voip.stereo.stub.create.di;

import com.vk.di.component.DiUnscopedComponent;
import kotlin.jvm.internal.PropertyReference1Impl;
import xsna.b7m;
import xsna.e7m;
import xsna.fpf0;
import xsna.nwy;
import xsna.o2a0;
import xsna.qcy;

/* compiled from: VoipStereoCreateRoomRouterComponentStub.kt */
/* loaded from: classes7.dex */
public final class VoipStereoCreateRoomRouterComponentStub implements DiUnscopedComponent {
    public static final /* synthetic */ qcy<Object>[] a;

    /* compiled from: VoipStereoCreateRoomRouterComponentStub.kt */
    public static final class a implements b7m<Object> {
        @Override // xsna.b7m
        public final DiUnscopedComponent a(e7m e7mVar) {
            return new VoipStereoCreateRoomRouterComponentStub();
        }
    }

    /* compiled from: VoipStereoCreateRoomRouterComponentStub.kt */
    public static final class b {
    }

    static {
        PropertyReference1Impl propertyReference1Impl = new PropertyReference1Impl(VoipStereoCreateRoomRouterComponentStub.class, "router", "getRouter()Lcom/vk/voip/stereo/api/create/presentation/router/VoipStereoCreateRoomRouter;", 0);
        fpf0.a.getClass();
        a = new qcy[]{propertyReference1Impl};
    }

    public VoipStereoCreateRoomRouterComponentStub() {
        new nwy(new o2a0(21));
    }
}
