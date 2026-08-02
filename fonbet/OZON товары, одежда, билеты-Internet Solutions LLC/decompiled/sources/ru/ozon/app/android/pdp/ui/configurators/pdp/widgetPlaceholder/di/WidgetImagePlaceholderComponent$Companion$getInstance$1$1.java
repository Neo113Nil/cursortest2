package ru.ozon.app.android.pdp.ui.configurators.pdp.widgetPlaceholder.di;

import Sc.InterfaceC4008j;
import k20.C7475g;
import kotlin.Metadata;
import ru.ozon.app.android.cart.common.di.CartServiceApi;
import ru.ozon.app.android.favorites.domain.di.FavoriteCoreComponentApi;
import ru.ozon.app.android.network.di.NetworkComponentApi;
import ru.ozon.app.android.pdp.ui.configurators.pdp.widgetPlaceholder.WidgetImagePlaceholderAdapter;
import ru.ozon.app.android.pdp.utils.DelegatesKt;

@Metadata(d1 = {"\u0000)\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001R\u001b\u0010\u0007\u001a\u00020\u00028VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u0014\u0010\u000b\u001a\u00020\b8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\nR\u0014\u0010\u000f\u001a\u00020\f8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\r\u0010\u000eR\u0014\u0010\u0013\u001a\u00020\u00108BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u0014"}, d2 = {"ru/ozon/app/android/pdp/ui/configurators/pdp/widgetPlaceholder/di/WidgetImagePlaceholderComponent$Companion$getInstance$1$1", "Lru/ozon/app/android/pdp/ui/configurators/pdp/widgetPlaceholder/di/WidgetImagePlaceholderComponent;", "Lru/ozon/app/android/pdp/ui/configurators/pdp/widgetPlaceholder/WidgetImagePlaceholderAdapter;", "widgetImagePlaceholderAdapter$delegate", "LSc/j;", "getWidgetImagePlaceholderAdapter", "()Lru/ozon/app/android/pdp/ui/configurators/pdp/widgetPlaceholder/WidgetImagePlaceholderAdapter;", "widgetImagePlaceholderAdapter", "Lru/ozon/app/android/network/di/NetworkComponentApi;", "getNetworkComponentApi", "()Lru/ozon/app/android/network/di/NetworkComponentApi;", "networkComponentApi", "Lru/ozon/app/android/favorites/domain/di/FavoriteCoreComponentApi;", "getFavoriteCoreComponentApi", "()Lru/ozon/app/android/favorites/domain/di/FavoriteCoreComponentApi;", "favoriteCoreComponentApi", "Lru/ozon/app/android/cart/common/di/CartServiceApi;", "getCartServiceApi", "()Lru/ozon/app/android/cart/common/di/CartServiceApi;", "cartServiceApi", "configurators_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class WidgetImagePlaceholderComponent$Companion$getInstance$1$1 implements WidgetImagePlaceholderComponent {
    final /* synthetic */ C7475g $storage;

    /* renamed from: widgetImagePlaceholderAdapter$delegate, reason: from kotlin metadata */
    private final InterfaceC4008j widgetImagePlaceholderAdapter = DelegatesKt.lazyUnsafe(new WidgetImagePlaceholderComponent$Companion$getInstance$1$1$widgetImagePlaceholderAdapter$2(this));

    WidgetImagePlaceholderComponent$Companion$getInstance$1$1(C7475g c7475g) {
        this.$storage = c7475g;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final CartServiceApi getCartServiceApi() {
        return (CartServiceApi) this.$storage.getComponent(CartServiceApi.class);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final FavoriteCoreComponentApi getFavoriteCoreComponentApi() {
        return (FavoriteCoreComponentApi) this.$storage.getComponent(FavoriteCoreComponentApi.class);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final NetworkComponentApi getNetworkComponentApi() {
        return (NetworkComponentApi) this.$storage.getComponent(NetworkComponentApi.class);
    }

    @Override // ru.ozon.app.android.pdp.ui.configurators.pdp.widgetPlaceholder.di.WidgetImagePlaceholderComponent
    public WidgetImagePlaceholderAdapter getWidgetImagePlaceholderAdapter() {
        return (WidgetImagePlaceholderAdapter) this.widgetImagePlaceholderAdapter.getValue();
    }
}
