package com.google.android.gms.fitness.request;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Nullable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.fitness.data.DataSource;
import com.google.android.gms.fitness.data.DataType;
import com.google.android.gms.internal.fitness.zzcw;
import java.util.Arrays;
import xsna.dq70;
import xsna.exc0;
import xsna.ozg0;
import xsna.u301;

/* compiled from: com.google.android.gms:play-services-fitness@@21.2.0 */
/* loaded from: classes12.dex */
public final class zzbi extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzbi> CREATOR = new u301();

    @Nullable
    public final DataType b;

    @Nullable
    public final DataSource c;

    @Nullable
    public final zzcw d;

    public zzbi(@Nullable DataType dataType, @Nullable DataSource dataSource, @Nullable zzcw zzcwVar) {
        exc0.a("Must specify exactly one of dataType and dataSource.", (dataType == null) != (dataSource == null));
        this.b = dataType;
        this.c = dataSource;
        this.d = zzcwVar;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zzbi)) {
            return false;
        }
        zzbi zzbiVar = (zzbi) obj;
        return dq70.b(this.c, zzbiVar.c) && dq70.b(this.b, zzbiVar.b);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.c, this.b});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int w = ozg0.w(20293, parcel);
        ozg0.p(parcel, 1, this.b, i, false);
        ozg0.p(parcel, 2, this.c, i, false);
        zzcw zzcwVar = this.d;
        ozg0.h(parcel, 3, zzcwVar == null ? null : zzcwVar.asBinder());
        ozg0.x(w, parcel);
    }
}
