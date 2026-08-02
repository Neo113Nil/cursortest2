package com.vk.voip.stereo.stub.selectspeaker.di;

import com.vk.di.component.DiUnscopedComponent;
import kotlin.jvm.internal.PropertyReference1Impl;
import xsna.b7m;
import xsna.e7m;
import xsna.fpf0;
import xsna.nwy;
import xsna.qcy;
import xsna.uh80;

/* compiled from: VoipStereoSelectSpeakersComponentStub.kt */
/* loaded from: classes7.dex */
public final class VoipStereoSelectSpeakersComponentStub implements DiUnscopedComponent {
    public static final /* synthetic */ qcy<Object>[] a;

    /* compiled from: VoipStereoSelectSpeakersComponentStub.kt */
    public static final class a implements b7m<Object> {
        @Override // xsna.b7m
        public final DiUnscopedComponent a(e7m e7mVar) {
            return new VoipStereoSelectSpeakersComponentStub();
        }
    }

    /* compiled from: VoipStereoSelectSpeakersComponentStub.kt */
    public static final class b {
    }

    static {
        PropertyReference1Impl propertyReference1Impl = new PropertyReference1Impl(VoipStereoSelectSpeakersComponentStub.class, "selectSpeakersUseCaseProvider", "getSelectSpeakersUseCaseProvider()Lcom/vk/voip/stereo/api/selectspeaker/domain/usecase/VoipStereoSelectSpeakersUseCaseProvider;", 0);
        fpf0.a.getClass();
        a = new qcy[]{propertyReference1Impl};
    }

    public VoipStereoSelectSpeakersComponentStub() {
        new nwy(new uh80(17));
    }
}
