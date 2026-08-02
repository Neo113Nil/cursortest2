package io.ktor.utils.io;

import Ph.C0;
import Ph.InterfaceC1456i0;
import Ph.InterfaceC1478u;
import Ph.InterfaceC1482w;
import java.util.concurrent.CancellationException;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.sequences.Sequence;

/* loaded from: classes3.dex */
public final class k implements C0, q {

    /* renamed from: a, reason: collision with root package name */
    public final C0 f49523a;

    /* renamed from: b, reason: collision with root package name */
    public final c f49524b;

    public k(C0 delegate, c channel) {
        Intrinsics.checkNotNullParameter(delegate, "delegate");
        Intrinsics.checkNotNullParameter(channel, "channel");
        this.f49523a = delegate;
        this.f49524b = channel;
    }

    @Override // io.ktor.utils.io.q
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public c d() {
        return this.f49524b;
    }

    @Override // Ph.C0
    public InterfaceC1478u attachChild(InterfaceC1482w child) {
        Intrinsics.checkNotNullParameter(child, "child");
        return this.f49523a.attachChild(child);
    }

    @Override // Ph.C0
    public /* synthetic */ void cancel() {
        this.f49523a.cancel();
    }

    @Override // kotlin.coroutines.CoroutineContext.Element, kotlin.coroutines.CoroutineContext
    public Object fold(Object obj, Function2 operation) {
        Intrinsics.checkNotNullParameter(operation, "operation");
        return this.f49523a.fold(obj, operation);
    }

    @Override // kotlin.coroutines.CoroutineContext.Element, kotlin.coroutines.CoroutineContext
    public CoroutineContext.Element get(CoroutineContext.Key key) {
        Intrinsics.checkNotNullParameter(key, "key");
        return this.f49523a.get(key);
    }

    @Override // Ph.C0
    public CancellationException getCancellationException() {
        return this.f49523a.getCancellationException();
    }

    @Override // Ph.C0
    public Sequence getChildren() {
        return this.f49523a.getChildren();
    }

    @Override // kotlin.coroutines.CoroutineContext.Element
    public CoroutineContext.Key getKey() {
        return this.f49523a.getKey();
    }

    @Override // Ph.C0
    public Vh.a getOnJoin() {
        return this.f49523a.getOnJoin();
    }

    @Override // Ph.C0
    public InterfaceC1456i0 invokeOnCompletion(Function1 handler) {
        Intrinsics.checkNotNullParameter(handler, "handler");
        return this.f49523a.invokeOnCompletion(handler);
    }

    @Override // Ph.C0
    public boolean isActive() {
        return this.f49523a.isActive();
    }

    @Override // Ph.C0
    public boolean isCancelled() {
        return this.f49523a.isCancelled();
    }

    @Override // Ph.C0
    public boolean isCompleted() {
        return this.f49523a.isCompleted();
    }

    @Override // Ph.C0
    public Object join(Continuation continuation) {
        return this.f49523a.join(continuation);
    }

    @Override // kotlin.coroutines.CoroutineContext.Element, kotlin.coroutines.CoroutineContext
    public CoroutineContext minusKey(CoroutineContext.Key key) {
        Intrinsics.checkNotNullParameter(key, "key");
        return this.f49523a.minusKey(key);
    }

    @Override // Ph.C0
    public C0 plus(C0 other) {
        Intrinsics.checkNotNullParameter(other, "other");
        return this.f49523a.plus(other);
    }

    @Override // Ph.C0
    public boolean start() {
        return this.f49523a.start();
    }

    public String toString() {
        return "ChannelJob[" + this.f49523a + ']';
    }

    @Override // Ph.C0
    public void cancel(CancellationException cancellationException) {
        this.f49523a.cancel(cancellationException);
    }

    @Override // Ph.C0
    public InterfaceC1456i0 invokeOnCompletion(boolean z10, boolean z11, Function1 handler) {
        Intrinsics.checkNotNullParameter(handler, "handler");
        return this.f49523a.invokeOnCompletion(z10, z11, handler);
    }

    @Override // kotlin.coroutines.CoroutineContext
    public CoroutineContext plus(CoroutineContext context) {
        Intrinsics.checkNotNullParameter(context, "context");
        return this.f49523a.plus(context);
    }

    @Override // Ph.C0
    public /* synthetic */ boolean cancel(Throwable th2) {
        return this.f49523a.cancel(th2);
    }
}
