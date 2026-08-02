package io.intercom.android.sdk.m5.helpcenter;

import android.content.Context;
import android.content.res.Configuration;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelKt;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStoreOwner;
import com.facebook.react.uimanager.ViewProps;
import io.intercom.android.sdk.Injector;
import io.intercom.android.sdk.R;
import io.intercom.android.sdk.api.MessengerApi;
import io.intercom.android.sdk.helpcenter.api.HelpCenterApi;
import io.intercom.android.sdk.helpcenter.articles.ArticleViewState;
import io.intercom.android.sdk.helpcenter.collections.HelpCenterCollection;
import io.intercom.android.sdk.helpcenter.component.TeammateHelpKt;
import io.intercom.android.sdk.helpcenter.sections.HelpCenterArticle;
import io.intercom.android.sdk.helpcenter.sections.HelpCenterCollectionContent;
import io.intercom.android.sdk.helpcenter.utils.HelpCenterEligibilityChecker;
import io.intercom.android.sdk.identity.AppConfig;
import io.intercom.android.sdk.m5.components.ErrorState;
import io.intercom.android.sdk.m5.data.CommonRepository;
import io.intercom.android.sdk.m5.data.IntercomDataLayer;
import io.intercom.android.sdk.m5.helpcenter.states.CollectionDetailsRow;
import io.intercom.android.sdk.m5.helpcenter.states.CollectionDetailsUiState;
import io.intercom.android.sdk.m5.helpcenter.states.CollectionRowData;
import io.intercom.android.sdk.m5.helpcenter.states.CollectionsRow;
import io.intercom.android.sdk.m5.helpcenter.states.CollectionsUiEffects;
import io.intercom.android.sdk.m5.helpcenter.states.CollectionsUiState;
import io.intercom.android.sdk.metrics.MetricTracker;
import io.intercom.android.sdk.models.OpenMessengerResponse;
import io.intercom.android.sdk.models.Space;
import io.intercom.android.sdk.ui.common.StringProvider;
import io.intercom.android.sdk.utilities.ContextLocaliser;
import io.intercom.android.sdk.utilities.extensions.AppConfigExtensionsKt;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.SetsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.FlowKt__ShareKt;
import kotlinx.coroutines.flow.MutableSharedFlow;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.SharedFlow;
import kotlinx.coroutines.flow.SharedFlowKt;
import kotlinx.coroutines.flow.SharingStarted;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;

