package com.google.android.gms.wallet.wobs;

import E9.b;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import ha.l;

/* loaded from: classes2.dex */
public final class WalletObjectMessage extends AbstractSafeParcelable {

    @NonNull
    public static final Parcelable.Creator<WalletObjectMessage> CREATOR = new l();

    /* renamed from: a, reason: collision with root package name */
    public String f34666a;

    /* renamed from: b, reason: collision with root package name */
    public String f34667b;

    /* renamed from: c, reason: collision with root package name */
    public TimeInterval f34668c;

    /* renamed from: d, reason: collision with root package name */
    public UriData f34669d;

    /* renamed from: e, reason: collision with root package name */
    public UriData f34670e;

    public WalletObjectMessage(String str, String str2, TimeInterval timeInterval, UriData uriData, UriData uriData2) {
        this.f34666a = str;
        this.f34667b = str2;
        this.f34668c = timeInterval;
        this.f34669d = uriData;
        this.f34670e = uriData2;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        int a10 = b.a(parcel);
        b.F(parcel, 2, this.f34666a, false);
        b.F(parcel, 3, this.f34667b, false);
        b.D(parcel, 4, this.f34668c, i10, false);
        b.D(parcel, 5, this.f34669d, i10, false);
        b.D(parcel, 6, this.f34670e, i10, false);
        b.b(parcel, a10);
    }
}
