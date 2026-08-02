package com.google.firebase.auth;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import com.google.android.gms.common.internal.AbstractC3191o;
import com.google.android.gms.internal.p002firebaseauthapi.zzajb;
import kb.f0;

/* loaded from: classes3.dex */
public class FacebookAuthCredential extends AuthCredential {

    @NonNull
    public static final Parcelable.Creator<FacebookAuthCredential> CREATOR = new f0();

    /* renamed from: a, reason: collision with root package name */
    public final String f37554a;

    public FacebookAuthCredential(String str) {
        this.f37554a = AbstractC3191o.g(str);
    }

    public static zzajb j(FacebookAuthCredential facebookAuthCredential, String str) {
        AbstractC3191o.m(facebookAuthCredential);
        return new zzajb(null, facebookAuthCredential.f37554a, facebookAuthCredential.g(), null, null, null, str, null, null);
    }

    @Override // com.google.firebase.auth.AuthCredential
    public String g() {
        return "facebook.com";
    }

    @Override // com.google.firebase.auth.AuthCredential
    public String h() {
        return "facebook.com";
    }

    @Override // com.google.firebase.auth.AuthCredential
    public final AuthCredential i() {
        return new FacebookAuthCredential(this.f37554a);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        int a10 = E9.b.a(parcel);
        E9.b.F(parcel, 1, this.f37554a, false);
        E9.b.b(parcel, a10);
    }
}
