package com.google.android.gms.measurement.internal;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Nullable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import xsna.exc0;
import xsna.tj01;
import xsna.uj01;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.2.0 */
/* loaded from: classes13.dex */
public final class zzkw extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzkw> CREATOR = new tj01();
    public final int b;
    public final String c;
    public final long d;

    @Nullable
    public final Long e;

    @Nullable
    public final String f;
    public final String g;

    @Nullable
    public final Double h;

    public zzkw(int i, String str, long j, @Nullable Long l, Float f, @Nullable String str2, String str3, @Nullable Double d) {
        this.b = i;
        this.c = str;
        this.d = j;
        this.e = l;
        if (i == 1) {
            this.h = f != null ? Double.valueOf(f.doubleValue()) : null;
        } else {
            this.h = d;
        }
        this.f = str2;
        this.g = str3;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        tj01.a(this, parcel);
    }

    @Nullable
    public final Object zza() {
        Long l = this.e;
        if (l != null) {
            return l;
        }
        Double d = this.h;
        if (d != null) {
            return d;
        }
        String str = this.f;
        if (str != null) {
            return str;
        }
        return null;
    }

    public zzkw(uj01 uj01Var) {
        this(uj01Var.d, uj01Var.e, uj01Var.c, uj01Var.b);
    }

    public zzkw(long j, @Nullable Object obj, String str, String str2) {
        exc0.f(str);
        this.b = 2;
        this.c = str;
        this.d = j;
        this.g = str2;
        if (obj == null) {
            this.e = null;
            this.h = null;
            this.f = null;
            return;
        }
        if (obj instanceof Long) {
            this.e = (Long) obj;
            this.h = null;
            this.f = null;
        } else if (obj instanceof String) {
            this.e = null;
            this.h = null;
            this.f = (String) obj;
        } else {
            if (obj instanceof Double) {
                this.e = null;
                this.h = (Double) obj;
                this.f = null;
                return;
            }
            throw new IllegalArgumentException("User attribute given of un-supported type");
        }
    }
}
