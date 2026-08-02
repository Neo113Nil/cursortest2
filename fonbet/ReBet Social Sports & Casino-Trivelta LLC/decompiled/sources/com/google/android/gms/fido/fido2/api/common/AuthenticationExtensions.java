package com.google.android.gms.fido.fido2.api.common;

import R9.w;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import com.google.android.gms.common.internal.AbstractC3189m;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

/* loaded from: classes2.dex */
public class AuthenticationExtensions extends AbstractSafeParcelable {

    @NonNull
    public static final Parcelable.Creator<AuthenticationExtensions> CREATOR = new w();

    /* renamed from: a, reason: collision with root package name */
    public final FidoAppIdExtension f32876a;

    /* renamed from: b, reason: collision with root package name */
    public final zzs f32877b;

    /* renamed from: c, reason: collision with root package name */
    public final UserVerificationMethodExtension f32878c;

    /* renamed from: d, reason: collision with root package name */
    public final zzz f32879d;

    /* renamed from: e, reason: collision with root package name */
    public final zzab f32880e;

    /* renamed from: f, reason: collision with root package name */
    public final zzad f32881f;

    /* renamed from: g, reason: collision with root package name */
    public final zzu f32882g;

    /* renamed from: h, reason: collision with root package name */
    public final zzag f32883h;

    /* renamed from: i, reason: collision with root package name */
    public final GoogleThirdPartyPaymentExtension f32884i;

    /* renamed from: j, reason: collision with root package name */
    public final zzai f32885j;

    public AuthenticationExtensions(FidoAppIdExtension fidoAppIdExtension, zzs zzsVar, UserVerificationMethodExtension userVerificationMethodExtension, zzz zzzVar, zzab zzabVar, zzad zzadVar, zzu zzuVar, zzag zzagVar, GoogleThirdPartyPaymentExtension googleThirdPartyPaymentExtension, zzai zzaiVar) {
        this.f32876a = fidoAppIdExtension;
        this.f32878c = userVerificationMethodExtension;
        this.f32877b = zzsVar;
        this.f32879d = zzzVar;
        this.f32880e = zzabVar;
        this.f32881f = zzadVar;
        this.f32882g = zzuVar;
        this.f32883h = zzagVar;
        this.f32884i = googleThirdPartyPaymentExtension;
        this.f32885j = zzaiVar;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof AuthenticationExtensions)) {
            return false;
        }
        AuthenticationExtensions authenticationExtensions = (AuthenticationExtensions) obj;
        return AbstractC3189m.b(this.f32876a, authenticationExtensions.f32876a) && AbstractC3189m.b(this.f32877b, authenticationExtensions.f32877b) && AbstractC3189m.b(this.f32878c, authenticationExtensions.f32878c) && AbstractC3189m.b(this.f32879d, authenticationExtensions.f32879d) && AbstractC3189m.b(this.f32880e, authenticationExtensions.f32880e) && AbstractC3189m.b(this.f32881f, authenticationExtensions.f32881f) && AbstractC3189m.b(this.f32882g, authenticationExtensions.f32882g) && AbstractC3189m.b(this.f32883h, authenticationExtensions.f32883h) && AbstractC3189m.b(this.f32884i, authenticationExtensions.f32884i) && AbstractC3189m.b(this.f32885j, authenticationExtensions.f32885j);
    }

    public FidoAppIdExtension g() {
        return this.f32876a;
    }

    public UserVerificationMethodExtension h() {
        return this.f32878c;
    }

    public int hashCode() {
        return AbstractC3189m.c(this.f32876a, this.f32877b, this.f32878c, this.f32879d, this.f32880e, this.f32881f, this.f32882g, this.f32883h, this.f32884i, this.f32885j);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        int a10 = E9.b.a(parcel);
        E9.b.D(parcel, 2, g(), i10, false);
        E9.b.D(parcel, 3, this.f32877b, i10, false);
        E9.b.D(parcel, 4, h(), i10, false);
        E9.b.D(parcel, 5, this.f32879d, i10, false);
        E9.b.D(parcel, 6, this.f32880e, i10, false);
        E9.b.D(parcel, 7, this.f32881f, i10, false);
        E9.b.D(parcel, 8, this.f32882g, i10, false);
        E9.b.D(parcel, 9, this.f32883h, i10, false);
        E9.b.D(parcel, 10, this.f32884i, i10, false);
        E9.b.D(parcel, 11, this.f32885j, i10, false);
        E9.b.b(parcel, a10);
    }
}
