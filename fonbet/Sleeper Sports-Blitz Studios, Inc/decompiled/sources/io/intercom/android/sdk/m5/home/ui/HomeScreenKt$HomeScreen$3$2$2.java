package io.intercom.android.sdk.m5.home.ui;

import androidx.compose.animation.AnimatedVisibilityScope;
import androidx.compose.foundation.ScrollState;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.MutableFloatState;
import androidx.compose.runtime.Updater;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.AlphaKt;
import androidx.compose.ui.layout.LayoutCoordinates;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.layout.OnGloballyPositionedModifierKt;
import androidx.compose.ui.node.ComposeUiNode;
import io.intercom.android.sdk.blocks.lib.models.TicketType;
import io.intercom.android.sdk.m5.home.states.HomeUiState;
import io.intercom.android.sdk.m5.home.ui.header.HomeHeaderKt;
import io.intercom.android.sdk.models.Conversation;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: HomeScreen.kt */
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes9.dex */
final class HomeScreenKt$HomeScreen$3$2$2 implements Function3<AnimatedVisibilityScope, Composer, Integer, Unit> {
    final /* synthetic */ MutableFloatState $headerHeightPx;
    final /* synthetic */ HomeUiState $homeState;
    final /* synthetic */ Function1<Conversation, Unit> $onConversationClicked;
    final /* synthetic */ Function0<Unit> $onHelpClicked;
    final /* synthetic */ Function0<Unit> $onMessagesClicked;
    final /* synthetic */ Function0<Unit> $onNewConversationClicked;
    final /* synthetic */ Function1<String, Unit> $onTicketItemClicked;
    final /* synthetic */ Function1<TicketType, Unit> $onTicketLinkClicked;
    final /* synthetic */ Function0<Unit> $onTicketsClicked;
    final /* synthetic */ ScrollState $scrollState;

    /* JADX WARN: Multi-variable type inference failed */
    HomeScreenKt$HomeScreen$3$2$2(HomeUiState homeUiState, ScrollState scrollState, MutableFloatState mutableFloatState, Function0<Unit> function0, Function0<Unit> function02, Function0<Unit> function03, Function1<? super String, Unit> function1, Function0<Unit> function04, Function1<? super Conversation, Unit> function12, Function1<? super TicketType, Unit> function13) {
        this.$homeState = homeUiState;
        this.$scrollState = scrollState;
        this.$headerHeightPx = mutableFloatState;
        this.$onMessagesClicked = function0;
        this.$onHelpClicked = function02;
        this.$onTicketsClicked = function03;
        this.$onTicketItemClicked = function1;
        this.$onNewConversationClicked = function04;
        this.$onConversationClicked = function12;
        this.$onTicketLinkClicked = function13;
    }

    @Override // kotlin.jvm.functions.Function3
    public /* bridge */ /* synthetic */ Unit invoke(AnimatedVisibilityScope animatedVisibilityScope, Composer composer, Integer num) {
        invoke(animatedVisibilityScope, composer, num.intValue());
        return Unit.INSTANCE;
    }

