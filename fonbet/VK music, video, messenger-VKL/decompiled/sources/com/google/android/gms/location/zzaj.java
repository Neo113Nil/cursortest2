package com.google.android.gms.location;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Nullable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.ironsource.X3;
import java.util.Arrays;
import xsna.exc0;
import xsna.jxz0;
import xsna.odj;
import xsna.ozg0;
import xsna.rzl;

/* compiled from: com.google.android.gms:play-services-location@@21.0.1 */
/* loaded from: classes12.dex */
public final class zzaj extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzaj> CREATOR = new jxz0();
    public final int b;
    public final int c;
    public final int d;
    public final int e;

    public zzaj(int i, int i2, int i3, int i4) {
        exc0.k("Start hour must be in range [0, 23].", i >= 0 && i <= 23);
        exc0.k("Start minute must be in range [0, 59].", i2 >= 0 && i2 <= 59);
        exc0.k("End hour must be in range [0, 23].", i3 >= 0 && i3 <= 23);
        exc0.k("End minute must be in range [0, 59].", i4 >= 0 && i4 <= 59);
        exc0.k("Parameters can't be all 0.", ((i + i2) + i3) + i4 > 0);
        this.b = i;
        this.c = i2;
        this.d = i3;
        this.e = i4;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zzaj)) {
            return false;
        }
        zzaj zzajVar = (zzaj) obj;
        return this.b == zzajVar.b && this.c == zzajVar.c && this.d == zzajVar.d && this.e == zzajVar.e;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.b), Integer.valueOf(this.c), Integer.valueOf(this.d), Integer.valueOf(this.e)});
    }

    public final String toString() {
        return rzl.a(this.d, this.e, ", endMinute=", X3.j.e, odj.a(this.b, this.c, "UserPreferredSleepWindow [startHour=", ", startMinute=", ", endHour="));
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        exc0.i(parcel);
        int w = ozg0.w(20293, parcel);
        ozg0.v(parcel, 1, 4);
        parcel.writeInt(this.b);
        ozg0.v(parcel, 2, 4);
        parcel.writeInt(this.c);
        ozg0.v(parcel, 3, 4);
        parcel.writeInt(this.d);
        ozg0.v(parcel, 4, 4);
        parcel.writeInt(this.e);
        ozg0.x(w, parcel);
    }
}
