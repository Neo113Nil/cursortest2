package ru.ozon.app.android.pdpoldwidgets.di;

import I00.d;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.C7705l;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.composer.di.Widget;
import ru.ozon.app.android.composer.widgets.base.WidgetViewMapper;
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

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b'\u0018\u0000 \u00022\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lru/ozon/app/android/pdpoldwidgets/di/PdpOldWidgetsExportModule;", "", "Companion", "pdp-old-widgets_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public abstract class PdpOldWidgetsExportModule {

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @Metadata(d1 = {"\u0000\u0088\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J¦\u0001\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020\"2\u0006\u0010#\u001a\u00020$2\u0006\u0010%\u001a\u00020&2\u0006\u0010'\u001a\u00020(2\u0006\u0010)\u001a\u00020*2\u0006\u0010+\u001a\u00020,H\u0007¨\u0006-"}, d2 = {"Lru/ozon/app/android/pdpoldwidgets/di/PdpOldWidgetsExportModule$Companion;", "", "<init>", "()V", "provideExportOldWidgets", "", "Lru/ozon/app/android/composer/di/Widget;", "comparisonConfig", "Lru/ozon/app/android/pdpoldwidgets/widgets/comparison/ComparisonConfig;", "comparisonViewMapper", "Lru/ozon/app/android/pdpoldwidgets/widgets/comparison/core/carousel/ui/ComparisonCarouselViewMapper;", "comparisonJustDifferencesViewMapper", "Lru/ozon/app/android/pdpoldwidgets/widgets/comparison/core/characteristics/ComparisonJustDifferencesViewMapper;", "comparisonCharacteristicsPickViewMapper", "Lru/ozon/app/android/pdpoldwidgets/widgets/comparison/core/characteristics/ComparisonCharacteristicsPickViewMapper;", "comparisonKeyCharacteristicsViewMapper", "Lru/ozon/app/android/pdpoldwidgets/widgets/comparison/core/characteristics/ComparisonKeyCharacteristicsViewMapper;", "comparisonCharacteristicsGroupViewMapper", "Lru/ozon/app/android/pdpoldwidgets/widgets/comparison/core/characteristics/ComparisonCharacteristicsGroupViewMapper;", "crosslinkConfig", "Lru/ozon/app/android/pdpoldwidgets/widgets/crosslink/core/CrosslinkConfig;", "crosslinkViewMapper", "Lru/ozon/app/android/pdpoldwidgets/widgets/crosslink/core/CrosslinkViewMapper;", "galleryV2ViewMapper", "Lru/ozon/app/android/pdpoldwidgets/widgets/galleryV2/core/GalleryV2ViewMapper;", "galleryV2Config", "Lru/ozon/app/android/pdpoldwidgets/widgets/galleryV2/core/GalleryV2Config;", "namedValueListConfig", "Lru/ozon/app/android/pdpoldwidgets/widgets/namedValueList/core/NamedValueListConfig;", "namedValueListHeaderViewMapper", "Lru/ozon/app/android/pdpoldwidgets/widgets/namedValueList/core/header/NamedValueListHeaderViewMapper;", "namedValueListCellViewMapper", "Lru/ozon/app/android/pdpoldwidgets/widgets/namedValueList/core/cell/NamedValueListCellViewMapper;", "textBlockConfig", "Lru/ozon/app/android/pdpoldwidgets/widgets/textBlock/core/TextBlockConfig;", "textBlockMapper", "Lru/ozon/app/android/pdpoldwidgets/widgets/textBlock/core/TextBlockViewMapper;", "videoConsultationBannerConfig", "Lru/ozon/app/android/pdpoldwidgets/widgets/videoConsultationBanner/core/VideoConsultationBannerConfig;", "videoConsultationBannerViewMapper", "Lru/ozon/app/android/pdpoldwidgets/widgets/videoConsultationBanner/core/VideoConsultationBannerViewMapper;", "trustFactorConfig", "Lru/ozon/app/android/pdpoldwidgets/widgets/trustFactor/core/TrustFactorConfig;", "trustFactorViewMapper", "Lru/ozon/app/android/pdpoldwidgets/widgets/trustFactor/core/TrustFactorViewMapper;", "pdp-old-widgets_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final Set<Widget> provideExportOldWidgets(@NotNull ComparisonConfig comparisonConfig, @NotNull ComparisonCarouselViewMapper comparisonViewMapper, @NotNull ComparisonJustDifferencesViewMapper comparisonJustDifferencesViewMapper, @NotNull ComparisonCharacteristicsPickViewMapper comparisonCharacteristicsPickViewMapper, @NotNull ComparisonKeyCharacteristicsViewMapper comparisonKeyCharacteristicsViewMapper, @NotNull ComparisonCharacteristicsGroupViewMapper comparisonCharacteristicsGroupViewMapper, @NotNull CrosslinkConfig crosslinkConfig, @NotNull CrosslinkViewMapper crosslinkViewMapper, @NotNull GalleryV2ViewMapper galleryV2ViewMapper, @NotNull GalleryV2Config galleryV2Config, @NotNull NamedValueListConfig namedValueListConfig, @NotNull NamedValueListHeaderViewMapper namedValueListHeaderViewMapper, @NotNull NamedValueListCellViewMapper namedValueListCellViewMapper, @NotNull TextBlockConfig textBlockConfig, @NotNull TextBlockViewMapper textBlockMapper, @NotNull VideoConsultationBannerConfig videoConsultationBannerConfig, @NotNull VideoConsultationBannerViewMapper videoConsultationBannerViewMapper, @NotNull TrustFactorConfig trustFactorConfig, @NotNull TrustFactorViewMapper trustFactorViewMapper) {
            Intrinsics.checkNotNullParameter(comparisonConfig, "comparisonConfig");
            Intrinsics.checkNotNullParameter(comparisonViewMapper, "comparisonViewMapper");
            Intrinsics.checkNotNullParameter(comparisonJustDifferencesViewMapper, "comparisonJustDifferencesViewMapper");
            Intrinsics.checkNotNullParameter(comparisonCharacteristicsPickViewMapper, "comparisonCharacteristicsPickViewMapper");
            Intrinsics.checkNotNullParameter(comparisonKeyCharacteristicsViewMapper, "comparisonKeyCharacteristicsViewMapper");
            Intrinsics.checkNotNullParameter(comparisonCharacteristicsGroupViewMapper, "comparisonCharacteristicsGroupViewMapper");
            Intrinsics.checkNotNullParameter(crosslinkConfig, "crosslinkConfig");
            Intrinsics.checkNotNullParameter(crosslinkViewMapper, "crosslinkViewMapper");
            Intrinsics.checkNotNullParameter(galleryV2ViewMapper, "galleryV2ViewMapper");
            Intrinsics.checkNotNullParameter(galleryV2Config, "galleryV2Config");
            Intrinsics.checkNotNullParameter(namedValueListConfig, "namedValueListConfig");
            Intrinsics.checkNotNullParameter(namedValueListHeaderViewMapper, "namedValueListHeaderViewMapper");
            Intrinsics.checkNotNullParameter(namedValueListCellViewMapper, "namedValueListCellViewMapper");
            Intrinsics.checkNotNullParameter(textBlockConfig, "textBlockConfig");
            Intrinsics.checkNotNullParameter(textBlockMapper, "textBlockMapper");
            Intrinsics.checkNotNullParameter(videoConsultationBannerConfig, "videoConsultationBannerConfig");
            Intrinsics.checkNotNullParameter(videoConsultationBannerViewMapper, "videoConsultationBannerViewMapper");
            Intrinsics.checkNotNullParameter(trustFactorConfig, "trustFactorConfig");
            Intrinsics.checkNotNullParameter(trustFactorViewMapper, "trustFactorViewMapper");
            Widget[] elements = {new Widget("pdp", "comparisonProducts", comparisonConfig, new d[]{comparisonViewMapper, comparisonJustDifferencesViewMapper, comparisonCharacteristicsPickViewMapper, comparisonKeyCharacteristicsViewMapper, comparisonCharacteristicsGroupViewMapper}), new Widget("pdp", "crosslink", crosslinkConfig, new CrosslinkViewMapper[]{crosslinkViewMapper}), new Widget("pdp", "gallery", galleryV2Config, new GalleryV2ViewMapper[]{galleryV2ViewMapper}), new Widget("pdp", "namedValueList", namedValueListConfig, new WidgetViewMapper[]{namedValueListHeaderViewMapper, namedValueListCellViewMapper}), new Widget("pdp", "textBlock", textBlockConfig, new TextBlockViewMapper[]{textBlockMapper}), new Widget("pdp", "videoConsultationBanner", videoConsultationBannerConfig, new VideoConsultationBannerViewMapper[]{videoConsultationBannerViewMapper}), new Widget("pdp", "trustFactor", trustFactorConfig, new TrustFactorViewMapper[]{trustFactorViewMapper})};
            Intrinsics.checkNotNullParameter(elements, "elements");
            return C7705l.j0(elements);
        }

        private Companion() {
        }
    }
}
