package ru.ozon.app.android.geo.addresseditpickupdetailv2.presentation;

import WZ.x;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.C7714v;
import kotlin.collections.K;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import l20.d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.app.android.atoms.data.deprecated.Header;
import ru.ozon.app.android.atoms.data.deprecated.ImageCarousel;
import ru.ozon.app.android.atoms.data.disclaimer.DisclaimerAtom;
import ru.ozon.app.android.composer.widgets.v2.onboarding.data.OnBoardingDTO;
import ru.ozon.app.android.geo.R$plurals;
import ru.ozon.app.android.geo.addresseditpickupdetailv2.data.AddressEditPickUpDetailDTO;
import ru.ozon.app.android.geo.addresseditpickupdetailv2.presentation.AddressEditPickUpDetailVO;
import ru.ozon.app.android.uikit.text.StringProvider;
import ru.ozon.uni.atoms.data.AtomActionDTO;
import ru.ozon.uni.atoms.data.AtomActionMapperKt;
import ru.ozon.uni.atoms.data.AtomDTO;
import ru.ozon.uni.atoms.data.controls.CommonControlSettings;
import ru.ozon.uni.atoms.data.disclaimer.DisclaimerDTO;
import ru.ozon.uni.atoms.data.dsBadge.BadgeDTO;
import ru.ozon.uni.atoms.data.text.TextDTO;

