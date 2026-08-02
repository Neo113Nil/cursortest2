package com.google.android.gms.cast;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import com.google.android.gms.cast.internal.Logger;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.Arrays;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@SafeParcelable.Class
@SafeParcelable.Reserved
/* loaded from: classes3.dex */
public class MediaLiveSeekableRange extends AbstractSafeParcelable {
    public final long a;
    public final long b;
    public final boolean c;
    public final boolean d;
    public static final Logger e = new Logger("MediaLiveSeekableRange", null);

    @NonNull
    public static final Parcelable.Creator<MediaLiveSeekableRange> CREATOR = new zzbs();

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    public static class Builder {
    }

    public MediaLiveSeekableRange(long j, long j2, boolean z, boolean z2) {
        this.a = Math.max(j, 0L);
        this.b = Math.max(j2, 0L);
        this.c = z;
        this.d = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MediaLiveSeekableRange)) {
            return false;
        }
        MediaLiveSeekableRange mediaLiveSeekableRange = (MediaLiveSeekableRange) obj;
        return this.a == mediaLiveSeekableRange.a && this.b == mediaLiveSeekableRange.b && this.c == mediaLiveSeekableRange.c && this.d == mediaLiveSeekableRange.d;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Long.valueOf(this.a), Long.valueOf(this.b), Boolean.valueOf(this.c), Boolean.valueOf(this.d)});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int s = SafeParcelWriter.s(parcel, 20293);
        SafeParcelWriter.r(parcel, 2, 8);
        parcel.writeLong(this.a);
        SafeParcelWriter.r(parcel, 3, 8);
        parcel.writeLong(this.b);
        SafeParcelWriter.r(parcel, 4, 4);
        parcel.writeInt(this.c ? 1 : 0);
        SafeParcelWriter.r(parcel, 5, 4);
        parcel.writeInt(this.d ? 1 : 0);
        SafeParcelWriter.t(parcel, s);
    }
}
