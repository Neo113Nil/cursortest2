package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.view.View;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import defpackage.x5n;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public abstract class zzbjx extends zzbev implements zzbjy {
    public zzbjx() {
        super("com.google.android.gms.ads.internal.customrenderedad.client.ICustomRenderedAd");
    }

    @Override // com.google.android.gms.internal.ads.zzbev
    public final boolean D4(int i, Parcel parcel, Parcel parcel2) {
        if (i == 1) {
            parcel2.writeNoException();
            parcel2.writeString(((zzbjw) this).b);
            return true;
        }
        if (i == 2) {
            parcel2.writeNoException();
            parcel2.writeString(((zzbjw) this).c);
            return true;
        }
        if (i == 3) {
            IObjectWrapper j = x5n.j(parcel, parcel);
            zzbjw zzbjwVar = (zzbjw) this;
            if (j != null) {
                zzbjwVar.a.zza((View) ObjectWrapper.Z1(j));
            }
            parcel2.writeNoException();
            return true;
        }
        if (i == 4) {
            ((zzbjw) this).a.zzb();
            parcel2.writeNoException();
            return true;
        }
        if (i != 5) {
            return false;
        }
        ((zzbjw) this).a.zzc();
        parcel2.writeNoException();
        return true;
    }
}
