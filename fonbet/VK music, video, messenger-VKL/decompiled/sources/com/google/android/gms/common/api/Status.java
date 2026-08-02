package com.google.android.gms.common.api;

import android.app.Activity;
import android.app.ActivityOptions;
import android.app.PendingIntent;
import android.content.IntentSender;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.huawei.hms.adapter.internal.CommonCode;
import com.huawei.hms.support.hianalytics.HiAnalyticsConstant;
import java.util.Arrays;
import xsna.dq70;
import xsna.exc0;
import xsna.mmg;
import xsna.ozg0;
import xsna.qdg0;
import xsna.z701;

/* compiled from: com.google.android.gms:play-services-basement@@18.10.0 */
/* loaded from: classes.dex */
public final class Status extends AbstractSafeParcelable implements qdg0, ReflectedParcelable {

    @NonNull
    public static final Parcelable.Creator<Status> CREATOR;

    @NonNull
    public static final Status f;

    @NonNull
    public static final Status g;

    @NonNull
    public static final Status h;

    @NonNull
    public static final Status i;

    @NonNull
    public static final Status j;
    public final int b;

    @Nullable
    public final String c;

    @Nullable
    public final PendingIntent d;

    @Nullable
    public final ConnectionResult e;

    static {
        new Status(-1);
        f = new Status(0);
        g = new Status(14);
        h = new Status(8);
        i = new Status(15);
        j = new Status(16);
        new Status(17);
        new Status(18);
        CREATOR = new z701();
    }

    public Status(int i2, @Nullable String str, @Nullable PendingIntent pendingIntent, @Nullable ConnectionResult connectionResult) {
        this.b = i2;
        this.c = str;
        this.d = pendingIntent;
        this.e = connectionResult;
    }

    public final boolean equals(@Nullable Object obj) {
        if (!(obj instanceof Status)) {
            return false;
        }
        Status status = (Status) obj;
        return this.b == status.b && dq70.b(this.c, status.c) && dq70.b(this.d, status.d) && dq70.b(this.e, status.e);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.b), this.c, this.d, this.e});
    }

    public final boolean i() {
        return this.b <= 0;
    }

    public final void j(@NonNull Activity activity, int i2) throws IntentSender.SendIntentException {
        Bundle bundle;
        ActivityOptions pendingIntentBackgroundActivityStartMode;
        PendingIntent pendingIntent = this.d;
        if (pendingIntent != null) {
            if (Build.VERSION.SDK_INT >= 34) {
                pendingIntentBackgroundActivityStartMode = ActivityOptions.makeBasic().setPendingIntentBackgroundActivityStartMode(1);
                bundle = pendingIntentBackgroundActivityStartMode.toBundle();
            } else {
                bundle = null;
            }
            Bundle bundle2 = bundle;
            exc0.i(pendingIntent);
            activity.startIntentSenderForResult(pendingIntent.getIntentSender(), i2, null, 0, 0, 0, bundle2);
        }
    }

    @NonNull
    public final String toString() {
        dq70.a aVar = new dq70.a(this);
        String str = this.c;
        if (str == null) {
            str = mmg.a(this.b);
        }
        aVar.a(str, HiAnalyticsConstant.HaKey.BI_KEY_RESULT);
        aVar.a(this.d, CommonCode.MapKey.HAS_RESOLUTION);
        return aVar.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NonNull Parcel parcel, int i2) {
        int w = ozg0.w(20293, parcel);
        ozg0.v(parcel, 1, 4);
        parcel.writeInt(this.b);
        ozg0.q(parcel, 2, this.c, false);
        ozg0.p(parcel, 3, this.d, i2, false);
        ozg0.p(parcel, 4, this.e, i2, false);
        ozg0.x(w, parcel);
    }

    @Deprecated
    public Status(@NonNull ConnectionResult connectionResult, @NonNull String str, int i2) {
        this(i2, str, connectionResult.d, connectionResult);
    }

    public Status(int i2) {
        this(i2, (String) null);
    }

    public Status(@NonNull ConnectionResult connectionResult, @NonNull String str) {
        this(connectionResult, str, 17);
    }

    public Status(int i2, @Nullable String str) {
        this(i2, str, (PendingIntent) null);
    }

    public Status(int i2, @Nullable String str, @Nullable PendingIntent pendingIntent) {
        this(i2, str, pendingIntent, null);
    }

    @Override // xsna.qdg0
    @NonNull
    public final Status getStatus() {
        return this;
    }
}
