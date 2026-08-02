package ru.ozon.android.messenger.framework.analytics;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes10.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    private final String f86582a;

    /* renamed from: b, reason: collision with root package name */
    private final String f86583b;

    /* renamed from: c, reason: collision with root package name */
    private final String f86584c;

    /* renamed from: d, reason: collision with root package name */
    private final long f86585d;

    /* renamed from: e, reason: collision with root package name */
    private final long f86586e;

    public f(String str, String str2, long j11, String str3, long j12) {
        this.f86582a = str;
        this.f86583b = str2;
        this.f86584c = str3;
        this.f86585d = j11;
        this.f86586e = j12;
    }

    public final long a() {
        return this.f86586e;
    }

    public final String b() {
        return this.f86584c;
    }

    public final String c() {
        return this.f86582a;
    }

    public final String d() {
        return this.f86583b;
    }

    public final long e() {
        return this.f86585d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        return Intrinsics.d(this.f86582a, fVar.f86582a) && Intrinsics.d(this.f86583b, fVar.f86583b) && Intrinsics.d(this.f86584c, fVar.f86584c) && this.f86585d == fVar.f86585d && this.f86586e == fVar.f86586e;
    }

    public final int hashCode() {
        String str = this.f86582a;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f86583b;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f86584c;
        return Long.hashCode(this.f86586e) + Pk0.c.a((hashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31, 31, this.f86585d);
    }

    @NotNull
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("MessengerPerfMetricInfo(pageName=");
        sb2.append(this.f86582a);
        sb2.append(", pageUrl=");
        sb2.append(this.f86583b);
        sb2.append(", metricsKey=");
        sb2.append(this.f86584c);
        sb2.append(", startTime=");
        sb2.append(this.f86585d);
        sb2.append(", endTime=");
        return P4.f.a(this.f86586e, ")", sb2);
    }
}
