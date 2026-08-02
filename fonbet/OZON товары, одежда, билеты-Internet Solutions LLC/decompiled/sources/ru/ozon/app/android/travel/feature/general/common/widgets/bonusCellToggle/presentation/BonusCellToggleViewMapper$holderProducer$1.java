package ru.ozon.app.android.travel.feature.general.common.widgets.bonusCellToggle.presentation;

import android.view.View;
import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.C7735q;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.app.android.composer.ComposerReferences;

@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
/* synthetic */ class BonusCellToggleViewMapper$holderProducer$1 extends C7735q implements Function2<View, ComposerReferences, BonusCellToggleWidgetViewHolder> {
    public static final BonusCellToggleViewMapper$holderProducer$1 INSTANCE = new BonusCellToggleViewMapper$holderProducer$1();

    BonusCellToggleViewMapper$holderProducer$1() {
        super(2, BonusCellToggleWidgetViewHolder.class, "<init>", "<init>(Landroid/view/View;Lru/ozon/app/android/composer/ComposerReferences;)V", 0);
    }

    @Override // kotlin.jvm.functions.Function2
    public final BonusCellToggleWidgetViewHolder invoke(View p02, ComposerReferences p12) {
        Intrinsics.checkNotNullParameter(p02, "p0");
        Intrinsics.checkNotNullParameter(p12, "p1");
        return new BonusCellToggleWidgetViewHolder(p02, p12);
    }
}
