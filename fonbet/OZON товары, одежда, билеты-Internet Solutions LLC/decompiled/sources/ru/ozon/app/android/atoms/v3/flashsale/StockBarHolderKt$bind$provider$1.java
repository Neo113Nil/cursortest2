package ru.ozon.app.android.atoms.v3.flashsale;

import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;
import ru.ozon.app.android.uikit.view.atoms.flashsale.StockBarView;

@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lru/ozon/app/android/atoms/v3/flashsale/StockBarHolder;", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
final class StockBarHolderKt$bind$provider$1 extends AbstractC7737t implements Function0<StockBarHolder> {
    final /* synthetic */ StockBarView $this_bind;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    StockBarHolderKt$bind$provider$1(StockBarView stockBarView) {
        super(0);
        this.$this_bind = stockBarView;
    }

    @Override // kotlin.jvm.functions.Function0
    public final StockBarHolder invoke() {
        return new StockBarHolder(this.$this_bind, (String) null);
    }
}
