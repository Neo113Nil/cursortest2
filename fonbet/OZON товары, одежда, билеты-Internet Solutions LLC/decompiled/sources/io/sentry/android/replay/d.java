package io.sentry.android.replay;

import B0.C2454a;
import java.io.File;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes10.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final File f67552a;

    /* renamed from: b, reason: collision with root package name */
    private final int f67553b;

    /* renamed from: c, reason: collision with root package name */
    private final long f67554c;

    public d(@NotNull File video, int i11, long j11) {
        Intrinsics.checkNotNullParameter(video, "video");
        this.f67552a = video;
        this.f67553b = i11;
        this.f67554c = j11;
    }

    @NotNull
    public final File a() {
        return this.f67552a;
    }

    public final int b() {
        return this.f67553b;
    }

    public final long c() {
        return this.f67554c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return Intrinsics.d(this.f67552a, dVar.f67552a) && this.f67553b == dVar.f67553b && this.f67554c == dVar.f67554c;
    }

    public final int hashCode() {
        return Long.hashCode(this.f67554c) + C2454a.a(this.f67553b, this.f67552a.hashCode() * 31, 31);
    }

    @NotNull
    public final String toString() {
        return "GeneratedVideo(video=" + this.f67552a + ", frameCount=" + this.f67553b + ", duration=" + this.f67554c + ')';
    }
}
