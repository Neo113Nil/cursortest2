package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal;

import android.graphics.Rect;
import android.view.View;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import com.vungle.ads.internal.protos.Sdk;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.channels.ProducerScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;

/* loaded from: classes6.dex */
public class S implements Q {
    public static final int a = 0;

    @DebugMetadata(c = "com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ViewVisibilityTrackerImpl$isEnoughAreaVisibleFlow$1", f = "ViewVisibilityTracker.kt", i = {0, 0, 1, 1}, l = {71, 72}, m = "invokeSuspend", n = {"$this$flow", "rect", "$this$flow", "rect"}, s = {"L$0", "L$1", "L$0", "L$1"})
    public static final class a extends SuspendLambda implements Function2<FlowCollector<? super Boolean>, Continuation<? super Unit>, Object> {
        public Object a;
        public int b;
        public /* synthetic */ Object c;
        public final /* synthetic */ View d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(View view, Continuation<? super a> continuation) {
            super(2, continuation);
            this.d = view;
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(FlowCollector<? super Boolean> flowCollector, Continuation<? super Unit> continuation) {
            return ((a) create(flowCollector, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            a aVar = new a(this.d, continuation);
            aVar.c = obj;
            return aVar;
        }

        /* JADX WARN: Code restructure failed: missing block: B:12:0x005d, code lost:
        
            if (r5.emit(r9, r8) == r0) goto L22;
         */
        /* JADX WARN: Code restructure failed: missing block: B:14:0x006c, code lost:
        
            if (kotlinx.coroutines.DelayKt.delay(500, r8) == r0) goto L22;
         */
        /* JADX WARN: Code restructure failed: missing block: B:15:0x006e, code lost:
        
            return r0;
         */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:14:0x006c -> B:6:0x003c). Please report as a decompilation issue!!! */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            FlowCollector flowCollector;
            Rect rect;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.b;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                flowCollector = (FlowCollector) this.c;
                rect = new Rect(0, 0, 0, 0);
            } else if (i == 1) {
                rect = (Rect) this.a;
                flowCollector = (FlowCollector) this.c;
                ResultKt.throwOnFailure(obj);
                this.c = flowCollector;
                this.a = rect;
                this.b = 2;
            } else {
                if (i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                rect = (Rect) this.a;
                flowCollector = (FlowCollector) this.c;
                ResultKt.throwOnFailure(obj);
            }
            Boolean boxBoolean = Boxing.boxBoolean(this.d.isShown() && this.d.getGlobalVisibleRect(rect));
            this.c = flowCollector;
            this.a = rect;
            this.b = 1;
        }
    }

    @DebugMetadata(c = "com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ViewVisibilityTrackerImpl$isVisibleFlow$1", f = "ViewVisibilityTracker.kt", i = {}, l = {44}, m = "invokeSuspend", n = {}, s = {})
    public static final class b extends SuspendLambda implements Function2<ProducerScope<? super Boolean>, Continuation<? super Unit>, Object> {
        public int a;
        public /* synthetic */ Object b;
        public final /* synthetic */ View c;
        public final /* synthetic */ S d;

        @DebugMetadata(c = "com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ViewVisibilityTrackerImpl$isVisibleFlow$1$1", f = "ViewVisibilityTracker.kt", i = {}, l = {47, Sdk.SDKMetric.SDKMetricType.AD_VISIBILITY_VALUE}, m = "invokeSuspend", n = {}, s = {})
        public static final class a extends SuspendLambda implements Function2<Boolean, Continuation<? super Unit>, Object> {
            public int a;
            public /* synthetic */ boolean b;
            public final /* synthetic */ View c;
            public final /* synthetic */ ProducerScope<Boolean> d;
            public final /* synthetic */ S e;

            @DebugMetadata(c = "com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ViewVisibilityTrackerImpl$isVisibleFlow$1$1$1", f = "ViewVisibilityTracker.kt", i = {}, l = {50, 52}, m = "invokeSuspend", n = {}, s = {})
            /* renamed from: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.S$b$a$a, reason: collision with other inner class name */
            public static final class C0279a extends SuspendLambda implements Function2<Boolean, Continuation<? super Unit>, Object> {
                public int a;
                public /* synthetic */ Object b;
                public final /* synthetic */ S c;
                public final /* synthetic */ View d;
                public final /* synthetic */ ProducerScope<Boolean> e;

                @DebugMetadata(c = "com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ViewVisibilityTrackerImpl$isVisibleFlow$1$1$1$1", f = "ViewVisibilityTracker.kt", i = {}, l = {50}, m = "invokeSuspend", n = {}, s = {})
                /* renamed from: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.S$b$a$a$a, reason: collision with other inner class name */
                public static final class C0280a extends SuspendLambda implements Function2<Boolean, Continuation<? super Unit>, Object> {
                    public int a;
                    public /* synthetic */ boolean b;
                    public final /* synthetic */ ProducerScope<Boolean> c;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    public C0280a(ProducerScope<? super Boolean> producerScope, Continuation<? super C0280a> continuation) {
                        super(2, continuation);
                        this.c = producerScope;
                    }

