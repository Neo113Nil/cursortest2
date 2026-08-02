package ru.ozon.app.android.common.filterWidgets.filters.presentation.brandAspects;

import android.view.View;
import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.app.android.common.filterWidgets.filters.presentation.CustomRefreshHandler;
import ru.ozon.app.android.composer.ComposerReferences;
import ru.ozon.app.android.storefront.filterWidgets.databinding.FilterBrandAspectsBinding;
import ru.ozon.app.android.storefront.filterWidgets.databinding.FilterHeaderUniversalRightBinding;

@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\n¢\u0006\u0002\b\u0006"}, d2 = {"<anonymous>", "Lru/ozon/app/android/common/filterWidgets/filters/presentation/brandAspects/BrandAspectsViewHolder;", "view", "Landroid/view/View;", "references", "Lru/ozon/app/android/composer/ComposerReferences;", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
final class BrandAspectsViewMapper$holderProducer$1 extends AbstractC7737t implements Function2<View, ComposerReferences, BrandAspectsViewHolder> {
    public static final BrandAspectsViewMapper$holderProducer$1 INSTANCE = new BrandAspectsViewMapper$holderProducer$1();

    BrandAspectsViewMapper$holderProducer$1() {
        super(2);
    }

    @Override // kotlin.jvm.functions.Function2
    public final BrandAspectsViewHolder invoke(View view, ComposerReferences references) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(references, "references");
        FilterBrandAspectsBinding bind = FilterBrandAspectsBinding.bind(view);
        Intrinsics.checkNotNullExpressionValue(bind, "bind(...)");
        FilterHeaderUniversalRightBinding bind2 = FilterHeaderUniversalRightBinding.bind(bind.headerContainer.getConstraintLayout());
        Intrinsics.checkNotNullExpressionValue(bind2, "bind(...)");
        return new BrandAspectsViewHolder(new CustomRefreshHandler(references), bind, bind2, references);
    }
}
