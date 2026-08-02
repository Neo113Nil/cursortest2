package com.vk.push.core.utils;

import java.util.concurrent.Executor;
import kotlin.Result;
import kotlin.a;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.rustore.sdk.core.tasks.TaskCancellationException;
import xsna.b6l;
import xsna.d5o0;
import xsna.d5o0.a;
import xsna.e380;
import xsna.izs;
import xsna.myc0;
import xsna.ovj;
import xsna.qu5;
import xsna.s3q0;
import xsna.spj;
import xsna.wzs;
import xsna.yvj;
import xsna.zvj;

/* compiled from: TaskExtensions.kt */
/* loaded from: classes5.dex */
public final class TaskExtensionsKt {
    public static final <T> d5o0<T> wrapInTask(final yvj yvjVar, final izs<? super spj<? super Result<? extends T>>, ? extends Object> izsVar) {
        izs<d5o0<T>.a, s3q0> izsVar2 = new izs<d5o0<T>.a, s3q0>() { // from class: com.vk.push.core.utils.TaskExtensionsKt$wrapInTask$1

            /* compiled from: TaskExtensions.kt */
            @b6l(c = "com.vk.push.core.utils.TaskExtensionsKt$wrapInTask$1$1", f = "TaskExtensions.kt", l = {17}, m = "invokeSuspend")
            /* renamed from: com.vk.push.core.utils.TaskExtensionsKt$wrapInTask$1$1, reason: invalid class name */
            public static final class AnonymousClass1 extends SuspendLambda implements wzs<yvj, spj<? super s3q0>, Object> {
                final /* synthetic */ izs<spj<? super Result<? extends T>>, Object> $taskResult;
                final /* synthetic */ d5o0<T>.a $this_create;
                int label;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                public AnonymousClass1(izs<? super spj<? super Result<? extends T>>, ? extends Object> izsVar, d5o0<T>.a aVar, spj<? super AnonymousClass1> spjVar) {
                    super(2, spjVar);
                    this.$taskResult = izsVar;
                    this.$this_create = aVar;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final spj<s3q0> create(Object obj, spj<?> spjVar) {
                    return new AnonymousClass1(this.$taskResult, this.$this_create, spjVar);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Object invokeSuspend(Object obj) {
                    Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    int i = this.label;
                    if (i == 0) {
                        a.a(obj);
                        izs<spj<? super Result<? extends T>>, Object> izsVar = this.$taskResult;
                        this.label = 1;
                        obj = izsVar.invoke(this);
                        if (obj == obj2) {
                            return obj2;
                        }
                    } else {
                        if (i != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        a.a(obj);
                    }
                    Object d = ((Result) obj).d();
                    d5o0<T>.a aVar = this.$this_create;
                    if (!(d instanceof Result.Failure)) {
                        aVar.b(d);
                    }
                    d5o0<T>.a aVar2 = this.$this_create;
                    Throwable a = Result.a(d);
                    if (a != null) {
                        aVar2.a(a);
                    }
                    return s3q0.a;
                }

                public final Object invokeSuspend$$forInline(Object obj) {
                    Object d = ((Result) this.$taskResult.invoke(this)).d();
                    d5o0<T>.a aVar = this.$this_create;
                    if (!(d instanceof Result.Failure)) {
                        aVar.b(d);
                        s3q0 s3q0Var = s3q0.a;
                    }
                    d5o0<T>.a aVar2 = this.$this_create;
                    Throwable a = Result.a(d);
                    if (a != null) {
                        aVar2.a(a);
                        s3q0 s3q0Var2 = s3q0.a;
                    }
                    return s3q0.a;
                }

                @Override // xsna.wzs
                public final Object invoke(yvj yvjVar, spj<? super s3q0> spjVar) {
                    return ((AnonymousClass1) create(yvjVar, spjVar)).invokeSuspend(s3q0.a);
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(1);
            }

            @Override // xsna.izs
            public /* bridge */ /* synthetic */ s3q0 invoke(Object obj) {
                invoke((d5o0.a) obj);
                return s3q0.a;
            }

            public final void invoke(d5o0<T>.a aVar) {
                myc0.h(yvj.this, null, null, new AnonymousClass1(izsVar, aVar, null), 3);
            }
        };
        d5o0<T> d5o0Var = new d5o0<>();
        izsVar2.invoke(d5o0Var.new a());
        ovj ovjVar = (ovj) yvjVar.getCoroutineContext().get(ovj.b);
        Executor a = ovjVar != null ? qu5.a(ovjVar) : null;
        if (a == null) {
            d5o0Var.a(new e380() { // from class: com.vk.push.core.utils.TaskExtensionsKt$wrapInTask$2$1
                @Override // xsna.e380
                public final void onComplete(Throwable th) {
                    if (th instanceof TaskCancellationException) {
                        zvj.c(yvj.this, null);
                    }
                }
            }, null);
            return d5o0Var;
        }
        d5o0Var.a(new e380() { // from class: com.vk.push.core.utils.TaskExtensionsKt$wrapInTask$2$2
            @Override // xsna.e380
            public final void onComplete(Throwable th) {
                if (th instanceof TaskCancellationException) {
                    zvj.c(yvj.this, null);
                }
            }
        }, a);
        return d5o0Var;
    }
}
