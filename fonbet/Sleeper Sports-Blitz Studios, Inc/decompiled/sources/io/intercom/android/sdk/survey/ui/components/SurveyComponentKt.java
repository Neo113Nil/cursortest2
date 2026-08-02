package io.intercom.android.sdk.survey.ui.components;

import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.BoxWithConstraintsKt;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.WindowInsetsPadding_androidKt;
import androidx.compose.material3.ScaffoldKt;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Brush;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import io.intercom.android.nexus.NexusConfig;
import io.intercom.android.sdk.R;
import io.intercom.android.sdk.blocks.lib.BlockType;
import io.intercom.android.sdk.blocks.lib.models.Block;
import io.intercom.android.sdk.identity.AppConfig;
import io.intercom.android.sdk.models.AttachmentSettings;
import io.intercom.android.sdk.models.Avatar;
import io.intercom.android.sdk.models.ConversationStateSyncSettings;
import io.intercom.android.sdk.survey.ProgressBarState;
import io.intercom.android.sdk.survey.QuestionState;
import io.intercom.android.sdk.survey.SurveyState;
import io.intercom.android.sdk.survey.SurveyUiColors;
import io.intercom.android.sdk.survey.SurveyViewModelKt;
import io.intercom.android.sdk.survey.TopBarState;
import io.intercom.android.sdk.survey.model.SurveyCustomization;
import io.intercom.android.sdk.survey.model.SurveyData;
import io.intercom.android.sdk.utilities.ColorExtensionsKt;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.IntIterator;
import kotlin.collections.SetsKt;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: SurveyComponent.kt */
@Metadata(d1 = {"\u0000B\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\u001ac\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00010\u00052\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00010\b2\u0014\b\u0002\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00010\u00052\u0014\b\u0002\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u00010\u0005H\u0001¢\u0006\u0002\u0010\r\u001a[\u0010\u000e\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u000f2\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00010\u00052\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00010\u00052\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u00010\u00052\b\b\u0002\u0010\u0010\u001a\u00020\u0011H\u0001¢\u0006\u0002\u0010\u0012\u001a\r\u0010\u0013\u001a\u00020\u0001H\u0001¢\u0006\u0002\u0010\u0014\u001a\r\u0010\u0015\u001a\u00020\u0001H\u0001¢\u0006\u0002\u0010\u0014\"\u0014\u0010\u0016\u001a\u00020\u0017X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019¨\u0006\u001a"}, d2 = {"SurveyComponent", "", "state", "Lio/intercom/android/sdk/survey/SurveyState;", "onContinue", "Lkotlin/Function1;", "Lkotlinx/coroutines/CoroutineScope;", "onClose", "Lkotlin/Function0;", "onAnswerUpdated", "", "onSecondaryCtaClicked", "Lio/intercom/android/sdk/survey/SurveyState$Content$SecondaryCta;", "(Lio/intercom/android/sdk/survey/SurveyState;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "SurveyContent", "Lio/intercom/android/sdk/survey/SurveyState$Content;", "modifier", "Landroidx/compose/ui/Modifier;", "(Lio/intercom/android/sdk/survey/SurveyState$Content;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "SimpleSurvey", "(Landroidx/compose/runtime/Composer;I)V", "SurveyErrorState", "emptyAppConfig", "Lio/intercom/android/sdk/identity/AppConfig;", "getEmptyAppConfig", "()Lio/intercom/android/sdk/identity/AppConfig;", "intercom-sdk-base_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class SurveyComponentKt {
    private static final AppConfig emptyAppConfig = new AppConfig("", 0, 0, 0, false, false, false, 100, 1000, 1000, 1000, 1000, true, true, "", "", false, true, "", SetsKt.emptySet(), SetsKt.emptySet(), "", "", false, true, false, false, false, null, new NexusConfig(), AttachmentSettings.INSTANCE.getDEFAULT(), true, ConversationStateSyncSettings.INSTANCE.getDEFAULT(), false);

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit SimpleSurvey$lambda$9(int i, Composer composer, int i2) {
        SimpleSurvey(composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit SurveyComponent$lambda$3(SurveyState state, Function1 onContinue, Function0 onClose, Function1 function1, Function1 function12, int i, int i2, Composer composer, int i3) {
        Intrinsics.checkNotNullParameter(state, "$state");
        Intrinsics.checkNotNullParameter(onContinue, "$onContinue");
        Intrinsics.checkNotNullParameter(onClose, "$onClose");
        SurveyComponent(state, onContinue, onClose, function1, function12, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit SurveyContent$lambda$4(SurveyState.Content state, Function1 onContinue, Function1 onAnswerUpdated, Function1 onSecondaryCtaClicked, Modifier modifier, int i, int i2, Composer composer, int i3) {
        Intrinsics.checkNotNullParameter(state, "$state");
        Intrinsics.checkNotNullParameter(onContinue, "$onContinue");
        Intrinsics.checkNotNullParameter(onAnswerUpdated, "$onAnswerUpdated");
        Intrinsics.checkNotNullParameter(onSecondaryCtaClicked, "$onSecondaryCtaClicked");
        SurveyContent(state, onContinue, onAnswerUpdated, onSecondaryCtaClicked, modifier, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit SurveyErrorState$lambda$14(int i, Composer composer, int i2) {
        SurveyErrorState(composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit SurveyComponent$lambda$0(String it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit SurveyComponent$lambda$1(SurveyState.Content.SecondaryCta it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x028a  */
    /* JADX WARN: Removed duplicated region for block: B:28:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00dd  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x01cc  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x01d8  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0201  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x01dc  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0124  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00cb  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00c2  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x008b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void SurveyComponent(final SurveyState state, final Function1<? super CoroutineScope, Unit> onContinue, final Function0<Unit> onClose, Function1<? super String, Unit> function1, Function1<? super SurveyState.Content.SecondaryCta, Unit> function12, Composer composer, final int i, final int i2) {
        int i3;
        Function1<? super String, Unit> function13;
        int i4;
        Function1<? super SurveyState.Content.SecondaryCta, Unit> function14;
        final Function1<? super String, Unit> function15;
        List listOf;
        int hashCode;
        Composer m5333constructorimpl;
        Composer composer2;
        final Function1<? super SurveyState.Content.SecondaryCta, Unit> function16;
        ScopeUpdateScope endRestartGroup;
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(onContinue, "onContinue");
        Intrinsics.checkNotNullParameter(onClose, "onClose");
        Composer startRestartGroup = composer.startRestartGroup(290100480);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 14) == 0) {
            i3 = (startRestartGroup.changed(state) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 112) == 0) {
            i3 |= startRestartGroup.changedInstance(onContinue) ? 32 : 16;
        }
        if ((i2 & 4) != 0) {
            i3 |= 384;
        } else if ((i & 896) == 0) {
            i3 |= startRestartGroup.changedInstance(onClose) ? 256 : 128;
        }
        int i5 = i2 & 8;
        if (i5 != 0) {
            i3 |= 3072;
        } else if ((i & 7168) == 0) {
            function13 = function1;
            i3 |= startRestartGroup.changedInstance(function13) ? 2048 : 1024;
            i4 = i2 & 16;
            if (i4 == 0) {
                i3 |= 24576;
            } else if ((57344 & i) == 0) {
                function14 = function12;
                i3 |= startRestartGroup.changedInstance(function14) ? 16384 : 8192;
                if ((i3 & 46811) == 9362 || !startRestartGroup.getSkipping()) {
                    function15 = i5 != 0 ? new Function1() { // from class: io.intercom.android.sdk.survey.ui.components.SurveyComponentKt$$ExternalSyntheticLambda1
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            Unit SurveyComponent$lambda$0;
                            SurveyComponent$lambda$0 = SurveyComponentKt.SurveyComponent$lambda$0((String) obj);
                            return SurveyComponent$lambda$0;
                        }
                    } : function13;
                    final Function1<? super SurveyState.Content.SecondaryCta, Unit> function17 = i4 != 0 ? new Function1() { // from class: io.intercom.android.sdk.survey.ui.components.SurveyComponentKt$$ExternalSyntheticLambda2
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            Unit SurveyComponent$lambda$1;
                            SurveyComponent$lambda$1 = SurveyComponentKt.SurveyComponent$lambda$1((SurveyState.Content.SecondaryCta) obj);
                            return SurveyComponent$lambda$1;
                        }
                    } : function14;
                    if (ColorExtensionsKt.m13186isDarkColor8_81llA(state.getSurveyUiColors().m12627getBackground0d7_KjU())) {
                        listOf = CollectionsKt.listOf((Object[]) new Color[]{Color.m6029boximpl(ColorExtensionsKt.m13179darken8_81llA(state.getSurveyUiColors().m12627getBackground0d7_KjU())), Color.m6029boximpl(state.getSurveyUiColors().m12627getBackground0d7_KjU()), Color.m6029boximpl(state.getSurveyUiColors().m12627getBackground0d7_KjU()), Color.m6029boximpl(ColorExtensionsKt.m13179darken8_81llA(state.getSurveyUiColors().m12627getBackground0d7_KjU()))});
                    } else {
                        listOf = CollectionsKt.listOf((Object[]) new Color[]{Color.m6029boximpl(ColorExtensionsKt.m13189lighten8_81llA(state.getSurveyUiColors().m12627getBackground0d7_KjU())), Color.m6029boximpl(state.getSurveyUiColors().m12627getBackground0d7_KjU()), Color.m6029boximpl(state.getSurveyUiColors().m12627getBackground0d7_KjU()), Color.m6029boximpl(ColorExtensionsKt.m13189lighten8_81llA(state.getSurveyUiColors().m12627getBackground0d7_KjU()))});
                    }
                    Modifier background$default = BackgroundKt.background$default(Modifier.INSTANCE, Brush.Companion.m5995verticalGradient8A3gB4$default(Brush.INSTANCE, listOf, 0.0f, 0.0f, 0, 14, (Object) null), null, 0.0f, 6, null);
                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, 1042775818, "CC(Box)N(modifier,contentAlignment,propagateMinConstraints,content)71@3424L131:Box.kt#2w3rfo");
                    MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false);
                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1159599143, "CC(Layout)P(!1,2)80@3267L27,83@3433L360:Layout.kt#80mrfh");
                    hashCode = Long.hashCode(ComposablesKt.getCurrentCompositeKeyHashCode(startRestartGroup, 0));
                    CompositionLocalMap currentCompositionLocalMap = startRestartGroup.getCurrentCompositionLocalMap();
                    Modifier materializeModifier = ComposedModifierKt.materializeModifier(startRestartGroup, background$default);
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
                    composer2 = startRestartGroup;
                    ScaffoldKt.m3518ScaffoldTvnljyQ(WindowInsetsPadding_androidKt.displayCutoutPadding(Modifier.INSTANCE), ComposableLambdaKt.rememberComposableLambda(-365860662, true, new Function2<Composer, Integer, Unit>() { // from class: io.intercom.android.sdk.survey.ui.components.SurveyComponentKt$SurveyComponent$3$1
                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                            invoke(composer3, num.intValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(Composer composer3, int i6) {
                            if ((i6 & 11) != 2 || !composer3.getSkipping()) {
                                SurveyTopBarComponentKt.SurveyTopBar(SurveyState.this.getTopBarState(), onClose, WindowInsetsPadding_androidKt.systemBarsPadding(Modifier.INSTANCE), composer3, 0, 0);
                            } else {
                                composer3.skipToGroupEnd();
                            }
                        }
                    }, startRestartGroup, 54), null, null, null, 0, Color.INSTANCE.m6074getTransparent0d7_KjU(), 0L, null, ComposableLambdaKt.rememberComposableLambda(-1342576427, true, new Function3<PaddingValues, Composer, Integer, Unit>() { // from class: io.intercom.android.sdk.survey.ui.components.SurveyComponentKt$SurveyComponent$3$2
                        @Override // kotlin.jvm.functions.Function3
                        public /* bridge */ /* synthetic */ Unit invoke(PaddingValues paddingValues, Composer composer3, Integer num) {
                            invoke(paddingValues, composer3, num.intValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(PaddingValues contentPadding, Composer composer3, int i6) {
                            Intrinsics.checkNotNullParameter(contentPadding, "contentPadding");
                            if ((i6 & 14) == 0) {
                                i6 |= composer3.changed(contentPadding) ? 4 : 2;
                            }
                            if ((i6 & 91) != 18 || !composer3.getSkipping()) {
                                SurveyState surveyState = SurveyState.this;
                                if (surveyState instanceof SurveyState.Content) {
                                    composer3.startReplaceGroup(-509523482);
                                    SurveyComponentKt.SurveyContent((SurveyState.Content) SurveyState.this, onContinue, function15, function17, PaddingKt.padding(Modifier.INSTANCE, contentPadding), composer3, 8, 0);
                                    composer3.endReplaceGroup();
                                    return;
                                }
                                if (surveyState instanceof SurveyState.Error) {
                                    composer3.startReplaceGroup(-509512239);
                                    ErrorComponentKt.SurveyError((SurveyState.Error) SurveyState.this, PaddingKt.padding(Modifier.INSTANCE, contentPadding), composer3, 0, 0);
                                    composer3.endReplaceGroup();
                                    return;
                                } else if (surveyState instanceof SurveyState.Loading) {
                                    composer3.startReplaceGroup(-509506157);
                                    LoadingComponentKt.SurveyLoading((SurveyState.Loading) SurveyState.this, PaddingKt.padding(Modifier.INSTANCE, contentPadding), composer3, 0, 0);
                                    composer3.endReplaceGroup();
                                    return;
                                } else if (Intrinsics.areEqual(surveyState, SurveyState.Initial.INSTANCE)) {
                                    composer3.startReplaceGroup(1385361405);
                                    composer3.endReplaceGroup();
                                    return;
                                } else {
                                    composer3.startReplaceGroup(-509524940);
                                    composer3.endReplaceGroup();
                                    throw new NoWhenBranchMatchedException();
                                }
                            }
                            composer3.skipToGroupEnd();
                        }
                    }, startRestartGroup, 54), composer2, 806879280, 444);
                    ComposerKt.sourceInformationMarkerEnd(composer2);
                    composer2.endNode();
                    ComposerKt.sourceInformationMarkerEnd(composer2);
                    ComposerKt.sourceInformationMarkerEnd(composer2);
                    ComposerKt.sourceInformationMarkerEnd(composer2);
                    function16 = function17;
                } else {
                    startRestartGroup.skipToGroupEnd();
                    composer2 = startRestartGroup;
                    function15 = function13;
                    function16 = function14;
                }
                endRestartGroup = composer2.endRestartGroup();
                if (endRestartGroup != null) {
                    endRestartGroup.updateScope(new Function2() { // from class: io.intercom.android.sdk.survey.ui.components.SurveyComponentKt$$ExternalSyntheticLambda3
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            Unit SurveyComponent$lambda$3;
                            SurveyComponent$lambda$3 = SurveyComponentKt.SurveyComponent$lambda$3(SurveyState.this, onContinue, onClose, function15, function16, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                            return SurveyComponent$lambda$3;
                        }
                    });
                    return;
                }
                return;
            }
            function14 = function12;
            if ((i3 & 46811) == 9362) {
            }
            if (i5 != 0) {
            }
            if (i4 != 0) {
            }
            if (ColorExtensionsKt.m13186isDarkColor8_81llA(state.getSurveyUiColors().m12627getBackground0d7_KjU())) {
            }
            Modifier background$default2 = BackgroundKt.background$default(Modifier.INSTANCE, Brush.Companion.m5995verticalGradient8A3gB4$default(Brush.INSTANCE, listOf, 0.0f, 0.0f, 0, 14, (Object) null), null, 0.0f, 6, null);
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 1042775818, "CC(Box)N(modifier,contentAlignment,propagateMinConstraints,content)71@3424L131:Box.kt#2w3rfo");
            MeasurePolicy maybeCachedBoxMeasurePolicy2 = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false);
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1159599143, "CC(Layout)P(!1,2)80@3267L27,83@3433L360:Layout.kt#80mrfh");
            hashCode = Long.hashCode(ComposablesKt.getCurrentCompositeKeyHashCode(startRestartGroup, 0));
            CompositionLocalMap currentCompositionLocalMap2 = startRestartGroup.getCurrentCompositionLocalMap();
            Modifier materializeModifier2 = ComposedModifierKt.materializeModifier(startRestartGroup, background$default2);
            Function0<ComposeUiNode> constructor2 = ComposeUiNode.INSTANCE.getConstructor();
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -553112988, "CC(ReusableComposeNode)N(factory,update,content)399@15590L9:Composables.kt#9igjgp");
            if (!(startRestartGroup.getApplier() instanceof Applier)) {
            }
            startRestartGroup.startReusableNode();
            if (startRestartGroup.getInserting()) {
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
            composer2 = startRestartGroup;
            ScaffoldKt.m3518ScaffoldTvnljyQ(WindowInsetsPadding_androidKt.displayCutoutPadding(Modifier.INSTANCE), ComposableLambdaKt.rememberComposableLambda(-365860662, true, new Function2<Composer, Integer, Unit>() { // from class: io.intercom.android.sdk.survey.ui.components.SurveyComponentKt$SurveyComponent$3$1
                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                    invoke(composer3, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(Composer composer3, int i6) {
                    if ((i6 & 11) != 2 || !composer3.getSkipping()) {
                        SurveyTopBarComponentKt.SurveyTopBar(SurveyState.this.getTopBarState(), onClose, WindowInsetsPadding_androidKt.systemBarsPadding(Modifier.INSTANCE), composer3, 0, 0);
                    } else {
                        composer3.skipToGroupEnd();
                    }
                }
            }, startRestartGroup, 54), null, null, null, 0, Color.INSTANCE.m6074getTransparent0d7_KjU(), 0L, null, ComposableLambdaKt.rememberComposableLambda(-1342576427, true, new Function3<PaddingValues, Composer, Integer, Unit>() { // from class: io.intercom.android.sdk.survey.ui.components.SurveyComponentKt$SurveyComponent$3$2
                @Override // kotlin.jvm.functions.Function3
                public /* bridge */ /* synthetic */ Unit invoke(PaddingValues paddingValues, Composer composer3, Integer num) {
                    invoke(paddingValues, composer3, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(PaddingValues contentPadding, Composer composer3, int i6) {
                    Intrinsics.checkNotNullParameter(contentPadding, "contentPadding");
                    if ((i6 & 14) == 0) {
                        i6 |= composer3.changed(contentPadding) ? 4 : 2;
                    }
                    if ((i6 & 91) != 18 || !composer3.getSkipping()) {
                        SurveyState surveyState = SurveyState.this;
                        if (surveyState instanceof SurveyState.Content) {
                            composer3.startReplaceGroup(-509523482);
                            SurveyComponentKt.SurveyContent((SurveyState.Content) SurveyState.this, onContinue, function15, function17, PaddingKt.padding(Modifier.INSTANCE, contentPadding), composer3, 8, 0);
                            composer3.endReplaceGroup();
                            return;
                        }
                        if (surveyState instanceof SurveyState.Error) {
                            composer3.startReplaceGroup(-509512239);
                            ErrorComponentKt.SurveyError((SurveyState.Error) SurveyState.this, PaddingKt.padding(Modifier.INSTANCE, contentPadding), composer3, 0, 0);
                            composer3.endReplaceGroup();
                            return;
                        } else if (surveyState instanceof SurveyState.Loading) {
                            composer3.startReplaceGroup(-509506157);
                            LoadingComponentKt.SurveyLoading((SurveyState.Loading) SurveyState.this, PaddingKt.padding(Modifier.INSTANCE, contentPadding), composer3, 0, 0);
                            composer3.endReplaceGroup();
                            return;
                        } else if (Intrinsics.areEqual(surveyState, SurveyState.Initial.INSTANCE)) {
                            composer3.startReplaceGroup(1385361405);
                            composer3.endReplaceGroup();
                            return;
                        } else {
                            composer3.startReplaceGroup(-509524940);
                            composer3.endReplaceGroup();
                            throw new NoWhenBranchMatchedException();
                        }
                    }
                    composer3.skipToGroupEnd();
                }
            }, startRestartGroup, 54), composer2, 806879280, 444);
            ComposerKt.sourceInformationMarkerEnd(composer2);
            composer2.endNode();
            ComposerKt.sourceInformationMarkerEnd(composer2);
            ComposerKt.sourceInformationMarkerEnd(composer2);
            ComposerKt.sourceInformationMarkerEnd(composer2);
            function16 = function17;
            endRestartGroup = composer2.endRestartGroup();
            if (endRestartGroup != null) {
            }
        }
        function13 = function1;
        i4 = i2 & 16;
        if (i4 == 0) {
        }
        function14 = function12;
        if ((i3 & 46811) == 9362) {
        }
        if (i5 != 0) {
        }
        if (i4 != 0) {
        }
        if (ColorExtensionsKt.m13186isDarkColor8_81llA(state.getSurveyUiColors().m12627getBackground0d7_KjU())) {
        }
        Modifier background$default22 = BackgroundKt.background$default(Modifier.INSTANCE, Brush.Companion.m5995verticalGradient8A3gB4$default(Brush.INSTANCE, listOf, 0.0f, 0.0f, 0, 14, (Object) null), null, 0.0f, 6, null);
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, 1042775818, "CC(Box)N(modifier,contentAlignment,propagateMinConstraints,content)71@3424L131:Box.kt#2w3rfo");
        MeasurePolicy maybeCachedBoxMeasurePolicy22 = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false);
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1159599143, "CC(Layout)P(!1,2)80@3267L27,83@3433L360:Layout.kt#80mrfh");
        hashCode = Long.hashCode(ComposablesKt.getCurrentCompositeKeyHashCode(startRestartGroup, 0));
        CompositionLocalMap currentCompositionLocalMap22 = startRestartGroup.getCurrentCompositionLocalMap();
        Modifier materializeModifier22 = ComposedModifierKt.materializeModifier(startRestartGroup, background$default22);
        Function0<ComposeUiNode> constructor22 = ComposeUiNode.INSTANCE.getConstructor();
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -553112988, "CC(ReusableComposeNode)N(factory,update,content)399@15590L9:Composables.kt#9igjgp");
        if (!(startRestartGroup.getApplier() instanceof Applier)) {
        }
        startRestartGroup.startReusableNode();
        if (startRestartGroup.getInserting()) {
        }
        m5333constructorimpl = Updater.m5333constructorimpl(startRestartGroup);
        Updater.m5340setimpl(m5333constructorimpl, maybeCachedBoxMeasurePolicy22, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
        Updater.m5340setimpl(m5333constructorimpl, currentCompositionLocalMap22, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash22 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
        if (!m5333constructorimpl.getInserting()) {
        }
        m5333constructorimpl.updateRememberedValue(Integer.valueOf(hashCode));
        m5333constructorimpl.apply(Integer.valueOf(hashCode), setCompositeKeyHash22);
        Updater.m5340setimpl(m5333constructorimpl, materializeModifier22, ComposeUiNode.INSTANCE.getSetModifier());
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, 1833054614, "C72@3469L9:Box.kt#2w3rfo");
        BoxScopeInstance boxScopeInstance22 = BoxScopeInstance.INSTANCE;
        composer2 = startRestartGroup;
        ScaffoldKt.m3518ScaffoldTvnljyQ(WindowInsetsPadding_androidKt.displayCutoutPadding(Modifier.INSTANCE), ComposableLambdaKt.rememberComposableLambda(-365860662, true, new Function2<Composer, Integer, Unit>() { // from class: io.intercom.android.sdk.survey.ui.components.SurveyComponentKt$SurveyComponent$3$1
            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                invoke(composer3, num.intValue());
                return Unit.INSTANCE;
            }

            public final void invoke(Composer composer3, int i6) {
                if ((i6 & 11) != 2 || !composer3.getSkipping()) {
                    SurveyTopBarComponentKt.SurveyTopBar(SurveyState.this.getTopBarState(), onClose, WindowInsetsPadding_androidKt.systemBarsPadding(Modifier.INSTANCE), composer3, 0, 0);
                } else {
                    composer3.skipToGroupEnd();
                }
            }
        }, startRestartGroup, 54), null, null, null, 0, Color.INSTANCE.m6074getTransparent0d7_KjU(), 0L, null, ComposableLambdaKt.rememberComposableLambda(-1342576427, true, new Function3<PaddingValues, Composer, Integer, Unit>() { // from class: io.intercom.android.sdk.survey.ui.components.SurveyComponentKt$SurveyComponent$3$2
            @Override // kotlin.jvm.functions.Function3
            public /* bridge */ /* synthetic */ Unit invoke(PaddingValues paddingValues, Composer composer3, Integer num) {
                invoke(paddingValues, composer3, num.intValue());
                return Unit.INSTANCE;
            }

            public final void invoke(PaddingValues contentPadding, Composer composer3, int i6) {
                Intrinsics.checkNotNullParameter(contentPadding, "contentPadding");
                if ((i6 & 14) == 0) {
                    i6 |= composer3.changed(contentPadding) ? 4 : 2;
                }
                if ((i6 & 91) != 18 || !composer3.getSkipping()) {
                    SurveyState surveyState = SurveyState.this;
                    if (surveyState instanceof SurveyState.Content) {
                        composer3.startReplaceGroup(-509523482);
                        SurveyComponentKt.SurveyContent((SurveyState.Content) SurveyState.this, onContinue, function15, function17, PaddingKt.padding(Modifier.INSTANCE, contentPadding), composer3, 8, 0);
                        composer3.endReplaceGroup();
                        return;
                    }
                    if (surveyState instanceof SurveyState.Error) {
                        composer3.startReplaceGroup(-509512239);
                        ErrorComponentKt.SurveyError((SurveyState.Error) SurveyState.this, PaddingKt.padding(Modifier.INSTANCE, contentPadding), composer3, 0, 0);
                        composer3.endReplaceGroup();
                        return;
                    } else if (surveyState instanceof SurveyState.Loading) {
                        composer3.startReplaceGroup(-509506157);
                        LoadingComponentKt.SurveyLoading((SurveyState.Loading) SurveyState.this, PaddingKt.padding(Modifier.INSTANCE, contentPadding), composer3, 0, 0);
                        composer3.endReplaceGroup();
                        return;
                    } else if (Intrinsics.areEqual(surveyState, SurveyState.Initial.INSTANCE)) {
                        composer3.startReplaceGroup(1385361405);
                        composer3.endReplaceGroup();
                        return;
                    } else {
                        composer3.startReplaceGroup(-509524940);
                        composer3.endReplaceGroup();
                        throw new NoWhenBranchMatchedException();
                    }
                }
                composer3.skipToGroupEnd();
            }
        }, startRestartGroup, 54), composer2, 806879280, 444);
        ComposerKt.sourceInformationMarkerEnd(composer2);
        composer2.endNode();
        ComposerKt.sourceInformationMarkerEnd(composer2);
        ComposerKt.sourceInformationMarkerEnd(composer2);
        ComposerKt.sourceInformationMarkerEnd(composer2);
        function16 = function17;
        endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup != null) {
        }
    }

    public static final void SurveyContent(final SurveyState.Content state, final Function1<? super CoroutineScope, Unit> onContinue, final Function1<? super String, Unit> onAnswerUpdated, final Function1<? super SurveyState.Content.SecondaryCta, Unit> onSecondaryCtaClicked, Modifier modifier, Composer composer, final int i, final int i2) {
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(onContinue, "onContinue");
        Intrinsics.checkNotNullParameter(onAnswerUpdated, "onAnswerUpdated");
        Intrinsics.checkNotNullParameter(onSecondaryCtaClicked, "onSecondaryCtaClicked");
        Composer startRestartGroup = composer.startRestartGroup(433920899);
        Modifier modifier2 = (i2 & 16) != 0 ? Modifier.INSTANCE : modifier;
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, 773894976, "CC(rememberCoroutineScope)N(getContext)608@27648L68:Effects.kt#9igjgp");
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, 683737348, "CC(remember):Effects.kt#9igjgp");
        Object rememberedValue = startRestartGroup.rememberedValue();
        if (rememberedValue == Composer.INSTANCE.getEmpty()) {
            rememberedValue = EffectsKt.createCompositionCoroutineScope(EmptyCoroutineContext.INSTANCE, startRestartGroup);
            startRestartGroup.updateRememberedValue(rememberedValue);
        }
        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        BoxWithConstraintsKt.BoxWithConstraints(SizeKt.fillMaxSize$default(modifier2, 0.0f, 1, null), null, false, ComposableLambdaKt.rememberComposableLambda(-1844267539, true, new SurveyComponentKt$SurveyContent$1(state, onSecondaryCtaClicked, onAnswerUpdated, onContinue, (CoroutineScope) rememberedValue), startRestartGroup, 54), startRestartGroup, 3072, 6);
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            final Modifier modifier3 = modifier2;
            endRestartGroup.updateScope(new Function2() { // from class: io.intercom.android.sdk.survey.ui.components.SurveyComponentKt$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    Unit SurveyContent$lambda$4;
                    SurveyContent$lambda$4 = SurveyComponentKt.SurveyContent$lambda$4(SurveyState.Content.this, onContinue, onAnswerUpdated, onSecondaryCtaClicked, modifier3, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                    return SurveyContent$lambda$4;
                }
            });
        }
    }

    public static final void SimpleSurvey(Composer composer, final int i) {
        Composer startRestartGroup = composer.startRestartGroup(126014647);
        if (i != 0 || !startRestartGroup.getSkipping()) {
            SurveyUiColors surveyUiColors = SurveyViewModelKt.toSurveyUiColors(new SurveyCustomization(null, null, 3, null));
            Avatar create = Avatar.create("", "AD");
            Intrinsics.checkNotNullExpressionValue(create, "create(...)");
            TopBarState.SenderTopBarState senderTopBarState = new TopBarState.SenderTopBarState(create, "Andy", emptyAppConfig, true, surveyUiColors, new ProgressBarState(true, 0.5f));
            List listOf = CollectionsKt.listOf((Object[]) new Block.Builder[]{new Block.Builder().withText("<b>Step 1</b>").withType(BlockType.HEADING.getSerializedName()), new Block.Builder().withText("Get tailored discounts to your inbox").withType(BlockType.PARAGRAPH.getSerializedName())});
            QuestionState[] questionStateArr = new QuestionState[3];
            String uuid = UUID.randomUUID().toString();
            Intrinsics.checkNotNullExpressionValue(uuid, "toString(...)");
            questionStateArr[0] = new QuestionState(new SurveyData.Step.Question.ShortTextQuestionModel(uuid, CollectionsKt.listOf(new Block.Builder().withText("Is this a preview?")), true, "Let us know", SurveyData.Step.Question.QuestionValidation.ValidationType.NO_VALIDATION, 250, false, null, null, 448, null), surveyUiColors);
            String uuid2 = UUID.randomUUID().toString();
            Intrinsics.checkNotNullExpressionValue(uuid2, "toString(...)");
            questionStateArr[1] = new QuestionState(new SurveyData.Step.Question.SingleChoiceQuestionModel(uuid2, CollectionsKt.listOf(new Block.Builder().withText("Question Title")), true, CollectionsKt.listOf((Object[]) new String[]{"Option A", "Option B", "Option C", "Option D"}), false), SurveyViewModelKt.toSurveyUiColors(new SurveyCustomization(null, null, 3, null)));
            String uuid3 = UUID.randomUUID().toString();
            Intrinsics.checkNotNullExpressionValue(uuid3, "toString(...)");
            List listOf2 = CollectionsKt.listOf(new Block.Builder().withText("How would your rate your experience?"));
            SurveyData.Step.Question.QuestionData.QuestionSubType questionSubType = SurveyData.Step.Question.QuestionData.QuestionSubType.STARS;
            IntRange intRange = new IntRange(1, 5);
            ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(intRange, 10));
            Iterator<Integer> it = intRange.iterator();
            while (it.hasNext()) {
                arrayList.add(new SurveyData.Step.Question.NumericRatingQuestionModel.RatingOption.NumericRatingOption(((IntIterator) it).nextInt()));
            }
            questionStateArr[2] = new QuestionState(new SurveyData.Step.Question.NumericRatingQuestionModel(uuid3, listOf2, true, arrayList, "Poor", "Excellent", 1, 5, questionSubType), surveyUiColors);
            SurveyComponent(new SurveyState.Content(listOf, CollectionsKt.listOf((Object[]) questionStateArr), CollectionsKt.emptyList(), new SurveyState.Content.PrimaryCta.Fallback(R.string.intercom_surveys_next_button), surveyUiColors, senderTopBarState), new Function1() { // from class: io.intercom.android.sdk.survey.ui.components.SurveyComponentKt$$ExternalSyntheticLambda4
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    Unit SimpleSurvey$lambda$6;
                    SimpleSurvey$lambda$6 = SurveyComponentKt.SimpleSurvey$lambda$6((CoroutineScope) obj);
                    return SimpleSurvey$lambda$6;
                }
            }, new Function0() { // from class: io.intercom.android.sdk.survey.ui.components.SurveyComponentKt$$ExternalSyntheticLambda5
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    Unit unit;
                    unit = Unit.INSTANCE;
                    return unit;
                }
            }, new Function1() { // from class: io.intercom.android.sdk.survey.ui.components.SurveyComponentKt$$ExternalSyntheticLambda6
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    Unit SimpleSurvey$lambda$8;
                    SimpleSurvey$lambda$8 = SurveyComponentKt.SimpleSurvey$lambda$8((String) obj);
                    return SimpleSurvey$lambda$8;
                }
            }, null, startRestartGroup, 3512, 16);
        } else {
            startRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new Function2() { // from class: io.intercom.android.sdk.survey.ui.components.SurveyComponentKt$$ExternalSyntheticLambda7
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    Unit SimpleSurvey$lambda$9;
                    SimpleSurvey$lambda$9 = SurveyComponentKt.SimpleSurvey$lambda$9(i, (Composer) obj, ((Integer) obj2).intValue());
                    return SimpleSurvey$lambda$9;
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit SimpleSurvey$lambda$6(CoroutineScope it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit SimpleSurvey$lambda$8(String it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return Unit.INSTANCE;
    }

    public static final void SurveyErrorState(Composer composer, final int i) {
        Composer startRestartGroup = composer.startRestartGroup(-1165269984);
        if (i != 0 || !startRestartGroup.getSkipping()) {
            Avatar create = Avatar.create("", "AD");
            Intrinsics.checkNotNullExpressionValue(create, "create(...)");
            SurveyComponent(new SurveyState.Error.WithCTA(0, SurveyViewModelKt.toSurveyUiColors(new SurveyCustomization(null, null, 3, null)), new TopBarState.SenderTopBarState(create, "Andy", emptyAppConfig, true, SurveyViewModelKt.toSurveyUiColors(new SurveyCustomization(null, null, 3, null)), null, 32, null), new Function0() { // from class: io.intercom.android.sdk.survey.ui.components.SurveyComponentKt$$ExternalSyntheticLambda8
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    Unit unit;
                    unit = Unit.INSTANCE;
                    return unit;
                }
            }, 1, null), new Function1() { // from class: io.intercom.android.sdk.survey.ui.components.SurveyComponentKt$$ExternalSyntheticLambda9
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    Unit SurveyErrorState$lambda$11;
                    SurveyErrorState$lambda$11 = SurveyComponentKt.SurveyErrorState$lambda$11((CoroutineScope) obj);
                    return SurveyErrorState$lambda$11;
                }
            }, new Function0() { // from class: io.intercom.android.sdk.survey.ui.components.SurveyComponentKt$$ExternalSyntheticLambda10
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    Unit unit;
                    unit = Unit.INSTANCE;
                    return unit;
                }
            }, new Function1() { // from class: io.intercom.android.sdk.survey.ui.components.SurveyComponentKt$$ExternalSyntheticLambda11
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    Unit SurveyErrorState$lambda$13;
                    SurveyErrorState$lambda$13 = SurveyComponentKt.SurveyErrorState$lambda$13((String) obj);
                    return SurveyErrorState$lambda$13;
                }
            }, null, startRestartGroup, 3504, 16);
        } else {
            startRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new Function2() { // from class: io.intercom.android.sdk.survey.ui.components.SurveyComponentKt$$ExternalSyntheticLambda12
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    Unit SurveyErrorState$lambda$14;
                    SurveyErrorState$lambda$14 = SurveyComponentKt.SurveyErrorState$lambda$14(i, (Composer) obj, ((Integer) obj2).intValue());
                    return SurveyErrorState$lambda$14;
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit SurveyErrorState$lambda$11(CoroutineScope it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit SurveyErrorState$lambda$13(String it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return Unit.INSTANCE;
    }

    public static final AppConfig getEmptyAppConfig() {
        return emptyAppConfig;
    }
}
