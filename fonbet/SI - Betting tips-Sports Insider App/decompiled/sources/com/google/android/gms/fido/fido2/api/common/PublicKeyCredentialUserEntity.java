package com.google.android.gms.fido.fido2.api.common;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import d9.e;
import g6.v;
import java.util.Arrays;
import k7.r0;
import q6.b;
import y6.l;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public class PublicKeyCredentialUserEntity extends AbstractSafeParcelable {

    @NonNull
    public static final Parcelable.Creator<PublicKeyCredentialUserEntity> CREATOR = new l(6);

    /* renamed from: a, reason: collision with root package name */
    public final r0 f4747a;

    /* renamed from: b, reason: collision with root package name */
    public final String f4748b;

    /* renamed from: c, reason: collision with root package name */
    public final String f4749c;

    /* renamed from: d, reason: collision with root package name */
    public final String f4750d;

    public PublicKeyCredentialUserEntity(String str, String str2, String str3, byte[] bArr) {
        v.h(bArr);
        this.f4747a = r0.h(bArr.length, bArr);
        v.h(str);
        this.f4748b = str;
        this.f4749c = str2;
        v.h(str3);
        this.f4750d = str3;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof PublicKeyCredentialUserEntity)) {
            return false;
        }
        PublicKeyCredentialUserEntity publicKeyCredentialUserEntity = (PublicKeyCredentialUserEntity) obj;
        return v.k(this.f4747a, publicKeyCredentialUserEntity.f4747a) && v.k(this.f4748b, publicKeyCredentialUserEntity.f4748b) && v.k(this.f4749c, publicKeyCredentialUserEntity.f4749c) && v.k(this.f4750d, publicKeyCredentialUserEntity.f4750d);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f4747a, this.f4748b, this.f4749c, this.f4750d});
    }

    public final String toString() {
        StringBuilder p10 = e.p("PublicKeyCredentialUserEntity{\n id=", b.c(this.f4747a.i()), ", \n name='");
        p10.append(this.f4748b);
        p10.append("', \n icon='");
        p10.append(this.f4749c);
        p10.append("', \n displayName='");
        return e.l(p10, this.f4750d, "'}");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i5) {
        int V = h8.b.V(parcel, 20293);
        h8.b.G(parcel, 2, this.f4747a.i(), false);
        h8.b.O(parcel, 3, this.f4748b, false);
        h8.b.O(parcel, 4, this.f4749c, false);
        h8.b.O(parcel, 5, this.f4750d, false);
        h8.b.W(parcel, V);
    }
}
