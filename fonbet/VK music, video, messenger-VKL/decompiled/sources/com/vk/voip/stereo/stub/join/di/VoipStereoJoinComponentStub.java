package com.vk.voip.stereo.stub.join.di;

import com.vk.di.component.DiUnscopedComponent;
import kotlin.jvm.internal.PropertyReference1Impl;
import xsna.b7m;
import xsna.e7m;
import xsna.fpf0;
import xsna.jkg0;
import xsna.nwy;
import xsna.qcy;

/* compiled from: VoipStereoJoinComponentStub.kt */
/* loaded from: classes7.dex */
public final class VoipStereoJoinComponentStub implements DiUnscopedComponent {
    public static final /* synthetic */ qcy<Object>[] a;

    /* compiled from: VoipStereoJoinComponentStub.kt */
    public static final class a implements b7m<Object> {
        @Override // xsna.b7m
        public final DiUnscopedComponent a(e7m e7mVar) {
            return new VoipStereoJoinComponentStub();
        }
    }

    /* compiled from: VoipStereoJoinComponentStub.kt */
    public static final class b {
    }

    static {
        PropertyReference1Impl propertyReference1Impl = new PropertyReference1Impl(VoipStereoJoinComponentStub.class, "joinUseCaseProvider", "getJoinUseCaseProvider()Lcom/vk/voip/stereo/api/join/domain/usecase/VoipStereoJoinUseCaseProvider;", 0);
        fpf0.a.getClass();
        a = new qcy[]{propertyReference1Impl};
    }

    public VoipStereoJoinComponentStub() {
        new nwy(new jkg0(12));
    }
}
