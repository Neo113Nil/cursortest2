package com.google.android.gms.internal.cast;

import android.os.Parcel;
import com.google.android.gms.common.api.Status;
import defpackage.a70;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public abstract class zzge extends zzb implements zzgf {
    public zzge() {
        super("com.google.android.gms.usagereporting.internal.IUsageReportingCallbacks");
    }

    @Override // com.google.android.gms.internal.cast.zzb
    public final boolean J(int i, Parcel parcel, Parcel parcel2) {
        switch (i) {
            case 2:
                Status status = (Status) zzc.a(parcel, Status.CREATOR);
                zzgc zzgcVar = (zzgc) zzc.a(parcel, zzgc.CREATOR);
                zzc.d(parcel);
                W0(status, zzgcVar);
                break;
            case 3:
                zzc.d(parcel);
                a70.r("Not implemented.");
                break;
            case 4:
                zzc.d(parcel);
                a70.r("Not implemented.");
                break;
            case 5:
                Status status2 = (Status) zzc.a(parcel, Status.CREATOR);
                zzc.d(parcel);
                m2(status2);
                break;
            case 6:
                parcel.createStringArrayList();
                zzc.d(parcel);
                a70.r("Not implemented.");
                break;
            case 7:
                zzc.d(parcel);
                a70.r("Not implemented.");
                break;
            case 8:
                parcel.readInt();
                zzc.d(parcel);
                a70.r("Not implemented.");
                break;
            case 9:
                zzc.d(parcel);
                a70.r("Not implemented");
                break;
            case 10:
                zzc.d(parcel);
                a70.r("Not implemented");
                break;
            case 11:
                zzc.d(parcel);
                a70.r("Not implemented.");
                break;
            case 12:
                zzc.d(parcel);
                a70.r("Not implemented.");
                break;
            case 13:
                zzc.d(parcel);
                a70.r("Not implemented.");
                break;
            case 14:
                zzc.d(parcel);
                a70.r("Not implemented.");
                break;
            case 15:
                zzc.d(parcel);
                a70.r("Not implemented.");
                break;
        }
        return false;
    }
}
