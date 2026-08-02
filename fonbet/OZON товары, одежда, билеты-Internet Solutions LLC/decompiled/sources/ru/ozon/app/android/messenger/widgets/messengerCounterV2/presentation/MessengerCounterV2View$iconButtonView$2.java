package ru.ozon.app.android.messenger.widgets.messengerCounterV2.presentation;

import android.content.Context;
import android.widget.FrameLayout;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;
import ru.ozon.app.android.bx.messenger.R$id;
import ru.ozon.uni.android.uikit.view.atoms.buttons.icons.SmallIconButtonView;

@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lru/ozon/uni/android/uikit/view/atoms/buttons/icons/SmallIconButtonView;", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
final class MessengerCounterV2View$iconButtonView$2 extends AbstractC7737t implements Function0<SmallIconButtonView> {
    final /* synthetic */ Context $context;
    final /* synthetic */ MessengerCounterV2View this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    MessengerCounterV2View$iconButtonView$2(Context context, MessengerCounterV2View messengerCounterV2View) {
        super(0);
        this.$context = context;
        this.this$0 = messengerCounterV2View;
    }

    @Override // kotlin.jvm.functions.Function0
    public final SmallIconButtonView invoke() {
        FrameLayout.LayoutParams createLayoutParamsForIconButton;
        SmallIconButtonView smallIconButtonView = new SmallIconButtonView(this.$context, null, 0, 6, null);
        MessengerCounterV2View messengerCounterV2View = this.this$0;
        smallIconButtonView.setId(R$id.bellView);
        createLayoutParamsForIconButton = messengerCounterV2View.createLayoutParamsForIconButton();
        smallIconButtonView.setLayoutParams(createLayoutParamsForIconButton);
        return smallIconButtonView;
    }
}
