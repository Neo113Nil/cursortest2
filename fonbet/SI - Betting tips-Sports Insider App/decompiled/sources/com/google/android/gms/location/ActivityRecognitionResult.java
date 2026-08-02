package com.google.android.gms.location;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import g6.v;
import h8.b;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import n6.a;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public class ActivityRecognitionResult extends AbstractSafeParcelable implements ReflectedParcelable {

    @NonNull
    public static final Parcelable.Creator<ActivityRecognitionResult> CREATOR = new a(20);

    /* renamed from: a, reason: collision with root package name */
    public ArrayList f5666a;

    /* renamed from: b, reason: collision with root package name */
    public long f5667b;

    /* renamed from: c, reason: collision with root package name */
    public long f5668c;

    /* renamed from: d, reason: collision with root package name */
    public int f5669d;

    /* renamed from: e, reason: collision with root package name */
    public Bundle f5670e;

    public static boolean c(Bundle bundle, Bundle bundle2) {
        int length;
        if (bundle == null) {
            return bundle2 == null;
        }
        if (bundle2 == null || bundle.size() != bundle2.size()) {
            return false;
        }
        for (String str : bundle.keySet()) {
            if (!bundle2.containsKey(str)) {
                return false;
            }
            Object obj = bundle.get(str);
            Object obj2 = bundle2.get(str);
            if (obj == null) {
                if (obj2 != null) {
                    return false;
                }
            } else if (obj instanceof Bundle) {
                if (!c(bundle.getBundle(str), bundle2.getBundle(str))) {
                    return false;
                }
            } else {
                if (obj.getClass().isArray()) {
                    if (obj2 != null && obj2.getClass().isArray() && (length = Array.getLength(obj)) == Array.getLength(obj2)) {
                        for (int i5 = 0; i5 < length; i5++) {
                            if (v.k(Array.get(obj, i5), Array.get(obj2, i5))) {
                            }
                        }
                    }
                    return false;
                }
                if (!obj.equals(obj2)) {
                    return false;
                }
            }
        }
        return true;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ActivityRecognitionResult activityRecognitionResult = (ActivityRecognitionResult) obj;
        return this.f5667b == activityRecognitionResult.f5667b && this.f5668c == activityRecognitionResult.f5668c && this.f5669d == activityRecognitionResult.f5669d && v.k(this.f5666a, activityRecognitionResult.f5666a) && c(this.f5670e, activityRecognitionResult.f5670e);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Long.valueOf(this.f5667b), Long.valueOf(this.f5668c), Integer.valueOf(this.f5669d), this.f5666a, this.f5670e});
    }

    public final String toString() {
        String valueOf = String.valueOf(this.f5666a);
        long j = this.f5667b;
        long j6 = this.f5668c;
        int length = valueOf.length();
        StringBuilder sb2 = new StringBuilder(length + 59 + String.valueOf(j).length() + 24 + String.valueOf(j6).length() + 1);
        sb2.append("ActivityRecognitionResult [probableActivities=");
        sb2.append(valueOf);
        sb2.append(", timeMillis=");
        sb2.append(j);
        sb2.append(", elapsedRealtimeMillis=");
        sb2.append(j6);
        sb2.append("]");
        return sb2.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i5) {
        int V = b.V(parcel, 20293);
        b.R(parcel, 1, this.f5666a, false);
        long j = this.f5667b;
        b.U(parcel, 2, 8);
        parcel.writeLong(j);
        long j6 = this.f5668c;
        b.U(parcel, 3, 8);
        parcel.writeLong(j6);
        int i10 = this.f5669d;
        b.U(parcel, 4, 4);
        parcel.writeInt(i10);
        b.F(parcel, 5, this.f5670e);
        b.W(parcel, V);
    }
}
