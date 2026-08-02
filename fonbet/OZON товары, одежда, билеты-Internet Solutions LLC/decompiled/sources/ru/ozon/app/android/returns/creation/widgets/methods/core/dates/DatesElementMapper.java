package ru.ozon.app.android.returns.creation.widgets.methods.core.dates;

import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C7714v;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import l20.d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.returns.creation.widgets.methods.data.DatesDTO;
import ru.ozon.app.android.returns.creation.widgets.methods.data.DatesElementDTO;
import ru.ozon.app.android.returns.creation.widgets.methods.presentation.Paddings;
import ru.ozon.app.android.returns.creation.widgets.methods.presentation.PaddingsKt;
import ru.ozon.app.android.returns.creation.widgets.methods.presentation.dates.DatesElementVO;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\b\b\u0001\u0018\u00002*\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u0001j\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0005`\u0006B\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u001b\u0010\u000b\u001a\u00020\u0005*\u00020\u00022\u0006\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\u000b\u0010\fJ&\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\r\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\u0003H\u0096\u0002¢\u0006\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, d2 = {"Lru/ozon/app/android/returns/creation/widgets/methods/core/dates/DatesElementMapper;", "Lkotlin/Function2;", "Lru/ozon/app/android/returns/creation/widgets/methods/data/DatesElementDTO;", "Ll20/d;", "", "Lru/ozon/app/android/returns/creation/widgets/methods/presentation/dates/DatesElementVO;", "Lru/ozon/app/android/composer/widgets/base/WidgetMapper;", "<init>", "()V", "", "id", "toVo", "(Lru/ozon/app/android/returns/creation/widgets/methods/data/DatesElementDTO;J)Lru/ozon/app/android/returns/creation/widgets/methods/presentation/dates/DatesElementVO;", "state", "widgetInfo", "invoke", "(Lru/ozon/app/android/returns/creation/widgets/methods/data/DatesElementDTO;Ll20/d;)Ljava/util/List;", "creation_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class DatesElementMapper implements Function2<DatesElementDTO, d, List<? extends DatesElementVO>> {
    private final DatesElementVO toVo(DatesElementDTO datesElementDTO, long j11) {
        Paddings vo = PaddingsKt.toVo(datesElementDTO.getPaddings());
        String backgroundColor = datesElementDTO.getBackgroundColor();
        List<DatesDTO.DateDTO> dates = datesElementDTO.getDates();
        ArrayList arrayList = new ArrayList(C7714v.z(dates, 10));
        for (DatesDTO.DateDTO dateDTO : dates) {
            arrayList.add(new DatesElementVO.DateVO(dateDTO.getWrapper(), dateDTO.getTitle(), dateDTO.getSubtitle()));
        }
        return new DatesElementVO(j11, vo, backgroundColor, arrayList);
    }

    @Override // kotlin.jvm.functions.Function2
    @NotNull
    public List<DatesElementVO> invoke(@NotNull DatesElementDTO state, @NotNull d widgetInfo) {
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(widgetInfo, "widgetInfo");
        return C7714v.a0(toVo(state, widgetInfo.d().hashCode()));
    }
}
