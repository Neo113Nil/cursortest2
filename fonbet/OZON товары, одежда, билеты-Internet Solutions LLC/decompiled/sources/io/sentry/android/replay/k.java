package io.sentry.android.replay;

import B3.D;
import java.io.File;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes10.dex */
public final class k {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final File f67593a;

    /* renamed from: b, reason: collision with root package name */
    private final long f67594b;

    /* renamed from: c, reason: collision with root package name */
    private final String f67595c;

    public k(@NotNull File screenshot, long j11, String str) {
        Intrinsics.checkNotNullParameter(screenshot, "screenshot");
        this.f67593a = screenshot;
        this.f67594b = j11;
        this.f67595c = str;
    }

    public final String a() {
        return this.f67595c;
    }

    @NotNull
    public final File b() {
        return this.f67593a;
    }

    public final long c() {
        return this.f67594b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k)) {
            return false;
        }
        k kVar = (k) obj;
        return Intrinsics.d(this.f67593a, kVar.f67593a) && this.f67594b == kVar.f67594b && Intrinsics.d(this.f67595c, kVar.f67595c);
    }

    public final int hashCode() {
        int a11 = Pk0.c.a(this.f67593a.hashCode() * 31, 31, this.f67594b);
        String str = this.f67595c;
        return a11 + (str == null ? 0 : str.hashCode());
    }

    @NotNull
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("ReplayFrame(screenshot=");
        sb2.append(this.f67593a);
        sb2.append(", timestamp=");
        sb2.append(this.f67594b);
        sb2.append(", screen=");
        return D.c(sb2, this.f67595c, ')');
    }
}
