package com.google.android.gms.fitness.data;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.util.Arrays;
import xsna.dq70;
import xsna.exc0;
import xsna.h5s;
import xsna.ll01;
import xsna.ozg0;
import xsna.xy6;

/* compiled from: com.google.android.gms:play-services-fitness@@21.2.0 */
/* loaded from: classes12.dex */
public final class Device extends AbstractSafeParcelable {

    @NonNull
    public static final Parcelable.Creator<Device> CREATOR = new ll01();
    public final String b;
    public final String c;
    public final String d;
    public final int e;
    public final int f;

    public Device(@NonNull String str, @NonNull String str2, @NonNull String str3, int i, int i2) {
        exc0.i(str);
        this.b = str;
        exc0.i(str2);
        this.c = str2;
        if (str3 == null) {
            throw new IllegalStateException("Device UID is null.");
        }
        this.d = str3;
        this.e = i;
        this.f = i2;
    }

    public final boolean equals(@Nullable Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Device)) {
            return false;
        }
        Device device = (Device) obj;
        return dq70.b(this.b, device.b) && dq70.b(this.c, device.c) && dq70.b(this.d, device.d) && this.e == device.e && this.f == device.f;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.b, this.c, this.d, Integer.valueOf(this.e)});
    }

    @NonNull
    public final String i() {
        return this.c;
    }

    @NonNull
    public final String toString() {
        return h5s.c(this.f, "}", xy6.b(this.e, "Device{", zza(), StringUtils.PROCESS_POSTFIX_DELIMITER, StringUtils.PROCESS_POSTFIX_DELIMITER));
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NonNull Parcel parcel, int i) {
        int w = ozg0.w(20293, parcel);
        ozg0.q(parcel, 1, this.b, false);
        ozg0.q(parcel, 2, this.c, false);
        ozg0.q(parcel, 4, this.d, false);
        ozg0.v(parcel, 5, 4);
        parcel.writeInt(this.e);
        ozg0.v(parcel, 6, 4);
        parcel.writeInt(this.f);
        ozg0.x(w, parcel);
    }

    public final String zza() {
        return this.b + StringUtils.PROCESS_POSTFIX_DELIMITER + this.c + StringUtils.PROCESS_POSTFIX_DELIMITER + this.d;
    }
}
