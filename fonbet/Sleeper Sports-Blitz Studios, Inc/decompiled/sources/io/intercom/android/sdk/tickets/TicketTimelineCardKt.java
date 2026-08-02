package io.intercom.android.sdk.tickets;

import android.content.Context;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
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
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.text.style.TextAlign;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.TextUnitKt;
import io.intercom.android.sdk.m5.components.AvatarGroupKt;
import io.intercom.android.sdk.m5.components.TextWithSeparatorKt;
import io.intercom.android.sdk.m5.components.avatar.AvatarWrapper;
import io.intercom.android.sdk.models.Avatar;
import io.intercom.android.sdk.tickets.TicketTimelineCardState;
import io.intercom.android.sdk.ui.theme.IntercomTheme;
import io.intercom.android.sdk.ui.theme.IntercomThemeKt;
import io.intercom.android.sdk.utilities.TimeFormatterExtKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: TicketTimelineCard.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\u001a\u001f\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005H\u0001¢\u0006\u0002\u0010\u0006\u001a\r\u0010\u0007\u001a\u00020\u0001H\u0001¢\u0006\u0002\u0010\b\u001a\r\u0010\t\u001a\u00020\u0001H\u0001¢\u0006\u0002\u0010\b\u001a\r\u0010\n\u001a\u00020\u0001H\u0001¢\u0006\u0002\u0010\b\u001a\r\u0010\u000b\u001a\u00020\u0001H\u0001¢\u0006\u0002\u0010\b\"\u0014\u0010\f\u001a\u00020\u0003X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"TicketTimelineCard", "", "ticketTimelineCardState", "Lio/intercom/android/sdk/tickets/TicketTimelineCardState;", "modifier", "Landroidx/compose/ui/Modifier;", "(Lio/intercom/android/sdk/tickets/TicketTimelineCardState;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "WaitingOnCustomerTicketTimelinePreview", "(Landroidx/compose/runtime/Composer;I)V", "SubmittedTicketTimelineWithLabelPreview", "ResolvedTicketTimelineWithLabelPreview", "InProgressTicketTimelineWithLabelPreview", "sampleTicketTimelineCardState", "getSampleTicketTimelineCardState", "()Lio/intercom/android/sdk/tickets/TicketTimelineCardState;", "intercom-sdk-base_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class TicketTimelineCardKt {
    private static final TicketTimelineCardState sampleTicketTimelineCardState;

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit InProgressTicketTimelineWithLabelPreview$lambda$6(int i, Composer composer, int i2) {
        InProgressTicketTimelineWithLabelPreview(composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ResolvedTicketTimelineWithLabelPreview$lambda$5(int i, Composer composer, int i2) {
        ResolvedTicketTimelineWithLabelPreview(composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit SubmittedTicketTimelineWithLabelPreview$lambda$4(int i, Composer composer, int i2) {
        SubmittedTicketTimelineWithLabelPreview(composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit TicketTimelineCard$lambda$2(TicketTimelineCardState ticketTimelineCardState, Modifier modifier, int i, int i2, Composer composer, int i3) {
        Intrinsics.checkNotNullParameter(ticketTimelineCardState, "$ticketTimelineCardState");
        TicketTimelineCard(ticketTimelineCardState, modifier, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit WaitingOnCustomerTicketTimelinePreview$lambda$3(int i, Composer composer, int i2) {
        WaitingOnCustomerTicketTimelinePreview(composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    public static final void TicketTimelineCard(final TicketTimelineCardState ticketTimelineCardState, Modifier modifier, Composer composer, final int i, final int i2) {
        String str;
        Intrinsics.checkNotNullParameter(ticketTimelineCardState, "ticketTimelineCardState");
        Composer startRestartGroup = composer.startRestartGroup(926572596);
        final Modifier.Companion companion = (i2 & 2) != 0 ? Modifier.INSTANCE : modifier;
        ProvidableCompositionLocal<Context> localContext = AndroidCompositionLocals_androidKt.getLocalContext();
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC(<get-current>):CompositionLocal.kt#9igjgp");
        Object consume = startRestartGroup.consume(localContext);
        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        Context context = (Context) consume;
        Modifier m1157padding3ABfNKs = PaddingKt.m1157padding3ABfNKs(companion, Dp.m8798constructorimpl(24));
        Alignment.Horizontal centerHorizontally = Alignment.INSTANCE.getCenterHorizontally();
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, 1341605231, "CC(Column)N(modifier,verticalArrangement,horizontalAlignment,content)87@4443L61,88@4509L134:Column.kt#2w3rfo");
        MeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), centerHorizontally, startRestartGroup, 48);
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1159599143, "CC(Layout)P(!1,2)80@3267L27,83@3433L360:Layout.kt#80mrfh");
        int hashCode = Long.hashCode(ComposablesKt.getCurrentCompositeKeyHashCode(startRestartGroup, 0));
        CompositionLocalMap currentCompositionLocalMap = startRestartGroup.getCurrentCompositionLocalMap();
        Modifier materializeModifier = ComposedModifierKt.materializeModifier(startRestartGroup, m1157padding3ABfNKs);
        Function0<ComposeUiNode> constructor = ComposeUiNode.INSTANCE.getConstructor();
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -553112988, "CC(ReusableComposeNode)N(factory,update,content)399@15590L9:Composables.kt#9igjgp");
        if (!(startRestartGroup.getApplier() instanceof Applier)) {
            ComposablesKt.invalidApplier();
        }
        startRestartGroup.startReusableNode();
        if (startRestartGroup.getInserting()) {
            startRestartGroup.createNode(constructor);
        } else {
            startRestartGroup.useNode();
        }
        Composer m5333constructorimpl = Updater.m5333constructorimpl(startRestartGroup);
        Updater.m5340setimpl(m5333constructorimpl, columnMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
        Updater.m5340setimpl(m5333constructorimpl, currentCompositionLocalMap, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
        if (m5333constructorimpl.getInserting() || !Intrinsics.areEqual(m5333constructorimpl.rememberedValue(), Integer.valueOf(hashCode))) {
            m5333constructorimpl.updateRememberedValue(Integer.valueOf(hashCode));
            m5333constructorimpl.apply(Integer.valueOf(hashCode), setCompositeKeyHash);
        }
        Updater.m5340setimpl(m5333constructorimpl, materializeModifier, ComposeUiNode.INSTANCE.getSetModifier());
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2093002350, "C89@4557L9:Column.kt#2w3rfo");
        ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
        Modifier wrapContentWidth$default = SizeKt.wrapContentWidth$default(Modifier.INSTANCE, null, false, 3, null);
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, 844473419, "CC(Row)N(modifier,horizontalArrangement,verticalAlignment,content)99@5125L58,100@5188L131:Row.kt#2w3rfo");
        MeasurePolicy rowMeasurePolicy = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), Alignment.INSTANCE.getTop(), startRestartGroup, 0);
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1159599143, "CC(Layout)P(!1,2)80@3267L27,83@3433L360:Layout.kt#80mrfh");
        int hashCode2 = Long.hashCode(ComposablesKt.getCurrentCompositeKeyHashCode(startRestartGroup, 0));
        CompositionLocalMap currentCompositionLocalMap2 = startRestartGroup.getCurrentCompositionLocalMap();
        Modifier materializeModifier2 = ComposedModifierKt.materializeModifier(startRestartGroup, wrapContentWidth$default);
        Function0<ComposeUiNode> constructor2 = ComposeUiNode.INSTANCE.getConstructor();
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -553112988, "CC(ReusableComposeNode)N(factory,update,content)399@15590L9:Composables.kt#9igjgp");
        if (!(startRestartGroup.getApplier() instanceof Applier)) {
            ComposablesKt.invalidApplier();
        }
        startRestartGroup.startReusableNode();
        if (startRestartGroup.getInserting()) {
            startRestartGroup.createNode(constructor2);
        } else {
            startRestartGroup.useNode();
        }
        Composer m5333constructorimpl2 = Updater.m5333constructorimpl(startRestartGroup);
        Updater.m5340setimpl(m5333constructorimpl2, rowMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
        Updater.m5340setimpl(m5333constructorimpl2, currentCompositionLocalMap2, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
        if (m5333constructorimpl2.getInserting() || !Intrinsics.areEqual(m5333constructorimpl2.rememberedValue(), Integer.valueOf(hashCode2))) {
            m5333constructorimpl2.updateRememberedValue(Integer.valueOf(hashCode2));
            m5333constructorimpl2.apply(Integer.valueOf(hashCode2), setCompositeKeyHash2);
        }
        Updater.m5340setimpl(m5333constructorimpl2, materializeModifier2, ComposeUiNode.INSTANCE.getSetModifier());
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, 1456264949, "C101@5233L9:Row.kt#2w3rfo");
        RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
        AvatarGroupKt.m12024AvatarGroupJ8mCjc(ticketTimelineCardState.getAdminAvatars(), null, Dp.m8798constructorimpl(64), TextUnitKt.getSp(24), startRestartGroup, 3464, 2);
        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        startRestartGroup.endNode();
        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        SpacerKt.Spacer(SizeKt.m1195height3ABfNKs(Modifier.INSTANCE, Dp.m8798constructorimpl(12)), startRestartGroup, 6);
        String statusLabel = ticketTimelineCardState.getStatusLabel();
        Long timestamp = ticketTimelineCardState.getTimestamp();
        if (timestamp == null || (str = TimeFormatterExtKt.formattedDateFromLong(timestamp.longValue(), context)) == null) {
            str = "";
        }
        TextWithSeparatorKt.m12128TextWithSeparatorwV1YYcM(statusLabel, str, null, null, IntercomTheme.INSTANCE.getTypography(startRestartGroup, IntercomTheme.$stable).getType04SemiBold(), ticketTimelineCardState.m12843getProgressColor0d7_KjU(), 0, 0, TextAlign.m8647boximpl(TextAlign.INSTANCE.m8654getCentere0LSkKk()), startRestartGroup, 0, 204);
        float f = 8;
        SpacerKt.Spacer(SizeKt.m1195height3ABfNKs(Modifier.INSTANCE, Dp.m8798constructorimpl(f)), startRestartGroup, 6);
        TextKt.m3901TextNvy7gAk(ticketTimelineCardState.getStatusTitle(), null, IntercomTheme.INSTANCE.getColors(startRestartGroup, IntercomTheme.$stable).m13116getPrimaryText0d7_KjU(), null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, IntercomTheme.INSTANCE.getTypography(startRestartGroup, IntercomTheme.$stable).getType04(), startRestartGroup, 0, 0, 131066);
        Composer composer2 = startRestartGroup;
        composer2.startReplaceGroup(2095162818);
        if (ticketTimelineCardState.getStatusSubtitle().length() > 0) {
            SpacerKt.Spacer(SizeKt.m1195height3ABfNKs(Modifier.INSTANCE, Dp.m8798constructorimpl(f)), composer2, 6);
            TextKt.m3901TextNvy7gAk(ticketTimelineCardState.getStatusSubtitle(), null, IntercomTheme.INSTANCE.getColors(composer2, IntercomTheme.$stable).m13116getPrimaryText0d7_KjU(), null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, IntercomTheme.INSTANCE.getTypography(composer2, IntercomTheme.$stable).getType04(), composer2, 0, 0, 131066);
            composer2 = composer2;
        }
        composer2.endReplaceGroup();
        SpacerKt.Spacer(SizeKt.m1195height3ABfNKs(Modifier.INSTANCE, Dp.m8798constructorimpl(16)), composer2, 6);
        TicketProgressIndicatorKt.m12838TicketProgressIndicator3IgeMak(ticketTimelineCardState.getProgressSections(), ticketTimelineCardState.m12843getProgressColor0d7_KjU(), null, composer2, 8, 4);
        ComposerKt.sourceInformationMarkerEnd(composer2);
        composer2.endNode();
        ComposerKt.sourceInformationMarkerEnd(composer2);
        ComposerKt.sourceInformationMarkerEnd(composer2);
        ComposerKt.sourceInformationMarkerEnd(composer2);
        ScopeUpdateScope endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new Function2() { // from class: io.intercom.android.sdk.tickets.TicketTimelineCardKt$$ExternalSyntheticLambda4
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    Unit TicketTimelineCard$lambda$2;
                    TicketTimelineCard$lambda$2 = TicketTimelineCardKt.TicketTimelineCard$lambda$2(TicketTimelineCardState.this, companion, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                    return TicketTimelineCard$lambda$2;
                }
            });
        }
    }

    public static final void WaitingOnCustomerTicketTimelinePreview(Composer composer, final int i) {
        Composer startRestartGroup = composer.startRestartGroup(-670677167);
        if (i != 0 || !startRestartGroup.getSkipping()) {
            IntercomThemeKt.IntercomTheme(null, null, null, ComposableSingletons$TicketTimelineCardKt.INSTANCE.m12824getLambda1$intercom_sdk_base_release(), startRestartGroup, 3072, 7);
        } else {
            startRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new Function2() { // from class: io.intercom.android.sdk.tickets.TicketTimelineCardKt$$ExternalSyntheticLambda2
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    Unit WaitingOnCustomerTicketTimelinePreview$lambda$3;
                    WaitingOnCustomerTicketTimelinePreview$lambda$3 = TicketTimelineCardKt.WaitingOnCustomerTicketTimelinePreview$lambda$3(i, (Composer) obj, ((Integer) obj2).intValue());
                    return WaitingOnCustomerTicketTimelinePreview$lambda$3;
                }
            });
        }
    }

    public static final void SubmittedTicketTimelineWithLabelPreview(Composer composer, final int i) {
        Composer startRestartGroup = composer.startRestartGroup(-1972637636);
        if (i != 0 || !startRestartGroup.getSkipping()) {
            IntercomThemeKt.IntercomTheme(null, null, null, ComposableSingletons$TicketTimelineCardKt.INSTANCE.m12825getLambda2$intercom_sdk_base_release(), startRestartGroup, 3072, 7);
        } else {
            startRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new Function2() { // from class: io.intercom.android.sdk.tickets.TicketTimelineCardKt$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    Unit SubmittedTicketTimelineWithLabelPreview$lambda$4;
                    SubmittedTicketTimelineWithLabelPreview$lambda$4 = TicketTimelineCardKt.SubmittedTicketTimelineWithLabelPreview$lambda$4(i, (Composer) obj, ((Integer) obj2).intValue());
                    return SubmittedTicketTimelineWithLabelPreview$lambda$4;
                }
            });
        }
    }

    public static final void ResolvedTicketTimelineWithLabelPreview(Composer composer, final int i) {
        Composer startRestartGroup = composer.startRestartGroup(2040249091);
        if (i != 0 || !startRestartGroup.getSkipping()) {
            IntercomThemeKt.IntercomTheme(null, null, null, ComposableSingletons$TicketTimelineCardKt.INSTANCE.m12826getLambda3$intercom_sdk_base_release(), startRestartGroup, 3072, 7);
        } else {
            startRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new Function2() { // from class: io.intercom.android.sdk.tickets.TicketTimelineCardKt$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    Unit ResolvedTicketTimelineWithLabelPreview$lambda$5;
                    ResolvedTicketTimelineWithLabelPreview$lambda$5 = TicketTimelineCardKt.ResolvedTicketTimelineWithLabelPreview$lambda$5(i, (Composer) obj, ((Integer) obj2).intValue());
                    return ResolvedTicketTimelineWithLabelPreview$lambda$5;
                }
            });
        }
    }

    public static final void InProgressTicketTimelineWithLabelPreview(Composer composer, final int i) {
        Composer startRestartGroup = composer.startRestartGroup(-255211063);
        if (i != 0 || !startRestartGroup.getSkipping()) {
            IntercomThemeKt.IntercomTheme(null, null, null, ComposableSingletons$TicketTimelineCardKt.INSTANCE.m12827getLambda4$intercom_sdk_base_release(), startRestartGroup, 3072, 7);
        } else {
            startRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new Function2() { // from class: io.intercom.android.sdk.tickets.TicketTimelineCardKt$$ExternalSyntheticLambda3
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    Unit InProgressTicketTimelineWithLabelPreview$lambda$6;
                    InProgressTicketTimelineWithLabelPreview$lambda$6 = TicketTimelineCardKt.InProgressTicketTimelineWithLabelPreview$lambda$6(i, (Composer) obj, ((Integer) obj2).intValue());
                    return InProgressTicketTimelineWithLabelPreview$lambda$6;
                }
            });
        }
    }

    static {
        Avatar create = Avatar.create("https://static.intercomassets.com/avatars/5355644/square_128/002Bizimply-Headshots-1641919551.jpeg", "");
        Intrinsics.checkNotNullExpressionValue(create, "create(...)");
        sampleTicketTimelineCardState = new TicketTimelineCardState(CollectionsKt.listOf(new AvatarWrapper(create, false, 2, null)), "Hannah will pick this up soon 🙌", "🕑  Estimated to be resolved today at 4pm", TicketStatus.Submitted.getColor(), CollectionsKt.listOf((Object[]) new TicketTimelineCardState.ProgressSection[]{new TicketTimelineCardState.ProgressSection(true, true), new TicketTimelineCardState.ProgressSection(false, false), new TicketTimelineCardState.ProgressSection(false, false)}), "Submitted", Long.valueOf(System.currentTimeMillis()), null);
    }

    public static final TicketTimelineCardState getSampleTicketTimelineCardState() {
        return sampleTicketTimelineCardState;
    }
}
