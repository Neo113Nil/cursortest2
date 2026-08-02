package com.google.android.gms.maps.model;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.ironsource.X3;
import com.unity3d.services.UnityAdsConstants;
import java.util.Arrays;
import xsna.dq70;
import xsna.exc0;
import xsna.k101;
import xsna.ozg0;
import xsna.tb7;
import xsna.vnv;

/* compiled from: com.google.android.gms:play-services-maps@@18.0.0 */
/* loaded from: classes13.dex */
public class Cap extends AbstractSafeParcelable {

    @NonNull
    public static final Parcelable.Creator<Cap> CREATOR = new k101();
    public final int b;

    @Nullable
    public final tb7 c;

    @Nullable
    public final Float d;

    public Cap(int i, @Nullable IBinder iBinder, @Nullable Float f) {
        tb7 tb7Var = iBinder == null ? null : new tb7(vnv.a.f(iBinder));
        boolean z = f != null && f.floatValue() > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        if (i == 3) {
            r0 = tb7Var != null && z;
            i = 3;
        }
        exc0.a("Invalid Cap: type=" + i + " bitmapDescriptor=" + tb7Var + " bitmapRefWidth=" + f, r0);
        this.b = i;
        this.c = tb7Var;
        this.d = f;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Cap)) {
            return false;
        }
        Cap cap = (Cap) obj;
        return this.b == cap.b && dq70.b(this.c, cap.c) && dq70.b(this.d, cap.d);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.b), this.c, this.d});
    }

    @NonNull
    public final String toString() {
        StringBuilder sb = new StringBuilder(23);
        sb.append("[Cap: type=");
        sb.append(this.b);
        sb.append(X3.j.e);
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NonNull Parcel parcel, int i) {
        int w = ozg0.w(20293, parcel);
        ozg0.v(parcel, 2, 4);
        parcel.writeInt(this.b);
        tb7 tb7Var = this.c;
        ozg0.h(parcel, 3, tb7Var == null ? null : tb7Var.a.asBinder());
        ozg0.g(parcel, 4, this.d);
        ozg0.x(w, parcel);
    }
}
