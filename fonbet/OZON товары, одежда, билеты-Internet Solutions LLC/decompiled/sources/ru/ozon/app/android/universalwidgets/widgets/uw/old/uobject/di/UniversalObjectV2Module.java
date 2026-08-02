package ru.ozon.app.android.universalwidgets.widgets.uw.old.uobject.di;

import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.e0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.common.header.core.HeaderViewMapper2;
import ru.ozon.app.android.composer.widgets.v2.ViewMapper2;
import ru.ozon.app.android.composer.widgets.v2.Widget2;
import ru.ozon.app.android.universalwidgets.widgets.uw.old.uobject.core.UniversalObjectConfig;
import ru.ozon.app.android.universalwidgets.widgets.uw.old.uobject.footer.UniversalWidgetFooterViewMapper;
import ru.ozon.app.android.universalwidgets.widgets.uw.old.uobject.grid.core.UniversalObjectGrid2ViewMapper;
import ru.ozon.app.android.universalwidgets.widgets.uw.old.uobject.grid.grid3.core.UniversalGrid3TextInsideItemViewMapper;
import ru.ozon.app.android.universalwidgets.widgets.uw.old.uobject.grid.grid3.core.UniversalGrid3TextOutsideItemViewMapper;
import ru.ozon.app.android.universalwidgets.widgets.uw.old.uobject.gridone.UniversalObjectGridOneBannerViewMapper;
import ru.ozon.app.android.universalwidgets.widgets.uw.old.uobject.gridone.UniversalObjectGridOneViewMapper;
import ru.ozon.app.android.universalwidgets.widgets.uw.old.uobject.gridone.singleitem.UniversalObjectGridOneSingleItemBannerViewMapper;
import ru.ozon.app.android.universalwidgets.widgets.uw.old.uobject.gridone.singleitem.UniversalObjectGridOneSingleItemViewMapper;
import ru.ozon.app.android.universalwidgets.widgets.uw.old.uobject.header.UniversalWidgetHeaderViewMapper;
import ru.ozon.app.android.universalwidgets.widgets.uw.old.uobject.navi.UniversalObjectNaviViewMapper;

