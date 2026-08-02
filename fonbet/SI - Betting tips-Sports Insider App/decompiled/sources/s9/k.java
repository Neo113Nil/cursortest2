package s9;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public abstract class k {

    /* renamed from: a, reason: collision with root package name */
    public int f23343a;

    /* renamed from: b, reason: collision with root package name */
    public int f23344b;

    /* renamed from: c, reason: collision with root package name */
    public androidx.datastore.preferences.protobuf.m f23345c;

    public abstract void a(int i5);

    public abstract int b();

    public abstract boolean c();

    public abstract void d(int i5);

    public abstract int e(int i5);

    public abstract boolean f();

    public abstract g g();

    public abstract double h();

    public abstract int i();

    public abstract int j();

    public abstract long k();

    public abstract float l();

    public abstract int m();

    public abstract long n();

    public abstract int o();

    public abstract long p();

    public abstract int q();

    public abstract long r();

    public abstract String s();

    public abstract String t();

    public abstract int u();

    public abstract int v();

    public abstract long w();

    public abstract boolean x(int i5);

    public final void y() {
        int u10;
        do {
            u10 = u();
            if (u10 == 0) {
                return;
            }
            int i5 = this.f23343a;
            int i10 = this.f23344b;
            if (i5 + i10 >= 100) {
                throw new v("Protocol message had too many levels of nesting.  May be malicious.  Use setRecursionLimit() to increase the recursion depth limit.");
            }
            this.f23344b = i10 + 1;
            this.f23344b--;
        } while (x(u10));
    }
}
