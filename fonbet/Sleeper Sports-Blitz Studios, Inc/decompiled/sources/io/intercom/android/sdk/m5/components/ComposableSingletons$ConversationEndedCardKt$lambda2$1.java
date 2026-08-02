package io.intercom.android.sdk.m5.components;

import androidx.compose.runtime.Composer;
import io.intercom.android.sdk.R;
import io.intercom.android.sdk.m5.conversation.states.ComposerState;
import io.intercom.android.sdk.ui.common.StringProvider;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* compiled from: ConversationEndedCard.kt */
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
/* renamed from: io.intercom.android.sdk.m5.components.ComposableSingletons$ConversationEndedCardKt$lambda-2$1, reason: invalid class name */
/* loaded from: classes9.dex */
final class ComposableSingletons$ConversationEndedCardKt$lambda2$1 implements Function2<Composer, Integer, Unit> {
    public static final ComposableSingletons$ConversationEndedCardKt$lambda2$1 INSTANCE = new ComposableSingletons$ConversationEndedCardKt$lambda2$1();

    ComposableSingletons$ConversationEndedCardKt$lambda2$1() {
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
        invoke(composer, num.intValue());
        return Unit.INSTANCE;
    }

    public final void invoke(Composer composer, int i) {
        if ((i & 11) != 2 || !composer.getSkipping()) {
            ConversationEndedCardKt.ConversationEndedCard(null, new Function0() { // from class: io.intercom.android.sdk.m5.components.ComposableSingletons$ConversationEndedCardKt$lambda-2$1$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    Unit unit;
                    unit = Unit.INSTANCE;
                    return unit;
                }
            }, new ComposerState.ConversationEnded(new StringProvider.StringRes(R.string.intercom_conversation_has_ended, null, 2, null), new ComposerState.ConversationEnded.ConversationEndedCta(new StringProvider.ActualString("Send a message"), R.drawable.intercom_send_message_icon, null, 4, null)), composer, ((StringProvider.$stable | StringProvider.$stable) << 6) | 48, 1);
        } else {
            composer.skipToGroupEnd();
        }
    }
}
