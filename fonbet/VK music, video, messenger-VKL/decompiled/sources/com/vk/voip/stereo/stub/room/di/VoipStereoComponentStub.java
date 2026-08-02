package com.vk.voip.stereo.stub.room.di;

import com.vk.di.component.DiScopedComponent;
import com.vk.voip.stereo.api.room.di.VoipStereoComponent;
import kotlin.jvm.internal.PropertyReference1Impl;
import xsna.ap80;
import xsna.c8m;
import xsna.ep;
import xsna.fp;
import xsna.fpf0;
import xsna.g8m;
import xsna.hpf0;
import xsna.jql0;
import xsna.l2x0;
import xsna.nwy;
import xsna.pwj0;
import xsna.qcy;
import xsna.yo80;
import xsna.zo80;

/* compiled from: VoipStereoComponentStub.kt */
/* loaded from: classes7.dex */
public final class VoipStereoComponentStub implements VoipStereoComponent {
    public static final /* synthetic */ qcy<Object>[] b;
    public final nwy a;

    /* compiled from: VoipStereoComponentStub.kt */
    public static final class a implements c8m<VoipStereoComponent, pwj0> {
        @Override // xsna.c8m
        public final DiScopedComponent a(g8m g8mVar, pwj0 pwj0Var) {
            return new VoipStereoComponentStub();
        }
    }

    /* compiled from: VoipStereoComponentStub.kt */
    public static final class b {
    }

    /* compiled from: VoipStereoComponentStub.kt */
    public static final class c {

        /* compiled from: VoipStereoComponentStub.kt */
        public final class a {
        }

        /* compiled from: VoipStereoComponentStub.kt */
        public final class b {
        }
    }

    /* compiled from: VoipStereoComponentStub.kt */
    public static final class d {
    }

    /* compiled from: VoipStereoComponentStub.kt */
    public static final class e implements l2x0 {
    }

    static {
        PropertyReference1Impl propertyReference1Impl = new PropertyReference1Impl(VoipStereoComponentStub.class, "manager", "getManager()Lcom/vk/voip/stereo/api/room/domain/interactor/VoipStereoManager;", 0);
        hpf0 hpf0Var = fpf0.a;
        b = new qcy[]{propertyReference1Impl, fp.c(0, VoipStereoComponentStub.class, "router", "getRouter()Lcom/vk/voip/stereo/api/room/presentation/router/VoipStereoRouter;", hpf0Var), ep.a(0, VoipStereoComponentStub.class, "notificationConfig", "getNotificationConfig()Lcom/vk/voip/stereo/api/room/presentation/service/notifications/VoipStereoNotificationConfig;", hpf0Var), ep.a(0, VoipStereoComponentStub.class, "prodStatHelper", "getProdStatHelper()Lcom/vk/voip/stereo/api/common/analytics/ExternalStereoProdStatHelper;", hpf0Var)};
    }

    public VoipStereoComponentStub() {
        new nwy(new jql0(8));
        this.a = new nwy(new yo80(20));
        new nwy(new zo80(18));
        new nwy(new ap80(21));
    }

    @Override // com.vk.voip.stereo.api.room.di.VoipStereoComponent
    public final l2x0 a() {
        qcy<Object> qcyVar = b[1];
        return (l2x0) this.a.c();
    }
}
