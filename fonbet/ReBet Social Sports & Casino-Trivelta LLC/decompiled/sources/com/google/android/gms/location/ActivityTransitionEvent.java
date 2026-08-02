package com.google.android.gms.location;

import E9.b;
import V9.z;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import com.google.android.gms.common.internal.AbstractC3189m;
import com.google.android.gms.common.internal.AbstractC3191o;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

/* loaded from: classes2.dex */
public class ActivityTransitionEvent extends AbstractSafeParcelable {

    @NonNull
    public static final Parcelable.Creator<ActivityTransitionEvent> CREATOR = new z();

    /* renamed from: a, reason: collision with root package name */
    public final int f33045a;

    /* renamed from: b, reason: collision with root package name */
    public final int f33046b;

    /* renamed from: c, reason: collision with root package name */
    public final long f33047c;

    public ActivityTransitionEvent(int i10, int i11, long j10) {
        ActivityTransition.i(i11);
        this.f33045a = i10;
        this.f33046b = i11;
        this.f33047c = j10;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ActivityTransitionEvent)) {
            return false;
        }
        ActivityTransitionEvent activityTransitionEvent = (ActivityTransitionEvent) obj;
        return this.f33045a == activityTransitionEvent.f33045a && this.f33046b == activityTransitionEvent.f33046b && this.f33047c == activityTransitionEvent.f33047c;
    }

    public int g() {
        return this.f33045a;
    }

    public long h() {
        return this.f33047c;
    }

    public int hashCode() {
        return AbstractC3189m.c(Integer.valueOf(this.f33045a), Integer.valueOf(this.f33046b), Long.valueOf(this.f33047c));
    }

    public int i() {
        return this.f33046b;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("ActivityType " + this.f33045a);
        sb2.append(" ");
        sb2.append("TransitionType " + this.f33046b);
        sb2.append(" ");
        sb2.append("ElapsedRealTimeNanos " + this.f33047c);
        return sb2.toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        AbstractC3191o.m(parcel);
        int a10 = b.a(parcel);
        b.u(parcel, 1, g());
        b.u(parcel, 2, i());
        b.y(parcel, 3, h());
        b.b(parcel, a10);
    }
}
