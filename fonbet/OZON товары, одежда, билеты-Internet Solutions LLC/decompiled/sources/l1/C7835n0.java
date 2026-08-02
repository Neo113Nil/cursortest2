package l1;

import android.graphics.Shader;
import java.util.ArrayList;
import java.util.List;
import k1.C7459e;
import k1.C7464j;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* renamed from: l1.n0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C7835n0 extends F0 {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final List<C7807Z> f72270a;

    /* renamed from: b, reason: collision with root package name */
    private final ArrayList f72271b;

    /* renamed from: c, reason: collision with root package name */
    private final long f72272c;

    /* renamed from: d, reason: collision with root package name */
    private final long f72273d;

    private C7835n0() {
        throw null;
    }

    public C7835n0(long j11, long j12, ArrayList arrayList, List list) {
        this.f72270a = list;
        this.f72271b = arrayList;
        this.f72272c = j11;
        this.f72273d = j12;
    }

    @Override // l1.F0
    @NotNull
    /* renamed from: createShader-uvyYCjk */
    public final Shader mo70createShaderuvyYCjk(long j11) {
        long j12 = this.f72272c;
        float f7 = C7459e.g(j12) == Float.POSITIVE_INFINITY ? C7464j.f(j11) : C7459e.g(j12);
        float d11 = C7459e.h(j12) == Float.POSITIVE_INFINITY ? C7464j.d(j11) : C7459e.h(j12);
        long j13 = this.f72273d;
        return G0.a(P9.a.a(f7, d11), P9.a.a(C7459e.g(j13) == Float.POSITIVE_INFINITY ? C7464j.f(j11) : C7459e.g(j13), C7459e.h(j13) == Float.POSITIVE_INFINITY ? C7464j.d(j11) : C7459e.h(j13)), this.f72271b, this.f72270a);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C7835n0)) {
            return false;
        }
        C7835n0 c7835n0 = (C7835n0) obj;
        return Intrinsics.d(this.f72270a, c7835n0.f72270a) && Intrinsics.d(this.f72271b, c7835n0.f72271b) && C7459e.d(this.f72272c, c7835n0.f72272c) && C7459e.d(this.f72273d, c7835n0.f72273d);
    }

    public final int hashCode() {
        int hashCode = this.f72270a.hashCode() * 31;
        ArrayList arrayList = this.f72271b;
        return Integer.hashCode(0) + Pk0.c.a(Pk0.c.a((hashCode + (arrayList != null ? arrayList.hashCode() : 0)) * 31, 31, this.f72272c), 31, this.f72273d);
    }

    @NotNull
    public final String toString() {
        String str;
        long j11 = this.f72272c;
        String str2 = "";
        if (P9.a.c(j11)) {
            str = "start=" + ((Object) C7459e.m(j11)) + ", ";
        } else {
            str = "";
        }
        long j12 = this.f72273d;
        if (P9.a.c(j12)) {
            str2 = "end=" + ((Object) C7459e.m(j12)) + ", ";
        }
        return "LinearGradient(colors=" + this.f72270a + ", stops=" + this.f72271b + ", " + str + str2 + "tileMode=" + ((Object) L0.a(0)) + ')';
    }
}
