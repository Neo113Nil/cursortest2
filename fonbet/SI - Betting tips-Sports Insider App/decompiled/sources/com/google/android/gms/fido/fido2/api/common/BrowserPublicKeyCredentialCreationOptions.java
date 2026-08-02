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
public class BrowserPublicKeyCredentialCreationOptions extends BrowserRequestOptions {

    @NonNull
    public static final Parcelable.Creator<BrowserPublicKeyCredentialCreationOptions> CREATOR = new l(24);

    /* renamed from: a, reason: collision with root package name */
    public final PublicKeyCredentialCreationOptions f4678a;

    /* renamed from: b, reason: collision with root package name */
    public final Uri f4679b;

    /* renamed from: c, reason: collision with root package name */
    public final byte[] f4680c;

    public BrowserPublicKeyCredentialCreationOptions(PublicKeyCredentialCreationOptions publicKeyCredentialCreationOptions, Uri uri, byte[] bArr) {
        v.h(publicKeyCredentialCreationOptions);
        this.f4678a = publicKeyCredentialCreationOptions;
        v.h(uri);
        v.a("origin scheme must be non-empty", uri.getScheme() != null);
        v.a("origin authority must be non-empty", uri.getAuthority() != null);
        this.f4679b = uri;
        v.a("clientDataHash must be 32 bytes long", bArr == null || bArr.length == 32);
        this.f4680c = bArr;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof BrowserPublicKeyCredentialCreationOptions)) {
            return false;
        }
        BrowserPublicKeyCredentialCreationOptions browserPublicKeyCredentialCreationOptions = (BrowserPublicKeyCredentialCreationOptions) obj;
        return v.k(this.f4678a, browserPublicKeyCredentialCreationOptions.f4678a) && v.k(this.f4679b, browserPublicKeyCredentialCreationOptions.f4679b);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f4678a, this.f4679b});
    }

    public final String toString() {
        String valueOf = String.valueOf(this.f4678a);
        String valueOf2 = String.valueOf(this.f4679b);
        return e.l(k.q("BrowserPublicKeyCredentialCreationOptions{\n publicKeyCredentialCreationOptions=", valueOf, ", \n origin=", valueOf2, ", \n clientDataHash="), b.c(this.f4680c), "}");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i5) {
        int V = h8.b.V(parcel, 20293);
        h8.b.N(parcel, 2, this.f4678a, i5, false);
        h8.b.N(parcel, 3, this.f4679b, i5, false);
        h8.b.G(parcel, 4, this.f4680c, false);
        h8.b.W(parcel, V);
    }
}
