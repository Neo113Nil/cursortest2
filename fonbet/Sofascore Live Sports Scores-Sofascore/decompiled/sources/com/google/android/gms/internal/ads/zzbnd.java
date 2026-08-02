package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.view.View;
import com.google.android.gms.ads.internal.util.client.zzo;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import defpackage.x5n;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public abstract class zzbnd extends zzbev implements zzbne {
    public zzbnd() {
        super("com.google.android.gms.ads.internal.formats.client.INativeAdViewHolderDelegate");
    }

    @Override // com.google.android.gms.internal.ads.zzbev
    public final boolean D4(int i, Parcel parcel, Parcel parcel2) {
        if (i == 1) {
            IObjectWrapper j = x5n.j(parcel, parcel);
            zzdrk zzdrkVar = (zzdrk) this;
            synchronized (zzdrkVar) {
                Object Z1 = ObjectWrapper.Z1(j);
                if (Z1 instanceof zzdqm) {
                    zzdqm zzdqmVar = zzdrkVar.e;
                    if (zzdqmVar != null) {
                        zzdqmVar.p(zzdrkVar);
                    }
                    zzdqm zzdqmVar2 = (zzdqm) Z1;
                    if (zzdqmVar2.p.b()) {
                        zzdrkVar.e = zzdqmVar2;
                        zzdqmVar2.o(zzdrkVar);
                        zzdrkVar.e.f(zzdrkVar.l2());
                    } else {
                        int i2 = com.google.android.gms.ads.internal.util.zze.zza;
                        zzo.zzf("Your account must be enabled to use this feature. Talk to your account manager to request this feature for your account.");
                    }
                } else {
                    int i3 = com.google.android.gms.ads.internal.util.zze.zza;
                    zzo.zzi("Not an instance of InternalNativeAd. This is most likely a transient error");
                }
            }
        } else if (i == 2) {
            zzdrk zzdrkVar2 = (zzdrk) this;
            synchronized (zzdrkVar2) {
                zzdqm zzdqmVar3 = zzdrkVar2.e;
                if (zzdqmVar3 != null) {
                    zzdqmVar3.p(zzdrkVar2);
                    zzdrkVar2.e = null;
                }
            }
        } else {
            if (i != 3) {
                return false;
            }
            IObjectWrapper j2 = x5n.j(parcel, parcel);
            zzdrk zzdrkVar3 = (zzdrk) this;
            synchronized (zzdrkVar3) {
                try {
                    if (zzdrkVar3.e != null) {
                        Object Z12 = ObjectWrapper.Z1(j2);
                        if (!(Z12 instanceof View)) {
                            int i4 = com.google.android.gms.ads.internal.util.zze.zza;
                            zzo.zzi("Calling NativeAdViewHolderNonagonDelegate.setClickConfirmingView with wrong wrapped object");
                        }
                        zzdqm zzdqmVar4 = zzdrkVar3.e;
                        View view = (View) Z12;
                        synchronized (zzdqmVar4) {
                            zzdqmVar4.n.b(view);
                        }
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        parcel2.writeNoException();
        return true;
    }
}
