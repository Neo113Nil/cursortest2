package com.google.android.gms.maps.model;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.unity3d.services.UnityAdsConstants;
import java.util.Arrays;
import ru.ok.android.webrtc.stat.call.internal.ConnectivityTracker;
import xsna.dq70;
import xsna.exc0;
import xsna.ozg0;
import xsna.tsz0;

/* compiled from: com.google.android.gms:play-services-maps@@18.0.0 */
/* loaded from: classes13.dex */
public final class CameraPosition extends AbstractSafeParcelable implements ReflectedParcelable {

    @NonNull
    public static final Parcelable.Creator<CameraPosition> CREATOR = new tsz0();

    @NonNull
    public final LatLng b;
    public final float c;
    public final float d;
    public final float e;

    /* compiled from: com.google.android.gms:play-services-maps@@18.0.0 */
    public static final class a {
        public LatLng a;
        public float b;

        @NonNull
        public final CameraPosition a() {
            return new CameraPosition(this.a, this.b, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        }

        @NonNull
        public final void b(@NonNull LatLng latLng) {
            this.a = latLng;
        }

        @NonNull
        public final void c(float f) {
            this.b = f;
        }
    }

    public CameraPosition(@NonNull LatLng latLng, float f, float f2, float f3) {
        exc0.j(latLng, "camera target must not be null.");
        boolean z = false;
        if (f2 >= UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT && f2 <= 90.0f) {
            z = true;
        }
        exc0.c(z, "Tilt needs to be between 0 and 90 inclusive: %s", Float.valueOf(f2));
        this.b = latLng;
        this.c = f;
        this.d = f2 + UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        this.e = (((double) f3) <= ConnectivityTracker.DEFAULT_UPLINK_BITRATE ? (f3 % 360.0f) + 360.0f : f3) % 360.0f;
    }

    @NonNull
    public static a i() {
        return new a();
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CameraPosition)) {
            return false;
        }
        CameraPosition cameraPosition = (CameraPosition) obj;
        return this.b.equals(cameraPosition.b) && Float.floatToIntBits(this.c) == Float.floatToIntBits(cameraPosition.c) && Float.floatToIntBits(this.d) == Float.floatToIntBits(cameraPosition.d) && Float.floatToIntBits(this.e) == Float.floatToIntBits(cameraPosition.e);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.b, Float.valueOf(this.c), Float.valueOf(this.d), Float.valueOf(this.e)});
    }

    @NonNull
    public final String toString() {
        dq70.a aVar = new dq70.a(this);
        aVar.a(this.b, "target");
        aVar.a(Float.valueOf(this.c), "zoom");
        aVar.a(Float.valueOf(this.d), "tilt");
        aVar.a(Float.valueOf(this.e), "bearing");
        return aVar.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NonNull Parcel parcel, int i) {
        int w = ozg0.w(20293, parcel);
        ozg0.p(parcel, 2, this.b, i, false);
        ozg0.v(parcel, 3, 4);
        parcel.writeFloat(this.c);
        ozg0.v(parcel, 4, 4);
        parcel.writeFloat(this.d);
        ozg0.v(parcel, 5, 4);
        parcel.writeFloat(this.e);
        ozg0.x(w, parcel);
    }
}
