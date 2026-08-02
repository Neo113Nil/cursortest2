package ru.ozon.app.android.pdp.widgets.cartButtonV4.doubleCart.badge;

import d20.AbstractC6065b;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import l10.i;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.pdp.widgets.cartButtonV4.CartButtonPreCreateVHState;
import ru.ozon.app.android.pdp.widgets.cartButtonV4.CartButtonV4Dto;
import ru.ozon.app.android.pdp.widgets.cartButtonV4.doubleCart.DoubleCartPreCreateViewHolderState;
import ru.ozon.app.android.pdp.widgets.cartButtonV4.doubleCart.DoubleCartVO;
import ru.ozon.app.android.pdp.widgets.cartButtonV4.doubleCart.core.BaseDoubleCartV4ViewMapper;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u001d\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000b2\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lru/ozon/app/android/pdp/widgets/cartButtonV4/doubleCart/badge/DoubleCartWithBadgeV4ViewMapper;", "Lru/ozon/app/android/pdp/widgets/cartButtonV4/doubleCart/core/BaseDoubleCartV4ViewMapper;", "<init>", "()V", "", "state", "", "canMap", "(Ljava/lang/Object;)Z", "Ll10/i;", "container", "Ld20/b;", "Lru/ozon/app/android/pdp/widgets/cartButtonV4/doubleCart/DoubleCartVO;", "createHolder", "(Ll10/i;)Ld20/b;", "pdp_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class DoubleCartWithBadgeV4ViewMapper extends BaseDoubleCartV4ViewMapper {
    @Override // c20.r, m20.InterfaceC8046a
    public boolean canMap(Object state) {
        CartButtonV4Dto cartButtonV4Dto = state instanceof CartButtonV4Dto ? (CartButtonV4Dto) state : null;
        if (cartButtonV4Dto == null) {
            return false;
        }
        CartButtonV4Dto.Configuration configuration = cartButtonV4Dto.getConfiguration();
        CartButtonV4Dto.Configuration.DoubleCartData doubleCartData = configuration instanceof CartButtonV4Dto.Configuration.DoubleCartData ? (CartButtonV4Dto.Configuration.DoubleCartData) configuration : null;
        if (doubleCartData == null) {
            return false;
        }
        return (cartButtonV4Dto.getRelatedProductsCurtain() == null && doubleCartData.getFirstCartButton().getToCart().getButtonWithIcon().getBadge() != null) || doubleCartData.getSecondCartButton().getToCart().getButtonWithIcon().getBadge() != null;
    }

    @Override // c20.r
    @NotNull
    public AbstractC6065b<DoubleCartVO> createHolder(@NotNull i container) {
        Intrinsics.checkNotNullParameter(container, "container");
        CartButtonPreCreateVHState cachedState = doubleCartPreCreateVHStateHolder().getCachedState();
        Intrinsics.g(cachedState, "null cannot be cast to non-null type ru.ozon.app.android.pdp.widgets.cartButtonV4.doubleCart.DoubleCartPreCreateViewHolderState");
        DoubleCartPreCreateViewHolderState doubleCartPreCreateViewHolderState = (DoubleCartPreCreateViewHolderState) cachedState;
        return new DoubleCartWithBadgeV4ViewHolder(container, component().getDoubleCartViewBinder(), component().getFeatureChecker(), doubleCartPreCreateViewHolderState.getMode(), doubleCartPreCreateViewHolderState.getHasShadow(), null, 32, null);
    }
}
