package com.google.android.gms.cast.framework;

import android.os.Parcel;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.internal.cast.zzb;
import com.google.android.gms.internal.cast.zzc;
import java.util.Iterator;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public abstract class zzab extends zzb implements zzac {
    public zzab() {
        super("com.google.android.gms.cast.framework.IAppVisibilityListener");
    }

    @Override // com.google.android.gms.internal.cast.zzb
    public final boolean J(int i, Parcel parcel, Parcel parcel2) {
        if (i == 1) {
            ObjectWrapper objectWrapper = new ObjectWrapper((com.google.android.gms.internal.cast.zzax) this);
            parcel2.writeNoException();
            zzc.c(parcel2, objectWrapper);
            return true;
        }
        if (i == 2) {
            com.google.android.gms.internal.cast.zzax zzaxVar = (com.google.android.gms.internal.cast.zzax) this;
            com.google.android.gms.internal.cast.zzax.c.c("onAppEnteredForeground", new Object[0]);
            zzaxVar.b = 1;
            Iterator it = zzaxVar.a.iterator();
            while (it.hasNext()) {
                ((com.google.android.gms.internal.cast.zzaw) it.next()).zza();
            }
            parcel2.writeNoException();
            return true;
        }
        if (i != 3) {
            if (i != 4) {
                return false;
            }
            parcel2.writeNoException();
            parcel2.writeInt(12451000);
            return true;
        }
        com.google.android.gms.internal.cast.zzax zzaxVar2 = (com.google.android.gms.internal.cast.zzax) this;
        com.google.android.gms.internal.cast.zzax.c.c("onAppEnteredBackground", new Object[0]);
        zzaxVar2.b = 2;
        Iterator it2 = zzaxVar2.a.iterator();
        while (it2.hasNext()) {
            ((com.google.android.gms.internal.cast.zzaw) it2.next()).zzb();
        }
        parcel2.writeNoException();
        return true;
    }
}
