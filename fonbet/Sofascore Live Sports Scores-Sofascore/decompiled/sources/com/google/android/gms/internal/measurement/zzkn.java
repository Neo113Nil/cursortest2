package com.google.android.gms.internal.measurement;

import android.os.Parcel;
import com.google.android.gms.common.api.internal.ListenerHolder;
import defpackage.ito;
import defpackage.sto;
import defpackage.vlo;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public abstract class zzkn extends zzbm implements zzko {
    public zzkn() {
        super("com.google.android.gms.phenotype.internal.IFlagUpdateListener");
    }

    @Override // com.google.android.gms.internal.measurement.zzbm
    public final boolean J(int i, Parcel parcel, Parcel parcel2) {
        if (i != 2) {
            return false;
        }
        byte[] createByteArray = parcel.createByteArray();
        zzbn.d(parcel);
        sto stoVar = (sto) this;
        ito itoVar = new ito(stoVar, createByteArray);
        ListenerHolder listenerHolder = stoVar.a;
        listenerHolder.a.execute(new vlo(26, listenerHolder, itoVar));
        return true;
    }
}
