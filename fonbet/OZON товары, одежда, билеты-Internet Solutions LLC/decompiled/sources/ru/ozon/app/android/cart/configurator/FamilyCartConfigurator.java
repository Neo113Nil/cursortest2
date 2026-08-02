package ru.ozon.app.android.cart.configurator;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import oZ.InterfaceC8677a;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.composerCommonViewKit.parsing.JsonParser;
import ru.ozon.app.android.cart.common.domain.CartRefreshReason;
import ru.ozon.app.android.cart.common.presentation.refresh.CartEventsController;
import ru.ozon.app.android.cart.common.utils.link.CartLinkGenerator;
import ru.ozon.app.android.cart.configurator.base.BaseCartConfigurator;
import ru.ozon.app.android.location.AddressLocalStore;
import ru.ozon.app.android.utils.dispatcherprovider.CoroutineDispatcherProvider;

@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00172\u00020\u00012\u00020\u0002:\u0001\u0017B-\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\n\u0010\t\u001a\u00060\u0007j\u0002`\b\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000f\u001a\u00020\u000eH\u0014¢\u0006\u0004\b\u000f\u0010\u0010J\u001f\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0011\u001a\u00020\u000e2\u0006\u0010\u0013\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0015\u0010\u0016¨\u0006\u0018"}, d2 = {"Lru/ozon/app/android/cart/configurator/FamilyCartConfigurator;", "Lru/ozon/app/android/cart/configurator/base/BaseCartConfigurator;", "LoZ/a;", "Lru/ozon/app/android/cart/common/presentation/refresh/CartEventsController;", "cartEventController", "Lru/ozon/app/android/utils/dispatcherprovider/CoroutineDispatcherProvider;", "dispatcher", "Lru/ozon/android/composerCommonViewKit/parsing/JsonParser;", "Lru/ozon/app/android/network/serialize/JsonDeserializer;", "jsonDeserializer", "Lru/ozon/app/android/location/AddressLocalStore;", "addressLocalStore", "<init>", "(Lru/ozon/app/android/cart/common/presentation/refresh/CartEventsController;Lru/ozon/app/android/utils/dispatcherprovider/CoroutineDispatcherProvider;Lru/ozon/android/composerCommonViewKit/parsing/JsonParser;Lru/ozon/app/android/location/AddressLocalStore;)V", "", "getConsumerId", "()Ljava/lang/String;", "deeplink", "", "refresh", "", "onAnchorReturn", "(Ljava/lang/String;Z)V", "Companion", "cart_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class FamilyCartConfigurator extends BaseCartConfigurator implements InterfaceC8677a {

    @NotNull
    private static final Companion Companion = new Companion(null);

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Lru/ozon/app/android/cart/configurator/FamilyCartConfigurator$Companion;", "", "<init>", "()V", "FAMILY_CART_CONFIGURATOR_CONSUMER_ID", "", "cart_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    /* loaded from: classes11.dex */
    private static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FamilyCartConfigurator(@NotNull CartEventsController cartEventController, @NotNull CoroutineDispatcherProvider dispatcher, @NotNull JsonParser jsonDeserializer, @NotNull AddressLocalStore addressLocalStore) {
        super(cartEventController, dispatcher, jsonDeserializer, addressLocalStore);
        Intrinsics.checkNotNullParameter(cartEventController, "cartEventController");
        Intrinsics.checkNotNullParameter(dispatcher, "dispatcher");
        Intrinsics.checkNotNullParameter(jsonDeserializer, "jsonDeserializer");
        Intrinsics.checkNotNullParameter(addressLocalStore, "addressLocalStore");
    }

    @Override // ru.ozon.app.android.cart.configurator.base.BaseCartConfigurator
    @NotNull
    protected String getConsumerId() {
        return "FAMILY_CART_CONFIGURATOR";
    }

    @Override // oZ.InterfaceC8677a
    public void onAnchorReturn(@NotNull String deeplink, boolean refresh) {
        Intrinsics.checkNotNullParameter(deeplink, "deeplink");
        if (Intrinsics.d(deeplink, CartLinkGenerator.cart$default(CartLinkGenerator.INSTANCE, false, 1, null).toString())) {
            getCartEventController().handleEvent(CartRefreshReason.BackToCartFromFamilyCart.INSTANCE);
        }
    }
}
