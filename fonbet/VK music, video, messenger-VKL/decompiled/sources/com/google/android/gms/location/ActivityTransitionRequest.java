package com.google.android.gms.location;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.ironsource.X3;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.TreeSet;
import xsna.dq70;
import xsna.exc0;
import xsna.glm;
import xsna.h5s;
import xsna.nd01;
import xsna.ozg0;
import xsna.xe9;

/* compiled from: com.google.android.gms:play-services-location@@21.0.1 */
/* loaded from: classes12.dex */
public class ActivityTransitionRequest extends AbstractSafeParcelable {

    @NonNull
    public static final Parcelable.Creator<ActivityTransitionRequest> CREATOR = new nd01();

    @NonNull
    public static final glm f = new glm(1);
    public final List b;

    @Nullable
    public final String c;
    public final List d;

    @Nullable
    public String e;

    public ActivityTransitionRequest(@NonNull List list, @Nullable String str, @Nullable List list2, @Nullable String str2) {
        exc0.j(list, "transitions can't be null");
        exc0.a("transitions can't be empty.", list.size() > 0);
        TreeSet treeSet = new TreeSet(f);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ActivityTransition activityTransition = (ActivityTransition) it.next();
            exc0.a(String.format("Found duplicated transition: %s.", activityTransition), treeSet.add(activityTransition));
        }
        this.b = Collections.unmodifiableList(list);
        this.c = str;
        this.d = list2 == null ? Collections.EMPTY_LIST : Collections.unmodifiableList(list2);
        this.e = str2;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            ActivityTransitionRequest activityTransitionRequest = (ActivityTransitionRequest) obj;
            if (dq70.b(this.b, activityTransitionRequest.b) && dq70.b(this.c, activityTransitionRequest.c) && dq70.b(this.e, activityTransitionRequest.e) && dq70.b(this.d, activityTransitionRequest.d)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = this.b.hashCode() * 31;
        String str = this.c;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        List list = this.d;
        int hashCode3 = (hashCode2 + (list != null ? list.hashCode() : 0)) * 31;
        String str2 = this.e;
        return hashCode3 + (str2 != null ? str2.hashCode() : 0);
    }

    @NonNull
    public final String toString() {
        String valueOf = String.valueOf(this.b);
        return h5s.d(xe9.a("ActivityTransitionRequest [mTransitions=", valueOf, ", mTag='", this.c, "', mClients="), String.valueOf(this.d), ", mAttributionTag=", this.e, X3.j.e);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NonNull Parcel parcel, int i) {
        exc0.i(parcel);
        int w = ozg0.w(20293, parcel);
        ozg0.u(parcel, 1, this.b, false);
        ozg0.q(parcel, 2, this.c, false);
        ozg0.u(parcel, 3, this.d, false);
        ozg0.q(parcel, 4, this.e, false);
        ozg0.x(w, parcel);
    }
}
