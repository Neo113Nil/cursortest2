package D1;

import D1.m;
import android.net.Uri;
import androidx.media3.exoplayer.source.C2223y;
import e1.AbstractC4134a;
import e1.Z;
import h1.C4401D;
import h1.C4416l;
import h1.C4418n;
import h1.InterfaceC4411g;
import java.io.InputStream;
import java.util.Map;

/* loaded from: classes.dex */
public final class o implements m.e {

    /* renamed from: a, reason: collision with root package name */
    public final long f2474a;

    /* renamed from: b, reason: collision with root package name */
    public final C4418n f2475b;

    /* renamed from: c, reason: collision with root package name */
    public final int f2476c;

    /* renamed from: d, reason: collision with root package name */
    public final C4401D f2477d;

    /* renamed from: e, reason: collision with root package name */
    public final a f2478e;

    /* renamed from: f, reason: collision with root package name */
    public volatile Object f2479f;

    public interface a {
        Object a(Uri uri, InputStream inputStream);
    }

    public o(InterfaceC4411g interfaceC4411g, Uri uri, int i10, a aVar) {
        this(interfaceC4411g, new C4418n.b().i(uri).b(1).a(), i10, aVar);
    }

    public static Object g(InterfaceC4411g interfaceC4411g, a aVar, Uri uri, int i10) {
        o oVar = new o(interfaceC4411g, uri, i10, aVar);
        oVar.a();
        return AbstractC4134a.e(oVar.e());
    }

    @Override // D1.m.e
    public final void a() {
        this.f2477d.r();
        C4416l c4416l = new C4416l(this.f2477d, this.f2475b);
        try {
            c4416l.k();
            this.f2479f = this.f2478e.a((Uri) AbstractC4134a.e(this.f2477d.getUri()), c4416l);
        } finally {
            Z.m(c4416l);
        }
    }

    public long b() {
        return this.f2477d.o();
    }

    public Map d() {
        return this.f2477d.q();
    }

    public final Object e() {
        return this.f2479f;
    }

    public Uri f() {
        return this.f2477d.p();
    }

    public o(InterfaceC4411g interfaceC4411g, C4418n c4418n, int i10, a aVar) {
        this.f2477d = new C4401D(interfaceC4411g);
        this.f2475b = c4418n;
        this.f2476c = i10;
        this.f2478e = aVar;
        this.f2474a = C2223y.a();
    }

    @Override // D1.m.e
    public final void c() {
    }
}
