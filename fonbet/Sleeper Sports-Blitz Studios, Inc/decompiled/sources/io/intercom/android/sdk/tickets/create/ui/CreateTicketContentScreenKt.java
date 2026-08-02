package io.intercom.android.sdk.tickets.create.ui;

import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.ScrollKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScope;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScope;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.layout.WindowInsets;
import androidx.compose.foundation.layout.WindowInsetsPaddingKt;
import androidx.compose.foundation.layout.WindowInsets_androidKt;
import androidx.compose.material3.ButtonDefaults;
import androidx.compose.material3.ButtonKt;
import androidx.compose.material3.IconKt;
import androidx.compose.material3.ProgressIndicatorKt;
import androidx.compose.material3.ScaffoldKt;
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
import androidx.compose.ui.focus.FocusChangedModifierKt;
import androidx.compose.ui.focus.FocusState;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.res.PainterResources_androidKt;
import androidx.compose.ui.res.StringResources_androidKt;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.TextUnitKt;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.exifinterface.media.ExifInterface;
import io.ably.lib.transport.Defaults;
import io.intercom.android.sdk.R;
import io.intercom.android.sdk.blocks.lib.models.Block;
import io.intercom.android.sdk.m5.components.IntercomErrorScreenKt;
import io.intercom.android.sdk.m5.components.IntercomPrimaryButtonKt;
import io.intercom.android.sdk.m5.components.LoadingScreenKt;
import io.intercom.android.sdk.m5.components.TopActionBarKt;
import io.intercom.android.sdk.survey.QuestionState;
import io.intercom.android.sdk.survey.SurveyUiColors;
import io.intercom.android.sdk.survey.model.SurveyData;
import io.intercom.android.sdk.survey.ui.components.QuestionComponentKt;
import io.intercom.android.sdk.survey.ui.models.Answer;
import io.intercom.android.sdk.survey.ui.questiontype.AnswerClickData;
import io.intercom.android.sdk.tickets.create.model.CreateTicketViewModel;
import io.intercom.android.sdk.ui.IntercomPreviews;
import io.intercom.android.sdk.ui.theme.IntercomTheme;
import io.intercom.android.sdk.ui.theme.IntercomThemeKt;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: CreateTicketContentScreen.kt */
@Metadata(d1 = {"\u0000F\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\u001ag\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00010\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00010\u00052\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00010\u00052\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00010\t2\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u00010\tH\u0001¢\u0006\u0002\u0010\r\u001ac\u0010\u000e\u001a\u00020\u00012\b\b\u0002\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00010\u00052\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00010\u00052\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00010\t2\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u00010\tH\u0001¢\u0006\u0002\u0010\u0013\u001a\r\u0010\u0014\u001a\u00020\u0001H\u0003¢\u0006\u0002\u0010\u0015\u001a\r\u0010\u0016\u001a\u00020\u0001H\u0003¢\u0006\u0002\u0010\u0015\u001a\r\u0010\u0017\u001a\u00020\u0001H\u0003¢\u0006\u0002\u0010\u0015\u001a\r\u0010\u0018\u001a\u00020\u0001H\u0003¢\u0006\u0002\u0010\u0015\"\u000e\u0010\u0019\u001a\u00020\u001aX\u0082\u0004¢\u0006\u0002\n\u0000\"\u0014\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001d0\u001cX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001e"}, d2 = {"CreateTicketScreen", "", "uiState", "Lio/intercom/android/sdk/tickets/create/model/CreateTicketViewModel$CreateTicketFormUiState;", "onBackClick", "Lkotlin/Function0;", "onCreateTicket", "onCancel", "onAnswerUpdated", "Lkotlin/Function1;", "", "onAnswerClick", "Lio/intercom/android/sdk/survey/ui/questiontype/AnswerClickData;", "(Lio/intercom/android/sdk/tickets/create/model/CreateTicketViewModel$CreateTicketFormUiState;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V", "CreateTicketContentScreen", "modifier", "Landroidx/compose/ui/Modifier;", "state", "Lio/intercom/android/sdk/tickets/create/model/CreateTicketViewModel$CreateTicketFormUiState$Content;", "(Landroidx/compose/ui/Modifier;Lio/intercom/android/sdk/tickets/create/model/CreateTicketViewModel$CreateTicketFormUiState$Content;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "CreateTicketContentScreenPreview", "(Landroidx/compose/runtime/Composer;I)V", "CreateTicketLoadingPreview", "CreateTicketErrorPreview", "CreateTicketContentErrorScreenPreview", "surveyUiColors", "Lio/intercom/android/sdk/survey/SurveyUiColors;", "questions", "", "Lio/intercom/android/sdk/survey/QuestionState;", "intercom-sdk-base_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class CreateTicketContentScreenKt {
    private static final List<QuestionState> questions;
    private static final SurveyUiColors surveyUiColors;

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit CreateTicketContentErrorScreenPreview$lambda$8(int i, Composer composer, int i2) {
        CreateTicketContentErrorScreenPreview(composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit CreateTicketContentScreen$lambda$4(Modifier modifier, CreateTicketViewModel.CreateTicketFormUiState.Content state, Function0 onCreateTicket, Function0 onCancel, Function1 onAnswerUpdated, Function1 onAnswerClick, int i, int i2, Composer composer, int i3) {
        Intrinsics.checkNotNullParameter(state, "$state");
        Intrinsics.checkNotNullParameter(onCreateTicket, "$onCreateTicket");
        Intrinsics.checkNotNullParameter(onCancel, "$onCancel");
        Intrinsics.checkNotNullParameter(onAnswerUpdated, "$onAnswerUpdated");
        Intrinsics.checkNotNullParameter(onAnswerClick, "$onAnswerClick");
        CreateTicketContentScreen(modifier, state, onCreateTicket, onCancel, onAnswerUpdated, onAnswerClick, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit CreateTicketContentScreenPreview$lambda$5(int i, Composer composer, int i2) {
        CreateTicketContentScreenPreview(composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit CreateTicketErrorPreview$lambda$7(int i, Composer composer, int i2) {
        CreateTicketErrorPreview(composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit CreateTicketLoadingPreview$lambda$6(int i, Composer composer, int i2) {
        CreateTicketLoadingPreview(composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit CreateTicketScreen$lambda$0(CreateTicketViewModel.CreateTicketFormUiState uiState, Function0 onBackClick, Function0 onCreateTicket, Function0 onCancel, Function1 onAnswerUpdated, Function1 onAnswerClick, int i, Composer composer, int i2) {
        Intrinsics.checkNotNullParameter(uiState, "$uiState");
        Intrinsics.checkNotNullParameter(onBackClick, "$onBackClick");
        Intrinsics.checkNotNullParameter(onCreateTicket, "$onCreateTicket");
        Intrinsics.checkNotNullParameter(onCancel, "$onCancel");
        Intrinsics.checkNotNullParameter(onAnswerUpdated, "$onAnswerUpdated");
        Intrinsics.checkNotNullParameter(onAnswerClick, "$onAnswerClick");
        CreateTicketScreen(uiState, onBackClick, onCreateTicket, onCancel, onAnswerUpdated, onAnswerClick, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    public static final void CreateTicketScreen(final CreateTicketViewModel.CreateTicketFormUiState uiState, final Function0<Unit> onBackClick, final Function0<Unit> onCreateTicket, final Function0<Unit> onCancel, final Function1<? super String, Unit> onAnswerUpdated, final Function1<? super AnswerClickData, Unit> onAnswerClick, Composer composer, final int i) {
        int i2;
        Composer composer2;
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        Intrinsics.checkNotNullParameter(onBackClick, "onBackClick");
        Intrinsics.checkNotNullParameter(onCreateTicket, "onCreateTicket");
        Intrinsics.checkNotNullParameter(onCancel, "onCancel");
        Intrinsics.checkNotNullParameter(onAnswerUpdated, "onAnswerUpdated");
        Intrinsics.checkNotNullParameter(onAnswerClick, "onAnswerClick");
        Composer startRestartGroup = composer.startRestartGroup(-2129527205);
        if ((i & 14) == 0) {
            i2 = (startRestartGroup.changed(uiState) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 112) == 0) {
            i2 |= startRestartGroup.changedInstance(onBackClick) ? 32 : 16;
        }
        if ((i & 896) == 0) {
            i2 |= startRestartGroup.changedInstance(onCreateTicket) ? 256 : 128;
        }
        if ((i & 7168) == 0) {
            i2 |= startRestartGroup.changedInstance(onCancel) ? 2048 : 1024;
        }
        if ((57344 & i) == 0) {
            i2 |= startRestartGroup.changedInstance(onAnswerUpdated) ? 16384 : 8192;
        }
        if ((458752 & i) == 0) {
            i2 |= startRestartGroup.changedInstance(onAnswerClick) ? 131072 : 65536;
        }
        if ((i2 & 374491) != 74898 || !startRestartGroup.getSkipping()) {
            composer2 = startRestartGroup;
            ScaffoldKt.m3518ScaffoldTvnljyQ(WindowInsetsPaddingKt.windowInsetsPadding(BackgroundKt.m582backgroundbw27NRU$default(Modifier.INSTANCE, IntercomTheme.INSTANCE.getColors(startRestartGroup, IntercomTheme.$stable).m13094getBackground0d7_KjU(), null, 2, null), WindowInsets_androidKt.getDisplayCutout(WindowInsets.INSTANCE, startRestartGroup, 8)), ComposableLambdaKt.rememberComposableLambda(-2106967777, true, new Function2<Composer, Integer, Unit>() { // from class: io.intercom.android.sdk.tickets.create.ui.CreateTicketContentScreenKt$CreateTicketScreen$1
                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                    invoke(composer3, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(Composer composer3, int i3) {
                    if ((i3 & 11) != 2 || !composer3.getSkipping()) {
                        CreateTicketViewModel.CreateTicketFormUiState createTicketFormUiState = CreateTicketViewModel.CreateTicketFormUiState.this;
                        TopActionBarKt.m12131TopActionBarNpQZenA(null, createTicketFormUiState instanceof CreateTicketViewModel.CreateTicketFormUiState.Content ? ((CreateTicketViewModel.CreateTicketFormUiState.Content) createTicketFormUiState).getTitle() : "", null, null, null, onBackClick, null, false, 0L, 0L, 0L, null, null, composer3, 0, 0, 8157);
                    } else {
                        composer3.skipToGroupEnd();
                    }
                }
            }, startRestartGroup, 54), null, null, null, 0, 0L, 0L, null, ComposableLambdaKt.rememberComposableLambda(426563690, true, new Function3<PaddingValues, Composer, Integer, Unit>() { // from class: io.intercom.android.sdk.tickets.create.ui.CreateTicketContentScreenKt$CreateTicketScreen$2
                @Override // kotlin.jvm.functions.Function3
                public /* bridge */ /* synthetic */ Unit invoke(PaddingValues paddingValues, Composer composer3, Integer num) {
                    invoke(paddingValues, composer3, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(PaddingValues contentPadding, Composer composer3, int i3) {
                    Intrinsics.checkNotNullParameter(contentPadding, "contentPadding");
                    if ((i3 & 14) == 0) {
                        i3 |= composer3.changed(contentPadding) ? 4 : 2;
                    }
                    if ((i3 & 91) != 18 || !composer3.getSkipping()) {
                        CreateTicketViewModel.CreateTicketFormUiState createTicketFormUiState = CreateTicketViewModel.CreateTicketFormUiState.this;
                        if (Intrinsics.areEqual(createTicketFormUiState, CreateTicketViewModel.CreateTicketFormUiState.Initial.INSTANCE)) {
                            composer3.startReplaceGroup(-1277613046);
                            composer3.endReplaceGroup();
                            return;
                        }
                        if (createTicketFormUiState instanceof CreateTicketViewModel.CreateTicketFormUiState.Content) {
                            composer3.startReplaceGroup(-1277572622);
                            CreateTicketContentScreenKt.CreateTicketContentScreen(PaddingKt.padding(Modifier.INSTANCE, contentPadding), (CreateTicketViewModel.CreateTicketFormUiState.Content) CreateTicketViewModel.CreateTicketFormUiState.this, onCreateTicket, onCancel, onAnswerUpdated, onAnswerClick, composer3, 64, 0);
                            composer3.endReplaceGroup();
                            return;
                        } else if (createTicketFormUiState instanceof CreateTicketViewModel.CreateTicketFormUiState.Error) {
                            composer3.startReplaceGroup(-1277133631);
                            IntercomErrorScreenKt.IntercomErrorScreen(((CreateTicketViewModel.CreateTicketFormUiState.Error) CreateTicketViewModel.CreateTicketFormUiState.this).getErrorState(), PaddingKt.padding(Modifier.INSTANCE, contentPadding), composer3, 0, 0);
                            composer3.endReplaceGroup();
                            return;
                        } else {
                            if (!Intrinsics.areEqual(createTicketFormUiState, CreateTicketViewModel.CreateTicketFormUiState.Loading.INSTANCE)) {
                                composer3.startReplaceGroup(97332199);
                                composer3.endReplaceGroup();
                                throw new NoWhenBranchMatchedException();
                            }
                            composer3.startReplaceGroup(97356214);
                            LoadingScreenKt.LoadingScreen(PaddingKt.padding(Modifier.INSTANCE, contentPadding), R.drawable.intercom_content_loading, composer3, 0, 0);
                            composer3.endReplaceGroup();
                            return;
                        }
                    }
                    composer3.skipToGroupEnd();
                }
            }, startRestartGroup, 54), composer2, 805306416, TypedValues.PositionType.TYPE_CURVE_FIT);
        } else {
            startRestartGroup.skipToGroupEnd();
            composer2 = startRestartGroup;
        }
        ScopeUpdateScope endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new Function2() { // from class: io.intercom.android.sdk.tickets.create.ui.CreateTicketContentScreenKt$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    Unit CreateTicketScreen$lambda$0;
                    CreateTicketScreen$lambda$0 = CreateTicketContentScreenKt.CreateTicketScreen$lambda$0(CreateTicketViewModel.CreateTicketFormUiState.this, onBackClick, onCreateTicket, onCancel, onAnswerUpdated, onAnswerClick, i, (Composer) obj, ((Integer) obj2).intValue());
                    return CreateTicketScreen$lambda$0;
                }
            });
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void CreateTicketContentScreen(Modifier modifier, final CreateTicketViewModel.CreateTicketFormUiState.Content state, final Function0<Unit> onCreateTicket, final Function0<Unit> onCancel, final Function1<? super String, Unit> function1, final Function1<? super AnswerClickData, Unit> function12, Composer composer, final int i, final int i2) {
        SurveyUiColors surveyUiColors2;
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(onCreateTicket, "onCreateTicket");
        Intrinsics.checkNotNullParameter(onCancel, "onCancel");
        Function1<? super String, Unit> onAnswerUpdated = function1;
        Intrinsics.checkNotNullParameter(onAnswerUpdated, "onAnswerUpdated");
        Function1<? super AnswerClickData, Unit> onAnswerClick = function12;
        Intrinsics.checkNotNullParameter(onAnswerClick, "onAnswerClick");
        Composer startRestartGroup = composer.startRestartGroup(-296750187);
        Modifier.Companion companion = (i2 & 1) != 0 ? Modifier.INSTANCE : modifier;
        int i3 = 0;
        float f = 16;
        Modifier m1159paddingVpY3zN4$default = PaddingKt.m1159paddingVpY3zN4$default(BackgroundKt.m582backgroundbw27NRU$default(ScrollKt.verticalScroll$default(SizeKt.fillMaxSize$default(companion, 0.0f, 1, null), ScrollKt.rememberScrollState(0, startRestartGroup, 0, 1), true, null, false, 12, null), IntercomTheme.INSTANCE.getColors(startRestartGroup, IntercomTheme.$stable).m13094getBackground0d7_KjU(), null, 2, null), Dp.m8798constructorimpl(f), 0.0f, 2, null);
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, 1341605231, "CC(Column)N(modifier,verticalArrangement,horizontalAlignment,content)87@4443L61,88@4509L134:Column.kt#2w3rfo");
        MeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), startRestartGroup, 0);
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1159599143, "CC(Layout)P(!1,2)80@3267L27,83@3433L360:Layout.kt#80mrfh");
        int hashCode = Long.hashCode(ComposablesKt.getCurrentCompositeKeyHashCode(startRestartGroup, 0));
        CompositionLocalMap currentCompositionLocalMap = startRestartGroup.getCurrentCompositionLocalMap();
        Modifier materializeModifier = ComposedModifierKt.materializeModifier(startRestartGroup, m1159paddingVpY3zN4$default);
        Function0<ComposeUiNode> constructor = ComposeUiNode.INSTANCE.getConstructor();
        int i4 = 16;
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
        char c = 6;
        SpacerKt.Spacer(SizeKt.m1195height3ABfNKs(Modifier.INSTANCE, Dp.m8798constructorimpl(f)), startRestartGroup, 6);
        startRestartGroup.startReplaceGroup(-210345224);
        for (final QuestionState questionState : state.getQuestions()) {
            if (questionState.getQuestionModel() instanceof SurveyData.Step.Question.SingleChoiceQuestionModel) {
                startRestartGroup.startReplaceGroup(-267718574);
                surveyUiColors2 = new SurveyUiColors(IntercomTheme.INSTANCE.getColors(startRestartGroup, IntercomTheme.$stable).m13094getBackground0d7_KjU(), IntercomTheme.INSTANCE.getColors(startRestartGroup, IntercomTheme.$stable).m13116getPrimaryText0d7_KjU(), IntercomTheme.INSTANCE.getColors(startRestartGroup, IntercomTheme.$stable).m13089getAction0d7_KjU(), IntercomTheme.INSTANCE.getColors(startRestartGroup, IntercomTheme.$stable).m13110getOnAction0d7_KjU(), null, 16, null);
                startRestartGroup.endReplaceGroup();
            } else {
                startRestartGroup.startReplaceGroup(-267313094);
                surveyUiColors2 = new SurveyUiColors(IntercomTheme.INSTANCE.getColors(startRestartGroup, IntercomTheme.$stable).m13094getBackground0d7_KjU(), IntercomTheme.INSTANCE.getColors(startRestartGroup, IntercomTheme.$stable).m13116getPrimaryText0d7_KjU(), IntercomTheme.INSTANCE.getColors(startRestartGroup, IntercomTheme.$stable).m13094getBackground0d7_KjU(), IntercomTheme.INSTANCE.getColors(startRestartGroup, IntercomTheme.$stable).m13116getPrimaryText0d7_KjU(), Color.m6029boximpl(IntercomTheme.INSTANCE.getColors(startRestartGroup, IntercomTheme.$stable).m13089getAction0d7_KjU()), null);
                startRestartGroup.endReplaceGroup();
            }
            Composer composer2 = startRestartGroup;
            QuestionComponentKt.m12693QuestionComponentlzVJ5Jw(FocusChangedModifierKt.onFocusChanged(Modifier.INSTANCE, new Function1() { // from class: io.intercom.android.sdk.tickets.create.ui.CreateTicketContentScreenKt$$ExternalSyntheticLambda5
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    Unit CreateTicketContentScreen$lambda$3$lambda$2$lambda$1;
                    CreateTicketContentScreen$lambda$3$lambda$2$lambda$1 = CreateTicketContentScreenKt.CreateTicketContentScreen$lambda$3$lambda$2$lambda$1(QuestionState.this, (FocusState) obj);
                    return CreateTicketContentScreen$lambda$3$lambda$2$lambda$1;
                }
            }), PaddingKt.m1161paddingqDBjuR0$default(Modifier.INSTANCE, 0.0f, Dp.m8798constructorimpl(24), 0.0f, 0.0f, 13, null), questionState, surveyUiColors2, onAnswerUpdated, IntercomTheme.INSTANCE.getColors(startRestartGroup, IntercomTheme.$stable).m13094getBackground0d7_KjU(), Dp.m8798constructorimpl(i3), FontWeight.INSTANCE.getSemiBold(), TextUnitKt.getSp(i4), onAnswerClick, composer2, (i & 57344) | 114819632 | ((i << 12) & 1879048192), 0);
            onAnswerUpdated = function1;
            onAnswerClick = function12;
            i3 = i3;
            startRestartGroup = composer2;
            f = f;
            i4 = i4;
            companion = companion;
            c = 6;
        }
        final Modifier modifier2 = companion;
        int i5 = i3;
        float f2 = f;
        startRestartGroup.endReplaceGroup();
        SpacerKt.Spacer(ColumnScope.weight$default(columnScopeInstance, modifier2, 1.0f, false, 2, null), startRestartGroup, i5);
        IntercomPrimaryButtonKt.LegacyIntercomPrimaryButton(onCreateTicket, PaddingKt.m1161paddingqDBjuR0$default(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), 0.0f, Dp.m8798constructorimpl(24), 0.0f, 0.0f, 13, null), (!state.getEnableCta() || state.getShowCreatingTicketProgress()) ? i5 : 1, ComposableLambdaKt.rememberComposableLambda(-964987781, true, new Function3<RowScope, Composer, Integer, Unit>() { // from class: io.intercom.android.sdk.tickets.create.ui.CreateTicketContentScreenKt$CreateTicketContentScreen$1$2
            @Override // kotlin.jvm.functions.Function3
            public /* bridge */ /* synthetic */ Unit invoke(RowScope rowScope, Composer composer3, Integer num) {
                invoke(rowScope, composer3, num.intValue());
                return Unit.INSTANCE;
            }

            public final void invoke(RowScope LegacyIntercomPrimaryButton, Composer composer3, int i6) {
                Intrinsics.checkNotNullParameter(LegacyIntercomPrimaryButton, "$this$LegacyIntercomPrimaryButton");
                if ((i6 & 81) != 16 || !composer3.getSkipping()) {
                    if (CreateTicketViewModel.CreateTicketFormUiState.Content.this.getShowCreatingTicketProgress()) {
                        composer3.startReplaceGroup(-265539615);
                        ProgressIndicatorKt.m3476CircularProgressIndicator4lLiAd8(SizeKt.m1209size3ABfNKs(Modifier.INSTANCE, Dp.m8798constructorimpl(24)), 0L, Dp.m8798constructorimpl(2), 0L, 0, 0.0f, composer3, 390, 58);
                        composer3.endReplaceGroup();
                        return;
                    }
                    composer3.startReplaceGroup(-265348128);
                    Alignment.Vertical centerVertically = Alignment.INSTANCE.getCenterVertically();
                    ComposerKt.sourceInformationMarkerStart(composer3, 844473419, "CC(Row)N(modifier,horizontalArrangement,verticalAlignment,content)99@5125L58,100@5188L131:Row.kt#2w3rfo");
                    Modifier.Companion companion2 = Modifier.INSTANCE;
                    MeasurePolicy rowMeasurePolicy = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), centerVertically, composer3, 48);
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
                    Updater.m5340setimpl(m5333constructorimpl2, rowMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                    Updater.m5340setimpl(m5333constructorimpl2, currentCompositionLocalMap2, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                    Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                    if (m5333constructorimpl2.getInserting() || !Intrinsics.areEqual(m5333constructorimpl2.rememberedValue(), Integer.valueOf(hashCode2))) {
                        m5333constructorimpl2.updateRememberedValue(Integer.valueOf(hashCode2));
                        m5333constructorimpl2.apply(Integer.valueOf(hashCode2), setCompositeKeyHash2);
                    }
                    Updater.m5340setimpl(m5333constructorimpl2, materializeModifier2, ComposeUiNode.INSTANCE.getSetModifier());
                    ComposerKt.sourceInformationMarkerStart(composer3, 1456264949, "C101@5233L9:Row.kt#2w3rfo");
                    RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
                    TextKt.m3901TextNvy7gAk(StringResources_androidKt.stringResource(R.string.intercom_tickets_create_ticket, composer3, 0), null, IntercomTheme.INSTANCE.getColors(composer3, IntercomTheme.$stable).m13110getOnAction0d7_KjU(), null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, IntercomTheme.INSTANCE.getTypography(composer3, IntercomTheme.$stable).getType04(), composer3, 0, 0, 131066);
                    SpacerKt.Spacer(SizeKt.m1214width3ABfNKs(Modifier.INSTANCE, Dp.m8798constructorimpl(6)), composer3, 6);
                    IconKt.m3194Iconww6aTOc(PainterResources_androidKt.painterResource(R.drawable.intercom_ticket_detail_icon, composer3, 0), (String) null, SizeKt.m1209size3ABfNKs(Modifier.INSTANCE, Dp.m8798constructorimpl(16)), IntercomTheme.INSTANCE.getColors(composer3, IntercomTheme.$stable).m13110getOnAction0d7_KjU(), composer3, 440, 0);
                    ComposerKt.sourceInformationMarkerEnd(composer3);
                    composer3.endNode();
                    ComposerKt.sourceInformationMarkerEnd(composer3);
                    ComposerKt.sourceInformationMarkerEnd(composer3);
                    ComposerKt.sourceInformationMarkerEnd(composer3);
                    composer3.endReplaceGroup();
                    return;
                }
                composer3.skipToGroupEnd();
            }
        }, startRestartGroup, 54), startRestartGroup, ((i >> 6) & 14) | 3120, 0);
        Composer composer3 = startRestartGroup;
        ButtonKt.TextButton(onCancel, SizeKt.m1195height3ABfNKs(PaddingKt.m1161paddingqDBjuR0$default(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), 0.0f, Dp.m8798constructorimpl(8), 0.0f, Dp.m8798constructorimpl(f2), 5, null), Dp.m8798constructorimpl(48)), false, IntercomTheme.INSTANCE.getShapes(startRestartGroup, IntercomTheme.$stable).getSmall(), ButtonDefaults.INSTANCE.m2718textButtonColorsro_MJ88(0L, IntercomTheme.INSTANCE.getColors(startRestartGroup, IntercomTheme.$stable).m13116getPrimaryText0d7_KjU(), 0L, 0L, composer3, ButtonDefaults.$stable << 12, 13), null, null, null, null, ComposableSingletons$CreateTicketContentScreenKt.INSTANCE.m12850getLambda1$intercom_sdk_base_release(), composer3, ((i >> 9) & 14) | 805306416, 484);
        SpacerKt.Spacer(SizeKt.m1195height3ABfNKs(Modifier.INSTANCE, Dp.m8798constructorimpl(f2)), composer3, 6);
        ComposerKt.sourceInformationMarkerEnd(composer3);
        composer3.endNode();
        ComposerKt.sourceInformationMarkerEnd(composer3);
        ComposerKt.sourceInformationMarkerEnd(composer3);
        ComposerKt.sourceInformationMarkerEnd(composer3);
        ScopeUpdateScope endRestartGroup = composer3.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new Function2() { // from class: io.intercom.android.sdk.tickets.create.ui.CreateTicketContentScreenKt$$ExternalSyntheticLambda6
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    Unit CreateTicketContentScreen$lambda$4;
                    CreateTicketContentScreen$lambda$4 = CreateTicketContentScreenKt.CreateTicketContentScreen$lambda$4(Modifier.this, state, onCreateTicket, onCancel, function1, function12, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                    return CreateTicketContentScreen$lambda$4;
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit CreateTicketContentScreen$lambda$3$lambda$2$lambda$1(QuestionState questionState, FocusState it) {
        Intrinsics.checkNotNullParameter(questionState, "$questionState");
        Intrinsics.checkNotNullParameter(it, "it");
        if ((questionState.getQuestionModel() instanceof SurveyData.Step.Question.ShortTextQuestionModel) && !(questionState.getAnswer() instanceof Answer.NoAnswer.InitialNoAnswer) && !it.getHasFocus()) {
            questionState.validate();
        }
        return Unit.INSTANCE;
    }

    @IntercomPreviews
    private static final void CreateTicketContentScreenPreview(Composer composer, final int i) {
        Composer startRestartGroup = composer.startRestartGroup(-1070922859);
        if (i != 0 || !startRestartGroup.getSkipping()) {
            IntercomThemeKt.IntercomTheme(null, null, null, ComposableSingletons$CreateTicketContentScreenKt.INSTANCE.m12851getLambda2$intercom_sdk_base_release(), startRestartGroup, 3072, 7);
        } else {
            startRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new Function2() { // from class: io.intercom.android.sdk.tickets.create.ui.CreateTicketContentScreenKt$$ExternalSyntheticLambda3
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    Unit CreateTicketContentScreenPreview$lambda$5;
                    CreateTicketContentScreenPreview$lambda$5 = CreateTicketContentScreenKt.CreateTicketContentScreenPreview$lambda$5(i, (Composer) obj, ((Integer) obj2).intValue());
                    return CreateTicketContentScreenPreview$lambda$5;
                }
            });
        }
    }

    @IntercomPreviews
    private static final void CreateTicketLoadingPreview(Composer composer, final int i) {
        Composer startRestartGroup = composer.startRestartGroup(1078617214);
        if (i != 0 || !startRestartGroup.getSkipping()) {
            IntercomThemeKt.IntercomTheme(null, null, null, ComposableSingletons$CreateTicketContentScreenKt.INSTANCE.m12852getLambda3$intercom_sdk_base_release(), startRestartGroup, 3072, 7);
        } else {
            startRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new Function2() { // from class: io.intercom.android.sdk.tickets.create.ui.CreateTicketContentScreenKt$$ExternalSyntheticLambda2
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    Unit CreateTicketLoadingPreview$lambda$6;
                    CreateTicketLoadingPreview$lambda$6 = CreateTicketContentScreenKt.CreateTicketLoadingPreview$lambda$6(i, (Composer) obj, ((Integer) obj2).intValue());
                    return CreateTicketLoadingPreview$lambda$6;
                }
            });
        }
    }

    @IntercomPreviews
    private static final void CreateTicketErrorPreview(Composer composer, final int i) {
        Composer startRestartGroup = composer.startRestartGroup(-627794766);
        if (i != 0 || !startRestartGroup.getSkipping()) {
            IntercomThemeKt.IntercomTheme(null, null, null, ComposableSingletons$CreateTicketContentScreenKt.INSTANCE.m12853getLambda4$intercom_sdk_base_release(), startRestartGroup, 3072, 7);
        } else {
            startRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new Function2() { // from class: io.intercom.android.sdk.tickets.create.ui.CreateTicketContentScreenKt$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    Unit CreateTicketErrorPreview$lambda$7;
                    CreateTicketErrorPreview$lambda$7 = CreateTicketContentScreenKt.CreateTicketErrorPreview$lambda$7(i, (Composer) obj, ((Integer) obj2).intValue());
                    return CreateTicketErrorPreview$lambda$7;
                }
            });
        }
    }

    @IntercomPreviews
    private static final void CreateTicketContentErrorScreenPreview(Composer composer, final int i) {
        Composer startRestartGroup = composer.startRestartGroup(1908579859);
        if (i != 0 || !startRestartGroup.getSkipping()) {
            IntercomThemeKt.IntercomTheme(null, null, null, ComposableSingletons$CreateTicketContentScreenKt.INSTANCE.m12854getLambda5$intercom_sdk_base_release(), startRestartGroup, 3072, 7);
        } else {
            startRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new Function2() { // from class: io.intercom.android.sdk.tickets.create.ui.CreateTicketContentScreenKt$$ExternalSyntheticLambda4
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    Unit CreateTicketContentErrorScreenPreview$lambda$8;
                    CreateTicketContentErrorScreenPreview$lambda$8 = CreateTicketContentScreenKt.CreateTicketContentErrorScreenPreview$lambda$8(i, (Composer) obj, ((Integer) obj2).intValue());
                    return CreateTicketContentErrorScreenPreview$lambda$8;
                }
            });
        }
    }

    static {
        SurveyUiColors surveyUiColors2 = new SurveyUiColors(Color.INSTANCE.m6065getBlack0d7_KjU(), Color.INSTANCE.m6076getWhite0d7_KjU(), Color.INSTANCE.m6077getYellow0d7_KjU(), Color.INSTANCE.m6066getBlue0d7_KjU(), null, 16, null);
        surveyUiColors = surveyUiColors2;
        questions = CollectionsKt.listOf((Object[]) new QuestionState[]{new QuestionState(new SurveyData.Step.Question.ShortTextQuestionModel("1", CollectionsKt.listOf(new Block.Builder().withText("Email").withType("paragraph")), false, "abc@example.com", SurveyData.Step.Question.QuestionValidation.ValidationType.EMAIL, null, false, null, null, 448, null), surveyUiColors2), new QuestionState(new SurveyData.Step.Question.LongTextQuestionModel(ExifInterface.GPS_MEASUREMENT_2D, CollectionsKt.listOf(new Block.Builder().withText("Multiline text").withType("paragraph")), true, "Enter text here...", SurveyData.Step.Question.QuestionValidation.ValidationType.EMAIL, null, Dp.m8798constructorimpl(120), 0, null, 384, null), surveyUiColors2), new QuestionState(new SurveyData.Step.Question.DropDownQuestionModel(ExifInterface.GPS_MEASUREMENT_3D, CollectionsKt.listOf(new Block.Builder().withText("List attribute").withType("paragraph")), true, CollectionsKt.listOf((Object[]) new String[]{"Option A", "Option B", "Option C"}), "Please select...", null, 32, null), surveyUiColors2), new QuestionState(new SurveyData.Step.Question.SingleChoiceQuestionModel(Defaults.ABLY_PROTOCOL_VERSION, CollectionsKt.listOf(new Block.Builder().withText("Boolean").withType("paragraph")), false, CollectionsKt.listOf((Object[]) new String[]{"True", "False"}), false), surveyUiColors2), new QuestionState(new SurveyData.Step.Question.DatePickerQuestionModel("5", CollectionsKt.listOf(new Block.Builder().withText("Date and Time").withType("paragraph")), true), surveyUiColors2), new QuestionState(new SurveyData.Step.Question.DatePickerQuestionModel("5", CollectionsKt.listOf(new Block.Builder().withText("Date and Time").withType("paragraph")), true), surveyUiColors2)});
    }
}
