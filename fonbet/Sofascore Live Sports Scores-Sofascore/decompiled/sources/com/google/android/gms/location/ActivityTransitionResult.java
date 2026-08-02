package com.google.android.gms.location;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@SafeParcelable.Class
@SafeParcelable.Reserved
/* loaded from: classes3.dex */
public class ActivityTransitionResult extends AbstractSafeParcelable {

    @NonNull
    public static final Parcelable.Creator<ActivityTransitionResult> CREATOR = new zzi();
    public final List a;
    public final Bundle b;

    public ActivityTransitionResult(Bundle bundle, ArrayList arrayList) {
        this.b = null;
        Preconditions.j(arrayList, "transitionEvents list can't be null.");
        if (!arrayList.isEmpty()) {
            for (int i = 1; i < arrayList.size(); i++) {
                int i2 = i - 1;
                Preconditions.c(((ActivityTransitionEvent) arrayList.get(i)).c >= ((ActivityTransitionEvent) arrayList.get(i2)).c, "Transition out of order: ts1=%d, ts2=%d", Long.valueOf(((ActivityTransitionEvent) arrayList.get(i)).c), Long.valueOf(((ActivityTransitionEvent) arrayList.get(i2)).c));
            }
        }
        this.a = Collections.unmodifiableList(arrayList);
        this.b = bundle;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return this.a.equals(((ActivityTransitionResult) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        Preconditions.i(parcel);
        int s = SafeParcelWriter.s(parcel, 20293);
        SafeParcelWriter.q(parcel, 1, this.a, false);
        SafeParcelWriter.b(parcel, 2, this.b);
        SafeParcelWriter.t(parcel, s);
    }
}
