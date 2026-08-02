package com.google.android.gms.auth;

import E9.b;
import android.accounts.Account;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import v9.C6670e;

/* loaded from: classes2.dex */
public class AccountChangeEventsRequest extends AbstractSafeParcelable {

    @NonNull
    public static final Parcelable.Creator<AccountChangeEventsRequest> CREATOR = new C6670e();

    /* renamed from: a, reason: collision with root package name */
    public final int f32006a;

    /* renamed from: b, reason: collision with root package name */
    public int f32007b;

    /* renamed from: c, reason: collision with root package name */
    public String f32008c;

    /* renamed from: d, reason: collision with root package name */
    public Account f32009d;

    public AccountChangeEventsRequest(int i10, int i11, String str, Account account) {
        this.f32006a = i10;
        this.f32007b = i11;
        this.f32008c = str;
        if (account != null || TextUtils.isEmpty(str)) {
            this.f32009d = account;
        } else {
            this.f32009d = new Account(str, "com.google");
        }
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        int a10 = b.a(parcel);
        b.u(parcel, 1, this.f32006a);
        b.u(parcel, 2, this.f32007b);
        b.F(parcel, 3, this.f32008c, false);
        b.D(parcel, 4, this.f32009d, i10, false);
        b.b(parcel, a10);
    }
}
