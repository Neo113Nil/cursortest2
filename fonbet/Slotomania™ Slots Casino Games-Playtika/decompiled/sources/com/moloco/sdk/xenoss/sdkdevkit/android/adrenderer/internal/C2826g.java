package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal;

import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.C2826g;
import java.util.concurrent.CancellationException;
import kotlin.ResultKt;
import kotlin.UInt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.channels.ProducerScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.SharingStarted;
import kotlinx.coroutines.flow.StateFlow;

/* renamed from: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.g, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C2826g {

    @DebugMetadata(c = "com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.CountdownFlowKt$countdownSecondsFlow$1", f = "CountdownFlow.kt", i = {0, 0, 1, 1, 2, 2}, l = {30, 33, 34}, m = "invokeSuspend", n = {"$this$flow", "secondsLeft", "$this$flow", "secondsLeft", "$this$flow", "secondsLeft"}, s = {"L$0", "I$0", "L$0", "I$0", "L$0", "I$0"})
    /* renamed from: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.g$a */
    public static final class a extends SuspendLambda implements Function2<FlowCollector<? super UInt>, Continuation<? super Unit>, Object> {
        public int a;
        public int b;
        public /* synthetic */ Object c;
        public final /* synthetic */ int d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(int i, Continuation<? super a> continuation) {
            super(2, continuation);
            this.d = i;
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(FlowCollector<? super UInt> flowCollector, Continuation<? super Unit> continuation) {
            return ((a) create(flowCollector, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            a aVar = new a(this.d, continuation);
            aVar.c = obj;
            return aVar;
        }

        /* JADX WARN: Code restructure failed: missing block: B:11:0x0073, code lost:
        
            if (r4.emit(r8, r7) == r0) goto L23;
         */
        /* JADX WARN: Code restructure failed: missing block: B:15:0x005c, code lost:
        
            if (kotlinx.coroutines.DelayKt.delay(1000, r7) == r0) goto L23;
         */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:11:0x0073 -> B:12:0x0049). Please report as a decompilation issue!!! */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            int i;
            FlowCollector flowCollector;
            int compare;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i2 = this.b;
            if (i2 == 0) {
                ResultKt.throwOnFailure(obj);
                FlowCollector flowCollector2 = (FlowCollector) this.c;
                i = this.d;
                UInt m11271boximpl = UInt.m11271boximpl(i);
                this.c = flowCollector2;
                this.a = i;
                this.b = 1;
                if (flowCollector2.emit(m11271boximpl, this) != coroutine_suspended) {
                    flowCollector = flowCollector2;
                }
                return coroutine_suspended;
            }
            if (i2 != 1) {
                if (i2 == 2) {
                    i = this.a;
                    flowCollector = (FlowCollector) this.c;
                    ResultKt.throwOnFailure(obj);
                    i = UInt.m11277constructorimpl(i - 1);
                    UInt m11271boximpl2 = UInt.m11271boximpl(i);
                    this.c = flowCollector;
                    this.a = i;
                    this.b = 3;
                } else if (i2 != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            }
            i = this.a;
            flowCollector = (FlowCollector) this.c;
            ResultKt.throwOnFailure(obj);
            compare = Integer.compare(i ^ Integer.MIN_VALUE, 0 ^ Integer.MIN_VALUE);
            if (compare <= 0) {
                return Unit.INSTANCE;
            }
            this.c = flowCollector;
            this.a = i;
            this.b = 2;
        }
    }

    @DebugMetadata(c = "com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.CountdownFlowKt$countdownSecondsStateFlow$1", f = "CountdownFlow.kt", i = {0, 0}, l = {83, 87, 89}, m = "invokeSuspend", n = {"$this$channelFlow", "countdownJob"}, s = {"L$0", "L$1"})
    /* renamed from: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.g$b */
    public static final class b extends SuspendLambda implements Function2<ProducerScope<? super UInt>, Continuation<? super Unit>, Object> {
        public Object a;
        public int b;
        public /* synthetic */ Object c;
        public final /* synthetic */ Ref.IntRef d;
        public final /* synthetic */ Flow<Boolean> e;
        public final /* synthetic */ Ref.IntRef f;

        /* renamed from: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.g$b$a */
        public static final class a<T> implements FlowCollector {
            public final /* synthetic */ Ref.IntRef a;
            public final /* synthetic */ Ref.ObjectRef<Job> b;
            public final /* synthetic */ ProducerScope<UInt> c;
            public final /* synthetic */ Ref.IntRef d;

            /* JADX WARN: Multi-variable type inference failed */
            public a(Ref.IntRef intRef, Ref.ObjectRef<Job> objectRef, ProducerScope<? super UInt> producerScope, Ref.IntRef intRef2) {
                this.a = intRef;
                this.b = objectRef;
                this.c = producerScope;
                this.d = intRef2;
            }

            public final Object a(boolean z, Continuation<? super Unit> continuation) {
                if (z) {
                    b.b(this.a, this.b, this.c, this.d);
                } else {
                    b.c(this.b);
                }
                return Unit.INSTANCE;
            }

            @Override // kotlinx.coroutines.flow.FlowCollector
            public /* bridge */ /* synthetic */ Object emit(Object obj, Continuation continuation) {
                return a(((Boolean) obj).booleanValue(), continuation);
            }
        }

        @DebugMetadata(c = "com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.CountdownFlowKt$countdownSecondsStateFlow$1$startCountdown$1", f = "CountdownFlow.kt", i = {}, l = {65}, m = "invokeSuspend", n = {}, s = {})
        /* renamed from: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.g$b$b, reason: collision with other inner class name */
        public static final class C0289b extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            public int a;
            public final /* synthetic */ Ref.IntRef b;
            public final /* synthetic */ Ref.ObjectRef<Job> c;
            public final /* synthetic */ Ref.IntRef d;
            public final /* synthetic */ ProducerScope<UInt> e;

            /* renamed from: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.g$b$b$a */
            public static final class a<T> implements FlowCollector {
                public final /* synthetic */ Ref.IntRef a;
                public final /* synthetic */ Ref.IntRef b;
                public final /* synthetic */ ProducerScope<UInt> c;

                /* JADX WARN: Multi-variable type inference failed */
                public a(Ref.IntRef intRef, Ref.IntRef intRef2, ProducerScope<? super UInt> producerScope) {
                    this.a = intRef;
                    this.b = intRef2;
                    this.c = producerScope;
                }

                public final Object a(int i, Continuation<? super Unit> continuation) {
                    this.a.element = i;
                    Ref.IntRef intRef = this.b;
                    if (i == intRef.element) {
                        return Unit.INSTANCE;
                    }
                    intRef.element = i;
                    Object send = this.c.send(UInt.m11271boximpl(i), continuation);
                    return send == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? send : Unit.INSTANCE;
                }

                @Override // kotlinx.coroutines.flow.FlowCollector
                public /* bridge */ /* synthetic */ Object emit(Object obj, Continuation continuation) {
                    return a(((UInt) obj).getData(), continuation);
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public C0289b(Ref.IntRef intRef, Ref.ObjectRef<Job> objectRef, Ref.IntRef intRef2, ProducerScope<? super UInt> producerScope, Continuation<? super C0289b> continuation) {
                super(2, continuation);
                this.b = intRef;
                this.c = objectRef;
                this.d = intRef2;
                this.e = producerScope;
            }

            @Override // kotlin.jvm.functions.Function2
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return ((C0289b) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new C0289b(this.b, this.c, this.d, this.e, continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i = this.a;
                try {
                    if (i == 0) {
                        ResultKt.throwOnFailure(obj);
                        Flow<UInt> a2 = C2826g.a(this.b.element);
                        a aVar = new a(this.b, this.d, this.e);
                        this.a = 1;
                        if (a2.collect(aVar, this) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    } else {
                        if (i != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.throwOnFailure(obj);
                    }
                    this.c.element = null;
                    return Unit.INSTANCE;
                } catch (Throwable th) {
                    this.c.element = null;
                    throw th;
                }
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(Ref.IntRef intRef, Flow<Boolean> flow, Ref.IntRef intRef2, Continuation<? super b> continuation) {
            super(2, continuation);
            this.d = intRef;
            this.e = flow;
            this.f = intRef2;
        }

        /* JADX WARN: Type inference failed for: r8v1, types: [T, kotlinx.coroutines.Job] */
        public static final void b(Ref.IntRef intRef, Ref.ObjectRef<Job> objectRef, ProducerScope<? super UInt> producerScope, Ref.IntRef intRef2) {
            ?? launch$default;
            if (intRef.element == 0 || objectRef.element != null) {
                return;
            }
            launch$default = BuildersKt__Builders_commonKt.launch$default(producerScope, null, null, new C0289b(intRef, objectRef, intRef2, producerScope, null), 3, null);
            objectRef.element = launch$default;
        }

        public static final void c(Ref.ObjectRef<Job> objectRef) {
            Job job = objectRef.element;
            if (job != null) {
                Job.DefaultImpls.cancel$default(job, (CancellationException) null, 1, (Object) null);
            }
            objectRef.element = null;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            b bVar = new b(this.d, this.e, this.f, continuation);
            bVar.c = obj;
            return bVar;
        }

        /* JADX WARN: Code restructure failed: missing block: B:16:0x0067, code lost:
        
            if (kotlinx.coroutines.channels.ProduceKt.awaitClose(r4, r9, r8) == r0) goto L23;
         */
        /* JADX WARN: Code restructure failed: missing block: B:19:0x0081, code lost:
        
            if (r9.collect(r3, r8) == r0) goto L23;
         */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            final Ref.ObjectRef objectRef;
            ProducerScope producerScope;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.b;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                ProducerScope producerScope2 = (ProducerScope) this.c;
                objectRef = new Ref.ObjectRef();
                UInt m11271boximpl = UInt.m11271boximpl(this.d.element);
                this.c = producerScope2;
                this.a = objectRef;
                this.b = 1;
                if (producerScope2.send(m11271boximpl, this) != coroutine_suspended) {
                    producerScope = producerScope2;
                }
                return coroutine_suspended;
            }
            if (i != 1) {
                if (i != 2 && i != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                return Unit.INSTANCE;
            }
            objectRef = (Ref.ObjectRef) this.a;
            producerScope = (ProducerScope) this.c;
            ResultKt.throwOnFailure(obj);
            Flow<Boolean> flow = this.e;
            if (flow == null) {
                b(this.f, objectRef, producerScope, this.d);
                Function0 function0 = new Function0() { // from class: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.g$b$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return C2826g.b.b(Ref.ObjectRef.this);
                    }
                };
                this.c = null;
                this.a = null;
                this.b = 2;
            } else {
                Flow distinctUntilChanged = FlowKt.distinctUntilChanged(flow);
                a aVar = new a(this.f, objectRef, producerScope, this.d);
                this.c = null;
                this.a = null;
                this.b = 3;
            }
        }

        public static final Unit b(Ref.ObjectRef objectRef) {
            c(objectRef);
            return Unit.INSTANCE;
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(ProducerScope<? super UInt> producerScope, Continuation<? super Unit> continuation) {
            return ((b) create(producerScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    public static final Flow<UInt> a(int i) {
        return FlowKt.flow(new a(i, null));
    }

    public static /* synthetic */ StateFlow a(int i, CoroutineScope coroutineScope, Flow flow, int i2, Object obj) {
        if ((i2 & 4) != 0) {
            flow = null;
        }
        return a(i, coroutineScope, flow);
    }

    public static final StateFlow<UInt> a(int i, CoroutineScope scope, Flow<Boolean> flow) {
        Intrinsics.checkNotNullParameter(scope, "scope");
        Ref.IntRef intRef = new Ref.IntRef();
        intRef.element = i;
        Ref.IntRef intRef2 = new Ref.IntRef();
        intRef2.element = i;
        return FlowKt.stateIn(FlowKt.channelFlow(new b(intRef2, flow, intRef, null)), scope, SharingStarted.Companion.WhileSubscribed$default(SharingStarted.INSTANCE, 0L, 0L, 3, null), UInt.m11271boximpl(i));
    }
}
