package com.google.android.gms.location;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import g6.v;
import h8.b;
import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.List;
import n6.a;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public class ActivityTransitionResult extends AbstractSafeParcelable {

    @NonNull
    public static final Parcelable.Creator<ActivityTransitionResult> CREATOR = new a(24);

    /* renamed from: a, reason: collision with root package name */
    public final List f5681a;

    /* renamed from: b, reason: collision with root package name */
    public final Bundle f5682b;

    public ActivityTransitionResult(Bundle bundle, ArrayList arrayList) {
        this.f5682b = null;
        v.i(arrayList, "transitionEvents list can't be null.");
        if (!arrayList.isEmpty()) {
            for (int i5 = 1; i5 < arrayList.size(); i5++) {
                int i10 = i5 - 1;
                v.c(((ActivityTransitionEvent) arrayList.get(i5)).f5675c >= ((ActivityTransitionEvent) arrayList.get(i10)).f5675c, "Transition out of order: ts1=%d, ts2=%d", Long.valueOf(((ActivityTransitionEvent) arrayList.get(i5)).f5675c), Long.valueOf(((ActivityTransitionEvent) arrayList.get(i10)).f5675c));
            }
        }
        this.f5681a = DesugarCollections.unmodifiableList(arrayList);
        this.f5682b = bundle;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return this.f5681a.equals(((ActivityTransitionResult) obj).f5681a);
    }

    public final int hashCode() {
        return this.f5681a.hashCode();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i5) {
        v.h(parcel);
        int V = b.V(parcel, 20293);
        b.R(parcel, 1, this.f5681a, false);
        b.F(parcel, 2, this.f5682b);
        b.W(parcel, V);
    }
}
