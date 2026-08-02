package io.sentry.android.replay;

import java.io.File;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class k {

    /* renamed from: a, reason: collision with root package name */
    public final File f16061a;

    /* renamed from: b, reason: collision with root package name */
    public final long f16062b;

    /* renamed from: c, reason: collision with root package name */
    public final String f16063c;

    public k(File screenshot, long j, String str) {
        Intrinsics.checkNotNullParameter(screenshot, "screenshot");
        this.f16061a = screenshot;
        this.f16062b = j;
        this.f16063c = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k)) {
            return false;
        }
        k kVar = (k) obj;
        return Intrinsics.areEqual(this.f16061a, kVar.f16061a) && this.f16062b == kVar.f16062b && Intrinsics.areEqual(this.f16063c, kVar.f16063c);
    }

    public final int hashCode() {
        int hashCode = this.f16061a.hashCode() * 31;
        long j = this.f16062b;
        int i5 = (hashCode + ((int) (j ^ (j >>> 32)))) * 31;
        String str = this.f16063c;
        return i5 + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("ReplayFrame(screenshot=");
        sb2.append(this.f16061a);
        sb2.append(", timestamp=");
        sb2.append(this.f16062b);
        sb2.append(", screen=");
        return d9.e.k(sb2, this.f16063c, ')');
    }
}
