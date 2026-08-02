package com.vk.voip.stereo.stub.common.di;

import com.vk.di.component.DiScopedComponent;
import com.vk.voip.stereo.api.common.di.VoipStereoRouterComponent;
import kotlin.jvm.internal.PropertyReference1Impl;
import xsna.c8m;
import xsna.fpf0;
import xsna.g8m;
import xsna.j2x0;
import xsna.k2x0;
import xsna.l2x0;
import xsna.nwy;
import xsna.pwj0;
import xsna.qcy;
import xsna.xa3;

/* compiled from: VoipStereoRouterComponentStub.kt */
/* loaded from: classes11.dex */
public final class VoipStereoRouterComponentStub implements VoipStereoRouterComponent {
    public static final /* synthetic */ qcy<Object>[] b;
    public final nwy a = new nwy(new xa3(17));

    /* compiled from: VoipStereoRouterComponentStub.kt */
    public static final class a implements c8m<VoipStereoRouterComponent, pwj0> {
        @Override // xsna.c8m
        public final DiScopedComponent a(g8m g8mVar, pwj0 pwj0Var) {
            return new VoipStereoRouterComponentStub();
        }
    }

    /* compiled from: VoipStereoRouterComponentStub.kt */
    public static final class b implements k2x0 {
        public final a a = new a();
        public final d b = new d();

        /* compiled from: VoipStereoRouterComponentStub.kt */
        public static final class a implements j2x0 {
        }

        /* compiled from: VoipStereoRouterComponentStub.kt */
        /* renamed from: com.vk.voip.stereo.stub.common.di.VoipStereoRouterComponentStub$b$b, reason: collision with other inner class name */
        public static final class C2006b {
        }

        /* compiled from: VoipStereoRouterComponentStub.kt */
        public static final class c {
        }

        /* compiled from: VoipStereoRouterComponentStub.kt */
        public static final class d {
        }

        /* compiled from: VoipStereoRouterComponentStub.kt */
        public static final class e implements l2x0 {
        }

        /* compiled from: VoipStereoRouterComponentStub.kt */
        public static final class f {
        }

        /* compiled from: VoipStereoRouterComponentStub.kt */
        public static final class g {
        }

        @Override // xsna.k2x0
        public final a a() {
            return this.a;
        }

        @Override // xsna.k2x0
        public final d c0() {
            return this.b;
        }
    }

    static {
        PropertyReference1Impl propertyReference1Impl = new PropertyReference1Impl(VoipStereoRouterComponentStub.class, "router", "getRouter()Lcom/vk/voip/stereo/api/common/presentation/router/VoipStereoCommonRouter;", 0);
        fpf0.a.getClass();
        b = new qcy[]{propertyReference1Impl};
    }

    @Override // com.vk.voip.stereo.api.common.di.VoipStereoRouterComponent
    public final k2x0 a() {
        qcy<Object> qcyVar = b[0];
        return (k2x0) this.a.c();
    }
}
