package io.intercom.android.sdk.m5.conversation.ui;

import androidx.compose.foundation.lazy.LazyListState;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.exifinterface.media.ExifInterface;
import io.intercom.android.sdk.m5.conversation.usecase.ConversationScrolledState;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.ranges.RangesKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;

/* compiled from: ConversationScreen.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "io.intercom.android.sdk.m5.conversation.ui.ConversationScreenKt$ConversationScreenContent$31$1", f = "ConversationScreen.kt", i = {}, l = {TypedValues.PositionType.TYPE_PERCENT_X}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes9.dex */
final class ConversationScreenKt$ConversationScreenContent$31$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ boolean $isLandscape;
    final /* synthetic */ boolean $isLargeFont;
    final /* synthetic */ float $lazyListJumpToBottomScrollOffset;
    final /* synthetic */ LazyListState $lazyListState;
    final /* synthetic */ Function1<ConversationScrolledState, Unit> $onConversationScrolled;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    ConversationScreenKt$ConversationScreenContent$31$1(LazyListState lazyListState, float f, Function1<? super ConversationScrolledState, Unit> function1, boolean z, boolean z2, Continuation<? super ConversationScreenKt$ConversationScreenContent$31$1> continuation) {
        super(2, continuation);
        this.$lazyListState = lazyListState;
        this.$lazyListJumpToBottomScrollOffset = f;
        this.$onConversationScrolled = function1;
        this.$isLandscape = z;
        this.$isLargeFont = z2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final long invokeSuspend$lambda$2(boolean z) {
        return z ? 200L : 0L;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new ConversationScreenKt$ConversationScreenContent$31$1(this.$lazyListState, this.$lazyListJumpToBottomScrollOffset, this.$onConversationScrolled, this.$isLandscape, this.$isLargeFont, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((ConversationScreenKt$ConversationScreenContent$31$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            final LazyListState lazyListState = this.$lazyListState;
            final Flow snapshotFlow = SnapshotStateKt.snapshotFlow(new Function0() { // from class: io.intercom.android.sdk.m5.conversation.ui.ConversationScreenKt$ConversationScreenContent$31$1$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    List invokeSuspend$lambda$0;
                    invokeSuspend$lambda$0 = ConversationScreenKt$ConversationScreenContent$31$1.invokeSuspend$lambda$0(LazyListState.this);
                    return invokeSuspend$lambda$0;
                }
            });
            final float f = this.$lazyListJumpToBottomScrollOffset;
            final LazyListState lazyListState2 = this.$lazyListState;
            Flow debounce = FlowKt.debounce(new Flow<Boolean>() { // from class: io.intercom.android.sdk.m5.conversation.ui.ConversationScreenKt$ConversationScreenContent$31$1$invokeSuspend$$inlined$map$1

                /* compiled from: Emitters.kt */
                @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u00032\u0006\u0010\u0004\u001a\u0002H\u0002H\u008a@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\b"}, d2 = {"<anonymous>", "", ExifInterface.GPS_DIRECTION_TRUE, "R", "value", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx/coroutines/flow/FlowKt__EmittersKt$unsafeTransform$1$1", "kotlinx/coroutines/flow/FlowKt__TransformKt$map$$inlined$unsafeTransform$1$2"}, k = 3, mv = {2, 0, 0}, xi = 48)
                /* renamed from: io.intercom.android.sdk.m5.conversation.ui.ConversationScreenKt$ConversationScreenContent$31$1$invokeSuspend$$inlined$map$1$2, reason: invalid class name */
                public static final class AnonymousClass2<T> implements FlowCollector {
                    final /* synthetic */ float $lazyListJumpToBottomScrollOffset$inlined;
                    final /* synthetic */ LazyListState $lazyListState$inlined;
                    final /* synthetic */ FlowCollector $this_unsafeFlow;

                    /* compiled from: Emitters.kt */
                    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
                    @DebugMetadata(c = "io.intercom.android.sdk.m5.conversation.ui.ConversationScreenKt$ConversationScreenContent$31$1$invokeSuspend$$inlined$map$1$2", f = "ConversationScreen.kt", i = {}, l = {219}, m = "emit", n = {}, s = {})
                    /* renamed from: io.intercom.android.sdk.m5.conversation.ui.ConversationScreenKt$ConversationScreenContent$31$1$invokeSuspend$$inlined$map$1$2$1, reason: invalid class name */
                    public static final class AnonymousClass1 extends ContinuationImpl {
                        Object L$0;
                        int label;
                        /* synthetic */ Object result;

                        public AnonymousClass1(Continuation continuation) {
                            super(continuation);
                        }

                        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                        public final Object invokeSuspend(Object obj) {
                            this.result = obj;
                            this.label |= Integer.MIN_VALUE;
                            return AnonymousClass2.this.emit(null, this);
                        }
                    }

                    public AnonymousClass2(FlowCollector flowCollector, float f, LazyListState lazyListState) {
                        this.$this_unsafeFlow = flowCollector;
                        this.$lazyListJumpToBottomScrollOffset$inlined = f;
                        this.$lazyListState$inlined = lazyListState;
                    }

                    /* JADX WARN: Removed duplicated region for block: B:15:0x0032  */
                    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
                    @Override // kotlinx.coroutines.flow.FlowCollector
                    /*
                        Code decompiled incorrectly, please refer to instructions dump.
                    */
                    public final Object emit(Object obj, Continuation continuation) {
                        AnonymousClass1 anonymousClass1;
                        int i;
                        boolean isLazyListScrolled;
                        if (continuation instanceof AnonymousClass1) {
                            anonymousClass1 = (AnonymousClass1) continuation;
                            if ((anonymousClass1.label & Integer.MIN_VALUE) != 0) {
                                anonymousClass1.label -= Integer.MIN_VALUE;
                                Object obj2 = anonymousClass1.result;
                                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                                i = anonymousClass1.label;
                                if (i != 0) {
                                    ResultKt.throwOnFailure(obj2);
                                    FlowCollector flowCollector = this.$this_unsafeFlow;
                                    isLazyListScrolled = ConversationScreenKt.isLazyListScrolled((List) obj, this.$lazyListJumpToBottomScrollOffset$inlined, this.$lazyListState$inlined.getLayoutInfo().getTotalItemsCount());
                                    Boolean boxBoolean = Boxing.boxBoolean(isLazyListScrolled);
                                    anonymousClass1.label = 1;
                                    if (flowCollector.emit(boxBoolean, anonymousClass1) == coroutine_suspended) {
                                        return coroutine_suspended;
                                    }
                                } else {
                                    if (i != 1) {
                                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                    }
                                    ResultKt.throwOnFailure(obj2);
                                }
                                return Unit.INSTANCE;
                            }
                        }
                        anonymousClass1 = new AnonymousClass1(continuation);
                        Object obj22 = anonymousClass1.result;
                        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                        i = anonymousClass1.label;
                        if (i != 0) {
                        }
                        return Unit.INSTANCE;
                    }
                }

                @Override // kotlinx.coroutines.flow.Flow
                public Object collect(FlowCollector<? super Boolean> flowCollector, Continuation continuation) {
                    Object collect = Flow.this.collect(new AnonymousClass2(flowCollector, f, lazyListState2), continuation);
                    return collect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? collect : Unit.INSTANCE;
                }
            }, new Function1() { // from class: io.intercom.android.sdk.m5.conversation.ui.ConversationScreenKt$ConversationScreenContent$31$1$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj2) {
                    long invokeSuspend$lambda$2;
                    invokeSuspend$lambda$2 = ConversationScreenKt$ConversationScreenContent$31$1.invokeSuspend$lambda$2(((Boolean) obj2).booleanValue());
                    return Long.valueOf(invokeSuspend$lambda$2);
                }
            });
            final Function1<ConversationScrolledState, Unit> function1 = this.$onConversationScrolled;
            final LazyListState lazyListState3 = this.$lazyListState;
            final boolean z = this.$isLandscape;
            final boolean z2 = this.$isLargeFont;
            this.label = 1;
            if (debounce.collect(new FlowCollector() { // from class: io.intercom.android.sdk.m5.conversation.ui.ConversationScreenKt$ConversationScreenContent$31$1.4
                @Override // kotlinx.coroutines.flow.FlowCollector
                public /* bridge */ /* synthetic */ Object emit(Object obj2, Continuation continuation) {
                    return emit(((Boolean) obj2).booleanValue(), (Continuation<? super Unit>) continuation);
                }

                public final Object emit(boolean z3, Continuation<? super Unit> continuation) {
                    function1.invoke(new ConversationScrolledState(z3, 0, z, z2, RangesKt.coerceAtLeast(lazyListState3.getLayoutInfo().getTotalItemsCount() - 1, 0)));
                    return Unit.INSTANCE;
                }
            }, this) == coroutine_suspended) {
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

    /* JADX INFO: Access modifiers changed from: private */
    public static final List invokeSuspend$lambda$0(LazyListState lazyListState) {
        return lazyListState.getLayoutInfo().getVisibleItemsInfo();
    }
}
