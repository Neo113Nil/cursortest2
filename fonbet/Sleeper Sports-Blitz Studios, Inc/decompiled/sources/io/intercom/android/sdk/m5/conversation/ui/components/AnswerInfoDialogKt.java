package io.intercom.android.sdk.m5.conversation.ui.components;

import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.material3.TextKt;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.window.AndroidDialog_androidKt;
import com.facebook.react.uimanager.ViewProps;
import io.intercom.android.sdk.models.AiAnswerInfo;
import io.intercom.android.sdk.ui.IntercomPreviews;
import io.intercom.android.sdk.ui.theme.IntercomTheme;
import io.intercom.android.sdk.ui.theme.IntercomThemeKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: AnswerInfoDialog.kt */
@Metadata(d1 = {"\u0000,\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a=\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00010\u00072\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00010\u0007H\u0001¢\u0006\u0002\u0010\t\u001a-\u0010\n\u001a\u00020\u00012\u0006\u0010\u000b\u001a\u00020\f2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00010\u00072\b\b\u0002\u0010\u000e\u001a\u00020\u000fH\u0003¢\u0006\u0002\u0010\u0010\u001a\r\u0010\u0011\u001a\u00020\u0001H\u0001¢\u0006\u0002\u0010\u0012\u001a\r\u0010\u0013\u001a\u00020\u0001H\u0001¢\u0006\u0002\u0010\u0012¨\u0006\u0014"}, d2 = {"AnswerInfoDialog", "", "info", "Lio/intercom/android/sdk/models/AiAnswerInfo;", "showReportAiAnswerButton", "", "onDismiss", "Lkotlin/Function0;", "onReportAiAnswer", "(Lio/intercom/android/sdk/models/AiAnswerInfo;ZLkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;II)V", "AnswerInfoButton", "text", "", ViewProps.ON_CLICK, "modifier", "Landroidx/compose/ui/Modifier;", "(Ljava/lang/String;Lkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "AnswerInfoDialogPreview", "(Landroidx/compose/runtime/Composer;I)V", "AnswerInfoDialogWithoutReportButtonPreview", "intercom-sdk-base_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class AnswerInfoDialogKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit AnswerInfoButton$lambda$6(String text, Function0 onClick, Modifier modifier, int i, int i2, Composer composer, int i3) {
        Intrinsics.checkNotNullParameter(text, "$text");
        Intrinsics.checkNotNullParameter(onClick, "$onClick");
        AnswerInfoButton(text, onClick, modifier, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit AnswerInfoDialog$lambda$2(AiAnswerInfo info, boolean z, Function0 function0, Function0 function02, int i, int i2, Composer composer, int i3) {
        Intrinsics.checkNotNullParameter(info, "$info");
        AnswerInfoDialog(info, z, function0, function02, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit AnswerInfoDialogPreview$lambda$7(int i, Composer composer, int i2) {
        AnswerInfoDialogPreview(composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit AnswerInfoDialogWithoutReportButtonPreview$lambda$8(int i, Composer composer, int i2) {
        AnswerInfoDialogWithoutReportButtonPreview(composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    public static final void AnswerInfoDialog(final AiAnswerInfo info, final boolean z, Function0<Unit> function0, Function0<Unit> function02, Composer composer, final int i, final int i2) {
        int i3;
        final Function0<Unit> function03;
        Intrinsics.checkNotNullParameter(info, "info");
        Composer startRestartGroup = composer.startRestartGroup(-1331432837);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 14) == 0) {
            i3 = (startRestartGroup.changed(info) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 112) == 0) {
            i3 |= startRestartGroup.changed(z) ? 32 : 16;
        }
        int i4 = i2 & 4;
        if (i4 != 0) {
            i3 |= 384;
        } else if ((i & 896) == 0) {
            i3 |= startRestartGroup.changedInstance(function0) ? 256 : 128;
        }
        int i5 = i2 & 8;
        if (i5 != 0) {
            i3 |= 3072;
        } else if ((i & 7168) == 0) {
            i3 |= startRestartGroup.changedInstance(function02) ? 2048 : 1024;
        }
        if ((i3 & 5851) != 1170 || !startRestartGroup.getSkipping()) {
            if (i4 != 0) {
                function0 = new Function0() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.AnswerInfoDialogKt$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        Unit unit;
                        unit = Unit.INSTANCE;
                        return unit;
                    }
                };
            }
            Function0<Unit> function04 = function0;
            if (i5 != 0) {
                function02 = new Function0() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.AnswerInfoDialogKt$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        Unit unit;
                        unit = Unit.INSTANCE;
                        return unit;
                    }
                };
            }
            AndroidDialog_androidKt.Dialog(function04, null, ComposableLambdaKt.rememberComposableLambda(-1632439278, true, new AnswerInfoDialogKt$AnswerInfoDialog$3(info, z, function04, function02), startRestartGroup, 54), startRestartGroup, ((i3 >> 6) & 14) | 384, 2);
            function03 = function04;
        } else {
            startRestartGroup.skipToGroupEnd();
            function03 = function0;
        }
        final Function0<Unit> function05 = function02;
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new Function2() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.AnswerInfoDialogKt$$ExternalSyntheticLambda2
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    Unit AnswerInfoDialog$lambda$2;
                    AnswerInfoDialog$lambda$2 = AnswerInfoDialogKt.AnswerInfoDialog$lambda$2(AiAnswerInfo.this, z, function03, function05, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                    return AnswerInfoDialog$lambda$2;
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void AnswerInfoButton(final String str, final Function0<Unit> function0, Modifier modifier, Composer composer, final int i, final int i2) {
        String str2;
        int i3;
        Composer composer2;
        final Modifier modifier2;
        Composer startRestartGroup = composer.startRestartGroup(8337655);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
            str2 = str;
        } else if ((i & 14) == 0) {
            str2 = str;
            i3 = i | (startRestartGroup.changed(str2) ? 4 : 2);
        } else {
            str2 = str;
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 112) == 0) {
            i3 |= startRestartGroup.changedInstance(function0) ? 32 : 16;
        }
        if ((i3 & 91) != 18 || !startRestartGroup.getSkipping()) {
            Modifier modifier3 = (i2 & 4) != 0 ? Modifier.INSTANCE : modifier;
            Modifier.Companion companion = Modifier.INSTANCE;
            startRestartGroup.startReplaceGroup(934769186);
            boolean z = (i3 & 112) == 32;
            Object rememberedValue = startRestartGroup.rememberedValue();
            if (z || rememberedValue == Composer.INSTANCE.getEmpty()) {
                rememberedValue = new Function0() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.AnswerInfoDialogKt$$ExternalSyntheticLambda5
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        Unit AnswerInfoButton$lambda$4$lambda$3;
                        AnswerInfoButton$lambda$4$lambda$3 = AnswerInfoDialogKt.AnswerInfoButton$lambda$4$lambda$3(Function0.this);
                        return AnswerInfoButton$lambda$4$lambda$3;
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            startRestartGroup.endReplaceGroup();
            Modifier m1158paddingVpY3zN4 = PaddingKt.m1158paddingVpY3zN4(SizeKt.fillMaxWidth$default(ClickableKt.m623clickableoSLSa3U$default(companion, false, null, null, null, (Function0) rememberedValue, 15, null), 0.0f, 1, null), Dp.m8798constructorimpl(24), Dp.m8798constructorimpl(16));
            Alignment.Vertical centerVertically = Alignment.INSTANCE.getCenterVertically();
            Arrangement.HorizontalOrVertical center = Arrangement.INSTANCE.getCenter();
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 844473419, "CC(Row)N(modifier,horizontalArrangement,verticalAlignment,content)99@5125L58,100@5188L131:Row.kt#2w3rfo");
            MeasurePolicy rowMeasurePolicy = RowKt.rowMeasurePolicy(center, centerVertically, startRestartGroup, 54);
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1159599143, "CC(Layout)P(!1,2)80@3267L27,83@3433L360:Layout.kt#80mrfh");
            int hashCode = Long.hashCode(ComposablesKt.getCurrentCompositeKeyHashCode(startRestartGroup, 0));
            CompositionLocalMap currentCompositionLocalMap = startRestartGroup.getCurrentCompositionLocalMap();
            Modifier materializeModifier = ComposedModifierKt.materializeModifier(startRestartGroup, m1158paddingVpY3zN4);
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
            Updater.m5340setimpl(m5333constructorimpl, rowMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            Updater.m5340setimpl(m5333constructorimpl, currentCompositionLocalMap, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
            if (m5333constructorimpl.getInserting() || !Intrinsics.areEqual(m5333constructorimpl.rememberedValue(), Integer.valueOf(hashCode))) {
                m5333constructorimpl.updateRememberedValue(Integer.valueOf(hashCode));
                m5333constructorimpl.apply(Integer.valueOf(hashCode), setCompositeKeyHash);
            }
            Updater.m5340setimpl(m5333constructorimpl, materializeModifier, ComposeUiNode.INSTANCE.getSetModifier());
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 1456264949, "C101@5233L9:Row.kt#2w3rfo");
            RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
            composer2 = startRestartGroup;
            TextKt.m3901TextNvy7gAk(str2, null, IntercomTheme.INSTANCE.getColors(startRestartGroup, IntercomTheme.$stable).m13116getPrimaryText0d7_KjU(), null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, TextStyle.m8245copyp1EtxEg$default(IntercomTheme.INSTANCE.getTypography(startRestartGroup, IntercomTheme.$stable).getType04(), 0L, 0L, FontWeight.INSTANCE.getSemiBold(), null, null, null, null, 0L, null, null, null, 0L, null, null, null, 0, 0, 0L, null, null, null, 0, 0, null, 16777211, null), composer2, i3 & 14, 0, 131066);
            ComposerKt.sourceInformationMarkerEnd(composer2);
            composer2.endNode();
            ComposerKt.sourceInformationMarkerEnd(composer2);
            ComposerKt.sourceInformationMarkerEnd(composer2);
            ComposerKt.sourceInformationMarkerEnd(composer2);
            modifier2 = modifier3;
        } else {
            startRestartGroup.skipToGroupEnd();
            modifier2 = modifier;
            composer2 = startRestartGroup;
        }
        ScopeUpdateScope endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new Function2() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.AnswerInfoDialogKt$$ExternalSyntheticLambda6
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    Unit AnswerInfoButton$lambda$6;
                    AnswerInfoButton$lambda$6 = AnswerInfoDialogKt.AnswerInfoButton$lambda$6(str, function0, modifier2, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                    return AnswerInfoButton$lambda$6;
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit AnswerInfoButton$lambda$4$lambda$3(Function0 onClick) {
        Intrinsics.checkNotNullParameter(onClick, "$onClick");
        onClick.invoke();
        return Unit.INSTANCE;
    }

    @IntercomPreviews
    public static final void AnswerInfoDialogPreview(Composer composer, final int i) {
        Composer startRestartGroup = composer.startRestartGroup(1630534767);
        if (i != 0 || !startRestartGroup.getSkipping()) {
            IntercomThemeKt.IntercomTheme(null, null, null, ComposableSingletons$AnswerInfoDialogKt.INSTANCE.m12184getLambda1$intercom_sdk_base_release(), startRestartGroup, 3072, 7);
        } else {
            startRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new Function2() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.AnswerInfoDialogKt$$ExternalSyntheticLambda4
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    Unit AnswerInfoDialogPreview$lambda$7;
                    AnswerInfoDialogPreview$lambda$7 = AnswerInfoDialogKt.AnswerInfoDialogPreview$lambda$7(i, (Composer) obj, ((Integer) obj2).intValue());
                    return AnswerInfoDialogPreview$lambda$7;
                }
            });
        }
    }

    @IntercomPreviews
    public static final void AnswerInfoDialogWithoutReportButtonPreview(Composer composer, final int i) {
        Composer startRestartGroup = composer.startRestartGroup(-916076999);
        if (i != 0 || !startRestartGroup.getSkipping()) {
            IntercomThemeKt.IntercomTheme(null, null, null, ComposableSingletons$AnswerInfoDialogKt.INSTANCE.m12185getLambda2$intercom_sdk_base_release(), startRestartGroup, 3072, 7);
        } else {
            startRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new Function2() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.AnswerInfoDialogKt$$ExternalSyntheticLambda3
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    Unit AnswerInfoDialogWithoutReportButtonPreview$lambda$8;
                    AnswerInfoDialogWithoutReportButtonPreview$lambda$8 = AnswerInfoDialogKt.AnswerInfoDialogWithoutReportButtonPreview$lambda$8(i, (Composer) obj, ((Integer) obj2).intValue());
                    return AnswerInfoDialogWithoutReportButtonPreview$lambda$8;
                }
            });
        }
    }
}
