package ru.ozon.app.android.travel.utils.asyncWidget.asyncAction;

import Sc.o;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.h;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.analytics.performance.PerformanceTrackerDelegate;
import ru.ozon.app.android.composer.widgets.async.data.ComposerAsyncWidgetRepository;
import ru.ozon.app.android.travel.utils.asyncWidget.AbstractAsyncWidgetViewModel;
import ru.ozon.app.android.travel.utils.asyncWidget.AsyncWidgetCallbacks;
import ru.ozon.app.android.travel.utils.asyncWidget.AsyncWidgetFetchedModel;
import ru.ozon.app.android.travel.utils.asyncWidget.AsyncWidgetStateMapper;
import ru.ozon.app.android.travel.utils.asyncWidget.AsyncWidgetTraceNameProvider;
import ru.ozon.app.android.travel.utils.asyncWidget.asyncAction.AsyncActionVO;
import ru.ozon.app.android.travel.utils.asyncWidget.asyncAction.HasAsyncAction;
import ru.ozon.app.android.utils.dispatcherprovider.CoroutineDispatcherProvider;
import ru.ozon.uni.atoms.data.AtomActionDTO;

@Metadata(d1 = {"\u0000r\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010$\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\b\u0005\n\u0002\b\u0005*\u000216\b'\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u0001*\b\b\u0001\u0010\u0004*\u00020\u00032\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0005BO\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f\u0012\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00028\u00000\u000e\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0012\u0010\u0013J-\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u0015\u001a\u00020\u00142\u0014\u0010\u0017\u001a\u0010\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u0014\u0018\u00010\u0016H\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ\u0019\u0010\u001d\u001a\u00020\u00182\b\u0010\u001c\u001a\u0004\u0018\u00010\u001bH\u0002¢\u0006\u0004\b\u001d\u0010\u001eJ\u001d\u0010!\u001a\u00020\u00182\u000e\u0010 \u001a\n\u0012\u0004\u0012\u00028\u0001\u0018\u00010\u001f¢\u0006\u0004\b!\u0010\"J\r\u0010#\u001a\u00020\u0018¢\u0006\u0004\b#\u0010$J\u0017\u0010'\u001a\u00020\u00182\b\u0010&\u001a\u0004\u0018\u00010%¢\u0006\u0004\b'\u0010(J\r\u0010)\u001a\u00020\u0018¢\u0006\u0004\b)\u0010$J\u0015\u0010+\u001a\u00020\u00182\u0006\u0010*\u001a\u00020\u001b¢\u0006\u0004\b+\u0010\u001eR\u001a\u0010\u000f\u001a\b\u0012\u0004\u0012\u00028\u00000\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010,R\u0014\u0010\u0011\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010-R\u0018\u0010.\u001a\u0004\u0018\u00010\u001b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b.\u0010/R\u001e\u0010 \u001a\n\u0012\u0004\u0012\u00028\u0001\u0018\u00010\u001f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b \u00100R\u0016\u00102\u001a\u0002018\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b2\u00103R\u0018\u00104\u001a\u0004\u0018\u00010%8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b4\u00105R\u0016\u00107\u001a\u0002068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b7\u00108R\u0016\u00109\u001a\u00020\u00108\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b9\u0010-¨\u0006:"}, d2 = {"Lru/ozon/app/android/travel/utils/asyncWidget/asyncAction/AsyncActionAsyncWidgetViewModel;", "", "DTO", "Lru/ozon/app/android/travel/utils/asyncWidget/asyncAction/HasAsyncAction;", "VO", "Lru/ozon/app/android/travel/utils/asyncWidget/AbstractAsyncWidgetViewModel;", "Lru/ozon/app/android/composer/widgets/async/data/ComposerAsyncWidgetRepository;", "asyncWidgetRepository", "Lru/ozon/app/android/travel/utils/asyncWidget/AsyncWidgetStateMapper;", "stateMapper", "Lru/ozon/app/android/utils/dispatcherprovider/CoroutineDispatcherProvider;", "dispatcherProvider", "Lru/ozon/app/android/analytics/performance/PerformanceTrackerDelegate;", "performanceTrackerDelegate", "Ljava/lang/Class;", "dtoClass", "", "retriesCount", "<init>", "(Lru/ozon/app/android/composer/widgets/async/data/ComposerAsyncWidgetRepository;Lru/ozon/app/android/travel/utils/asyncWidget/AsyncWidgetStateMapper;Lru/ozon/app/android/utils/dispatcherprovider/CoroutineDispatcherProvider;Lru/ozon/app/android/analytics/performance/PerformanceTrackerDelegate;Ljava/lang/Class;I)V", "", "asyncData", "", "params", "", "internalFetch", "(Ljava/lang/String;Ljava/util/Map;)V", "Lru/ozon/app/android/travel/utils/asyncWidget/asyncAction/AsyncActionVO;", "action", "handleAsyncAction", "(Lru/ozon/app/android/travel/utils/asyncWidget/asyncAction/AsyncActionVO;)V", "Lru/ozon/app/android/travel/utils/asyncWidget/asyncAction/AsyncActionWidgetCallbacks;", "callbacks", "setCallbacks", "(Lru/ozon/app/android/travel/utils/asyncWidget/asyncAction/AsyncActionWidgetCallbacks;)V", "removeCallbacks", "()V", "Lru/ozon/app/android/travel/utils/asyncWidget/AsyncWidgetTraceNameProvider;", "provider", "setTraceNameProvider", "(Lru/ozon/app/android/travel/utils/asyncWidget/AsyncWidgetTraceNameProvider;)V", "removeTraceNameProvider", "asyncAction", "submit", "Ljava/lang/Class;", "I", "cachedAsyncActionVO", "Lru/ozon/app/android/travel/utils/asyncWidget/asyncAction/AsyncActionVO;", "Lru/ozon/app/android/travel/utils/asyncWidget/asyncAction/AsyncActionWidgetCallbacks;", "ru/ozon/app/android/travel/utils/asyncWidget/asyncAction/AsyncActionAsyncWidgetViewModel$proxyCallbacks$1", "proxyCallbacks", "Lru/ozon/app/android/travel/utils/asyncWidget/asyncAction/AsyncActionAsyncWidgetViewModel$proxyCallbacks$1;", "traceNameProvider", "Lru/ozon/app/android/travel/utils/asyncWidget/AsyncWidgetTraceNameProvider;", "ru/ozon/app/android/travel/utils/asyncWidget/asyncAction/AsyncActionAsyncWidgetViewModel$proxyTraceNameProvider$1", "proxyTraceNameProvider", "Lru/ozon/app/android/travel/utils/asyncWidget/asyncAction/AsyncActionAsyncWidgetViewModel$proxyTraceNameProvider$1;", "retriesCounter", "utils_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public abstract class AsyncActionAsyncWidgetViewModel<DTO, VO extends HasAsyncAction> extends AbstractAsyncWidgetViewModel<DTO, VO> {
    private AsyncActionVO cachedAsyncActionVO;
    private AsyncActionWidgetCallbacks<VO> callbacks;

    @NotNull
    private final Class<DTO> dtoClass;

    @NotNull
    private AsyncActionAsyncWidgetViewModel$proxyCallbacks$1 proxyCallbacks;

    @NotNull
    private AsyncActionAsyncWidgetViewModel$proxyTraceNameProvider$1 proxyTraceNameProvider;
    private final int retriesCount;
    private int retriesCounter;
    private AsyncWidgetTraceNameProvider traceNameProvider;

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[AsyncActionVO.AsyncBehaviorType.values().length];
            try {
                iArr[AsyncActionVO.AsyncBehaviorType.UNDEFINED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[AsyncActionVO.AsyncBehaviorType.NO_ACTION.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[AsyncActionVO.AsyncBehaviorType.ACTION_STATE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[AsyncActionVO.AsyncBehaviorType.FETCH_STATE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public /* synthetic */ AsyncActionAsyncWidgetViewModel(ComposerAsyncWidgetRepository composerAsyncWidgetRepository, AsyncWidgetStateMapper asyncWidgetStateMapper, CoroutineDispatcherProvider coroutineDispatcherProvider, PerformanceTrackerDelegate performanceTrackerDelegate, Class cls, int i11, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this(composerAsyncWidgetRepository, asyncWidgetStateMapper, coroutineDispatcherProvider, (i12 & 8) != 0 ? null : performanceTrackerDelegate, cls, (i12 & 32) != 0 ? 3 : i11);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void handleAsyncAction(AsyncActionVO action) {
        if (action == null) {
            return;
        }
        int i11 = WhenMappings.$EnumSwitchMapping$0[action.getType().ordinal()];
        if (i11 == 1 || i11 == 2) {
            return;
        }
        if (i11 != 3) {
            if (i11 != 4) {
                throw new o();
            }
            String asyncData = action.getAsyncData();
            if (asyncData != null && !h.K(asyncData)) {
                internalFetch(asyncData, action.getAsyncParams());
                return;
            }
            AsyncActionWidgetCallbacks<VO> asyncActionWidgetCallbacks = this.callbacks;
            if (asyncActionWidgetCallbacks != null) {
                asyncActionWidgetCallbacks.onAsyncWidgetFetchingFailed(new IllegalStateException("FETCH_STATE требует asyncData, но он null/blank"));
                return;
            }
            return;
        }
        AtomActionDTO action2 = action.getAction();
        if (action2 == null) {
            AsyncActionWidgetCallbacks<VO> asyncActionWidgetCallbacks2 = this.callbacks;
            if (asyncActionWidgetCallbacks2 != null) {
                asyncActionWidgetCallbacks2.onAsyncWidgetFetchingFailed(new IllegalStateException("ACTION_STATE требует action: AtomActionDTO, но он null"));
                return;
            }
            return;
        }
        AsyncActionWidgetCallbacks<VO> asyncActionWidgetCallbacks3 = this.callbacks;
        if (asyncActionWidgetCallbacks3 != null) {
            asyncActionWidgetCallbacks3.onAsyncWidgetAction(action2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void internalFetch(String asyncData, Map<String, String> params) {
        fetchWidget(this.dtoClass, asyncData, params);
    }

    public final void removeCallbacks() {
        this.callbacks = null;
    }

    public final void removeTraceNameProvider() {
        this.traceNameProvider = null;
    }

    public final void setCallbacks(AsyncActionWidgetCallbacks<VO> callbacks) {
        this.callbacks = callbacks;
    }

    public final void setTraceNameProvider(AsyncWidgetTraceNameProvider provider) {
        this.traceNameProvider = provider;
    }

    public final void submit(@NotNull AsyncActionVO asyncAction) {
        Intrinsics.checkNotNullParameter(asyncAction, "asyncAction");
        if (Intrinsics.d(this.cachedAsyncActionVO, asyncAction)) {
            return;
        }
        this.retriesCounter = 0;
        this.cachedAsyncActionVO = asyncAction;
        handleAsyncAction(asyncAction);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Type inference failed for: r2v1, types: [ru.ozon.app.android.travel.utils.asyncWidget.asyncAction.AsyncActionAsyncWidgetViewModel$proxyCallbacks$1] */
    /* JADX WARN: Type inference failed for: r2v2, types: [ru.ozon.app.android.travel.utils.asyncWidget.AsyncWidgetTraceNameProvider, ru.ozon.app.android.travel.utils.asyncWidget.asyncAction.AsyncActionAsyncWidgetViewModel$proxyTraceNameProvider$1] */
    public AsyncActionAsyncWidgetViewModel(@NotNull ComposerAsyncWidgetRepository asyncWidgetRepository, @NotNull AsyncWidgetStateMapper<DTO, VO> stateMapper, @NotNull CoroutineDispatcherProvider dispatcherProvider, PerformanceTrackerDelegate performanceTrackerDelegate, @NotNull Class<DTO> dtoClass, int i11) {
        super(asyncWidgetRepository, stateMapper, dispatcherProvider, performanceTrackerDelegate);
        Intrinsics.checkNotNullParameter(asyncWidgetRepository, "asyncWidgetRepository");
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        Intrinsics.checkNotNullParameter(dispatcherProvider, "dispatcherProvider");
        Intrinsics.checkNotNullParameter(dtoClass, "dtoClass");
        this.dtoClass = dtoClass;
        this.retriesCount = i11;
        this.proxyCallbacks = new AsyncWidgetCallbacks<VO>(this) { // from class: ru.ozon.app.android.travel.utils.asyncWidget.asyncAction.AsyncActionAsyncWidgetViewModel$proxyCallbacks$1
            final /* synthetic */ AsyncActionAsyncWidgetViewModel<DTO, VO> this$0;

            {
                this.this$0 = this;
            }

            @Override // ru.ozon.app.android.travel.utils.asyncWidget.AsyncWidgetCallbacks
            public void onAsyncWidgetFetched(AsyncWidgetFetchedModel<VO> fetchedModel) {
                AsyncActionWidgetCallbacks asyncActionWidgetCallbacks;
                AsyncActionVO asyncActionVO;
                AsyncActionVO asyncActionVO2;
                Intrinsics.checkNotNullParameter(fetchedModel, "fetchedModel");
                asyncActionWidgetCallbacks = ((AsyncActionAsyncWidgetViewModel) this.this$0).callbacks;
                if (asyncActionWidgetCallbacks != null) {
                    asyncActionWidgetCallbacks.onAsyncWidgetFetched(fetchedModel);
                }
                AsyncActionAsyncWidgetViewModel<DTO, VO> asyncActionAsyncWidgetViewModel = this.this$0;
                AsyncActionVO asyncAction = ((HasAsyncAction) fetchedModel.getFetchedState()).getAsyncAction();
                AsyncActionVO asyncActionVO3 = null;
                if (asyncAction != null) {
                    asyncActionVO2 = ((AsyncActionAsyncWidgetViewModel) this.this$0).cachedAsyncActionVO;
                    asyncActionVO3 = AsyncActionVO.copy$default(asyncAction, null, asyncActionVO2 != null ? asyncActionVO2.getAsyncData() : null, null, null, 13, null);
                }
                ((AsyncActionAsyncWidgetViewModel) asyncActionAsyncWidgetViewModel).cachedAsyncActionVO = asyncActionVO3;
                AsyncActionAsyncWidgetViewModel<DTO, VO> asyncActionAsyncWidgetViewModel2 = this.this$0;
                asyncActionVO = ((AsyncActionAsyncWidgetViewModel) asyncActionAsyncWidgetViewModel2).cachedAsyncActionVO;
                asyncActionAsyncWidgetViewModel2.handleAsyncAction(asyncActionVO);
            }

            @Override // ru.ozon.app.android.travel.utils.asyncWidget.AsyncWidgetCallbacks
            public void onAsyncWidgetFetchingFailed(Throwable throwable) {
                int i12;
                AsyncActionVO asyncActionVO;
                AsyncActionWidgetCallbacks asyncActionWidgetCallbacks;
                int i13;
                int i14;
                AsyncActionVO asyncActionVO2;
                Intrinsics.checkNotNullParameter(throwable, "throwable");
                i12 = ((AsyncActionAsyncWidgetViewModel) this.this$0).retriesCounter;
                ((AsyncActionAsyncWidgetViewModel) this.this$0).retriesCounter = i12 + 1;
                asyncActionVO = ((AsyncActionAsyncWidgetViewModel) this.this$0).cachedAsyncActionVO;
                String asyncData = asyncActionVO != null ? asyncActionVO.getAsyncData() : null;
                if (asyncData != null) {
                    i13 = ((AsyncActionAsyncWidgetViewModel) this.this$0).retriesCounter;
                    i14 = ((AsyncActionAsyncWidgetViewModel) this.this$0).retriesCount;
                    if (i13 < i14) {
                        AsyncActionAsyncWidgetViewModel<DTO, VO> asyncActionAsyncWidgetViewModel = this.this$0;
                        asyncActionVO2 = ((AsyncActionAsyncWidgetViewModel) asyncActionAsyncWidgetViewModel).cachedAsyncActionVO;
                        asyncActionAsyncWidgetViewModel.internalFetch(asyncData, asyncActionVO2 != null ? asyncActionVO2.getAsyncParams() : null);
                        return;
                    }
                }
                ((AsyncActionAsyncWidgetViewModel) this.this$0).retriesCounter = 0;
                asyncActionWidgetCallbacks = ((AsyncActionAsyncWidgetViewModel) this.this$0).callbacks;
                if (asyncActionWidgetCallbacks != null) {
                    asyncActionWidgetCallbacks.onAsyncWidgetFetchingFailed(throwable);
                }
            }

            @Override // ru.ozon.app.android.travel.utils.asyncWidget.AsyncWidgetCallbacks
            public void onAsyncWidgetSkipped() {
                AsyncActionWidgetCallbacks asyncActionWidgetCallbacks;
                asyncActionWidgetCallbacks = ((AsyncActionAsyncWidgetViewModel) this.this$0).callbacks;
                if (asyncActionWidgetCallbacks != null) {
                    asyncActionWidgetCallbacks.onAsyncWidgetSkipped();
                }
            }
        };
        ?? r22 = new AsyncWidgetTraceNameProvider(this) { // from class: ru.ozon.app.android.travel.utils.asyncWidget.asyncAction.AsyncActionAsyncWidgetViewModel$proxyTraceNameProvider$1
            final /* synthetic */ AsyncActionAsyncWidgetViewModel<DTO, VO> this$0;

            {
                this.this$0 = this;
            }

            @Override // ru.ozon.app.android.travel.utils.asyncWidget.AsyncWidgetTraceNameProvider
            public String provideTraceWidgetName() {
                AsyncWidgetTraceNameProvider asyncWidgetTraceNameProvider;
                asyncWidgetTraceNameProvider = ((AsyncActionAsyncWidgetViewModel) this.this$0).traceNameProvider;
                if (asyncWidgetTraceNameProvider != null) {
                    return asyncWidgetTraceNameProvider.provideTraceWidgetName();
                }
                return null;
            }
        };
        this.proxyTraceNameProvider = r22;
        observeEvents(this.proxyCallbacks, r22);
    }
}