                    public final Object a(boolean z, Continuation<? super Unit> continuation) {
                        return ((C0280a) create(Boolean.valueOf(z), continuation)).invokeSuspend(Unit.INSTANCE);
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                        C0280a c0280a = new C0280a(this.c, continuation);
                        c0280a.b = ((Boolean) obj).booleanValue();
                        return c0280a;
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Object invoke(Boolean bool, Continuation<? super Unit> continuation) {
                        return a(bool.booleanValue(), continuation);
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    public final Object invokeSuspend(Object obj) {
                        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                        int i = this.a;
                        if (i == 0) {
                            ResultKt.throwOnFailure(obj);
                            boolean z = this.b;
                            ProducerScope<Boolean> producerScope = this.c;
                            Boolean boxBoolean = Boxing.boxBoolean(z);
                            this.a = 1;
                            if (producerScope.send(boxBoolean, this) == coroutine_suspended) {
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
                public C0279a(S s, View view, ProducerScope<? super Boolean> producerScope, Continuation<? super C0279a> continuation) {
                    super(2, continuation);
                    this.c = s;
                    this.d = view;
                    this.e = producerScope;
                }

                @Override // kotlin.jvm.functions.Function2
                /* renamed from: a, reason: merged with bridge method [inline-methods] */
                public final Object invoke(Boolean bool, Continuation<? super Unit> continuation) {
                    return ((C0279a) create(bool, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    C0279a c0279a = new C0279a(this.c, this.d, this.e, continuation);
                    c0279a.b = obj;
                    return c0279a;
                }

                /* JADX WARN: Code restructure failed: missing block: B:14:0x0043, code lost:
                
                    if (kotlinx.coroutines.flow.FlowKt.collectLatest(r6, r1, r5) == r0) goto L17;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:15:0x0054, code lost:
                
                    return r0;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:17:0x0052, code lost:
                
                    if (r6.send(r1, r5) == r0) goto L17;
                 */
                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final Object invokeSuspend(Object obj) {
                    Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    int i = this.a;
                    if (i == 0) {
                        ResultKt.throwOnFailure(obj);
                        if (Intrinsics.areEqual((Boolean) this.b, Boxing.boxBoolean(false))) {
                            ProducerScope<Boolean> producerScope = this.e;
                            Boolean boxBoolean = Boxing.boxBoolean(false);
                            this.a = 2;
                        } else {
                            Flow<Boolean> b = this.c.b(this.d);
                            C0280a c0280a = new C0280a(this.e, null);
                            this.a = 1;
                        }
                    } else {
                        if (i != 1 && i != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.throwOnFailure(obj);
                    }
                    return Unit.INSTANCE;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public a(View view, ProducerScope<? super Boolean> producerScope, S s, Continuation<? super a> continuation) {
                super(2, continuation);
                this.c = view;
                this.d = producerScope;
                this.e = s;
            }

            public final Object a(boolean z, Continuation<? super Unit> continuation) {
                return ((a) create(Boolean.valueOf(z), continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                a aVar = new a(this.c, this.d, this.e, continuation);
                aVar.b = ((Boolean) obj).booleanValue();
                return aVar;
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Object invoke(Boolean bool, Continuation<? super Unit> continuation) {
                return a(bool.booleanValue(), continuation);
            }

            /* JADX WARN: Code restructure failed: missing block: B:14:0x003e, code lost:
            
                if (kotlinx.coroutines.flow.FlowKt.collectLatest(r8, r1, r7) == r0) goto L17;
             */
            /* JADX WARN: Code restructure failed: missing block: B:15:0x0050, code lost:
            
                return r0;
             */
            /* JADX WARN: Code restructure failed: missing block: B:17:0x004e, code lost:
            
                if (r8.send(r1, r7) == r0) goto L17;
             */
            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final Object invokeSuspend(Object obj) {
                Flow b;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i = this.a;
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    if (this.b) {
                        b = T.b(ViewTreeLifecycleOwner.get(this.c));
                        C0279a c0279a = new C0279a(this.e, this.c, this.d, null);
                        this.a = 1;
                    } else {
                        ProducerScope<Boolean> producerScope = this.d;
                        Boolean boxBoolean = Boxing.boxBoolean(false);
                        this.a = 2;
                    }
                } else {
                    if (i != 1 && i != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(View view, S s, Continuation<? super b> continuation) {
            super(2, continuation);
            this.c = view;
            this.d = s;
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(ProducerScope<? super Boolean> producerScope, Continuation<? super Unit> continuation) {
            return ((b) create(producerScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            b bVar = new b(this.c, this.d, continuation);
            bVar.b = obj;
            return bVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Flow b;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.a;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                ProducerScope producerScope = (ProducerScope) this.b;
                b = T.b(this.c);
                a aVar = new a(this.c, producerScope, this.d, null);
                this.a = 1;
                if (FlowKt.collectLatest(b, aVar, this) == coroutine_suspended) {
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

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.Q
    public Flow<Boolean> a(View view) {
        Flow<Boolean> b2;
        Intrinsics.checkNotNullParameter(view, "view");
        b2 = T.b(FlowKt.channelFlow(new b(view, this, null)));
        return b2;
    }

    public Flow<Boolean> b(View view) {
        Flow<Boolean> b2;
        Intrinsics.checkNotNullParameter(view, "view");
        b2 = T.b(FlowKt.flow(new a(view, null)));
        return b2;
    }
}
