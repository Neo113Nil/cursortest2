package io.sentry;

import java.util.Collections;
import java.util.Map;
import org.jetbrains.annotations.NotNull;

/* renamed from: io.sentry.t1, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C7205t1 {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final t3 f68498a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final Double f68499b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final Map<String, Object> f68500c = Collections.EMPTY_MAP;

    public C7205t1(@NotNull t3 t3Var, @NotNull Double d11) {
        this.f68498a = t3Var;
        this.f68499b = d11;
    }

    @NotNull
    public final Double a() {
        return this.f68499b;
    }

    @NotNull
    public final t3 b() {
        return this.f68498a;
    }
}
