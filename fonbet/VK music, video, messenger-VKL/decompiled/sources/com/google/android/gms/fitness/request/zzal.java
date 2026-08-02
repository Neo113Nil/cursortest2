package com.google.android.gms.fitness.request;

import android.app.PendingIntent;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Nullable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.fitness.data.DataSource;
import com.google.android.gms.fitness.data.DataType;
import com.google.android.gms.internal.fitness.zzcv;
import com.google.android.gms.internal.fitness.zzcw;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import xsna.dki0;
import xsna.dq70;
import xsna.hr01;
import xsna.ozg0;
import xsna.qq01;
import xsna.yxz0;

/* compiled from: com.google.android.gms:play-services-fitness@@21.2.0 */
/* loaded from: classes12.dex */
public final class zzal extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzal> CREATOR = new yxz0();

    @Nullable
    public final DataSource b;

    @Nullable
    public final DataType c;

    @Nullable
    public final hr01 d;
    public final long e;
    public final long f;

    @Nullable
    public final PendingIntent g;
    public final long h;
    public final int i;
    public final long j;
    public final List k;

    @Nullable
    public final zzcw l;

    public zzal(@Nullable DataSource dataSource, @Nullable DataType dataType, @Nullable IBinder iBinder, long j, long j2, @Nullable PendingIntent pendingIntent, long j3, int i, long j4, @Nullable IBinder iBinder2) {
        this.b = dataSource;
        this.c = dataType;
        this.d = iBinder == null ? null : qq01.f(iBinder);
        this.e = j;
        this.h = j3;
        this.f = j2;
        this.g = pendingIntent;
        this.i = i;
        this.k = Collections.EMPTY_LIST;
        this.j = j4;
        this.l = iBinder2 != null ? zzcv.zzc(iBinder2) : null;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zzal)) {
            return false;
        }
        zzal zzalVar = (zzal) obj;
        return dq70.b(this.b, zzalVar.b) && dq70.b(this.c, zzalVar.c) && dq70.b(this.d, zzalVar.d) && this.e == zzalVar.e && this.h == zzalVar.h && this.f == zzalVar.f && this.i == zzalVar.i;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.b, this.c, this.d, Long.valueOf(this.e), Long.valueOf(this.h), Long.valueOf(this.f), Integer.valueOf(this.i)});
    }

    public final String toString() {
        return String.format("SensorRegistrationRequest{type %s source %s interval %s fastest %s latency %s}", this.c, this.b, Long.valueOf(this.e), Long.valueOf(this.h), Long.valueOf(this.f));
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int w = ozg0.w(20293, parcel);
        ozg0.p(parcel, 1, this.b, i, false);
        ozg0.p(parcel, 2, this.c, i, false);
        hr01 hr01Var = this.d;
        ozg0.h(parcel, 3, hr01Var == null ? null : hr01Var.asBinder());
        ozg0.v(parcel, 6, 8);
        parcel.writeLong(this.e);
        ozg0.v(parcel, 7, 8);
        parcel.writeLong(this.f);
        ozg0.p(parcel, 8, this.g, i, false);
        ozg0.v(parcel, 9, 8);
        parcel.writeLong(this.h);
        ozg0.v(parcel, 10, 4);
        parcel.writeInt(this.i);
        ozg0.v(parcel, 12, 8);
        parcel.writeLong(this.j);
        zzcw zzcwVar = this.l;
        ozg0.h(parcel, 13, zzcwVar != null ? zzcwVar.asBinder() : null);
        ozg0.x(w, parcel);
    }

    public zzal(dki0 dki0Var, @Nullable hr01 hr01Var, @Nullable PendingIntent pendingIntent, zzcw zzcwVar) {
        throw null;
    }
}
