package net.time4j;

import java.io.InvalidObjectException;

/* renamed from: net.time4j.t, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C5726t extends AbstractC5702b implements K {
    private static final long serialVersionUID = -1337148214680014674L;

    /* renamed from: d, reason: collision with root package name */
    public final transient int f58319d;

    /* renamed from: e, reason: collision with root package name */
    public final transient Integer f58320e;

    /* renamed from: f, reason: collision with root package name */
    public final transient Integer f58321f;

    /* renamed from: g, reason: collision with root package name */
    public final transient char f58322g;

    /* renamed from: h, reason: collision with root package name */
    public final transient oi.t f58323h;

    public C5726t(String str, int i10, Integer num, Integer num2, char c10) {
        super(str);
        this.f58319d = i10;
        this.f58320e = num;
        this.f58321f = num2;
        this.f58322g = c10;
        this.f58323h = new L(this, i10 == 5 || i10 == 7 || i10 == 9 || i10 == 13);
    }

    private Object readResolve() {
        Object x02 = G.x0(name());
        if (x02 != null) {
            return x02;
        }
        throw new InvalidObjectException(name());
    }

    public static C5726t y(String str, boolean z10) {
        return new C5726t(str, z10 ? 2 : 1, 1, Integer.valueOf(z10 ? 24 : 12), z10 ? 'k' : 'h');
    }

    public static C5726t z(String str, int i10, int i11, int i12, char c10) {
        return new C5726t(str, i10, Integer.valueOf(i11), Integer.valueOf(i12), c10);
    }

    @Override // oi.p
    /* renamed from: A, reason: merged with bridge method [inline-methods] */
    public Integer c() {
        return this.f58321f;
    }

    @Override // oi.p
    /* renamed from: B, reason: merged with bridge method [inline-methods] */
    public Integer d0() {
        return this.f58320e;
    }

    public int C() {
        return this.f58319d;
    }

    @Override // oi.p
    public boolean Y() {
        return false;
    }

    @Override // oi.AbstractC5909e, oi.p
    public char a() {
        return this.f58322g;
    }

    @Override // oi.p
    public boolean e0() {
        return true;
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
}
