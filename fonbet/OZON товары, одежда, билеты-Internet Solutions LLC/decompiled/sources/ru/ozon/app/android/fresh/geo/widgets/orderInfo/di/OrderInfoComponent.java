package ru.ozon.app.android.fresh.geo.widgets.orderInfo.di;

import Gv.C3130a;
import Sc.InterfaceC4008j;
import Sc.k;
import hi.InterfaceC6958a;
import k20.C7473e;
import k20.C7475g;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.N;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.fresh.geo.widgets.orderInfo.presentation.OrderInfoMapper;
import ru.ozon.app.android.fresh.geo.widgets.orderInfo.presentation.items.OrderProductsDecorator;

@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b`\u0018\u0000 \u000b2\u00060\u0001j\u0002`\u0002:\u0001\u000bR\u0014\u0010\u0006\u001a\u00020\u00038&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005R\u0014\u0010\n\u001a\u00020\u00078&X¦\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\t¨\u0006\f"}, d2 = {"Lru/ozon/app/android/fresh/geo/widgets/orderInfo/di/OrderInfoComponent;", "Lhi/a;", "Lru/ozon/app/android/di/provider/component/DiComponent;", "Lru/ozon/app/android/fresh/geo/widgets/orderInfo/presentation/items/OrderProductsDecorator;", "getItemsDecorator", "()Lru/ozon/app/android/fresh/geo/widgets/orderInfo/presentation/items/OrderProductsDecorator;", "itemsDecorator", "Lru/ozon/app/android/fresh/geo/widgets/orderInfo/presentation/OrderInfoMapper;", "getMapper", "()Lru/ozon/app/android/fresh/geo/widgets/orderInfo/presentation/OrderInfoMapper;", "mapper", "Companion", "widgets-geo_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public interface OrderInfoComponent extends InterfaceC6958a {

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = Companion.$$INSTANCE;

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J)\u0010\n\u001a\u0012\u0012\u0004\u0012\u00020\b0\u0007j\b\u0012\u0004\u0012\u00020\b`\t2\n\u0010\u0006\u001a\u00060\u0004j\u0002`\u0005¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Lru/ozon/app/android/fresh/geo/widgets/orderInfo/di/OrderInfoComponent$Companion;", "", "<init>", "()V", "Lk20/g;", "Lru/ozon/app/android/composer/widgets/v2/di/ComposerWidgetComponentStorage;", "storage", "Lk20/e;", "Lru/ozon/app/android/fresh/geo/widgets/orderInfo/di/OrderInfoComponent;", "Lru/ozon/app/android/composer/widgets/v2/di/WidgetComponent;", "create", "(Lk20/g;)Lk20/e;", "widgets-geo_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();

        private Companion() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final OrderInfoComponent create$lambda$0() {
            return new OrderInfoComponent() { // from class: ru.ozon.app.android.fresh.geo.widgets.orderInfo.di.OrderInfoComponent$Companion$create$1$1

                /* renamed from: itemsDecorator$delegate, reason: from kotlin metadata */
                private final InterfaceC4008j itemsDecorator = k.b(OrderInfoComponent$Companion$create$1$1$itemsDecorator$2.INSTANCE);

                /* renamed from: mapper$delegate, reason: from kotlin metadata */
                private final InterfaceC4008j mapper = k.b(OrderInfoComponent$Companion$create$1$1$mapper$2.INSTANCE);

                @Override // ru.ozon.app.android.fresh.geo.widgets.orderInfo.di.OrderInfoComponent
                public OrderProductsDecorator getItemsDecorator() {
                    return (OrderProductsDecorator) this.itemsDecorator.getValue();
                }

                @Override // ru.ozon.app.android.fresh.geo.widgets.orderInfo.di.OrderInfoComponent
                public OrderInfoMapper getMapper() {
                    return (OrderInfoMapper) this.mapper.getValue();
                }
            };
        }

        @NotNull
        public final C7473e<OrderInfoComponent> create(@NotNull C7475g storage) {
            Intrinsics.checkNotNullParameter(storage, "storage");
            return new C7473e<>(N.b(OrderInfoComponent.class), new C3130a(0));
        }
    }

    @NotNull
    OrderProductsDecorator getItemsDecorator();

    @NotNull
    OrderInfoMapper getMapper();
}
