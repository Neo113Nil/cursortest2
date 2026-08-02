package d9;

/* renamed from: d9.a, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4038a extends AbstractC4041d {

    /* renamed from: a, reason: collision with root package name */
    public final Integer f45153a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f45154b;

    /* renamed from: c, reason: collision with root package name */
    public final EnumC4042e f45155c;

    /* renamed from: d, reason: collision with root package name */
    public final AbstractC4043f f45156d;

    public C4038a(Integer num, Object obj, EnumC4042e enumC4042e, AbstractC4043f abstractC4043f) {
        this.f45153a = num;
        if (obj == null) {
            throw new NullPointerException("Null payload");
        }
        this.f45154b = obj;
        if (enumC4042e == null) {
            throw new NullPointerException("Null priority");
        }
        this.f45155c = enumC4042e;
        this.f45156d = abstractC4043f;
    }

    @Override // d9.AbstractC4041d
    public Integer a() {
        return this.f45153a;
    }

    @Override // d9.AbstractC4041d
    public Object b() {
        return this.f45154b;
    }

    @Override // d9.AbstractC4041d
    public EnumC4042e c() {
        return this.f45155c;
    }

    @Override // d9.AbstractC4041d
    public AbstractC4043f d() {
        return this.f45156d;
    }

    public boolean equals(Object obj) {
        AbstractC4043f abstractC4043f;
        if (obj == this) {
            return true;
        }
        if (obj instanceof AbstractC4041d) {
            AbstractC4041d abstractC4041d = (AbstractC4041d) obj;
            Integer num = this.f45153a;
            if (num != null ? num.equals(abstractC4041d.a()) : abstractC4041d.a() == null) {
                if (this.f45154b.equals(abstractC4041d.b()) && this.f45155c.equals(abstractC4041d.c()) && ((abstractC4043f = this.f45156d) != null ? abstractC4043f.equals(abstractC4041d.d()) : abstractC4041d.d() == null)) {
                    return true;
                }
            }
        }
        return false;
    }

    public int hashCode() {
        Integer num = this.f45153a;
        int hashCode = ((((((num == null ? 0 : num.hashCode()) ^ 1000003) * 1000003) ^ this.f45154b.hashCode()) * 1000003) ^ this.f45155c.hashCode()) * 1000003;
        AbstractC4043f abstractC4043f = this.f45156d;
        return hashCode ^ (abstractC4043f != null ? abstractC4043f.hashCode() : 0);
    }

    public String toString() {
        return "Event{code=" + this.f45153a + ", payload=" + this.f45154b + ", priority=" + this.f45155c + ", productData=" + this.f45156d + "}";
    }
}
