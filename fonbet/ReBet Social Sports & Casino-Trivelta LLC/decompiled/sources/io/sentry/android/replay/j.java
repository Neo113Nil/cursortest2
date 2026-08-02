package io.sentry.android.replay;

import java.io.File;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class j {

    /* renamed from: a, reason: collision with root package name */
    public final File f51638a;

    /* renamed from: b, reason: collision with root package name */
    public final long f51639b;

    /* renamed from: c, reason: collision with root package name */
    public final String f51640c;

    public j(File screenshot, long j10, String str) {
        Intrinsics.checkNotNullParameter(screenshot, "screenshot");
        this.f51638a = screenshot;
        this.f51639b = j10;
        this.f51640c = str;
    }

    public final String a() {
        return this.f51640c;
    }

    public final File b() {
        return this.f51638a;
    }

    public final long c() {
        return this.f51639b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j)) {
            return false;
        }
        j jVar = (j) obj;
        return Intrinsics.areEqual(this.f51638a, jVar.f51638a) && this.f51639b == jVar.f51639b && Intrinsics.areEqual(this.f51640c, jVar.f51640c);
    }

    public int hashCode() {
        int hashCode = ((this.f51638a.hashCode() * 31) + Long.hashCode(this.f51639b)) * 31;
        String str = this.f51640c;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    public String toString() {
        return "ReplayFrame(screenshot=" + this.f51638a + ", timestamp=" + this.f51639b + ", screen=" + this.f51640c + ')';
    }
}
