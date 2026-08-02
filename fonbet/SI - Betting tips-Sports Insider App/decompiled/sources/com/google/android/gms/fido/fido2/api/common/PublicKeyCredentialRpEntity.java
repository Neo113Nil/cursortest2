package com.google.android.gms.fido.fido2.api.common;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import d9.e;
import g6.v;
import h8.b;
import java.util.Arrays;
import y6.l;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public class PublicKeyCredentialRpEntity extends AbstractSafeParcelable {

    @NonNull
    public static final Parcelable.Creator<PublicKeyCredentialRpEntity> CREATOR = new l(4);

    /* renamed from: a, reason: collision with root package name */
    public final String f4743a;

    /* renamed from: b, reason: collision with root package name */
    public final String f4744b;

    /* renamed from: c, reason: collision with root package name */
    public final String f4745c;

    public PublicKeyCredentialRpEntity(String str, String str2, String str3) {
        v.h(str);
        this.f4743a = str;
        v.h(str2);
        this.f4744b = str2;
        this.f4745c = str3;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof PublicKeyCredentialRpEntity)) {
            return false;
        }
        PublicKeyCredentialRpEntity publicKeyCredentialRpEntity = (PublicKeyCredentialRpEntity) obj;
        return v.k(this.f4743a, publicKeyCredentialRpEntity.f4743a) && v.k(this.f4744b, publicKeyCredentialRpEntity.f4744b) && v.k(this.f4745c, publicKeyCredentialRpEntity.f4745c);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f4743a, this.f4744b, this.f4745c});
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("PublicKeyCredentialRpEntity{\n id='");
        sb2.append(this.f4743a);
        sb2.append("', \n name='");
        sb2.append(this.f4744b);
        sb2.append("', \n icon='");
        return e.l(sb2, this.f4745c, "'}");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i5) {
        int V = b.V(parcel, 20293);
        b.O(parcel, 2, this.f4743a, false);
        b.O(parcel, 3, this.f4744b, false);
        b.O(parcel, 4, this.f4745c, false);
        b.W(parcel, V);
    }
}
