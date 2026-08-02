package k7;

import com.google.android.gms.fido.fido2.api.common.PublicKeyCredentialParameters;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class e extends d {

    /* renamed from: a, reason: collision with root package name */
    public final PublicKeyCredentialParameters f18855a;

    public e(PublicKeyCredentialParameters publicKeyCredentialParameters) {
        this.f18855a = publicKeyCredentialParameters;
    }

    @Override // k7.d
    public final Object a() {
        return this.f18855a;
    }

    @Override // k7.d
    public final boolean b() {
        return true;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof e) {
            return this.f18855a.equals(((e) obj).f18855a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f18855a.hashCode() + 1502476572;
    }

    public final String toString() {
        return androidx.appcompat.widget.c1.n("Optional.of(", this.f18855a.toString(), ")");
    }
}
