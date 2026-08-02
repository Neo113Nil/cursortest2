package com.google.android.gms.wallet;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

/* loaded from: classes2.dex */
public final class InstrumentInfo extends AbstractSafeParcelable {

    @NonNull
    public static final Parcelable.Creator<InstrumentInfo> CREATOR = new A();

    /* renamed from: a, reason: collision with root package name */
    public String f34528a;

    /* renamed from: b, reason: collision with root package name */
    public String f34529b;

    /* renamed from: c, reason: collision with root package name */
    public int f34530c;

    public InstrumentInfo(String str, String str2, int i10) {
        this.f34528a = str;
        this.f34529b = str2;
        this.f34530c = i10;
    }

    public int g() {
        int i10 = this.f34530c;
        if (i10 == 1 || i10 == 2 || i10 == 3) {
            return i10;
        }
        return 0;
    }

    public String h() {
        return this.f34529b;
    }

    public String i() {
        return this.f34528a;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        int a10 = E9.b.a(parcel);
        E9.b.F(parcel, 2, i(), false);
        E9.b.F(parcel, 3, h(), false);
        E9.b.u(parcel, 4, g());
        E9.b.b(parcel, a10);
    }
}
