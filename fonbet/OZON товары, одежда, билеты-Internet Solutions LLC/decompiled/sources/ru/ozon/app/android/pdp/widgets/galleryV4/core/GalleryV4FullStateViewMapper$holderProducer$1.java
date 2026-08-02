package ru.ozon.app.android.pdp.widgets.galleryV4.core;

import android.view.View;
import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.C7735q;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.app.android.composer.ComposerReferences;
import ru.ozon.app.android.pdp.widgets.galleryV4.presentation.GalleryV4VO;
import ru.ozon.composer.ui.widget.k;

@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
/* synthetic */ class GalleryV4FullStateViewMapper$holderProducer$1 extends C7735q implements Function2<View, ComposerReferences, k<GalleryV4VO>> {
    GalleryV4FullStateViewMapper$holderProducer$1(Object obj) {
        super(2, obj, GalleryV4FullStateViewMapper.class, "createViewHolder", "createViewHolder(Landroid/view/View;Lru/ozon/app/android/composer/ComposerReferences;)Lru/ozon/composer/ui/widget/WidgetViewHolder;", 0);
    }

    @Override // kotlin.jvm.functions.Function2
    public final k<GalleryV4VO> invoke(View p02, ComposerReferences p12) {
        k<GalleryV4VO> createViewHolder;
        Intrinsics.checkNotNullParameter(p02, "p0");
        Intrinsics.checkNotNullParameter(p12, "p1");
        createViewHolder = ((GalleryV4FullStateViewMapper) this.receiver).createViewHolder(p02, p12);
        return createViewHolder;
    }
}
