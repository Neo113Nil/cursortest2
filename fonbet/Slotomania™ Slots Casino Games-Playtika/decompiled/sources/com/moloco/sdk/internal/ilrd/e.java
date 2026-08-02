package com.moloco.sdk.internal.ilrd;

import com.moloco.sdk.internal.MolocoLogger;
import com.moloco.sdk.internal.services.J;
import com.vungle.ads.internal.protos.Sdk;
import java.text.SimpleDateFormat;
import java.util.concurrent.CancellationException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.time.Duration;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.DelayKt;
import kotlinx.coroutines.Job;

/* loaded from: classes.dex */
public final class e {
    public static final a f = new a(null);
    public static final int g = 8;
    public static final String h = "IlrdScheduler";
    public final CoroutineScope a;
    public final J b;
    public final String c;
    public Job d;
    public final SimpleDateFormat e;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public a() {
        }
    }

    @DebugMetadata(c = "com.moloco.sdk.internal.ilrd.IlrdScheduler$schedule$2", f = "IlrdScheduler.kt", i = {}, l = {54}, m = "invokeSuspend", n = {}, s = {})
    public static final class b extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public int a;
        public final /* synthetic */ long c;
        public final /* synthetic */ Function1<Continuation<? super Unit>, Object> d;

        @DebugMetadata(c = "com.moloco.sdk.internal.ilrd.IlrdScheduler$schedule$2$1", f = "IlrdScheduler.kt", i = {}, l = {Sdk.SDKMetric.SDKMetricType.AD_START_TO_BACKGROUND_DURATION_MS_VALUE}, m = "invokeSuspend", n = {}, s = {})
        public static final class a extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            public int a;
            public final /* synthetic */ e b;
            public final /* synthetic */ Function1<Continuation<? super Unit>, Object> c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public a(e eVar, Function1<? super Continuation<? super Unit>, ? extends Object> function1, Continuation<? super a> continuation) {
                super(2, continuation);
                this.b = eVar;
                this.c = function1;
            }

            @Override // kotlin.jvm.functions.Function2
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return ((a) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new a(this.b, this.c, continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i = this.a;
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    MolocoLogger.info$default(MolocoLogger.INSTANCE, e.h, "Task " + this.b.c + " invoked", null, false, 12, null);
                    Function1<Continuation<? super Unit>, Object> function1 = this.c;
                    this.a = 1;
                    if (function1.invoke(this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public b(long j, Function1<? super Continuation<? super Unit>, ? extends Object> function1, Continuation<? super b> continuation) {
            super(2, continuation);
            this.c = j;
            this.d = function1;
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((b) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return e.this.new b(this.c, this.d, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.a;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                MolocoLogger.info$default(MolocoLogger.INSTANCE, e.h, "Task " + e.this.c + " scheduled at " + e.this.e.format(Boxing.boxLong(e.this.b.a() + Duration.m12538getInWholeMillisecondsimpl(this.c))), null, false, 12, null);
                long j = this.c;
                this.a = 1;
                if (DelayKt.m12672delayVtjQ1oo(j, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            BuildersKt__Builders_commonKt.launch$default(e.this.a, null, null, new a(e.this, this.d, null), 3, null);
            return Unit.INSTANCE;
        }
    }

    public e(CoroutineScope scope, J timeProvider, String name) {
        Intrinsics.checkNotNullParameter(scope, "scope");
        Intrinsics.checkNotNullParameter(timeProvider, "timeProvider");
        Intrinsics.checkNotNullParameter(name, "name");
        this.a = scope;
        this.b = timeProvider;
        this.c = name;
        this.e = new SimpleDateFormat("HH:mm:ss");
    }

    public final synchronized void a(long j, Function1<? super Continuation<? super Unit>, ? extends Object> task) {
        Throwable th;
        Job launch$default;
        try {
            try {
                Intrinsics.checkNotNullParameter(task, "task");
                Job job = this.d;
                if (job != null) {
                    try {
                        a(job);
                    } catch (Throwable th2) {
                        th = th2;
                        throw th;
                    }
                }
            } catch (Throwable th3) {
                th = th3;
            }
        } catch (Throwable th4) {
            th = th4;
        }
        try {
            launch$default = BuildersKt__Builders_commonKt.launch$default(this.a, null, null, new b(j, task, null), 3, null);
            this.d = launch$default;
        } catch (Throwable th5) {
            th = th5;
            th = th;
            throw th;
        }
    }

    public final void a(Job job) {
        Intrinsics.checkNotNullParameter(job, "job");
        if (job.isActive()) {
            Job.DefaultImpls.cancel$default(job, (CancellationException) null, 1, (Object) null);
            MolocoLogger.info$default(MolocoLogger.INSTANCE, h, "Task " + this.c + " cancelled", null, false, 12, null);
        }
    }
}
