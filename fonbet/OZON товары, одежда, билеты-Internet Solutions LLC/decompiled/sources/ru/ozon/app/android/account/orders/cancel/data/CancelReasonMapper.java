package ru.ozon.app.android.account.orders.cancel.data;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.C7714v;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.account.orders.cancel.presentation.CancelReasonVO;
import ru.ozon.app.android.atoms.data.cells.CellAtom;
import ru.ozon.app.android.atoms.data.disclaimer.DisclaimerAtom;
import ru.ozon.app.android.delivery.customActionsHandlers.fetchcancelreasons.data.CancelReasonsDTO;
import ru.ozon.uni.atoms.data.AtomActionDTO;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0014\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0007\u001a\u00020\bJ\u000e\u0010\t\u001a\u0004\u0018\u00010\n*\u00020\u000bH\u0002¨\u0006\f"}, d2 = {"Lru/ozon/app/android/account/orders/cancel/data/CancelReasonMapper;", "", "<init>", "()V", "map", "", "Lru/ozon/app/android/account/orders/cancel/presentation/CancelReasonVO;", "cancelReasons", "Lru/ozon/app/android/delivery/customActionsHandlers/fetchcancelreasons/data/CancelReasonsDTO;", "toReason", "Lru/ozon/app/android/account/orders/cancel/presentation/CancelReasonVO$Reason;", "Lru/ozon/app/android/atoms/data/cells/CellAtom$CellAtomWithSubtitle$CellWithSubtitleCheckboxRadio;", "cs-orders_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class CancelReasonMapper {
    private final CancelReasonVO.Reason toReason(CellAtom.CellAtomWithSubtitle.CellWithSubtitleCheckboxRadio cellWithSubtitleCheckboxRadio) {
        Map<String, String> params;
        String str;
        AtomActionDTO action = cellWithSubtitleCheckboxRadio.getAction();
        if (action == null || (params = action.getParams()) == null || (str = params.get("reasonId")) == null) {
            return null;
        }
        return new CancelReasonVO.Reason(cellWithSubtitleCheckboxRadio, str);
    }

    @NotNull
    public final List<CancelReasonVO> map(@NotNull CancelReasonsDTO cancelReasons) {
        Intrinsics.checkNotNullParameter(cancelReasons, "cancelReasons");
        ArrayList arrayList = new ArrayList();
        List<CellAtom.CellAtomWithSubtitle.CellWithSubtitleCheckboxRadio> reasons = cancelReasons.getReasons();
        ArrayList arrayList2 = new ArrayList();
        Iterator<T> it = reasons.iterator();
        while (it.hasNext()) {
            CancelReasonVO.Reason reason = toReason((CellAtom.CellAtomWithSubtitle.CellWithSubtitleCheckboxRadio) it.next());
            if (reason != null) {
                arrayList2.add(reason);
            }
        }
        C7714v.p(arrayList2, arrayList);
        arrayList.add(new CancelReasonVO.Comment(null, cancelReasons.getInput().getHint(), !Intrinsics.d(cancelReasons.getInput().getShowAlways(), Boolean.TRUE)));
        DisclaimerAtom annotation = cancelReasons.getAnnotation();
        if (annotation != null) {
            arrayList.add(new CancelReasonVO.Annotation(annotation));
        }
        return arrayList;
    }
}
