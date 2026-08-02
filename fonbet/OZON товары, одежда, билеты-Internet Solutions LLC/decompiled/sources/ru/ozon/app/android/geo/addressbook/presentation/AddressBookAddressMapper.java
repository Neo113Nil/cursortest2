package ru.ozon.app.android.geo.addressbook.presentation;

import java.util.ArrayList;
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
import ru.ozon.app.android.cart.ui.tooltip.CartTooltipVOKt;
import ru.ozon.app.android.composer.widgets.v2.onboarding.data.OnBoardingDTO;
import ru.ozon.app.android.geo.addressbook.data.AddressBookDTO;
import ru.ozon.app.android.geo.addressbook.presentation.AddressBookVO;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.AtomActionDTO;
import ru.ozon.uni.atoms.data.AtomActionMapperKt;
import ru.ozon.uni.atoms.data.AtomDTO;
import ru.ozon.uni.atoms.data.button.ButtonIcon;
import ru.ozon.uni.atoms.data.button.ButtonV3Atom;
import ru.ozon.uni.atoms.data.controls.CommonControlSettings;
import ru.ozon.uni.atoms.data.dsBadge.BadgeDTO;
import ru.ozon.uni.atoms.data.text.TextDTO;

@Metadata(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u00002*\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u0001j\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0005`\u0006B\u0007¢\u0006\u0004\b\u0007\u0010\bJ!\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004*\u00020\u00022\u0006\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\u000b\u0010\fJ'\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004*\b\u0012\u0004\u0012\u00020\r0\u00042\u0006\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u0019\u0010\u0012\u001a\u00020\u0011*\b\u0012\u0004\u0012\u00020\u00100\u0004H\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u001f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00140\u0004*\b\u0012\u0004\u0012\u00020\u00100\u0004H\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u0013\u0010\u0019\u001a\u00020\u0018*\u00020\u0017H\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ\u0013\u0010\u0019\u001a\u00020\u001c*\u00020\u001bH\u0002¢\u0006\u0004\b\u0019\u0010\u001dJ&\u0010 \u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u001e\u001a\u00020\u00022\u0006\u0010\u001f\u001a\u00020\u0003H\u0096\u0002¢\u0006\u0004\b \u0010!¨\u0006\""}, d2 = {"Lru/ozon/app/android/geo/addressbook/presentation/AddressBookAddressMapper;", "Lkotlin/Function2;", "Lru/ozon/app/android/geo/addressbook/data/AddressBookDTO;", "Ll20/d;", "", "Lru/ozon/app/android/geo/addressbook/presentation/AddressBookVO$Address;", "Lru/ozon/app/android/composer/widgets/base/WidgetMapper;", "<init>", "()V", "", "stateId", "toAddressVO", "(Lru/ozon/app/android/geo/addressbook/data/AddressBookDTO;Ljava/lang/String;)Ljava/util/List;", "Lru/ozon/app/android/geo/addressbook/data/AddressBookDTO$AddressList$Address;", "toAddressModel", "(Ljava/util/List;Ljava/lang/String;)Ljava/util/List;", "Lru/ozon/app/android/geo/addressbook/data/AddressBookDTO$AddressList$Address$Control;", "Lru/ozon/app/android/geo/addressbook/presentation/AddressBookVO$Address$Controls;", "toControlsModel", "(Ljava/util/List;)Lru/ozon/app/android/geo/addressbook/presentation/AddressBookVO$Address$Controls;", "Lru/ozon/app/android/geo/addressbook/presentation/AddressBookVO$Address$Controls$Control;", "toOptionsModel", "(Ljava/util/List;)Ljava/util/List;", "Lru/ozon/app/android/geo/addressbook/data/AddressBookDTO$AddressList$Address$NumberPVZ;", "Lru/ozon/app/android/geo/addressbook/presentation/AddressBookVO$Address$NumberPVZ;", "toVo", "(Lru/ozon/app/android/geo/addressbook/data/AddressBookDTO$AddressList$Address$NumberPVZ;)Lru/ozon/app/android/geo/addressbook/presentation/AddressBookVO$Address$NumberPVZ;", "Lru/ozon/app/android/geo/addressbook/data/AddressBookDTO$AddressList$Address$NumberPVZ$Tooltip;", "Lru/ozon/app/android/geo/addressbook/presentation/AddressBookVO$Address$NumberPVZ$Tooltip;", "(Lru/ozon/app/android/geo/addressbook/data/AddressBookDTO$AddressList$Address$NumberPVZ$Tooltip;)Lru/ozon/app/android/geo/addressbook/presentation/AddressBookVO$Address$NumberPVZ$Tooltip;", "state", "widgetInfo", "invoke", "(Lru/ozon/app/android/geo/addressbook/data/AddressBookDTO;Ll20/d;)Ljava/util/List;", "geo_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class AddressBookAddressMapper implements Function2<AddressBookDTO, d, List<? extends AddressBookVO.Address>> {
    private final List<AddressBookVO.Address> toAddressModel(List<AddressBookDTO.AddressList.Address> list, String str) {
        int P11 = C7714v.P(list);
        List<AddressBookDTO.AddressList.Address> list2 = list;
        ArrayList arrayList = new ArrayList(C7714v.z(list2, 10));
        int i11 = 0;
        for (Object obj : list2) {
            int i12 = i11 + 1;
            if (i11 < 0) {
                C7714v.O0();
                throw null;
            }
            AddressBookDTO.AddressList.Address address = (AddressBookDTO.AddressList.Address) obj;
            long hashCode = (str + address).hashCode();
            String addressBookId = address.getAddressBookId();
            AtomActionDTO clickAction = address.getClickAction();
            boolean isEnabled = address.isEnabled();
            boolean z11 = true;
            boolean z12 = i11 != P11;
            Map<String, TokenizedTrackingInfo> trackingInfo = address.getTrackingInfo();
            AddressBookVO.Address.RadioItem radioItem = new AddressBookVO.Address.RadioItem(address.getTitle(), address.isSelected(), address.isEnabled());
            List<AddressBookDTO.AddressList.Address.Control> controls = address.getControls();
            List<AddressBookDTO.AddressList.Address.Control> list3 = controls;
            if (list3 != null && !list3.isEmpty()) {
                z11 = false;
            }
            if (z11) {
                controls = null;
            }
            AddressBookVO.Address.Controls controlsModel = controls != null ? toControlsModel(controls) : null;
            List<AtomDTO> elements = address.getElements();
            List<AtomDTO> bottomElements = address.getBottomElements();
            OnBoardingDTO onboarding = address.getOnboarding();
            List<BadgeDTO> badges = address.getBadges();
            AddressBookDTO.AddressList.Address.NumberPVZ numberPVZ = address.getNumberPVZ();
            arrayList.add(new AddressBookVO.Address(hashCode, addressBookId, isEnabled, z12, clickAction, radioItem, controlsModel, elements, bottomElements, trackingInfo, onboarding, badges, numberPVZ != null ? toVo(numberPVZ) : null));
            i11 = i12;
        }
        return arrayList;
    }

    private final List<AddressBookVO.Address> toAddressVO(AddressBookDTO addressBookDTO, String str) {
        return !(addressBookDTO instanceof AddressBookDTO.AddressList) ? K.f71697a : toAddressModel(((AddressBookDTO.AddressList) addressBookDTO).getAddresses(), str);
    }

    private final AddressBookVO.Address.Controls toControlsModel(List<AddressBookDTO.AddressList.Address.Control> list) {
        AtomActionDTO atomActionDTO = new AtomActionDTO(AtomActionDTO.Behavior.CUSTOM, null, "controls", null, 10, null);
        String str = null;
        ButtonV3Atom.LargeIconButtonStyle largeIconButtonStyle = null;
        return new AddressBookVO.Address.Controls(toOptionsModel(list), new ButtonIcon(str, atomActionDTO, null, largeIconButtonStyle, null, null, null, 124, null));
    }

    private final List<AddressBookVO.Address.Controls.Control> toOptionsModel(List<AddressBookDTO.AddressList.Address.Control> list) {
        List<AddressBookDTO.AddressList.Address.Control> list2 = list;
        ArrayList arrayList = new ArrayList(C7714v.z(list2, 10));
        for (AddressBookDTO.AddressList.Address.Control control : list2) {
            arrayList.add(new AddressBookVO.Address.Controls.Control(control.getText(), control.getIcon(), control.getIconRes(), control.getAction(), control.getTrackingInfo()));
        }
        return arrayList;
    }

    private final AddressBookVO.Address.NumberPVZ toVo(AddressBookDTO.AddressList.Address.NumberPVZ numberPVZ) {
        AtomActionDTO action;
        TextDTO number = numberPVZ.getNumber();
        CommonControlSettings common = numberPVZ.getCommon();
        AtomAction atomAction = (common == null || (action = common.getAction()) == null) ? null : AtomActionMapperKt.toAtomAction(action, numberPVZ.getCommon().getTrackingInfo());
        AddressBookDTO.AddressList.Address.NumberPVZ.Tooltip tooltip = numberPVZ.getTooltip();
        return new AddressBookVO.Address.NumberPVZ(number, atomAction, tooltip != null ? toVo(tooltip) : null);
    }

    @Override // kotlin.jvm.functions.Function2
    @NotNull
    public List<AddressBookVO.Address> invoke(@NotNull AddressBookDTO state, @NotNull d widgetInfo) {
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(widgetInfo, "widgetInfo");
        return toAddressVO(state, widgetInfo.d());
    }

    private final AddressBookVO.Address.NumberPVZ.Tooltip toVo(AddressBookDTO.AddressList.Address.NumberPVZ.Tooltip tooltip) {
        return new AddressBookVO.Address.NumberPVZ.Tooltip(CartTooltipVOKt.toCartTooltipVO(tooltip.getTooltip()), tooltip.getDelayTime(), tooltip.getDisplayTime());
    }
}
