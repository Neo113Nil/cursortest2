package ru.ozon.app.android.commonwidgets.di;

import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.C7705l;
import kotlin.jvm.internal.Intrinsics;
import n20.i;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.composerCommonViewKit.compose.widget.buttonStack.core.ButtonStackConfigKt;
import ru.ozon.android.composerCommonViewKit.compose.widget.commondisclaimerv2.core.CommonDisclaimerV2ConfigKt;
import ru.ozon.android.composerCommonViewKit.compose.widget.commonlayoutgrid.core.CommonLayoutGridConfigKt;
import ru.ozon.android.composerCommonViewKit.compose.widget.commonpromobanner.core.CommonPromoBannerConfigKt;
import ru.ozon.android.composerCommonViewKit.emptyState.statusWidget.StatusWidgetKt;
import ru.ozon.android.composerCommonViewKit.emptyState.v2.EmptyStateWidgetKt;
import ru.ozon.android.composerCommonViewKit.parsing.JsonParser;
import ru.ozon.app.android.common.cellList.v2.core.CellListV2ViewMapper;
import ru.ozon.app.android.common.serviceCarousel.core.ServiceCarouselViewMapper;
import ru.ozon.app.android.commonwidgets.widgets.cellListV2.core.CellListV2Config;
import ru.ozon.app.android.commonwidgets.widgets.error.data.ErrorConfig;
import ru.ozon.app.android.commonwidgets.widgets.error.presentation.ErrorViewMapper;
import ru.ozon.app.android.commonwidgets.widgets.serviceCarousel.data.ServiceCarouselConfig;
import ru.ozon.app.android.composer.widgets.v2.ViewMapper2;
import ru.ozon.app.android.composer.widgets.v2.Widget2;

