package io.sentry.android.replay;

import java.io.File;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public final File f16025a;

    /* renamed from: b, reason: collision with root package name */
    public final int f16026b;

    /* renamed from: c, reason: collision with root package name */
    public final long f16027c;

    public e(File video, int i5, long j) {
        Intrinsics.checkNotNullParameter(video, "video");
        this.f16025a = video;
        this.f16026b = i5;
        this.f16027c = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        return Intrinsics.areEqual(this.f16025a, eVar.f16025a) && this.f16026b == eVar.f16026b && this.f16027c == eVar.f16027c;
    }

    public final int hashCode() {
        int hashCode = ((this.f16025a.hashCode() * 31) + this.f16026b) * 31;
        long j = this.f16027c;
        return hashCode + ((int) (j ^ (j >>> 32)));
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("GeneratedVideo(video=");
        sb2.append(this.f16025a);
        sb2.append(", frameCount=");
        sb2.append(this.f16026b);
        sb2.append(", duration=");
        return d9.e.j(sb2, this.f16027c, ')');
    }
}