@Metadata(d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003Jn\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u001eH\u0007¨\u0006\u001f"}, d2 = {"Lru/ozon/app/android/universalwidgets/widgets/uw/old/uobject/di/UniversalObjectV2Module;", "", "<init>", "()V", "provideWidgets", "", "Lru/ozon/app/android/composer/widgets/v2/Widget2;", "universalObjectConfig", "Lru/ozon/app/android/universalwidgets/widgets/uw/old/uobject/core/UniversalObjectConfig;", "universalWidgetHeaderViewMapper", "Lru/ozon/app/android/universalwidgets/widgets/uw/old/uobject/header/UniversalWidgetHeaderViewMapper;", "headerViewMapper", "Lru/ozon/app/android/common/header/core/HeaderViewMapper2;", "universalObjectGrid2ViewMapper", "Lru/ozon/app/android/universalwidgets/widgets/uw/old/uobject/grid/core/UniversalObjectGrid2ViewMapper;", "universalGrid3TextOutsideItemViewMapper", "Lru/ozon/app/android/universalwidgets/widgets/uw/old/uobject/grid/grid3/core/UniversalGrid3TextOutsideItemViewMapper;", "universalGrid3TextInsideItemViewMapper", "Lru/ozon/app/android/universalwidgets/widgets/uw/old/uobject/grid/grid3/core/UniversalGrid3TextInsideItemViewMapper;", "universalObjectGridOneViewMapper", "Lru/ozon/app/android/universalwidgets/widgets/uw/old/uobject/gridone/UniversalObjectGridOneViewMapper;", "universalObjectGridOneBannerViewMapper", "Lru/ozon/app/android/universalwidgets/widgets/uw/old/uobject/gridone/UniversalObjectGridOneBannerViewMapper;", "universalObjectGridOneSingleItemBannerViewMapper", "Lru/ozon/app/android/universalwidgets/widgets/uw/old/uobject/gridone/singleitem/UniversalObjectGridOneSingleItemBannerViewMapper;", "universalObjectGridOneSingleItemViewMapper", "Lru/ozon/app/android/universalwidgets/widgets/uw/old/uobject/gridone/singleitem/UniversalObjectGridOneSingleItemViewMapper;", "universalObjectNaviViewMapper", "Lru/ozon/app/android/universalwidgets/widgets/uw/old/uobject/navi/UniversalObjectNaviViewMapper;", "universalWidgetFooterViewMapper", "Lru/ozon/app/android/universalwidgets/widgets/uw/old/uobject/footer/UniversalWidgetFooterViewMapper;", "universalwidgets_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class UniversalObjectV2Module {
    @NotNull
    public final Set<Widget2> provideWidgets(@NotNull UniversalObjectConfig universalObjectConfig, @NotNull UniversalWidgetHeaderViewMapper universalWidgetHeaderViewMapper, @NotNull HeaderViewMapper2 headerViewMapper, @NotNull UniversalObjectGrid2ViewMapper universalObjectGrid2ViewMapper, @NotNull UniversalGrid3TextOutsideItemViewMapper universalGrid3TextOutsideItemViewMapper, @NotNull UniversalGrid3TextInsideItemViewMapper universalGrid3TextInsideItemViewMapper, @NotNull UniversalObjectGridOneViewMapper universalObjectGridOneViewMapper, @NotNull UniversalObjectGridOneBannerViewMapper universalObjectGridOneBannerViewMapper, @NotNull UniversalObjectGridOneSingleItemBannerViewMapper universalObjectGridOneSingleItemBannerViewMapper, @NotNull UniversalObjectGridOneSingleItemViewMapper universalObjectGridOneSingleItemViewMapper, @NotNull UniversalObjectNaviViewMapper universalObjectNaviViewMapper, @NotNull UniversalWidgetFooterViewMapper universalWidgetFooterViewMapper) {
        Intrinsics.checkNotNullParameter(universalObjectConfig, "universalObjectConfig");
        Intrinsics.checkNotNullParameter(universalWidgetHeaderViewMapper, "universalWidgetHeaderViewMapper");
        Intrinsics.checkNotNullParameter(headerViewMapper, "headerViewMapper");
        Intrinsics.checkNotNullParameter(universalObjectGrid2ViewMapper, "universalObjectGrid2ViewMapper");
        Intrinsics.checkNotNullParameter(universalGrid3TextOutsideItemViewMapper, "universalGrid3TextOutsideItemViewMapper");
        Intrinsics.checkNotNullParameter(universalGrid3TextInsideItemViewMapper, "universalGrid3TextInsideItemViewMapper");
        Intrinsics.checkNotNullParameter(universalObjectGridOneViewMapper, "universalObjectGridOneViewMapper");
        Intrinsics.checkNotNullParameter(universalObjectGridOneBannerViewMapper, "universalObjectGridOneBannerViewMapper");
        Intrinsics.checkNotNullParameter(universalObjectGridOneSingleItemBannerViewMapper, "universalObjectGridOneSingleItemBannerViewMapper");
        Intrinsics.checkNotNullParameter(universalObjectGridOneSingleItemViewMapper, "universalObjectGridOneSingleItemViewMapper");
        Intrinsics.checkNotNullParameter(universalObjectNaviViewMapper, "universalObjectNaviViewMapper");
        Intrinsics.checkNotNullParameter(universalWidgetFooterViewMapper, "universalWidgetFooterViewMapper");
        return e0.h(new Widget2("cms", "uWidgetObject", universalObjectConfig, new ViewMapper2[]{headerViewMapper, universalWidgetHeaderViewMapper, universalObjectGrid2ViewMapper, universalGrid3TextOutsideItemViewMapper, universalGrid3TextInsideItemViewMapper, universalObjectGridOneViewMapper, universalObjectGridOneBannerViewMapper, universalObjectGridOneSingleItemBannerViewMapper, universalObjectGridOneSingleItemViewMapper, universalObjectNaviViewMapper, universalWidgetFooterViewMapper}));
    }
}
