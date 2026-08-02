package u0;

import S0.C3991w0;
import S0.D1;
import S0.n1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes8.dex */
final class H implements C1.d, C1.j {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final C3991w0 f99604a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final J f99605b;

    public H(@NotNull J j11) {
        this();
        this.f99605b = j11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof H) {
            return Intrinsics.d(((H) obj).f99605b, this.f99605b);
        }
        return false;
    }

    @Override // C1.j
    @NotNull
    public final C1.m getKey() {
        return O.b();
    }

    @Override // C1.j
    public final Object getValue() {
        return (J) this.f99604a.getValue();
    }

    public final int hashCode() {
        return this.f99605b.hashCode();
    }

    @Override // C1.d
    public final void w1(@NotNull C1.l lVar) {
        this.f99604a.setValue(new G(this.f99605b, (J) lVar.G(O.b())));
    }

    private H() {
        C3991w0 f7;
        f7 = n1.f(new C9903l(), D1.f25195a);
        this.f99604a = f7;
    }
}
