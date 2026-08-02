package com.google.firebase.auth;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import com.google.android.gms.common.internal.AbstractC3191o;
import com.google.android.gms.internal.p002firebaseauthapi.zzajb;
import kb.a0;

/* loaded from: classes3.dex */
public class TwitterAuthCredential extends AuthCredential {

    @NonNull
    public static final Parcelable.Creator<TwitterAuthCredential> CREATOR = new a0();

    /* renamed from: a, reason: collision with root package name */
    public String f37603a;

    /* renamed from: b, reason: collision with root package name */
    public String f37604b;

    public TwitterAuthCredential(String str, String str2) {
        this.f37603a = AbstractC3191o.g(str);
        this.f37604b = AbstractC3191o.g(str2);
    }

    public static zzajb j(TwitterAuthCredential twitterAuthCredential, String str) {
        AbstractC3191o.m(twitterAuthCredential);
        return new zzajb(null, twitterAuthCredential.f37603a, twitterAuthCredential.g(), null, twitterAuthCredential.f37604b, null, str, null, null);
    }

    @Override // com.google.firebase.auth.AuthCredential
    public String g() {
        return "twitter.com";
    }

    @Override // com.google.firebase.auth.AuthCredential
    public String h() {
        return "twitter.com";
    }

    @Override // com.google.firebase.auth.AuthCredential
    public final AuthCredential i() {
        return new TwitterAuthCredential(this.f37603a, this.f37604b);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        int a10 = E9.b.a(parcel);
        E9.b.F(parcel, 1, this.f37603a, false);
        E9.b.F(parcel, 2, this.f37604b, false);
        E9.b.b(parcel, a10);
    }
}
