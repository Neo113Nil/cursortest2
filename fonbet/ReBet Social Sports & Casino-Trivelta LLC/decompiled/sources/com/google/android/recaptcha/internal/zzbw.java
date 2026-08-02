package com.google.android.recaptcha.internal;

import Ph.C0;
import Ph.InterfaceC1456i0;
import Ph.InterfaceC1478u;
import Ph.InterfaceC1482w;
import Ph.InterfaceC1484x;
import Ph.X;
import Vh.a;
import Vh.c;
import java.util.concurrent.CancellationException;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.sequences.Sequence;

/* loaded from: classes3.dex */
public final class zzbw implements X {
    private final /* synthetic */ InterfaceC1484x zza;

    public zzbw(InterfaceC1484x interfaceC1484x) {
        this.zza = interfaceC1484x;
    }

    @Override // Ph.C0
    public final InterfaceC1478u attachChild(InterfaceC1482w interfaceC1482w) {
        return this.zza.attachChild(interfaceC1482w);
    }

    @Override // Ph.X
    public final Object await(Continuation continuation) {
        return this.zza.await(continuation);
    }

    @Override // Ph.C0
    @Deprecated(level = DeprecationLevel.HIDDEN, message = "Since 1.2.0, binary compatibility with versions <= 1.1.x")
    public final /* synthetic */ void cancel() {
        this.zza.cancel();
    }

    @Override // kotlin.coroutines.CoroutineContext.Element, kotlin.coroutines.CoroutineContext
    public final Object fold(Object obj, Function2 function2) {
        return this.zza.fold(obj, function2);
    }

    @Override // kotlin.coroutines.CoroutineContext.Element, kotlin.coroutines.CoroutineContext
    public final CoroutineContext.Element get(CoroutineContext.Key key) {
        return this.zza.get(key);
    }

    @Override // Ph.C0
    public final CancellationException getCancellationException() {
        return this.zza.getCancellationException();
    }

    @Override // Ph.C0
    public final Sequence getChildren() {
        return this.zza.getChildren();
    }

    @Override // Ph.X
    public final Object getCompleted() {
        return this.zza.getCompleted();
    }

    @Override // Ph.X
    public final Throwable getCompletionExceptionOrNull() {
        return this.zza.getCompletionExceptionOrNull();
    }

    @Override // kotlin.coroutines.CoroutineContext.Element
    public final CoroutineContext.Key getKey() {
        return this.zza.getKey();
    }

    @Override // Ph.X
    public final c getOnAwait() {
        return this.zza.getOnAwait();
    }

    @Override // Ph.C0
    public final a getOnJoin() {
        return this.zza.getOnJoin();
    }

    @Override // Ph.C0
    public final C0 getParent() {
        return this.zza.getParent();
    }

    @Override // Ph.C0
    public final InterfaceC1456i0 invokeOnCompletion(Function1 function1) {
        return this.zza.invokeOnCompletion(function1);
    }

    @Override // Ph.C0
    public final boolean isActive() {
        return this.zza.isActive();
    }

    @Override // Ph.C0
    public final boolean isCancelled() {
        return this.zza.isCancelled();
    }

    @Override // Ph.C0
    public final boolean isCompleted() {
        return this.zza.isCompleted();
    }

    @Override // Ph.C0
    public final Object join(Continuation continuation) {
        return this.zza.join(continuation);
    }

    @Override // kotlin.coroutines.CoroutineContext.Element, kotlin.coroutines.CoroutineContext
    public final CoroutineContext minusKey(CoroutineContext.Key key) {
        return this.zza.minusKey(key);
    }

    @Override // Ph.C0
    @Deprecated(level = DeprecationLevel.ERROR, message = "Operator '+' on two Job objects is meaningless. Job is a coroutine context element and `+` is a set-sum operator for coroutine contexts. The job to the right of `+` just replaces the job the left of `+`.")
    public final C0 plus(C0 c02) {
        return this.zza.plus(c02);
    }

    @Override // Ph.C0
    public final boolean start() {
        return this.zza.start();
    }

    @Override // Ph.C0
    public final void cancel(CancellationException cancellationException) {
        this.zza.cancel(cancellationException);
    }

    @Override // Ph.C0
    public final InterfaceC1456i0 invokeOnCompletion(boolean z10, boolean z11, Function1 function1) {
        return this.zza.invokeOnCompletion(z10, z11, function1);
    }

    @Override // kotlin.coroutines.CoroutineContext
    public final CoroutineContext plus(CoroutineContext coroutineContext) {
        return this.zza.plus(coroutineContext);
    }

    @Override // Ph.C0
    @Deprecated(level = DeprecationLevel.HIDDEN, message = "Since 1.2.0, binary compatibility with versions <= 1.1.x")
    public final /* synthetic */ boolean cancel(Throwable th2) {
        return this.zza.cancel(th2);
    }
}
