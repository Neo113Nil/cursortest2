package ru.ozon.app.android.account.orders.commonBarcodeV2;

import BZ.e;
import Vg.d;
import hi.InterfaceC6958a;
import k20.C7475g;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.account.orders.commonBarcodeV2.data.CommonBarcodeV2Mapper;
import ru.ozon.app.android.composer.throttle.HandlersInhibitor;
import ru.ozon.app.android.delivery.customActionsHandlers.sharebarcode.ShareBarcodeAnalytics;
import ru.ozon.app.android.utils.AppType;
import ru.ozon.composer.ui.widget.f;

@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b`\u0018\u0000 \u001e2\u00020\u0001:\u0001\u001eR\u0014\u0010\u0005\u001a\u00020\u00028&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004R\u0014\u0010\t\u001a\u00020\u00068&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\bR\u0014\u0010\r\u001a\u00020\n8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\fR\u0014\u0010\u0011\u001a\u00020\u000e8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0015\u001a\u00020\u00128&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0019\u001a\u00020\u00168&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0018R\u0014\u0010\u001d\u001a\u00020\u001a8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u001b\u0010\u001c¨\u0006\u001f"}, d2 = {"Lru/ozon/app/android/account/orders/commonBarcodeV2/CommonBarcodeV2Component;", "Lhi/a;", "Lru/ozon/app/android/account/orders/commonBarcodeV2/data/CommonBarcodeV2Mapper;", "getMapper", "()Lru/ozon/app/android/account/orders/commonBarcodeV2/data/CommonBarcodeV2Mapper;", "mapper", "LVg/d;", "getCustomActionHandlersStoreFactory", "()LVg/d;", "customActionHandlersStoreFactory", "Lru/ozon/app/android/delivery/customActionsHandlers/sharebarcode/ShareBarcodeAnalytics;", "getShareBarcodeAnalytics", "()Lru/ozon/app/android/delivery/customActionsHandlers/sharebarcode/ShareBarcodeAnalytics;", "shareBarcodeAnalytics", "Lru/ozon/composer/ui/widget/f;", "getViewedPond", "()Lru/ozon/composer/ui/widget/f;", "viewedPond", "Lru/ozon/app/android/composer/throttle/HandlersInhibitor;", "getHandlersInhibitor", "()Lru/ozon/app/android/composer/throttle/HandlersInhibitor;", "handlersInhibitor", "LBZ/e;", "getMiniAppConfigHolder", "()LBZ/e;", "miniAppConfigHolder", "Lru/ozon/app/android/utils/AppType;", "getAppType", "()Lru/ozon/app/android/utils/AppType;", "appType", "Companion", "cs-orders_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public interface CommonBarcodeV2Component extends InterfaceC6958a {

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = Companion.$$INSTANCE;

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lru/ozon/app/android/account/orders/commonBarcodeV2/CommonBarcodeV2Component$Companion;", "", "<init>", "()V", "Lk20/g;", "storage", "Lru/ozon/app/android/account/orders/commonBarcodeV2/CommonBarcodeV2Component;", "create", "(Lk20/g;)Lru/ozon/app/android/account/orders/commonBarcodeV2/CommonBarcodeV2Component;", "cs-orders_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    /* loaded from: classes11.dex */
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();

        private Companion() {
        }

        @NotNull
        public final CommonBarcodeV2Component create(@NotNull C7475g storage) {
            Intrinsics.checkNotNullParameter(storage, "storage");
            return new CommonBarcodeV2Component$Companion$create$1(storage);
        }
    }

    @NotNull
    AppType getAppType();

    @NotNull
    d getCustomActionHandlersStoreFactory();

    @NotNull
    HandlersInhibitor getHandlersInhibitor();

    @NotNull
    CommonBarcodeV2Mapper getMapper();

    @NotNull
    e getMiniAppConfigHolder();

    @NotNull
    ShareBarcodeAnalytics getShareBarcodeAnalytics();

    @NotNull
    f getViewedPond();
}
