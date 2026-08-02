package ru.ozon.app.android.cart.configurator;

import Sc.InterfaceC4008j;
import Sc.k;
import android.net.Uri;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import oZ.InterfaceC8677a;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.composerCommonViewKit.parsing.JsonParser;
import ru.ozon.app.android.cart.common.domain.CartRefreshReason;
import ru.ozon.app.android.cart.common.presentation.refresh.CartEventsController;
import ru.ozon.app.android.cart.configurator.base.BaseCartConfigurator;
import ru.ozon.app.android.location.AddressLocalStore;
import ru.ozon.app.android.navigation.LinkGenerator;
import ru.ozon.app.android.network.abtool.FeatureService;
import ru.ozon.app.android.utils.dispatcherprovider.CoroutineDispatcherProvider;

@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0007\b\u0007\u0018\u0000 \u001f2\u00020\u00012\u00020\u0002:\u0001\u001fB5\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\n\u0010\t\u001a\u00060\u0007j\u0002`\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0011\u001a\u00020\u0010H\u0014¢\u0006\u0004\b\u0011\u0010\u0012J\u001f\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0013\u001a\u00020\u00102\u0006\u0010\u0015\u001a\u00020\u0014H\u0016¢\u0006\u0004\b\u0017\u0010\u0018R!\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u00100\u00198BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001d¨\u0006 "}, d2 = {"Lru/ozon/app/android/cart/configurator/CartConfigurator;", "Lru/ozon/app/android/cart/configurator/base/BaseCartConfigurator;", "LoZ/a;", "Lru/ozon/app/android/cart/common/presentation/refresh/CartEventsController;", "cartEventController", "Lru/ozon/app/android/utils/dispatcherprovider/CoroutineDispatcherProvider;", "dispatcher", "Lru/ozon/android/composerCommonViewKit/parsing/JsonParser;", "Lru/ozon/app/android/network/serialize/JsonDeserializer;", "jsonDeserializer", "Lru/ozon/app/android/location/AddressLocalStore;", "addressLocalStore", "Lru/ozon/app/android/network/abtool/FeatureService;", "featureService", "<init>", "(Lru/ozon/app/android/cart/common/presentation/refresh/CartEventsController;Lru/ozon/app/android/utils/dispatcherprovider/CoroutineDispatcherProvider;Lru/ozon/android/composerCommonViewKit/parsing/JsonParser;Lru/ozon/app/android/location/AddressLocalStore;Lru/ozon/app/android/network/abtool/FeatureService;)V", "", "getConsumerId", "()Ljava/lang/String;", "deeplink", "", "refresh", "", "onAnchorReturn", "(Ljava/lang/String;Z)V", "", "refreshDisabledQueriesList$delegate", "LSc/j;", "getRefreshDisabledQueriesList", "()Ljava/util/List;", "refreshDisabledQueriesList", "Companion", "cart_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class CartConfigurator extends BaseCartConfigurator implements InterfaceC8677a {

    /* renamed from: refreshDisabledQueriesList$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j refreshDisabledQueriesList;

    @NotNull
    private static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Lru/ozon/app/android/cart/configurator/CartConfigurator$Companion;", "", "<init>", "()V", "CART_CONFIGURATOR_CONSUMER_ID", "", "cart_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    /* loaded from: classes11.dex */
    private static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CartConfigurator(@NotNull CartEventsController cartEventController, @NotNull CoroutineDispatcherProvider dispatcher, @NotNull JsonParser jsonDeserializer, @NotNull AddressLocalStore addressLocalStore, @NotNull FeatureService featureService) {
        super(cartEventController, dispatcher, jsonDeserializer, addressLocalStore);
        Intrinsics.checkNotNullParameter(cartEventController, "cartEventController");
        Intrinsics.checkNotNullParameter(dispatcher, "dispatcher");
        Intrinsics.checkNotNullParameter(jsonDeserializer, "jsonDeserializer");
        Intrinsics.checkNotNullParameter(addressLocalStore, "addressLocalStore");
        Intrinsics.checkNotNullParameter(featureService, "featureService");
        this.refreshDisabledQueriesList = k.b(new CartConfigurator$refreshDisabledQueriesList$2(featureService));
    }

    private final List<String> getRefreshDisabledQueriesList() {
        return (List) this.refreshDisabledQueriesList.getValue();
    }

    @Override // ru.ozon.app.android.cart.configurator.base.BaseCartConfigurator
    @NotNull
    protected String getConsumerId() {
        return "CART_CONFIGURATOR";
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x0063, code lost:
    
        if (r2 != false) goto L22;
     */
    @Override // oZ.InterfaceC8677a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void onAnchorReturn(@NotNull String deeplink, boolean refresh) {
        Intrinsics.checkNotNullParameter(deeplink, "deeplink");
        Uri parse = Uri.parse(deeplink);
        int size = parse.getQueryParameterNames().size();
        boolean d11 = Intrinsics.d(deeplink, LinkGenerator.INSTANCE.cart().toString());
        boolean z11 = false;
        boolean z12 = parse.getQueryParameter("miniapp") != null;
        if (refresh || !((d11 && size == 0) || z12)) {
            if (size == 1) {
                List<String> refreshDisabledQueriesList = getRefreshDisabledQueriesList();
                if (!(refreshDisabledQueriesList instanceof Collection) || !refreshDisabledQueriesList.isEmpty()) {
                    Iterator<T> it = refreshDisabledQueriesList.iterator();
                    while (it.hasNext()) {
                        if (findParamFromUrl(deeplink, (String) it.next())) {
                            z11 = true;
                            break;
                        }
                    }
                }
            }
            if (getRefreshDisabledQueriesList().isEmpty() || !z11) {
                getCartEventController().handleEvent(new CartRefreshReason.BackToCartByAnchor(deeplink));
            }
        }
    }
}
