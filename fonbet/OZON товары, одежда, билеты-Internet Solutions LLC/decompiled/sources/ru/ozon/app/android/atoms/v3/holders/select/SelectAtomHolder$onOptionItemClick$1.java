package ru.ozon.app.android.atoms.v3.holders.select;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.C7714v;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import ru.ozon.app.android.atoms.data.list.Select;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.AtomActionDTO;
import ru.ozon.uni.atoms.data.AtomActionMapperKt;

@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "clickIndex", "", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
final class SelectAtomHolder$onOptionItemClick$1 extends AbstractC7737t implements Function1<Integer, Unit> {
    final /* synthetic */ SelectAtomHolder this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    SelectAtomHolder$onOptionItemClick$1(SelectAtomHolder selectAtomHolder) {
        super(1);
        this.this$0 = selectAtomHolder;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(Integer num) {
        invoke(num.intValue());
        return Unit.f71690a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void invoke(int i11) {
        AtomAction atomAction;
        Select.Option option = (Select.Option) C7714v.Q(i11, ((Select) this.this$0.getData()).getOptions());
        if (option != null) {
            SelectAtomHolder selectAtomHolder = this.this$0;
            AtomActionDTO action = option.getAction();
            if (action == null || (atomAction = AtomActionMapperKt.toAtomAction(action, option.getTrackingInfo())) == null) {
                return;
            }
            selectAtomHolder.handleAction(atomAction);
        }
    }
}
