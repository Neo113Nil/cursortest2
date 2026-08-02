package io.intercom.android.sdk.survey.ui.questiontype.choice;

import androidx.compose.animation.AnimatedVisibilityKt;
import androidx.compose.animation.AnimatedVisibilityScope;
import androidx.compose.animation.EnterTransition;
import androidx.compose.animation.ExitTransition;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.material3.SurfaceKt;
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
import androidx.compose.ui.res.StringResources_androidKt;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.input.ImeAction;
import androidx.compose.ui.unit.Dp;
import androidx.media3.common.C;
import androidx.profileinstaller.ProfileVerifier;
import io.intercom.android.sdk.R;
import io.intercom.android.sdk.survey.SurveyUiColors;
import io.intercom.android.sdk.survey.ui.questiontype.text.TextInputPillKt;
import io.intercom.android.sdk.ui.theme.IntercomTheme;
import io.intercom.android.sdk.utilities.ColorExtensionsKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import org.objectweb.asm.Opcodes;

/* compiled from: OtherOption.kt */
@Metadata(d1 = {"\u0000<\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u001a{\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00010\t2\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00010\u000b2\b\b\u0002\u0010\f\u001a\u00020\r2\b\b\u0002\u0010\u000e\u001a\u00020\u000f2\b\b\u0002\u0010\u0010\u001a\u00020\r2\b\b\u0002\u0010\u0011\u001a\u00020\u00122\b\b\u0002\u0010\u0013\u001a\u00020\rH\u0001¢\u0006\u0004\b\u0014\u0010\u0015\u001a\r\u0010\u0016\u001a\u00020\u0001H\u0001¢\u0006\u0002\u0010\u0017¨\u0006\u0018"}, d2 = {"OtherOption", "", "selected", "", "surveyUiColors", "Lio/intercom/android/sdk/survey/SurveyUiColors;", "text", "", "onClicked", "Lkotlin/Function0;", "onTextChanged", "Lkotlin/Function1;", "strokeColor", "Landroidx/compose/ui/graphics/Color;", "strokeWidth", "Landroidx/compose/ui/unit/Dp;", "backgroundColor", "fontWeight", "Landroidx/compose/ui/text/font/FontWeight;", "fontColor", "OtherOption-YCJL08c", "(ZLio/intercom/android/sdk/survey/SurveyUiColors;Ljava/lang/String;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;JFJLandroidx/compose/ui/text/font/FontWeight;JLandroidx/compose/runtime/Composer;II)V", "OtherOptionPreview", "(Landroidx/compose/runtime/Composer;I)V", "intercom-sdk-base_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class OtherOptionKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit OtherOptionPreview$lambda$4(int i, Composer composer, int i2) {
        OtherOptionPreview(composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit OtherOption_YCJL08c$lambda$3(boolean z, SurveyUiColors surveyUiColors, String text, Function0 onClicked, Function1 onTextChanged, long j, float f, long j2, FontWeight fontWeight, long j3, int i, int i2, Composer composer, int i3) {
        Intrinsics.checkNotNullParameter(surveyUiColors, "$surveyUiColors");
        Intrinsics.checkNotNullParameter(text, "$text");
        Intrinsics.checkNotNullParameter(onClicked, "$onClicked");
        Intrinsics.checkNotNullParameter(onTextChanged, "$onTextChanged");
        m12736OtherOptionYCJL08c(z, surveyUiColors, text, onClicked, onTextChanged, j, f, j2, fontWeight, j3, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:103:0x00fa  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x00d6  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00f3  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0111  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0138  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0163  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0359  */
    /* JADX WARN: Removed duplicated region for block: B:48:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0182  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0235  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0241  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x026a  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x02ae  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x02b7  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x02b0  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0245  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x019f  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x01a7  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x01b1  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x01b9  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x01c6  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x01d9  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x01c0  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x01ad  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0152  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0116  */
    /* renamed from: OtherOption-YCJL08c, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m12736OtherOptionYCJL08c(final boolean z, final SurveyUiColors surveyUiColors, final String text, final Function0<Unit> onClicked, final Function1<? super String, Unit> onTextChanged, long j, float f, long j2, FontWeight fontWeight, long j3, Composer composer, final int i, final int i2) {
        int i3;
        long j4;
        int i4;
        int i5;
        int i6;
        long j5;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        float f2;
        int i12;
        long j6;
        long j7;
        FontWeight fontWeight2;
        int hashCode;
        Composer m5333constructorimpl;
        boolean z2;
        Object rememberedValue;
        final float f3;
        final long j8;
        final FontWeight fontWeight3;
        final long j9;
        final long j10;
        ScopeUpdateScope endRestartGroup;
        int i13;
        Intrinsics.checkNotNullParameter(surveyUiColors, "surveyUiColors");
        Intrinsics.checkNotNullParameter(text, "text");
        Intrinsics.checkNotNullParameter(onClicked, "onClicked");
        Intrinsics.checkNotNullParameter(onTextChanged, "onTextChanged");
        Composer startRestartGroup = composer.startRestartGroup(-933969743);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 14) == 0) {
            i3 = (startRestartGroup.changed(z) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 112) == 0) {
            i3 |= startRestartGroup.changed(surveyUiColors) ? 32 : 16;
        }
        if ((i2 & 4) != 0) {
            i3 |= 384;
        } else if ((i & 896) == 0) {
            i3 |= startRestartGroup.changed(text) ? 256 : 128;
        }
        if ((i2 & 8) != 0) {
            i3 |= 3072;
        } else if ((i & 7168) == 0) {
            i3 |= startRestartGroup.changedInstance(onClicked) ? 2048 : 1024;
        }
        if ((i2 & 16) != 0) {
            i3 |= 24576;
        } else if ((i & 57344) == 0) {
            i3 |= startRestartGroup.changedInstance(onTextChanged) ? 16384 : 8192;
        }
        int i14 = i2 & 32;
        if (i14 != 0) {
            i3 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
        } else if ((i & Opcodes.ASM7) == 0) {
            j4 = j;
            i3 |= startRestartGroup.changed(j4) ? 131072 : 65536;
            i4 = i2 & 64;
            if (i4 == 0) {
                i3 |= 1572864;
                i5 = 57344;
            } else {
                i5 = 57344;
                if ((i & 3670016) == 0) {
                    i3 |= startRestartGroup.changed(f) ? 1048576 : 524288;
                }
            }
            i6 = i2 & 128;
            if (i6 == 0) {
                i3 |= 12582912;
                j5 = j2;
            } else {
                j5 = j2;
                if ((i & 29360128) == 0) {
                    i3 |= startRestartGroup.changed(j5) ? 8388608 : 4194304;
                }
            }
            i7 = i2 & 256;
            if (i7 == 0) {
                i3 |= 100663296;
            } else if ((i & 234881024) == 0) {
                i8 = i7;
                i3 |= startRestartGroup.changed(fontWeight) ? 67108864 : 33554432;
                if ((i & 1879048192) == 0) {
                    int i15 = i3;
                    if ((i2 & 512) == 0) {
                        i10 = i14;
                        if (startRestartGroup.changed(j3)) {
                            i13 = C.BUFFER_FLAG_LAST_SAMPLE;
                            i9 = i15 | i13;
                        }
                    } else {
                        i10 = i14;
                    }
                    i13 = 268435456;
                    i9 = i15 | i13;
                } else {
                    i9 = i3;
                    i10 = i14;
                }
                i11 = i10;
                if ((i9 & 1533916891) == 306783378 || !startRestartGroup.getSkipping()) {
                    startRestartGroup.startDefaults();
                    if ((i & 1) == 0 && !startRestartGroup.getDefaultsInvalid()) {
                        startRestartGroup.skipToGroupEnd();
                        if ((i2 & 512) != 0) {
                            i9 &= -1879048193;
                        }
                        fontWeight2 = fontWeight;
                        j6 = j3;
                        j7 = j5;
                        i12 = i9;
                        f2 = f;
                    } else {
                        if (i11 != 0) {
                            j4 = Color.INSTANCE.m6065getBlack0d7_KjU();
                        }
                        float m8798constructorimpl = i4 != 0 ? Dp.m8798constructorimpl(1) : f;
                        if (i6 != 0) {
                            j5 = Color.INSTANCE.m6076getWhite0d7_KjU();
                        }
                        FontWeight normal = i8 != 0 ? FontWeight.INSTANCE.getNormal() : fontWeight;
                        if ((i2 & 512) != 0) {
                            int i16 = i9 & (-1879048193);
                            f2 = m8798constructorimpl;
                            i12 = i16;
                            fontWeight2 = normal;
                            j6 = ColorExtensionsKt.m13180generateTextColor8_81llA(j5);
                            j7 = j5;
                        } else {
                            int i17 = i9;
                            f2 = m8798constructorimpl;
                            i12 = i17;
                            j6 = j3;
                            j7 = j5;
                            fontWeight2 = normal;
                        }
                    }
                    startRestartGroup.endDefaults();
                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, 1341605231, "CC(Column)N(modifier,verticalArrangement,horizontalAlignment,content)87@4443L61,88@4509L134:Column.kt#2w3rfo");
                    Modifier.Companion companion = Modifier.INSTANCE;
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
                    String stringResource = StringResources_androidKt.stringResource(R.string.intercom_surveys_multiselect_other_option_value, startRestartGroup, 0);
                    startRestartGroup.startReplaceGroup(-1990898758);
                    z2 = (i12 & 7168) == 2048;
                    rememberedValue = startRestartGroup.rememberedValue();
                    if (!z2 || rememberedValue == Composer.INSTANCE.getEmpty()) {
                        rememberedValue = new Function1() { // from class: io.intercom.android.sdk.survey.ui.questiontype.choice.OtherOptionKt$$ExternalSyntheticLambda1
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                Unit OtherOption_YCJL08c$lambda$2$lambda$1$lambda$0;
                                OtherOption_YCJL08c$lambda$2$lambda$1$lambda$0 = OtherOptionKt.OtherOption_YCJL08c$lambda$2$lambda$1$lambda$0(Function0.this, (String) obj);
                                return OtherOption_YCJL08c$lambda$2$lambda$1$lambda$0;
                            }
                        };
                        startRestartGroup.updateRememberedValue(rememberedValue);
                    }
                    startRestartGroup.endReplaceGroup();
                    int i18 = i12 >> 6;
                    ChoicePillKt.m12723ChoicePillUdaoDFU(z, (Function1) rememberedValue, stringResource, j4, f2, j7, fontWeight2, j6, startRestartGroup, (i12 & 14) | (i18 & 7168) | (i18 & i5) | (i18 & Opcodes.ASM7) | (i18 & 3670016) | (i18 & 29360128), 0);
                    SpacerKt.Spacer(SizeKt.m1195height3ABfNKs(Modifier.INSTANCE, Dp.m8798constructorimpl(8)), startRestartGroup, 6);
                    AnimatedVisibilityKt.AnimatedVisibility(columnScopeInstance, z, (Modifier) null, (EnterTransition) null, (ExitTransition) null, (String) null, ComposableLambdaKt.rememberComposableLambda(-252181085, true, new Function3<AnimatedVisibilityScope, Composer, Integer, Unit>() { // from class: io.intercom.android.sdk.survey.ui.questiontype.choice.OtherOptionKt$OtherOption$1$2
                        @Override // kotlin.jvm.functions.Function3
                        public /* bridge */ /* synthetic */ Unit invoke(AnimatedVisibilityScope animatedVisibilityScope, Composer composer2, Integer num) {
                            invoke(animatedVisibilityScope, composer2, num.intValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(AnimatedVisibilityScope AnimatedVisibility, Composer composer2, int i19) {
                            Intrinsics.checkNotNullParameter(AnimatedVisibility, "$this$AnimatedVisibility");
                            SurveyUiColors surveyUiColors2 = SurveyUiColors.this;
                            String str = text;
                            Function1<String, Unit> function1 = onTextChanged;
                            ComposerKt.sourceInformationMarkerStart(composer2, 1341605231, "CC(Column)N(modifier,verticalArrangement,horizontalAlignment,content)87@4443L61,88@4509L134:Column.kt#2w3rfo");
                            Modifier.Companion companion2 = Modifier.INSTANCE;
                            MeasurePolicy columnMeasurePolicy2 = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composer2, 0);
                            ComposerKt.sourceInformationMarkerStart(composer2, -1159599143, "CC(Layout)P(!1,2)80@3267L27,83@3433L360:Layout.kt#80mrfh");
                            int hashCode2 = Long.hashCode(ComposablesKt.getCurrentCompositeKeyHashCode(composer2, 0));
                            CompositionLocalMap currentCompositionLocalMap2 = composer2.getCurrentCompositionLocalMap();
                            Modifier materializeModifier2 = ComposedModifierKt.materializeModifier(composer2, companion2);
                            Function0<ComposeUiNode> constructor2 = ComposeUiNode.INSTANCE.getConstructor();
                            ComposerKt.sourceInformationMarkerStart(composer2, -553112988, "CC(ReusableComposeNode)N(factory,update,content)399@15590L9:Composables.kt#9igjgp");
                            if (!(composer2.getApplier() instanceof Applier)) {
                                ComposablesKt.invalidApplier();
                            }
                            composer2.startReusableNode();
                            if (composer2.getInserting()) {
                                composer2.createNode(constructor2);
                            } else {
                                composer2.useNode();
                            }
                            Composer m5333constructorimpl2 = Updater.m5333constructorimpl(composer2);
                            Updater.m5340setimpl(m5333constructorimpl2, columnMeasurePolicy2, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                            Updater.m5340setimpl(m5333constructorimpl2, currentCompositionLocalMap2, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                            if (m5333constructorimpl2.getInserting() || !Intrinsics.areEqual(m5333constructorimpl2.rememberedValue(), Integer.valueOf(hashCode2))) {
                                m5333constructorimpl2.updateRememberedValue(Integer.valueOf(hashCode2));
                                m5333constructorimpl2.apply(Integer.valueOf(hashCode2), setCompositeKeyHash2);
                            }
                            Updater.m5340setimpl(m5333constructorimpl2, materializeModifier2, ComposeUiNode.INSTANCE.getSetModifier());
                            ComposerKt.sourceInformationMarkerStart(composer2, 2093002350, "C89@4557L9:Column.kt#2w3rfo");
                            ColumnScopeInstance columnScopeInstance2 = ColumnScopeInstance.INSTANCE;
                            TextKt.m3901TextNvy7gAk(StringResources_androidKt.stringResource(R.string.intercom_surveys_multiselect_other_option_input_label, composer2, 0), null, 0L, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, IntercomTheme.INSTANCE.getTypography(composer2, IntercomTheme.$stable).getType04(), composer2, 0, 0, 131070);
                            SpacerKt.Spacer(SizeKt.m1195height3ABfNKs(Modifier.INSTANCE, Dp.m8798constructorimpl(4)), composer2, 6);
                            TextInputPillKt.m12809TextInputPillg5ZjG94(str, StringResources_androidKt.stringResource(R.string.intercom_surveys_multiselect_other_option_input_placeholder, composer2, 0), function1, null, ColorExtensionsKt.m13183getAccessibleColorOnWhiteBackground8_81llA(surveyUiColors2.m12628getButton0d7_KjU()), 0, false, null, 0, ImeAction.INSTANCE.m8417getNexteUduSuo(), false, null, false, 0.0f, composer2, 805306368, 6, 14824);
                            ComposerKt.sourceInformationMarkerEnd(composer2);
                            composer2.endNode();
                            ComposerKt.sourceInformationMarkerEnd(composer2);
                            ComposerKt.sourceInformationMarkerEnd(composer2);
                            ComposerKt.sourceInformationMarkerEnd(composer2);
                        }
                    }, startRestartGroup, 54), startRestartGroup, 1572870 | ((i12 << 3) & 112), 30);
                    ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                    startRestartGroup.endNode();
                    ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                    ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                    ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                    f3 = f2;
                    j8 = j4;
                    fontWeight3 = fontWeight2;
                    j9 = j7;
                    j10 = j6;
                } else {
                    startRestartGroup.skipToGroupEnd();
                    j9 = j5;
                    j8 = j4;
                    f3 = f;
                    fontWeight3 = fontWeight;
                    j10 = j3;
                }
                endRestartGroup = startRestartGroup.endRestartGroup();
                if (endRestartGroup != null) {
                    endRestartGroup.updateScope(new Function2() { // from class: io.intercom.android.sdk.survey.ui.questiontype.choice.OtherOptionKt$$ExternalSyntheticLambda2
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            Unit OtherOption_YCJL08c$lambda$3;
                            OtherOption_YCJL08c$lambda$3 = OtherOptionKt.OtherOption_YCJL08c$lambda$3(z, surveyUiColors, text, onClicked, onTextChanged, j8, f3, j9, fontWeight3, j10, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                            return OtherOption_YCJL08c$lambda$3;
                        }
                    });
                    return;
                }
                return;
            }
            i8 = i7;
            if ((i & 1879048192) == 0) {
            }
            i11 = i10;
            if ((i9 & 1533916891) == 306783378) {
            }
            startRestartGroup.startDefaults();
            if ((i & 1) == 0) {
            }
            if (i11 != 0) {
            }
            if (i4 != 0) {
            }
            if (i6 != 0) {
            }
            if (i8 != 0) {
            }
            if ((i2 & 512) != 0) {
            }
            startRestartGroup.endDefaults();
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 1341605231, "CC(Column)N(modifier,verticalArrangement,horizontalAlignment,content)87@4443L61,88@4509L134:Column.kt#2w3rfo");
            Modifier.Companion companion2 = Modifier.INSTANCE;
            MeasurePolicy columnMeasurePolicy2 = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), startRestartGroup, 0);
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1159599143, "CC(Layout)P(!1,2)80@3267L27,83@3433L360:Layout.kt#80mrfh");
            hashCode = Long.hashCode(ComposablesKt.getCurrentCompositeKeyHashCode(startRestartGroup, 0));
            CompositionLocalMap currentCompositionLocalMap2 = startRestartGroup.getCurrentCompositionLocalMap();
            Modifier materializeModifier2 = ComposedModifierKt.materializeModifier(startRestartGroup, companion2);
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
            String stringResource2 = StringResources_androidKt.stringResource(R.string.intercom_surveys_multiselect_other_option_value, startRestartGroup, 0);
            startRestartGroup.startReplaceGroup(-1990898758);
            if ((i12 & 7168) == 2048) {
            }
            rememberedValue = startRestartGroup.rememberedValue();
            if (!z2) {
            }
            rememberedValue = new Function1() { // from class: io.intercom.android.sdk.survey.ui.questiontype.choice.OtherOptionKt$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    Unit OtherOption_YCJL08c$lambda$2$lambda$1$lambda$0;
                    OtherOption_YCJL08c$lambda$2$lambda$1$lambda$0 = OtherOptionKt.OtherOption_YCJL08c$lambda$2$lambda$1$lambda$0(Function0.this, (String) obj);
                    return OtherOption_YCJL08c$lambda$2$lambda$1$lambda$0;
                }
            };
            startRestartGroup.updateRememberedValue(rememberedValue);
            startRestartGroup.endReplaceGroup();
            int i182 = i12 >> 6;
            ChoicePillKt.m12723ChoicePillUdaoDFU(z, (Function1) rememberedValue, stringResource2, j4, f2, j7, fontWeight2, j6, startRestartGroup, (i12 & 14) | (i182 & 7168) | (i182 & i5) | (i182 & Opcodes.ASM7) | (i182 & 3670016) | (i182 & 29360128), 0);
            SpacerKt.Spacer(SizeKt.m1195height3ABfNKs(Modifier.INSTANCE, Dp.m8798constructorimpl(8)), startRestartGroup, 6);
            AnimatedVisibilityKt.AnimatedVisibility(columnScopeInstance2, z, (Modifier) null, (EnterTransition) null, (ExitTransition) null, (String) null, ComposableLambdaKt.rememberComposableLambda(-252181085, true, new Function3<AnimatedVisibilityScope, Composer, Integer, Unit>() { // from class: io.intercom.android.sdk.survey.ui.questiontype.choice.OtherOptionKt$OtherOption$1$2
                @Override // kotlin.jvm.functions.Function3
                public /* bridge */ /* synthetic */ Unit invoke(AnimatedVisibilityScope animatedVisibilityScope, Composer composer2, Integer num) {
                    invoke(animatedVisibilityScope, composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(AnimatedVisibilityScope AnimatedVisibility, Composer composer2, int i19) {
                    Intrinsics.checkNotNullParameter(AnimatedVisibility, "$this$AnimatedVisibility");
                    SurveyUiColors surveyUiColors2 = SurveyUiColors.this;
                    String str = text;
                    Function1<String, Unit> function1 = onTextChanged;
                    ComposerKt.sourceInformationMarkerStart(composer2, 1341605231, "CC(Column)N(modifier,verticalArrangement,horizontalAlignment,content)87@4443L61,88@4509L134:Column.kt#2w3rfo");
                    Modifier.Companion companion22 = Modifier.INSTANCE;
                    MeasurePolicy columnMeasurePolicy22 = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composer2, 0);
                    ComposerKt.sourceInformationMarkerStart(composer2, -1159599143, "CC(Layout)P(!1,2)80@3267L27,83@3433L360:Layout.kt#80mrfh");
                    int hashCode2 = Long.hashCode(ComposablesKt.getCurrentCompositeKeyHashCode(composer2, 0));
                    CompositionLocalMap currentCompositionLocalMap22 = composer2.getCurrentCompositionLocalMap();
                    Modifier materializeModifier22 = ComposedModifierKt.materializeModifier(composer2, companion22);
                    Function0<ComposeUiNode> constructor22 = ComposeUiNode.INSTANCE.getConstructor();
                    ComposerKt.sourceInformationMarkerStart(composer2, -553112988, "CC(ReusableComposeNode)N(factory,update,content)399@15590L9:Composables.kt#9igjgp");
                    if (!(composer2.getApplier() instanceof Applier)) {
                        ComposablesKt.invalidApplier();
                    }
                    composer2.startReusableNode();
                    if (composer2.getInserting()) {
                        composer2.createNode(constructor22);
                    } else {
                        composer2.useNode();
                    }
                    Composer m5333constructorimpl2 = Updater.m5333constructorimpl(composer2);
                    Updater.m5340setimpl(m5333constructorimpl2, columnMeasurePolicy22, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                    Updater.m5340setimpl(m5333constructorimpl2, currentCompositionLocalMap22, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                    Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash22 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                    if (m5333constructorimpl2.getInserting() || !Intrinsics.areEqual(m5333constructorimpl2.rememberedValue(), Integer.valueOf(hashCode2))) {
                        m5333constructorimpl2.updateRememberedValue(Integer.valueOf(hashCode2));
                        m5333constructorimpl2.apply(Integer.valueOf(hashCode2), setCompositeKeyHash22);
                    }
                    Updater.m5340setimpl(m5333constructorimpl2, materializeModifier22, ComposeUiNode.INSTANCE.getSetModifier());
                    ComposerKt.sourceInformationMarkerStart(composer2, 2093002350, "C89@4557L9:Column.kt#2w3rfo");
                    ColumnScopeInstance columnScopeInstance22 = ColumnScopeInstance.INSTANCE;
                    TextKt.m3901TextNvy7gAk(StringResources_androidKt.stringResource(R.string.intercom_surveys_multiselect_other_option_input_label, composer2, 0), null, 0L, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, IntercomTheme.INSTANCE.getTypography(composer2, IntercomTheme.$stable).getType04(), composer2, 0, 0, 131070);
                    SpacerKt.Spacer(SizeKt.m1195height3ABfNKs(Modifier.INSTANCE, Dp.m8798constructorimpl(4)), composer2, 6);
                    TextInputPillKt.m12809TextInputPillg5ZjG94(str, StringResources_androidKt.stringResource(R.string.intercom_surveys_multiselect_other_option_input_placeholder, composer2, 0), function1, null, ColorExtensionsKt.m13183getAccessibleColorOnWhiteBackground8_81llA(surveyUiColors2.m12628getButton0d7_KjU()), 0, false, null, 0, ImeAction.INSTANCE.m8417getNexteUduSuo(), false, null, false, 0.0f, composer2, 805306368, 6, 14824);
                    ComposerKt.sourceInformationMarkerEnd(composer2);
                    composer2.endNode();
                    ComposerKt.sourceInformationMarkerEnd(composer2);
                    ComposerKt.sourceInformationMarkerEnd(composer2);
                    ComposerKt.sourceInformationMarkerEnd(composer2);
                }
            }, startRestartGroup, 54), startRestartGroup, 1572870 | ((i12 << 3) & 112), 30);
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            startRestartGroup.endNode();
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            f3 = f2;
            j8 = j4;
            fontWeight3 = fontWeight2;
            j9 = j7;
            j10 = j6;
            endRestartGroup = startRestartGroup.endRestartGroup();
            if (endRestartGroup != null) {
            }
        }
        j4 = j;
        i4 = i2 & 64;
        if (i4 == 0) {
        }
        i6 = i2 & 128;
        if (i6 == 0) {
        }
        i7 = i2 & 256;
        if (i7 == 0) {
        }
        i8 = i7;
        if ((i & 1879048192) == 0) {
        }
        i11 = i10;
        if ((i9 & 1533916891) == 306783378) {
        }
        startRestartGroup.startDefaults();
        if ((i & 1) == 0) {
        }
        if (i11 != 0) {
        }
        if (i4 != 0) {
        }
        if (i6 != 0) {
        }
        if (i8 != 0) {
        }
        if ((i2 & 512) != 0) {
        }
        startRestartGroup.endDefaults();
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, 1341605231, "CC(Column)N(modifier,verticalArrangement,horizontalAlignment,content)87@4443L61,88@4509L134:Column.kt#2w3rfo");
        Modifier.Companion companion22 = Modifier.INSTANCE;
        MeasurePolicy columnMeasurePolicy22 = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), startRestartGroup, 0);
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1159599143, "CC(Layout)P(!1,2)80@3267L27,83@3433L360:Layout.kt#80mrfh");
        hashCode = Long.hashCode(ComposablesKt.getCurrentCompositeKeyHashCode(startRestartGroup, 0));
        CompositionLocalMap currentCompositionLocalMap22 = startRestartGroup.getCurrentCompositionLocalMap();
        Modifier materializeModifier22 = ComposedModifierKt.materializeModifier(startRestartGroup, companion22);
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
        String stringResource22 = StringResources_androidKt.stringResource(R.string.intercom_surveys_multiselect_other_option_value, startRestartGroup, 0);
        startRestartGroup.startReplaceGroup(-1990898758);
        if ((i12 & 7168) == 2048) {
        }
        rememberedValue = startRestartGroup.rememberedValue();
        if (!z2) {
        }
        rememberedValue = new Function1() { // from class: io.intercom.android.sdk.survey.ui.questiontype.choice.OtherOptionKt$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                Unit OtherOption_YCJL08c$lambda$2$lambda$1$lambda$0;
                OtherOption_YCJL08c$lambda$2$lambda$1$lambda$0 = OtherOptionKt.OtherOption_YCJL08c$lambda$2$lambda$1$lambda$0(Function0.this, (String) obj);
                return OtherOption_YCJL08c$lambda$2$lambda$1$lambda$0;
            }
        };
        startRestartGroup.updateRememberedValue(rememberedValue);
        startRestartGroup.endReplaceGroup();
        int i1822 = i12 >> 6;
        ChoicePillKt.m12723ChoicePillUdaoDFU(z, (Function1) rememberedValue, stringResource22, j4, f2, j7, fontWeight2, j6, startRestartGroup, (i12 & 14) | (i1822 & 7168) | (i1822 & i5) | (i1822 & Opcodes.ASM7) | (i1822 & 3670016) | (i1822 & 29360128), 0);
        SpacerKt.Spacer(SizeKt.m1195height3ABfNKs(Modifier.INSTANCE, Dp.m8798constructorimpl(8)), startRestartGroup, 6);
        AnimatedVisibilityKt.AnimatedVisibility(columnScopeInstance22, z, (Modifier) null, (EnterTransition) null, (ExitTransition) null, (String) null, ComposableLambdaKt.rememberComposableLambda(-252181085, true, new Function3<AnimatedVisibilityScope, Composer, Integer, Unit>() { // from class: io.intercom.android.sdk.survey.ui.questiontype.choice.OtherOptionKt$OtherOption$1$2
            @Override // kotlin.jvm.functions.Function3
            public /* bridge */ /* synthetic */ Unit invoke(AnimatedVisibilityScope animatedVisibilityScope, Composer composer2, Integer num) {
                invoke(animatedVisibilityScope, composer2, num.intValue());
                return Unit.INSTANCE;
            }

            public final void invoke(AnimatedVisibilityScope AnimatedVisibility, Composer composer2, int i19) {
                Intrinsics.checkNotNullParameter(AnimatedVisibility, "$this$AnimatedVisibility");
                SurveyUiColors surveyUiColors2 = SurveyUiColors.this;
                String str = text;
                Function1<String, Unit> function1 = onTextChanged;
                ComposerKt.sourceInformationMarkerStart(composer2, 1341605231, "CC(Column)N(modifier,verticalArrangement,horizontalAlignment,content)87@4443L61,88@4509L134:Column.kt#2w3rfo");
                Modifier.Companion companion222 = Modifier.INSTANCE;
                MeasurePolicy columnMeasurePolicy222 = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composer2, 0);
                ComposerKt.sourceInformationMarkerStart(composer2, -1159599143, "CC(Layout)P(!1,2)80@3267L27,83@3433L360:Layout.kt#80mrfh");
                int hashCode2 = Long.hashCode(ComposablesKt.getCurrentCompositeKeyHashCode(composer2, 0));
                CompositionLocalMap currentCompositionLocalMap222 = composer2.getCurrentCompositionLocalMap();
                Modifier materializeModifier222 = ComposedModifierKt.materializeModifier(composer2, companion222);
                Function0<ComposeUiNode> constructor222 = ComposeUiNode.INSTANCE.getConstructor();
                ComposerKt.sourceInformationMarkerStart(composer2, -553112988, "CC(ReusableComposeNode)N(factory,update,content)399@15590L9:Composables.kt#9igjgp");
                if (!(composer2.getApplier() instanceof Applier)) {
                    ComposablesKt.invalidApplier();
                }
                composer2.startReusableNode();
                if (composer2.getInserting()) {
                    composer2.createNode(constructor222);
                } else {
                    composer2.useNode();
                }
                Composer m5333constructorimpl2 = Updater.m5333constructorimpl(composer2);
                Updater.m5340setimpl(m5333constructorimpl2, columnMeasurePolicy222, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                Updater.m5340setimpl(m5333constructorimpl2, currentCompositionLocalMap222, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash222 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                if (m5333constructorimpl2.getInserting() || !Intrinsics.areEqual(m5333constructorimpl2.rememberedValue(), Integer.valueOf(hashCode2))) {
                    m5333constructorimpl2.updateRememberedValue(Integer.valueOf(hashCode2));
                    m5333constructorimpl2.apply(Integer.valueOf(hashCode2), setCompositeKeyHash222);
                }
                Updater.m5340setimpl(m5333constructorimpl2, materializeModifier222, ComposeUiNode.INSTANCE.getSetModifier());
                ComposerKt.sourceInformationMarkerStart(composer2, 2093002350, "C89@4557L9:Column.kt#2w3rfo");
                ColumnScopeInstance columnScopeInstance222 = ColumnScopeInstance.INSTANCE;
                TextKt.m3901TextNvy7gAk(StringResources_androidKt.stringResource(R.string.intercom_surveys_multiselect_other_option_input_label, composer2, 0), null, 0L, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, IntercomTheme.INSTANCE.getTypography(composer2, IntercomTheme.$stable).getType04(), composer2, 0, 0, 131070);
                SpacerKt.Spacer(SizeKt.m1195height3ABfNKs(Modifier.INSTANCE, Dp.m8798constructorimpl(4)), composer2, 6);
                TextInputPillKt.m12809TextInputPillg5ZjG94(str, StringResources_androidKt.stringResource(R.string.intercom_surveys_multiselect_other_option_input_placeholder, composer2, 0), function1, null, ColorExtensionsKt.m13183getAccessibleColorOnWhiteBackground8_81llA(surveyUiColors2.m12628getButton0d7_KjU()), 0, false, null, 0, ImeAction.INSTANCE.m8417getNexteUduSuo(), false, null, false, 0.0f, composer2, 805306368, 6, 14824);
                ComposerKt.sourceInformationMarkerEnd(composer2);
                composer2.endNode();
                ComposerKt.sourceInformationMarkerEnd(composer2);
                ComposerKt.sourceInformationMarkerEnd(composer2);
                ComposerKt.sourceInformationMarkerEnd(composer2);
            }
        }, startRestartGroup, 54), startRestartGroup, 1572870 | ((i12 << 3) & 112), 30);
        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        startRestartGroup.endNode();
        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        f3 = f2;
        j8 = j4;
        fontWeight3 = fontWeight2;
        j9 = j7;
        j10 = j6;
        endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit OtherOption_YCJL08c$lambda$2$lambda$1$lambda$0(Function0 onClicked, String it) {
        Intrinsics.checkNotNullParameter(onClicked, "$onClicked");
        Intrinsics.checkNotNullParameter(it, "it");
        onClicked.invoke();
        return Unit.INSTANCE;
    }

    public static final void OtherOptionPreview(Composer composer, final int i) {
        Composer startRestartGroup = composer.startRestartGroup(-469899921);
        if (i != 0 || !startRestartGroup.getSkipping()) {
            SurfaceKt.m3729SurfaceT9BRK9s(PaddingKt.m1157padding3ABfNKs(Modifier.INSTANCE, Dp.m8798constructorimpl(16)), null, 0L, 0L, 0.0f, 0.0f, null, ComposableSingletons$OtherOptionKt.INSTANCE.m12729getLambda1$intercom_sdk_base_release(), startRestartGroup, 12582918, 126);
        } else {
            startRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new Function2() { // from class: io.intercom.android.sdk.survey.ui.questiontype.choice.OtherOptionKt$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    Unit OtherOptionPreview$lambda$4;
                    OtherOptionPreview$lambda$4 = OtherOptionKt.OtherOptionPreview$lambda$4(i, (Composer) obj, ((Integer) obj2).intValue());
                    return OtherOptionPreview$lambda$4;
                }
            });
        }
    }
}
