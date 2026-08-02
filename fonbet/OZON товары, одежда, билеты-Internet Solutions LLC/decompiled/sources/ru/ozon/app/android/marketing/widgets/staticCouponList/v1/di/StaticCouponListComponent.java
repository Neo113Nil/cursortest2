package ru.ozon.app.android.marketing.widgets.staticCouponList.v1.di;

import Pc.a;
import Sc.InterfaceC4008j;
import Sc.k;
import WZ.l;
import hi.InterfaceC6958a;
import java.util.Map;
import k20.C7475g;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.collections.U;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.action.di.ActionComponentApi;
import ru.ozon.app.android.cart.common.dynamicElement.DynamicElementDTO;
import ru.ozon.app.android.composer.di.composer.RetainComposerComponentApi;
import ru.ozon.app.android.composer.throttle.HandlersInhibitor;
import ru.ozon.app.android.di.provider.component.ContextComponentDependencies;
import ru.ozon.app.android.marketing.R$id;
import ru.ozon.app.android.marketing.widgets.staticCouponList.v1.data.StaticCouponListMapper;
import ru.ozon.app.android.marketing.widgets.staticCouponList.v1.presentation.StaticCouponListPayloadManager;
import ru.ozon.app.android.marketing.widgets.staticCouponList.v1.presentation.StaticCouponListWidgetViewModel;
import ru.ozon.app.android.marketing.widgets.staticCouponList.v1.presentation.adapter.StaticCouponListContentAdapterDelegate;
import ru.ozon.app.android.marketing.widgets.staticCouponList.v1.presentation.adapter.StaticCouponListContentDiffUtil;
import ru.ozon.app.android.marketing.widgets.staticCouponList.v1.presentation.adapter.StaticCouponListContentPayloadManager;
import ru.ozon.app.android.marketing.widgets.staticCouponList.v1.presentation.badge.StaticCouponListBadgeDelegate;
import ru.ozon.app.android.marketing.widgets.staticCouponList.v1.presentation.badge.StaticCouponListTimerFormatter;
import ru.ozon.app.android.marketing.widgets.staticCouponList.v1.presentation.coupon.StaticCouponListCouponDelegate;
import ru.ozon.app.android.marketing.widgets.staticCouponList.v1.presentation.creative.StaticCouponListCreativeDelegate;
import ru.ozon.app.android.travel.utils.timerFlow.ElapsedTimeProvider;
import ru.ozon.app.android.travel.utils.timerFlow.ElapsedTimeProviderImpl;
import ru.ozon.app.android.travel.utils.timerFlow.TimerFlow;
import ru.ozon.app.android.utils.dispatcherprovider.di.CoroutineDispatchersComponentApi;

