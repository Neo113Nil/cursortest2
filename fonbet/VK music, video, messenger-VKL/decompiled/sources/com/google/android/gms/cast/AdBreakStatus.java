package com.google.android.gms.cast;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.Arrays;
import xsna.a601;
import xsna.o0a;
import xsna.o100;
import xsna.ozg0;

/* compiled from: com.google.android.gms:play-services-cast@@22.3.1 */
/* loaded from: classes12.dex */
public class AdBreakStatus extends AbstractSafeParcelable {
    public final long b;
    public final long c;

    @Nullable
    public final String d;

    @Nullable
    public final String e;
    public final long f;
    public static final o100 g = new o100("AdBreakStatus", null);

    @NonNull
    public static final Parcelable.Creator<AdBreakStatus> CREATOR = new a601();

    public AdBreakStatus(@Nullable String str, long j, @Nullable String str2, long j2, long j3) {
        this.b = j;
        this.c = j2;
        this.d = str;
        this.e = str2;
        this.f = j3;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AdBreakStatus)) {
            return false;
        }
        AdBreakStatus adBreakStatus = (AdBreakStatus) obj;
        return this.b == adBreakStatus.b && this.c == adBreakStatus.c && o0a.c(this.d, adBreakStatus.d) && o0a.c(this.e, adBreakStatus.e) && this.f == adBreakStatus.f;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Long.valueOf(this.b), Long.valueOf(this.c), this.d, this.e, Long.valueOf(this.f)});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NonNull Parcel parcel, int i) {
        int w = ozg0.w(20293, parcel);
        ozg0.v(parcel, 2, 8);
        parcel.writeLong(this.b);
        ozg0.v(parcel, 3, 8);
        parcel.writeLong(this.c);
        ozg0.q(parcel, 4, this.d, false);
        ozg0.q(parcel, 5, this.e, false);
        ozg0.v(parcel, 6, 8);
        parcel.writeLong(this.f);
        ozg0.x(w, parcel);
    }
}
