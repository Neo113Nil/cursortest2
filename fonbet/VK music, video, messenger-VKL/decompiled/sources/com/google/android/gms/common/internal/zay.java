package com.google.android.gms.common.internal;

import android.accounts.Account;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Nullable;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import xsna.hqz0;
import xsna.ozg0;

/* compiled from: com.google.android.gms:play-services-base@@18.10.0 */
/* loaded from: classes12.dex */
public final class zay extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zay> CREATOR = new hqz0();
    public final int b;
    public final Account c;
    public final int d;

    @Nullable
    public final GoogleSignInAccount e;

    public zay(int i, Account account, int i2, @Nullable GoogleSignInAccount googleSignInAccount) {
        this.b = i;
        this.c = account;
        this.d = i2;
        this.e = googleSignInAccount;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int w = ozg0.w(20293, parcel);
        ozg0.v(parcel, 1, 4);
        parcel.writeInt(this.b);
        ozg0.p(parcel, 2, this.c, i, false);
        ozg0.v(parcel, 3, 4);
        parcel.writeInt(this.d);
        ozg0.p(parcel, 4, this.e, i, false);
        ozg0.x(w, parcel);
    }

    public zay(Account account, int i, @Nullable GoogleSignInAccount googleSignInAccount) {
        this(2, account, i, googleSignInAccount);
    }
}
