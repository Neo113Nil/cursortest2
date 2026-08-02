package com.google.android.gms.fido.fido2.api.common;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.fido.fido2.api.common.Attachment;
import com.google.android.gms.fido.fido2.api.common.ResidentKeyRequirement;
import defpackage.ilg;
import defpackage.mz1;
import defpackage.wt3;
import java.util.Arrays;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@SafeParcelable.Class
@SafeParcelable.Reserved
/* loaded from: classes3.dex */
public class AuthenticatorSelectionCriteria extends AbstractSafeParcelable {

    @NonNull
    public static final Parcelable.Creator<AuthenticatorSelectionCriteria> CREATOR = new zzm();
    public final Attachment a;
    public final Boolean b;
    public final UserVerificationRequirement c;
    public final ResidentKeyRequirement d;

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    public static class Builder {
    }

    public AuthenticatorSelectionCriteria(String str, String str2, String str3, Boolean bool) {
        Attachment a;
        if (str == null) {
            a = null;
        } else {
            try {
                a = Attachment.a(str);
            } catch (Attachment.UnsupportedAttachmentException | ResidentKeyRequirement.UnsupportedResidentKeyRequirementException | zzbc e) {
                ilg.k(e);
                throw null;
            }
        }
        this.a = a;
        this.b = bool;
        this.c = str2 == null ? null : UserVerificationRequirement.a(str2);
        this.d = str3 == null ? null : ResidentKeyRequirement.a(str3);
    }

    public final ResidentKeyRequirement Y0() {
        ResidentKeyRequirement residentKeyRequirement = this.d;
        if (residentKeyRequirement == null) {
            residentKeyRequirement = null;
            Boolean bool = this.b;
            if (bool != null) {
                if (bool.booleanValue()) {
                    return ResidentKeyRequirement.RESIDENT_KEY_REQUIRED;
                }
                return null;
            }
        }
        return residentKeyRequirement;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof AuthenticatorSelectionCriteria)) {
            return false;
        }
        AuthenticatorSelectionCriteria authenticatorSelectionCriteria = (AuthenticatorSelectionCriteria) obj;
        return Objects.a(this.a, authenticatorSelectionCriteria.a) && Objects.a(this.b, authenticatorSelectionCriteria.b) && Objects.a(this.c, authenticatorSelectionCriteria.c) && Objects.a(Y0(), authenticatorSelectionCriteria.Y0());
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b, this.c, Y0()});
    }

    public final String toString() {
        String valueOf = String.valueOf(this.a);
        String valueOf2 = String.valueOf(this.c);
        String valueOf3 = String.valueOf(this.d);
        StringBuilder q = wt3.q("AuthenticatorSelectionCriteria{\n attachment=", valueOf, ", \n requireResidentKey=");
        q.append(this.b);
        q.append(", \n requireUserVerification=");
        q.append(valueOf2);
        q.append(", \n residentKeyRequirement=");
        return mz1.o(q, valueOf3, "\n }");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int s = SafeParcelWriter.s(parcel, 20293);
        Attachment attachment = this.a;
        SafeParcelWriter.m(parcel, 2, attachment == null ? null : attachment.a, false);
        SafeParcelWriter.a(parcel, 3, this.b);
        UserVerificationRequirement userVerificationRequirement = this.c;
        SafeParcelWriter.m(parcel, 4, userVerificationRequirement == null ? null : userVerificationRequirement.a, false);
        ResidentKeyRequirement Y0 = Y0();
        SafeParcelWriter.m(parcel, 5, Y0 != null ? Y0.a : null, false);
        SafeParcelWriter.t(parcel, s);
    }
}
