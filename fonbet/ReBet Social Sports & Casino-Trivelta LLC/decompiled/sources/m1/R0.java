package m1;

import androidx.media3.exoplayer.source.D;
import e1.AbstractC4134a;
import java.util.Objects;

/* loaded from: classes.dex */
public final class R0 {

    /* renamed from: a, reason: collision with root package name */
    public final D.b f56123a;

    /* renamed from: b, reason: collision with root package name */
    public final long f56124b;

    /* renamed from: c, reason: collision with root package name */
    public final long f56125c;

    /* renamed from: d, reason: collision with root package name */
    public final long f56126d;

    /* renamed from: e, reason: collision with root package name */
    public final long f56127e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f56128f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f56129g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f56130h;

    /* renamed from: i, reason: collision with root package name */
    public final boolean f56131i;

    /* renamed from: j, reason: collision with root package name */
    public final boolean f56132j;

    public R0(D.b bVar, long j10, long j11, long j12, long j13, boolean z10, boolean z11, boolean z12, boolean z13, boolean z14) {
        boolean z15 = true;
        AbstractC4134a.a(!z14 || z12);
        AbstractC4134a.a(!z13 || z12);
        if (z11 && (z12 || z13 || z14)) {
            z15 = false;
        }
        AbstractC4134a.a(z15);
        this.f56123a = bVar;
        this.f56124b = j10;
        this.f56125c = j11;
        this.f56126d = j12;
        this.f56127e = j13;
        this.f56128f = z10;
        this.f56129g = z11;
        this.f56130h = z12;
        this.f56131i = z13;
        this.f56132j = z14;
    }

    public R0 a(long j10) {
        return j10 == this.f56125c ? this : new R0(this.f56123a, this.f56124b, j10, this.f56126d, this.f56127e, this.f56128f, this.f56129g, this.f56130h, this.f56131i, this.f56132j);
    }

    public R0 b(long j10) {
        return j10 == this.f56124b ? this : new R0(this.f56123a, j10, this.f56125c, this.f56126d, this.f56127e, this.f56128f, this.f56129g, this.f56130h, this.f56131i, this.f56132j);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && R0.class == obj.getClass()) {
            R0 r02 = (R0) obj;
            if (this.f56124b == r02.f56124b && this.f56125c == r02.f56125c && this.f56126d == r02.f56126d && this.f56127e == r02.f56127e && this.f56128f == r02.f56128f && this.f56129g == r02.f56129g && this.f56130h == r02.f56130h && this.f56131i == r02.f56131i && this.f56132j == r02.f56132j && Objects.equals(this.f56123a, r02.f56123a)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return ((((((((((((((((((527 + this.f56123a.hashCode()) * 31) + ((int) this.f56124b)) * 31) + ((int) this.f56125c)) * 31) + ((int) this.f56126d)) * 31) + ((int) this.f56127e)) * 31) + (this.f56128f ? 1 : 0)) * 31) + (this.f56129g ? 1 : 0)) * 31) + (this.f56130h ? 1 : 0)) * 31) + (this.f56131i ? 1 : 0)) * 31) + (this.f56132j ? 1 : 0);
    }
}
