package com.google.android.gms.auth;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import g6.v;
import java.util.Arrays;
import q5.b;
import r4.k;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public class AccountChangeEvent extends AbstractSafeParcelable {

    @NonNull
    public static final Parcelable.Creator<AccountChangeEvent> CREATOR = new b(2);

    /* renamed from: a, reason: collision with root package name */
    public final int f4245a;

    /* renamed from: b, reason: collision with root package name */
    public final long f4246b;

    /* renamed from: c, reason: collision with root package name */
    public final String f4247c;

    /* renamed from: d, reason: collision with root package name */
    public final int f4248d;

    /* renamed from: e, reason: collision with root package name */
    public final int f4249e;

    /* renamed from: f, reason: collision with root package name */
    public final String f4250f;

    public AccountChangeEvent(int i5, long j, String str, int i10, int i11, String str2) {
        this.f4245a = i5;
        this.f4246b = j;
        v.h(str);
        this.f4247c = str;
        this.f4248d = i10;
        this.f4249e = i11;
        this.f4250f = str2;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof AccountChangeEvent)) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        AccountChangeEvent accountChangeEvent = (AccountChangeEvent) obj;
        return this.f4245a == accountChangeEvent.f4245a && this.f4246b == accountChangeEvent.f4246b && v.k(this.f4247c, accountChangeEvent.f4247c) && this.f4248d == accountChangeEvent.f4248d && this.f4249e == accountChangeEvent.f4249e && v.k(this.f4250f, accountChangeEvent.f4250f);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f4245a), Long.valueOf(this.f4246b), this.f4247c, Integer.valueOf(this.f4248d), Integer.valueOf(this.f4249e), this.f4250f});
    }

    public final String toString() {
        int i5 = this.f4248d;
        StringBuilder q = k.q("AccountChangeEvent {accountName = ", this.f4247c, ", changeType = ", i5 != 1 ? i5 != 2 ? i5 != 3 ? i5 != 4 ? "UNKNOWN" : "RENAMED_TO" : "RENAMED_FROM" : "REMOVED" : "ADDED", ", changeData = ");
        q.append(this.f4250f);
        q.append(", eventIndex = ");
        q.append(this.f4249e);
        q.append("}");
        return q.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i5) {
        int V = h8.b.V(parcel, 20293);
        h8.b.U(parcel, 1, 4);
        parcel.writeInt(this.f4245a);
        h8.b.U(parcel, 2, 8);
        parcel.writeLong(this.f4246b);
        h8.b.O(parcel, 3, this.f4247c, false);
        h8.b.U(parcel, 4, 4);
        parcel.writeInt(this.f4248d);
        h8.b.U(parcel, 5, 4);
        parcel.writeInt(this.f4249e);
        h8.b.O(parcel, 6, this.f4250f, false);
        h8.b.W(parcel, V);
    }
}
