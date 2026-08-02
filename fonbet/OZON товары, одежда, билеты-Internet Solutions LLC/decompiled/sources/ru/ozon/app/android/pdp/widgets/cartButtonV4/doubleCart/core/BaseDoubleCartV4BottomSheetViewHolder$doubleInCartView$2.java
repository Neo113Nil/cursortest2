package ru.ozon.app.android.pdp.widgets.cartButtonV4.doubleCart.core;

import android.content.Context;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import l10.i;
import ru.ozon.app.android.pdp.widgets.cartButtonV4.doubleCart.DoubleInCartViewV4;

@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lru/ozon/app/android/pdp/widgets/cartButtonV4/doubleCart/DoubleInCartViewV4;", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
final class BaseDoubleCartV4BottomSheetViewHolder$doubleInCartView$2 extends AbstractC7737t implements Function0<DoubleInCartViewV4> {
    final /* synthetic */ BaseDoubleCartV4BottomSheetViewHolder this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    BaseDoubleCartV4BottomSheetViewHolder$doubleInCartView$2(BaseDoubleCartV4BottomSheetViewHolder baseDoubleCartV4BottomSheetViewHolder) {
        super(0);
        this.this$0 = baseDoubleCartV4BottomSheetViewHolder;
    }

    @Override // kotlin.jvm.functions.Function0
    public final DoubleInCartViewV4 invoke() {
        i iVar;
        iVar = this.this$0.container;
        Context L11 = iVar.L();
        Intrinsics.checkNotNullExpressionValue(L11, "<get-context>(...)");
        return new DoubleInCartViewV4(L11, null, 0, 6, null);
    }
}
