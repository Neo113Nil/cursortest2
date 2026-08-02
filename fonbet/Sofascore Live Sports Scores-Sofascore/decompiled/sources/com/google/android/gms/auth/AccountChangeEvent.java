package com.google.android.gms.auth;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import defpackage.mz1;
import java.util.Arrays;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@SafeParcelable.Class
/* loaded from: classes3.dex */
public class AccountChangeEvent extends AbstractSafeParcelable {

    @NonNull
    public static final Parcelable.Creator<AccountChangeEvent> CREATOR = new zza();
    public final int a;
    public final long b;
    public final String c;
    public final int d;
    public final int e;
    public final String f;

    public AccountChangeEvent(int i, int i2, String str, int i3, String str2, long j) {
        this.a = i;
        this.b = j;
        Preconditions.i(str);
        this.c = str;
        this.d = i2;
        this.e = i3;
        this.f = str2;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof AccountChangeEvent)) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        AccountChangeEvent accountChangeEvent = (AccountChangeEvent) obj;
        return this.a == accountChangeEvent.a && this.b == accountChangeEvent.b && Objects.a(this.c, accountChangeEvent.c) && this.d == accountChangeEvent.d && this.e == accountChangeEvent.e && Objects.a(this.f, accountChangeEvent.f);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.a), Long.valueOf(this.b), this.c, Integer.valueOf(this.d), Integer.valueOf(this.e), this.f});
    }

    public final String toString() {
        int i = this.d;
        StringBuilder s = mz1.s("AccountChangeEvent {accountName = ", this.c, ", changeType = ", i != 1 ? i != 2 ? i != 3 ? i != 4 ? "UNKNOWN" : "RENAMED_TO" : "RENAMED_FROM" : "REMOVED" : "ADDED", ", changeData = ");
        s.append(this.f);
        s.append(", eventIndex = ");
        s.append(this.e);
        s.append("}");
        return s.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int s = SafeParcelWriter.s(parcel, 20293);
        SafeParcelWriter.r(parcel, 1, 4);
        parcel.writeInt(this.a);
        SafeParcelWriter.r(parcel, 2, 8);
        parcel.writeLong(this.b);
        SafeParcelWriter.m(parcel, 3, this.c, false);
        SafeParcelWriter.r(parcel, 4, 4);
        parcel.writeInt(this.d);
        SafeParcelWriter.r(parcel, 5, 4);
        parcel.writeInt(this.e);
        SafeParcelWriter.m(parcel, 6, this.f, false);
        SafeParcelWriter.t(parcel, s);
    }
}
