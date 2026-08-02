package com.ironsource;

/* renamed from: com.ironsource.va, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public abstract class AbstractC4601va {
    private final C4484p0 a;
    private String b = "";
    private boolean c;

    public AbstractC4601va(C4484p0 c4484p0) {
        this.a = c4484p0;
    }

    public final C4484p0 a() {
        return this.a;
    }

    public final String b() {
        return this.b;
    }

    public final boolean c() {
        return this.c;
    }

    public abstract boolean d();

    public final void a(String str) {
        this.b = str;
    }

    public final void b(Runnable runnable) {
        this.a.d(runnable);
    }

    public final void a(boolean z) {
        this.c = z;
    }

    public final void a(Runnable runnable) {
        this.a.c(runnable);
    }

    public final void a(C4341h0 c4341h0) {
        this.a.d().a(new D0(this.a, c4341h0, null, 4, null));
    }
}
