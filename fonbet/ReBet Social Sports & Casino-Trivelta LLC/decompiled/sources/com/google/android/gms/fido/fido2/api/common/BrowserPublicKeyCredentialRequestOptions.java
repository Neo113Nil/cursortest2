package com.google.android.gms.fido.fido2.api.common;

import R9.F;
import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import com.google.android.gms.common.internal.AbstractC3189m;
import com.google.android.gms.common.internal.AbstractC3191o;

/* loaded from: classes2.dex */
public class BrowserPublicKeyCredentialRequestOptions extends BrowserRequestOptions {

    @NonNull
    public static final Parcelable.Creator<BrowserPublicKeyCredentialRequestOptions> CREATOR = new F();

    /* renamed from: a, reason: collision with root package name */
    public final PublicKeyCredentialRequestOptions f32900a;

    /* renamed from: b, reason: collision with root package name */
    public final Uri f32901b;
    private final byte[] zzc;

    public BrowserPublicKeyCredentialRequestOptions(PublicKeyCredentialRequestOptions publicKeyCredentialRequestOptions, Uri uri, byte[] bArr) {
        this.f32900a = (PublicKeyCredentialRequestOptions) AbstractC3191o.m(publicKeyCredentialRequestOptions);
        j(uri);
        this.f32901b = uri;
        k(bArr);
        this.zzc = bArr;
    }

    private static Uri j(Uri uri) {
        AbstractC3191o.m(uri);
        AbstractC3191o.b(uri.getScheme() != null, "origin scheme must be non-empty");
        AbstractC3191o.b(uri.getAuthority() != null, "origin authority must be non-empty");
        return uri;
    }

    private static byte[] k(byte[] bArr) {
        boolean z10 = true;
        if (bArr != null && bArr.length != 32) {
            z10 = false;
        }
        AbstractC3191o.b(z10, "clientDataHash must be 32 bytes long");
        return bArr;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof BrowserPublicKeyCredentialRequestOptions)) {
            return false;
        }
        BrowserPublicKeyCredentialRequestOptions browserPublicKeyCredentialRequestOptions = (BrowserPublicKeyCredentialRequestOptions) obj;
        return AbstractC3189m.b(this.f32900a, browserPublicKeyCredentialRequestOptions.f32900a) && AbstractC3189m.b(this.f32901b, browserPublicKeyCredentialRequestOptions.f32901b);
    }

    public byte[] g() {
        return this.zzc;
    }

    public Uri h() {
        return this.f32901b;
    }

    public int hashCode() {
        return AbstractC3189m.c(this.f32900a, this.f32901b);
    }

    public PublicKeyCredentialRequestOptions i() {
        return this.f32900a;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        int a10 = E9.b.a(parcel);
        E9.b.D(parcel, 2, i(), i10, false);
        E9.b.D(parcel, 3, h(), i10, false);
        E9.b.l(parcel, 4, g(), false);
        E9.b.b(parcel, a10);
    }
}
