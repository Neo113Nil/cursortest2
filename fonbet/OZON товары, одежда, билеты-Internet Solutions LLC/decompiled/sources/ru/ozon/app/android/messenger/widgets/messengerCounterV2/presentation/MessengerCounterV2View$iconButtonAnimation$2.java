package ru.ozon.app.android.messenger.widgets.messengerCounterV2.presentation;

import android.content.Context;
import android.widget.FrameLayout;
import com.airbnb.lottie.LottieAnimationView;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;
import ru.ozon.app.android.bx.messenger.R$raw;
import ru.ozon.app.android.messenger.widgets.messengerCounterV2.presentation.MessengerCounterV2View;
import ru.ozon.app.android.uikit.utils.SimpleAnimatorListener;
import ru.ozon.uni.android.uikit.extensions.view.ViewExtKt;

@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/airbnb/lottie/LottieAnimationView;", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
final class MessengerCounterV2View$iconButtonAnimation$2 extends AbstractC7737t implements Function0<LottieAnimationView> {
    final /* synthetic */ Context $context;
    final /* synthetic */ MessengerCounterV2View this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    MessengerCounterV2View$iconButtonAnimation$2(Context context, MessengerCounterV2View messengerCounterV2View) {
        super(0);
        this.$context = context;
        this.this$0 = messengerCounterV2View;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // kotlin.jvm.functions.Function0
    public final LottieAnimationView invoke() {
        FrameLayout.LayoutParams createLayoutParamsForIconButton;
        MessengerCounterV2View.Companion companion;
        LottieAnimationView lottieAnimationView = new LottieAnimationView(this.$context);
        MessengerCounterV2View messengerCounterV2View = this.this$0;
        ViewExtKt.invisible(lottieAnimationView);
        lottieAnimationView.setAnimation(R$raw.animation_messenger_counter_v2);
        createLayoutParamsForIconButton = messengerCounterV2View.createLayoutParamsForIconButton();
        companion = MessengerCounterV2View.Companion;
        int icon_button_animation_padding = companion.getICON_BUTTON_ANIMATION_PADDING();
        lottieAnimationView.setPadding(icon_button_animation_padding, icon_button_animation_padding, icon_button_animation_padding, icon_button_animation_padding);
        lottieAnimationView.setLayoutParams(createLayoutParamsForIconButton);
        lottieAnimationView.addAnimatorListener(new SimpleAnimatorListener(null, new MessengerCounterV2View$iconButtonAnimation$2$1$2(lottieAnimationView, messengerCounterV2View), null, null, 13, null));
        return lottieAnimationView;
    }
}
