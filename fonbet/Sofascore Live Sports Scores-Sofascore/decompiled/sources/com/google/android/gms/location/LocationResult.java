package com.google.android.gms.location;

import android.location.Location;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.SystemClock;
import androidx.annotation.NonNull;
import com.blaze.blazesdk.data_source.BlazeDataSourcePersonalizedType;
import com.fyber.inneractive.sdk.external.InneractiveMediationDefs;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.internal.identity.zzeo;
import com.ironsource.U3;
import defpackage.qz;
import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Collections;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@SafeParcelable.Class
@SafeParcelable.Reserved
/* loaded from: classes3.dex */
public final class LocationResult extends AbstractSafeParcelable implements ReflectedParcelable {
    public final List a;
    public static final List b = Collections.EMPTY_LIST;

    @NonNull
    public static final Parcelable.Creator<LocationResult> CREATOR = new zzag();

    public LocationResult(List list) {
        this.a = list;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof LocationResult)) {
            return false;
        }
        List list = ((LocationResult) obj).a;
        int i = Build.VERSION.SDK_INT;
        List<Location> list2 = this.a;
        if (i >= 31) {
            return list2.equals(list);
        }
        if (list2.size() != list.size()) {
            return false;
        }
        Iterator it = list.iterator();
        for (Location location : list2) {
            Location location2 = (Location) it.next();
            if (Double.compare(location.getLatitude(), location2.getLatitude()) != 0 || Double.compare(location.getLongitude(), location2.getLongitude()) != 0 || location.getTime() != location2.getTime() || location.getElapsedRealtimeNanos() != location2.getElapsedRealtimeNanos() || !Objects.a(location.getProvider(), location2.getProvider())) {
                return false;
            }
        }
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a});
    }

    public final String toString() {
        String l;
        StringBuilder sb = new StringBuilder("LocationResult");
        DecimalFormat decimalFormat = zzak.a;
        List<Location> list = this.a;
        sb.ensureCapacity(list.size() * 100);
        sb.append(U3.j.d);
        boolean z = false;
        for (Location location : list) {
            DecimalFormat decimalFormat2 = zzak.b;
            sb.ensureCapacity(100);
            if (location == null) {
                sb.append((String) null);
            } else {
                sb.append("{");
                sb.append(location.getProvider());
                sb.append(", ");
                if (Build.VERSION.SDK_INT >= 31 ? qz.p(location) : location.isFromMockProvider()) {
                    sb.append("mock, ");
                }
                DecimalFormat decimalFormat3 = zzak.a;
                sb.append(decimalFormat3.format(location.getLatitude()));
                sb.append(BlazeDataSourcePersonalizedType.STRING_SEPARATOR);
                sb.append(decimalFormat3.format(location.getLongitude()));
                if (location.hasAccuracy()) {
                    sb.append("±");
                    sb.append(decimalFormat2.format(location.getAccuracy()));
                    sb.append(InneractiveMediationDefs.GENDER_MALE);
                }
                if (location.hasAltitude()) {
                    sb.append(", alt=");
                    sb.append(decimalFormat2.format(location.getAltitude()));
                    if (location.hasVerticalAccuracy()) {
                        sb.append("±");
                        sb.append(decimalFormat2.format(location.getVerticalAccuracyMeters()));
                    }
                    sb.append(InneractiveMediationDefs.GENDER_MALE);
                }
                if (location.hasSpeed()) {
                    sb.append(", spd=");
                    sb.append(decimalFormat2.format(location.getSpeed()));
                    if (location.hasSpeedAccuracy()) {
                        sb.append("±");
                        sb.append(decimalFormat2.format(location.getSpeedAccuracyMetersPerSecond()));
                    }
                    sb.append("m/s");
                }
                if (location.hasBearing()) {
                    sb.append(", brg=");
                    sb.append(decimalFormat2.format(location.getBearing()));
                    if (location.hasBearingAccuracy()) {
                        sb.append("±");
                        sb.append(decimalFormat2.format(location.getBearingAccuracyDegrees()));
                    }
                    sb.append("°");
                }
                Bundle extras = location.getExtras();
                String string = extras != null ? extras.getString("floorLabel") : null;
                if (string != null) {
                    sb.append(", fl=");
                    sb.append(string);
                }
                Bundle extras2 = location.getExtras();
                String string2 = extras2 != null ? extras2.getString("levelId") : null;
                if (string2 != null) {
                    sb.append(", lv=");
                    sb.append(string2);
                }
                long currentTimeMillis = System.currentTimeMillis() - SystemClock.elapsedRealtime();
                sb.append(", ert=");
                long elapsedRealtimeNanos = (location.getElapsedRealtimeNanos() / 1000000) + currentTimeMillis;
                if (elapsedRealtimeNanos >= 0) {
                    l = zzeo.a.format(new Date(elapsedRealtimeNanos));
                } else {
                    SimpleDateFormat simpleDateFormat = zzeo.a;
                    l = Long.toString(elapsedRealtimeNanos);
                }
                sb.append(l);
                sb.append('}');
            }
            sb.append(", ");
            z = true;
        }
        if (z) {
            sb.setLength(sb.length() - 2);
        }
        sb.append(U3.j.e);
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int s = SafeParcelWriter.s(parcel, 20293);
        SafeParcelWriter.q(parcel, 1, this.a, false);
        SafeParcelWriter.t(parcel, s);
    }
}
