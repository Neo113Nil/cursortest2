package com.braze.storage;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes6.dex */
public final class x extends ContinuationImpl {

    /* renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f766a;
    public int b;
    public final /* synthetic */ y c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x(y yVar, Continuation continuation) {
        super(continuation);
        this.c = yVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f766a = obj;
        this.b |= Integer.MIN_VALUE;
        return this.c.emit(null, this);
    }
}
