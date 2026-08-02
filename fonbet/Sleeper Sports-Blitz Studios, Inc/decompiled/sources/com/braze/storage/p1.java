package com.braze.storage;

import java.util.Map;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.sync.Mutex;

/* loaded from: classes6.dex */
public final class p1 extends SuspendLambda implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public Mutex f741a;
    public s1 b;
    public String c;
    public long d;
    public int e;
    public final /* synthetic */ s1 f;
    public final /* synthetic */ String g;
    public final /* synthetic */ long h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p1(s1 s1Var, String str, long j, Continuation continuation) {
        super(2, continuation);
        this.f = s1Var;
        this.g = str;
        this.h = j;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new p1(this.f, this.g, this.h, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((p1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        s1 s1Var;
        Mutex mutex;
        String str;
        long j;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.e;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            s1Var = this.f;
            mutex = s1Var.b;
            String str2 = this.g;
            long j2 = this.h;
            this.f741a = mutex;
            this.b = s1Var;
            this.c = str2;
            this.d = j2;
            this.e = 1;
            if (mutex.lock(null, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
            str = str2;
            j = j2;
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            j = this.d;
            str = this.c;
            s1Var = this.b;
            mutex = this.f741a;
            ResultKt.throwOnFailure(obj);
        }
        try {
            Map a2 = s1Var.a();
            a2.put(str, Boxing.boxLong(j));
            s1.a(s1Var, a2);
            return Unit.INSTANCE;
        } finally {
            mutex.unlock(null);
        }
    }
}
