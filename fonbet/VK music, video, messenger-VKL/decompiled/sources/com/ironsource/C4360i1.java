package com.ironsource;

import java.util.Calendar;
import java.util.Map;
import kotlin.Pair;
import xsna.pn00;

/* renamed from: com.ironsource.i1, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C4360i1 {
    private final EnumC4463nf a;
    private final S7 b;
    private final String c;
    private final long d = Calendar.getInstance().getTimeInMillis() / 1000;

    public C4360i1(EnumC4463nf enumC4463nf, S7 s7, String str) {
        this.a = enumC4463nf;
        this.b = s7;
        this.c = str;
    }

    public final String a() {
        return this.c;
    }

    public final S7 b() {
        return this.b;
    }

    public final Map<String, Object> c() {
        return pn00.k(new Pair(C4583ua.c, Integer.valueOf(this.b.b())), new Pair("ts", String.valueOf(this.d)));
    }

    public final Map<String, Object> d() {
        return pn00.k(new Pair(C4583ua.b, this.c), new Pair(C4583ua.c, Integer.valueOf(this.b.b())), new Pair("ts", String.valueOf(this.d)), new Pair("rt", Integer.valueOf(this.a.ordinal())));
    }

    public final EnumC4463nf e() {
        return this.a;
    }

    public final long f() {
        return this.d;
    }
}
