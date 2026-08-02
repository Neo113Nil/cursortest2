package ru.ozon.app.android.storefront.widgets.naviCategories.presentation.empty;

import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C7714v;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import l20.d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.storefront.widgets.naviCategories.data.NaviCategoriesModel;
import ru.ozon.app.android.storefront.widgets.naviCategories.data.PaddingsCalculator;
import ru.ozon.app.android.storefront.widgets.naviCategories.data.RoundedCornerMapperKt;
import ru.ozon.app.android.storefront.widgets.naviCategories.presentation.BlockPositionVO;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\u001e\u0012\u0004\u0012\u00020\u0002\u0012\b\u0012\u00060\u0003j\u0002`\u0004\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00050\u0001B\u0007¢\u0006\u0004\b\u0007\u0010\bJ*\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\t\u001a\u00020\u00022\n\u0010\n\u001a\u00060\u0003j\u0002`\u0004H\u0096\u0002¢\u0006\u0004\b\u000b\u0010\fR\u0014\u0010\u000e\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"Lru/ozon/app/android/storefront/widgets/naviCategories/presentation/empty/EmptyNaviCategoriesMapper;", "Lkotlin/Function2;", "Lru/ozon/app/android/storefront/widgets/naviCategories/data/NaviCategoriesModel$EmptyNaviCategoryModel;", "Ll20/d;", "Lru/ozon/app/android/composer/view/WidgetInfo;", "", "Lru/ozon/app/android/storefront/widgets/naviCategories/presentation/empty/EmptyNaviCategoriesVO;", "<init>", "()V", "model", "info", "invoke", "(Lru/ozon/app/android/storefront/widgets/naviCategories/data/NaviCategoriesModel$EmptyNaviCategoryModel;Ll20/d;)Ljava/util/List;", "Lru/ozon/app/android/storefront/widgets/naviCategories/data/PaddingsCalculator;", "paddingsCalculator", "Lru/ozon/app/android/storefront/widgets/naviCategories/data/PaddingsCalculator;", "storefront_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class EmptyNaviCategoriesMapper implements Function2<NaviCategoriesModel.EmptyNaviCategoryModel, d, List<? extends EmptyNaviCategoriesVO>> {

    @NotNull
    private final PaddingsCalculator paddingsCalculator = new PaddingsCalculator(false);

    @Override // kotlin.jvm.functions.Function2
    @NotNull
    public List<EmptyNaviCategoriesVO> invoke(@NotNull NaviCategoriesModel.EmptyNaviCategoryModel model, @NotNull d info) {
        Intrinsics.checkNotNullParameter(model, "model");
        Intrinsics.checkNotNullParameter(info, "info");
        String d11 = info.d();
        BlockPositionVO position = model.getPosition();
        return C7714v.a0(new EmptyNaviCategoriesVO((d11 + "_emptyNaviCategory_" + position).hashCode(), RoundedCornerMapperKt.getRoundedCorners(model), this.paddingsCalculator.calculatePaddings(model.getPosition())));
    }
}
