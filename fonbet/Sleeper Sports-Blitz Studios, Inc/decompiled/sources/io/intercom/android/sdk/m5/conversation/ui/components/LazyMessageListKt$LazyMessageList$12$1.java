package io.intercom.android.sdk.m5.conversation.ui.components;

import androidx.compose.foundation.lazy.LazyListState;
import androidx.compose.runtime.MutableIntState;
import androidx.compose.runtime.SnapshotStateKt;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;

/* compiled from: LazyMessageList.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "io.intercom.android.sdk.m5.conversation.ui.components.LazyMessageListKt$LazyMessageList$12$1", f = "LazyMessageList.kt", i = {}, l = {136}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes9.dex */
final class LazyMessageListKt$LazyMessageList$12$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ MutableIntState $firstVisibleItemIndex$delegate;
    final /* synthetic */ LazyListState $lazyListState;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    LazyMessageListKt$LazyMessageList$12$1(LazyListState lazyListState, MutableIntState mutableIntState, Continuation<? super LazyMessageListKt$LazyMessageList$12$1> continuation) {
        super(2, continuation);
        this.$lazyListState = lazyListState;
        this.$firstVisibleItemIndex$delegate = mutableIntState;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new LazyMessageListKt$LazyMessageList$12$1(this.$lazyListState, this.$firstVisibleItemIndex$delegate, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((LazyMessageListKt$LazyMessageList$12$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            final LazyListState lazyListState = this.$lazyListState;
            Flow snapshotFlow = SnapshotStateKt.snapshotFlow(new Function0() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.LazyMessageListKt$LazyMessageList$12$1$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    int firstVisibleItemIndex;
                    firstVisibleItemIndex = LazyListState.this.getFirstVisibleItemIndex();
                    return Integer.valueOf(firstVisibleItemIndex);
                }
            });
            final MutableIntState mutableIntState = this.$firstVisibleItemIndex$delegate;
            this.label = 1;
            if (snapshotFlow.collect(new FlowCollector() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.LazyMessageListKt$LazyMessageList$12$1.2
                @Override // kotlinx.coroutines.flow.FlowCollector
                public /* bridge */ /* synthetic */ Object emit(Object obj2, Continuation continuation) {
                    return emit(((Number) obj2).intValue(), (Continuation<? super Unit>) continuation);
                }

                public final Object emit(int i2, Continuation<? super Unit> continuation) {
                    MutableIntState.this.setIntValue(i2);
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
}
