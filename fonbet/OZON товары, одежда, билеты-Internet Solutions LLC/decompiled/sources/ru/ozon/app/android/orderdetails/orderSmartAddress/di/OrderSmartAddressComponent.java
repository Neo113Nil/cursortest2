package ru.ozon.app.android.orderdetails.orderSmartAddress.di;

import Sc.InterfaceC4008j;
import Sc.k;
import Vg.d;
import hi.InterfaceC6958a;
import k20.C7475g;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.action.custom.di.CustomActionHandlersComponentApi;
import ru.ozon.app.android.orderdetails.orderSmartAddress.data.OrderSmartAddressMapper;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b`\u0018\u0000 \f2\u00060\u0001j\u0002`\u0002:\u0001\fR\u0014\u0010\u0006\u001a\u00020\u00038&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005R\u0018\u0010\u000b\u001a\u00060\u0007j\u0002`\b8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\n¨\u0006\r"}, d2 = {"Lru/ozon/app/android/orderdetails/orderSmartAddress/di/OrderSmartAddressComponent;", "Lhi/a;", "Lru/ozon/app/android/di/provider/component/DiComponent;", "Lru/ozon/app/android/orderdetails/orderSmartAddress/data/OrderSmartAddressMapper;", "getMapper", "()Lru/ozon/app/android/orderdetails/orderSmartAddress/data/OrderSmartAddressMapper;", "mapper", "LVg/d;", "Lru/ozon/app/android/action/custom/CustomActionHandlersStoreFactory;", "getCustomActionHandlersStoreFactory", "()LVg/d;", "customActionHandlersStoreFactory", "Companion", "orderdetails_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public interface OrderSmartAddressComponent extends InterfaceC6958a {

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = Companion.$$INSTANCE;

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lru/ozon/app/android/orderdetails/orderSmartAddress/di/OrderSmartAddressComponent$Companion;", "", "<init>", "()V", "Lk20/g;", "storage", "Lru/ozon/app/android/orderdetails/orderSmartAddress/di/OrderSmartAddressComponent;", "create", "(Lk20/g;)Lru/ozon/app/android/orderdetails/orderSmartAddress/di/OrderSmartAddressComponent;", "orderdetails_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    /* loaded from: classes13.dex */
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();

        private Companion() {
        }

        @NotNull
        public final OrderSmartAddressComponent create(@NotNull final C7475g storage) {
            Intrinsics.checkNotNullParameter(storage, "storage");
            return new OrderSmartAddressComponent(storage) { // from class: ru.ozon.app.android.orderdetails.orderSmartAddress.di.OrderSmartAddressComponent$Companion$create$1
                private final CustomActionHandlersComponentApi customActionHandlersComponentApi;
                private final d customActionHandlersStoreFactory;

                /* renamed from: mapper$delegate, reason: from kotlin metadata */
                private final InterfaceC4008j mapper;

                {
                    CustomActionHandlersComponentApi customActionHandlersComponentApi = (CustomActionHandlersComponentApi) storage.getComponent(CustomActionHandlersComponentApi.class);
                    this.customActionHandlersComponentApi = customActionHandlersComponentApi;
                    this.customActionHandlersStoreFactory = customActionHandlersComponentApi.getCustomActionHandlersStoreFactory();
                    this.mapper = k.b(OrderSmartAddressComponent$Companion$create$1$mapper$2.INSTANCE);
                }

                @Override // ru.ozon.app.android.orderdetails.orderSmartAddress.di.OrderSmartAddressComponent
                public d getCustomActionHandlersStoreFactory() {
                    return this.customActionHandlersStoreFactory;
                }

                @Override // ru.ozon.app.android.orderdetails.orderSmartAddress.di.OrderSmartAddressComponent
                public OrderSmartAddressMapper getMapper() {
                    return (OrderSmartAddressMapper) this.mapper.getValue();
                }
            };
        }
    }

    @NotNull
    d getCustomActionHandlersStoreFactory();

    @NotNull
    OrderSmartAddressMapper getMapper();
}
