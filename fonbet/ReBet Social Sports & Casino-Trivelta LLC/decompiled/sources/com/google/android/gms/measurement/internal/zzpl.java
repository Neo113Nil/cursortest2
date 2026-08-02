package com.google.android.gms.measurement.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.AbstractC3191o;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

/* loaded from: classes2.dex */
public final class zzpl extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzpl> CREATOR = new Y6();

    /* renamed from: a, reason: collision with root package name */
    public final int f34450a;

    /* renamed from: b, reason: collision with root package name */
    public final String f34451b;

    /* renamed from: c, reason: collision with root package name */
    public final long f34452c;

    /* renamed from: d, reason: collision with root package name */
    public final Long f34453d;

    /* renamed from: e, reason: collision with root package name */
    public final String f34454e;

    /* renamed from: f, reason: collision with root package name */
    public final String f34455f;

    /* renamed from: g, reason: collision with root package name */
    public final Double f34456g;

    public zzpl(int i10, String str, long j10, Long l10, Float f10, String str2, String str3, Double d10) {
        this.f34450a = i10;
        this.f34451b = str;
        this.f34452c = j10;
        this.f34453d = l10;
        this.f34456g = i10 == 1 ? f10 != null ? Double.valueOf(f10.doubleValue()) : null : d10;
        this.f34454e = str2;
        this.f34455f = str3;
    }

    public final Object g() {
        Long l10 = this.f34453d;
        if (l10 != null) {
            return l10;
        }
        Double d10 = this.f34456g;
        if (d10 != null) {
            return d10;
        }
        String str = this.f34454e;
        if (str != null) {
            return str;
        }
        return null;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        Y6.a(this, parcel, i10);
    }

    public zzpl(Z6 z62) {
        this(z62.f33792c, z62.f33793d, z62.f33794e, z62.f33791b);
    }

    public zzpl(String str, long j10, Object obj, String str2) {
        AbstractC3191o.g(str);
        this.f34450a = 2;
        this.f34451b = str;
        this.f34452c = j10;
        this.f34455f = str2;
        if (obj == null) {
            this.f34453d = null;
            this.f34456g = null;
            this.f34454e = null;
            return;
        }
        if (obj instanceof Long) {
            this.f34453d = (Long) obj;
            this.f34456g = null;
            this.f34454e = null;
        } else if (obj instanceof String) {
            this.f34453d = null;
            this.f34456g = null;
            this.f34454e = (String) obj;
        } else {
            if (obj instanceof Double) {
                this.f34453d = null;
                this.f34456g = (Double) obj;
                this.f34454e = null;
                return;
            }
            throw new IllegalArgumentException("User attribute given of un-supported type");
        }
    }
}
