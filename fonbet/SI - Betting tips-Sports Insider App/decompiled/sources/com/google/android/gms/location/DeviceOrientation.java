package com.google.android.gms.location;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import d9.e;
import h8.b;
import java.util.Arrays;
import n6.a;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public class DeviceOrientation extends AbstractSafeParcelable {

    @NonNull
    public static final Parcelable.Creator<DeviceOrientation> CREATOR = new a(27);

    /* renamed from: a, reason: collision with root package name */
    public final float[] f5693a;

    /* renamed from: b, reason: collision with root package name */
    public final float f5694b;

    /* renamed from: c, reason: collision with root package name */
    public final float f5695c;

    /* renamed from: d, reason: collision with root package name */
    public final long f5696d;

    /* renamed from: e, reason: collision with root package name */
    public final byte f5697e;

    /* renamed from: f, reason: collision with root package name */
    public final float f5698f;

    /* renamed from: g, reason: collision with root package name */
    public final float f5699g;

    public DeviceOrientation(float[] fArr, float f6, float f10, long j, byte b10, float f11, float f12) {
        if (!(fArr != null && fArr.length == 4)) {
            throw new IllegalArgumentException("Input attitude array should be of length 4.");
        }
        if (!((Float.isNaN(fArr[0]) || Float.isNaN(fArr[1]) || Float.isNaN(fArr[2]) || Float.isNaN(fArr[3])) ? false : true)) {
            throw new IllegalArgumentException("Input attitude cannot contain NaNs.");
        }
        if (f6 < 0.0f || f6 >= 360.0f) {
            throw new IllegalArgumentException();
        }
        if (f10 < 0.0f || f10 > 180.0f) {
            throw new IllegalArgumentException();
        }
        if (f12 < 0.0f || f12 > 180.0f) {
            throw new IllegalArgumentException();
        }
        if (j < 0) {
            throw new IllegalArgumentException();
        }
        this.f5693a = fArr;
        this.f5694b = f6;
        this.f5695c = f10;
        this.f5698f = f11;
        this.f5699g = f12;
        this.f5696d = j;
        this.f5697e = (byte) (((byte) (((byte) (b10 | 16)) | 4)) | 8);
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof DeviceOrientation) {
                DeviceOrientation deviceOrientation = (DeviceOrientation) obj;
                byte b10 = deviceOrientation.f5697e;
                byte b11 = this.f5697e;
                boolean z5 = ((b11 & 32) != 0) == ((b10 & 32) != 0) && ((b11 & 32) == 0 || Float.compare(this.f5698f, deviceOrientation.f5698f) == 0);
                boolean z7 = ((b11 & 64) != 0) == ((b10 & 64) != 0) && ((b11 & 64) == 0 || Float.compare(this.f5699g, deviceOrientation.f5699g) == 0);
                if (Float.compare(this.f5694b, deviceOrientation.f5694b) != 0 || Float.compare(this.f5695c, deviceOrientation.f5695c) != 0 || !z5 || !z7 || this.f5696d != deviceOrientation.f5696d || !Arrays.equals(this.f5693a, deviceOrientation.f5693a)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Float.valueOf(this.f5694b), Float.valueOf(this.f5695c), Float.valueOf(this.f5699g), Long.valueOf(this.f5696d), this.f5693a, Byte.valueOf(this.f5697e)});
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("DeviceOrientation[attitude=");
        sb2.append(Arrays.toString(this.f5693a));
        sb2.append(", headingDegrees=");
        sb2.append(this.f5694b);
        sb2.append(", headingErrorDegrees=");
        sb2.append(this.f5695c);
        if ((this.f5697e & 64) != 0) {
            sb2.append(", conservativeHeadingErrorDegrees=");
            sb2.append(this.f5699g);
        }
        sb2.append(", elapsedRealtimeNs=");
        return e.j(sb2, this.f5696d, ']');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i5) {
        int V = b.V(parcel, 20293);
        float[] fArr = (float[]) this.f5693a.clone();
        int V2 = b.V(parcel, 1);
        parcel.writeFloatArray(fArr);
        b.W(parcel, V2);
        b.U(parcel, 4, 4);
        parcel.writeFloat(this.f5694b);
        b.U(parcel, 5, 4);
        parcel.writeFloat(this.f5695c);
        b.U(parcel, 6, 8);
        parcel.writeLong(this.f5696d);
        b.U(parcel, 7, 4);
        parcel.writeInt(this.f5697e);
        b.U(parcel, 8, 4);
        parcel.writeFloat(this.f5698f);
        b.U(parcel, 9, 4);
        parcel.writeFloat(this.f5699g);
        b.W(parcel, V);
    }
}
