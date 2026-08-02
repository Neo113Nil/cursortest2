package net.time4j;

import java.io.InvalidObjectException;
import java.math.BigDecimal;
import oi.AbstractC5909e;

/* renamed from: net.time4j.l, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C5719l extends AbstractC5909e implements d0 {
    private static final long serialVersionUID = -4837430960549551204L;

    /* renamed from: a, reason: collision with root package name */
    public final transient BigDecimal f58285a;

    public C5719l(String str, BigDecimal bigDecimal) {
        super(str);
        this.f58285a = bigDecimal;
    }

    private Object readResolve() {
        Object x02 = G.x0(name());
        if (x02 != null) {
            return x02;
        }
        throw new InvalidObjectException(name());
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
        return BigDecimal.class;
    }

    @Override // oi.AbstractC5909e
    public boolean w() {
        return true;
    }

    @Override // oi.p
    /* renamed from: x, reason: merged with bridge method [inline-methods] */
    public BigDecimal c() {
        return this.f58285a;
    }

    @Override // oi.p
    /* renamed from: y, reason: merged with bridge method [inline-methods] */
    public BigDecimal d0() {
        return BigDecimal.ZERO;
    }
}
