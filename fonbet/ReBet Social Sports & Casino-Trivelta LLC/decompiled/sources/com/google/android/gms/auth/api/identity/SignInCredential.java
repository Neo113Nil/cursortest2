package com.google.android.gms.auth.api.identity;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import com.google.android.gms.common.internal.AbstractC3189m;
import com.google.android.gms.common.internal.AbstractC3191o;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.fido.fido2.api.common.PublicKeyCredential;
import z9.r;

@Deprecated
/* loaded from: classes2.dex */
public final class SignInCredential extends AbstractSafeParcelable {

    @NonNull
    public static final Parcelable.Creator<SignInCredential> CREATOR = new r();

    /* renamed from: a, reason: collision with root package name */
    public final String f32177a;

    /* renamed from: b, reason: collision with root package name */
    public final String f32178b;

    /* renamed from: c, reason: collision with root package name */
    public final String f32179c;

    /* renamed from: d, reason: collision with root package name */
    public final String f32180d;

    /* renamed from: e, reason: collision with root package name */
    public final Uri f32181e;

    /* renamed from: f, reason: collision with root package name */
    public final String f32182f;

    /* renamed from: g, reason: collision with root package name */
    public final String f32183g;

    /* renamed from: h, reason: collision with root package name */
    public final String f32184h;

    /* renamed from: i, reason: collision with root package name */
    public final PublicKeyCredential f32185i;

    public SignInCredential(String str, String str2, String str3, String str4, Uri uri, String str5, String str6, String str7, PublicKeyCredential publicKeyCredential) {
        this.f32177a = (String) AbstractC3191o.m(str);
        this.f32178b = str2;
        this.f32179c = str3;
        this.f32180d = str4;
        this.f32181e = uri;
        this.f32182f = str5;
        this.f32183g = str6;
        this.f32184h = str7;
        this.f32185i = publicKeyCredential;
    }

    public String b() {
        return this.f32184h;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof SignInCredential)) {
            return false;
        }
        SignInCredential signInCredential = (SignInCredential) obj;
        return AbstractC3189m.b(this.f32177a, signInCredential.f32177a) && AbstractC3189m.b(this.f32178b, signInCredential.f32178b) && AbstractC3189m.b(this.f32179c, signInCredential.f32179c) && AbstractC3189m.b(this.f32180d, signInCredential.f32180d) && AbstractC3189m.b(this.f32181e, signInCredential.f32181e) && AbstractC3189m.b(this.f32182f, signInCredential.f32182f) && AbstractC3189m.b(this.f32183g, signInCredential.f32183g) && AbstractC3189m.b(this.f32184h, signInCredential.f32184h) && AbstractC3189m.b(this.f32185i, signInCredential.f32185i);
    }

    public String g() {
        return this.f32183g;
    }

    public String getDisplayName() {
        return this.f32178b;
    }

    public String getFamilyName() {
        return this.f32180d;
    }

    public String getGivenName() {
        return this.f32179c;
    }

    public String getId() {
        return this.f32177a;
    }

    public String h() {
        return this.f32182f;
    }

    public int hashCode() {
        return AbstractC3189m.c(this.f32177a, this.f32178b, this.f32179c, this.f32180d, this.f32181e, this.f32182f, this.f32183g, this.f32184h, this.f32185i);
    }

    public Uri i() {
        return this.f32181e;
    }

    public PublicKeyCredential j() {
        return this.f32185i;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        int a10 = E9.b.a(parcel);
        E9.b.F(parcel, 1, getId(), false);
        E9.b.F(parcel, 2, getDisplayName(), false);
        E9.b.F(parcel, 3, getGivenName(), false);
        E9.b.F(parcel, 4, getFamilyName(), false);
        E9.b.D(parcel, 5, i(), i10, false);
        E9.b.F(parcel, 6, h(), false);
        E9.b.F(parcel, 7, g(), false);
        E9.b.F(parcel, 8, b(), false);
        E9.b.D(parcel, 9, j(), i10, false);
        E9.b.b(parcel, a10);
    }
}
