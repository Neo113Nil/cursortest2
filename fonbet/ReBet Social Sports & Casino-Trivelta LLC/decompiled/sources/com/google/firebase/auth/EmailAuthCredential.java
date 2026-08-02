package com.google.firebase.auth;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import com.google.android.gms.common.internal.AbstractC3191o;
import kb.C5220e;
import kb.e0;

/* loaded from: classes3.dex */
public class EmailAuthCredential extends AuthCredential {

    @NonNull
    public static final Parcelable.Creator<EmailAuthCredential> CREATOR = new e0();

    /* renamed from: a, reason: collision with root package name */
    public String f37549a;

    /* renamed from: b, reason: collision with root package name */
    public String f37550b;

    /* renamed from: c, reason: collision with root package name */
    public final String f37551c;

    /* renamed from: d, reason: collision with root package name */
    public String f37552d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f37553e;

    public EmailAuthCredential(String str, String str2) {
        this(str, str2, null, null, false);
    }

    public static boolean k(String str) {
        C5220e c10;
        return (TextUtils.isEmpty(str) || (c10 = C5220e.c(str)) == null || c10.b() != 4) ? false : true;
    }

    @Override // com.google.firebase.auth.AuthCredential
    public String g() {
        return "password";
    }

    @Override // com.google.firebase.auth.AuthCredential
    public String h() {
        return !TextUtils.isEmpty(this.f37550b) ? "password" : "emailLink";
    }

    @Override // com.google.firebase.auth.AuthCredential
    public final AuthCredential i() {
        return new EmailAuthCredential(this.f37549a, this.f37550b, this.f37551c, this.f37552d, this.f37553e);
    }

    public final EmailAuthCredential j(FirebaseUser firebaseUser) {
        this.f37552d = firebaseUser.zze();
        this.f37553e = true;
        return this;
    }

    public final String l() {
        return this.f37552d;
    }

    public final boolean m() {
        return !TextUtils.isEmpty(this.f37551c);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        int a10 = E9.b.a(parcel);
        E9.b.F(parcel, 1, this.f37549a, false);
        E9.b.F(parcel, 2, this.f37550b, false);
        E9.b.F(parcel, 3, this.f37551c, false);
        E9.b.F(parcel, 4, this.f37552d, false);
        E9.b.g(parcel, 5, this.f37553e);
        E9.b.b(parcel, a10);
    }

    public final String zzc() {
        return this.f37549a;
    }

    public final String zzd() {
        return this.f37550b;
    }

    public final String zze() {
        return this.f37551c;
    }

    public final boolean zzg() {
        return this.f37553e;
    }

    public EmailAuthCredential(String str, String str2, String str3, String str4, boolean z10) {
        this.f37549a = AbstractC3191o.g(str);
        if (TextUtils.isEmpty(str2) && TextUtils.isEmpty(str3)) {
            throw new IllegalArgumentException("Cannot create an EmailAuthCredential without a password or emailLink.");
        }
        this.f37550b = str2;
        this.f37551c = str3;
        this.f37552d = str4;
        this.f37553e = z10;
    }
}
