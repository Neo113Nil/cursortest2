package com.google.android.gms.fitness.result;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.List;
import xsna.aa01;
import xsna.ozg0;
import xsna.qdg0;

/* compiled from: com.google.android.gms:play-services-fitness@@21.2.0 */
@Deprecated
/* loaded from: classes12.dex */
public class GoalsResult extends AbstractSafeParcelable implements qdg0 {

    @NonNull
    public static final Parcelable.Creator<GoalsResult> CREATOR = new aa01();
    public final Status b;
    public final List c;

    public GoalsResult(@NonNull Status status, @NonNull List list) {
        this.b = status;
        this.c = list;
    }

    @Override // xsna.qdg0
    @NonNull
    public final Status getStatus() {
        return this.b;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NonNull Parcel parcel, int i) {
        int w = ozg0.w(20293, parcel);
        ozg0.p(parcel, 1, this.b, i, false);
        ozg0.u(parcel, 2, this.c, false);
        ozg0.x(w, parcel);
    }
}
