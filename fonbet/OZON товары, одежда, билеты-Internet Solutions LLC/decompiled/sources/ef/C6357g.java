package ef;

import We.B;
import We.G;
import We.InterfaceC4865g;
import We.InterfaceC4870l;
import We.L;
import cf.C5822c;
import cf.C5824e;
import java.io.IOException;
import java.util.ArrayList;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* renamed from: ef.g, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C6357g implements B.a {

    /* renamed from: a, reason: collision with root package name */
    private int f62223a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final C5824e f62224b;

    /* renamed from: c, reason: collision with root package name */
    private final ArrayList f62225c;

    /* renamed from: d, reason: collision with root package name */
    private final int f62226d;

    /* renamed from: e, reason: collision with root package name */
    private final C5822c f62227e;

    /* renamed from: f, reason: collision with root package name */
    @NotNull
    private final G f62228f;

    /* renamed from: g, reason: collision with root package name */
    private final int f62229g;

    /* renamed from: h, reason: collision with root package name */
    private final int f62230h;

    /* renamed from: i, reason: collision with root package name */
    private final int f62231i;

    public C6357g(@NotNull C5824e call, @NotNull ArrayList interceptors, int i11, C5822c c5822c, @NotNull G request, int i12, int i13, int i14) {
        Intrinsics.checkNotNullParameter(call, "call");
        Intrinsics.checkNotNullParameter(interceptors, "interceptors");
        Intrinsics.checkNotNullParameter(request, "request");
        this.f62224b = call;
        this.f62225c = interceptors;
        this.f62226d = i11;
        this.f62227e = c5822c;
        this.f62228f = request;
        this.f62229g = i12;
        this.f62230h = i13;
        this.f62231i = i14;
    }

    public static C6357g a(C6357g c6357g, int i11, C5822c c5822c, G g10, int i12, int i13, int i14) {
        if ((i14 & 1) != 0) {
            i11 = c6357g.f62226d;
        }
        int i15 = i11;
        if ((i14 & 2) != 0) {
            c5822c = c6357g.f62227e;
        }
        C5822c c5822c2 = c5822c;
        if ((i14 & 4) != 0) {
            g10 = c6357g.f62228f;
        }
        G request = g10;
        int i16 = c6357g.f62229g;
        if ((i14 & 16) != 0) {
            i12 = c6357g.f62230h;
        }
        int i17 = i12;
        if ((i14 & 32) != 0) {
            i13 = c6357g.f62231i;
        }
        c6357g.getClass();
        Intrinsics.checkNotNullParameter(request, "request");
        ArrayList arrayList = c6357g.f62225c;
        return new C6357g(c6357g.f62224b, arrayList, i15, c5822c2, request, i16, i17, i13);
    }

    @NotNull
    public final C5824e b() {
        return this.f62224b;
    }

    public final int c() {
        return this.f62229g;
    }

    @Override // We.B.a
    @NotNull
    public final InterfaceC4865g call() {
        return this.f62224b;
    }

    @Override // We.B.a
    public final InterfaceC4870l connection() {
        C5822c c5822c = this.f62227e;
        if (c5822c != null) {
            return c5822c.h();
        }
        return null;
    }

    public final C5822c d() {
        return this.f62227e;
    }

    public final int e() {
        return this.f62230h;
    }

    @NotNull
    public final G f() {
        return this.f62228f;
    }

    public final int g() {
        return this.f62231i;
    }

    @Override // We.B.a
    @NotNull
    public final L proceed(@NotNull G request) throws IOException {
        Intrinsics.checkNotNullParameter(request, "request");
        ArrayList arrayList = this.f62225c;
        int size = arrayList.size();
        int i11 = this.f62226d;
        if (i11 >= size) {
            throw new IllegalStateException("Check failed.");
        }
        this.f62223a++;
        C5822c c5822c = this.f62227e;
        if (c5822c != null) {
            if (!c5822c.j().e(request.j())) {
                throw new IllegalStateException(("network interceptor " + ((B) arrayList.get(i11 - 1)) + " must retain the same host and port").toString());
            }
            if (this.f62223a != 1) {
                throw new IllegalStateException(("network interceptor " + ((B) arrayList.get(i11 - 1)) + " must call proceed() exactly once").toString());
            }
        }
        int i12 = i11 + 1;
        C6357g a11 = a(this, i12, null, request, 0, 0, 58);
        B b11 = (B) arrayList.get(i11);
        L intercept = b11.intercept(a11);
        if (intercept == null) {
            throw new NullPointerException("interceptor " + b11 + " returned null");
        }
        if (c5822c != null && i12 < arrayList.size() && a11.f62223a != 1) {
            throw new IllegalStateException(("network interceptor " + b11 + " must call proceed() exactly once").toString());
        }
        if (intercept.c() != null) {
            return intercept;
        }
        throw new IllegalStateException(("interceptor " + b11 + " returned a response with no body").toString());
    }

    @Override // We.B.a
    public final int readTimeoutMillis() {
        return this.f62230h;
    }

    @Override // We.B.a
    @NotNull
    public final G request() {
        return this.f62228f;
    }

    @Override // We.B.a
    @NotNull
    public final B.a withReadTimeout(int i11, @NotNull TimeUnit unit) {
        Intrinsics.checkNotNullParameter(unit, "unit");
        if (this.f62227e == null) {
            return a(this, 0, null, null, Ye.b.d("readTimeout", unit, i11), 0, 47);
        }
        throw new IllegalStateException("Timeouts can't be adjusted in a network interceptor");
    }

    @Override // We.B.a
    @NotNull
    public final B.a withWriteTimeout(int i11, @NotNull TimeUnit unit) {
        Intrinsics.checkNotNullParameter(unit, "unit");
        if (this.f62227e == null) {
            return a(this, 0, null, null, 0, Ye.b.d("writeTimeout", unit, i11), 31);
        }
        throw new IllegalStateException("Timeouts can't be adjusted in a network interceptor");
    }

    @Override // We.B.a
    public final int writeTimeoutMillis() {
        return this.f62231i;
    }
}
