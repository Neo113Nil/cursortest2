package b1;

import android.view.Surface;
import e1.AbstractC4134a;

/* renamed from: b1.N, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2345N {

    /* renamed from: a, reason: collision with root package name */
    public final Surface f24340a;

    /* renamed from: b, reason: collision with root package name */
    public final int f24341b;

    /* renamed from: c, reason: collision with root package name */
    public final int f24342c;

    /* renamed from: d, reason: collision with root package name */
    public final int f24343d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f24344e;

    public C2345N(Surface surface, int i10, int i11) {
        this(surface, i10, i11, 0);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2345N)) {
            return false;
        }
        C2345N c2345n = (C2345N) obj;
        return this.f24341b == c2345n.f24341b && this.f24342c == c2345n.f24342c && this.f24343d == c2345n.f24343d && this.f24344e == c2345n.f24344e && this.f24340a.equals(c2345n.f24340a);
    }

    public int hashCode() {
        return (((((((this.f24340a.hashCode() * 31) + this.f24341b) * 31) + this.f24342c) * 31) + this.f24343d) * 31) + (this.f24344e ? 1 : 0);
    }

    public C2345N(Surface surface, int i10, int i11, int i12) {
        this(surface, i10, i11, i12, false);
    }

    public C2345N(Surface surface, int i10, int i11, int i12, boolean z10) {
        AbstractC4134a.b(i12 == 0 || i12 == 90 || i12 == 180 || i12 == 270, "orientationDegrees must be 0, 90, 180, or 270");
        this.f24340a = surface;
        this.f24341b = i10;
        this.f24342c = i11;
        this.f24343d = i12;
        this.f24344e = z10;
    }
}
