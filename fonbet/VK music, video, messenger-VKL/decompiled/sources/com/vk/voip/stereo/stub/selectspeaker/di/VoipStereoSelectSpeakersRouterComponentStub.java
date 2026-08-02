package com.vk.voip.stereo.stub.selectspeaker.di;

import com.vk.di.component.DiUnscopedComponent;
import kotlin.jvm.internal.PropertyReference1Impl;
import xsna.b7m;
import xsna.e7m;
import xsna.fpf0;
import xsna.jzm0;
import xsna.nwy;
import xsna.qcy;

/* compiled from: VoipStereoSelectSpeakersRouterComponentStub.kt */
/* loaded from: classes7.dex */
public final class VoipStereoSelectSpeakersRouterComponentStub implements DiUnscopedComponent {
    public static final /* synthetic */ qcy<Object>[] a;

    /* compiled from: VoipStereoSelectSpeakersRouterComponentStub.kt */
    public static final class a implements b7m<Object> {
        @Override // xsna.b7m
        public final DiUnscopedComponent a(e7m e7mVar) {
            return new VoipStereoSelectSpeakersRouterComponentStub();
        }
    }

    /* compiled from: VoipStereoSelectSpeakersRouterComponentStub.kt */
    public static final class b {
    }

    static {
        PropertyReference1Impl propertyReference1Impl = new PropertyReference1Impl(VoipStereoSelectSpeakersRouterComponentStub.class, "router", "getRouter()Lcom/vk/voip/stereo/api/selectspeaker/presentation/router/VoipStereoSelectSpeakersRouter;", 0);
        fpf0.a.getClass();
        a = new qcy[]{propertyReference1Impl};
    }

    public VoipStereoSelectSpeakersRouterComponentStub() {
        new nwy(new jzm0(12));
    }
}
