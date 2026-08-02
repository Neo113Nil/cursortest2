package com.google.android.gms.cast;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import com.google.android.gms.cast.internal.CastUtils;
import com.google.android.gms.cast.internal.Logger;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.Arrays;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@SafeParcelable.Class
@SafeParcelable.Reserved
/* loaded from: classes3.dex */
public class AdBreakStatus extends AbstractSafeParcelable {
    public final long a;
    public final long b;
    public final String c;
    public final String d;
    public final long e;
    public static final Logger f = new Logger("AdBreakStatus", null);

    @NonNull
    public static final Parcelable.Creator<AdBreakStatus> CREATOR = new zzc();

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    public static class Builder {
    }

    public AdBreakStatus(long j, long j2, String str, String str2, long j3) {
        this.a = j;
        this.b = j2;
        this.c = str;
        this.d = str2;
        this.e = j3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AdBreakStatus)) {
            return false;
        }
        AdBreakStatus adBreakStatus = (AdBreakStatus) obj;
        return this.a == adBreakStatus.a && this.b == adBreakStatus.b && CastUtils.c(this.c, adBreakStatus.c) && CastUtils.c(this.d, adBreakStatus.d) && this.e == adBreakStatus.e;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Long.valueOf(this.a), Long.valueOf(this.b), this.c, this.d, Long.valueOf(this.e)});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int s = SafeParcelWriter.s(parcel, 20293);
        SafeParcelWriter.r(parcel, 2, 8);
        parcel.writeLong(this.a);
        SafeParcelWriter.r(parcel, 3, 8);
        parcel.writeLong(this.b);
        SafeParcelWriter.m(parcel, 4, this.c, false);
        SafeParcelWriter.m(parcel, 5, this.d, false);
        SafeParcelWriter.r(parcel, 6, 8);
        parcel.writeLong(this.e);
        SafeParcelWriter.t(parcel, s);
    }
}
