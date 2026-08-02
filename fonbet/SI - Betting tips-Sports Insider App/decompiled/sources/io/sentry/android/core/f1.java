package io.sentry.android.core;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class f1 implements Comparable {

    /* renamed from: a, reason: collision with root package name */
    public final long f15576a;

    /* renamed from: b, reason: collision with root package name */
    public final long f15577b;

    /* renamed from: c, reason: collision with root package name */
    public final long f15578c;

    /* renamed from: d, reason: collision with root package name */
    public final long f15579d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f15580e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f15581f;

    /* renamed from: g, reason: collision with root package name */
    public final long f15582g;

    public f1(long j) {
        this(j, j, 0L, 0L, false, false, 0L);
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return Long.compare(this.f15577b, ((f1) obj).f15577b);
    }

    public f1(long j, long j6, long j10, long j11, boolean z5, boolean z7, long j12) {
        this.f15576a = j;
        this.f15577b = j6;
        this.f15578c = j10;
        this.f15579d = j11;
        this.f15580e = z5;
        this.f15581f = z7;
        this.f15582g = j12;
    }
}
