package io.intercom.android.sdk.m5.inbox;

import androidx.exifinterface.media.ExifInterface;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelKt;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.paging.CachedPagingDataKt;
import androidx.paging.Pager;
import androidx.paging.PagingConfig;
import androidx.paging.PagingData;
import androidx.paging.PagingSource;
import io.intercom.android.nexus.NexusEventType;
import io.intercom.android.sdk.Injector;
import io.intercom.android.sdk.api.MessengerApi;
import io.intercom.android.sdk.m5.conversation.data.ParsedNexusEvent;
import io.intercom.android.sdk.m5.data.CommonRepository;
import io.intercom.android.sdk.m5.data.IntercomDataLayer;
import io.intercom.android.sdk.m5.inbox.data.InboxPagingSource;
import io.intercom.android.sdk.m5.inbox.data.InboxRepository;
import io.intercom.android.sdk.m5.inbox.states.InboxUiEffects;
import io.intercom.android.sdk.models.Conversation;
import io.intercom.android.sdk.models.EmptyState;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
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
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt__ShareKt;
import kotlinx.coroutines.flow.MutableSharedFlow;
import kotlinx.coroutines.flow.SharedFlow;
import kotlinx.coroutines.flow.SharedFlowKt;
import kotlinx.coroutines.flow.SharingStarted;

