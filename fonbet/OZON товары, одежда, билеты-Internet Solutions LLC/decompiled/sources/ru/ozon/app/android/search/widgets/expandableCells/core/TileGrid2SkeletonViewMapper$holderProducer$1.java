package ru.ozon.app.android.search.widgets.expandableCells.core;

import android.view.View;
import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.app.android.composer.ComposerReferences;
import ru.ozon.app.android.search.widgets.expandableCells.presentation.skeletons.TileItemSkeleton;
import ru.ozon.app.android.search.widgets.expandableCells.presentation.skeletons.tileGrid2.TileGrid2SkeletonViewHolder;

@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\n¢\u0006\u0002\b\u0006"}, d2 = {"<anonymous>", "Lru/ozon/app/android/search/widgets/expandableCells/presentation/skeletons/tileGrid2/TileGrid2SkeletonViewHolder;", "view", "Landroid/view/View;", "refs", "Lru/ozon/app/android/composer/ComposerReferences;", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
final class TileGrid2SkeletonViewMapper$holderProducer$1 extends AbstractC7737t implements Function2<View, ComposerReferences, TileGrid2SkeletonViewHolder> {
    public static final TileGrid2SkeletonViewMapper$holderProducer$1 INSTANCE = new TileGrid2SkeletonViewMapper$holderProducer$1();

    TileGrid2SkeletonViewMapper$holderProducer$1() {
        super(2);
    }

    @Override // kotlin.jvm.functions.Function2
    public final TileGrid2SkeletonViewHolder invoke(View view, ComposerReferences refs) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(refs, "refs");
        return new TileGrid2SkeletonViewHolder((TileItemSkeleton) view);
    }
}
