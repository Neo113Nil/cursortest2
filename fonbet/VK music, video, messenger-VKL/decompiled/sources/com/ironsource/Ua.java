package com.ironsource;

import com.ironsource.mediationsdk.logger.IronLog;
import xsna.bh10;
import xsna.e630;

/* loaded from: classes13.dex */
public final class Ua {
    public static final Ua a = new Ua();

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
        /* JADX WARN: Type inference failed for: r0v4 */
        /* JADX WARN: Type inference failed for: r0v5 */
        public int hashCode() {
            boolean z = this.a;
            ?? r0 = z;
            if (z) {
                r0 = 1;
            }
            return Long.hashCode(this.c) + bh10.a(r0 * 31, 31, this.b);
        }

        public String toString() {
            boolean z = this.a;
            long j = this.b;
            long j2 = this.c;
            StringBuilder sb = new StringBuilder("BannerStrategyConfig(isAutoRefreshEnabled=");
            sb.append(z);
            sb.append(", refreshInterval=");
            sb.append(j);
            return e630.c(sb, ", visibilityCheckerInterval=", j2, ")");
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

    private Ua() {
    }

    public final InterfaceC4655ya a(C4484p0 c4484p0, W2 w2, a aVar, J2 j2, InterfaceC4673za interfaceC4673za, N2 n2, InterfaceC4488p4 interfaceC4488p4) {
        IronLog.INTERNAL.verbose("Creating banner strategy, isAutoRefreshEnabled: " + aVar.f() + ", refreshInterval: " + aVar.d());
        if (aVar.f()) {
            return new Ca(c4484p0, w2, aVar.d(), aVar.e(), j2, interfaceC4673za, n2, null, interfaceC4488p4, Kb.u.d().h().y(), 128, null);
        }
        Oa oa = new Oa(c4484p0, w2, n2);
        oa.a(interfaceC4673za);
        return oa;
    }
}
