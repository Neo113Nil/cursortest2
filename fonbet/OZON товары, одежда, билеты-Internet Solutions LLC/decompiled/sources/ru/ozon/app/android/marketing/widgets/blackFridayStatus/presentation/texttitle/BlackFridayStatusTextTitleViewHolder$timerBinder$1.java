package ru.ozon.app.android.marketing.widgets.blackFridayStatus.presentation.texttitle;

import Tl.a;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.d;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import ru.ozon.app.android.marketing.R$id;
import ru.ozon.app.android.marketing.databinding.WidgetBlackFridayStatusTextTitleBinding;

@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "visible", "", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
final class BlackFridayStatusTextTitleViewHolder$timerBinder$1 extends AbstractC7737t implements Function1<Boolean, Unit> {
    final /* synthetic */ BlackFridayStatusTextTitleViewHolder this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    BlackFridayStatusTextTitleViewHolder$timerBinder$1(BlackFridayStatusTextTitleViewHolder blackFridayStatusTextTitleViewHolder) {
        super(1);
        this.this$0 = blackFridayStatusTextTitleViewHolder;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(Boolean bool) {
        invoke(bool.booleanValue());
        return Unit.f71690a;
    }

    public final void invoke(boolean z11) {
        WidgetBlackFridayStatusTextTitleBinding widgetBlackFridayStatusTextTitleBinding;
        widgetBlackFridayStatusTextTitleBinding = this.this$0.binding;
        ConstraintLayout constraintLayout = widgetBlackFridayStatusTextTitleBinding.rootCl;
        d d11 = a.d(constraintLayout, "rootCl", constraintLayout);
        d11.s(R$id.timerTitleTav, 6, z11 ? R$id.timerV : R$id.rightGuideline, 6);
        d11.f(constraintLayout);
    }
}
