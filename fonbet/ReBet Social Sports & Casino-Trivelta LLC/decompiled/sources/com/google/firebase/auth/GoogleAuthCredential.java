package com.google.firebase.auth;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import com.google.android.gms.common.internal.AbstractC3191o;
import com.google.android.gms.internal.p002firebaseauthapi.zzajb;
import kb.S;

/* loaded from: classes3.dex */
public class GoogleAuthCredential extends AuthCredential {

    @NonNull
    public static final Parcelable.Creator<GoogleAuthCredential> CREATOR = new S();

    /* renamed from: a, reason: collision with root package name */
    public final String f37586a;

    /* renamed from: b, reason: collision with root package name */
    public final String f37587b;

    public GoogleAuthCredential(String str, String str2) {
        if (str == null && str2 == null) {
            throw new IllegalArgumentException("Must specify an idToken or an accessToken.");
        }
        if (str != null && str.length() == 0) {
            throw new IllegalArgumentException("idToken cannot be empty");
        }
        if (str2 != null && str2.length() == 0) {
            throw new IllegalArgumentException("accessToken cannot be empty");
        }
        this.f37586a = str;
        this.f37587b = str2;
    }

    public static zzajb j(GoogleAuthCredential googleAuthCredential, String str) {
        AbstractC3191o.m(googleAuthCredential);
        return new zzajb(googleAuthCredential.f37586a, googleAuthCredential.f37587b, googleAuthCredential.g(), null, null, null, str, null, null);
    }

    @Override // com.google.firebase.auth.AuthCredential
    public String g() {
        return "google.com";
    }

    @Override // com.google.firebase.auth.AuthCredential
    public String h() {
        return "google.com";
    }

    @Override // com.google.firebase.auth.AuthCredential
    public final AuthCredential i() {
        return new GoogleAuthCredential(this.f37586a, this.f37587b);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        int a10 = E9.b.a(parcel);
        E9.b.F(parcel, 1, this.f37586a, false);
        E9.b.F(parcel, 2, this.f37587b, false);
        E9.b.b(parcel, a10);
    }
}
