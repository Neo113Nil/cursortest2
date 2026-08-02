package com.braze.managers;

import com.braze.storage.n3;
import com.braze.support.BrazeLogger;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__BuildersKt;
import kotlinx.coroutines.CoroutineScope;

/* loaded from: classes6.dex */
public final class i1 extends SuspendLambda implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f590a;
    public final /* synthetic */ j1 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i1(j1 j1Var, Continuation continuation) {
        super(2, continuation);
        this.b = j1Var;
    }

    public static final String a() {
        return "User cache was locked, waiting.";
    }

    public static final String b() {
        return "User cache notified. Continuing UserDependencyManager shutdown";
    }

    public static final String c() {
        return "Device cache was locked, waiting.";
    }

    public static final String d() {
        return "Device cache notified. Continuing UserDependencyManager shutdown";
    }

    public static final String e() {
        return "Exception while shutting down dispatch manager. Continuing.";
    }

    public static final String f() {
        return "Exception while stopping data sync. Continuing.";
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        i1 i1Var = new i1(this.b, continuation);
        i1Var.f590a = obj;
        return i1Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        i1 i1Var = new i1(this.b, (Continuation) obj2);
        i1Var.f590a = (CoroutineScope) obj;
        return i1Var.invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        CoroutineScope coroutineScope = (CoroutineScope) this.f590a;
        try {
            if (this.b.d().f689a.getAvailablePermits() == 0) {
                BrazeLogger brazeLogger = BrazeLogger.INSTANCE;
                BrazeLogger.brazelog$default(brazeLogger, (Object) coroutineScope, BrazeLogger.Priority.I, (Throwable) null, false, new Function0() { // from class: com.braze.managers.i1$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return i1.a();
                    }
                }, 6, (Object) null);
                n3 d = this.b.d();
                d.getClass();
                BuildersKt__BuildersKt.runBlocking$default(null, new com.braze.storage.a(d, null), 1, null);
                BrazeLogger.brazelog$default(brazeLogger, (Object) coroutineScope, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: com.braze.managers.i1$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return i1.b();
                    }
                }, 7, (Object) null);
            }
            com.braze.storage.v0 v0Var = this.b.m;
            if (v0Var == null) {
                Intrinsics.throwUninitializedPropertyAccessException("deviceCache");
                v0Var = null;
            }
            if (v0Var.f689a.getAvailablePermits() == 0) {
                BrazeLogger brazeLogger2 = BrazeLogger.INSTANCE;
                BrazeLogger.brazelog$default(brazeLogger2, (Object) coroutineScope, BrazeLogger.Priority.I, (Throwable) null, false, new Function0() { // from class: com.braze.managers.i1$$ExternalSyntheticLambda2
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return i1.c();
                    }
                }, 6, (Object) null);
                com.braze.storage.v0 v0Var2 = this.b.m;
                if (v0Var2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("deviceCache");
                    v0Var2 = null;
                }
                v0Var2.getClass();
                BuildersKt__BuildersKt.runBlocking$default(null, new com.braze.storage.a(v0Var2, null), 1, null);
                BrazeLogger.brazelog$default(brazeLogger2, (Object) coroutineScope, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: com.braze.managers.i1$$ExternalSyntheticLambda3
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return i1.d();
                    }
                }, 7, (Object) null);
            }
            this.b.F.g();
            this.b.n.c();
            this.b.s.m();
        } catch (Exception e) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) coroutineScope, BrazeLogger.Priority.W, (Throwable) e, false, new Function0() { // from class: com.braze.managers.i1$$ExternalSyntheticLambda4
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return i1.e();
                }
            }, 4, (Object) null);
        }
        try {
            this.b.r.f();
        } catch (Exception e2) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) coroutineScope, BrazeLogger.Priority.W, (Throwable) e2, false, new Function0() { // from class: com.braze.managers.i1$$ExternalSyntheticLambda5
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return i1.f();
                }
            }, 4, (Object) null);
        }
        return Unit.INSTANCE;
    }
}
