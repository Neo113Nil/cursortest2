package ru.ozon.app.android.fresh.unsorted.widgets.freshTileGrid.presentation;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.fresh.common.flags.FreshTilesRefactoring;
import ru.ozon.app.android.fresh.common.widgets.molecules.freshTile.FreshTileType;
import ru.ozon.app.android.fresh.common.widgets.molecules.freshTile.presentation.FreshTileVO;
import ru.ozon.app.android.fresh.common.widgets.molecules.freshTile.presentation.FreshTileView;
import ru.ozon.app.android.fresh.common.widgets.molecules.freshTile.presentation.FreshTileViewV2;
import ru.ozon.composer.ui.widget.h;

@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\b\u001a\u00020\u00072\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lru/ozon/app/android/fresh/unsorted/widgets/freshTileGrid/presentation/FreshTileGridMiniViewMapper;", "Lru/ozon/app/android/fresh/unsorted/widgets/freshTileGrid/presentation/FreshTileGridBaseViewMapper;", "<init>", "()V", "Lru/ozon/app/android/fresh/common/widgets/molecules/freshTile/presentation/FreshTileVO;", "state", "item", "Lru/ozon/composer/ui/widget/h$c;", "getWidgetSpan", "(Lru/ozon/app/android/fresh/common/widgets/molecules/freshTile/presentation/FreshTileVO;Lru/ozon/app/android/fresh/common/widgets/molecules/freshTile/presentation/FreshTileVO;)Lru/ozon/composer/ui/widget/h$c;", "Landroid/view/ViewGroup;", "parent", "Landroid/view/View;", "createView", "(Landroid/view/ViewGroup;)Landroid/view/View;", "widgets-unsorted_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class FreshTileGridMiniViewMapper extends FreshTileGridBaseViewMapper {
    @Override // ru.ozon.app.android.fresh.unsorted.widgets.freshTileGrid.presentation.FreshTileGridBaseViewMapper, ru.ozon.composer.ui.widget.g
    @NotNull
    public View createView(@NotNull ViewGroup parent) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        if (component().getFeatureChecker().isEnabled(FreshTilesRefactoring.INSTANCE)) {
            FreshTileViewV2.Companion companion = FreshTileViewV2.INSTANCE;
            Context context = parent.getContext();
            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
            return FreshTileViewV2.Companion.createVertical$default(companion, context, null, FreshTileType.MINI, "freshGridMiniTile", 2, null);
        }
        FreshTileView.Companion companion2 = FreshTileView.INSTANCE;
        Context context2 = parent.getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
        return FreshTileView.Companion.createVertical$default(companion2, context2, null, null, FreshTileType.MINI, "freshGridMiniTile", 6, null);
    }

    @Override // ru.ozon.app.android.composer.widgets.base.WidgetViewMapper, ru.ozon.composer.ui.widget.g, ru.ozon.composer.ui.widget.e
    @NotNull
    public h.c getWidgetSpan(@NotNull FreshTileVO state, @NotNull FreshTileVO item) {
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(item, "item");
        return h.c.f94871b;
    }
}
