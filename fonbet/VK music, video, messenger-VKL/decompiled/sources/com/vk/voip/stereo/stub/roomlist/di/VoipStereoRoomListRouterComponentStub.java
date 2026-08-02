package com.vk.voip.stereo.stub.roomlist.di;

import com.vk.di.component.DiUnscopedComponent;
import kotlin.jvm.internal.PropertyReference1Impl;
import xsna.b7m;
import xsna.c2c0;
import xsna.e7m;
import xsna.fpf0;
import xsna.nwy;
import xsna.qcy;

/* compiled from: VoipStereoRoomListRouterComponentStub.kt */
/* loaded from: classes7.dex */
public final class VoipStereoRoomListRouterComponentStub implements DiUnscopedComponent {
    public static final /* synthetic */ qcy<Object>[] a;

    /* compiled from: VoipStereoRoomListRouterComponentStub.kt */
    public static final class a implements b7m<Object> {
        @Override // xsna.b7m
        public final DiUnscopedComponent a(e7m e7mVar) {
            return new VoipStereoRoomListRouterComponentStub();
        }
    }

    /* compiled from: VoipStereoRoomListRouterComponentStub.kt */
    public static final class b {
    }

    static {
        PropertyReference1Impl propertyReference1Impl = new PropertyReference1Impl(VoipStereoRoomListRouterComponentStub.class, "router", "getRouter()Lcom/vk/voip/stereo/api/roomlist/router/VoipStereoRoomListRouter;", 0);
        fpf0.a.getClass();
        a = new qcy[]{propertyReference1Impl};
    }

    public VoipStereoRoomListRouterComponentStub() {
        new nwy(new c2c0(18));
    }
}
