package io.intercom.android.sdk.m5.inbox.data;

import androidx.paging.PagingSource;
import androidx.paging.PagingState;
import io.intercom.android.sdk.helpcenter.utils.networking.NetworkResponse;
import io.intercom.android.sdk.m5.data.IntercomDataLayer;
import io.intercom.android.sdk.models.Config;
import io.intercom.android.sdk.models.Conversation;
import io.intercom.android.sdk.models.ConversationList;
import io.intercom.android.sdk.models.ConversationsResponse;
import io.intercom.android.sdk.models.EmptyState;
import io.intercom.android.sdk.utilities.extensions.ConversationExtensionsKt;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.mp4parser.boxes.apple.TrackLoadSettingsAtom;

/* compiled from: InboxPagingSource.kt */
@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u0000 \u001a2\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u001aB;\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\"\u0010\b\u001a\u001e\b\u0001\u0012\u0004\u0012\u00020\n\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u000b\u0012\u0006\u0012\u0004\u0018\u00010\r0\t¢\u0006\u0004\b\u000e\u0010\u000fJ(\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00122\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00020\u0014H\u0096@¢\u0006\u0002\u0010\u0015J#\u0010\u0016\u001a\u0004\u0018\u00010\u00022\u0012\u0010\u0017\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0018H\u0016¢\u0006\u0002\u0010\u0019R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R,\u0010\b\u001a\u001e\b\u0001\u0012\u0004\u0012\u00020\n\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u000b\u0012\u0006\u0012\u0004\u0018\u00010\r0\tX\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u0010¨\u0006\u001b"}, d2 = {"Lio/intercom/android/sdk/m5/inbox/data/InboxPagingSource;", "Landroidx/paging/PagingSource;", "", "Lio/intercom/android/sdk/models/Conversation;", "inboxRepository", "Lio/intercom/android/sdk/m5/inbox/data/InboxRepository;", "intercomDataLayer", "Lio/intercom/android/sdk/m5/data/IntercomDataLayer;", "onEmptyState", "Lkotlin/Function2;", "Lio/intercom/android/sdk/models/EmptyState;", "Lkotlin/coroutines/Continuation;", "", "", "<init>", "(Lio/intercom/android/sdk/m5/inbox/data/InboxRepository;Lio/intercom/android/sdk/m5/data/IntercomDataLayer;Lkotlin/jvm/functions/Function2;)V", "Lkotlin/jvm/functions/Function2;", TrackLoadSettingsAtom.TYPE, "Landroidx/paging/PagingSource$LoadResult;", "params", "Landroidx/paging/PagingSource$LoadParams;", "(Landroidx/paging/PagingSource$LoadParams;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getRefreshKey", "state", "Landroidx/paging/PagingState;", "(Landroidx/paging/PagingState;)Ljava/lang/Long;", "Companion", "intercom-sdk-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class InboxPagingSource extends PagingSource<Long, Conversation> {
    public static final int PAGE_SIZE = 20;
    private final InboxRepository inboxRepository;
    private final IntercomDataLayer intercomDataLayer;
    private final Function2<EmptyState, Continuation<? super Unit>, Object> onEmptyState;
    public static final int $stable = 8;

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // androidx.paging.PagingSource
    public Long getRefreshKey(PagingState<Long, Conversation> state) {
        Intrinsics.checkNotNullParameter(state, "state");
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public InboxPagingSource(InboxRepository inboxRepository, IntercomDataLayer intercomDataLayer, Function2<? super EmptyState, ? super Continuation<? super Unit>, ? extends Object> onEmptyState) {
        Intrinsics.checkNotNullParameter(inboxRepository, "inboxRepository");
        Intrinsics.checkNotNullParameter(intercomDataLayer, "intercomDataLayer");
        Intrinsics.checkNotNullParameter(onEmptyState, "onEmptyState");
        this.inboxRepository = inboxRepository;
        this.intercomDataLayer = intercomDataLayer;
        this.onEmptyState = onEmptyState;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x00c0  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00f9  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    @Override // androidx.paging.PagingSource
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object load(PagingSource.LoadParams<Long> loadParams, Continuation<? super PagingSource.LoadResult<Long, Conversation>> continuation) {
        InboxPagingSource$load$1 inboxPagingSource$load$1;
        int i;
        InboxPagingSource inboxPagingSource;
        NetworkResponse networkResponse;
        ConversationList conversationList;
        InboxPagingSource inboxPagingSource2;
        int i2;
        List<Conversation> conversations;
        Conversation conversation;
        if (continuation instanceof InboxPagingSource$load$1) {
            inboxPagingSource$load$1 = (InboxPagingSource$load$1) continuation;
            if ((inboxPagingSource$load$1.label & Integer.MIN_VALUE) != 0) {
                inboxPagingSource$load$1.label -= Integer.MIN_VALUE;
                Object obj = inboxPagingSource$load$1.result;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = inboxPagingSource$load$1.label;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj);
                    InboxRepository inboxRepository = this.inboxRepository;
                    Long key = loadParams.getKey();
                    inboxPagingSource$load$1.L$0 = this;
                    inboxPagingSource$load$1.L$1 = loadParams;
                    inboxPagingSource$load$1.label = 1;
                    obj = inboxRepository.getConversations(key, 20, inboxPagingSource$load$1);
                    if (obj != coroutine_suspended) {
                        inboxPagingSource = this;
                    }
                    return coroutine_suspended;
                }
                if (i != 1) {
                    if (i != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    i2 = inboxPagingSource$load$1.I$0;
                    conversationList = (ConversationList) inboxPagingSource$load$1.L$1;
                    inboxPagingSource2 = (InboxPagingSource) inboxPagingSource$load$1.L$0;
                    ResultKt.throwOnFailure(obj);
                    if (i2 == 0) {
                        conversations = CollectionsKt.toList(inboxPagingSource2.intercomDataLayer.getConversations().getValue());
                    } else {
                        conversations = conversationList.getConversations();
                    }
                    Intrinsics.checkNotNull(conversations);
                    return new PagingSource.LoadResult.Page(conversations, null, (conversationList.hasMorePages() || (conversation = (Conversation) CollectionsKt.lastOrNull((List) conversations)) == null) ? null : Boxing.boxLong(ConversationExtensionsKt.lastActionCreatedAt(conversation)));
                }
                loadParams = (PagingSource.LoadParams) inboxPagingSource$load$1.L$1;
                inboxPagingSource = (InboxPagingSource) inboxPagingSource$load$1.L$0;
                ResultKt.throwOnFailure(obj);
                networkResponse = (NetworkResponse) obj;
                if (!(networkResponse instanceof NetworkResponse.Success)) {
                    int i3 = loadParams.getKey() != null ? 0 : 1;
                    ConversationsResponse build = ((ConversationsResponse.Builder) ((NetworkResponse.Success) networkResponse).getBody()).build();
                    ConversationList conversationPage = build.getConversationPage();
                    IntercomDataLayer intercomDataLayer = inboxPagingSource.intercomDataLayer;
                    Config config = build.getConfig();
                    Intrinsics.checkNotNullExpressionValue(config, "getConfig(...)");
                    intercomDataLayer.updateConfig(config);
                    IntercomDataLayer intercomDataLayer2 = inboxPagingSource.intercomDataLayer;
                    List<Conversation> conversations2 = conversationPage.getConversations();
                    Intrinsics.checkNotNullExpressionValue(conversations2, "getConversations(...)");
                    intercomDataLayer2.addConversations(conversations2);
                    Function2<EmptyState, Continuation<? super Unit>, Object> function2 = inboxPagingSource.onEmptyState;
                    EmptyState emptyState = conversationPage.getEmptyState();
                    Intrinsics.checkNotNullExpressionValue(emptyState, "getEmptyState(...)");
                    inboxPagingSource$load$1.L$0 = inboxPagingSource;
                    inboxPagingSource$load$1.L$1 = conversationPage;
                    inboxPagingSource$load$1.I$0 = i3;
                    inboxPagingSource$load$1.label = 2;
                    if (function2.invoke(emptyState, inboxPagingSource$load$1) != coroutine_suspended) {
                        conversationList = conversationPage;
                        inboxPagingSource2 = inboxPagingSource;
                        i2 = i3;
                        if (i2 == 0) {
                        }
                        Intrinsics.checkNotNull(conversations);
                        return new PagingSource.LoadResult.Page(conversations, null, (conversationList.hasMorePages() || (conversation = (Conversation) CollectionsKt.lastOrNull((List) conversations)) == null) ? null : Boxing.boxLong(ConversationExtensionsKt.lastActionCreatedAt(conversation)));
                    }
                    return coroutine_suspended;
                }
                if (networkResponse instanceof NetworkResponse.NetworkError) {
                    return new PagingSource.LoadResult.Error(((NetworkResponse.NetworkError) networkResponse).getError());
                }
                if (networkResponse instanceof NetworkResponse.ClientError) {
                    return new PagingSource.LoadResult.Error(((NetworkResponse.ClientError) networkResponse).getError());
                }
                if (!(networkResponse instanceof NetworkResponse.ServerError)) {
                    throw new NoWhenBranchMatchedException();
                }
                return new PagingSource.LoadResult.Error(new Error("Server error : code " + ((NetworkResponse.ServerError) networkResponse).getCode()));
            }
        }
        inboxPagingSource$load$1 = new InboxPagingSource$load$1(this, continuation);
        Object obj2 = inboxPagingSource$load$1.result;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = inboxPagingSource$load$1.label;
        if (i != 0) {
        }
        networkResponse = (NetworkResponse) obj2;
        if (!(networkResponse instanceof NetworkResponse.Success)) {
        }
    }
}
