package l1;

import E0.C2942q;
import android.graphics.Shader;
import java.util.ArrayList;
import java.util.List;
import k1.C7459e;
import k1.C7464j;
import k1.C7465k;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes8.dex */
public final class w0 extends F0 {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final List<C7807Z> f72289a;

    /* renamed from: b, reason: collision with root package name */
    private final ArrayList f72290b;

    /* renamed from: c, reason: collision with root package name */
    private final long f72291c;

    /* renamed from: d, reason: collision with root package name */
    private final float f72292d;

    private w0() {
        throw null;
    }

    public w0(float f7, long j11, ArrayList arrayList, List list) {
        this.f72289a = list;
        this.f72290b = arrayList;
        this.f72291c = j11;
        this.f72292d = f7;
    }

    @Override // l1.F0
    @NotNull
    /* renamed from: createShader-uvyYCjk */
    public final Shader mo70createShaderuvyYCjk(long j11) {
        float f7;
        float d11;
        long j12 = this.f72291c;
        if (P9.a.e(j12)) {
            long b11 = C7465k.b(j11);
            f7 = C7459e.g(b11);
            d11 = C7459e.h(b11);
        } else {
            f7 = C7459e.g(j12) == Float.POSITIVE_INFINITY ? C7464j.f(j11) : C7459e.g(j12);
            d11 = C7459e.h(j12) == Float.POSITIVE_INFINITY ? C7464j.d(j11) : C7459e.h(j12);
        }
        long a11 = P9.a.a(f7, d11);
        float f11 = this.f72292d;
        if (f11 == Float.POSITIVE_INFINITY) {
            f11 = C7464j.e(j11) / 2;
        }
        return C7791I.b(f11, a11, this.f72290b, this.f72289a);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof w0)) {
            return false;
        }
        w0 w0Var = (w0) obj;
        return Intrinsics.d(this.f72289a, w0Var.f72289a) && Intrinsics.d(this.f72290b, w0Var.f72290b) && C7459e.d(this.f72291c, w0Var.f72291c) && this.f72292d == w0Var.f72292d;
    }

    public final int hashCode() {
        int hashCode = this.f72289a.hashCode() * 31;
        ArrayList arrayList = this.f72290b;
        return Integer.hashCode(0) + Pk0.b.a(this.f72292d, Pk0.c.a((hashCode + (arrayList != null ? arrayList.hashCode() : 0)) * 31, 31, this.f72291c), 31);
    }

    @NotNull
    public final String toString() {
        String str;
        long j11 = this.f72291c;
        String str2 = "";
        if (P9.a.d(j11)) {
            str = "center=" + ((Object) C7459e.m(j11)) + ", ";
        } else {
            str = "";
        }
        float f7 = this.f72292d;
        if (!Float.isInfinite(f7) && !Float.isNaN(f7)) {
            str2 = C2942q.b(f7, "radius=", ", ");
        }
        return "RadialGradient(colors=" + this.f72289a + ", stops=" + this.f72290b + ", " + str + str2 + "tileMode=" + ((Object) L0.a(0)) + ')';
    }
}
