package ru.ozon.app.android.pdp.widgets.priceV4.presentation.bottom;

import android.content.Context;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;
import ru.ozon.app.android.partnerBanks.presentation.view.PartnerBanksView;

@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lru/ozon/app/android/partnerBanks/presentation/view/PartnerBanksView;", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
final class PriceV4BottomView$partnerBanksView$2 extends AbstractC7737t implements Function0<PartnerBanksView> {
    final /* synthetic */ Context $context;
    final /* synthetic */ PriceV4BottomView this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    PriceV4BottomView$partnerBanksView$2(Context context, PriceV4BottomView priceV4BottomView) {
        super(0);
        this.$context = context;
        this.this$0 = priceV4BottomView;
    }

    @Override // kotlin.jvm.functions.Function0
    public final PartnerBanksView invoke() {
        PartnerBanksView partnerBanksView = new PartnerBanksView(this.$context, null, 0, 6, null);
        partnerBanksView.setOnChangeCroppedWidget(new PriceV4BottomView$partnerBanksView$2$1$1(this.this$0));
        return partnerBanksView;
    }
}
