package com.google.android.gms.location;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.unity3d.services.UnityAdsConstants;
import defpackage.a70;
import defpackage.fn0;
import defpackage.ilg;
import java.util.Arrays;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@SafeParcelable.Class
@SafeParcelable.Reserved
/* loaded from: classes3.dex */
public class DeviceOrientation extends AbstractSafeParcelable {

    @NonNull
    public static final Parcelable.Creator<DeviceOrientation> CREATOR = new zzm();
    public final float[] a;
    public final float b;
    public final float c;
    public final long d;
    public final byte e;
    public final float f;
    public final float g;

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    public static final class Builder {
    }

    public DeviceOrientation(float[] fArr, float f, float f2, long j, byte b, float f3, float f4) {
        if (!(fArr != null && fArr.length == 4)) {
            a70.p("Input attitude array should be of length 4.");
            throw null;
        }
        if (!((Float.isNaN(fArr[0]) || Float.isNaN(fArr[1]) || Float.isNaN(fArr[2]) || Float.isNaN(fArr[3])) ? false : true)) {
            a70.p("Input attitude cannot contain NaNs.");
            throw null;
        }
        if (f < UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT || f >= 360.0f) {
            ilg.c();
            throw null;
        }
        if (f2 < UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT || f2 > 180.0f) {
            ilg.c();
            throw null;
        }
        if (f4 < UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT || f4 > 180.0f) {
            ilg.c();
            throw null;
        }
        if (j < 0) {
            ilg.c();
            throw null;
        }
        this.a = fArr;
        this.b = f;
        this.c = f2;
        this.f = f3;
        this.g = f4;
        this.d = j;
        this.e = (byte) (((byte) (((byte) (b | 16)) | 4)) | 8);
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof DeviceOrientation) {
                DeviceOrientation deviceOrientation = (DeviceOrientation) obj;
                byte b = deviceOrientation.e;
                byte b2 = this.e;
                boolean z = ((b2 & 32) != 0) == ((b & 32) != 0) && ((b2 & 32) == 0 || Float.compare(this.f, deviceOrientation.f) == 0);
                boolean z2 = ((b2 & 64) != 0) == ((b & 64) != 0) && ((b2 & 64) == 0 || Float.compare(this.g, deviceOrientation.g) == 0);
                if (Float.compare(this.b, deviceOrientation.b) != 0 || Float.compare(this.c, deviceOrientation.c) != 0 || !z || !z2 || this.d != deviceOrientation.d || !Arrays.equals(this.a, deviceOrientation.a)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Float.valueOf(this.b), Float.valueOf(this.c), Float.valueOf(this.g), Long.valueOf(this.d), this.a, Byte.valueOf(this.e)});
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("DeviceOrientation[attitude=");
        sb.append(Arrays.toString(this.a));
        sb.append(", headingDegrees=");
        sb.append(this.b);
        sb.append(", headingErrorDegrees=");
        sb.append(this.c);
        if ((this.e & 64) != 0) {
            sb.append(", conservativeHeadingErrorDegrees=");
            sb.append(this.g);
        }
        sb.append(", elapsedRealtimeNs=");
        return fn0.n(sb, this.d, ']');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int s = SafeParcelWriter.s(parcel, 20293);
        float[] fArr = (float[]) this.a.clone();
        int s2 = SafeParcelWriter.s(parcel, 1);
        parcel.writeFloatArray(fArr);
        SafeParcelWriter.t(parcel, s2);
        SafeParcelWriter.r(parcel, 4, 4);
        parcel.writeFloat(this.b);
        SafeParcelWriter.r(parcel, 5, 4);
        parcel.writeFloat(this.c);
        SafeParcelWriter.r(parcel, 6, 8);
        parcel.writeLong(this.d);
        SafeParcelWriter.r(parcel, 7, 4);
        parcel.writeInt(this.e);
        SafeParcelWriter.r(parcel, 8, 4);
        parcel.writeFloat(this.f);
        SafeParcelWriter.r(parcel, 9, 4);
        parcel.writeFloat(this.g);
        SafeParcelWriter.t(parcel, s);
    }
}
