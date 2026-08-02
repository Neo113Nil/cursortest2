package com.google.android.gms.wallet;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

/* loaded from: classes2.dex */
public final class TransactionInfo extends AbstractSafeParcelable {

    @NonNull
    public static final Parcelable.Creator<TransactionInfo> CREATOR = new n();

    /* renamed from: a, reason: collision with root package name */
    public int f34598a;

    /* renamed from: b, reason: collision with root package name */
    public String f34599b;

    /* renamed from: c, reason: collision with root package name */
    public String f34600c;

    public TransactionInfo(int i10, String str, String str2) {
        this.f34598a = i10;
        this.f34599b = str;
        this.f34600c = str2;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        int a10 = E9.b.a(parcel);
        E9.b.u(parcel, 1, this.f34598a);
        E9.b.F(parcel, 2, this.f34599b, false);
        E9.b.F(parcel, 3, this.f34600c, false);
        E9.b.b(parcel, a10);
    }
}
