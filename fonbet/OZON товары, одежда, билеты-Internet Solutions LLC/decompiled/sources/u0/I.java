package u0;

import S0.C3991w0;
import S0.D1;
import S0.n1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes8.dex */
public final class I implements J {

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final String f99606b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final C3991w0 f99607c;

    public I(@NotNull r rVar, @NotNull String str) {
        C3991w0 f7;
        this.f99606b = str;
        f7 = n1.f(rVar, D1.f25195a);
        this.f99607c = f7;
    }

    @Override // u0.J
    public final int a(@NotNull Z1.d dVar, @NotNull Z1.s sVar) {
        return e().b();
    }

    @Override // u0.J
    public final int b(@NotNull Z1.d dVar) {
        return e().a();
    }

    @Override // u0.J
    public final int c(@NotNull Z1.d dVar) {
        return e().d();
    }

    @Override // u0.J
    public final int d(@NotNull Z1.d dVar, @NotNull Z1.s sVar) {
        return e().c();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @NotNull
    public final r e() {
        return (r) this.f99607c.getValue();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof I) {
            return Intrinsics.d(e(), ((I) obj).e());
        }
        return false;
    }

    public final void f(@NotNull r rVar) {
        this.f99607c.setValue(rVar);
    }

    public final int hashCode() {
        return this.f99606b.hashCode();
    }

    @NotNull
    public final String toString() {
        return this.f99606b + "(left=" + e().b() + ", top=" + e().d() + ", right=" + e().c() + ", bottom=" + e().a() + ')';
    }
}
