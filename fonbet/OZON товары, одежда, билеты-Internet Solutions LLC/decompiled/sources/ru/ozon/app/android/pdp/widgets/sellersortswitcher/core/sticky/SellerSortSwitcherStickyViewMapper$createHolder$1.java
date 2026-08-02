package ru.ozon.app.android.pdp.widgets.sellersortswitcher.core.sticky;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import l10.i;
import ru.ozon.app.android.pdp.widgets.sellersortswitcher.core.sticky.SellerSortSwitcherStickyViewMapper;

@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
final class SellerSortSwitcherStickyViewMapper$createHolder$1 extends AbstractC7737t implements Function1<Boolean, Unit> {
    final /* synthetic */ i $container;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    SellerSortSwitcherStickyViewMapper$createHolder$1(i iVar) {
        super(1);
        this.$container = iVar;
    }

    public final void invoke(boolean z11) {
        this.$container.M().update(new SellerSortSwitcherStickyViewMapper.VisibilityUpdateKey(!z11));
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(Boolean bool) {
        invoke(bool.booleanValue());
        return Unit.f71690a;
    }
}
