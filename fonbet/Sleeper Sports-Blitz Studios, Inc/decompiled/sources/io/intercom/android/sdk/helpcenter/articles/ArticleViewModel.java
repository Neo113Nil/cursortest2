package io.intercom.android.sdk.helpcenter.articles;

import androidx.exifinterface.media.ExifInterface;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelKt;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStoreOwner;
import io.intercom.android.sdk.Injector;
import io.intercom.android.sdk.R;
import io.intercom.android.sdk.api.MessengerApi;
import io.intercom.android.sdk.articles.ArticleWebViewListener;
import io.intercom.android.sdk.helpcenter.api.HelpCenterApi;
import io.intercom.android.sdk.helpcenter.articles.ArticleViewState;
import io.intercom.android.sdk.identity.AppConfig;
import io.intercom.android.sdk.m5.data.CommonRepository;
import io.intercom.android.sdk.m5.data.IntercomDataLayer;
import io.intercom.android.sdk.m5.data.IntercomEvent;
import io.intercom.android.sdk.metrics.MetricTracker;
import io.intercom.android.sdk.models.Conversation;
import io.intercom.android.sdk.ui.theme.ThemeManager;
import io.intercom.android.sdk.ui.theme.ThemeMode;
import io.intercom.android.sdk.utilities.extensions.AppConfigExtensionsKt;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.SharedFlow;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;

