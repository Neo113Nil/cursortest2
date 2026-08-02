package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import com.google.android.gms.internal.measurement.zzib;
import java.util.Map;

/* loaded from: classes2.dex */
public final class V6 {

    /* renamed from: a, reason: collision with root package name */
    public final long f33706a;

    /* renamed from: b, reason: collision with root package name */
    public final zzib f33707b;

    /* renamed from: c, reason: collision with root package name */
    public final String f33708c;

    /* renamed from: d, reason: collision with root package name */
    public final Map f33709d;

    /* renamed from: e, reason: collision with root package name */
    public final EnumC3252f5 f33710e;

    /* renamed from: f, reason: collision with root package name */
    public final long f33711f;

    /* renamed from: g, reason: collision with root package name */
    public final long f33712g;

    /* renamed from: h, reason: collision with root package name */
    public final long f33713h;

    /* renamed from: i, reason: collision with root package name */
    public final int f33714i;

    public /* synthetic */ V6(long j10, zzib zzibVar, String str, Map map, EnumC3252f5 enumC3252f5, long j11, long j12, long j13, int i10, byte[] bArr) {
        this.f33706a = j10;
        this.f33707b = zzibVar;
        this.f33708c = str;
        this.f33709d = map;
        this.f33710e = enumC3252f5;
        this.f33711f = j11;
        this.f33712g = j12;
        this.f33713h = j13;
        this.f33714i = i10;
    }

    public final E6 a() {
        return new E6(this.f33708c, this.f33709d, this.f33710e, null);
    }

    public final zzom b() {
        Bundle bundle = new Bundle();
        for (Map.Entry entry : this.f33709d.entrySet()) {
            bundle.putString((String) entry.getKey(), (String) entry.getValue());
        }
        long j10 = this.f33706a;
        zzib zzibVar = this.f33707b;
        String str = this.f33708c;
        EnumC3252f5 enumC3252f5 = this.f33710e;
        return new zzom(j10, zzibVar.zzcc(), str, bundle, enumC3252f5.zza(), this.f33712g, "");
    }

    public final long c() {
        return this.f33706a;
    }

    public final zzib d() {
        return this.f33707b;
    }

    public final String e() {
        return this.f33708c;
    }

    public final EnumC3252f5 f() {
        return this.f33710e;
    }

    public final long g() {
        return this.f33711f;
    }

    public final long h() {
        return this.f33713h;
    }

    public final int i() {
        return this.f33714i;
    }
}
