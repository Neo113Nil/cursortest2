package ru.ozon.app.android.fresh.cart.widgets.cartTabs.presentation;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.app.android.fresh.cart.widgets.cartTabs.presentation.CartTabsVO;
import ru.ozon.uni.android.atom.text.TextAtomV2View;
import ru.ozon.uni.atoms.v3.holders.text.TextHolderKt;

@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "Lru/ozon/uni/android/atom/text/TextAtomV2View;", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
final class CartTabKt$CartTab$3$3$2$1 extends AbstractC7737t implements Function1<TextAtomV2View, Unit> {
    final /* synthetic */ CartTabsVO.CartTabItem $item;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    CartTabKt$CartTab$3$3$2$1(CartTabsVO.CartTabItem cartTabItem) {
        super(1);
        this.$item = cartTabItem;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(TextAtomV2View textAtomV2View) {
        invoke2(textAtomV2View);
        return Unit.f71690a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(TextAtomV2View it) {
        Intrinsics.checkNotNullParameter(it, "it");
        TextHolderKt.bindOrGone$default(it, this.$item.getTitle(), null, 2, null);
    }
}
