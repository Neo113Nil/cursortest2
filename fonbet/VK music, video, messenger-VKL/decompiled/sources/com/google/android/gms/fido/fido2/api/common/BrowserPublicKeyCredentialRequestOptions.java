package com.google.android.gms.fido.fido2.api.common;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.Arrays;
import xsna.dq70;
import xsna.exc0;
import xsna.i5s;
import xsna.k46;
import xsna.ozg0;
import xsna.um01;
import xsna.xe9;

/* compiled from: com.google.android.gms:play-services-fido@@21.0.0 */
/* loaded from: classes12.dex */
public class BrowserPublicKeyCredentialRequestOptions extends BrowserRequestOptions {

    @NonNull
    public static final Parcelable.Creator<BrowserPublicKeyCredentialRequestOptions> CREATOR = new um01();

    @NonNull
    public final PublicKeyCredentialRequestOptions b;

    @NonNull
    public final Uri c;

    @Nullable
    public final byte[] d;

    public BrowserPublicKeyCredentialRequestOptions(@NonNull PublicKeyCredentialRequestOptions publicKeyCredentialRequestOptions, @NonNull Uri uri, @Nullable byte[] bArr) {
        exc0.i(publicKeyCredentialRequestOptions);
        this.b = publicKeyCredentialRequestOptions;
        exc0.i(uri);
        exc0.a("origin scheme must be non-empty", uri.getScheme() != null);
        exc0.a("origin authority must be non-empty", uri.getAuthority() != null);
        this.c = uri;
        exc0.a("clientDataHash must be 32 bytes long", bArr == null || bArr.length == 32);
        this.d = bArr;
    }

    public final boolean equals(@NonNull Object obj) {
        if (!(obj instanceof BrowserPublicKeyCredentialRequestOptions)) {
            return false;
        }
        BrowserPublicKeyCredentialRequestOptions browserPublicKeyCredentialRequestOptions = (BrowserPublicKeyCredentialRequestOptions) obj;
        return dq70.b(this.b, browserPublicKeyCredentialRequestOptions.b) && dq70.b(this.c, browserPublicKeyCredentialRequestOptions.c);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.b, this.c});
    }

    @NonNull
    public final String toString() {
        String valueOf = String.valueOf(this.b);
        String valueOf2 = String.valueOf(this.c);
        return i5s.a(xe9.a("BrowserPublicKeyCredentialRequestOptions{\n publicKeyCredentialRequestOptions=", valueOf, ", \n origin=", valueOf2, ", \n clientDataHash="), k46.c(this.d), "}");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NonNull Parcel parcel, int i) {
        int w = ozg0.w(20293, parcel);
        ozg0.p(parcel, 2, this.b, i, false);
        ozg0.p(parcel, 3, this.c, i, false);
        ozg0.e(parcel, 4, this.d, false);
        ozg0.x(w, parcel);
    }
}
