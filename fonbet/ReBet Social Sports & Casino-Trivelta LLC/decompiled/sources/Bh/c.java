package Bh;

import java.util.List;

/* loaded from: classes3.dex */
public final class c extends y {

    /* renamed from: a, reason: collision with root package name */
    public final m f923a;

    /* renamed from: b, reason: collision with root package name */
    public final List f924b;

    /* renamed from: c, reason: collision with root package name */
    public final List f925c;

    /* renamed from: d, reason: collision with root package name */
    public final oh.g f926d;

    /* renamed from: e, reason: collision with root package name */
    public final int f927e;

    /* renamed from: f, reason: collision with root package name */
    public final int f928f;

    /* renamed from: g, reason: collision with root package name */
    public final int f929g;

    /* renamed from: h, reason: collision with root package name */
    public final Ch.d f930h;

    /* renamed from: i, reason: collision with root package name */
    public final String f931i;

    /* renamed from: j, reason: collision with root package name */
    public final long f932j;

    /* renamed from: k, reason: collision with root package name */
    public final boolean f933k;

    public c(m mVar, List list, List list2, oh.g gVar, int i10, int i11, int i12, Ch.d dVar, String str, long j10, boolean z10) {
        if (mVar == null) {
            throw new NullPointerException("Null delegate");
        }
        this.f923a = mVar;
        if (list == null) {
            throw new NullPointerException("Null resolvedLinks");
        }
        this.f924b = list;
        if (list2 == null) {
            throw new NullPointerException("Null resolvedEvents");
        }
        this.f925c = list2;
        if (gVar == null) {
            throw new NullPointerException("Null attributes");
        }
        this.f926d = gVar;
        this.f927e = i10;
        this.f928f = i11;
        this.f929g = i12;
        if (dVar == null) {
            throw new NullPointerException("Null status");
        }
        this.f930h = dVar;
        if (str == null) {
            throw new NullPointerException("Null name");
        }
        this.f931i = str;
        this.f932j = j10;
        this.f933k = z10;
    }

    @Override // Bh.y
    public int A() {
        return this.f929g;
    }

    @Override // Bh.y
    public oh.g b() {
        return this.f926d;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof y) {
            y yVar = (y) obj;
            if (this.f923a.equals(yVar.i()) && this.f924b.equals(yVar.w()) && this.f925c.equals(yVar.v()) && this.f926d.equals(yVar.b()) && this.f927e == yVar.y() && this.f928f == yVar.z() && this.f929g == yVar.A() && this.f930h.equals(yVar.x()) && this.f931i.equals(yVar.u()) && this.f932j == yVar.j() && this.f933k == yVar.t()) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        int hashCode = (((((((((((((((((this.f923a.hashCode() ^ 1000003) * 1000003) ^ this.f924b.hashCode()) * 1000003) ^ this.f925c.hashCode()) * 1000003) ^ this.f926d.hashCode()) * 1000003) ^ this.f927e) * 1000003) ^ this.f928f) * 1000003) ^ this.f929g) * 1000003) ^ this.f930h.hashCode()) * 1000003) ^ this.f931i.hashCode()) * 1000003;
        long j10 = this.f932j;
        return ((hashCode ^ ((int) (j10 ^ (j10 >>> 32)))) * 1000003) ^ (this.f933k ? 1231 : 1237);
    }

    @Override // Bh.y
    public m i() {
        return this.f923a;
    }

    @Override // Bh.y
    public long j() {
        return this.f932j;
    }

    @Override // Bh.y
    public boolean t() {
        return this.f933k;
    }

    @Override // Bh.y
    public String u() {
        return this.f931i;
    }

    @Override // Bh.y
    public List v() {
        return this.f925c;
    }

    @Override // Bh.y
    public List w() {
        return this.f924b;
    }

    @Override // Bh.y
    public Ch.d x() {
        return this.f930h;
    }

    @Override // Bh.y
    public int y() {
        return this.f927e;
    }

    @Override // Bh.y
    public int z() {
        return this.f928f;
    }
}
