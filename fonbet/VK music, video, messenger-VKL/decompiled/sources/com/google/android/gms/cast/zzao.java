package com.google.android.gms.cast;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Nullable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.Arrays;
import xsna.o0a;
import xsna.ozg0;
import xsna.qyz0;

/* compiled from: com.google.android.gms:play-services-cast@@22.3.1 */
/* loaded from: classes12.dex */
public final class zzao extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzao> CREATOR = new qyz0();

    @Nullable
    public final zzam b;

    @Nullable
    public final zzam c;

    public zzao(@Nullable zzam zzamVar, @Nullable zzam zzamVar2) {
        this.b = zzamVar;
        this.c = zzamVar2;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zzao)) {
            return false;
        }
        zzao zzaoVar = (zzao) obj;
        return o0a.c(this.b, zzaoVar.b) && o0a.c(this.c, zzaoVar.c);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.b, this.c});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int w = ozg0.w(20293, parcel);
        ozg0.p(parcel, 2, this.b, i, false);
        ozg0.p(parcel, 3, this.c, i, false);
        ozg0.x(w, parcel);
    }
}
