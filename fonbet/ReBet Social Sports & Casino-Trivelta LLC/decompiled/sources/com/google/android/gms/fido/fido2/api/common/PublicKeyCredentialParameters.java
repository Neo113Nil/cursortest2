package com.google.android.gms.fido.fido2.api.common;

import R9.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import com.google.android.gms.common.internal.AbstractC3189m;
import com.google.android.gms.common.internal.AbstractC3191o;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.fido.fido2.api.common.COSEAlgorithmIdentifier;
import com.google.android.gms.fido.fido2.api.common.PublicKeyCredentialType;

/* loaded from: classes2.dex */
public class PublicKeyCredentialParameters extends AbstractSafeParcelable {

    @NonNull
    public static final Parcelable.Creator<PublicKeyCredentialParameters> CREATOR = new l();

    /* renamed from: a, reason: collision with root package name */
    public final PublicKeyCredentialType f32938a;

    /* renamed from: b, reason: collision with root package name */
    public final COSEAlgorithmIdentifier f32939b;

    public PublicKeyCredentialParameters(String str, int i10) {
        AbstractC3191o.m(str);
        try {
            this.f32938a = PublicKeyCredentialType.a(str);
            AbstractC3191o.m(Integer.valueOf(i10));
            try {
                this.f32939b = COSEAlgorithmIdentifier.a(i10);
            } catch (COSEAlgorithmIdentifier.a e10) {
                throw new IllegalArgumentException(e10);
            }
        } catch (PublicKeyCredentialType.a e11) {
            throw new IllegalArgumentException(e11);
        }
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof PublicKeyCredentialParameters)) {
            return false;
        }
        PublicKeyCredentialParameters publicKeyCredentialParameters = (PublicKeyCredentialParameters) obj;
        return this.f32938a.equals(publicKeyCredentialParameters.f32938a) && this.f32939b.equals(publicKeyCredentialParameters.f32939b);
    }

    public int g() {
        return this.f32939b.b();
    }

    public String h() {
        return this.f32938a.toString();
    }

    public int hashCode() {
        return AbstractC3189m.c(this.f32938a, this.f32939b);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        int a10 = E9.b.a(parcel);
        E9.b.F(parcel, 2, h(), false);
        E9.b.x(parcel, 3, Integer.valueOf(g()), false);
        E9.b.b(parcel, a10);
    }
}
