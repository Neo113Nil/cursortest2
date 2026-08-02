package com.google.android.gms.common;

import android.app.Activity;
import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import com.google.android.gms.common.internal.AbstractC3189m;
import com.google.android.gms.common.internal.AbstractC3191o;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

/* loaded from: classes2.dex */
public final class ConnectionResult extends AbstractSafeParcelable {

    /* renamed from: a, reason: collision with root package name */
    public final int f32217a;

    /* renamed from: b, reason: collision with root package name */
    public final int f32218b;

    /* renamed from: c, reason: collision with root package name */
    public final PendingIntent f32219c;

    /* renamed from: d, reason: collision with root package name */
    public final String f32220d;

    /* renamed from: e, reason: collision with root package name */
    public final Integer f32221e;

    /* renamed from: f, reason: collision with root package name */
    public static final ConnectionResult f32216f = new ConnectionResult(0);

    @NonNull
    public static final Parcelable.Creator<ConnectionResult> CREATOR = new q();

    public ConnectionResult(int i10, int i11, PendingIntent pendingIntent, String str, Integer num) {
        this.f32217a = i10;
        this.f32218b = i11;
        this.f32219c = pendingIntent;
        this.f32220d = str;
        this.f32221e = num;
    }

    public static String N(int i10) {
        if (i10 == 99) {
            return "UNFINISHED";
        }
        if (i10 == 1500) {
            return "DRIVE_EXTERNAL_STORAGE_REQUIRED";
        }
        switch (i10) {
            case -1:
                return "UNKNOWN";
            case 0:
                return "SUCCESS";
            case 1:
                return "SERVICE_MISSING";
            case 2:
                return "SERVICE_VERSION_UPDATE_REQUIRED";
            case 3:
                return "SERVICE_DISABLED";
            case 4:
                return "SIGN_IN_REQUIRED";
            case 5:
                return "INVALID_ACCOUNT";
            case 6:
                return "RESOLUTION_REQUIRED";
            case 7:
                return "NETWORK_ERROR";
            case 8:
                return "INTERNAL_ERROR";
            case 9:
                return "SERVICE_INVALID";
            case 10:
                return "DEVELOPER_ERROR";
            case 11:
                return "LICENSE_CHECK_FAILED";
            default:
                switch (i10) {
                    case 13:
                        return "CANCELED";
                    case 14:
                        return "TIMEOUT";
                    case 15:
                        return "INTERRUPTED";
                    case 16:
                        return "API_UNAVAILABLE";
                    case 17:
                        return "SIGN_IN_FAILED";
                    case 18:
                        return "SERVICE_UPDATING";
                    case 19:
                        return "SERVICE_MISSING_PERMISSION";
                    case 20:
                        return "RESTRICTED_PROFILE";
                    case 21:
                        return "API_VERSION_UPDATE_REQUIRED";
                    case 22:
                        return "RESOLUTION_ACTIVITY_NOT_FOUND";
                    case 23:
                        return "API_DISABLED";
                    case 24:
                        return "API_DISABLED_FOR_CONNECTION";
                    case 25:
                        return "API_INSTALL_REQUIRED";
                    default:
                        StringBuilder sb2 = new StringBuilder(String.valueOf(i10).length() + 20);
                        sb2.append("UNKNOWN_ERROR_CODE(");
                        sb2.append(i10);
                        sb2.append(")");
                        return sb2.toString();
                }
        }
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ConnectionResult)) {
            return false;
        }
        ConnectionResult connectionResult = (ConnectionResult) obj;
        return this.f32218b == connectionResult.f32218b && AbstractC3189m.b(this.f32219c, connectionResult.f32219c) && AbstractC3189m.b(this.f32220d, connectionResult.f32220d) && AbstractC3189m.b(this.f32221e, connectionResult.f32221e);
    }

    public Integer g() {
        return this.f32221e;
    }

    public int h() {
        return this.f32218b;
    }

    public int hashCode() {
        return AbstractC3189m.c(Integer.valueOf(this.f32218b), this.f32219c, this.f32220d, this.f32221e);
    }

    public String i() {
        return this.f32220d;
    }

    public PendingIntent j() {
        return this.f32219c;
    }

    public boolean k() {
        return (this.f32218b == 0 || this.f32219c == null) ? false : true;
    }

    public boolean l() {
        return this.f32218b == 0;
    }

    public void m(Activity activity, int i10) {
        if (k()) {
            PendingIntent pendingIntent = this.f32219c;
            AbstractC3191o.m(pendingIntent);
            activity.startIntentSenderForResult(pendingIntent.getIntentSender(), i10, null, 0, 0, 0);
        }
    }

    public String toString() {
        AbstractC3189m.a d10 = AbstractC3189m.d(this);
        d10.a("statusCode", N(this.f32218b));
        d10.a("resolution", this.f32219c);
        d10.a("message", this.f32220d);
        d10.a("clientMethodKey", this.f32221e);
        return d10.toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        int i11 = this.f32217a;
        int a10 = E9.b.a(parcel);
        E9.b.u(parcel, 1, i11);
        E9.b.u(parcel, 2, h());
        E9.b.D(parcel, 3, j(), i10, false);
        E9.b.F(parcel, 4, i(), false);
        E9.b.x(parcel, 5, g(), false);
        E9.b.b(parcel, a10);
    }

    public ConnectionResult(int i10) {
        this(i10, null, null);
    }

    public ConnectionResult(int i10, PendingIntent pendingIntent) {
        this(i10, pendingIntent, null);
    }

    public ConnectionResult(int i10, PendingIntent pendingIntent, String str) {
        this(1, i10, pendingIntent, str, null);
    }
}
