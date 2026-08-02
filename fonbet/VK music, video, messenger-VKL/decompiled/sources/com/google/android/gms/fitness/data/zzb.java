package com.google.android.gms.fitness.data;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Nullable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import xsna.b501;
import xsna.exc0;
import xsna.ozg0;
import xsna.zr;

/* compiled from: com.google.android.gms:play-services-fitness@@21.2.0 */
/* loaded from: classes12.dex */
public final class zzb extends AbstractSafeParcelable {
    public final String b;
    public static final zzb c = new zzb("com.google.android.gms");
    public static final Parcelable.Creator<zzb> CREATOR = new b501();

    public zzb(String str) {
        exc0.i(str);
        this.b = str;
    }

    public final boolean equals(@Nullable Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof zzb) {
            return this.b.equals(((zzb) obj).b);
        }
        return false;
    }

    public final int hashCode() {
        return this.b.hashCode();
    }

    public final String toString() {
        return zr.a("Application{", this.b, "}");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int w = ozg0.w(20293, parcel);
        ozg0.q(parcel, 1, this.b, false);
        ozg0.x(w, parcel);
    }
}
