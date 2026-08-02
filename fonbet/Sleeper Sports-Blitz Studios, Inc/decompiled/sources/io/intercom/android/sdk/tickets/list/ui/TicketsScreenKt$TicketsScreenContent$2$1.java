package io.intercom.android.sdk.tickets.list.ui;

import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.lazy.LazyItemScope;
import androidx.compose.runtime.Composer;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.unit.Dp;
import io.intercom.android.sdk.tickets.list.data.TicketsScreenUiState;
import io.intercom.android.sdk.ui.component.IntercomDividerKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: TicketsScreen.kt */
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes9.dex */
final class TicketsScreenKt$TicketsScreenContent$2$1 implements Function4<LazyItemScope, Integer, Composer, Integer, Unit> {
    final /* synthetic */ Function1<String, Unit> $onClick;
    final /* synthetic */ TicketsScreenUiState.Content $uiState;

    /* JADX WARN: Multi-variable type inference failed */
    TicketsScreenKt$TicketsScreenContent$2$1(TicketsScreenUiState.Content content, Function1<? super String, Unit> function1) {
        this.$uiState = content;
        this.$onClick = function1;
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
            final TicketRowData ticketRowData = this.$uiState.getLazyPagingTickets().get(i);
            if (ticketRowData == null) {
                return;
            }
            final Function1<String, Unit> function1 = this.$onClick;
            Modifier.Companion companion = Modifier.INSTANCE;
            composer.startReplaceGroup(122186268);
            boolean changed = composer.changed(function1) | composer.changed(ticketRowData);
            Object rememberedValue = composer.rememberedValue();
            if (changed || rememberedValue == Composer.INSTANCE.getEmpty()) {
                rememberedValue = new Function0() { // from class: io.intercom.android.sdk.tickets.list.ui.TicketsScreenKt$TicketsScreenContent$2$1$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        Unit invoke$lambda$2$lambda$1$lambda$0;
                        invoke$lambda$2$lambda$1$lambda$0 = TicketsScreenKt$TicketsScreenContent$2$1.invoke$lambda$2$lambda$1$lambda$0(Function1.this, ticketRowData);
                        return invoke$lambda$2$lambda$1$lambda$0;
                    }
                };
                composer.updateRememberedValue(rememberedValue);
            }
            composer.endReplaceGroup();
            TicketRowKt.TicketRow(ClickableKt.m623clickableoSLSa3U$default(companion, false, null, null, null, (Function0) rememberedValue, 15, null), ticketRowData, null, false, composer, 0, 12);
            IntercomDividerKt.IntercomDivider(PaddingKt.m1159paddingVpY3zN4$default(Modifier.INSTANCE, Dp.m8798constructorimpl(20), 0.0f, 2, null), composer, 6, 0);
            return;
        }
        composer.skipToGroupEnd();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$2$lambda$1$lambda$0(Function1 function1, TicketRowData data) {
        Intrinsics.checkNotNullParameter(data, "$data");
        function1.invoke(data.getId());
        return Unit.INSTANCE;
    }
}
