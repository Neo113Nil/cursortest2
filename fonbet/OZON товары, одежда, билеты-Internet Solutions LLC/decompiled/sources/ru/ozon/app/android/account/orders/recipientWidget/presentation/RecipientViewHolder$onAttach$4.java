package ru.ozon.app.android.account.orders.recipientWidget.presentation;

import android.widget.TextView;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.app.android.cs_orders.databinding.WidgetRecipientBinding;
import ru.ozon.app.android.uikit.view.input.MobilizationTextInputLayout;

@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType", "invoke", "(Ljava/lang/String;)V"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
final class RecipientViewHolder$onAttach$4 extends AbstractC7737t implements Function1<String, Unit> {
    final /* synthetic */ RecipientViewHolder this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    RecipientViewHolder$onAttach$4(RecipientViewHolder recipientViewHolder) {
        super(1);
        this.this$0 = recipientViewHolder;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(String str) {
        invoke2(str);
        return Unit.f71690a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(String str) {
        WidgetRecipientBinding widgetRecipientBinding;
        WidgetRecipientBinding widgetRecipientBinding2;
        RecipientViewHolder recipientViewHolder = this.this$0;
        widgetRecipientBinding = recipientViewHolder.binding;
        MobilizationTextInputLayout nameTil = widgetRecipientBinding.nameTil;
        Intrinsics.checkNotNullExpressionValue(nameTil, "nameTil");
        widgetRecipientBinding2 = this.this$0.binding;
        TextView nameErrorTv = widgetRecipientBinding2.nameErrorTv;
        Intrinsics.checkNotNullExpressionValue(nameErrorTv, "nameErrorTv");
        recipientViewHolder.showErrorForTil(nameTil, nameErrorTv, str);
    }
}
