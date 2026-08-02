package io.sentry;

import java.util.ArrayList;

/* renamed from: io.sentry.x2, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C4866x2 {

    /* renamed from: a, reason: collision with root package name */
    public final C4871y2 f52882a;

    /* renamed from: b, reason: collision with root package name */
    public final Iterable f52883b;

    public C4866x2(C4871y2 c4871y2, Iterable iterable) {
        this.f52882a = (C4871y2) io.sentry.util.w.c(c4871y2, "SentryEnvelopeHeader is required.");
        this.f52883b = (Iterable) io.sentry.util.w.c(iterable, "SentryEnvelope items are required.");
    }

    public static C4866x2 a(InterfaceC4770k0 interfaceC4770k0, V3 v32, io.sentry.protocol.s sVar) {
        io.sentry.util.w.c(interfaceC4770k0, "Serializer is required.");
        io.sentry.util.w.c(v32, "session is required.");
        return new C4866x2(null, sVar, C4665a3.K(interfaceC4770k0, v32));
    }

    public C4871y2 b() {
        return this.f52882a;
    }

    public Iterable c() {
        return this.f52883b;
    }

    public C4866x2(io.sentry.protocol.u uVar, io.sentry.protocol.s sVar, C4665a3 c4665a3) {
        io.sentry.util.w.c(c4665a3, "SentryEnvelopeItem is required.");
        this.f52882a = new C4871y2(uVar, sVar);
        ArrayList arrayList = new ArrayList(1);
        arrayList.add(c4665a3);
        this.f52883b = arrayList;
    }
}
