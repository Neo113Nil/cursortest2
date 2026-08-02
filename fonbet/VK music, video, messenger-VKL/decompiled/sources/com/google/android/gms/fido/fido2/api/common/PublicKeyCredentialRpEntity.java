package com.google.android.gms.fido.fido2.api.common;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.Arrays;
import xsna.dq70;
import xsna.exc0;
import xsna.i5s;
import xsna.izz0;
import xsna.ozg0;

/* compiled from: com.google.android.gms:play-services-fido@@21.0.0 */
/* loaded from: classes12.dex */
public class PublicKeyCredentialRpEntity extends AbstractSafeParcelable {

    @NonNull
    public static final Parcelable.Creator<PublicKeyCredentialRpEntity> CREATOR = new izz0();

    @NonNull
    public final String b;

    @NonNull
    public final String c;

    @Nullable
    public final String d;

    public PublicKeyCredentialRpEntity(@NonNull String str, @NonNull String str2, @Nullable String str3) {
        exc0.i(str);
        this.b = str;
        exc0.i(str2);
        this.c = str2;
        this.d = str3;
    }

    public final boolean equals(@Nullable Object obj) {
        if (!(obj instanceof PublicKeyCredentialRpEntity)) {
            return false;
        }
        PublicKeyCredentialRpEntity publicKeyCredentialRpEntity = (PublicKeyCredentialRpEntity) obj;
        return dq70.b(this.b, publicKeyCredentialRpEntity.b) && dq70.b(this.c, publicKeyCredentialRpEntity.c) && dq70.b(this.d, publicKeyCredentialRpEntity.d);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.b, this.c, this.d});
    }

    @NonNull
    public final String toString() {
        StringBuilder sb = new StringBuilder("PublicKeyCredentialRpEntity{\n id='");
        sb.append(this.b);
        sb.append("', \n name='");
        sb.append(this.c);
        sb.append("', \n icon='");
        return i5s.a(sb, this.d, "'}");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NonNull Parcel parcel, int i) {
        int w = ozg0.w(20293, parcel);
        ozg0.q(parcel, 2, this.b, false);
        ozg0.q(parcel, 3, this.c, false);
        ozg0.q(parcel, 4, this.d, false);
        ozg0.x(w, parcel);
    }
}
