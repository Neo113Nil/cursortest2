package com.google.android.gms.common.internal;

import android.accounts.Account;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

/* loaded from: classes2.dex */
public final class zat extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zat> CREATOR = new O();

    /* renamed from: a, reason: collision with root package name */
    public final int f32758a;

    /* renamed from: b, reason: collision with root package name */
    public final Account f32759b;

    /* renamed from: c, reason: collision with root package name */
    public final int f32760c;

    /* renamed from: d, reason: collision with root package name */
    public final GoogleSignInAccount f32761d;

    public zat(int i10, Account account, int i11, GoogleSignInAccount googleSignInAccount) {
        this.f32758a = i10;
        this.f32759b = account;
        this.f32760c = i11;
        this.f32761d = googleSignInAccount;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int i11 = this.f32758a;
        int a10 = E9.b.a(parcel);
        E9.b.u(parcel, 1, i11);
        E9.b.D(parcel, 2, this.f32759b, i10, false);
        E9.b.u(parcel, 3, this.f32760c);
        E9.b.D(parcel, 4, this.f32761d, i10, false);
        E9.b.b(parcel, a10);
    }

    public zat(Account account, int i10, GoogleSignInAccount googleSignInAccount) {
        this(2, account, i10, googleSignInAccount);
    }
}
