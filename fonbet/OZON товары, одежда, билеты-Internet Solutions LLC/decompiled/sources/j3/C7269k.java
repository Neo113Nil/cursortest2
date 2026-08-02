package j3;

/* renamed from: j3.k, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C7269k {

    /* renamed from: d, reason: collision with root package name */
    public static final C7269k f69080d;

    /* renamed from: a, reason: collision with root package name */
    public final int f69081a;

    /* renamed from: b, reason: collision with root package name */
    public final int f69082b;

    /* renamed from: c, reason: collision with root package name */
    public final int f69083c;

    /* renamed from: j3.k$a */
    public static final class a {
    }

    static {
        a aVar = new a();
        G10.a.c(true);
        f69080d = new C7269k(aVar);
        m3.N.L(0);
        m3.N.L(1);
        m3.N.L(2);
        m3.N.L(3);
    }

    C7269k(a aVar) {
        aVar.getClass();
        this.f69081a = 0;
        aVar.getClass();
        this.f69082b = 0;
        aVar.getClass();
        this.f69083c = 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C7269k)) {
            return false;
        }
        C7269k c7269k = (C7269k) obj;
        return this.f69081a == c7269k.f69081a && this.f69082b == c7269k.f69082b && this.f69083c == c7269k.f69083c;
    }

    public final int hashCode() {
        return (((((527 + this.f69081a) * 31) + this.f69082b) * 31) + this.f69083c) * 31;
    }
}
