package ru.ozon.app.android.travel.feature.general.booking.widgets.passengersDirectory.v3.data;

import Kk.c;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C7714v;
import kotlin.collections.K;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import l20.d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.travel.feature.general.booking.widgets.passengersDirectory.v3.presentation.emptyState.PassengersDirectoryV3EmptyStateVO;
import ru.ozon.app.android.travel.molecules.mapper.MapperExtKt;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002*\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u0001j\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0005`\u0006B\u0007¢\u0006\u0004\b\u0007\u0010\bJ*\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\t\u001a\u00020\u00022\n\u0010\u000b\u001a\u00060\u0003j\u0002`\nH\u0096\u0002¢\u0006\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Lru/ozon/app/android/travel/feature/general/booking/widgets/passengersDirectory/v3/data/PassengersDirectoryV3EmptyStateMapper;", "Lkotlin/Function2;", "Lru/ozon/app/android/travel/feature/general/booking/widgets/passengersDirectory/v3/data/PassengersDirectoryV3DTO;", "Ll20/d;", "", "Lru/ozon/app/android/travel/feature/general/booking/widgets/passengersDirectory/v3/presentation/emptyState/PassengersDirectoryV3EmptyStateVO;", "Lru/ozon/app/android/composer/widgets/base/WidgetMapper;", "<init>", "()V", "dto", "Lru/ozon/app/android/composer/view/WidgetInfo;", "widgetInfo", "invoke", "(Lru/ozon/app/android/travel/feature/general/booking/widgets/passengersDirectory/v3/data/PassengersDirectoryV3DTO;Ll20/d;)Ljava/util/List;", "booking_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class PassengersDirectoryV3EmptyStateMapper implements Function2<PassengersDirectoryV3DTO, d, List<? extends PassengersDirectoryV3EmptyStateVO>> {
    @Override // kotlin.jvm.functions.Function2
    @NotNull
    public List<PassengersDirectoryV3EmptyStateVO> invoke(@NotNull PassengersDirectoryV3DTO dto, @NotNull d widgetInfo) {
        Intrinsics.checkNotNullParameter(dto, "dto");
        Intrinsics.checkNotNullParameter(widgetInfo, "widgetInfo");
        return dto.getEmptyState() == null ? K.f71697a : C7714v.a0(new PassengersDirectoryV3EmptyStateVO(c.a(widgetInfo.d(), "-EmptyState"), MapperExtKt.toVO(dto.getEmptyState())));
    }
}
