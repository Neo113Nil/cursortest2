package com.google.android.gms.signin.internal;

import E9.b;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.l;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import da.g;
import java.util.List;

/* loaded from: classes2.dex */
public final class zag extends AbstractSafeParcelable implements l {
    public static final Parcelable.Creator<zag> CREATOR = new g();

    /* renamed from: a, reason: collision with root package name */
    public final List f34491a;

    /* renamed from: b, reason: collision with root package name */
    public final String f34492b;

    public zag(List list, String str) {
        this.f34491a = list;
        this.f34492b = str;
    }

    @Override // com.google.android.gms.common.api.l
    public final Status getStatus() {
        return this.f34492b != null ? Status.f32275f : Status.f32279j;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        List list = this.f34491a;
        int a10 = b.a(parcel);
        b.H(parcel, 1, list, false);
        b.F(parcel, 2, this.f34492b, false);
        b.b(parcel, a10);
    }
}
