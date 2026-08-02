package io.intercom.android.sdk.m5.conversation.ui.components.row;

import android.content.Context;
import androidx.compose.animation.AnimatedVisibilityKt;
import androidx.compose.animation.AnimatedVisibilityScope;
import androidx.compose.animation.EnterExitTransitionKt;
import androidx.compose.animation.core.AnimationSpecKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScope;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.material3.IconKt;
import androidx.compose.material3.TextKt;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.ProvidableCompositionLocal;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.res.PainterResources_androidKt;
import androidx.compose.ui.res.StringResources_androidKt;
import androidx.compose.ui.text.style.TextAlign;
import androidx.compose.ui.unit.Dp;
import com.facebook.react.uimanager.ViewProps;
import io.intercom.android.sdk.R;
import io.intercom.android.sdk.m5.components.TextWithSeparatorKt;
import io.intercom.android.sdk.tickets.TicketDetailState;
import io.intercom.android.sdk.tickets.TicketProgressIndicatorKt;
import io.intercom.android.sdk.ui.IntercomPreviews;
import io.intercom.android.sdk.ui.component.IntercomCardKt;
import io.intercom.android.sdk.ui.component.IntercomCardStyle;
import io.intercom.android.sdk.ui.component.IntercomDividerKt;
import io.intercom.android.sdk.ui.theme.IntercomTheme;
import io.intercom.android.sdk.ui.theme.IntercomThemeKt;
import io.intercom.android.sdk.utilities.ColorExtensionsKt;
import io.intercom.android.sdk.utilities.TimeFormatterExtKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: BigTicketCard.kt */
@Metadata(d1 = {"\u0000\"\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a5\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00010\u00052\u0006\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\tH\u0001¢\u0006\u0002\u0010\n\u001a\r\u0010\u000b\u001a\u00020\u0001H\u0001¢\u0006\u0002\u0010\f\u001a\r\u0010\r\u001a\u00020\u0001H\u0001¢\u0006\u0002\u0010\f¨\u0006\u000e"}, d2 = {"BigTicketCard", "", "ticketDetailState", "Lio/intercom/android/sdk/tickets/TicketDetailState$TicketDetailContentState;", ViewProps.ON_CLICK, "Lkotlin/Function0;", ViewProps.VISIBLE, "", "modifier", "Landroidx/compose/ui/Modifier;", "(Lio/intercom/android/sdk/tickets/TicketDetailState$TicketDetailContentState;Lkotlin/jvm/functions/Function0;ZLandroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "BigTicketCardPreview", "(Landroidx/compose/runtime/Composer;I)V", "BigTicketCardWaitingPreview", "intercom-sdk-base_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class BigTicketCardKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final int BigTicketCard$lambda$0(int i) {
        return -i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int BigTicketCard$lambda$1(int i) {
        return -i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit BigTicketCard$lambda$2(TicketDetailState.TicketDetailContentState ticketDetailState, Function0 onClick, boolean z, Modifier modifier, int i, int i2, Composer composer, int i3) {
        Intrinsics.checkNotNullParameter(ticketDetailState, "$ticketDetailState");
        Intrinsics.checkNotNullParameter(onClick, "$onClick");
        BigTicketCard(ticketDetailState, onClick, z, modifier, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit BigTicketCardPreview$lambda$3(int i, Composer composer, int i2) {
        BigTicketCardPreview(composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit BigTicketCardWaitingPreview$lambda$4(int i, Composer composer, int i2) {
        BigTicketCardWaitingPreview(composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    public static final void BigTicketCard(final TicketDetailState.TicketDetailContentState ticketDetailState, final Function0<Unit> onClick, final boolean z, Modifier modifier, Composer composer, final int i, final int i2) {
        Intrinsics.checkNotNullParameter(ticketDetailState, "ticketDetailState");
        Intrinsics.checkNotNullParameter(onClick, "onClick");
        Composer startRestartGroup = composer.startRestartGroup(1861461937);
        final Modifier modifier2 = (i2 & 8) != 0 ? Modifier.INSTANCE : modifier;
        ProvidableCompositionLocal<Context> localContext = AndroidCompositionLocals_androidKt.getLocalContext();
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC(<get-current>):CompositionLocal.kt#9igjgp");
        Object consume = startRestartGroup.consume(localContext);
        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        final Context context = (Context) consume;
        int i3 = i >> 6;
        AnimatedVisibilityKt.AnimatedVisibility(z, modifier2, EnterExitTransitionKt.expandIn$default(AnimationSpecKt.tween$default(1000, 0, null, 6, null), Alignment.INSTANCE.getTopCenter(), false, null, 12, null).plus(EnterExitTransitionKt.slideInVertically(AnimationSpecKt.tween$default(1000, 500, null, 4, null), new Function1() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.row.BigTicketCardKt$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                int BigTicketCard$lambda$0;
                BigTicketCard$lambda$0 = BigTicketCardKt.BigTicketCard$lambda$0(((Integer) obj).intValue());
                return Integer.valueOf(BigTicketCard$lambda$0);
            }
        })).plus(EnterExitTransitionKt.fadeIn$default(AnimationSpecKt.tween$default(1000, 500, null, 4, null), 0.0f, 2, null)), EnterExitTransitionKt.slideOutVertically(AnimationSpecKt.tween$default(1000, 0, null, 6, null), new Function1() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.row.BigTicketCardKt$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                int BigTicketCard$lambda$1;
                BigTicketCard$lambda$1 = BigTicketCardKt.BigTicketCard$lambda$1(((Integer) obj).intValue());
                return Integer.valueOf(BigTicketCard$lambda$1);
            }
        }).plus(EnterExitTransitionKt.fadeOut$default(AnimationSpecKt.tween$default(1000, 0, null, 6, null), 0.0f, 2, null)).plus(EnterExitTransitionKt.shrinkOut$default(AnimationSpecKt.tween$default(1000, 500, null, 4, null), Alignment.INSTANCE.getTopCenter(), false, null, 12, null)), (String) null, ComposableLambdaKt.rememberComposableLambda(-915811879, true, new Function3<AnimatedVisibilityScope, Composer, Integer, Unit>() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.row.BigTicketCardKt$BigTicketCard$3
            @Override // kotlin.jvm.functions.Function3
            public /* bridge */ /* synthetic */ Unit invoke(AnimatedVisibilityScope animatedVisibilityScope, Composer composer2, Integer num) {
                invoke(animatedVisibilityScope, composer2, num.intValue());
                return Unit.INSTANCE;
            }

            public final void invoke(AnimatedVisibilityScope AnimatedVisibility, Composer composer2, int i4) {
                Intrinsics.checkNotNullParameter(AnimatedVisibility, "$this$AnimatedVisibility");
                Alignment.Horizontal centerHorizontally = Alignment.INSTANCE.getCenterHorizontally();
                Function0<Unit> function0 = onClick;
                final TicketDetailState.TicketDetailContentState ticketDetailContentState = ticketDetailState;
                final Context context2 = context;
                ComposerKt.sourceInformationMarkerStart(composer2, 1341605231, "CC(Column)N(modifier,verticalArrangement,horizontalAlignment,content)87@4443L61,88@4509L134:Column.kt#2w3rfo");
                Modifier.Companion companion = Modifier.INSTANCE;
                MeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), centerHorizontally, composer2, 48);
                ComposerKt.sourceInformationMarkerStart(composer2, -1159599143, "CC(Layout)P(!1,2)80@3267L27,83@3433L360:Layout.kt#80mrfh");
                int hashCode = Long.hashCode(ComposablesKt.getCurrentCompositeKeyHashCode(composer2, 0));
                CompositionLocalMap currentCompositionLocalMap = composer2.getCurrentCompositionLocalMap();
                Modifier materializeModifier = ComposedModifierKt.materializeModifier(composer2, companion);
                Function0<ComposeUiNode> constructor = ComposeUiNode.INSTANCE.getConstructor();
                ComposerKt.sourceInformationMarkerStart(composer2, -553112988, "CC(ReusableComposeNode)N(factory,update,content)399@15590L9:Composables.kt#9igjgp");
                if (!(composer2.getApplier() instanceof Applier)) {
                    ComposablesKt.invalidApplier();
                }
                composer2.startReusableNode();
                if (composer2.getInserting()) {
                    composer2.createNode(constructor);
                } else {
                    composer2.useNode();
                }
                Composer m5333constructorimpl = Updater.m5333constructorimpl(composer2);
                Updater.m5340setimpl(m5333constructorimpl, columnMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                Updater.m5340setimpl(m5333constructorimpl, currentCompositionLocalMap, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                if (m5333constructorimpl.getInserting() || !Intrinsics.areEqual(m5333constructorimpl.rememberedValue(), Integer.valueOf(hashCode))) {
                    m5333constructorimpl.updateRememberedValue(Integer.valueOf(hashCode));
                    m5333constructorimpl.apply(Integer.valueOf(hashCode), setCompositeKeyHash);
                }
                Updater.m5340setimpl(m5333constructorimpl, materializeModifier, ComposeUiNode.INSTANCE.getSetModifier());
                ComposerKt.sourceInformationMarkerStart(composer2, 2093002350, "C89@4557L9:Column.kt#2w3rfo");
                ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
                TextKt.m3901TextNvy7gAk(StringResources_androidKt.stringResource(R.string.intercom_your_ticket, composer2, 0), null, 0L, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, IntercomTheme.INSTANCE.getTypography(composer2, IntercomTheme.$stable).getType04(), composer2, 0, 0, 131070);
                IntercomCardKt.IntercomCard(function0, PaddingKt.m1158paddingVpY3zN4(Modifier.INSTANCE, Dp.m8798constructorimpl(14), Dp.m8798constructorimpl(12)), false, IntercomCardStyle.INSTANCE.m12917conversationCardStylePEIptTM(null, 0L, 0L, 0.0f, null, composer2, IntercomCardStyle.$stable << 15, 31), null, ComposableLambdaKt.rememberComposableLambda(-1554241908, true, new Function3<ColumnScope, Composer, Integer, Unit>() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.row.BigTicketCardKt$BigTicketCard$3$1$1
                    @Override // kotlin.jvm.functions.Function3
                    public /* bridge */ /* synthetic */ Unit invoke(ColumnScope columnScope, Composer composer3, Integer num) {
                        invoke(columnScope, composer3, num.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(ColumnScope IntercomCard, Composer composer3, int i5) {
                        String str;
                        Intrinsics.checkNotNullParameter(IntercomCard, "$this$IntercomCard");
                        if ((i5 & 81) != 16 || !composer3.getSkipping()) {
                            TicketDetailState.TicketDetailContentState ticketDetailContentState2 = TicketDetailState.TicketDetailContentState.this;
                            Context context3 = context2;
                            ComposerKt.sourceInformationMarkerStart(composer3, 1341605231, "CC(Column)N(modifier,verticalArrangement,horizontalAlignment,content)87@4443L61,88@4509L134:Column.kt#2w3rfo");
                            Modifier.Companion companion2 = Modifier.INSTANCE;
                            MeasurePolicy columnMeasurePolicy2 = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composer3, 0);
                            ComposerKt.sourceInformationMarkerStart(composer3, -1159599143, "CC(Layout)P(!1,2)80@3267L27,83@3433L360:Layout.kt#80mrfh");
                            int hashCode2 = Long.hashCode(ComposablesKt.getCurrentCompositeKeyHashCode(composer3, 0));
                            CompositionLocalMap currentCompositionLocalMap2 = composer3.getCurrentCompositionLocalMap();
                            Modifier materializeModifier2 = ComposedModifierKt.materializeModifier(composer3, companion2);
                            Function0<ComposeUiNode> constructor2 = ComposeUiNode.INSTANCE.getConstructor();
                            ComposerKt.sourceInformationMarkerStart(composer3, -553112988, "CC(ReusableComposeNode)N(factory,update,content)399@15590L9:Composables.kt#9igjgp");
                            if (!(composer3.getApplier() instanceof Applier)) {
                                ComposablesKt.invalidApplier();
                            }
                            composer3.startReusableNode();
                            if (composer3.getInserting()) {
                                composer3.createNode(constructor2);
                            } else {
                                composer3.useNode();
                            }
                            Composer m5333constructorimpl2 = Updater.m5333constructorimpl(composer3);
                            Updater.m5340setimpl(m5333constructorimpl2, columnMeasurePolicy2, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                            Updater.m5340setimpl(m5333constructorimpl2, currentCompositionLocalMap2, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                            if (m5333constructorimpl2.getInserting() || !Intrinsics.areEqual(m5333constructorimpl2.rememberedValue(), Integer.valueOf(hashCode2))) {
                                m5333constructorimpl2.updateRememberedValue(Integer.valueOf(hashCode2));
                                m5333constructorimpl2.apply(Integer.valueOf(hashCode2), setCompositeKeyHash2);
                            }
                            Updater.m5340setimpl(m5333constructorimpl2, materializeModifier2, ComposeUiNode.INSTANCE.getSetModifier());
                            ComposerKt.sourceInformationMarkerStart(composer3, 2093002350, "C89@4557L9:Column.kt#2w3rfo");
                            ColumnScopeInstance columnScopeInstance2 = ColumnScopeInstance.INSTANCE;
                            float f = 12;
                            Modifier m1157padding3ABfNKs = PaddingKt.m1157padding3ABfNKs(Modifier.INSTANCE, Dp.m8798constructorimpl(f));
                            Alignment.Horizontal centerHorizontally2 = Alignment.INSTANCE.getCenterHorizontally();
                            ComposerKt.sourceInformationMarkerStart(composer3, 1341605231, "CC(Column)N(modifier,verticalArrangement,horizontalAlignment,content)87@4443L61,88@4509L134:Column.kt#2w3rfo");
                            MeasurePolicy columnMeasurePolicy3 = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), centerHorizontally2, composer3, 48);
                            ComposerKt.sourceInformationMarkerStart(composer3, -1159599143, "CC(Layout)P(!1,2)80@3267L27,83@3433L360:Layout.kt#80mrfh");
                            int hashCode3 = Long.hashCode(ComposablesKt.getCurrentCompositeKeyHashCode(composer3, 0));
                            CompositionLocalMap currentCompositionLocalMap3 = composer3.getCurrentCompositionLocalMap();
                            Modifier materializeModifier3 = ComposedModifierKt.materializeModifier(composer3, m1157padding3ABfNKs);
                            Function0<ComposeUiNode> constructor3 = ComposeUiNode.INSTANCE.getConstructor();
                            ComposerKt.sourceInformationMarkerStart(composer3, -553112988, "CC(ReusableComposeNode)N(factory,update,content)399@15590L9:Composables.kt#9igjgp");
                            if (!(composer3.getApplier() instanceof Applier)) {
                                ComposablesKt.invalidApplier();
                            }
                            composer3.startReusableNode();
                            if (composer3.getInserting()) {
                                composer3.createNode(constructor3);
                            } else {
                                composer3.useNode();
                            }
                            Composer m5333constructorimpl3 = Updater.m5333constructorimpl(composer3);
                            Updater.m5340setimpl(m5333constructorimpl3, columnMeasurePolicy3, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                            Updater.m5340setimpl(m5333constructorimpl3, currentCompositionLocalMap3, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash3 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                            if (m5333constructorimpl3.getInserting() || !Intrinsics.areEqual(m5333constructorimpl3.rememberedValue(), Integer.valueOf(hashCode3))) {
                                m5333constructorimpl3.updateRememberedValue(Integer.valueOf(hashCode3));
                                m5333constructorimpl3.apply(Integer.valueOf(hashCode3), setCompositeKeyHash3);
                            }
                            Updater.m5340setimpl(m5333constructorimpl3, materializeModifier3, ComposeUiNode.INSTANCE.getSetModifier());
                            ComposerKt.sourceInformationMarkerStart(composer3, 2093002350, "C89@4557L9:Column.kt#2w3rfo");
                            ColumnScopeInstance columnScopeInstance3 = ColumnScopeInstance.INSTANCE;
                            SpacerKt.Spacer(SizeKt.m1195height3ABfNKs(Modifier.INSTANCE, Dp.m8798constructorimpl(4)), composer3, 6);
                            TextKt.m3901TextNvy7gAk(ticketDetailContentState2.getTicketName(), null, 0L, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, IntercomTheme.INSTANCE.getTypography(composer3, IntercomTheme.$stable).getType04SemiBold(), composer3, 0, 0, 131070);
                            ticketDetailContentState2.getTicketTimelineCardState().getStatusLabel();
                            Unit unit = Unit.INSTANCE;
                            float f2 = 8;
                            SpacerKt.Spacer(SizeKt.m1195height3ABfNKs(Modifier.INSTANCE, Dp.m8798constructorimpl(f2)), composer3, 6);
                            String statusLabel = ticketDetailContentState2.getTicketTimelineCardState().getStatusLabel();
                            Long timestamp = ticketDetailContentState2.getTicketTimelineCardState().getTimestamp();
                            if (timestamp == null || (str = TimeFormatterExtKt.formattedDateFromLong(timestamp.longValue(), context3)) == null) {
                                str = "";
                            }
                            TextWithSeparatorKt.m12128TextWithSeparatorwV1YYcM(statusLabel, str, null, null, IntercomTheme.INSTANCE.getTypography(composer3, IntercomTheme.$stable).getType04SemiBold(), ticketDetailContentState2.getTicketTimelineCardState().m12843getProgressColor0d7_KjU(), 0, 0, TextAlign.m8647boximpl(TextAlign.INSTANCE.m8654getCentere0LSkKk()), composer3, 0, 204);
                            SpacerKt.Spacer(SizeKt.m1195height3ABfNKs(Modifier.INSTANCE, Dp.m8798constructorimpl(f2)), composer3, 6);
                            TextKt.m3901TextNvy7gAk(ticketDetailContentState2.getTicketTimelineCardState().getStatusTitle(), null, 0L, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, IntercomTheme.INSTANCE.getTypography(composer3, IntercomTheme.$stable).getType04(), composer3, 0, 0, 131070);
                            SpacerKt.Spacer(SizeKt.m1195height3ABfNKs(Modifier.INSTANCE, Dp.m8798constructorimpl(16)), composer3, 6);
                            TicketProgressIndicatorKt.m12838TicketProgressIndicator3IgeMak(ticketDetailContentState2.getTicketTimelineCardState().getProgressSections(), ticketDetailContentState2.getTicketTimelineCardState().m12843getProgressColor0d7_KjU(), null, composer3, 8, 4);
                            SpacerKt.Spacer(SizeKt.m1195height3ABfNKs(Modifier.INSTANCE, Dp.m8798constructorimpl(f2)), composer3, 6);
                            ComposerKt.sourceInformationMarkerEnd(composer3);
                            composer3.endNode();
                            ComposerKt.sourceInformationMarkerEnd(composer3);
                            ComposerKt.sourceInformationMarkerEnd(composer3);
                            ComposerKt.sourceInformationMarkerEnd(composer3);
                            IntercomDividerKt.IntercomDivider(PaddingKt.m1159paddingVpY3zN4$default(Modifier.INSTANCE, Dp.m8798constructorimpl(f), 0.0f, 2, null), composer3, 6, 0);
                            Modifier m1159paddingVpY3zN4$default = PaddingKt.m1159paddingVpY3zN4$default(columnScopeInstance2.align(Modifier.INSTANCE, Alignment.INSTANCE.getCenterHorizontally()), 0.0f, Dp.m8798constructorimpl(14), 1, null);
                            Alignment.Vertical centerVertically = Alignment.INSTANCE.getCenterVertically();
                            ComposerKt.sourceInformationMarkerStart(composer3, 844473419, "CC(Row)N(modifier,horizontalArrangement,verticalAlignment,content)99@5125L58,100@5188L131:Row.kt#2w3rfo");
                            MeasurePolicy rowMeasurePolicy = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), centerVertically, composer3, 48);
                            ComposerKt.sourceInformationMarkerStart(composer3, -1159599143, "CC(Layout)P(!1,2)80@3267L27,83@3433L360:Layout.kt#80mrfh");
                            int hashCode4 = Long.hashCode(ComposablesKt.getCurrentCompositeKeyHashCode(composer3, 0));
                            CompositionLocalMap currentCompositionLocalMap4 = composer3.getCurrentCompositionLocalMap();
                            Modifier materializeModifier4 = ComposedModifierKt.materializeModifier(composer3, m1159paddingVpY3zN4$default);
                            Function0<ComposeUiNode> constructor4 = ComposeUiNode.INSTANCE.getConstructor();
                            ComposerKt.sourceInformationMarkerStart(composer3, -553112988, "CC(ReusableComposeNode)N(factory,update,content)399@15590L9:Composables.kt#9igjgp");
                            if (!(composer3.getApplier() instanceof Applier)) {
                                ComposablesKt.invalidApplier();
                            }
                            composer3.startReusableNode();
                            if (composer3.getInserting()) {
                                composer3.createNode(constructor4);
                            } else {
                                composer3.useNode();
                            }
                            Composer m5333constructorimpl4 = Updater.m5333constructorimpl(composer3);
                            Updater.m5340setimpl(m5333constructorimpl4, rowMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                            Updater.m5340setimpl(m5333constructorimpl4, currentCompositionLocalMap4, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash4 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                            if (m5333constructorimpl4.getInserting() || !Intrinsics.areEqual(m5333constructorimpl4.rememberedValue(), Integer.valueOf(hashCode4))) {
                                m5333constructorimpl4.updateRememberedValue(Integer.valueOf(hashCode4));
                                m5333constructorimpl4.apply(Integer.valueOf(hashCode4), setCompositeKeyHash4);
                            }
                            Updater.m5340setimpl(m5333constructorimpl4, materializeModifier4, ComposeUiNode.INSTANCE.getSetModifier());
                            ComposerKt.sourceInformationMarkerStart(composer3, 1456264949, "C101@5233L9:Row.kt#2w3rfo");
                            RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
                            IconKt.m3194Iconww6aTOc(PainterResources_androidKt.painterResource(R.drawable.intercom_ticket_detail_icon, composer3, 0), (String) null, PaddingKt.m1161paddingqDBjuR0$default(Modifier.INSTANCE, 0.0f, 0.0f, Dp.m8798constructorimpl(f2), 0.0f, 11, null), ColorExtensionsKt.m13183getAccessibleColorOnWhiteBackground8_81llA(IntercomTheme.INSTANCE.getColors(composer3, IntercomTheme.$stable).m13089getAction0d7_KjU()), composer3, 440, 0);
                            TextKt.m3901TextNvy7gAk(StringResources_androidKt.stringResource(R.string.intercom_tickets_view_ticket, composer3, 0), null, ColorExtensionsKt.m13183getAccessibleColorOnWhiteBackground8_81llA(IntercomTheme.INSTANCE.getColors(composer3, IntercomTheme.$stable).m13089getAction0d7_KjU()), null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, IntercomTheme.INSTANCE.getTypography(composer3, IntercomTheme.$stable).getType04SemiBold(), composer3, 0, 0, 131066);
                            ComposerKt.sourceInformationMarkerEnd(composer3);
                            composer3.endNode();
                            ComposerKt.sourceInformationMarkerEnd(composer3);
                            ComposerKt.sourceInformationMarkerEnd(composer3);
                            ComposerKt.sourceInformationMarkerEnd(composer3);
                            ComposerKt.sourceInformationMarkerEnd(composer3);
                            composer3.endNode();
                            ComposerKt.sourceInformationMarkerEnd(composer3);
                            ComposerKt.sourceInformationMarkerEnd(composer3);
                            ComposerKt.sourceInformationMarkerEnd(composer3);
                            return;
                        }
                        composer3.skipToGroupEnd();
                    }
                }, composer2, 54), composer2, (IntercomCardStyle.Style.$stable << 9) | 196656, 20);
                ComposerKt.sourceInformationMarkerEnd(composer2);
                composer2.endNode();
                ComposerKt.sourceInformationMarkerEnd(composer2);
                ComposerKt.sourceInformationMarkerEnd(composer2);
                ComposerKt.sourceInformationMarkerEnd(composer2);
            }
        }, startRestartGroup, 54), startRestartGroup, (i3 & 14) | 196992 | (i3 & 112), 16);
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new Function2() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.row.BigTicketCardKt$$ExternalSyntheticLambda3
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    Unit BigTicketCard$lambda$2;
                    BigTicketCard$lambda$2 = BigTicketCardKt.BigTicketCard$lambda$2(TicketDetailState.TicketDetailContentState.this, onClick, z, modifier2, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                    return BigTicketCard$lambda$2;
                }
            });
        }
    }

    @IntercomPreviews
    public static final void BigTicketCardPreview(Composer composer, final int i) {
        Composer startRestartGroup = composer.startRestartGroup(1841168271);
        if (i != 0 || !startRestartGroup.getSkipping()) {
            IntercomThemeKt.IntercomTheme(null, null, null, ComposableSingletons$BigTicketCardKt.INSTANCE.m12335getLambda1$intercom_sdk_base_release(), startRestartGroup, 3072, 7);
        } else {
            startRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new Function2() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.row.BigTicketCardKt$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    Unit BigTicketCardPreview$lambda$3;
                    BigTicketCardPreview$lambda$3 = BigTicketCardKt.BigTicketCardPreview$lambda$3(i, (Composer) obj, ((Integer) obj2).intValue());
                    return BigTicketCardPreview$lambda$3;
                }
            });
        }
    }

    @IntercomPreviews
    public static final void BigTicketCardWaitingPreview(Composer composer, final int i) {
        Composer startRestartGroup = composer.startRestartGroup(-1532589538);
        if (i != 0 || !startRestartGroup.getSkipping()) {
            IntercomThemeKt.IntercomTheme(null, null, null, ComposableSingletons$BigTicketCardKt.INSTANCE.m12336getLambda2$intercom_sdk_base_release(), startRestartGroup, 3072, 7);
        } else {
            startRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new Function2() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.row.BigTicketCardKt$$ExternalSyntheticLambda4
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    Unit BigTicketCardWaitingPreview$lambda$4;
                    BigTicketCardWaitingPreview$lambda$4 = BigTicketCardKt.BigTicketCardWaitingPreview$lambda$4(i, (Composer) obj, ((Integer) obj2).intValue());
                    return BigTicketCardWaitingPreview$lambda$4;
                }
            });
        }
    }
}
