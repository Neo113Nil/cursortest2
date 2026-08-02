package ru.ozon.app.android.orderdetails.ordershipment.orderShipment.presentation.action;

import GZ.g;
import Sc.InterfaceC4008j;
import Sc.k;
import Vg.d;
import hi.InterfaceC6958a;
import k20.C7475g;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.action.custom.ButtonWidgetCustomActionHandlers;
import ru.ozon.app.android.action.custom.di.CustomActionHandlersComponentApi;
import ru.ozon.app.android.action.custom.di.CustomActionHandlersComponentDependencies;
import ru.ozon.app.android.navigation.di.NavigationComponentApi;

@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b`\u0018\u0000 \u00142\u00060\u0001j\u0002`\u0002:\u0001\u0014R\u0014\u0010\u0006\u001a\u00020\u00038&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005R\u0014\u0010\n\u001a\u00020\u00078&X¦\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR\u0014\u0010\u000e\u001a\u00020\u000b8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\f\u0010\rR\u0018\u0010\u0013\u001a\u00060\u000fj\u0002`\u00108&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u0015"}, d2 = {"Lru/ozon/app/android/orderdetails/ordershipment/orderShipment/presentation/action/ActionOrderShipmentComponent;", "Lhi/a;", "Lru/ozon/app/android/di/provider/component/DiComponent;", "Lru/ozon/app/android/orderdetails/ordershipment/orderShipment/presentation/action/ActionOrderShipmentMapper;", "getMapper", "()Lru/ozon/app/android/orderdetails/ordershipment/orderShipment/presentation/action/ActionOrderShipmentMapper;", "mapper", "Lru/ozon/app/android/orderdetails/ordershipment/orderShipment/presentation/action/OrderShipmentViewModel;", "getOrderShipmentViewModel", "()Lru/ozon/app/android/orderdetails/ordershipment/orderShipment/presentation/action/OrderShipmentViewModel;", "orderShipmentViewModel", "Lru/ozon/app/android/action/custom/ButtonWidgetCustomActionHandlers;", "getButtonWidgetCustomActionHandlers", "()Lru/ozon/app/android/action/custom/ButtonWidgetCustomActionHandlers;", "buttonWidgetCustomActionHandlers", "LVg/d;", "Lru/ozon/app/android/action/custom/CustomActionHandlersStoreFactory;", "getCustomActionHandlersStoreFactory", "()LVg/d;", "customActionHandlersStoreFactory", "Companion", "orderdetails_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public interface ActionOrderShipmentComponent extends InterfaceC6958a {

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = Companion.$$INSTANCE;

    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\b\u001a\u00020\u00072\n\u0010\u0006\u001a\u00060\u0004j\u0002`\u0005¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lru/ozon/app/android/orderdetails/ordershipment/orderShipment/presentation/action/ActionOrderShipmentComponent$Companion;", "", "<init>", "()V", "Lk20/g;", "Lru/ozon/app/android/composer/widgets/v2/di/ComposerWidgetComponentStorage;", "storage", "Lru/ozon/app/android/orderdetails/ordershipment/orderShipment/presentation/action/ActionOrderShipmentComponent;", "create", "(Lk20/g;)Lru/ozon/app/android/orderdetails/ordershipment/orderShipment/presentation/action/ActionOrderShipmentComponent;", "orderdetails_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    /* loaded from: classes13.dex */
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();

        private Companion() {
        }

        @NotNull
        public final ActionOrderShipmentComponent create(@NotNull final C7475g storage) {
            Intrinsics.checkNotNullParameter(storage, "storage");
            return new ActionOrderShipmentComponent(storage) { // from class: ru.ozon.app.android.orderdetails.ordershipment.orderShipment.presentation.action.ActionOrderShipmentComponent$Companion$create$1
                private final CustomActionHandlersComponentApi customActionHandlersComponentApi;
                private final CustomActionHandlersComponentDependencies customActionHandlersComponentDependencies;

                /* renamed from: mapper$delegate, reason: from kotlin metadata */
                private final InterfaceC4008j mapper = k.b(ActionOrderShipmentComponent$Companion$create$1$mapper$2.INSTANCE);
                private final g ozonRouter;

                {
                    this.ozonRouter = ((NavigationComponentApi) storage.getComponent(NavigationComponentApi.class)).getOzonRouter();
                    this.customActionHandlersComponentApi = (CustomActionHandlersComponentApi) storage.getComponent(CustomActionHandlersComponentApi.class);
                    this.customActionHandlersComponentDependencies = (CustomActionHandlersComponentDependencies) storage.getComponent(CustomActionHandlersComponentDependencies.class);
                }

                @Override // ru.ozon.app.android.orderdetails.ordershipment.orderShipment.presentation.action.ActionOrderShipmentComponent
                public ButtonWidgetCustomActionHandlers getButtonWidgetCustomActionHandlers() {
                    return this.customActionHandlersComponentDependencies.getButtonWidgetCustomActionHandlers();
                }

                @Override // ru.ozon.app.android.orderdetails.ordershipment.orderShipment.presentation.action.ActionOrderShipmentComponent
                public d getCustomActionHandlersStoreFactory() {
                    return this.customActionHandlersComponentApi.getCustomActionHandlersStoreFactory();
                }

                @Override // ru.ozon.app.android.orderdetails.ordershipment.orderShipment.presentation.action.ActionOrderShipmentComponent
                public ActionOrderShipmentMapper getMapper() {
                    return (ActionOrderShipmentMapper) this.mapper.getValue();
                }

                @Override // ru.ozon.app.android.orderdetails.ordershipment.orderShipment.presentation.action.ActionOrderShipmentComponent
                public OrderShipmentViewModel getOrderShipmentViewModel() {
                    return new OrderShipmentViewModel(this.ozonRouter);
                }
            };
        }
    }

    @NotNull
    ButtonWidgetCustomActionHandlers getButtonWidgetCustomActionHandlers();

    @NotNull
    d getCustomActionHandlersStoreFactory();

    @NotNull
    ActionOrderShipmentMapper getMapper();

    @NotNull
    OrderShipmentViewModel getOrderShipmentViewModel();
}
