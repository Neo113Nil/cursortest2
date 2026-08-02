package com.ironsource;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* renamed from: com.ironsource.hg, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C4116hg {
    protected long a;
    protected long b;
    protected long c;

    public long a() {
        return Math.max(0L, this.a - System.currentTimeMillis());
    }

    public void b(long j) {
        this.c = j;
        this.a = (j - this.b) + this.a;
    }

    public void c(long j) {
        this.b = j;
        this.c = 0L;
    }

    public void b() {
        this.a = 0L;
        this.b = 0L;
        this.c = 0L;
    }

    public void a(long j) {
        this.a = System.currentTimeMillis() + j;
    }
}
