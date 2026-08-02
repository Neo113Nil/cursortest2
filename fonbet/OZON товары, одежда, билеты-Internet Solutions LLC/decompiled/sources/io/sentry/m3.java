package io.sentry;

import org.jetbrains.annotations.NotNull;

/* loaded from: classes10.dex */
public class m3 {

    /* renamed from: a, reason: collision with root package name */
    private T1 f68086a = null;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private EnumC7213v1 f68087b = EnumC7213v1.AUTO;

    /* renamed from: c, reason: collision with root package name */
    private boolean f68088c = false;

    /* renamed from: d, reason: collision with root package name */
    protected String f68089d = "manual";

    public final String a() {
        return this.f68089d;
    }

    @NotNull
    public final EnumC7213v1 b() {
        return this.f68087b;
    }

    public final T1 c() {
        return this.f68086a;
    }

    public final boolean d() {
        return this.f68088c;
    }

    public final void e(String str) {
        this.f68089d = str;
    }

    public final void f(T1 t12) {
        this.f68086a = t12;
    }

    public final void g() {
        this.f68088c = true;
    }
}
