package com.google.android.gms.wallet;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.identity.intents.model.UserAddress;

/* loaded from: classes2.dex */
public final class y implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int N10 = E9.a.N(parcel);
        String str = null;
        String str2 = null;
        zzaj zzajVar = null;
        String str3 = null;
        zza zzaVar = null;
        zza zzaVar2 = null;
        String[] strArr = null;
        UserAddress userAddress = null;
        UserAddress userAddress2 = null;
        InstrumentInfo[] instrumentInfoArr = null;
        PaymentMethodToken paymentMethodToken = null;
        while (parcel.dataPosition() < N10) {
            int E10 = E9.a.E(parcel);
            switch (E9.a.w(E10)) {
                case 2:
                    str = E9.a.q(parcel, E10);
                    break;
                case 3:
                    str2 = E9.a.q(parcel, E10);
                    break;
                case 4:
                    zzajVar = (zzaj) E9.a.p(parcel, E10, zzaj.CREATOR);
                    break;
                case 5:
                    str3 = E9.a.q(parcel, E10);
                    break;
                case 6:
                    zzaVar = (zza) E9.a.p(parcel, E10, zza.CREATOR);
                    break;
                case 7:
                    zzaVar2 = (zza) E9.a.p(parcel, E10, zza.CREATOR);
                    break;
                case 8:
                    strArr = E9.a.r(parcel, E10);
                    break;
                case 9:
                    userAddress = (UserAddress) E9.a.p(parcel, E10, UserAddress.CREATOR);
                    break;
                case 10:
                    userAddress2 = (UserAddress) E9.a.p(parcel, E10, UserAddress.CREATOR);
                    break;
                case 11:
                    instrumentInfoArr = (InstrumentInfo[]) E9.a.t(parcel, E10, InstrumentInfo.CREATOR);
                    break;
                case 12:
                    paymentMethodToken = (PaymentMethodToken) E9.a.p(parcel, E10, PaymentMethodToken.CREATOR);
                    break;
                default:
                    E9.a.M(parcel, E10);
                    break;
            }
        }
        E9.a.v(parcel, N10);
        return new FullWallet(str, str2, zzajVar, str3, zzaVar, zzaVar2, strArr, userAddress, userAddress2, instrumentInfoArr, paymentMethodToken);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new FullWallet[i10];
    }
}
