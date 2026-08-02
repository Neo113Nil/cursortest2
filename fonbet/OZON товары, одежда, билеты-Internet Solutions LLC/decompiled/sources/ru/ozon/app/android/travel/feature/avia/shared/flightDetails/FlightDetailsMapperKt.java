package ru.ozon.app.android.travel.feature.avia.shared.flightDetails;

import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import java.util.ArrayList;
import java.util.Objects;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.atoms.data.disclaimer.DisclaimerAtom;
import ru.ozon.app.android.favorites.data.favoritebutton.favoriteproduct.FavoriteProductMoleculeV4;
import ru.ozon.app.android.favorites.domain.model.FavoriteProductModelKt;
import ru.ozon.app.android.travel.feature.avia.shared.flightDetails.AviaDetailsItem;
import ru.ozon.app.android.travel.feature.avia.shared.flightDetails.FlightDetailsDTO;
import ru.ozon.uni.atoms.data.controls.CommonControlSettings;
import ru.ozon.uni.atoms.data.controls.button.IconButtonV3DTO;
import ru.ozon.uni.atoms.data.icon.IconDTO;
import ru.ozon.uni.atoms.data.text.TextDTO;

@Metadata(d1 = {"\u0000>\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\u001a\f\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u0000\u001a\u0016\u0010\u0003\u001a\u00020\u0004*\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0006H\u0000\u001a\u0014\u0010\u0000\u001a\u00020\u0007*\u00020\b2\u0006\u0010\t\u001a\u00020\u0006H\u0000\u001a\f\u0010\u0000\u001a\u00020\n*\u00020\u000bH\u0000\u001a\u0014\u0010\u0000\u001a\u00020\f*\u00020\r2\u0006\u0010\t\u001a\u00020\u0006H\u0000\u001a\u0014\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011H\u0002¨\u0006\u0012"}, d2 = {"toVO", "Lru/ozon/app/android/travel/feature/avia/shared/flightDetails/FlightDetailsVO;", "Lru/ozon/app/android/travel/feature/avia/shared/flightDetails/FlightDetailsDTO;", "toTitleVO", "Lru/ozon/app/android/travel/feature/avia/shared/flightDetails/AviaDetailsItem$TitleVO;", "position", "", "Lru/ozon/app/android/travel/feature/avia/shared/flightDetails/AviaDetailsItem$SegmentVO;", "Lru/ozon/app/android/travel/feature/avia/shared/flightDetails/FlightDetailsDTO$SegmentDTO;", "index", "Lru/ozon/app/android/travel/feature/avia/shared/flightDetails/AviaDetailsItem$SegmentVO$SegmentInfoVO;", "Lru/ozon/app/android/travel/feature/avia/shared/flightDetails/FlightDetailsDTO$SegmentInfoDTO;", "Lru/ozon/app/android/travel/feature/avia/shared/flightDetails/AviaDetailsItem$NoteVO;", "Lru/ozon/app/android/travel/feature/avia/shared/flightDetails/FlightDetailsDTO$NoteDTO;", "mapButton", "Lru/ozon/app/android/travel/feature/avia/shared/flightDetails/AviaDetailsItem$TitleVO$ButtonType;", "button", "", "avia_prodGoogleAllVendorsRelease"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class FlightDetailsMapperKt {
    private static final AviaDetailsItem.TitleVO.ButtonType mapButton(Object obj) {
        if (obj instanceof FavoriteProductMoleculeV4) {
            return new AviaDetailsItem.TitleVO.ButtonType.FavoriteButton(FavoriteProductModelKt.toModel((FavoriteProductMoleculeV4) obj));
        }
        if (obj instanceof IconButtonV3DTO) {
            return new AviaDetailsItem.TitleVO.ButtonType.IconButton((IconButtonV3DTO) obj);
        }
        return null;
    }

    @NotNull
    public static final AviaDetailsItem.TitleVO toTitleVO(@NotNull FlightDetailsDTO flightDetailsDTO, int i11) {
        Intrinsics.checkNotNullParameter(flightDetailsDTO, "<this>");
        int hash = Objects.hash(flightDetailsDTO.getTitle().getText(), Integer.valueOf(i11));
        TextDTO title = flightDetailsDTO.getTitle();
        TextDTO subtitle = flightDetailsDTO.getSubtitle();
        IconButtonV3DTO sharingButton = flightDetailsDTO.getSharingButton();
        AviaDetailsItem.TitleVO.ButtonType mapButton = mapButton(flightDetailsDTO.getFavoriteButton());
        CommonControlSettings favoriteModalAction = flightDetailsDTO.getFavoriteModalAction();
        return new AviaDetailsItem.TitleVO(hash, title, subtitle, sharingButton, mapButton, favoriteModalAction != null ? favoriteModalAction.toAtomAction() : null);
    }

    @NotNull
    public static final FlightDetailsVO toVO(@NotNull FlightDetailsDTO flightDetailsDTO) {
        Intrinsics.checkNotNullParameter(flightDetailsDTO, "<this>");
        ArrayList arrayList = new ArrayList();
        arrayList.add(toTitleVO(flightDetailsDTO, arrayList.size()));
        for (FlightDetailsDTO.SegmentDTO segmentDTO : flightDetailsDTO.getSegments()) {
            arrayList.add(toVO(segmentDTO, arrayList.size()));
            FlightDetailsDTO.NoteDTO segmentNote = segmentDTO.getSegmentNote();
            if (segmentNote != null) {
                arrayList.add(toVO(segmentNote, arrayList.size()));
            }
        }
        DisclaimerAtom annotation = flightDetailsDTO.getAnnotation();
        if (annotation != null) {
            arrayList.add(new AviaDetailsItem.AnnotationVO(arrayList.size(), annotation));
        }
        return new FlightDetailsVO(arrayList, flightDetailsDTO.getAreTopCornersRounded(), flightDetailsDTO.getAreTopCornersRounded());
    }

    @NotNull
    public static final AviaDetailsItem.SegmentVO toVO(@NotNull FlightDetailsDTO.SegmentDTO segmentDTO, int i11) {
        IconDTO iconDTO;
        Intrinsics.checkNotNullParameter(segmentDTO, "<this>");
        IconDTO airlineLogo = segmentDTO.getAirlineLogo();
        IconDTO subAirlineLogo = segmentDTO.getSubAirlineLogo();
        if (subAirlineLogo != null) {
            iconDTO = subAirlineLogo.copy((r34 & 1) != 0 ? subAirlineLogo.size : IconDTO.IconSize.SIZE_200, (r34 & 2) != 0 ? subAirlineLogo.hasShape : null, (r34 & 4) != 0 ? subAirlineLogo.shape : null, (r34 & 8) != 0 ? subAirlineLogo.text : null, (r34 & 16) != 0 ? subAirlineLogo.icon : null, (r34 & 32) != 0 ? subAirlineLogo.backgroundImage : null, (r34 & 64) != 0 ? subAirlineLogo.backgroundColor : null, (r34 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0 ? subAirlineLogo.textColor : null, (r34 & 256) != 0 ? subAirlineLogo.textStyle : null, (r34 & UserVerificationMethods.USER_VERIFY_NONE) != 0 ? subAirlineLogo.borderColor : null, (r34 & UserVerificationMethods.USER_VERIFY_ALL) != 0 ? subAirlineLogo.borderWidth : null, (r34 & 2048) != 0 ? subAirlineLogo.isBorderInside : null, (r34 & 4096) != 0 ? subAirlineLogo.hasParanja : null, (r34 & 8192) != 0 ? subAirlineLogo.getContext() : null, (r34 & 16384) != 0 ? subAirlineLogo.getTestInfo() : null, (r34 & 32768) != 0 ? subAirlineLogo.getTrackingInfo() : null);
        } else {
            iconDTO = null;
        }
        IconDTO iconDTO2 = iconDTO;
        TextDTO airline = segmentDTO.getAirline();
        airline.setTagSupported(true);
        Unit unit = Unit.f71690a;
        return new AviaDetailsItem.SegmentVO(i11, airlineLogo, iconDTO2, airline, segmentDTO.getSegmentDuration(), segmentDTO.getSegmentAirplane(), segmentDTO.getSegmentBadge(), toVO(segmentDTO.getSegmentDeparture()), toVO(segmentDTO.getSegmentArrival()), segmentDTO.getLuggageBadges());
    }

    @NotNull
    public static final AviaDetailsItem.SegmentVO.SegmentInfoVO toVO(@NotNull FlightDetailsDTO.SegmentInfoDTO segmentInfoDTO) {
        Intrinsics.checkNotNullParameter(segmentInfoDTO, "<this>");
        return new AviaDetailsItem.SegmentVO.SegmentInfoVO(segmentInfoDTO.getTime(), segmentInfoDTO.getDate(), segmentInfoDTO.getCity(), segmentInfoDTO.getAirport());
    }

    @NotNull
    public static final AviaDetailsItem.NoteVO toVO(@NotNull FlightDetailsDTO.NoteDTO noteDTO, int i11) {
        Intrinsics.checkNotNullParameter(noteDTO, "<this>");
        return new AviaDetailsItem.NoteVO(i11, noteDTO.getCell(), noteDTO.getBackgroundColor());
    }
}
