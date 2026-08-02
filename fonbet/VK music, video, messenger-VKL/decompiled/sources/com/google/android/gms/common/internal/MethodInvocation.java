package com.google.android.gms.common.internal;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import xsna.ozg0;
import xsna.tpz0;

/* compiled from: com.google.android.gms:play-services-base@@18.10.0 */
/* loaded from: classes.dex */
public class MethodInvocation extends AbstractSafeParcelable {

    @NonNull
    public static final Parcelable.Creator<MethodInvocation> CREATOR = new tpz0();
    public final int b;
    public final int c;
    public final int d;
    public final long e;
    public final long f;

    @Nullable
    public final String g;

    @Nullable
    public final String h;
    public final int i;
    public final int j;

    @Deprecated
    public MethodInvocation(int i, int i2, int i3, long j, long j2, @Nullable String str, @Nullable String str2, int i4) {
        this(i, i2, i3, j, j2, str, str2, i4, -1);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NonNull Parcel parcel, int i) {
        int w = ozg0.w(20293, parcel);
        ozg0.v(parcel, 1, 4);
        parcel.writeInt(this.b);
        ozg0.v(parcel, 2, 4);
        parcel.writeInt(this.c);
        ozg0.v(parcel, 3, 4);
        parcel.writeInt(this.d);
        ozg0.v(parcel, 4, 8);
        parcel.writeLong(this.e);
        ozg0.v(parcel, 5, 8);
        parcel.writeLong(this.f);
        ozg0.q(parcel, 6, this.g, false);
        ozg0.q(parcel, 7, this.h, false);
        ozg0.v(parcel, 8, 4);
        parcel.writeInt(this.i);
        ozg0.v(parcel, 9, 4);
        parcel.writeInt(this.j);
        ozg0.x(w, parcel);
    }

    public MethodInvocation(int i, int i2, int i3, long j, long j2, @Nullable String str, @Nullable String str2, int i4, int i5) {
        this.b = i;
        this.c = i2;
        this.d = i3;
        this.e = j;
        this.f = j2;
        this.g = str;
        this.h = str2;
        this.i = i4;
        this.j = i5;
    }
}
