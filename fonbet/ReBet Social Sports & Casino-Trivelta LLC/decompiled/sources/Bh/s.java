package Bh;

import java.io.Closeable;
import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.function.Function;
import java.util.function.Supplier;
import java.util.logging.Level;
import java.util.logging.Logger;
import rh.InterfaceC6300r;
import rh.InterfaceC6301s;
import rh.InterfaceC6302t;
import yh.AbstractC6897f;
import yh.C6896e;
import yh.InterfaceC6893b;
import zh.C7004l;
import zh.InterfaceC7011s;

/* loaded from: classes3.dex */
public final class s implements InterfaceC6302t, Closeable {

    /* renamed from: d, reason: collision with root package name */
    public static final Logger f990d = Logger.getLogger(s.class.getName());

    /* renamed from: a, reason: collision with root package name */
    public final z f991a;

    /* renamed from: b, reason: collision with root package name */
    public final C7004l f992b = new C7004l(new Function() { // from class: Bh.r
        @Override // java.util.function.Function
        public final Object apply(Object obj) {
            p b10;
            b10 = p.b(r0.f991a, r2, s.this.B((AbstractC6897f) obj));
            return b10;
        }
    });

    /* renamed from: c, reason: collision with root package name */
    public InterfaceC7011s f993c;

    public s(InterfaceC6893b interfaceC6893b, f fVar, Ah.c cVar, Supplier supplier, Fh.g gVar, List list, InterfaceC7011s interfaceC7011s) {
        this.f991a = new z(interfaceC6893b, fVar, cVar, supplier, gVar, list);
        this.f993c = interfaceC7011s;
    }

    public static u r() {
        return new u();
    }

    public final Eh.e B(AbstractC6897f abstractC6897f) {
        Eh.e eVar = (Eh.e) this.f993c.apply(abstractC6897f);
        return eVar == null ? Eh.e.b() : eVar;
    }

    public InterfaceC6301s J(String str) {
        if (str == null || str.isEmpty()) {
            f990d.fine("Tracer requested without instrumentation scope name.");
            str = "";
        }
        return new q(this.f992b, str);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        shutdown().g(10L, TimeUnit.SECONDS);
    }

    @Override // rh.InterfaceC6302t
    public InterfaceC6300r get(String str) {
        return J(str).build();
    }

    public C6896e shutdown() {
        if (!this.f991a.g()) {
            return this.f991a.i();
        }
        f990d.log(Level.INFO, "Calling shutdown() multiple times.");
        return C6896e.j();
    }

    public String toString() {
        return "SdkTracerProvider{clock=" + this.f991a.b() + ", idGenerator=" + this.f991a.c() + ", resource=" + this.f991a.d() + ", spanLimitsSupplier=" + this.f991a.f() + ", sampler=" + this.f991a.e() + ", spanProcessor=" + this.f991a.a() + '}';
    }
}
