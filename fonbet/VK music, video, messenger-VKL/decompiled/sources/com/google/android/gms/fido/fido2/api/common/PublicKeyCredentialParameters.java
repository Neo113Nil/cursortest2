package com.google.android.gms.fido.fido2.api.common;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.fido.fido2.api.common.COSEAlgorithmIdentifier;
import com.google.android.gms.fido.fido2.api.common.PublicKeyCredentialType;
import java.util.Arrays;
import xsna.exc0;
import xsna.ozg0;
import xsna.ss9;
import xsna.syz0;

/* compiled from: com.google.android.gms:play-services-fido@@21.0.0 */
/* loaded from: classes12.dex */
public class PublicKeyCredentialParameters extends AbstractSafeParcelable {

    @NonNull
    public static final Parcelable.Creator<PublicKeyCredentialParameters> CREATOR = new syz0();

    @NonNull
    public final PublicKeyCredentialType b;

    @NonNull
    public final COSEAlgorithmIdentifier c;

    public PublicKeyCredentialParameters(@NonNull String str, int i) {
        exc0.i(str);
        try {
            this.b = PublicKeyCredentialType.a(str);
            try {
                this.c = COSEAlgorithmIdentifier.a(i);
            } catch (COSEAlgorithmIdentifier.UnsupportedAlgorithmIdentifierException e) {
                throw new IllegalArgumentException(e);
            }
        } catch (PublicKeyCredentialType.UnsupportedPublicKeyCredTypeException e2) {
            throw new IllegalArgumentException(e2);
        }
    }

    public final boolean equals(@Nullable Object obj) {
        if (!(obj instanceof PublicKeyCredentialParameters)) {
            return false;
        }
        PublicKeyCredentialParameters publicKeyCredentialParameters = (PublicKeyCredentialParameters) obj;
        return this.b.equals(publicKeyCredentialParameters.b) && this.c.equals(publicKeyCredentialParameters.c);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.b, this.c});
    }

    @NonNull
    public final String toString() {
        return ss9.a("PublicKeyCredentialParameters{\n type=", String.valueOf(this.b), ", \n algorithm=", String.valueOf(this.c), "\n }");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NonNull Parcel parcel, int i) {
        int w = ozg0.w(20293, parcel);
        ozg0.q(parcel, 2, this.b.toString(), false);
        ozg0.k(parcel, 3, Integer.valueOf(this.c.b.h()));
        ozg0.x(w, parcel);
    }
}
