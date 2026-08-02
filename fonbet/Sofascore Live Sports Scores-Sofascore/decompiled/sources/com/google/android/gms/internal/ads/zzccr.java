package com.google.android.gms.internal.ads;

import android.os.Parcel;
import com.google.android.gms.dynamic.IObjectWrapper;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public abstract class zzccr extends zzbev implements zzccs {
    public zzccr() {
        super("com.google.android.gms.ads.internal.reward.mediation.client.IMediationRewardedVideoAdListener");
    }

    @Override // com.google.android.gms.internal.ads.zzbev
    public final boolean D4(int i, Parcel parcel, Parcel parcel2) {
        switch (i) {
            case 1:
                IObjectWrapper S1 = IObjectWrapper.Stub.S1(parcel.readStrongBinder());
                zzbew.f(parcel);
                s(S1);
                break;
            case 2:
                IObjectWrapper.Stub.S1(parcel.readStrongBinder());
                parcel.readInt();
                zzbew.f(parcel);
                k1();
                break;
            case 3:
                IObjectWrapper S12 = IObjectWrapper.Stub.S1(parcel.readStrongBinder());
                zzbew.f(parcel);
                a3(S12);
                break;
            case 4:
                IObjectWrapper S13 = IObjectWrapper.Stub.S1(parcel.readStrongBinder());
                zzbew.f(parcel);
                t(S13);
                break;
            case 5:
                IObjectWrapper S14 = IObjectWrapper.Stub.S1(parcel.readStrongBinder());
                zzbew.f(parcel);
                C3(S14);
                break;
            case 6:
                IObjectWrapper S15 = IObjectWrapper.Stub.S1(parcel.readStrongBinder());
                zzbew.f(parcel);
                zzj(S15);
                break;
            case 7:
                IObjectWrapper S16 = IObjectWrapper.Stub.S1(parcel.readStrongBinder());
                zzcct zzcctVar = (zzcct) zzbew.b(parcel, zzcct.CREATOR);
                zzbew.f(parcel);
                w2(S16, zzcctVar);
                break;
            case 8:
                IObjectWrapper S17 = IObjectWrapper.Stub.S1(parcel.readStrongBinder());
                zzbew.f(parcel);
                x4(S17);
                break;
            case 9:
                IObjectWrapper S18 = IObjectWrapper.Stub.S1(parcel.readStrongBinder());
                int readInt = parcel.readInt();
                zzbew.f(parcel);
                P2(S18, readInt);
                break;
            case 10:
                IObjectWrapper.Stub.S1(parcel.readStrongBinder());
                zzbew.f(parcel);
                R2();
                break;
            case 11:
                IObjectWrapper S19 = IObjectWrapper.Stub.S1(parcel.readStrongBinder());
                zzbew.f(parcel);
                a0(S19);
                break;
            case 12:
                zzbew.f(parcel);
                break;
            case 13:
                IObjectWrapper S110 = IObjectWrapper.Stub.S1(parcel.readStrongBinder());
                zzbew.f(parcel);
                T0(S110);
                break;
            default:
                return false;
        }
        parcel2.writeNoException();
        return true;
    }
}
