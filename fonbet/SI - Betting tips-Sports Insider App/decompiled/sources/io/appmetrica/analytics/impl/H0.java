package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.internal.CounterConfigurationReporterType;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class H0 {

    /* renamed from: a, reason: collision with root package name */
    public final String f12293a;

    /* renamed from: b, reason: collision with root package name */
    public final String f12294b;

    /* renamed from: c, reason: collision with root package name */
    public final CounterConfigurationReporterType f12295c;

    /* renamed from: d, reason: collision with root package name */
    public final int f12296d;

    /* renamed from: e, reason: collision with root package name */
    public final String f12297e;

    /* renamed from: f, reason: collision with root package name */
    public final String f12298f;

    public H0(String str, String str2, CounterConfigurationReporterType counterConfigurationReporterType, int i5, String str3, String str4) {
        this.f12293a = str;
        this.f12294b = str2;
        this.f12295c = counterConfigurationReporterType;
        this.f12296d = i5;
        this.f12297e = str3;
        this.f12298f = str4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof H0)) {
            return false;
        }
        H0 h02 = (H0) obj;
        return Intrinsics.areEqual(this.f12293a, h02.f12293a) && Intrinsics.areEqual(this.f12294b, h02.f12294b) && this.f12295c == h02.f12295c && this.f12296d == h02.f12296d && Intrinsics.areEqual(this.f12297e, h02.f12297e) && Intrinsics.areEqual(this.f12298f, h02.f12298f);
    }

    public final int hashCode() {
        int j = r4.k.j((this.f12296d + ((this.f12295c.hashCode() + r4.k.j(this.f12293a.hashCode() * 31, 31, this.f12294b)) * 31)) * 31, 31, this.f12297e);
        String str = this.f12298f;
        return j + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("AppMetricaNativeCrashMetadata(apiKey=");
        sb2.append(this.f12293a);
        sb2.append(", packageName=");
        sb2.append(this.f12294b);
        sb2.append(", reporterType=");
        sb2.append(this.f12295c);
        sb2.append(", processID=");
        sb2.append(this.f12296d);
        sb2.append(", processSessionID=");
        sb2.append(this.f12297e);
        sb2.append(", errorEnvironment=");
        return d9.e.k(sb2, this.f12298f, ')');
    }
}
