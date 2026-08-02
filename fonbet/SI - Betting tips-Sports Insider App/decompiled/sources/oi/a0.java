package oi;

import androidx.appcompat.widget.c1;
import java.io.IOException;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.Headers;
import okio.Buffer;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes3.dex */
public final class a0 implements d {

    /* renamed from: a, reason: collision with root package name */
    public final r0 f21232a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f21233b;

    /* renamed from: c, reason: collision with root package name */
    public final Object[] f21234c;

    /* renamed from: d, reason: collision with root package name */
    public final gh.d f21235d;

    /* renamed from: e, reason: collision with root package name */
    public final m f21236e;

    /* renamed from: f, reason: collision with root package name */
    public volatile boolean f21237f;

    /* renamed from: g, reason: collision with root package name */
    public kh.p f21238g;

    /* renamed from: h, reason: collision with root package name */
    public Throwable f21239h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f21240i;

    public a0(r0 r0Var, Object obj, Object[] objArr, gh.d dVar, m mVar) {
        this.f21232a = r0Var;
        this.f21233b = obj;
        this.f21234c = objArr;
        this.f21235d = dVar;
        this.f21236e = mVar;
    }

    public final kh.p a() {
        gh.y url;
        r0 r0Var = this.f21232a;
        z0[] z0VarArr = r0Var.j;
        Object[] objArr = this.f21234c;
        int length = objArr.length;
        if (length != z0VarArr.length) {
            throw new IllegalArgumentException(r4.k.n(c1.r(length, "Argument count (", ") doesn't match expected count ("), z0VarArr.length, ")"));
        }
        p0 p0Var = new p0(r0Var.f21324c, r0Var.f21323b, r0Var.f21325d, r0Var.f21326e, r0Var.f21327f, r0Var.f21328g, r0Var.f21329h, r0Var.f21330i);
        if (r0Var.f21331k) {
            length--;
        }
        ArrayList arrayList = new ArrayList(length);
        for (int i5 = 0; i5 < length; i5++) {
            arrayList.add(objArr[i5]);
            z0VarArr[i5].a(p0Var, objArr[i5]);
        }
        gh.x xVar = p0Var.f21290d;
        if (xVar != null) {
            url = xVar.a();
        } else {
            String link = p0Var.f21289c;
            gh.y yVar = p0Var.f21288b;
            yVar.getClass();
            Intrinsics.checkNotNullParameter(link, "link");
            gh.x f6 = yVar.f(link);
            url = f6 != null ? f6.a() : null;
            if (url == null) {
                throw new IllegalArgumentException("Malformed URL. Base: " + yVar + ", Relative: " + p0Var.f21289c);
            }
        }
        gh.m0 m0Var = p0Var.f21296k;
        if (m0Var == null) {
            d7.e eVar = p0Var.j;
            if (eVar != null) {
                m0Var = new gh.s((ArrayList) eVar.f8268b, (ArrayList) eVar.f8269c);
            } else {
                gh.c0 c0Var = p0Var.f21295i;
                if (c0Var != null) {
                    ArrayList arrayList2 = c0Var.f10137c;
                    if (arrayList2.isEmpty()) {
                        throw new IllegalStateException("Multipart body must have at least one part.");
                    }
                    m0Var = new gh.e0(c0Var.f10135a, c0Var.f10136b, hh.g.j(arrayList2));
                } else if (p0Var.f21294h) {
                    byte[] content = new byte[0];
                    int i10 = gh.m0.f10243a;
                    Intrinsics.checkNotNullParameter(content, "content");
                    Intrinsics.checkNotNullParameter(content, "content");
                    m0Var = gh.o.b(0, null, content);
                }
            }
        }
        gh.b0 b0Var = p0Var.f21293g;
        gh.v vVar = p0Var.f21292f;
        if (b0Var != null) {
            if (m0Var != null) {
                m0Var = new o0(m0Var, b0Var);
            } else {
                vVar.a("Content-Type", b0Var.f10119a);
            }
        }
        c4.d dVar = p0Var.f21291e;
        dVar.getClass();
        Intrinsics.checkNotNullParameter(url, "url");
        dVar.f3577b = url;
        Headers headers = vVar.d();
        Intrinsics.checkNotNullParameter(headers, "headers");
        dVar.f3579d = headers.newBuilder();
        dVar.j(p0Var.f21287a, m0Var);
        u uVar = new u(this.f21233b, r0Var.f21322a, arrayList);
        Intrinsics.checkNotNullParameter(u.class, "type");
        ag.c type = u6.h.m(u.class);
        Intrinsics.checkNotNullParameter(type, "type");
        dVar.f3581f = ((rh.g) dVar.f3581f).E(type, uVar);
        gh.i0 request = new gh.i0(dVar);
        gh.g0 g0Var = (gh.g0) this.f21235d;
        g0Var.getClass();
        Intrinsics.checkNotNullParameter(request, "request");
        return new kh.p(g0Var, request);
    }

