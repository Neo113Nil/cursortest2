package K7;

/* loaded from: classes2.dex */
public class w {

    /* renamed from: a, reason: collision with root package name */
    public final H6.h f6349a;

    /* renamed from: b, reason: collision with root package name */
    public final b f6350b;

    public class a implements H6.h {
        public a() {
        }

        @Override // H6.h
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void release(byte[] bArr) {
            w.this.b(bArr);
        }
    }

    public static class b extends x {
        public b(G6.d dVar, M m10, N n10) {
            super(dVar, m10, n10);
        }

        @Override // K7.AbstractC1366g
        public C1371l x(int i10) {
            return new H(p(i10), this.f6306c.f6300g, 0);
        }
    }

    public w(G6.d dVar, M m10) {
        D6.k.b(Boolean.valueOf(m10.f6300g > 0));
        this.f6350b = new b(dVar, m10, G.h());
        this.f6349a = new a();
    }

    public H6.a a(int i10) {
        return H6.a.n1((byte[]) this.f6350b.get(i10), this.f6349a);
    }

    public void b(byte[] bArr) {
        this.f6350b.release(bArr);
    }
}
