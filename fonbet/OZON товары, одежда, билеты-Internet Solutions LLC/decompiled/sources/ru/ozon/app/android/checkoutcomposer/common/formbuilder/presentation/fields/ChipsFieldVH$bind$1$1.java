package ru.ozon.app.android.checkoutcomposer.common.formbuilder.presentation.fields;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.app.android.checkoutcomposer.common.formbuilder.presentation.FormBuilderBlockVO;
import ru.ozon.app.android.map.databinding.ItemFormBlockFieldChipsBinding;
import ru.ozon.uni.atoms.af.AtomAction;

@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "action", "Lru/ozon/uni/atoms/af/AtomAction;", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
final class ChipsFieldVH$bind$1$1 extends AbstractC7737t implements Function1<AtomAction, Unit> {
    final /* synthetic */ FormBuilderBlockVO.Field $item;
    final /* synthetic */ ItemFormBlockFieldChipsBinding $this_with;
    final /* synthetic */ ChipsFieldVH this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ChipsFieldVH$bind$1$1(ChipsFieldVH chipsFieldVH, FormBuilderBlockVO.Field field, ItemFormBlockFieldChipsBinding itemFormBlockFieldChipsBinding) {
        super(1);
        this.this$0 = chipsFieldVH;
        this.$item = field;
        this.$this_with = itemFormBlockFieldChipsBinding;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(AtomAction atomAction) {
        invoke2(atomAction);
        return Unit.f71690a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(AtomAction action) {
        Intrinsics.checkNotNullParameter(action, "action");
        ChipsFieldVH chipsFieldVH = this.this$0;
        FormBuilderBlockVO.Field field = this.$item;
        chipsFieldVH.onTagSelected((FormBuilderBlockVO.Field.ChipsField) field, ((FormBuilderBlockVO.Field.ChipsField) field).getChipsWithField(), action);
        this.$this_with.addressNameEt.clearFocus();
    }
}
