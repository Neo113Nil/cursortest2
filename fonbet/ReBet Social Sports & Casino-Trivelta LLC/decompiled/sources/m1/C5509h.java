package m1;

import e1.AbstractC4134a;

/* renamed from: m1.h, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5509h {

    /* renamed from: a, reason: collision with root package name */
    public final String f56211a;

    /* renamed from: b, reason: collision with root package name */
    public final androidx.media3.common.a f56212b;

    /* renamed from: c, reason: collision with root package name */
    public final androidx.media3.common.a f56213c;

    /* renamed from: d, reason: collision with root package name */
    public final int f56214d;

    /* renamed from: e, reason: collision with root package name */
    public final int f56215e;

    public C5509h(String str, androidx.media3.common.a aVar, androidx.media3.common.a aVar2, int i10, int i11) {
        AbstractC4134a.a(i10 == 0 || i11 == 0);
        this.f56211a = AbstractC4134a.d(str);
        this.f56212b = (androidx.media3.common.a) AbstractC4134a.e(aVar);
        this.f56213c = (androidx.media3.common.a) AbstractC4134a.e(aVar2);
        this.f56214d = i10;
        this.f56215e = i11;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C5509h.class == obj.getClass()) {
            C5509h c5509h = (C5509h) obj;
            if (this.f56214d == c5509h.f56214d && this.f56215e == c5509h.f56215e && this.f56211a.equals(c5509h.f56211a) && this.f56212b.equals(c5509h.f56212b) && this.f56213c.equals(c5509h.f56213c)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return ((((((((527 + this.f56214d) * 31) + this.f56215e) * 31) + this.f56211a.hashCode()) * 31) + this.f56212b.hashCode()) * 31) + this.f56213c.hashCode();
    }
}
