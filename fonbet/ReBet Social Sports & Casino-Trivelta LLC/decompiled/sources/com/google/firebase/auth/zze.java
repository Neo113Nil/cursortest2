package com.google.firebase.auth;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.google.android.gms.common.internal.AbstractC3191o;
import com.google.android.gms.internal.p002firebaseauthapi.zzac;
import com.google.android.gms.internal.p002firebaseauthapi.zzajb;
import kb.d0;

/* loaded from: classes3.dex */
public final class zze extends OAuthCredential {
    public static final Parcelable.Creator<zze> CREATOR = new d0();

    /* renamed from: a, reason: collision with root package name */
    public final String f37722a;

    /* renamed from: b, reason: collision with root package name */
    public final String f37723b;

    /* renamed from: c, reason: collision with root package name */
    public final String f37724c;

    /* renamed from: d, reason: collision with root package name */
    public final zzajb f37725d;

    /* renamed from: e, reason: collision with root package name */
    public final String f37726e;

    /* renamed from: f, reason: collision with root package name */
    public final String f37727f;

    /* renamed from: g, reason: collision with root package name */
    public final String f37728g;

    public zze(String str, String str2, String str3, zzajb zzajbVar, String str4, String str5, String str6) {
        this.f37722a = zzac.zzb(str);
        this.f37723b = str2;
        this.f37724c = str3;
        this.f37725d = zzajbVar;
        this.f37726e = str4;
        this.f37727f = str5;
        this.f37728g = str6;
    }

    public static zze N(String str, String str2, String str3) {
        return Y(str, str2, str3, null, null);
    }

    public static zze O(String str, String str2, String str3, String str4) {
        AbstractC3191o.h(str, "Must specify a non-empty providerId");
        if (TextUtils.isEmpty(str2) && TextUtils.isEmpty(str3)) {
            throw new IllegalArgumentException("Must specify an idToken or an accessToken.");
        }
        return new zze(str, str2, str3, null, null, null, str4);
    }

    public static zze Y(String str, String str2, String str3, String str4, String str5) {
        AbstractC3191o.h(str, "Must specify a non-empty providerId");
        if (TextUtils.isEmpty(str2) && TextUtils.isEmpty(str3)) {
            throw new IllegalArgumentException("Must specify an idToken or an accessToken.");
        }
        return new zze(str, str2, str3, null, str4, str5, null);
    }

    public static zzajb l(zze zzeVar, String str) {
        AbstractC3191o.m(zzeVar);
        zzajb zzajbVar = zzeVar.f37725d;
        return zzajbVar != null ? zzajbVar : new zzajb(zzeVar.getIdToken(), zzeVar.j(), zzeVar.g(), null, zzeVar.k(), null, str, zzeVar.f37726e, zzeVar.f37728g);
    }

    public static zze m(zzajb zzajbVar) {
        AbstractC3191o.n(zzajbVar, "Must specify a non-null webSignInCredential");
        return new zze(null, null, null, zzajbVar, null, null, null);
    }

    @Override // com.google.firebase.auth.AuthCredential
    public final String g() {
        return this.f37722a;
    }

    @Override // com.google.firebase.auth.OAuthCredential
    public final String getIdToken() {
        return this.f37723b;
    }

    @Override // com.google.firebase.auth.AuthCredential
    public final String h() {
        return this.f37722a;
    }

    @Override // com.google.firebase.auth.AuthCredential
    public final AuthCredential i() {
        return new zze(this.f37722a, this.f37723b, this.f37724c, this.f37725d, this.f37726e, this.f37727f, this.f37728g);
    }

    @Override // com.google.firebase.auth.OAuthCredential
    public final String j() {
        return this.f37724c;
    }

    @Override // com.google.firebase.auth.OAuthCredential
    public final String k() {
        return this.f37727f;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int a10 = E9.b.a(parcel);
        E9.b.F(parcel, 1, g(), false);
        E9.b.F(parcel, 2, getIdToken(), false);
        E9.b.F(parcel, 3, j(), false);
        E9.b.D(parcel, 4, this.f37725d, i10, false);
        E9.b.F(parcel, 5, this.f37726e, false);
        E9.b.F(parcel, 6, k(), false);
        E9.b.F(parcel, 7, this.f37728g, false);
        E9.b.b(parcel, a10);
    }
}
