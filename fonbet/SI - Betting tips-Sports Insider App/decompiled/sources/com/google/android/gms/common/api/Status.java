package com.google.android.gms.common.api;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import d6.l;
import d6.o;
import g6.v;
import h8.b;
import java.util.Arrays;
import l1.a;
import r4.k;
import zg.g;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class Status extends AbstractSafeParcelable implements l, ReflectedParcelable {

    /* renamed from: a, reason: collision with root package name */
    public final int f4466a;

    /* renamed from: b, reason: collision with root package name */
    public final String f4467b;

    /* renamed from: c, reason: collision with root package name */
    public final PendingIntent f4468c;

    /* renamed from: d, reason: collision with root package name */
    public final ConnectionResult f4469d;

    /* renamed from: e, reason: collision with root package name */
    public static final Status f4461e = new Status(0, null, null, null);

    /* renamed from: f, reason: collision with root package name */
    public static final Status f4462f = new Status(14, null, null, null);

    /* renamed from: g, reason: collision with root package name */
    public static final Status f4463g = new Status(8, null, null, null);

    /* renamed from: h, reason: collision with root package name */
    public static final Status f4464h = new Status(15, null, null, null);

    /* renamed from: i, reason: collision with root package name */
    public static final Status f4465i = new Status(16, null, null, null);

    @NonNull
    public static final Parcelable.Creator<Status> CREATOR = new o(3);

    public Status(int i5, String str, PendingIntent pendingIntent, ConnectionResult connectionResult) {
        this.f4466a = i5;
        this.f4467b = str;
        this.f4468c = pendingIntent;
        this.f4469d = connectionResult;
    }

    public final boolean c() {
        return this.f4466a <= 0;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof Status)) {
            return false;
        }
        Status status = (Status) obj;
        return this.f4466a == status.f4466a && v.k(this.f4467b, status.f4467b) && v.k(this.f4468c, status.f4468c) && v.k(this.f4469d, status.f4469d);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f4466a), this.f4467b, this.f4468c, this.f4469d});
    }

    public final String toString() {
        a aVar = new a(this);
        String str = this.f4467b;
        if (str == null) {
            int i5 = this.f4466a;
            switch (i5) {
                case -1:
                    str = "SUCCESS_CACHE";
                    break;
                case 0:
                    str = "SUCCESS";
                    break;
                case 1:
                case 9:
                case 11:
                case 12:
                default:
                    str = k.o(new StringBuilder(String.valueOf(i5).length() + 21), "unknown status code: ", i5);
                    break;
                case 2:
                    str = "SERVICE_VERSION_UPDATE_REQUIRED";
                    break;
                case 3:
                    str = "SERVICE_DISABLED";
                    break;
                case 4:
                    str = "SIGN_IN_REQUIRED";
                    break;
                case 5:
                    str = "INVALID_ACCOUNT";
                    break;
                case 6:
                    str = "RESOLUTION_REQUIRED";
                    break;
                case 7:
                    str = "NETWORK_ERROR";
                    break;
                case 8:
                    str = "INTERNAL_ERROR";
                    break;
                case 10:
                    str = "DEVELOPER_ERROR";
                    break;
                case 13:
                    str = "ERROR";
                    break;
                case 14:
                    str = "INTERRUPTED";
                    break;
                case 15:
                    str = "TIMEOUT";
                    break;
                case 16:
                    str = "CANCELED";
                    break;
                case 17:
                    str = "API_NOT_CONNECTED";
                    break;
                case 18:
                    str = "DEAD_CLIENT";
                    break;
                case 19:
                    str = "REMOTE_EXCEPTION";
                    break;
                case 20:
                    str = "CONNECTION_SUSPENDED_DURING_CALL";
                    break;
                case 21:
                    str = "RECONNECTION_TIMED_OUT_DURING_UPDATE";
                    break;
                case g.DEBUGMODULES_FIELD_NUMBER /* 22 */:
                    str = "RECONNECTION_TIMED_OUT";
                    break;
            }
        }
        aVar.i(str, "statusCode");
        aVar.i(this.f4468c, "resolution");
        return aVar.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i5) {
        int V = b.V(parcel, 20293);
        b.U(parcel, 1, 4);
        parcel.writeInt(this.f4466a);
        b.O(parcel, 2, this.f4467b, false);
        b.N(parcel, 3, this.f4468c, i5, false);
        b.N(parcel, 4, this.f4469d, i5, false);
        b.W(parcel, V);
    }

    @Override // d6.l
    public final Status getStatus() {
        return this;
    }
}
