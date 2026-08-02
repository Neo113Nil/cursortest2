package Bh;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Supplier;
import yh.InterfaceC6893b;
import zh.C7013u;

/* loaded from: classes3.dex */
public final class u {

    /* renamed from: h, reason: collision with root package name */
    public static final Fh.g f994h = Fh.g.e(Fh.g.a());

    /* renamed from: a, reason: collision with root package name */
    public final List f995a = new ArrayList();

    /* renamed from: b, reason: collision with root package name */
    public InterfaceC6893b f996b = InterfaceC6893b.getDefault();

    /* renamed from: c, reason: collision with root package name */
    public f f997c = f.a();

    /* renamed from: d, reason: collision with root package name */
    public Ah.c f998d = Ah.c.f();

    /* renamed from: e, reason: collision with root package name */
    public Supplier f999e = new Supplier() { // from class: Bh.t
        @Override // java.util.function.Supplier
        public final Object get() {
            return v.b();
        }
    };

    /* renamed from: f, reason: collision with root package name */
    public Fh.g f1000f = f994h;

    /* renamed from: g, reason: collision with root package name */
    public C7013u f1001g = Eh.e.a();

    public u a(x xVar) {
        this.f995a.add(xVar);
        return this;
    }

    public s b() {
        return new s(this.f996b, this.f997c, this.f998d, this.f999e, this.f1000f, this.f995a, this.f1001g.b());
    }
}
