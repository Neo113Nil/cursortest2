package ru.ozon.app.android.fresh.checkout.widgets.inputForm.presentation;

import B0.C2454a;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.h;
import ru.ozon.uni.atoms.data.AtomActionDTO;
import ru.ozon.uni.atoms.data.AtomActionMapperKt;
import ru.ozon.uni.atoms.data.controls.CommonControlSettings;

@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "text", "", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
final class InputFormViewHolder$bind$1 extends AbstractC7737t implements Function1<String, Unit> {
    final /* synthetic */ InputFormVO $item;
    final /* synthetic */ InputFormViewHolder this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    InputFormViewHolder$bind$1(InputFormVO inputFormVO, InputFormViewHolder inputFormViewHolder) {
        super(1);
        this.$item = inputFormVO;
        this.this$0 = inputFormViewHolder;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(String str) {
        invoke2(str);
        return Unit.f71690a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(String text) {
        AtomActionDTO action;
        String link;
        Function1 function1;
        Intrinsics.checkNotNullParameter(text, "text");
        CommonControlSettings common = this.$item.getButton().getCommon();
        if (common == null || (action = common.getAction()) == null || (link = action.getLink()) == null) {
            return;
        }
        AtomActionDTO copy$default = AtomActionDTO.copy$default(action, null, null, null, C2454a.b(h.t(link, "applyOrderDiscountCode", false) ? "code" : "comment", text), null, 23, null);
        function1 = this.this$0.actionHandler;
        CommonControlSettings common2 = this.$item.getButton().getCommon();
        function1.invoke(AtomActionMapperKt.toAtomAction(copy$default, common2 != null ? common2.getTrackingInfo() : null));
    }
}
