package f9;

import com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbki;

/* loaded from: classes9.dex */
final class c extends m {

    /* renamed from: a, reason: collision with root package name */
    private final int f62993a;

    /* renamed from: b, reason: collision with root package name */
    private final zbki f62994b;

    c(int i11, zbki zbkiVar) {
        this.f62993a = i11;
        this.f62994b = zbkiVar;
    }

    @Override // f9.m
    public final int a() {
        return this.f62993a;
    }

    @Override // f9.m
    public final zbki b() {
        return this.f62994b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof m)) {
            return false;
        }
        m mVar = (m) obj;
        return this.f62993a == mVar.a() && this.f62994b.equals(mVar.b());
    }

    public final int hashCode() {
        return ((this.f62993a ^ 1000003) * 1000003) ^ this.f62994b.hashCode();
    }

    public final String toString() {
        return "VkpStatus{exceptionType=" + this.f62993a + ", remoteException=" + this.f62994b.toString() + "}";
    }
}
