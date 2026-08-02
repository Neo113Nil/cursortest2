package ru.ozon.app.android.travel.feature.general.booking.widgets.passengersDirectory.v3.data;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.C7714v;
import kotlin.collections.K;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.h;
import l20.d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.travel.feature.general.booking.widgets.passengersDirectory.v3.data.PassengersDirectoryV3DTO;
import ru.ozon.app.android.travel.feature.general.booking.widgets.passengersDirectory.v3.presentation.category.PassengersDirectoryV3CategoryVO;
import ru.ozon.app.android.travel.molecules.extensions.DsCellExtensionsKt;
import ru.ozon.uni.atoms.data.dsCell.CellDTO;
import ru.ozon.uni.atoms.data.text.TextDTO;
import ru.ozon.uni.atoms.utils.OzonSpannableString;

@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002*\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u0001j\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0005`\u0006B\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\f\u0010\rJ*\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\n\u001a\u00020\u00022\n\u0010\u000f\u001a\u00060\u0003j\u0002`\u000eH\u0096\u0002¢\u0006\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"Lru/ozon/app/android/travel/feature/general/booking/widgets/passengersDirectory/v3/data/PassengersDirectoryV3CategoryMapper;", "Lkotlin/Function2;", "Lru/ozon/app/android/travel/feature/general/booking/widgets/passengersDirectory/v3/data/PassengersDirectoryV3DTO;", "Ll20/d;", "", "Lru/ozon/app/android/travel/feature/general/booking/widgets/passengersDirectory/v3/presentation/category/PassengersDirectoryV3CategoryVO;", "Lru/ozon/app/android/composer/widgets/base/WidgetMapper;", "<init>", "()V", "Lru/ozon/app/android/travel/feature/general/booking/widgets/passengersDirectory/v3/data/PassengersDirectoryV3DTO$PassengerV3DTO;", "dto", "Lru/ozon/app/android/travel/feature/general/booking/widgets/passengersDirectory/v3/presentation/category/PassengersDirectoryV3CategoryVO$PassengerV3VO;", "mapPassenger", "(Lru/ozon/app/android/travel/feature/general/booking/widgets/passengersDirectory/v3/data/PassengersDirectoryV3DTO$PassengerV3DTO;)Lru/ozon/app/android/travel/feature/general/booking/widgets/passengersDirectory/v3/presentation/category/PassengersDirectoryV3CategoryVO$PassengerV3VO;", "Lru/ozon/app/android/composer/view/WidgetInfo;", "widgetInfo", "invoke", "(Lru/ozon/app/android/travel/feature/general/booking/widgets/passengersDirectory/v3/data/PassengersDirectoryV3DTO;Ll20/d;)Ljava/util/List;", "booking_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class PassengersDirectoryV3CategoryMapper implements Function2<PassengersDirectoryV3DTO, d, List<? extends PassengersDirectoryV3CategoryVO>> {
    private final PassengersDirectoryV3CategoryVO.PassengerV3VO mapPassenger(PassengersDirectoryV3DTO.PassengerV3DTO dto) {
        long hashCode;
        Long y02 = h.y0(dto.getId());
        if (y02 != null) {
            hashCode = y02.longValue();
        } else {
            OzonSpannableString text = dto.getPassenger().getCenterBlock().getTitle().getText();
            CellDTO.CellText subtitle = dto.getPassenger().getCenterBlock().getSubtitle();
            hashCode = (((Object) text) + "-" + ((Object) (subtitle != null ? subtitle.getText() : null))).hashCode();
        }
        CellDTO passenger = dto.getPassenger();
        passenger.setTagSupported(true);
        Unit unit = Unit.f71690a;
        return new PassengersDirectoryV3CategoryVO.PassengerV3VO(hashCode, DsCellExtensionsKt.disableAutoToggle(passenger));
    }

    @Override // kotlin.jvm.functions.Function2
    @NotNull
    public List<PassengersDirectoryV3CategoryVO> invoke(@NotNull PassengersDirectoryV3DTO dto, @NotNull d widgetInfo) {
        Intrinsics.checkNotNullParameter(dto, "dto");
        Intrinsics.checkNotNullParameter(widgetInfo, "widgetInfo");
        if (dto.getCategories().isEmpty()) {
            return K.f71697a;
        }
        List<PassengersDirectoryV3DTO.CategoryDTO> categories = dto.getCategories();
        ArrayList arrayList = new ArrayList(C7714v.z(categories, 10));
        int i11 = 0;
        for (Object obj : categories) {
            int i12 = i11 + 1;
            if (i11 < 0) {
                C7714v.O0();
                throw null;
            }
            PassengersDirectoryV3DTO.CategoryDTO categoryDTO = (PassengersDirectoryV3DTO.CategoryDTO) obj;
            long hashCode = (i11 + widgetInfo.d()).hashCode();
            TextDTO title = categoryDTO.getTitle();
            boolean isSelectedPassengerUnsuitable = dto.isSelectedPassengerUnsuitable();
            List<PassengersDirectoryV3DTO.PassengerV3DTO> passengers = categoryDTO.getPassengers();
            ArrayList arrayList2 = new ArrayList(C7714v.z(passengers, 10));
            Iterator<T> it = passengers.iterator();
            while (it.hasNext()) {
                arrayList2.add(mapPassenger((PassengersDirectoryV3DTO.PassengerV3DTO) it.next()));
            }
            arrayList.add(new PassengersDirectoryV3CategoryVO(hashCode, title, arrayList2, isSelectedPassengerUnsuitable));
            i11 = i12;
        }
        return arrayList;
    }
}
