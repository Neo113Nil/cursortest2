package io.intercom.android.sdk.survey.ui.components;

import android.content.Context;
import androidx.compose.animation.core.AnimateAsStateKt;
import androidx.compose.animation.core.AnimationSpecKt;
import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.material3.IconKt;
import androidx.compose.material3.ProgressIndicatorKt;
import androidx.compose.material3.TextKt;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.ProvidableCompositionLocal;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.State;
import androidx.compose.runtime.Updater;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.graphics.StrokeCap;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.res.PainterResources_androidKt;
import androidx.compose.ui.res.StringResources_androidKt;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.style.TextOverflow;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.TextUnitKt;
import io.intercom.android.sdk.R;
import io.intercom.android.sdk.models.Avatar;
import io.intercom.android.sdk.survey.ProgressBarState;
import io.intercom.android.sdk.survey.SurveyUiColors;
import io.intercom.android.sdk.survey.SurveyViewModelKt;
import io.intercom.android.sdk.survey.TopBarState;
import io.intercom.android.sdk.survey.model.SurveyCustomization;
import io.intercom.android.sdk.utilities.ColorExtensionsKt;
import io.intercom.android.sdk.utilities.Phrase;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: SurveyTopBarComponent.kt */
@Metadata(d1 = {"\u0000\u001c\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a-\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00010\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007H\u0001¢\u0006\u0002\u0010\b\u001a\r\u0010\t\u001a\u00020\u0001H\u0001¢\u0006\u0002\u0010\n\u001a\r\u0010\u000b\u001a\u00020\u0001H\u0001¢\u0006\u0002\u0010\n¨\u0006\f"}, d2 = {"SurveyTopBar", "", "topBarState", "Lio/intercom/android/sdk/survey/TopBarState;", "onClose", "Lkotlin/Function0;", "modifier", "Landroidx/compose/ui/Modifier;", "(Lio/intercom/android/sdk/survey/TopBarState;Lkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "SurveyAvatarBar", "(Landroidx/compose/runtime/Composer;I)V", "NoTopBar", "intercom-sdk-base_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class SurveyTopBarComponentKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit NoTopBar$lambda$12(int i, Composer composer, int i2) {
        NoTopBar(composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit SurveyAvatarBar$lambda$10(int i, Composer composer, int i2) {
        SurveyAvatarBar(composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit SurveyTopBar$lambda$8(TopBarState topBarState, Function0 onClose, Modifier modifier, int i, int i2, Composer composer, int i3) {
        Intrinsics.checkNotNullParameter(topBarState, "$topBarState");
        Intrinsics.checkNotNullParameter(onClose, "$onClose");
        SurveyTopBar(topBarState, onClose, modifier, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x052b  */
    /* JADX WARN: Removed duplicated region for block: B:21:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00c8  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00d4  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0196  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x01a2  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0200  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x03cd  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x042f  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0404  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x039d  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x01a6  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x00d8  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0080  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void SurveyTopBar(final TopBarState topBarState, final Function0<Unit> onClose, Modifier modifier, Composer composer, final int i, final int i2) {
        int i3;
        Modifier modifier2;
        int hashCode;
        Composer m5333constructorimpl;
        int hashCode2;
        Composer m5333constructorimpl2;
        Modifier modifier3;
        Composer composer2;
        float f;
        int i4;
        int i5;
        int i6;
        int i7;
        ProgressBarState progressBarState;
        final Modifier modifier4;
        long Color;
        long Color2;
        ScopeUpdateScope endRestartGroup;
        Intrinsics.checkNotNullParameter(topBarState, "topBarState");
        Intrinsics.checkNotNullParameter(onClose, "onClose");
        Composer startRestartGroup = composer.startRestartGroup(-295801747);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 14) == 0) {
            i3 = (startRestartGroup.changed(topBarState) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 112) == 0) {
            i3 |= startRestartGroup.changedInstance(onClose) ? 32 : 16;
        }
        int i8 = i2 & 4;
        if (i8 != 0) {
            i3 |= 384;
        } else if ((i & 896) == 0) {
            modifier2 = modifier;
            i3 |= startRestartGroup.changed(modifier2) ? 256 : 128;
            if ((i3 & 731) == 146 || !startRestartGroup.getSkipping()) {
                Modifier.Companion companion = i8 == 0 ? Modifier.INSTANCE : modifier2;
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
                float f2 = 16;
                SpacerKt.Spacer(SizeKt.m1195height3ABfNKs(Modifier.INSTANCE, Dp.m8798constructorimpl(f2)), startRestartGroup, 6);
                Alignment.Vertical centerVertically = Alignment.INSTANCE.getCenterVertically();
                Modifier fillMaxWidth$default = SizeKt.fillMaxWidth$default(PaddingKt.m1159paddingVpY3zN4$default(Modifier.INSTANCE, Dp.m8798constructorimpl(f2), 0.0f, 2, null), 0.0f, 1, null);
                Arrangement.HorizontalOrVertical spaceBetween = Arrangement.INSTANCE.getSpaceBetween();
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, 844473419, "CC(Row)N(modifier,horizontalArrangement,verticalAlignment,content)99@5125L58,100@5188L131:Row.kt#2w3rfo");
                MeasurePolicy rowMeasurePolicy = RowKt.rowMeasurePolicy(spaceBetween, centerVertically, startRestartGroup, 54);
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1159599143, "CC(Layout)P(!1,2)80@3267L27,83@3433L360:Layout.kt#80mrfh");
                hashCode2 = Long.hashCode(ComposablesKt.getCurrentCompositeKeyHashCode(startRestartGroup, 0));
                CompositionLocalMap currentCompositionLocalMap2 = startRestartGroup.getCurrentCompositionLocalMap();
                Modifier materializeModifier2 = ComposedModifierKt.materializeModifier(startRestartGroup, fillMaxWidth$default);
                Function0<ComposeUiNode> constructor2 = ComposeUiNode.INSTANCE.getConstructor();
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, -553112988, "CC(ReusableComposeNode)N(factory,update,content)399@15590L9:Composables.kt#9igjgp");
                if (!(startRestartGroup.getApplier() instanceof Applier)) {
                    ComposablesKt.invalidApplier();
                }
                startRestartGroup.startReusableNode();
                if (!startRestartGroup.getInserting()) {
                    startRestartGroup.createNode(constructor2);
                } else {
                    startRestartGroup.useNode();
                }
                m5333constructorimpl2 = Updater.m5333constructorimpl(startRestartGroup);
                Updater.m5340setimpl(m5333constructorimpl2, rowMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                Updater.m5340setimpl(m5333constructorimpl2, currentCompositionLocalMap2, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                if (!m5333constructorimpl2.getInserting() || !Intrinsics.areEqual(m5333constructorimpl2.rememberedValue(), Integer.valueOf(hashCode2))) {
                    m5333constructorimpl2.updateRememberedValue(Integer.valueOf(hashCode2));
                    m5333constructorimpl2.apply(Integer.valueOf(hashCode2), setCompositeKeyHash2);
                }
                Updater.m5340setimpl(m5333constructorimpl2, materializeModifier2, ComposeUiNode.INSTANCE.getSetModifier());
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, 1456264949, "C101@5233L9:Row.kt#2w3rfo");
                RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
                if (!(topBarState instanceof TopBarState.SenderTopBarState)) {
                    startRestartGroup.startReplaceGroup(359789399);
                    ProvidableCompositionLocal<Context> localContext = AndroidCompositionLocals_androidKt.getLocalContext();
                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC(<get-current>):CompositionLocal.kt#9igjgp");
                    Object consume = startRestartGroup.consume(localContext);
                    ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                    TopBarState.SenderTopBarState senderTopBarState = (TopBarState.SenderTopBarState) topBarState;
                    CharSequence format = Phrase.from((Context) consume, R.string.intercom_teammate_from_company).put("name", senderTopBarState.getSenderName()).put("company", senderTopBarState.getAppConfig().getName()).format();
                    Alignment.Vertical centerVertically2 = Alignment.INSTANCE.getCenterVertically();
                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, 844473419, "CC(Row)N(modifier,horizontalArrangement,verticalAlignment,content)99@5125L58,100@5188L131:Row.kt#2w3rfo");
                    Modifier.Companion companion2 = Modifier.INSTANCE;
                    MeasurePolicy rowMeasurePolicy2 = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), centerVertically2, startRestartGroup, 48);
                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1159599143, "CC(Layout)P(!1,2)80@3267L27,83@3433L360:Layout.kt#80mrfh");
                    int hashCode3 = Long.hashCode(ComposablesKt.getCurrentCompositeKeyHashCode(startRestartGroup, 0));
                    CompositionLocalMap currentCompositionLocalMap3 = startRestartGroup.getCurrentCompositionLocalMap();
                    Modifier materializeModifier3 = ComposedModifierKt.materializeModifier(startRestartGroup, companion2);
                    Function0<ComposeUiNode> constructor3 = ComposeUiNode.INSTANCE.getConstructor();
                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, -553112988, "CC(ReusableComposeNode)N(factory,update,content)399@15590L9:Composables.kt#9igjgp");
                    if (!(startRestartGroup.getApplier() instanceof Applier)) {
                        ComposablesKt.invalidApplier();
                    }
                    startRestartGroup.startReusableNode();
                    if (startRestartGroup.getInserting()) {
                        startRestartGroup.createNode(constructor3);
                    } else {
                        startRestartGroup.useNode();
                    }
                    Composer m5333constructorimpl3 = Updater.m5333constructorimpl(startRestartGroup);
                    Updater.m5340setimpl(m5333constructorimpl3, rowMeasurePolicy2, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                    Updater.m5340setimpl(m5333constructorimpl3, currentCompositionLocalMap3, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                    Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash3 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                    if (m5333constructorimpl3.getInserting() || !Intrinsics.areEqual(m5333constructorimpl3.rememberedValue(), Integer.valueOf(hashCode3))) {
                        m5333constructorimpl3.updateRememberedValue(Integer.valueOf(hashCode3));
                        m5333constructorimpl3.apply(Integer.valueOf(hashCode3), setCompositeKeyHash3);
                    }
                    Updater.m5340setimpl(m5333constructorimpl3, materializeModifier3, ComposeUiNode.INSTANCE.getSetModifier());
                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, 1456264949, "C101@5233L9:Row.kt#2w3rfo");
                    RowScopeInstance rowScopeInstance2 = RowScopeInstance.INSTANCE;
                    CircularAvatarComponentKt.m12690CircularAvataraMcp0Q(senderTopBarState.getAvatar(), ColorKt.Color(senderTopBarState.getAppConfig().getSecondaryColor()), 0.0f, startRestartGroup, 8, 4);
                    SpacerKt.Spacer(SizeKt.m1214width3ABfNKs(Modifier.INSTANCE, Dp.m8798constructorimpl(8)), startRestartGroup, 6);
                    f = f2;
                    modifier3 = companion;
                    i4 = 1;
                    TextKt.m3901TextNvy7gAk(format.toString(), null, senderTopBarState.getSurveyUiColors().m12631getOnBackground0d7_KjU(), null, TextUnitKt.getSp(14), null, FontWeight.INSTANCE.getNormal(), null, 0L, null, null, 0L, TextOverflow.INSTANCE.m8706getEllipsisgIe3tQ8(), false, 1, 0, null, null, startRestartGroup, 1597440, 24960, 241578);
                    composer2 = startRestartGroup;
                    ComposerKt.sourceInformationMarkerEnd(composer2);
                    composer2.endNode();
                    ComposerKt.sourceInformationMarkerEnd(composer2);
                    ComposerKt.sourceInformationMarkerEnd(composer2);
                    ComposerKt.sourceInformationMarkerEnd(composer2);
                    composer2.endReplaceGroup();
                    i5 = 6;
                } else {
                    modifier3 = companion;
                    composer2 = startRestartGroup;
                    f = f2;
                    i4 = 1;
                    if (!(topBarState instanceof TopBarState.NoTopBarState)) {
                        composer2.startReplaceGroup(1535625002);
                        composer2.endReplaceGroup();
                        throw new NoWhenBranchMatchedException();
                    }
                    composer2.startReplaceGroup(360834719);
                    i5 = 6;
                    SpacerKt.Spacer(SizeKt.m1214width3ABfNKs(Modifier.INSTANCE, Dp.m8798constructorimpl(1)), composer2, 6);
                    composer2.endReplaceGroup();
                }
                composer2.startReplaceGroup(1535664197);
                if (topBarState.getShowDismissButton()) {
                    i6 = i4;
                    startRestartGroup = composer2;
                    i7 = 0;
                } else {
                    i7 = 0;
                    i6 = i4;
                    startRestartGroup = composer2;
                    IconKt.m3194Iconww6aTOc(PainterResources_androidKt.painterResource(io.intercom.android.sdk.ui.R.drawable.intercom_ic_close, composer2, 0), StringResources_androidKt.stringResource(R.string.intercom_dismiss, composer2, 0), ClickableKt.m623clickableoSLSa3U$default(Modifier.INSTANCE, false, null, null, null, onClose, 15, null), topBarState.getSurveyUiColors().m12631getOnBackground0d7_KjU(), startRestartGroup, 8, 0);
                }
                startRestartGroup.endReplaceGroup();
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                startRestartGroup.endNode();
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                startRestartGroup.startReplaceGroup(-1116807584);
                progressBarState = topBarState.getProgressBarState();
                startRestartGroup.startReplaceGroup(-1116806075);
                if (progressBarState.isVisible()) {
                    SpacerKt.Spacer(SizeKt.m1195height3ABfNKs(Modifier.INSTANCE, Dp.m8798constructorimpl(f)), startRestartGroup, i5);
                    final State<Float> animateFloatAsState = AnimateAsStateKt.animateFloatAsState(progressBarState.getProgress(), AnimationSpecKt.tween$default(200, i7, null, i5, null), 0.0f, null, null, startRestartGroup, 48, 28);
                    if (ColorExtensionsKt.m13186isDarkColor8_81llA(topBarState.getSurveyUiColors().m12627getBackground0d7_KjU())) {
                        Color = ColorKt.Color(1728053247);
                    } else {
                        Color = ColorKt.Color(1291845632);
                    }
                    SurveyUiColors surveyUiColors = topBarState.getSurveyUiColors();
                    if (Color.m6040equalsimpl0(surveyUiColors.m12627getBackground0d7_KjU(), surveyUiColors.m12628getButton0d7_KjU()) && ColorExtensionsKt.m13188isWhite8_81llA(surveyUiColors.m12627getBackground0d7_KjU())) {
                        Color2 = ColorKt.Color(3439329279L);
                    } else {
                        Color2 = (Color.m6040equalsimpl0(surveyUiColors.m12627getBackground0d7_KjU(), surveyUiColors.m12628getButton0d7_KjU()) && ColorExtensionsKt.m13184isBlack8_81llA(surveyUiColors.m12627getBackground0d7_KjU())) ? ColorKt.Color(2147483648L) : surveyUiColors.m12628getButton0d7_KjU();
                    }
                    Modifier fillMaxWidth$default2 = SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, i6, null);
                    float m8798constructorimpl = Dp.m8798constructorimpl(i7);
                    int m6411getSquareKaPHkGw = StrokeCap.INSTANCE.m6411getSquareKaPHkGw();
                    startRestartGroup.startReplaceGroup(1535712593);
                    boolean changed = startRestartGroup.changed(animateFloatAsState);
                    Object rememberedValue = startRestartGroup.rememberedValue();
                    if (changed || rememberedValue == Composer.INSTANCE.getEmpty()) {
                        rememberedValue = new Function0() { // from class: io.intercom.android.sdk.survey.ui.components.SurveyTopBarComponentKt$$ExternalSyntheticLambda2
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                float SurveyTopBar$lambda$7$lambda$6$lambda$4$lambda$3;
                                SurveyTopBar$lambda$7$lambda$6$lambda$4$lambda$3 = SurveyTopBarComponentKt.SurveyTopBar$lambda$7$lambda$6$lambda$4$lambda$3(State.this);
                                return Float.valueOf(SurveyTopBar$lambda$7$lambda$6$lambda$4$lambda$3);
                            }
                        };
                        startRestartGroup.updateRememberedValue(rememberedValue);
                    }
                    startRestartGroup.endReplaceGroup();
                    Composer composer3 = startRestartGroup;
                    ProgressIndicatorKt.m3484LinearProgressIndicatorGJbTh5U((Function0) rememberedValue, fillMaxWidth$default2, Color2, Color, m6411getSquareKaPHkGw, m8798constructorimpl, new Function1() { // from class: io.intercom.android.sdk.survey.ui.components.SurveyTopBarComponentKt$$ExternalSyntheticLambda3
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            Unit SurveyTopBar$lambda$7$lambda$6$lambda$5;
                            SurveyTopBar$lambda$7$lambda$6$lambda$5 = SurveyTopBarComponentKt.SurveyTopBar$lambda$7$lambda$6$lambda$5((DrawScope) obj);
                            return SurveyTopBar$lambda$7$lambda$6$lambda$5;
                        }
                    }, composer3, 1769520, 0);
                    startRestartGroup = composer3;
                }
                startRestartGroup.endReplaceGroup();
                Unit unit = Unit.INSTANCE;
                startRestartGroup.endReplaceGroup();
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                startRestartGroup.endNode();
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                modifier4 = modifier3;
            } else {
                startRestartGroup.skipToGroupEnd();
                modifier4 = modifier2;
            }
            endRestartGroup = startRestartGroup.endRestartGroup();
            if (endRestartGroup == null) {
                endRestartGroup.updateScope(new Function2() { // from class: io.intercom.android.sdk.survey.ui.components.SurveyTopBarComponentKt$$ExternalSyntheticLambda4
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        Unit SurveyTopBar$lambda$8;
                        SurveyTopBar$lambda$8 = SurveyTopBarComponentKt.SurveyTopBar$lambda$8(TopBarState.this, onClose, modifier4, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                        return SurveyTopBar$lambda$8;
                    }
                });
                return;
            }
            return;
        }
        modifier2 = modifier;
        if ((i3 & 731) == 146) {
        }
        if (i8 == 0) {
        }
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, 1341605231, "CC(Column)N(modifier,verticalArrangement,horizontalAlignment,content)87@4443L61,88@4509L134:Column.kt#2w3rfo");
        MeasurePolicy columnMeasurePolicy2 = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), startRestartGroup, 0);
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1159599143, "CC(Layout)P(!1,2)80@3267L27,83@3433L360:Layout.kt#80mrfh");
        hashCode = Long.hashCode(ComposablesKt.getCurrentCompositeKeyHashCode(startRestartGroup, 0));
        CompositionLocalMap currentCompositionLocalMap4 = startRestartGroup.getCurrentCompositionLocalMap();
        Modifier materializeModifier4 = ComposedModifierKt.materializeModifier(startRestartGroup, companion);
        Function0<ComposeUiNode> constructor4 = ComposeUiNode.INSTANCE.getConstructor();
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -553112988, "CC(ReusableComposeNode)N(factory,update,content)399@15590L9:Composables.kt#9igjgp");
        if (!(startRestartGroup.getApplier() instanceof Applier)) {
        }
        startRestartGroup.startReusableNode();
        if (!startRestartGroup.getInserting()) {
        }
        m5333constructorimpl = Updater.m5333constructorimpl(startRestartGroup);
        Updater.m5340setimpl(m5333constructorimpl, columnMeasurePolicy2, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
        Updater.m5340setimpl(m5333constructorimpl, currentCompositionLocalMap4, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash4 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
        if (!m5333constructorimpl.getInserting()) {
        }
        m5333constructorimpl.updateRememberedValue(Integer.valueOf(hashCode));
        m5333constructorimpl.apply(Integer.valueOf(hashCode), setCompositeKeyHash4);
        Updater.m5340setimpl(m5333constructorimpl, materializeModifier4, ComposeUiNode.INSTANCE.getSetModifier());
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2093002350, "C89@4557L9:Column.kt#2w3rfo");
        ColumnScopeInstance columnScopeInstance2 = ColumnScopeInstance.INSTANCE;
        float f22 = 16;
        SpacerKt.Spacer(SizeKt.m1195height3ABfNKs(Modifier.INSTANCE, Dp.m8798constructorimpl(f22)), startRestartGroup, 6);
        Alignment.Vertical centerVertically3 = Alignment.INSTANCE.getCenterVertically();
        Modifier fillMaxWidth$default3 = SizeKt.fillMaxWidth$default(PaddingKt.m1159paddingVpY3zN4$default(Modifier.INSTANCE, Dp.m8798constructorimpl(f22), 0.0f, 2, null), 0.0f, 1, null);
        Arrangement.HorizontalOrVertical spaceBetween2 = Arrangement.INSTANCE.getSpaceBetween();
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, 844473419, "CC(Row)N(modifier,horizontalArrangement,verticalAlignment,content)99@5125L58,100@5188L131:Row.kt#2w3rfo");
        MeasurePolicy rowMeasurePolicy3 = RowKt.rowMeasurePolicy(spaceBetween2, centerVertically3, startRestartGroup, 54);
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1159599143, "CC(Layout)P(!1,2)80@3267L27,83@3433L360:Layout.kt#80mrfh");
        hashCode2 = Long.hashCode(ComposablesKt.getCurrentCompositeKeyHashCode(startRestartGroup, 0));
        CompositionLocalMap currentCompositionLocalMap22 = startRestartGroup.getCurrentCompositionLocalMap();
        Modifier materializeModifier22 = ComposedModifierKt.materializeModifier(startRestartGroup, fillMaxWidth$default3);
        Function0<ComposeUiNode> constructor22 = ComposeUiNode.INSTANCE.getConstructor();
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -553112988, "CC(ReusableComposeNode)N(factory,update,content)399@15590L9:Composables.kt#9igjgp");
        if (!(startRestartGroup.getApplier() instanceof Applier)) {
        }
        startRestartGroup.startReusableNode();
        if (!startRestartGroup.getInserting()) {
        }
        m5333constructorimpl2 = Updater.m5333constructorimpl(startRestartGroup);
        Updater.m5340setimpl(m5333constructorimpl2, rowMeasurePolicy3, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
        Updater.m5340setimpl(m5333constructorimpl2, currentCompositionLocalMap22, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash22 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
        if (!m5333constructorimpl2.getInserting()) {
        }
        m5333constructorimpl2.updateRememberedValue(Integer.valueOf(hashCode2));
        m5333constructorimpl2.apply(Integer.valueOf(hashCode2), setCompositeKeyHash22);
        Updater.m5340setimpl(m5333constructorimpl2, materializeModifier22, ComposeUiNode.INSTANCE.getSetModifier());
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, 1456264949, "C101@5233L9:Row.kt#2w3rfo");
        RowScopeInstance rowScopeInstance3 = RowScopeInstance.INSTANCE;
        if (!(topBarState instanceof TopBarState.SenderTopBarState)) {
        }
        composer2.startReplaceGroup(1535664197);
        if (topBarState.getShowDismissButton()) {
        }
        startRestartGroup.endReplaceGroup();
        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        startRestartGroup.endNode();
        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        startRestartGroup.startReplaceGroup(-1116807584);
        progressBarState = topBarState.getProgressBarState();
        startRestartGroup.startReplaceGroup(-1116806075);
        if (progressBarState.isVisible()) {
        }
        startRestartGroup.endReplaceGroup();
        Unit unit2 = Unit.INSTANCE;
        startRestartGroup.endReplaceGroup();
        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        startRestartGroup.endNode();
        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        modifier4 = modifier3;
        endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float SurveyTopBar$lambda$7$lambda$6$lambda$4$lambda$3(State animateFloatAsState) {
        Intrinsics.checkNotNullParameter(animateFloatAsState, "$animateFloatAsState");
        return ((Number) animateFloatAsState.getValue()).floatValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit SurveyTopBar$lambda$7$lambda$6$lambda$5(DrawScope LinearProgressIndicator) {
        Intrinsics.checkNotNullParameter(LinearProgressIndicator, "$this$LinearProgressIndicator");
        return Unit.INSTANCE;
    }

    public static final void SurveyAvatarBar(Composer composer, final int i) {
        Composer startRestartGroup = composer.startRestartGroup(1511683997);
        if (i != 0 || !startRestartGroup.getSkipping()) {
            Avatar build = new Avatar.Builder().withInitials("VR").build();
            Intrinsics.checkNotNullExpressionValue(build, "build(...)");
            SurveyTopBar(new TopBarState.SenderTopBarState(build, "Vinesh", SurveyComponentKt.getEmptyAppConfig(), false, SurveyViewModelKt.toSurveyUiColors(new SurveyCustomization(null, null, 3, null)), null, 32, null), new Function0() { // from class: io.intercom.android.sdk.survey.ui.components.SurveyTopBarComponentKt$$ExternalSyntheticLambda5
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    Unit unit;
                    unit = Unit.INSTANCE;
                    return unit;
                }
            }, null, startRestartGroup, 56, 4);
        } else {
            startRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new Function2() { // from class: io.intercom.android.sdk.survey.ui.components.SurveyTopBarComponentKt$$ExternalSyntheticLambda6
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    Unit SurveyAvatarBar$lambda$10;
                    SurveyAvatarBar$lambda$10 = SurveyTopBarComponentKt.SurveyAvatarBar$lambda$10(i, (Composer) obj, ((Integer) obj2).intValue());
                    return SurveyAvatarBar$lambda$10;
                }
            });
        }
    }

    public static final void NoTopBar(Composer composer, final int i) {
        Composer startRestartGroup = composer.startRestartGroup(1502798722);
        if (i != 0 || !startRestartGroup.getSkipping()) {
            SurveyTopBar(new TopBarState.NoTopBarState(true, SurveyViewModelKt.toSurveyUiColors(new SurveyCustomization(null, null, 3, null)), new ProgressBarState(false, 0.0f, 3, null)), new Function0() { // from class: io.intercom.android.sdk.survey.ui.components.SurveyTopBarComponentKt$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    Unit unit;
                    unit = Unit.INSTANCE;
                    return unit;
                }
            }, null, startRestartGroup, 48, 4);
        } else {
            startRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new Function2() { // from class: io.intercom.android.sdk.survey.ui.components.SurveyTopBarComponentKt$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    Unit NoTopBar$lambda$12;
                    NoTopBar$lambda$12 = SurveyTopBarComponentKt.NoTopBar$lambda$12(i, (Composer) obj, ((Integer) obj2).intValue());
                    return NoTopBar$lambda$12;
                }
            });
        }
    }
}
