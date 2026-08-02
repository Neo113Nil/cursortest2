package com.ironsource;

import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.utils.IronSourceUtils;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public class O1 implements InterfaceC2505k7 {
    private final E7 a;
    private P1 b;

    public static final class a {
        public final P1 a(M1 m1, E7 featureAvailabilityService) {
            Intrinsics.checkNotNullParameter(featureAvailabilityService, "featureAvailabilityService");
            IronLog ironLog = IronLog.INTERNAL;
            ironLog.verbose("isAndroidxApplicationLifecycleAvailable: " + featureAvailabilityService.a());
            ironLog.verbose("isAndroidxApplicationLifecycleEnabled: " + (m1 != null ? Boolean.valueOf(m1.k()) : null));
            boolean z = false;
            if (featureAvailabilityService.a()) {
                C2441ge.i().a(new C2736x5(EnumC2754y5.TROUBLESHOOTING_ANDROIDX_PROCESS_LIFECYCLE_OWNER_AVAILABLE, IronSourceUtils.b(false)));
            }
            if ((m1 != null ? m1.k() : false) && featureAvailabilityService.a()) {
                z = true;
            }
            ironLog.verbose("isAndroidxEnabled: " + z);
            return z ? new C2732x1() : new S7();
        }
    }

    public O1(E7 featureAvailabilityService) {
        Intrinsics.checkNotNullParameter(featureAvailabilityService, "featureAvailabilityService");
        this.a = featureAvailabilityService;
    }

    @Override // com.ironsource.InterfaceC2505k7
    public void a(M1 m1) {
        if (this.b == null) {
            this.b = new a().a(m1, this.a);
        }
    }

    @Override // com.ironsource.P1
    public void b(InterfaceC2473ia observer) {
        Intrinsics.checkNotNullParameter(observer, "observer");
        P1 p1 = this.b;
        if (p1 != null) {
            p1.b(observer);
        }
    }

    @Override // com.ironsource.P1
    public void a(InterfaceC2473ia observer) {
        Intrinsics.checkNotNullParameter(observer, "observer");
        P1 p1 = this.b;
        if (p1 != null) {
            p1.a(observer);
        }
    }
}
