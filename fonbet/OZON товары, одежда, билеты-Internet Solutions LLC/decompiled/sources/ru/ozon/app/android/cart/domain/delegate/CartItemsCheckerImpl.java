package ru.ozon.app.android.cart.domain.delegate;

import BZ.e;
import BZ.f;
import Sc.InterfaceC4008j;
import Sc.k;
import java.util.Collection;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.ozonLogger.core.c;
import ru.ozon.android.ozonLogger.core.h;
import ru.ozon.app.android.cart.common.domain.delegate.CartItemsChecker;
import sj.d;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u0000 \u00152\u00020\u0001:\u0001\u0015B\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u001f\u0010\f\u001a\u00020\u00062\u000e\u0010\u000b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\n0\tH\u0016¢\u0006\u0004\b\f\u0010\rR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u000eR\u001b\u0010\u0014\u001a\u00020\u000f8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0016"}, d2 = {"Lru/ozon/app/android/cart/domain/delegate/CartItemsCheckerImpl;", "Lru/ozon/app/android/cart/common/domain/delegate/CartItemsChecker;", "LBZ/e;", "miniAppConfigHolder", "<init>", "(LBZ/e;)V", "", "logMiniappItemError", "()V", "", "", "itemsDeliverySchemas", "checkMiniappItems", "(Ljava/util/List;)V", "LBZ/e;", "Lsj/d;", "ozonLogger$delegate", "LSc/j;", "getOzonLogger", "()Lsj/d;", "ozonLogger", "Companion", "cart_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class CartItemsCheckerImpl implements CartItemsChecker {

    @NotNull
    private static final Companion Companion = new Companion(null);

    @NotNull
    private final e miniAppConfigHolder;

    /* renamed from: ozonLogger$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j ozonLogger;

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0007X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0007X\u0086T¢\u0006\u0002\n\u0000¨\u0006\n"}, d2 = {"Lru/ozon/app/android/cart/domain/delegate/CartItemsCheckerImpl$Companion;", "", "<init>", "()V", "EXPRESS_DELIVERY_SCHEMA", "", "LOG_TEAM_TAG", "", "LOG_GROUP_TAG", "LOG_MESSAGE", "cart_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    private static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    public CartItemsCheckerImpl(@NotNull e miniAppConfigHolder) {
        Intrinsics.checkNotNullParameter(miniAppConfigHolder, "miniAppConfigHolder");
        this.miniAppConfigHolder = miniAppConfigHolder;
        this.ozonLogger = k.b(CartItemsCheckerImpl$ozonLogger$2.INSTANCE);
    }

    private final d getOzonLogger() {
        return (d) this.ozonLogger.getValue();
    }

    private final void logMiniappItemError() {
        h.a.d(getOzonLogger(), c.ERROR, "Invalid items in miniapp supermarket", null, Boolean.FALSE, 4);
    }

    @Override // ru.ozon.app.android.cart.common.domain.delegate.CartItemsChecker
    public void checkMiniappItems(@NotNull List<Long> itemsDeliverySchemas) {
        Intrinsics.checkNotNullParameter(itemsDeliverySchemas, "itemsDeliverySchemas");
        if (!itemsDeliverySchemas.isEmpty() && Intrinsics.d(f.a(this.miniAppConfigHolder), "supermarket")) {
            List<Long> list = itemsDeliverySchemas;
            if ((list instanceof Collection) && list.isEmpty()) {
                return;
            }
            for (Long l11 : list) {
                if (l11 == null || l11.longValue() != 131) {
                    logMiniappItemError();
                    return;
                }
            }
        }
    }
}
