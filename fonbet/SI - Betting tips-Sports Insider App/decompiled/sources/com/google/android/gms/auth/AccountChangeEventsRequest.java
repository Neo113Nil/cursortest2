package com.google.android.gms.auth;

import android.accounts.Account;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import q5.b;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public class AccountChangeEventsRequest extends AbstractSafeParcelable {

    @NonNull
    public static final Parcelable.Creator<AccountChangeEventsRequest> CREATOR = new b(3);

    /* renamed from: a, reason: collision with root package name */
    public final int f4251a;

    /* renamed from: b, reason: collision with root package name */
    public final int f4252b;

    /* renamed from: c, reason: collision with root package name */
    public final String f4253c;

    /* renamed from: d, reason: collision with root package name */
    public final Account f4254d;

    public AccountChangeEventsRequest(int i5, int i10, String str, Account account) {
        this.f4251a = i5;
        this.f4252b = i10;
        this.f4253c = str;
        if (account != null || TextUtils.isEmpty(str)) {
            this.f4254d = account;
        } else {
            this.f4254d = new Account(str, "com.google");
        }
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i5) {
        int V = h8.b.V(parcel, 20293);
        h8.b.U(parcel, 1, 4);
        parcel.writeInt(this.f4251a);
        h8.b.U(parcel, 2, 4);
        parcel.writeInt(this.f4252b);
        h8.b.O(parcel, 3, this.f4253c, false);
        h8.b.N(parcel, 4, this.f4254d, i5, false);
        h8.b.W(parcel, V);
    }
}
