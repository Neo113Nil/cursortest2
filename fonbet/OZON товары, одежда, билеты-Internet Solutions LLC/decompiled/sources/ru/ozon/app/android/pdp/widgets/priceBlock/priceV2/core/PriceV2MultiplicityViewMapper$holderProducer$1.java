package ru.ozon.app.android.pdp.widgets.priceBlock.priceV2.core;

import android.view.View;
import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.app.android.composer.ComposerReferences;
import ru.ozon.app.android.pdp.widgets.priceBlock.priceV2.presentation.multiplicity.PriceV2MultiplicityWidgetViewHolder;
import ru.ozon.uni.android.atom.text.TextAtomV2View;

@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\n¢\u0006\u0002\b\u0006"}, d2 = {"<anonymous>", "Lru/ozon/app/android/pdp/widgets/priceBlock/priceV2/presentation/multiplicity/PriceV2MultiplicityWidgetViewHolder;", "view", "Landroid/view/View;", "refs", "Lru/ozon/app/android/composer/ComposerReferences;", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
final class PriceV2MultiplicityViewMapper$holderProducer$1 extends AbstractC7737t implements Function2<View, ComposerReferences, PriceV2MultiplicityWidgetViewHolder> {
    final /* synthetic */ PriceV2MultiplicityViewMapper this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    PriceV2MultiplicityViewMapper$holderProducer$1(PriceV2MultiplicityViewMapper priceV2MultiplicityViewMapper) {
        super(2);
        this.this$0 = priceV2MultiplicityViewMapper;
    }

    @Override // kotlin.jvm.functions.Function2
    public final PriceV2MultiplicityWidgetViewHolder invoke(View view, ComposerReferences refs) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(refs, "refs");
        return new PriceV2MultiplicityWidgetViewHolder((TextAtomV2View) view, this.this$0.component().getPriceV2ShapeDrawableStorage(), refs);
    }
}
