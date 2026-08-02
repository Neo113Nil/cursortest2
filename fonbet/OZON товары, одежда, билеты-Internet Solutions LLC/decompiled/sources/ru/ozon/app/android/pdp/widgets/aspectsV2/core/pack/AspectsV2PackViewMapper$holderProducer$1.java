package ru.ozon.app.android.pdp.widgets.aspectsV2.core.pack;

import android.view.View;
import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.app.android.composer.ComposerReferences;
import ru.ozon.app.android.pdp.ui.configurators.aspectsCompactV2.AspectsDecorFactory;
import ru.ozon.app.android.pdp.ui.configurators.aspectsCompactV2.pack.PackVariantsAdapter;
import ru.ozon.app.android.pdp.widgets.aspectsV2.presentation.AspectsV2BaseViewHolder;

@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\n¢\u0006\u0002\b\u0006"}, d2 = {"<anonymous>", "Lru/ozon/app/android/pdp/widgets/aspectsV2/presentation/AspectsV2BaseViewHolder;", "view", "Landroid/view/View;", "ref", "Lru/ozon/app/android/composer/ComposerReferences;", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
final class AspectsV2PackViewMapper$holderProducer$1 extends AbstractC7737t implements Function2<View, ComposerReferences, AspectsV2BaseViewHolder> {
    public static final AspectsV2PackViewMapper$holderProducer$1 INSTANCE = new AspectsV2PackViewMapper$holderProducer$1();

    AspectsV2PackViewMapper$holderProducer$1() {
        super(2);
    }

    @Override // kotlin.jvm.functions.Function2
    public final AspectsV2BaseViewHolder invoke(View view, ComposerReferences ref) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(ref, "ref");
        view.setContentDescription("aspectsCompactTextRoot");
        return new AspectsV2BaseViewHolder(view, new PackVariantsAdapter(), AspectsDecorFactory.AspectMode.HORIZONTAL_ZERO_SPACE_BETWEEN, ref, null, 16, null);
    }
}
