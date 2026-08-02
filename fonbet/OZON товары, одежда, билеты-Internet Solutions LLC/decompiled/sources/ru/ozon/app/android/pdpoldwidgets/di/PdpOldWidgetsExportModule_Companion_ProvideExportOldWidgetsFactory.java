package ru.ozon.app.android.pdpoldwidgets.di;

import Jb.e;
import Jb.j;
import java.util.Set;
import ru.ozon.app.android.composer.di.Widget;
import ru.ozon.app.android.pdpoldwidgets.widgets.comparison.ComparisonConfig;
import ru.ozon.app.android.pdpoldwidgets.widgets.comparison.core.carousel.ui.ComparisonCarouselViewMapper;
import ru.ozon.app.android.pdpoldwidgets.widgets.comparison.core.characteristics.ComparisonCharacteristicsGroupViewMapper;
import ru.ozon.app.android.pdpoldwidgets.widgets.comparison.core.characteristics.ComparisonCharacteristicsPickViewMapper;
import ru.ozon.app.android.pdpoldwidgets.widgets.comparison.core.characteristics.ComparisonJustDifferencesViewMapper;
import ru.ozon.app.android.pdpoldwidgets.widgets.comparison.core.characteristics.ComparisonKeyCharacteristicsViewMapper;
import ru.ozon.app.android.pdpoldwidgets.widgets.crosslink.core.CrosslinkConfig;
import ru.ozon.app.android.pdpoldwidgets.widgets.crosslink.core.CrosslinkViewMapper;
import ru.ozon.app.android.pdpoldwidgets.widgets.galleryV2.core.GalleryV2Config;
import ru.ozon.app.android.pdpoldwidgets.widgets.galleryV2.core.GalleryV2ViewMapper;
import ru.ozon.app.android.pdpoldwidgets.widgets.namedValueList.core.NamedValueListConfig;
import ru.ozon.app.android.pdpoldwidgets.widgets.namedValueList.core.cell.NamedValueListCellViewMapper;
import ru.ozon.app.android.pdpoldwidgets.widgets.namedValueList.core.header.NamedValueListHeaderViewMapper;
import ru.ozon.app.android.pdpoldwidgets.widgets.textBlock.core.TextBlockConfig;
import ru.ozon.app.android.pdpoldwidgets.widgets.textBlock.core.TextBlockViewMapper;
import ru.ozon.app.android.pdpoldwidgets.widgets.trustFactor.core.TrustFactorConfig;
import ru.ozon.app.android.pdpoldwidgets.widgets.trustFactor.core.TrustFactorViewMapper;
import ru.ozon.app.android.pdpoldwidgets.widgets.videoConsultationBanner.core.VideoConsultationBannerConfig;
import ru.ozon.app.android.pdpoldwidgets.widgets.videoConsultationBanner.core.VideoConsultationBannerViewMapper;

/* loaded from: classes7.dex */
public final class PdpOldWidgetsExportModule_Companion_ProvideExportOldWidgetsFactory implements e<Set<Widget>> {
    public static Set<Widget> provideExportOldWidgets(ComparisonConfig comparisonConfig, ComparisonCarouselViewMapper comparisonCarouselViewMapper, ComparisonJustDifferencesViewMapper comparisonJustDifferencesViewMapper, ComparisonCharacteristicsPickViewMapper comparisonCharacteristicsPickViewMapper, ComparisonKeyCharacteristicsViewMapper comparisonKeyCharacteristicsViewMapper, ComparisonCharacteristicsGroupViewMapper comparisonCharacteristicsGroupViewMapper, CrosslinkConfig crosslinkConfig, CrosslinkViewMapper crosslinkViewMapper, GalleryV2ViewMapper galleryV2ViewMapper, GalleryV2Config galleryV2Config, NamedValueListConfig namedValueListConfig, NamedValueListHeaderViewMapper namedValueListHeaderViewMapper, NamedValueListCellViewMapper namedValueListCellViewMapper, TextBlockConfig textBlockConfig, TextBlockViewMapper textBlockViewMapper, VideoConsultationBannerConfig videoConsultationBannerConfig, VideoConsultationBannerViewMapper videoConsultationBannerViewMapper, TrustFactorConfig trustFactorConfig, TrustFactorViewMapper trustFactorViewMapper) {
        Set<Widget> provideExportOldWidgets = PdpOldWidgetsExportModule.INSTANCE.provideExportOldWidgets(comparisonConfig, comparisonCarouselViewMapper, comparisonJustDifferencesViewMapper, comparisonCharacteristicsPickViewMapper, comparisonKeyCharacteristicsViewMapper, comparisonCharacteristicsGroupViewMapper, crosslinkConfig, crosslinkViewMapper, galleryV2ViewMapper, galleryV2Config, namedValueListConfig, namedValueListHeaderViewMapper, namedValueListCellViewMapper, textBlockConfig, textBlockViewMapper, videoConsultationBannerConfig, videoConsultationBannerViewMapper, trustFactorConfig, trustFactorViewMapper);
        j.d(provideExportOldWidgets);
        return provideExportOldWidgets;
    }
}
