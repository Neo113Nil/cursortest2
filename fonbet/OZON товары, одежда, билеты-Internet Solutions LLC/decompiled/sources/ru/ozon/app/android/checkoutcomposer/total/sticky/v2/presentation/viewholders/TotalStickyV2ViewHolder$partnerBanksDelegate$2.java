package ru.ozon.app.android.checkoutcomposer.total.sticky.v2.presentation.viewholders;

import WZ.l;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;
import ru.ozon.app.android.partnerBanks.presentation.view.PartnerBanksDelegate;

@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lru/ozon/app/android/partnerBanks/presentation/view/PartnerBanksDelegate;", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
final class TotalStickyV2ViewHolder$partnerBanksDelegate$2 extends AbstractC7737t implements Function0<PartnerBanksDelegate> {
    final /* synthetic */ l $tokenizedAnalytics;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    TotalStickyV2ViewHolder$partnerBanksDelegate$2(l lVar) {
        super(0);
        this.$tokenizedAnalytics = lVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final PartnerBanksDelegate invoke() {
        return new PartnerBanksDelegate(this.$tokenizedAnalytics);
    }
}
