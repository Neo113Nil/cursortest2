package com.google.android.gms.auth;

import E9.b;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import com.google.android.gms.common.internal.AbstractC3189m;
import com.google.android.gms.common.internal.AbstractC3191o;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import v9.C6669d;

/* loaded from: classes2.dex */
public class AccountChangeEvent extends AbstractSafeParcelable {

    @NonNull
    public static final Parcelable.Creator<AccountChangeEvent> CREATOR = new C6669d();

    /* renamed from: a, reason: collision with root package name */
    public final int f32000a;

    /* renamed from: b, reason: collision with root package name */
    public final long f32001b;

    /* renamed from: c, reason: collision with root package name */
    public final String f32002c;

    /* renamed from: d, reason: collision with root package name */
    public final int f32003d;

    /* renamed from: e, reason: collision with root package name */
    public final int f32004e;

    /* renamed from: f, reason: collision with root package name */
    public final String f32005f;

    public AccountChangeEvent(int i10, long j10, String str, int i11, int i12, String str2) {
        this.f32000a = i10;
        this.f32001b = j10;
        this.f32002c = (String) AbstractC3191o.m(str);
        this.f32003d = i11;
        this.f32004e = i12;
        this.f32005f = str2;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof AccountChangeEvent)) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        AccountChangeEvent accountChangeEvent = (AccountChangeEvent) obj;
        return this.f32000a == accountChangeEvent.f32000a && this.f32001b == accountChangeEvent.f32001b && AbstractC3189m.b(this.f32002c, accountChangeEvent.f32002c) && this.f32003d == accountChangeEvent.f32003d && this.f32004e == accountChangeEvent.f32004e && AbstractC3189m.b(this.f32005f, accountChangeEvent.f32005f);
    }

    public int hashCode() {
        return AbstractC3189m.c(Integer.valueOf(this.f32000a), Long.valueOf(this.f32001b), this.f32002c, Integer.valueOf(this.f32003d), Integer.valueOf(this.f32004e), this.f32005f);
    }

    public String toString() {
        int i10 = this.f32003d;
        String str = i10 != 1 ? i10 != 2 ? i10 != 3 ? i10 != 4 ? "UNKNOWN" : "RENAMED_TO" : "RENAMED_FROM" : "REMOVED" : "ADDED";
        return "AccountChangeEvent {accountName = " + this.f32002c + ", changeType = " + str + ", changeData = " + this.f32005f + ", eventIndex = " + this.f32004e + "}";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        int a10 = b.a(parcel);
        b.u(parcel, 1, this.f32000a);
        b.y(parcel, 2, this.f32001b);
        b.F(parcel, 3, this.f32002c, false);
        b.u(parcel, 4, this.f32003d);
        b.u(parcel, 5, this.f32004e);
        b.F(parcel, 6, this.f32005f, false);
        b.b(parcel, a10);
    }
}
