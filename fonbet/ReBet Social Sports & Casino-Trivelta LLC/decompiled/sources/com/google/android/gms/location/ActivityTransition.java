package com.google.android.gms.location;

import E9.b;
import V9.y;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import com.google.android.gms.common.internal.AbstractC3189m;
import com.google.android.gms.common.internal.AbstractC3191o;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

/* loaded from: classes2.dex */
public class ActivityTransition extends AbstractSafeParcelable {

    @NonNull
    public static final Parcelable.Creator<ActivityTransition> CREATOR = new y();

    /* renamed from: a, reason: collision with root package name */
    public final int f33041a;

    /* renamed from: b, reason: collision with root package name */
    public final int f33042b;

    public static class a {

        /* renamed from: a, reason: collision with root package name */
        public int f33043a = -1;

        /* renamed from: b, reason: collision with root package name */
        public int f33044b = -1;

        public ActivityTransition a() {
            AbstractC3191o.q(this.f33043a != -1, "Activity type not set.");
            AbstractC3191o.q(this.f33044b != -1, "Activity transition type not set.");
            return new ActivityTransition(this.f33043a, this.f33044b);
        }

        public a b(int i10) {
            ActivityTransition.i(i10);
            this.f33044b = i10;
            return this;
        }

        public a c(int i10) {
            this.f33043a = i10;
            return this;
        }
    }

    public ActivityTransition(int i10, int i11) {
        this.f33041a = i10;
        this.f33042b = i11;
    }

    public static void i(int i10) {
        boolean z10 = false;
        if (i10 >= 0 && i10 <= 1) {
            z10 = true;
        }
        AbstractC3191o.b(z10, "Transition type " + i10 + " is not valid.");
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ActivityTransition)) {
            return false;
        }
        ActivityTransition activityTransition = (ActivityTransition) obj;
        return this.f33041a == activityTransition.f33041a && this.f33042b == activityTransition.f33042b;
    }

    public int g() {
        return this.f33041a;
    }

    public int h() {
        return this.f33042b;
    }

    public int hashCode() {
        return AbstractC3189m.c(Integer.valueOf(this.f33041a), Integer.valueOf(this.f33042b));
    }

    public String toString() {
        return "ActivityTransition [mActivityType=" + this.f33041a + ", mTransitionType=" + this.f33042b + "]";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        AbstractC3191o.m(parcel);
        int a10 = b.a(parcel);
        b.u(parcel, 1, g());
        b.u(parcel, 2, h());
        b.b(parcel, a10);
    }
}
