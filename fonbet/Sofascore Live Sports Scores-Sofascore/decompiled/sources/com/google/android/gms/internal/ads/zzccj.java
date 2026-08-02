package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.ads.internal.client.zzbx;
import com.google.android.gms.common.internal.Preconditions;
import defpackage.p8o;
import defpackage.x5n;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public abstract class zzccj extends zzbev implements zzcck {
    public zzccj() {
        super("com.google.android.gms.ads.internal.reward.client.IRewardedVideoAd");
    }

    @Override // com.google.android.gms.internal.ads.zzbev
    public final boolean D4(int i, Parcel parcel, Parcel parcel2) {
        Bundle bundle;
        zzclm zzclmVar;
        zzdwk zzdwkVar;
        int i2 = 1;
        if (i == 1) {
            zzcco zzccoVar = (zzcco) zzbew.b(parcel, zzcco.CREATOR);
            zzbew.f(parcel);
            ((zzfla) this).E4(zzccoVar);
            parcel2.writeNoException();
            return true;
        }
        if (i == 2) {
            ((zzfla) this).zzb();
            parcel2.writeNoException();
            return true;
        }
        IInterface iInterface = null;
        if (i == 3) {
            IBinder readStrongBinder = parcel.readStrongBinder();
            if (readStrongBinder != null) {
                IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.reward.client.IRewardedVideoAdListener");
                iInterface = queryLocalInterface instanceof zzccn ? (zzccn) queryLocalInterface : new zzccl(readStrongBinder);
            }
            zzbew.f(parcel);
            Preconditions.e("setRewardedVideoAdListener can only be called from the UI thread.");
            ((zzfla) this).b.e.set(iInterface);
            parcel2.writeNoException();
            return true;
        }
        if (i == 34) {
            boolean a = zzbew.a(parcel);
            zzbew.f(parcel);
            zzfla zzflaVar = (zzfla) this;
            synchronized (zzflaVar) {
                Preconditions.e("setImmersiveMode must be called on the main UI thread.");
                zzflaVar.e = a;
            }
            parcel2.writeNoException();
            return true;
        }
        int i3 = 0;
        switch (i) {
            case 5:
                Preconditions.e("isLoaded must be called on the main UI thread.");
                boolean G4 = ((zzfla) this).G4();
                parcel2.writeNoException();
                ClassLoader classLoader = zzbew.a;
                parcel2.writeInt(G4 ? 1 : 0);
                return true;
            case 6:
                ((zzfla) this).t(null);
                parcel2.writeNoException();
                return true;
            case 7:
                ((zzfla) this).C3(null);
                parcel2.writeNoException();
                return true;
            case 8:
                ((zzfla) this).zzj(null);
                parcel2.writeNoException();
                return true;
            case 9:
                ((zzfla) this).t(x5n.j(parcel, parcel));
                parcel2.writeNoException();
                return true;
            case 10:
                ((zzfla) this).C3(x5n.j(parcel, parcel));
                parcel2.writeNoException();
                return true;
            case 11:
                ((zzfla) this).zzj(x5n.j(parcel, parcel));
                parcel2.writeNoException();
                return true;
            case 12:
                String F4 = ((zzfla) this).F4();
                parcel2.writeNoException();
                parcel2.writeString(F4);
                return true;
            case 13:
                String readString = parcel.readString();
                zzbew.f(parcel);
                zzfla zzflaVar2 = (zzfla) this;
                synchronized (zzflaVar2) {
                    Preconditions.e("setUserId must be called on the main UI thread.");
                    zzflaVar2.c.a = readString;
                }
                parcel2.writeNoException();
                return true;
            case 14:
                com.google.android.gms.ads.internal.client.zzby zza = zzbx.zza(parcel.readStrongBinder());
                zzbew.f(parcel);
                zzfla zzflaVar3 = (zzfla) this;
                Preconditions.e("setAdMetadataListener can only be called from the UI thread.");
                zzfkh zzfkhVar = zzflaVar3.b;
                if (zza == null) {
                    zzfkhVar.b.set(null);
                } else {
                    zzfkhVar.b.set(new p8o(zzflaVar3, zza, i2));
                }
                parcel2.writeNoException();
                return true;
            case 15:
                Preconditions.e("getAdMetadata can only be called from the UI thread.");
                zzdwk zzdwkVar2 = ((zzfla) this).d;
                if (zzdwkVar2 != null) {
                    zzdfj zzdfjVar = zzdwkVar2.q;
                    synchronized (zzdfjVar) {
                        bundle = new Bundle(zzdfjVar.b);
                    }
                } else {
                    bundle = new Bundle();
                }
                parcel2.writeNoException();
                zzbew.d(parcel2, bundle);
                return true;
            case 16:
                IBinder readStrongBinder2 = parcel.readStrongBinder();
                if (readStrongBinder2 != null) {
                    IInterface queryLocalInterface2 = readStrongBinder2.queryLocalInterface("com.google.android.gms.ads.internal.reward.client.IRewardedAdSkuListener");
                    iInterface = queryLocalInterface2 instanceof zzcci ? (zzcci) queryLocalInterface2 : new zzcci(readStrongBinder2, "com.google.android.gms.ads.internal.reward.client.IRewardedAdSkuListener");
                }
                zzbew.f(parcel);
                Preconditions.e("#008 Must be called on the main UI thread.: setRewardedAdSkuListener");
                ((zzfla) this).b.g.set(iInterface);
                parcel2.writeNoException();
                return true;
            case 17:
                parcel.readString();
                zzbew.f(parcel);
                parcel2.writeNoException();
                return true;
            case 18:
                ((zzfla) this).a0(x5n.j(parcel, parcel));
                parcel2.writeNoException();
                return true;
            case 19:
                String readString2 = parcel.readString();
                zzbew.f(parcel);
                zzfla zzflaVar4 = (zzfla) this;
                synchronized (zzflaVar4) {
                    Preconditions.e("#008 Must be called on the main UI thread.: setCustomData");
                    zzflaVar4.c.b = readString2;
                }
                parcel2.writeNoException();
                return true;
            case 20:
                zzdwk zzdwkVar3 = ((zzfla) this).d;
                if (zzdwkVar3 != null && (zzclmVar = (zzclm) zzdwkVar3.m.get()) != null && !zzclmVar.x()) {
                    i3 = 1;
                }
                parcel2.writeNoException();
                ClassLoader classLoader2 = zzbew.a;
                parcel2.writeInt(i3);
                return true;
            case 21:
                zzfla zzflaVar5 = (zzfla) this;
                synchronized (zzflaVar5) {
                    if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().a(zzbjg.O7)).booleanValue() && (zzdwkVar = zzflaVar5.d) != null) {
                        iInterface = zzdwkVar.f;
                    }
                }
                parcel2.writeNoException();
                zzbew.e(parcel2, iInterface);
                return true;
            default:
                return false;
        }
    }
}
