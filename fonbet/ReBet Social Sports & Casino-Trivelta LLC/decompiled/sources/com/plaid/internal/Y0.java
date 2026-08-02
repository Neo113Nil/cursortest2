package com.plaid.internal;

import com.plaid.internal.AbstractC3654i4;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Ref;
import kotlin.random.Random;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@DebugMetadata(c = "com.plaid.internal.workflow.network.ExponentialBackoffRetry$doNetworkCallWithRetries$2", f = "ExponentialBackoffRetry.kt", i = {}, l = {32, 33}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes3.dex */
public final class Y0 extends SuspendLambda implements Function2<Ph.P, Continuation<? super Unit>, Object> {

    /* renamed from: a, reason: collision with root package name */
    public Ref.ObjectRef f39779a;

    /* renamed from: b, reason: collision with root package name */
    public int f39780b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Ref.IntRef f39781c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Ref.ObjectRef<AbstractC3654i4<Object, Object>> f39782d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Function1<Continuation<? super AbstractC3654i4<Object, ? extends Object>>, Object> f39783e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public Y0(Ref.IntRef intRef, Ref.ObjectRef<AbstractC3654i4<Object, Object>> objectRef, Function1<? super Continuation<? super AbstractC3654i4<Object, ? extends Object>>, ? extends Object> function1, Continuation<? super Y0> continuation) {
        super(2, continuation);
        this.f39781c = intRef;
        this.f39782d = objectRef;
        this.f39783e = function1;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        return new Y0(this.f39781c, this.f39782d, this.f39783e, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Ph.P p10, Continuation<? super Unit> continuation) {
        return ((Y0) create(p10, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0075, code lost:
    
        if (Ph.AbstractC1440a0.a(r4, r8) != r0) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0084, code lost:
    
        if (r9 == r0) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0086, code lost:
    
        return r0;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:18:0x0084 -> B:6:0x0087). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(@NotNull Object obj) {
        Ref.ObjectRef<AbstractC3654i4<Object, Object>> objectRef;
        AbstractC3654i4<Object, Object> abstractC3654i4;
        T t10;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i10 = this.f39780b;
        if (i10 == 0) {
            ResultKt.throwOnFailure(obj);
            if (this.f39781c.element < 4) {
                abstractC3654i4 = this.f39782d.element;
                abstractC3654i4.getClass();
                if (abstractC3654i4 instanceof AbstractC3654i4.a) {
                }
                long pow = ((long) Math.pow(2.0d, this.f39781c.element)) * 1000;
                long min = Math.min(Random.INSTANCE.nextLong(0L, pow) + pow, 32000L);
                this.f39779a = null;
                this.f39780b = 1;
            }
            return Unit.INSTANCE;
        }
        if (i10 != 1) {
            if (i10 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            objectRef = this.f39779a;
            ResultKt.throwOnFailure(obj);
            t10 = obj;
            objectRef.element = t10;
            this.f39781c.element++;
            if (this.f39781c.element < 4 && this.f39782d.element.a()) {
                abstractC3654i4 = this.f39782d.element;
                abstractC3654i4.getClass();
                if ((abstractC3654i4 instanceof AbstractC3654i4.a) || ((AbstractC3654i4.a) abstractC3654i4).f40674b != 400) {
                    long pow2 = ((long) Math.pow(2.0d, this.f39781c.element)) * 1000;
                    long min2 = Math.min(Random.INSTANCE.nextLong(0L, pow2) + pow2, 32000L);
                    this.f39779a = null;
                    this.f39780b = 1;
                }
            }
            return Unit.INSTANCE;
        }
        ResultKt.throwOnFailure(obj);
        objectRef = this.f39782d;
        Function1<Continuation<? super AbstractC3654i4<Object, ? extends Object>>, Object> function1 = this.f39783e;
        this.f39779a = objectRef;
        this.f39780b = 2;
        Object invoke = function1.invoke(this);
        t10 = invoke;
    }
}
