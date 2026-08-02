package ru.ozon.app.android.universalwidgets.widgets.uw.sku.separator;

import android.view.View;
import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.app.android.composer.ComposerReferences;

@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\n¢\u0006\u0002\b\u0006"}, d2 = {"<anonymous>", "Lru/ozon/app/android/universalwidgets/widgets/uw/sku/separator/SkuSeparatorViewHolder;", "v", "Landroid/view/View;", "<unused var>", "Lru/ozon/app/android/composer/ComposerReferences;", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
final class SkuSeparatorViewMapper$holderProducer$1 extends AbstractC7737t implements Function2<View, ComposerReferences, SkuSeparatorViewHolder> {
    public static final SkuSeparatorViewMapper$holderProducer$1 INSTANCE = new SkuSeparatorViewMapper$holderProducer$1();

    SkuSeparatorViewMapper$holderProducer$1() {
        super(2);
    }

    @Override // kotlin.jvm.functions.Function2
    public final SkuSeparatorViewHolder invoke(View v11, ComposerReferences composerReferences) {
        Intrinsics.checkNotNullParameter(v11, "v");
        Intrinsics.checkNotNullParameter(composerReferences, "<unused var>");
        return new SkuSeparatorViewHolder(v11);
    }
}
