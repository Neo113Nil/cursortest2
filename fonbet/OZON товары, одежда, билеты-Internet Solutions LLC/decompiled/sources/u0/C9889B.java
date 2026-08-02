package u0;

import Kk.C3532b;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* renamed from: u0.B, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C9889B {

    /* renamed from: a, reason: collision with root package name */
    private float f99596a;

    /* renamed from: b, reason: collision with root package name */
    private boolean f99597b;

    /* renamed from: c, reason: collision with root package name */
    private androidx.compose.foundation.layout.r f99598c;

    public C9889B() {
        this(0);
    }

    public final androidx.compose.foundation.layout.r a() {
        return this.f99598c;
    }

    public final boolean b() {
        return this.f99597b;
    }

    public final float c() {
        return this.f99596a;
    }

    public final void d(androidx.compose.foundation.layout.r rVar) {
        this.f99598c = rVar;
    }

    public final void e(boolean z11) {
        this.f99597b = z11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C9889B)) {
            return false;
        }
        C9889B c9889b = (C9889B) obj;
        return Float.compare(this.f99596a, c9889b.f99596a) == 0 && this.f99597b == c9889b.f99597b && Intrinsics.d(this.f99598c, c9889b.f99598c);
    }

    public final void f(float f7) {
        this.f99596a = f7;
    }

    public final int hashCode() {
        int a11 = C3532b.a(Float.hashCode(this.f99596a) * 31, 31, this.f99597b);
        androidx.compose.foundation.layout.r rVar = this.f99598c;
        return (a11 + (rVar == null ? 0 : rVar.hashCode())) * 31;
    }

    @NotNull
    public final String toString() {
        return "RowColumnParentData(weight=" + this.f99596a + ", fill=" + this.f99597b + ", crossAxisAlignment=" + this.f99598c + ", flowLayoutData=null)";
    }

    public C9889B(int i11) {
        this.f99596a = 0.0f;
        this.f99597b = true;
        this.f99598c = null;
    }
}
