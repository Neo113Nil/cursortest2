package d9;

/* renamed from: d9.b, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4039b extends AbstractC4043f {

    /* renamed from: a, reason: collision with root package name */
    public final Integer f45157a;

    public C4039b(Integer num) {
        this.f45157a = num;
    }

    @Override // d9.AbstractC4043f
    public Integer a() {
        return this.f45157a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AbstractC4043f)) {
            return false;
        }
        Integer num = this.f45157a;
        Integer a10 = ((AbstractC4043f) obj).a();
        return num == null ? a10 == null : num.equals(a10);
    }

    public int hashCode() {
        Integer num = this.f45157a;
        return (num == null ? 0 : num.hashCode()) ^ 1000003;
    }

    public String toString() {
        return "ProductData{productId=" + this.f45157a + "}";
    }
}
