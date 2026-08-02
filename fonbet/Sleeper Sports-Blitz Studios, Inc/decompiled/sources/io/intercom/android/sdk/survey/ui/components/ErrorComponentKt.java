package io.intercom.android.sdk.survey.ui.components;

import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
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
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.res.StringResources_androidKt;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.style.TextAlign;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.TextUnitKt;
import io.intercom.android.sdk.R;
import io.intercom.android.sdk.survey.SurveyState;
import io.intercom.android.sdk.survey.SurveyViewModelKt;
import io.intercom.android.sdk.survey.TopBarState;
import io.intercom.android.sdk.survey.model.SurveyCustomization;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: ErrorComponent.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a\u001f\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005H\u0001¢\u0006\u0002\u0010\u0006\u001a\r\u0010\u0007\u001a\u00020\u0001H\u0001¢\u0006\u0002\u0010\b\u001a\r\u0010\t\u001a\u00020\u0001H\u0001¢\u0006\u0002\u0010\b¨\u0006\n"}, d2 = {"SurveyError", "", "state", "Lio/intercom/android/sdk/survey/SurveyState$Error;", "modifier", "Landroidx/compose/ui/Modifier;", "(Lio/intercom/android/sdk/survey/SurveyState$Error;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "ErrorStateWithCTA", "(Landroidx/compose/runtime/Composer;I)V", "ErrorStateWithoutCTA", "intercom-sdk-base_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class ErrorComponentKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ErrorStateWithCTA$lambda$3(int i, Composer composer, int i2) {
        ErrorStateWithCTA(composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ErrorStateWithoutCTA$lambda$4(int i, Composer composer, int i2) {
        ErrorStateWithoutCTA(composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit SurveyError$lambda$1(SurveyState.Error state, Modifier modifier, int i, int i2, Composer composer, int i3) {
        Intrinsics.checkNotNullParameter(state, "$state");
        SurveyError(state, modifier, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x01f7  */
    /* JADX WARN: Removed duplicated region for block: B:18:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x01aa  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0064  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void SurveyError(final SurveyState.Error state, Modifier modifier, Composer composer, final int i, final int i2) {
        int i3;
        final Modifier modifier2;
        int hashCode;
        Composer m5333constructorimpl;
        Composer composer2;
        ScopeUpdateScope endRestartGroup;
        Intrinsics.checkNotNullParameter(state, "state");
        Composer startRestartGroup = composer.startRestartGroup(805293226);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 14) == 0) {
            i3 = i | (startRestartGroup.changed(state) ? 4 : 2);
        } else {
            i3 = i;
        }
        int i4 = i2 & 2;
        if (i4 != 0) {
            i3 |= 48;
        } else if ((i & 112) == 0) {
            modifier2 = modifier;
            i3 |= startRestartGroup.changed(modifier2) ? 32 : 16;
            if ((i3 & 91) == 18 || !startRestartGroup.getSkipping()) {
                Modifier.Companion companion = i4 == 0 ? Modifier.INSTANCE : modifier2;
                Modifier fillMaxSize$default = SizeKt.fillMaxSize$default(companion, 0.0f, 1, null);
                Alignment center = Alignment.INSTANCE.getCenter();
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, 1042775818, "CC(Box)N(modifier,contentAlignment,propagateMinConstraints,content)71@3424L131:Box.kt#2w3rfo");
                MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(center, false);
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1159599143, "CC(Layout)P(!1,2)80@3267L27,83@3433L360:Layout.kt#80mrfh");
                hashCode = Long.hashCode(ComposablesKt.getCurrentCompositeKeyHashCode(startRestartGroup, 0));
                CompositionLocalMap currentCompositionLocalMap = startRestartGroup.getCurrentCompositionLocalMap();
                Modifier materializeModifier = ComposedModifierKt.materializeModifier(startRestartGroup, fillMaxSize$default);
                Function0<ComposeUiNode> constructor = ComposeUiNode.INSTANCE.getConstructor();
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, -553112988, "CC(ReusableComposeNode)N(factory,update,content)399@15590L9:Composables.kt#9igjgp");
                if (!(startRestartGroup.getApplier() instanceof Applier)) {
                    ComposablesKt.invalidApplier();
                }
                startRestartGroup.startReusableNode();
                if (!startRestartGroup.getInserting()) {
                    startRestartGroup.createNode(constructor);
                } else {
                    startRestartGroup.useNode();
                }
                m5333constructorimpl = Updater.m5333constructorimpl(startRestartGroup);
                Updater.m5340setimpl(m5333constructorimpl, maybeCachedBoxMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                Updater.m5340setimpl(m5333constructorimpl, currentCompositionLocalMap, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                if (!m5333constructorimpl.getInserting() || !Intrinsics.areEqual(m5333constructorimpl.rememberedValue(), Integer.valueOf(hashCode))) {
                    m5333constructorimpl.updateRememberedValue(Integer.valueOf(hashCode));
                    m5333constructorimpl.apply(Integer.valueOf(hashCode), setCompositeKeyHash);
                }
                Updater.m5340setimpl(m5333constructorimpl, materializeModifier, ComposeUiNode.INSTANCE.getSetModifier());
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, 1833054614, "C72@3469L9:Box.kt#2w3rfo");
                BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                float f = 32;
                Modifier modifier3 = companion;
                TextKt.m3901TextNvy7gAk(StringResources_androidKt.stringResource(state.getMessageResId(), startRestartGroup, 0), boxScopeInstance.align(PaddingKt.m1158paddingVpY3zN4(Modifier.INSTANCE, Dp.m8798constructorimpl(f), Dp.m8798constructorimpl(f)), Alignment.INSTANCE.getTopCenter()), state.getSurveyUiColors().m12631getOnBackground0d7_KjU(), null, TextUnitKt.getSp(36), null, FontWeight.INSTANCE.getBold(), null, 0L, null, TextAlign.m8647boximpl(TextAlign.INSTANCE.m8654getCentere0LSkKk()), 0L, 0, false, 0, 0, null, null, startRestartGroup, 1597440, 0, 261032);
                startRestartGroup.startReplaceGroup(-803498879);
                if (state instanceof SurveyState.Error.WithCTA) {
                    SurveyState.Error.WithCTA withCTA = (SurveyState.Error.WithCTA) state;
                    SurveyCtaButtonComponentKt.SurveyCtaButtonComponent(boxScopeInstance.align(PaddingKt.m1157padding3ABfNKs(Modifier.INSTANCE, Dp.m8798constructorimpl(16)), Alignment.INSTANCE.getBottomCenter()), StringResources_androidKt.stringResource(R.string.intercom_retry, startRestartGroup, 0), null, withCTA.getOnClick(), null, withCTA.getSurveyUiColors(), startRestartGroup, 0, 20);
                }
                composer2 = startRestartGroup;
                composer2.endReplaceGroup();
                ComposerKt.sourceInformationMarkerEnd(composer2);
                composer2.endNode();
                ComposerKt.sourceInformationMarkerEnd(composer2);
                ComposerKt.sourceInformationMarkerEnd(composer2);
                ComposerKt.sourceInformationMarkerEnd(composer2);
                modifier2 = modifier3;
            } else {
                startRestartGroup.skipToGroupEnd();
                composer2 = startRestartGroup;
            }
            endRestartGroup = composer2.endRestartGroup();
            if (endRestartGroup == null) {
                endRestartGroup.updateScope(new Function2() { // from class: io.intercom.android.sdk.survey.ui.components.ErrorComponentKt$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        Unit SurveyError$lambda$1;
                        SurveyError$lambda$1 = ErrorComponentKt.SurveyError$lambda$1(SurveyState.Error.this, modifier2, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                        return SurveyError$lambda$1;
                    }
                });
                return;
            }
            return;
        }
        modifier2 = modifier;
        if ((i3 & 91) == 18) {
        }
        if (i4 == 0) {
        }
        Modifier fillMaxSize$default2 = SizeKt.fillMaxSize$default(companion, 0.0f, 1, null);
        Alignment center2 = Alignment.INSTANCE.getCenter();
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, 1042775818, "CC(Box)N(modifier,contentAlignment,propagateMinConstraints,content)71@3424L131:Box.kt#2w3rfo");
        MeasurePolicy maybeCachedBoxMeasurePolicy2 = BoxKt.maybeCachedBoxMeasurePolicy(center2, false);
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1159599143, "CC(Layout)P(!1,2)80@3267L27,83@3433L360:Layout.kt#80mrfh");
        hashCode = Long.hashCode(ComposablesKt.getCurrentCompositeKeyHashCode(startRestartGroup, 0));
        CompositionLocalMap currentCompositionLocalMap2 = startRestartGroup.getCurrentCompositionLocalMap();
        Modifier materializeModifier2 = ComposedModifierKt.materializeModifier(startRestartGroup, fillMaxSize$default2);
        Function0<ComposeUiNode> constructor2 = ComposeUiNode.INSTANCE.getConstructor();
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -553112988, "CC(ReusableComposeNode)N(factory,update,content)399@15590L9:Composables.kt#9igjgp");
        if (!(startRestartGroup.getApplier() instanceof Applier)) {
        }
        startRestartGroup.startReusableNode();
        if (!startRestartGroup.getInserting()) {
        }
        m5333constructorimpl = Updater.m5333constructorimpl(startRestartGroup);
        Updater.m5340setimpl(m5333constructorimpl, maybeCachedBoxMeasurePolicy2, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
        Updater.m5340setimpl(m5333constructorimpl, currentCompositionLocalMap2, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
        if (!m5333constructorimpl.getInserting()) {
        }
        m5333constructorimpl.updateRememberedValue(Integer.valueOf(hashCode));
        m5333constructorimpl.apply(Integer.valueOf(hashCode), setCompositeKeyHash2);
        Updater.m5340setimpl(m5333constructorimpl, materializeModifier2, ComposeUiNode.INSTANCE.getSetModifier());
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, 1833054614, "C72@3469L9:Box.kt#2w3rfo");
        BoxScopeInstance boxScopeInstance2 = BoxScopeInstance.INSTANCE;
        float f2 = 32;
        Modifier modifier32 = companion;
        TextKt.m3901TextNvy7gAk(StringResources_androidKt.stringResource(state.getMessageResId(), startRestartGroup, 0), boxScopeInstance2.align(PaddingKt.m1158paddingVpY3zN4(Modifier.INSTANCE, Dp.m8798constructorimpl(f2), Dp.m8798constructorimpl(f2)), Alignment.INSTANCE.getTopCenter()), state.getSurveyUiColors().m12631getOnBackground0d7_KjU(), null, TextUnitKt.getSp(36), null, FontWeight.INSTANCE.getBold(), null, 0L, null, TextAlign.m8647boximpl(TextAlign.INSTANCE.m8654getCentere0LSkKk()), 0L, 0, false, 0, 0, null, null, startRestartGroup, 1597440, 0, 261032);
        startRestartGroup.startReplaceGroup(-803498879);
        if (state instanceof SurveyState.Error.WithCTA) {
        }
        composer2 = startRestartGroup;
        composer2.endReplaceGroup();
        ComposerKt.sourceInformationMarkerEnd(composer2);
        composer2.endNode();
        ComposerKt.sourceInformationMarkerEnd(composer2);
        ComposerKt.sourceInformationMarkerEnd(composer2);
        ComposerKt.sourceInformationMarkerEnd(composer2);
        modifier2 = modifier32;
        endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    public static final void ErrorStateWithCTA(Composer composer, final int i) {
        Composer startRestartGroup = composer.startRestartGroup(1921062712);
        if (i != 0 || !startRestartGroup.getSkipping()) {
            SurveyError(new SurveyState.Error.WithCTA(0, SurveyViewModelKt.toSurveyUiColors(new SurveyCustomization(null, null, 3, null)), new TopBarState.NoTopBarState(true, SurveyViewModelKt.toSurveyUiColors(new SurveyCustomization(null, null, 3, null)), null, 4, null), new Function0() { // from class: io.intercom.android.sdk.survey.ui.components.ErrorComponentKt$$ExternalSyntheticLambda2
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    Unit unit;
                    unit = Unit.INSTANCE;
                    return unit;
                }
            }, 1, null), null, startRestartGroup, 0, 2);
        } else {
            startRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new Function2() { // from class: io.intercom.android.sdk.survey.ui.components.ErrorComponentKt$$ExternalSyntheticLambda3
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    Unit ErrorStateWithCTA$lambda$3;
                    ErrorStateWithCTA$lambda$3 = ErrorComponentKt.ErrorStateWithCTA$lambda$3(i, (Composer) obj, ((Integer) obj2).intValue());
                    return ErrorStateWithCTA$lambda$3;
                }
            });
        }
    }

    public static final void ErrorStateWithoutCTA(Composer composer, final int i) {
        Composer startRestartGroup = composer.startRestartGroup(-1056362620);
        if (i != 0 || !startRestartGroup.getSkipping()) {
            SurveyError(new SurveyState.Error.WithoutCTA(0, SurveyViewModelKt.toSurveyUiColors(new SurveyCustomization(null, null, 3, null)), new TopBarState.NoTopBarState(true, SurveyViewModelKt.toSurveyUiColors(new SurveyCustomization(null, null, 3, null)), null, 4, null), 1, null), null, startRestartGroup, 0, 2);
        } else {
            startRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new Function2() { // from class: io.intercom.android.sdk.survey.ui.components.ErrorComponentKt$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    Unit ErrorStateWithoutCTA$lambda$4;
                    ErrorStateWithoutCTA$lambda$4 = ErrorComponentKt.ErrorStateWithoutCTA$lambda$4(i, (Composer) obj, ((Integer) obj2).intValue());
                    return ErrorStateWithoutCTA$lambda$4;
                }
            });
        }
    }
}
