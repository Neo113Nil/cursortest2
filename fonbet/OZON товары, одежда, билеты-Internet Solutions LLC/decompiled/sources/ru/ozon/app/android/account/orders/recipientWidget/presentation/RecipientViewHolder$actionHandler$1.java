package ru.ozon.app.android.account.orders.recipientWidget.presentation;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.app.android.cs_orders.databinding.WidgetRecipientBinding;
import ru.ozon.app.android.utils.KeyboardUtilsKt;
import ru.ozon.uni.android.controls.buttonV3.ButtonV3View;
import ru.ozon.uni.atoms.af.AtomAction;

@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "Lru/ozon/uni/atoms/af/AtomAction$Click;", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
final class RecipientViewHolder$actionHandler$1 extends AbstractC7737t implements Function1<AtomAction.Click, Unit> {
    final /* synthetic */ RecipientViewHolder this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    RecipientViewHolder$actionHandler$1(RecipientViewHolder recipientViewHolder) {
        super(1);
        this.this$0 = recipientViewHolder;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(AtomAction.Click click) {
        invoke2(click);
        return Unit.f71690a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(AtomAction.Click it) {
        RecipientVO recipientVO;
        WidgetRecipientBinding widgetRecipientBinding;
        RecipientViewModel recipientViewModel;
        WidgetRecipientBinding widgetRecipientBinding2;
        WidgetRecipientBinding widgetRecipientBinding3;
        Intrinsics.checkNotNullParameter(it, "it");
        recipientVO = this.this$0.item;
        if (recipientVO != null) {
            RecipientViewHolder recipientViewHolder = this.this$0;
            widgetRecipientBinding = recipientViewHolder.binding;
            ButtonV3View saveBa = widgetRecipientBinding.saveBa;
            Intrinsics.checkNotNullExpressionValue(saveBa, "saveBa");
            KeyboardUtilsKt.hideKeyboard(saveBa);
            recipientViewModel = recipientViewHolder.viewModel;
            widgetRecipientBinding2 = recipientViewHolder.binding;
            String valueOf = String.valueOf(widgetRecipientBinding2.nameEt.getText());
            if (valueOf.length() == 0) {
                valueOf = recipientVO.getNameInput().getText();
            }
            widgetRecipientBinding3 = recipientViewHolder.binding;
            recipientViewModel.changeRecipient(recipientVO, valueOf, String.valueOf(widgetRecipientBinding3.phoneEt.getText()));
        }
    }
}