@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u00002*\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u0001j\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0005`\u0006B\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u0013\u0010\u000b\u001a\u00020\n*\u00020\tH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0013\u0010\u000f\u001a\u00020\u000e*\u00020\rH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u0013\u0010\u000f\u001a\u00020\u0012*\u00020\u0011H\u0002¢\u0006\u0004\b\u000f\u0010\u0013J\u0013\u0010\u000f\u001a\u00020\u0015*\u00020\u0014H\u0002¢\u0006\u0004\b\u000f\u0010\u0016J&\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0003H\u0096\u0002¢\u0006\u0004\b\u0019\u0010\u001a¨\u0006\u001b"}, d2 = {"Lru/ozon/app/android/geo/addresseditpickupdetailv2/presentation/AddressEditPickupDetailMapper;", "Lkotlin/Function2;", "Lru/ozon/app/android/geo/addresseditpickupdetailv2/data/AddressEditPickUpDetailDTO;", "Ll20/d;", "", "Lru/ozon/app/android/geo/addresseditpickupdetailv2/presentation/AddressEditPickUpDetailVO;", "Lru/ozon/app/android/composer/widgets/base/WidgetMapper;", "<init>", "()V", "Lru/ozon/app/android/geo/addresseditpickupdetailv2/data/AddressEditPickUpDetailDTO$Schedule$InlineDate;", "Lru/ozon/app/android/geo/addresseditpickupdetailv2/presentation/AddressEditPickUpDetailVO$Schedule$InlineDate;", "toVO", "(Lru/ozon/app/android/geo/addresseditpickupdetailv2/data/AddressEditPickUpDetailDTO$Schedule$InlineDate;)Lru/ozon/app/android/geo/addresseditpickupdetailv2/presentation/AddressEditPickUpDetailVO$Schedule$InlineDate;", "Lru/ozon/app/android/geo/addresseditpickupdetailv2/data/AddressEditPickUpDetailDTO$Address;", "Lru/ozon/app/android/geo/addresseditpickupdetailv2/presentation/AddressEditPickUpDetailVO$Address;", "toVo", "(Lru/ozon/app/android/geo/addresseditpickupdetailv2/data/AddressEditPickUpDetailDTO$Address;)Lru/ozon/app/android/geo/addresseditpickupdetailv2/presentation/AddressEditPickUpDetailVO$Address;", "Lru/ozon/app/android/geo/addresseditpickupdetailv2/data/AddressEditPickUpDetailDTO$NumberPVZ;", "Lru/ozon/app/android/geo/addresseditpickupdetailv2/presentation/AddressEditPickUpDetailVO$NumberPVZ;", "(Lru/ozon/app/android/geo/addresseditpickupdetailv2/data/AddressEditPickUpDetailDTO$NumberPVZ;)Lru/ozon/app/android/geo/addresseditpickupdetailv2/presentation/AddressEditPickUpDetailVO$NumberPVZ;", "Lru/ozon/app/android/geo/addresseditpickupdetailv2/data/AddressEditPickUpDetailDTO$DeliveryCondition;", "Lru/ozon/app/android/geo/addresseditpickupdetailv2/presentation/AddressEditPickUpDetailVO$DeliveryCondition;", "(Lru/ozon/app/android/geo/addresseditpickupdetailv2/data/AddressEditPickUpDetailDTO$DeliveryCondition;)Lru/ozon/app/android/geo/addresseditpickupdetailv2/presentation/AddressEditPickUpDetailVO$DeliveryCondition;", "state", "widgetInfo", "invoke", "(Lru/ozon/app/android/geo/addresseditpickupdetailv2/data/AddressEditPickUpDetailDTO;Ll20/d;)Ljava/util/List;", "geo_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class AddressEditPickupDetailMapper implements Function2<AddressEditPickUpDetailDTO, d, List<? extends AddressEditPickUpDetailVO>> {
    private final AddressEditPickUpDetailVO.Schedule.InlineDate toVO(AddressEditPickUpDetailDTO.Schedule.InlineDate inlineDate) {
        return new AddressEditPickUpDetailVO.Schedule.InlineDate(inlineDate.getDate(), inlineDate.getTime());
    }

    private final AddressEditPickUpDetailVO.Address toVo(AddressEditPickUpDetailDTO.Address address) {
        return new AddressEditPickUpDetailVO.Address(address.getText(), address.getIcon(), address.getCommon());
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v10, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r6v18 */
    /* JADX WARN: Type inference failed for: r6v9 */
    @Override // kotlin.jvm.functions.Function2
    @NotNull
    public List<AddressEditPickUpDetailVO> invoke(@NotNull AddressEditPickUpDetailDTO state, @NotNull d widgetInfo) {
        ArrayList arrayList;
        AddressEditPickUpDetailVO.Schedule schedule;
        AddressEditPickUpDetailVO.Schedule schedule2;
        List<AtomDTO> list;
        AddressEditPickUpDetailVO.BadgesHeader badgesHeader;
        long j11;
        AddressEditPickUpDetailVO.AddressLabel addressLabel;
        ArrayList arrayList2;
        AddressEditPickUpDetailDTO.AddressLabel addressLabel2;
        ArrayList arrayList3;
        boolean z11;
        boolean z12;
        String quantityString;
        ArrayList arrayList4;
        ArrayList arrayList5;
        AddressEditPickUpDetailVO.Schedule schedule3;
        List<AddressEditPickUpDetailDTO.Schedule.InlineDate> inlineDates;
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(widgetInfo, "widgetInfo");
        long j12 = 1626602676;
        List<BadgeDTO> badges = state.getBadges();
        List<AtomDTO> header = (badges == null || badges.isEmpty()) ? state.getHeader() : C7714v.D(state.getHeader(), 1);
        List<AtomDTO> address = state.getAddress();
        if (address == null) {
            address = K.f71697a;
        }
        DisclaimerAtom annotation = state.getAnnotation();
        List<AddressEditPickUpDetailDTO.Address> newAddress = state.getNewAddress();
        if (newAddress != null) {
            List<AddressEditPickUpDetailDTO.Address> list2 = newAddress;
            ArrayList arrayList6 = new ArrayList(C7714v.z(list2, 10));
            Iterator it = list2.iterator();
            while (it.hasNext()) {
                arrayList6.add(toVo((AddressEditPickUpDetailDTO.Address) it.next()));
            }
            arrayList = arrayList6;
            schedule = null;
        } else {
            arrayList = null;
            schedule = null;
        }
        ImageCarousel photos = state.getPhotos();
        AddressEditPickUpDetailDTO.Schedule schedule4 = state.getSchedule();
        if (schedule4 != null) {
            if (schedule4.getDates().isEmpty() && ((inlineDates = schedule4.getInlineDates()) == null || inlineDates.isEmpty())) {
                schedule3 = schedule;
            } else {
                List K02 = C7714v.K0(schedule4.getDates(), schedule4.getCollapseMoreThan());
                List<AddressEditPickUpDetailDTO.Schedule.InlineDate> inlineDates2 = schedule4.getInlineDates();
                ?? K03 = inlineDates2 != null ? C7714v.K0(inlineDates2, schedule4.getCollapseMoreThan()) : schedule;
                List<AddressEditPickUpDetailDTO.Schedule.InlineDate> inlineDates3 = schedule4.getInlineDates();
                if (inlineDates3 == null || inlineDates3.isEmpty() || K03 == 0) {
                    z11 = schedule4.getDates().size() > schedule4.getCollapseMoreThan();
                    z12 = K02.size() < schedule4.getDates().size();
                    int size = schedule4.getDates().size() - schedule4.getCollapseMoreThan();
                    quantityString = StringProvider.getQuantityString(R$plurals.address_edit_pick_up_detail_show_more_days, size, Integer.valueOf(size));
                } else {
                    z11 = schedule4.getInlineDates().size() > schedule4.getCollapseMoreThan();
                    z12 = K03.size() < schedule4.getInlineDates().size();
                    int size2 = schedule4.getInlineDates().size() - schedule4.getCollapseMoreThan();
                    quantityString = StringProvider.getQuantityString(R$plurals.address_edit_pick_up_detail_show_more_days, size2, Integer.valueOf(size2));
                }
                String str = quantityString;
                boolean z13 = z11;
                boolean z14 = z12;
                int collapseMoreThan = schedule4.getCollapseMoreThan();
                List<AtomDTO> dates = schedule4.getDates();
                if (K03 != 0) {
                    Iterable iterable = (Iterable) K03;
                    ArrayList arrayList7 = new ArrayList(C7714v.z(iterable, 10));
                    Iterator it2 = iterable.iterator();
                    while (it2.hasNext()) {
                        arrayList7.add(toVO((AddressEditPickUpDetailDTO.Schedule.InlineDate) it2.next()));
                    }
                    arrayList4 = arrayList7;
                } else {
                    arrayList4 = null;
                }
                List<AddressEditPickUpDetailDTO.Schedule.InlineDate> inlineDates4 = schedule4.getInlineDates();
                if (inlineDates4 != null) {
                    List<AddressEditPickUpDetailDTO.Schedule.InlineDate> list3 = inlineDates4;
                    ArrayList arrayList8 = new ArrayList(C7714v.z(list3, 10));
                    Iterator it3 = list3.iterator();
                    while (it3.hasNext()) {
                        arrayList8.add(toVO((AddressEditPickUpDetailDTO.Schedule.InlineDate) it3.next()));
                    }
                    arrayList5 = arrayList8;
                } else {
                    arrayList5 = null;
                }
                schedule3 = new AddressEditPickUpDetailVO.Schedule(collapseMoreThan, K02, dates, arrayList4, arrayList5, schedule4.getInlineDatesImage(), z13, z14, str, schedule4.getImageTintColor());
            }
            schedule2 = schedule3;
        } else {
            schedule2 = null;
        }
        AddressEditPickUpDetailDTO.Banner banner = state.getBanner();
        AddressEditPickUpDetailVO.Banner banner2 = banner != null ? new AddressEditPickUpDetailVO.Banner(banner.getDueDate(), banner.getMarketingInfo(), banner.getElements(), banner.getBorderColor(), banner.getCoverImage()) : null;
        List<AtomDTO> deliveryConditions = state.getDeliveryConditions();
        AtomDTO placeHeader = state.getPlaceHeader();
        List<AtomDTO> metro = state.getMetro();
        List<AtomDTO> placeDescriptions = state.getPlaceDescriptions();
        List<AtomDTO> controls = state.getControls();
        List<BadgeDTO> badges2 = state.getBadges();
        if (badges2 == null || badges2.isEmpty()) {
            list = address;
            badgesHeader = null;
        } else {
            list = address;
            Object M11 = C7714v.M(state.getHeader());
            Header header2 = M11 instanceof Header ? (Header) M11 : null;
            badgesHeader = new AddressEditPickUpDetailVO.BadgesHeader(badges2, header2 != null ? header2.getText() : null);
        }
        AddressEditPickUpDetailDTO.AddressLabel addressLabel3 = state.getAddressLabel();
        if (addressLabel3 != null) {
            List<AddressEditPickUpDetailDTO.AddressLabel.ChipItemMobile> chipsMobile = addressLabel3.getChipsMobile();
            if (chipsMobile != null) {
                List<AddressEditPickUpDetailDTO.AddressLabel.ChipItemMobile> list4 = chipsMobile;
                addressLabel2 = addressLabel3;
                j11 = j12;
                arrayList3 = new ArrayList(C7714v.z(list4, 10));
                for (AddressEditPickUpDetailDTO.AddressLabel.ChipItemMobile chipItemMobile : list4) {
                    Boolean hasTextField = chipItemMobile.getHasTextField();
                    arrayList3.add(new AddressEditPickUpDetailVO.AddressLabel.ChipItemMobile(hasTextField != null ? hasTextField.booleanValue() : false, chipItemMobile.getTagButton()));
                }
            } else {
                addressLabel2 = addressLabel3;
                j11 = j12;
                arrayList3 = null;
            }
            AddressEditPickUpDetailDTO.AddressLabel.TextField textField = addressLabel2.getTextField();
            String value = textField != null ? textField.getValue() : null;
            AddressEditPickUpDetailDTO.AddressLabel.TextField textField2 = addressLabel2.getTextField();
            addressLabel = new AddressEditPickUpDetailVO.AddressLabel(arrayList3, new AddressEditPickUpDetailVO.AddressLabel.TextField(value, textField2 != null ? textField2.getPlaceholder() : null), addressLabel2.getValue());
        } else {
            j11 = j12;
            addressLabel = null;
        }
        List<AtomDTO> list5 = list;
        OnBoardingDTO onboarding = state.getOnboarding();
        AddressEditPickUpDetailDTO.NumberPVZ numberPVZ = state.getNumberPVZ();
        AddressEditPickUpDetailVO.NumberPVZ vo = numberPVZ != null ? toVo(numberPVZ) : null;
        List<AddressEditPickUpDetailDTO.DeliveryCondition> newDeliveryConditions = state.getNewDeliveryConditions();
        if (newDeliveryConditions != null) {
            List<AddressEditPickUpDetailDTO.DeliveryCondition> list6 = newDeliveryConditions;
            arrayList2 = new ArrayList(C7714v.z(list6, 10));
            Iterator it4 = list6.iterator();
            while (it4.hasNext()) {
                arrayList2.add(toVo((AddressEditPickUpDetailDTO.DeliveryCondition) it4.next()));
            }
        } else {
            arrayList2 = null;
        }
        Boolean deliveryConditionsOnTop = state.getDeliveryConditionsOnTop();
        boolean booleanValue = deliveryConditionsOnTop != null ? deliveryConditionsOnTop.booleanValue() : false;
        DisclaimerDTO disclaimer = state.getDisclaimer();
        Map<String, TokenizedTrackingInfo> trackingInfo = state.getTrackingInfo();
        return C7714v.a0(new AddressEditPickUpDetailVO(j11, list5, annotation, arrayList, header, badgesHeader, photos, schedule2, banner2, deliveryConditions, placeHeader, metro, placeDescriptions, controls, addressLabel, onboarding, vo, arrayList2, booleanValue, disclaimer, trackingInfo != null ? x.d(trackingInfo, widgetInfo) : null));
    }

    private final AddressEditPickUpDetailVO.NumberPVZ toVo(AddressEditPickUpDetailDTO.NumberPVZ numberPVZ) {
        AtomActionDTO action;
        TextDTO number = numberPVZ.getNumber();
        CommonControlSettings common = numberPVZ.getCommon();
        return new AddressEditPickUpDetailVO.NumberPVZ(number, (common == null || (action = common.getAction()) == null) ? null : AtomActionMapperKt.toAtomAction(action, numberPVZ.getCommon().getTrackingInfo()));
    }

    private final AddressEditPickUpDetailVO.DeliveryCondition toVo(AddressEditPickUpDetailDTO.DeliveryCondition deliveryCondition) {
        return new AddressEditPickUpDetailVO.DeliveryCondition(deliveryCondition.getText(), deliveryCondition.getIcon(), deliveryCondition.getBadge());
    }
}
