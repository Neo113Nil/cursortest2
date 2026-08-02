package ru.ozon.app.android.pdp.widgets.installmentPurchase.core.periods;

import java.util.ArrayList;
import java.util.Iterator;
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
import ru.ozon.app.android.pdp.utils.MapperExtKt;
import ru.ozon.app.android.pdp.widgets.installmentPurchase.data.InstallmentDtoWrapper$Periods;
import ru.ozon.app.android.pdp.widgets.installmentPurchase.presentation.InstallmentVO;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.AtomActionDTO;
import ru.ozon.uni.atoms.data.AtomActionMapperKt;
import ru.ozon.uni.atoms.data.dsBadge.BadgeDTO;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0001\u0018\u00002*\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u0001j\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0005`\u0006B\u0007¢\u0006\u0004\b\u0007\u0010\bJ&\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\t\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\u0003H\u0096\u0002¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lru/ozon/app/android/pdp/widgets/installmentPurchase/core/periods/InstallmentPeriodsMapper;", "Lkotlin/Function2;", "Lru/ozon/app/android/pdp/widgets/installmentPurchase/data/InstallmentDtoWrapper$Periods;", "Ll20/d;", "", "Lru/ozon/app/android/pdp/widgets/installmentPurchase/presentation/InstallmentVO$Periods;", "Lru/ozon/app/android/composer/widgets/base/WidgetMapper;", "<init>", "()V", "state", "widgetInfo", "invoke", "(Lru/ozon/app/android/pdp/widgets/installmentPurchase/data/InstallmentDtoWrapper$Periods;Ll20/d;)Ljava/util/List;", "pdp_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class InstallmentPeriodsMapper implements Function2<InstallmentDtoWrapper$Periods, d, List<? extends InstallmentVO.Periods>> {
    @Override // kotlin.jvm.functions.Function2
    @NotNull
    public List<InstallmentVO.Periods> invoke(@NotNull InstallmentDtoWrapper$Periods state, @NotNull d widgetInfo) {
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(widgetInfo, "widgetInfo");
        long widgetId = MapperExtKt.widgetId(widgetInfo);
        List<BadgeDTO> badges = state.getBadges();
        ArrayList arrayList = new ArrayList(C7714v.z(badges, 10));
        Iterator<T> it = badges.iterator();
        int i11 = 0;
        while (true) {
            if (!it.hasNext()) {
                AtomActionDTO action = state.getAction();
                AtomAction atomAction = action != null ? AtomActionMapperKt.toAtomAction(action, state.getTrackingInfo()) : null;
                Map<String, TokenizedTrackingInfo> trackingInfo = state.getTrackingInfo();
                return C7714v.a0(new InstallmentVO.Periods(widgetId, arrayList, atomAction, trackingInfo != null ? TrackingInfoMapperKt.mapToTokenizedEvent$default(trackingInfo, Long.valueOf(widgetId), null, 2, null) : null, state.getBackground()));
            }
            Object next = it.next();
            int i12 = i11 + 1;
            if (i11 < 0) {
                C7714v.O0();
                throw null;
            }
            arrayList.add(new InstallmentVO.Periods.PeriodItem(i11 + widgetId, (BadgeDTO) next));
            i11 = i12;
        }
    }
}
