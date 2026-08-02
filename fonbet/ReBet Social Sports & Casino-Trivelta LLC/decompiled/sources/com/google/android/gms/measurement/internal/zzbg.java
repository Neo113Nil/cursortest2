package com.google.android.gms.measurement.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.AbstractC3191o;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

/* loaded from: classes2.dex */
public final class zzbg extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzbg> CREATOR = new E();

    /* renamed from: a, reason: collision with root package name */
    public final String f34435a;

    /* renamed from: b, reason: collision with root package name */
    public final zzbe f34436b;

    /* renamed from: c, reason: collision with root package name */
    public final String f34437c;

    /* renamed from: d, reason: collision with root package name */
    public final long f34438d;

    public zzbg(zzbg zzbgVar, long j10) {
        AbstractC3191o.m(zzbgVar);
        this.f34435a = zzbgVar.f34435a;
        this.f34436b = zzbgVar.f34436b;
        this.f34437c = zzbgVar.f34437c;
        this.f34438d = j10;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.f34436b);
        String str = this.f34437c;
        int length = String.valueOf(str).length();
        String str2 = this.f34435a;
        StringBuilder sb2 = new StringBuilder(length + 13 + String.valueOf(str2).length() + 8 + valueOf.length());
        sb2.append("origin=");
        sb2.append(str);
        sb2.append(",name=");
        sb2.append(str2);
        sb2.append(",params=");
        sb2.append(valueOf);
        return sb2.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        E.a(this, parcel, i10);
    }

    public zzbg(String str, zzbe zzbeVar, String str2, long j10) {
        this.f34435a = str;
        this.f34436b = zzbeVar;
        this.f34437c = str2;
        this.f34438d = j10;
    }
}
