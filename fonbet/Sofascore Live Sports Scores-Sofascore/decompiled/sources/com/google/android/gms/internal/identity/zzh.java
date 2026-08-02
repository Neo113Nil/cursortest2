package com.google.android.gms.internal.identity;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.location.DeviceOrientationRequest;
import defpackage.bf3;
import defpackage.wt3;
import java.util.Collections;
import java.util.List;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@SafeParcelable.Class
/* loaded from: classes3.dex */
public final class zzh extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzh> CREATOR;
    public static final List d = Collections.EMPTY_LIST;
    public static final DeviceOrientationRequest e;
    public final DeviceOrientationRequest a;
    public final List b;
    public final String c;

    static {
        new StringBuilder(String.valueOf(20000L).length() + 102);
        e = new DeviceOrientationRequest(20000L, false);
        CREATOR = new zzi();
    }

    public zzh(DeviceOrientationRequest deviceOrientationRequest, List list, String str) {
        this.a = deviceOrientationRequest;
        this.b = list;
        this.c = str;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zzh)) {
            return false;
        }
        zzh zzhVar = (zzh) obj;
        return Objects.a(this.a, zzhVar.a) && Objects.a(this.b, zzhVar.b) && Objects.a(this.c, zzhVar.c);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        String valueOf = String.valueOf(this.a);
        String valueOf2 = String.valueOf(this.b);
        int length = valueOf.length();
        int length2 = valueOf2.length();
        String str = this.c;
        StringBuilder sb = new StringBuilder(wt3.h(length, 68, length2, 7, String.valueOf(str).length()) + 2);
        bf3.v(sb, "DeviceOrientationRequestInternal[deviceOrientationRequest=", valueOf, ", clients=", valueOf2);
        return wt3.m(", tag='", str, sb, "']");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int s = SafeParcelWriter.s(parcel, 20293);
        SafeParcelWriter.l(parcel, 1, this.a, i, false);
        SafeParcelWriter.q(parcel, 2, this.b, false);
        SafeParcelWriter.m(parcel, 3, this.c, false);
        SafeParcelWriter.t(parcel, s);
    }
}
