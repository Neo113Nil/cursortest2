package ru.ozon.app.android.pdp.widgets.brand.core.cell;

import android.view.View;
import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.C7735q;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.app.android.composer.ComposerReferences;
import ru.ozon.app.android.pdp.widgets.brand.presentation.original.OriginalBrandWidgetPlaceholderViewHolder;

@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
/* synthetic */ class OriginalBrandWidgetPlaceholderViewMapper$holderProducer$1 extends C7735q implements Function2<View, ComposerReferences, OriginalBrandWidgetPlaceholderViewHolder> {
    OriginalBrandWidgetPlaceholderViewMapper$holderProducer$1(Object obj) {
        super(2, obj, OriginalBrandWidgetPlaceholderViewMapper.class, "createViewHolder", "createViewHolder(Landroid/view/View;Lru/ozon/app/android/composer/ComposerReferences;)Lru/ozon/app/android/pdp/widgets/brand/presentation/original/OriginalBrandWidgetPlaceholderViewHolder;", 0);
    }

    @Override // kotlin.jvm.functions.Function2
    public final OriginalBrandWidgetPlaceholderViewHolder invoke(View p02, ComposerReferences p12) {
        OriginalBrandWidgetPlaceholderViewHolder createViewHolder;
        Intrinsics.checkNotNullParameter(p02, "p0");
        Intrinsics.checkNotNullParameter(p12, "p1");
        createViewHolder = ((OriginalBrandWidgetPlaceholderViewMapper) this.receiver).createViewHolder(p02, p12);
        return createViewHolder;
    }
}
