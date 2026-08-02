package com.google.android.gms.measurement.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes2.dex */
public final class zzoo extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzoo> CREATOR = new B6();

    /* renamed from: a, reason: collision with root package name */
    public final List f34448a;

    public zzoo(List list) {
        this.f34448a = list;
    }

    public static zzoo g(EnumC3252f5... enumC3252f5Arr) {
        ArrayList arrayList = new ArrayList(1);
        arrayList.add(Integer.valueOf(enumC3252f5Arr[0].zza()));
        return new zzoo(arrayList);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        List list = this.f34448a;
        int a10 = E9.b.a(parcel);
        E9.b.w(parcel, 1, list, false);
        E9.b.b(parcel, a10);
    }
}
