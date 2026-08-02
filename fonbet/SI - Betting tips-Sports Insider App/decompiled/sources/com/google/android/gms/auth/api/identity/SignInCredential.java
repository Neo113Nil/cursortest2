package com.google.android.gms.auth.api.identity;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.fido.fido2.api.common.PublicKeyCredential;
import g6.v;
import java.util.Arrays;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
@Deprecated
/* loaded from: classes.dex */
public final class SignInCredential extends AbstractSafeParcelable {

    @NonNull
    public static final Parcelable.Creator<SignInCredential> CREATOR = new u5.b(4);

    /* renamed from: a, reason: collision with root package name */
    public final String f4361a;

    /* renamed from: b, reason: collision with root package name */
    public final String f4362b;

    /* renamed from: c, reason: collision with root package name */
    public final String f4363c;

    /* renamed from: d, reason: collision with root package name */
    public final String f4364d;

    /* renamed from: e, reason: collision with root package name */
    public final Uri f4365e;

    /* renamed from: f, reason: collision with root package name */
    public final String f4366f;

    /* renamed from: g, reason: collision with root package name */
    public final String f4367g;

    /* renamed from: h, reason: collision with root package name */
    public final String f4368h;

    /* renamed from: i, reason: collision with root package name */
    public final PublicKeyCredential f4369i;

    public SignInCredential(String str, String str2, String str3, String str4, Uri uri, String str5, String str6, String str7, PublicKeyCredential publicKeyCredential) {
        v.h(str);
        this.f4361a = str;
        this.f4362b = str2;
        this.f4363c = str3;
        this.f4364d = str4;
        this.f4365e = uri;
        this.f4366f = str5;
        this.f4367g = str6;
        this.f4368h = str7;
        this.f4369i = publicKeyCredential;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof SignInCredential)) {
            return false;
        }
        SignInCredential signInCredential = (SignInCredential) obj;
        return v.k(this.f4361a, signInCredential.f4361a) && v.k(this.f4362b, signInCredential.f4362b) && v.k(this.f4363c, signInCredential.f4363c) && v.k(this.f4364d, signInCredential.f4364d) && v.k(this.f4365e, signInCredential.f4365e) && v.k(this.f4366f, signInCredential.f4366f) && v.k(this.f4367g, signInCredential.f4367g) && v.k(this.f4368h, signInCredential.f4368h) && v.k(this.f4369i, signInCredential.f4369i);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f4361a, this.f4362b, this.f4363c, this.f4364d, this.f4365e, this.f4366f, this.f4367g, this.f4368h, this.f4369i});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i5) {
        int V = h8.b.V(parcel, 20293);
        h8.b.O(parcel, 1, this.f4361a, false);
        h8.b.O(parcel, 2, this.f4362b, false);
        h8.b.O(parcel, 3, this.f4363c, false);
        h8.b.O(parcel, 4, this.f4364d, false);
        h8.b.N(parcel, 5, this.f4365e, i5, false);
        h8.b.O(parcel, 6, this.f4366f, false);
        h8.b.O(parcel, 7, this.f4367g, false);
        h8.b.O(parcel, 8, this.f4368h, false);
        h8.b.N(parcel, 9, this.f4369i, i5, false);
        h8.b.W(parcel, V);
    }
}
