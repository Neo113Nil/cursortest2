package com.google.android.gms.fido.fido2.api.common;

import R9.o;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import com.google.android.gms.common.internal.AbstractC3189m;
import com.google.android.gms.common.internal.AbstractC3191o;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.Arrays;

/* loaded from: classes2.dex */
public class PublicKeyCredentialUserEntity extends AbstractSafeParcelable {

    @NonNull
    public static final Parcelable.Creator<PublicKeyCredentialUserEntity> CREATOR = new o();

    /* renamed from: a, reason: collision with root package name */
    public final String f32953a;

    /* renamed from: b, reason: collision with root package name */
    public final String f32954b;

    /* renamed from: c, reason: collision with root package name */
    public final String f32955c;

    @NonNull
    private final byte[] zza;

    public PublicKeyCredentialUserEntity(byte[] bArr, String str, String str2, String str3) {
        this.zza = (byte[]) AbstractC3191o.m(bArr);
        this.f32953a = (String) AbstractC3191o.m(str);
        this.f32954b = str2;
        this.f32955c = (String) AbstractC3191o.m(str3);
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof PublicKeyCredentialUserEntity)) {
            return false;
        }
        PublicKeyCredentialUserEntity publicKeyCredentialUserEntity = (PublicKeyCredentialUserEntity) obj;
        return Arrays.equals(this.zza, publicKeyCredentialUserEntity.zza) && AbstractC3189m.b(this.f32953a, publicKeyCredentialUserEntity.f32953a) && AbstractC3189m.b(this.f32954b, publicKeyCredentialUserEntity.f32954b) && AbstractC3189m.b(this.f32955c, publicKeyCredentialUserEntity.f32955c);
    }

    public String g() {
        return this.f32954b;
    }

    public String getDisplayName() {
        return this.f32955c;
    }

    public byte[] h() {
        return this.zza;
    }

    public int hashCode() {
        return AbstractC3189m.c(this.zza, this.f32953a, this.f32954b, this.f32955c);
    }

    public String i() {
        return this.f32953a;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        int a10 = E9.b.a(parcel);
        E9.b.l(parcel, 2, h(), false);
        E9.b.F(parcel, 3, i(), false);
        E9.b.F(parcel, 4, g(), false);
        E9.b.F(parcel, 5, getDisplayName(), false);
        E9.b.b(parcel, a10);
    }
}
