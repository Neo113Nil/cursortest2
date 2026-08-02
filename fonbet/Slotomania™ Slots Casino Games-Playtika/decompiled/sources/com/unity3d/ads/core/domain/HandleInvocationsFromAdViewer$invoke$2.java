package com.unity3d.ads.core.domain;

import com.unity3d.ads.adplayer.ExposedFunction;
import com.unity3d.ads.adplayer.ExposedFunctionLocation;
import com.unity3d.ads.adplayer.Invocation;
import java.util.Map;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: HandleInvocationsFromAdViewer.kt */
@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\u008a@"}, d2 = {"<anonymous>", "", "it", "Lcom/unity3d/ads/adplayer/Invocation;"}, k = 3, mv = {1, 8, 0}, xi = 48)
@DebugMetadata(c = "com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer$invoke$2", f = "HandleInvocationsFromAdViewer.kt", i = {}, l = {194, 198}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes2.dex */
final class HandleInvocationsFromAdViewer$invoke$2 extends SuspendLambda implements Function2<Invocation, Continuation<? super Unit>, Object> {
    final /* synthetic */ Map<String, Function0<ExposedFunction>> $definition;
    /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    HandleInvocationsFromAdViewer$invoke$2(Map<String, ? extends Function0<? extends ExposedFunction>> map, Continuation<? super HandleInvocationsFromAdViewer$invoke$2> continuation) {
        super(2, continuation);
        this.$definition = map;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        HandleInvocationsFromAdViewer$invoke$2 handleInvocationsFromAdViewer$invoke$2 = new HandleInvocationsFromAdViewer$invoke$2(this.$definition, continuation);
        handleInvocationsFromAdViewer$invoke$2.L$0 = obj;
        return handleInvocationsFromAdViewer$invoke$2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Invocation invocation, Continuation<? super Unit> continuation) {
        return ((HandleInvocationsFromAdViewer$invoke$2) create(invocation, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0062, code lost:
    
        if (r8.handle(new com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer$invoke$2.AnonymousClass2(r1, r8, null), r7) == r0) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x007b, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0079, code lost:
    
        if (kotlinx.coroutines.BuildersKt.withContext(kotlinx.coroutines.NonCancellable.INSTANCE, new com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer$invoke$2.AnonymousClass1(r8, r1, null), r7) == r0) goto L24;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            Invocation invocation = (Invocation) this.L$0;
            Function0<ExposedFunction> function0 = this.$definition.get(invocation.getLocation());
            if (function0 == null || (r1 = function0.invoke()) == null) {
                return Unit.INSTANCE;
            }
            if (Intrinsics.areEqual(invocation.getLocation(), ExposedFunctionLocation.SEND_OPERATIVE_EVENT) || Intrinsics.areEqual(invocation.getLocation(), ExposedFunctionLocation.SEND_DIAGNOSTIC_EVENT)) {
                this.label = 1;
            } else {
                this.label = 2;
            }
        } else {
            if (i != 1 && i != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        }
        return Unit.INSTANCE;
    }

    /* compiled from: HandleInvocationsFromAdViewer.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 8, 0}, xi = 48)
    @DebugMetadata(c = "com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer$invoke$2$1", f = "HandleInvocationsFromAdViewer.kt", i = {}, l = {195}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer$invoke$2$1, reason: invalid class name */
    static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ ExposedFunction $exposedFunction;
        final /* synthetic */ Invocation $it;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(Invocation invocation, ExposedFunction exposedFunction, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.$it = invocation;
            this.$exposedFunction = exposedFunction;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass1(this.$it, this.$exposedFunction, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* compiled from: HandleInvocationsFromAdViewer.kt */
        @Metadata(d1 = {"\u0000\u0006\n\u0000\n\u0002\u0010\u0000\u0010\u0000\u001a\u0004\u0018\u00010\u0001H\u008a@"}, d2 = {"<anonymous>", ""}, k = 3, mv = {1, 8, 0}, xi = 48)
        @DebugMetadata(c = "com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer$invoke$2$1$1", f = "HandleInvocationsFromAdViewer.kt", i = {}, l = {195}, m = "invokeSuspend", n = {}, s = {})
        /* renamed from: com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer$invoke$2$1$1, reason: invalid class name and collision with other inner class name */
        static final class C03901 extends SuspendLambda implements Function1<Continuation<? super Object>, Object> {
            final /* synthetic */ ExposedFunction $exposedFunction;
            final /* synthetic */ Invocation $it;
            int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C03901(ExposedFunction exposedFunction, Invocation invocation, Continuation<? super C03901> continuation) {
                super(1, continuation);
                this.$exposedFunction = exposedFunction;
                this.$it = invocation;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Continuation<?> continuation) {
                return new C03901(this.$exposedFunction, this.$it, continuation);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Continuation<? super Object> continuation) {
                return invoke2((Continuation<Object>) continuation);
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final Object invoke2(Continuation<Object> continuation) {
                return ((C03901) create(continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i = this.label;
                if (i != 0) {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    return obj;
                }
                ResultKt.throwOnFailure(obj);
                ExposedFunction exposedFunction = this.$exposedFunction;
                Object[] parameters = this.$it.getParameters();
                this.label = 1;
                Object invoke = exposedFunction.invoke(parameters, this);
                return invoke == coroutine_suspended ? coroutine_suspended : invoke;
            }
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                this.label = 1;
                if (this.$it.handle(new C03901(this.$exposedFunction, this.$it, null), this) == coroutine_suspended) {
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

    /* compiled from: HandleInvocationsFromAdViewer.kt */
    @Metadata(d1 = {"\u0000\u0006\n\u0000\n\u0002\u0010\u0000\u0010\u0000\u001a\u0004\u0018\u00010\u0001H\u008a@"}, d2 = {"<anonymous>", ""}, k = 3, mv = {1, 8, 0}, xi = 48)
    @DebugMetadata(c = "com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer$invoke$2$2", f = "HandleInvocationsFromAdViewer.kt", i = {}, l = {198}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer$invoke$2$2, reason: invalid class name */
    static final class AnonymousClass2 extends SuspendLambda implements Function1<Continuation<? super Object>, Object> {
        final /* synthetic */ ExposedFunction $exposedFunction;
        final /* synthetic */ Invocation $it;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass2(ExposedFunction exposedFunction, Invocation invocation, Continuation<? super AnonymousClass2> continuation) {
            super(1, continuation);
            this.$exposedFunction = exposedFunction;
            this.$it = invocation;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Continuation<?> continuation) {
            return new AnonymousClass2(this.$exposedFunction, this.$it, continuation);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Continuation<? super Object> continuation) {
            return invoke2((Continuation<Object>) continuation);
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(Continuation<Object> continuation) {
            return ((AnonymousClass2) create(continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i != 0) {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                return obj;
            }
            ResultKt.throwOnFailure(obj);
            ExposedFunction exposedFunction = this.$exposedFunction;
            Object[] parameters = this.$it.getParameters();
            this.label = 1;
            Object invoke = exposedFunction.invoke(parameters, this);
            return invoke == coroutine_suspended ? coroutine_suspended : invoke;
        }
    }
}
