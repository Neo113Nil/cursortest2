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
public class DetectedActivity extends AbstractSafeParcelable {

    @NonNull
    public static final Parcelable.Creator<DetectedActivity> CREATOR = new a(26);

    /* renamed from: a, reason: collision with root package name */
    public final int f5691a;

    /* renamed from: b, reason: collision with root package name */
    public final int f5692b;

    public DetectedActivity(int i5, int i10) {
        this.f5691a = i5;
        this.f5692b = i10;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof DetectedActivity) {
            DetectedActivity detectedActivity = (DetectedActivity) obj;
            if (this.f5691a == detectedActivity.f5691a && this.f5692b == detectedActivity.f5692b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f5691a), Integer.valueOf(this.f5692b)});
    }

    public final String toString() {
        int i5 = this.f5691a;
        if (i5 > 22 || i5 < 0) {
            i5 = 4;
        }
        String num = i5 != 0 ? i5 != 1 ? i5 != 2 ? i5 != 3 ? i5 != 4 ? i5 != 5 ? i5 != 7 ? i5 != 8 ? i5 != 16 ? i5 != 17 ? Integer.toString(i5) : "IN_RAIL_VEHICLE" : "IN_ROAD_VEHICLE" : "RUNNING" : "WALKING" : "TILTING" : "UNKNOWN" : "STILL" : "ON_FOOT" : "ON_BICYCLE" : "IN_VEHICLE";
        int length = String.valueOf(num).length();
        int i10 = this.f5692b;
        StringBuilder sb2 = new StringBuilder(String.valueOf(i10).length() + length + 36 + 1);
        sb2.append("DetectedActivity [type=");
        sb2.append(num);
        sb2.append(", confidence=");
        sb2.append(i10);
        sb2.append("]");
        return sb2.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i5) {
        v.h(parcel);
        int V = b.V(parcel, 20293);
        b.U(parcel, 1, 4);
        parcel.writeInt(this.f5691a);
        b.U(parcel, 2, 4);
        parcel.writeInt(this.f5692b);
        b.W(parcel, V);
    }
}
