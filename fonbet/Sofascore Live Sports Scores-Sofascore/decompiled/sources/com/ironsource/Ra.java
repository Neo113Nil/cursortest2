package com.ironsource;

import com.ironsource.InterfaceC4193m4;
import com.ironsource.mediationsdk.logger.IronLog;
import defpackage.fn0;
import defpackage.ljg;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public final class Ra {

    @NotNull
    public static final Ra a = new Ra();

    private Ra() {
    }

    @InterfaceC4307sb
    @NotNull
    public final InterfaceC4396xa a(@NotNull C4243p0 c4243p0, @NotNull U2 u2, @NotNull a aVar, @NotNull InterfaceC4414ya interfaceC4414ya, @NotNull L2 l2, @NotNull InterfaceC4193m4 interfaceC4193m4) {
        c4243p0.getClass();
        u2.getClass();
        aVar.getClass();
        interfaceC4414ya.getClass();
        l2.getClass();
        interfaceC4193m4.getClass();
        IronLog.INTERNAL.verbose("Creating banner strategy, isAutoRefreshEnabled: " + aVar.f() + ", refreshInterval: " + aVar.d());
        if (aVar.f()) {
            return new Ba(c4243p0, u2, aVar.d(), aVar.e(), interfaceC4414ya, l2, null, interfaceC4193m4, Ib.v.d().h().z(), 64, null);
        }
        La la = new La(c4243p0, u2, l2);
        la.a(interfaceC4414ya);
        return la;
    }

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    public static final class a {
        private final boolean a;
        private final long b;
        private final long c;

        public a(boolean z, long j, long j2) {
            this.a = z;
            this.b = j;
            this.c = j2;
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

        public boolean equals(@Nullable Object obj) {
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
        /* JADX WARN: Type inference failed for: r0v4 */
        /* JADX WARN: Type inference failed for: r0v5 */
        public int hashCode() {
            boolean z = this.a;
            ?? r0 = z;
            if (z) {
                r0 = 1;
            }
            return Long.hashCode(this.c) + ljg.c(r0 * 31, 31, this.b);
        }

        @NotNull
        public String toString() {
            boolean z = this.a;
            long j = this.b;
            long j2 = this.c;
            StringBuilder sb = new StringBuilder("BannerStrategyConfig(isAutoRefreshEnabled=");
            sb.append(z);
            sb.append(", refreshInterval=");
            sb.append(j);
            return fn0.l(j2, ", visibilityCheckerInterval=", ")", sb);
        }

        @NotNull
        public final a a(boolean z, long j, long j2) {
            return new a(z, j, j2);
        }

        public final boolean a() {
            return this.a;
        }
    }

    public static /* synthetic */ InterfaceC4396xa a(Ra ra, C4243p0 c4243p0, U2 u2, a aVar, InterfaceC4414ya interfaceC4414ya, L2 l2, InterfaceC4193m4 interfaceC4193m4, int i, Object obj) {
        if ((i & 32) != 0) {
            interfaceC4193m4 = new InterfaceC4193m4.a();
        }
        return ra.a(c4243p0, u2, aVar, interfaceC4414ya, l2, interfaceC4193m4);
    }
}
