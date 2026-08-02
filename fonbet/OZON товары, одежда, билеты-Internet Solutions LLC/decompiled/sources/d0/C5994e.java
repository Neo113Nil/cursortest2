package d0;

/* renamed from: d0.e, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
final class C5994e extends X {

    /* renamed from: e, reason: collision with root package name */
    private final int f60905e;

    /* renamed from: f, reason: collision with root package name */
    private final int f60906f;

    /* renamed from: g, reason: collision with root package name */
    private final int f60907g;

    C5994e(int i11, int i12, int i13) {
        this.f60905e = i11;
        this.f60906f = i12;
        this.f60907g = i13;
    }

    @Override // d0.X
    public final int a() {
        return this.f60907g;
    }

    @Override // d0.X
    public final int b() {
        return this.f60905e;
    }

    @Override // d0.X
    public final int c() {
        return this.f60906f;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof X)) {
            return false;
        }
        X x11 = (X) obj;
        return this.f60905e == x11.b() && this.f60906f == x11.c() && this.f60907g == x11.a();
    }

    public final int hashCode() {
        return this.f60907g ^ ((((this.f60905e ^ 1000003) * 1000003) ^ this.f60906f) * 1000003);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("VideoEncoderDataSpace{standard=");
        sb2.append(this.f60905e);
        sb2.append(", transfer=");
        sb2.append(this.f60906f);
        sb2.append(", range=");
        return K00.b.e(this.f60907g, "}", sb2);
    }
}
