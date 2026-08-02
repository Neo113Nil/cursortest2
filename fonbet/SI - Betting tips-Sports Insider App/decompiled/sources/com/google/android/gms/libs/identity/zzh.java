package com.google.android.gms.libs.identity;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.location.DeviceOrientationRequest;
import d9.e;
import g6.j;
import g6.v;
import h8.b;
import java.util.Collections;
import java.util.List;
import r4.k;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class zzh extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzh> CREATOR;

    /* renamed from: d, reason: collision with root package name */
    public static final List f4893d = Collections.EMPTY_LIST;

    /* renamed from: e, reason: collision with root package name */
    public static final DeviceOrientationRequest f4894e;

    /* renamed from: a, reason: collision with root package name */
    public final DeviceOrientationRequest f4895a;

    /* renamed from: b, reason: collision with root package name */
    public final List f4896b;

    /* renamed from: c, reason: collision with root package name */
    public final String f4897c;

    static {
        new StringBuilder(String.valueOf(20000L).length() + 102).append("Invalid interval: 20000 should be greater than or equal to 0. Note: Long.MAX_VALUE is not a valid interval.");
        f4894e = new DeviceOrientationRequest(false, 20000L);
        CREATOR = new j(25);
    }

    public zzh(DeviceOrientationRequest deviceOrientationRequest, List list, String str) {
        this.f4895a = deviceOrientationRequest;
        this.f4896b = list;
        this.f4897c = str;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zzh)) {
            return false;
        }
        zzh zzhVar = (zzh) obj;
        return v.k(this.f4895a, zzhVar.f4895a) && v.k(this.f4896b, zzhVar.f4896b) && v.k(this.f4897c, zzhVar.f4897c);
    }

    public final int hashCode() {
        return this.f4895a.hashCode();
    }

    public final String toString() {
        String valueOf = String.valueOf(this.f4895a);
        String valueOf2 = String.valueOf(this.f4896b);
        int length = valueOf.length();
        int length2 = valueOf2.length();
        String str = this.f4897c;
        StringBuilder sb2 = new StringBuilder(length + 68 + length2 + 7 + String.valueOf(str).length() + 2);
        k.s(sb2, "DeviceOrientationRequestInternal[deviceOrientationRequest=", valueOf, ", clients=", valueOf2);
        return e.m(sb2, ", tag='", str, "']");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i5) {
        int V = b.V(parcel, 20293);
        b.N(parcel, 1, this.f4895a, i5, false);
        b.R(parcel, 2, this.f4896b, false);
        b.O(parcel, 3, this.f4897c, false);
        b.W(parcel, V);
    }
}
