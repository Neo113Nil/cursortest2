package y1;

import Z1.w;
import k1.C7459e;
import org.jetbrains.annotations.NotNull;
import y1.C10822c;

/* loaded from: classes.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final C10822c f105910a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final C10822c f105911b;

    /* renamed from: c, reason: collision with root package name */
    private long f105912c;

    public d() {
        C10822c.a aVar = C10822c.a.Lsq2;
        this.f105910a = new C10822c(aVar);
        this.f105911b = new C10822c(aVar);
    }

    public final void a(long j11, long j12) {
        this.f105910a.a(C7459e.g(j12), j11);
        this.f105911b.a(C7459e.h(j12), j11);
    }

    public final long b(long j11) {
        if (w.c(j11) > 0.0f && w.d(j11) > 0.0f) {
            return Fl0.b.a(this.f105910a.b(w.c(j11)), this.f105911b.b(w.d(j11)));
        }
        A1.a.b("maximumVelocity should be a positive value. You specified=" + ((Object) w.h(j11)));
        throw null;
    }

    public final long c() {
        return this.f105912c;
    }

    public final void d() {
        this.f105910a.c();
        this.f105911b.c();
        this.f105912c = 0L;
    }

    public final void e(long j11) {
        this.f105912c = j11;
    }
}
