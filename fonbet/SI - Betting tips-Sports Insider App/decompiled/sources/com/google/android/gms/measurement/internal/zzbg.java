package com.google.android.gms.measurement.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import d9.e;
import g6.v;
import q5.b;
import r4.k;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class zzbg extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzbg> CREATOR = new b(10);

    /* renamed from: a, reason: collision with root package name */
    public final String f5797a;

    /* renamed from: b, reason: collision with root package name */
    public final zzbe f5798b;

    /* renamed from: c, reason: collision with root package name */
    public final String f5799c;

    /* renamed from: d, reason: collision with root package name */
    public final long f5800d;

    public zzbg(zzbg zzbgVar, long j) {
        v.h(zzbgVar);
        this.f5797a = zzbgVar.f5797a;
        this.f5798b = zzbgVar.f5798b;
        this.f5799c = zzbgVar.f5799c;
        this.f5800d = j;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.f5798b);
        String str = this.f5799c;
        int length = String.valueOf(str).length();
        String str2 = this.f5797a;
        StringBuilder sb2 = new StringBuilder(length + 13 + String.valueOf(str2).length() + 8 + valueOf.length());
        k.s(sb2, "origin=", str, ",name=", str2);
        return e.l(sb2, ",params=", valueOf);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i5) {
        b.a(this, parcel, i5);
    }

    public zzbg(String str, zzbe zzbeVar, String str2, long j) {
        this.f5797a = str;
        this.f5798b = zzbeVar;
        this.f5799c = str2;
        this.f5800d = j;
    }
}
