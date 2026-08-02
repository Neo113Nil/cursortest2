package io.sentry;

import java.util.ArrayList;
import java.util.List;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes.dex */
public final class V1 {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final W1 f66753a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final List f66754b;

    public V1(@NotNull W1 w12, @NotNull List list) {
        io.sentry.util.p.b(w12, "SentryEnvelopeHeader is required.");
        this.f66753a = w12;
        io.sentry.util.p.b(list, "SentryEnvelope items are required.");
        this.f66754b = list;
    }

    @NotNull
    public final W1 a() {
        return this.f66753a;
    }

    @NotNull
    public final Iterable<C7222x2> b() {
        return this.f66754b;
    }

    public V1(io.sentry.protocol.t tVar, io.sentry.protocol.r rVar, @NotNull C7222x2 c7222x2) {
        this.f66753a = new W1(tVar, rVar, null);
        ArrayList arrayList = new ArrayList(1);
        arrayList.add(c7222x2);
        this.f66754b = arrayList;
    }
}
