package com.google.android.gms.fido.fido2.api.common;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.util.Base64Utils;
import com.google.android.gms.internal.fido.zzgx;
import defpackage.mz1;
import defpackage.wt3;
import defpackage.xgo;
import java.util.Arrays;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@SafeParcelable.Class
@SafeParcelable.Reserved
/* loaded from: classes3.dex */
public class PublicKeyCredentialUserEntity extends AbstractSafeParcelable {

    @NonNull
    public static final Parcelable.Creator<PublicKeyCredentialUserEntity> CREATOR = new zzau();
    public final xgo a;
    public final String b;
    public final String c;
    public final String d;

    public PublicKeyCredentialUserEntity(byte[] bArr, String str, String str2, String str3) {
        Preconditions.i(bArr);
        this.a = zzgx.r(bArr.length, bArr);
        Preconditions.i(str);
        this.b = str;
        this.c = str2;
        Preconditions.i(str3);
        this.d = str3;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof PublicKeyCredentialUserEntity)) {
            return false;
        }
        PublicKeyCredentialUserEntity publicKeyCredentialUserEntity = (PublicKeyCredentialUserEntity) obj;
        return Objects.a(this.a, publicKeyCredentialUserEntity.a) && Objects.a(this.b, publicKeyCredentialUserEntity.b) && Objects.a(this.c, publicKeyCredentialUserEntity.c) && Objects.a(this.d, publicKeyCredentialUserEntity.d);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b, this.c, this.d});
    }

    public final String toString() {
        StringBuilder q = wt3.q("PublicKeyCredentialUserEntity{\n id=", Base64Utils.b(this.a.s()), ", \n name='");
        q.append(this.b);
        q.append("', \n icon='");
        q.append(this.c);
        q.append("', \n displayName='");
        return mz1.o(q, this.d, "'}");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int s = SafeParcelWriter.s(parcel, 20293);
        SafeParcelWriter.c(parcel, 2, this.a.s(), false);
        SafeParcelWriter.m(parcel, 3, this.b, false);
        SafeParcelWriter.m(parcel, 4, this.c, false);
        SafeParcelWriter.m(parcel, 5, this.d, false);
        SafeParcelWriter.t(parcel, s);
    }
}
