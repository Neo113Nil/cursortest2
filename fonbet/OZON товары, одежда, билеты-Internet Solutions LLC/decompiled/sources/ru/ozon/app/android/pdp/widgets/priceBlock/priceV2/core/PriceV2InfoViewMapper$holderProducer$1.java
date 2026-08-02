package ru.ozon.app.android.pdp.widgets.priceBlock.priceV2.core;

import android.view.View;
import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.app.android.composer.ComposerReferences;
import ru.ozon.app.android.pdp.ui.configurators.pdp.price.InfoCardView;
import ru.ozon.app.android.pdp.widgets.priceBlock.priceV2.presentation.info.PriceV2InfoWidgetViewHolder;

@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\n¢\u0006\u0002\b\u0006"}, d2 = {"<anonymous>", "Lru/ozon/app/android/pdp/widgets/priceBlock/priceV2/presentation/info/PriceV2InfoWidgetViewHolder;", "view", "Landroid/view/View;", "refs", "Lru/ozon/app/android/composer/ComposerReferences;", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
final class PriceV2InfoViewMapper$holderProducer$1 extends AbstractC7737t implements Function2<View, ComposerReferences, PriceV2InfoWidgetViewHolder> {
    final /* synthetic */ PriceV2InfoViewMapper this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    PriceV2InfoViewMapper$holderProducer$1(PriceV2InfoViewMapper priceV2InfoViewMapper) {
        super(2);
        this.this$0 = priceV2InfoViewMapper;
    }

    @Override // kotlin.jvm.functions.Function2
    public final PriceV2InfoWidgetViewHolder invoke(View view, ComposerReferences refs) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(refs, "refs");
        return new PriceV2InfoWidgetViewHolder((InfoCardView) view, this.this$0.component().getViewModel(), refs, this.this$0.component().getPriceV2ShapeDrawableStorage(), this.this$0.component().getTokenizedAnalytics());
    }
}
