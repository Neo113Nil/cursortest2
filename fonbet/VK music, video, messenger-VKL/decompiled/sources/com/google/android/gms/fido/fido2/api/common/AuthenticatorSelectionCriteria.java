package com.google.android.gms.fido.fido2.api.common;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.fido.fido2.api.common.Attachment;
import com.google.android.gms.fido.fido2.api.common.ResidentKeyRequirement;
import java.util.Arrays;
import xsna.dq70;
import xsna.el01;
import xsna.i5s;
import xsna.l4;
import xsna.ozg0;
import xsna.t33;

/* compiled from: com.google.android.gms:play-services-fido@@21.0.0 */
/* loaded from: classes12.dex */
public class AuthenticatorSelectionCriteria extends AbstractSafeParcelable {

    @NonNull
    public static final Parcelable.Creator<AuthenticatorSelectionCriteria> CREATOR = new el01();

    @Nullable
    public final Attachment b;

    @Nullable
    public final Boolean c;

    @Nullable
    public final UserVerificationRequirement d;

    @Nullable
    public final ResidentKeyRequirement e;

    public AuthenticatorSelectionCriteria(@Nullable Boolean bool, @Nullable String str, @Nullable String str2, @Nullable String str3) {
        Attachment a;
        ResidentKeyRequirement residentKeyRequirement = null;
        if (str == null) {
            a = null;
        } else {
            try {
                a = Attachment.a(str);
            } catch (Attachment.UnsupportedAttachmentException | ResidentKeyRequirement.UnsupportedResidentKeyRequirementException | zzbc e) {
                throw new IllegalArgumentException(e);
            }
        }
        this.b = a;
        this.c = bool;
        this.d = str2 == null ? null : UserVerificationRequirement.a(str2);
        if (str3 != null) {
            residentKeyRequirement = ResidentKeyRequirement.a(str3);
        }
        this.e = residentKeyRequirement;
    }

    public final boolean equals(@Nullable Object obj) {
        if (!(obj instanceof AuthenticatorSelectionCriteria)) {
            return false;
        }
        AuthenticatorSelectionCriteria authenticatorSelectionCriteria = (AuthenticatorSelectionCriteria) obj;
        return dq70.b(this.b, authenticatorSelectionCriteria.b) && dq70.b(this.c, authenticatorSelectionCriteria.c) && dq70.b(this.d, authenticatorSelectionCriteria.d) && dq70.b(i(), authenticatorSelectionCriteria.i());
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.b, this.c, this.d, i()});
    }

    @Nullable
    public final ResidentKeyRequirement i() {
        ResidentKeyRequirement residentKeyRequirement = this.e;
        if (residentKeyRequirement != null) {
            return residentKeyRequirement;
        }
        Boolean bool = this.c;
        if (bool == null || !bool.booleanValue()) {
            return null;
        }
        return ResidentKeyRequirement.RESIDENT_KEY_REQUIRED;
    }

    @NonNull
    public final String toString() {
        String valueOf = String.valueOf(this.b);
        String valueOf2 = String.valueOf(this.d);
        String valueOf3 = String.valueOf(this.e);
        StringBuilder a = t33.a("AuthenticatorSelectionCriteria{\n attachment=", valueOf, ", \n requireResidentKey=");
        l4.i(this.c, ", \n requireUserVerification=", valueOf2, ", \n residentKeyRequirement=", a);
        return i5s.a(a, valueOf3, "\n }");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NonNull Parcel parcel, int i) {
        int w = ozg0.w(20293, parcel);
        Attachment attachment = this.b;
        ozg0.q(parcel, 2, attachment == null ? null : attachment.toString(), false);
        ozg0.c(parcel, 3, this.c);
        UserVerificationRequirement userVerificationRequirement = this.d;
        ozg0.q(parcel, 4, userVerificationRequirement == null ? null : userVerificationRequirement.toString(), false);
        ResidentKeyRequirement i2 = i();
        ozg0.q(parcel, 5, i2 != null ? i2.toString() : null, false);
        ozg0.x(w, parcel);
    }
}
