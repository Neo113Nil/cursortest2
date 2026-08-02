package v2;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public abstract class f implements s2.c {

    /* renamed from: a, reason: collision with root package name */
    public final t2.a f24406a;

    /* renamed from: b, reason: collision with root package name */
    public final String f24407b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f24408c;

    public f(t2.a aVar, String str) {
        this.f24406a = aVar;
        this.f24407b = str;
    }

    @Override // s2.c
    public boolean E() {
        return getLong(0) != 0;
    }

    public final void c() {
        if (this.f24408c) {
            h8.b.C(21, "statement is closed");
            throw null;
        }
    }

    @Override // s2.c
    public void l() {
        c();
    }

    @Override // s2.c
    public void reset() {
        c();
    }
}
