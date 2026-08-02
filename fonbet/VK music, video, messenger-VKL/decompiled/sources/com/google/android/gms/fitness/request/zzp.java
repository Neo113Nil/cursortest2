package com.google.android.gms.fitness.request;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Nullable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.internal.fitness.zzby;
import com.google.android.gms.internal.fitness.zzbz;
import java.util.Arrays;
import xsna.dq70;
import xsna.go01;
import xsna.ozg0;

/* compiled from: com.google.android.gms:play-services-fitness@@21.2.0 */
@Deprecated
/* loaded from: classes12.dex */
public final class zzp extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzp> CREATOR = new go01();
    public final String b;
    public final zzbz c;

    public zzp(IBinder iBinder, String str) {
        this.b = str;
        this.c = zzby.zzb(iBinder);
    }

    public final boolean equals(@Nullable Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof zzp) {
            if (dq70.b(this.b, ((zzp) obj).b)) {
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
        aVar.a(this.b, "name");
        return aVar.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int w = ozg0.w(20293, parcel);
        ozg0.q(parcel, 1, this.b, false);
        ozg0.h(parcel, 3, this.c.asBinder());
        ozg0.x(w, parcel);
    }

    public zzp(String str, zzbz zzbzVar) {
        this.b = str;
        this.c = zzbzVar;
    }
}