    public final gh.e b() {
        kh.p pVar = this.f21238g;
        if (pVar != null) {
            return pVar;
        }
        Throwable th2 = this.f21239h;
        if (th2 != null) {
            if (th2 instanceof IOException) {
                throw ((IOException) th2);
            }
            if (th2 instanceof RuntimeException) {
                throw ((RuntimeException) th2);
            }
            throw ((Error) th2);
        }
        try {
            kh.p a7 = a();
            this.f21238g = a7;
            return a7;
        } catch (IOException | Error | RuntimeException e7) {
            z0.q(e7);
            this.f21239h = e7;
            throw e7;
        }
    }

    @Override // oi.d
    public final boolean c() {
        boolean z5 = true;
        if (this.f21237f) {
            return true;
        }
        synchronized (this) {
            try {
                kh.p pVar = this.f21238g;
                if (pVar == null || !pVar.q) {
                    z5 = false;
                }
            } finally {
            }
        }
        return z5;
    }

    @Override // oi.d
    public final void cancel() {
        kh.p pVar;
        this.f21237f = true;
        synchronized (this) {
            pVar = this.f21238g;
        }
        if (pVar != null) {
            pVar.cancel();
        }
    }

    public final Object clone() {
        return new a0(this.f21232a, this.f21233b, this.f21234c, this.f21235d, this.f21236e);
    }

    public final s0 d(gh.o0 o0Var) {
        gh.r0 r0Var = o0Var.f10279g;
        gh.n0 k6 = o0Var.k();
        z body = new z(r0Var.n(), r0Var.k());
        Intrinsics.checkNotNullParameter(body, "body");
        k6.f10263g = body;
        gh.o0 a7 = k6.a();
        boolean z5 = a7.f10287p;
        int i5 = a7.f10276d;
        if (i5 < 200 || i5 >= 300) {
            try {
                Buffer content = new Buffer();
                r0Var.m0().readAll(content);
                gh.b0 n9 = r0Var.n();
                long k9 = r0Var.k();
                gh.q0 q0Var = gh.r0.f10297b;
                Intrinsics.checkNotNullParameter(content, "content");
                Intrinsics.checkNotNullParameter(content, "<this>");
                gh.q0 q0Var2 = new gh.q0(n9, k9, content);
                if (z5) {
                    throw new IllegalArgumentException("rawResponse should not be successful response");
                }
                return new s0(a7, null, q0Var2);
            } finally {
                r0Var.close();
            }
        }
        if (i5 == 204 || i5 == 205) {
            if (z5) {
                return new s0(a7, null, null);
            }
            throw new IllegalArgumentException("rawResponse must be successful response");
        }
        y yVar = new y(r0Var);
        try {
            Object e7 = this.f21236e.e(yVar);
            if (z5) {
                return new s0(a7, e7, null);
            }
            throw new IllegalArgumentException("rawResponse must be successful response");
        } catch (RuntimeException e9) {
            IOException iOException = yVar.f21358e;
            if (iOException == null) {
                throw e9;
            }
            throw iOException;
        }
    }

    @Override // oi.d
    public final synchronized gh.i0 l0() {
        try {
        } catch (IOException e7) {
            throw new RuntimeException("Unable to create request.", e7);
        }
        return ((kh.p) b()).f19139b;
    }

    @Override // oi.d
    public final void o0(g gVar) {
        kh.p pVar;
        Throwable th2;
        synchronized (this) {
            try {
                if (this.f21240i) {
                    throw new IllegalStateException("Already executed.");
                }
                this.f21240i = true;
                pVar = this.f21238g;
                th2 = this.f21239h;
                if (pVar == null && th2 == null) {
                    try {
                        kh.p a7 = a();
                        this.f21238g = a7;
                        pVar = a7;
                    } catch (Throwable th3) {
                        th2 = th3;
                        z0.q(th2);
                        this.f21239h = th2;
                    }
                }
            } catch (Throwable th4) {
                throw th4;
            }
        }
        if (th2 != null) {
            gVar.b(this, th2);
            return;
        }
        if (this.f21237f) {
            pVar.cancel();
        }
        pVar.e(new io.sentry.internal.debugmeta.c(13, (Object) this, (Object) gVar, false));
    }

    @Override // oi.d
    /* renamed from: clone, reason: collision with other method in class */
    public final d mo120clone() {
        return new a0(this.f21232a, this.f21233b, this.f21234c, this.f21235d, this.f21236e);
    }
}
