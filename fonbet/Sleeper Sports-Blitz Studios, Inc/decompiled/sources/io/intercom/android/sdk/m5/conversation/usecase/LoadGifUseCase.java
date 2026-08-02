package io.intercom.android.sdk.m5.conversation.usecase;

import io.intercom.android.sdk.blocks.lib.models.Block;
import io.intercom.android.sdk.helpcenter.utils.networking.NetworkResponse;
import io.intercom.android.sdk.m5.conversation.data.ConversationRepository;
import io.intercom.android.sdk.m5.conversation.states.BottomSheetState;
import io.intercom.android.sdk.m5.conversation.states.ConversationClientState;
import io.intercom.android.sdk.models.GifResponse;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.MutableStateFlow;

/* compiled from: LoadGifUseCase.kt */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0001\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J&\u0010\u0006\u001a\u00020\u00072\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t2\b\b\u0002\u0010\u000b\u001a\u00020\fH\u0086B¢\u0006\u0002\u0010\rR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000e"}, d2 = {"Lio/intercom/android/sdk/m5/conversation/usecase/LoadGifUseCase;", "", "conversationRepository", "Lio/intercom/android/sdk/m5/conversation/data/ConversationRepository;", "<init>", "(Lio/intercom/android/sdk/m5/conversation/data/ConversationRepository;)V", "invoke", "", "clientStateFlow", "Lkotlinx/coroutines/flow/MutableStateFlow;", "Lio/intercom/android/sdk/m5/conversation/states/ConversationClientState;", "searchQuery", "", "(Lkotlinx/coroutines/flow/MutableStateFlow;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "intercom-sdk-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class LoadGifUseCase {
    public static final int $stable = 8;
    private final ConversationRepository conversationRepository;

    public LoadGifUseCase(ConversationRepository conversationRepository) {
        Intrinsics.checkNotNullParameter(conversationRepository, "conversationRepository");
        this.conversationRepository = conversationRepository;
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0028  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invoke(MutableStateFlow<ConversationClientState> mutableStateFlow, String str, Continuation<? super Unit> continuation) {
        LoadGifUseCase$invoke$1 loadGifUseCase$invoke$1;
        int i;
        MutableStateFlow<ConversationClientState> mutableStateFlow2;
        NetworkResponse networkResponse;
        BottomSheetState.GifSearch gifSearch;
        ConversationClientState value;
        if (continuation instanceof LoadGifUseCase$invoke$1) {
            loadGifUseCase$invoke$1 = (LoadGifUseCase$invoke$1) continuation;
            if ((loadGifUseCase$invoke$1.label & Integer.MIN_VALUE) != 0) {
                loadGifUseCase$invoke$1.label -= Integer.MIN_VALUE;
                Object obj = loadGifUseCase$invoke$1.result;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = loadGifUseCase$invoke$1.label;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj);
                    ConversationRepository conversationRepository = this.conversationRepository;
                    loadGifUseCase$invoke$1.L$0 = mutableStateFlow;
                    loadGifUseCase$invoke$1.label = 1;
                    obj = conversationRepository.loadGifs(str, loadGifUseCase$invoke$1);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    mutableStateFlow2 = mutableStateFlow;
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    mutableStateFlow2 = (MutableStateFlow) loadGifUseCase$invoke$1.L$0;
                    ResultKt.throwOnFailure(obj);
                }
                networkResponse = (NetworkResponse) obj;
                if (!(networkResponse instanceof NetworkResponse.ClientError) || (networkResponse instanceof NetworkResponse.NetworkError) || (networkResponse instanceof NetworkResponse.ServerError)) {
                    gifSearch = new BottomSheetState.GifSearch(CollectionsKt.emptyList());
                } else {
                    if (!(networkResponse instanceof NetworkResponse.Success)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    List<Block> results = ((GifResponse) ((NetworkResponse.Success) networkResponse).getBody()).results();
                    Intrinsics.checkNotNullExpressionValue(results, "results(...)");
                    gifSearch = new BottomSheetState.GifSearch(results);
                }
                do {
                    value = mutableStateFlow2.getValue();
                } while (!mutableStateFlow2.compareAndSet(value, ConversationClientState.copy$default(value, null, null, null, null, null, gifSearch, null, null, null, null, null, null, null, null, 0, 0, null, null, false, false, null, null, 4194271, null)));
                return Unit.INSTANCE;
            }
        }
        loadGifUseCase$invoke$1 = new LoadGifUseCase$invoke$1(this, continuation);
        Object obj2 = loadGifUseCase$invoke$1.result;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = loadGifUseCase$invoke$1.label;
        if (i != 0) {
        }
        networkResponse = (NetworkResponse) obj2;
        if (!(networkResponse instanceof NetworkResponse.ClientError)) {
        }
        gifSearch = new BottomSheetState.GifSearch(CollectionsKt.emptyList());
        do {
            value = mutableStateFlow2.getValue();
        } while (!mutableStateFlow2.compareAndSet(value, ConversationClientState.copy$default(value, null, null, null, null, null, gifSearch, null, null, null, null, null, null, null, null, 0, 0, null, null, false, false, null, null, 4194271, null)));
        return Unit.INSTANCE;
    }

    public static /* synthetic */ Object invoke$default(LoadGifUseCase loadGifUseCase, MutableStateFlow mutableStateFlow, String str, Continuation continuation, int i, Object obj) {
        if ((i & 2) != 0) {
            str = "";
        }
        return loadGifUseCase.invoke(mutableStateFlow, str, continuation);
    }
}
