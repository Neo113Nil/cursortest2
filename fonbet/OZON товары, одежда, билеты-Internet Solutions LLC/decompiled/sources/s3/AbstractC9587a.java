package s3;

/* renamed from: s3.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC9587a {

    /* renamed from: a, reason: collision with root package name */
    private int f98169a;

    public final void e(int i11) {
        this.f98169a = i11 | this.f98169a;
    }

    public void f() {
        this.f98169a = 0;
    }

    protected final boolean g(int i11) {
        return (this.f98169a & i11) == i11;
    }

    public final boolean h() {
        return g(268435456);
    }

    public final boolean i() {
        return g(4);
    }

    public final boolean j() {
        return g(1);
    }

    public final boolean k() {
        return g(536870912);
    }

    public final boolean l() {
        return g(67108864);
    }

    public final void m(int i11) {
        this.f98169a = i11;
    }
}
