package oi;

/* renamed from: oi.B, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public enum EnumC5901B implements p {
    LEAP_SECOND,
    DAYLIGHT_SAVING;

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
    public int compare(o oVar, o oVar2) {
        boolean f10 = oVar.f(this);
        if (f10 == oVar2.f(this)) {
            return 0;
        }
        return f10 ? 1 : -1;
    }

    @Override // oi.p
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public Boolean c() {
        return Boolean.TRUE;
    }

    @Override // oi.p
    /* renamed from: e, reason: merged with bridge method [inline-methods] */
    public Boolean d0() {
        return Boolean.FALSE;
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
        return Boolean.class;
    }
}
