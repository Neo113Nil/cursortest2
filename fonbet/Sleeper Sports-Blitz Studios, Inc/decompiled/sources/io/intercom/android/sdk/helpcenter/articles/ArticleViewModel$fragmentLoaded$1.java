package io.intercom.android.sdk.helpcenter.articles;

import io.intercom.android.sdk.helpcenter.api.HelpCenterApi;
import io.intercom.android.sdk.helpcenter.articles.ArticleViewState;
import io.intercom.android.sdk.helpcenter.utils.networking.NetworkResponse;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.MutableStateFlow;

/* compiled from: ArticleViewModel.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "io.intercom.android.sdk.helpcenter.articles.ArticleViewModel$fragmentLoaded$1", f = "ArticleViewModel.kt", i = {}, l = {103}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes9.dex */
final class ArticleViewModel$fragmentLoaded$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ String $articleId;
    final /* synthetic */ ArticleViewState.Content $defaultState;
    int label;
    final /* synthetic */ ArticleViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ArticleViewModel$fragmentLoaded$1(ArticleViewModel articleViewModel, String str, ArticleViewState.Content content, Continuation<? super ArticleViewModel$fragmentLoaded$1> continuation) {
        super(2, continuation);
        this.this$0 = articleViewModel;
        this.$articleId = str;
        this.$defaultState = content;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new ArticleViewModel$fragmentLoaded$1(this.this$0, this.$articleId, this.$defaultState, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((ArticleViewModel$fragmentLoaded$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        HelpCenterApi helpCenterApi;
        Object fetchArticle$default;
        MutableStateFlow mutableStateFlow;
        MutableStateFlow mutableStateFlow2;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            helpCenterApi = this.this$0.helpCenterApi;
            this.label = 1;
            fetchArticle$default = HelpCenterApi.DefaultImpls.fetchArticle$default(helpCenterApi, this.$articleId, null, this, 2, null);
            if (fetchArticle$default == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            fetchArticle$default = obj;
        }
        NetworkResponse networkResponse = (NetworkResponse) fetchArticle$default;
        if ((networkResponse instanceof NetworkResponse.ClientError) || (networkResponse instanceof NetworkResponse.NetworkError) || (networkResponse instanceof NetworkResponse.ServerError)) {
            mutableStateFlow = this.this$0._state;
            mutableStateFlow.setValue(ArticleViewState.Content.copy$default(this.$defaultState, null, null, ArticleViewState.WebViewStatus.Idle, null, null, 27, null));
        } else {
            if (!(networkResponse instanceof NetworkResponse.Success)) {
                throw new NoWhenBranchMatchedException();
            }
            NetworkResponse.Success success = (NetworkResponse.Success) networkResponse;
            String relatedConversationId = ((ArticleResponse) success.getBody()).getArticle().getRelatedConversationId();
            ArticleViewState.TeamPresenceState copy$default = relatedConversationId != null ? ArticleViewState.TeamPresenceState.copy$default(ArticleViewState.TeamPresenceState.INSTANCE.getDefaultTeamPresenceState(), null, new ArticleViewState.ConversationState(relatedConversationId, 0, 2, null), null, 0, 0, 0, null, null, false, null, 1021, null) : null;
            mutableStateFlow2 = this.this$0._state;
            ArticleViewState.WebViewStatus webViewStatus = ArticleViewState.WebViewStatus.Idle;
            if (copy$default == null) {
                copy$default = ArticleViewState.TeamPresenceState.INSTANCE.getDefaultTeamPresenceState();
            }
            mutableStateFlow2.setValue(ArticleViewState.Content.copy$default(this.$defaultState, null, new ArticleMetadata(((ArticleResponse) success.getBody()).getArticle().getCard().getArticleId(), ((ArticleResponse) success.getBody()).getArticle().getCard().getTitle()), webViewStatus, null, copy$default, 9, null));
        }
        return Unit.INSTANCE;
    }
}
