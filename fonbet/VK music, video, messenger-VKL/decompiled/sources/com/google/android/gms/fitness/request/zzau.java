package com.google.android.gms.fitness.request;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Nullable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.fitness.data.Session;
import com.google.android.gms.internal.fitness.zzcv;
import com.google.android.gms.internal.fitness.zzcw;
import java.util.Arrays;
import java.util.concurrent.TimeUnit;
import xsna.dq70;
import xsna.exc0;
import xsna.ozg0;
import xsna.zzz0;

/* compiled from: com.google.android.gms:play-services-fitness@@21.2.0 */
/* loaded from: classes12.dex */
public final class zzau extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzau> CREATOR = new zzz0();
    public final Session b;

    @Nullable
    public final zzcw c;

    public zzau(Session session, @Nullable IBinder iBinder) {
        this.b = session;
        this.c = iBinder == null ? null : zzcv.zzc(iBinder);
    }

    public final boolean equals(@Nullable Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof zzau) {
            if (dq70.b(this.b, ((zzau) obj).b)) {
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
        aVar.a(this.b, "session");
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

    public zzau(Session session, @Nullable zzcw zzcwVar) {
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        exc0.a("Cannot start a session in the future", timeUnit.convert(session.b, timeUnit) <= System.currentTimeMillis());
        exc0.a("Cannot start a session which has already ended", session.c == 0);
        this.b = session;
        this.c = zzcwVar;
    }
}
