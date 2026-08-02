package com.ironsource;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public class N0 {
    public static final int e = -1;
    private final a a;
    private final long b;
    private final long c;
    private final long d;

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    public enum a {
        MANUAL,
        MANUAL_WITH_AUTOMATIC_RELOAD,
        AUTOMATIC_LOAD_AFTER_CLOSE,
        AUTOMATIC_LOAD_WHILE_SHOW
    }

    public N0(a aVar, long j, long j2, long j3) {
        this.a = aVar;
        this.b = j;
        this.c = j2;
        this.d = j3;
    }

    public a a() {
        return this.a;
    }

    public long b() {
        return this.d;
    }

    public long c() {
        return this.c;
    }

    public long d() {
        return this.b;
    }

    public boolean e() {
        a aVar = this.a;
        return aVar == a.AUTOMATIC_LOAD_AFTER_CLOSE || aVar == a.AUTOMATIC_LOAD_WHILE_SHOW;
    }

    public boolean f() {
        a aVar = this.a;
        return aVar == a.MANUAL || aVar == a.MANUAL_WITH_AUTOMATIC_RELOAD;
    }
}
