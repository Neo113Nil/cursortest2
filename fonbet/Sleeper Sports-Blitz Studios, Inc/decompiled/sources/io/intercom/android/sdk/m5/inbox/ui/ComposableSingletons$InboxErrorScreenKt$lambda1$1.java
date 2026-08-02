package io.intercom.android.sdk.m5.inbox.ui;

import androidx.compose.runtime.Composer;
import io.intercom.android.sdk.m5.components.ErrorState;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* compiled from: InboxErrorScreen.kt */
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
/* renamed from: io.intercom.android.sdk.m5.inbox.ui.ComposableSingletons$InboxErrorScreenKt$lambda-1$1, reason: invalid class name */
/* loaded from: classes9.dex */
final class ComposableSingletons$InboxErrorScreenKt$lambda1$1 implements Function2<Composer, Integer, Unit> {
    public static final ComposableSingletons$InboxErrorScreenKt$lambda1$1 INSTANCE = new ComposableSingletons$InboxErrorScreenKt$lambda1$1();

    ComposableSingletons$InboxErrorScreenKt$lambda1$1() {
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
        invoke(composer, num.intValue());
        return Unit.INSTANCE;
    }

    public final void invoke(Composer composer, int i) {
        if ((i & 11) == 2 && composer.getSkipping()) {
            composer.skipToGroupEnd();
        } else {
            InboxErrorScreenKt.InboxErrorScreen(new ErrorState.WithCTA(0, 0, null, 0, new Function0() { // from class: io.intercom.android.sdk.m5.inbox.ui.ComposableSingletons$InboxErrorScreenKt$lambda-1$1$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    Unit unit;
                    unit = Unit.INSTANCE;
                    return unit;
                }
            }, 15, null), null, composer, 0, 2);
        }
    }
}
