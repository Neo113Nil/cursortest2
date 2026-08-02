package ru.ozon.app.android.travel.feature.general.booking.widgets.passengersDirectory.v2.data;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C7714v;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import l20.d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.travel.feature.general.booking.widgets.passengersDirectory.v2.data.PassengersDirectoryV2DTO;
import ru.ozon.app.android.travel.feature.general.booking.widgets.passengersDirectory.v2.presentation.PassengersDirectoryV2VO;
import ru.ozon.app.android.travel.molecules.dto.commonInput.v1.CommonInputDTO;
import ru.ozon.app.android.travel.molecules.dto.linkButton.LinkButtonDTO;
import ru.ozon.app.android.travel.molecules.dto.themeImage.v1.ThemeImageV1DTO;
import ru.ozon.app.android.travel.molecules.input.v1.CommonInputVO;
import ru.ozon.app.android.travel.molecules.input.v1.mapper.CommonInputMapperKt;
import ru.ozon.app.android.travel.molecules.mapper.MapperExtKt;
import ru.ozon.uni.atoms.data.AtomActionMapperKt;
import ru.ozon.uni.atoms.data.texts.TextAtom;
import ru.ozon.uni.atoms.utils.OzonSpannableString;

@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002*\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u0001j\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0005`\u0006B\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\n\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J*\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\n\u001a\u00020\u00022\n\u0010\u0013\u001a\u00060\u0003j\u0002`\u0012H\u0096\u0002¢\u0006\u0004\b\u0014\u0010\u0015¨\u0006\u0016"}, d2 = {"Lru/ozon/app/android/travel/feature/general/booking/widgets/passengersDirectory/v2/data/PassengersDirectoryV2Mapper;", "Lkotlin/Function2;", "Lru/ozon/app/android/travel/feature/general/booking/widgets/passengersDirectory/v2/data/PassengersDirectoryV2DTO;", "Ll20/d;", "", "Lru/ozon/app/android/travel/feature/general/booking/widgets/passengersDirectory/v2/presentation/PassengersDirectoryV2VO;", "Lru/ozon/app/android/composer/widgets/base/WidgetMapper;", "<init>", "()V", "Lru/ozon/app/android/travel/feature/general/booking/widgets/passengersDirectory/v2/data/PassengersDirectoryV2DTO$PassengerV2DTO;", "dto", "Lru/ozon/app/android/travel/feature/general/booking/widgets/passengersDirectory/v2/presentation/PassengersDirectoryV2VO$PassengerV2VO;", "mapPassenger", "(Lru/ozon/app/android/travel/feature/general/booking/widgets/passengersDirectory/v2/data/PassengersDirectoryV2DTO$PassengerV2DTO;)Lru/ozon/app/android/travel/feature/general/booking/widgets/passengersDirectory/v2/presentation/PassengersDirectoryV2VO$PassengerV2VO;", "Lru/ozon/app/android/travel/feature/general/booking/widgets/passengersDirectory/v2/data/PassengersDirectoryV2DTO$StubDTO;", "Lru/ozon/app/android/travel/feature/general/booking/widgets/passengersDirectory/v2/presentation/PassengersDirectoryV2VO$StubV2VO;", "mapEmptyState", "(Lru/ozon/app/android/travel/feature/general/booking/widgets/passengersDirectory/v2/data/PassengersDirectoryV2DTO$StubDTO;)Lru/ozon/app/android/travel/feature/general/booking/widgets/passengersDirectory/v2/presentation/PassengersDirectoryV2VO$StubV2VO;", "Lru/ozon/app/android/composer/view/WidgetInfo;", "widgetInfo", "invoke", "(Lru/ozon/app/android/travel/feature/general/booking/widgets/passengersDirectory/v2/data/PassengersDirectoryV2DTO;Ll20/d;)Ljava/util/List;", "booking_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class PassengersDirectoryV2Mapper implements Function2<PassengersDirectoryV2DTO, d, List<? extends PassengersDirectoryV2VO>> {
    private final PassengersDirectoryV2VO.StubV2VO mapEmptyState(PassengersDirectoryV2DTO.StubDTO dto) {
        OzonSpannableString text = dto.getHeader().getText();
        OzonSpannableString text2 = dto.getExplanation().getText();
        StringBuilder sb2 = new StringBuilder();
        sb2.append((Object) text);
        sb2.append((Object) text2);
        long hashCode = sb2.toString().hashCode();
        ThemeImageV1DTO image = dto.getImage();
        TextAtom header = dto.getHeader();
        TextAtom explanation = dto.getExplanation();
        LinkButtonDTO resetSearch = dto.getResetSearch();
        return new PassengersDirectoryV2VO.StubV2VO(hashCode, image, header, explanation, resetSearch != null ? MapperExtKt.toVO(resetSearch) : null);
    }

    private final PassengersDirectoryV2VO.PassengerV2VO mapPassenger(PassengersDirectoryV2DTO.PassengerV2DTO dto) {
        OzonSpannableString text = dto.getFullName().getText();
        OzonSpannableString text2 = dto.getPersonalInfo().getText();
        String searchInKeys = dto.getSearchInKeys();
        return new PassengersDirectoryV2VO.PassengerV2VO((((Object) text) + ((Object) text2) + searchInKeys).hashCode(), dto.getFullName(), dto.getPersonalInfo(), AtomActionMapperKt.toAtomAction(dto.getAction(), dto.getTrackingInfo()), dto.getAdditionalActions(), dto.getSearchInKeys());
    }

    @Override // kotlin.jvm.functions.Function2
    @NotNull
    public List<PassengersDirectoryV2VO> invoke(@NotNull PassengersDirectoryV2DTO dto, @NotNull d widgetInfo) {
        Intrinsics.checkNotNullParameter(dto, "dto");
        Intrinsics.checkNotNullParameter(widgetInfo, "widgetInfo");
        long hashCode = widgetInfo.d().hashCode();
        CommonInputDTO search = dto.getSearch();
        Object vO$default = search != null ? CommonInputMapperKt.toVO$default(search, Boolean.TRUE, Long.valueOf(hashCode), 0, null, 12, null) : null;
        CommonInputVO.TextCommonInputVO textCommonInputVO = vO$default instanceof CommonInputVO.TextCommonInputVO ? (CommonInputVO.TextCommonInputVO) vO$default : null;
        boolean z11 = textCommonInputVO != null;
        boolean isSelectedPassengerUnsuitable = dto.isSelectedPassengerUnsuitable();
        List<PassengersDirectoryV2DTO.PassengerV2DTO> passengers = dto.getPassengers();
        ArrayList arrayList = new ArrayList(C7714v.z(passengers, 10));
        Iterator<T> it = passengers.iterator();
        while (it.hasNext()) {
            arrayList.add(mapPassenger((PassengersDirectoryV2DTO.PassengerV2DTO) it.next()));
        }
        return C7714v.a0(new PassengersDirectoryV2VO(hashCode, z11, textCommonInputVO, isSelectedPassengerUnsuitable, arrayList, mapEmptyState(dto.getEmptyState())));
    }
}
