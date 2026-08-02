package io.intercom.android.sdk.m5.conversation.ui;

import androidx.compose.foundation.lazy.LazyListItemInfo;
import androidx.compose.foundation.lazy.LazyListState;
import androidx.compose.ui.unit.Density;
import io.intercom.android.sdk.m5.conversation.states.ContentRow;
import io.intercom.android.sdk.m5.conversation.states.ConversationUiState;
import io.intercom.android.sdk.m5.conversation.states.ConversationUiStateKt;
import io.intercom.android.sdk.m5.conversation.states.FloatingIndicatorState;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.text.StringsKt;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: ConversationScreen.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "io.intercom.android.sdk.m5.conversation.ui.ConversationScreenKt$ConversationScreenContent$36$4$1$4$1", f = "ConversationScreen.kt", i = {}, l = {805, 808}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes9.dex */
final class ConversationScreenKt$ConversationScreenContent$36$4$1$4$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ Density $density;
    final /* synthetic */ LazyListState $lazyListState;
    final /* synthetic */ Function2<Integer, Integer, Unit> $onJumpToBottomButtonClicked;
    final /* synthetic */ ConversationUiState $uiState;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    ConversationScreenKt$ConversationScreenContent$36$4$1$4$1(ConversationUiState conversationUiState, LazyListState lazyListState, Density density, Function2<? super Integer, ? super Integer, Unit> function2, Continuation<? super ConversationScreenKt$ConversationScreenContent$36$4$1$4$1> continuation) {
        super(2, continuation);
        this.$uiState = conversationUiState;
        this.$lazyListState = lazyListState;
        this.$density = density;
        this.$onJumpToBottomButtonClicked = function2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new ConversationScreenKt$ConversationScreenContent$36$4$1$4$1(this.$uiState, this.$lazyListState, this.$density, this.$onJumpToBottomButtonClicked, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((ConversationScreenKt$ConversationScreenContent$36$4$1$4$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x008d, code lost:
    
        if (r8.$lazyListState.animateScrollToItem(r1, -r6, r8) == r0) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x00a3, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x00a1, code lost:
    
        if (r8.$lazyListState.animateScrollToItem(r9 + 1, -r6, r8) == r0) goto L29;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        float f;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            Iterator<ContentRow> it = ((ConversationUiState.Content) this.$uiState).getContentRows().iterator();
            int i2 = 0;
            while (true) {
                if (!it.hasNext()) {
                    i2 = -1;
                    break;
                }
                if (StringsKt.startsWith$default(it.next().getKey(), ConversationUiStateKt.NewMessagesRowKey, false, 2, (Object) null)) {
                    break;
                }
                i2++;
            }
            int lastSeenItemIndex = ((FloatingIndicatorState.JumpToBottomIndicator) ((ConversationUiState.Content) this.$uiState).getFloatingIndicatorState()).getJumpToBottomButtonState().getLastSeenItemIndex();
            LazyListItemInfo lazyListItemInfo = (LazyListItemInfo) CollectionsKt.lastOrNull((List) this.$lazyListState.getLayoutInfo().getVisibleItemsInfo());
            int index = lazyListItemInfo != null ? lazyListItemInfo.getIndex() : 0;
            Density density = this.$density;
            f = ConversationScreenKt.JumpToBottomNewMessagesTopOffset;
            int mo738roundToPx0680j_4 = density.mo738roundToPx0680j_4(f);
            if (i2 > lastSeenItemIndex) {
                this.label = 1;
            } else {
                int max = Math.max(lastSeenItemIndex, index);
                this.label = 2;
            }
        } else {
            if (i != 1 && i != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        }
        LazyListItemInfo lazyListItemInfo2 = (LazyListItemInfo) CollectionsKt.lastOrNull((List) this.$lazyListState.getLayoutInfo().getVisibleItemsInfo());
        this.$onJumpToBottomButtonClicked.invoke(Boxing.boxInt(0), Boxing.boxInt(lazyListItemInfo2 != null ? lazyListItemInfo2.getIndex() : 0));
        return Unit.INSTANCE;
    }
}
