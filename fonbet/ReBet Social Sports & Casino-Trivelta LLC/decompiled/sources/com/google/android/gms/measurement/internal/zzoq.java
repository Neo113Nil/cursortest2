package com.google.android.gms.measurement.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.List;

/* loaded from: classes2.dex */
public final class zzoq extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzoq> CREATOR = new C6();

    /* renamed from: a, reason: collision with root package name */
    public final List f34449a;

    public zzoq(List list) {
        this.f34449a = list;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        List list = this.f34449a;
        int a10 = E9.b.a(parcel);
        E9.b.J(parcel, 1, list, false);
        E9.b.b(parcel, a10);
    }
}
