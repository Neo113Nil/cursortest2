package com.google.android.gms.fitness.request;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Nullable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.internal.fitness.zzcv;
import com.google.android.gms.internal.fitness.zzcw;
import xsna.o301;
import xsna.ozg0;
import xsna.zr;

/* compiled from: com.google.android.gms:play-services-fitness@@21.2.0 */
/* loaded from: classes12.dex */
public final class zzbg extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzbg> CREATOR = new o301();
    public final String b;

    @Nullable
    public final zzcw c;

    public zzbg(@Nullable IBinder iBinder, String str) {
        this.b = str;
        this.c = iBinder == null ? null : zzcv.zzc(iBinder);
    }

    public final String toString() {
        return zr.a("UnclaimBleDeviceRequest{", this.b, "}");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int w = ozg0.w(20293, parcel);
        ozg0.q(parcel, 2, this.b, false);
        zzcw zzcwVar = this.c;
        ozg0.h(parcel, 3, zzcwVar == null ? null : zzcwVar.asBinder());
        ozg0.x(w, parcel);
    }

    public zzbg(String str, @Nullable zzcw zzcwVar) {
        this.b = str;
        this.c = zzcwVar;
    }
}
