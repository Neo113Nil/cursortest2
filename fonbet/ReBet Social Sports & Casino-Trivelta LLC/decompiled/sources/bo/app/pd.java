package bo.app;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class pd implements t9 {

    /* renamed from: a, reason: collision with root package name */
    public final d9 f25907a;

    /* renamed from: b, reason: collision with root package name */
    public final int f25908b;

    /* renamed from: c, reason: collision with root package name */
    public final String f25909c;

    /* renamed from: d, reason: collision with root package name */
    public final String f25910d;

    public pd(d9 originalRequest, int i10, String str, String str2) {
        Intrinsics.checkNotNullParameter(originalRequest, "originalRequest");
        this.f25907a = originalRequest;
        this.f25908b = i10;
        this.f25909c = str;
        this.f25910d = str2;
    }

    @Override // bo.app.t9
    public final String a() {
        return this.f25910d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pd)) {
            return false;
        }
        pd pdVar = (pd) obj;
        return Intrinsics.areEqual(this.f25907a, pdVar.f25907a) && this.f25908b == pdVar.f25908b && Intrinsics.areEqual(this.f25909c, pdVar.f25909c) && Intrinsics.areEqual(this.f25910d, pdVar.f25910d);
    }

    public final int hashCode() {
        int hashCode = (Integer.hashCode(this.f25908b) + (this.f25907a.hashCode() * 31)) * 31;
        String str = this.f25909c;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f25910d;
        return hashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        return "{code = " + this.f25908b + ", reason = " + this.f25909c + ", message = " + this.f25910d + "}";
    }
}
