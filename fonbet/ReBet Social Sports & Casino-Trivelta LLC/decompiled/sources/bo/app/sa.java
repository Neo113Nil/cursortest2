package bo.app;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class sa implements t9 {

    /* renamed from: a, reason: collision with root package name */
    public final String f26046a;

    /* renamed from: b, reason: collision with root package name */
    public final d9 f26047b;

    public sa(String str, d9 originalRequest) {
        Intrinsics.checkNotNullParameter(originalRequest, "originalRequest");
        this.f26046a = str;
        this.f26047b = originalRequest;
    }

    @Override // bo.app.t9
    public final String a() {
        return this.f26046a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof sa)) {
            return false;
        }
        sa saVar = (sa) obj;
        return Intrinsics.areEqual(this.f26046a, saVar.f26046a) && Intrinsics.areEqual(this.f26047b, saVar.f26047b);
    }

    public final int hashCode() {
        String str = this.f26046a;
        return this.f26047b.hashCode() + ((str == null ? 0 : str.hashCode()) * 31);
    }

    public final String toString() {
        return "InvalidApiKeyError(errorMessage=" + this.f26046a + ", originalRequest=" + this.f26047b + ")";
    }
}
