package com.google.android.gms.cast;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.Arrays;
import xsna.k401;
import xsna.o100;
import xsna.ozg0;

/* compiled from: com.google.android.gms:play-services-cast@@22.3.1 */
/* loaded from: classes12.dex */
public class MediaLiveSeekableRange extends AbstractSafeParcelable {
    public final long b;
    public final long c;
    public final boolean d;
    public final boolean e;
    public static final o100 f = new o100("MediaLiveSeekableRange", null);

    @NonNull
    public static final Parcelable.Creator<MediaLiveSeekableRange> CREATOR = new k401();

    public MediaLiveSeekableRange(long j, long j2, boolean z, boolean z2) {
        this.b = Math.max(j, 0L);
        this.c = Math.max(j2, 0L);
        this.d = z;
        this.e = z2;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MediaLiveSeekableRange)) {
            return false;
        }
        MediaLiveSeekableRange mediaLiveSeekableRange = (MediaLiveSeekableRange) obj;
        return this.b == mediaLiveSeekableRange.b && this.c == mediaLiveSeekableRange.c && this.d == mediaLiveSeekableRange.d && this.e == mediaLiveSeekableRange.e;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Long.valueOf(this.b), Long.valueOf(this.c), Boolean.valueOf(this.d), Boolean.valueOf(this.e)});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NonNull Parcel parcel, int i) {
        int w = ozg0.w(20293, parcel);
        ozg0.v(parcel, 2, 8);
        parcel.writeLong(this.b);
        ozg0.v(parcel, 3, 8);
        parcel.writeLong(this.c);
        ozg0.v(parcel, 4, 4);
        parcel.writeInt(this.d ? 1 : 0);
        ozg0.v(parcel, 5, 4);
        parcel.writeInt(this.e ? 1 : 0);
        ozg0.x(w, parcel);
    }
}
