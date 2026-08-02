package com.google.android.gms.cast;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.Arrays;
import xsna.o100;
import xsna.ozg0;
import xsna.p701;

/* compiled from: com.google.android.gms:play-services-cast@@22.3.1 */
/* loaded from: classes12.dex */
public final class VideoInfo extends AbstractSafeParcelable {
    public final int b;
    public final int c;
    public final int d;
    public static final o100 e = new o100("VideoInfo", null);

    @NonNull
    public static final Parcelable.Creator<VideoInfo> CREATOR = new p701();

    public VideoInfo(int i, int i2, int i3) {
        this.b = i;
        this.c = i2;
        this.d = i3;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof VideoInfo)) {
            return false;
        }
        VideoInfo videoInfo = (VideoInfo) obj;
        return this.c == videoInfo.c && this.b == videoInfo.b && this.d == videoInfo.d;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.c), Integer.valueOf(this.b), Integer.valueOf(this.d)});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NonNull Parcel parcel, int i) {
        int w = ozg0.w(20293, parcel);
        ozg0.v(parcel, 2, 4);
        parcel.writeInt(this.b);
        ozg0.v(parcel, 3, 4);
        parcel.writeInt(this.c);
        ozg0.v(parcel, 4, 4);
        parcel.writeInt(this.d);
        ozg0.x(w, parcel);
    }
}
