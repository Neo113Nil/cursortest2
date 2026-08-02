package ru.ozon.app.android.pdp.widgets.brand.core.dsCell;

import android.view.View;
import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.C7735q;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.app.android.composer.ComposerReferences;
import ru.ozon.app.android.pdp.widgets.brand.presentation.dsCell.DsCellBrandViewHolder;

@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
/* synthetic */ class DsCellBrandViewMapper$holderProducer$1 extends C7735q implements Function2<View, ComposerReferences, DsCellBrandViewHolder> {
    DsCellBrandViewMapper$holderProducer$1(Object obj) {
        super(2, obj, DsCellBrandViewMapper.class, "createViewHolder", "createViewHolder(Landroid/view/View;Lru/ozon/app/android/composer/ComposerReferences;)Lru/ozon/app/android/pdp/widgets/brand/presentation/dsCell/DsCellBrandViewHolder;", 0);
    }

    @Override // kotlin.jvm.functions.Function2
    public final DsCellBrandViewHolder invoke(View p02, ComposerReferences p12) {
        DsCellBrandViewHolder createViewHolder;
        Intrinsics.checkNotNullParameter(p02, "p0");
        Intrinsics.checkNotNullParameter(p12, "p1");
        createViewHolder = ((DsCellBrandViewMapper) this.receiver).createViewHolder(p02, p12);
        return createViewHolder;
    }
}
