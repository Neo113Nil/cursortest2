package f8;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    public final Object f9503a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f9504b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f9505c;

    public f(Object obj, Object obj2, Object obj3) {
        this.f9503a = obj;
        this.f9504b = obj2;
        this.f9505c = obj3;
    }

    public final IllegalArgumentException a() {
        Object obj = this.f9503a;
        String valueOf = String.valueOf(obj);
        String valueOf2 = String.valueOf(this.f9504b);
        String valueOf3 = String.valueOf(obj);
        String valueOf4 = String.valueOf(this.f9505c);
        StringBuilder sb2 = new StringBuilder(valueOf4.length() + valueOf3.length() + valueOf2.length() + valueOf.length() + 39);
        sb2.append("Multiple entries with same key: ");
        sb2.append(valueOf);
        sb2.append("=");
        sb2.append(valueOf2);
        return new IllegalArgumentException(d9.e.n(sb2, " and ", valueOf3, "=", valueOf4));
    }
}
