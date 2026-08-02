package x;

import android.view.Surface;
import androidx.annotation.NonNull;
import java.util.Objects;
import x.g;

/* loaded from: classes8.dex */
class l implements g.a {

    /* renamed from: a, reason: collision with root package name */
    final Object f104653a;

    private static final class a {

        /* renamed from: a, reason: collision with root package name */
        String f104654a;

        /* renamed from: b, reason: collision with root package name */
        boolean f104655b;

        public final boolean equals(Object obj) {
            if (!(obj instanceof a)) {
                return false;
            }
            ((a) obj).getClass();
            throw null;
        }

        public final int hashCode() {
            throw null;
        }
    }

    l(@NonNull Object obj) {
        this.f104653a = obj;
    }

    @Override // x.g.a
    public Surface a() {
        ((a) this.f104653a).getClass();
        throw null;
    }

    @Override // x.g.a
    public void b(@NonNull Surface surface) {
        if (a() == surface) {
            throw new IllegalStateException("Surface is already added!");
        }
        if (!j()) {
            throw new IllegalStateException("Cannot have 2 surfaces for a non-sharing configuration");
        }
        throw new IllegalArgumentException("Exceeds maximum number of surfaces");
    }

    @Override // x.g.a
    public String c() {
        return ((a) this.f104653a).f104654a;
    }

    @Override // x.g.a
    public void d() {
        ((a) this.f104653a).f104655b = true;
    }

    @Override // x.g.a
    public void e(long j11) {
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof l)) {
            return false;
        }
        return Objects.equals(this.f104653a, ((l) obj).f104653a);
    }

    @Override // x.g.a
    public void f(long j11) {
        ((a) this.f104653a).getClass();
    }

    @Override // x.g.a
    public void g(String str) {
        ((a) this.f104653a).f104654a = str;
    }

    @Override // x.g.a
    public void h(int i11) {
    }

    public int hashCode() {
        return this.f104653a.hashCode();
    }

    @Override // x.g.a
    public Object i() {
        return null;
    }

    boolean j() {
        return ((a) this.f104653a).f104655b;
    }
}
