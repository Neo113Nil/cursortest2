package com.google.android.gms.fitness.request;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Nullable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.fitness.data.Subscription;
import com.google.android.gms.internal.fitness.zzcv;
import com.google.android.gms.internal.fitness.zzcw;
import xsna.dq70;
import xsna.h301;
import xsna.ozg0;

/* compiled from: com.google.android.gms:play-services-fitness@@21.2.0 */
/* loaded from: classes12.dex */
public final class zzbe extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzbe> CREATOR = new h301();

    @Nullable
    public final Subscription b;
    public final boolean c;

    @Nullable
    public final zzcw d;

    public zzbe(@Nullable Subscription subscription, boolean z, @Nullable IBinder iBinder) {
        this.b = subscription;
        this.c = z;
        this.d = iBinder == null ? null : zzcv.zzc(iBinder);
    }

    public final String toString() {
        dq70.a aVar = new dq70.a(this);
        aVar.a(this.b, "subscription");
        return aVar.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int w = ozg0.w(20293, parcel);
        ozg0.p(parcel, 1, this.b, i, false);
        ozg0.v(parcel, 2, 4);
        parcel.writeInt(this.c ? 1 : 0);
        zzcw zzcwVar = this.d;
        ozg0.h(parcel, 3, zzcwVar == null ? null : zzcwVar.asBinder());
        ozg0.x(w, parcel);
    }

    public zzbe(@Nullable Subscription subscription, boolean z, @Nullable zzcw zzcwVar) {
        this.b = subscription;
        this.c = false;
        this.d = zzcwVar;
    }
}
