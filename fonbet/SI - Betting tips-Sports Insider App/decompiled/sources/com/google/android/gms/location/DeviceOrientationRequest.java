package com.google.android.gms.location;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import h8.b;
import java.util.Arrays;
import n6.a;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class DeviceOrientationRequest extends AbstractSafeParcelable {

    @NonNull
    public static final Parcelable.Creator<DeviceOrientationRequest> CREATOR = new a(28);

    /* renamed from: a, reason: collision with root package name */
    public final long f5700a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f5701b;

    public DeviceOrientationRequest(boolean z5, long j) {
        this.f5700a = j;
        this.f5701b = z5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DeviceOrientationRequest)) {
            return false;
        }
        DeviceOrientationRequest deviceOrientationRequest = (DeviceOrientationRequest) obj;
        return this.f5700a == deviceOrientationRequest.f5700a && this.f5701b == deviceOrientationRequest.f5701b;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Long.valueOf(this.f5700a), Boolean.valueOf(this.f5701b)});
    }

    public final String toString() {
        long j = this.f5700a;
        int length = String.valueOf(j).length();
        String str = true != this.f5701b ? "" : ", withVelocity";
        StringBuilder sb2 = new StringBuilder(str.length() + length + 46 + 1);
        sb2.append("DeviceOrientationRequest[samplingPeriodMicros=");
        sb2.append(j);
        sb2.append(str);
        sb2.append("]");
        return sb2.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i5) {
        int V = b.V(parcel, 20293);
        b.U(parcel, 2, 8);
        parcel.writeLong(this.f5700a);
        b.U(parcel, 6, 4);
        parcel.writeInt(this.f5701b ? 1 : 0);
        b.W(parcel, V);
    }
}
