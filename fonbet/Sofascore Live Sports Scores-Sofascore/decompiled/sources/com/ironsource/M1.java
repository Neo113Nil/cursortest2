package com.ironsource;

import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.utils.IronSourceUtils;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public class M1 implements InterfaceC4107h7 {

    @NotNull
    private final B7 a;

    @Nullable
    private N1 b;

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    public static final class a {
        @NotNull
        public final N1 a(@Nullable K1 k1, @NotNull B7 b7) {
            b7.getClass();
            IronLog ironLog = IronLog.INTERNAL;
            ironLog.verbose("isAndroidxApplicationLifecycleAvailable: " + b7.a());
            ironLog.verbose("isAndroidxApplicationLifecycleEnabled: " + (k1 != null ? Boolean.valueOf(k1.l()) : null));
            boolean z = false;
            if (b7.a()) {
                C4078fe.i().a(new C4355v5(EnumC4373w5.TROUBLESHOOTING_ANDROIDX_PROCESS_LIFECYCLE_OWNER_AVAILABLE, IronSourceUtils.b(false)));
            }
            if ((k1 != null ? k1.l() : false) && b7.a()) {
                z = true;
            }
            ironLog.verbose("isAndroidxEnabled: " + z);
            return z ? new C4351v1() : new Q7();
        }
    }

    public M1(@NotNull B7 b7) {
        b7.getClass();
        this.a = b7;
    }

    @Override // com.ironsource.InterfaceC4107h7
    public void a(@Nullable K1 k1) {
        if (this.b == null) {
            this.b = new a().a(k1, this.a);
        }
    }

    @Override // com.ironsource.N1
    public void b(@NotNull InterfaceC4128ia interfaceC4128ia) {
        interfaceC4128ia.getClass();
        N1 n1 = this.b;
        if (n1 != null) {
            n1.b(interfaceC4128ia);
        }
    }

    @Override // com.ironsource.N1
    public void a(@NotNull InterfaceC4128ia interfaceC4128ia) {
        interfaceC4128ia.getClass();
        N1 n1 = this.b;
        if (n1 != null) {
            n1.a(interfaceC4128ia);
        }
    }
}
