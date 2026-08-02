package io.intercom.android.sdk.ui.preview.ui;

import androidx.compose.foundation.lazy.LazyListItemInfo;
import androidx.compose.foundation.lazy.LazyListState;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;

/* compiled from: PreviewBottomBar.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "io.intercom.android.sdk.ui.preview.ui.PreviewBottomBarKt$ThumbnailList$1$1", f = "PreviewBottomBar.kt", i = {}, l = {97}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes9.dex */
final class PreviewBottomBarKt$ThumbnailList$1$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ LazyListState $listState;
    final /* synthetic */ MutableState<List<Integer>> $visibleItems;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    PreviewBottomBarKt$ThumbnailList$1$1(LazyListState lazyListState, MutableState<List<Integer>> mutableState, Continuation<? super PreviewBottomBarKt$ThumbnailList$1$1> continuation) {
        super(2, continuation);
        this.$listState = lazyListState;
        this.$visibleItems = mutableState;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new PreviewBottomBarKt$ThumbnailList$1$1(this.$listState, this.$visibleItems, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((PreviewBottomBarKt$ThumbnailList$1$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            final LazyListState lazyListState = this.$listState;
            Flow snapshotFlow = SnapshotStateKt.snapshotFlow(new Function0() { // from class: io.intercom.android.sdk.ui.preview.ui.PreviewBottomBarKt$ThumbnailList$1$1$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    List invokeSuspend$lambda$1;
                    invokeSuspend$lambda$1 = PreviewBottomBarKt$ThumbnailList$1$1.invokeSuspend$lambda$1(LazyListState.this);
                    return invokeSuspend$lambda$1;
                }
            });
            final MutableState<List<Integer>> mutableState = this.$visibleItems;
            this.label = 1;
            if (snapshotFlow.collect(new FlowCollector() { // from class: io.intercom.android.sdk.ui.preview.ui.PreviewBottomBarKt$ThumbnailList$1$1.2
                @Override // kotlinx.coroutines.flow.FlowCollector
                public /* bridge */ /* synthetic */ Object emit(Object obj2, Continuation continuation) {
                    return emit((List<Integer>) obj2, (Continuation<? super Unit>) continuation);
                }

                public final Object emit(List<Integer> list, Continuation<? super Unit> continuation) {
                    mutableState.setValue(list);
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
    public static final List invokeSuspend$lambda$1(LazyListState lazyListState) {
        List<LazyListItemInfo> visibleItemsInfo = lazyListState.getLayoutInfo().getVisibleItemsInfo();
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(visibleItemsInfo, 10));
        Iterator<T> it = visibleItemsInfo.iterator();
        while (it.hasNext()) {
            arrayList.add(Integer.valueOf(((LazyListItemInfo) it.next()).getIndex()));
        }
        return arrayList;
    }
}
