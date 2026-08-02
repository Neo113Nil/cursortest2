package net.time4j.format.expert;

import java.math.BigDecimal;

/* loaded from: classes5.dex */
public enum k implements oi.p {
    FRACTION;

    @Override // oi.p
    public boolean Y() {
        return false;
    }

    @Override // oi.p
    public char a() {
        return (char) 0;
    }

    @Override // java.util.Comparator
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public int compare(oi.o oVar, oi.o oVar2) {
        return ((BigDecimal) oVar.j(this)).compareTo((BigDecimal) oVar2.j(this));
    }

    @Override // oi.p
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public BigDecimal c() {
        return BigDecimal.ONE;
    }

    @Override // oi.p
    /* renamed from: e, reason: merged with bridge method [inline-methods] */
    public BigDecimal d0() {
        return BigDecimal.ZERO;
    }

    @Override // oi.p
    public boolean e0() {
        return false;
    }

    @Override // oi.p
    public boolean g() {
        return false;
    }

    @Override // oi.p
    public Class getType() {
        return BigDecimal.class;
    }
}
