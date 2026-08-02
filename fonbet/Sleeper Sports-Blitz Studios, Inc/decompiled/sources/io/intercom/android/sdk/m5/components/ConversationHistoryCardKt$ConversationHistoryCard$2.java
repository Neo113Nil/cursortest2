package io.intercom.android.sdk.m5.components;

import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.runtime.Composer;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.unit.Dp;
import io.intercom.android.sdk.models.Conversation;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: ConversationHistoryCard.kt */
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes9.dex */
final class ConversationHistoryCardKt$ConversationHistoryCard$2 implements Function2<Composer, Integer, Unit> {
    final /* synthetic */ List<Conversation> $conversations;
    final /* synthetic */ Function1<Conversation, Unit> $onConversationClick;

    /* JADX WARN: Multi-variable type inference failed */
    ConversationHistoryCardKt$ConversationHistoryCard$2(List<Conversation> list, Function1<? super Conversation, Unit> function1) {
        this.$conversations = list;
        this.$onConversationClick = function1;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
        invoke(composer, num.intValue());
        return Unit.INSTANCE;
    }

    public final void invoke(Composer composer, int i) {
        if ((i & 11) != 2 || !composer.getSkipping()) {
            List<Conversation> list = this.$conversations;
            final Function1<Conversation, Unit> function1 = this.$onConversationClick;
            for (final Conversation conversation : list) {
                ConversationItemKt.ConversationItem(conversation, SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), PaddingKt.m1151PaddingValuesYgX7TsA(Dp.m8798constructorimpl(20), Dp.m8798constructorimpl(8)), false, new Function0() { // from class: io.intercom.android.sdk.m5.components.ConversationHistoryCardKt$ConversationHistoryCard$2$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        Unit invoke$lambda$1$lambda$0;
                        invoke$lambda$1$lambda$0 = ConversationHistoryCardKt$ConversationHistoryCard$2.invoke$lambda$1$lambda$0(Function1.this, conversation);
                        return invoke$lambda$1$lambda$0;
                    }
                }, composer, 56, 8);
            }
            return;
        }
        composer.skipToGroupEnd();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$1$lambda$0(Function1 function1, Conversation it) {
        Intrinsics.checkNotNullParameter(it, "$it");
        function1.invoke(it);
        return Unit.INSTANCE;
    }
}
