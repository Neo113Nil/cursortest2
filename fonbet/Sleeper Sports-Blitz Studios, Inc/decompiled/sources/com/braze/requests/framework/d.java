package com.braze.requests.framework;

import com.braze.support.BrazeLogger;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;

/* loaded from: classes6.dex */
public final class d extends SuspendLambda implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public int f670a;
    public /* synthetic */ Object b;
    public final /* synthetic */ g c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(g gVar, Continuation continuation) {
        super(2, continuation);
        this.c = gVar;
    }

    public static final String a() {
        return "A maximum of 5 invalid api key errors reached. Device data will remain unaffected, but future requests will not be made.";
    }

    public static final String b() {
        return "Caught exception during request sweep";
    }

    public static final String c() {
        return "Request sweeper job has finished.";
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        d dVar = new d(this.c, continuation);
        dVar.b = obj;
        return dVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        d dVar = new d(this.c, (Continuation) obj2);
        dVar.b = (CoroutineScope) obj;
        return dVar.invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x00b3, code lost:
    
        if (kotlinx.coroutines.DelayKt.delay(50, r13) == r1) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x00b5, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0079, code lost:
    
        if (kotlinx.coroutines.DelayKt.delay(r4, r13) != r1) goto L23;
     */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0087  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:22:0x00b3 -> B:7:0x0030). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        CoroutineScope coroutineScope;
        CoroutineScope coroutineScope2;
        LinkedHashMap linkedHashMap;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.f670a;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            coroutineScope = (CoroutineScope) this.b;
        } else {
            if (i == 1) {
                CoroutineScope coroutineScope3 = (CoroutineScope) this.b;
                ResultKt.throwOnFailure(obj);
                coroutineScope2 = coroutineScope3;
                linkedHashMap = this.c.e;
                if (!linkedHashMap.isEmpty()) {
                    Iterator it = linkedHashMap.entrySet().iterator();
                    while (it.hasNext()) {
                        if (!((b) ((Map.Entry) it.next()).getValue()).e.isEmpty()) {
                            this.b = coroutineScope2;
                            this.f670a = 2;
                        }
                    }
                }
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, g.n, BrazeLogger.Priority.V, (Throwable) null, false, new Function0() { // from class: com.braze.requests.framework.d$$ExternalSyntheticLambda2
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return d.c();
                    }
                }, 12, (Object) null);
                return Unit.INSTANCE;
            }
            if (i != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            coroutineScope = (CoroutineScope) this.b;
            ResultKt.throwOnFailure(obj);
        }
        coroutineScope2 = coroutineScope;
        if (CoroutineScopeKt.isActive(coroutineScope2)) {
            if (this.c.k.get() >= 5) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, g.n, BrazeLogger.Priority.I, (Throwable) null, false, new Function0() { // from class: com.braze.requests.framework.d$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return d.a();
                    }
                }, 12, (Object) null);
            } else {
                try {
                } catch (Exception e) {
                    BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, g.n, BrazeLogger.Priority.E, (Throwable) e, false, new Function0() { // from class: com.braze.requests.framework.d$$ExternalSyntheticLambda1
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return d.b();
                        }
                    }, 8, (Object) null);
                    long j = g.p;
                    this.b = coroutineScope2;
                    this.f670a = 1;
                }
                g.a(this.c);
                linkedHashMap = this.c.e;
                if (!linkedHashMap.isEmpty()) {
                }
            }
        }
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, g.n, BrazeLogger.Priority.V, (Throwable) null, false, new Function0() { // from class: com.braze.requests.framework.d$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return d.c();
            }
        }, 12, (Object) null);
        return Unit.INSTANCE;
    }
}
