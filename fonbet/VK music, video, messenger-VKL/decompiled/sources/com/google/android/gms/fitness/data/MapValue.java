package com.google.android.gms.fitness.data;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import xsna.exc0;
import xsna.hs01;
import xsna.ozg0;

/* compiled from: com.google.android.gms:play-services-fitness@@21.2.0 */
/* loaded from: classes12.dex */
public class MapValue extends AbstractSafeParcelable implements ReflectedParcelable {

    @NonNull
    public static final Parcelable.Creator<MapValue> CREATOR = new hs01();
    public final int b;
    public final float c;

    public MapValue(int i, float f) {
        this.b = i;
        this.c = f;
    }

    public final boolean equals(@Nullable Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof MapValue)) {
            return false;
        }
        MapValue mapValue = (MapValue) obj;
        int i = mapValue.b;
        int i2 = this.b;
        if (i2 == i) {
            if (i2 != 2) {
                return this.c == mapValue.c;
            }
            if (i() == mapValue.i()) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (int) this.c;
    }

    public final float i() {
        exc0.k("Value is not in float format", this.b == 2);
        return this.c;
    }

    @NonNull
    public final String toString() {
        return this.b != 2 ? "unknown" : Float.toString(i());
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NonNull Parcel parcel, int i) {
        int w = ozg0.w(20293, parcel);
        ozg0.v(parcel, 1, 4);
        parcel.writeInt(this.b);
        ozg0.v(parcel, 2, 4);
        parcel.writeFloat(this.c);
        ozg0.x(w, parcel);
    }
}
