package io.sentry;

import java.util.Collections;
import java.util.Map;

/* loaded from: classes3.dex */
public final class K1 {

    /* renamed from: a, reason: collision with root package name */
    public final m4 f50406a;

    /* renamed from: b, reason: collision with root package name */
    public final Double f50407b;

    /* renamed from: c, reason: collision with root package name */
    public final Map f50408c;

    public K1(m4 m4Var, AbstractC4769k abstractC4769k, Double d10, Map map) {
        this.f50406a = (m4) io.sentry.util.w.c(m4Var, "transactionContexts is required");
        this.f50407b = d10;
        this.f50408c = map == null ? Collections.EMPTY_MAP : map;
    }

    public Double a() {
        return this.f50407b;
    }

    public m4 b() {
        return this.f50406a;
    }
}
