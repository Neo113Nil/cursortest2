package com.braze;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.BuildersKt__BuildersKt;
import kotlinx.coroutines.CoroutineScope;

/* loaded from: classes6.dex */
public final class s extends SuspendLambda implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ boolean f684a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ boolean d;
    public final /* synthetic */ Braze e;
    public final /* synthetic */ Function2 f;
    public final /* synthetic */ Function0 g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s(boolean z, Object obj, boolean z2, boolean z3, Braze braze, Function2 function2, Function0 function0, Continuation continuation) {
        super(2, continuation);
        this.f684a = z;
        this.b = obj;
        this.c = z2;
        this.d = z3;
        this.e = braze;
        this.f = function2;
        this.g = function0;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new s(this.f684a, this.b, this.c, this.d, this.e, this.f, this.g, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((s) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object runBlocking$default;
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        if (this.f684a && Braze.INSTANCE.isDisabled()) {
            return this.b;
        }
        if (this.c && Braze.INSTANCE.isDelayedInitializationEnabled()) {
            return this.b;
        }
        runBlocking$default = BuildersKt__BuildersKt.runBlocking$default(null, new q(this.d, this.e, this.b, this.f, this.g, null), 1, null);
        return runBlocking$default;
    }
}
