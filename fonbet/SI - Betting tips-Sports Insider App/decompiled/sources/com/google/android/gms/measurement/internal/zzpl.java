package com.google.android.gms.measurement.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import g6.v;
import q5.b;
import s7.t3;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class zzpl extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzpl> CREATOR = new b(15);

    /* renamed from: a, reason: collision with root package name */
    public final int f5813a;

    /* renamed from: b, reason: collision with root package name */
    public final String f5814b;

    /* renamed from: c, reason: collision with root package name */
    public final long f5815c;

    /* renamed from: d, reason: collision with root package name */
    public final Long f5816d;

    /* renamed from: e, reason: collision with root package name */
    public final String f5817e;

    /* renamed from: f, reason: collision with root package name */
    public final String f5818f;

    /* renamed from: g, reason: collision with root package name */
    public final Double f5819g;

    public zzpl(int i5, String str, long j, Long l6, Float f6, String str2, String str3, Double d10) {
        this.f5813a = i5;
        this.f5814b = str;
        this.f5815c = j;
        this.f5816d = l6;
        this.f5819g = i5 == 1 ? f6 != null ? Double.valueOf(f6.doubleValue()) : null : d10;
        this.f5817e = str2;
        this.f5818f = str3;
    }

    public final Object c() {
        Long l6 = this.f5816d;
        if (l6 != null) {
            return l6;
        }
        Double d10 = this.f5819g;
        if (d10 != null) {
            return d10;
        }
        String str = this.f5817e;
        if (str != null) {
            return str;
        }
        return null;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i5) {
        b.b(this, parcel);
    }

    public zzpl(long j, Object obj, String str, String str2) {
        v.e(str);
        this.f5813a = 2;
        this.f5814b = str;
        this.f5815c = j;
        this.f5818f = str2;
        if (obj == null) {
            this.f5816d = null;
            this.f5819g = null;
            this.f5817e = null;
            return;
        }
        if (obj instanceof Long) {
            this.f5816d = (Long) obj;
            this.f5819g = null;
            this.f5817e = null;
        } else if (obj instanceof String) {
            this.f5816d = null;
            this.f5819g = null;
            this.f5817e = (String) obj;
        } else {
            if (obj instanceof Double) {
                this.f5816d = null;
                this.f5819g = (Double) obj;
                this.f5817e = null;
                return;
            }
            throw new IllegalArgumentException("User attribute given of un-supported type");
        }
    }

    public zzpl(t3 t3Var) {
        this(t3Var.f23097d, t3Var.f23098e, t3Var.f23096c, t3Var.f23095b);
    }
}
