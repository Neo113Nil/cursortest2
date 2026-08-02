package net.time4j;

import java.io.InvalidObjectException;

/* renamed from: net.time4j.s, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C5725s extends AbstractC5701a implements K {
    private static final long serialVersionUID = -1337148214680014674L;

    /* renamed from: d, reason: collision with root package name */
    public final transient int f58314d;

    /* renamed from: e, reason: collision with root package name */
    public final transient Integer f58315e;

    /* renamed from: f, reason: collision with root package name */
    public final transient Integer f58316f;

    /* renamed from: g, reason: collision with root package name */
    public final transient char f58317g;

    /* renamed from: h, reason: collision with root package name */
    public final transient oi.t f58318h;

    public C5725s(String str, int i10, Integer num, Integer num2, char c10) {
        super(str);
        this.f58314d = i10;
        this.f58315e = num;
        this.f58316f = num2;
        this.f58317g = c10;
        this.f58318h = new L(this, false);
    }

    private Object readResolve() {
        Object z02 = F.z0(name());
        if (z02 != null) {
            return z02;
        }
        throw new InvalidObjectException(name());
    }

    public static C5725s y(String str, int i10, int i11, int i12, char c10) {
        return new C5725s(str, i10, Integer.valueOf(i11), Integer.valueOf(i12), c10);
    }

    @Override // oi.p
    /* renamed from: A, reason: merged with bridge method [inline-methods] */
    public Integer d0() {
        return this.f58315e;
    }

    public int B() {
        return this.f58314d;
    }

    @Override // oi.p
    public boolean Y() {
        return true;
    }

    @Override // oi.AbstractC5909e, oi.p
    public char a() {
        return this.f58317g;
    }

    @Override // oi.p
    public boolean e0() {
        return false;
    }

    @Override // oi.p
    public Class getType() {
        return Integer.class;
    }

    @Override // net.time4j.K
    public /* bridge */ /* synthetic */ AbstractC5722o m(Number number) {
        return super.x((Integer) number);
    }

    @Override // oi.AbstractC5909e
    public boolean w() {
        return true;
    }

    @Override // oi.p
    /* renamed from: z, reason: merged with bridge method [inline-methods] */
    public Integer c() {
        return this.f58316f;
    }
}
