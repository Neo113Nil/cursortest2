package com.google.firebase.auth;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import com.google.android.gms.common.internal.AbstractC3191o;
import kb.V;

/* loaded from: classes3.dex */
public class PhoneAuthCredential extends AuthCredential implements Cloneable {

    @NonNull
    public static final Parcelable.Creator<PhoneAuthCredential> CREATOR = new V();

    /* renamed from: a, reason: collision with root package name */
    public String f37588a;

    /* renamed from: b, reason: collision with root package name */
    public String f37589b;

    /* renamed from: c, reason: collision with root package name */
    public String f37590c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f37591d;

    /* renamed from: e, reason: collision with root package name */
    public String f37592e;

    public PhoneAuthCredential(String str, String str2, String str3, boolean z10, String str4) {
        AbstractC3191o.b(((TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) && (TextUtils.isEmpty(str3) || TextUtils.isEmpty(str4))) ? false : true, "Cannot create PhoneAuthCredential without either sessionInfo + smsCode or temporary proof + phoneNumber.");
        this.f37588a = str;
        this.f37589b = str2;
        this.f37590c = str3;
        this.f37591d = z10;
        this.f37592e = str4;
    }

    public static PhoneAuthCredential k(String str, String str2) {
        return new PhoneAuthCredential(str, str2, null, true, null);
    }

    public static PhoneAuthCredential m(String str, String str2) {
        return new PhoneAuthCredential(null, null, str, true, str2);
    }

    public final String N() {
        return this.f37590c;
    }

    public final boolean O() {
        return this.f37591d;
    }

    public /* synthetic */ Object clone() {
        return new PhoneAuthCredential(this.f37588a, j(), this.f37590c, this.f37591d, this.f37592e);
    }

    @Override // com.google.firebase.auth.AuthCredential
    public String g() {
        return "phone";
    }

    @Override // com.google.firebase.auth.AuthCredential
    public String h() {
        return "phone";
    }

    @Override // com.google.firebase.auth.AuthCredential
    public final AuthCredential i() {
        return (PhoneAuthCredential) clone();
    }

    public String j() {
        return this.f37589b;
    }

    public final PhoneAuthCredential l(boolean z10) {
        this.f37591d = false;
        return this;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        int a10 = E9.b.a(parcel);
        E9.b.F(parcel, 1, this.f37588a, false);
        E9.b.F(parcel, 2, j(), false);
        E9.b.F(parcel, 4, this.f37590c, false);
        E9.b.g(parcel, 5, this.f37591d);
        E9.b.F(parcel, 6, this.f37592e, false);
        E9.b.b(parcel, a10);
    }

    public final String zzc() {
        return this.f37588a;
    }

    public final String zzd() {
        return this.f37592e;
    }
}
