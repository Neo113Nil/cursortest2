package io.ktor.utils.io;

import Ph.P;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class l implements P, r {

    /* renamed from: a, reason: collision with root package name */
    public final c f49525a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ P f49526b;

    public l(P delegate, c channel) {
        Intrinsics.checkNotNullParameter(delegate, "delegate");
        Intrinsics.checkNotNullParameter(channel, "channel");
        this.f49525a = channel;
        this.f49526b = delegate;
    }

    @Override // io.ktor.utils.io.r
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public c d() {
        return this.f49525a;
    }

    @Override // Ph.P
    public CoroutineContext getCoroutineContext() {
        return this.f49526b.getCoroutineContext();
    }
}