@Metadata(d1 = {"\u0000\u0094\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00060\u0001j\u0002`\u0002B\u0013\u0012\n\u0010\u0005\u001a\u00060\u0003j\u0002`\u0004¢\u0006\u0004\b\u0006\u0010\u0007R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\nR\u0014\u0010\f\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0012\u001a\u00020\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u001b\u0010\u0019\u001a\u00020\u00148FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u001b\u0010\u001e\u001a\u00020\u001a8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u001b\u0010\u0016\u001a\u0004\b\u001c\u0010\u001dR\u001d\u0010!\u001a\b\u0012\u0004\u0012\u00020 0\u001f8\u0006¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010$R\u0014\u0010(\u001a\u00020%8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b&\u0010'R\u001a\u0010-\u001a\b\u0012\u0004\u0012\u00020*0)8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b+\u0010,R\u001d\u00103\u001a\u000e\u0012\u0004\u0012\u00020/\u0012\u0004\u0012\u0002000.8F¢\u0006\u0006\u001a\u0004\b1\u00102R\u0011\u00107\u001a\u0002048F¢\u0006\u0006\u001a\u0004\b5\u00106R\u0011\u0010;\u001a\u0002088F¢\u0006\u0006\u001a\u0004\b9\u0010:R\u0015\u0010@\u001a\u00060<j\u0002`=8F¢\u0006\u0006\u001a\u0004\b>\u0010?¨\u0006A"}, d2 = {"Lru/ozon/app/android/marketing/widgets/staticCouponList/v1/di/StaticCouponListComponent;", "Lhi/a;", "Lru/ozon/app/android/di/provider/component/DiComponent;", "Lk20/g;", "Lru/ozon/app/android/composer/widgets/v2/di/ComposerWidgetComponentStorage;", "storage", "<init>", "(Lk20/g;)V", "Lru/ozon/app/android/utils/dispatcherprovider/di/CoroutineDispatchersComponentApi;", "coroutineDispatchersComponentApi", "Lru/ozon/app/android/utils/dispatcherprovider/di/CoroutineDispatchersComponentApi;", "Lru/ozon/app/android/di/provider/component/ContextComponentDependencies;", "contextComponentDependencies", "Lru/ozon/app/android/di/provider/component/ContextComponentDependencies;", "Lru/ozon/app/android/composer/di/composer/RetainComposerComponentApi;", "retainComposerComponentApi", "Lru/ozon/app/android/composer/di/composer/RetainComposerComponentApi;", "Lru/ozon/app/android/action/di/ActionComponentApi;", "actionComponentApi", "Lru/ozon/app/android/action/di/ActionComponentApi;", "Lru/ozon/app/android/marketing/widgets/staticCouponList/v1/data/StaticCouponListMapper;", "mapper$delegate", "LSc/j;", "getMapper", "()Lru/ozon/app/android/marketing/widgets/staticCouponList/v1/data/StaticCouponListMapper;", "mapper", "Lru/ozon/app/android/composer/throttle/HandlersInhibitor;", "handlersInhibitor$delegate", "getHandlersInhibitor", "()Lru/ozon/app/android/composer/throttle/HandlersInhibitor;", "handlersInhibitor", "LPc/a;", "Lru/ozon/app/android/marketing/widgets/staticCouponList/v1/presentation/StaticCouponListWidgetViewModel;", "widgetViewModel", "LPc/a;", "getWidgetViewModel", "()LPc/a;", "Lru/ozon/app/android/travel/utils/timerFlow/ElapsedTimeProvider;", "getElapsedTimeProvider", "()Lru/ozon/app/android/travel/utils/timerFlow/ElapsedTimeProvider;", "elapsedTimeProvider", "Lru/ozon/app/android/travel/utils/timerFlow/TimerFlow;", "Lru/ozon/app/android/marketing/widgets/staticCouponList/v1/presentation/badge/StaticCouponListTimerFormatter$Time;", "getTimer", "()Lru/ozon/app/android/travel/utils/timerFlow/TimerFlow;", DynamicElementDTO.TIMER, "", "", "Lru/ozon/app/android/marketing/widgets/staticCouponList/v1/presentation/adapter/StaticCouponListContentAdapterDelegate;", "getDelegates", "()Ljava/util/Map;", "delegates", "Lru/ozon/app/android/marketing/widgets/staticCouponList/v1/presentation/StaticCouponListPayloadManager;", "getPayloadManager", "()Lru/ozon/app/android/marketing/widgets/staticCouponList/v1/presentation/StaticCouponListPayloadManager;", "payloadManager", "Lru/ozon/app/android/marketing/widgets/staticCouponList/v1/presentation/adapter/StaticCouponListContentDiffUtil;", "getContentDiffUtil", "()Lru/ozon/app/android/marketing/widgets/staticCouponList/v1/presentation/adapter/StaticCouponListContentDiffUtil;", "contentDiffUtil", "LWZ/l;", "Lru/ozon/app/android/analytics/modules/tokenized/TokenizedAnalytics;", "getTokenizedAnalytics", "()LWZ/l;", "tokenizedAnalytics", "marketing_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class StaticCouponListComponent implements InterfaceC6958a {

    @NotNull
    private final ActionComponentApi actionComponentApi;

    @NotNull
    private final ContextComponentDependencies contextComponentDependencies;

    @NotNull
    private final CoroutineDispatchersComponentApi coroutineDispatchersComponentApi;

    /* renamed from: handlersInhibitor$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j handlersInhibitor;

    /* renamed from: mapper$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j mapper;

    @NotNull
    private final RetainComposerComponentApi retainComposerComponentApi;

    @NotNull
    private final a<StaticCouponListWidgetViewModel> widgetViewModel;

    public StaticCouponListComponent(@NotNull C7475g storage) {
        Intrinsics.checkNotNullParameter(storage, "storage");
        this.coroutineDispatchersComponentApi = (CoroutineDispatchersComponentApi) storage.getComponent(CoroutineDispatchersComponentApi.class);
        this.contextComponentDependencies = (ContextComponentDependencies) storage.getComponent(ContextComponentDependencies.class);
        this.retainComposerComponentApi = (RetainComposerComponentApi) storage.getComponent(RetainComposerComponentApi.class);
        this.actionComponentApi = (ActionComponentApi) storage.getComponent(ActionComponentApi.class);
        this.mapper = k.b(new StaticCouponListComponent$mapper$2(this));
        this.handlersInhibitor = k.b(StaticCouponListComponent$handlersInhibitor$2.INSTANCE);
        this.widgetViewModel = new Ft.a(this, 1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final ElapsedTimeProvider getElapsedTimeProvider() {
        return new ElapsedTimeProviderImpl();
    }

    private final TimerFlow<StaticCouponListTimerFormatter.Time> getTimer() {
        return new TimerFlow<>(this.coroutineDispatchersComponentApi.getDispatcherProvider(), getElapsedTimeProvider());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final StaticCouponListWidgetViewModel widgetViewModel$lambda$0(StaticCouponListComponent staticCouponListComponent) {
        return new StaticCouponListWidgetViewModel(staticCouponListComponent.actionComponentApi.getActionRepository(), staticCouponListComponent.coroutineDispatchersComponentApi.getDispatcherProvider());
    }

    @NotNull
    public final StaticCouponListContentDiffUtil getContentDiffUtil() {
        return new StaticCouponListContentDiffUtil(new StaticCouponListContentPayloadManager());
    }

    @NotNull
    public final Map<Integer, StaticCouponListContentAdapterDelegate> getDelegates() {
        return U.j(new Pair(Integer.valueOf(R$id.staticCouponListCreativeDelegate), new StaticCouponListCreativeDelegate()), new Pair(Integer.valueOf(R$id.staticCouponListCouponDelegate), new StaticCouponListCouponDelegate()), new Pair(Integer.valueOf(R$id.staticCouponListBadgeDelegate), new StaticCouponListBadgeDelegate(getTimer())));
    }

    @NotNull
    public final HandlersInhibitor getHandlersInhibitor() {
        return (HandlersInhibitor) this.handlersInhibitor.getValue();
    }

    @NotNull
    public final StaticCouponListMapper getMapper() {
        return (StaticCouponListMapper) this.mapper.getValue();
    }

    @NotNull
    public final StaticCouponListPayloadManager getPayloadManager() {
        return new StaticCouponListPayloadManager();
    }

    @NotNull
    public final l getTokenizedAnalytics() {
        return this.retainComposerComponentApi.getTokenizedAnalytics();
    }

    @NotNull
    public final a<StaticCouponListWidgetViewModel> getWidgetViewModel() {
        return this.widgetViewModel;
    }
}
