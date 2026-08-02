package ru.ozon.app.android.fresh.feature.b2b.widgets.consigneeList.data;

import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C7714v;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import l20.d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.fresh.feature.b2b.widgets.consigneeList.data.ConsigneeListDTO;
import ru.ozon.app.android.fresh.feature.b2b.widgets.consigneeList.presentation.ConsigneeItemVO;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0001\u0018\u00002*\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u0001j\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0005`\u0006B\u0007¢\u0006\u0004\b\u0007\u0010\bJ&\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\t\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\u0003H\u0096\u0002¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lru/ozon/app/android/fresh/feature/b2b/widgets/consigneeList/data/ConsigneeListMapper;", "Lkotlin/Function2;", "Lru/ozon/app/android/fresh/feature/b2b/widgets/consigneeList/data/ConsigneeListDTO;", "Ll20/d;", "", "Lru/ozon/app/android/fresh/feature/b2b/widgets/consigneeList/presentation/ConsigneeItemVO;", "Lru/ozon/app/android/composer/widgets/base/WidgetMapper;", "<init>", "()V", "state", "widgetInfo", "invoke", "(Lru/ozon/app/android/fresh/feature/b2b/widgets/consigneeList/data/ConsigneeListDTO;Ll20/d;)Ljava/util/List;", "b2b_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class ConsigneeListMapper implements Function2<ConsigneeListDTO, d, List<? extends ConsigneeItemVO>> {
    @Override // kotlin.jvm.functions.Function2
    @NotNull
    public List<ConsigneeItemVO> invoke(@NotNull ConsigneeListDTO state, @NotNull d widgetInfo) {
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(widgetInfo, "widgetInfo");
        List<ConsigneeListDTO.Consignee> consignees = state.getConsignees();
        ArrayList arrayList = new ArrayList(C7714v.z(consignees, 10));
        int i11 = 0;
        for (Object obj : consignees) {
            int i12 = i11 + 1;
            if (i11 < 0) {
                C7714v.O0();
                throw null;
            }
            ConsigneeListDTO.Consignee consignee = (ConsigneeListDTO.Consignee) obj;
            arrayList.add(new ConsigneeItemVO(consignee.hashCode(), consignee.getName(), consignee.getIconButton(), consignee.getRequisites(), consignee.getBadge(), C7714v.P(state.getConsignees()) != i11));
            i11 = i12;
        }
        return arrayList;
    }
}
