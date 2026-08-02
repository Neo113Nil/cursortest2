package io.sentry.android.replay;

import java.io.File;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public final File f51454a;

    /* renamed from: b, reason: collision with root package name */
    public final int f51455b;

    /* renamed from: c, reason: collision with root package name */
    public final long f51456c;

    public c(File video, int i10, long j10) {
        Intrinsics.checkNotNullParameter(video, "video");
        this.f51454a = video;
        this.f51455b = i10;
        this.f51456c = j10;
    }

    public final File a() {
        return this.f51454a;
    }

    public final int b() {
        return this.f51455b;
    }

    public final long c() {
        return this.f51456c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return Intrinsics.areEqual(this.f51454a, cVar.f51454a) && this.f51455b == cVar.f51455b && this.f51456c == cVar.f51456c;
    }

    public int hashCode() {
        return (((this.f51454a.hashCode() * 31) + Integer.hashCode(this.f51455b)) * 31) + Long.hashCode(this.f51456c);
    }

    public String toString() {
        return "GeneratedVideo(video=" + this.f51454a + ", frameCount=" + this.f51455b + ", duration=" + this.f51456c + ')';
    }
}
