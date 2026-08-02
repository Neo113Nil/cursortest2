package com.google.android.gms.location;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Nullable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.Arrays;
import xsna.hvz0;
import xsna.odj;
import xsna.ozg0;
import xsna.xy6;

/* compiled from: com.google.android.gms:play-services-location@@21.0.1 */
@Deprecated
/* loaded from: classes12.dex */
public final class zzac extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzac> CREATOR = new hvz0();
    public final int b;
    public final int c;
    public final long d;
    public final long e;

    public zzac(int i, int i2, long j, long j2) {
        this.b = i;
        this.c = i2;
        this.d = j;
        this.e = j2;
    }

    public final boolean equals(@Nullable Object obj) {
        if (obj instanceof zzac) {
            zzac zzacVar = (zzac) obj;
            if (this.b == zzacVar.b && this.c == zzacVar.c && this.d == zzacVar.d && this.e == zzacVar.e) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.c), Integer.valueOf(this.b), Long.valueOf(this.e), Long.valueOf(this.d)});
    }

    public final String toString() {
        StringBuilder a = odj.a(this.b, this.c, "NetworkLocationStatus: Wifi status: ", " Cell status: ", " elapsed time NS: ");
        a.append(this.e);
        return xy6.a(this.d, " system time ms: ", a);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int w = ozg0.w(20293, parcel);
        ozg0.v(parcel, 1, 4);
        parcel.writeInt(this.b);
        ozg0.v(parcel, 2, 4);
        parcel.writeInt(this.c);
        ozg0.v(parcel, 3, 8);
        parcel.writeLong(this.d);
        ozg0.v(parcel, 4, 8);
        parcel.writeLong(this.e);
        ozg0.x(w, parcel);
    }
}
