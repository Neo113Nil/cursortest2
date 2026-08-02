package io.sentry;

import org.jetbrains.annotations.NotNull;

/* loaded from: classes.dex */
public final class s3 {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final Boolean f68481a;

    /* renamed from: b, reason: collision with root package name */
    private final Double f68482b;

    /* renamed from: c, reason: collision with root package name */
    private final Double f68483c;

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    private final Boolean f68484d;

    /* renamed from: e, reason: collision with root package name */
    private final Double f68485e;

    public s3(@NotNull Boolean bool, Double d11) {
        this(bool, d11, null, Boolean.FALSE, null);
    }

    public final Double a() {
        return this.f68485e;
    }

    @NotNull
    public final Boolean b() {
        return this.f68484d;
    }

    public final Double c() {
        return this.f68483c;
    }

    public final Double d() {
        return this.f68482b;
    }

    @NotNull
    public final Boolean e() {
        return this.f68481a;
    }

    public s3(@NotNull Boolean bool, Double d11, Double d12, @NotNull Boolean bool2, Double d13) {
        this.f68481a = bool;
        this.f68482b = d11;
        this.f68483c = d12;
        this.f68484d = Boolean.valueOf(bool.booleanValue() && bool2.booleanValue());
        this.f68485e = d13;
    }
}
