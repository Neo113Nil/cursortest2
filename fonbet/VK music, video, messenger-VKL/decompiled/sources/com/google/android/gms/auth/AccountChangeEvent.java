package com.google.android.gms.auth;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.huawei.hms.framework.network.grs.GrsBaseInfo;
import java.util.Arrays;
import ru.ok.android.webrtc.signaling.api.SignalingProtocol;
import xsna.dq70;
import xsna.exc0;
import xsna.ozg0;
import xsna.vtz0;
import xsna.xe9;

/* compiled from: com.google.android.gms:play-services-auth-base@@18.0.10 */
/* loaded from: classes12.dex */
public class AccountChangeEvent extends AbstractSafeParcelable {

    @NonNull
    public static final Parcelable.Creator<AccountChangeEvent> CREATOR = new vtz0();
    public final int b;
    public final long c;
    public final String d;
    public final int e;
    public final int f;
    public final String g;

    public AccountChangeEvent(int i, int i2, int i3, long j, String str, String str2) {
        this.b = i;
        this.c = j;
        exc0.i(str);
        this.d = str;
        this.e = i2;
        this.f = i3;
        this.g = str2;
    }

    public final boolean equals(@Nullable Object obj) {
        if (!(obj instanceof AccountChangeEvent)) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        AccountChangeEvent accountChangeEvent = (AccountChangeEvent) obj;
        return this.b == accountChangeEvent.b && this.c == accountChangeEvent.c && dq70.b(this.d, accountChangeEvent.d) && this.e == accountChangeEvent.e && this.f == accountChangeEvent.f && dq70.b(this.g, accountChangeEvent.g);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.b), Long.valueOf(this.c), this.d, Integer.valueOf(this.e), Integer.valueOf(this.f), this.g});
    }

    @NonNull
    public final String toString() {
        int i = this.e;
        StringBuilder a = xe9.a("AccountChangeEvent {accountName = ", this.d, ", changeType = ", i != 1 ? i != 2 ? i != 3 ? i != 4 ? GrsBaseInfo.CountryCodeSource.UNKNOWN : "RENAMED_TO" : "RENAMED_FROM" : SignalingProtocol.HUNGUP_REASON_REMOVED : "ADDED", ", changeData = ");
        a.append(this.g);
        a.append(", eventIndex = ");
        a.append(this.f);
        a.append("}");
        return a.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NonNull Parcel parcel, int i) {
        int w = ozg0.w(20293, parcel);
        ozg0.v(parcel, 1, 4);
        parcel.writeInt(this.b);
        ozg0.v(parcel, 2, 8);
        parcel.writeLong(this.c);
        ozg0.q(parcel, 3, this.d, false);
        ozg0.v(parcel, 4, 4);
        parcel.writeInt(this.e);
        ozg0.v(parcel, 5, 4);
        parcel.writeInt(this.f);
        ozg0.q(parcel, 6, this.g, false);
        ozg0.x(w, parcel);
    }
}
