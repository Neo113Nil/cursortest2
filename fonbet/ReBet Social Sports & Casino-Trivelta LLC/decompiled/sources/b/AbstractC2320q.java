package b;

/* renamed from: b.q, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC2320q {

    /* renamed from: a, reason: collision with root package name */
    public final Class f24139a;

    public AbstractC2320q(Class cls) {
        this.f24139a = cls;
    }

    public final w0 a(AbstractC2312i abstractC2312i) {
        int i10 = abstractC2312i.f24116f;
        if (i10 != 128) {
            throw new IllegalStateException("Expected CONTEXT tag but found ".concat(i10 != 64 ? i10 != 128 ? i10 != 192 ? "UNIVERSAL" : "PRIVATE" : "CONTEXT" : "APPLICATION"));
        }
        if (1 == abstractC2312i.f24115d) {
            throw new IllegalStateException("object explicit - implicit expected.");
        }
        w0 d10 = abstractC2312i.f24118h.d();
        int i11 = abstractC2312i.f24115d;
        if (i11 == 3) {
            d10 = c(abstractC2312i.j(d10));
        } else if (i11 == 4) {
            d10 = d10 instanceof F0 ? c((F0) d10) : b((C2317n) d10);
        } else if (!this.f24139a.isInstance(d10)) {
            throw new IllegalStateException("unexpected object: ".concat(d10.getClass().getName()));
        }
        if (this.f24139a.isInstance(d10)) {
            return d10;
        }
        throw new IllegalStateException("unexpected object: ".concat(d10.getClass().getName()));
    }

    public w0 b(C2317n c2317n) {
        throw new IllegalStateException("unexpected implicit primitive encoding");
    }

    public w0 c(F0 f02) {
        throw new IllegalStateException("unexpected implicit constructed encoding");
    }

    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public final boolean equals(Object obj) {
        return this == obj;
    }

    public final int hashCode() {
        return super.hashCode();
    }
}
