package com.google.android.gms.cast.internal;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Nullable;
import com.google.android.gms.cast.ApplicationMetadata;
import com.google.android.gms.cast.zzao;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.Arrays;
import java.util.Locale;
import xsna.cvz0;
import xsna.o0a;
import xsna.ozg0;

/* compiled from: com.google.android.gms:play-services-cast@@22.3.1 */
/* loaded from: classes12.dex */
public final class zzac extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzac> CREATOR = new cvz0();
    public final double b;
    public final boolean c;
    public final int d;

    @Nullable
    public final ApplicationMetadata e;
    public final int f;

    @Nullable
    public final zzao g;
    public final double h;

    public zzac() {
        this(Double.NaN, false, -1, null, -1, null, Double.NaN);
    }

    public final boolean equals(@Nullable Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof zzac)) {
            return false;
        }
        zzac zzacVar = (zzac) obj;
        if (this.b == zzacVar.b && this.c == zzacVar.c && this.d == zzacVar.d && o0a.c(this.e, zzacVar.e) && this.f == zzacVar.f) {
            zzao zzaoVar = this.g;
            if (o0a.c(zzaoVar, zzaoVar) && this.h == zzacVar.h) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Double.valueOf(this.b), Boolean.valueOf(this.c), Integer.valueOf(this.d), this.e, Integer.valueOf(this.f), this.g, Double.valueOf(this.h)});
    }

    public final String toString() {
        return String.format(Locale.ROOT, "volume=%f", Double.valueOf(this.b));
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int w = ozg0.w(20293, parcel);
        ozg0.v(parcel, 2, 8);
        parcel.writeDouble(this.b);
        ozg0.v(parcel, 3, 4);
        parcel.writeInt(this.c ? 1 : 0);
        ozg0.v(parcel, 4, 4);
        parcel.writeInt(this.d);
        ozg0.p(parcel, 5, this.e, i, false);
        ozg0.v(parcel, 6, 4);
        parcel.writeInt(this.f);
        ozg0.p(parcel, 7, this.g, i, false);
        ozg0.v(parcel, 8, 8);
        parcel.writeDouble(this.h);
        ozg0.x(w, parcel);
    }

    public zzac(double d, boolean z, int i, @Nullable ApplicationMetadata applicationMetadata, int i2, @Nullable zzao zzaoVar, double d2) {
        this.b = d;
        this.c = z;
        this.d = i;
        this.e = applicationMetadata;
        this.f = i2;
        this.g = zzaoVar;
        this.h = d2;
    }
}
