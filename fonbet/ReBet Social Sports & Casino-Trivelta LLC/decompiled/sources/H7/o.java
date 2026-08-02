package H7;

/* loaded from: classes2.dex */
public class o implements p {

    /* renamed from: d, reason: collision with root package name */
    public static final p f4868d = d(Integer.MAX_VALUE, true, true);

    /* renamed from: a, reason: collision with root package name */
    public int f4869a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f4870b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f4871c;

    public o(int i10, boolean z10, boolean z11) {
        this.f4869a = i10;
        this.f4870b = z10;
        this.f4871c = z11;
    }

    public static p d(int i10, boolean z10, boolean z11) {
        return new o(i10, z10, z11);
    }

    @Override // H7.p
    public boolean a() {
        return this.f4871c;
    }

    @Override // H7.p
    public boolean b() {
        return this.f4870b;
    }

    @Override // H7.p
    public int c() {
        return this.f4869a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof o)) {
            return false;
        }
        o oVar = (o) obj;
        return this.f4869a == oVar.f4869a && this.f4870b == oVar.f4870b && this.f4871c == oVar.f4871c;
    }

    public int hashCode() {
        return (this.f4869a ^ (this.f4870b ? 4194304 : 0)) ^ (this.f4871c ? 8388608 : 0);
    }
}
