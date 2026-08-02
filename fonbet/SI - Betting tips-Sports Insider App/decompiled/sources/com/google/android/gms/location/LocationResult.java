package com.google.android.gms.location;

import android.location.Location;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.SystemClock;
import androidx.annotation.NonNull;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import g6.v;
import h8.b;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Collections;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;
import m7.j;
import n6.a;
import p7.d;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class LocationResult extends AbstractSafeParcelable implements ReflectedParcelable {

    /* renamed from: a, reason: collision with root package name */
    public final List f5728a;

    /* renamed from: b, reason: collision with root package name */
    public static final List f5727b = Collections.EMPTY_LIST;

    @NonNull
    public static final Parcelable.Creator<LocationResult> CREATOR = new a(10);

    public LocationResult(List list) {
        this.f5728a = list;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof LocationResult)) {
            return false;
        }
        List list = ((LocationResult) obj).f5728a;
        int i5 = Build.VERSION.SDK_INT;
        List<Location> list2 = this.f5728a;
        if (i5 >= 31) {
            return list2.equals(list);
        }
        if (list2.size() != list.size()) {
            return false;
        }
        Iterator it = list.iterator();
        for (Location location : list2) {
            Location location2 = (Location) it.next();
            if (Double.compare(location.getLatitude(), location2.getLatitude()) != 0 || Double.compare(location.getLongitude(), location2.getLongitude()) != 0 || location.getTime() != location2.getTime() || location.getElapsedRealtimeNanos() != location2.getElapsedRealtimeNanos() || !v.k(location.getProvider(), location2.getProvider())) {
                return false;
            }
        }
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f5728a});
    }

    public final String toString() {
        String l6;
        boolean z5;
        boolean z7;
        float f6;
        boolean z10;
        float f10;
        StringBuilder sb2 = new StringBuilder("LocationResult");
        DecimalFormat decimalFormat = d.f21524a;
        List<Location> list = this.f5728a;
        int i5 = 100;
        sb2.ensureCapacity(list.size() * 100);
        sb2.append("[");
        boolean z11 = false;
        for (Location location : list) {
            DecimalFormat decimalFormat2 = d.f21525b;
            sb2.ensureCapacity(i5);
            if (location == null) {
                sb2.append((String) null);
            } else {
                sb2.append("{");
                sb2.append(location.getProvider());
                sb2.append(", ");
                int i10 = Build.VERSION.SDK_INT;
                if (i10 >= 31 ? h3.d.b(location) : location.isFromMockProvider()) {
                    sb2.append("mock, ");
                }
                DecimalFormat decimalFormat3 = d.f21524a;
                sb2.append(decimalFormat3.format(location.getLatitude()));
                sb2.append(StringUtils.COMMA);
                sb2.append(decimalFormat3.format(location.getLongitude()));
                if (location.hasAccuracy()) {
                    sb2.append("±");
                    sb2.append(decimalFormat2.format(location.getAccuracy()));
                    sb2.append("m");
                }
                float f11 = 0.0f;
                if (location.hasAltitude()) {
                    sb2.append(", alt=");
                    sb2.append(decimalFormat2.format(location.getAltitude()));
                    if (i10 >= 26) {
                        z10 = s6.a.n(location);
                    } else {
                        Bundle extras = location.getExtras();
                        z10 = extras != null && extras.containsKey("verticalAccuracy");
                    }
                    if (z10) {
                        sb2.append("±");
                        if (i10 >= 26) {
                            f10 = s6.a.k(location);
                        } else {
                            Bundle extras2 = location.getExtras();
                            f10 = extras2 == null ? 0.0f : extras2.getFloat("verticalAccuracy", 0.0f);
                        }
                        sb2.append(decimalFormat2.format(f10));
                    }
                    sb2.append("m");
                }
                if (location.hasSpeed()) {
                    sb2.append(", spd=");
                    sb2.append(decimalFormat2.format(location.getSpeed()));
                    if (i10 >= 26) {
                        z7 = s6.a.m(location);
                    } else {
                        Bundle extras3 = location.getExtras();
                        z7 = extras3 != null && extras3.containsKey("speedAccuracy");
                    }
                    if (z7) {
                        sb2.append("±");
                        if (i10 >= 26) {
                            f6 = s6.a.j(location);
                        } else {
                            Bundle extras4 = location.getExtras();
                            f6 = extras4 == null ? 0.0f : extras4.getFloat("speedAccuracy", 0.0f);
                        }
                        sb2.append(decimalFormat2.format(f6));
                    }
                    sb2.append("m/s");
                }
                if (location.hasBearing()) {
                    sb2.append(", brg=");
                    sb2.append(decimalFormat2.format(location.getBearing()));
                    if (i10 >= 26) {
                        z5 = s6.a.l(location);
                    } else {
                        Bundle extras5 = location.getExtras();
                        z5 = extras5 != null && extras5.containsKey("bearingAccuracy");
                    }
                    if (z5) {
                        sb2.append("±");
                        if (i10 >= 26) {
                            f11 = s6.a.g(location);
                        } else {
                            Bundle extras6 = location.getExtras();
                            if (extras6 != null) {
                                f11 = extras6.getFloat("bearingAccuracy", 0.0f);
                            }
                        }
                        sb2.append(decimalFormat2.format(f11));
                    }
                    sb2.append("°");
                }
                Bundle extras7 = location.getExtras();
                String string = extras7 != null ? extras7.getString("floorLabel") : null;
                if (string != null) {
                    sb2.append(", fl=");
                    sb2.append(string);
                }
                Bundle extras8 = location.getExtras();
                String string2 = extras8 != null ? extras8.getString("levelId") : null;
                if (string2 != null) {
                    sb2.append(", lv=");
                    sb2.append(string2);
                }
                long currentTimeMillis = System.currentTimeMillis() - SystemClock.elapsedRealtime();
                sb2.append(", ert=");
                long millis = TimeUnit.NANOSECONDS.toMillis(location.getElapsedRealtimeNanos()) + currentTimeMillis;
                if (millis >= 0) {
                    l6 = j.f20460a.format(new Date(millis));
                } else {
                    SimpleDateFormat simpleDateFormat = j.f20460a;
                    l6 = Long.toString(millis);
                }
                sb2.append(l6);
                sb2.append('}');
            }
            sb2.append(", ");
            z11 = true;
            i5 = 100;
        }
        if (z11) {
            sb2.setLength(sb2.length() - 2);
        }
        sb2.append("]");
        return sb2.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i5) {
        int V = b.V(parcel, 20293);
        b.R(parcel, 1, this.f5728a, false);
        b.W(parcel, V);
    }
}
