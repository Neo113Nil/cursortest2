package com.braze.communication.dust;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Ref;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.channels.ReceiveChannel;

/* loaded from: classes6.dex */
public final class b extends ContinuationImpl {

    /* renamed from: a, reason: collision with root package name */
    public i f475a;
    public CoroutineScope b;
    public ReceiveChannel c;
    public Function1 d;
    public Ref.ObjectRef e;
    public Ref.ObjectRef f;
    public /* synthetic */ Object g;
    public final /* synthetic */ i h;
    public int i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(i iVar, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.h = iVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.g = obj;
        this.i |= Integer.MIN_VALUE;
        return this.h.a(null, null, null, this);
    }
}
