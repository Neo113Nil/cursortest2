package io.intercom.android.sdk.m5.inbox.ui;

import androidx.compose.foundation.lazy.LazyDslKt;
import androidx.compose.foundation.lazy.LazyListScope;
import androidx.compose.runtime.Composer;
import androidx.paging.compose.LazyPagingItems;
import io.intercom.android.sdk.models.Conversation;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: InboxContentScreenItems.kt */
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes9.dex */
final class InboxContentScreenItemsKt$InboxContentScreenPreview$DisplayPaging$1 implements Function2<Composer, Integer, Unit> {
    final /* synthetic */ LazyPagingItems<Conversation> $lazyPagingItems;

    InboxContentScreenItemsKt$InboxContentScreenPreview$DisplayPaging$1(LazyPagingItems<Conversation> lazyPagingItems) {
        this.$lazyPagingItems = lazyPagingItems;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
        invoke(composer, num.intValue());
        return Unit.INSTANCE;
    }

    public final void invoke(Composer composer, int i) {
        if ((i & 11) != 2 || !composer.getSkipping()) {
            final LazyPagingItems<Conversation> lazyPagingItems = this.$lazyPagingItems;
            LazyDslKt.LazyColumn(null, null, null, false, null, null, null, false, null, new Function1() { // from class: io.intercom.android.sdk.m5.inbox.ui.InboxContentScreenItemsKt$InboxContentScreenPreview$DisplayPaging$1$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    Unit invoke$lambda$1;
                    invoke$lambda$1 = InboxContentScreenItemsKt$InboxContentScreenPreview$DisplayPaging$1.invoke$lambda$1(LazyPagingItems.this, (LazyListScope) obj);
                    return invoke$lambda$1;
                }
            }, composer, 0, 511);
        } else {
            composer.skipToGroupEnd();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$1(LazyPagingItems lazyPagingItems, LazyListScope LazyColumn) {
        Intrinsics.checkNotNullParameter(lazyPagingItems, "$lazyPagingItems");
        Intrinsics.checkNotNullParameter(LazyColumn, "$this$LazyColumn");
        InboxContentScreenItemsKt.inboxContentScreenItems(LazyColumn, lazyPagingItems, new Function1() { // from class: io.intercom.android.sdk.m5.inbox.ui.InboxContentScreenItemsKt$InboxContentScreenPreview$DisplayPaging$1$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                Unit invoke$lambda$1$lambda$0;
                invoke$lambda$1$lambda$0 = InboxContentScreenItemsKt$InboxContentScreenPreview$DisplayPaging$1.invoke$lambda$1$lambda$0((Conversation) obj);
                return invoke$lambda$1$lambda$0;
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$1$lambda$0(Conversation it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return Unit.INSTANCE;
    }
}
