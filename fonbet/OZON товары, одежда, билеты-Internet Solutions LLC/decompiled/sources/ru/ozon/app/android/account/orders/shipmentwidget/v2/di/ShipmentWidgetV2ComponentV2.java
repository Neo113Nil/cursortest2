package ru.ozon.app.android.account.orders.shipmentwidget.v2.di;

import AM.a;
import Vg.d;
import hi.InterfaceC6958a;
import k20.C7473e;
import k20.C7475g;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.N;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.account.adult.presenter.AdultListDelegateProvider;
import ru.ozon.app.android.account.orders.common.shipmentwidget.ShipmentWidgetV2Parser;
import ru.ozon.app.android.account.orders.shipmentwidget.v2.presentation.atomelement.mappers.AtomElementMapper;
import ru.ozon.app.android.account.orders.shipmentwidget.v2.presentation.buttons.mappers.ButtonsMapper;
import ru.ozon.app.android.account.orders.shipmentwidget.v2.presentation.images.mappers.ImagesMapper;
import ru.ozon.app.android.account.orders.shipmentwidget.v2.presentation.products.mappers.ProductsMapper;
import ru.ozon.app.android.account.orders.shipmentwidget.v2.presentation.separator.mappers.SeparatorMapper;
import ru.ozon.app.android.account.orders.shipmentwidget.v2.presentation.texticon.mappers.TextIconMapper;
import ru.ozon.app.android.payment.ui.createorder.CreateAndPayViewModel;
import ru.ozon.app.android.storage.startupArgs.StartupArgsService;
import ru.ozon.app.android.utils.AppType;

