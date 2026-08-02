package ru.ozon.app.android.geo.addresseditcarousel.data;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.C7714v;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.app.android.atoms.data.deprecated.Label;
import ru.ozon.app.android.composer.TrackingInfoMapperKt;
import ru.ozon.app.android.geo.addresseditcarousel.data.AddressEditCarouselDTO;
import ru.ozon.app.android.geo.addresseditcarousel.presentation.AddressEditCarouselVO;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.AtomActionDTO;
import ru.ozon.uni.atoms.data.AtomActionMapperKt;
import ru.ozon.uni.atoms.data.AtomDTO;
import ru.ozon.uni.atoms.data.button.ButtonV3Atom;
import ru.ozon.uni.atoms.data.controls.CommonControlSettings;
import ru.ozon.uni.atoms.data.dsBadge.BadgeDTO;
import ru.ozon.uni.atoms.data.text.TextDTO;
import ru.ozon.uni.atoms.html.OzonHtmlParser;
import ru.ozon.uni.atoms.utils.OzonSpannableString;

@Metadata(d1 = {"\u0000$\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a\u0012\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004\u001a\n\u0010\u0000\u001a\u00020\u0005*\u00020\u0006\u001a\f\u0010\u0007\u001a\u00020\b*\u00020\tH\u0002¨\u0006\n"}, d2 = {"toVO", "Lru/ozon/app/android/geo/addresseditcarousel/presentation/AddressEditCarouselVO;", "Lru/ozon/app/android/geo/addresseditcarousel/data/AddressEditCarouselDTO;", "stateId", "", "Lru/ozon/app/android/geo/addresseditcarousel/presentation/AddressEditCarouselVO$CellVO;", "Lru/ozon/app/android/geo/addresseditcarousel/data/AddressEditCarouselDTO$CellDTO;", "toVo", "Lru/ozon/app/android/geo/addresseditcarousel/presentation/AddressEditCarouselVO$CellVO$NumberPVZ;", "Lru/ozon/app/android/geo/addresseditcarousel/data/AddressEditCarouselDTO$CellDTO$NumberPVZ;", "geo_prodGoogleAllVendorsRelease"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class AddressEditCarouselDTOKt {
    @NotNull
    public static final AddressEditCarouselVO toVO(@NotNull AddressEditCarouselDTO addressEditCarouselDTO, @NotNull String stateId) {
        Intrinsics.checkNotNullParameter(addressEditCarouselDTO, "<this>");
        Intrinsics.checkNotNullParameter(stateId, "stateId");
        long hashCode = stateId.hashCode();
        List<AtomDTO> elements = addressEditCarouselDTO.getElements();
        List<AddressEditCarouselDTO.Option> options = addressEditCarouselDTO.getOptions();
        ArrayList arrayList = new ArrayList(C7714v.z(options, 10));
        Iterator<T> it = options.iterator();
        while (true) {
            AtomAction atomAction = null;
            if (!it.hasNext()) {
                break;
            }
            AddressEditCarouselDTO.Option option = (AddressEditCarouselDTO.Option) it.next();
            AtomActionDTO action = option.getCell().getAction();
            AddressEditCarouselVO.CellVO vo = toVO(option.getCell());
            List<Label> marketingInfo = option.getMarketingInfo();
            if (action != null) {
                atomAction = AtomActionMapperKt.toAtomAction(action, option.getCell().getTrackingInfo());
            }
            arrayList.add(new AddressEditCarouselVO.Option(vo, marketingInfo, atomAction));
        }
        ButtonV3Atom.LargeBorderlessButton moreButton = addressEditCarouselDTO.getMoreButton();
        Map<String, TokenizedTrackingInfo> trackingInfo = addressEditCarouselDTO.getTrackingInfo();
        return new AddressEditCarouselVO(hashCode, elements, arrayList, moreButton, trackingInfo != null ? TrackingInfoMapperKt.toTokenizedEvent$default(trackingInfo, Long.valueOf(hashCode), null, 2, null) : null);
    }

    private static final AddressEditCarouselVO.CellVO.NumberPVZ toVo(AddressEditCarouselDTO.CellDTO.NumberPVZ numberPVZ) {
        AtomActionDTO action;
        TextDTO number = numberPVZ.getNumber();
        CommonControlSettings common = numberPVZ.getCommon();
        return new AddressEditCarouselVO.CellVO.NumberPVZ(number, (common == null || (action = common.getAction()) == null) ? null : AtomActionMapperKt.toAtomAction(action, numberPVZ.getCommon().getTrackingInfo()));
    }

    @NotNull
    public static final AddressEditCarouselVO.CellVO toVO(@NotNull AddressEditCarouselDTO.CellDTO cellDTO) {
        Intrinsics.checkNotNullParameter(cellDTO, "<this>");
        String title = cellDTO.getTitle();
        OzonHtmlParser.Companion companion = OzonHtmlParser.INSTANCE;
        String subtitle = cellDTO.getSubtitle();
        if (subtitle == null) {
            subtitle = "";
        }
        OzonSpannableString parseHtml$default = OzonHtmlParser.Companion.parseHtml$default(companion, subtitle, 0, 2, null);
        String image = cellDTO.getImage();
        List<BadgeDTO> badges = cellDTO.getBadges();
        AtomActionDTO action = cellDTO.getAction();
        AtomAction atomAction = action != null ? AtomActionMapperKt.toAtomAction(action, cellDTO.getTrackingInfo()) : null;
        AddressEditCarouselDTO.CellDTO.NumberPVZ numberPVZ = cellDTO.getNumberPVZ();
        return new AddressEditCarouselVO.CellVO(title, parseHtml$default, image, badges, atomAction, numberPVZ != null ? toVo(numberPVZ) : null, cellDTO.getImageTintColor());
    }
}
