package com.unity3d.services.core.extensions;

import java.util.LinkedHashMap;
import kotlin.a;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import xsna.b6l;
import xsna.izs;
import xsna.myc0;
import xsna.s3q0;
import xsna.spj;
import xsna.ui50;
import xsna.wzs;
import xsna.yvj;
import xsna.zrl;

/* JADX INFO: Add missing generic type declarations: [T] */
/* compiled from: CoroutineExtensions.kt */
@b6l(c = "com.unity3d.services.core.extensions.CoroutineExtensionsKt$memoize$2", f = "CoroutineExtensions.kt", l = {53, 45}, m = "invokeSuspend")
/* loaded from: classes14.dex */
public final class CoroutineExtensionsKt$memoize$2<T> extends SuspendLambda implements wzs<yvj, spj<? super T>, Object> {
    final /* synthetic */ izs<spj<? super T>, Object> $action;
    final /* synthetic */ Object $key;
    private /* synthetic */ Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public CoroutineExtensionsKt$memoize$2(Object obj, izs<? super spj<? super T>, ? extends Object> izsVar, spj<? super CoroutineExtensionsKt$memoize$2> spjVar) {
        super(2, spjVar);
        this.$key = obj;
        this.$action = izsVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final spj<s3q0> create(Object obj, spj<?> spjVar) {
        CoroutineExtensionsKt$memoize$2 coroutineExtensionsKt$memoize$2 = new CoroutineExtensionsKt$memoize$2(this.$key, this.$action, spjVar);
        coroutineExtensionsKt$memoize$2.L$0 = obj;
        return coroutineExtensionsKt$memoize$2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        yvj yvjVar;
        ui50 mutex;
        izs<spj<? super T>, Object> izsVar;
        Object obj2;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        try {
            if (i == 0) {
                a.a(obj);
                yvjVar = (yvj) this.L$0;
                mutex = CoroutineExtensionsKt.getMutex();
                Object obj3 = this.$key;
                izsVar = this.$action;
                this.L$0 = yvjVar;
                this.L$1 = mutex;
                this.L$2 = obj3;
                this.L$3 = izsVar;
                this.label = 1;
                if (mutex.b(this) != coroutineSingletons) {
                    obj2 = obj3;
                }
            }
            if (i != 1) {
                if (i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                a.a(obj);
                return obj;
            }
            izsVar = (izs) this.L$3;
            obj2 = this.L$2;
            mutex = (ui50) this.L$1;
            yvjVar = (yvj) this.L$0;
            a.a(obj);
            LinkedHashMap<Object, zrl<?>> deferreds = CoroutineExtensionsKt.getDeferreds();
            zrl<?> zrlVar = deferreds.get(obj2);
            if (zrlVar == null) {
                zrlVar = myc0.b(yvjVar, null, null, new CoroutineExtensionsKt$memoize$2$deferred$1$1$1(izsVar, null), 3);
                deferreds.put(obj2, zrlVar);
            }
            zrl<?> zrlVar2 = zrlVar;
            mutex.c(null);
            this.L$0 = null;
            this.L$1 = null;
            this.L$2 = null;
            this.L$3 = null;
            this.label = 2;
            Object H = zrlVar2.H(this);
            return H == coroutineSingletons ? coroutineSingletons : H;
        } catch (Throwable th) {
            mutex.c(null);
            throw th;
        }
    }

    public final Object invokeSuspend$$forInline(Object obj) {
        yvj yvjVar = (yvj) this.L$0;
        ui50 mutex = CoroutineExtensionsKt.getMutex();
        Object obj2 = this.$key;
        izs<spj<? super T>, Object> izsVar = this.$action;
        mutex.b(this);
        try {
            LinkedHashMap<Object, zrl<?>> deferreds = CoroutineExtensionsKt.getDeferreds();
            zrl<?> zrlVar = deferreds.get(obj2);
            if (zrlVar == null) {
                zrlVar = myc0.b(yvjVar, null, null, new CoroutineExtensionsKt$memoize$2$deferred$1$1$1(izsVar, null), 3);
                deferreds.put(obj2, zrlVar);
            }
            zrl<?> zrlVar2 = zrlVar;
            mutex.c(null);
            return zrlVar2.H(this);
        } catch (Throwable th) {
            mutex.c(null);
            throw th;
        }
    }

    @Override // xsna.wzs
    public final Object invoke(yvj yvjVar, spj<? super T> spjVar) {
        return ((CoroutineExtensionsKt$memoize$2) create(yvjVar, spjVar)).invokeSuspend(s3q0.a);
    }
}
