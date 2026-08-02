package com.google.android.gms.location;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import h8.b;
import io.appmetrica.analytics.AppMetricaDefaultValues;
import java.util.Arrays;
import n6.a;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class LocationAvailability extends AbstractSafeParcelable implements ReflectedParcelable {

    @NonNull
    public static final Parcelable.Creator<LocationAvailability> CREATOR = new a(7);

    /* renamed from: a, reason: collision with root package name */
    public final int f5709a;

    /* renamed from: b, reason: collision with root package name */
    public final int f5710b;

    /* renamed from: c, reason: collision with root package name */
    public final long f5711c;

    /* renamed from: d, reason: collision with root package name */
    public final int f5712d;

    /* renamed from: e, reason: collision with root package name */
    public final zzal[] f5713e;

    public LocationAvailability(int i5, int i10, int i11, long j, zzal[] zzalVarArr) {
        this.f5712d = i5 < 1000 ? 0 : AppMetricaDefaultValues.DEFAULT_MAX_REPORTS_IN_DATABASE_COUNT;
        this.f5709a = i10;
        this.f5710b = i11;
        this.f5711c = j;
        this.f5713e = zzalVarArr;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof LocationAvailability) {
            LocationAvailability locationAvailability = (LocationAvailability) obj;
            if (this.f5709a == locationAvailability.f5709a && this.f5710b == locationAvailability.f5710b && this.f5711c == locationAvailability.f5711c && this.f5712d == locationAvailability.f5712d && Arrays.equals(this.f5713e, locationAvailability.f5713e)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f5712d)});
    }

    public final String toString() {
        boolean z5 = this.f5712d < 1000;
        StringBuilder sb2 = new StringBuilder(String.valueOf(z5).length() + 22);
        sb2.append("LocationAvailability[");
        sb2.append(z5);
        sb2.append("]");
        return sb2.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i5) {
        int V = b.V(parcel, 20293);
        b.U(parcel, 1, 4);
        parcel.writeInt(this.f5709a);
        b.U(parcel, 2, 4);
        parcel.writeInt(this.f5710b);
        b.U(parcel, 3, 8);
        parcel.writeLong(this.f5711c);
        b.U(parcel, 4, 4);
        int i10 = this.f5712d;
        parcel.writeInt(i10);
        b.Q(parcel, 5, this.f5713e, i5);
        int i11 = i10 >= 1000 ? 0 : 1;
        b.U(parcel, 6, 4);
        parcel.writeInt(i11);
        b.W(parcel, V);
    }
}
