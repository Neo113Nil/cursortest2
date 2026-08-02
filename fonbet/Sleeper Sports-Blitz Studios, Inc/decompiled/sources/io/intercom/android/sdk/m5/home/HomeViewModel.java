package io.intercom.android.sdk.m5.home;

import androidx.exifinterface.media.ExifInterface;
import androidx.lifecycle.FlowExtKt;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelKt;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStoreOwner;
import com.socure.docv.capturesdk.common.analytics.AnalyticsConstantsKt;
import io.intercom.android.nexus.NexusEventType;
import io.intercom.android.sdk.Injector;
import io.intercom.android.sdk.api.MessengerApi;
import io.intercom.android.sdk.identity.AppConfig;
import io.intercom.android.sdk.m5.conversation.data.ParsedNexusEvent;
import io.intercom.android.sdk.m5.data.CommonRepository;
import io.intercom.android.sdk.m5.data.IntercomDataLayer;
import io.intercom.android.sdk.m5.home.data.HomeRepository;
import io.intercom.android.sdk.m5.home.reducers.HomeReducer;
import io.intercom.android.sdk.m5.home.states.HomeClientState;
import io.intercom.android.sdk.m5.home.states.HomeUiEffects;
import io.intercom.android.sdk.m5.home.states.HomeUiState;
import io.intercom.android.sdk.models.ConfigModules;
import io.intercom.android.sdk.models.HomeConfig;
import io.intercom.android.sdk.models.OpenConfig;
import io.intercom.android.sdk.models.OpenToSpace;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
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
import kotlinx.coroutines.flow.FlowKt__ShareKt;
import kotlinx.coroutines.flow.MutableSharedFlow;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.SharedFlow;
import kotlinx.coroutines.flow.SharedFlowKt;
import kotlinx.coroutines.flow.SharingStarted;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;

