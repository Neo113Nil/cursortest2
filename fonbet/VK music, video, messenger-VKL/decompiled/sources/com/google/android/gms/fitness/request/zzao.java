package com.google.android.gms.fitness.request;

import android.app.PendingIntent;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Nullable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.internal.fitness.zzcv;
import com.google.android.gms.internal.fitness.zzcw;
import xsna.hr01;
import xsna.nyz0;
import xsna.ozg0;
import xsna.qq01;

/* compiled from: com.google.android.gms:play-services-fitness@@21.2.0 */
/* loaded from: classes12.dex */
public final class zzao extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzao> CREATOR = new nyz0();

    @Nullable
    public final hr01 b;

    @Nullable
    public final PendingIntent c;

    @Nullable
    public final zzcw d;

    public zzao(@Nullable IBinder iBinder, @Nullable PendingIntent pendingIntent, @Nullable IBinder iBinder2) {
        this.b = iBinder == null ? null : qq01.f(iBinder);
        this.c = pendingIntent;
        this.d = iBinder2 != null ? zzcv.zzc(iBinder2) : null;
    }

    public final String toString() {
        return String.format("SensorUnregistrationRequest{%s}", this.b);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int w = ozg0.w(20293, parcel);
        hr01 hr01Var = this.b;
        ozg0.h(parcel, 1, hr01Var == null ? null : hr01Var.asBinder());
        ozg0.p(parcel, 2, this.c, i, false);
        zzcw zzcwVar = this.d;
        ozg0.h(parcel, 3, zzcwVar != null ? zzcwVar.asBinder() : null);
        ozg0.x(w, parcel);
    }

    public zzao(@Nullable hr01 hr01Var, @Nullable PendingIntent pendingIntent, @Nullable zzcw zzcwVar) {
        this.b = hr01Var;
        this.c = pendingIntent;
        this.d = zzcwVar;
    }
}
