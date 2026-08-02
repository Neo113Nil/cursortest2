package io.intercom.android.sdk.m5.helpcenter.ui.components;

import android.content.Context;
import android.content.res.Configuration;
import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.OffsetKt;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
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
import androidx.compose.ui.draw.CacheDrawScope;
import androidx.compose.ui.draw.ClipKt;
import androidx.compose.ui.draw.DrawModifierKt;
import androidx.compose.ui.draw.DrawResult;
import androidx.compose.ui.graphics.AndroidPath_androidKt;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.graphics.Path;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.res.StringResources_androidKt;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.unit.Dp;
import androidx.core.view.ViewCompat;
import io.intercom.android.sdk.Injector;
import io.intercom.android.sdk.R;
import io.intercom.android.sdk.helpcenter.articles.ArticleViewState;
import io.intercom.android.sdk.m5.ConversationScreenOpenerKt;
import io.intercom.android.sdk.m5.components.IntercomPrimaryButtonKt;
import io.intercom.android.sdk.metrics.MetricTracker;
import io.intercom.android.sdk.models.OpenMessengerResponse;
import io.intercom.android.sdk.ui.IntercomPreviews;
import io.intercom.android.sdk.ui.component.IntercomButton;
import io.intercom.android.sdk.ui.component.IntercomButtonKt;
import io.intercom.android.sdk.ui.component.IntercomDividerKt;
import io.intercom.android.sdk.ui.extension.ModifierExtensionsKt;
import io.intercom.android.sdk.ui.theme.IntercomTheme;
import io.intercom.android.sdk.ui.theme.IntercomThemeKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: TeamPresenceComponent.kt */
@Metadata(d1 = {"\u0000\u001c\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\u001a)\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007H\u0001¢\u0006\u0002\u0010\b\u001a\u0015\u0010\n\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\u0001¢\u0006\u0002\u0010\u000b\u001a\r\u0010\f\u001a\u00020\u0001H\u0001¢\u0006\u0002\u0010\r\u001a\r\u0010\u000e\u001a\u00020\u0001H\u0001¢\u0006\u0002\u0010\r\"\u000e\u0010\t\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000f"}, d2 = {"TeamPresenceComponent", "", "teamPresenceState", "Lio/intercom/android/sdk/helpcenter/articles/ArticleViewState$TeamPresenceState;", "needsDivider", "", "buttonStyle", "Lio/intercom/android/sdk/m5/helpcenter/ui/components/TeamPresenceButtonStyle;", "(Lio/intercom/android/sdk/helpcenter/articles/ArticleViewState$TeamPresenceState;ZLio/intercom/android/sdk/m5/helpcenter/ui/components/TeamPresenceButtonStyle;Landroidx/compose/runtime/Composer;II)V", "mockTeamPresenceState", "TeamPresenceComponentWithBubble", "(Lio/intercom/android/sdk/helpcenter/articles/ArticleViewState$TeamPresenceState;Landroidx/compose/runtime/Composer;I)V", "TeamPresenceWithBubblePreview", "(Landroidx/compose/runtime/Composer;I)V", "TeamPresencePreview", "intercom-sdk-base_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class TeamPresenceComponentKt {
    private static final ArticleViewState.TeamPresenceState mockTeamPresenceState;

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit TeamPresenceComponent$lambda$4(ArticleViewState.TeamPresenceState teamPresenceState, boolean z, TeamPresenceButtonStyle teamPresenceButtonStyle, int i, int i2, Composer composer, int i3) {
        Intrinsics.checkNotNullParameter(teamPresenceState, "$teamPresenceState");
        TeamPresenceComponent(teamPresenceState, z, teamPresenceButtonStyle, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit TeamPresenceComponentWithBubble$lambda$12(ArticleViewState.TeamPresenceState teamPresenceState, int i, Composer composer, int i2) {
        Intrinsics.checkNotNullParameter(teamPresenceState, "$teamPresenceState");
        TeamPresenceComponentWithBubble(teamPresenceState, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit TeamPresencePreview$lambda$14(int i, Composer composer, int i2) {
        TeamPresencePreview(composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit TeamPresenceWithBubblePreview$lambda$13(int i, Composer composer, int i2) {
        TeamPresenceWithBubblePreview(composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x02ff  */
    /* JADX WARN: Removed duplicated region for block: B:22:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00fb  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0107  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0130  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x016a  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x01af  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x01c2  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x01f1  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0204  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x026d  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x02e5  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x021f  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x010b  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x004e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void TeamPresenceComponent(final ArticleViewState.TeamPresenceState teamPresenceState, boolean z, TeamPresenceButtonStyle teamPresenceButtonStyle, Composer composer, final int i, final int i2) {
        int i3;
        boolean z2;
        int i4;
        TeamPresenceButtonStyle teamPresenceButtonStyle2;
        final boolean z3;
        TeamPresenceButtonStyle teamPresenceButtonStyle3;
        int hashCode;
        Composer m5333constructorimpl;
        String str;
        Composer composer2;
        TeamPresenceButtonStyle teamPresenceButtonStyle4;
        final TeamPresenceButtonStyle teamPresenceButtonStyle5;
        ScopeUpdateScope endRestartGroup;
        Intrinsics.checkNotNullParameter(teamPresenceState, "teamPresenceState");
        Composer startRestartGroup = composer.startRestartGroup(-696298916);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 14) == 0) {
            i3 = (startRestartGroup.changed(teamPresenceState) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i5 = i2 & 2;
        if (i5 != 0) {
            i3 |= 48;
        } else if ((i & 112) == 0) {
            z2 = z;
            i3 |= startRestartGroup.changed(z2) ? 32 : 16;
            i4 = i2 & 4;
            if (i4 == 0) {
                i3 |= 384;
            } else if ((i & 896) == 0) {
                teamPresenceButtonStyle2 = teamPresenceButtonStyle;
                i3 |= startRestartGroup.changed(teamPresenceButtonStyle2) ? 256 : 128;
                if ((i3 & 731) == 146 || !startRestartGroup.getSkipping()) {
                    z3 = i5 != 0 ? true : z2;
                    teamPresenceButtonStyle3 = i4 != 0 ? TeamPresenceButtonStyle.SECONDARY : teamPresenceButtonStyle2;
                    ProvidableCompositionLocal<Context> localContext = AndroidCompositionLocals_androidKt.getLocalContext();
                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC(<get-current>):CompositionLocal.kt#9igjgp");
                    Object consume = startRestartGroup.consume(localContext);
                    ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                    final Context context = (Context) consume;
                    Modifier m1159paddingVpY3zN4$default = PaddingKt.m1159paddingVpY3zN4$default(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), 0.0f, Dp.m8798constructorimpl(24), 1, null);
                    Alignment.Horizontal centerHorizontally = Alignment.INSTANCE.getCenterHorizontally();
                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, 1341605231, "CC(Column)N(modifier,verticalArrangement,horizontalAlignment,content)87@4443L61,88@4509L134:Column.kt#2w3rfo");
                    MeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), centerHorizontally, startRestartGroup, 48);
                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1159599143, "CC(Layout)P(!1,2)80@3267L27,83@3433L360:Layout.kt#80mrfh");
                    hashCode = Long.hashCode(ComposablesKt.getCurrentCompositeKeyHashCode(startRestartGroup, 0));
                    CompositionLocalMap currentCompositionLocalMap = startRestartGroup.getCurrentCompositionLocalMap();
                    Modifier materializeModifier = ComposedModifierKt.materializeModifier(startRestartGroup, m1159paddingVpY3zN4$default);
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
                    m5333constructorimpl = Updater.m5333constructorimpl(startRestartGroup);
                    Updater.m5340setimpl(m5333constructorimpl, columnMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                    Updater.m5340setimpl(m5333constructorimpl, currentCompositionLocalMap, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                    Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                    if (!m5333constructorimpl.getInserting() || !Intrinsics.areEqual(m5333constructorimpl.rememberedValue(), Integer.valueOf(hashCode))) {
                        m5333constructorimpl.updateRememberedValue(Integer.valueOf(hashCode));
                        m5333constructorimpl.apply(Integer.valueOf(hashCode), setCompositeKeyHash);
                    }
                    Updater.m5340setimpl(m5333constructorimpl, materializeModifier, ComposeUiNode.INSTANCE.getSetModifier());
                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2093002350, "C89@4557L9:Column.kt#2w3rfo");
                    ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
                    startRestartGroup.startReplaceGroup(-937558243);
                    if (z3) {
                        IntercomDividerKt.IntercomDivider(PaddingKt.m1161paddingqDBjuR0$default(SizeKt.m1214width3ABfNKs(Modifier.INSTANCE, Dp.m8798constructorimpl(100)), 0.0f, 0.0f, 0.0f, Dp.m8798constructorimpl(16), 7, null), startRestartGroup, 6, 0);
                    }
                    startRestartGroup.endReplaceGroup();
                    String stringResource = StringResources_androidKt.stringResource(teamPresenceState.getMessageButtonText(), startRestartGroup, 0);
                    Integer valueOf = Integer.valueOf(teamPresenceState.getMessageButtonIcon());
                    Integer subtitleText = teamPresenceState.getSubtitleText();
                    startRestartGroup.startReplaceGroup(-937545761);
                    String stringResource2 = subtitleText != null ? StringResources_androidKt.stringResource(subtitleText.intValue(), startRestartGroup, 0) : null;
                    startRestartGroup.endReplaceGroup();
                    if (teamPresenceState.getCtaData() != null) {
                        stringResource = teamPresenceState.getCtaData().getText();
                        Integer icon = teamPresenceState.getCtaData().getIcon().getIcon();
                        if (icon != null) {
                            valueOf = icon;
                        }
                        stringResource2 = teamPresenceState.getCtaData().getSubtitle();
                    }
                    str = stringResource2;
                    Integer num = valueOf;
                    startRestartGroup.startReplaceGroup(-937533382);
                    if (teamPresenceState.getConversationState() != null) {
                        stringResource = StringResources_androidKt.stringResource(teamPresenceState.getConversationState().getMessageButtonText(), startRestartGroup, 0);
                    }
                    startRestartGroup.endReplaceGroup();
                    if (teamPresenceButtonStyle3 == TeamPresenceButtonStyle.PRIMARY) {
                        startRestartGroup.startReplaceGroup(1001451744);
                        IntercomPrimaryButtonKt.IntercomPrimaryButton(stringResource, null, num, new Function0() { // from class: io.intercom.android.sdk.m5.helpcenter.ui.components.TeamPresenceComponentKt$$ExternalSyntheticLambda6
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                Unit TeamPresenceComponent$lambda$3$lambda$1;
                                TeamPresenceComponent$lambda$3$lambda$1 = TeamPresenceComponentKt.TeamPresenceComponent$lambda$3$lambda$1(ArticleViewState.TeamPresenceState.this, context);
                                return TeamPresenceComponent$lambda$3$lambda$1;
                            }
                        }, startRestartGroup, 0, 2);
                        composer2 = startRestartGroup;
                        composer2.endReplaceGroup();
                    } else {
                        startRestartGroup.startReplaceGroup(1001651663);
                        IntercomButtonKt.IntercomButton(null, IntercomButton.INSTANCE.m12906outlinedStyleKlgxPg(0L, 0L, null, startRestartGroup, IntercomButton.$stable << 9, 7), stringResource, num, new Function0() { // from class: io.intercom.android.sdk.m5.helpcenter.ui.components.TeamPresenceComponentKt$$ExternalSyntheticLambda7
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                Unit TeamPresenceComponent$lambda$3$lambda$2;
                                TeamPresenceComponent$lambda$3$lambda$2 = TeamPresenceComponentKt.TeamPresenceComponent$lambda$3$lambda$2(ArticleViewState.TeamPresenceState.this, context);
                                return TeamPresenceComponent$lambda$3$lambda$2;
                            }
                        }, startRestartGroup, IntercomButton.Style.$stable << 3, 1);
                        composer2 = startRestartGroup;
                        composer2.endReplaceGroup();
                    }
                    SpacerKt.Spacer(SizeKt.m1195height3ABfNKs(Modifier.INSTANCE, Dp.m8798constructorimpl(16)), composer2, 6);
                    composer2.startReplaceGroup(-937510359);
                    if (str != null) {
                        Composer composer3 = composer2;
                        teamPresenceButtonStyle4 = teamPresenceButtonStyle3;
                        TextKt.m3901TextNvy7gAk(str, null, 0L, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, TextStyle.m8245copyp1EtxEg$default(IntercomTheme.INSTANCE.getTypography(composer2, IntercomTheme.$stable).getType04Point5(), ColorKt.Color(4285887861L), 0L, null, null, null, null, null, 0L, null, null, null, 0L, null, null, null, 0, 0, 0L, null, null, null, 0, 0, null, 16777214, null), composer3, 0, 0, 131070);
                        composer2 = composer3;
                    } else {
                        teamPresenceButtonStyle4 = teamPresenceButtonStyle3;
                    }
                    composer2.endReplaceGroup();
                    ComposerKt.sourceInformationMarkerEnd(composer2);
                    composer2.endNode();
                    ComposerKt.sourceInformationMarkerEnd(composer2);
                    ComposerKt.sourceInformationMarkerEnd(composer2);
                    ComposerKt.sourceInformationMarkerEnd(composer2);
                    teamPresenceButtonStyle5 = teamPresenceButtonStyle4;
                } else {
                    startRestartGroup.skipToGroupEnd();
                    z3 = z2;
                    teamPresenceButtonStyle5 = teamPresenceButtonStyle2;
                    composer2 = startRestartGroup;
                }
                endRestartGroup = composer2.endRestartGroup();
                if (endRestartGroup != null) {
                    endRestartGroup.updateScope(new Function2() { // from class: io.intercom.android.sdk.m5.helpcenter.ui.components.TeamPresenceComponentKt$$ExternalSyntheticLambda8
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            Unit TeamPresenceComponent$lambda$4;
                            TeamPresenceComponent$lambda$4 = TeamPresenceComponentKt.TeamPresenceComponent$lambda$4(ArticleViewState.TeamPresenceState.this, z3, teamPresenceButtonStyle5, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                            return TeamPresenceComponent$lambda$4;
                        }
                    });
                    return;
                }
                return;
            }
            teamPresenceButtonStyle2 = teamPresenceButtonStyle;
            if ((i3 & 731) == 146) {
            }
            if (i5 != 0) {
            }
            if (i4 != 0) {
            }
            ProvidableCompositionLocal<Context> localContext2 = AndroidCompositionLocals_androidKt.getLocalContext();
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC(<get-current>):CompositionLocal.kt#9igjgp");
            Object consume2 = startRestartGroup.consume(localContext2);
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            final Context context2 = (Context) consume2;
            Modifier m1159paddingVpY3zN4$default2 = PaddingKt.m1159paddingVpY3zN4$default(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), 0.0f, Dp.m8798constructorimpl(24), 1, null);
            Alignment.Horizontal centerHorizontally2 = Alignment.INSTANCE.getCenterHorizontally();
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 1341605231, "CC(Column)N(modifier,verticalArrangement,horizontalAlignment,content)87@4443L61,88@4509L134:Column.kt#2w3rfo");
            MeasurePolicy columnMeasurePolicy2 = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), centerHorizontally2, startRestartGroup, 48);
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1159599143, "CC(Layout)P(!1,2)80@3267L27,83@3433L360:Layout.kt#80mrfh");
            hashCode = Long.hashCode(ComposablesKt.getCurrentCompositeKeyHashCode(startRestartGroup, 0));
            CompositionLocalMap currentCompositionLocalMap2 = startRestartGroup.getCurrentCompositionLocalMap();
            Modifier materializeModifier2 = ComposedModifierKt.materializeModifier(startRestartGroup, m1159paddingVpY3zN4$default2);
            Function0<ComposeUiNode> constructor2 = ComposeUiNode.INSTANCE.getConstructor();
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -553112988, "CC(ReusableComposeNode)N(factory,update,content)399@15590L9:Composables.kt#9igjgp");
            if (!(startRestartGroup.getApplier() instanceof Applier)) {
            }
            startRestartGroup.startReusableNode();
            if (startRestartGroup.getInserting()) {
            }
            m5333constructorimpl = Updater.m5333constructorimpl(startRestartGroup);
            Updater.m5340setimpl(m5333constructorimpl, columnMeasurePolicy2, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            Updater.m5340setimpl(m5333constructorimpl, currentCompositionLocalMap2, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
            if (!m5333constructorimpl.getInserting()) {
            }
            m5333constructorimpl.updateRememberedValue(Integer.valueOf(hashCode));
            m5333constructorimpl.apply(Integer.valueOf(hashCode), setCompositeKeyHash2);
            Updater.m5340setimpl(m5333constructorimpl, materializeModifier2, ComposeUiNode.INSTANCE.getSetModifier());
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2093002350, "C89@4557L9:Column.kt#2w3rfo");
            ColumnScopeInstance columnScopeInstance2 = ColumnScopeInstance.INSTANCE;
            startRestartGroup.startReplaceGroup(-937558243);
            if (z3) {
            }
            startRestartGroup.endReplaceGroup();
            String stringResource3 = StringResources_androidKt.stringResource(teamPresenceState.getMessageButtonText(), startRestartGroup, 0);
            Integer valueOf2 = Integer.valueOf(teamPresenceState.getMessageButtonIcon());
            Integer subtitleText2 = teamPresenceState.getSubtitleText();
            startRestartGroup.startReplaceGroup(-937545761);
            if (subtitleText2 != null) {
            }
            startRestartGroup.endReplaceGroup();
            if (teamPresenceState.getCtaData() != null) {
            }
            str = stringResource2;
            Integer num2 = valueOf2;
            startRestartGroup.startReplaceGroup(-937533382);
            if (teamPresenceState.getConversationState() != null) {
            }
            startRestartGroup.endReplaceGroup();
            if (teamPresenceButtonStyle3 == TeamPresenceButtonStyle.PRIMARY) {
            }
            SpacerKt.Spacer(SizeKt.m1195height3ABfNKs(Modifier.INSTANCE, Dp.m8798constructorimpl(16)), composer2, 6);
            composer2.startReplaceGroup(-937510359);
            if (str != null) {
            }
            composer2.endReplaceGroup();
            ComposerKt.sourceInformationMarkerEnd(composer2);
            composer2.endNode();
            ComposerKt.sourceInformationMarkerEnd(composer2);
            ComposerKt.sourceInformationMarkerEnd(composer2);
            ComposerKt.sourceInformationMarkerEnd(composer2);
            teamPresenceButtonStyle5 = teamPresenceButtonStyle4;
            endRestartGroup = composer2.endRestartGroup();
            if (endRestartGroup != null) {
            }
        }
        z2 = z;
        i4 = i2 & 4;
        if (i4 == 0) {
        }
        teamPresenceButtonStyle2 = teamPresenceButtonStyle;
        if ((i3 & 731) == 146) {
        }
        if (i5 != 0) {
        }
        if (i4 != 0) {
        }
        ProvidableCompositionLocal<Context> localContext22 = AndroidCompositionLocals_androidKt.getLocalContext();
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC(<get-current>):CompositionLocal.kt#9igjgp");
        Object consume22 = startRestartGroup.consume(localContext22);
        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        final Context context22 = (Context) consume22;
        Modifier m1159paddingVpY3zN4$default22 = PaddingKt.m1159paddingVpY3zN4$default(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), 0.0f, Dp.m8798constructorimpl(24), 1, null);
        Alignment.Horizontal centerHorizontally22 = Alignment.INSTANCE.getCenterHorizontally();
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, 1341605231, "CC(Column)N(modifier,verticalArrangement,horizontalAlignment,content)87@4443L61,88@4509L134:Column.kt#2w3rfo");
        MeasurePolicy columnMeasurePolicy22 = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), centerHorizontally22, startRestartGroup, 48);
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1159599143, "CC(Layout)P(!1,2)80@3267L27,83@3433L360:Layout.kt#80mrfh");
        hashCode = Long.hashCode(ComposablesKt.getCurrentCompositeKeyHashCode(startRestartGroup, 0));
        CompositionLocalMap currentCompositionLocalMap22 = startRestartGroup.getCurrentCompositionLocalMap();
        Modifier materializeModifier22 = ComposedModifierKt.materializeModifier(startRestartGroup, m1159paddingVpY3zN4$default22);
        Function0<ComposeUiNode> constructor22 = ComposeUiNode.INSTANCE.getConstructor();
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -553112988, "CC(ReusableComposeNode)N(factory,update,content)399@15590L9:Composables.kt#9igjgp");
        if (!(startRestartGroup.getApplier() instanceof Applier)) {
        }
        startRestartGroup.startReusableNode();
        if (startRestartGroup.getInserting()) {
        }
        m5333constructorimpl = Updater.m5333constructorimpl(startRestartGroup);
        Updater.m5340setimpl(m5333constructorimpl, columnMeasurePolicy22, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
        Updater.m5340setimpl(m5333constructorimpl, currentCompositionLocalMap22, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash22 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
        if (!m5333constructorimpl.getInserting()) {
        }
        m5333constructorimpl.updateRememberedValue(Integer.valueOf(hashCode));
        m5333constructorimpl.apply(Integer.valueOf(hashCode), setCompositeKeyHash22);
        Updater.m5340setimpl(m5333constructorimpl, materializeModifier22, ComposeUiNode.INSTANCE.getSetModifier());
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2093002350, "C89@4557L9:Column.kt#2w3rfo");
        ColumnScopeInstance columnScopeInstance22 = ColumnScopeInstance.INSTANCE;
        startRestartGroup.startReplaceGroup(-937558243);
        if (z3) {
        }
        startRestartGroup.endReplaceGroup();
        String stringResource32 = StringResources_androidKt.stringResource(teamPresenceState.getMessageButtonText(), startRestartGroup, 0);
        Integer valueOf22 = Integer.valueOf(teamPresenceState.getMessageButtonIcon());
        Integer subtitleText22 = teamPresenceState.getSubtitleText();
        startRestartGroup.startReplaceGroup(-937545761);
        if (subtitleText22 != null) {
        }
        startRestartGroup.endReplaceGroup();
        if (teamPresenceState.getCtaData() != null) {
        }
        str = stringResource2;
        Integer num22 = valueOf22;
        startRestartGroup.startReplaceGroup(-937533382);
        if (teamPresenceState.getConversationState() != null) {
        }
        startRestartGroup.endReplaceGroup();
        if (teamPresenceButtonStyle3 == TeamPresenceButtonStyle.PRIMARY) {
        }
        SpacerKt.Spacer(SizeKt.m1195height3ABfNKs(Modifier.INSTANCE, Dp.m8798constructorimpl(16)), composer2, 6);
        composer2.startReplaceGroup(-937510359);
        if (str != null) {
        }
        composer2.endReplaceGroup();
        ComposerKt.sourceInformationMarkerEnd(composer2);
        composer2.endNode();
        ComposerKt.sourceInformationMarkerEnd(composer2);
        ComposerKt.sourceInformationMarkerEnd(composer2);
        ComposerKt.sourceInformationMarkerEnd(composer2);
        teamPresenceButtonStyle5 = teamPresenceButtonStyle4;
        endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup != null) {
        }
    }

    private static final void TeamPresenceComponent$onClick(Context context, ArticleViewState.TeamPresenceState teamPresenceState) {
        Injector.get().getMetricTracker().clickedNewConversation(teamPresenceState.getMetricPlace(), teamPresenceState.getMetricContext(), teamPresenceState.isFromSearchBrowse());
        if (teamPresenceState.getConversationState() != null) {
            ConversationScreenOpenerKt.openComposer$default(context, null, false, null, teamPresenceState.getConversationState().getConversationId(), 14, null);
        } else if (teamPresenceState.getArticleMetadata() != null) {
            ConversationScreenOpenerKt.openComposer$default(context, null, false, teamPresenceState.getArticleMetadata(), null, 22, null);
        } else {
            ConversationScreenOpenerKt.openComposer$default(context, null, false, null, null, 30, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit TeamPresenceComponent$lambda$3$lambda$1(ArticleViewState.TeamPresenceState teamPresenceState, Context context) {
        Intrinsics.checkNotNullParameter(teamPresenceState, "$teamPresenceState");
        Intrinsics.checkNotNullParameter(context, "$context");
        TeamPresenceComponent$onClick(context, teamPresenceState);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit TeamPresenceComponent$lambda$3$lambda$2(ArticleViewState.TeamPresenceState teamPresenceState, Context context) {
        Intrinsics.checkNotNullParameter(teamPresenceState, "$teamPresenceState");
        Intrinsics.checkNotNullParameter(context, "$context");
        TeamPresenceComponent$onClick(context, teamPresenceState);
        return Unit.INSTANCE;
    }

    static {
        int i = R.string.intercom_the_team_can_help_if_needed;
        mockTeamPresenceState = new ArticleViewState.TeamPresenceState(null, null, Integer.valueOf(i), R.string.intercom_send_us_a_message, R.drawable.intercom_new_conversation_send_button, ViewCompat.MEASURED_STATE_MASK, "article", MetricTracker.Context.STYLE_HUMAN, false, new OpenMessengerResponse.NewConversationData.Cta("Send us a message", "The team can help if needed", OpenMessengerResponse.IconType.PAPER_PLANE));
    }

    public static final void TeamPresenceComponentWithBubble(final ArticleViewState.TeamPresenceState teamPresenceState, Composer composer, final int i) {
        int i2;
        Intrinsics.checkNotNullParameter(teamPresenceState, "teamPresenceState");
        Composer startRestartGroup = composer.startRestartGroup(1539837505);
        if ((i & 14) == 0) {
            i2 = (startRestartGroup.changed(teamPresenceState) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 11) != 2 || !startRestartGroup.getSkipping()) {
            ProvidableCompositionLocal<Configuration> localConfiguration = AndroidCompositionLocals_androidKt.getLocalConfiguration();
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC(<get-current>):CompositionLocal.kt#9igjgp");
            Object consume = startRestartGroup.consume(localConfiguration);
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            float m8798constructorimpl = Dp.m8798constructorimpl(((Configuration) consume).screenWidthDp);
            final long m13097getBubbleBackground0d7_KjU = IntercomTheme.INSTANCE.getColors(startRestartGroup, IntercomTheme.$stable).m13097getBubbleBackground0d7_KjU();
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 1341605231, "CC(Column)N(modifier,verticalArrangement,horizontalAlignment,content)87@4443L61,88@4509L134:Column.kt#2w3rfo");
            Modifier.Companion companion = Modifier.INSTANCE;
            MeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), startRestartGroup, 0);
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1159599143, "CC(Layout)P(!1,2)80@3267L27,83@3433L360:Layout.kt#80mrfh");
            int hashCode = Long.hashCode(ComposablesKt.getCurrentCompositeKeyHashCode(startRestartGroup, 0));
            CompositionLocalMap currentCompositionLocalMap = startRestartGroup.getCurrentCompositionLocalMap();
            Modifier materializeModifier = ComposedModifierKt.materializeModifier(startRestartGroup, companion);
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
            startRestartGroup.startReplaceGroup(-745953431);
            if (teamPresenceState.getSubtitleText() != null) {
                Modifier m1111offsetVpY3zN4 = OffsetKt.m1111offsetVpY3zN4(Modifier.INSTANCE, Dp.m8798constructorimpl(Dp.m8798constructorimpl(m8798constructorimpl / 2.0f) - Dp.m8798constructorimpl(60)), Dp.m8798constructorimpl(0));
                startRestartGroup.startReplaceGroup(-745947382);
                boolean changed = startRestartGroup.changed(m13097getBubbleBackground0d7_KjU);
                Object rememberedValue = startRestartGroup.rememberedValue();
                if (changed || rememberedValue == Composer.INSTANCE.getEmpty()) {
                    rememberedValue = new Function1() { // from class: io.intercom.android.sdk.m5.helpcenter.ui.components.TeamPresenceComponentKt$$ExternalSyntheticLambda2
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            DrawResult TeamPresenceComponentWithBubble$lambda$11$lambda$7$lambda$6;
                            TeamPresenceComponentWithBubble$lambda$11$lambda$7$lambda$6 = TeamPresenceComponentKt.TeamPresenceComponentWithBubble$lambda$11$lambda$7$lambda$6(m13097getBubbleBackground0d7_KjU, (CacheDrawScope) obj);
                            return TeamPresenceComponentWithBubble$lambda$11$lambda$7$lambda$6;
                        }
                    };
                    startRestartGroup.updateRememberedValue(rememberedValue);
                }
                startRestartGroup.endReplaceGroup();
                SpacerKt.Spacer(SizeKt.m1209size3ABfNKs(DrawModifierKt.drawWithCache(m1111offsetVpY3zN4, (Function1) rememberedValue), Dp.m8798constructorimpl(16)), startRestartGroup, 0);
            }
            startRestartGroup.endReplaceGroup();
            float f = 24;
            Modifier clip = ClipKt.clip(PaddingKt.m1161paddingqDBjuR0$default(Modifier.INSTANCE, Dp.m8798constructorimpl(f), 0.0f, Dp.m8798constructorimpl(f), Dp.m8798constructorimpl(f), 2, null), RoundedCornerShapeKt.m1522RoundedCornerShape0680j_4(Dp.m8798constructorimpl(8)));
            boolean z = teamPresenceState.getSubtitleText() != null;
            startRestartGroup.startReplaceGroup(-745925551);
            boolean changed2 = startRestartGroup.changed(m13097getBubbleBackground0d7_KjU);
            Object rememberedValue2 = startRestartGroup.rememberedValue();
            if (changed2 || rememberedValue2 == Composer.INSTANCE.getEmpty()) {
                rememberedValue2 = new Function1() { // from class: io.intercom.android.sdk.m5.helpcenter.ui.components.TeamPresenceComponentKt$$ExternalSyntheticLambda3
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        Modifier TeamPresenceComponentWithBubble$lambda$11$lambda$9$lambda$8;
                        TeamPresenceComponentWithBubble$lambda$11$lambda$9$lambda$8 = TeamPresenceComponentKt.TeamPresenceComponentWithBubble$lambda$11$lambda$9$lambda$8(m13097getBubbleBackground0d7_KjU, (Modifier) obj);
                        return TeamPresenceComponentWithBubble$lambda$11$lambda$9$lambda$8;
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue2);
            }
            startRestartGroup.endReplaceGroup();
            Modifier ifTrue = ModifierExtensionsKt.ifTrue(clip, z, (Function1) rememberedValue2);
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 1042775818, "CC(Box)N(modifier,contentAlignment,propagateMinConstraints,content)71@3424L131:Box.kt#2w3rfo");
            MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false);
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1159599143, "CC(Layout)P(!1,2)80@3267L27,83@3433L360:Layout.kt#80mrfh");
            int hashCode2 = Long.hashCode(ComposablesKt.getCurrentCompositeKeyHashCode(startRestartGroup, 0));
            CompositionLocalMap currentCompositionLocalMap2 = startRestartGroup.getCurrentCompositionLocalMap();
            Modifier materializeModifier2 = ComposedModifierKt.materializeModifier(startRestartGroup, ifTrue);
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
            Updater.m5340setimpl(m5333constructorimpl2, maybeCachedBoxMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            Updater.m5340setimpl(m5333constructorimpl2, currentCompositionLocalMap2, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
            if (m5333constructorimpl2.getInserting() || !Intrinsics.areEqual(m5333constructorimpl2.rememberedValue(), Integer.valueOf(hashCode2))) {
                m5333constructorimpl2.updateRememberedValue(Integer.valueOf(hashCode2));
                m5333constructorimpl2.apply(Integer.valueOf(hashCode2), setCompositeKeyHash2);
            }
            Updater.m5340setimpl(m5333constructorimpl2, materializeModifier2, ComposeUiNode.INSTANCE.getSetModifier());
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 1833054614, "C72@3469L9:Box.kt#2w3rfo");
            BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
            TeamPresenceComponent(teamPresenceState, false, TeamPresenceButtonStyle.PRIMARY, startRestartGroup, (i2 & 14) | 432, 0);
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            startRestartGroup.endNode();
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            startRestartGroup.endNode();
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        } else {
            startRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new Function2() { // from class: io.intercom.android.sdk.m5.helpcenter.ui.components.TeamPresenceComponentKt$$ExternalSyntheticLambda4
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    Unit TeamPresenceComponentWithBubble$lambda$12;
                    TeamPresenceComponentWithBubble$lambda$12 = TeamPresenceComponentKt.TeamPresenceComponentWithBubble$lambda$12(ArticleViewState.TeamPresenceState.this, i, (Composer) obj, ((Integer) obj2).intValue());
                    return TeamPresenceComponentWithBubble$lambda$12;
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final DrawResult TeamPresenceComponentWithBubble$lambda$11$lambda$7$lambda$6(final long j, CacheDrawScope drawWithCache) {
        Intrinsics.checkNotNullParameter(drawWithCache, "$this$drawWithCache");
        final Path Path = AndroidPath_androidKt.Path();
        Path.moveTo(0.0f, Float.intBitsToFloat((int) (drawWithCache.m5555getSizeNHjbRc() & 4294967295L)));
        Path.lineTo(Float.intBitsToFloat((int) (drawWithCache.m5555getSizeNHjbRc() >> 32)) / 2.0f, Float.intBitsToFloat((int) (drawWithCache.m5555getSizeNHjbRc() & 4294967295L)) / 2.0f);
        Path.lineTo(Float.intBitsToFloat((int) (drawWithCache.m5555getSizeNHjbRc() >> 32)), Float.intBitsToFloat((int) (drawWithCache.m5555getSizeNHjbRc() & 4294967295L)));
        Path.close();
        return drawWithCache.onDrawBehind(new Function1() { // from class: io.intercom.android.sdk.m5.helpcenter.ui.components.TeamPresenceComponentKt$$ExternalSyntheticLambda5
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                Unit TeamPresenceComponentWithBubble$lambda$11$lambda$7$lambda$6$lambda$5;
                TeamPresenceComponentWithBubble$lambda$11$lambda$7$lambda$6$lambda$5 = TeamPresenceComponentKt.TeamPresenceComponentWithBubble$lambda$11$lambda$7$lambda$6$lambda$5(Path.this, j, (DrawScope) obj);
                return TeamPresenceComponentWithBubble$lambda$11$lambda$7$lambda$6$lambda$5;
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit TeamPresenceComponentWithBubble$lambda$11$lambda$7$lambda$6$lambda$5(Path path, long j, DrawScope onDrawBehind) {
        Intrinsics.checkNotNullParameter(path, "$path");
        Intrinsics.checkNotNullParameter(onDrawBehind, "$this$onDrawBehind");
        DrawScope.m6608drawPathLG529CI$default(onDrawBehind, path, j, 0.0f, null, null, 0, 60, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Modifier TeamPresenceComponentWithBubble$lambda$11$lambda$9$lambda$8(long j, Modifier ifTrue) {
        Intrinsics.checkNotNullParameter(ifTrue, "$this$ifTrue");
        return BackgroundKt.m582backgroundbw27NRU$default(ifTrue, j, null, 2, null);
    }

    @IntercomPreviews
    public static final void TeamPresenceWithBubblePreview(Composer composer, final int i) {
        Composer startRestartGroup = composer.startRestartGroup(-1128132221);
        if (i != 0 || !startRestartGroup.getSkipping()) {
            IntercomThemeKt.IntercomTheme(null, null, null, ComposableSingletons$TeamPresenceComponentKt.INSTANCE.m12460getLambda2$intercom_sdk_base_release(), startRestartGroup, 3072, 7);
        } else {
            startRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new Function2() { // from class: io.intercom.android.sdk.m5.helpcenter.ui.components.TeamPresenceComponentKt$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    Unit TeamPresenceWithBubblePreview$lambda$13;
                    TeamPresenceWithBubblePreview$lambda$13 = TeamPresenceComponentKt.TeamPresenceWithBubblePreview$lambda$13(i, (Composer) obj, ((Integer) obj2).intValue());
                    return TeamPresenceWithBubblePreview$lambda$13;
                }
            });
        }
    }

    @IntercomPreviews
    public static final void TeamPresencePreview(Composer composer, final int i) {
        Composer startRestartGroup = composer.startRestartGroup(-161512363);
        if (i != 0 || !startRestartGroup.getSkipping()) {
            IntercomThemeKt.IntercomTheme(null, null, null, ComposableSingletons$TeamPresenceComponentKt.INSTANCE.m12462getLambda4$intercom_sdk_base_release(), startRestartGroup, 3072, 7);
        } else {
            startRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new Function2() { // from class: io.intercom.android.sdk.m5.helpcenter.ui.components.TeamPresenceComponentKt$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    Unit TeamPresencePreview$lambda$14;
                    TeamPresencePreview$lambda$14 = TeamPresenceComponentKt.TeamPresencePreview$lambda$14(i, (Composer) obj, ((Integer) obj2).intValue());
                    return TeamPresencePreview$lambda$14;
                }
            });
        }
    }
}
