package ru.ozon.app.android.fresh.unsorted.widgets.wholesale.di;

import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;
import ru.ozon.app.android.fresh.unsorted.widgets.wholesale.presentation.WholeSaleViewModel;

@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lru/ozon/app/android/fresh/unsorted/widgets/wholesale/presentation/WholeSaleViewModel;", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
final class WholeSaleComponent$Companion$create$1$1$viewModel$2 extends AbstractC7737t implements Function0<WholeSaleViewModel> {
    final /* synthetic */ WholeSaleComponent$Companion$create$1$1 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    WholeSaleComponent$Companion$create$1$1$viewModel$2(WholeSaleComponent$Companion$create$1$1 wholeSaleComponent$Companion$create$1$1) {
        super(0);
        this.this$0 = wholeSaleComponent$Companion$create$1$1;
    }

    @Override // kotlin.jvm.functions.Function0
    public final WholeSaleViewModel invoke() {
        return new WholeSaleViewModel(this.this$0.getCartService(), this.this$0.getTokenizedAnalytics());
    }
}
