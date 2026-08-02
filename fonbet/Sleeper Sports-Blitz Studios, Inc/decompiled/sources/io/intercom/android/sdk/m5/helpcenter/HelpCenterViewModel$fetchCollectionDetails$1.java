package io.intercom.android.sdk.m5.helpcenter;

import io.intercom.android.sdk.helpcenter.api.HelpCenterApi;
import io.intercom.android.sdk.helpcenter.articles.ArticleViewState;
import io.intercom.android.sdk.helpcenter.sections.HelpCenterCollectionContent;
import io.intercom.android.sdk.helpcenter.utils.networking.NetworkResponse;
import io.intercom.android.sdk.m5.components.ErrorState;
import io.intercom.android.sdk.m5.helpcenter.states.CollectionDetailsRow;
import io.intercom.android.sdk.m5.helpcenter.states.CollectionDetailsUiState;
import io.intercom.android.sdk.metrics.MetricTracker;
import java.util.Collection;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.MutableStateFlow;

/* compiled from: HelpCenterViewModel.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "io.intercom.android.sdk.m5.helpcenter.HelpCenterViewModel$fetchCollectionDetails$1", f = "HelpCenterViewModel.kt", i = {1, 1}, l = {243, 285}, m = "invokeSuspend", n = {"collectionDetailsContent", "newState"}, s = {"L$0", "L$1"})
/* loaded from: classes9.dex */
final class HelpCenterViewModel$fetchCollectionDetails$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ String $collectionId;
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    int label;
    final /* synthetic */ HelpCenterViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    HelpCenterViewModel$fetchCollectionDetails$1(HelpCenterViewModel helpCenterViewModel, String str, Continuation<? super HelpCenterViewModel$fetchCollectionDetails$1> continuation) {
        super(2, continuation);
        this.this$0 = helpCenterViewModel;
        this.$collectionId = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new HelpCenterViewModel$fetchCollectionDetails$1(this.this$0, this.$collectionId, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((HelpCenterViewModel$fetchCollectionDetails$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:48:0x0072, code lost:
    
        if (r13 == r0) goto L41;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        MutableStateFlow mutableStateFlow;
        HelpCenterApi helpCenterApi;
        MutableStateFlow mutableStateFlow2;
        HelpCenterCollectionContent helpCenterCollectionContent;
        List transformToUiModel;
        boolean z;
        MetricTracker metricTracker;
        boolean z2;
        boolean isFromSearchBrowse;
        boolean shouldAddSendMessageRow;
        List list;
        Object ctaData;
        List list2;
        List list3;
        ErrorState.WithCTA errorWithRetry;
        CollectionDetailsUiState error;
        ErrorState.WithoutCTA withoutCTA;
        CollectionDetailsUiState error2;
        ErrorState.WithoutCTA withoutCTA2;
        ErrorState.WithoutCTA withoutCTA3;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            CollectionDetailsUiState value = this.this$0.getCollectionDetailsState().getValue();
            if ((value instanceof CollectionDetailsUiState.Content) && Intrinsics.areEqual(((CollectionDetailsUiState.Content) value).getId(), this.$collectionId)) {
                return Unit.INSTANCE;
            }
            mutableStateFlow = this.this$0._collectionDetailsState;
            mutableStateFlow.setValue(CollectionDetailsUiState.Loading.INSTANCE);
            helpCenterApi = this.this$0.helpCenterApi;
            this.label = 1;
            obj = HelpCenterApi.DefaultImpls.fetchCollectionDetails$default(helpCenterApi, this.$collectionId, null, this, 2, null);
        } else {
            if (i != 1) {
                if (i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                list2 = (List) this.L$3;
                mutableStateFlow2 = (MutableStateFlow) this.L$2;
                list3 = (List) this.L$1;
                helpCenterCollectionContent = (HelpCenterCollectionContent) this.L$0;
                ResultKt.throwOnFailure(obj);
                list2.add(new CollectionDetailsRow.SendMessageRow((ArticleViewState.TeamPresenceState) obj));
                list = list3;
                error = new CollectionDetailsUiState.Content(helpCenterCollectionContent.getCollectionId(), helpCenterCollectionContent.getTitle(), helpCenterCollectionContent.getSummary(), helpCenterCollectionContent.getArticlesCount(), helpCenterCollectionContent.getAuthors(), list);
                mutableStateFlow2.setValue(error);
                return Unit.INSTANCE;
            }
            ResultKt.throwOnFailure(obj);
        }
        NetworkResponse networkResponse = (NetworkResponse) obj;
        mutableStateFlow2 = this.this$0._collectionDetailsState;
        if (networkResponse instanceof NetworkResponse.ServerError) {
            NetworkResponse.ServerError serverError = (NetworkResponse.ServerError) networkResponse;
            this.this$0.sendFailedSingleCollectionMetric(Boxing.boxInt(serverError.getCode()));
            if (serverError.getCode() == 404) {
                withoutCTA3 = this.this$0.notFoundError;
                error2 = new CollectionDetailsUiState.Error(withoutCTA3);
            } else {
                withoutCTA2 = this.this$0.genericError;
                error2 = new CollectionDetailsUiState.Error(withoutCTA2);
            }
            error = error2;
        } else if (networkResponse instanceof NetworkResponse.ClientError) {
            HelpCenterViewModel.sendFailedSingleCollectionMetric$default(this.this$0, null, 1, null);
            withoutCTA = this.this$0.genericError;
            error = new CollectionDetailsUiState.Error(withoutCTA);
        } else if (networkResponse instanceof NetworkResponse.NetworkError) {
            HelpCenterViewModel.sendFailedSingleCollectionMetric$default(this.this$0, null, 1, null);
            final HelpCenterViewModel helpCenterViewModel = this.this$0;
            final String str = this.$collectionId;
            errorWithRetry = helpCenterViewModel.errorWithRetry(new Function0() { // from class: io.intercom.android.sdk.m5.helpcenter.HelpCenterViewModel$fetchCollectionDetails$1$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    Unit invokeSuspend$lambda$0;
                    invokeSuspend$lambda$0 = HelpCenterViewModel$fetchCollectionDetails$1.invokeSuspend$lambda$0(HelpCenterViewModel.this, str);
                    return invokeSuspend$lambda$0;
                }
            });
            error = new CollectionDetailsUiState.Error(errorWithRetry);
        } else {
            if (!(networkResponse instanceof NetworkResponse.Success)) {
                throw new NoWhenBranchMatchedException();
            }
            helpCenterCollectionContent = (HelpCenterCollectionContent) ((NetworkResponse.Success) networkResponse).getBody();
            transformToUiModel = this.this$0.transformToUiModel(helpCenterCollectionContent);
            List mutableList = CollectionsKt.toMutableList((Collection) transformToUiModel);
            z = this.this$0.isPartialHelpCenterLoaded;
            if (z) {
                mutableList.add(CollectionDetailsRow.FullHelpCenterRow.INSTANCE);
            }
            metricTracker = this.this$0.metricTracker;
            z2 = this.this$0.isPartialHelpCenterLoaded;
            Boolean boxBoolean = Boxing.boxBoolean(z2);
            isFromSearchBrowse = this.this$0.isFromSearchBrowse();
            metricTracker.viewedNativeHelpCenter(MetricTracker.Place.ARTICLE_LIST, boxBoolean, isFromSearchBrowse);
            shouldAddSendMessageRow = this.this$0.shouldAddSendMessageRow();
            if (shouldAddSendMessageRow) {
                this.L$0 = helpCenterCollectionContent;
                this.L$1 = mutableList;
                this.L$2 = mutableStateFlow2;
                this.L$3 = mutableList;
                this.label = 2;
                ctaData = this.this$0.getCtaData(this);
                if (ctaData != coroutine_suspended) {
                    list2 = mutableList;
                    obj = ctaData;
                    list3 = list2;
                    list2.add(new CollectionDetailsRow.SendMessageRow((ArticleViewState.TeamPresenceState) obj));
                    list = list3;
                    error = new CollectionDetailsUiState.Content(helpCenterCollectionContent.getCollectionId(), helpCenterCollectionContent.getTitle(), helpCenterCollectionContent.getSummary(), helpCenterCollectionContent.getArticlesCount(), helpCenterCollectionContent.getAuthors(), list);
                }
                return coroutine_suspended;
            }
            list = mutableList;
            error = new CollectionDetailsUiState.Content(helpCenterCollectionContent.getCollectionId(), helpCenterCollectionContent.getTitle(), helpCenterCollectionContent.getSummary(), helpCenterCollectionContent.getArticlesCount(), helpCenterCollectionContent.getAuthors(), list);
        }
        mutableStateFlow2.setValue(error);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invokeSuspend$lambda$0(HelpCenterViewModel helpCenterViewModel, String str) {
        helpCenterViewModel.fetchCollectionDetails(str);
        return Unit.INSTANCE;
    }
}
