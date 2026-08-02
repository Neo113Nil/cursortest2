package ru.ozon.app.android.travel.feature.general.common.widgets.servicePackageCarousel.v1.data;

import Tc.b;
import WZ.t;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.C7714v;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import l20.d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.app.android.composer.TrackingInfoMapperKt;
import ru.ozon.app.android.travel.feature.general.common.widgets.servicePackageCarousel.v1.data.ServicePackageCarouselDTO;
import ru.ozon.app.android.travel.feature.general.common.widgets.servicePackageCarousel.v1.presentation.ServicePackageCarouselVO;
import ru.ozon.app.android.travel.molecules.extensions.DsCellExtensionsKt;
import ru.ozon.app.android.travel.molecules.mapper.MapperExtKt;
import ru.ozon.app.android.travel.molecules.view.themeImage.v2.ThemeImageV2VO;
import ru.ozon.tracker.sendEvent.ActionType;
import ru.ozon.uni.atoms.data.controls.CommonControlSettings;
import ru.ozon.uni.atoms.data.controls.button.ButtonV3DTO;
import ru.ozon.uni.atoms.data.dsBadge.BadgeDTO;
import ru.ozon.uni.atoms.data.dsCell.CellDTO;
import ru.ozon.uni.atoms.data.price.PriceDTO;
import ru.ozon.uni.atoms.data.text.TextDTO;
import ru.ozon.uni.core.UniGradient;

