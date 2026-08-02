package io.sentry.android.core.performance;

import android.os.SystemClock;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class g implements Comparable {

    /* renamed from: a, reason: collision with root package name */
    public String f15812a;

    /* renamed from: b, reason: collision with root package name */
    public long f15813b;

    /* renamed from: c, reason: collision with root package name */
    public long f15814c;

    /* renamed from: d, reason: collision with root package name */
    public long f15815d;

    public final long a() {
        long j = this.f15815d;
        if (j != 0) {
            return j - this.f15814c;
        }
        return 0L;
    }

    public final boolean b() {
        return this.f15814c != 0;
    }

    public final void c(long j) {
        this.f15814c = j;
        this.f15813b = System.currentTimeMillis() - (SystemClock.uptimeMillis() - this.f15814c);
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return Long.compare(this.f15813b, ((g) obj).f15813b);
    }
}
