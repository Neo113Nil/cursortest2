package io.intercom.android.sdk.m5.inbox.ui;

import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.lazy.LazyItemScope;
import androidx.compose.runtime.Composer;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.unit.Dp;
import androidx.paging.compose.LazyPagingItems;
import io.intercom.android.sdk.m5.components.ConversationItemKt;
import io.intercom.android.sdk.models.Conversation;
import io.intercom.android.sdk.ui.component.IntercomDividerKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: InboxContentScreenItems.kt */
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes9.dex */
final class InboxContentScreenItemsKt$inboxContentScreenItems$1 implements Function4<LazyItemScope, Integer, Composer, Integer, Unit> {
    final /* synthetic */ LazyPagingItems<Conversation> $inboxConversations;
    final /* synthetic */ Function1<Conversation, Unit> $onConversationClick;

    /* JADX WARN: Multi-variable type inference failed */
    InboxContentScreenItemsKt$inboxContentScreenItems$1(LazyPagingItems<Conversation> lazyPagingItems, Function1<? super Conversation, Unit> function1) {
        this.$inboxConversations = lazyPagingItems;
        this.$onConversationClick = function1;
    }

    @Override // kotlin.jvm.functions.Function4
    public /* bridge */ /* synthetic */ Unit invoke(LazyItemScope lazyItemScope, Integer num, Composer composer, Integer num2) {
        invoke(lazyItemScope, num.intValue(), composer, num2.intValue());
        return Unit.INSTANCE;
    }

    public final void invoke(LazyItemScope items, int i, Composer composer, int i2) {
        Intrinsics.checkNotNullParameter(items, "$this$items");
        if ((i2 & 112) == 0) {
            i2 |= composer.changed(i) ? 32 : 16;
        }
        if ((i2 & 721) != 144 || !composer.getSkipping()) {
            final Conversation conversation = this.$inboxConversations.get(i);
            if (conversation == null) {
                return;
            }
            final Function1<Conversation, Unit> function1 = this.$onConversationClick;
            float f = 16;
            ConversationItemKt.ConversationItem(conversation, SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), PaddingKt.m1150PaddingValues0680j_4(Dp.m8798constructorimpl(f)), false, new Function0() { // from class: io.intercom.android.sdk.m5.inbox.ui.InboxContentScreenItemsKt$inboxContentScreenItems$1$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    Unit invoke$lambda$1$lambda$0;
                    invoke$lambda$1$lambda$0 = InboxContentScreenItemsKt$inboxContentScreenItems$1.invoke$lambda$1$lambda$0(Function1.this, conversation);
                    return invoke$lambda$1$lambda$0;
                }
            }, composer, 440, 8);
            IntercomDividerKt.IntercomDivider(PaddingKt.m1159paddingVpY3zN4$default(Modifier.INSTANCE, Dp.m8798constructorimpl(f), 0.0f, 2, null), composer, 6, 0);
            return;
        }
        composer.skipToGroupEnd();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$1$lambda$0(Function1 onConversationClick, Conversation conversation) {
        Intrinsics.checkNotNullParameter(onConversationClick, "$onConversationClick");
        Intrinsics.checkNotNullParameter(conversation, "$conversation");
        onConversationClick.invoke(conversation);
        return Unit.INSTANCE;
    }
}
