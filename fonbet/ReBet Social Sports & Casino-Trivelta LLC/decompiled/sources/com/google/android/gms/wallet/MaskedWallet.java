package com.google.android.gms.wallet;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.identity.intents.model.UserAddress;

/* loaded from: classes2.dex */
public final class MaskedWallet extends AbstractSafeParcelable implements ReflectedParcelable {

    @NonNull
    public static final Parcelable.Creator<MaskedWallet> CREATOR = new E();

    /* renamed from: a, reason: collision with root package name */
    public String f34560a;

    /* renamed from: b, reason: collision with root package name */
    public String f34561b;

    /* renamed from: c, reason: collision with root package name */
    public String f34562c;

    /* renamed from: d, reason: collision with root package name */
    public zza f34563d;

    /* renamed from: e, reason: collision with root package name */
    public zza f34564e;

    /* renamed from: f, reason: collision with root package name */
    public UserAddress f34565f;

    /* renamed from: g, reason: collision with root package name */
    public UserAddress f34566g;
    String[] zzc;
    LoyaltyWalletObject[] zzg;
    OfferWalletObject[] zzh;
    InstrumentInfo[] zzk;

    public MaskedWallet(String str, String str2, String[] strArr, String str3, zza zzaVar, zza zzaVar2, LoyaltyWalletObject[] loyaltyWalletObjectArr, OfferWalletObject[] offerWalletObjectArr, UserAddress userAddress, UserAddress userAddress2, InstrumentInfo[] instrumentInfoArr) {
        this.f34560a = str;
        this.f34561b = str2;
        this.zzc = strArr;
        this.f34562c = str3;
        this.f34563d = zzaVar;
        this.f34564e = zzaVar2;
        this.zzg = loyaltyWalletObjectArr;
        this.zzh = offerWalletObjectArr;
        this.f34565f = userAddress;
        this.f34566g = userAddress2;
        this.zzk = instrumentInfoArr;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int a10 = E9.b.a(parcel);
        E9.b.F(parcel, 2, this.f34560a, false);
        E9.b.F(parcel, 3, this.f34561b, false);
        E9.b.G(parcel, 4, this.zzc, false);
        E9.b.F(parcel, 5, this.f34562c, false);
        E9.b.D(parcel, 6, this.f34563d, i10, false);
        E9.b.D(parcel, 7, this.f34564e, i10, false);
        E9.b.I(parcel, 8, this.zzg, i10, false);
        E9.b.I(parcel, 9, this.zzh, i10, false);
        E9.b.D(parcel, 10, this.f34565f, i10, false);
        E9.b.D(parcel, 11, this.f34566g, i10, false);
        E9.b.I(parcel, 12, this.zzk, i10, false);
        E9.b.b(parcel, a10);
    }
}
