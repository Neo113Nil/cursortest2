package ru.ozon.app.android.returns.creation.widgets.reasons.presentation.reason.viewMapper;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C7714v;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import l20.d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.returns.creation.widgets.reasons.data.NestedReasonsDTO;
import ru.ozon.app.android.returns.creation.widgets.reasons.data.ReasonDTO;
import ru.ozon.app.android.returns.creation.widgets.reasons.presentation.reason.viewItem.NestedReasons;
import ru.ozon.app.android.returns.creation.widgets.reasons.presentation.reason.viewItem.ReasonVI;
import ru.ozon.app.android.returns.ui.molecules.reason.ReasonRowMapper;
import ru.ozon.app.android.returns.ui.molecules.textarea.viewObject.ReasonRow;

@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\b\u0001\u0018\u00002*\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u0001j\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0005`\u0006B\u0011\b\u0007\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u001b\u0010\u000f\u001a\u00020\u000e*\u00020\u000b2\u0006\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J&\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0011\u001a\u00020\u00022\u0006\u0010\u0012\u001a\u00020\u0003H\u0096\u0002¢\u0006\u0004\b\u0013\u0010\u0014R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u0015¨\u0006\u0016"}, d2 = {"Lru/ozon/app/android/returns/creation/widgets/reasons/presentation/reason/viewMapper/ReasonMapper;", "Lkotlin/Function2;", "Lru/ozon/app/android/returns/creation/widgets/reasons/data/ReasonDTO;", "Ll20/d;", "", "Lru/ozon/app/android/returns/creation/widgets/reasons/presentation/reason/viewItem/ReasonVI;", "Lru/ozon/app/android/composer/widgets/base/WidgetMapper;", "Lru/ozon/app/android/returns/ui/molecules/reason/ReasonRowMapper;", "reasonRowMapper", "<init>", "(Lru/ozon/app/android/returns/ui/molecules/reason/ReasonRowMapper;)V", "Lru/ozon/app/android/returns/creation/widgets/reasons/data/NestedReasonsDTO;", "", "stateId", "Lru/ozon/app/android/returns/creation/widgets/reasons/presentation/reason/viewItem/NestedReasons;", "toVo", "(Lru/ozon/app/android/returns/creation/widgets/reasons/data/NestedReasonsDTO;Ljava/lang/String;)Lru/ozon/app/android/returns/creation/widgets/reasons/presentation/reason/viewItem/NestedReasons;", "state", "widgetInfo", "invoke", "(Lru/ozon/app/android/returns/creation/widgets/reasons/data/ReasonDTO;Ll20/d;)Ljava/util/List;", "Lru/ozon/app/android/returns/ui/molecules/reason/ReasonRowMapper;", "creation_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class ReasonMapper implements Function2<ReasonDTO, d, List<? extends ReasonVI>> {

    @NotNull
    private final ReasonRowMapper reasonRowMapper;

    public ReasonMapper(@NotNull ReasonRowMapper reasonRowMapper) {
        Intrinsics.checkNotNullParameter(reasonRowMapper, "reasonRowMapper");
        this.reasonRowMapper = reasonRowMapper;
    }

    private final NestedReasons toVo(NestedReasonsDTO nestedReasonsDTO, String str) {
        List<Object> rows = nestedReasonsDTO.getRows();
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = rows.iterator();
        while (it.hasNext()) {
            ReasonRow mapToReasonRow = this.reasonRowMapper.mapToReasonRow(it.next(), str);
            if (mapToReasonRow != null) {
                arrayList.add(mapToReasonRow);
            }
        }
        return new NestedReasons(arrayList, nestedReasonsDTO.getBackgroundColor(), nestedReasonsDTO.getValidationText());
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v1, types: [ru.ozon.app.android.returns.creation.widgets.reasons.presentation.reason.viewItem.ReasonVI] */
    @Override // kotlin.jvm.functions.Function2
    @NotNull
    public List<ReasonVI> invoke(@NotNull ReasonDTO state, @NotNull d widgetInfo) {
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(widgetInfo, "widgetInfo");
        ReasonRow mapToReasonRow = this.reasonRowMapper.mapToReasonRow(state.getRow(), widgetInfo.d());
        if (mapToReasonRow != null) {
            long hashCode = widgetInfo.d().hashCode();
            NestedReasonsDTO nestedReasons = state.getNestedReasons();
            r1 = new ReasonVI(hashCode, mapToReasonRow, nestedReasons != null ? toVo(nestedReasons, widgetInfo.d()) : null);
        }
        return C7714v.c0(r1);
    }
}
