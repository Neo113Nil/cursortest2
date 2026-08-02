package com.braze.managers;

import android.content.BroadcastReceiver;
import com.braze.support.BrazeLogger;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* loaded from: classes6.dex */
public final class t extends SuspendLambda implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f605a;
    public final /* synthetic */ w b;
    public final /* synthetic */ BroadcastReceiver.PendingResult c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t(w wVar, BroadcastReceiver.PendingResult pendingResult, Continuation continuation) {
        super(2, continuation);
        this.b = wVar;
        this.c = pendingResult;
    }

    public static final String a() {
        return "Failed to log throwable during seal session.";
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        t tVar = new t(this.b, this.c, continuation);
        tVar.f605a = obj;
        return tVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((t) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        CoroutineScope coroutineScope = (CoroutineScope) this.f605a;
        w wVar = this.b;
        ReentrantLock reentrantLock = wVar.h;
        reentrantLock.lock();
        try {
            try {
                wVar.j();
            } catch (Exception e) {
                try {
                    wVar.c.b(e, Throwable.class);
                } catch (Exception e2) {
                    BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) coroutineScope, BrazeLogger.Priority.E, (Throwable) e2, false, new Function0() { // from class: com.braze.managers.t$$ExternalSyntheticLambda0
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return t.a();
                        }
                    }, 4, (Object) null);
                }
            }
            Unit unit = Unit.INSTANCE;
            reentrantLock.unlock();
            this.c.finish();
            return unit;
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }
}
