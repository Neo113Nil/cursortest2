package com.google.android.gms.common.internal;

import android.accounts.Account;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.api.Scope;

/* loaded from: classes2.dex */
public final class k0 implements Parcelable.Creator {
    public static void a(GetServiceRequest getServiceRequest, Parcel parcel, int i10) {
        int a10 = E9.b.a(parcel);
        E9.b.u(parcel, 1, getServiceRequest.f32639a);
        E9.b.u(parcel, 2, getServiceRequest.f32640b);
        E9.b.u(parcel, 3, getServiceRequest.f32641c);
        E9.b.F(parcel, 4, getServiceRequest.f32642d, false);
        E9.b.t(parcel, 5, getServiceRequest.f32643e, false);
        E9.b.I(parcel, 6, getServiceRequest.zzh, i10, false);
        E9.b.j(parcel, 7, getServiceRequest.f32644f, false);
        E9.b.D(parcel, 8, getServiceRequest.f32645g, i10, false);
        E9.b.I(parcel, 10, getServiceRequest.zzk, i10, false);
        E9.b.I(parcel, 11, getServiceRequest.zzl, i10, false);
        E9.b.g(parcel, 12, getServiceRequest.f32646h);
        E9.b.u(parcel, 13, getServiceRequest.f32647i);
        E9.b.g(parcel, 14, getServiceRequest.f32648j);
        E9.b.F(parcel, 15, getServiceRequest.g(), false);
        E9.b.b(parcel, a10);
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int N10 = E9.a.N(parcel);
        Scope[] scopeArr = GetServiceRequest.zza;
        Bundle bundle = new Bundle();
        Feature[] featureArr = GetServiceRequest.zzb;
        Feature[] featureArr2 = featureArr;
        String str = null;
        IBinder iBinder = null;
        Account account = null;
        String str2 = null;
        int i10 = 0;
        int i11 = 0;
        int i12 = 0;
        boolean z10 = false;
        int i13 = 0;
        boolean z11 = false;
        while (parcel.dataPosition() < N10) {
            int E10 = E9.a.E(parcel);
            switch (E9.a.w(E10)) {
                case 1:
                    i10 = E9.a.G(parcel, E10);
                    break;
                case 2:
                    i11 = E9.a.G(parcel, E10);
                    break;
                case 3:
                    i12 = E9.a.G(parcel, E10);
                    break;
                case 4:
                    str = E9.a.q(parcel, E10);
                    break;
                case 5:
                    iBinder = E9.a.F(parcel, E10);
                    break;
                case 6:
                    scopeArr = (Scope[]) E9.a.t(parcel, E10, Scope.CREATOR);
                    break;
                case 7:
                    bundle = E9.a.f(parcel, E10);
                    break;
                case 8:
                    account = (Account) E9.a.p(parcel, E10, Account.CREATOR);
                    break;
                case 9:
                default:
                    E9.a.M(parcel, E10);
                    break;
                case 10:
                    featureArr = (Feature[]) E9.a.t(parcel, E10, Feature.CREATOR);
                    break;
                case 11:
                    featureArr2 = (Feature[]) E9.a.t(parcel, E10, Feature.CREATOR);
                    break;
                case 12:
                    z10 = E9.a.x(parcel, E10);
                    break;
                case 13:
                    i13 = E9.a.G(parcel, E10);
                    break;
                case 14:
                    z11 = E9.a.x(parcel, E10);
                    break;
                case 15:
                    str2 = E9.a.q(parcel, E10);
                    break;
            }
        }
        E9.a.v(parcel, N10);
        return new GetServiceRequest(i10, i11, i12, str, iBinder, scopeArr, bundle, account, featureArr, featureArr2, z10, i13, z11, str2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new GetServiceRequest[i10];
    }
}
