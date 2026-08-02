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
public class ActivityTransition extends AbstractSafeParcelable {

    @NonNull
    public static final Parcelable.Creator<ActivityTransition> CREATOR = new a(21);

    /* renamed from: a, reason: collision with root package name */
    public final int f5671a;

    /* renamed from: b, reason: collision with root package name */
    public final int f5672b;

    public ActivityTransition(int i5, int i10) {
        this.f5671a = i5;
        this.f5672b = i10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ActivityTransition)) {
            return false;
        }
        ActivityTransition activityTransition = (ActivityTransition) obj;
        return this.f5671a == activityTransition.f5671a && this.f5672b == activityTransition.f5672b;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f5671a), Integer.valueOf(this.f5672b)});
    }

    public final String toString() {
        int i5 = this.f5671a;
        int length = String.valueOf(i5).length();
        int i10 = this.f5672b;
        StringBuilder sb2 = new StringBuilder(length + 52 + String.valueOf(i10).length() + 1);
        sb2.append("ActivityTransition [mActivityType=");
        sb2.append(i5);
        sb2.append(", mTransitionType=");
        sb2.append(i10);
        sb2.append("]");
        return sb2.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i5) {
        v.h(parcel);
        int V = b.V(parcel, 20293);
        b.U(parcel, 1, 4);
        parcel.writeInt(this.f5671a);
        b.U(parcel, 2, 4);
        parcel.writeInt(this.f5672b);
        b.W(parcel, V);
    }
}
