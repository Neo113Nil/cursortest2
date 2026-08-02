package com.google.android.gms.location;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.ironsource.U3;
import defpackage.mz1;
import java.util.Arrays;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@SafeParcelable.Class
@SafeParcelable.Reserved
/* loaded from: classes3.dex */
public final class DeviceOrientationRequest extends AbstractSafeParcelable {

    @NonNull
    public static final Parcelable.Creator<DeviceOrientationRequest> CREATOR = new zzn();
    public final long a;
    public final boolean b;

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    public static final class Builder {
    }

    public DeviceOrientationRequest(long j, boolean z) {
        this.a = j;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DeviceOrientationRequest)) {
            return false;
        }
        DeviceOrientationRequest deviceOrientationRequest = (DeviceOrientationRequest) obj;
        return this.a == deviceOrientationRequest.a && this.b == deviceOrientationRequest.b;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Long.valueOf(this.a), Boolean.valueOf(this.b)});
    }

    public final String toString() {
        long j = this.a;
        int length = String.valueOf(j).length();
        String str = true != this.b ? "" : ", withVelocity";
        StringBuilder sb = new StringBuilder(mz1.d(length + 46, 1, str));
        sb.append("DeviceOrientationRequest[samplingPeriodMicros=");
        sb.append(j);
        sb.append(str);
        sb.append(U3.j.e);
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int s = SafeParcelWriter.s(parcel, 20293);
        SafeParcelWriter.r(parcel, 2, 8);
        parcel.writeLong(this.a);
        SafeParcelWriter.r(parcel, 6, 4);
        parcel.writeInt(this.b ? 1 : 0);
        SafeParcelWriter.t(parcel, s);
    }
}
