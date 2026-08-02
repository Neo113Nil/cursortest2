package ru.ozon.app.android.returns.edit.presentation.comment;

import Tc.d;
import fd.InterfaceC6512o;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.app.android.returns.edit.presentation.viewObject.ReturnTextEditBlockVO;
import ru.ozon.uni.android.textArea.TextAreaView;
import ru.ozon.uni.atoms.data.AtomActionDTO;
import ru.ozon.uni.atoms.data.AtomActionMapperKt;

@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\r\n\u0000\n\u0002\u0010\b\n\u0000\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0005H\n¢\u0006\u0002\b\u0006"}, d2 = {"<anonymous>", "", "text", "", "<unused var>", "", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
final class ReturnEditCommentViewHolder$bind$1$2 extends AbstractC7737t implements InterfaceC6512o<CharSequence, Integer, Integer, Integer, Unit> {
    final /* synthetic */ ReturnTextEditBlockVO $item;
    final /* synthetic */ ReturnEditCommentView $this_with;
    final /* synthetic */ ReturnEditCommentViewHolder this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ReturnEditCommentViewHolder$bind$1$2(ReturnEditCommentView returnEditCommentView, ReturnTextEditBlockVO returnTextEditBlockVO, ReturnEditCommentViewHolder returnEditCommentViewHolder) {
        super(4);
        this.$this_with = returnEditCommentView;
        this.$item = returnTextEditBlockVO;
        this.this$0 = returnEditCommentViewHolder;
    }

    @Override // fd.InterfaceC6512o
    public /* bridge */ /* synthetic */ Unit invoke(CharSequence charSequence, Integer num, Integer num2, Integer num3) {
        invoke(charSequence, num.intValue(), num2.intValue(), num3.intValue());
        return Unit.f71690a;
    }

    public final void invoke(CharSequence charSequence, int i11, int i12, int i13) {
        Function1 function1;
        Map map;
        if (this.$this_with.getTextAreaView().hasFocus()) {
            TextAreaView textAreaView = this.$this_with.getTextAreaView();
            textAreaView.setStatus(TextAreaView.Status.NEUTRAL);
            textAreaView.setCaption(null);
            String obj = charSequence != null ? charSequence.toString() : null;
            if (obj == null) {
                obj = "";
            }
            AtomActionDTO action = this.$item.getAction();
            ReturnTextEditBlockVO returnTextEditBlockVO = this.$item;
            d builder = new d();
            builder.put("text", obj);
            Map<String, String> params = returnTextEditBlockVO.getAction().getParams();
            if (params != null) {
                builder.putAll(params);
            }
            Unit unit = Unit.f71690a;
            Intrinsics.checkNotNullParameter(builder, "builder");
            AtomActionDTO copy$default = AtomActionDTO.copy$default(action, null, null, null, builder.u(), null, 23, null);
            function1 = this.this$0.actionHandler;
            function1.invoke(AtomActionMapperKt.toAtomAction(copy$default, null));
            map = this.this$0.commentsCache;
            map.put(Long.valueOf(this.$item.getId()), obj);
        }
    }
}
