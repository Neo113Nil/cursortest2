package com.vk.voip.stereo.stub.create.di;

import com.vk.di.component.DiUnscopedComponent;
import kotlin.jvm.internal.PropertyReference1Impl;
import xsna.b7m;
import xsna.dgc0;
import xsna.e7m;
import xsna.ep;
import xsna.fp;
import xsna.fpf0;
import xsna.gzr0;
import xsna.hpf0;
import xsna.nwy;
import xsna.qcy;
import xsna.s7c0;

/* compiled from: VoipStereoCreateRoomComponentStub.kt */
/* loaded from: classes7.dex */
public final class VoipStereoCreateRoomComponentStub implements DiUnscopedComponent {
    public static final /* synthetic */ qcy<Object>[] a;

    /* compiled from: VoipStereoCreateRoomComponentStub.kt */
    public static final class a implements b7m<Object> {
        @Override // xsna.b7m
        public final DiUnscopedComponent a(e7m e7mVar) {
            return new VoipStereoCreateRoomComponentStub();
        }
    }

    /* compiled from: VoipStereoCreateRoomComponentStub.kt */
    public static final class b {
    }

    /* compiled from: VoipStereoCreateRoomComponentStub.kt */
    public static final class c {
    }

    /* compiled from: VoipStereoCreateRoomComponentStub.kt */
    public static final class d {
    }

    static {
        PropertyReference1Impl propertyReference1Impl = new PropertyReference1Impl(VoipStereoCreateRoomComponentStub.class, "createRoomUseCaseProvider", "getCreateRoomUseCaseProvider()Lcom/vk/voip/stereo/api/create/domain/usecase/VoipStereoCreateRoomUseCaseProvider;", 0);
        hpf0 hpf0Var = fpf0.a;
        a = new qcy[]{propertyReference1Impl, fp.c(0, VoipStereoCreateRoomComponentStub.class, "coverEditorUseCaseProvider", "getCoverEditorUseCaseProvider()Lcom/vk/voip/stereo/api/create/domain/usecase/VoipStereoCoverEditorUseCaseProvider;", hpf0Var), ep.a(0, VoipStereoCreateRoomComponentStub.class, "privacyRepositoryUseCaseProvider", "getPrivacyRepositoryUseCaseProvider()Lcom/vk/voip/stereo/api/create/domain/usecase/VoipStereoPrivacyUseCaseProvider;", hpf0Var)};
    }

    public VoipStereoCreateRoomComponentStub() {
        new nwy(new dgc0(18));
        new nwy(new gzr0(6));
        new nwy(new s7c0(20));
    }
}
