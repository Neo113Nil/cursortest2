package oi;

/* loaded from: classes5.dex */
public final class G implements v {

    /* renamed from: a, reason: collision with root package name */
    public final int f61259a;

    /* renamed from: b, reason: collision with root package name */
    public final p f61260b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f61261c;

    public G(int i10, p pVar) {
        this(i10, pVar, null);
    }

    public static K a(K k10, p pVar, boolean z10) {
        Object G10 = k10.s().G(pVar);
        return z10 ? k10.E(1L, G10) : k10.D(1L, G10);
    }

    public static v c(p pVar) {
        return new G(4, pVar);
    }

    public static v d(p pVar) {
        return new G(3, pVar);
    }

    public static v f(p pVar) {
        return new G(6, pVar);
    }

    public static v h(p pVar) {
        return new G(7, pVar);
    }

    public static v j(p pVar) {
        return new G(2, pVar);
    }

    public static v l(p pVar) {
        return new G(1, pVar);
    }

    public static v n(Object obj, p pVar) {
        return new G(0, pVar, obj);
    }

    public static v o(Object obj, p pVar) {
        return new G(5, pVar, obj);
    }

    @Override // oi.v
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public q apply(q qVar) {
        switch (this.f61259a) {
            case 0:
                return p(qVar, this.f61260b, this.f61261c, false);
            case 1:
                return k(qVar, this.f61260b);
            case 2:
                return i(qVar, this.f61260b);
            case 3:
                return g(qVar, this.f61260b);
            case 4:
                return e(qVar, this.f61260b);
            case 5:
                return p(qVar, this.f61260b, this.f61261c, true);
            case 6:
                return m(qVar, false);
            case 7:
                return m(qVar, true);
            default:
                throw new UnsupportedOperationException("Unknown mode: " + this.f61259a);
        }
    }

    public final q e(q qVar, p pVar) {
        q t10 = qVar.t();
        while (true) {
            pVar = t10.s().w(pVar).b(t10);
            if (pVar == null) {
                return t10;
            }
            t10 = q(t10, pVar);
        }
    }

    public final q g(q qVar, p pVar) {
        q t10 = qVar.t();
        while (true) {
            pVar = t10.s().w(pVar).d(t10);
            if (pVar == null) {
                return t10;
            }
            t10 = r(t10, pVar);
        }
    }

    public final q i(q qVar, p pVar) {
        return qVar.y(pVar, qVar.c(pVar));
    }

    public final q k(q qVar, p pVar) {
        return qVar.y(pVar, qVar.m(pVar));
    }

    public final q m(q qVar, boolean z10) {
        if (qVar instanceof K) {
            return (q) qVar.s().r().cast(a((K) K.class.cast(qVar), this.f61260b, z10));
        }
        throw new r("Base units not supported by: " + qVar.s().r());
    }

    public final q p(q qVar, p pVar, Object obj, boolean z10) {
        q t10 = qVar.t();
        return (q) t10.s().w(pVar).q(t10, pVar.getType().cast(obj), z10);
    }

    public final q q(q qVar, p pVar) {
        z w10 = qVar.s().w(pVar);
        return (q) w10.q(qVar, w10.e(qVar), pVar.g());
    }

    public final q r(q qVar, p pVar) {
        z w10 = qVar.s().w(pVar);
        return (q) w10.q(qVar, w10.i(qVar), pVar.g());
    }

    public G(int i10, p pVar, Object obj) {
        if (pVar == null) {
            throw new NullPointerException("Missing chronological element.");
        }
        this.f61259a = i10;
        this.f61260b = pVar;
        this.f61261c = obj;
    }
}
