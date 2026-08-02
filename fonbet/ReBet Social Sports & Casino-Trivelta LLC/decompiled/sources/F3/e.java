package F3;

import java.util.List;

/* loaded from: classes.dex */
public class e implements o {

    /* renamed from: a, reason: collision with root package name */
    public final List f3528a;

    public e(List list) {
        this.f3528a = list;
    }

    @Override // F3.o
    public B3.a a() {
        return ((G3.a) this.f3528a.get(0)).i() ? new B3.k(this.f3528a) : new B3.j(this.f3528a);
    }

    @Override // F3.o
    public List b() {
        return this.f3528a;
    }

    @Override // F3.o
    public boolean c() {
        return this.f3528a.size() == 1 && ((G3.a) this.f3528a.get(0)).i();
    }
}
