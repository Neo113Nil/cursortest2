package io.intercom.android.sdk.tickets.create.model;

import android.content.Context;
import android.webkit.MimeTypeMap;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelKt;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStoreOwner;
import com.facebook.appevents.iap.InAppPurchaseConstants;
import com.socure.docv.capturesdk.common.analytics.AnalyticsConstantsKt;
import io.intercom.android.sdk.Injector;
import io.intercom.android.sdk.blocks.lib.models.TicketTypeV2;
import io.intercom.android.sdk.identity.AppConfig;
import io.intercom.android.sdk.identity.UserIdentity;
import io.intercom.android.sdk.m5.components.ErrorState;
import io.intercom.android.sdk.m5.conversation.ui.components.composer.MediaData;
import io.intercom.android.sdk.metrics.MetricTracker;
import io.intercom.android.sdk.survey.QuestionState;
import io.intercom.android.sdk.survey.model.SurveyData;
import io.intercom.android.sdk.survey.ui.models.Answer;
import io.intercom.android.sdk.survey.ui.questiontype.AnswerClickData;
import io.intercom.android.sdk.tickets.create.data.TicketAttributeRequest;
import io.intercom.android.sdk.tickets.create.data.TicketRepository;
import io.intercom.android.sdk.tickets.create.model.CreateTicketViewModel;
import io.intercom.android.sdk.tickets.create.reducers.ConditionalAttributesReducerKt;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Set;
import kotlin.KotlinNothingValueException;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
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
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableSharedFlow;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.SharedFlow;
import kotlinx.coroutines.flow.SharedFlowKt;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;

