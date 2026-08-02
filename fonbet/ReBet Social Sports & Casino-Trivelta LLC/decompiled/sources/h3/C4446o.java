package h3;

/* renamed from: h3.o, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C4446o extends C4449r {

    /* renamed from: g, reason: collision with root package name */
    public static final C4446o f47667g = new C4446o(EnumC4447p.FALSE);

    /* renamed from: h, reason: collision with root package name */
    public static final C4446o f47668h = new C4446o(EnumC4447p.TRUE);

    /* renamed from: i, reason: collision with root package name */
    public static final C4446o f47669i = new C4446o(EnumC4447p.NULL);

    /* renamed from: j, reason: collision with root package name */
    public static final C4446o f47670j = new C4446o(EnumC4447p.UNDEFINED);

    /* renamed from: e, reason: collision with root package name */
    public final EnumC4447p f47671e;

    /* renamed from: f, reason: collision with root package name */
    public final int f47672f;

    public C4446o(EnumC4447p enumC4447p) {
        super(EnumC4450s.SIMPLE_VALUE);
        this.f47672f = enumC4447p.a();
        this.f47671e = enumC4447p;
    }

    @Override // h3.C4449r, h3.AbstractC4437f
    public boolean equals(Object obj) {
        if (obj instanceof C4446o) {
            C4446o c4446o = (C4446o) obj;
            if (super.equals(obj) && this.f47672f == c4446o.f47672f) {
                return true;
            }
        }
        return false;
    }

    @Override // h3.C4449r, h3.AbstractC4437f
    public int hashCode() {
        return super.hashCode() ^ Integer.valueOf(this.f47672f).hashCode();
    }

    @Override // h3.C4449r
    public String toString() {
        return this.f47671e.toString();
    }

    public C4446o(int i10) {
        super(i10 <= 23 ? EnumC4450s.SIMPLE_VALUE : EnumC4450s.SIMPLE_VALUE_NEXT_BYTE);
        this.f47672f = i10;
        this.f47671e = EnumC4447p.b(i10);
    }
}
