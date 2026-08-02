package com.google.android.gms.fitness.request;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.internal.fitness.zzfe;
import com.google.android.gms.internal.fitness.zzff;
import xsna.gvz0;
import xsna.ozg0;

/* compiled from: com.google.android.gms:play-services-fitness@@21.2.0 */
@Deprecated
/* loaded from: classes12.dex */
public final class zzac extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzac> CREATOR = new gvz0();
    public final zzff b;

    public zzac(IBinder iBinder) {
        this.b = zzfe.zzc(iBinder);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int w = ozg0.w(20293, parcel);
        ozg0.h(parcel, 1, this.b.asBinder());
        ozg0.x(w, parcel);
    }

    public zzac(zzff zzffVar) {
        this.b = zzffVar;
    }
}
