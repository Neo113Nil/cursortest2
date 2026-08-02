package net.time4j;

import oi.AbstractC5909e;

/* renamed from: net.time4j.h, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C5715h extends AbstractC5909e implements InterfaceC5705e {

    /* renamed from: a, reason: collision with root package name */
    public static final C5715h f58149a = new C5715h();
    private static final long serialVersionUID = -6519899440006935829L;

    public C5715h() {
        super("CALENDAR_DATE");
    }

    private Object readResolve() {
        return f58149a;
    }

    @Override // oi.p
    public boolean Y() {
        return true;
    }

    @Override // oi.p
    public boolean e0() {
        return false;
    }

    @Override // oi.p
    public Class getType() {
        return F.class;
    }

    @Override // oi.AbstractC5909e
    public boolean w() {
        return true;
    }

    @Override // oi.p
    /* renamed from: x, reason: merged with bridge method [inline-methods] */
    public F c() {
        return F.f57527e;
    }

    @Override // oi.p
    /* renamed from: y, reason: merged with bridge method [inline-methods] */
    public F d0() {
        return F.f57526d;
    }
}
