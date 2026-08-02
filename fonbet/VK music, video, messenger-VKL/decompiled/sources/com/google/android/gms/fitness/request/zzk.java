package com.google.android.gms.fitness.request;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Nullable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.fitness.data.DataSet;
import com.google.android.gms.internal.fitness.zzcv;
import com.google.android.gms.internal.fitness.zzcw;
import java.util.Arrays;
import xsna.dq70;
import xsna.ozg0;
import xsna.pk01;

/* compiled from: com.google.android.gms:play-services-fitness@@21.2.0 */
/* loaded from: classes12.dex */
public final class zzk extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzk> CREATOR = new pk01();
    public final DataSet b;

    @Nullable
    public final zzcw c;
    public final boolean d;

    public zzk(DataSet dataSet, @Nullable IBinder iBinder, boolean z) {
        this.b = dataSet;
        this.c = iBinder == null ? null : zzcv.zzc(iBinder);
        this.d = z;
    }

    public final boolean equals(@Nullable Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof zzk) {
            if (dq70.b(this.b, ((zzk) obj).b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.b});
    }

    public final String toString() {
        dq70.a aVar = new dq70.a(this);
        aVar.a(this.b, "dataSet");
        return aVar.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int w = ozg0.w(20293, parcel);
        ozg0.p(parcel, 1, this.b, i, false);
        zzcw zzcwVar = this.c;
        ozg0.h(parcel, 2, zzcwVar == null ? null : zzcwVar.asBinder());
        ozg0.v(parcel, 4, 4);
        parcel.writeInt(this.d ? 1 : 0);
        ozg0.x(w, parcel);
    }

    public zzk(DataSet dataSet, zzcw zzcwVar, boolean z) {
        this.b = dataSet;
        this.c = zzcwVar;
        this.d = false;
    }
}
