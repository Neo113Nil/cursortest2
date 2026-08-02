package com.google.android.gms.common.api;

import android.app.ActivityOptions;
import android.app.PendingIntent;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.Arrays;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@SafeParcelable.Class
/* loaded from: classes3.dex */
public final class Status extends AbstractSafeParcelable implements Result, ReflectedParcelable {

    @NonNull
    public static final Parcelable.Creator<Status> CREATOR;
    public static final Status e;
    public static final Status f;
    public static final Status g;
    public static final Status h;
    public static final Status i;
    public final int a;
    public final String b;
    public final PendingIntent c;
    public final ConnectionResult d;

    static {
        new Status(-1, null, null, null);
        e = new Status(0, null, null, null);
        f = new Status(14, null, null, null);
        g = new Status(8, null, null, null);
        h = new Status(15, null, null, null);
        i = new Status(16, null, null, null);
        new Status(17, null, null, null);
        new Status(18, null, null, null);
        CREATOR = new zze();
    }

    public Status(int i2, String str, PendingIntent pendingIntent, ConnectionResult connectionResult) {
        this.a = i2;
        this.b = str;
        this.c = pendingIntent;
        this.d = connectionResult;
    }

    public final boolean Y0() {
        return this.a <= 0;
    }

    public final void Z0() {
        PendingIntent pendingIntent = this.c;
        if (pendingIntent != null) {
            if (Build.VERSION.SDK_INT >= 34) {
                ActivityOptions.makeBasic().setPendingIntentBackgroundActivityStartMode(1).toBundle();
            }
            Preconditions.i(pendingIntent);
            pendingIntent.getIntentSender();
            throw null;
        }
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof Status)) {
            return false;
        }
        Status status = (Status) obj;
        return this.a == status.a && Objects.a(this.b, status.b) && Objects.a(this.c, status.c) && Objects.a(this.d, status.d);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.a), this.b, this.c, this.d});
    }

    public final String toString() {
        Objects.ToStringHelper toStringHelper = new Objects.ToStringHelper(this);
        String str = this.b;
        if (str == null) {
            str = CommonStatusCodes.a(this.a);
        }
        toStringHelper.a(str, "statusCode");
        toStringHelper.a(this.c, "resolution");
        return toStringHelper.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i2) {
        int s = SafeParcelWriter.s(parcel, 20293);
        SafeParcelWriter.r(parcel, 1, 4);
        parcel.writeInt(this.a);
        SafeParcelWriter.m(parcel, 2, this.b, false);
        SafeParcelWriter.l(parcel, 3, this.c, i2, false);
        SafeParcelWriter.l(parcel, 4, this.d, i2, false);
        SafeParcelWriter.t(parcel, s);
    }

    @Override // com.google.android.gms.common.api.Result
    public final Status getStatus() {
        return this;
    }
}
