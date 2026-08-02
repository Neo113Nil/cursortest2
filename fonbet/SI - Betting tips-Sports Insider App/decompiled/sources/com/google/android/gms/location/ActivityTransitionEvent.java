package com.google.android.gms.location;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import g6.v;
import h8.b;
import java.util.Arrays;
import n6.a;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public class ActivityTransitionEvent extends AbstractSafeParcelable {

    @NonNull
    public static final Parcelable.Creator<ActivityTransitionEvent> CREATOR = new a(22);

    /* renamed from: a, reason: collision with root package name */
    public final int f5673a;

    /* renamed from: b, reason: collision with root package name */
    public final int f5674b;

    /* renamed from: c, reason: collision with root package name */
    public final long f5675c;

    public ActivityTransitionEvent(int i5, int i10, long j) {
        boolean z5 = false;
        if (i10 >= 0 && i10 <= 1) {
            z5 = true;
        }
        StringBuilder sb2 = new StringBuilder(String.valueOf(i10).length() + 30);
        sb2.append("Transition type ");
        sb2.append(i10);
        sb2.append(" is not valid.");
        v.a(sb2.toString(), z5);
        this.f5673a = i5;
        this.f5674b = i10;
        this.f5675c = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ActivityTransitionEvent)) {
            return false;
        }
        ActivityTransitionEvent activityTransitionEvent = (ActivityTransitionEvent) obj;
        return this.f5673a == activityTransitionEvent.f5673a && this.f5674b == activityTransitionEvent.f5674b && this.f5675c == activityTransitionEvent.f5675c;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f5673a), Integer.valueOf(this.f5674b), Long.valueOf(this.f5675c)});
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder();
        int i5 = this.f5673a;
        StringBuilder sb3 = new StringBuilder(String.valueOf(i5).length() + 13);
        sb3.append("ActivityType ");
        sb3.append(i5);
        sb2.append(sb3.toString());
        sb2.append(" ");
        int i10 = this.f5674b;
        StringBuilder sb4 = new StringBuilder(String.valueOf(i10).length() + 15);
        sb4.append("TransitionType ");
        sb4.append(i10);
        sb2.append(sb4.toString());
        sb2.append(" ");
        long j = this.f5675c;
        StringBuilder sb5 = new StringBuilder(String.valueOf(j).length() + 21);
        sb5.append("ElapsedRealTimeNanos ");
        sb5.append(j);
        sb2.append(sb5.toString());
        return sb2.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i5) {
        v.h(parcel);
        int V = b.V(parcel, 20293);
        b.U(parcel, 1, 4);
        parcel.writeInt(this.f5673a);
        b.U(parcel, 2, 4);
        parcel.writeInt(this.f5674b);
        b.U(parcel, 3, 8);
        parcel.writeLong(this.f5675c);
        b.W(parcel, V);
    }
}
