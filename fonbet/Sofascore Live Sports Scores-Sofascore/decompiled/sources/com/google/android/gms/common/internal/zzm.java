package com.google.android.gms.common.internal;

import android.accounts.Account;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzm implements Parcelable.Creator {
    public static void a(GetServiceRequest getServiceRequest, Parcel parcel, int i) {
        int s = SafeParcelWriter.s(parcel, 20293);
        int i2 = getServiceRequest.a;
        SafeParcelWriter.r(parcel, 1, 4);
        parcel.writeInt(i2);
        int i3 = getServiceRequest.b;
        SafeParcelWriter.r(parcel, 2, 4);
        parcel.writeInt(i3);
        int i4 = getServiceRequest.c;
        SafeParcelWriter.r(parcel, 3, 4);
        parcel.writeInt(i4);
        SafeParcelWriter.m(parcel, 4, getServiceRequest.d, false);
        SafeParcelWriter.f(parcel, 5, getServiceRequest.e);
        SafeParcelWriter.p(parcel, 6, getServiceRequest.f, i);
        SafeParcelWriter.b(parcel, 7, getServiceRequest.g);
        SafeParcelWriter.l(parcel, 8, getServiceRequest.h, i, false);
        SafeParcelWriter.p(parcel, 10, getServiceRequest.i, i);
        SafeParcelWriter.p(parcel, 11, getServiceRequest.j, i);
        boolean z = getServiceRequest.k;
        SafeParcelWriter.r(parcel, 12, 4);
        parcel.writeInt(z ? 1 : 0);
        int i5 = getServiceRequest.l;
        SafeParcelWriter.r(parcel, 13, 4);
        parcel.writeInt(i5);
        boolean z2 = getServiceRequest.m;
        SafeParcelWriter.r(parcel, 14, 4);
        parcel.writeInt(z2 ? 1 : 0);
        SafeParcelWriter.m(parcel, 15, getServiceRequest.n, false);
        SafeParcelWriter.t(parcel, s);
    }

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int B = SafeParcelReader.B(parcel);
        Scope[] scopeArr = GetServiceRequest.o;
        Bundle bundle = new Bundle();
        Feature[] featureArr = GetServiceRequest.p;
        Feature[] featureArr2 = featureArr;
        String str = null;
        IBinder iBinder = null;
        Account account = null;
        String str2 = null;
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        boolean z = false;
        int i4 = 0;
        boolean z2 = false;
        while (parcel.dataPosition() < B) {
            int readInt = parcel.readInt();
            switch ((char) readInt) {
                case 1:
                    i = SafeParcelReader.v(parcel, readInt);
                    break;
                case 2:
                    i2 = SafeParcelReader.v(parcel, readInt);
                    break;
                case 3:
                    i3 = SafeParcelReader.v(parcel, readInt);
                    break;
                case 4:
                    str = SafeParcelReader.i(parcel, readInt);
                    break;
                case 5:
                    iBinder = SafeParcelReader.u(parcel, readInt);
                    break;
                case 6:
                    scopeArr = (Scope[]) SafeParcelReader.l(parcel, readInt, Scope.CREATOR);
                    break;
                case 7:
                    bundle = SafeParcelReader.b(parcel, readInt);
                    break;
                case '\b':
                    account = (Account) SafeParcelReader.h(parcel, readInt, Account.CREATOR);
                    break;
                case '\t':
                default:
                    SafeParcelReader.A(parcel, readInt);
                    break;
                case '\n':
                    featureArr = (Feature[]) SafeParcelReader.l(parcel, readInt, Feature.CREATOR);
                    break;
                case 11:
                    featureArr2 = (Feature[]) SafeParcelReader.l(parcel, readInt, Feature.CREATOR);
                    break;
                case '\f':
                    z = SafeParcelReader.o(parcel, readInt);
                    break;
                case '\r':
                    i4 = SafeParcelReader.v(parcel, readInt);
                    break;
                case 14:
                    z2 = SafeParcelReader.o(parcel, readInt);
                    break;
                case 15:
                    str2 = SafeParcelReader.i(parcel, readInt);
                    break;
            }
        }
        SafeParcelReader.n(parcel, B);
        return new GetServiceRequest(i, i2, i3, str, iBinder, scopeArr, bundle, account, featureArr, featureArr2, z, i4, z2, str2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new GetServiceRequest[i];
    }
}
