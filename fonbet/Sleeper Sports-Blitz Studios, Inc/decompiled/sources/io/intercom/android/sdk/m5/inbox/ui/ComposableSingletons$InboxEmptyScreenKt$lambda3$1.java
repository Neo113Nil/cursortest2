package io.intercom.android.sdk.m5.inbox.ui;

import androidx.compose.runtime.Composer;
import io.intercom.android.sdk.models.ActionType;
import io.intercom.android.sdk.models.EmptyState;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* compiled from: InboxEmptyScreen.kt */
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
/* renamed from: io.intercom.android.sdk.m5.inbox.ui.ComposableSingletons$InboxEmptyScreenKt$lambda-3$1, reason: invalid class name */
/* loaded from: classes9.dex */
final class ComposableSingletons$InboxEmptyScreenKt$lambda3$1 implements Function2<Composer, Integer, Unit> {
    public static final ComposableSingletons$InboxEmptyScreenKt$lambda3$1 INSTANCE = new ComposableSingletons$InboxEmptyScreenKt$lambda3$1();

    ComposableSingletons$InboxEmptyScreenKt$lambda3$1() {
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
        invoke(composer, num.intValue());
        return Unit.INSTANCE;
    }

    public final void invoke(Composer composer, int i) {
        if ((i & 11) != 2 || !composer.getSkipping()) {
            InboxEmptyScreenKt.InboxEmptyScreen(new EmptyState("No messages", "Messages from the team, queries and support tickets will be visible here", new EmptyState.Action(ActionType.HELP, "Browse our help articles", null, 4, null)), true, new Function0() { // from class: io.intercom.android.sdk.m5.inbox.ui.ComposableSingletons$InboxEmptyScreenKt$lambda-3$1$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    Unit unit;
                    unit = Unit.INSTANCE;
                    return unit;
                }
            }, null, composer, 432, 8);
        } else {
            composer.skipToGroupEnd();
        }
    }
}
