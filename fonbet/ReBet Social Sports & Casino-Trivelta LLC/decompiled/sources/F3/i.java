package F3;

import java.util.List;

/* loaded from: classes.dex */
public class i implements o {

    /* renamed from: a, reason: collision with root package name */
    public final b f3529a;

    /* renamed from: b, reason: collision with root package name */
    public final b f3530b;

    public i(b bVar, b bVar2) {
        this.f3529a = bVar;
        this.f3530b = bVar2;
    }

    @Override // F3.o
    public B3.a a() {
        return new B3.n(this.f3529a.a(), this.f3530b.a());
    }

    @Override // F3.o
    public List b() {
        throw new UnsupportedOperationException("Cannot call getKeyframes on AnimatableSplitDimensionPathValue.");
    }

    @Override // F3.o
    public boolean c() {
        return this.f3529a.c() && this.f3530b.c();
    }
}
