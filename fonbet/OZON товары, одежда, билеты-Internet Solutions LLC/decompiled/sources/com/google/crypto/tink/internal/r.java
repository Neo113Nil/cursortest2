package com.google.crypto.tink.internal;

import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes9.dex */
public final class r {

    /* renamed from: b, reason: collision with root package name */
    private static final r f59287b = new r();

    /* renamed from: c, reason: collision with root package name */
    private static final a f59288c = new a();

    /* renamed from: a, reason: collision with root package name */
    private final AtomicReference<InterfaceC5894m> f59289a = new AtomicReference<>();

    private static class a implements InterfaceC5894m {
    }

    public static r b() {
        return f59287b;
    }

    public final InterfaceC5894m a() {
        InterfaceC5894m interfaceC5894m = this.f59289a.get();
        return interfaceC5894m == null ? f59288c : interfaceC5894m;
    }
}
