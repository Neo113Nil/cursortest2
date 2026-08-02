package com.google.android.gms.common.internal;

import android.accounts.Account;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import g6.j;
import h8.b;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class zay extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zay> CREATOR = new j(6);

    /* renamed from: a, reason: collision with root package name */
    public final int f4548a;

    /* renamed from: b, reason: collision with root package name */
    public final Account f4549b;

    /* renamed from: c, reason: collision with root package name */
    public final int f4550c;

    /* renamed from: d, reason: collision with root package name */
    public final GoogleSignInAccount f4551d;

    public zay(int i5, Account account, int i10, GoogleSignInAccount googleSignInAccount) {
        this.f4548a = i5;
        this.f4549b = account;
        this.f4550c = i10;
        this.f4551d = googleSignInAccount;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i5) {
        int V = b.V(parcel, 20293);
        b.U(parcel, 1, 4);
        parcel.writeInt(this.f4548a);
        b.N(parcel, 2, this.f4549b, i5, false);
        b.U(parcel, 3, 4);
        parcel.writeInt(this.f4550c);
        b.N(parcel, 4, this.f4551d, i5, false);
        b.W(parcel, V);
    }
}
