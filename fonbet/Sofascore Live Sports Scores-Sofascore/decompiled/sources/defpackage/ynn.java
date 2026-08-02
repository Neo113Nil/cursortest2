package defpackage;

import com.google.android.gms.fido.fido2.api.common.PublicKeyCredentialParameters;
import com.google.android.gms.internal.fido.zzbl;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class ynn extends zzbl {
    public final PublicKeyCredentialParameters a;

    public ynn(PublicKeyCredentialParameters publicKeyCredentialParameters) {
        this.a = publicKeyCredentialParameters;
    }

    @Override // com.google.android.gms.internal.fido.zzbl
    public final Object d() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof ynn) {
            return this.a.equals(((ynn) obj).a);
        }
        return false;
    }

    @Override // com.google.android.gms.internal.fido.zzbl
    public final boolean g() {
        return true;
    }

    public final int hashCode() {
        return this.a.hashCode() + 1502476572;
    }

    public final String toString() {
        return lnb.o("Optional.of(", this.a.toString(), ")");
    }
}
