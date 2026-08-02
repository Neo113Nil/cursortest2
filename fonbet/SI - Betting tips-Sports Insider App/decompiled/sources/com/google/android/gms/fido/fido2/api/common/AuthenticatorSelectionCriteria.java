package com.google.android.gms.fido.fido2.api.common;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import d9.e;
import g6.v;
import java.util.Arrays;
import y6.b;
import y6.j;
import y6.l;
import y6.m;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public class AuthenticatorSelectionCriteria extends AbstractSafeParcelable {

    @NonNull
    public static final Parcelable.Creator<AuthenticatorSelectionCriteria> CREATOR = new l(23);

    /* renamed from: a, reason: collision with root package name */
    public final Attachment f4674a;

    /* renamed from: b, reason: collision with root package name */
    public final Boolean f4675b;

    /* renamed from: c, reason: collision with root package name */
    public final UserVerificationRequirement f4676c;

    /* renamed from: d, reason: collision with root package name */
    public final ResidentKeyRequirement f4677d;

    public AuthenticatorSelectionCriteria(String str, Boolean bool, String str2, String str3) {
        Attachment a7;
        ResidentKeyRequirement residentKeyRequirement = null;
        if (str == null) {
            a7 = null;
        } else {
            try {
                a7 = Attachment.a(str);
            } catch (b | j | m e7) {
                throw new IllegalArgumentException(e7);
            }
        }
        this.f4674a = a7;
        this.f4675b = bool;
        this.f4676c = str2 == null ? null : UserVerificationRequirement.a(str2);
        if (str3 != null) {
            residentKeyRequirement = ResidentKeyRequirement.a(str3);
        }
        this.f4677d = residentKeyRequirement;
    }

    public final ResidentKeyRequirement c() {
        ResidentKeyRequirement residentKeyRequirement = this.f4677d;
        if (residentKeyRequirement != null) {
            return residentKeyRequirement;
        }
        Boolean bool = this.f4675b;
        if (bool == null || !bool.booleanValue()) {
            return null;
        }
        return ResidentKeyRequirement.RESIDENT_KEY_REQUIRED;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof AuthenticatorSelectionCriteria)) {
            return false;
        }
        AuthenticatorSelectionCriteria authenticatorSelectionCriteria = (AuthenticatorSelectionCriteria) obj;
        return v.k(this.f4674a, authenticatorSelectionCriteria.f4674a) && v.k(this.f4675b, authenticatorSelectionCriteria.f4675b) && v.k(this.f4676c, authenticatorSelectionCriteria.f4676c) && v.k(c(), authenticatorSelectionCriteria.c());
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f4674a, this.f4675b, this.f4676c, c()});
    }

    public final String toString() {
        String valueOf = String.valueOf(this.f4674a);
        String valueOf2 = String.valueOf(this.f4676c);
        String valueOf3 = String.valueOf(this.f4677d);
        StringBuilder p10 = e.p("AuthenticatorSelectionCriteria{\n attachment=", valueOf, ", \n requireResidentKey=");
        p10.append(this.f4675b);
        p10.append(", \n requireUserVerification=");
        p10.append(valueOf2);
        p10.append(", \n residentKeyRequirement=");
        return e.l(p10, valueOf3, "\n }");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i5) {
        int V = h8.b.V(parcel, 20293);
        Attachment attachment = this.f4674a;
        h8.b.O(parcel, 2, attachment == null ? null : attachment.f4641a, false);
        Boolean bool = this.f4675b;
        if (bool != null) {
            h8.b.U(parcel, 3, 4);
            parcel.writeInt(bool.booleanValue() ? 1 : 0);
        }
        UserVerificationRequirement userVerificationRequirement = this.f4676c;
        h8.b.O(parcel, 4, userVerificationRequirement == null ? null : userVerificationRequirement.f4760a, false);
        ResidentKeyRequirement c2 = c();
        h8.b.O(parcel, 5, c2 != null ? c2.f4753a : null, false);
        h8.b.W(parcel, V);
    }
}
