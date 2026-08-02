package bo.app;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class ke implements t9 {

    /* renamed from: a, reason: collision with root package name */
    public final d9 f25671a;

    /* renamed from: b, reason: collision with root package name */
    public final int f25672b;

    /* renamed from: c, reason: collision with root package name */
    public final String f25673c;

    public ke(d9 originalRequest, int i10, String str) {
        Intrinsics.checkNotNullParameter(originalRequest, "originalRequest");
        this.f25671a = originalRequest;
        this.f25672b = i10;
        this.f25673c = str;
    }

    @Override // bo.app.t9
    public final String a() {
        return null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ke)) {
            return false;
        }
        ke keVar = (ke) obj;
        return Intrinsics.areEqual(this.f25671a, keVar.f25671a) && this.f25672b == keVar.f25672b && Intrinsics.areEqual(this.f25673c, keVar.f25673c);
    }

    public final int hashCode() {
        int hashCode = (Integer.hashCode(this.f25672b) + (this.f25671a.hashCode() * 31)) * 31;
        String str = this.f25673c;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        return "{code = " + this.f25672b + ", reason = " + this.f25673c + "}";
    }
}
