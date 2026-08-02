package nc;

import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import nc.C5694a;

/* loaded from: classes4.dex */
public class f implements C5694a.InterfaceC0832a {

    /* renamed from: a, reason: collision with root package name */
    public final e f57240a;

    /* renamed from: b, reason: collision with root package name */
    public final C5694a f57241b;

    /* renamed from: c, reason: collision with root package name */
    public int f57242c = 0;

    public f(ReactApplicationContext reactApplicationContext) {
        this.f57240a = new k(reactApplicationContext);
        this.f57241b = new C5694a(reactApplicationContext, this);
    }

    @Override // nc.C5694a.InterfaceC0832a
    public void a(boolean z10) {
        this.f57240a.i(z10);
    }

    public void b(String str) {
        this.f57242c++;
        this.f57240a.f57235e = true;
    }

    public void c(String str, Promise promise) {
        this.f57240a.d(str, promise);
    }

    public void d() {
        this.f57240a.g();
        this.f57241b.g();
    }

    public void e() {
        this.f57241b.k();
        this.f57240a.j();
        this.f57240a.f57235e = false;
    }

    public void f() {
        e();
    }

    public void g(double d10) {
        int i10 = (int) (this.f57242c - d10);
        this.f57242c = i10;
        if (i10 == 0) {
            this.f57240a.f57235e = false;
        }
    }
}
