package ru.ozon.app.android.search.widgets.expandableCells.core;

import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C7714v;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import l20.d;
import ru.ozon.app.android.search.widgets.expandableCells.presentation.skeletons.SkeletonVO;

@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0003\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00000\u00052\u0006\u0010\u0001\u001a\u00020\u00002\n\u0010\u0004\u001a\u00060\u0002j\u0002`\u0003H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lru/ozon/app/android/search/widgets/expandableCells/presentation/skeletons/SkeletonVO;", "dto", "Ll20/d;", "Lru/ozon/composer/network/widget/item/WidgetInfo;", "info", "", "invoke", "(Lru/ozon/app/android/search/widgets/expandableCells/presentation/skeletons/SkeletonVO;Ll20/d;)Ljava/util/List;", "<anonymous>"}, k = 3, mv = {2, 0, 0})
/* loaded from: classes7.dex */
final class TileGrid2SkeletonViewMapper$mapper$1 extends AbstractC7737t implements Function2<SkeletonVO, d, List<? extends SkeletonVO>> {
    public static final TileGrid2SkeletonViewMapper$mapper$1 INSTANCE = new TileGrid2SkeletonViewMapper$mapper$1();

    TileGrid2SkeletonViewMapper$mapper$1() {
        super(2);
    }

    @Override // kotlin.jvm.functions.Function2
    public final List<SkeletonVO> invoke(SkeletonVO dto, d info) {
        Intrinsics.checkNotNullParameter(dto, "dto");
        Intrinsics.checkNotNullParameter(info, "info");
        return C7714v.a0(dto);
    }
}
