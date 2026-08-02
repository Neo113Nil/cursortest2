package ru.ozon.app.android.atoms.v3.holders.cells.subtitled;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;
import ru.ozon.app.android.atoms.data.cells.CellAtom;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.AtomActionDTO;
import ru.ozon.uni.atoms.data.AtomActionMapperKt;

@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
final class CellWithSubtitleDefaultHolder$onBind$1 extends AbstractC7737t implements Function0<Unit> {
    final /* synthetic */ CellWithSubtitleDefaultHolder this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    CellWithSubtitleDefaultHolder$onBind$1(CellWithSubtitleDefaultHolder cellWithSubtitleDefaultHolder) {
        super(0);
        this.this$0 = cellWithSubtitleDefaultHolder;
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.f71690a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        AtomAction atomAction;
        CellAtom.CellAtomWithSubtitle.CellWithSubtitleDefault cellWithSubtitleDefault = (CellAtom.CellAtomWithSubtitle.CellWithSubtitleDefault) this.this$0.getData();
        AtomActionDTO action = cellWithSubtitleDefault.getAction();
        if (action == null || (atomAction = AtomActionMapperKt.toAtomAction(action, cellWithSubtitleDefault.getTrackingInfo())) == null) {
            return;
        }
        this.this$0.handleAction(atomAction);
    }
}
