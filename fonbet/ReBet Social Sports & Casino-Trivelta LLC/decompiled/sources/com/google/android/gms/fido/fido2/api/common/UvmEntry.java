package com.google.android.gms.fido.fido2.api.common;

import R9.u;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import com.google.android.gms.common.internal.AbstractC3189m;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

/* loaded from: classes2.dex */
public class UvmEntry extends AbstractSafeParcelable {

    @NonNull
    public static final Parcelable.Creator<UvmEntry> CREATOR = new u();

    /* renamed from: a, reason: collision with root package name */
    public final int f32970a;

    /* renamed from: b, reason: collision with root package name */
    public final short f32971b;

    /* renamed from: c, reason: collision with root package name */
    public final short f32972c;

    public UvmEntry(int i10, short s10, short s11) {
        this.f32970a = i10;
        this.f32971b = s10;
        this.f32972c = s11;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof UvmEntry)) {
            return false;
        }
        UvmEntry uvmEntry = (UvmEntry) obj;
        return this.f32970a == uvmEntry.f32970a && this.f32971b == uvmEntry.f32971b && this.f32972c == uvmEntry.f32972c;
    }

    public short g() {
        return this.f32971b;
    }

    public short h() {
        return this.f32972c;
    }

    public int hashCode() {
        return AbstractC3189m.c(Integer.valueOf(this.f32970a), Short.valueOf(this.f32971b), Short.valueOf(this.f32972c));
    }

    public int i() {
        return this.f32970a;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        int a10 = E9.b.a(parcel);
        E9.b.u(parcel, 1, i());
        E9.b.E(parcel, 2, g());
        E9.b.E(parcel, 3, h());
        E9.b.b(parcel, a10);
    }
}
