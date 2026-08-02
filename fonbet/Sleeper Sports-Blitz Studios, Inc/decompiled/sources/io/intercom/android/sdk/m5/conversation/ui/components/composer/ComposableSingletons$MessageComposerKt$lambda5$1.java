package io.intercom.android.sdk.m5.conversation.ui.components.composer;

import androidx.compose.runtime.Composer;
import io.intercom.android.sdk.R;
import io.intercom.android.sdk.m5.conversation.states.BottomBarUiState;
import io.intercom.android.sdk.m5.conversation.states.ComposerState;
import io.intercom.android.sdk.ui.common.StringProvider;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: MessageComposer.kt */
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
/* renamed from: io.intercom.android.sdk.m5.conversation.ui.components.composer.ComposableSingletons$MessageComposerKt$lambda-5$1, reason: invalid class name */
/* loaded from: classes9.dex */
final class ComposableSingletons$MessageComposerKt$lambda5$1 implements Function2<Composer, Integer, Unit> {
    public static final ComposableSingletons$MessageComposerKt$lambda5$1 INSTANCE = new ComposableSingletons$MessageComposerKt$lambda5$1();

    ComposableSingletons$MessageComposerKt$lambda5$1() {
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
        invoke(composer, num.intValue());
        return Unit.INSTANCE;
    }

    public final void invoke(Composer composer, int i) {
        if ((i & 11) != 2 || !composer.getSkipping()) {
            MessageComposerKt.MessageComposer(null, new Function1() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.composer.ComposableSingletons$MessageComposerKt$lambda-5$1$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    Unit invoke$lambda$0;
                    invoke$lambda$0 = ComposableSingletons$MessageComposerKt$lambda5$1.invoke$lambda$0((String) obj);
                    return invoke$lambda$0;
                }
            }, new ComposerState.TextInput("Initial message with\nNew line\nAnd another very long new line", new StringProvider.StringRes(R.string.intercom_send_us_a_message, null, 2, null), false, CollectionsKt.listOf(BottomBarUiState.BottomBarButton.MediaInsert.INSTANCE), null, 20, null), null, null, null, null, null, null, null, null, null, null, null, composer, 560, 0, 16377);
        } else {
            composer.skipToGroupEnd();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$0(String it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return Unit.INSTANCE;
    }
}
