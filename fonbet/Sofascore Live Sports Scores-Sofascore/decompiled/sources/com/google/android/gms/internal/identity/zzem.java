package com.google.android.gms.internal.identity;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import defpackage.j6o;
import java.util.ArrayList;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@SafeParcelable.Class
@SafeParcelable.Reserved
/* loaded from: classes3.dex */
public final class zzem extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzem> CREATOR = new zzen();
    public final zzex a;
    public final PendingIntent b;
    public final String c;

    public zzem(ArrayList arrayList, PendingIntent pendingIntent, String str) {
        zzex t;
        if (arrayList == null) {
            j6o j6oVar = zzex.b;
            t = a.e;
        } else {
            t = zzex.t(arrayList);
        }
        this.a = t;
        this.b = pendingIntent;
        this.c = str;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int s = SafeParcelWriter.s(parcel, 20293);
        SafeParcelWriter.o(parcel, 1, this.a);
        SafeParcelWriter.l(parcel, 2, this.b, i, false);
        SafeParcelWriter.m(parcel, 3, this.c, false);
        SafeParcelWriter.t(parcel, s);
    }
}