/* compiled from: CreateTicketViewModel.kt */
@Metadata(d1 = {"\u0000º\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\"\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\b\u0001\u0018\u0000 L2\u00020\u0001:\u0003LMNB]\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\t\u0012\b\b\u0002\u0010\n\u001a\u00020\u000b\u0012\b\b\u0002\u0010\f\u001a\u00020\r\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u000f\u0012\u0006\u0010\u0010\u001a\u00020\u0011\u0012\b\b\u0002\u0010\u0012\u001a\u00020\u0013¢\u0006\u0004\b\u0014\u0010\u0015J\n\u0010(\u001a\u0004\u0018\u00010\u0018H\u0002J\u0018\u0010)\u001a\u00020*2\u000e\b\u0002\u0010+\u001a\b\u0012\u0004\u0012\u00020-0,H\u0002J\u0012\u0010.\u001a\u00020*2\n\b\u0002\u0010/\u001a\u0004\u0018\u000100J\u000e\u00101\u001a\u00020*2\u0006\u00102\u001a\u00020\u000fJ\u001e\u00103\u001a\u0002042\u0006\u00105\u001a\u0002062\f\u00107\u001a\b\u0012\u0004\u0012\u00020\u000f08H\u0002J\u0010\u00109\u001a\u0002042\u0006\u00105\u001a\u000206H\u0002J \u0010:\u001a\u0002042\u0006\u0010;\u001a\u00020<2\u0006\u0010=\u001a\u00020\u00112\u0006\u0010>\u001a\u00020\u0011H\u0002J\u001c\u0010?\u001a\u00020*2\u0012\u0010@\u001a\u000e\u0012\u0004\u0012\u00020\u001e\u0012\u0004\u0012\u00020*0AH\u0002J\u000e\u0010B\u001a\b\u0012\u0004\u0012\u00020-0,H\u0002J\u000e\u0010C\u001a\u00020*2\u0006\u0010D\u001a\u00020EJ\u000e\u0010F\u001a\u00020*2\u0006\u0010D\u001a\u00020EJ\b\u0010G\u001a\u00020*H\u0002J\u0016\u0010H\u001a\u00020*2\f\u0010I\u001a\b\u0012\u0004\u0012\u00020<0,H\u0002J\u000e\u0010J\u001a\u00020*2\u0006\u0010K\u001a\u00020ER\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u000e\u001a\u0004\u0018\u00010\u000fX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0011X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0013X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00180\u0017X\u0082\u0004¢\u0006\u0002\n\u0000R\u0017\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00180\u001a¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR\u0010\u0010\u001d\u001a\u0004\u0018\u00010\u001eX\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020!0 X\u0082\u0004¢\u0006\u0002\n\u0000R\u0017\u0010\"\u001a\b\u0012\u0004\u0012\u00020!0#¢\u0006\b\n\u0000\u001a\u0004\b$\u0010%R\u0010\u0010&\u001a\u0004\u0018\u00010'X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006O"}, d2 = {"Lio/intercom/android/sdk/tickets/create/model/CreateTicketViewModel;", "Landroidx/lifecycle/ViewModel;", "launchedFrom", "Lio/intercom/android/sdk/tickets/create/model/CreateTicketLaunchedFrom;", "ticketRepository", "Lio/intercom/android/sdk/tickets/create/data/TicketRepository;", "userIdentity", "Lio/intercom/android/sdk/identity/UserIdentity;", AnalyticsConstantsKt.KEY_CONFIG, "Lio/intercom/android/sdk/identity/AppConfig;", "dispatcher", "Lkotlinx/coroutines/CoroutineDispatcher;", "metricTracker", "Lio/intercom/android/sdk/metrics/MetricTracker;", "conversationId", "", "ticketTypeId", "", "applicationContext", "Landroid/content/Context;", "<init>", "(Lio/intercom/android/sdk/tickets/create/model/CreateTicketLaunchedFrom;Lio/intercom/android/sdk/tickets/create/data/TicketRepository;Lio/intercom/android/sdk/identity/UserIdentity;Lio/intercom/android/sdk/identity/AppConfig;Lkotlinx/coroutines/CoroutineDispatcher;Lio/intercom/android/sdk/metrics/MetricTracker;Ljava/lang/String;ILandroid/content/Context;)V", "_uiState", "Lkotlinx/coroutines/flow/MutableStateFlow;", "Lio/intercom/android/sdk/tickets/create/model/CreateTicketViewModel$CreateTicketFormUiState;", "uiState", "Lkotlinx/coroutines/flow/StateFlow;", "getUiState", "()Lkotlinx/coroutines/flow/StateFlow;", "lastKnownContentState", "Lio/intercom/android/sdk/tickets/create/model/CreateTicketViewModel$CreateTicketFormUiState$Content;", "_effect", "Lkotlinx/coroutines/flow/MutableSharedFlow;", "Lio/intercom/android/sdk/tickets/create/model/CreateTicketViewModel$TicketSideEffect;", "effect", "Lkotlinx/coroutines/flow/SharedFlow;", "getEffect", "()Lkotlinx/coroutines/flow/SharedFlow;", "currentTicketType", "Lio/intercom/android/sdk/blocks/lib/models/TicketTypeV2;", "getLastKnownContent", "fetchTicketType", "", "attributes", "", "Lio/intercom/android/sdk/tickets/create/data/TicketAttributeRequest;", "createTicket", "compositionAwareScope", "Lkotlinx/coroutines/CoroutineScope;", "onAnswerUpdated", "questionID", "isUnsupportedFileType", "", "data", "Lio/intercom/android/sdk/m5/conversation/ui/components/composer/MediaData$Media;", "supportedFileType", "", "isFileSizeExceeded", "canRetryFileLimitExceededError", "mediaItem", "Lio/intercom/android/sdk/survey/ui/models/Answer$MediaAnswer$MediaItem;", "index", "maxSelection", "withState", "operation", "Lkotlin/Function1;", "getAttributeRequest", "onRetryFileClicked", "fileClickData", "Lio/intercom/android/sdk/survey/ui/questiontype/AnswerClickData;", "onDeleteFileClicked", "updateCtaState", "compressAndUploadFileAttachments", "mediaItems", "onAnswerClicked", "answerClickData", "Companion", "CreateTicketFormUiState", "TicketSideEffect", "intercom-sdk-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class CreateTicketViewModel extends ViewModel {
    private final MutableSharedFlow<TicketSideEffect> _effect;
    private final MutableStateFlow<CreateTicketFormUiState> _uiState;
    private final Context applicationContext;
    private final AppConfig config;
    private final String conversationId;
    private TicketTypeV2 currentTicketType;
    private final CoroutineDispatcher dispatcher;
    private final SharedFlow<TicketSideEffect> effect;
    private CreateTicketFormUiState.Content lastKnownContentState;
    private final CreateTicketLaunchedFrom launchedFrom;
    private final MetricTracker metricTracker;
    private final TicketRepository ticketRepository;
    private final int ticketTypeId;
    private final StateFlow<CreateTicketFormUiState> uiState;
    private final UserIdentity userIdentity;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    public /* synthetic */ CreateTicketViewModel(CreateTicketLaunchedFrom createTicketLaunchedFrom, TicketRepository ticketRepository, UserIdentity userIdentity, AppConfig appConfig, CoroutineDispatcher coroutineDispatcher, MetricTracker metricTracker, String str, int i, Context context, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(createTicketLaunchedFrom, (i2 & 2) != 0 ? new TicketRepository(null, null, null, null, null, 31, null) : ticketRepository, (i2 & 4) != 0 ? Injector.get().getUserIdentity() : userIdentity, (i2 & 8) != 0 ? Injector.get().getAppConfigProvider().get() : appConfig, (i2 & 16) != 0 ? Dispatchers.getIO() : coroutineDispatcher, (i2 & 32) != 0 ? Injector.get().getMetricTracker() : metricTracker, str, i, (i2 & 256) != 0 ? Injector.get().getApplication() : context);
    }

    public CreateTicketViewModel(CreateTicketLaunchedFrom launchedFrom, TicketRepository ticketRepository, UserIdentity userIdentity, AppConfig config, CoroutineDispatcher dispatcher, MetricTracker metricTracker, String str, int i, Context applicationContext) {
        Intrinsics.checkNotNullParameter(launchedFrom, "launchedFrom");
        Intrinsics.checkNotNullParameter(ticketRepository, "ticketRepository");
        Intrinsics.checkNotNullParameter(userIdentity, "userIdentity");
        Intrinsics.checkNotNullParameter(config, "config");
        Intrinsics.checkNotNullParameter(dispatcher, "dispatcher");
        Intrinsics.checkNotNullParameter(metricTracker, "metricTracker");
        Intrinsics.checkNotNullParameter(applicationContext, "applicationContext");
        this.launchedFrom = launchedFrom;
        this.ticketRepository = ticketRepository;
        this.userIdentity = userIdentity;
        this.config = config;
        this.dispatcher = dispatcher;
        this.metricTracker = metricTracker;
        this.conversationId = str;
        this.ticketTypeId = i;
        this.applicationContext = applicationContext;
        MutableStateFlow<CreateTicketFormUiState> MutableStateFlow = StateFlowKt.MutableStateFlow(CreateTicketFormUiState.Initial.INSTANCE);
        this._uiState = MutableStateFlow;
        this.uiState = FlowKt.asStateFlow(MutableStateFlow);
        MutableSharedFlow<TicketSideEffect> MutableSharedFlow$default = SharedFlowKt.MutableSharedFlow$default(0, 0, null, 7, null);
        this._effect = MutableSharedFlow$default;
        this.effect = FlowKt.asSharedFlow(MutableSharedFlow$default);
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), dispatcher, null, new AnonymousClass1(null), 2, null);
        metricTracker.viewedCreateTicketForm(Integer.valueOf(i), str == null ? "" : str, launchedFrom.getFrom());
        fetchTicketType$default(this, null, 1, null);
    }

    public final StateFlow<CreateTicketFormUiState> getUiState() {
        return this.uiState;
    }

    public final SharedFlow<TicketSideEffect> getEffect() {
        return this.effect;
    }

    /* compiled from: CreateTicketViewModel.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "io.intercom.android.sdk.tickets.create.model.CreateTicketViewModel$1", f = "CreateTicketViewModel.kt", i = {}, l = {86}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: io.intercom.android.sdk.tickets.create.model.CreateTicketViewModel$1, reason: invalid class name */
    static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        AnonymousClass1(Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return CreateTicketViewModel.this.new AnonymousClass1(continuation);
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
                MutableStateFlow mutableStateFlow = CreateTicketViewModel.this._uiState;
                final CreateTicketViewModel createTicketViewModel = CreateTicketViewModel.this;
                this.label = 1;
                if (mutableStateFlow.collect(new FlowCollector() { // from class: io.intercom.android.sdk.tickets.create.model.CreateTicketViewModel.1.1
                    @Override // kotlinx.coroutines.flow.FlowCollector
                    public /* bridge */ /* synthetic */ Object emit(Object obj2, Continuation continuation) {
                        return emit((CreateTicketFormUiState) obj2, (Continuation<? super Unit>) continuation);
                    }

                    public final Object emit(CreateTicketFormUiState createTicketFormUiState, Continuation<? super Unit> continuation) {
                        if (createTicketFormUiState instanceof CreateTicketFormUiState.Content) {
                            CreateTicketViewModel.this.lastKnownContentState = (CreateTicketFormUiState.Content) createTicketFormUiState;
                        }
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
            throw new KotlinNothingValueException();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final CreateTicketFormUiState getLastKnownContent() {
        return this._uiState.getValue() instanceof CreateTicketFormUiState.Content ? this._uiState.getValue() : this.lastKnownContentState;
    }

    /* JADX WARN: Multi-variable type inference failed */
    static /* synthetic */ void fetchTicketType$default(CreateTicketViewModel createTicketViewModel, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            list = CollectionsKt.emptyList();
        }
        createTicketViewModel.fetchTicketType(list);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void fetchTicketType(List<TicketAttributeRequest> attributes) {
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), this.dispatcher, null, new CreateTicketViewModel$fetchTicketType$1(this, attributes, null), 2, null);
    }

    public static /* synthetic */ void createTicket$default(CreateTicketViewModel createTicketViewModel, CoroutineScope coroutineScope, int i, Object obj) {
        if ((i & 1) != 0) {
            coroutineScope = null;
        }
        createTicketViewModel.createTicket(coroutineScope);
    }

    public final void createTicket(final CoroutineScope compositionAwareScope) {
        MetricTracker metricTracker = this.metricTracker;
        Integer valueOf = Integer.valueOf(this.ticketTypeId);
        String str = this.conversationId;
        if (str == null) {
            str = "";
        }
        metricTracker.submittedCreateTicketForm(valueOf, str, this.launchedFrom.getFrom());
        withState(new Function1() { // from class: io.intercom.android.sdk.tickets.create.model.CreateTicketViewModel$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                Unit createTicket$lambda$0;
                createTicket$lambda$0 = CreateTicketViewModel.createTicket$lambda$0(CreateTicketViewModel.this, compositionAwareScope, (CreateTicketViewModel.CreateTicketFormUiState.Content) obj);
                return createTicket$lambda$0;
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit createTicket$lambda$0(CreateTicketViewModel this$0, CoroutineScope coroutineScope, CreateTicketFormUiState.Content content) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(content, "content");
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this$0), this$0.dispatcher, null, new CreateTicketViewModel$createTicket$1$1(content, this$0, coroutineScope, null), 2, null);
        return Unit.INSTANCE;
    }

    public final void onAnswerUpdated(final String questionID) {
        Intrinsics.checkNotNullParameter(questionID, "questionID");
        withState(new Function1() { // from class: io.intercom.android.sdk.tickets.create.model.CreateTicketViewModel$$ExternalSyntheticLambda5
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                Unit onAnswerUpdated$lambda$3;
                onAnswerUpdated$lambda$3 = CreateTicketViewModel.onAnswerUpdated$lambda$3(questionID, this, (CreateTicketViewModel.CreateTicketFormUiState.Content) obj);
                return onAnswerUpdated$lambda$3;
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onAnswerUpdated$lambda$3(String questionID, final CreateTicketViewModel this$0, CreateTicketFormUiState.Content content) {
        Intrinsics.checkNotNullParameter(questionID, "$questionID");
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(content, "content");
        List<TicketAttributeRequest> reduceAttributeList = ConditionalAttributesReducerKt.reduceAttributeList(questionID, this$0.currentTicketType, content);
        if (!reduceAttributeList.isEmpty()) {
            this$0.withState(new Function1() { // from class: io.intercom.android.sdk.tickets.create.model.CreateTicketViewModel$$ExternalSyntheticLambda3
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    Unit onAnswerUpdated$lambda$3$lambda$2$lambda$1;
                    onAnswerUpdated$lambda$3$lambda$2$lambda$1 = CreateTicketViewModel.onAnswerUpdated$lambda$3$lambda$2$lambda$1(CreateTicketViewModel.this, (CreateTicketViewModel.CreateTicketFormUiState.Content) obj);
                    return onAnswerUpdated$lambda$3$lambda$2$lambda$1;
                }
            });
            this$0.fetchTicketType(reduceAttributeList);
        }
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this$0), this$0.dispatcher, null, new CreateTicketViewModel$onAnswerUpdated$1$2(content, this$0, null), 2, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onAnswerUpdated$lambda$3$lambda$2$lambda$1(CreateTicketViewModel this$0, CreateTicketFormUiState.Content it) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(it, "it");
        this$0._uiState.setValue(CreateTicketFormUiState.Content.copy$default(it, null, null, true, false, 11, null));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean isUnsupportedFileType(MediaData.Media data, Set<String> supportedFileType) {
        return !CollectionsKt.contains(supportedFileType, MimeTypeMap.getSingleton().getExtensionFromMimeType(data.getMimeType()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean isFileSizeExceeded(MediaData.Media data) {
        return data.getSize() > this.config.getAttachmentSettings().getUploadSizeLimit();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean canRetryFileLimitExceededError(Answer.MediaAnswer.MediaItem mediaItem, int index, int maxSelection) {
        if (!(mediaItem.getUploadStatus() instanceof Answer.MediaAnswer.FileUploadStatus.Error)) {
            return false;
        }
        Answer.MediaAnswer.FileUploadStatus uploadStatus = mediaItem.getUploadStatus();
        Intrinsics.checkNotNull(uploadStatus, "null cannot be cast to non-null type io.intercom.android.sdk.survey.ui.models.Answer.MediaAnswer.FileUploadStatus.Error");
        return (((Answer.MediaAnswer.FileUploadStatus.Error) uploadStatus).getError() instanceof Answer.MediaAnswer.FileUploadError.FileLimitExceeded) && index < maxSelection;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void withState(Function1<? super CreateTicketFormUiState.Content, Unit> operation) {
        if (this._uiState.getValue() instanceof CreateTicketFormUiState.Content) {
            CreateTicketFormUiState value = this._uiState.getValue();
            Intrinsics.checkNotNull(value, "null cannot be cast to non-null type io.intercom.android.sdk.tickets.create.model.CreateTicketViewModel.CreateTicketFormUiState.Content");
            operation.invoke((CreateTicketFormUiState.Content) value);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final List<TicketAttributeRequest> getAttributeRequest() {
        final ArrayList arrayList = new ArrayList();
        withState(new Function1() { // from class: io.intercom.android.sdk.tickets.create.model.CreateTicketViewModel$$ExternalSyntheticLambda4
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                Unit attributeRequest$lambda$6;
                attributeRequest$lambda$6 = CreateTicketViewModel.getAttributeRequest$lambda$6(arrayList, (CreateTicketViewModel.CreateTicketFormUiState.Content) obj);
                return attributeRequest$lambda$6;
            }
        });
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit getAttributeRequest$lambda$6(List list, CreateTicketFormUiState.Content content) {
        Object formatAnswerForServer;
        Intrinsics.checkNotNullParameter(list, "$list");
        Intrinsics.checkNotNullParameter(content, "content");
        List<QuestionState> questions = content.getQuestions();
        ArrayList<QuestionState> arrayList = new ArrayList();
        for (Object obj : questions) {
            if (!Intrinsics.areEqual(((QuestionState) obj).getQuestionModel().getId(), CreateTicketViewModelKt.EmailId)) {
                arrayList.add(obj);
            }
        }
        for (QuestionState questionState : arrayList) {
            formatAnswerForServer = CreateTicketViewModelKt.formatAnswerForServer(questionState);
            if (!Intrinsics.areEqual(formatAnswerForServer, Unit.INSTANCE)) {
                list.add(new TicketAttributeRequest(questionState.getQuestionModel().getId(), formatAnswerForServer));
            }
        }
        return Unit.INSTANCE;
    }

    public final void onRetryFileClicked(final AnswerClickData fileClickData) {
        Intrinsics.checkNotNullParameter(fileClickData, "fileClickData");
        withState(new Function1() { // from class: io.intercom.android.sdk.tickets.create.model.CreateTicketViewModel$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                Unit onRetryFileClicked$lambda$9;
                onRetryFileClicked$lambda$9 = CreateTicketViewModel.onRetryFileClicked$lambda$9(CreateTicketViewModel.this, fileClickData, (CreateTicketViewModel.CreateTicketFormUiState.Content) obj);
                return onRetryFileClicked$lambda$9;
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onRetryFileClicked$lambda$9(CreateTicketViewModel this$0, AnswerClickData fileClickData, CreateTicketFormUiState.Content content) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(fileClickData, "$fileClickData");
        Intrinsics.checkNotNullParameter(content, "content");
        for (QuestionState questionState : content.getQuestions()) {
            if (Intrinsics.areEqual(questionState.getQuestionModel().getId(), fileClickData.getQuestionId())) {
                Answer answer = questionState.getAnswer();
                Intrinsics.checkNotNull(answer, "null cannot be cast to non-null type io.intercom.android.sdk.survey.ui.models.Answer.MediaAnswer");
                Answer.MediaAnswer mediaAnswer = (Answer.MediaAnswer) answer;
                for (Answer.MediaAnswer.MediaItem mediaItem : mediaAnswer.getMediaItems()) {
                    if (Intrinsics.areEqual(mediaItem, fileClickData.getClickedItem())) {
                        mediaItem.setUploadStatus(Answer.MediaAnswer.FileUploadStatus.None.INSTANCE);
                        questionState.setAnswer(new Answer.MediaAnswer(mediaAnswer.getMediaItems()));
                        this$0.onAnswerUpdated(fileClickData.getQuestionId());
                        return Unit.INSTANCE;
                    }
                }
                throw new NoSuchElementException("Collection contains no element matching the predicate.");
            }
        }
        throw new NoSuchElementException("Collection contains no element matching the predicate.");
    }

    public final void onDeleteFileClicked(final AnswerClickData fileClickData) {
        Intrinsics.checkNotNullParameter(fileClickData, "fileClickData");
        withState(new Function1() { // from class: io.intercom.android.sdk.tickets.create.model.CreateTicketViewModel$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                Unit onDeleteFileClicked$lambda$11;
                onDeleteFileClicked$lambda$11 = CreateTicketViewModel.onDeleteFileClicked$lambda$11(AnswerClickData.this, this, (CreateTicketViewModel.CreateTicketFormUiState.Content) obj);
                return onDeleteFileClicked$lambda$11;
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onDeleteFileClicked$lambda$11(AnswerClickData fileClickData, CreateTicketViewModel this$0, CreateTicketFormUiState.Content content) {
        Intrinsics.checkNotNullParameter(fileClickData, "$fileClickData");
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(content, "content");
        for (QuestionState questionState : content.getQuestions()) {
            if (Intrinsics.areEqual(questionState.getQuestionModel().getId(), fileClickData.getQuestionId())) {
                Answer answer = questionState.getAnswer();
                Intrinsics.checkNotNull(answer, "null cannot be cast to non-null type io.intercom.android.sdk.survey.ui.models.Answer.MediaAnswer");
                questionState.setAnswer(new Answer.MediaAnswer(CollectionsKt.minus(((Answer.MediaAnswer) answer).getMediaItems(), fileClickData.getClickedItem())));
                this$0.onAnswerUpdated(fileClickData.getQuestionId());
                return Unit.INSTANCE;
            }
        }
        throw new NoSuchElementException("Collection contains no element matching the predicate.");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void updateCtaState() {
        withState(new Function1() { // from class: io.intercom.android.sdk.tickets.create.model.CreateTicketViewModel$$ExternalSyntheticLambda6
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                Unit updateCtaState$lambda$14;
                updateCtaState$lambda$14 = CreateTicketViewModel.updateCtaState$lambda$14(CreateTicketViewModel.this, (CreateTicketViewModel.CreateTicketFormUiState.Content) obj);
                return updateCtaState$lambda$14;
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit updateCtaState$lambda$14(CreateTicketViewModel this$0, CreateTicketFormUiState.Content content) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(content, "content");
        List<QuestionState> questions = content.getQuestions();
        ArrayList arrayList = new ArrayList();
        for (Object obj : questions) {
            if (((QuestionState) obj).getQuestionModel() instanceof SurveyData.Step.Question.UploadFileQuestionModel) {
                arrayList.add(obj);
            }
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            QuestionState questionState = (QuestionState) it.next();
            questionState.validate();
            if (questionState.getAnswer() instanceof Answer.MediaAnswer) {
                Answer answer = questionState.getAnswer();
                Intrinsics.checkNotNull(answer, "null cannot be cast to non-null type io.intercom.android.sdk.survey.ui.models.Answer.MediaAnswer");
                List<Answer.MediaAnswer.MediaItem> mediaItems = ((Answer.MediaAnswer) answer).getMediaItems();
                if (!(mediaItems instanceof Collection) || !mediaItems.isEmpty()) {
                    Iterator<T> it2 = mediaItems.iterator();
                    while (it2.hasNext()) {
                        if (!(((Answer.MediaAnswer.MediaItem) it2.next()).getUploadStatus() instanceof Answer.MediaAnswer.FileUploadStatus.Success)) {
                            this$0._uiState.setValue(CreateTicketFormUiState.Content.copy$default(content, null, null, false, false, 7, null));
                            return Unit.INSTANCE;
                        }
                        it = it;
                        content = content;
                    }
                }
            }
            it = it;
            content = content;
        }
        this$0._uiState.setValue(CreateTicketFormUiState.Content.copy$default(content, null, null, false, true, 7, null));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void compressAndUploadFileAttachments(List<Answer.MediaAnswer.MediaItem> mediaItems) {
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), this.dispatcher, null, new CreateTicketViewModel$compressAndUploadFileAttachments$1(mediaItems, this, null), 2, null);
    }

    public final void onAnswerClicked(AnswerClickData answerClickData) {
        Intrinsics.checkNotNullParameter(answerClickData, "answerClickData");
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new CreateTicketViewModel$onAnswerClicked$1(this, answerClickData, null), 3, null);
    }

    /* compiled from: CreateTicketViewModel.kt */
    @Metadata(d1 = {"\u00001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\b\u0003*\u0001\u000f\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J(\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\f\u001a\u00020\rJ'\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\b\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\f\u001a\u00020\rH\u0002¢\u0006\u0002\u0010\u0010¨\u0006\u0011"}, d2 = {"Lio/intercom/android/sdk/tickets/create/model/CreateTicketViewModel$Companion;", "", "<init>", "()V", "create", "Lio/intercom/android/sdk/tickets/create/model/CreateTicketViewModel;", "owner", "Landroidx/lifecycle/ViewModelStoreOwner;", "ticketTypeId", "", "conversationId", "", "launchedFrom", "Lio/intercom/android/sdk/tickets/create/model/CreateTicketLaunchedFrom;", "factory", "io/intercom/android/sdk/tickets/create/model/CreateTicketViewModel$Companion$factory$1", "(ILjava/lang/String;Lio/intercom/android/sdk/tickets/create/model/CreateTicketLaunchedFrom;)Lio/intercom/android/sdk/tickets/create/model/CreateTicketViewModel$Companion$factory$1;", "intercom-sdk-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final CreateTicketViewModel create(ViewModelStoreOwner owner, int ticketTypeId, String conversationId, CreateTicketLaunchedFrom launchedFrom) {
            Intrinsics.checkNotNullParameter(owner, "owner");
            Intrinsics.checkNotNullParameter(launchedFrom, "launchedFrom");
            return (CreateTicketViewModel) new ViewModelProvider(owner, factory(ticketTypeId, conversationId, launchedFrom)).get(CreateTicketViewModel.class);
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [io.intercom.android.sdk.tickets.create.model.CreateTicketViewModel$Companion$factory$1] */
        private final CreateTicketViewModel$Companion$factory$1 factory(final int ticketTypeId, final String conversationId, final CreateTicketLaunchedFrom launchedFrom) {
            return new ViewModelProvider.Factory() { // from class: io.intercom.android.sdk.tickets.create.model.CreateTicketViewModel$Companion$factory$1
                @Override // androidx.lifecycle.ViewModelProvider.Factory
                public <T extends ViewModel> T create(Class<T> modelClass) {
                    Intrinsics.checkNotNullParameter(modelClass, "modelClass");
                    return new CreateTicketViewModel(CreateTicketLaunchedFrom.this, null, null, null, null, null, conversationId, ticketTypeId, null, TypedValues.AttributesType.TYPE_PIVOT_TARGET, null);
                }
            };
        }
    }

    /* compiled from: CreateTicketViewModel.kt */
    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0004\u0004\u0005\u0006\u0007B\t\b\u0005¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0004\b\t\n\u000b¨\u0006\f"}, d2 = {"Lio/intercom/android/sdk/tickets/create/model/CreateTicketViewModel$CreateTicketFormUiState;", "", "<init>", "()V", "Initial", "Loading", "Error", "Content", "Lio/intercom/android/sdk/tickets/create/model/CreateTicketViewModel$CreateTicketFormUiState$Content;", "Lio/intercom/android/sdk/tickets/create/model/CreateTicketViewModel$CreateTicketFormUiState$Error;", "Lio/intercom/android/sdk/tickets/create/model/CreateTicketViewModel$CreateTicketFormUiState$Initial;", "Lio/intercom/android/sdk/tickets/create/model/CreateTicketViewModel$CreateTicketFormUiState$Loading;", "intercom-sdk-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static abstract class CreateTicketFormUiState {
        public static final int $stable = 0;

        public /* synthetic */ CreateTicketFormUiState(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* compiled from: CreateTicketViewModel.kt */
        @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0003¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007H×\u0003J\t\u0010\b\u001a\u00020\tH×\u0001J\t\u0010\n\u001a\u00020\u000bH×\u0001¨\u0006\f"}, d2 = {"Lio/intercom/android/sdk/tickets/create/model/CreateTicketViewModel$CreateTicketFormUiState$Initial;", "Lio/intercom/android/sdk/tickets/create/model/CreateTicketViewModel$CreateTicketFormUiState;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", InAppPurchaseConstants.METHOD_TO_STRING, "", "intercom-sdk-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class Initial extends CreateTicketFormUiState {
            public static final int $stable = 0;
            public static final Initial INSTANCE = new Initial();

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof Initial)) {
                    return false;
                }
                return true;
            }

            public int hashCode() {
                return 1870846745;
            }

            public String toString() {
                return "Initial";
            }

            private Initial() {
                super(null);
            }
        }

        private CreateTicketFormUiState() {
        }

        /* compiled from: CreateTicketViewModel.kt */
        @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0003¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007H×\u0003J\t\u0010\b\u001a\u00020\tH×\u0001J\t\u0010\n\u001a\u00020\u000bH×\u0001¨\u0006\f"}, d2 = {"Lio/intercom/android/sdk/tickets/create/model/CreateTicketViewModel$CreateTicketFormUiState$Loading;", "Lio/intercom/android/sdk/tickets/create/model/CreateTicketViewModel$CreateTicketFormUiState;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", InAppPurchaseConstants.METHOD_TO_STRING, "", "intercom-sdk-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class Loading extends CreateTicketFormUiState {
            public static final int $stable = 0;
            public static final Loading INSTANCE = new Loading();

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof Loading)) {
                    return false;
                }
                return true;
            }

            public int hashCode() {
                return 259155217;
            }

            public String toString() {
                return "Loading";
            }

            private Loading() {
                super(null);
            }
        }

        /* compiled from: CreateTicketViewModel.kt */
        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÇ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rH×\u0003J\t\u0010\u000e\u001a\u00020\u000fH×\u0001J\t\u0010\u0010\u001a\u00020\u0011H×\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, d2 = {"Lio/intercom/android/sdk/tickets/create/model/CreateTicketViewModel$CreateTicketFormUiState$Error;", "Lio/intercom/android/sdk/tickets/create/model/CreateTicketViewModel$CreateTicketFormUiState;", "errorState", "Lio/intercom/android/sdk/m5/components/ErrorState;", "<init>", "(Lio/intercom/android/sdk/m5/components/ErrorState;)V", "getErrorState", "()Lio/intercom/android/sdk/m5/components/ErrorState;", "component1", "copy", "equals", "", "other", "", "hashCode", "", InAppPurchaseConstants.METHOD_TO_STRING, "", "intercom-sdk-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class Error extends CreateTicketFormUiState {
            public static final int $stable = 0;
            private final ErrorState errorState;

            public static /* synthetic */ Error copy$default(Error error, ErrorState errorState, int i, Object obj) {
                if ((i & 1) != 0) {
                    errorState = error.errorState;
                }
                return error.copy(errorState);
            }

            /* renamed from: component1, reason: from getter */
            public final ErrorState getErrorState() {
                return this.errorState;
            }

            public final Error copy(ErrorState errorState) {
                Intrinsics.checkNotNullParameter(errorState, "errorState");
                return new Error(errorState);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof Error) && Intrinsics.areEqual(this.errorState, ((Error) other).errorState);
            }

            public int hashCode() {
                return this.errorState.hashCode();
            }

            public String toString() {
                return "Error(errorState=" + this.errorState + ')';
            }

            public final ErrorState getErrorState() {
                return this.errorState;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public Error(ErrorState errorState) {
                super(null);
                Intrinsics.checkNotNullParameter(errorState, "errorState");
                this.errorState = errorState;
            }
        }

        /* compiled from: CreateTicketViewModel.kt */
        @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0011\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B1\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b\u0012\b\b\u0002\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\u000f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003J\t\u0010\u0015\u001a\u00020\bHÆ\u0003J\t\u0010\u0016\u001a\u00020\bHÆ\u0003J7\u0010\u0017\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\bHÇ\u0001J\u0013\u0010\u0018\u001a\u00020\b2\b\u0010\u0019\u001a\u0004\u0018\u00010\u001aH×\u0003J\t\u0010\u001b\u001a\u00020\u001cH×\u0001J\t\u0010\u001d\u001a\u00020\u0003H×\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\t\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0011¨\u0006\u001e"}, d2 = {"Lio/intercom/android/sdk/tickets/create/model/CreateTicketViewModel$CreateTicketFormUiState$Content;", "Lio/intercom/android/sdk/tickets/create/model/CreateTicketViewModel$CreateTicketFormUiState;", "title", "", "questions", "", "Lio/intercom/android/sdk/survey/QuestionState;", "showCreatingTicketProgress", "", "enableCta", "<init>", "(Ljava/lang/String;Ljava/util/List;ZZ)V", "getTitle", "()Ljava/lang/String;", "getQuestions", "()Ljava/util/List;", "getShowCreatingTicketProgress", "()Z", "getEnableCta", "component1", "component2", "component3", "component4", "copy", "equals", "other", "", "hashCode", "", InAppPurchaseConstants.METHOD_TO_STRING, "intercom-sdk-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class Content extends CreateTicketFormUiState {
            public static final int $stable = 8;
            private final boolean enableCta;
            private final List<QuestionState> questions;
            private final boolean showCreatingTicketProgress;
            private final String title;

            /* JADX WARN: Multi-variable type inference failed */
            public static /* synthetic */ Content copy$default(Content content, String str, List list, boolean z, boolean z2, int i, Object obj) {
                if ((i & 1) != 0) {
                    str = content.title;
                }
                if ((i & 2) != 0) {
                    list = content.questions;
                }
                if ((i & 4) != 0) {
                    z = content.showCreatingTicketProgress;
                }
                if ((i & 8) != 0) {
                    z2 = content.enableCta;
                }
                return content.copy(str, list, z, z2);
            }

            /* renamed from: component1, reason: from getter */
            public final String getTitle() {
                return this.title;
            }

            public final List<QuestionState> component2() {
                return this.questions;
            }

            /* renamed from: component3, reason: from getter */
            public final boolean getShowCreatingTicketProgress() {
                return this.showCreatingTicketProgress;
            }

            /* renamed from: component4, reason: from getter */
            public final boolean getEnableCta() {
                return this.enableCta;
            }

            public final Content copy(String title, List<QuestionState> questions, boolean showCreatingTicketProgress, boolean enableCta) {
                Intrinsics.checkNotNullParameter(title, "title");
                Intrinsics.checkNotNullParameter(questions, "questions");
                return new Content(title, questions, showCreatingTicketProgress, enableCta);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof Content)) {
                    return false;
                }
                Content content = (Content) other;
                return Intrinsics.areEqual(this.title, content.title) && Intrinsics.areEqual(this.questions, content.questions) && this.showCreatingTicketProgress == content.showCreatingTicketProgress && this.enableCta == content.enableCta;
            }

            public int hashCode() {
                return (((((this.title.hashCode() * 31) + this.questions.hashCode()) * 31) + Boolean.hashCode(this.showCreatingTicketProgress)) * 31) + Boolean.hashCode(this.enableCta);
            }

            public String toString() {
                return "Content(title=" + this.title + ", questions=" + this.questions + ", showCreatingTicketProgress=" + this.showCreatingTicketProgress + ", enableCta=" + this.enableCta + ')';
            }

            public /* synthetic */ Content(String str, List list, boolean z, boolean z2, int i, DefaultConstructorMarker defaultConstructorMarker) {
                this(str, list, (i & 4) != 0 ? false : z, (i & 8) != 0 ? true : z2);
            }

            public final String getTitle() {
                return this.title;
            }

            public final List<QuestionState> getQuestions() {
                return this.questions;
            }

            public final boolean getShowCreatingTicketProgress() {
                return this.showCreatingTicketProgress;
            }

            public final boolean getEnableCta() {
                return this.enableCta;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public Content(String title, List<QuestionState> questions, boolean z, boolean z2) {
                super(null);
                Intrinsics.checkNotNullParameter(title, "title");
                Intrinsics.checkNotNullParameter(questions, "questions");
                this.title = title;
                this.questions = questions;
                this.showCreatingTicketProgress = z;
                this.enableCta = z2;
            }
        }
    }

    /* compiled from: CreateTicketViewModel.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b1\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0005¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0006\u0007¨\u0006\b"}, d2 = {"Lio/intercom/android/sdk/tickets/create/model/CreateTicketViewModel$TicketSideEffect;", "", "<init>", "()V", "Finish", "AnswerClicked", "Lio/intercom/android/sdk/tickets/create/model/CreateTicketViewModel$TicketSideEffect$AnswerClicked;", "Lio/intercom/android/sdk/tickets/create/model/CreateTicketViewModel$TicketSideEffect$Finish;", "intercom-sdk-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static abstract class TicketSideEffect {
        public static final int $stable = 0;

        public /* synthetic */ TicketSideEffect(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* compiled from: CreateTicketViewModel.kt */
        @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0003¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007H×\u0003J\t\u0010\b\u001a\u00020\tH×\u0001J\t\u0010\n\u001a\u00020\u000bH×\u0001¨\u0006\f"}, d2 = {"Lio/intercom/android/sdk/tickets/create/model/CreateTicketViewModel$TicketSideEffect$Finish;", "Lio/intercom/android/sdk/tickets/create/model/CreateTicketViewModel$TicketSideEffect;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", InAppPurchaseConstants.METHOD_TO_STRING, "", "intercom-sdk-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class Finish extends TicketSideEffect {
            public static final int $stable = 0;
            public static final Finish INSTANCE = new Finish();

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof Finish)) {
                    return false;
                }
                return true;
            }

            public int hashCode() {
                return -1916377057;
            }

            public String toString() {
                return "Finish";
            }

            private Finish() {
                super(null);
            }
        }

        private TicketSideEffect() {
        }

        /* compiled from: CreateTicketViewModel.kt */
        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÇ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rH×\u0003J\t\u0010\u000e\u001a\u00020\u000fH×\u0001J\t\u0010\u0010\u001a\u00020\u0011H×\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, d2 = {"Lio/intercom/android/sdk/tickets/create/model/CreateTicketViewModel$TicketSideEffect$AnswerClicked;", "Lio/intercom/android/sdk/tickets/create/model/CreateTicketViewModel$TicketSideEffect;", "answerClickData", "Lio/intercom/android/sdk/survey/ui/questiontype/AnswerClickData;", "<init>", "(Lio/intercom/android/sdk/survey/ui/questiontype/AnswerClickData;)V", "getAnswerClickData", "()Lio/intercom/android/sdk/survey/ui/questiontype/AnswerClickData;", "component1", "copy", "equals", "", "other", "", "hashCode", "", InAppPurchaseConstants.METHOD_TO_STRING, "", "intercom-sdk-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class AnswerClicked extends TicketSideEffect {
            public static final int $stable = 8;
            private final AnswerClickData answerClickData;

            public static /* synthetic */ AnswerClicked copy$default(AnswerClicked answerClicked, AnswerClickData answerClickData, int i, Object obj) {
                if ((i & 1) != 0) {
                    answerClickData = answerClicked.answerClickData;
                }
                return answerClicked.copy(answerClickData);
            }

            /* renamed from: component1, reason: from getter */
            public final AnswerClickData getAnswerClickData() {
                return this.answerClickData;
            }

            public final AnswerClicked copy(AnswerClickData answerClickData) {
                Intrinsics.checkNotNullParameter(answerClickData, "answerClickData");
                return new AnswerClicked(answerClickData);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof AnswerClicked) && Intrinsics.areEqual(this.answerClickData, ((AnswerClicked) other).answerClickData);
            }

            public int hashCode() {
                return this.answerClickData.hashCode();
            }

            public String toString() {
                return "AnswerClicked(answerClickData=" + this.answerClickData + ')';
            }

            public final AnswerClickData getAnswerClickData() {
                return this.answerClickData;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnswerClicked(AnswerClickData answerClickData) {
                super(null);
                Intrinsics.checkNotNullParameter(answerClickData, "answerClickData");
                this.answerClickData = answerClickData;
            }
        }
    }
}
