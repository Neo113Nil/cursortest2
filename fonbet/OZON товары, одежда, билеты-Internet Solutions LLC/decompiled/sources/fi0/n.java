package fi0;

import Kk.C3532b;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes7.dex */
public final class n {

    /* renamed from: a, reason: collision with root package name */
    private final boolean f63498a;

    /* renamed from: b, reason: collision with root package name */
    private final boolean f63499b;

    /* renamed from: c, reason: collision with root package name */
    private final boolean f63500c;

    public n() {
        this(false, 15);
    }

    public final boolean a() {
        return this.f63498a;
    }

    public final boolean b() {
        return this.f63499b;
    }

    public final boolean c() {
        return this.f63500c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n)) {
            return false;
        }
        n nVar = (n) obj;
        return this.f63498a == nVar.f63498a && this.f63499b == nVar.f63499b && this.f63500c == nVar.f63500c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f63500c) + C3532b.a(C3532b.a(Boolean.hashCode(this.f63498a) * 31, 31, this.f63499b), 31, false);
    }

    @NotNull
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("PerformanceTracingSettings(isEnabled=");
        sb2.append(this.f63498a);
        sb2.append(", isEnabledInLowPowerMode=");
        sb2.append(this.f63499b);
        sb2.append(", isSendLowPowerMode=false, isV3PerfAnalyticEnabled=");
        return Pk0.a.a(")", sb2, this.f63500c);
    }

    public n(boolean z11, int i11) {
        z11 = (i11 & 1) != 0 ? false : z11;
        boolean z12 = (i11 & 2) != 0;
        boolean z13 = (i11 & 8) == 0;
        this.f63498a = z11;
        this.f63499b = z12;
        this.f63500c = z13;
    }
}
