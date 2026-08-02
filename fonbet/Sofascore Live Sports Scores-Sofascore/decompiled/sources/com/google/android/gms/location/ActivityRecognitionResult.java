package com.google.android.gms.location;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.ironsource.U3;
import defpackage.fn0;
import defpackage.wt3;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@SafeParcelable.Class
@SafeParcelable.Reserved
/* loaded from: classes3.dex */
public class ActivityRecognitionResult extends AbstractSafeParcelable implements ReflectedParcelable {

    @NonNull
    public static final Parcelable.Creator<ActivityRecognitionResult> CREATOR = new zzd();
    public ArrayList a;
    public long b;
    public long c;
    public int d;
    public Bundle e;

    public static boolean Y0(Bundle bundle, Bundle bundle2) {
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
                if (!Y0(bundle.getBundle(str), bundle2.getBundle(str))) {
                    return false;
                }
            } else {
                if (obj.getClass().isArray()) {
                    if (obj2 != null && obj2.getClass().isArray() && (length = Array.getLength(obj)) == Array.getLength(obj2)) {
                        for (int i = 0; i < length; i++) {
                            if (Objects.a(Array.get(obj, i), Array.get(obj2, i))) {
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
        return this.b == activityRecognitionResult.b && this.c == activityRecognitionResult.c && this.d == activityRecognitionResult.d && Objects.a(this.a, activityRecognitionResult.a) && Y0(this.e, activityRecognitionResult.e);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Long.valueOf(this.b), Long.valueOf(this.c), Integer.valueOf(this.d), this.a, this.e});
    }

    public final String toString() {
        String valueOf = String.valueOf(this.a);
        long j = this.b;
        long j2 = this.c;
        StringBuilder sb = new StringBuilder(wt3.h(valueOf.length(), 59, String.valueOf(j).length(), 24, String.valueOf(j2).length()) + 1);
        wt3.A("ActivityRecognitionResult [probableActivities=", valueOf, sb, ", timeMillis=");
        sb.append(j);
        return fn0.l(j2, ", elapsedRealtimeMillis=", U3.j.e, sb);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int s = SafeParcelWriter.s(parcel, 20293);
        SafeParcelWriter.q(parcel, 1, this.a, false);
        long j = this.b;
        SafeParcelWriter.r(parcel, 2, 8);
        parcel.writeLong(j);
        long j2 = this.c;
        SafeParcelWriter.r(parcel, 3, 8);
        parcel.writeLong(j2);
        int i2 = this.d;
        SafeParcelWriter.r(parcel, 4, 4);
        parcel.writeInt(i2);
        SafeParcelWriter.b(parcel, 5, this.e);
        SafeParcelWriter.t(parcel, s);
    }
}
