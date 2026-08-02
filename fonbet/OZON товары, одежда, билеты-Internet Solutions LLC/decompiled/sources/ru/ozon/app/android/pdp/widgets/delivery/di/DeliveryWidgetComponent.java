package ru.ozon.app.android.pdp.widgets.delivery.di;

import DD.a;
import Sc.InterfaceC4008j;
import Sc.k;
import WZ.l;
import hi.InterfaceC6958a;
import k20.C7473e;
import k20.C7475g;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.N;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.composer.di.composer.RetainComposerComponentApi;
import ru.ozon.app.android.composer.throttle.HandlersInhibitor;
import ru.ozon.app.android.composer.widgets.async.di.ComposerWidgetAsyncComponentApi;
import ru.ozon.app.android.network.di.NetworkComponentApi;
import ru.ozon.app.android.pdp.widgets.delivery.async.AsyncDeliveryPlaceholderMapper;
import ru.ozon.app.android.pdp.widgets.delivery.async.AsyncDeliveryWidgetViewModel;
import ru.ozon.app.android.pdp.widgets.delivery.v5.core.DeliveryV5Mapper;

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b`\u0018\u0000 \u00172\u00060\u0001j\u0002`\u0002:\u0001\u0017R\u0014\u0010\u0006\u001a\u00020\u00038&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005R\u0014\u0010\n\u001a\u00020\u00078&X¦\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR\u0014\u0010\u000e\u001a\u00020\u000b8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\f\u0010\rR\u0014\u0010\u0012\u001a\u00020\u000f8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0016\u001a\u00020\u00138&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0018"}, d2 = {"Lru/ozon/app/android/pdp/widgets/delivery/di/DeliveryWidgetComponent;", "Lhi/a;", "Lru/ozon/app/android/di/provider/component/DiComponent;", "LWZ/l;", "getTokenizedAnalytics", "()LWZ/l;", "tokenizedAnalytics", "Lru/ozon/app/android/pdp/widgets/delivery/async/AsyncDeliveryWidgetViewModel;", "getAsyncViewModel", "()Lru/ozon/app/android/pdp/widgets/delivery/async/AsyncDeliveryWidgetViewModel;", "asyncViewModel", "Lru/ozon/app/android/composer/throttle/HandlersInhibitor;", "getHandlersInhibitor", "()Lru/ozon/app/android/composer/throttle/HandlersInhibitor;", "handlersInhibitor", "Lru/ozon/app/android/pdp/widgets/delivery/v5/core/DeliveryV5Mapper;", "getMapperV5", "()Lru/ozon/app/android/pdp/widgets/delivery/v5/core/DeliveryV5Mapper;", "mapperV5", "Lru/ozon/app/android/pdp/widgets/delivery/async/AsyncDeliveryPlaceholderMapper;", "getAsyncMapper", "()Lru/ozon/app/android/pdp/widgets/delivery/async/AsyncDeliveryPlaceholderMapper;", "asyncMapper", "Companion", "pdp_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public interface DeliveryWidgetComponent extends InterfaceC6958a {

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = Companion.$$INSTANCE;

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J#\u0010\n\u001a\f\u0012\u0004\u0012\u00020\b0\u0007j\u0002`\t2\n\u0010\u0006\u001a\u00060\u0004j\u0002`\u0005¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Lru/ozon/app/android/pdp/widgets/delivery/di/DeliveryWidgetComponent$Companion;", "", "<init>", "()V", "Lk20/g;", "Lru/ozon/app/android/composer/widgets/v2/di/ComposerWidgetComponentStorage;", "storage", "Lk20/e;", "Lru/ozon/app/android/pdp/widgets/delivery/di/DeliveryWidgetComponent;", "Lru/ozon/app/android/composer/widgets/v2/di/WidgetComponent;", "create", "(Lk20/g;)Lk20/e;", "pdp_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();

        private Companion() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final DeliveryWidgetComponent create$lambda$0(final C7475g c7475g) {
            return new DeliveryWidgetComponent(c7475g) { // from class: ru.ozon.app.android.pdp.widgets.delivery.di.DeliveryWidgetComponent$Companion$create$1$1
                private final ComposerWidgetAsyncComponentApi composerWidgetAsyncComponentApi;
                private final NetworkComponentApi networkComponentApi;
                private final RetainComposerComponentApi retainComposerComponentApi;

                /* renamed from: handlersInhibitor$delegate, reason: from kotlin metadata */
                private final InterfaceC4008j handlersInhibitor = k.b(DeliveryWidgetComponent$Companion$create$1$1$handlersInhibitor$2.INSTANCE);

                /* renamed from: mapperV5$delegate, reason: from kotlin metadata */
                private final InterfaceC4008j mapperV5 = k.b(DeliveryWidgetComponent$Companion$create$1$1$mapperV5$2.INSTANCE);

                /* renamed from: asyncMapper$delegate, reason: from kotlin metadata */
                private final InterfaceC4008j asyncMapper = k.b(DeliveryWidgetComponent$Companion$create$1$1$asyncMapper$2.INSTANCE);

                {
                    this.composerWidgetAsyncComponentApi = (ComposerWidgetAsyncComponentApi) c7475g.getComponent(ComposerWidgetAsyncComponentApi.class);
                    this.retainComposerComponentApi = (RetainComposerComponentApi) c7475g.getComponent(RetainComposerComponentApi.class);
                    this.networkComponentApi = (NetworkComponentApi) c7475g.getComponent(NetworkComponentApi.class);
                }

                @Override // ru.ozon.app.android.pdp.widgets.delivery.di.DeliveryWidgetComponent
                public AsyncDeliveryPlaceholderMapper getAsyncMapper() {
                    return (AsyncDeliveryPlaceholderMapper) this.asyncMapper.getValue();
                }

                @Override // ru.ozon.app.android.pdp.widgets.delivery.di.DeliveryWidgetComponent
                public AsyncDeliveryWidgetViewModel getAsyncViewModel() {
                    return new AsyncDeliveryWidgetViewModel(this.composerWidgetAsyncComponentApi.getComposerAsyncWidgetRepository());
                }

                @Override // ru.ozon.app.android.pdp.widgets.delivery.di.DeliveryWidgetComponent
                public HandlersInhibitor getHandlersInhibitor() {
                    return (HandlersInhibitor) this.handlersInhibitor.getValue();
                }

                @Override // ru.ozon.app.android.pdp.widgets.delivery.di.DeliveryWidgetComponent
                public DeliveryV5Mapper getMapperV5() {
                    return (DeliveryV5Mapper) this.mapperV5.getValue();
                }

                @Override // ru.ozon.app.android.pdp.widgets.delivery.di.DeliveryWidgetComponent
                public l getTokenizedAnalytics() {
                    return this.retainComposerComponentApi.getTokenizedAnalytics();
                }
            };
        }

        @NotNull
        public final C7473e<DeliveryWidgetComponent> create(@NotNull C7475g storage) {
            Intrinsics.checkNotNullParameter(storage, "storage");
            return new C7473e<>(N.b(DeliveryWidgetComponent.class), new a(storage, 0));
        }
    }

    @NotNull
    AsyncDeliveryPlaceholderMapper getAsyncMapper();

    @NotNull
    AsyncDeliveryWidgetViewModel getAsyncViewModel();

    @NotNull
    HandlersInhibitor getHandlersInhibitor();

    @NotNull
    DeliveryV5Mapper getMapperV5();

    @NotNull
    l getTokenizedAnalytics();
}
