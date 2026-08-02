package io.intercom.android.sdk.m5.helpcenter;

import io.intercom.android.sdk.helpcenter.api.HelpCenterApi;
import io.intercom.android.sdk.helpcenter.articles.ArticleViewState;
import io.intercom.android.sdk.helpcenter.collections.HelpCenterCollection;
import io.intercom.android.sdk.helpcenter.utils.networking.NetworkResponse;
import io.intercom.android.sdk.m5.components.ErrorState;
import io.intercom.android.sdk.m5.helpcenter.states.CollectionsRow;
import io.intercom.android.sdk.m5.helpcenter.states.CollectionsUiState;
import io.intercom.android.sdk.metrics.MetricTracker;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Set;
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
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.MutableSharedFlow;
import kotlinx.coroutines.flow.MutableStateFlow;
import org.objectweb.asm.Opcodes;

/* compiled from: HelpCenterViewModel.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "io.intercom.android.sdk.m5.helpcenter.HelpCenterViewModel$fetchCollections$1", f = "HelpCenterViewModel.kt", i = {3}, l = {126, Opcodes.IF_ACMPEQ, Opcodes.DRETURN, Opcodes.IFNULL}, m = "invokeSuspend", n = {"uiModel"}, s = {"L$0"})
/* loaded from: classes9.dex */
final class HelpCenterViewModel$fetchCollections$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ Set<String> $collectionIds;
    Object L$0;
    Object L$1;
    Object L$2;
    int label;
    final /* synthetic */ HelpCenterViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    HelpCenterViewModel$fetchCollections$1(HelpCenterViewModel helpCenterViewModel, Set<String> set, Continuation<? super HelpCenterViewModel$fetchCollections$1> continuation) {
        super(2, continuation);
        this.this$0 = helpCenterViewModel;
        this.$collectionIds = set;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new HelpCenterViewModel$fetchCollections$1(this.this$0, this.$collectionIds, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((HelpCenterViewModel$fetchCollections$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:56:0x0188, code lost:
    
        if (r12.emit(new io.intercom.android.sdk.m5.helpcenter.states.CollectionsUiEffects.NavigateToCollectionContent(((io.intercom.android.sdk.helpcenter.collections.HelpCenterCollection) kotlin.collections.CollectionsKt.first((java.util.List) r8)).getId()), r11) == r0) goto L78;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x01b5, code lost:
    
        if (r2.emit(new io.intercom.android.sdk.m5.helpcenter.states.CollectionsUiEffects.NavigateToCollectionContent(((io.intercom.android.sdk.helpcenter.collections.HelpCenterCollection) kotlin.collections.CollectionsKt.first(r12)).getId()), r11) == r0) goto L78;
     */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x0072, code lost:
    
        if (r12 == r0) goto L78;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        MutableStateFlow mutableStateFlow;
        HelpCenterApi helpCenterApi;
        MutableStateFlow mutableStateFlow2;
        MetricTracker metricTracker;
        boolean z;
        boolean isFromSearchBrowse;
        ErrorState.WithoutCTA withoutCTA;
        CollectionsUiState error;
        List transformToUiModel;
        List mutableList;
        boolean z2;
        boolean shouldAddSendMessageRow;
        Object ctaData;
        List list;
        List list2;
        MutableSharedFlow mutableSharedFlow;
        MutableSharedFlow mutableSharedFlow2;
        ErrorState.WithCTA errorWithRetry;
        ErrorState.WithoutCTA withoutCTA2;
        CollectionsUiState error2;
        ErrorState.WithoutCTA withoutCTA3;
        ErrorState.WithoutCTA withoutCTA4;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            if (this.this$0.getCollectionsState().getValue() instanceof CollectionsUiState.Content) {
                return Unit.INSTANCE;
            }
            mutableStateFlow = this.this$0._collectionsState;
            mutableStateFlow.setValue(CollectionsUiState.Loading.INSTANCE);
            helpCenterApi = this.this$0.helpCenterApi;
            this.label = 1;
            obj = HelpCenterApi.DefaultImpls.fetchCollections$default(helpCenterApi, null, this, 1, null);
        } else {
            if (i != 1) {
                if (i == 2) {
                    ResultKt.throwOnFailure(obj);
                    return Unit.INSTANCE;
                }
                if (i == 3) {
                    ResultKt.throwOnFailure(obj);
                    return Unit.INSTANCE;
                }
                if (i != 4) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                list = (List) this.L$2;
                mutableStateFlow2 = (MutableStateFlow) this.L$1;
                list2 = (List) this.L$0;
                ResultKt.throwOnFailure(obj);
                list.add(new CollectionsRow.SendMessageRow((ArticleViewState.TeamPresenceState) obj));
                mutableList = list2;
                error = new CollectionsUiState.Content(mutableList);
                mutableStateFlow2.setValue(error);
                return Unit.INSTANCE;
            }
            ResultKt.throwOnFailure(obj);
        }
        NetworkResponse networkResponse = (NetworkResponse) obj;
        mutableStateFlow2 = this.this$0._collectionsState;
        if (networkResponse instanceof NetworkResponse.ServerError) {
            NetworkResponse.ServerError serverError = (NetworkResponse.ServerError) networkResponse;
            this.this$0.sendFailedCollectionListMetric(Boxing.boxInt(serverError.getCode()));
            if (serverError.getCode() == 404) {
                withoutCTA4 = this.this$0.notFoundError;
                error2 = new CollectionsUiState.Error(withoutCTA4);
            } else {
                withoutCTA3 = this.this$0.genericError;
                error2 = new CollectionsUiState.Error(withoutCTA3);
            }
            error = error2;
        } else if (networkResponse instanceof NetworkResponse.ClientError) {
            HelpCenterViewModel.sendFailedCollectionListMetric$default(this.this$0, null, 1, null);
            withoutCTA2 = this.this$0.genericError;
            error = new CollectionsUiState.Error(withoutCTA2);
        } else if (networkResponse instanceof NetworkResponse.NetworkError) {
            HelpCenterViewModel.sendFailedCollectionListMetric$default(this.this$0, null, 1, null);
            final HelpCenterViewModel helpCenterViewModel = this.this$0;
            final Set<String> set = this.$collectionIds;
            errorWithRetry = helpCenterViewModel.errorWithRetry(new Function0() { // from class: io.intercom.android.sdk.m5.helpcenter.HelpCenterViewModel$fetchCollections$1$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    Unit invokeSuspend$lambda$0;
                    invokeSuspend$lambda$0 = HelpCenterViewModel$fetchCollections$1.invokeSuspend$lambda$0(HelpCenterViewModel.this, set);
                    return invokeSuspend$lambda$0;
                }
            });
            error = new CollectionsUiState.Error(errorWithRetry);
        } else {
            if (!(networkResponse instanceof NetworkResponse.Success)) {
                throw new NoWhenBranchMatchedException();
            }
            List list3 = (List) ((NetworkResponse.Success) networkResponse).getBody();
            Set<String> set2 = this.$collectionIds;
            ArrayList arrayList = new ArrayList();
            for (Object obj2 : list3) {
                if (set2.contains(((HelpCenterCollection) obj2).getId())) {
                    arrayList.add(obj2);
                }
            }
            ArrayList arrayList2 = arrayList;
            this.this$0.isPartialHelpCenterLoaded = arrayList2.size() < list3.size() && !arrayList2.isEmpty();
            metricTracker = this.this$0.metricTracker;
            z = this.this$0.isPartialHelpCenterLoaded;
            Boolean boxBoolean = Boxing.boxBoolean(z);
            isFromSearchBrowse = this.this$0.isFromSearchBrowse();
            metricTracker.viewedNativeHelpCenter(MetricTracker.Place.COLLECTION_LIST, boxBoolean, isFromSearchBrowse);
            if (arrayList2.size() == 1) {
                mutableSharedFlow2 = this.this$0._effect;
                this.L$0 = mutableStateFlow2;
                this.label = 2;
            } else if (list3.size() == 1) {
                mutableSharedFlow = this.this$0._effect;
                this.L$0 = mutableStateFlow2;
                this.label = 3;
            } else {
                boolean isEmpty = arrayList2.isEmpty();
                if (!arrayList2.isEmpty()) {
                    list3 = arrayList2;
                }
                if (!list3.isEmpty()) {
                    transformToUiModel = this.this$0.transformToUiModel((List<HelpCenterCollection>) list3);
                    mutableList = CollectionsKt.toMutableList((Collection) transformToUiModel);
                    if (isEmpty) {
                        z2 = this.this$0.isPartialHelpCenterLoaded;
                        if (z2) {
                            mutableList.add(CollectionsRow.FullHelpCenterRow.INSTANCE);
                        }
                    } else {
                        mutableList.add(CollectionsRow.BrowseAllHelpTopicsAsListRow.INSTANCE);
                    }
                    shouldAddSendMessageRow = this.this$0.shouldAddSendMessageRow();
                    if (shouldAddSendMessageRow) {
                        this.L$0 = mutableList;
                        this.L$1 = mutableStateFlow2;
                        this.L$2 = mutableList;
                        this.label = 4;
                        ctaData = this.this$0.getCtaData(this);
                        if (ctaData != coroutine_suspended) {
                            list = mutableList;
                            obj = ctaData;
                            list2 = list;
                            list.add(new CollectionsRow.SendMessageRow((ArticleViewState.TeamPresenceState) obj));
                            mutableList = list2;
                        }
                    }
                    error = new CollectionsUiState.Content(mutableList);
                } else {
                    withoutCTA = this.this$0.genericError;
                    error = new CollectionsUiState.Error(withoutCTA);
                }
            }
            return coroutine_suspended;
        }
        mutableStateFlow2.setValue(error);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invokeSuspend$lambda$0(HelpCenterViewModel helpCenterViewModel, Set set) {
        helpCenterViewModel.fetchCollections(set);
        return Unit.INSTANCE;
    }
}
