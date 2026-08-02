package com.google.android.gms.location;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.ironsource.X3;
import com.vk.movika.sdk.android.defaultplayer.interactive.c;
import java.util.Arrays;
import xsna.ozg0;
import xsna.qr01;

/* compiled from: com.google.android.gms:play-services-location@@21.0.1 */
/* loaded from: classes12.dex */
public final class LocationAvailability extends AbstractSafeParcelable implements ReflectedParcelable {

    @NonNull
    public static final Parcelable.Creator<LocationAvailability> CREATOR;
    public final int b;
    public final int c;
    public final long d;
    public final int e;
    public final zzac[] f;

    static {
        new LocationAvailability(0, 1, 1, 0L, null);
        new LocationAvailability(1000, 1, 1, 0L, null);
        CREATOR = new qr01();
    }

    public LocationAvailability(int i, int i2, int i3, long j, zzac[] zzacVarArr) {
        this.e = i < 1000 ? 0 : 1000;
        this.b = i2;
        this.c = i3;
        this.d = j;
        this.f = zzacVarArr;
    }

    public final boolean equals(@Nullable Object obj) {
        if (obj instanceof LocationAvailability) {
            LocationAvailability locationAvailability = (LocationAvailability) obj;
            if (this.b == locationAvailability.b && this.c == locationAvailability.c && this.d == locationAvailability.d && this.e == locationAvailability.e && Arrays.equals(this.f, locationAvailability.f)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.e)});
    }

    @NonNull
    public final String toString() {
        return c.a("LocationAvailability[", X3.j.e, this.e < 1000);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NonNull Parcel parcel, int i) {
        int w = ozg0.w(20293, parcel);
        ozg0.v(parcel, 1, 4);
        parcel.writeInt(this.b);
        ozg0.v(parcel, 2, 4);
        parcel.writeInt(this.c);
        ozg0.v(parcel, 3, 8);
        parcel.writeLong(this.d);
        ozg0.v(parcel, 4, 4);
        parcel.writeInt(this.e);
        ozg0.t(parcel, 5, this.f, i);
        int i2 = this.e >= 1000 ? 0 : 1;
        ozg0.v(parcel, 6, 4);
        parcel.writeInt(i2);
        ozg0.x(w, parcel);
    }
}
