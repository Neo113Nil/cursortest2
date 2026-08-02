package net.time4j;

/* loaded from: classes5.dex */
public final class Z extends AbstractC5701a implements D {

    /* renamed from: d, reason: collision with root package name */
    public static final Z f57685d = new Z();
    private static final long serialVersionUID = -2378018589067147278L;

    public Z() {
        super("WEEKDAY_IN_MONTH");
    }

    private Object readResolve() {
        return f57685d;
    }

    @Override // oi.p
    public boolean Y() {
        return true;
    }

    @Override // oi.AbstractC5909e, oi.p
    public char a() {
        return 'F';
    }

    @Override // oi.p
    public boolean e0() {
        return false;
    }

    @Override // oi.p
    public Class getType() {
        return Integer.class;
    }

    @Override // oi.AbstractC5909e
    public boolean w() {
        return true;
    }

    @Override // oi.p
    /* renamed from: y, reason: merged with bridge method [inline-methods] */
    public Integer c() {
        return 5;
    }

    @Override // oi.p
    /* renamed from: z, reason: merged with bridge method [inline-methods] */
    public Integer d0() {
        return 1;
    }
}
