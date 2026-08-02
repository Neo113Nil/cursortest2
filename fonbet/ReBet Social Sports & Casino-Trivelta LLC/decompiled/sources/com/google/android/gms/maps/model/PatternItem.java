package com.google.android.gms.maps.model;

import Y9.q;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import com.google.android.gms.common.internal.AbstractC3189m;
import com.google.android.gms.common.internal.AbstractC3191o;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

/* loaded from: classes2.dex */
public class PatternItem extends AbstractSafeParcelable {

    @NonNull
    public static final Parcelable.Creator<PatternItem> CREATOR = new q();

    /* renamed from: a, reason: collision with root package name */
    public final int f33237a;

    /* renamed from: b, reason: collision with root package name */
    public final Float f33238b;

    public PatternItem(int i10, Float f10) {
        boolean z10 = true;
        if (i10 != 1 && (f10 == null || f10.floatValue() < 0.0f)) {
            z10 = false;
        }
        AbstractC3191o.b(z10, "Invalid PatternItem: type=" + i10 + " length=" + f10);
        this.f33237a = i10;
        this.f33238b = f10;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PatternItem)) {
            return false;
        }
        PatternItem patternItem = (PatternItem) obj;
        return this.f33237a == patternItem.f33237a && AbstractC3189m.b(this.f33238b, patternItem.f33238b);
    }

    public int hashCode() {
        return AbstractC3189m.c(Integer.valueOf(this.f33237a), this.f33238b);
    }

    public String toString() {
        return "[PatternItem: type=" + this.f33237a + " length=" + this.f33238b + "]";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        int i11 = this.f33237a;
        int a10 = E9.b.a(parcel);
        E9.b.u(parcel, 2, i11);
        E9.b.s(parcel, 3, this.f33238b, false);
        E9.b.b(parcel, a10);
    }
}
