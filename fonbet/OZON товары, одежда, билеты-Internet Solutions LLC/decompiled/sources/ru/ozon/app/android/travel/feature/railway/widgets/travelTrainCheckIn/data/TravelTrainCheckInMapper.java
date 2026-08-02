package ru.ozon.app.android.travel.feature.railway.widgets.travelTrainCheckIn.data;

import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C7714v;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import l20.d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.travel.feature.railway.widgets.travelTrainCheckIn.presentation.TravelTrainCheckInVO;
import ru.ozon.uni.atoms.data.AtomDTO;
import ru.ozon.uni.atoms.data.texts.TextAtom;

@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002*\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u0001j\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0005`\u0006B\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u001d\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u00042\u0006\u0010\t\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u000b\u0010\fJ*\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\t\u001a\u00020\u00022\n\u0010\u000e\u001a\u00060\u0003j\u0002`\rH\u0096\u0002¢\u0006\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, d2 = {"Lru/ozon/app/android/travel/feature/railway/widgets/travelTrainCheckIn/data/TravelTrainCheckInMapper;", "Lkotlin/Function2;", "Lru/ozon/app/android/travel/feature/railway/widgets/travelTrainCheckIn/data/TravelTrainCheckInDTO;", "Ll20/d;", "", "Lru/ozon/app/android/travel/feature/railway/widgets/travelTrainCheckIn/presentation/TravelTrainCheckInVO;", "Lru/ozon/app/android/composer/widgets/base/WidgetMapper;", "<init>", "()V", "state", "Lru/ozon/uni/atoms/data/AtomDTO;", "mapAtoms", "(Lru/ozon/app/android/travel/feature/railway/widgets/travelTrainCheckIn/data/TravelTrainCheckInDTO;)Ljava/util/List;", "Lru/ozon/app/android/composer/view/WidgetInfo;", "widgetInfo", "invoke", "(Lru/ozon/app/android/travel/feature/railway/widgets/travelTrainCheckIn/data/TravelTrainCheckInDTO;Ll20/d;)Ljava/util/List;", "railway_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class TravelTrainCheckInMapper implements Function2<TravelTrainCheckInDTO, d, List<? extends TravelTrainCheckInVO>> {
    private final List<AtomDTO> mapAtoms(TravelTrainCheckInDTO state) {
        ArrayList arrayList = new ArrayList();
        TextAtom title = state.getTitle();
        if (title != null) {
            arrayList.add(title);
        }
        arrayList.addAll(state.getPassengersList());
        arrayList.add(state.getCheckInButton().getMobileButton());
        arrayList.add(state.getCancelButton().getMobileButton());
        return arrayList;
    }

    @Override // kotlin.jvm.functions.Function2
    @NotNull
    public List<TravelTrainCheckInVO> invoke(@NotNull TravelTrainCheckInDTO state, @NotNull d widgetInfo) {
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(widgetInfo, "widgetInfo");
        long hashCode = state.hashCode();
        List<AtomDTO> mapAtoms = mapAtoms(state);
        List<String> errors = state.getErrors();
        return C7714v.a0(new TravelTrainCheckInVO(hashCode, mapAtoms, errors != null ? C7714v.V(errors, "\n", null, null, null, 62) : null));
    }
}
