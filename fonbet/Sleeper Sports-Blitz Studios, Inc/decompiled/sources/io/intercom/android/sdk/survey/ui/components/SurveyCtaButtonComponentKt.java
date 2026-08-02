package io.intercom.android.sdk.survey.ui.components;

import androidx.compose.foundation.BorderStroke;
import androidx.compose.foundation.BorderStrokeKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScope;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.shape.RoundedCornerShape;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.material3.ButtonColors;
import androidx.compose.material3.ButtonDefaults;
import androidx.compose.material3.ButtonElevation;
import androidx.compose.material3.ButtonKt;
import androidx.compose.material3.IconKt;
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
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.res.PainterResources_androidKt;
import androidx.compose.ui.unit.Dp;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.profileinstaller.ProfileVerifier;
import io.intercom.android.sdk.R;
import io.intercom.android.sdk.survey.SurveyState;
import io.intercom.android.sdk.survey.SurveyUiColors;
import io.intercom.android.sdk.survey.SurveyViewModelKt;
import io.intercom.android.sdk.survey.model.SurveyCustomization;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: SurveyCtaButtonComponent.kt */
@Metadata(d1 = {"\u00002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u001a]\u0010\u0000\u001a\u00020\u00012\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\u000e\b\u0002\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00010\n2\u0014\b\u0002\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00010\f2\u0006\u0010\r\u001a\u00020\u000eH\u0001¢\u0006\u0002\u0010\u000f\u001a\r\u0010\u0010\u001a\u00020\u0001H\u0001¢\u0006\u0002\u0010\u0011\u001a\r\u0010\u0012\u001a\u00020\u0001H\u0001¢\u0006\u0002\u0010\u0011\u001a\r\u0010\u0013\u001a\u00020\u0001H\u0001¢\u0006\u0002\u0010\u0011¨\u0006\u0014"}, d2 = {"SurveyCtaButtonComponent", "", "modifier", "Landroidx/compose/ui/Modifier;", "primaryCtaText", "", "secondaryCtas", "", "Lio/intercom/android/sdk/survey/SurveyState$Content$SecondaryCta;", "onPrimaryCtaClicked", "Lkotlin/Function0;", "onSecondaryCtaClicked", "Lkotlin/Function1;", "surveyUiColors", "Lio/intercom/android/sdk/survey/SurveyUiColors;", "(Landroidx/compose/ui/Modifier;Ljava/lang/String;Ljava/util/List;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;Lio/intercom/android/sdk/survey/SurveyUiColors;Landroidx/compose/runtime/Composer;II)V", "LightButtonPreview", "(Landroidx/compose/runtime/Composer;I)V", "DarkButtonPreview", "SecondaryCtaPreview", "intercom-sdk-base_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class SurveyCtaButtonComponentKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit DarkButtonPreview$lambda$10(int i, Composer composer, int i2) {
        DarkButtonPreview(composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit LightButtonPreview$lambda$8(int i, Composer composer, int i2) {
        LightButtonPreview(composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit SecondaryCtaPreview$lambda$12(int i, Composer composer, int i2) {
        SecondaryCtaPreview(composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit SurveyCtaButtonComponent$lambda$6(Modifier modifier, String primaryCtaText, List list, Function0 function0, Function1 function1, SurveyUiColors surveyUiColors, int i, int i2, Composer composer, int i3) {
        Intrinsics.checkNotNullParameter(primaryCtaText, "$primaryCtaText");
        Intrinsics.checkNotNullParameter(surveyUiColors, "$surveyUiColors");
        SurveyCtaButtonComponent(modifier, primaryCtaText, list, function0, function1, surveyUiColors, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit SurveyCtaButtonComponent$lambda$1(SurveyState.Content.SecondaryCta it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x03a8  */
    /* JADX WARN: Removed duplicated region for block: B:33:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00c8  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00d0  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00d9  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00e5  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0161  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x016d  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0196  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x01dc  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x02a1  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x02e8  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x02f8  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0335  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x02ea  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x02b7  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0171  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x00eb  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x00e1  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x007c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void SurveyCtaButtonComponent(Modifier modifier, final String primaryCtaText, List<SurveyState.Content.SecondaryCta> list, Function0<Unit> function0, Function1<? super SurveyState.Content.SecondaryCta, Unit> function1, final SurveyUiColors surveyUiColors, Composer composer, final int i, final int i2) {
        Modifier modifier2;
        int i3;
        Function0<Unit> function02;
        int i4;
        Function1<? super SurveyState.Content.SecondaryCta, Unit> function12;
        int i5;
        List<SurveyState.Content.SecondaryCta> emptyList;
        int hashCode;
        Composer m5333constructorimpl;
        Iterator it;
        Pair pair;
        Function1<? super SurveyState.Content.SecondaryCta, Unit> function13;
        BorderStroke borderStroke;
        Composer composer2;
        final long j;
        final List<SurveyState.Content.SecondaryCta> list2;
        final Function0<Unit> function03;
        final Function1<? super SurveyState.Content.SecondaryCta, Unit> function14;
        final Modifier modifier3;
        ScopeUpdateScope endRestartGroup;
        Intrinsics.checkNotNullParameter(primaryCtaText, "primaryCtaText");
        Intrinsics.checkNotNullParameter(surveyUiColors, "surveyUiColors");
        Composer startRestartGroup = composer.startRestartGroup(-1455595547);
        int i6 = i2 & 1;
        if (i6 != 0) {
            i3 = i | 6;
            modifier2 = modifier;
        } else if ((i & 14) == 0) {
            modifier2 = modifier;
            i3 = (startRestartGroup.changed(modifier2) ? 4 : 2) | i;
        } else {
            modifier2 = modifier;
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 112) == 0) {
            i3 |= startRestartGroup.changed(primaryCtaText) ? 32 : 16;
        }
        int i7 = i2 & 4;
        if (i7 != 0) {
            i3 |= 128;
        }
        int i8 = i2 & 8;
        if (i8 != 0) {
            i3 |= 3072;
        } else if ((i & 7168) == 0) {
            function02 = function0;
            i3 |= startRestartGroup.changedInstance(function02) ? 2048 : 1024;
            i4 = i2 & 16;
            if (i4 == 0) {
                i3 |= 24576;
            } else if ((i & 57344) == 0) {
                function12 = function1;
                i3 |= startRestartGroup.changedInstance(function12) ? 16384 : 8192;
                if ((i2 & 32) == 0) {
                    if ((458752 & i) == 0) {
                        i5 = startRestartGroup.changed(surveyUiColors) ? 131072 : 65536;
                    }
                    if (i7 == 4 || (374491 & i3) != 74898 || !startRestartGroup.getSkipping()) {
                        Modifier.Companion companion = i6 == 0 ? Modifier.INSTANCE : modifier2;
                        emptyList = i7 == 0 ? CollectionsKt.emptyList() : list;
                        Function0<Unit> function04 = i8 == 0 ? new Function0() { // from class: io.intercom.android.sdk.survey.ui.components.SurveyCtaButtonComponentKt$$ExternalSyntheticLambda3
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                Unit unit;
                                unit = Unit.INSTANCE;
                                return unit;
                            }
                        } : function02;
                        Function1<? super SurveyState.Content.SecondaryCta, Unit> function15 = i4 == 0 ? new Function1() { // from class: io.intercom.android.sdk.survey.ui.components.SurveyCtaButtonComponentKt$$ExternalSyntheticLambda4
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                Unit SurveyCtaButtonComponent$lambda$1;
                                SurveyCtaButtonComponent$lambda$1 = SurveyCtaButtonComponentKt.SurveyCtaButtonComponent$lambda$1((SurveyState.Content.SecondaryCta) obj);
                                return SurveyCtaButtonComponent$lambda$1;
                            }
                        } : function12;
                        BorderStroke m612BorderStrokecXLIe8U = BorderStrokeKt.m612BorderStrokecXLIe8U(Dp.m8798constructorimpl(1), surveyUiColors.m12629getButtonBorder0d7_KjU());
                        float f = 8;
                        RoundedCornerShape m1522RoundedCornerShape0680j_4 = RoundedCornerShapeKt.m1522RoundedCornerShape0680j_4(Dp.m8798constructorimpl(f));
                        Modifier m1195height3ABfNKs = SizeKt.m1195height3ABfNKs(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), Dp.m8798constructorimpl(56));
                        ComposerKt.sourceInformationMarkerStart(startRestartGroup, 1341605231, "CC(Column)N(modifier,verticalArrangement,horizontalAlignment,content)87@4443L61,88@4509L134:Column.kt#2w3rfo");
                        MeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), startRestartGroup, 0);
                        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1159599143, "CC(Layout)P(!1,2)80@3267L27,83@3433L360:Layout.kt#80mrfh");
                        hashCode = Long.hashCode(ComposablesKt.getCurrentCompositeKeyHashCode(startRestartGroup, 0));
                        CompositionLocalMap currentCompositionLocalMap = startRestartGroup.getCurrentCompositionLocalMap();
                        Modifier materializeModifier = ComposedModifierKt.materializeModifier(startRestartGroup, companion);
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
                        startRestartGroup.startReplaceGroup(1171126918);
                        it = emptyList.iterator();
                        while (it.hasNext()) {
                            final SurveyState.Content.SecondaryCta secondaryCta = (SurveyState.Content.SecondaryCta) it.next();
                            final Function1<? super SurveyState.Content.SecondaryCta, Unit> function16 = function15;
                            float f2 = f;
                            Composer composer3 = startRestartGroup;
                            Modifier modifier4 = companion;
                            Iterator it2 = it;
                            ButtonColors m2707buttonColorsro_MJ88 = ButtonDefaults.INSTANCE.m2707buttonColorsro_MJ88(surveyUiColors.m12628getButton0d7_KjU(), 0L, 0L, 0L, composer3, ButtonDefaults.$stable << 12, 14);
                            composer3.startReplaceGroup(1934484526);
                            boolean changed = composer3.changed(secondaryCta) | ((i3 & 57344) == 16384);
                            Object rememberedValue = composer3.rememberedValue();
                            if (changed || rememberedValue == Composer.INSTANCE.getEmpty()) {
                                rememberedValue = new Function0() { // from class: io.intercom.android.sdk.survey.ui.components.SurveyCtaButtonComponentKt$$ExternalSyntheticLambda5
                                    @Override // kotlin.jvm.functions.Function0
                                    public final Object invoke() {
                                        Unit SurveyCtaButtonComponent$lambda$5$lambda$4$lambda$3$lambda$2;
                                        SurveyCtaButtonComponent$lambda$5$lambda$4$lambda$3$lambda$2 = SurveyCtaButtonComponentKt.SurveyCtaButtonComponent$lambda$5$lambda$4$lambda$3$lambda$2(Function1.this, secondaryCta);
                                        return SurveyCtaButtonComponent$lambda$5$lambda$4$lambda$3$lambda$2;
                                    }
                                };
                                composer3.updateRememberedValue(rememberedValue);
                            }
                            composer3.endReplaceGroup();
                            BorderStroke borderStroke2 = m612BorderStrokecXLIe8U;
                            Modifier modifier5 = m1195height3ABfNKs;
                            ButtonKt.Button((Function0) rememberedValue, modifier5, false, m1522RoundedCornerShape0680j_4, m2707buttonColorsro_MJ88, null, borderStroke2, null, null, ComposableLambdaKt.rememberComposableLambda(468620518, true, new Function3<RowScope, Composer, Integer, Unit>() { // from class: io.intercom.android.sdk.survey.ui.components.SurveyCtaButtonComponentKt$SurveyCtaButtonComponent$3$1$2
                                @Override // kotlin.jvm.functions.Function3
                                public /* bridge */ /* synthetic */ Unit invoke(RowScope rowScope, Composer composer4, Integer num) {
                                    invoke(rowScope, composer4, num.intValue());
                                    return Unit.INSTANCE;
                                }

                                public final void invoke(RowScope Button, Composer composer4, int i9) {
                                    Intrinsics.checkNotNullParameter(Button, "$this$Button");
                                    if ((i9 & 81) != 16 || !composer4.getSkipping()) {
                                        Alignment.Vertical centerVertically = Alignment.INSTANCE.getCenterVertically();
                                        SurveyState.Content.SecondaryCta secondaryCta2 = SurveyState.Content.SecondaryCta.this;
                                        SurveyUiColors surveyUiColors2 = surveyUiColors;
                                        ComposerKt.sourceInformationMarkerStart(composer4, 844473419, "CC(Row)N(modifier,horizontalArrangement,verticalAlignment,content)99@5125L58,100@5188L131:Row.kt#2w3rfo");
                                        Modifier.Companion companion2 = Modifier.INSTANCE;
                                        MeasurePolicy rowMeasurePolicy = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), centerVertically, composer4, 48);
                                        ComposerKt.sourceInformationMarkerStart(composer4, -1159599143, "CC(Layout)P(!1,2)80@3267L27,83@3433L360:Layout.kt#80mrfh");
                                        int hashCode2 = Long.hashCode(ComposablesKt.getCurrentCompositeKeyHashCode(composer4, 0));
                                        CompositionLocalMap currentCompositionLocalMap2 = composer4.getCurrentCompositionLocalMap();
                                        Modifier materializeModifier2 = ComposedModifierKt.materializeModifier(composer4, companion2);
                                        Function0<ComposeUiNode> constructor2 = ComposeUiNode.INSTANCE.getConstructor();
                                        ComposerKt.sourceInformationMarkerStart(composer4, -553112988, "CC(ReusableComposeNode)N(factory,update,content)399@15590L9:Composables.kt#9igjgp");
                                        if (!(composer4.getApplier() instanceof Applier)) {
                                            ComposablesKt.invalidApplier();
                                        }
                                        composer4.startReusableNode();
                                        if (composer4.getInserting()) {
                                            composer4.createNode(constructor2);
                                        } else {
                                            composer4.useNode();
                                        }
                                        Composer m5333constructorimpl2 = Updater.m5333constructorimpl(composer4);
                                        Updater.m5340setimpl(m5333constructorimpl2, rowMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                                        Updater.m5340setimpl(m5333constructorimpl2, currentCompositionLocalMap2, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                                        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                                        if (m5333constructorimpl2.getInserting() || !Intrinsics.areEqual(m5333constructorimpl2.rememberedValue(), Integer.valueOf(hashCode2))) {
                                            m5333constructorimpl2.updateRememberedValue(Integer.valueOf(hashCode2));
                                            m5333constructorimpl2.apply(Integer.valueOf(hashCode2), setCompositeKeyHash2);
                                        }
                                        Updater.m5340setimpl(m5333constructorimpl2, materializeModifier2, ComposeUiNode.INSTANCE.getSetModifier());
                                        ComposerKt.sourceInformationMarkerStart(composer4, 1456264949, "C101@5233L9:Row.kt#2w3rfo");
                                        RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
                                        composer4.startReplaceGroup(410193571);
                                        if (secondaryCta2.isExternalUrl()) {
                                            IconKt.m3194Iconww6aTOc(PainterResources_androidKt.painterResource(R.drawable.intercom_open_help_center, composer4, 0), (String) null, SizeKt.m1209size3ABfNKs(PaddingKt.m1159paddingVpY3zN4$default(Modifier.INSTANCE, Dp.m8798constructorimpl(4), 0.0f, 2, null), Dp.m8798constructorimpl(24)), surveyUiColors2.m12632getOnButton0d7_KjU(), composer4, 440, 0);
                                        }
                                        composer4.endReplaceGroup();
                                        TextKt.m3901TextNvy7gAk(secondaryCta2.getButtonText(), null, surveyUiColors2.m12632getOnButton0d7_KjU(), null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, composer4, 0, 0, 262138);
                                        ComposerKt.sourceInformationMarkerEnd(composer4);
                                        composer4.endNode();
                                        ComposerKt.sourceInformationMarkerEnd(composer4);
                                        ComposerKt.sourceInformationMarkerEnd(composer4);
                                        ComposerKt.sourceInformationMarkerEnd(composer4);
                                        return;
                                    }
                                    composer4.skipToGroupEnd();
                                }
                            }, composer3, 54), composer3, 805306416, TypedValues.CycleType.TYPE_EASING);
                            SpacerKt.Spacer(SizeKt.m1195height3ABfNKs(Modifier.INSTANCE, Dp.m8798constructorimpl(f2)), composer3, 6);
                            it = it2;
                            function15 = function16;
                            m1195height3ABfNKs = modifier5;
                            f = f2;
                            companion = modifier4;
                            m612BorderStrokecXLIe8U = borderStroke2;
                            startRestartGroup = composer3;
                        }
                        Modifier modifier6 = companion;
                        Function1<? super SurveyState.Content.SecondaryCta, Unit> function17 = function15;
                        float f3 = f;
                        Composer composer4 = startRestartGroup;
                        BorderStroke borderStroke3 = m612BorderStrokecXLIe8U;
                        Modifier modifier7 = m1195height3ABfNKs;
                        ButtonElevation buttonElevation = null;
                        composer4.endReplaceGroup();
                        if (!emptyList.isEmpty()) {
                            pair = new Pair(Color.m6029boximpl(surveyUiColors.m12628getButton0d7_KjU()), Color.m6029boximpl(surveyUiColors.m12632getOnButton0d7_KjU()));
                        } else {
                            pair = new Pair(Color.m6029boximpl(Color.INSTANCE.m6074getTransparent0d7_KjU()), Color.m6029boximpl(surveyUiColors.m12631getOnBackground0d7_KjU()));
                        }
                        long m6049unboximpl = ((Color) pair.component1()).m6049unboximpl();
                        long m6049unboximpl2 = ((Color) pair.component2()).m6049unboximpl();
                        BorderStroke borderStroke4 = !emptyList.isEmpty() ? borderStroke3 : null;
                        composer4.startReplaceGroup(1171174724);
                        if (emptyList.isEmpty()) {
                            function13 = function17;
                            borderStroke = borderStroke4;
                            composer2 = composer4;
                            j = m6049unboximpl2;
                        } else {
                            ButtonDefaults buttonDefaults = ButtonDefaults.INSTANCE;
                            float m8798constructorimpl = Dp.m8798constructorimpl(2);
                            float m8798constructorimpl2 = Dp.m8798constructorimpl(f3);
                            float m8798constructorimpl3 = Dp.m8798constructorimpl(0);
                            float f4 = 4;
                            float m8798constructorimpl4 = Dp.m8798constructorimpl(f4);
                            function13 = function17;
                            borderStroke = borderStroke4;
                            j = m6049unboximpl2;
                            composer2 = composer4;
                            buttonElevation = buttonDefaults.m2708buttonElevationR_JCAzs(m8798constructorimpl, m8798constructorimpl2, Dp.m8798constructorimpl(f4), m8798constructorimpl4, m8798constructorimpl3, composer2, (ButtonDefaults.$stable << 15) | 28086, 0);
                        }
                        composer2.endReplaceGroup();
                        Composer composer5 = composer2;
                        Function0<Unit> function05 = function04;
                        ButtonKt.Button(function05, modifier7, false, m1522RoundedCornerShape0680j_4, ButtonDefaults.INSTANCE.m2707buttonColorsro_MJ88(m6049unboximpl, 0L, 0L, 0L, composer5, ButtonDefaults.$stable << 12, 14), buttonElevation, borderStroke, null, null, ComposableLambdaKt.rememberComposableLambda(767351755, true, new Function3<RowScope, Composer, Integer, Unit>() { // from class: io.intercom.android.sdk.survey.ui.components.SurveyCtaButtonComponentKt$SurveyCtaButtonComponent$3$2
                            @Override // kotlin.jvm.functions.Function3
                            public /* bridge */ /* synthetic */ Unit invoke(RowScope rowScope, Composer composer6, Integer num) {
                                invoke(rowScope, composer6, num.intValue());
                                return Unit.INSTANCE;
                            }

                            public final void invoke(RowScope Button, Composer composer6, int i9) {
                                Intrinsics.checkNotNullParameter(Button, "$this$Button");
                                if ((i9 & 81) != 16 || !composer6.getSkipping()) {
                                    TextKt.m3901TextNvy7gAk(primaryCtaText, null, j, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, composer6, 0, 0, 262138);
                                } else {
                                    composer6.skipToGroupEnd();
                                }
                            }
                        }, composer5, 54), composer5, ((i3 >> 9) & 14) | 805306416, 388);
                        startRestartGroup = composer5;
                        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                        startRestartGroup.endNode();
                        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                        list2 = emptyList;
                        function03 = function05;
                        function14 = function13;
                        modifier3 = modifier6;
                    } else {
                        startRestartGroup.skipToGroupEnd();
                        list2 = list;
                        modifier3 = modifier2;
                        function03 = function02;
                        function14 = function12;
                    }
                    endRestartGroup = startRestartGroup.endRestartGroup();
                    if (endRestartGroup == null) {
                        endRestartGroup.updateScope(new Function2() { // from class: io.intercom.android.sdk.survey.ui.components.SurveyCtaButtonComponentKt$$ExternalSyntheticLambda6
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj, Object obj2) {
                                Unit SurveyCtaButtonComponent$lambda$6;
                                SurveyCtaButtonComponent$lambda$6 = SurveyCtaButtonComponentKt.SurveyCtaButtonComponent$lambda$6(Modifier.this, primaryCtaText, list2, function03, function14, surveyUiColors, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                                return SurveyCtaButtonComponent$lambda$6;
                            }
                        });
                        return;
                    }
                    return;
                }
                i5 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
                i3 |= i5;
                if (i7 == 4) {
                }
                if (i6 == 0) {
                }
                if (i7 == 0) {
                }
                if (i8 == 0) {
                }
                if (i4 == 0) {
                }
                BorderStroke m612BorderStrokecXLIe8U2 = BorderStrokeKt.m612BorderStrokecXLIe8U(Dp.m8798constructorimpl(1), surveyUiColors.m12629getButtonBorder0d7_KjU());
                float f5 = 8;
                RoundedCornerShape m1522RoundedCornerShape0680j_42 = RoundedCornerShapeKt.m1522RoundedCornerShape0680j_4(Dp.m8798constructorimpl(f5));
                Modifier m1195height3ABfNKs2 = SizeKt.m1195height3ABfNKs(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), Dp.m8798constructorimpl(56));
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, 1341605231, "CC(Column)N(modifier,verticalArrangement,horizontalAlignment,content)87@4443L61,88@4509L134:Column.kt#2w3rfo");
                MeasurePolicy columnMeasurePolicy2 = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), startRestartGroup, 0);
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1159599143, "CC(Layout)P(!1,2)80@3267L27,83@3433L360:Layout.kt#80mrfh");
                hashCode = Long.hashCode(ComposablesKt.getCurrentCompositeKeyHashCode(startRestartGroup, 0));
                CompositionLocalMap currentCompositionLocalMap2 = startRestartGroup.getCurrentCompositionLocalMap();
                Modifier materializeModifier2 = ComposedModifierKt.materializeModifier(startRestartGroup, companion);
                Function0<ComposeUiNode> constructor2 = ComposeUiNode.INSTANCE.getConstructor();
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, -553112988, "CC(ReusableComposeNode)N(factory,update,content)399@15590L9:Composables.kt#9igjgp");
                if (!(startRestartGroup.getApplier() instanceof Applier)) {
                }
                startRestartGroup.startReusableNode();
                if (!startRestartGroup.getInserting()) {
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
                startRestartGroup.startReplaceGroup(1171126918);
                it = emptyList.iterator();
                while (it.hasNext()) {
                }
                Modifier modifier62 = companion;
                Function1<? super SurveyState.Content.SecondaryCta, Unit> function172 = function15;
                float f32 = f5;
                Composer composer42 = startRestartGroup;
                BorderStroke borderStroke32 = m612BorderStrokecXLIe8U2;
                Modifier modifier72 = m1195height3ABfNKs2;
                ButtonElevation buttonElevation2 = null;
                composer42.endReplaceGroup();
                if (!emptyList.isEmpty()) {
                }
                long m6049unboximpl3 = ((Color) pair.component1()).m6049unboximpl();
                long m6049unboximpl22 = ((Color) pair.component2()).m6049unboximpl();
                if (!emptyList.isEmpty()) {
                }
                composer42.startReplaceGroup(1171174724);
                if (emptyList.isEmpty()) {
                }
                composer2.endReplaceGroup();
                Composer composer52 = composer2;
                Function0<Unit> function052 = function04;
                ButtonKt.Button(function052, modifier72, false, m1522RoundedCornerShape0680j_42, ButtonDefaults.INSTANCE.m2707buttonColorsro_MJ88(m6049unboximpl3, 0L, 0L, 0L, composer52, ButtonDefaults.$stable << 12, 14), buttonElevation2, borderStroke, null, null, ComposableLambdaKt.rememberComposableLambda(767351755, true, new Function3<RowScope, Composer, Integer, Unit>() { // from class: io.intercom.android.sdk.survey.ui.components.SurveyCtaButtonComponentKt$SurveyCtaButtonComponent$3$2
                    @Override // kotlin.jvm.functions.Function3
                    public /* bridge */ /* synthetic */ Unit invoke(RowScope rowScope, Composer composer6, Integer num) {
                        invoke(rowScope, composer6, num.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(RowScope Button, Composer composer6, int i9) {
                        Intrinsics.checkNotNullParameter(Button, "$this$Button");
                        if ((i9 & 81) != 16 || !composer6.getSkipping()) {
                            TextKt.m3901TextNvy7gAk(primaryCtaText, null, j, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, composer6, 0, 0, 262138);
                        } else {
                            composer6.skipToGroupEnd();
                        }
                    }
                }, composer52, 54), composer52, ((i3 >> 9) & 14) | 805306416, 388);
                startRestartGroup = composer52;
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                startRestartGroup.endNode();
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                list2 = emptyList;
                function03 = function052;
                function14 = function13;
                modifier3 = modifier62;
                endRestartGroup = startRestartGroup.endRestartGroup();
                if (endRestartGroup == null) {
                }
            }
            function12 = function1;
            if ((i2 & 32) == 0) {
            }
            i3 |= i5;
            if (i7 == 4) {
            }
            if (i6 == 0) {
            }
            if (i7 == 0) {
            }
            if (i8 == 0) {
            }
            if (i4 == 0) {
            }
            BorderStroke m612BorderStrokecXLIe8U22 = BorderStrokeKt.m612BorderStrokecXLIe8U(Dp.m8798constructorimpl(1), surveyUiColors.m12629getButtonBorder0d7_KjU());
            float f52 = 8;
            RoundedCornerShape m1522RoundedCornerShape0680j_422 = RoundedCornerShapeKt.m1522RoundedCornerShape0680j_4(Dp.m8798constructorimpl(f52));
            Modifier m1195height3ABfNKs22 = SizeKt.m1195height3ABfNKs(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), Dp.m8798constructorimpl(56));
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 1341605231, "CC(Column)N(modifier,verticalArrangement,horizontalAlignment,content)87@4443L61,88@4509L134:Column.kt#2w3rfo");
            MeasurePolicy columnMeasurePolicy22 = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), startRestartGroup, 0);
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1159599143, "CC(Layout)P(!1,2)80@3267L27,83@3433L360:Layout.kt#80mrfh");
            hashCode = Long.hashCode(ComposablesKt.getCurrentCompositeKeyHashCode(startRestartGroup, 0));
            CompositionLocalMap currentCompositionLocalMap22 = startRestartGroup.getCurrentCompositionLocalMap();
            Modifier materializeModifier22 = ComposedModifierKt.materializeModifier(startRestartGroup, companion);
            Function0<ComposeUiNode> constructor22 = ComposeUiNode.INSTANCE.getConstructor();
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -553112988, "CC(ReusableComposeNode)N(factory,update,content)399@15590L9:Composables.kt#9igjgp");
            if (!(startRestartGroup.getApplier() instanceof Applier)) {
            }
            startRestartGroup.startReusableNode();
            if (!startRestartGroup.getInserting()) {
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
            startRestartGroup.startReplaceGroup(1171126918);
            it = emptyList.iterator();
            while (it.hasNext()) {
            }
            Modifier modifier622 = companion;
            Function1<? super SurveyState.Content.SecondaryCta, Unit> function1722 = function15;
            float f322 = f52;
            Composer composer422 = startRestartGroup;
            BorderStroke borderStroke322 = m612BorderStrokecXLIe8U22;
            Modifier modifier722 = m1195height3ABfNKs22;
            ButtonElevation buttonElevation22 = null;
            composer422.endReplaceGroup();
            if (!emptyList.isEmpty()) {
            }
            long m6049unboximpl32 = ((Color) pair.component1()).m6049unboximpl();
            long m6049unboximpl222 = ((Color) pair.component2()).m6049unboximpl();
            if (!emptyList.isEmpty()) {
            }
            composer422.startReplaceGroup(1171174724);
            if (emptyList.isEmpty()) {
            }
            composer2.endReplaceGroup();
            Composer composer522 = composer2;
            Function0<Unit> function0522 = function04;
            ButtonKt.Button(function0522, modifier722, false, m1522RoundedCornerShape0680j_422, ButtonDefaults.INSTANCE.m2707buttonColorsro_MJ88(m6049unboximpl32, 0L, 0L, 0L, composer522, ButtonDefaults.$stable << 12, 14), buttonElevation22, borderStroke, null, null, ComposableLambdaKt.rememberComposableLambda(767351755, true, new Function3<RowScope, Composer, Integer, Unit>() { // from class: io.intercom.android.sdk.survey.ui.components.SurveyCtaButtonComponentKt$SurveyCtaButtonComponent$3$2
                @Override // kotlin.jvm.functions.Function3
                public /* bridge */ /* synthetic */ Unit invoke(RowScope rowScope, Composer composer6, Integer num) {
                    invoke(rowScope, composer6, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(RowScope Button, Composer composer6, int i9) {
                    Intrinsics.checkNotNullParameter(Button, "$this$Button");
                    if ((i9 & 81) != 16 || !composer6.getSkipping()) {
                        TextKt.m3901TextNvy7gAk(primaryCtaText, null, j, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, composer6, 0, 0, 262138);
                    } else {
                        composer6.skipToGroupEnd();
                    }
                }
            }, composer522, 54), composer522, ((i3 >> 9) & 14) | 805306416, 388);
            startRestartGroup = composer522;
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            startRestartGroup.endNode();
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            list2 = emptyList;
            function03 = function0522;
            function14 = function13;
            modifier3 = modifier622;
            endRestartGroup = startRestartGroup.endRestartGroup();
            if (endRestartGroup == null) {
            }
        }
        function02 = function0;
        i4 = i2 & 16;
        if (i4 == 0) {
        }
        function12 = function1;
        if ((i2 & 32) == 0) {
        }
        i3 |= i5;
        if (i7 == 4) {
        }
        if (i6 == 0) {
        }
        if (i7 == 0) {
        }
        if (i8 == 0) {
        }
        if (i4 == 0) {
        }
        BorderStroke m612BorderStrokecXLIe8U222 = BorderStrokeKt.m612BorderStrokecXLIe8U(Dp.m8798constructorimpl(1), surveyUiColors.m12629getButtonBorder0d7_KjU());
        float f522 = 8;
        RoundedCornerShape m1522RoundedCornerShape0680j_4222 = RoundedCornerShapeKt.m1522RoundedCornerShape0680j_4(Dp.m8798constructorimpl(f522));
        Modifier m1195height3ABfNKs222 = SizeKt.m1195height3ABfNKs(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), Dp.m8798constructorimpl(56));
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, 1341605231, "CC(Column)N(modifier,verticalArrangement,horizontalAlignment,content)87@4443L61,88@4509L134:Column.kt#2w3rfo");
        MeasurePolicy columnMeasurePolicy222 = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), startRestartGroup, 0);
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1159599143, "CC(Layout)P(!1,2)80@3267L27,83@3433L360:Layout.kt#80mrfh");
        hashCode = Long.hashCode(ComposablesKt.getCurrentCompositeKeyHashCode(startRestartGroup, 0));
        CompositionLocalMap currentCompositionLocalMap222 = startRestartGroup.getCurrentCompositionLocalMap();
        Modifier materializeModifier222 = ComposedModifierKt.materializeModifier(startRestartGroup, companion);
        Function0<ComposeUiNode> constructor222 = ComposeUiNode.INSTANCE.getConstructor();
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -553112988, "CC(ReusableComposeNode)N(factory,update,content)399@15590L9:Composables.kt#9igjgp");
        if (!(startRestartGroup.getApplier() instanceof Applier)) {
        }
        startRestartGroup.startReusableNode();
        if (!startRestartGroup.getInserting()) {
        }
        m5333constructorimpl = Updater.m5333constructorimpl(startRestartGroup);
        Updater.m5340setimpl(m5333constructorimpl, columnMeasurePolicy222, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
        Updater.m5340setimpl(m5333constructorimpl, currentCompositionLocalMap222, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash222 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
        if (!m5333constructorimpl.getInserting()) {
        }
        m5333constructorimpl.updateRememberedValue(Integer.valueOf(hashCode));
        m5333constructorimpl.apply(Integer.valueOf(hashCode), setCompositeKeyHash222);
        Updater.m5340setimpl(m5333constructorimpl, materializeModifier222, ComposeUiNode.INSTANCE.getSetModifier());
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2093002350, "C89@4557L9:Column.kt#2w3rfo");
        ColumnScopeInstance columnScopeInstance222 = ColumnScopeInstance.INSTANCE;
        startRestartGroup.startReplaceGroup(1171126918);
        it = emptyList.iterator();
        while (it.hasNext()) {
        }
        Modifier modifier6222 = companion;
        Function1<? super SurveyState.Content.SecondaryCta, Unit> function17222 = function15;
        float f3222 = f522;
        Composer composer4222 = startRestartGroup;
        BorderStroke borderStroke3222 = m612BorderStrokecXLIe8U222;
        Modifier modifier7222 = m1195height3ABfNKs222;
        ButtonElevation buttonElevation222 = null;
        composer4222.endReplaceGroup();
        if (!emptyList.isEmpty()) {
        }
        long m6049unboximpl322 = ((Color) pair.component1()).m6049unboximpl();
        long m6049unboximpl2222 = ((Color) pair.component2()).m6049unboximpl();
        if (!emptyList.isEmpty()) {
        }
        composer4222.startReplaceGroup(1171174724);
        if (emptyList.isEmpty()) {
        }
        composer2.endReplaceGroup();
        Composer composer5222 = composer2;
        Function0<Unit> function05222 = function04;
        ButtonKt.Button(function05222, modifier7222, false, m1522RoundedCornerShape0680j_4222, ButtonDefaults.INSTANCE.m2707buttonColorsro_MJ88(m6049unboximpl322, 0L, 0L, 0L, composer5222, ButtonDefaults.$stable << 12, 14), buttonElevation222, borderStroke, null, null, ComposableLambdaKt.rememberComposableLambda(767351755, true, new Function3<RowScope, Composer, Integer, Unit>() { // from class: io.intercom.android.sdk.survey.ui.components.SurveyCtaButtonComponentKt$SurveyCtaButtonComponent$3$2
            @Override // kotlin.jvm.functions.Function3
            public /* bridge */ /* synthetic */ Unit invoke(RowScope rowScope, Composer composer6, Integer num) {
                invoke(rowScope, composer6, num.intValue());
                return Unit.INSTANCE;
            }

            public final void invoke(RowScope Button, Composer composer6, int i9) {
                Intrinsics.checkNotNullParameter(Button, "$this$Button");
                if ((i9 & 81) != 16 || !composer6.getSkipping()) {
                    TextKt.m3901TextNvy7gAk(primaryCtaText, null, j, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, composer6, 0, 0, 262138);
                } else {
                    composer6.skipToGroupEnd();
                }
            }
        }, composer5222, 54), composer5222, ((i3 >> 9) & 14) | 805306416, 388);
        startRestartGroup = composer5222;
        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        startRestartGroup.endNode();
        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        list2 = emptyList;
        function03 = function05222;
        function14 = function13;
        modifier3 = modifier6222;
        endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit SurveyCtaButtonComponent$lambda$5$lambda$4$lambda$3$lambda$2(Function1 function1, SurveyState.Content.SecondaryCta it) {
        Intrinsics.checkNotNullParameter(it, "$it");
        function1.invoke(it);
        return Unit.INSTANCE;
    }

    public static final void LightButtonPreview(Composer composer, final int i) {
        Composer startRestartGroup = composer.startRestartGroup(1401512691);
        if (i != 0 || !startRestartGroup.getSkipping()) {
            Modifier.Companion companion = Modifier.INSTANCE;
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 1042775818, "CC(Box)N(modifier,contentAlignment,propagateMinConstraints,content)71@3424L131:Box.kt#2w3rfo");
            MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false);
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
            Updater.m5340setimpl(m5333constructorimpl, maybeCachedBoxMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            Updater.m5340setimpl(m5333constructorimpl, currentCompositionLocalMap, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
            if (m5333constructorimpl.getInserting() || !Intrinsics.areEqual(m5333constructorimpl.rememberedValue(), Integer.valueOf(hashCode))) {
                m5333constructorimpl.updateRememberedValue(Integer.valueOf(hashCode));
                m5333constructorimpl.apply(Integer.valueOf(hashCode), setCompositeKeyHash);
            }
            Updater.m5340setimpl(m5333constructorimpl, materializeModifier, ComposeUiNode.INSTANCE.getSetModifier());
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 1833054614, "C72@3469L9:Box.kt#2w3rfo");
            BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
            SurveyCtaButtonComponent(null, "Submit", null, null, null, SurveyViewModelKt.toSurveyUiColors(new SurveyCustomization(null, null, 3, null)), startRestartGroup, 48, 29);
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
            endRestartGroup.updateScope(new Function2() { // from class: io.intercom.android.sdk.survey.ui.components.SurveyCtaButtonComponentKt$$ExternalSyntheticLambda2
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    Unit LightButtonPreview$lambda$8;
                    LightButtonPreview$lambda$8 = SurveyCtaButtonComponentKt.LightButtonPreview$lambda$8(i, (Composer) obj, ((Integer) obj2).intValue());
                    return LightButtonPreview$lambda$8;
                }
            });
        }
    }

    public static final void DarkButtonPreview(Composer composer, final int i) {
        Composer startRestartGroup = composer.startRestartGroup(-41399177);
        if (i != 0 || !startRestartGroup.getSkipping()) {
            Modifier.Companion companion = Modifier.INSTANCE;
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 1042775818, "CC(Box)N(modifier,contentAlignment,propagateMinConstraints,content)71@3424L131:Box.kt#2w3rfo");
            MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false);
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
            Updater.m5340setimpl(m5333constructorimpl, maybeCachedBoxMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            Updater.m5340setimpl(m5333constructorimpl, currentCompositionLocalMap, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
            if (m5333constructorimpl.getInserting() || !Intrinsics.areEqual(m5333constructorimpl.rememberedValue(), Integer.valueOf(hashCode))) {
                m5333constructorimpl.updateRememberedValue(Integer.valueOf(hashCode));
                m5333constructorimpl.apply(Integer.valueOf(hashCode), setCompositeKeyHash);
            }
            Updater.m5340setimpl(m5333constructorimpl, materializeModifier, ComposeUiNode.INSTANCE.getSetModifier());
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 1833054614, "C72@3469L9:Box.kt#2w3rfo");
            BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
            SurveyCtaButtonComponent(null, "Submit", null, null, null, SurveyViewModelKt.toSurveyUiColors(new SurveyCustomization(null, "#222222", 1, null)), startRestartGroup, 48, 29);
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
            endRestartGroup.updateScope(new Function2() { // from class: io.intercom.android.sdk.survey.ui.components.SurveyCtaButtonComponentKt$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    Unit DarkButtonPreview$lambda$10;
                    DarkButtonPreview$lambda$10 = SurveyCtaButtonComponentKt.DarkButtonPreview$lambda$10(i, (Composer) obj, ((Integer) obj2).intValue());
                    return DarkButtonPreview$lambda$10;
                }
            });
        }
    }

    public static final void SecondaryCtaPreview(Composer composer, final int i) {
        Composer startRestartGroup = composer.startRestartGroup(1826494403);
        if (i != 0 || !startRestartGroup.getSkipping()) {
            Modifier.Companion companion = Modifier.INSTANCE;
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 1042775818, "CC(Box)N(modifier,contentAlignment,propagateMinConstraints,content)71@3424L131:Box.kt#2w3rfo");
            MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false);
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
            Updater.m5340setimpl(m5333constructorimpl, maybeCachedBoxMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            Updater.m5340setimpl(m5333constructorimpl, currentCompositionLocalMap, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
            if (m5333constructorimpl.getInserting() || !Intrinsics.areEqual(m5333constructorimpl.rememberedValue(), Integer.valueOf(hashCode))) {
                m5333constructorimpl.updateRememberedValue(Integer.valueOf(hashCode));
                m5333constructorimpl.apply(Integer.valueOf(hashCode), setCompositeKeyHash);
            }
            Updater.m5340setimpl(m5333constructorimpl, materializeModifier, ComposeUiNode.INSTANCE.getSetModifier());
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 1833054614, "C72@3469L9:Box.kt#2w3rfo");
            BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
            SurveyCtaButtonComponent(null, "Submit", CollectionsKt.listOf(new SurveyState.Content.SecondaryCta("Open website", "https://www.google.com", true)), null, null, SurveyViewModelKt.toSurveyUiColors(new SurveyCustomization(null, null, 3, null)), startRestartGroup, 48, 25);
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
            endRestartGroup.updateScope(new Function2() { // from class: io.intercom.android.sdk.survey.ui.components.SurveyCtaButtonComponentKt$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    Unit SecondaryCtaPreview$lambda$12;
                    SecondaryCtaPreview$lambda$12 = SurveyCtaButtonComponentKt.SecondaryCtaPreview$lambda$12(i, (Composer) obj, ((Integer) obj2).intValue());
                    return SecondaryCtaPreview$lambda$12;
                }
            });
        }
    }
}
