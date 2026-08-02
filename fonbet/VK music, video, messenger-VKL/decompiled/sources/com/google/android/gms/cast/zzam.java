package com.google.android.gms.cast;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Nullable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.Arrays;
import xsna.hyz0;
import xsna.ozg0;

/* compiled from: com.google.android.gms:play-services-cast@@22.3.1 */
/* loaded from: classes12.dex */
public final class zzam extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzam> CREATOR = new hyz0();
    public final float b;
    public final float c;
    public final float d;

    public zzam(float f, float f2, float f3) {
        this.b = f;
        this.c = f2;
        this.d = f3;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zzam)) {
            return false;
        }
        zzam zzamVar = (zzam) obj;
        return this.b == zzamVar.b && this.c == zzamVar.c && this.d == zzamVar.d;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Float.valueOf(this.b), Float.valueOf(this.c), Float.valueOf(this.d)});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int w = ozg0.w(20293, parcel);
        ozg0.v(parcel, 2, 4);
        parcel.writeFloat(this.b);
        ozg0.v(parcel, 3, 4);
        parcel.writeFloat(this.c);
        ozg0.v(parcel, 4, 4);
        parcel.writeFloat(this.d);
        ozg0.x(w, parcel);
    }
}
