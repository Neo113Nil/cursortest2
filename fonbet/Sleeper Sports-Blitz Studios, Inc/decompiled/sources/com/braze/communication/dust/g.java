package com.braze.communication.dust;

import java.net.URL;
import java.net.URLConnection;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;

/* loaded from: classes6.dex */
public final class g extends SuspendLambda implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ String f480a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(String str, Continuation continuation) {
        super(2, continuation);
        this.f480a = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new g(this.f480a, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return new g(this.f480a, (Continuation) obj2).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        URLConnection openConnection = new URL(this.f480a).openConnection();
        openConnection.setRequestProperty("Accept", "text/event-stream");
        openConnection.setDoInput(true);
        openConnection.connect();
        return openConnection;
    }
}
