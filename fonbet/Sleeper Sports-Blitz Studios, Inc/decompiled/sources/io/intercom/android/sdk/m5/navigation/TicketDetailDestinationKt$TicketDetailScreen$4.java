package io.intercom.android.sdk.m5.navigation;

import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.runtime.Composer;
import androidx.compose.ui.Modifier;
import io.intercom.android.sdk.tickets.TicketDetailContentKt;
import io.intercom.android.sdk.tickets.TicketDetailErrorScreenKt;
import io.intercom.android.sdk.tickets.TicketDetailState;
import io.intercom.android.sdk.tickets.TicketDetailsLoadingScreenKt;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: TicketDetailDestination.kt */
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes9.dex */
final class TicketDetailDestinationKt$TicketDetailScreen$4 implements Function3<PaddingValues, Composer, Integer, Unit> {
    final /* synthetic */ boolean $isLaunchedProgrammatically;
    final /* synthetic */ Function2<String, Boolean, Unit> $onConversationCTAClicked;
    final /* synthetic */ boolean $showSubmissionCard;
    final /* synthetic */ TicketDetailState $ticketDetailState;

    /* JADX WARN: Multi-variable type inference failed */
    TicketDetailDestinationKt$TicketDetailScreen$4(TicketDetailState ticketDetailState, Function2<? super String, ? super Boolean, Unit> function2, boolean z, boolean z2) {
        this.$ticketDetailState = ticketDetailState;
        this.$onConversationCTAClicked = function2;
        this.$isLaunchedProgrammatically = z;
        this.$showSubmissionCard = z2;
    }

    @Override // kotlin.jvm.functions.Function3
    public /* bridge */ /* synthetic */ Unit invoke(PaddingValues paddingValues, Composer composer, Integer num) {
        invoke(paddingValues, composer, num.intValue());
        return Unit.INSTANCE;
    }

    public final void invoke(PaddingValues contentPadding, Composer composer, int i) {
        Intrinsics.checkNotNullParameter(contentPadding, "contentPadding");
        if ((i & 14) == 0) {
            i |= composer.changed(contentPadding) ? 4 : 2;
        }
        if ((i & 91) != 18 || !composer.getSkipping()) {
            TicketDetailState ticketDetailState = this.$ticketDetailState;
            if (Intrinsics.areEqual(ticketDetailState, TicketDetailState.Initial.INSTANCE) || Intrinsics.areEqual(ticketDetailState, TicketDetailState.Loading.INSTANCE)) {
                composer.startReplaceGroup(1534755158);
                TicketDetailsLoadingScreenKt.TicketDetailsLoadingScreen(PaddingKt.padding(Modifier.INSTANCE, contentPadding), composer, 0, 0);
                composer.endReplaceGroup();
                return;
            }
            if (ticketDetailState instanceof TicketDetailState.Error) {
                composer.startReplaceGroup(332916057);
                TicketDetailErrorScreenKt.TicketDetailErrorScreen(((TicketDetailState.Error) this.$ticketDetailState).getErrorState(), PaddingKt.padding(Modifier.INSTANCE, contentPadding), composer, 0, 0);
                composer.endReplaceGroup();
                return;
            }
            if (!(ticketDetailState instanceof TicketDetailState.TicketDetailContentState)) {
                composer.startReplaceGroup(1534752236);
                composer.endReplaceGroup();
                throw new NoWhenBranchMatchedException();
            }
            composer.startReplaceGroup(333141954);
            Modifier padding = PaddingKt.padding(Modifier.INSTANCE, contentPadding);
            TicketDetailState.TicketDetailContentState ticketDetailContentState = (TicketDetailState.TicketDetailContentState) this.$ticketDetailState;
            composer.startReplaceGroup(1534773801);
            boolean changed = composer.changed(this.$onConversationCTAClicked) | composer.changed(this.$ticketDetailState) | composer.changed(this.$isLaunchedProgrammatically);
            final Function2<String, Boolean, Unit> function2 = this.$onConversationCTAClicked;
            final TicketDetailState ticketDetailState2 = this.$ticketDetailState;
            final boolean z = this.$isLaunchedProgrammatically;
            Object rememberedValue = composer.rememberedValue();
            if (changed || rememberedValue == Composer.INSTANCE.getEmpty()) {
                rememberedValue = new Function1() { // from class: io.intercom.android.sdk.m5.navigation.TicketDetailDestinationKt$TicketDetailScreen$4$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        Unit invoke$lambda$1$lambda$0;
                        invoke$lambda$1$lambda$0 = TicketDetailDestinationKt$TicketDetailScreen$4.invoke$lambda$1$lambda$0(Function2.this, ticketDetailState2, z, (String) obj);
                        return invoke$lambda$1$lambda$0;
                    }
                };
                composer.updateRememberedValue(rememberedValue);
            }
            composer.endReplaceGroup();
            TicketDetailContentKt.TicketDetailContent(padding, ticketDetailContentState, (Function1) rememberedValue, this.$showSubmissionCard, composer, 64, 0);
            composer.endReplaceGroup();
            return;
        }
        composer.skipToGroupEnd();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$1$lambda$0(Function2 function2, TicketDetailState ticketDetailState, boolean z, String str) {
        Intrinsics.checkNotNullParameter(ticketDetailState, "$ticketDetailState");
        function2.invoke(((TicketDetailState.TicketDetailContentState) ticketDetailState).getConversationId(), Boolean.valueOf(z));
        return Unit.INSTANCE;
    }
}