    public final void invoke(AnimatedVisibilityScope AnimatedVisibility, Composer composer, int i) {
        float headerContentOpacity;
        Intrinsics.checkNotNullParameter(AnimatedVisibility, "$this$AnimatedVisibility");
        HomeUiState homeUiState = this.$homeState;
        if (homeUiState instanceof HomeUiState.Content) {
            ScrollState scrollState = this.$scrollState;
            final MutableFloatState mutableFloatState = this.$headerHeightPx;
            Function0<Unit> function0 = this.$onMessagesClicked;
            Function0<Unit> function02 = this.$onHelpClicked;
            Function0<Unit> function03 = this.$onTicketsClicked;
            Function1<String, Unit> function1 = this.$onTicketItemClicked;
            Function0<Unit> function04 = this.$onNewConversationClicked;
            Function1<Conversation, Unit> function12 = this.$onConversationClicked;
            Function1<TicketType, Unit> function13 = this.$onTicketLinkClicked;
            ComposerKt.sourceInformationMarkerStart(composer, 1341605231, "CC(Column)N(modifier,verticalArrangement,horizontalAlignment,content)87@4443L61,88@4509L134:Column.kt#2w3rfo");
            Modifier.Companion companion = Modifier.INSTANCE;
            MeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composer, 0);
            ComposerKt.sourceInformationMarkerStart(composer, -1159599143, "CC(Layout)P(!1,2)80@3267L27,83@3433L360:Layout.kt#80mrfh");
            int hashCode = Long.hashCode(ComposablesKt.getCurrentCompositeKeyHashCode(composer, 0));
            CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
            Modifier materializeModifier = ComposedModifierKt.materializeModifier(composer, companion);
            Function0<ComposeUiNode> constructor = ComposeUiNode.INSTANCE.getConstructor();
            ComposerKt.sourceInformationMarkerStart(composer, -553112988, "CC(ReusableComposeNode)N(factory,update,content)399@15590L9:Composables.kt#9igjgp");
            if (!(composer.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            composer.startReusableNode();
            if (composer.getInserting()) {
                composer.createNode(constructor);
            } else {
                composer.useNode();
            }
            Composer m5333constructorimpl = Updater.m5333constructorimpl(composer);
            Updater.m5340setimpl(m5333constructorimpl, columnMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            Updater.m5340setimpl(m5333constructorimpl, currentCompositionLocalMap, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
            if (m5333constructorimpl.getInserting() || !Intrinsics.areEqual(m5333constructorimpl.rememberedValue(), Integer.valueOf(hashCode))) {
                m5333constructorimpl.updateRememberedValue(Integer.valueOf(hashCode));
                m5333constructorimpl.apply(Integer.valueOf(hashCode), setCompositeKeyHash);
            }
            Updater.m5340setimpl(m5333constructorimpl, materializeModifier, ComposeUiNode.INSTANCE.getSetModifier());
            ComposerKt.sourceInformationMarkerStart(composer, 2093002350, "C89@4557L9:Column.kt#2w3rfo");
            ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
            Modifier.Companion companion2 = Modifier.INSTANCE;
            headerContentOpacity = HomeScreenKt.getHeaderContentOpacity(scrollState.getValue(), mutableFloatState.getFloatValue());
            Modifier alpha = AlphaKt.alpha(companion2, headerContentOpacity);
            composer.startReplaceGroup(1117660256);
            Object rememberedValue = composer.rememberedValue();
            if (rememberedValue == Composer.INSTANCE.getEmpty()) {
                rememberedValue = new Function1() { // from class: io.intercom.android.sdk.m5.home.ui.HomeScreenKt$HomeScreen$3$2$2$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        Unit invoke$lambda$2$lambda$1$lambda$0;
                        invoke$lambda$2$lambda$1$lambda$0 = HomeScreenKt$HomeScreen$3$2$2.invoke$lambda$2$lambda$1$lambda$0(MutableFloatState.this, (LayoutCoordinates) obj);
                        return invoke$lambda$2$lambda$1$lambda$0;
                    }
                };
                composer.updateRememberedValue(rememberedValue);
            }
            composer.endReplaceGroup();
            HomeUiState.Content content = (HomeUiState.Content) homeUiState;
            HomeHeaderKt.HomeContentHeader(OnGloballyPositionedModifierKt.onGloballyPositioned(alpha, (Function1) rememberedValue), content.getHeader(), composer, 64, 0);
            HomeContentScreenKt.HomeContentScreen(null, content, function0, function02, function03, function1, function04, function12, function13, composer, 64, 1);
            ComposerKt.sourceInformationMarkerEnd(composer);
            composer.endNode();
            ComposerKt.sourceInformationMarkerEnd(composer);
            ComposerKt.sourceInformationMarkerEnd(composer);
            ComposerKt.sourceInformationMarkerEnd(composer);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$2$lambda$1$lambda$0(MutableFloatState headerHeightPx, LayoutCoordinates it) {
        Intrinsics.checkNotNullParameter(headerHeightPx, "$headerHeightPx");
        Intrinsics.checkNotNullParameter(it, "it");
        headerHeightPx.setFloatValue((int) (it.mo7465getSizeYbymL2g() & 4294967295L));
        return Unit.INSTANCE;
    }
}
