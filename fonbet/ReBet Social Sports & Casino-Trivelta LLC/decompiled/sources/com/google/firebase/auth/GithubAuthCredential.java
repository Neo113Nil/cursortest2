package com.google.firebase.auth;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import com.google.android.gms.common.internal.AbstractC3191o;
import com.google.android.gms.internal.p002firebaseauthapi.zzajb;
import kb.Q;

/* loaded from: classes3.dex */
public class GithubAuthCredential extends AuthCredential {

    @NonNull
    public static final Parcelable.Creator<GithubAuthCredential> CREATOR = new Q();

    /* renamed from: a, reason: collision with root package name */
    public String f37585a;

    public GithubAuthCredential(String str) {
        this.f37585a = AbstractC3191o.g(str);
    }

    public static zzajb j(GithubAuthCredential githubAuthCredential, String str) {
        AbstractC3191o.m(githubAuthCredential);
        return new zzajb(null, githubAuthCredential.f37585a, githubAuthCredential.g(), null, null, null, str, null, null);
    }

    @Override // com.google.firebase.auth.AuthCredential
    public String g() {
        return "github.com";
    }

    @Override // com.google.firebase.auth.AuthCredential
    public String h() {
        return "github.com";
    }

    @Override // com.google.firebase.auth.AuthCredential
    public final AuthCredential i() {
        return new GithubAuthCredential(this.f37585a);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        int a10 = E9.b.a(parcel);
        E9.b.F(parcel, 1, this.f37585a, false);
        E9.b.b(parcel, a10);
    }
}
