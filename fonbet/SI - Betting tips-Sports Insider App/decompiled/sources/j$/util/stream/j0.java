package j$.util.stream;

import j$.util.Optional;

/* loaded from: classes2.dex */
public final class j0 extends k0 {

    /* renamed from: c, reason: collision with root package name */
    public static final f0 f17935c;

    /* renamed from: d, reason: collision with root package name */
    public static final f0 f17936d;

    @Override // java.util.function.Supplier
    public final Object get() {
        if (this.f17946a) {
            return new Optional(this.f17947b);
        }
        return null;
    }

    static {
        d7 d7Var = d7.REFERENCE;
        j$.time.x xVar = new j$.time.x(27);
        k kVar = new k(9);
        Optional optional = Optional.f17602b;
        f17935c = new f0(true, d7Var, optional, xVar, kVar);
        f17936d = new f0(false, d7Var, optional, new j$.time.x(27), new k(9));
    }
}
