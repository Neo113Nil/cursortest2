package com.braze.communication.dust;

import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes6.dex */
public final class c extends ContinuationImpl {

    /* renamed from: a, reason: collision with root package name */
    public i f476a;
    public /* synthetic */ Object b;
    public final /* synthetic */ i c;
    public int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(i iVar, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.c = iVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.b = obj;
        this.d |= Integer.MIN_VALUE;
        return this.c.a(this);
    }
}
