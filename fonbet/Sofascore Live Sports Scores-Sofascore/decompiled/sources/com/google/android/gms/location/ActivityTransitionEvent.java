package com.google.android.gms.location;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import defpackage.me4;
import java.util.Arrays;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@SafeParcelable.Class
@SafeParcelable.Reserved
/* loaded from: classes3.dex */
public class ActivityTransitionEvent extends AbstractSafeParcelable {

    @NonNull
    public static final Parcelable.Creator<ActivityTransitionEvent> CREATOR = new zzf();
    public final int a;
    public final int b;
    public final long c;

    public ActivityTransitionEvent(int i, int i2, long j) {
        Parcelable.Creator<ActivityTransition> creator = ActivityTransition.CREATOR;
        boolean z = false;
        if (i2 >= 0 && i2 <= 1) {
            z = true;
        }
        StringBuilder sb = new StringBuilder(String.valueOf(i2).length() + 30);
        sb.append("Transition type ");
        sb.append(i2);
        sb.append(" is not valid.");
        Preconditions.a(sb.toString(), z);
        this.a = i;
        this.b = i2;
        this.c = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ActivityTransitionEvent)) {
            return false;
        }
        ActivityTransitionEvent activityTransitionEvent = (ActivityTransitionEvent) obj;
        return this.a == activityTransitionEvent.a && this.b == activityTransitionEvent.b && this.c == activityTransitionEvent.c;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.a), Integer.valueOf(this.b), Long.valueOf(this.c)});
    }

    public final String toString() {
        int i = this.a;
        StringBuilder sb = new StringBuilder(me4.g(i, "ActivityType ", new StringBuilder(String.valueOf(i).length() + 13)));
        sb.append(" ");
        int i2 = this.b;
        StringBuilder sb2 = new StringBuilder(String.valueOf(i2).length() + 15);
        sb2.append("TransitionType ");
        sb2.append(i2);
        sb.append(sb2.toString());
        sb.append(" ");
        long j = this.c;
        StringBuilder sb3 = new StringBuilder(String.valueOf(j).length() + 21);
        sb3.append("ElapsedRealTimeNanos ");
        sb3.append(j);
        sb.append(sb3.toString());
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        Preconditions.i(parcel);
        int s = SafeParcelWriter.s(parcel, 20293);
        SafeParcelWriter.r(parcel, 1, 4);
        parcel.writeInt(this.a);
        SafeParcelWriter.r(parcel, 2, 4);
        parcel.writeInt(this.b);
        SafeParcelWriter.r(parcel, 3, 8);
        parcel.writeLong(this.c);
        SafeParcelWriter.t(parcel, s);
    }
}