@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001d\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0001¢\u0006\u0004\b\b\u0010\tJ!\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\n\u0010\u0005\u001a\u00060\u0004j\u0002`\u000bH\u0001¢\u0006\u0004\b\f\u0010\tJE\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001a0\u00062\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0019\u001a\u00020\u0018H\u0001¢\u0006\u0004\b\u001b\u0010\u001c¨\u0006\u001e"}, d2 = {"Lru/ozon/app/android/commonwidgets/di/CommonWidgetsV2DiModule;", "", "<init>", "()V", "Lru/ozon/android/composerCommonViewKit/parsing/JsonParser;", "jsonDeserializer", "", "Ln20/i;", "provideWidgetFactory$widgets_prodGoogleAllVendorsRelease", "(Lru/ozon/android/composerCommonViewKit/parsing/JsonParser;)Ljava/util/Set;", "provideWidgetFactory", "Lru/ozon/app/android/network/serialize/JsonDeserializer;", "provideComposeWidgets$widgets_prodGoogleAllVendorsRelease", "provideComposeWidgets", "Lru/ozon/app/android/commonwidgets/widgets/cellListV2/core/CellListV2Config;", "cellListV2Config", "Lru/ozon/app/android/common/cellList/v2/core/CellListV2ViewMapper;", "cellListV2ViewMapper", "Lru/ozon/app/android/commonwidgets/widgets/error/data/ErrorConfig;", "errorConfig", "Lru/ozon/app/android/commonwidgets/widgets/error/presentation/ErrorViewMapper;", "errorViewMapper", "Lru/ozon/app/android/commonwidgets/widgets/serviceCarousel/data/ServiceCarouselConfig;", "serviceCarouselConfig", "Lru/ozon/app/android/common/serviceCarousel/core/ServiceCarouselViewMapper;", "serviceCarouselViewMapper", "Lru/ozon/app/android/composer/widgets/v2/Widget2;", "provideWidget$widgets_prodGoogleAllVendorsRelease", "(Lru/ozon/app/android/commonwidgets/widgets/cellListV2/core/CellListV2Config;Lru/ozon/app/android/common/cellList/v2/core/CellListV2ViewMapper;Lru/ozon/app/android/commonwidgets/widgets/error/data/ErrorConfig;Lru/ozon/app/android/commonwidgets/widgets/error/presentation/ErrorViewMapper;Lru/ozon/app/android/commonwidgets/widgets/serviceCarousel/data/ServiceCarouselConfig;Lru/ozon/app/android/common/serviceCarousel/core/ServiceCarouselViewMapper;)Ljava/util/Set;", "provideWidget", "widgets_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class CommonWidgetsV2DiModule {

    @NotNull
    public static final CommonWidgetsV2DiModule INSTANCE = new CommonWidgetsV2DiModule();

    private CommonWidgetsV2DiModule() {
    }

    @NotNull
    public final Set<i> provideComposeWidgets$widgets_prodGoogleAllVendorsRelease(@NotNull JsonParser jsonDeserializer) {
        Intrinsics.checkNotNullParameter(jsonDeserializer, "jsonDeserializer");
        i[] elements = {CommonPromoBannerConfigKt.commonPromoBannerWidget(jsonDeserializer, CommonWidgetsV2DiModule$provideComposeWidgets$1.INSTANCE), CommonLayoutGridConfigKt.commonLayoutGridWidget(jsonDeserializer, CommonWidgetsV2DiModule$provideComposeWidgets$2.INSTANCE), CommonDisclaimerV2ConfigKt.commonDisclaimerV2Widget(jsonDeserializer, CommonWidgetsV2DiModule$provideComposeWidgets$3.INSTANCE)};
        Intrinsics.checkNotNullParameter(elements, "elements");
        return C7705l.j0(elements);
    }

    @NotNull
    public final Set<Widget2> provideWidget$widgets_prodGoogleAllVendorsRelease(@NotNull CellListV2Config cellListV2Config, @NotNull CellListV2ViewMapper cellListV2ViewMapper, @NotNull ErrorConfig errorConfig, @NotNull ErrorViewMapper errorViewMapper, @NotNull ServiceCarouselConfig serviceCarouselConfig, @NotNull ServiceCarouselViewMapper serviceCarouselViewMapper) {
        Intrinsics.checkNotNullParameter(cellListV2Config, "cellListV2Config");
        Intrinsics.checkNotNullParameter(cellListV2ViewMapper, "cellListV2ViewMapper");
        Intrinsics.checkNotNullParameter(errorConfig, "errorConfig");
        Intrinsics.checkNotNullParameter(errorViewMapper, "errorViewMapper");
        Intrinsics.checkNotNullParameter(serviceCarouselConfig, "serviceCarouselConfig");
        Intrinsics.checkNotNullParameter(serviceCarouselViewMapper, "serviceCarouselViewMapper");
        Widget2[] elements = {new Widget2("common", "cellList", cellListV2Config, new ViewMapper2[]{cellListV2ViewMapper}), new Widget2("common", "error", errorConfig, new ViewMapper2[]{errorViewMapper}), new Widget2("common", "serviceCarousel", serviceCarouselConfig, new ViewMapper2[]{serviceCarouselViewMapper})};
        Intrinsics.checkNotNullParameter(elements, "elements");
        return C7705l.j0(elements);
    }

    @NotNull
    public final Set<i> provideWidgetFactory$widgets_prodGoogleAllVendorsRelease(@NotNull JsonParser jsonDeserializer) {
        Intrinsics.checkNotNullParameter(jsonDeserializer, "jsonDeserializer");
        i[] elements = {EmptyStateWidgetKt.EmptyStateWidget(CommonWidgetsV2DiModule$provideWidgetFactory$1.INSTANCE, CommonWidgetsV2DiModule$provideWidgetFactory$2.INSTANCE), StatusWidgetKt.StatusWidget(CommonWidgetsV2DiModule$provideWidgetFactory$3.INSTANCE, CommonWidgetsV2DiModule$provideWidgetFactory$4.INSTANCE), ButtonStackConfigKt.commonButtonStackWidget(jsonDeserializer, CommonWidgetsV2DiModule$provideWidgetFactory$5.INSTANCE, CommonWidgetsV2DiModule$provideWidgetFactory$6.INSTANCE)};
        Intrinsics.checkNotNullParameter(elements, "elements");
        return C7705l.j0(elements);
    }
}
