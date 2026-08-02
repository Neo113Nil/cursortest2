package com.google.android.gms.fitness.request;

import android.app.PendingIntent;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Nullable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.internal.fitness.zzcv;
import com.google.android.gms.internal.fitness.zzcw;
import java.util.Arrays;
import xsna.dq70;
import xsna.ozg0;
import xsna.ozz0;
import xsna.rd6;

/* compiled from: com.google.android.gms:play-services-fitness@@21.2.0 */
/* loaded from: classes12.dex */
public final class zzas extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzas> CREATOR = new ozz0();
    public final PendingIntent b;

    @Nullable
    public final zzcw c;

    public zzas(PendingIntent pendingIntent, @Nullable IBinder iBinder) {
        this.b = pendingIntent;
        this.c = iBinder == null ? null : zzcv.zzc(iBinder);
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof zzas) {
            if (dq70.b(this.b, ((zzas) obj).b)) {
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
        aVar.a(this.b, rd6.KEY_PENDING_INTENT);
        return aVar.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int w = ozg0.w(20293, parcel);
        ozg0.p(parcel, 1, this.b, i, false);
        zzcw zzcwVar = this.c;
        ozg0.h(parcel, 2, zzcwVar == null ? null : zzcwVar.asBinder());
        ozg0.x(w, parcel);
    }

    public zzas(PendingIntent pendingIntent, @Nullable zzcw zzcwVar) {
        this.b = pendingIntent;
        this.c = zzcwVar;
    }
}
