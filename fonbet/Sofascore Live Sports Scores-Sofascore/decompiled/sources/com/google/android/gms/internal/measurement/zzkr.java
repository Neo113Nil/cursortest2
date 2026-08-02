package com.google.android.gms.internal.measurement;

import android.os.Parcel;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.TaskUtil;
import defpackage.juo;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public abstract class zzkr extends zzbm implements zzks {
    public zzkr() {
        super("com.google.android.gms.phenotype.internal.IPhenotypeCallbacks");
    }

    @Override // com.google.android.gms.internal.measurement.zzbm
    public final boolean J(int i, Parcel parcel, Parcel parcel2) {
        switch (i) {
            case 1:
                Status status = (Status) zzbn.a(parcel, Status.CREATOR);
                zzbn.d(parcel);
                TaskUtil.a(status, null, ((juo) this).a);
                return true;
            case 2:
                Status status2 = (Status) zzbn.a(parcel, Status.CREATOR);
                zzbn.d(parcel);
                TaskUtil.a(status2, null, ((juo) this).a);
                return true;
            case 3:
                Status status3 = (Status) zzbn.a(parcel, Status.CREATOR);
                zzbn.d(parcel);
                TaskUtil.a(status3, null, ((juo) this).a);
                return true;
            case 4:
                Status status4 = (Status) zzbn.a(parcel, Status.CREATOR);
                zzjh zzjhVar = (zzjh) zzbn.a(parcel, zzjh.CREATOR);
                zzbn.d(parcel);
                TaskUtil.a(status4, zzjhVar, ((juo) this).a);
                return true;
            case 5:
                Status status5 = (Status) zzbn.a(parcel, Status.CREATOR);
                zzbn.d(parcel);
                TaskUtil.a(status5, null, ((juo) this).a);
                return true;
            case 6:
                Status status6 = (Status) zzbn.a(parcel, Status.CREATOR);
                zzjl zzjlVar = (zzjl) zzbn.a(parcel, zzjl.CREATOR);
                zzbn.d(parcel);
                TaskUtil.a(status6, zzjlVar, ((juo) this).a);
                return true;
            case 7:
                Status status7 = (Status) zzbn.a(parcel, Status.CREATOR);
                zzjj zzjjVar = (zzjj) zzbn.a(parcel, zzjj.CREATOR);
                zzbn.d(parcel);
                TaskUtil.a(status7, zzjjVar, ((juo) this).a);
                return true;
            case 8:
                Status status8 = (Status) zzbn.a(parcel, Status.CREATOR);
                zzbn.d(parcel);
                TaskUtil.a(status8, null, ((juo) this).a);
                return true;
            case 9:
                Status status9 = (Status) zzbn.a(parcel, Status.CREATOR);
                zzjo zzjoVar = (zzjo) zzbn.a(parcel, zzjo.CREATOR);
                zzbn.d(parcel);
                TaskUtil.a(status9, zzjoVar, ((juo) this).a);
                return true;
            case 10:
                Status status10 = (Status) zzbn.a(parcel, Status.CREATOR);
                zzjh zzjhVar2 = (zzjh) zzbn.a(parcel, zzjh.CREATOR);
                zzbn.d(parcel);
                TaskUtil.a(status10, zzjhVar2, ((juo) this).a);
                return true;
            case 11:
                Status status11 = (Status) zzbn.a(parcel, Status.CREATOR);
                parcel.readLong();
                zzbn.d(parcel);
                TaskUtil.a(status11, null, ((juo) this).a);
                return true;
            case 12:
                Status status12 = (Status) zzbn.a(parcel, Status.CREATOR);
                zzbn.d(parcel);
                TaskUtil.a(status12, null, ((juo) this).a);
                return true;
            case 13:
                Status status13 = (Status) zzbn.a(parcel, Status.CREATOR);
                zzjs zzjsVar = (zzjs) zzbn.a(parcel, zzjs.CREATOR);
                zzbn.d(parcel);
                TaskUtil.a(status13, zzjsVar, ((juo) this).a);
                return true;
            case 14:
                Status status14 = (Status) zzbn.a(parcel, Status.CREATOR);
                zzbn.d(parcel);
                TaskUtil.a(status14, null, ((juo) this).a);
                return true;
            case 15:
                Status status15 = (Status) zzbn.a(parcel, Status.CREATOR);
                zzbn.d(parcel);
                TaskUtil.a(status15, null, ((juo) this).a);
                return true;
            case 16:
                Status status16 = (Status) zzbn.a(parcel, Status.CREATOR);
                long readLong = parcel.readLong();
                zzbn.d(parcel);
                TaskUtil.a(status16, Long.valueOf(readLong), ((juo) this).a);
                return true;
            default:
                return false;
        }
    }
}
