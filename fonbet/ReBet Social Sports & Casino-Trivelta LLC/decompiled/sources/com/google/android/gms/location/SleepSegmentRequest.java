package com.google.android.gms.location;

import E9.b;
import V9.u;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import com.google.android.gms.common.internal.AbstractC3189m;
import com.google.android.gms.common.internal.AbstractC3191o;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.List;

/* loaded from: classes2.dex */
public class SleepSegmentRequest extends AbstractSafeParcelable {

    @NonNull
    public static final Parcelable.Creator<SleepSegmentRequest> CREATOR = new u();

    /* renamed from: a, reason: collision with root package name */
    public final List f33146a;

    /* renamed from: b, reason: collision with root package name */
    public final int f33147b;

    public SleepSegmentRequest(List list, int i10) {
        this.f33146a = list;
        this.f33147b = i10;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SleepSegmentRequest)) {
            return false;
        }
        SleepSegmentRequest sleepSegmentRequest = (SleepSegmentRequest) obj;
        return AbstractC3189m.b(this.f33146a, sleepSegmentRequest.f33146a) && this.f33147b == sleepSegmentRequest.f33147b;
    }

    public int g() {
        return this.f33147b;
    }

    public int hashCode() {
        return AbstractC3189m.c(this.f33146a, Integer.valueOf(this.f33147b));
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        AbstractC3191o.m(parcel);
        int a10 = b.a(parcel);
        b.J(parcel, 1, this.f33146a, false);
        b.u(parcel, 2, g());
        b.b(parcel, a10);
    }
}
