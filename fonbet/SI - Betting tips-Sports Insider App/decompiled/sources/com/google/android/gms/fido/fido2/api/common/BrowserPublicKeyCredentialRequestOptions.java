package com.google.android.gms.fido.fido2.api.common;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import d9.e;
import g6.v;
import java.util.Arrays;
import q6.b;
import r4.k;
import y6.l;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public class BrowserPublicKeyCredentialRequestOptions extends BrowserRequestOptions {

    @NonNull
    public static final Parcelable.Creator<BrowserPublicKeyCredentialRequestOptions> CREATOR = new l(25);

    /* renamed from: a, reason: collision with root package name */
    public final PublicKeyCredentialRequestOptions f4681a;

    /* renamed from: b, reason: collision with root package name */
    public final Uri f4682b;

    /* renamed from: c, reason: collision with root package name */
    public final byte[] f4683c;

    public BrowserPublicKeyCredentialRequestOptions(PublicKeyCredentialRequestOptions publicKeyCredentialRequestOptions, Uri uri, byte[] bArr) {
        v.h(publicKeyCredentialRequestOptions);
        this.f4681a = publicKeyCredentialRequestOptions;
        v.h(uri);
        v.a("origin scheme must be non-empty", uri.getScheme() != null);
        v.a("origin authority must be non-empty", uri.getAuthority() != null);
        this.f4682b = uri;
        v.a("clientDataHash must be 32 bytes long", bArr == null || bArr.length == 32);
        this.f4683c = bArr;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof BrowserPublicKeyCredentialRequestOptions)) {
            return false;
        }
        BrowserPublicKeyCredentialRequestOptions browserPublicKeyCredentialRequestOptions = (BrowserPublicKeyCredentialRequestOptions) obj;
        return v.k(this.f4681a, browserPublicKeyCredentialRequestOptions.f4681a) && v.k(this.f4682b, browserPublicKeyCredentialRequestOptions.f4682b);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f4681a, this.f4682b});
    }

    public final String toString() {
        String valueOf = String.valueOf(this.f4681a);
        String valueOf2 = String.valueOf(this.f4682b);
        return e.l(k.q("BrowserPublicKeyCredentialRequestOptions{\n publicKeyCredentialRequestOptions=", valueOf, ", \n origin=", valueOf2, ", \n clientDataHash="), b.c(this.f4683c), "}");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i5) {
        int V = h8.b.V(parcel, 20293);
        h8.b.N(parcel, 2, this.f4681a, i5, false);
        h8.b.N(parcel, 3, this.f4682b, i5, false);
        h8.b.G(parcel, 4, this.f4683c, false);
        h8.b.W(parcel, V);
    }
}
