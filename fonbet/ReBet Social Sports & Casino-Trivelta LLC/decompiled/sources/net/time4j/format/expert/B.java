package net.time4j.format.expert;

/* loaded from: classes5.dex */
public enum B implements oi.p {
    TIMEZONE_ID,
    TIMEZONE_OFFSET;

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
        return oVar.r().a().compareTo(oVar2.r().a());
    }

    @Override // oi.p
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public net.time4j.tz.k c() {
        return net.time4j.tz.p.n(net.time4j.tz.f.AHEAD_OF_UTC, 14);
    }

    @Override // oi.p
    /* renamed from: e, reason: merged with bridge method [inline-methods] */
    public net.time4j.tz.k d0() {
        return net.time4j.tz.p.n(net.time4j.tz.f.BEHIND_UTC, 14);
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
        return net.time4j.tz.k.class;
    }
}
