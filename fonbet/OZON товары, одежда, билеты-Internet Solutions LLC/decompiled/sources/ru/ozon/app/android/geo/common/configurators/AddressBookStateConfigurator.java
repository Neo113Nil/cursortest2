package ru.ozon.app.android.geo.common.configurators;

import A00.a;
import L00.i;
import QZ.g;
import i10.h;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.cart.common.domain.AddressPopUpProduct;
import ru.ozon.app.android.cart.common.domain.FreshAddToCartRetryHandler;

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u0000 \r2\u00020\u0001:\u0001\rB\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001f\u0010\n\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\n\u0010\u000bR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\f¨\u0006\u000e"}, d2 = {"Lru/ozon/app/android/geo/common/configurators/AddressBookStateConfigurator;", "LQZ/g;", "Lru/ozon/app/android/cart/common/domain/FreshAddToCartRetryHandler;", "retryHandler", "<init>", "(Lru/ozon/app/android/cart/common/domain/FreshAddToCartRetryHandler;)V", "Li10/h;", "state", "LA00/a;", "trigger", "interceptState", "(Li10/h;LA00/a;)Li10/h;", "Lru/ozon/app/android/cart/common/domain/FreshAddToCartRetryHandler;", "Companion", "geo_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class AddressBookStateConfigurator implements g {

    @NotNull
    private static final Companion Companion = new Companion(null);

    @NotNull
    private final FreshAddToCartRetryHandler retryHandler;

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Lru/ozon/app/android/geo/common/configurators/AddressBookStateConfigurator$Companion;", "", "<init>", "()V", "ITEMS", "", "geo_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    /* loaded from: classes12.dex */
    private static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    public AddressBookStateConfigurator(@NotNull FreshAddToCartRetryHandler retryHandler) {
        Intrinsics.checkNotNullParameter(retryHandler, "retryHandler");
        this.retryHandler = retryHandler;
    }

    @Override // QZ.g
    @NotNull
    public L00.g interceptRequest(@NotNull h hVar, @NotNull L00.g gVar, @NotNull i iVar) {
        g.a.a(hVar, gVar, iVar);
        return gVar;
    }

    @Override // QZ.g
    @NotNull
    public h interceptState(@NotNull h state, @NotNull a trigger) {
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(trigger, "trigger");
        List<AddressPopUpProduct> addressPopUpProducts = this.retryHandler.getAddressPopUpProducts();
        if (!addressPopUpProducts.isEmpty()) {
            state.f().put("items", addressPopUpProducts);
        }
        return h.a(state, null, i10.g.POST, null, null, null, 61);
    }

    @Override // QZ.g
    @NotNull
    public h onInit(@NotNull h state) {
        Intrinsics.checkNotNullParameter(state, "state");
        return state;
    }
}