/* compiled from: HelpCenterViewModel.kt */
@Metadata(d1 = {"\u0000Ð\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\"\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0001\u0018\u0000 T2\u00020\u0001:\u0001TBK\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\b\b\u0002\u0010\n\u001a\u00020\u000b\u0012\b\b\u0002\u0010\f\u001a\u00020\r\u0012\u0006\u0010\u000e\u001a\u00020\u000f\u0012\u0006\u0010\u0010\u001a\u00020\u0011¢\u0006\u0004\b\u0012\u0010\u0013J\u0016\u0010,\u001a\u00020-2\f\u0010.\u001a\b\u0012\u0004\u0012\u0002000/H\u0002J\u000e\u00107\u001a\u0002082\u0006\u00109\u001a\u000208J\u0006\u0010:\u001a\u00020;J\u0016\u0010<\u001a\u0002002\u000e\b\u0002\u0010=\u001a\b\u0012\u0004\u0012\u00020\t0>J\u0019\u0010?\u001a\u0002002\n\b\u0002\u0010@\u001a\u0004\u0018\u00010AH\u0002¢\u0006\u0002\u0010BJ\u001c\u0010C\u001a\b\u0012\u0004\u0012\u00020E0D2\f\u0010F\u001a\b\u0012\u0004\u0012\u00020G0DH\u0002J\u000e\u0010H\u001a\u0002002\u0006\u0010I\u001a\u00020\tJ\u0006\u0010J\u001a\u000200J\b\u0010K\u001a\u00020'H\u0002J\u0019\u0010L\u001a\u0002002\n\b\u0002\u0010@\u001a\u0004\u0018\u00010AH\u0002¢\u0006\u0002\u0010BJ\u0016\u0010C\u001a\b\u0012\u0004\u0012\u00020M0D2\u0006\u0010N\u001a\u00020OH\u0002J\u000e\u0010P\u001a\u000200H\u0082@¢\u0006\u0002\u0010QJ\b\u0010R\u001a\u00020'H\u0002J\u000e\u0010S\u001a\u000202H\u0082@¢\u0006\u0002\u0010QR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0011X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00160\u0015X\u0082\u0004¢\u0006\u0002\n\u0000R\u0017\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00160\u0018¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0014\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001c0\u0015X\u0082\u0004¢\u0006\u0002\n\u0000R\u0017\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001c0\u0018¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001aR\u0014\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020!0 X\u0082\u0004¢\u0006\u0002\n\u0000R\u0017\u0010\"\u001a\b\u0012\u0004\u0012\u00020!0#¢\u0006\b\n\u0000\u001a\u0004\b$\u0010%R\u000e\u0010&\u001a\u00020'X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010(\u001a\u00020'X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010)\u001a\u00020*X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010+\u001a\u00020*X\u0082\u0004¢\u0006\u0002\n\u0000R\u001b\u00101\u001a\u0002028BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b5\u00106\u001a\u0004\b3\u00104¨\u0006U"}, d2 = {"Lio/intercom/android/sdk/m5/helpcenter/HelpCenterViewModel;", "Landroidx/lifecycle/ViewModel;", "helpCenterApi", "Lio/intercom/android/sdk/helpcenter/api/HelpCenterApi;", "appConfig", "Lio/intercom/android/sdk/identity/AppConfig;", "metricTracker", "Lio/intercom/android/sdk/metrics/MetricTracker;", "place", "", "helpCenterEligibilityChecker", "Lio/intercom/android/sdk/helpcenter/utils/HelpCenterEligibilityChecker;", "dispatcher", "Lkotlinx/coroutines/CoroutineDispatcher;", "intercomDataLayer", "Lio/intercom/android/sdk/m5/data/IntercomDataLayer;", "commonRepository", "Lio/intercom/android/sdk/m5/data/CommonRepository;", "<init>", "(Lio/intercom/android/sdk/helpcenter/api/HelpCenterApi;Lio/intercom/android/sdk/identity/AppConfig;Lio/intercom/android/sdk/metrics/MetricTracker;Ljava/lang/String;Lio/intercom/android/sdk/helpcenter/utils/HelpCenterEligibilityChecker;Lkotlinx/coroutines/CoroutineDispatcher;Lio/intercom/android/sdk/m5/data/IntercomDataLayer;Lio/intercom/android/sdk/m5/data/CommonRepository;)V", "_collectionsState", "Lkotlinx/coroutines/flow/MutableStateFlow;", "Lio/intercom/android/sdk/m5/helpcenter/states/CollectionsUiState;", "collectionsState", "Lkotlinx/coroutines/flow/StateFlow;", "getCollectionsState", "()Lkotlinx/coroutines/flow/StateFlow;", "_collectionDetailsState", "Lio/intercom/android/sdk/m5/helpcenter/states/CollectionDetailsUiState;", "collectionDetailsState", "getCollectionDetailsState", "_effect", "Lkotlinx/coroutines/flow/MutableSharedFlow;", "Lio/intercom/android/sdk/m5/helpcenter/states/CollectionsUiEffects;", "effect", "Lkotlinx/coroutines/flow/SharedFlow;", "getEffect", "()Lkotlinx/coroutines/flow/SharedFlow;", "isPartialHelpCenterLoaded", "", "hasClickedAtLeastOneArticle", "genericError", "Lio/intercom/android/sdk/m5/components/ErrorState$WithoutCTA;", "notFoundError", "errorWithRetry", "Lio/intercom/android/sdk/m5/components/ErrorState$WithCTA;", ViewProps.ON_CLICK, "Lkotlin/Function0;", "", "searchBrowseTeamPresenceState", "Lio/intercom/android/sdk/helpcenter/articles/ArticleViewState$TeamPresenceState;", "getSearchBrowseTeamPresenceState", "()Lio/intercom/android/sdk/helpcenter/articles/ArticleViewState$TeamPresenceState;", "searchBrowseTeamPresenceState$delegate", "Lkotlin/Lazy;", "localizedContext", "Landroid/content/Context;", "context", "getScreenTitle", "Lio/intercom/android/sdk/ui/common/StringProvider;", "fetchCollections", "collectionIds", "", "sendFailedCollectionListMetric", "errorCode", "", "(Ljava/lang/Integer;)V", "transformToUiModel", "", "Lio/intercom/android/sdk/m5/helpcenter/states/CollectionsRow$CollectionRow;", "body", "Lio/intercom/android/sdk/helpcenter/collections/HelpCenterCollection;", "fetchCollectionDetails", "collectionId", "onArticleClicked", "shouldAddSendMessageRow", "sendFailedSingleCollectionMetric", "Lio/intercom/android/sdk/m5/helpcenter/states/CollectionDetailsRow;", "networkResponse", "Lio/intercom/android/sdk/helpcenter/sections/HelpCenterCollectionContent;", "onNewConfig", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "isFromSearchBrowse", "getCtaData", "Companion", "intercom-sdk-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class HelpCenterViewModel extends ViewModel {
    private final MutableStateFlow<CollectionDetailsUiState> _collectionDetailsState;
    private final MutableStateFlow<CollectionsUiState> _collectionsState;
    private final MutableSharedFlow<CollectionsUiEffects> _effect;
    private final AppConfig appConfig;
    private final StateFlow<CollectionDetailsUiState> collectionDetailsState;
    private final StateFlow<CollectionsUiState> collectionsState;
    private final CommonRepository commonRepository;
    private final CoroutineDispatcher dispatcher;
    private final SharedFlow<CollectionsUiEffects> effect;
    private final ErrorState.WithoutCTA genericError;
    private boolean hasClickedAtLeastOneArticle;
    private final HelpCenterApi helpCenterApi;
    private final HelpCenterEligibilityChecker helpCenterEligibilityChecker;
    private final IntercomDataLayer intercomDataLayer;
    private boolean isPartialHelpCenterLoaded;
    private final MetricTracker metricTracker;
    private final ErrorState.WithoutCTA notFoundError;
    private final String place;

    /* renamed from: searchBrowseTeamPresenceState$delegate, reason: from kotlin metadata */
    private final Lazy searchBrowseTeamPresenceState;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    public /* synthetic */ HelpCenterViewModel(HelpCenterApi helpCenterApi, AppConfig appConfig, MetricTracker metricTracker, String str, HelpCenterEligibilityChecker helpCenterEligibilityChecker, CoroutineDispatcher coroutineDispatcher, IntercomDataLayer intercomDataLayer, CommonRepository commonRepository, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(helpCenterApi, appConfig, metricTracker, str, (i & 16) != 0 ? HelpCenterEligibilityChecker.INSTANCE : helpCenterEligibilityChecker, (i & 32) != 0 ? Dispatchers.getIO() : coroutineDispatcher, intercomDataLayer, commonRepository);
    }

    public HelpCenterViewModel(HelpCenterApi helpCenterApi, AppConfig appConfig, MetricTracker metricTracker, String place, HelpCenterEligibilityChecker helpCenterEligibilityChecker, CoroutineDispatcher dispatcher, IntercomDataLayer intercomDataLayer, CommonRepository commonRepository) {
        SharedFlow<CollectionsUiEffects> shareIn$default;
        Intrinsics.checkNotNullParameter(helpCenterApi, "helpCenterApi");
        Intrinsics.checkNotNullParameter(appConfig, "appConfig");
        Intrinsics.checkNotNullParameter(metricTracker, "metricTracker");
        Intrinsics.checkNotNullParameter(place, "place");
        Intrinsics.checkNotNullParameter(helpCenterEligibilityChecker, "helpCenterEligibilityChecker");
        Intrinsics.checkNotNullParameter(dispatcher, "dispatcher");
        Intrinsics.checkNotNullParameter(intercomDataLayer, "intercomDataLayer");
        Intrinsics.checkNotNullParameter(commonRepository, "commonRepository");
        this.helpCenterApi = helpCenterApi;
        this.appConfig = appConfig;
        this.metricTracker = metricTracker;
        this.place = place;
        this.helpCenterEligibilityChecker = helpCenterEligibilityChecker;
        this.dispatcher = dispatcher;
        this.intercomDataLayer = intercomDataLayer;
        this.commonRepository = commonRepository;
        MutableStateFlow<CollectionsUiState> MutableStateFlow = StateFlowKt.MutableStateFlow(CollectionsUiState.Initial.INSTANCE);
        this._collectionsState = MutableStateFlow;
        this.collectionsState = FlowKt.asStateFlow(MutableStateFlow);
        MutableStateFlow<CollectionDetailsUiState> MutableStateFlow2 = StateFlowKt.MutableStateFlow(CollectionDetailsUiState.Initial.INSTANCE);
        this._collectionDetailsState = MutableStateFlow2;
        this.collectionDetailsState = FlowKt.asStateFlow(MutableStateFlow2);
        MutableSharedFlow<CollectionsUiEffects> MutableSharedFlow$default = SharedFlowKt.MutableSharedFlow$default(0, 0, null, 7, null);
        this._effect = MutableSharedFlow$default;
        MutableSharedFlow<CollectionsUiEffects> mutableSharedFlow = MutableSharedFlow$default;
        HelpCenterViewModel helpCenterViewModel = this;
        shareIn$default = FlowKt__ShareKt.shareIn$default(mutableSharedFlow, ViewModelKt.getViewModelScope(helpCenterViewModel), SharingStarted.INSTANCE.getEagerly(), 0, 4, null);
        this.effect = shareIn$default;
        this.genericError = new ErrorState.WithoutCTA(0, 0, null, 7, null);
        this.notFoundError = new ErrorState.WithoutCTA(0, R.string.intercom_page_not_found, null, 5, null);
        this.searchBrowseTeamPresenceState = LazyKt.lazy(new Function0() { // from class: io.intercom.android.sdk.m5.helpcenter.HelpCenterViewModel$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                ArticleViewState.TeamPresenceState searchBrowseTeamPresenceState_delegate$lambda$0;
                searchBrowseTeamPresenceState_delegate$lambda$0 = HelpCenterViewModel.searchBrowseTeamPresenceState_delegate$lambda$0(HelpCenterViewModel.this);
                return searchBrowseTeamPresenceState_delegate$lambda$0;
            }
        });
        if (place.length() > 0) {
            metricTracker.openedNativeHelpCenter(place, null);
        }
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(helpCenterViewModel), null, null, new AnonymousClass1(null), 3, null);
    }

    public final StateFlow<CollectionsUiState> getCollectionsState() {
        return this.collectionsState;
    }

    public final StateFlow<CollectionDetailsUiState> getCollectionDetailsState() {
        return this.collectionDetailsState;
    }

    public final SharedFlow<CollectionsUiEffects> getEffect() {
        return this.effect;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final ErrorState.WithCTA errorWithRetry(Function0<Unit> onClick) {
        return new ErrorState.WithCTA(0, 0, null, 0, onClick, 15, null);
    }

    private final ArticleViewState.TeamPresenceState getSearchBrowseTeamPresenceState() {
        return (ArticleViewState.TeamPresenceState) this.searchBrowseTeamPresenceState.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ArticleViewState.TeamPresenceState searchBrowseTeamPresenceState_delegate$lambda$0(HelpCenterViewModel this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        return TeammateHelpKt.computeViewState(null, ArticleViewState.TeamPresenceState.INSTANCE.getDefaultTeamPresenceState(), this$0.intercomDataLayer.getTeamPresence().getValue(), this$0.appConfig, this$0.place, true);
    }

    /* compiled from: HelpCenterViewModel.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "io.intercom.android.sdk.m5.helpcenter.HelpCenterViewModel$1", f = "HelpCenterViewModel.kt", i = {}, l = {100}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: io.intercom.android.sdk.m5.helpcenter.HelpCenterViewModel$1, reason: invalid class name */
    static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        AnonymousClass1(Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return HelpCenterViewModel.this.new AnonymousClass1(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                this.label = 1;
                if (FlowKt.collectLatest(HelpCenterViewModel.this.intercomDataLayer.getConfig(), new C01011(HelpCenterViewModel.this, null), this) == coroutine_suspended) {
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

        /* compiled from: HelpCenterViewModel.kt */
        @Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0015\u0010\u0002\u001a\u00110\u0003¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\b(\u0006H\n"}, d2 = {"<anonymous>", "", "it", "Lio/intercom/android/sdk/identity/AppConfig;", "Lkotlin/ParameterName;", "name", "value"}, k = 3, mv = {2, 0, 0}, xi = 48)
        @DebugMetadata(c = "io.intercom.android.sdk.m5.helpcenter.HelpCenterViewModel$1$1", f = "HelpCenterViewModel.kt", i = {}, l = {101}, m = "invokeSuspend", n = {}, s = {})
        /* renamed from: io.intercom.android.sdk.m5.helpcenter.HelpCenterViewModel$1$1, reason: invalid class name and collision with other inner class name */
        static final class C01011 extends SuspendLambda implements Function2<AppConfig, Continuation<? super Unit>, Object> {
            int label;
            final /* synthetic */ HelpCenterViewModel this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C01011(HelpCenterViewModel helpCenterViewModel, Continuation<? super C01011> continuation) {
                super(2, continuation);
                this.this$0 = helpCenterViewModel;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new C01011(this.this$0, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(AppConfig appConfig, Continuation<? super Unit> continuation) {
                return ((C01011) create(appConfig, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i = this.label;
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    this.label = 1;
                    if (this.this$0.onNewConfig(this) == coroutine_suspended) {
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
    }

    public final Context localizedContext(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        Configuration configuration = new Configuration(context.getResources().getConfiguration());
        configuration.setLocale(ContextLocaliser.convertToLocale(this.appConfig.getHelpCenterLocale()));
        Context createConfigurationContext = context.createConfigurationContext(configuration);
        Intrinsics.checkNotNullExpressionValue(createConfigurationContext, "createConfigurationContext(...)");
        return createConfigurationContext;
    }

    public final StringProvider getScreenTitle() {
        String spaceLabelIfExists = this.appConfig.getSpaceLabelIfExists(Space.Type.HELP);
        if (spaceLabelIfExists != null) {
            return new StringProvider.ActualString(spaceLabelIfExists);
        }
        return new StringProvider.StringRes(R.string.intercom_get_help, null, 2, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void fetchCollections$default(HelpCenterViewModel helpCenterViewModel, Set set, int i, Object obj) {
        if ((i & 1) != 0) {
            set = SetsKt.emptySet();
        }
        helpCenterViewModel.fetchCollections(set);
    }

    public final void fetchCollections(Set<String> collectionIds) {
        Intrinsics.checkNotNullParameter(collectionIds, "collectionIds");
        if (this.helpCenterEligibilityChecker.isEligibleUser()) {
            BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), this.dispatcher, null, new HelpCenterViewModel$fetchCollections$1(this, collectionIds, null), 2, null);
        } else {
            this._collectionsState.setValue(new CollectionsUiState.Error(this.genericError));
        }
    }

    static /* synthetic */ void sendFailedCollectionListMetric$default(HelpCenterViewModel helpCenterViewModel, Integer num, int i, Object obj) {
        if ((i & 1) != 0) {
            num = null;
        }
        helpCenterViewModel.sendFailedCollectionListMetric(num);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void sendFailedCollectionListMetric(Integer errorCode) {
        this.metricTracker.failedHelpCenter(MetricTracker.Object.HELP_CENTER, MetricTracker.Place.COLLECTION_LIST, errorCode != null ? errorCode.toString() : null, isFromSearchBrowse());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final List<CollectionsRow.CollectionRow> transformToUiModel(List<HelpCenterCollection> body) {
        List<HelpCenterCollection> list = body;
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
        for (HelpCenterCollection helpCenterCollection : list) {
            arrayList.add(new CollectionsRow.CollectionRow(new CollectionRowData(helpCenterCollection.getId(), helpCenterCollection.getTitle(), helpCenterCollection.getSummary().length() == 0 ? 8 : 0, helpCenterCollection.getSummary(), helpCenterCollection.getArticlesCount(), helpCenterCollection.getCollectionsCount())));
        }
        return arrayList;
    }

    public final void fetchCollectionDetails(String collectionId) {
        Intrinsics.checkNotNullParameter(collectionId, "collectionId");
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), this.dispatcher, null, new HelpCenterViewModel$fetchCollectionDetails$1(this, collectionId, null), 2, null);
    }

    public final void onArticleClicked() {
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), this.dispatcher, null, new HelpCenterViewModel$onArticleClicked$1(this, null), 2, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean shouldAddSendMessageRow() {
        return AppConfigExtensionsKt.canStartNewConversation(this.appConfig) && this.hasClickedAtLeastOneArticle;
    }

    static /* synthetic */ void sendFailedSingleCollectionMetric$default(HelpCenterViewModel helpCenterViewModel, Integer num, int i, Object obj) {
        if ((i & 1) != 0) {
            num = null;
        }
        helpCenterViewModel.sendFailedSingleCollectionMetric(num);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void sendFailedSingleCollectionMetric(Integer errorCode) {
        this.metricTracker.failedHelpCenter(MetricTracker.Object.HELP_CENTER, MetricTracker.Place.ARTICLE_LIST, errorCode != null ? errorCode.toString() : null, isFromSearchBrowse());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final List<CollectionDetailsRow> transformToUiModel(HelpCenterCollectionContent networkResponse) {
        ArrayList arrayList = new ArrayList();
        List<HelpCenterArticle> helpCenterArticles = networkResponse.getHelpCenterArticles();
        ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(helpCenterArticles, 10));
        for (HelpCenterArticle helpCenterArticle : helpCenterArticles) {
            arrayList2.add(new CollectionDetailsRow.ArticleRow(helpCenterArticle.getArticleId(), helpCenterArticle.getTitle()));
        }
        arrayList.addAll(arrayList2);
        List<HelpCenterCollection> subCollections = networkResponse.getSubCollections();
        ArrayList arrayList3 = new ArrayList(CollectionsKt.collectionSizeOrDefault(subCollections, 10));
        for (HelpCenterCollection helpCenterCollection : subCollections) {
            arrayList3.add(new CollectionDetailsRow.CollectionRow(new CollectionRowData(helpCenterCollection.getId(), helpCenterCollection.getTitle(), helpCenterCollection.getSummary().length() == 0 ? 8 : 0, helpCenterCollection.getSummary(), helpCenterCollection.getArticlesCount(), helpCenterCollection.getCollectionsCount())));
        }
        arrayList.addAll(arrayList3);
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:23:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object onNewConfig(Continuation<? super Unit> continuation) {
        HelpCenterViewModel$onNewConfig$1 helpCenterViewModel$onNewConfig$1;
        int i;
        HelpCenterViewModel helpCenterViewModel;
        MutableStateFlow<CollectionsUiState> mutableStateFlow;
        CollectionsUiState.Content copyWithoutSendMessageRow;
        CollectionsUiState.Content content;
        MutableStateFlow<CollectionsUiState> mutableStateFlow2;
        CollectionDetailsUiState value;
        MutableStateFlow<CollectionDetailsUiState> mutableStateFlow3;
        CollectionDetailsUiState.Content copyWithoutSendMessageRow2;
        CollectionDetailsUiState.Content content2;
        MutableStateFlow<CollectionDetailsUiState> mutableStateFlow4;
        if (continuation instanceof HelpCenterViewModel$onNewConfig$1) {
            helpCenterViewModel$onNewConfig$1 = (HelpCenterViewModel$onNewConfig$1) continuation;
            if ((helpCenterViewModel$onNewConfig$1.label & Integer.MIN_VALUE) != 0) {
                helpCenterViewModel$onNewConfig$1.label -= Integer.MIN_VALUE;
                Object obj = helpCenterViewModel$onNewConfig$1.result;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = helpCenterViewModel$onNewConfig$1.label;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj);
                    CollectionsUiState value2 = this._collectionsState.getValue();
                    if (value2 instanceof CollectionsUiState.Content) {
                        mutableStateFlow = this._collectionsState;
                        if (shouldAddSendMessageRow()) {
                            CollectionsUiState.Content content3 = (CollectionsUiState.Content) value2;
                            helpCenterViewModel$onNewConfig$1.L$0 = this;
                            helpCenterViewModel$onNewConfig$1.L$1 = mutableStateFlow;
                            helpCenterViewModel$onNewConfig$1.L$2 = content3;
                            helpCenterViewModel$onNewConfig$1.label = 1;
                            Object ctaData = getCtaData(helpCenterViewModel$onNewConfig$1);
                            if (ctaData != coroutine_suspended) {
                                content = content3;
                                obj = ctaData;
                                mutableStateFlow2 = mutableStateFlow;
                                helpCenterViewModel = this;
                            }
                            return coroutine_suspended;
                        }
                        copyWithoutSendMessageRow = ((CollectionsUiState.Content) value2).copyWithoutSendMessageRow();
                        helpCenterViewModel = this;
                        mutableStateFlow.setValue(copyWithoutSendMessageRow);
                        value = helpCenterViewModel._collectionDetailsState.getValue();
                        if (value instanceof CollectionDetailsUiState.Content) {
                            mutableStateFlow3 = helpCenterViewModel._collectionDetailsState;
                            if (helpCenterViewModel.shouldAddSendMessageRow()) {
                                CollectionDetailsUiState.Content content4 = (CollectionDetailsUiState.Content) value;
                                helpCenterViewModel$onNewConfig$1.L$0 = mutableStateFlow3;
                                helpCenterViewModel$onNewConfig$1.L$1 = content4;
                                helpCenterViewModel$onNewConfig$1.L$2 = null;
                                helpCenterViewModel$onNewConfig$1.label = 2;
                                Object ctaData2 = helpCenterViewModel.getCtaData(helpCenterViewModel$onNewConfig$1);
                                if (ctaData2 != coroutine_suspended) {
                                    content2 = content4;
                                    obj = ctaData2;
                                    mutableStateFlow4 = mutableStateFlow3;
                                    copyWithoutSendMessageRow2 = content2.copyWithSingleSendMessageRow((ArticleViewState.TeamPresenceState) obj);
                                    mutableStateFlow3 = mutableStateFlow4;
                                    mutableStateFlow3.setValue(copyWithoutSendMessageRow2);
                                }
                                return coroutine_suspended;
                            }
                            copyWithoutSendMessageRow2 = ((CollectionDetailsUiState.Content) value).copyWithoutSendMessageRow();
                            mutableStateFlow3.setValue(copyWithoutSendMessageRow2);
                        }
                        return Unit.INSTANCE;
                    }
                    helpCenterViewModel = this;
                    value = helpCenterViewModel._collectionDetailsState.getValue();
                    if (value instanceof CollectionDetailsUiState.Content) {
                    }
                    return Unit.INSTANCE;
                }
                if (i != 1) {
                    if (i != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    content2 = (CollectionDetailsUiState.Content) helpCenterViewModel$onNewConfig$1.L$1;
                    mutableStateFlow4 = (MutableStateFlow) helpCenterViewModel$onNewConfig$1.L$0;
                    ResultKt.throwOnFailure(obj);
                    copyWithoutSendMessageRow2 = content2.copyWithSingleSendMessageRow((ArticleViewState.TeamPresenceState) obj);
                    mutableStateFlow3 = mutableStateFlow4;
                    mutableStateFlow3.setValue(copyWithoutSendMessageRow2);
                    return Unit.INSTANCE;
                }
                content = (CollectionsUiState.Content) helpCenterViewModel$onNewConfig$1.L$2;
                mutableStateFlow2 = (MutableStateFlow) helpCenterViewModel$onNewConfig$1.L$1;
                helpCenterViewModel = (HelpCenterViewModel) helpCenterViewModel$onNewConfig$1.L$0;
                ResultKt.throwOnFailure(obj);
                copyWithoutSendMessageRow = content.copyWithSingleSendMessageRow((ArticleViewState.TeamPresenceState) obj);
                mutableStateFlow = mutableStateFlow2;
                mutableStateFlow.setValue(copyWithoutSendMessageRow);
                value = helpCenterViewModel._collectionDetailsState.getValue();
                if (value instanceof CollectionDetailsUiState.Content) {
                }
                return Unit.INSTANCE;
            }
        }
        helpCenterViewModel$onNewConfig$1 = new HelpCenterViewModel$onNewConfig$1(this, continuation);
        Object obj2 = helpCenterViewModel$onNewConfig$1.result;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = helpCenterViewModel$onNewConfig$1.label;
        if (i != 0) {
        }
        copyWithoutSendMessageRow = content.copyWithSingleSendMessageRow((ArticleViewState.TeamPresenceState) obj2);
        mutableStateFlow = mutableStateFlow2;
        mutableStateFlow.setValue(copyWithoutSendMessageRow);
        value = helpCenterViewModel._collectionDetailsState.getValue();
        if (value instanceof CollectionDetailsUiState.Content) {
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean isFromSearchBrowse() {
        return Intrinsics.areEqual(this.place, "search_browse");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object getCtaData(Continuation<? super ArticleViewState.TeamPresenceState> continuation) {
        HelpCenterViewModel$getCtaData$1 helpCenterViewModel$getCtaData$1;
        int i;
        HelpCenterViewModel helpCenterViewModel;
        OpenMessengerResponse openMessengerResponse;
        OpenMessengerResponse.NewConversationData newConversationData;
        if (continuation instanceof HelpCenterViewModel$getCtaData$1) {
            helpCenterViewModel$getCtaData$1 = (HelpCenterViewModel$getCtaData$1) continuation;
            if ((helpCenterViewModel$getCtaData$1.label & Integer.MIN_VALUE) != 0) {
                helpCenterViewModel$getCtaData$1.label -= Integer.MIN_VALUE;
                Object obj = helpCenterViewModel$getCtaData$1.result;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = helpCenterViewModel$getCtaData$1.label;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj);
                    CommonRepository commonRepository = this.commonRepository;
                    helpCenterViewModel$getCtaData$1.L$0 = this;
                    helpCenterViewModel$getCtaData$1.label = 1;
                    obj = commonRepository.openMessenger(helpCenterViewModel$getCtaData$1);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    helpCenterViewModel = this;
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    helpCenterViewModel = (HelpCenterViewModel) helpCenterViewModel$getCtaData$1.L$0;
                    ResultKt.throwOnFailure(obj);
                }
                openMessengerResponse = (OpenMessengerResponse) obj;
                if (openMessengerResponse == null && (newConversationData = openMessengerResponse.getNewConversationData()) != null) {
                }
                return helpCenterViewModel.getSearchBrowseTeamPresenceState();
            }
        }
        helpCenterViewModel$getCtaData$1 = new HelpCenterViewModel$getCtaData$1(this, continuation);
        Object obj2 = helpCenterViewModel$getCtaData$1.result;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = helpCenterViewModel$getCtaData$1.label;
        if (i != 0) {
        }
        openMessengerResponse = (OpenMessengerResponse) obj2;
        return openMessengerResponse == null ? helpCenterViewModel.getSearchBrowseTeamPresenceState() : ArticleViewState.TeamPresenceState.copy$default(helpCenterViewModel.getSearchBrowseTeamPresenceState(), null, null, null, 0, 0, 0, null, null, false, newConversationData.getCta(), 511, null);
    }

    /* compiled from: HelpCenterViewModel.kt */
    @Metadata(d1 = {"\u0000+\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\b\u0003*\u0001\r\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001e\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bJ\u001d\u0010\f\u001a\u00020\r2\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0002¢\u0006\u0002\u0010\u000e¨\u0006\u000f"}, d2 = {"Lio/intercom/android/sdk/m5/helpcenter/HelpCenterViewModel$Companion;", "", "<init>", "()V", "create", "Lio/intercom/android/sdk/m5/helpcenter/HelpCenterViewModel;", "owner", "Landroidx/lifecycle/ViewModelStoreOwner;", "helpCenterApi", "Lio/intercom/android/sdk/helpcenter/api/HelpCenterApi;", "place", "", "factory", "io/intercom/android/sdk/m5/helpcenter/HelpCenterViewModel$Companion$factory$1", "(Lio/intercom/android/sdk/helpcenter/api/HelpCenterApi;Ljava/lang/String;)Lio/intercom/android/sdk/m5/helpcenter/HelpCenterViewModel$Companion$factory$1;", "intercom-sdk-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final HelpCenterViewModel create(ViewModelStoreOwner owner, HelpCenterApi helpCenterApi, String place) {
            Intrinsics.checkNotNullParameter(owner, "owner");
            Intrinsics.checkNotNullParameter(helpCenterApi, "helpCenterApi");
            Intrinsics.checkNotNullParameter(place, "place");
            return (HelpCenterViewModel) new ViewModelProvider(owner, factory(helpCenterApi, place)).get(HelpCenterViewModel.class);
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [io.intercom.android.sdk.m5.helpcenter.HelpCenterViewModel$Companion$factory$1] */
        private final HelpCenterViewModel$Companion$factory$1 factory(final HelpCenterApi helpCenterApi, final String place) {
            return new ViewModelProvider.Factory() { // from class: io.intercom.android.sdk.m5.helpcenter.HelpCenterViewModel$Companion$factory$1
                @Override // androidx.lifecycle.ViewModelProvider.Factory
                public <T extends ViewModel> T create(Class<T> modelClass) {
                    Intrinsics.checkNotNullParameter(modelClass, "modelClass");
                    IntercomDataLayer dataLayer = Injector.get().getDataLayer();
                    HelpCenterApi helpCenterApi2 = HelpCenterApi.this;
                    AppConfig appConfig = Injector.get().getAppConfigProvider().get();
                    Intrinsics.checkNotNullExpressionValue(appConfig, "get(...)");
                    AppConfig appConfig2 = appConfig;
                    MetricTracker metricTracker = Injector.get().getMetricTracker();
                    Intrinsics.checkNotNullExpressionValue(metricTracker, "getMetricTracker(...)");
                    String str = place;
                    Intrinsics.checkNotNull(dataLayer);
                    MessengerApi messengerApi = Injector.get().getMessengerApi();
                    Intrinsics.checkNotNullExpressionValue(messengerApi, "getMessengerApi(...)");
                    return new HelpCenterViewModel(helpCenterApi2, appConfig2, metricTracker, str, null, null, dataLayer, new CommonRepository(messengerApi, dataLayer), 48, null);
                }
            };
        }
    }
}
