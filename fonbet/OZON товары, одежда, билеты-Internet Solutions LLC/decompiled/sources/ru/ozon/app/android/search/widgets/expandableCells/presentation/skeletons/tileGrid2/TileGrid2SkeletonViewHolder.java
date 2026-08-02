package ru.ozon.app.android.search.widgets.expandableCells.presentation.skeletons.tileGrid2;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import l20.d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.search.widgets.expandableCells.presentation.skeletons.SkeletonVO;
import ru.ozon.app.android.search.widgets.expandableCells.presentation.skeletons.TileItemSkeleton;
import ru.ozon.composer.ui.widget.k;

@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\b\u0001\u0018\u00002\u0012\u0012\u0004\u0012\u00020\u00020\u0001j\b\u0012\u0004\u0012\u00020\u0002`\u0003B\u000f\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J#\u0010\r\u001a\u00020\f2\u0006\u0010\b\u001a\u00020\u00022\n\u0010\u000b\u001a\u00060\tj\u0002`\nH\u0014¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\fH\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0011¨\u0006\u0012"}, d2 = {"Lru/ozon/app/android/search/widgets/expandableCells/presentation/skeletons/tileGrid2/TileGrid2SkeletonViewHolder;", "Lru/ozon/composer/ui/widget/k;", "Lru/ozon/app/android/search/widgets/expandableCells/presentation/skeletons/SkeletonVO;", "Lru/ozon/app/android/composer/widgets/base/WidgetViewHolder;", "Lru/ozon/app/android/search/widgets/expandableCells/presentation/skeletons/TileItemSkeleton;", "containerView", "<init>", "(Lru/ozon/app/android/search/widgets/expandableCells/presentation/skeletons/TileItemSkeleton;)V", "item", "Ll20/d;", "Lru/ozon/app/android/composer/view/WidgetInfo;", "info", "", "bind", "(Lru/ozon/app/android/search/widgets/expandableCells/presentation/skeletons/SkeletonVO;Ll20/d;)V", "onDetach", "()V", "Lru/ozon/app/android/search/widgets/expandableCells/presentation/skeletons/TileItemSkeleton;", "search_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class TileGrid2SkeletonViewHolder extends k<SkeletonVO> {

    @NotNull
    private final TileItemSkeleton containerView;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TileGrid2SkeletonViewHolder(@NotNull TileItemSkeleton containerView) {
        super(containerView);
        Intrinsics.checkNotNullParameter(containerView, "containerView");
        this.containerView = containerView;
    }

    @Override // ru.ozon.composer.ui.widget.k, jk0.j
    public void onDetach() {
        super.onDetach();
        this.containerView.stopShimmerAnimation();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // ru.ozon.composer.ui.widget.k
    public void bind(@NotNull SkeletonVO item, @NotNull d info) {
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(info, "info");
        this.containerView.startShimmerAnimation();
    }
}
