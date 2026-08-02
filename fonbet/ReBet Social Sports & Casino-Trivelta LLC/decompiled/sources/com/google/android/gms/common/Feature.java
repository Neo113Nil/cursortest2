package com.google.android.gms.common;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import com.google.android.gms.common.internal.AbstractC3189m;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

/* loaded from: classes2.dex */
public class Feature extends AbstractSafeParcelable {

    @NonNull
    public static final Parcelable.Creator<Feature> CREATOR = new r();

    /* renamed from: a, reason: collision with root package name */
    public final String f32233a;

    /* renamed from: b, reason: collision with root package name */
    public final int f32234b;

    /* renamed from: c, reason: collision with root package name */
    public final long f32235c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f32236d;

    public Feature(String str, int i10, long j10, boolean z10) {
        this.f32233a = str;
        this.f32234b = i10;
        this.f32235c = j10;
        this.f32236d = z10;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof Feature) {
            Feature feature = (Feature) obj;
            if (AbstractC3189m.b(h(), feature.h()) && i() == feature.i() && g() == feature.g()) {
                return true;
            }
        }
        return false;
    }

    public boolean g() {
        return this.f32236d;
    }

    public String h() {
        return this.f32233a;
    }

    public final int hashCode() {
        return AbstractC3189m.c(h(), Long.valueOf(i()), Boolean.valueOf(g()));
    }

    public long i() {
        long j10 = this.f32235c;
        return j10 == -1 ? this.f32234b : j10;
    }

    public final String toString() {
        AbstractC3189m.a d10 = AbstractC3189m.d(this);
        d10.a("name", h());
        d10.a("version", Long.valueOf(i()));
        d10.a("is_fully_rolled_out", Boolean.valueOf(g()));
        return d10.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int a10 = E9.b.a(parcel);
        E9.b.F(parcel, 1, h(), false);
        E9.b.u(parcel, 2, this.f32234b);
        E9.b.y(parcel, 3, i());
        E9.b.g(parcel, 4, g());
        E9.b.b(parcel, a10);
    }

    public Feature(String str, long j10) {
        this(str, -1, j10, false);
    }

    public Feature(String str, long j10, boolean z10) {
        this(str, -1, j10, z10);
    }
}
