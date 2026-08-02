package ru.ozon.app.android.universalwidgets.widgets.maxiTile.presentation;

import android.view.View;
import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.app.android.composer.ComposerReferences;
import ru.ozon.app.android.universalwidgets.widgets.maxiTile.presentation.view.MaxiTileView;

@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\n¢\u0006\u0002\b\u0006"}, d2 = {"<anonymous>", "Lru/ozon/app/android/universalwidgets/widgets/maxiTile/presentation/MaxiTileViewHolder;", "view", "Landroid/view/View;", "refs", "Lru/ozon/app/android/composer/ComposerReferences;", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
final class MaxiTileViewMapper$holderProducer$1 extends AbstractC7737t implements Function2<View, ComposerReferences, MaxiTileViewHolder> {
    final /* synthetic */ MaxiTileViewMapper this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    MaxiTileViewMapper$holderProducer$1(MaxiTileViewMapper maxiTileViewMapper) {
        super(2);
        this.this$0 = maxiTileViewMapper;
    }

    @Override // kotlin.jvm.functions.Function2
    public final MaxiTileViewHolder invoke(View view, ComposerReferences refs) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(refs, "refs");
        return new MaxiTileViewHolder(refs, (MaxiTileView) view, this.this$0.component().getTokenizedAnalytics(), this.this$0.component().getAddToCartButtonsBinder(), this.this$0.component().getFrameBinder());
    }
}
