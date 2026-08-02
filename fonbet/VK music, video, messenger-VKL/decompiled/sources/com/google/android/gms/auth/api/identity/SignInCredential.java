package com.google.android.gms.auth.api.identity;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.fido.fido2.api.common.PublicKeyCredential;
import java.util.Arrays;
import xsna.dq70;
import xsna.exc0;
import xsna.ozg0;
import xsna.srz0;

/* compiled from: com.google.android.gms:play-services-auth@@21.1.1 */
@Deprecated
/* loaded from: classes12.dex */
public final class SignInCredential extends AbstractSafeParcelable {

    @NonNull
    public static final Parcelable.Creator<SignInCredential> CREATOR = new srz0();
    public final String b;

    @Nullable
    public final String c;

    @Nullable
    public final String d;

    @Nullable
    public final String e;

    @Nullable
    public final Uri f;

    @Nullable
    public final String g;

    @Nullable
    public final String h;

    @Nullable
    public final String i;

    @Nullable
    public final PublicKeyCredential j;

    public SignInCredential(String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable Uri uri, @Nullable String str5, @Nullable String str6, @Nullable String str7, @Nullable PublicKeyCredential publicKeyCredential) {
        exc0.i(str);
        this.b = str;
        this.c = str2;
        this.d = str3;
        this.e = str4;
        this.f = uri;
        this.g = str5;
        this.h = str6;
        this.i = str7;
        this.j = publicKeyCredential;
    }

    public final boolean equals(@Nullable Object obj) {
        if (!(obj instanceof SignInCredential)) {
            return false;
        }
        SignInCredential signInCredential = (SignInCredential) obj;
        return dq70.b(this.b, signInCredential.b) && dq70.b(this.c, signInCredential.c) && dq70.b(this.d, signInCredential.d) && dq70.b(this.e, signInCredential.e) && dq70.b(this.f, signInCredential.f) && dq70.b(this.g, signInCredential.g) && dq70.b(this.h, signInCredential.h) && dq70.b(this.i, signInCredential.i) && dq70.b(this.j, signInCredential.j);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.j});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NonNull Parcel parcel, int i) {
        int w = ozg0.w(20293, parcel);
        ozg0.q(parcel, 1, this.b, false);
        ozg0.q(parcel, 2, this.c, false);
        ozg0.q(parcel, 3, this.d, false);
        ozg0.q(parcel, 4, this.e, false);
        ozg0.p(parcel, 5, this.f, i, false);
        ozg0.q(parcel, 6, this.g, false);
        ozg0.q(parcel, 7, this.h, false);
        ozg0.q(parcel, 8, this.i, false);
        ozg0.p(parcel, 9, this.j, i, false);
        ozg0.x(w, parcel);
    }
}
