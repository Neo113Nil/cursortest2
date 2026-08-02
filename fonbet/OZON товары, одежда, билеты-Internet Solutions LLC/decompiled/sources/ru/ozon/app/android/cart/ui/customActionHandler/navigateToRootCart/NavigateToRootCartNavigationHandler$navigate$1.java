package ru.ozon.app.android.cart.ui.customActionHandler.navigateToRootCart;

import EZ.g;
import androidx.fragment.app.ComponentCallbacksC5392m;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.I;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.app.android.cart.common.utils.link.CartLinkGenerator;

@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
final class NavigateToRootCartNavigationHandler$navigate$1 extends AbstractC7737t implements Function0<Unit> {
    final /* synthetic */ I $isCurrentScreenCart;
    final /* synthetic */ g $navigator;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    NavigateToRootCartNavigationHandler$navigate$1(g gVar, I i11) {
        super(0);
        this.$navigator = gVar;
        this.$isCurrentScreenCart = i11;
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.f71690a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        this.$navigator.getFragmentManager().S0();
        ComponentCallbacksC5392m w02 = this.$navigator.getFragmentManager().w0();
        String tag = w02 != null ? w02.getTag() : null;
        String uri = CartLinkGenerator.cart$default(CartLinkGenerator.INSTANCE, false, 1, null).toString();
        Intrinsics.checkNotNullExpressionValue(uri, "toString(...)");
        this.$isCurrentScreenCart.f71783a = Intrinsics.d(tag, uri);
    }
}
