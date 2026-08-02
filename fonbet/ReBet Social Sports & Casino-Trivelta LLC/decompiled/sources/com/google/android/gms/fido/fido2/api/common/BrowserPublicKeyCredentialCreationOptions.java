package com.google.android.gms.fido.fido2.api.common;

import R9.E;
import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import com.google.android.gms.common.internal.AbstractC3189m;
import com.google.android.gms.common.internal.AbstractC3191o;

/* loaded from: classes2.dex */
public class BrowserPublicKeyCredentialCreationOptions extends BrowserRequestOptions {

    @NonNull
    public static final Parcelable.Creator<BrowserPublicKeyCredentialCreationOptions> CREATOR = new E();

    /* renamed from: a, reason: collision with root package name */
    public final PublicKeyCredentialCreationOptions f32898a;

    /* renamed from: b, reason: collision with root package name */
    public final Uri f32899b;
    private final byte[] zzc;

    public BrowserPublicKeyCredentialCreationOptions(PublicKeyCredentialCreationOptions publicKeyCredentialCreationOptions, Uri uri, byte[] bArr) {
        this.f32898a = (PublicKeyCredentialCreationOptions) AbstractC3191o.m(publicKeyCredentialCreationOptions);
        j(uri);
        this.f32899b = uri;
        k(bArr);
        this.zzc = bArr;
    }

    public static Uri j(Uri uri) {
        AbstractC3191o.m(uri);
        AbstractC3191o.b(uri.getScheme() != null, "origin scheme must be non-empty");
        AbstractC3191o.b(uri.getAuthority() != null, "origin authority must be non-empty");
        return uri;
    }

    public static byte[] k(byte[] bArr) {
        boolean z10 = true;
        if (bArr != null && bArr.length != 32) {
            z10 = false;
        }
        AbstractC3191o.b(z10, "clientDataHash must be 32 bytes long");
        return bArr;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof BrowserPublicKeyCredentialCreationOptions)) {
            return false;
        }
        BrowserPublicKeyCredentialCreationOptions browserPublicKeyCredentialCreationOptions = (BrowserPublicKeyCredentialCreationOptions) obj;
        return AbstractC3189m.b(this.f32898a, browserPublicKeyCredentialCreationOptions.f32898a) && AbstractC3189m.b(this.f32899b, browserPublicKeyCredentialCreationOptions.f32899b);
    }

    public byte[] g() {
        return this.zzc;
    }

    public Uri h() {
        return this.f32899b;
    }

    public int hashCode() {
        return AbstractC3189m.c(this.f32898a, this.f32899b);
    }

    public PublicKeyCredentialCreationOptions i() {
        return this.f32898a;
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
