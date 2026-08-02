package ru.ozon.app.android.cart.configurator.base;

import Ae.C2399j;
import Ae.C2408n0;
import WZ.l;
import WZ.t;
import android.content.Intent;
import android.net.Uri;
import androidx.lifecycle.AbstractC5434v;
import androidx.lifecycle.C5427n;
import androidx.lifecycle.J;
import androidx.lifecycle.K;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.composerCommonViewKit.parsing.JsonParser;
import ru.ozon.app.android.analytics.modules.tokenized.TokenizedAnalyticsExtensionsKt;
import ru.ozon.app.android.cart.cartSplitV2.v2.util.extensions.SwipeAnalyticsExtKt;
import ru.ozon.app.android.cart.common.domain.CartRefreshReason;
import ru.ozon.app.android.cart.common.presentation.refresh.CartEventsController;
import ru.ozon.app.android.composer.ConfiguratorReferences;
import ru.ozon.app.android.composer.universalscreen.view.ComposerScreenConfig;
import ru.ozon.app.android.location.AddressLocalStore;
import ru.ozon.app.android.utils.dispatcherprovider.CoroutineDispatcherProvider;
import xe.C10727i;

@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0010\b'\u0018\u0000 32\u00020\u0001:\u00013B+\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\n\u0010\b\u001a\u00060\u0006j\u0002`\u0007\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\u0019\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u0019\u0010\u0012\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0002¢\u0006\u0004\b\u0012\u0010\u0011J\u0017\u0010\u0013\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0013\u0010\u0011J\u0017\u0010\u0014\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0014\u0010\u0011J\u000f\u0010\u0015\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u0017\u0010\u0019\u001a\u00020\u000f2\u0006\u0010\u0018\u001a\u00020\u0017H\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ)\u0010\u001e\u001a\u00020\u000f2\u0006\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u001d\u001a\u00020\u001b2\b\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0016¢\u0006\u0004\b\u001e\u0010\u001fJ\u000f\u0010!\u001a\u00020 H$¢\u0006\u0004\b!\u0010\"J\u001b\u0010%\u001a\u00020$*\u00020 2\u0006\u0010#\u001a\u00020 H\u0004¢\u0006\u0004\b%\u0010&R\u001a\u0010\u0003\u001a\u00020\u00028\u0004X\u0084\u0004¢\u0006\f\n\u0004\b\u0003\u0010'\u001a\u0004\b(\u0010)R\u001a\u0010\u0005\u001a\u00020\u00048\u0004X\u0084\u0004¢\u0006\f\n\u0004\b\u0005\u0010*\u001a\u0004\b+\u0010,R\u001e\u0010\b\u001a\u00060\u0006j\u0002`\u00078\u0004X\u0084\u0004¢\u0006\f\n\u0004\b\b\u0010-\u001a\u0004\b.\u0010/R\u001a\u0010\n\u001a\u00020\t8\u0004X\u0084\u0004¢\u0006\f\n\u0004\b\n\u00100\u001a\u0004\b1\u00102¨\u00064"}, d2 = {"Lru/ozon/app/android/cart/configurator/base/BaseCartConfigurator;", "Lru/ozon/app/android/composer/universalscreen/view/ComposerScreenConfig$PageConfigurator;", "Lru/ozon/app/android/cart/common/presentation/refresh/CartEventsController;", "cartEventController", "Lru/ozon/app/android/utils/dispatcherprovider/CoroutineDispatcherProvider;", "dispatcher", "Lru/ozon/android/composerCommonViewKit/parsing/JsonParser;", "Lru/ozon/app/android/network/serialize/JsonDeserializer;", "jsonDeserializer", "Lru/ozon/app/android/location/AddressLocalStore;", "addressLocalStore", "<init>", "(Lru/ozon/app/android/cart/common/presentation/refresh/CartEventsController;Lru/ozon/app/android/utils/dispatcherprovider/CoroutineDispatcherProvider;Lru/ozon/android/composerCommonViewKit/parsing/JsonParser;Lru/ozon/app/android/location/AddressLocalStore;)V", "Landroid/content/Intent;", "data", "", "handleRemoveCartSplit", "(Landroid/content/Intent;)V", "handleDismissActivityResult", "trackRemoveCartSplit", "trackRemoveCartSplitBySwipe", "observeAddressChanged", "()V", "Landroidx/lifecycle/J;", "owner", "onStart", "(Landroidx/lifecycle/J;)V", "", "requestCode", "resultCode", "onActivityResult", "(IILandroid/content/Intent;)V", "", "getConsumerId", "()Ljava/lang/String;", "paramName", "", "findParamFromUrl", "(Ljava/lang/String;Ljava/lang/String;)Z", "Lru/ozon/app/android/cart/common/presentation/refresh/CartEventsController;", "getCartEventController", "()Lru/ozon/app/android/cart/common/presentation/refresh/CartEventsController;", "Lru/ozon/app/android/utils/dispatcherprovider/CoroutineDispatcherProvider;", "getDispatcher", "()Lru/ozon/app/android/utils/dispatcherprovider/CoroutineDispatcherProvider;", "Lru/ozon/android/composerCommonViewKit/parsing/JsonParser;", "getJsonDeserializer", "()Lru/ozon/android/composerCommonViewKit/parsing/JsonParser;", "Lru/ozon/app/android/location/AddressLocalStore;", "getAddressLocalStore", "()Lru/ozon/app/android/location/AddressLocalStore;", "Companion", "cart_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public abstract class BaseCartConfigurator extends ComposerScreenConfig.PageConfigurator {

    @NotNull
    private final AddressLocalStore addressLocalStore;

    @NotNull
    private final CartEventsController cartEventController;

    @NotNull
    private final CoroutineDispatcherProvider dispatcher;

    @NotNull
    private final JsonParser jsonDeserializer;
    public static final int $stable = 8;

    public BaseCartConfigurator(@NotNull CartEventsController cartEventController, @NotNull CoroutineDispatcherProvider dispatcher, @NotNull JsonParser jsonDeserializer, @NotNull AddressLocalStore addressLocalStore) {
        Intrinsics.checkNotNullParameter(cartEventController, "cartEventController");
        Intrinsics.checkNotNullParameter(dispatcher, "dispatcher");
        Intrinsics.checkNotNullParameter(jsonDeserializer, "jsonDeserializer");
        Intrinsics.checkNotNullParameter(addressLocalStore, "addressLocalStore");
        this.cartEventController = cartEventController;
        this.dispatcher = dispatcher;
        this.jsonDeserializer = jsonDeserializer;
        this.addressLocalStore = addressLocalStore;
    }

    private final void handleDismissActivityResult(Intent data) {
        String stringExtra = data != null ? data.getStringExtra("CURRENT_URL") : null;
        if (stringExtra == null || !findParamFromUrl(stringExtra, "share")) {
            return;
        }
        this.cartEventController.handleEvent(CartRefreshReason.CloseCartShareModal.INSTANCE);
    }

    private final void handleRemoveCartSplit(Intent data) {
        C10727i.c(K.a(getOwner()), this.dispatcher.getIO(), null, new BaseCartConfigurator$handleRemoveCartSplit$1(data, this, null), 2);
    }

    private final void observeAddressChanged() {
        C2399j.C(new C2408n0(C5427n.a(this.addressLocalStore.getFilteredAddressIdChangedFlow(getConsumerId()), getContainer().g().getLifecycle(), AbstractC5434v.b.RESUMED), new BaseCartConfigurator$observeAddressChanged$1(this, null)), K.a(getContainer().g()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void trackRemoveCartSplit(Intent data) {
        ConfiguratorReferences references;
        l tokenizedAnalytics;
        t tVar = (t) data.getParcelableExtra("EXTRA_TOKENIZED_EVENT");
        if (tVar == null || (references = getReferences()) == null || (tokenizedAnalytics = references.getTokenizedAnalytics()) == null) {
            return;
        }
        TokenizedAnalyticsExtensionsKt.processNonViewEvents$default(tokenizedAnalytics, tVar, null, 2, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void trackRemoveCartSplitBySwipe(Intent data) {
        ConfiguratorReferences references;
        l tokenizedAnalytics;
        t tVar = (t) data.getParcelableExtra("EXTRA_TOKENIZED_EVENT");
        if (tVar == null || (references = getReferences()) == null || (tokenizedAnalytics = references.getTokenizedAnalytics()) == null) {
            return;
        }
        SwipeAnalyticsExtKt.processEventsSwipeRemove$default(tokenizedAnalytics, tVar, null, 2, null);
    }

    protected final boolean findParamFromUrl(@NotNull String str, @NotNull String paramName) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        Intrinsics.checkNotNullParameter(paramName, "paramName");
        Set<String> queryParameterNames = Uri.parse(str).getQueryParameterNames();
        Intrinsics.checkNotNullExpressionValue(queryParameterNames, "getQueryParameterNames(...)");
        Set<String> set = queryParameterNames;
        if ((set instanceof Collection) && set.isEmpty()) {
            return false;
        }
        Iterator<T> it = set.iterator();
        while (it.hasNext()) {
            if (Intrinsics.d((String) it.next(), paramName)) {
                return true;
            }
        }
        return false;
    }

    @NotNull
    protected final CartEventsController getCartEventController() {
        return this.cartEventController;
    }

    @NotNull
    protected abstract String getConsumerId();

    @NotNull
    protected final JsonParser getJsonDeserializer() {
        return this.jsonDeserializer;
    }

    @Override // ru.ozon.app.android.composer.universalscreen.view.ComposerScreenConfig.PageConfigurator
    public void onActivityResult(int requestCode, int resultCode, Intent data) {
        if (resultCode != -1) {
            return;
        }
        if (requestCode == 9021) {
            handleRemoveCartSplit(data);
        }
        if (requestCode == 1777) {
            handleDismissActivityResult(data);
        }
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public void onStart(@NotNull J owner) {
        Intrinsics.checkNotNullParameter(owner, "owner");
        super.onStart(owner);
        observeAddressChanged();
    }
}
