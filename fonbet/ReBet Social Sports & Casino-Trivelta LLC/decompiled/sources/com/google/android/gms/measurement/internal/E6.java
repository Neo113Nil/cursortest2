package com.google.android.gms.measurement.internal;

import com.google.android.gms.internal.measurement.zzis;
import java.util.Collections;
import java.util.Map;

/* loaded from: classes2.dex */
public final class E6 {

    /* renamed from: a, reason: collision with root package name */
    public final String f33389a;

    /* renamed from: b, reason: collision with root package name */
    public final Map f33390b;

    /* renamed from: c, reason: collision with root package name */
    public final EnumC3252f5 f33391c;

    /* renamed from: d, reason: collision with root package name */
    public final zzis f33392d;

    public E6(String str, Map map, EnumC3252f5 enumC3252f5, zzis zzisVar) {
        this.f33389a = str;
        this.f33390b = map;
        this.f33391c = enumC3252f5;
        this.f33392d = zzisVar;
    }

    public final String a() {
        return this.f33389a;
    }

    public final Map b() {
        Map map = this.f33390b;
        return map == null ? Collections.EMPTY_MAP : map;
    }

    public final EnumC3252f5 c() {
        return this.f33391c;
    }

    public final zzis d() {
        return this.f33392d;
    }
}
