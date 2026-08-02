package com.google.android.gms.wallet.wobs;

import E9.b;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import ha.j;

/* loaded from: classes2.dex */
public final class TimeInterval extends AbstractSafeParcelable {

    @NonNull
    public static final Parcelable.Creator<TimeInterval> CREATOR = new j();

    /* renamed from: a, reason: collision with root package name */
    public long f34662a;

    /* renamed from: b, reason: collision with root package name */
    public long f34663b;

    public TimeInterval(long j10, long j11) {
        this.f34662a = j10;
        this.f34663b = j11;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        int a10 = b.a(parcel);
        b.y(parcel, 2, this.f34662a);
        b.y(parcel, 3, this.f34663b);
        b.b(parcel, a10);
    }
}