/* compiled from: InboxViewModel.kt */
@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0001\u0018\u0000 !2\u00020\u0001:\u0001!B/\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000bJ\u000e\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020\u0014R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u001e\u0010\u000e\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\r@BX\u0086\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u001d\u0010\u0011\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00140\u00130\u0012¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00190\u0018X\u0082\u0004¢\u0006\u0002\n\u0000R\u0017\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00190\u001b¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001d¨\u0006\""}, d2 = {"Lio/intercom/android/sdk/m5/inbox/InboxViewModel;", "Landroidx/lifecycle/ViewModel;", "inboxRepository", "Lio/intercom/android/sdk/m5/inbox/data/InboxRepository;", "dispatcher", "Lkotlinx/coroutines/CoroutineDispatcher;", "intercomDataLayer", "Lio/intercom/android/sdk/m5/data/IntercomDataLayer;", "commonRepository", "Lio/intercom/android/sdk/m5/data/CommonRepository;", "<init>", "(Lio/intercom/android/sdk/m5/inbox/data/InboxRepository;Lkotlinx/coroutines/CoroutineDispatcher;Lio/intercom/android/sdk/m5/data/IntercomDataLayer;Lio/intercom/android/sdk/m5/data/CommonRepository;)V", "value", "Lio/intercom/android/sdk/models/EmptyState;", "emptyState", "getEmptyState", "()Lio/intercom/android/sdk/models/EmptyState;", "inboxPagingData", "Lkotlinx/coroutines/flow/Flow;", "Landroidx/paging/PagingData;", "Lio/intercom/android/sdk/models/Conversation;", "getInboxPagingData", "()Lkotlinx/coroutines/flow/Flow;", "_effect", "Lkotlinx/coroutines/flow/MutableSharedFlow;", "Lio/intercom/android/sdk/m5/inbox/states/InboxUiEffects;", "effect", "Lkotlinx/coroutines/flow/SharedFlow;", "getEffect", "()Lkotlinx/coroutines/flow/SharedFlow;", "onConversationClick", "", "it", "Companion", "intercom-sdk-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class InboxViewModel extends ViewModel {
    private final MutableSharedFlow<InboxUiEffects> _effect;
    private final CommonRepository commonRepository;
    private final CoroutineDispatcher dispatcher;
    private final SharedFlow<InboxUiEffects> effect;
    private EmptyState emptyState;
    private final Flow<PagingData<Conversation>> inboxPagingData;
    private final InboxRepository inboxRepository;
    private final IntercomDataLayer intercomDataLayer;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    public InboxViewModel() {
        this(null, null, null, null, 15, null);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public /* synthetic */ InboxViewModel(InboxRepository inboxRepository, CoroutineDispatcher coroutineDispatcher, IntercomDataLayer intercomDataLayer, CommonRepository commonRepository, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(inboxRepository, coroutineDispatcher, intercomDataLayer, commonRepository);
        inboxRepository = (i & 1) != 0 ? new InboxRepository(null, null, null, 7, null) : inboxRepository;
        coroutineDispatcher = (i & 2) != 0 ? Dispatchers.getIO() : coroutineDispatcher;
        intercomDataLayer = (i & 4) != 0 ? Injector.get().getDataLayer() : intercomDataLayer;
        if ((i & 8) != 0) {
            MessengerApi messengerApi = Injector.get().getMessengerApi();
            Intrinsics.checkNotNullExpressionValue(messengerApi, "getMessengerApi(...)");
            commonRepository = new CommonRepository(messengerApi, intercomDataLayer);
        }
    }

    public InboxViewModel(InboxRepository inboxRepository, CoroutineDispatcher dispatcher, IntercomDataLayer intercomDataLayer, CommonRepository commonRepository) {
        SharedFlow<InboxUiEffects> shareIn$default;
        Intrinsics.checkNotNullParameter(inboxRepository, "inboxRepository");
        Intrinsics.checkNotNullParameter(dispatcher, "dispatcher");
        Intrinsics.checkNotNullParameter(intercomDataLayer, "intercomDataLayer");
        Intrinsics.checkNotNullParameter(commonRepository, "commonRepository");
        this.inboxRepository = inboxRepository;
        this.dispatcher = dispatcher;
        this.intercomDataLayer = intercomDataLayer;
        this.commonRepository = commonRepository;
        this.emptyState = EmptyState.INSTANCE.getNULL();
        InboxViewModel inboxViewModel = this;
        this.inboxPagingData = CachedPagingDataKt.cachedIn(new Pager(new PagingConfig(20, 0, false, 0, 0, 0, 58, null), null, new Function0() { // from class: io.intercom.android.sdk.m5.inbox.InboxViewModel$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                PagingSource inboxPagingData$lambda$0;
                inboxPagingData$lambda$0 = InboxViewModel.inboxPagingData$lambda$0(InboxViewModel.this);
                return inboxPagingData$lambda$0;
            }
        }, 2, null).getFlow(), ViewModelKt.getViewModelScope(inboxViewModel));
        MutableSharedFlow<InboxUiEffects> MutableSharedFlow$default = SharedFlowKt.MutableSharedFlow$default(0, 0, null, 7, null);
        this._effect = MutableSharedFlow$default;
        shareIn$default = FlowKt__ShareKt.shareIn$default(MutableSharedFlow$default, ViewModelKt.getViewModelScope(inboxViewModel), SharingStarted.INSTANCE.getEagerly(), 0, 4, null);
        this.effect = shareIn$default;
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(inboxViewModel), null, null, new AnonymousClass1(null), 3, null);
    }

    public final EmptyState getEmptyState() {
        return this.emptyState;
    }

    public final Flow<PagingData<Conversation>> getInboxPagingData() {
        return this.inboxPagingData;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final PagingSource inboxPagingData$lambda$0(InboxViewModel this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        return new InboxPagingSource(this$0.inboxRepository, this$0.intercomDataLayer, new InboxViewModel$inboxPagingData$1$1(this$0, null));
    }

    public final SharedFlow<InboxUiEffects> getEffect() {
        return this.effect;
    }

    /* compiled from: InboxViewModel.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "io.intercom.android.sdk.m5.inbox.InboxViewModel$1", f = "InboxViewModel.kt", i = {}, l = {72}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: io.intercom.android.sdk.m5.inbox.InboxViewModel$1, reason: invalid class name */
    static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        AnonymousClass1(Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return InboxViewModel.this.new AnonymousClass1(continuation);
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
                final Flow<ParsedNexusEvent> realTimeEvents = InboxViewModel.this.inboxRepository.realTimeEvents();
                final Flow<Object> flow = new Flow<Object>() { // from class: io.intercom.android.sdk.m5.inbox.InboxViewModel$1$invokeSuspend$$inlined$filterIsInstance$1

                    /* compiled from: Emitters.kt */
                    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\b\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u00032\u0006\u0010\u0004\u001a\u0002H\u0002H\u008a@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\t"}, d2 = {"<anonymous>", "", ExifInterface.GPS_DIRECTION_TRUE, "R", "value", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx/coroutines/flow/FlowKt__EmittersKt$unsafeTransform$1$1", "kotlinx/coroutines/flow/FlowKt__TransformKt$filter$$inlined$unsafeTransform$1$2", "kotlinx/coroutines/flow/FlowKt__TransformKt$filterIsInstance$$inlined$filter$1$2"}, k = 3, mv = {2, 0, 0}, xi = 48)
                    /* renamed from: io.intercom.android.sdk.m5.inbox.InboxViewModel$1$invokeSuspend$$inlined$filterIsInstance$1$2, reason: invalid class name */
                    public static final class AnonymousClass2<T> implements FlowCollector {
                        final /* synthetic */ FlowCollector $this_unsafeFlow;

                        /* compiled from: Emitters.kt */
                        @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
                        @DebugMetadata(c = "io.intercom.android.sdk.m5.inbox.InboxViewModel$1$invokeSuspend$$inlined$filterIsInstance$1$2", f = "InboxViewModel.kt", i = {}, l = {219}, m = "emit", n = {}, s = {})
                        /* renamed from: io.intercom.android.sdk.m5.inbox.InboxViewModel$1$invokeSuspend$$inlined$filterIsInstance$1$2$1, reason: invalid class name */
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
                                        if (obj instanceof ParsedNexusEvent.ConversationNexusEvent) {
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
                Flow<ParsedNexusEvent.ConversationNexusEvent> flow2 = new Flow<ParsedNexusEvent.ConversationNexusEvent>() { // from class: io.intercom.android.sdk.m5.inbox.InboxViewModel$1$invokeSuspend$$inlined$filter$1

                    /* compiled from: Emitters.kt */
                    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u00032\u0006\u0010\u0004\u001a\u0002H\u0002H\u008a@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\b"}, d2 = {"<anonymous>", "", ExifInterface.GPS_DIRECTION_TRUE, "R", "value", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx/coroutines/flow/FlowKt__EmittersKt$unsafeTransform$1$1", "kotlinx/coroutines/flow/FlowKt__TransformKt$filter$$inlined$unsafeTransform$1$2"}, k = 3, mv = {2, 0, 0}, xi = 48)
                    /* renamed from: io.intercom.android.sdk.m5.inbox.InboxViewModel$1$invokeSuspend$$inlined$filter$1$2, reason: invalid class name */
                    public static final class AnonymousClass2<T> implements FlowCollector {
                        final /* synthetic */ FlowCollector $this_unsafeFlow;

                        /* compiled from: Emitters.kt */
                        @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
                        @DebugMetadata(c = "io.intercom.android.sdk.m5.inbox.InboxViewModel$1$invokeSuspend$$inlined$filter$1$2", f = "InboxViewModel.kt", i = {}, l = {219}, m = "emit", n = {}, s = {})
                        /* renamed from: io.intercom.android.sdk.m5.inbox.InboxViewModel$1$invokeSuspend$$inlined$filter$1$2$1, reason: invalid class name */
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
                                        if (((ParsedNexusEvent.ConversationNexusEvent) obj).getEventType() == NexusEventType.NewComment) {
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
                    public Object collect(FlowCollector<? super ParsedNexusEvent.ConversationNexusEvent> flowCollector, Continuation continuation) {
                        Object collect = Flow.this.collect(new AnonymousClass2(flowCollector), continuation);
                        return collect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? collect : Unit.INSTANCE;
                    }
                };
                final InboxViewModel inboxViewModel = InboxViewModel.this;
                this.label = 1;
                if (flow2.collect(new FlowCollector() { // from class: io.intercom.android.sdk.m5.inbox.InboxViewModel.1.2
                    @Override // kotlinx.coroutines.flow.FlowCollector
                    public /* bridge */ /* synthetic */ Object emit(Object obj2, Continuation continuation) {
                        return emit((ParsedNexusEvent.ConversationNexusEvent) obj2, (Continuation<? super Unit>) continuation);
                    }

                    public final Object emit(ParsedNexusEvent.ConversationNexusEvent conversationNexusEvent, Continuation<? super Unit> continuation) {
                        Object emit = InboxViewModel.this._effect.emit(InboxUiEffects.RefreshInbox.INSTANCE, continuation);
                        return emit == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? emit : Unit.INSTANCE;
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

    public final void onConversationClick(Conversation it) {
        Intrinsics.checkNotNullParameter(it, "it");
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), this.dispatcher, null, new InboxViewModel$onConversationClick$1(this, it, null), 2, null);
    }

    /* compiled from: InboxViewModel.kt */
    @Metadata(d1 = {"\u0000\u001f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\b\u0003*\u0001\t\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007J\r\u0010\b\u001a\u00020\tH\u0002¢\u0006\u0002\u0010\n¨\u0006\u000b"}, d2 = {"Lio/intercom/android/sdk/m5/inbox/InboxViewModel$Companion;", "", "<init>", "()V", "create", "Lio/intercom/android/sdk/m5/inbox/InboxViewModel;", "owner", "Landroidx/lifecycle/ViewModelStoreOwner;", "factory", "io/intercom/android/sdk/m5/inbox/InboxViewModel$Companion$factory$1", "()Lio/intercom/android/sdk/m5/inbox/InboxViewModel$Companion$factory$1;", "intercom-sdk-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final InboxViewModel create(ViewModelStoreOwner owner) {
            Intrinsics.checkNotNullParameter(owner, "owner");
            return (InboxViewModel) new ViewModelProvider(owner, factory()).get(InboxViewModel.class);
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [io.intercom.android.sdk.m5.inbox.InboxViewModel$Companion$factory$1] */
        private final InboxViewModel$Companion$factory$1 factory() {
            return new ViewModelProvider.Factory() { // from class: io.intercom.android.sdk.m5.inbox.InboxViewModel$Companion$factory$1
                @Override // androidx.lifecycle.ViewModelProvider.Factory
                public <T extends ViewModel> T create(Class<T> modelClass) {
                    Intrinsics.checkNotNullParameter(modelClass, "modelClass");
                    return new InboxViewModel(null, null, null, null, 15, null);
                }
            };
        }
    }
}
