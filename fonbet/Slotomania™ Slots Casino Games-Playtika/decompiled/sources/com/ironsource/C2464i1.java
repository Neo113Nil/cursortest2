package com.ironsource;

import java.util.Calendar;
import java.util.Map;
import kotlin.TuplesKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.ironsource.i1, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C2464i1 {
    private final EnumC2567nf a;
    private final R7 b;
    private final String c;
    private final long d;

    public C2464i1(EnumC2567nf recordType, R7 adProvider, String adInstanceId) {
        Intrinsics.checkNotNullParameter(recordType, "recordType");
        Intrinsics.checkNotNullParameter(adProvider, "adProvider");
        Intrinsics.checkNotNullParameter(adInstanceId, "adInstanceId");
        this.a = recordType;
        this.b = adProvider;
        this.c = adInstanceId;
        this.d = Calendar.getInstance().getTimeInMillis() / 1000;
    }

    public final String a() {
        return this.c;
    }

    public final R7 b() {
        return this.b;
    }

    public final Map<String, Object> c() {
        return MapsKt.mapOf(TuplesKt.to(C2669ta.c, Integer.valueOf(this.b.b())), TuplesKt.to("ts", String.valueOf(this.d)));
    }

    public final Map<String, Object> d() {
        return MapsKt.mapOf(TuplesKt.to(C2669ta.b, this.c), TuplesKt.to(C2669ta.c, Integer.valueOf(this.b.b())), TuplesKt.to("ts", String.valueOf(this.d)), TuplesKt.to("rt", Integer.valueOf(this.a.ordinal())));
    }

    public final EnumC2567nf e() {
        return this.a;
    }

    public final long f() {
        return this.d;
    }
}
