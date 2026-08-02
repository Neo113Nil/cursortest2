package com.google.android.gms.fido.fido2.api.common;

import R9.t;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import com.google.android.gms.common.internal.AbstractC3189m;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.HashSet;
import java.util.List;

/* loaded from: classes2.dex */
public class UvmEntries extends AbstractSafeParcelable {

    @NonNull
    public static final Parcelable.Creator<UvmEntries> CREATOR = new t();

    /* renamed from: a, reason: collision with root package name */
    public final List f32969a;

    public UvmEntries(List list) {
        this.f32969a = list;
    }

    public boolean equals(Object obj) {
        List list;
        if (!(obj instanceof UvmEntries)) {
            return false;
        }
        UvmEntries uvmEntries = (UvmEntries) obj;
        List list2 = this.f32969a;
        if (list2 == null && uvmEntries.f32969a == null) {
            return true;
        }
        return list2 != null && (list = uvmEntries.f32969a) != null && list2.containsAll(list) && uvmEntries.f32969a.containsAll(this.f32969a);
    }

    public List g() {
        return this.f32969a;
    }

    public int hashCode() {
        return AbstractC3189m.c(new HashSet(this.f32969a));
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        int a10 = E9.b.a(parcel);
        E9.b.J(parcel, 1, g(), false);
        E9.b.b(parcel, a10);
    }
}