@Metadata(d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0001\u0018\u00002*\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u0001j\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0005`\u0006B\u0007¢\u0006\u0004\b\u0007\u0010\bJ#\u0010\u000f\u001a\u00020\u000e*\u00020\t2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u001b\u0010\u000f\u001a\u00020\u0013*\u00020\u00112\u0006\u0010\u0012\u001a\u00020\nH\u0002¢\u0006\u0004\b\u000f\u0010\u0014J\u001b\u0010\u000f\u001a\u00020\u0016*\u00020\u00152\u0006\u0010\u0012\u001a\u00020\nH\u0002¢\u0006\u0004\b\u000f\u0010\u0017J\u001b\u0010\u000f\u001a\u00020\u0019*\u00020\u00182\u0006\u0010\u0012\u001a\u00020\nH\u0002¢\u0006\u0004\b\u000f\u0010\u001aJ\u001b\u0010\u001d\u001a\u00020\u001c*\u00020\u001b2\u0006\u0010\u0012\u001a\u00020\nH\u0002¢\u0006\u0004\b\u001d\u0010\u001eJ&\u0010!\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u001f\u001a\u00020\u00022\u0006\u0010 \u001a\u00020\u0003H\u0096\u0002¢\u0006\u0004\b!\u0010\"¨\u0006#"}, d2 = {"Lru/ozon/app/android/travel/feature/general/common/widgets/servicePackageCarousel/v1/data/ServicePackageCarouselMapper;", "Lkotlin/Function2;", "Lru/ozon/app/android/travel/feature/general/common/widgets/servicePackageCarousel/v1/data/ServicePackageCarouselDTO;", "Ll20/d;", "", "Lru/ozon/app/android/travel/feature/general/common/widgets/servicePackageCarousel/v1/presentation/ServicePackageCarouselVO;", "Lru/ozon/app/android/composer/widgets/base/WidgetMapper;", "<init>", "()V", "Lru/ozon/app/android/travel/feature/general/common/widgets/servicePackageCarousel/v1/data/ServicePackageCarouselDTO$ServicePackageCardDTO;", "", "index", "", "widgetId", "Lru/ozon/app/android/travel/feature/general/common/widgets/servicePackageCarousel/v1/presentation/ServicePackageCarouselVO$ServicePackageCarouselCardVO;", "toVO", "(Lru/ozon/app/android/travel/feature/general/common/widgets/servicePackageCarousel/v1/data/ServicePackageCarouselDTO$ServicePackageCardDTO;IJ)Lru/ozon/app/android/travel/feature/general/common/widgets/servicePackageCarousel/v1/presentation/ServicePackageCarouselVO$ServicePackageCarouselCardVO;", "Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;", "id", "Lru/ozon/app/android/travel/feature/general/common/widgets/servicePackageCarousel/v1/presentation/ServicePackageCarouselVO$ServicePackageCarouselCardVO$ServicePackageCarouselCardItemVO$HorizontalBadges;", "(Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;I)Lru/ozon/app/android/travel/feature/general/common/widgets/servicePackageCarousel/v1/presentation/ServicePackageCarouselVO$ServicePackageCarouselCardVO$ServicePackageCarouselCardItemVO$HorizontalBadges;", "Lru/ozon/uni/atoms/data/text/TextDTO;", "Lru/ozon/app/android/travel/feature/general/common/widgets/servicePackageCarousel/v1/presentation/ServicePackageCarouselVO$ServicePackageCarouselCardVO$ServicePackageCarouselCardItemVO$Text;", "(Lru/ozon/uni/atoms/data/text/TextDTO;I)Lru/ozon/app/android/travel/feature/general/common/widgets/servicePackageCarousel/v1/presentation/ServicePackageCarouselVO$ServicePackageCarouselCardVO$ServicePackageCarouselCardItemVO$Text;", "Lru/ozon/uni/atoms/data/price/PriceDTO;", "Lru/ozon/app/android/travel/feature/general/common/widgets/servicePackageCarousel/v1/presentation/ServicePackageCarouselVO$ServicePackageCarouselCardVO$ServicePackageCarouselCardItemVO$Price;", "(Lru/ozon/uni/atoms/data/price/PriceDTO;I)Lru/ozon/app/android/travel/feature/general/common/widgets/servicePackageCarousel/v1/presentation/ServicePackageCarouselVO$ServicePackageCarouselCardVO$ServicePackageCarouselCardItemVO$Price;", "Lru/ozon/uni/atoms/data/dsCell/CellDTO;", "Lru/ozon/app/android/travel/feature/general/common/widgets/servicePackageCarousel/v1/presentation/ServicePackageCarouselVO$ServicePackageCarouselCardVO$ServicePackageCarouselCardItemVO$Benefit;", "toBenefitVO", "(Lru/ozon/uni/atoms/data/dsCell/CellDTO;I)Lru/ozon/app/android/travel/feature/general/common/widgets/servicePackageCarousel/v1/presentation/ServicePackageCarouselVO$ServicePackageCarouselCardVO$ServicePackageCarouselCardItemVO$Benefit;", "state", "widgetInfo", "invoke", "(Lru/ozon/app/android/travel/feature/general/common/widgets/servicePackageCarousel/v1/data/ServicePackageCarouselDTO;Ll20/d;)Ljava/util/List;", "common_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class ServicePackageCarouselMapper implements Function2<ServicePackageCarouselDTO, d, List<? extends ServicePackageCarouselVO>> {
    private final ServicePackageCarouselVO.ServicePackageCarouselCardVO.ServicePackageCarouselCardItemVO.Benefit toBenefitVO(CellDTO cellDTO, int i11) {
        cellDTO.setTagSupported(true);
        Unit unit = Unit.f71690a;
        return new ServicePackageCarouselVO.ServicePackageCarouselCardVO.ServicePackageCarouselCardItemVO.Benefit(i11, DsCellExtensionsKt.disableAutoToggle(cellDTO));
    }

    private final ServicePackageCarouselVO.ServicePackageCarouselCardVO toVO(ServicePackageCarouselDTO.ServicePackageCardDTO servicePackageCardDTO, int i11, long j11) {
        CellDTO cellDTO;
        CommonControlSettings common;
        Map<String, TokenizedTrackingInfo> trackingInfo;
        b builder = C7714v.B();
        if (servicePackageCardDTO.getBadge() != null) {
            builder.add(toVO(servicePackageCardDTO.getBadge(), builder.getF26995b()));
        }
        builder.add(toVO(servicePackageCardDTO.getTitle(), builder.getF26995b()));
        builder.add(toVO(servicePackageCardDTO.getPrice(), builder.getF26995b()));
        Iterator<T> it = servicePackageCardDTO.getBenefits().iterator();
        while (it.hasNext()) {
            builder.add(toBenefitVO((CellDTO) it.next(), builder.getF26995b()));
        }
        Intrinsics.checkNotNullParameter(builder, "builder");
        b B11 = builder.B();
        CellDTO smsToggler = servicePackageCardDTO.getSmsToggler();
        t mapToTokenizedEvent = (smsToggler == null || (common = smsToggler.getCommon()) == null || (trackingInfo = common.getTrackingInfo()) == null) ? null : TrackingInfoMapperKt.mapToTokenizedEvent(trackingInfo, Long.valueOf(j11), ActionType.VIEW.INSTANCE.getType());
        Boolean isActive = servicePackageCardDTO.isActive();
        boolean booleanValue = isActive != null ? isActive.booleanValue() : false;
        String borderColor = servicePackageCardDTO.getBorderColor();
        UniGradient backgroundGradient = servicePackageCardDTO.getBackgroundGradient();
        CellDTO smsToggler2 = servicePackageCardDTO.getSmsToggler();
        if (smsToggler2 != null) {
            smsToggler2.setTagSupported(true);
            Unit unit = Unit.f71690a;
            cellDTO = DsCellExtensionsKt.disableAutoToggle(smsToggler2);
        } else {
            cellDTO = null;
        }
        ButtonV3DTO lightThemeButton = servicePackageCardDTO.getButtonApp().getLightThemeButton();
        ButtonV3DTO darkThemeButton = servicePackageCardDTO.getButtonApp().getDarkThemeButton();
        Map<String, TokenizedTrackingInfo> viewTracking = servicePackageCardDTO.getViewTracking();
        return new ServicePackageCarouselVO.ServicePackageCarouselCardVO(i11, booleanValue, borderColor, backgroundGradient, B11, cellDTO, mapToTokenizedEvent, lightThemeButton, darkThemeButton, viewTracking != null ? TrackingInfoMapperKt.mapToTokenizedEvent$default(viewTracking, Long.valueOf(j11), null, 2, null) : null, servicePackageCardDTO.getTestInfo());
    }

    @Override // kotlin.jvm.functions.Function2
    @NotNull
    public List<ServicePackageCarouselVO> invoke(@NotNull ServicePackageCarouselDTO state, @NotNull d widgetInfo) {
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(widgetInfo, "widgetInfo");
        long hashCode = widgetInfo.d().hashCode();
        List<ServicePackageCarouselDTO.ServicePackageCardDTO> packages = state.getPackages();
        ArrayList arrayList = new ArrayList(C7714v.z(packages, 10));
        int i11 = 0;
        for (Object obj : packages) {
            int i12 = i11 + 1;
            if (i11 < 0) {
                C7714v.O0();
                throw null;
            }
            arrayList.add(toVO((ServicePackageCarouselDTO.ServicePackageCardDTO) obj, i11, hashCode));
            i11 = i12;
        }
        ThemeImageV2VO vo = MapperExtKt.toVO(state.getTravelLogoApp());
        TextDTO title = state.getTitle();
        TextDTO subtitle = state.getSubtitle();
        Map<String, TokenizedTrackingInfo> viewTracking = state.getViewTracking();
        return C7714v.a0(new ServicePackageCarouselVO(hashCode, vo, title, subtitle, arrayList, viewTracking != null ? TrackingInfoMapperKt.mapToTokenizedEvent$default(viewTracking, Long.valueOf(hashCode), null, 2, null) : null));
    }

    private final ServicePackageCarouselVO.ServicePackageCarouselCardVO.ServicePackageCarouselCardItemVO.HorizontalBadges toVO(BadgeDTO badgeDTO, int i11) {
        return new ServicePackageCarouselVO.ServicePackageCarouselCardVO.ServicePackageCarouselCardItemVO.HorizontalBadges(i11, C7714v.a0(badgeDTO));
    }

    private final ServicePackageCarouselVO.ServicePackageCarouselCardVO.ServicePackageCarouselCardItemVO.Text toVO(TextDTO textDTO, int i11) {
        return new ServicePackageCarouselVO.ServicePackageCarouselCardVO.ServicePackageCarouselCardItemVO.Text(i11, textDTO);
    }

    private final ServicePackageCarouselVO.ServicePackageCarouselCardVO.ServicePackageCarouselCardItemVO.Price toVO(PriceDTO priceDTO, int i11) {
        return new ServicePackageCarouselVO.ServicePackageCarouselCardVO.ServicePackageCarouselCardItemVO.Price(i11, priceDTO);
    }
}
