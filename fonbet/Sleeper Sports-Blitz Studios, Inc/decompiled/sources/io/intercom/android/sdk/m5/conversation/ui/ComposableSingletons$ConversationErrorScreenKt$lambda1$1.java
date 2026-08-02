package io.intercom.android.sdk.m5.conversation.ui;

import androidx.compose.runtime.Composer;
import io.intercom.android.sdk.m5.conversation.states.ConversationUiState;
import io.intercom.android.sdk.m5.conversation.states.TopAppBarUiState;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* compiled from: ConversationErrorScreen.kt */
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
/* renamed from: io.intercom.android.sdk.m5.conversation.ui.ComposableSingletons$ConversationErrorScreenKt$lambda-1$1, reason: invalid class name */
/* loaded from: classes9.dex */
final class ComposableSingletons$ConversationErrorScreenKt$lambda1$1 implements Function2<Composer, Integer, Unit> {
    public static final ComposableSingletons$ConversationErrorScreenKt$lambda1$1 INSTANCE = new ComposableSingletons$ConversationErrorScreenKt$lambda1$1();

    ComposableSingletons$ConversationErrorScreenKt$lambda1$1() {
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
        invoke(composer, num.intValue());
        return Unit.INSTANCE;
    }

    public final void invoke(Composer composer, int i) {
        if ((i & 11) != 2 || !composer.getSkipping()) {
            ConversationErrorScreenKt.ConversationErrorScreen(new ConversationUiState.Error(true, TopAppBarUiState.INSTANCE.getDefault()), new Function0() { // from class: io.intercom.android.sdk.m5.conversation.ui.ComposableSingletons$ConversationErrorScreenKt$lambda-1$1$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    Unit unit;
                    unit = Unit.INSTANCE;
                    return unit;
                }
            }, null, composer, 56, 4);
        } else {
            composer.skipToGroupEnd();
        }
    }
}
