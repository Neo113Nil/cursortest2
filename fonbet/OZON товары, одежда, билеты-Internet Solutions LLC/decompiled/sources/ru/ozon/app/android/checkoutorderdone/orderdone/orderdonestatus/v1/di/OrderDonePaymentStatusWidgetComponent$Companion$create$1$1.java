package ru.ozon.app.android.checkoutorderdone.orderdone.orderdonestatus.v1.di;

import Pc.a;
import android.content.Context;
import k20.C7475g;
import kotlin.Metadata;
import ru.ozon.android.composerCommonViewKit.parsing.JsonParser;
import ru.ozon.app.android.checkoutorderdone.orderdone.orderdonestatus.v1.di.OrderDonePaymentStatusWidgetComponent$Companion$create$1$1;
import ru.ozon.app.android.checkoutorderdone.orderdone.orderdonestatus.v1.presentation.OrderDonePaymentStatusViewModel;
import ru.ozon.app.android.di.provider.component.ContextComponentDependencies;
import ru.ozon.app.android.network.di.NetworkComponentApi;
import ru.ozon.app.android.network.serialize.JsonSerializer;
import ru.ozon.app.android.storage.di.StorageComponentApi;

@Metadata(d1 = {"\u0000I\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005*\u0001\u0000\b\n\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\nR \u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000b8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0012\u001a\u00020\u00118\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u001e\u0010\u0018\u001a\u00060\u0016j\u0002`\u00178\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u001a\u0010\u001d\u001a\u00020\u001c8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 ¨\u0006!"}, d2 = {"ru/ozon/app/android/checkoutorderdone/orderdone/orderdonestatus/v1/di/OrderDonePaymentStatusWidgetComponent$Companion$create$1$1", "Lru/ozon/app/android/checkoutorderdone/orderdone/orderdonestatus/v1/di/OrderDonePaymentStatusWidgetComponent;", "Lru/ozon/app/android/storage/di/StorageComponentApi;", "storageComponentApi", "Lru/ozon/app/android/storage/di/StorageComponentApi;", "Lru/ozon/app/android/network/di/NetworkComponentApi;", "networkComponentApi", "Lru/ozon/app/android/network/di/NetworkComponentApi;", "Lru/ozon/app/android/di/provider/component/ContextComponentDependencies;", "contextComponentApi", "Lru/ozon/app/android/di/provider/component/ContextComponentDependencies;", "LPc/a;", "Lru/ozon/app/android/checkoutorderdone/orderdone/orderdonestatus/v1/presentation/OrderDonePaymentStatusViewModel;", "viewModelProvider", "LPc/a;", "getViewModelProvider", "()LPc/a;", "Lru/ozon/app/android/network/serialize/JsonSerializer;", "jsonSerializer", "Lru/ozon/app/android/network/serialize/JsonSerializer;", "getJsonSerializer", "()Lru/ozon/app/android/network/serialize/JsonSerializer;", "Lru/ozon/android/composerCommonViewKit/parsing/JsonParser;", "Lru/ozon/app/android/network/serialize/JsonDeserializer;", "jsonDeserializer", "Lru/ozon/android/composerCommonViewKit/parsing/JsonParser;", "getJsonDeserializer", "()Lru/ozon/android/composerCommonViewKit/parsing/JsonParser;", "Landroid/content/Context;", "context", "Landroid/content/Context;", "getContext", "()Landroid/content/Context;", "orderdone_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class OrderDonePaymentStatusWidgetComponent$Companion$create$1$1 implements OrderDonePaymentStatusWidgetComponent {
    private final Context context;
    private final ContextComponentDependencies contextComponentApi;
    private final JsonParser jsonDeserializer;
    private final JsonSerializer jsonSerializer;
    private final NetworkComponentApi networkComponentApi;
    private final StorageComponentApi storageComponentApi;
    private final a<OrderDonePaymentStatusViewModel> viewModelProvider;

    OrderDonePaymentStatusWidgetComponent$Companion$create$1$1(C7475g c7475g) {
        this.storageComponentApi = (StorageComponentApi) c7475g.getComponent(StorageComponentApi.class);
        NetworkComponentApi networkComponentApi = (NetworkComponentApi) c7475g.getComponent(NetworkComponentApi.class);
        this.networkComponentApi = networkComponentApi;
        ContextComponentDependencies contextComponentDependencies = (ContextComponentDependencies) c7475g.getComponent(ContextComponentDependencies.class);
        this.contextComponentApi = contextComponentDependencies;
        this.viewModelProvider = new a() { // from class: zp.a
            @Override // Pc.a
            public final Object get() {
                OrderDonePaymentStatusViewModel viewModelProvider$lambda$0;
                viewModelProvider$lambda$0 = OrderDonePaymentStatusWidgetComponent$Companion$create$1$1.viewModelProvider$lambda$0(OrderDonePaymentStatusWidgetComponent$Companion$create$1$1.this);
                return viewModelProvider$lambda$0;
            }
        };
        this.jsonSerializer = networkComponentApi.getJsonSerializer();
        this.jsonDeserializer = networkComponentApi.getJsonDeserializer();
        this.context = contextComponentDependencies.getContext();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final OrderDonePaymentStatusViewModel viewModelProvider$lambda$0(OrderDonePaymentStatusWidgetComponent$Companion$create$1$1 orderDonePaymentStatusWidgetComponent$Companion$create$1$1) {
        return new OrderDonePaymentStatusViewModel(orderDonePaymentStatusWidgetComponent$Companion$create$1$1.storageComponentApi.getStartupArgsService());
    }

    @Override // ru.ozon.app.android.checkoutorderdone.orderdone.orderdonestatus.v1.di.OrderDonePaymentStatusWidgetComponent
    public Context getContext() {
        return this.context;
    }

    @Override // ru.ozon.app.android.checkoutorderdone.orderdone.orderdonestatus.v1.di.OrderDonePaymentStatusWidgetComponent
    public JsonParser getJsonDeserializer() {
        return this.jsonDeserializer;
    }

    @Override // ru.ozon.app.android.checkoutorderdone.orderdone.orderdonestatus.v1.di.OrderDonePaymentStatusWidgetComponent
    public JsonSerializer getJsonSerializer() {
        return this.jsonSerializer;
    }

    @Override // ru.ozon.app.android.checkoutorderdone.orderdone.orderdonestatus.v1.di.OrderDonePaymentStatusWidgetComponent
    public a<OrderDonePaymentStatusViewModel> getViewModelProvider() {
        return this.viewModelProvider;
    }
}
