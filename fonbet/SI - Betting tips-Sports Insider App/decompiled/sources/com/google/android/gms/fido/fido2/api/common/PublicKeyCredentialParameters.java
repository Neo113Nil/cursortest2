package com.google.android.gms.fido.fido2.api.common;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import g6.v;
import h8.b;
import java.util.Arrays;
import y6.d;
import y6.h;
import y6.l;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public class PublicKeyCredentialParameters extends AbstractSafeParcelable {

    @NonNull
    public static final Parcelable.Creator<PublicKeyCredentialParameters> CREATOR = new l(2);

    /* renamed from: a, reason: collision with root package name */
    public final PublicKeyCredentialType f4732a;

    /* renamed from: b, reason: collision with root package name */
    public final COSEAlgorithmIdentifier f4733b;

    public PublicKeyCredentialParameters(String str, int i5) {
        v.h(str);
        try {
            this.f4732a = PublicKeyCredentialType.a(str);
            try {
                this.f4733b = COSEAlgorithmIdentifier.a(i5);
            } catch (d e7) {
                throw new IllegalArgumentException(e7);
            }
        } catch (h e9) {
            throw new IllegalArgumentException(e9);
        }
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof PublicKeyCredentialParameters)) {
            return false;
        }
        PublicKeyCredentialParameters publicKeyCredentialParameters = (PublicKeyCredentialParameters) obj;
        return this.f4732a.equals(publicKeyCredentialParameters.f4732a) && this.f4733b.equals(publicKeyCredentialParameters.f4733b);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f4732a, this.f4733b});
    }

    public final String toString() {
        return "PublicKeyCredentialParameters{\n type=" + String.valueOf(this.f4732a) + ", \n algorithm=" + String.valueOf(this.f4733b) + "\n }";
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Enum, y6.a] */
    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i5) {
        int V = b.V(parcel, 20293);
        this.f4732a.getClass();
        b.O(parcel, 2, "public-key", false);
        b.K(parcel, 3, Integer.valueOf(this.f4733b.f4684a.a()));
        b.W(parcel, V);
    }
}
