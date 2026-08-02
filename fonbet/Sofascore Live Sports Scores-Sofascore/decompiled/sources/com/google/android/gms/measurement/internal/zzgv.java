package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import defpackage.bf3;
import defpackage.mz1;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzgv {
    public final String a;
    public final String b;
    public final long c;
    public final long d;
    public final Bundle e;

    public zzgv(long j, long j2, Bundle bundle, String str, String str2) {
        this.a = str;
        this.b = str2;
        this.e = bundle;
        this.c = j;
        this.d = j2;
    }

    public static zzgv a(zzbh zzbhVar) {
        String str = zzbhVar.a;
        String str2 = zzbhVar.c;
        return new zzgv(zzbhVar.d, zzbhVar.e, zzbhVar.b.b1(), str, str2);
    }

    public final zzbh b() {
        zzbf zzbfVar = new zzbf(new Bundle(this.e));
        return new zzbh(this.a, zzbfVar, this.b, this.c, this.d);
    }

    public final String toString() {
        String obj = this.e.toString();
        String str = this.b;
        int length = String.valueOf(str).length();
        String str2 = this.a;
        StringBuilder sb = new StringBuilder(length + 13 + String.valueOf(str2).length() + 8 + obj.length());
        bf3.v(sb, "origin=", str, ",name=", str2);
        return mz1.o(sb, ",params=", obj);
    }
}