/* compiled from: ArticleViewModel.kt */
@Metadata(d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0018\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0001\u0018\u0000 :2\u00020\u00012\u00020\u0002:\u0001:B{\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\u0006\u0012\b\b\u0002\u0010\f\u001a\u00020\r\u0012\b\b\u0002\u0010\u000e\u001a\u00020\r\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u0010\u0012\u0006\u0010\u0011\u001a\u00020\u0012\u0012\u0006\u0010\u0013\u001a\u00020\u0014\u0012\u0012\u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\u00180\u0016\u0012\b\b\u0002\u0010\u0019\u001a\u00020\r¢\u0006\u0004\b\u001a\u0010\u001bJ\u000e\u0010%\u001a\u00020\u00182\u0006\u0010$\u001a\u00020\u0006J\b\u0010&\u001a\u00020\u0018H\u0016J\b\u0010'\u001a\u00020\u0018H\u0016J\b\u0010(\u001a\u00020\u0018H\u0016J\b\u0010)\u001a\u00020\u0018H\u0016J\u0010\u0010*\u001a\u00020\u00182\u0006\u0010+\u001a\u00020\u0017H\u0016J\u0006\u0010,\u001a\u00020\u0018J\u0006\u0010-\u001a\u00020\u0018J\u0006\u0010.\u001a\u00020\u0018J \u0010/\u001a\u00020\u00182\u0006\u0010$\u001a\u00020\u00062\u0006\u0010#\u001a\u00020\u00062\u0006\u00100\u001a\u00020\u0017H\u0002J\u0010\u00101\u001a\u00020\u00182\b\u00102\u001a\u0004\u0018\u00010\u0006J\u0019\u00103\u001a\u00020\u00182\n\b\u0002\u00104\u001a\u0004\u0018\u00010\u0017H\u0002¢\u0006\u0002\u00105J\b\u00106\u001a\u00020\rH\u0002J\u0010\u00107\u001a\u00020\u00182\u0006\u00108\u001a\u000209H\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\rX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0010X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0012X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0014X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\u00180\u0016X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0019\u001a\u00020\rX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001e0\u001dX\u0082\u0004¢\u0006\u0002\n\u0000R\u0017\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u001e0 ¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\"R\u000e\u0010#\u001a\u00020\u0006X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010$\u001a\u00020\u0006X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006;"}, d2 = {"Lio/intercom/android/sdk/helpcenter/articles/ArticleViewModel;", "Landroidx/lifecycle/ViewModel;", "Lio/intercom/android/sdk/articles/ArticleWebViewListener;", "helpCenterApi", "Lio/intercom/android/sdk/helpcenter/api/HelpCenterApi;", "baseUrl", "", "appConfig", "Lio/intercom/android/sdk/identity/AppConfig;", "metricTracker", "Lio/intercom/android/sdk/metrics/MetricTracker;", "metricPlace", "isFromSearchBrowse", "", "shouldHideReactions", "dispatcher", "Lkotlinx/coroutines/CoroutineDispatcher;", "intercomDataLayer", "Lio/intercom/android/sdk/m5/data/IntercomDataLayer;", "commonRepository", "Lio/intercom/android/sdk/m5/data/CommonRepository;", "scrollTo", "Lkotlin/Function1;", "", "", "isSystemInDarkTheme", "<init>", "(Lio/intercom/android/sdk/helpcenter/api/HelpCenterApi;Ljava/lang/String;Lio/intercom/android/sdk/identity/AppConfig;Lio/intercom/android/sdk/metrics/MetricTracker;Ljava/lang/String;ZZLkotlinx/coroutines/CoroutineDispatcher;Lio/intercom/android/sdk/m5/data/IntercomDataLayer;Lio/intercom/android/sdk/m5/data/CommonRepository;Lkotlin/jvm/functions/Function1;Z)V", "_state", "Lkotlinx/coroutines/flow/MutableStateFlow;", "Lio/intercom/android/sdk/helpcenter/articles/ArticleViewState;", "state", "Lkotlinx/coroutines/flow/StateFlow;", "getState", "()Lkotlinx/coroutines/flow/StateFlow;", "articleContentId", "articleId", "fragmentLoaded", "onArticleFinishedLoading", "onArticleLoadingError", "articleNotFound", "onArticleStartedLoading", "scrollArticleViewTo", "y", "sadReactionTapped", "happyReactionTapped", "neutralReactionTapped", "sendReactionToServer", "reactionIndex", "articleContentIdFetched", "value", "sendFailedMetric", "errorCode", "(Ljava/lang/Integer;)V", "shouldAddSendMessageRow", "updateTeamPresence", "conversation", "Lio/intercom/android/sdk/models/Conversation;", "Companion", "intercom-sdk-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class ArticleViewModel extends ViewModel implements ArticleWebViewListener {
    public static final int HAPPY_SERVER_INDEX = 0;
    public static final int NEUTRAL_SERVER_INDEX = 1;
    public static final int SAD_SERVER_INDEX = 2;
    private final MutableStateFlow<ArticleViewState> _state;
    private final AppConfig appConfig;
    private String articleContentId;
    private String articleId;
    private final String baseUrl;
    private final CommonRepository commonRepository;
    private final CoroutineDispatcher dispatcher;
    private final HelpCenterApi helpCenterApi;
    private final IntercomDataLayer intercomDataLayer;
    private final boolean isFromSearchBrowse;
    private final boolean isSystemInDarkTheme;
    private final MetricTracker metricTracker;
    private final Function1<Integer, Unit> scrollTo;
    private final boolean shouldHideReactions;
    private final StateFlow<ArticleViewState> state;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    /* compiled from: ArticleViewModel.kt */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[ThemeMode.values().length];
            try {
                iArr[ThemeMode.DARK.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ThemeMode.LIGHT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[ThemeMode.SYSTEM.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public /* synthetic */ ArticleViewModel(HelpCenterApi helpCenterApi, String str, AppConfig appConfig, MetricTracker metricTracker, String str2, boolean z, boolean z2, CoroutineDispatcher coroutineDispatcher, IntercomDataLayer intercomDataLayer, CommonRepository commonRepository, Function1 function1, boolean z3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(helpCenterApi, str, appConfig, metricTracker, str2, (i & 32) != 0 ? false : z, (i & 64) != 0 ? false : z2, (i & 128) != 0 ? Dispatchers.getIO() : coroutineDispatcher, intercomDataLayer, commonRepository, function1, (i & 2048) != 0 ? false : z3);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ArticleViewModel(HelpCenterApi helpCenterApi, String baseUrl, AppConfig appConfig, MetricTracker metricTracker, String metricPlace, boolean z, boolean z2, CoroutineDispatcher dispatcher, IntercomDataLayer intercomDataLayer, CommonRepository commonRepository, Function1<? super Integer, Unit> scrollTo, boolean z3) {
        Intrinsics.checkNotNullParameter(helpCenterApi, "helpCenterApi");
        Intrinsics.checkNotNullParameter(baseUrl, "baseUrl");
        Intrinsics.checkNotNullParameter(appConfig, "appConfig");
        Intrinsics.checkNotNullParameter(metricTracker, "metricTracker");
        Intrinsics.checkNotNullParameter(metricPlace, "metricPlace");
        Intrinsics.checkNotNullParameter(dispatcher, "dispatcher");
        Intrinsics.checkNotNullParameter(intercomDataLayer, "intercomDataLayer");
        Intrinsics.checkNotNullParameter(commonRepository, "commonRepository");
        Intrinsics.checkNotNullParameter(scrollTo, "scrollTo");
        this.helpCenterApi = helpCenterApi;
        this.baseUrl = baseUrl;
        this.appConfig = appConfig;
        this.metricTracker = metricTracker;
        this.isFromSearchBrowse = z;
        this.shouldHideReactions = z2;
        this.dispatcher = dispatcher;
        this.intercomDataLayer = intercomDataLayer;
        this.commonRepository = commonRepository;
        this.scrollTo = scrollTo;
        this.isSystemInDarkTheme = z3;
        MutableStateFlow<ArticleViewState> MutableStateFlow = StateFlowKt.MutableStateFlow(ArticleViewState.Initial.INSTANCE);
        this._state = MutableStateFlow;
        this.state = FlowKt.asStateFlow(MutableStateFlow);
        this.articleContentId = "";
        this.articleId = "";
        if (!Intrinsics.areEqual(metricPlace, MetricTracker.Place.COLLECTION_LIST)) {
            if (!Intrinsics.areEqual(metricPlace, "article")) {
                metricTracker.openedNativeHelpCenter(metricPlace, Intrinsics.areEqual(metricPlace, MetricTracker.Place.API) ? "article" : MetricTracker.Context.NO_CONTEXT);
            }
        }
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), dispatcher, null, new AnonymousClass1(null), 2, null);
    }

    public final StateFlow<ArticleViewState> getState() {
        return this.state;
    }

    /* compiled from: ArticleViewModel.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "io.intercom.android.sdk.helpcenter.articles.ArticleViewModel$1", f = "ArticleViewModel.kt", i = {}, l = {73}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: io.intercom.android.sdk.helpcenter.articles.ArticleViewModel$1, reason: invalid class name */
    static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        AnonymousClass1(Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return ArticleViewModel.this.new AnonymousClass1(continuation);
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
                final SharedFlow<IntercomEvent> event = ArticleViewModel.this.intercomDataLayer.getEvent();
                Flow<Object> flow = new Flow<Object>() { // from class: io.intercom.android.sdk.helpcenter.articles.ArticleViewModel$1$invokeSuspend$$inlined$filterIsInstance$1

                    /* compiled from: Emitters.kt */
                    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\b\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u00032\u0006\u0010\u0004\u001a\u0002H\u0002H\u008a@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\t"}, d2 = {"<anonymous>", "", ExifInterface.GPS_DIRECTION_TRUE, "R", "value", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx/coroutines/flow/FlowKt__EmittersKt$unsafeTransform$1$1", "kotlinx/coroutines/flow/FlowKt__TransformKt$filter$$inlined$unsafeTransform$1$2", "kotlinx/coroutines/flow/FlowKt__TransformKt$filterIsInstance$$inlined$filter$1$2"}, k = 3, mv = {2, 0, 0}, xi = 48)
                    /* renamed from: io.intercom.android.sdk.helpcenter.articles.ArticleViewModel$1$invokeSuspend$$inlined$filterIsInstance$1$2, reason: invalid class name */
                    public static final class AnonymousClass2<T> implements FlowCollector {
                        final /* synthetic */ FlowCollector $this_unsafeFlow;

                        /* compiled from: Emitters.kt */
                        @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
                        @DebugMetadata(c = "io.intercom.android.sdk.helpcenter.articles.ArticleViewModel$1$invokeSuspend$$inlined$filterIsInstance$1$2", f = "ArticleViewModel.kt", i = {}, l = {219}, m = "emit", n = {}, s = {})
                        /* renamed from: io.intercom.android.sdk.helpcenter.articles.ArticleViewModel$1$invokeSuspend$$inlined$filterIsInstance$1$2$1, reason: invalid class name */
                        public static final class AnonymousClass1 extends ContinuationImpl {
                            Object L$0;
                            Object L$1;
                            int label;
                            /* synthetic */ Object result;

                            public AnonymousClass1(Continuation continuation) {
                                super(continuation);
                            }

                            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                            public final Object invokeSuspend(Object obj) {
                                this.result = obj;
                                this.label |= Integer.MIN_VALUE;
                                return AnonymousClass2.this.emit(null, this);
                            }
                        }

                        public AnonymousClass2(FlowCollector flowCollector) {
                            this.$this_unsafeFlow = flowCollector;
                        }

                        /* JADX WARN: Removed duplicated region for block: B:15:0x0032  */
                        /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
                        @Override // kotlinx.coroutines.flow.FlowCollector
                        /*
                            Code decompiled incorrectly, please refer to instructions dump.
                        */
                        public final Object emit(Object obj, Continuation continuation) {
                            AnonymousClass1 anonymousClass1;
                            int i;
                            if (continuation instanceof AnonymousClass1) {
                                anonymousClass1 = (AnonymousClass1) continuation;
                                if ((anonymousClass1.label & Integer.MIN_VALUE) != 0) {
                                    anonymousClass1.label -= Integer.MIN_VALUE;
                                    Object obj2 = anonymousClass1.result;
                                    Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                                    i = anonymousClass1.label;
                                    if (i != 0) {
                                        ResultKt.throwOnFailure(obj2);
                                        FlowCollector flowCollector = this.$this_unsafeFlow;
                                        if (obj instanceof IntercomEvent.NewConversation) {
                                            anonymousClass1.label = 1;
                                            if (flowCollector.emit(obj, anonymousClass1) == coroutine_suspended) {
                                                return coroutine_suspended;
                                            }
                                        }
                                    } else {
                                        if (i != 1) {
                                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                        }
                                        ResultKt.throwOnFailure(obj2);
                                    }
                                    return Unit.INSTANCE;
                                }
                            }
                            anonymousClass1 = new AnonymousClass1(continuation);
                            Object obj22 = anonymousClass1.result;
                            Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                            i = anonymousClass1.label;
                            if (i != 0) {
                            }
                            return Unit.INSTANCE;
                        }
                    }

                    @Override // kotlinx.coroutines.flow.Flow
                    public Object collect(FlowCollector<? super Object> flowCollector, Continuation continuation) {
                        Object collect = Flow.this.collect(new AnonymousClass2(flowCollector), continuation);
                        return collect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? collect : Unit.INSTANCE;
                    }
                };
                final ArticleViewModel articleViewModel = ArticleViewModel.this;
                this.label = 1;
                if (flow.collect(new FlowCollector() { // from class: io.intercom.android.sdk.helpcenter.articles.ArticleViewModel.1.1
                    public final Object emit(IntercomEvent.NewConversation newConversation, Continuation<? super Unit> continuation) {
                        ArticleViewModel.this.updateTeamPresence(newConversation.getConversation());
                        return Unit.INSTANCE;
                    }

                    @Override // kotlinx.coroutines.flow.FlowCollector
                    public /* bridge */ /* synthetic */ Object emit(Object obj2, Continuation continuation) {
                        return emit((IntercomEvent.NewConversation) obj2, (Continuation<? super Unit>) continuation);
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

    /* JADX WARN: Code restructure failed: missing block: B:8:0x0024, code lost:
    
        if (r11.isSystemInDarkTheme != false) goto L14;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void fragmentLoaded(String articleId) {
        Intrinsics.checkNotNullParameter(articleId, "articleId");
        this.articleId = articleId;
        int i = WhenMappings.$EnumSwitchMapping$0[ThemeManager.INSTANCE.getCurrentThemeMode().ordinal()];
        String str = "dark";
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    throw new NoWhenBranchMatchedException();
                }
            }
            str = "light";
        }
        ArticleViewState.Content content = new ArticleViewState.Content(this.baseUrl + "/articles/" + articleId + "?theme=" + str, new ArticleMetadata(articleId, null, 2, null), ArticleViewState.WebViewStatus.Loading, ArticleViewState.ReactionState.INSTANCE.getDefaultReactionState(), ArticleViewState.TeamPresenceState.INSTANCE.getDefaultTeamPresenceState());
        this._state.setValue(content);
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), this.dispatcher, null, new ArticleViewModel$fragmentLoaded$1(this, articleId, content, null), 2, null);
    }

    @Override // io.intercom.android.sdk.articles.ArticleWebViewListener
    public void onArticleFinishedLoading() {
        this.metricTracker.viewedNativeHelpCenter("article", null, this.isFromSearchBrowse);
        ArticleViewState value = this._state.getValue();
        if (value instanceof ArticleViewState.Content) {
            this._state.setValue(ArticleViewState.Content.copy$default((ArticleViewState.Content) value, null, null, ArticleViewState.WebViewStatus.Ready, null, null, 27, null));
        } else if (!Intrinsics.areEqual(value, ArticleViewState.Initial.INSTANCE) && !(value instanceof ArticleViewState.Error)) {
            throw new NoWhenBranchMatchedException();
        }
    }

    @Override // io.intercom.android.sdk.articles.ArticleWebViewListener
    public void onArticleLoadingError() {
        sendFailedMetric$default(this, null, 1, null);
        this._state.setValue(new ArticleViewState.Error(R.string.intercom_something_went_wrong_try_again, 0, this.appConfig.getPrimaryColor()));
    }

    @Override // io.intercom.android.sdk.articles.ArticleWebViewListener
    public void articleNotFound() {
        sendFailedMetric(404);
        this._state.setValue(new ArticleViewState.Error(R.string.intercom_page_not_found, 8, this.appConfig.getPrimaryColor()));
    }

    @Override // io.intercom.android.sdk.articles.ArticleWebViewListener
    public void onArticleStartedLoading() {
        ArticleViewState value = this._state.getValue();
        if (value instanceof ArticleViewState.Content) {
            this._state.setValue(ArticleViewState.Content.copy$default((ArticleViewState.Content) value, null, null, ArticleViewState.WebViewStatus.Loading, null, null, 27, null));
        } else if (!Intrinsics.areEqual(value, ArticleViewState.Initial.INSTANCE) && !(value instanceof ArticleViewState.Error)) {
            throw new NoWhenBranchMatchedException();
        }
    }

    @Override // io.intercom.android.sdk.articles.ArticleWebViewListener
    public void scrollArticleViewTo(int y) {
        this.scrollTo.invoke(Integer.valueOf(y));
    }

    public final void sadReactionTapped() {
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), this.dispatcher, null, new ArticleViewModel$sadReactionTapped$1(this, null), 2, null);
    }

    public final void happyReactionTapped() {
        ArticleViewState value = this._state.getValue();
        if (value instanceof ArticleViewState.Content) {
            MutableStateFlow<ArticleViewState> mutableStateFlow = this._state;
            ArticleViewState.Content content = (ArticleViewState.Content) value;
            this.metricTracker.sentArticleReaction(MetricTracker.Context.REACTION_HAPPY, null, this.isFromSearchBrowse);
            sendReactionToServer(this.articleId, this.articleContentId, 0);
            mutableStateFlow.setValue(ArticleViewState.Content.copy$default(content, null, null, null, ArticleViewState.ReactionState.copy$default(content.getReactionState(), 0, R.id.happy_end, ArticleViewState.Reaction.Happy, 8, false, 1, null), null, 23, null));
            return;
        }
        if (!Intrinsics.areEqual(value, ArticleViewState.Initial.INSTANCE) && !(value instanceof ArticleViewState.Error)) {
            throw new NoWhenBranchMatchedException();
        }
    }

    public final void neutralReactionTapped() {
        ArticleViewState value = this._state.getValue();
        if (value instanceof ArticleViewState.Content) {
            MutableStateFlow<ArticleViewState> mutableStateFlow = this._state;
            ArticleViewState.Content content = (ArticleViewState.Content) value;
            this.metricTracker.sentArticleReaction(MetricTracker.Context.REACTION_NEUTRAL, null, this.isFromSearchBrowse);
            sendReactionToServer(this.articleId, this.articleContentId, 1);
            mutableStateFlow.setValue(ArticleViewState.Content.copy$default(content, null, null, null, ArticleViewState.ReactionState.copy$default(content.getReactionState(), 0, R.id.neutral_end, ArticleViewState.Reaction.Neutral, 8, false, 1, null), null, 23, null));
            return;
        }
        if (!Intrinsics.areEqual(value, ArticleViewState.Initial.INSTANCE) && !(value instanceof ArticleViewState.Error)) {
            throw new NoWhenBranchMatchedException();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void sendReactionToServer(String articleId, String articleContentId, int reactionIndex) {
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), this.dispatcher, null, new ArticleViewModel$sendReactionToServer$1(this, articleId, reactionIndex, articleContentId, null), 2, null);
    }

    public final void articleContentIdFetched(String value) {
        if (value != null) {
            this.articleContentId = value;
            ArticleViewState value2 = this._state.getValue();
            if (value2 instanceof ArticleViewState.Content) {
                ArticleViewState.Content content = (ArticleViewState.Content) value2;
                this._state.setValue(ArticleViewState.Content.copy$default(content, null, null, null, ArticleViewState.ReactionState.copy$default(content.getReactionState(), this.shouldHideReactions ? 8 : 0, 0, null, 0, false, 30, null), null, 23, null));
            } else if (!Intrinsics.areEqual(value2, ArticleViewState.Initial.INSTANCE) && !(value2 instanceof ArticleViewState.Error)) {
                throw new NoWhenBranchMatchedException();
            }
        }
    }

    static /* synthetic */ void sendFailedMetric$default(ArticleViewModel articleViewModel, Integer num, int i, Object obj) {
        if ((i & 1) != 0) {
            num = null;
        }
        articleViewModel.sendFailedMetric(num);
    }

    private final void sendFailedMetric(Integer errorCode) {
        this.metricTracker.failedHelpCenter(MetricTracker.Object.HELP_CENTER, "article", errorCode != null ? errorCode.toString() : null, this.isFromSearchBrowse);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean shouldAddSendMessageRow() {
        return AppConfigExtensionsKt.canStartNewConversation(this.appConfig) && this.appConfig.getArticleAutoReactionEnabled();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void updateTeamPresence(Conversation conversation) {
        ArticleViewState value = this._state.getValue();
        if (value instanceof ArticleViewState.Content) {
            ArticleViewState.Content content = (ArticleViewState.Content) value;
            if (content.getReactionState().getTransitionState() == R.id.sad_end) {
                this._state.setValue(ArticleViewState.Content.copy$default(content, null, null, null, null, ArticleViewState.TeamPresenceState.copy$default(content.getTeamPresenceState(), null, new ArticleViewState.ConversationState(conversation.getId(), 0, 2, null), null, 0, 0, 0, null, null, false, null, 1021, null), 15, null));
            }
        }
    }

    /* compiled from: ArticleViewModel.kt */
    @Metadata(d1 = {"\u0000I\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\b\u0003*\u0001\u0019\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003JT\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00122\u0012\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00160\u00152\b\b\u0002\u0010\u0017\u001a\u00020\u0012JS\u0010\u0018\u001a\u00020\u00192\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00122\u0012\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00160\u00152\b\b\u0002\u0010\u0017\u001a\u00020\u0012H\u0002¢\u0006\u0002\u0010\u001aR\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u001b"}, d2 = {"Lio/intercom/android/sdk/helpcenter/articles/ArticleViewModel$Companion;", "", "<init>", "()V", "HAPPY_SERVER_INDEX", "", "NEUTRAL_SERVER_INDEX", "SAD_SERVER_INDEX", "create", "Lio/intercom/android/sdk/helpcenter/articles/ArticleViewModel;", "owner", "Landroidx/lifecycle/ViewModelStoreOwner;", "helpCenterApi", "Lio/intercom/android/sdk/helpcenter/api/HelpCenterApi;", "baseUrl", "", "metricPlace", "isFromSearchBrowse", "", "shouldHideReactions", "scrollTo", "Lkotlin/Function1;", "", "isSystemInDarkTheme", "factory", "io/intercom/android/sdk/helpcenter/articles/ArticleViewModel$Companion$factory$1", "(Lio/intercom/android/sdk/helpcenter/api/HelpCenterApi;Ljava/lang/String;Ljava/lang/String;ZZLkotlin/jvm/functions/Function1;Z)Lio/intercom/android/sdk/helpcenter/articles/ArticleViewModel$Companion$factory$1;", "intercom-sdk-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final ArticleViewModel create(ViewModelStoreOwner owner, HelpCenterApi helpCenterApi, String baseUrl, String metricPlace, boolean isFromSearchBrowse, boolean shouldHideReactions, Function1<? super Integer, Unit> scrollTo, boolean isSystemInDarkTheme) {
            Intrinsics.checkNotNullParameter(owner, "owner");
            Intrinsics.checkNotNullParameter(helpCenterApi, "helpCenterApi");
            Intrinsics.checkNotNullParameter(baseUrl, "baseUrl");
            Intrinsics.checkNotNullParameter(metricPlace, "metricPlace");
            Intrinsics.checkNotNullParameter(scrollTo, "scrollTo");
            return (ArticleViewModel) new ViewModelProvider(owner, factory(helpCenterApi, baseUrl, metricPlace, isFromSearchBrowse, shouldHideReactions, scrollTo, isSystemInDarkTheme)).get(ArticleViewModel.class);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX WARN: Type inference failed for: r0v0, types: [io.intercom.android.sdk.helpcenter.articles.ArticleViewModel$Companion$factory$1] */
        public final ArticleViewModel$Companion$factory$1 factory(final HelpCenterApi helpCenterApi, final String baseUrl, final String metricPlace, final boolean isFromSearchBrowse, final boolean shouldHideReactions, final Function1<? super Integer, Unit> scrollTo, final boolean isSystemInDarkTheme) {
            return new ViewModelProvider.Factory() { // from class: io.intercom.android.sdk.helpcenter.articles.ArticleViewModel$Companion$factory$1
                @Override // androidx.lifecycle.ViewModelProvider.Factory
                public <T extends ViewModel> T create(Class<T> modelClass) {
                    Intrinsics.checkNotNullParameter(modelClass, "modelClass");
                    IntercomDataLayer dataLayer = Injector.get().getDataLayer();
                    AppConfig appConfig = Injector.get().getAppConfigProvider().get();
                    Intrinsics.checkNotNullExpressionValue(appConfig, "get(...)");
                    AppConfig appConfig2 = appConfig;
                    MetricTracker metricTracker = Injector.get().getMetricTracker();
                    Intrinsics.checkNotNullExpressionValue(metricTracker, "getMetricTracker(...)");
                    Intrinsics.checkNotNull(dataLayer);
                    MessengerApi messengerApi = Injector.get().getMessengerApi();
                    Intrinsics.checkNotNullExpressionValue(messengerApi, "getMessengerApi(...)");
                    return new ArticleViewModel(HelpCenterApi.this, baseUrl, appConfig2, metricTracker, metricPlace, isFromSearchBrowse, shouldHideReactions, null, dataLayer, new CommonRepository(messengerApi, dataLayer), scrollTo, isSystemInDarkTheme, 128, null);
                }
            };
        }
    }
}
