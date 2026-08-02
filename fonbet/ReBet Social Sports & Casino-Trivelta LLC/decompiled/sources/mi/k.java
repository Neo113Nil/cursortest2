package mi;

import oi.AbstractC5909e;

/* loaded from: classes5.dex */
public final class k extends AbstractC5909e {

    /* renamed from: a, reason: collision with root package name */
    public static final k f56638a = new k();
    private static final long serialVersionUID = -1117064522468823402L;

    public k() {
        super("RELATED_GREGORIAN_YEAR");
    }

    @Override // oi.p
    public boolean Y() {
        return true;
    }

    @Override // oi.AbstractC5909e, oi.p
    public char a() {
        return 'r';
    }

    @Override // oi.p
    public boolean e0() {
        return false;
    }

    @Override // oi.p
    public Class getType() {
        return Integer.class;
    }

    public Object readResolve() {
        return f56638a;
    }

    @Override // oi.AbstractC5909e
    public boolean w() {
        return true;
    }

    @Override // oi.p
    /* renamed from: x, reason: merged with bridge method [inline-methods] */
    public Integer c() {
        return 999999999;
    }

    @Override // oi.p
    /* renamed from: y, reason: merged with bridge method [inline-methods] */
    public Integer d0() {
        return -999999999;
    }
}
