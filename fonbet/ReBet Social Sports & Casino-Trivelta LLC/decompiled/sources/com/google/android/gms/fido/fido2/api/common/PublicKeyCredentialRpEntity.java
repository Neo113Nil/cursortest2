package com.google.android.gms.fido.fido2.api.common;

import R9.n;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import com.google.android.gms.common.internal.AbstractC3189m;
import com.google.android.gms.common.internal.AbstractC3191o;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

/* loaded from: classes2.dex */
public class PublicKeyCredentialRpEntity extends AbstractSafeParcelable {

    @NonNull
    public static final Parcelable.Creator<PublicKeyCredentialRpEntity> CREATOR = new n();

    /* renamed from: a, reason: collision with root package name */
    public final String f32948a;

    /* renamed from: b, reason: collision with root package name */
    public final String f32949b;

    /* renamed from: c, reason: collision with root package name */
    public final String f32950c;

    public PublicKeyCredentialRpEntity(String str, String str2, String str3) {
        this.f32948a = (String) AbstractC3191o.m(str);
        this.f32949b = (String) AbstractC3191o.m(str2);
        this.f32950c = str3;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof PublicKeyCredentialRpEntity)) {
            return false;
        }
        PublicKeyCredentialRpEntity publicKeyCredentialRpEntity = (PublicKeyCredentialRpEntity) obj;
        return AbstractC3189m.b(this.f32948a, publicKeyCredentialRpEntity.f32948a) && AbstractC3189m.b(this.f32949b, publicKeyCredentialRpEntity.f32949b) && AbstractC3189m.b(this.f32950c, publicKeyCredentialRpEntity.f32950c);
    }

    public String g() {
        return this.f32950c;
    }

    public String getId() {
        return this.f32948a;
    }

    public String h() {
        return this.f32949b;
    }

    public int hashCode() {
        return AbstractC3189m.c(this.f32948a, this.f32949b, this.f32950c);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        int a10 = E9.b.a(parcel);
        E9.b.F(parcel, 2, getId(), false);
        E9.b.F(parcel, 3, h(), false);
        E9.b.F(parcel, 4, g(), false);
        E9.b.b(parcel, a10);
    }
}
