package v7;

import java.util.List;

/* renamed from: v7.f, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public class C6651f {

    /* renamed from: a, reason: collision with root package name */
    public final InterfaceC6648c f67060a;

    /* renamed from: b, reason: collision with root package name */
    public H6.a f67061b;

    /* renamed from: c, reason: collision with root package name */
    public List f67062c;

    /* renamed from: d, reason: collision with root package name */
    public int f67063d;

    /* renamed from: e, reason: collision with root package name */
    public String f67064e;

    public C6651f(InterfaceC6648c interfaceC6648c) {
        this.f67060a = interfaceC6648c;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C6650e a() {
        try {
            return new C6650e(this);
        } finally {
            H6.a.U(this.f67061b);
            this.f67061b = null;
            H6.a.w0(this.f67062c);
            this.f67062c = null;
        }
    }

    public P7.a b() {
        return null;
    }

    public List c() {
        return H6.a.J(this.f67062c);
    }

    public int d() {
        return this.f67063d;
    }

    public InterfaceC6648c e() {
        return this.f67060a;
    }

    public H6.a f() {
        return H6.a.B(this.f67061b);
    }

    public String g() {
        return this.f67064e;
    }

    public C6651f i(List list) {
        this.f67062c = H6.a.J(list);
        return this;
    }

    public C6651f j(int i10) {
        this.f67063d = i10;
        return this;
    }

    public C6651f k(H6.a aVar) {
        this.f67061b = H6.a.B(aVar);
        return this;
    }

    public C6651f l(String str) {
        this.f67064e = str;
        return this;
    }

    public C6651f h(P7.a aVar) {
        return this;
    }
}
