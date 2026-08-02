package ru.ozon.app.android.travel.feature.general.common.widgets.milesForBuyersModalInfo.data;

import Ih.a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C7714v;
import kotlin.collections.K;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import l20.d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.travel.feature.general.common.widgets.milesForBuyersModalInfo.data.MilesForBuyersModalInfoDTO;
import ru.ozon.app.android.travel.feature.general.common.widgets.milesForBuyersModalInfo.presentation.overlay.MilesForBuyersModalInfoButtonsVO;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0001\u0018\u00002*\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u0001j\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0005`\u0006B\u0007¢\u0006\u0004\b\u0007\u0010\bJ&\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\t\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\u0003H\u0096\u0002¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lru/ozon/app/android/travel/feature/general/common/widgets/milesForBuyersModalInfo/data/MilesForBuyersModalInfoButtonsMapper;", "Lkotlin/Function2;", "Lru/ozon/app/android/travel/feature/general/common/widgets/milesForBuyersModalInfo/data/MilesForBuyersModalInfoDTO;", "Ll20/d;", "", "Lru/ozon/app/android/travel/feature/general/common/widgets/milesForBuyersModalInfo/presentation/overlay/MilesForBuyersModalInfoButtonsVO;", "Lru/ozon/app/android/composer/widgets/base/WidgetMapper;", "<init>", "()V", "state", "widgetInfo", "invoke", "(Lru/ozon/app/android/travel/feature/general/common/widgets/milesForBuyersModalInfo/data/MilesForBuyersModalInfoDTO;Ll20/d;)Ljava/util/List;", "common_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class MilesForBuyersModalInfoButtonsMapper implements Function2<MilesForBuyersModalInfoDTO, d, List<? extends MilesForBuyersModalInfoButtonsVO>> {
    @Override // kotlin.jvm.functions.Function2
    @NotNull
    public List<MilesForBuyersModalInfoButtonsVO> invoke(@NotNull MilesForBuyersModalInfoDTO state, @NotNull d widgetInfo) {
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(widgetInfo, "widgetInfo");
        if (state.getStickyButtons().isEmpty()) {
            return K.f71697a;
        }
        long a11 = a.a("buttons-", widgetInfo.d());
        List<MilesForBuyersModalInfoDTO.ButtonWrapper> stickyButtons = state.getStickyButtons();
        ArrayList arrayList = new ArrayList(C7714v.z(stickyButtons, 10));
        Iterator<T> it = stickyButtons.iterator();
        while (it.hasNext()) {
            arrayList.add(((MilesForBuyersModalInfoDTO.ButtonWrapper) it.next()).m1246unboximpl());
        }
        return C7714v.a0(new MilesForBuyersModalInfoButtonsVO(a11, arrayList, state.getBodyContainer().getBackgroundColor()));
    }
}
