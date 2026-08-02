package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.ndkcrashesapi.internal.NativeCrashSource;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class G0 {

    /* renamed from: a, reason: collision with root package name */
    public final NativeCrashSource f12245a;

    /* renamed from: b, reason: collision with root package name */
    public final String f12246b;

    /* renamed from: c, reason: collision with root package name */
    public final String f12247c;

    /* renamed from: d, reason: collision with root package name */
    public final String f12248d;

    /* renamed from: e, reason: collision with root package name */
    public final long f12249e;

    /* renamed from: f, reason: collision with root package name */
    public final H0 f12250f;

    public G0(NativeCrashSource nativeCrashSource, String str, String str2, String str3, long j, H0 h02) {
        this.f12245a = nativeCrashSource;
        this.f12246b = str;
        this.f12247c = str2;
        this.f12248d = str3;
        this.f12249e = j;
        this.f12250f = h02;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof G0)) {
            return false;
        }
        G0 g02 = (G0) obj;
        return this.f12245a == g02.f12245a && Intrinsics.areEqual(this.f12246b, g02.f12246b) && Intrinsics.areEqual(this.f12247c, g02.f12247c) && Intrinsics.areEqual(this.f12248d, g02.f12248d) && this.f12249e == g02.f12249e && Intrinsics.areEqual(this.f12250f, g02.f12250f);
    }

    public final int hashCode() {
        int j = r4.k.j(r4.k.j(r4.k.j(this.f12245a.hashCode() * 31, 31, this.f12246b), 31, this.f12247c), 31, this.f12248d);
        long j6 = this.f12249e;
        return this.f12250f.hashCode() + ((((int) (j6 ^ (j6 >>> 32))) + j) * 31);
    }

    public final String toString() {
        return "AppMetricaNativeCrash(source=" + this.f12245a + ", handlerVersion=" + this.f12246b + ", uuid=" + this.f12247c + ", dumpFile=" + this.f12248d + ", creationTime=" + this.f12249e + ", metadata=" + this.f12250f + ')';
    }
}
