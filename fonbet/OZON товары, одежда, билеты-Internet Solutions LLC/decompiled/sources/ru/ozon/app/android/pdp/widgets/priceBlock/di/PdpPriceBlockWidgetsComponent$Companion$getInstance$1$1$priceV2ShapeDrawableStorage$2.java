package ru.ozon.app.android.pdp.widgets.priceBlock.di;

import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;
import ru.ozon.app.android.pdp.widgets.priceBlock.priceV2.presentation.drawables.PriceV2ShapeDrawableStorage;
import ru.ozon.app.android.utils.AppType;

@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lru/ozon/app/android/pdp/widgets/priceBlock/priceV2/presentation/drawables/PriceV2ShapeDrawableStorage;", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
final class PdpPriceBlockWidgetsComponent$Companion$getInstance$1$1$priceV2ShapeDrawableStorage$2 extends AbstractC7737t implements Function0<PriceV2ShapeDrawableStorage> {
    final /* synthetic */ PdpPriceBlockWidgetsComponent$Companion$getInstance$1$1 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    PdpPriceBlockWidgetsComponent$Companion$getInstance$1$1$priceV2ShapeDrawableStorage$2(PdpPriceBlockWidgetsComponent$Companion$getInstance$1$1 pdpPriceBlockWidgetsComponent$Companion$getInstance$1$1) {
        super(0);
        this.this$0 = pdpPriceBlockWidgetsComponent$Companion$getInstance$1$1;
    }

    @Override // kotlin.jvm.functions.Function0
    public final PriceV2ShapeDrawableStorage invoke() {
        return new PriceV2ShapeDrawableStorage(this.this$0.getAppType() == AppType.SELECT);
    }
}
