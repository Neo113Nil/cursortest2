package com.mbridge.msdk.tracker.network;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public abstract class b0 extends Exception {
    public final q a;
    private long b;
    private int c;
    private String d;

    public b0() {
        this.c = 0;
        this.d = "";
        this.a = null;
    }

    public void a(long j) {
        this.b = j;
    }

    public abstract int d();

    public int g() {
        return this.c;
    }

    public void a(int i) {
        this.c = i;
    }

    public b0(q qVar) {
        this.c = 0;
        this.d = "";
        this.a = qVar;
    }

    public b0(String str) {
        super(str);
        this.c = 0;
        this.d = "";
        this.a = null;
    }

    public b0(Throwable th) {
        super(th);
        this.c = 0;
        this.d = "";
        this.a = null;
    }
}
