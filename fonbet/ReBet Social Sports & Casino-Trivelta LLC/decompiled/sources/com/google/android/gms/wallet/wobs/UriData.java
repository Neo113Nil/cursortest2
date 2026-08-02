package com.google.android.gms.wallet.wobs;

import E9.b;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import ha.k;

/* loaded from: classes2.dex */
public final class UriData extends AbstractSafeParcelable {

    @NonNull
    public static final Parcelable.Creator<UriData> CREATOR = new k();

    /* renamed from: a, reason: collision with root package name */
    public String f34664a;

    /* renamed from: b, reason: collision with root package name */
    public String f34665b;

    public UriData(String str, String str2) {
        this.f34664a = str;
        this.f34665b = str2;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        int a10 = b.a(parcel);
        b.F(parcel, 2, this.f34664a, false);
        b.F(parcel, 3, this.f34665b, false);
        b.b(parcel, a10);
    }
}
