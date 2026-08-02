package ru.ozon.app.android.orderdetails.cancelReasons.presentation.reasons;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C7714v;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import l20.d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.orderdetails.cancelReasons.data.SelectCancelReasonDTO;
import ru.ozon.app.android.orderdetails.cancelReasons.presentation.models.SelectCancelReasonVO;
import ru.ozon.uni.atoms.data.dsCell.CellDTO;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0001\u0018\u00002*\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u0001j\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0005`\u0006B\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u000b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\u000b\u0010\fJ&\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\r\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\u0003H\u0096\u0002¢\u0006\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, d2 = {"Lru/ozon/app/android/orderdetails/cancelReasons/presentation/reasons/SelectCancelReasonsMapper;", "Lkotlin/Function2;", "Lru/ozon/app/android/orderdetails/cancelReasons/data/SelectCancelReasonDTO;", "Ll20/d;", "", "Lru/ozon/app/android/orderdetails/cancelReasons/presentation/models/SelectCancelReasonVO$SelectCancelReasonsVO;", "Lru/ozon/android/composerCommonViewKit/islandSeparator/core/WidgetMapper;", "<init>", "()V", "Lru/ozon/uni/atoms/data/dsCell/CellDTO;", "cell", "fixRadioButtonBehavior", "(Lru/ozon/uni/atoms/data/dsCell/CellDTO;)Lru/ozon/uni/atoms/data/dsCell/CellDTO;", "state", "widgetInfo", "invoke", "(Lru/ozon/app/android/orderdetails/cancelReasons/data/SelectCancelReasonDTO;Ll20/d;)Ljava/util/List;", "orderdetails_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class SelectCancelReasonsMapper implements Function2<SelectCancelReasonDTO, d, List<? extends SelectCancelReasonVO.SelectCancelReasonsVO>> {
    private final CellDTO fixRadioButtonBehavior(CellDTO cell) {
        CellDTO.Settings copy$default;
        CellDTO.Settings settings = cell.getSettings();
        return CellDTO.copy$default(cell, null, (settings == null || (copy$default = CellDTO.Settings.copy$default(settings, null, null, null, null, null, null, null, null, null, Boolean.TRUE, null, 1535, null)) == null) ? new CellDTO.Settings(null, null, null, null, null, null, null, null, null, Boolean.TRUE, null, 1535, null) : copy$default, null, null, null, 29, null);
    }

    @Override // kotlin.jvm.functions.Function2
    @NotNull
    public List<SelectCancelReasonVO.SelectCancelReasonsVO> invoke(@NotNull SelectCancelReasonDTO state, @NotNull d widgetInfo) {
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(widgetInfo, "widgetInfo");
        long hashCode = widgetInfo.d().hashCode();
        List<CellDTO> cancelReasons = state.getCancelReasons();
        ArrayList arrayList = new ArrayList(C7714v.z(cancelReasons, 10));
        Iterator<T> it = cancelReasons.iterator();
        while (it.hasNext()) {
            arrayList.add(fixRadioButtonBehavior((CellDTO) it.next()));
        }
        return C7714v.a0(new SelectCancelReasonVO.SelectCancelReasonsVO(hashCode, arrayList, state.getInput(), state.getDisclaimer(), state.getState(), state.getTestInfo(), widgetInfo.d().hashCode()));
    }
}
