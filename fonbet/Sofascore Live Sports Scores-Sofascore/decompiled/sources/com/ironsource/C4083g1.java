package com.ironsource;

import defpackage.tub;
import java.util.Calendar;
import java.util.Map;
import kotlin.Pair;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* renamed from: com.ironsource.g1, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C4083g1 {

    @NotNull
    private final EnumC4186lf a;

    @NotNull
    private final P7 b;

    @NotNull
    private final String c;
    private final long d;

    public C4083g1(@NotNull EnumC4186lf enumC4186lf, @NotNull P7 p7, @NotNull String str) {
        enumC4186lf.getClass();
        p7.getClass();
        str.getClass();
        this.a = enumC4186lf;
        this.b = p7;
        this.c = str;
        this.d = Calendar.getInstance().getTimeInMillis() / 1000;
    }

    @NotNull
    public final String a() {
        return this.c;
    }

    @NotNull
    public final P7 b() {
        return this.b;
    }

    @NotNull
    public final Map<String, Object> c() {
        return tub.h(new Pair(C4324ta.c, Integer.valueOf(this.b.b())), new Pair("ts", String.valueOf(this.d)));
    }

    @NotNull
    public final Map<String, Object> d() {
        return tub.h(new Pair(C4324ta.b, this.c), new Pair(C4324ta.c, Integer.valueOf(this.b.b())), new Pair("ts", String.valueOf(this.d)), new Pair("rt", Integer.valueOf(this.a.ordinal())));
    }

    @NotNull
    public final EnumC4186lf e() {
        return this.a;
    }

    public final long f() {
        return this.d;
    }
}
