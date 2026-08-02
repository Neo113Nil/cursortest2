package com.google.android.gms.common;

import android.app.Activity;
import android.app.PendingIntent;
import android.content.IntentSender;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.huawei.hms.adapter.internal.CommonCode;
import com.huawei.hms.framework.network.grs.GrsBaseInfo;
import com.huawei.hms.support.hianalytics.HiAnalyticsConstant;
import java.util.Arrays;
import ru.ok.android.webrtc.signaling.api.SignalingProtocol;
import xsna.dq70;
import xsna.exc0;
import xsna.fsz0;
import xsna.ozg0;

/* compiled from: com.google.android.gms:play-services-basement@@18.10.0 */
/* loaded from: classes.dex */
public final class ConnectionResult extends AbstractSafeParcelable {
    public final int b;
    public final int c;

    @Nullable
    public final PendingIntent d;

    @Nullable
    public final String e;

    @Nullable
    public final Integer f;

    @NonNull
    public static final ConnectionResult g = new ConnectionResult(0);

    @NonNull
    public static final Parcelable.Creator<ConnectionResult> CREATOR = new fsz0();

    public ConnectionResult(int i, int i2, @Nullable PendingIntent pendingIntent, @Nullable String str, @Nullable Integer num) {
        this.b = i;
        this.c = i2;
        this.d = pendingIntent;
        this.e = str;
        this.f = num;
    }

    @NonNull
    public static String l(int i) {
        if (i == 99) {
            return "UNFINISHED";
        }
        if (i == 1500) {
            return "DRIVE_EXTERNAL_STORAGE_REQUIRED";
        }
        switch (i) {
            case -1:
                return GrsBaseInfo.CountryCodeSource.UNKNOWN;
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
                switch (i) {
                    case 13:
                        return SignalingProtocol.HUNGUP_REASON_CANCELED;
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
                        StringBuilder sb = new StringBuilder(String.valueOf(i).length() + 20);
                        sb.append("UNKNOWN_ERROR_CODE(");
                        sb.append(i);
                        sb.append(")");
                        return sb.toString();
                }
        }
    }

    public final boolean equals(@Nullable Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ConnectionResult)) {
            return false;
        }
        ConnectionResult connectionResult = (ConnectionResult) obj;
        return this.c == connectionResult.c && dq70.b(this.d, connectionResult.d) && dq70.b(this.e, connectionResult.e) && dq70.b(this.f, connectionResult.f);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.c), this.d, this.e, this.f});
    }

    public final boolean i() {
        return (this.c == 0 || this.d == null) ? false : true;
    }

    public final boolean j() {
        return this.c == 0;
    }

    public final void k(@NonNull Activity activity, int i) throws IntentSender.SendIntentException {
        if (i()) {
            PendingIntent pendingIntent = this.d;
            exc0.i(pendingIntent);
            activity.startIntentSenderForResult(pendingIntent.getIntentSender(), i, null, 0, 0, 0);
        }
    }

    @NonNull
    public final String toString() {
        dq70.a aVar = new dq70.a(this);
        aVar.a(l(this.c), HiAnalyticsConstant.HaKey.BI_KEY_RESULT);
        aVar.a(this.d, CommonCode.MapKey.HAS_RESOLUTION);
        aVar.a(this.e, "message");
        aVar.a(this.f, "clientMethodKey");
        return aVar.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NonNull Parcel parcel, int i) {
        int w = ozg0.w(20293, parcel);
        ozg0.v(parcel, 1, 4);
        parcel.writeInt(this.b);
        ozg0.v(parcel, 2, 4);
        parcel.writeInt(this.c);
        ozg0.p(parcel, 3, this.d, i, false);
        ozg0.q(parcel, 4, this.e, false);
        ozg0.k(parcel, 5, this.f);
        ozg0.x(w, parcel);
    }

    public ConnectionResult(int i) {
        this(i, null, null);
    }

    public ConnectionResult(int i, @Nullable PendingIntent pendingIntent) {
        this(i, pendingIntent, null);
    }

    public ConnectionResult(int i, @Nullable PendingIntent pendingIntent, @Nullable String str) {
        this(1, i, pendingIntent, str, null);
    }

    public ConnectionResult(int i, @Nullable PendingIntent pendingIntent, @Nullable String str, @Nullable Integer num) {
        this(1, i, pendingIntent, str, num);
    }
}
