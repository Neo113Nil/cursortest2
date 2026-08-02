package com.google.android.gms.common;

import a3.a;
import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.sports.insider.data.repository.room.live.LiveTable;
import g6.v;
import h8.b;
import io.appmetrica.analytics.impl.C0122e9;
import java.util.Arrays;
import zg.g;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class ConnectionResult extends AbstractSafeParcelable {

    /* renamed from: a, reason: collision with root package name */
    public final int f4440a;

    /* renamed from: b, reason: collision with root package name */
    public final int f4441b;

    /* renamed from: c, reason: collision with root package name */
    public final PendingIntent f4442c;

    /* renamed from: d, reason: collision with root package name */
    public final String f4443d;

    /* renamed from: e, reason: collision with root package name */
    public final Integer f4444e;

    /* renamed from: f, reason: collision with root package name */
    public static final ConnectionResult f4439f = new ConnectionResult(0, null, null);

    @NonNull
    public static final Parcelable.Creator<ConnectionResult> CREATOR = new a(13);

    public ConnectionResult(int i5, int i10, PendingIntent pendingIntent, String str, Integer num) {
        this.f4440a = i5;
        this.f4441b = i10;
        this.f4442c = pendingIntent;
        this.f4443d = str;
        this.f4444e = num;
    }

    public static String c(int i5) {
        if (i5 == 99) {
            return "UNFINISHED";
        }
        if (i5 == 1500) {
            return "DRIVE_EXTERNAL_STORAGE_REQUIRED";
        }
        switch (i5) {
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
                switch (i5) {
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
                    case g.DEBUGMODULES_FIELD_NUMBER /* 22 */:
                        return "RESOLUTION_ACTIVITY_NOT_FOUND";
                    case g.ISCRASH_FIELD_NUMBER /* 23 */:
                        return "API_DISABLED";
                    case g.FORCEINGEST_FIELD_NUMBER /* 24 */:
                        return "API_DISABLED_FOR_CONNECTION";
                    case C0122e9.F /* 25 */:
                        return "API_INSTALL_REQUIRED";
                    default:
                        StringBuilder sb2 = new StringBuilder(String.valueOf(i5).length() + 20);
                        sb2.append("UNKNOWN_ERROR_CODE(");
                        sb2.append(i5);
                        sb2.append(")");
                        return sb2.toString();
                }
        }
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ConnectionResult)) {
            return false;
        }
        ConnectionResult connectionResult = (ConnectionResult) obj;
        return this.f4441b == connectionResult.f4441b && v.k(this.f4442c, connectionResult.f4442c) && v.k(this.f4443d, connectionResult.f4443d) && v.k(this.f4444e, connectionResult.f4444e);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f4441b), this.f4442c, this.f4443d, this.f4444e});
    }

    public final String toString() {
        l1.a aVar = new l1.a(this);
        aVar.i(c(this.f4441b), "statusCode");
        aVar.i(this.f4442c, "resolution");
        aVar.i(this.f4443d, LiveTable.messageColumn);
        aVar.i(this.f4444e, "clientMethodKey");
        return aVar.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i5) {
        int V = b.V(parcel, 20293);
        b.U(parcel, 1, 4);
        parcel.writeInt(this.f4440a);
        b.U(parcel, 2, 4);
        parcel.writeInt(this.f4441b);
        b.N(parcel, 3, this.f4442c, i5, false);
        b.O(parcel, 4, this.f4443d, false);
        b.K(parcel, 5, this.f4444e);
        b.W(parcel, V);
    }

    public ConnectionResult(int i5, PendingIntent pendingIntent, String str) {
        this(1, i5, pendingIntent, str, null);
    }
}
