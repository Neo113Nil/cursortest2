package com.google.android.gms.wallet;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.identity.intents.model.UserAddress;

/* loaded from: classes2.dex */
public final class CardInfo extends AbstractSafeParcelable {

    @NonNull
    public static final Parcelable.Creator<CardInfo> CREATOR = new u();

    /* renamed from: a, reason: collision with root package name */
    public String f34498a;

    /* renamed from: b, reason: collision with root package name */
    public String f34499b;

    /* renamed from: c, reason: collision with root package name */
    public String f34500c;

    /* renamed from: d, reason: collision with root package name */
    public int f34501d;

    /* renamed from: e, reason: collision with root package name */
    public UserAddress f34502e;

    public CardInfo(String str, String str2, String str3, int i10, UserAddress userAddress) {
        this.f34498a = str;
        this.f34499b = str2;
        this.f34500c = str3;
        this.f34501d = i10;
        this.f34502e = userAddress;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        int a10 = E9.b.a(parcel);
        E9.b.F(parcel, 1, this.f34498a, false);
        E9.b.F(parcel, 2, this.f34499b, false);
        E9.b.F(parcel, 3, this.f34500c, false);
        E9.b.u(parcel, 4, this.f34501d);
        E9.b.D(parcel, 5, this.f34502e, i10, false);
        E9.b.b(parcel, a10);
    }
}
