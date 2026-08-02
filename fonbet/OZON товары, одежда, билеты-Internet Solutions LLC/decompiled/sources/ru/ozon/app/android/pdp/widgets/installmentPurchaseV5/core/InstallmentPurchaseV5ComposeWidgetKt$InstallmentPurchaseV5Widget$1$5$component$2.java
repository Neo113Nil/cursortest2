package ru.ozon.app.android.pdp.widgets.installmentPurchaseV5.core;

import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;
import ru.ozon.app.android.pdp.widgets.installmentPurchaseV5.data.InstallmentPurchaseV5DTO;
import ru.ozon.app.android.pdp.widgets.installmentPurchaseV5.di.InstallmentPurchaseV5Component;
import ru.ozon.app.android.pdp.widgets.installmentPurchaseV5.presentation.InstallmentPurchaseV5VO;
import ru.ozon.composer.compose.widget.scrollable.j;

@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lru/ozon/app/android/pdp/widgets/installmentPurchaseV5/di/InstallmentPurchaseV5Component;", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
final class InstallmentPurchaseV5ComposeWidgetKt$InstallmentPurchaseV5Widget$1$5$component$2 extends AbstractC7737t implements Function0<InstallmentPurchaseV5Component> {
    final /* synthetic */ j<InstallmentPurchaseV5DTO, InstallmentPurchaseV5VO.CreditProductsList> $this_viewMapper;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    InstallmentPurchaseV5ComposeWidgetKt$InstallmentPurchaseV5Widget$1$5$component$2(j<InstallmentPurchaseV5DTO, InstallmentPurchaseV5VO.CreditProductsList> jVar) {
        super(0);
        this.$this_viewMapper = jVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final InstallmentPurchaseV5Component invoke() {
        return (InstallmentPurchaseV5Component) this.$this_viewMapper.getWidgetComponentStorage().getComponent(InstallmentPurchaseV5Component.class);
    }
}
