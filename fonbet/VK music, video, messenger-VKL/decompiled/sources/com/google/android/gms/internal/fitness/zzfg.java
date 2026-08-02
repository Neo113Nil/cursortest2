package com.google.android.gms.internal.fitness;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.Collections;
import java.util.List;
import xsna.dq70;
import xsna.ozg0;

/* compiled from: com.google.android.gms:play-services-fitness@@21.2.0 */
/* loaded from: classes12.dex */
public final class zzfg extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzfg> CREATOR = new zzfh();
    private final List zza;

    public zzfg(List list) {
        this.zza = list;
    }

    public final String toString() {
        dq70.a aVar = new dq70.a(this);
        aVar.a(this.zza, "dataTypes");
        return aVar.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int w = ozg0.w(20293, parcel);
        ozg0.u(parcel, 1, Collections.unmodifiableList(this.zza), false);
        ozg0.x(w, parcel);
    }

    public final List zza() {
        return Collections.unmodifiableList(this.zza);
    }
}
