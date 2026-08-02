package o5;

import o5.C8644b;
import o5.InterfaceC8643a;
import org.jetbrains.annotations.NotNull;
import sf.AbstractC9688n;
import sf.C9684j;
import sf.D;
import sf.x;

/* renamed from: o5.f, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C8648f implements InterfaceC8643a {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final x f77752a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final C8644b f77753b;

    /* renamed from: o5.f$a */
    private static final class a implements InterfaceC8643a.b {

        /* renamed from: a, reason: collision with root package name */
        @NotNull
        private final C8644b.a f77754a;

        public a(@NotNull C8644b.a aVar) {
            this.f77754a = aVar;
        }

        @Override // o5.InterfaceC8643a.b
        public final void a() {
            this.f77754a.a();
        }

        @Override // o5.InterfaceC8643a.b
        public final InterfaceC8643a.c b() {
            C8644b.c b11 = this.f77754a.b();
            if (b11 != null) {
                return new b(b11);
            }
            return null;
        }

        @Override // o5.InterfaceC8643a.b
        @NotNull
        public final D getData() {
            return this.f77754a.e(1);
        }

        @Override // o5.InterfaceC8643a.b
        @NotNull
        public final D getMetadata() {
            return this.f77754a.e(0);
        }
    }

    /* renamed from: o5.f$b */
    private static final class b implements InterfaceC8643a.c {

        /* renamed from: a, reason: collision with root package name */
        @NotNull
        private final C8644b.c f77755a;

        public b(@NotNull C8644b.c cVar) {
            this.f77755a = cVar;
        }

        @Override // o5.InterfaceC8643a.c
        public final InterfaceC8643a.b K1() {
            C8644b.a c11 = this.f77755a.c();
            if (c11 != null) {
                return new a(c11);
            }
            return null;
        }

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public final void close() {
            this.f77755a.close();
        }

        @Override // o5.InterfaceC8643a.c
        @NotNull
        public final D getData() {
            return this.f77755a.d(1);
        }

        @Override // o5.InterfaceC8643a.c
        @NotNull
        public final D getMetadata() {
            return this.f77755a.d(0);
        }
    }

    public C8648f(long j11, @NotNull He.b bVar, @NotNull x xVar, @NotNull D d11) {
        this.f77752a = xVar;
        this.f77753b = new C8644b(j11, bVar, xVar, d11);
    }

    @Override // o5.InterfaceC8643a
    public final InterfaceC8643a.b a(@NotNull String str) {
        C9684j c9684j = C9684j.f98719d;
        C8644b.a x11 = this.f77753b.x(C9684j.a.c(str).d("SHA-256").h());
        if (x11 != null) {
            return new a(x11);
        }
        return null;
    }

    @Override // o5.InterfaceC8643a
    public final InterfaceC8643a.c b(@NotNull String str) {
        C9684j c9684j = C9684j.f98719d;
        C8644b.c y11 = this.f77753b.y(C9684j.a.c(str).d("SHA-256").h());
        if (y11 != null) {
            return new b(y11);
        }
        return null;
    }

    @Override // o5.InterfaceC8643a
    @NotNull
    public final AbstractC9688n c() {
        return this.f77752a;
    }
}
