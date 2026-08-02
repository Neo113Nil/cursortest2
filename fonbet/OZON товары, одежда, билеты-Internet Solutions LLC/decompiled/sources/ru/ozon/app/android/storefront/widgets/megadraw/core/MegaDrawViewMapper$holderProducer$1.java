package ru.ozon.app.android.storefront.widgets.megadraw.core;

import android.view.View;
import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.C7735q;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.app.android.composer.ComposerReferences;
import ru.ozon.app.android.storefront.widgets.megadraw.presentation.MegaDrawViewHolder;

@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
/* synthetic */ class MegaDrawViewMapper$holderProducer$1 extends C7735q implements Function2<View, ComposerReferences, MegaDrawViewHolder> {
    public static final MegaDrawViewMapper$holderProducer$1 INSTANCE = new MegaDrawViewMapper$holderProducer$1();

    MegaDrawViewMapper$holderProducer$1() {
        super(2, MegaDrawViewHolder.class, "<init>", "<init>(Landroid/view/View;Lru/ozon/app/android/composer/ComposerReferences;)V", 0);
    }

    @Override // kotlin.jvm.functions.Function2
    public final MegaDrawViewHolder invoke(View p02, ComposerReferences p12) {
        Intrinsics.checkNotNullParameter(p02, "p0");
        Intrinsics.checkNotNullParameter(p12, "p1");
        return new MegaDrawViewHolder(p02, p12);
    }
}
