package com.ironsource;

import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.ironsource.ua, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractC2687ua {
    private final C2588p0 a;
    private String b;
    private boolean c;

    public AbstractC2687ua(C2588p0 adTools) {
        Intrinsics.checkNotNullParameter(adTools, "adTools");
        this.a = adTools;
        this.b = "";
    }

    public final C2588p0 a() {
        return this.a;
    }

    public final String b() {
        return this.b;
    }

    protected final boolean c() {
        return this.c;
    }

    public abstract boolean d();

    public final void a(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.b = str;
    }

    public final void b(Runnable callback) {
        Intrinsics.checkNotNullParameter(callback, "callback");
        this.a.e(callback);
    }

    protected final void a(boolean z) {
        this.c = z;
    }

    public final void a(Runnable runnable) {
        Intrinsics.checkNotNullParameter(runnable, "runnable");
        this.a.d(runnable);
    }

    public final void a(C2445h0 adProperties) {
        Intrinsics.checkNotNullParameter(adProperties, "adProperties");
        this.a.e().a(new D0(this.a, adProperties, null, 4, null));
    }
}
