package bo.app;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class i0 implements t9 {

    /* renamed from: a, reason: collision with root package name */
    public final String f25539a;

    /* renamed from: b, reason: collision with root package name */
    public final d9 f25540b;

    public i0(String str, d9 originalRequest) {
        Intrinsics.checkNotNullParameter(originalRequest, "originalRequest");
        this.f25539a = str;
        this.f25540b = originalRequest;
    }

    @Override // bo.app.t9
    public final String a() {
        return this.f25539a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i0)) {
            return false;
        }
        i0 i0Var = (i0) obj;
        return Intrinsics.areEqual(this.f25539a, i0Var.f25539a) && Intrinsics.areEqual(this.f25540b, i0Var.f25540b);
    }

    public final int hashCode() {
        String str = this.f25539a;
        return this.f25540b.hashCode() + ((str == null ? 0 : str.hashCode()) * 31);
    }

    public final String toString() {
        return "BasicResponseError(errorMessage=" + this.f25539a + ", originalRequest=" + this.f25540b + ")";
    }
}
