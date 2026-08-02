package V6;

/* loaded from: classes2.dex */
public class d {

    /* renamed from: a, reason: collision with root package name */
    public boolean f12556a;

    /* renamed from: b, reason: collision with root package name */
    public int f12557b;

    /* renamed from: c, reason: collision with root package name */
    public int f12558c;

    public d() {
        a();
    }

    public void a() {
        this.f12556a = false;
        this.f12557b = 4;
        c();
    }

    public void b() {
        this.f12558c++;
    }

    public void c() {
        this.f12558c = 0;
    }

    public void d(boolean z10) {
        this.f12556a = z10;
    }

    public boolean e() {
        return this.f12556a && this.f12558c < this.f12557b;
    }
}
