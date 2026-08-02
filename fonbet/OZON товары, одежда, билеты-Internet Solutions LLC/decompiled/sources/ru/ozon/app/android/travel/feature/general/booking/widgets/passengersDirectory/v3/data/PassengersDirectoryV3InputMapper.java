package ru.ozon.app.android.travel.feature.general.booking.widgets.passengersDirectory.v3.data;

import Kk.c;
import WZ.t;
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
import ru.ozon.app.android.travel.feature.general.booking.widgets.passengersDirectory.v3.data.PassengersDirectoryV3DTO;
import ru.ozon.app.android.travel.feature.general.booking.widgets.passengersDirectory.v3.presentation.input.PassengersDirectoryV3InputVO;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.AtomActionDTO;
import ru.ozon.uni.atoms.data.AtomActionMapperKt;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002*\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u0001j\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0005`\u0006B\u0007¢\u0006\u0004\b\u0007\u0010\bJ*\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\t\u001a\u00020\u00022\n\u0010\u000b\u001a\u00060\u0003j\u0002`\nH\u0096\u0002¢\u0006\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Lru/ozon/app/android/travel/feature/general/booking/widgets/passengersDirectory/v3/data/PassengersDirectoryV3InputMapper;", "Lkotlin/Function2;", "Lru/ozon/app/android/travel/feature/general/booking/widgets/passengersDirectory/v3/data/PassengersDirectoryV3DTO;", "Ll20/d;", "", "Lru/ozon/app/android/travel/feature/general/booking/widgets/passengersDirectory/v3/presentation/input/PassengersDirectoryV3InputVO;", "Lru/ozon/app/android/composer/widgets/base/WidgetMapper;", "<init>", "()V", "dto", "Lru/ozon/app/android/composer/view/WidgetInfo;", "widgetInfo", "invoke", "(Lru/ozon/app/android/travel/feature/general/booking/widgets/passengersDirectory/v3/data/PassengersDirectoryV3DTO;Ll20/d;)Ljava/util/List;", "booking_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class PassengersDirectoryV3InputMapper implements Function2<PassengersDirectoryV3DTO, d, List<? extends PassengersDirectoryV3InputVO>> {
    @Override // kotlin.jvm.functions.Function2
    @NotNull
    public List<PassengersDirectoryV3InputVO> invoke(@NotNull PassengersDirectoryV3DTO dto, @NotNull d widgetInfo) {
        Map<String, TokenizedTrackingInfo> trackingInfo;
        AtomActionDTO action;
        Intrinsics.checkNotNullParameter(dto, "dto");
        Intrinsics.checkNotNullParameter(widgetInfo, "widgetInfo");
        long a11 = c.a(widgetInfo.d(), "-Input");
        PassengersDirectoryV3DTO.SearchInputDTO searchInput = dto.getSearchInput();
        t tVar = null;
        AtomAction atomAction = (searchInput == null || (action = searchInput.getAction()) == null) ? null : AtomActionMapperKt.toAtomAction(action, null);
        PassengersDirectoryV3DTO.SearchInputDTO searchInput2 = dto.getSearchInput();
        String placeholder = searchInput2 != null ? searchInput2.getPlaceholder() : null;
        PassengersDirectoryV3DTO.SearchInputDTO searchInput3 = dto.getSearchInput();
        if (searchInput3 != null && (trackingInfo = searchInput3.getTrackingInfo()) != null) {
            tVar = TrackingInfoMapperKt.toTokenizedEvent$default(trackingInfo, Long.valueOf(a11), null, 2, null);
        }
        return C7714v.a0(new PassengersDirectoryV3InputVO(a11, placeholder, atomAction, tVar));
    }
}
