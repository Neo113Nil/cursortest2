package ru.ozon.app.android.travel.feature.general.booking.widgets.travelAddNewPassengerFormClearButton.data;

import T00.a;
import com.google.android.gms.common.internal.ImagesContract;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.C7714v;
import kotlin.collections.U;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import l20.d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.travel.feature.general.booking.widgets.travelAddNewPassengerFormClearButton.presentation.TravelAddNewPassengerFormClearButtonVO;
import ru.ozon.uni.atoms.data.AtomActionDTO;
import ru.ozon.uni.atoms.data.button.ButtonV3Atom;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002*\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u0001j\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0005`\u0006B\u0007¢\u0006\u0004\b\u0007\u0010\bJ*\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\t\u001a\u00020\u00022\n\u0010\u000b\u001a\u00060\u0003j\u0002`\nH\u0096\u0002¢\u0006\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Lru/ozon/app/android/travel/feature/general/booking/widgets/travelAddNewPassengerFormClearButton/data/TravelAddNewPassengerFormClearButtonMapper;", "Lkotlin/Function2;", "Lru/ozon/app/android/travel/feature/general/booking/widgets/travelAddNewPassengerFormClearButton/data/TravelAddNewPassengerFormClearButtonDTO;", "Ll20/d;", "", "Lru/ozon/app/android/travel/feature/general/booking/widgets/travelAddNewPassengerFormClearButton/presentation/TravelAddNewPassengerFormClearButtonVO;", "Lru/ozon/app/android/composer/widgets/base/WidgetMapper;", "<init>", "()V", "state", "Lru/ozon/app/android/composer/view/WidgetInfo;", "widgetInfo", "invoke", "(Lru/ozon/app/android/travel/feature/general/booking/widgets/travelAddNewPassengerFormClearButton/data/TravelAddNewPassengerFormClearButtonDTO;Ll20/d;)Ljava/util/List;", "booking_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class TravelAddNewPassengerFormClearButtonMapper implements Function2<TravelAddNewPassengerFormClearButtonDTO, d, List<? extends TravelAddNewPassengerFormClearButtonVO>> {
    @Override // kotlin.jvm.functions.Function2
    @NotNull
    public List<TravelAddNewPassengerFormClearButtonVO> invoke(@NotNull TravelAddNewPassengerFormClearButtonDTO state, @NotNull d widgetInfo) {
        String str;
        Map<String, String> params;
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(widgetInfo, "widgetInfo");
        long hashCode = widgetInfo.d().hashCode();
        ButtonV3Atom.SmallBorderlessButton clearButton = state.getClearButton();
        ButtonV3Atom.SmallBorderlessButton clearButton2 = state.getClearButton();
        AtomActionDTO action = clearButton2.getAction();
        LinkedHashMap linkedHashMap = (action == null || (params = action.getParams()) == null) ? new LinkedHashMap() : U.u(params);
        a b11 = widgetInfo.b();
        if (b11 == null || (str = b11.c()) == null) {
            str = "";
        }
        linkedHashMap.put(ImagesContract.URL, str);
        AtomActionDTO action2 = clearButton2.getAction();
        return C7714v.a0(new TravelAddNewPassengerFormClearButtonVO(hashCode, ButtonV3Atom.SmallBorderlessButton.copy$default(clearButton, null, action2 != null ? AtomActionDTO.copy$default(action2, null, null, null, linkedHashMap, null, 23, null) : null, null, null, null, null, false, 125, null)));
    }
}
