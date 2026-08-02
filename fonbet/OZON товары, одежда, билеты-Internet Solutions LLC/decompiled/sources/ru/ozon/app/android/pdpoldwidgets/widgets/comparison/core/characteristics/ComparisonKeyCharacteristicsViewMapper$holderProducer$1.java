package ru.ozon.app.android.pdpoldwidgets.widgets.comparison.core.characteristics;

import android.view.View;
import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.app.android.composer.ComposerReferences;
import ru.ozon.app.android.pdp.ui.configurators.databinding.PdpWidgetComparisonCharateristicsGroupBinding;
import ru.ozon.app.android.pdpoldwidgets.R$id;

@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\n¢\u0006\u0002\b\u0006"}, d2 = {"<anonymous>", "Lru/ozon/app/android/pdpoldwidgets/widgets/comparison/core/characteristics/CharacteristicsGroupViewHolder;", "view", "Landroid/view/View;", "refs", "Lru/ozon/app/android/composer/ComposerReferences;", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
final class ComparisonKeyCharacteristicsViewMapper$holderProducer$1 extends AbstractC7737t implements Function2<View, ComposerReferences, CharacteristicsGroupViewHolder> {
    public static final ComparisonKeyCharacteristicsViewMapper$holderProducer$1 INSTANCE = new ComparisonKeyCharacteristicsViewMapper$holderProducer$1();

    ComparisonKeyCharacteristicsViewMapper$holderProducer$1() {
        super(2);
    }

    @Override // kotlin.jvm.functions.Function2
    public final CharacteristicsGroupViewHolder invoke(View view, ComposerReferences refs) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(refs, "refs");
        PdpWidgetComparisonCharateristicsGroupBinding bind = PdpWidgetComparisonCharateristicsGroupBinding.bind(view);
        bind.getConstraintLayout().setId(R$id.keyGroupCL);
        bind.expandableLayout.e(1.0f);
        Intrinsics.checkNotNullExpressionValue(bind, "apply(...)");
        return new CharacteristicsGroupViewHolder(bind, CharacteristicsGroupViewHolderType.KEY, refs);
    }
}
