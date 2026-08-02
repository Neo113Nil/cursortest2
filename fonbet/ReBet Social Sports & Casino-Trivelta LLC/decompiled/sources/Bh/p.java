package Bh;

import rh.InterfaceC6291i;
import rh.InterfaceC6300r;
import rh.InterfaceC6302t;
import yh.AbstractC6897f;

/* loaded from: classes3.dex */
public class p implements InterfaceC6300r {

    /* renamed from: d, reason: collision with root package name */
    public static final InterfaceC6300r f980d = InterfaceC6302t.d().get("noop");

    /* renamed from: e, reason: collision with root package name */
    public static final boolean f981e;

    /* renamed from: a, reason: collision with root package name */
    public final z f982a;

    /* renamed from: b, reason: collision with root package name */
    public final AbstractC6897f f983b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f984c;

    static {
        boolean z10;
        try {
            Class.forName("io.opentelemetry.api.incubator.trace.ExtendedDefaultTracerProvider");
            z10 = true;
        } catch (ClassNotFoundException unused) {
            z10 = false;
        }
        f981e = z10;
    }

    public p(z zVar, AbstractC6897f abstractC6897f, Eh.e eVar) {
        this.f982a = zVar;
        this.f983b = abstractC6897f;
        this.f984c = eVar.c();
    }

    public static p b(z zVar, AbstractC6897f abstractC6897f, Eh.e eVar) {
        return f981e ? g.b(zVar, abstractC6897f, eVar) : new p(zVar, abstractC6897f, eVar);
    }

    @Override // rh.InterfaceC6300r
    public InterfaceC6291i a(String str) {
        if (!this.f984c) {
            return f980d.a(str);
        }
        if (str == null || str.trim().isEmpty()) {
            str = "<unspecified span name>";
        }
        if (this.f982a.g()) {
            return f980d.a(str);
        }
        if (f981e) {
            AbstractC6897f abstractC6897f = this.f983b;
            z zVar = this.f982a;
            return g.a(str, abstractC6897f, zVar, zVar.f());
        }
        AbstractC6897f abstractC6897f2 = this.f983b;
        z zVar2 = this.f982a;
        return new o(str, abstractC6897f2, zVar2, zVar2.f());
    }
}