@Metadata(d1 = {"\u0000t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bf\u0018\u0000 52\u00060\u0001j\u0002`\u0002:\u00015R\u0014\u0010\u0006\u001a\u00020\u00038&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005R\u0014\u0010\n\u001a\u00020\u00078&X¦\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR\u0014\u0010\u000e\u001a\u00020\u000b8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\f\u0010\rR\u0014\u0010\u0012\u001a\u00020\u000f8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0016\u001a\u00020\u00138&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015R\u0014\u0010\u001a\u001a\u00020\u00178&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u0019R\u0014\u0010\u001e\u001a\u00020\u001b8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u001c\u0010\u001dR\u0014\u0010\"\u001a\u00020\u001f8&X¦\u0004¢\u0006\u0006\u001a\u0004\b \u0010!R\u0014\u0010&\u001a\u00020#8&X¦\u0004¢\u0006\u0006\u001a\u0004\b$\u0010%R\u0018\u0010+\u001a\u00060'j\u0002`(8&X¦\u0004¢\u0006\u0006\u001a\u0004\b)\u0010*R\u0014\u0010/\u001a\u00020,8&X¦\u0004¢\u0006\u0006\u001a\u0004\b-\u0010.R\u001a\u00104\u001a\b\u0012\u0004\u0012\u000201008&X¦\u0004¢\u0006\u0006\u001a\u0004\b2\u00103¨\u00066"}, d2 = {"Lru/ozon/app/android/account/orders/shipmentwidget/v2/di/ShipmentWidgetV2ComponentV2;", "Lhi/a;", "Lru/ozon/app/android/di/provider/component/DiComponent;", "Lru/ozon/app/android/account/orders/common/shipmentwidget/ShipmentWidgetV2Parser;", "getParser", "()Lru/ozon/app/android/account/orders/common/shipmentwidget/ShipmentWidgetV2Parser;", "parser", "Lru/ozon/app/android/utils/AppType;", "getAppType", "()Lru/ozon/app/android/utils/AppType;", "appType", "Lru/ozon/app/android/account/orders/shipmentwidget/v2/presentation/atomelement/mappers/AtomElementMapper;", "getAtomElementMapper", "()Lru/ozon/app/android/account/orders/shipmentwidget/v2/presentation/atomelement/mappers/AtomElementMapper;", "atomElementMapper", "Lru/ozon/app/android/account/orders/shipmentwidget/v2/presentation/texticon/mappers/TextIconMapper;", "getTextIconMapper", "()Lru/ozon/app/android/account/orders/shipmentwidget/v2/presentation/texticon/mappers/TextIconMapper;", "textIconMapper", "Lru/ozon/app/android/account/orders/shipmentwidget/v2/presentation/images/mappers/ImagesMapper;", "getImagesMapper", "()Lru/ozon/app/android/account/orders/shipmentwidget/v2/presentation/images/mappers/ImagesMapper;", "imagesMapper", "Lru/ozon/app/android/account/orders/shipmentwidget/v2/presentation/separator/mappers/SeparatorMapper;", "getSeparatorMapper", "()Lru/ozon/app/android/account/orders/shipmentwidget/v2/presentation/separator/mappers/SeparatorMapper;", "separatorMapper", "Lru/ozon/app/android/account/orders/shipmentwidget/v2/presentation/buttons/mappers/ButtonsMapper;", "getButtonsMapper", "()Lru/ozon/app/android/account/orders/shipmentwidget/v2/presentation/buttons/mappers/ButtonsMapper;", "buttonsMapper", "Lru/ozon/app/android/account/orders/shipmentwidget/v2/presentation/products/mappers/ProductsMapper;", "getProductsMapper", "()Lru/ozon/app/android/account/orders/shipmentwidget/v2/presentation/products/mappers/ProductsMapper;", "productsMapper", "Lru/ozon/app/android/account/adult/presenter/AdultListDelegateProvider;", "getAdultListDelegateProvider", "()Lru/ozon/app/android/account/adult/presenter/AdultListDelegateProvider;", "adultListDelegateProvider", "LVg/d;", "Lru/ozon/app/android/action/custom/CustomActionHandlersStoreFactory;", "getCustomActionHandlersStoreFactory", "()LVg/d;", "customActionHandlersStoreFactory", "Lru/ozon/app/android/storage/startupArgs/StartupArgsService;", "getStartupArgsService", "()Lru/ozon/app/android/storage/startupArgs/StartupArgsService;", "startupArgsService", "LPc/a;", "Lru/ozon/app/android/payment/ui/createorder/CreateAndPayViewModel;", "getCreateAndPayViewModelProvider", "()LPc/a;", "createAndPayViewModelProvider", "Companion", "cs-orders_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public interface ShipmentWidgetV2ComponentV2 extends InterfaceC6958a {

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = Companion.$$INSTANCE;

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J)\u0010\n\u001a\u0012\u0012\u0004\u0012\u00020\b0\u0007j\b\u0012\u0004\u0012\u00020\b`\t2\n\u0010\u0006\u001a\u00060\u0004j\u0002`\u0005¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Lru/ozon/app/android/account/orders/shipmentwidget/v2/di/ShipmentWidgetV2ComponentV2$Companion;", "", "<init>", "()V", "Lk20/g;", "Lru/ozon/app/android/composer/widgets/v2/di/ComposerWidgetComponentStorage;", "storage", "Lk20/e;", "Lru/ozon/app/android/account/orders/shipmentwidget/v2/di/ShipmentWidgetV2ComponentV2;", "Lru/ozon/app/android/composer/widgets/v2/di/WidgetComponent;", "create", "(Lk20/g;)Lk20/e;", "cs-orders_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();

        private Companion() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final ShipmentWidgetV2ComponentV2 create$lambda$0(C7475g c7475g) {
            return new ShipmentWidgetV2ComponentV2$Companion$create$1$1(c7475g);
        }

        @NotNull
        public final C7473e<ShipmentWidgetV2ComponentV2> create(@NotNull C7475g storage) {
            Intrinsics.checkNotNullParameter(storage, "storage");
            return new C7473e<>(N.b(ShipmentWidgetV2ComponentV2.class), new a(storage, 11));
        }
    }

    @NotNull
    AdultListDelegateProvider getAdultListDelegateProvider();

    @NotNull
    AppType getAppType();

    @NotNull
    AtomElementMapper getAtomElementMapper();

    @NotNull
    ButtonsMapper getButtonsMapper();

    @NotNull
    Pc.a<CreateAndPayViewModel> getCreateAndPayViewModelProvider();

    @NotNull
    d getCustomActionHandlersStoreFactory();

    @NotNull
    ImagesMapper getImagesMapper();

    @NotNull
    ShipmentWidgetV2Parser getParser();

    @NotNull
    ProductsMapper getProductsMapper();

    @NotNull
    SeparatorMapper getSeparatorMapper();

    @NotNull
    StartupArgsService getStartupArgsService();

    @NotNull
    TextIconMapper getTextIconMapper();
}
