package com.google.android.gms.cast.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.cast.ApplicationMetadata;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.Arrays;
import java.util.Locale;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@SafeParcelable.Class
@SafeParcelable.Reserved
/* loaded from: classes3.dex */
public final class zzac extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzac> CREATOR = new zzad();
    public final double a;
    public final boolean b;
    public final int c;
    public final ApplicationMetadata d;
    public final int e;
    public final com.google.android.gms.cast.zzao f;
    public final double g;

    public zzac(double d, boolean z, int i, ApplicationMetadata applicationMetadata, int i2, com.google.android.gms.cast.zzao zzaoVar, double d2) {
        this.a = d;
        this.b = z;
        this.c = i;
        this.d = applicationMetadata;
        this.e = i2;
        this.f = zzaoVar;
        this.g = d2;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof zzac)) {
            return false;
        }
        zzac zzacVar = (zzac) obj;
        if (this.a == zzacVar.a && this.b == zzacVar.b && this.c == zzacVar.c && CastUtils.c(this.d, zzacVar.d) && this.e == zzacVar.e) {
            com.google.android.gms.cast.zzao zzaoVar = this.f;
            if (CastUtils.c(zzaoVar, zzaoVar) && this.g == zzacVar.g) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Double.valueOf(this.a), Boolean.valueOf(this.b), Integer.valueOf(this.c), this.d, Integer.valueOf(this.e), this.f, Double.valueOf(this.g)});
    }

    public final String toString() {
        return String.format(Locale.ROOT, "volume=%f", Double.valueOf(this.a));
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int s = SafeParcelWriter.s(parcel, 20293);
        SafeParcelWriter.r(parcel, 2, 8);
        parcel.writeDouble(this.a);
        SafeParcelWriter.r(parcel, 3, 4);
        parcel.writeInt(this.b ? 1 : 0);
        SafeParcelWriter.r(parcel, 4, 4);
        parcel.writeInt(this.c);
        SafeParcelWriter.l(parcel, 5, this.d, i, false);
        SafeParcelWriter.r(parcel, 6, 4);
        parcel.writeInt(this.e);
        SafeParcelWriter.l(parcel, 7, this.f, i, false);
        SafeParcelWriter.r(parcel, 8, 8);
        parcel.writeDouble(this.g);
        SafeParcelWriter.t(parcel, s);
    }

    public zzac() {
        this(Double.NaN, false, -1, null, -1, null, Double.NaN);
    }
}
