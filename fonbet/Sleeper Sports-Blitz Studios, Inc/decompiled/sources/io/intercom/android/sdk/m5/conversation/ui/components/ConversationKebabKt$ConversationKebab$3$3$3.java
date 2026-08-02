package io.intercom.android.sdk.m5.conversation.ui.components;

import androidx.compose.foundation.layout.ColumnScope;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.MutableState;
import io.intercom.android.sdk.m5.conversation.metrics.MetricData;
import io.intercom.android.sdk.m5.conversation.states.HeaderMenuItem;
import io.intercom.android.sdk.ui.common.StringProvider;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: ConversationKebab.kt */
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes9.dex */
final class ConversationKebabKt$ConversationKebab$3$3$3 implements Function3<ColumnScope, Composer, Integer, Unit> {
    final /* synthetic */ long $contentColor;
    final /* synthetic */ List<HeaderMenuItem> $headerMenuItems;
    final /* synthetic */ MutableState<Boolean> $isExpanded;
    final /* synthetic */ Function1<HeaderMenuItem, Unit> $onMenuClicked;
    final /* synthetic */ Function1<MetricData, Unit> $trackMetric;

    /* JADX WARN: Multi-variable type inference failed */
    ConversationKebabKt$ConversationKebab$3$3$3(List<? extends HeaderMenuItem> list, Function1<? super HeaderMenuItem, Unit> function1, Function1<? super MetricData, Unit> function12, long j, MutableState<Boolean> mutableState) {
        this.$headerMenuItems = list;
        this.$onMenuClicked = function1;
        this.$trackMetric = function12;
        this.$contentColor = j;
        this.$isExpanded = mutableState;
    }

    @Override // kotlin.jvm.functions.Function3
    public /* bridge */ /* synthetic */ Unit invoke(ColumnScope columnScope, Composer composer, Integer num) {
        invoke(columnScope, composer, num.intValue());
        return Unit.INSTANCE;
    }

    public final void invoke(ColumnScope DropdownMenu, Composer composer, int i) {
        int icon;
        String badgeText;
        boolean shouldShowUnreadDot;
        Composer composer2 = composer;
        Intrinsics.checkNotNullParameter(DropdownMenu, "$this$DropdownMenu");
        if ((i & 81) != 16 || !composer2.getSkipping()) {
            List<HeaderMenuItem> list = this.$headerMenuItems;
            final Function1<HeaderMenuItem, Unit> function1 = this.$onMenuClicked;
            final Function1<MetricData, Unit> function12 = this.$trackMetric;
            long j = this.$contentColor;
            final MutableState<Boolean> mutableState = this.$isExpanded;
            for (final HeaderMenuItem headerMenuItem : list) {
                String text = headerMenuItem.getLabel().getText(composer2, StringProvider.$stable);
                icon = ConversationKebabKt.icon(headerMenuItem);
                badgeText = ConversationKebabKt.badgeText(headerMenuItem);
                shouldShowUnreadDot = ConversationKebabKt.shouldShowUnreadDot(headerMenuItem);
                composer2.startReplaceGroup(1730714746);
                boolean changed = composer2.changed(function1) | composer2.changed(headerMenuItem) | composer2.changed(function12);
                Object rememberedValue = composer2.rememberedValue();
                if (changed || rememberedValue == Composer.INSTANCE.getEmpty()) {
                    rememberedValue = new Function0() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.ConversationKebabKt$ConversationKebab$3$3$3$$ExternalSyntheticLambda0
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            Unit invoke$lambda$2$lambda$1$lambda$0;
                            invoke$lambda$2$lambda$1$lambda$0 = ConversationKebabKt$ConversationKebab$3$3$3.invoke$lambda$2$lambda$1$lambda$0(MutableState.this, function1, headerMenuItem, function12);
                            return invoke$lambda$2$lambda$1$lambda$0;
                        }
                    };
                    composer2.updateRememberedValue(rememberedValue);
                }
                composer2.endReplaceGroup();
                HeaderMenuItemRowKt.m12223HeaderMenuItemRow6RhP_wg(null, text, icon, badgeText, true, shouldShowUnreadDot, true, (Function0) rememberedValue, headerMenuItem.getEnabled(), j, composer2, 1597440, 1);
                composer2 = composer;
                mutableState = mutableState;
                function12 = function12;
            }
            return;
        }
        composer2.skipToGroupEnd();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$2$lambda$1$lambda$0(MutableState isExpanded, Function1 function1, HeaderMenuItem it, Function1 function12) {
        MetricData metricData;
        Intrinsics.checkNotNullParameter(isExpanded, "$isExpanded");
        Intrinsics.checkNotNullParameter(it, "$it");
        isExpanded.setValue(false);
        function1.invoke(it);
        metricData = ConversationKebabKt.metricData(it, true);
        function12.invoke(metricData);
        return Unit.INSTANCE;
    }
}
