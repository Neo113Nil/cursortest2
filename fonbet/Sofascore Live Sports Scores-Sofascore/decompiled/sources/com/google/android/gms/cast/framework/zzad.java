package com.google.android.gms.cast.framework;

import android.os.Parcel;
import com.google.android.gms.cast.LaunchOptions;
import com.google.android.gms.cast.zzbm;
import com.google.android.gms.common.api.internal.TaskApiCall;
import com.google.android.gms.internal.cast.zzb;
import com.google.android.gms.internal.cast.zzc;
import defpackage.c0l;
import defpackage.hcc;
import defpackage.mxn;
import defpackage.n1p;
import defpackage.x6k;
import defpackage.x7p;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public abstract class zzad extends zzb implements zzae {
    public zzad() {
        super("com.google.android.gms.cast.framework.ICastConnectionController");
    }

    @Override // com.google.android.gms.internal.cast.zzb
    public final boolean J(int i, Parcel parcel, Parcel parcel2) {
        int i2 = 1;
        if (i == 1) {
            String readString = parcel.readString();
            String readString2 = parcel.readString();
            zzc.d(parcel);
            x7p x7pVar = (x7p) this;
            CastSession castSession = x7pVar.a;
            zzbm zzbmVar = castSession.i;
            if (zzbmVar != null && zzbmVar.n()) {
                zzbm zzbmVar2 = castSession.i;
                zzbmVar2.getClass();
                TaskApiCall.Builder a = TaskApiCall.a();
                a.a = new hcc(26, zzbmVar2, readString, readString2);
                a.d = 8407;
                zzbmVar2.h(1, a.a()).addOnCompleteListener(new mxn(x7pVar, 21));
            }
            parcel2.writeNoException();
            return true;
        }
        if (i == 2) {
            String readString3 = parcel.readString();
            LaunchOptions launchOptions = (LaunchOptions) zzc.a(parcel, LaunchOptions.CREATOR);
            zzc.d(parcel);
            x7p x7pVar2 = (x7p) this;
            CastSession castSession2 = x7pVar2.a;
            zzbm zzbmVar3 = castSession2.i;
            if (zzbmVar3 != null && zzbmVar3.n()) {
                zzbm zzbmVar4 = castSession2.i;
                zzbmVar4.getClass();
                TaskApiCall.Builder a2 = TaskApiCall.a();
                a2.a = new x6k(23, zzbmVar4, readString3, launchOptions);
                a2.d = 8406;
                zzbmVar4.h(1, a2.a()).addOnCompleteListener(new n1p(x7pVar2, i2));
            }
            parcel2.writeNoException();
            return true;
        }
        if (i != 3) {
            if (i != 4) {
                if (i != 5) {
                    return false;
                }
                parcel2.writeNoException();
                parcel2.writeInt(12451000);
                return true;
            }
            int readInt = parcel.readInt();
            zzc.d(parcel);
            ((x7p) this).a.n(readInt);
            parcel2.writeNoException();
            return true;
        }
        String readString4 = parcel.readString();
        zzc.d(parcel);
        CastSession castSession3 = ((x7p) this).a;
        zzbm zzbmVar5 = castSession3.i;
        if (zzbmVar5 != null && zzbmVar5.n()) {
            zzbm zzbmVar6 = castSession3.i;
            zzbmVar6.getClass();
            TaskApiCall.Builder a3 = TaskApiCall.a();
            a3.a = new c0l(16, zzbmVar6, readString4);
            a3.d = 8409;
            zzbmVar6.h(1, a3.a());
        }
        parcel2.writeNoException();
        return true;
    }
}
