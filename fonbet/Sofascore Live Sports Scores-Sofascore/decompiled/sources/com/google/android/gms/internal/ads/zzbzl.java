package com.google.android.gms.internal.ads;

import android.content.Intent;
import android.os.Parcel;
import com.google.android.gms.dynamic.IObjectWrapper;
import defpackage.x5n;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public abstract class zzbzl extends zzbev implements zzbzm {
    public static final /* synthetic */ int a = 0;

    public zzbzl() {
        super("com.google.android.gms.ads.internal.offline.IOfflineUtils");
    }

    @Override // com.google.android.gms.internal.ads.zzbev
    public final boolean D4(int i, Parcel parcel, Parcel parcel2) {
        switch (i) {
            case 1:
                Intent intent = (Intent) zzbew.b(parcel, Intent.CREATOR);
                zzbew.f(parcel);
                ((zzelp) this).K(intent);
                break;
            case 2:
                IObjectWrapper S1 = IObjectWrapper.Stub.S1(parcel.readStrongBinder());
                String readString = parcel.readString();
                String readString2 = parcel.readString();
                zzbew.f(parcel);
                ((zzelp) this).w4(S1, new com.google.android.gms.ads.internal.offline.buffering.zza(readString, readString2, ""));
                break;
            case 3:
                ((zzelp) this).zzg();
                break;
            case 4:
                ((zzelp) this).t(x5n.j(parcel, parcel));
                break;
            case 5:
                ((zzelp) this).T1(parcel.createStringArray(), parcel.createIntArray(), x5n.j(parcel, parcel));
                break;
            case 6:
                IObjectWrapper S12 = IObjectWrapper.Stub.S1(parcel.readStrongBinder());
                com.google.android.gms.ads.internal.offline.buffering.zza zzaVar = (com.google.android.gms.ads.internal.offline.buffering.zza) zzbew.b(parcel, com.google.android.gms.ads.internal.offline.buffering.zza.CREATOR);
                zzbew.f(parcel);
                ((zzelp) this).w4(S12, zzaVar);
                break;
            default:
                return false;
        }
        parcel2.writeNoException();
        return true;
    }
}
