package io.intercom.android.sdk.m5.conversation.ui.components.row;

import androidx.compose.runtime.Composer;
import io.intercom.android.sdk.tickets.TicketDetailContentKt;
import io.intercom.android.sdk.tickets.TicketDetailState;
import io.intercom.android.sdk.tickets.TicketStatus;
import io.intercom.android.sdk.tickets.TicketTimelineCardKt;
import io.intercom.android.sdk.tickets.TicketTimelineCardState;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* compiled from: BigTicketCard.kt */
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
/* renamed from: io.intercom.android.sdk.m5.conversation.ui.components.row.ComposableSingletons$BigTicketCardKt$lambda-2$1, reason: invalid class name */
/* loaded from: classes9.dex */
final class ComposableSingletons$BigTicketCardKt$lambda2$1 implements Function2<Composer, Integer, Unit> {
    public static final ComposableSingletons$BigTicketCardKt$lambda2$1 INSTANCE = new ComposableSingletons$BigTicketCardKt$lambda2$1();

    ComposableSingletons$BigTicketCardKt$lambda2$1() {
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
        invoke(composer, num.intValue());
        return Unit.INSTANCE;
    }

    public final void invoke(Composer composer, int i) {
        if ((i & 11) != 2 || !composer.getSkipping()) {
            BigTicketCardKt.BigTicketCard(TicketDetailState.TicketDetailContentState.copy$default(TicketDetailContentKt.getSampleTicketDetailState(), null, TicketTimelineCardState.m12840copyww6aTOc$default(TicketTimelineCardKt.getSampleTicketTimelineCardState(), null, null, null, TicketStatus.WaitingOnCustomer.getColor(), CollectionsKt.listOf((Object[]) new TicketTimelineCardState.ProgressSection[]{new TicketTimelineCardState.ProgressSection(true, false), new TicketTimelineCardState.ProgressSection(true, true), new TicketTimelineCardState.ProgressSection(false, false)}), "Waiting on you", Long.valueOf(System.currentTimeMillis()), 7, null), null, null, null, null, 61, null), new Function0() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.row.ComposableSingletons$BigTicketCardKt$lambda-2$1$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    Unit unit;
                    unit = Unit.INSTANCE;
                    return unit;
                }
            }, true, null, composer, 440, 8);
        } else {
            composer.skipToGroupEnd();
        }
    }
}
