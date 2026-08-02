package io.intercom.android.sdk.m5.conversation.ui.components;

import androidx.compose.foundation.lazy.LazyListState;
import androidx.compose.runtime.MutableState;
import io.intercom.android.sdk.m5.conversation.states.ContentRow;
import java.util.Collection;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: LazyMessageList.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "io.intercom.android.sdk.m5.conversation.ui.components.LazyMessageListKt$LazyMessageList$14", f = "LazyMessageList.kt", i = {}, l = {155}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes9.dex */
final class LazyMessageListKt$LazyMessageList$14 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ List<ContentRow> $contentRows;
    final /* synthetic */ MutableState<Boolean> $isListAtTheBottom$delegate;
    final /* synthetic */ LazyListState $lazyListState;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    LazyMessageListKt$LazyMessageList$14(List<? extends ContentRow> list, LazyListState lazyListState, MutableState<Boolean> mutableState, Continuation<? super LazyMessageListKt$LazyMessageList$14> continuation) {
        super(2, continuation);
        this.$contentRows = list;
        this.$lazyListState = lazyListState;
        this.$isListAtTheBottom$delegate = mutableState;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new LazyMessageListKt$LazyMessageList$14(this.$contentRows, this.$lazyListState, this.$isListAtTheBottom$delegate, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((LazyMessageListKt$LazyMessageList$14) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        boolean LazyMessageList$lambda$18;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            LazyMessageList$lambda$18 = LazyMessageListKt.LazyMessageList$lambda$18(this.$isListAtTheBottom$delegate);
            if (!LazyMessageList$lambda$18) {
                List<ContentRow> list = this.$contentRows;
                if (!(list instanceof Collection) || !list.isEmpty()) {
                    for (ContentRow contentRow : list) {
                        ContentRow.BubbleMessageRow bubbleMessageRow = contentRow instanceof ContentRow.BubbleMessageRow ? (ContentRow.BubbleMessageRow) contentRow : null;
                        if (bubbleMessageRow == null || !bubbleMessageRow.isPending()) {
                        }
                    }
                }
            }
            this.label = 1;
            if (LazyListState.animateScrollToItem$default(this.$lazyListState, Integer.MAX_VALUE, 0, this, 2, null) == coroutine_suspended) {
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
