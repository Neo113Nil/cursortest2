package com.braze.dispatch;

import com.braze.Braze;
import com.braze.support.BrazeLogger;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.DelayKt;

/* loaded from: classes6.dex */
public final class e extends SuspendLambda implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public long f498a;
    public int b;
    public /* synthetic */ Object c;
    public final /* synthetic */ f d;
    public final /* synthetic */ long e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(f fVar, long j, Continuation continuation) {
        super(2, continuation);
        this.d = fVar;
        this.e = j;
    }

    public static final String a() {
        return "Requesting data flush from automatic sync policy";
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        e eVar = new e(this.d, this.e, continuation);
        eVar.c = obj;
        return eVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((e) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0063, code lost:
    
        if (kotlinx.coroutines.DelayKt.delay(r3, r13) == r0) goto L19;
     */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0059  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0063 -> B:6:0x0066). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        CoroutineScope coroutineScope;
        long j;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.b;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            coroutineScope = (CoroutineScope) this.c;
            long j2 = this.d.g;
            long j3 = this.e;
            this.c = coroutineScope;
            this.f498a = j2;
            this.b = 1;
            if (DelayKt.delay(j3, this) != coroutine_suspended) {
                j = j2;
            }
            return coroutine_suspended;
        }
        if (i == 1) {
            j = this.f498a;
            coroutineScope = (CoroutineScope) this.c;
            ResultKt.throwOnFailure(obj);
        } else {
            if (i != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            j = this.f498a;
            coroutineScope = (CoroutineScope) this.c;
            ResultKt.throwOnFailure(obj);
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, f.m, BrazeLogger.Priority.V, (Throwable) null, false, new Function0() { // from class: com.braze.dispatch.e$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return e.a();
                }
            }, 12, (Object) null);
            Braze.INSTANCE.getInstance(this.d.f499a).requestImmediateDataFlush();
            if (CoroutineScopeKt.isActive(coroutineScope)) {
                return Unit.INSTANCE;
            }
            this.c = coroutineScope;
            this.f498a = j;
            this.b = 2;
        }
        Braze.INSTANCE.getInstance(this.d.f499a).requestImmediateDataFlush();
        if (CoroutineScopeKt.isActive(coroutineScope)) {
        }
    }
}
