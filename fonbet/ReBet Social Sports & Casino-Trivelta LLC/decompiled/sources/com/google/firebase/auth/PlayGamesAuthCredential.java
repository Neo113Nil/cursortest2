package com.google.firebase.auth;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import com.google.android.gms.common.internal.AbstractC3191o;
import com.google.android.gms.internal.p002firebaseauthapi.zzajb;
import kb.Y;

/* loaded from: classes3.dex */
public class PlayGamesAuthCredential extends AuthCredential {

    @NonNull
    public static final Parcelable.Creator<PlayGamesAuthCredential> CREATOR = new Y();

    /* renamed from: a, reason: collision with root package name */
    public final String f37598a;

    public PlayGamesAuthCredential(String str) {
        this.f37598a = AbstractC3191o.g(str);
    }

    public static zzajb j(PlayGamesAuthCredential playGamesAuthCredential, String str) {
        AbstractC3191o.m(playGamesAuthCredential);
        return new zzajb(null, null, playGamesAuthCredential.g(), null, null, playGamesAuthCredential.f37598a, str, null, null);
    }

    @Override // com.google.firebase.auth.AuthCredential
    public String g() {
        return "playgames.google.com";
    }

    @Override // com.google.firebase.auth.AuthCredential
    public String h() {
        return "playgames.google.com";
    }

    @Override // com.google.firebase.auth.AuthCredential
    public final AuthCredential i() {
        return new PlayGamesAuthCredential(this.f37598a);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        int a10 = E9.b.a(parcel);
        E9.b.F(parcel, 1, this.f37598a, false);
        E9.b.b(parcel, a10);
    }
}
