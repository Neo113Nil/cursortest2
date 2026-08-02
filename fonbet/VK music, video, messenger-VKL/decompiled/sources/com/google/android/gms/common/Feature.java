package com.google.android.gms.common;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.Arrays;
import xsna.dq70;
import xsna.ozg0;
import xsna.w001;

/* compiled from: com.google.android.gms:play-services-basement@@18.10.0 */
/* loaded from: classes.dex */
public class Feature extends AbstractSafeParcelable {

    @NonNull
    public static final Parcelable.Creator<Feature> CREATOR = new w001();
    public final String b;

    @Deprecated
    public final int c;
    public final long d;
    public final boolean e;

    public Feature(@NonNull String str, int i, long j, boolean z) {
        this.b = str;
        this.c = i;
        this.d = j;
        this.e = z;
    }

    public final boolean equals(@Nullable Object obj) {
        Feature feature;
        return (obj instanceof Feature) && (feature = (Feature) obj) != null && dq70.b(this.b, feature.b) && i() == feature.i() && this.e == feature.e;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.b, Long.valueOf(i()), Boolean.valueOf(this.e)});
    }

    public final long i() {
        long j = this.d;
        return j == -1 ? this.c : j;
    }

    @NonNull
    public final String toString() {
        dq70.a aVar = new dq70.a(this);
        aVar.a(this.b, "name");
        aVar.a(Long.valueOf(i()), "version");
        aVar.a(Boolean.valueOf(this.e), "is_fully_rolled_out");
        return aVar.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NonNull Parcel parcel, int i) {
        int w = ozg0.w(20293, parcel);
        ozg0.q(parcel, 1, this.b, false);
        ozg0.v(parcel, 2, 4);
        parcel.writeInt(this.c);
        long i2 = i();
        ozg0.v(parcel, 3, 8);
        parcel.writeLong(i2);
        ozg0.v(parcel, 4, 4);
        parcel.writeInt(this.e ? 1 : 0);
        ozg0.x(w, parcel);
    }

    public Feature(@NonNull String str, long j) {
        this(str, -1, j, false);
    }

    public Feature(@NonNull String str, long j, boolean z) {
        this(str, -1, j, z);
    }
}
