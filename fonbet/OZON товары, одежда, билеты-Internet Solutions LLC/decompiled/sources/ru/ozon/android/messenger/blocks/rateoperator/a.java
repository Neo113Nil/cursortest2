package ru.ozon.android.messenger.blocks.rateoperator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.collections.C7714v;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.h;
import ru.ozon.android.messenger.blocks.rateoperator.RateDTO;
import ru.ozon.android.messenger.blocks.rateoperator.d;
import ru.ozon.android.messenger.framework.analytics.MessengerTrackingInfo;
import ru.ozon.uni.atoms.data.button.ButtonV3Atom;

/* loaded from: classes10.dex */
public final class a implements Function2<RateOperatorDTO, ru.ozon.android.messenger.framework.presentation.models.c, List<? extends b>> {
    @Override // kotlin.jvm.functions.Function2
    public final List<? extends b> invoke(RateOperatorDTO rateOperatorDTO, ru.ozon.android.messenger.framework.presentation.models.c cVar) {
        ArrayList arrayList;
        RateOperatorDTO state = rateOperatorDTO;
        ru.ozon.android.messenger.framework.presentation.models.c blockId = cVar;
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(blockId, "blockId");
        String title = state.getTitle();
        String rateMessage = state.getRateMessage();
        ButtonV3Atom.LargeButton sendButton = state.getSendButton();
        SuccessStateDTO successState = state.getSuccessState();
        e eVar = new e(successState.getText(), successState.getIcon());
        Map<String, MessengerTrackingInfo> trackingInfo = state.getTrackingInfo();
        List<RateDTO> rates = state.getRates();
        ArrayList arrayList2 = new ArrayList(C7714v.z(rates, 10));
        for (RateDTO rateDTO : rates) {
            int rate = rateDTO.getRate();
            String name = rateDTO.getName();
            List<RateDTO.ReasonDTO> reasons = rateDTO.getReasons();
            if (reasons != null) {
                ArrayList arrayList3 = new ArrayList();
                for (Object obj : reasons) {
                    if (!h.K(((RateDTO.ReasonDTO) obj).getName())) {
                        arrayList3.add(obj);
                    }
                }
                arrayList = new ArrayList(C7714v.z(arrayList3, 10));
                Iterator it = arrayList3.iterator();
                while (it.hasNext()) {
                    RateDTO.ReasonDTO reasonDTO = (RateDTO.ReasonDTO) it.next();
                    arrayList.add(new d.b(reasonDTO.getId(), reasonDTO.getName()));
                }
            } else {
                arrayList = null;
            }
            arrayList2.add(new d(rate, name, arrayList));
        }
        return C7714v.a0(new b(blockId, title, arrayList2, rateMessage, sendButton, eVar, trackingInfo, 0, null));
    }
}
