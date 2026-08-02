package ru.ozon.app.android.travel.feature.avia.widgets.travelServicePackageIndMobileAddToOrder.v3.data;

import WZ.t;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.C7714v;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import l20.d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.app.android.composer.TrackingInfoMapperKt;
import ru.ozon.app.android.travel.feature.avia.widgets.travelServicePackageIndMobileAddToOrder.v3.data.ServicePackSelectionV3DTO;
import ru.ozon.app.android.travel.feature.avia.widgets.travelServicePackageIndMobileAddToOrder.v3.presentation.ServicePackSelectionV3VO;
import ru.ozon.uni.atoms.data.badge.Badge;
import ru.ozon.uni.atoms.data.button.ButtonV3Atom;
import ru.ozon.uni.atoms.data.price.Price;
import ru.ozon.uni.atoms.data.texts.TextAtom;

@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002*\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u0001j\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0005`\u0006B\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u001f\u0010\u000e\u001a\u00020\r2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0012\u001a\u00020\u00112\u0006\u0010\n\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u0012\u0010\u0013J#\u0010\u0012\u001a\u0004\u0018\u00010\u00152\b\u0010\n\u001a\u0004\u0018\u00010\u00142\u0006\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u0012\u0010\u0016J*\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0017\u001a\u00020\u00022\n\u0010\u0019\u001a\u00060\u0003j\u0002`\u0018H\u0096\u0002¢\u0006\u0004\b\u001a\u0010\u001b¨\u0006\u001c"}, d2 = {"Lru/ozon/app/android/travel/feature/avia/widgets/travelServicePackageIndMobileAddToOrder/v3/data/ServicePackSelectionV3Mapper;", "Lkotlin/Function2;", "Lru/ozon/app/android/travel/feature/avia/widgets/travelServicePackageIndMobileAddToOrder/v3/data/ServicePackSelectionV3DTO;", "Ll20/d;", "", "Lru/ozon/app/android/travel/feature/avia/widgets/travelServicePackageIndMobileAddToOrder/v3/presentation/ServicePackSelectionV3VO;", "Lru/ozon/app/android/composer/widgets/base/WidgetMapper;", "<init>", "()V", "Lru/ozon/app/android/travel/feature/avia/widgets/travelServicePackageIndMobileAddToOrder/v3/data/ServicePackSelectionV3DTO$PackageOption;", "servicePack", "", "widgetId", "Lru/ozon/app/android/travel/feature/avia/widgets/travelServicePackageIndMobileAddToOrder/v3/presentation/ServicePackSelectionV3VO$PackageOptionVO;", "mapPackageOptionToVO", "(Lru/ozon/app/android/travel/feature/avia/widgets/travelServicePackageIndMobileAddToOrder/v3/data/ServicePackSelectionV3DTO$PackageOption;J)Lru/ozon/app/android/travel/feature/avia/widgets/travelServicePackageIndMobileAddToOrder/v3/presentation/ServicePackSelectionV3VO$PackageOptionVO;", "Lru/ozon/app/android/travel/feature/avia/widgets/travelServicePackageIndMobileAddToOrder/v3/data/ServicePackSelectionV3DTO$PackageTab;", "Lru/ozon/app/android/travel/feature/avia/widgets/travelServicePackageIndMobileAddToOrder/v3/presentation/ServicePackSelectionV3VO$PackageTabVO;", "mapPackageTabToVO", "(Lru/ozon/app/android/travel/feature/avia/widgets/travelServicePackageIndMobileAddToOrder/v3/data/ServicePackSelectionV3DTO$PackageTab;)Lru/ozon/app/android/travel/feature/avia/widgets/travelServicePackageIndMobileAddToOrder/v3/presentation/ServicePackSelectionV3VO$PackageTabVO;", "Lru/ozon/app/android/travel/feature/avia/widgets/travelServicePackageIndMobileAddToOrder/v3/data/ServicePackSelectionV3DTO$PushSMS;", "Lru/ozon/app/android/travel/feature/avia/widgets/travelServicePackageIndMobileAddToOrder/v3/presentation/ServicePackSelectionV3VO$PushSMSVO;", "(Lru/ozon/app/android/travel/feature/avia/widgets/travelServicePackageIndMobileAddToOrder/v3/data/ServicePackSelectionV3DTO$PushSMS;J)Lru/ozon/app/android/travel/feature/avia/widgets/travelServicePackageIndMobileAddToOrder/v3/presentation/ServicePackSelectionV3VO$PushSMSVO;", "state", "Lru/ozon/app/android/composer/view/WidgetInfo;", "widgetInfo", "invoke", "(Lru/ozon/app/android/travel/feature/avia/widgets/travelServicePackageIndMobileAddToOrder/v3/data/ServicePackSelectionV3DTO;Ll20/d;)Ljava/util/List;", "avia_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class ServicePackSelectionV3Mapper implements Function2<ServicePackSelectionV3DTO, d, List<? extends ServicePackSelectionV3VO>> {
    private final ServicePackSelectionV3VO.PackageOptionVO mapPackageOptionToVO(ServicePackSelectionV3DTO.PackageOption servicePack, long widgetId) {
        ServicePackSelectionV3VO.PackageTabVO mapPackageTabToVO = mapPackageTabToVO(servicePack.getPackageTab());
        List<ServicePackSelectionV3DTO.Benefit> benefits = servicePack.getBenefits();
        ServicePackSelectionV3VO.PushSMSVO mapPackageTabToVO2 = mapPackageTabToVO(servicePack.getSmsBlock(), widgetId);
        ButtonV3Atom.LargeButton selectButtonDefault = servicePack.getSelectButtonDefault();
        Map<String, TokenizedTrackingInfo> trackingInfo = servicePack.getTrackingInfo();
        return new ServicePackSelectionV3VO.PackageOptionVO(mapPackageTabToVO, benefits, mapPackageTabToVO2, selectButtonDefault, trackingInfo != null ? TrackingInfoMapperKt.toTokenizedEvent$default(trackingInfo, Long.valueOf(widgetId), null, 2, null) : null);
    }

    private final ServicePackSelectionV3VO.PackageTabVO mapPackageTabToVO(ServicePackSelectionV3DTO.PackageTab servicePack) {
        return new ServicePackSelectionV3VO.PackageTabVO(servicePack.getTitle(), servicePack.getPrice(), servicePack.isSelected(), servicePack.getBadge(), servicePack.getImageForPremiumUser() != null);
    }

    @Override // kotlin.jvm.functions.Function2
    @NotNull
    public List<ServicePackSelectionV3VO> invoke(@NotNull ServicePackSelectionV3DTO state, @NotNull d widgetInfo) {
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(widgetInfo, "widgetInfo");
        long hashCode = widgetInfo.d().hashCode();
        TextAtom title = state.getTitle();
        TextAtom priceDescription = state.getPriceDescription();
        List<ServicePackSelectionV3DTO.PackageOption> options = state.getOptions();
        ArrayList arrayList = new ArrayList(C7714v.z(options, 10));
        Iterator<T> it = options.iterator();
        while (it.hasNext()) {
            arrayList.add(mapPackageOptionToVO((ServicePackSelectionV3DTO.PackageOption) it.next(), hashCode));
        }
        return C7714v.a0(new ServicePackSelectionV3VO(hashCode, title, priceDescription, arrayList, state.getDeclineButton()));
    }

    private final ServicePackSelectionV3VO.PushSMSVO mapPackageTabToVO(ServicePackSelectionV3DTO.PushSMS servicePack, long widgetId) {
        if (servicePack == null) {
            return null;
        }
        TextAtom title = servicePack.getTitle();
        Price price = servicePack.getPrice();
        Badge discountBadge = servicePack.getDiscountBadge();
        TextAtom description = servicePack.getDescription();
        ButtonV3Atom.LargeButton selectButtonSMS = servicePack.getSelectButtonSMS();
        boolean isSMSSelected = servicePack.isSMSSelected();
        Map<String, TokenizedTrackingInfo> viewTrackingInfo = servicePack.getViewTrackingInfo();
        t tokenizedEvent$default = viewTrackingInfo != null ? TrackingInfoMapperKt.toTokenizedEvent$default(viewTrackingInfo, Long.valueOf(widgetId), null, 2, null) : null;
        Map<String, TokenizedTrackingInfo> setTrackingInfo = servicePack.getSetTrackingInfo();
        t tokenizedEvent$default2 = setTrackingInfo != null ? TrackingInfoMapperKt.toTokenizedEvent$default(setTrackingInfo, Long.valueOf(widgetId), null, 2, null) : null;
        Map<String, TokenizedTrackingInfo> unsetTrackingInfo = servicePack.getUnsetTrackingInfo();
        return new ServicePackSelectionV3VO.PushSMSVO(title, discountBadge, price, description, selectButtonSMS, isSMSSelected, tokenizedEvent$default, tokenizedEvent$default2, unsetTrackingInfo != null ? TrackingInfoMapperKt.toTokenizedEvent$default(unsetTrackingInfo, Long.valueOf(widgetId), null, 2, null) : null);
    }
}
