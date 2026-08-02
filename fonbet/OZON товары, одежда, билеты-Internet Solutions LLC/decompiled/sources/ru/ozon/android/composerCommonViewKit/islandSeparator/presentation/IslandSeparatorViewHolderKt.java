package ru.ozon.android.composerCommonViewKit.islandSeparator.presentation;

import android.content.Context;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.composerCommonViewKit.islandSeparator.presentation.IslandSeparatorView;
import ru.ozon.uni.android.uikit.common.StyleParser;

@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\u0016\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\b\u0010\u0003\u001a\u0004\u0018\u00010\u0004H\u0000¨\u0006\u0005"}, d2 = {"bind", "", "Lru/ozon/android/composerCommonViewKit/islandSeparator/presentation/IslandSeparatorView;", "item", "Lru/ozon/android/composerCommonViewKit/islandSeparator/presentation/IslandSeparatorVO;", "common-view-kit_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class IslandSeparatorViewHolderKt {
    public static final void bind(@NotNull IslandSeparatorView islandSeparatorView, IslandSeparatorVO islandSeparatorVO) {
        Intrinsics.checkNotNullParameter(islandSeparatorView, "<this>");
        if (islandSeparatorVO == null) {
            islandSeparatorView.setVisibility(8);
            return;
        }
        islandSeparatorView.setVisibility(0);
        int physicalPartHeight = islandSeparatorVO.getPhysicalPartHeight();
        StyleParser styleParser = StyleParser.INSTANCE;
        Context context = islandSeparatorView.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        islandSeparatorView.setViewState(new IslandSeparatorView.ViewState(islandSeparatorVO.getHasTopCorners(), islandSeparatorVO.getHasBottomCorners(), physicalPartHeight, styleParser.parseColor(context, islandSeparatorVO.getBackgroundColor(), StyleParser.OzColor.OZ_SEMANTIC_COLOR_BG_PRIMARY)));
    }
}
