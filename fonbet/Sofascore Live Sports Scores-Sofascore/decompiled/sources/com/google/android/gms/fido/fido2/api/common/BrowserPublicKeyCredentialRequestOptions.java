package com.google.android.gms.fido.fido2.api.common;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.util.Base64Utils;
import defpackage.mz1;
import java.util.Arrays;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@SafeParcelable.Class
@SafeParcelable.Reserved
/* loaded from: classes3.dex */
public class BrowserPublicKeyCredentialRequestOptions extends BrowserRequestOptions {

    @NonNull
    public static final Parcelable.Creator<BrowserPublicKeyCredentialRequestOptions> CREATOR = new zzo();
    public final PublicKeyCredentialRequestOptions a;
    public final Uri b;
    public final byte[] c;

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    public static final class Builder {
    }

    public BrowserPublicKeyCredentialRequestOptions(PublicKeyCredentialRequestOptions publicKeyCredentialRequestOptions, Uri uri, byte[] bArr) {
        Preconditions.i(publicKeyCredentialRequestOptions);
        this.a = publicKeyCredentialRequestOptions;
        Preconditions.i(uri);
        Preconditions.a("origin scheme must be non-empty", uri.getScheme() != null);
        Preconditions.a("origin authority must be non-empty", uri.getAuthority() != null);
        this.b = uri;
        Preconditions.a("clientDataHash must be 32 bytes long", bArr == null || bArr.length == 32);
        this.c = bArr;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof BrowserPublicKeyCredentialRequestOptions)) {
            return false;
        }
        BrowserPublicKeyCredentialRequestOptions browserPublicKeyCredentialRequestOptions = (BrowserPublicKeyCredentialRequestOptions) obj;
        return Objects.a(this.a, browserPublicKeyCredentialRequestOptions.a) && Objects.a(this.b, browserPublicKeyCredentialRequestOptions.b);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b});
    }

    public final String toString() {
        String valueOf = String.valueOf(this.a);
        String valueOf2 = String.valueOf(this.b);
        return mz1.o(mz1.s("BrowserPublicKeyCredentialRequestOptions{\n publicKeyCredentialRequestOptions=", valueOf, ", \n origin=", valueOf2, ", \n clientDataHash="), Base64Utils.b(this.c), "}");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int s = SafeParcelWriter.s(parcel, 20293);
        SafeParcelWriter.l(parcel, 2, this.a, i, false);
        SafeParcelWriter.l(parcel, 3, this.b, i, false);
        SafeParcelWriter.c(parcel, 4, this.c, false);
        SafeParcelWriter.t(parcel, s);
    }
}
