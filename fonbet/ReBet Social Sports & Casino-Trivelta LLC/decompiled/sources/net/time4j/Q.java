package net.time4j;

import oi.AbstractC5909e;

/* loaded from: classes5.dex */
public final class Q extends AbstractC5909e implements V {

    /* renamed from: a, reason: collision with root package name */
    public static final Q f57655a = new Q();
    private static final long serialVersionUID = -3712256393866098916L;

    public Q() {
        super("WALL_TIME");
    }

    private Object readResolve() {
        return f57655a;
    }

    @Override // oi.p
    public boolean Y() {
        return false;
    }

    @Override // oi.p
    public boolean e0() {
        return true;
    }

    @Override // oi.p
    public Class getType() {
        return G.class;
    }

    @Override // oi.AbstractC5909e
    public boolean w() {
        return true;
    }

    @Override // oi.p
    /* renamed from: x, reason: merged with bridge method [inline-methods] */
    public G c() {
        return G.D0(23, 59, 59, 999999999);
    }

    @Override // oi.p
    /* renamed from: y, reason: merged with bridge method [inline-methods] */
    public G d0() {
        return G.f57582l;
    }
}
