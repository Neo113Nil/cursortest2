package com.google.android.gms.location;

import E9.b;
import E9.c;
import V9.Q;
import android.content.Intent;
import android.location.Location;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import com.google.android.gms.common.internal.AbstractC3189m;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes2.dex */
public final class LocationResult extends AbstractSafeParcelable implements ReflectedParcelable {

    /* renamed from: a, reason: collision with root package name */
    public final List f33127a;

    /* renamed from: b, reason: collision with root package name */
    public static final List f33126b = Collections.EMPTY_LIST;

    @NonNull
    public static final Parcelable.Creator<LocationResult> CREATOR = new Q();

    public LocationResult(List list) {
        this.f33127a = list;
    }

    public static LocationResult g(Intent intent) {
        if (!j(intent)) {
            return null;
        }
        LocationResult locationResult = (LocationResult) c.b(intent, "com.google.android.gms.location.EXTRA_LOCATION_RESULT_BYTES", CREATOR);
        return locationResult == null ? (LocationResult) intent.getParcelableExtra("com.google.android.gms.location.EXTRA_LOCATION_RESULT") : locationResult;
    }

    public static boolean j(Intent intent) {
        if (intent == null) {
            return false;
        }
        return intent.hasExtra("com.google.android.gms.location.EXTRA_LOCATION_RESULT") || intent.hasExtra("com.google.android.gms.location.EXTRA_LOCATION_RESULT_BYTES");
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof LocationResult)) {
            return false;
        }
        LocationResult locationResult = (LocationResult) obj;
        if (Build.VERSION.SDK_INT >= 31) {
            return this.f33127a.equals(locationResult.f33127a);
        }
        if (this.f33127a.size() != locationResult.f33127a.size()) {
            return false;
        }
        Iterator it = locationResult.f33127a.iterator();
        for (Location location : this.f33127a) {
            Location location2 = (Location) it.next();
            if (Double.compare(location.getLatitude(), location2.getLatitude()) != 0 || Double.compare(location.getLongitude(), location2.getLongitude()) != 0 || location.getTime() != location2.getTime() || location.getElapsedRealtimeNanos() != location2.getElapsedRealtimeNanos() || !AbstractC3189m.b(location.getProvider(), location2.getProvider())) {
                return false;
            }
        }
        return true;
    }

    public Location h() {
        int size = this.f33127a.size();
        if (size == 0) {
            return null;
        }
        return (Location) this.f33127a.get(size - 1);
    }

    public int hashCode() {
        return AbstractC3189m.c(this.f33127a);
    }

    public List i() {
        return this.f33127a;
    }

    public String toString() {
        return "LocationResult".concat(String.valueOf(this.f33127a));
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        int a10 = b.a(parcel);
        b.J(parcel, 1, i(), false);
        b.b(parcel, a10);
    }
}
