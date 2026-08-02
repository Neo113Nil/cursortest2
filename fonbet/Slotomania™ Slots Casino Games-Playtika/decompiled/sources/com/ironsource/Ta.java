package com.ironsource;

import com.ironsource.mediationsdk.logger.IronLog;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class Ta {
    public static final Ta a = new Ta();

    public static final class a {
        private final boolean a;
        private final long b;
        private final long c;

        public a(boolean z, long j, long j2) {
            this.a = z;
            this.b = j;
            this.c = j2;
        }

        public final boolean a() {
            return this.a;
        }

        public final long b() {
            return this.b;
        }

        public final long c() {
            return this.c;
        }

        public final long d() {
            return this.b;
        }

        public final long e() {
            return this.c;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.a == aVar.a && this.b == aVar.b && this.c == aVar.c;
        }

        public final boolean f() {
            return this.a;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r0v1, types: [int] */
        /* JADX WARN: Type inference failed for: r0v6 */
        /* JADX WARN: Type inference failed for: r0v7 */
        public int hashCode() {
            boolean z = this.a;
            ?? r0 = z;
            if (z) {
                r0 = 1;
            }
            return (((r0 * 31) + Long.hashCode(this.b)) * 31) + Long.hashCode(this.c);
        }

        public String toString() {
            return "BannerStrategyConfig(isAutoRefreshEnabled=" + this.a + ", refreshInterval=" + this.b + ", visibilityCheckerInterval=" + this.c + ")";
        }

        public final a a(boolean z, long j, long j2) {
            return new a(z, j, j2);
        }

        public static /* synthetic */ a a(a aVar, boolean z, long j, long j2, int i, Object obj) {
            if ((i & 1) != 0) {
                z = aVar.a;
            }
            if ((i & 2) != 0) {
                j = aVar.b;
            }
            if ((i & 4) != 0) {
                j2 = aVar.c;
            }
            return aVar.a(z, j, j2);
        }
    }

    private Ta() {
    }

    public final InterfaceC2741xa a(C2588p0 adTools, W2 bannerContainer, a config, J2 bannerAdProperties, InterfaceC2759ya strategyListener, N2 bannerAdUnitFactory, InterfaceC2592p4 timeProvider) {
        Intrinsics.checkNotNullParameter(adTools, "adTools");
        Intrinsics.checkNotNullParameter(bannerContainer, "bannerContainer");
        Intrinsics.checkNotNullParameter(config, "config");
        Intrinsics.checkNotNullParameter(bannerAdProperties, "bannerAdProperties");
        Intrinsics.checkNotNullParameter(strategyListener, "strategyListener");
        Intrinsics.checkNotNullParameter(bannerAdUnitFactory, "bannerAdUnitFactory");
        Intrinsics.checkNotNullParameter(timeProvider, "timeProvider");
        IronLog.INTERNAL.verbose("Creating banner strategy, isAutoRefreshEnabled: " + config.f() + ", refreshInterval: " + config.d());
        if (config.f()) {
            return new Ba(adTools, bannerContainer, config.d(), config.e(), bannerAdProperties, strategyListener, bannerAdUnitFactory, null, timeProvider, Jb.u.d().h().y(), 128, null);
        }
        Na na = new Na(adTools, bannerContainer, bannerAdUnitFactory);
        na.a(strategyListener);
        return na;
    }
}
