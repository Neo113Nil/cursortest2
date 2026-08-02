package X;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class f {

    /* renamed from: c, reason: collision with root package name */
    public float f13353c;

    /* renamed from: d, reason: collision with root package name */
    public float f13354d;

    /* renamed from: e, reason: collision with root package name */
    public float f13355e;

    /* renamed from: f, reason: collision with root package name */
    public float f13356f;

    /* renamed from: g, reason: collision with root package name */
    public float f13357g;

    /* renamed from: a, reason: collision with root package name */
    public float f13351a = 1.0f;

    /* renamed from: b, reason: collision with root package name */
    public float f13352b = 1.0f;

    /* renamed from: h, reason: collision with root package name */
    public float f13358h = 8.0f;

    /* renamed from: i, reason: collision with root package name */
    public long f13359i = N.q.f7849a.a();

    public final void a(f other) {
        Intrinsics.checkNotNullParameter(other, "other");
        this.f13351a = other.f13351a;
        this.f13352b = other.f13352b;
        this.f13353c = other.f13353c;
        this.f13354d = other.f13354d;
        this.f13355e = other.f13355e;
        this.f13356f = other.f13356f;
        this.f13357g = other.f13357g;
        this.f13358h = other.f13358h;
        this.f13359i = other.f13359i;
    }

    public final boolean b(f other) {
        Intrinsics.checkNotNullParameter(other, "other");
        return this.f13351a == other.f13351a && this.f13352b == other.f13352b && this.f13353c == other.f13353c && this.f13354d == other.f13354d && this.f13355e == other.f13355e && this.f13356f == other.f13356f && this.f13357g == other.f13357g && this.f13358h == other.f13358h && N.q.c(this.f13359i, other.f13359i);
    }
}
