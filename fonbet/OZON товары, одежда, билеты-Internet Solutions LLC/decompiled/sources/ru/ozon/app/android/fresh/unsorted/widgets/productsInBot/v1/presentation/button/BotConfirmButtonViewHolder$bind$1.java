package ru.ozon.app.android.fresh.unsorted.widgets.productsInBot.v1.presentation.button;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import ru.ozon.app.android.fresh.unsorted.R$plurals;
import ru.ozon.app.android.fresh.unsorted.R$string;
import ru.ozon.app.android.fresh.unsorted.databinding.LayoutBotConfirmButtonBinding;
import ru.ozon.app.android.uikit.text.StringProvider;

@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"<anonymous>", "", "productsCount", "", "kotlin.jvm.PlatformType", "invoke", "(Ljava/lang/Integer;)V"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
final class BotConfirmButtonViewHolder$bind$1 extends AbstractC7737t implements Function1<Integer, Unit> {
    final /* synthetic */ BotConfirmButtonViewHolder this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    BotConfirmButtonViewHolder$bind$1(BotConfirmButtonViewHolder botConfirmButtonViewHolder) {
        super(1);
        this.this$0 = botConfirmButtonViewHolder;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(Integer num) {
        invoke2(num);
        return Unit.f71690a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(Integer num) {
        LayoutBotConfirmButtonBinding layoutBotConfirmButtonBinding;
        LayoutBotConfirmButtonBinding layoutBotConfirmButtonBinding2;
        layoutBotConfirmButtonBinding = this.this$0.binding;
        layoutBotConfirmButtonBinding.confirmBv.setEnabled(num.intValue() > 0);
        String string = num.intValue() == 0 ? StringProvider.getString(R$string.products_in_bot_choose_btn) : StringProvider.getQuantityString(R$plurals.products_in_bot_count_plural, num.intValue(), num);
        layoutBotConfirmButtonBinding2 = this.this$0.binding;
        layoutBotConfirmButtonBinding2.confirmBv.setText(string);
    }
}
