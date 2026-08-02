package com.google.android.gms.measurement.internal;

import android.os.Bundle;

/* renamed from: com.google.android.gms.measurement.internal.y2, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3400y2 {

    /* renamed from: a, reason: collision with root package name */
    public final String f34394a;

    /* renamed from: b, reason: collision with root package name */
    public final String f34395b;

    /* renamed from: c, reason: collision with root package name */
    public final long f34396c;

    /* renamed from: d, reason: collision with root package name */
    public final Bundle f34397d;

    public C3400y2(String str, String str2, Bundle bundle, long j10) {
        this.f34394a = str;
        this.f34395b = str2;
        this.f34397d = bundle;
        this.f34396c = j10;
    }

    public static C3400y2 a(zzbg zzbgVar) {
        return new C3400y2(zzbgVar.f34435a, zzbgVar.f34437c, zzbgVar.f34436b.l(), zzbgVar.f34438d);
    }

    public final zzbg b() {
        return new zzbg(this.f34394a, new zzbe(new Bundle(this.f34397d)), this.f34395b, this.f34396c);
    }

    public final String toString() {
        String str = this.f34395b;
        String obj = this.f34397d.toString();
        int length = String.valueOf(str).length();
        String str2 = this.f34394a;
        StringBuilder sb2 = new StringBuilder(length + 13 + String.valueOf(str2).length() + 8 + obj.length());
        sb2.append("origin=");
        sb2.append(str);
        sb2.append(",name=");
        sb2.append(str2);
        sb2.append(",params=");
        sb2.append(obj);
        return sb2.toString();
    }
}
