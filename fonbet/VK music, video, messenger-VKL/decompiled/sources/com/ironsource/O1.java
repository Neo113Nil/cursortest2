package com.ironsource;

import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.utils.IronSourceUtils;

/* loaded from: classes13.dex */
public class O1 implements InterfaceC4419l7 {
    private final F7 a;
    private P1 b;

    public static final class a {
        public final P1 a(M1 m1, F7 f7) {
            IronLog ironLog = IronLog.INTERNAL;
            ironLog.verbose("isAndroidxApplicationLifecycleAvailable: " + f7.a());
            ironLog.verbose("isAndroidxApplicationLifecycleEnabled: " + (m1 != null ? Boolean.valueOf(m1.k()) : null));
            boolean z = false;
            if (f7.a()) {
                C4337ge.i().a(new C4632x5(EnumC4650y5.TROUBLESHOOTING_ANDROIDX_PROCESS_LIFECYCLE_OWNER_AVAILABLE, IronSourceUtils.b(false)));
            }
            if ((m1 != null ? m1.k() : false) && f7.a()) {
                z = true;
            }
            ironLog.verbose("isAndroidxEnabled: " + z);
            return z ? new C4628x1() : new T7();
        }
    }

    public O1(F7 f7) {
        this.a = f7;
    }

    @Override // com.ironsource.InterfaceC4419l7
    public void a(M1 m1) {
        if (this.b == null) {
            this.b = new a().a(m1, this.a);
        }
    }

    @Override // com.ironsource.P1
    public void b(InterfaceC4386ja interfaceC4386ja) {
        P1 p1 = this.b;
        if (p1 != null) {
            p1.b(interfaceC4386ja);
        }
    }

    @Override // com.ironsource.P1
    public void a(InterfaceC4386ja interfaceC4386ja) {
        P1 p1 = this.b;
        if (p1 != null) {
            p1.a(interfaceC4386ja);
        }
    }
}
