package Bh;

import java.util.List;
import java.util.function.Supplier;
import yh.C6896e;
import yh.InterfaceC6893b;

/* loaded from: classes3.dex */
public final class z {

    /* renamed from: b, reason: collision with root package name */
    public final InterfaceC6893b f1010b;

    /* renamed from: c, reason: collision with root package name */
    public final f f1011c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f1012d;

    /* renamed from: e, reason: collision with root package name */
    public final Ah.c f1013e;

    /* renamed from: f, reason: collision with root package name */
    public final Supplier f1014f;

    /* renamed from: g, reason: collision with root package name */
    public final Fh.g f1015g;

    /* renamed from: h, reason: collision with root package name */
    public final x f1016h;

    /* renamed from: a, reason: collision with root package name */
    public final Object f1009a = new Object();

    /* renamed from: i, reason: collision with root package name */
    public volatile C6896e f1017i = null;

    public z(InterfaceC6893b interfaceC6893b, f fVar, Ah.c cVar, Supplier supplier, Fh.g gVar, List list) {
        this.f1010b = interfaceC6893b;
        this.f1011c = fVar;
        this.f1012d = fVar instanceof j;
        this.f1013e = cVar;
        this.f1014f = supplier;
        this.f1015g = gVar;
        this.f1016h = x.s1(list);
    }

    public x a() {
        return this.f1016h;
    }

    public InterfaceC6893b b() {
        return this.f1010b;
    }

    public f c() {
        return this.f1011c;
    }

    public Ah.c d() {
        return this.f1013e;
    }

    public Fh.g e() {
        return this.f1015g;
    }

    public v f() {
        return (v) this.f1014f.get();
    }

    public boolean g() {
        return this.f1017i != null;
    }

    public boolean h() {
        return this.f1012d;
    }

    public C6896e i() {
        synchronized (this.f1009a) {
            try {
                if (this.f1017i != null) {
                    return this.f1017i;
                }
                this.f1017i = this.f1016h.shutdown();
                return this.f1017i;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
