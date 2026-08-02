package com.google.android.gms.fido.fido2.api.common;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.internal.fido.zzgx;
import java.util.Arrays;
import xsna.dq70;
import xsna.exc0;
import xsna.i5s;
import xsna.k46;
import xsna.ozg0;
import xsna.t33;
import xsna.wzz0;

/* compiled from: com.google.android.gms:play-services-fido@@21.0.0 */
/* loaded from: classes12.dex */
public class PublicKeyCredentialUserEntity extends AbstractSafeParcelable {

    @NonNull
    public static final Parcelable.Creator<PublicKeyCredentialUserEntity> CREATOR = new wzz0();

    @NonNull
    public final zzgx b;

    @NonNull
    public final String c;

    @Nullable
    public final String d;

    @NonNull
    public final String e;

    public PublicKeyCredentialUserEntity(zzgx zzgxVar, String str, @Nullable String str2, String str3) {
        exc0.i(zzgxVar);
        this.b = zzgxVar;
        exc0.i(str);
        this.c = str;
        this.d = str2;
        exc0.i(str3);
        this.e = str3;
    }

    public final boolean equals(@Nullable Object obj) {
        if (!(obj instanceof PublicKeyCredentialUserEntity)) {
            return false;
        }
        PublicKeyCredentialUserEntity publicKeyCredentialUserEntity = (PublicKeyCredentialUserEntity) obj;
        return dq70.b(this.b, publicKeyCredentialUserEntity.b) && dq70.b(this.c, publicKeyCredentialUserEntity.c) && dq70.b(this.d, publicKeyCredentialUserEntity.d) && dq70.b(this.e, publicKeyCredentialUserEntity.e);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.b, this.c, this.d, this.e});
    }

    @NonNull
    public final String toString() {
        StringBuilder a = t33.a("PublicKeyCredentialUserEntity{\n id=", k46.c(this.b.zzm()), ", \n name='");
        a.append(this.c);
        a.append("', \n icon='");
        a.append(this.d);
        a.append("', \n displayName='");
        return i5s.a(a, this.e, "'}");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NonNull Parcel parcel, int i) {
        int w = ozg0.w(20293, parcel);
        ozg0.e(parcel, 2, this.b.zzm(), false);
        ozg0.q(parcel, 3, this.c, false);
        ozg0.q(parcel, 4, this.d, false);
        ozg0.q(parcel, 5, this.e, false);
        ozg0.x(w, parcel);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public PublicKeyCredentialUserEntity(@NonNull byte[] bArr, @NonNull String str, @Nullable String str2, @NonNull String str3) {
        this(zzgx.zzl(bArr, 0, bArr.length), str, str2, str3);
        exc0.i(bArr);
    }
}