/* compiled from: HomeViewModel.kt */
@Metadata(d1 = {"\u0000t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0001\u0018\u0000 +2\u00020\u0001:\u0001+B;\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\b\b\u0002\u0010\f\u001a\u00020\r¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010!\u001a\u00020\"2\u0006\u0010#\u001a\u00020$H\u0002J\b\u0010%\u001a\u00020\"H\u0002J\u0006\u0010&\u001a\u00020\"J\u0006\u0010'\u001a\u00020\"J\u0010\u0010(\u001a\u00020\"2\u0006\u0010)\u001a\u00020*H\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00120\u0011X\u0082\u0004¢\u0006\u0002\n\u0000R\u0017\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u0014¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00190\u0018X\u0082\u0004¢\u0006\u0002\n\u0000R\u0017\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u001c0\u001b¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001eR\u000e\u0010\u001f\u001a\u00020 X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006,"}, d2 = {"Lio/intercom/android/sdk/m5/home/HomeViewModel;", "Landroidx/lifecycle/ViewModel;", "lifecycle", "Landroidx/lifecycle/Lifecycle;", "homeRepository", "Lio/intercom/android/sdk/m5/home/data/HomeRepository;", "commonRepository", "Lio/intercom/android/sdk/m5/data/CommonRepository;", "homeReducer", "Lio/intercom/android/sdk/m5/home/reducers/HomeReducer;", "intercomDataLayer", "Lio/intercom/android/sdk/m5/data/IntercomDataLayer;", "dispatcher", "Lkotlinx/coroutines/CoroutineDispatcher;", "<init>", "(Landroidx/lifecycle/Lifecycle;Lio/intercom/android/sdk/m5/home/data/HomeRepository;Lio/intercom/android/sdk/m5/data/CommonRepository;Lio/intercom/android/sdk/m5/home/reducers/HomeReducer;Lio/intercom/android/sdk/m5/data/IntercomDataLayer;Lkotlinx/coroutines/CoroutineDispatcher;)V", "_effect", "Lkotlinx/coroutines/flow/MutableSharedFlow;", "Lio/intercom/android/sdk/m5/home/states/HomeUiEffects;", "effect", "Lkotlinx/coroutines/flow/SharedFlow;", "getEffect", "()Lkotlinx/coroutines/flow/SharedFlow;", "clientState", "Lkotlinx/coroutines/flow/MutableStateFlow;", "Lio/intercom/android/sdk/m5/home/states/HomeClientState;", "uiState", "Lkotlinx/coroutines/flow/StateFlow;", "Lio/intercom/android/sdk/m5/home/states/HomeUiState;", "getUiState", "()Lkotlinx/coroutines/flow/StateFlow;", "hasConversationScreenOpenedDirectlyFromHome", "", "handleOpening", "", "openToSpace", "Lio/intercom/android/sdk/models/OpenToSpace;", "fetchHomeData", "onHeaderImageLoaded", "onRetryClicked", "onConfig", AnalyticsConstantsKt.KEY_CONFIG, "Lio/intercom/android/sdk/identity/AppConfig;", "Companion", "intercom-sdk-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class HomeViewModel extends ViewModel {
    private final MutableSharedFlow<HomeUiEffects> _effect;
    private final MutableStateFlow<HomeClientState> clientState;
    private final CommonRepository commonRepository;
    private final CoroutineDispatcher dispatcher;
    private final SharedFlow<HomeUiEffects> effect;
    private boolean hasConversationScreenOpenedDirectlyFromHome;
    private final HomeReducer homeReducer;
    private final HomeRepository homeRepository;
    private final IntercomDataLayer intercomDataLayer;
    private final StateFlow<HomeUiState> uiState;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    /* compiled from: HomeViewModel.kt */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[OpenToSpace.values().length];
            try {
                iArr[OpenToSpace.HOME.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[OpenToSpace.MESSAGES.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[OpenToSpace.CONVERSATION.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ HomeViewModel(Lifecycle lifecycle, HomeRepository homeRepository, CommonRepository commonRepository, HomeReducer homeReducer, IntercomDataLayer intercomDataLayer, CoroutineDispatcher coroutineDispatcher, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(lifecycle, homeRepository, commonRepository, (i & 8) != 0 ? new HomeReducer(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0) : homeReducer, intercomDataLayer, (i & 32) != 0 ? Dispatchers.getIO() : coroutineDispatcher);
    }

    public HomeViewModel(Lifecycle lifecycle, HomeRepository homeRepository, CommonRepository commonRepository, HomeReducer homeReducer, IntercomDataLayer intercomDataLayer, CoroutineDispatcher dispatcher) {
        SharedFlow<HomeUiEffects> shareIn$default;
        Intrinsics.checkNotNullParameter(lifecycle, "lifecycle");
        Intrinsics.checkNotNullParameter(homeRepository, "homeRepository");
        Intrinsics.checkNotNullParameter(commonRepository, "commonRepository");
        Intrinsics.checkNotNullParameter(homeReducer, "homeReducer");
        Intrinsics.checkNotNullParameter(intercomDataLayer, "intercomDataLayer");
        Intrinsics.checkNotNullParameter(dispatcher, "dispatcher");
        this.homeRepository = homeRepository;
        this.commonRepository = commonRepository;
        this.homeReducer = homeReducer;
        this.intercomDataLayer = intercomDataLayer;
        this.dispatcher = dispatcher;
        MutableSharedFlow<HomeUiEffects> MutableSharedFlow$default = SharedFlowKt.MutableSharedFlow$default(0, 0, null, 7, null);
        this._effect = MutableSharedFlow$default;
        MutableSharedFlow<HomeUiEffects> mutableSharedFlow = MutableSharedFlow$default;
        HomeViewModel homeViewModel = this;
        shareIn$default = FlowKt__ShareKt.shareIn$default(mutableSharedFlow, ViewModelKt.getViewModelScope(homeViewModel), SharingStarted.INSTANCE.getEagerly(), 0, 4, null);
        this.effect = shareIn$default;
        MutableStateFlow<HomeClientState> MutableStateFlow = StateFlowKt.MutableStateFlow(new HomeClientState(null, null, false, 7, null));
        this.clientState = MutableStateFlow;
        final MutableStateFlow<HomeClientState> mutableStateFlow = MutableStateFlow;
        this.uiState = FlowKt.stateIn(new Flow<HomeUiState>() { // from class: io.intercom.android.sdk.m5.home.HomeViewModel$special$$inlined$map$1

            /* compiled from: Emitters.kt */
            @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u00032\u0006\u0010\u0004\u001a\u0002H\u0002H\u008a@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\b"}, d2 = {"<anonymous>", "", ExifInterface.GPS_DIRECTION_TRUE, "R", "value", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx/coroutines/flow/FlowKt__EmittersKt$unsafeTransform$1$1", "kotlinx/coroutines/flow/FlowKt__TransformKt$map$$inlined$unsafeTransform$1$2"}, k = 3, mv = {2, 0, 0}, xi = 48)
            /* renamed from: io.intercom.android.sdk.m5.home.HomeViewModel$special$$inlined$map$1$2, reason: invalid class name */
            public static final class AnonymousClass2<T> implements FlowCollector {
                final /* synthetic */ FlowCollector $this_unsafeFlow;
                final /* synthetic */ HomeViewModel this$0;

                /* compiled from: Emitters.kt */
                @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
                @DebugMetadata(c = "io.intercom.android.sdk.m5.home.HomeViewModel$special$$inlined$map$1$2", f = "HomeViewModel.kt", i = {}, l = {219}, m = "emit", n = {}, s = {})
                /* renamed from: io.intercom.android.sdk.m5.home.HomeViewModel$special$$inlined$map$1$2$1, reason: invalid class name */
                public static final class AnonymousClass1 extends ContinuationImpl {
                    Object L$0;
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

                public AnonymousClass2(FlowCollector flowCollector, HomeViewModel homeViewModel) {
                    this.$this_unsafeFlow = flowCollector;
                    this.this$0 = homeViewModel;
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
                    HomeReducer homeReducer;
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
                                homeReducer = this.this$0.homeReducer;
                                HomeUiState computeUiState$intercom_sdk_base_release = homeReducer.computeUiState$intercom_sdk_base_release((HomeClientState) obj, new HomeViewModel$uiState$1$1(this.this$0));
                                anonymousClass1.label = 1;
                                if (flowCollector.emit(computeUiState$intercom_sdk_base_release, anonymousClass1) == coroutine_suspended) {
                                    return coroutine_suspended;
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
            public Object collect(FlowCollector<? super HomeUiState> flowCollector, Continuation continuation) {
                Object collect = Flow.this.collect(new AnonymousClass2(flowCollector, this), continuation);
                return collect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? collect : Unit.INSTANCE;
            }
        }, ViewModelKt.getViewModelScope(homeViewModel), SharingStarted.Companion.WhileSubscribed$default(SharingStarted.INSTANCE, 5000L, 0L, 2, null), new HomeUiState.Loading(null));
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(homeViewModel), null, null, new AnonymousClass1(lifecycle, null), 3, null);
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(homeViewModel), null, null, new AnonymousClass2(lifecycle, null), 3, null);
    }

    public final SharedFlow<HomeUiEffects> getEffect() {
        return this.effect;
    }

    public final StateFlow<HomeUiState> getUiState() {
        return this.uiState;
    }

    /* compiled from: HomeViewModel.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "io.intercom.android.sdk.m5.home.HomeViewModel$1", f = "HomeViewModel.kt", i = {}, l = {69}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: io.intercom.android.sdk.m5.home.HomeViewModel$1, reason: invalid class name */
    static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ Lifecycle $lifecycle;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(Lifecycle lifecycle, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.$lifecycle = lifecycle;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return HomeViewModel.this.new AnonymousClass1(this.$lifecycle, continuation);
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
                if (FlowKt.collectLatest(FlowExtKt.flowWithLifecycle(HomeViewModel.this.intercomDataLayer.getConfig(), this.$lifecycle, Lifecycle.State.RESUMED), new C01021(HomeViewModel.this, null), this) == coroutine_suspended) {
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

        /* compiled from: HomeViewModel.kt */
        @Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0015\u0010\u0002\u001a\u00110\u0003¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\b(\u0006H\n"}, d2 = {"<anonymous>", "", "it", "Lio/intercom/android/sdk/identity/AppConfig;", "Lkotlin/ParameterName;", "name", "value"}, k = 3, mv = {2, 0, 0}, xi = 48)
        @DebugMetadata(c = "io.intercom.android.sdk.m5.home.HomeViewModel$1$1", f = "HomeViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        /* renamed from: io.intercom.android.sdk.m5.home.HomeViewModel$1$1, reason: invalid class name and collision with other inner class name */
        static final class C01021 extends SuspendLambda implements Function2<AppConfig, Continuation<? super Unit>, Object> {
            /* synthetic */ Object L$0;
            int label;
            final /* synthetic */ HomeViewModel this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C01021(HomeViewModel homeViewModel, Continuation<? super C01021> continuation) {
                super(2, continuation);
                this.this$0 = homeViewModel;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                C01021 c01021 = new C01021(this.this$0, continuation);
                c01021.L$0 = obj;
                return c01021;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(AppConfig appConfig, Continuation<? super Unit> continuation) {
                return ((C01021) create(appConfig, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                this.this$0.onConfig((AppConfig) this.L$0);
                return Unit.INSTANCE;
            }
        }
    }

    /* compiled from: HomeViewModel.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "io.intercom.android.sdk.m5.home.HomeViewModel$2", f = "HomeViewModel.kt", i = {}, l = {77}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: io.intercom.android.sdk.m5.home.HomeViewModel$2, reason: invalid class name */
    static final class AnonymousClass2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ Lifecycle $lifecycle;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass2(Lifecycle lifecycle, Continuation<? super AnonymousClass2> continuation) {
            super(2, continuation);
            this.$lifecycle = lifecycle;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return HomeViewModel.this.new AnonymousClass2(this.$lifecycle, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((AnonymousClass2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                final Flow flowWithLifecycle = FlowExtKt.flowWithLifecycle(HomeViewModel.this.homeRepository.realTimeEvents(), this.$lifecycle, Lifecycle.State.RESUMED);
                final Flow<Object> flow = new Flow<Object>() { // from class: io.intercom.android.sdk.m5.home.HomeViewModel$2$invokeSuspend$$inlined$filterIsInstance$1

                    /* compiled from: Emitters.kt */
                    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\b\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u00032\u0006\u0010\u0004\u001a\u0002H\u0002H\u008a@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\t"}, d2 = {"<anonymous>", "", ExifInterface.GPS_DIRECTION_TRUE, "R", "value", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx/coroutines/flow/FlowKt__EmittersKt$unsafeTransform$1$1", "kotlinx/coroutines/flow/FlowKt__TransformKt$filter$$inlined$unsafeTransform$1$2", "kotlinx/coroutines/flow/FlowKt__TransformKt$filterIsInstance$$inlined$filter$1$2"}, k = 3, mv = {2, 0, 0}, xi = 48)
                    /* renamed from: io.intercom.android.sdk.m5.home.HomeViewModel$2$invokeSuspend$$inlined$filterIsInstance$1$2, reason: invalid class name */
                    public static final class AnonymousClass2<T> implements FlowCollector {
                        final /* synthetic */ FlowCollector $this_unsafeFlow;

                        /* compiled from: Emitters.kt */
                        @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
                        @DebugMetadata(c = "io.intercom.android.sdk.m5.home.HomeViewModel$2$invokeSuspend$$inlined$filterIsInstance$1$2", f = "HomeViewModel.kt", i = {}, l = {219}, m = "emit", n = {}, s = {})
                        /* renamed from: io.intercom.android.sdk.m5.home.HomeViewModel$2$invokeSuspend$$inlined$filterIsInstance$1$2$1, reason: invalid class name */
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
                Flow<ParsedNexusEvent.ConversationNexusEvent> flow2 = new Flow<ParsedNexusEvent.ConversationNexusEvent>() { // from class: io.intercom.android.sdk.m5.home.HomeViewModel$2$invokeSuspend$$inlined$filter$1

                    /* compiled from: Emitters.kt */
                    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u00032\u0006\u0010\u0004\u001a\u0002H\u0002H\u008a@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\b"}, d2 = {"<anonymous>", "", ExifInterface.GPS_DIRECTION_TRUE, "R", "value", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx/coroutines/flow/FlowKt__EmittersKt$unsafeTransform$1$1", "kotlinx/coroutines/flow/FlowKt__TransformKt$filter$$inlined$unsafeTransform$1$2"}, k = 3, mv = {2, 0, 0}, xi = 48)
                    /* renamed from: io.intercom.android.sdk.m5.home.HomeViewModel$2$invokeSuspend$$inlined$filter$1$2, reason: invalid class name */
                    public static final class AnonymousClass2<T> implements FlowCollector {
                        final /* synthetic */ FlowCollector $this_unsafeFlow;

                        /* compiled from: Emitters.kt */
                        @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
                        @DebugMetadata(c = "io.intercom.android.sdk.m5.home.HomeViewModel$2$invokeSuspend$$inlined$filter$1$2", f = "HomeViewModel.kt", i = {}, l = {219}, m = "emit", n = {}, s = {})
                        /* renamed from: io.intercom.android.sdk.m5.home.HomeViewModel$2$invokeSuspend$$inlined$filter$1$2$1, reason: invalid class name */
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
                final HomeViewModel homeViewModel = HomeViewModel.this;
                this.label = 1;
                if (flow2.collect(new FlowCollector() { // from class: io.intercom.android.sdk.m5.home.HomeViewModel.2.2
                    public final Object emit(ParsedNexusEvent.ConversationNexusEvent conversationNexusEvent, Continuation<? super Unit> continuation) {
                        HomeViewModel.this.fetchHomeData();
                        return Unit.INSTANCE;
                    }

                    @Override // kotlinx.coroutines.flow.FlowCollector
                    public /* bridge */ /* synthetic */ Object emit(Object obj2, Continuation continuation) {
                        return emit((ParsedNexusEvent.ConversationNexusEvent) obj2, (Continuation<? super Unit>) continuation);
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

    private final void handleOpening(OpenToSpace openToSpace) {
        int i = WhenMappings.$EnumSwitchMapping$0[openToSpace.ordinal()];
        if (i == 1) {
            fetchHomeData();
            return;
        }
        if (i == 2) {
            BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new HomeViewModel$handleOpening$1(this, null), 3, null);
        } else {
            if (i != 3) {
                throw new NoWhenBranchMatchedException();
            }
            if (this.hasConversationScreenOpenedDirectlyFromHome) {
                return;
            }
            BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new HomeViewModel$handleOpening$2(this, null), 3, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void fetchHomeData() {
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), this.dispatcher, null, new HomeViewModel$fetchHomeData$1(this, null), 2, null);
    }

    public final void onHeaderImageLoaded() {
        HomeClientState value;
        MutableStateFlow<HomeClientState> mutableStateFlow = this.clientState;
        do {
            value = mutableStateFlow.getValue();
        } while (!mutableStateFlow.compareAndSet(value, HomeClientState.copy$default(value, null, null, true, 3, null)));
    }

    public final void onRetryClicked() {
        HomeClientState value;
        MutableStateFlow<HomeClientState> mutableStateFlow = this.clientState;
        do {
            value = mutableStateFlow.getValue();
        } while (!mutableStateFlow.compareAndSet(value, HomeClientState.copy$default(value, null, null, false, 6, null)));
        fetchHomeData();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onConfig(AppConfig config) {
        OpenToSpace openToSpace;
        HomeConfig home;
        OpenConfig openConfig;
        ConfigModules configModules = config.getConfigModules();
        if (configModules == null || (home = configModules.getHome()) == null || (openConfig = home.getOpenConfig()) == null || (openToSpace = openConfig.getOpenTo()) == null) {
            openToSpace = OpenToSpace.HOME;
        }
        handleOpening(openToSpace);
    }

    /* compiled from: HomeViewModel.kt */
    @Metadata(d1 = {"\u0000%\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\b\u0003*\u0001\u000b\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tJ\u0015\u0010\n\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\tH\u0002¢\u0006\u0002\u0010\f¨\u0006\r"}, d2 = {"Lio/intercom/android/sdk/m5/home/HomeViewModel$Companion;", "", "<init>", "()V", "create", "Lio/intercom/android/sdk/m5/home/HomeViewModel;", "owner", "Landroidx/lifecycle/ViewModelStoreOwner;", "lifecycle", "Landroidx/lifecycle/Lifecycle;", "factory", "io/intercom/android/sdk/m5/home/HomeViewModel$Companion$factory$1", "(Landroidx/lifecycle/Lifecycle;)Lio/intercom/android/sdk/m5/home/HomeViewModel$Companion$factory$1;", "intercom-sdk-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final HomeViewModel create(ViewModelStoreOwner owner, Lifecycle lifecycle) {
            Intrinsics.checkNotNullParameter(owner, "owner");
            Intrinsics.checkNotNullParameter(lifecycle, "lifecycle");
            return (HomeViewModel) new ViewModelProvider(owner, factory(lifecycle)).get(HomeViewModel.class);
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [io.intercom.android.sdk.m5.home.HomeViewModel$Companion$factory$1] */
        private final HomeViewModel$Companion$factory$1 factory(final Lifecycle lifecycle) {
            return new ViewModelProvider.Factory() { // from class: io.intercom.android.sdk.m5.home.HomeViewModel$Companion$factory$1
                /* JADX WARN: Multi-variable type inference failed */
                @Override // androidx.lifecycle.ViewModelProvider.Factory
                public <T extends ViewModel> T create(Class<T> modelClass) {
                    Intrinsics.checkNotNullParameter(modelClass, "modelClass");
                    IntercomDataLayer dataLayer = Injector.get().getDataLayer();
                    HomeRepository homeRepository = new HomeRepository(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
                    MessengerApi messengerApi = Injector.get().getMessengerApi();
                    Intrinsics.checkNotNullExpressionValue(messengerApi, "getMessengerApi(...)");
                    Intrinsics.checkNotNull(dataLayer);
                    return new HomeViewModel(Lifecycle.this, homeRepository, new CommonRepository(messengerApi, dataLayer), null, dataLayer, null, 40, null);
                }
            };
        }
    }
}
