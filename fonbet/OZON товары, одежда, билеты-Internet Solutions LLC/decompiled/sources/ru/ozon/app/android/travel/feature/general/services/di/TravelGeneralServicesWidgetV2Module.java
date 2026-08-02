package ru.ozon.app.android.travel.feature.general.services.di;

import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.C7705l;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.composer.widgets.v2.ViewMapper2;
import ru.ozon.app.android.composer.widgets.v2.Widget2;
import ru.ozon.app.android.travel.feature.general.services.widgets.additionalReturnServiceCell.v1.data.AdditionalReturnServiceCellConfig;
import ru.ozon.app.android.travel.feature.general.services.widgets.additionalReturnServiceCell.v1.presentation.AdditionalReturnServiceCellViewMapper;
import ru.ozon.app.android.travel.feature.general.services.widgets.additionalServiceCell.data.AdditionalServiceCellConfig;
import ru.ozon.app.android.travel.feature.general.services.widgets.additionalServiceCell.presentation.AdditionalServiceCellViewMapper;
import ru.ozon.app.android.travel.feature.general.services.widgets.additionalServicesOffer.data.AdditionalServicesOfferConfig;
import ru.ozon.app.android.travel.feature.general.services.widgets.additionalServicesOffer.data.AdditionalServicesOfferShadedConfig;
import ru.ozon.app.android.travel.feature.general.services.widgets.additionalServicesOffer.presentation.AdditionalServicesOfferViewMapper;
import ru.ozon.app.android.travel.feature.general.services.widgets.additionalServicesTotal.data.AdditionalServicesTotalConfig;
import ru.ozon.app.android.travel.feature.general.services.widgets.additionalServicesTotal.data.AdditionalServicesTotalShadedConfig;
import ru.ozon.app.android.travel.feature.general.services.widgets.additionalServicesTotal.presentation.AdditionalServicesTotalViewMapper;
import ru.ozon.app.android.travel.feature.general.services.widgets.hiddenQueryServicesManager.data.HiddenQueryServicesManagerConfig;
import ru.ozon.app.android.travel.feature.general.services.widgets.hiddenQueryServicesManager.presentation.HiddenQueryServicesManagerViewMapper;
import ru.ozon.app.android.travel.feature.general.services.widgets.infoPopup.v1.data.InfoPopupConfig;
import ru.ozon.app.android.travel.feature.general.services.widgets.infoPopup.v1.presentation.InfoPopupViewMapper;
import ru.ozon.app.android.travel.feature.general.services.widgets.infoPopup.v2.data.InfoPopupV2Config;
import ru.ozon.app.android.travel.feature.general.services.widgets.infoPopup.v2.presentation.InfoPopupV2ViewMapper;
import ru.ozon.app.android.travel.feature.general.services.widgets.infoPopup.v4.data.InfoPopupV4Config;
import ru.ozon.app.android.travel.feature.general.services.widgets.infoPopup.v4.presentation.InfoPopupV4ViewMapper;
import ru.ozon.app.android.travel.feature.general.services.widgets.infoPopup.v4.presentation.sticky.InfoPopupV4StickyViewMapper;
import ru.ozon.app.android.travel.feature.general.services.widgets.serviceBlock.data.ServiceBlockConfig;
import ru.ozon.app.android.travel.feature.general.services.widgets.serviceBlock.data.ServiceBlockShadedConfig;
import ru.ozon.app.android.travel.feature.general.services.widgets.serviceBlock.presentation.ServiceBlockViewMapper;
import ru.ozon.app.android.travel.feature.general.services.widgets.textInfoCells.data.TextInfoCellsConfig;
import ru.ozon.app.android.travel.feature.general.services.widgets.textInfoCells.presentation.TextInfoCellsViewMapper;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b'\u0018\u0000 \u00022\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lru/ozon/app/android/travel/feature/general/services/di/TravelGeneralServicesWidgetV2Module;", "", "Companion", "services_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public abstract class TravelGeneralServicesWidgetV2Module {

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @Metadata(d1 = {"\u0000¨\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003JÓ\u0001\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020\"2\u0006\u0010#\u001a\u00020$2\u0006\u0010%\u001a\u00020&2\u0006\u0010'\u001a\u00020(2\u0006\u0010)\u001a\u00020*2\u0006\u0010+\u001a\u00020,2\u0006\u0010-\u001a\u00020.2\u0006\u0010/\u001a\u0002002\u0006\u00101\u001a\u0002022\u0006\u00103\u001a\u0002042\u0006\u00105\u001a\u000206H\u0001¢\u0006\u0002\b7¨\u00068"}, d2 = {"Lru/ozon/app/android/travel/feature/general/services/di/TravelGeneralServicesWidgetV2Module$Companion;", "", "<init>", "()V", "provideWidgets", "", "Lru/ozon/app/android/composer/widgets/v2/Widget2;", "additionalReturnServiceCellConfig", "Lru/ozon/app/android/travel/feature/general/services/widgets/additionalReturnServiceCell/v1/data/AdditionalReturnServiceCellConfig;", "additionalReturnServiceCellViewMapper", "Lru/ozon/app/android/travel/feature/general/services/widgets/additionalReturnServiceCell/v1/presentation/AdditionalReturnServiceCellViewMapper;", "additionalServiceCellConfig", "Lru/ozon/app/android/travel/feature/general/services/widgets/additionalServiceCell/data/AdditionalServiceCellConfig;", "additionalServiceCellViewMapper", "Lru/ozon/app/android/travel/feature/general/services/widgets/additionalServiceCell/presentation/AdditionalServiceCellViewMapper;", "additionalServicesOfferConfig", "Lru/ozon/app/android/travel/feature/general/services/widgets/additionalServicesOffer/data/AdditionalServicesOfferConfig;", "additionalServicesOfferShadedConfig", "Lru/ozon/app/android/travel/feature/general/services/widgets/additionalServicesOffer/data/AdditionalServicesOfferShadedConfig;", "additionalServicesOfferViewMapper", "Lru/ozon/app/android/travel/feature/general/services/widgets/additionalServicesOffer/presentation/AdditionalServicesOfferViewMapper;", "additionalServicesTotalConfig", "Lru/ozon/app/android/travel/feature/general/services/widgets/additionalServicesTotal/data/AdditionalServicesTotalConfig;", "additionalServicesTotalShadedConfig", "Lru/ozon/app/android/travel/feature/general/services/widgets/additionalServicesTotal/data/AdditionalServicesTotalShadedConfig;", "additionalServicesTotalViewMapper", "Lru/ozon/app/android/travel/feature/general/services/widgets/additionalServicesTotal/presentation/AdditionalServicesTotalViewMapper;", "hiddenQueryServicesManagerConfig", "Lru/ozon/app/android/travel/feature/general/services/widgets/hiddenQueryServicesManager/data/HiddenQueryServicesManagerConfig;", "hiddenQueryServicesManagerViewMapper", "Lru/ozon/app/android/travel/feature/general/services/widgets/hiddenQueryServicesManager/presentation/HiddenQueryServicesManagerViewMapper;", "infoPopupConfig", "Lru/ozon/app/android/travel/feature/general/services/widgets/infoPopup/v1/data/InfoPopupConfig;", "infoPopupViewMapper", "Lru/ozon/app/android/travel/feature/general/services/widgets/infoPopup/v1/presentation/InfoPopupViewMapper;", "infoPopupV2Config", "Lru/ozon/app/android/travel/feature/general/services/widgets/infoPopup/v2/data/InfoPopupV2Config;", "infoPopupV2ViewMapper", "Lru/ozon/app/android/travel/feature/general/services/widgets/infoPopup/v2/presentation/InfoPopupV2ViewMapper;", "infoPopupV4Config", "Lru/ozon/app/android/travel/feature/general/services/widgets/infoPopup/v4/data/InfoPopupV4Config;", "infoPopupV4ViewMapper", "Lru/ozon/app/android/travel/feature/general/services/widgets/infoPopup/v4/presentation/InfoPopupV4ViewMapper;", "infoPopupV4StickyViewMapper", "Lru/ozon/app/android/travel/feature/general/services/widgets/infoPopup/v4/presentation/sticky/InfoPopupV4StickyViewMapper;", "serviceBlockConfig", "Lru/ozon/app/android/travel/feature/general/services/widgets/serviceBlock/data/ServiceBlockConfig;", "serviceBlockShadedConfig", "Lru/ozon/app/android/travel/feature/general/services/widgets/serviceBlock/data/ServiceBlockShadedConfig;", "serviceBlockViewMapper", "Lru/ozon/app/android/travel/feature/general/services/widgets/serviceBlock/presentation/ServiceBlockViewMapper;", "textInfoCellsViewMapper", "Lru/ozon/app/android/travel/feature/general/services/widgets/textInfoCells/presentation/TextInfoCellsViewMapper;", "textInfoCellsConfig", "Lru/ozon/app/android/travel/feature/general/services/widgets/textInfoCells/data/TextInfoCellsConfig;", "provideWidgets$services_prodGoogleAllVendorsRelease", "services_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final Set<Widget2> provideWidgets$services_prodGoogleAllVendorsRelease(@NotNull AdditionalReturnServiceCellConfig additionalReturnServiceCellConfig, @NotNull AdditionalReturnServiceCellViewMapper additionalReturnServiceCellViewMapper, @NotNull AdditionalServiceCellConfig additionalServiceCellConfig, @NotNull AdditionalServiceCellViewMapper additionalServiceCellViewMapper, @NotNull AdditionalServicesOfferConfig additionalServicesOfferConfig, @NotNull AdditionalServicesOfferShadedConfig additionalServicesOfferShadedConfig, @NotNull AdditionalServicesOfferViewMapper additionalServicesOfferViewMapper, @NotNull AdditionalServicesTotalConfig additionalServicesTotalConfig, @NotNull AdditionalServicesTotalShadedConfig additionalServicesTotalShadedConfig, @NotNull AdditionalServicesTotalViewMapper additionalServicesTotalViewMapper, @NotNull HiddenQueryServicesManagerConfig hiddenQueryServicesManagerConfig, @NotNull HiddenQueryServicesManagerViewMapper hiddenQueryServicesManagerViewMapper, @NotNull InfoPopupConfig infoPopupConfig, @NotNull InfoPopupViewMapper infoPopupViewMapper, @NotNull InfoPopupV2Config infoPopupV2Config, @NotNull InfoPopupV2ViewMapper infoPopupV2ViewMapper, @NotNull InfoPopupV4Config infoPopupV4Config, @NotNull InfoPopupV4ViewMapper infoPopupV4ViewMapper, @NotNull InfoPopupV4StickyViewMapper infoPopupV4StickyViewMapper, @NotNull ServiceBlockConfig serviceBlockConfig, @NotNull ServiceBlockShadedConfig serviceBlockShadedConfig, @NotNull ServiceBlockViewMapper serviceBlockViewMapper, @NotNull TextInfoCellsViewMapper textInfoCellsViewMapper, @NotNull TextInfoCellsConfig textInfoCellsConfig) {
            Intrinsics.checkNotNullParameter(additionalReturnServiceCellConfig, "additionalReturnServiceCellConfig");
            Intrinsics.checkNotNullParameter(additionalReturnServiceCellViewMapper, "additionalReturnServiceCellViewMapper");
            Intrinsics.checkNotNullParameter(additionalServiceCellConfig, "additionalServiceCellConfig");
            Intrinsics.checkNotNullParameter(additionalServiceCellViewMapper, "additionalServiceCellViewMapper");
            Intrinsics.checkNotNullParameter(additionalServicesOfferConfig, "additionalServicesOfferConfig");
            Intrinsics.checkNotNullParameter(additionalServicesOfferShadedConfig, "additionalServicesOfferShadedConfig");
            Intrinsics.checkNotNullParameter(additionalServicesOfferViewMapper, "additionalServicesOfferViewMapper");
            Intrinsics.checkNotNullParameter(additionalServicesTotalConfig, "additionalServicesTotalConfig");
            Intrinsics.checkNotNullParameter(additionalServicesTotalShadedConfig, "additionalServicesTotalShadedConfig");
            Intrinsics.checkNotNullParameter(additionalServicesTotalViewMapper, "additionalServicesTotalViewMapper");
            Intrinsics.checkNotNullParameter(hiddenQueryServicesManagerConfig, "hiddenQueryServicesManagerConfig");
            Intrinsics.checkNotNullParameter(hiddenQueryServicesManagerViewMapper, "hiddenQueryServicesManagerViewMapper");
            Intrinsics.checkNotNullParameter(infoPopupConfig, "infoPopupConfig");
            Intrinsics.checkNotNullParameter(infoPopupViewMapper, "infoPopupViewMapper");
            Intrinsics.checkNotNullParameter(infoPopupV2Config, "infoPopupV2Config");
            Intrinsics.checkNotNullParameter(infoPopupV2ViewMapper, "infoPopupV2ViewMapper");
            Intrinsics.checkNotNullParameter(infoPopupV4Config, "infoPopupV4Config");
            Intrinsics.checkNotNullParameter(infoPopupV4ViewMapper, "infoPopupV4ViewMapper");
            Intrinsics.checkNotNullParameter(infoPopupV4StickyViewMapper, "infoPopupV4StickyViewMapper");
            Intrinsics.checkNotNullParameter(serviceBlockConfig, "serviceBlockConfig");
            Intrinsics.checkNotNullParameter(serviceBlockShadedConfig, "serviceBlockShadedConfig");
            Intrinsics.checkNotNullParameter(serviceBlockViewMapper, "serviceBlockViewMapper");
            Intrinsics.checkNotNullParameter(textInfoCellsViewMapper, "textInfoCellsViewMapper");
            Intrinsics.checkNotNullParameter(textInfoCellsConfig, "textInfoCellsConfig");
            Widget2[] elements = {new Widget2("travel", "additionalReturnServiceCell", additionalReturnServiceCellConfig, new ViewMapper2[]{additionalReturnServiceCellViewMapper}), new Widget2("travel", "additionalServiceCell", additionalServiceCellConfig, new ViewMapper2[]{additionalServiceCellViewMapper}), new Widget2("travel", "additionalServicesOffer", additionalServicesOfferConfig, new ViewMapper2[]{additionalServicesOfferViewMapper}), new Widget2("travel", "additionalServicesOfferShaded", additionalServicesOfferShadedConfig, new ViewMapper2[]{additionalServicesOfferViewMapper}), new Widget2("travel", "additionalServicesTotal", additionalServicesTotalConfig, new ViewMapper2[]{additionalServicesTotalViewMapper}), new Widget2("travel", "additionalServicesTotalShaded", additionalServicesTotalShadedConfig, new ViewMapper2[]{additionalServicesTotalViewMapper}), new Widget2("travel", "hiddenQueryServicesManager", hiddenQueryServicesManagerConfig, new ViewMapper2[]{hiddenQueryServicesManagerViewMapper}), new Widget2("travel", "infoPopup", infoPopupV4Config, new ViewMapper2[]{infoPopupV4ViewMapper, infoPopupV4StickyViewMapper}), new Widget2("travel", "infoPopup", infoPopupConfig, new ViewMapper2[]{infoPopupViewMapper}), new Widget2("travel", "infoPopup", infoPopupV2Config, new ViewMapper2[]{infoPopupV2ViewMapper}), new Widget2("travel", "serviceBlock", serviceBlockConfig, new ViewMapper2[]{serviceBlockViewMapper}), new Widget2("travel", "serviceBlockShaded", serviceBlockShadedConfig, new ViewMapper2[]{serviceBlockViewMapper}), new Widget2("travel", "textInfoCells", textInfoCellsConfig, new ViewMapper2[]{textInfoCellsViewMapper})};
            Intrinsics.checkNotNullParameter(elements, "elements");
            return C7705l.j0(elements);
        }

        private Companion() {
        }
    }
}
