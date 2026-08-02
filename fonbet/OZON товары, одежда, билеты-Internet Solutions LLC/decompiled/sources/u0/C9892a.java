package u0;

import S0.C3991w0;
import S0.D1;
import S0.n1;
import androidx.core.view.C5353y0;
import org.jetbrains.annotations.NotNull;

/* renamed from: u0.a, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C9892a implements J {

    /* renamed from: b, reason: collision with root package name */
    private final int f99649b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final String f99650c;

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    private final C3991w0 f99651d;

    /* renamed from: e, reason: collision with root package name */
    @NotNull
    private final C3991w0 f99652e;

    public C9892a(int i11, @NotNull String str) {
        C3991w0 f7;
        C3991w0 f11;
        this.f99649b = i11;
        this.f99650c = str;
        f7 = n1.f(androidx.core.graphics.d.f42125e, D1.f25195a);
        this.f99651d = f7;
        f11 = n1.f(Boolean.TRUE, D1.f25195a);
        this.f99652e = f11;
    }

    @Override // u0.J
    public final int a(@NotNull Z1.d dVar, @NotNull Z1.s sVar) {
        return e().f42126a;
    }

    @Override // u0.J
    public final int b(@NotNull Z1.d dVar) {
        return e().f42129d;
    }

    @Override // u0.J
    public final int c(@NotNull Z1.d dVar) {
        return e().f42127b;
    }

    @Override // u0.J
    public final int d(@NotNull Z1.d dVar, @NotNull Z1.s sVar) {
        return e().f42128c;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @NotNull
    public final androidx.core.graphics.d e() {
        return (androidx.core.graphics.d) this.f99651d.getValue();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C9892a) {
            return this.f99649b == ((C9892a) obj).f99649b;
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean f() {
        return ((Boolean) this.f99652e.getValue()).booleanValue();
    }

    public final void g(@NotNull C5353y0 c5353y0, int i11) {
        int i12 = this.f99649b;
        if (i11 == 0 || (i11 & i12) != 0) {
            this.f99651d.setValue(c5353y0.f(i12));
            this.f99652e.setValue(Boolean.valueOf(c5353y0.p(i12)));
        }
    }

    public final int hashCode() {
        return this.f99649b;
    }

    @NotNull
    public final String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(this.f99650c);
        sb2.append('(');
        sb2.append(e().f42126a);
        sb2.append(", ");
        sb2.append(e().f42127b);
        sb2.append(", ");
        sb2.append(e().f42128c);
        sb2.append(", ");
        return Ek.a.d(sb2, e().f42129d, ')');
    }
}
