package io.intercom.android.sdk.m5.conversation.ui.components.composer;

import android.content.Context;
import androidx.compose.animation.AnimatedVisibilityKt;
import androidx.compose.animation.EnterExitTransitionKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.BoxWithConstraintsScope;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.WindowInsets;
import androidx.compose.foundation.layout.WindowInsetsKt;
import androidx.compose.foundation.layout.WindowInsetsPadding_androidKt;
import androidx.compose.foundation.layout.WindowInsets_androidKt;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.ProvidableCompositionLocal;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.platform.SoftwareKeyboardController;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.viewinterop.AndroidView_androidKt;
import io.intercom.android.sdk.Injector;
import io.intercom.android.sdk.activities.ConversationReactionListener;
import io.intercom.android.sdk.conversation.ReactionInputView;
import io.intercom.android.sdk.conversation.ReactionListener;
import io.intercom.android.sdk.m5.components.ConversationEndedCardKt;
import io.intercom.android.sdk.m5.conversation.metrics.MetricData;
import io.intercom.android.sdk.m5.conversation.states.BottomBarUiState;
import io.intercom.android.sdk.m5.conversation.states.ComposerState;
import io.intercom.android.sdk.m5.conversation.states.ComposerUiEffect;
import io.intercom.android.sdk.m5.conversation.states.VoiceTranscriptionState;
import io.intercom.android.sdk.m5.conversation.utils.KeyboardState;
import io.intercom.android.sdk.m5.conversation.utils.KeyboardStateKt;
import io.intercom.android.sdk.metrics.MetricTracker;
import io.intercom.android.sdk.ui.common.StringProvider;
import io.intercom.android.sdk.ui.component.IntercomDividerKt;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;
import kotlinx.coroutines.flow.SharedFlow;
import kotlinx.coroutines.flow.StateFlow;

/* compiled from: ConversationBottomBar.kt */
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes9.dex */
final class ConversationBottomBarKt$ConversationBottomBar$6 implements Function3<BoxWithConstraintsScope, Composer, Integer, Unit> {
    final /* synthetic */ StateFlow<Float> $amplitudeLevel;
    final /* synthetic */ BottomBarUiState $bottomBarUiState;
    final /* synthetic */ SharedFlow<ComposerUiEffect> $composerUiEffect;
    final /* synthetic */ Function1<String, Unit> $navigateToAnotherConversation;
    final /* synthetic */ Function0<Unit> $onCancelVoiceRecording;
    final /* synthetic */ Function0<Unit> $onGifInputSelected;
    final /* synthetic */ Function1<ComposerInputType, Unit> $onInputChange;
    final /* synthetic */ Function0<Unit> $onMediaInputSelected;
    final /* synthetic */ Function0<Unit> $onNewConversationClicked;
    final /* synthetic */ Function0<Unit> $onPrivacyNoticeDismissed;
    final /* synthetic */ Function1<String, Unit> $onSendMessage;
    final /* synthetic */ Function0<Unit> $onStartVoiceRecording;
    final /* synthetic */ Function0<Unit> $onStopVoiceRecording;
    final /* synthetic */ Function0<Unit> $onTyping;
    final /* synthetic */ float $topSpacing;
    final /* synthetic */ Function1<MetricData, Unit> $trackMetric;
    final /* synthetic */ VoiceTranscriptionState $voiceTranscriptionState;

    /* JADX WARN: Multi-variable type inference failed */
    ConversationBottomBarKt$ConversationBottomBar$6(float f, BottomBarUiState bottomBarUiState, Function1<? super String, Unit> function1, Function0<Unit> function0, Function0<Unit> function02, Function1<? super ComposerInputType, Unit> function12, Function1<? super MetricData, Unit> function13, Function0<Unit> function03, SharedFlow<? extends ComposerUiEffect> sharedFlow, VoiceTranscriptionState voiceTranscriptionState, StateFlow<Float> stateFlow, Function0<Unit> function04, Function0<Unit> function05, Function0<Unit> function06, Function0<Unit> function07, Function1<? super String, Unit> function14, Function0<Unit> function08) {
        this.$topSpacing = f;
        this.$bottomBarUiState = bottomBarUiState;
        this.$onSendMessage = function1;
        this.$onGifInputSelected = function0;
        this.$onMediaInputSelected = function02;
        this.$onInputChange = function12;
        this.$trackMetric = function13;
        this.$onTyping = function03;
        this.$composerUiEffect = sharedFlow;
        this.$voiceTranscriptionState = voiceTranscriptionState;
        this.$amplitudeLevel = stateFlow;
        this.$onStartVoiceRecording = function04;
        this.$onStopVoiceRecording = function05;
        this.$onCancelVoiceRecording = function06;
        this.$onNewConversationClicked = function07;
        this.$navigateToAnotherConversation = function14;
        this.$onPrivacyNoticeDismissed = function08;
    }

    @Override // kotlin.jvm.functions.Function3
    public /* bridge */ /* synthetic */ Unit invoke(BoxWithConstraintsScope boxWithConstraintsScope, Composer composer, Integer num) {
        invoke(boxWithConstraintsScope, composer, num.intValue());
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:58:0x045f  */
    /* JADX WARN: Type inference failed for: r15v1 */
    /* JADX WARN: Type inference failed for: r15v3 */
    /* JADX WARN: Type inference failed for: r15v4, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r15v5 */
    /* JADX WARN: Type inference failed for: r9v11 */
    /* JADX WARN: Type inference failed for: r9v13 */
    /* JADX WARN: Type inference failed for: r9v14, types: [androidx.compose.animation.core.FiniteAnimationSpec, java.lang.Object, kotlin.jvm.functions.Function1] */
    /* JADX WARN: Type inference failed for: r9v17 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void invoke(BoxWithConstraintsScope BoxWithConstraints, Composer composer, int i) {
        int i2;
        boolean z;
        Object obj;
        String str;
        ColumnScopeInstance columnScopeInstance;
        State<KeyboardState> state;
        Function1<MetricData, Unit> function1;
        float f;
        ?? r9;
        ?? r15;
        final BottomBarUiState bottomBarUiState;
        Function0<Unit> function0;
        Composer composer2 = composer;
        Intrinsics.checkNotNullParameter(BoxWithConstraints, "$this$BoxWithConstraints");
        if ((i & 14) == 0) {
            i2 = i | (composer2.changed(BoxWithConstraints) ? 4 : 2);
        } else {
            i2 = i;
        }
        if ((i2 & 91) == 18 && composer2.getSkipping()) {
            composer2.skipToGroupEnd();
            return;
        }
        float m8798constructorimpl = Dp.m8798constructorimpl(RangesKt.coerceAtLeast(Dp.m8798constructorimpl(Dp.m8798constructorimpl(BoxWithConstraints.mo1044getMaxHeightD9Ej5fM() - this.$topSpacing) - WindowInsetsKt.asPaddingValues(WindowInsets_androidKt.getSystemBars(WindowInsets.INSTANCE, composer2, 8), composer2, 0).getTop()), Dp.m8798constructorimpl(0)));
        ProvidableCompositionLocal<Context> localContext = AndroidCompositionLocals_androidKt.getLocalContext();
        ComposerKt.sourceInformationMarkerStart(composer2, 2023513938, "CC(<get-current>):CompositionLocal.kt#9igjgp");
        Object consume = composer2.consume(localContext);
        ComposerKt.sourceInformationMarkerEnd(composer2);
        Context context = (Context) consume;
        State<KeyboardState> keyboardAsState = KeyboardStateKt.keyboardAsState(composer2, 0);
        Modifier navigationBarsPadding = WindowInsetsPadding_androidKt.navigationBarsPadding(SizeKt.m1197heightInVpY3zN4$default(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), 0.0f, m8798constructorimpl, 1, null));
        BottomBarUiState bottomBarUiState2 = this.$bottomBarUiState;
        Function1<String, Unit> function12 = this.$onSendMessage;
        Function0<Unit> function02 = this.$onGifInputSelected;
        Function0<Unit> function03 = this.$onMediaInputSelected;
        Function1<ComposerInputType, Unit> function13 = this.$onInputChange;
        Function1<MetricData, Unit> function14 = this.$trackMetric;
        Function0<Unit> function04 = this.$onTyping;
        SharedFlow<ComposerUiEffect> sharedFlow = this.$composerUiEffect;
        VoiceTranscriptionState voiceTranscriptionState = this.$voiceTranscriptionState;
        StateFlow<Float> stateFlow = this.$amplitudeLevel;
        Function0<Unit> function05 = this.$onStartVoiceRecording;
        Function0<Unit> function06 = this.$onStopVoiceRecording;
        Function0<Unit> function07 = this.$onCancelVoiceRecording;
        Function0<Unit> function08 = this.$onNewConversationClicked;
        final Function1<String, Unit> function15 = this.$navigateToAnotherConversation;
        Function0<Unit> function09 = this.$onPrivacyNoticeDismissed;
        ComposerKt.sourceInformationMarkerStart(composer2, 1341605231, "CC(Column)N(modifier,verticalArrangement,horizontalAlignment,content)87@4443L61,88@4509L134:Column.kt#2w3rfo");
        MeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composer2, 0);
        ComposerKt.sourceInformationMarkerStart(composer2, -1159599143, "CC(Layout)P(!1,2)80@3267L27,83@3433L360:Layout.kt#80mrfh");
        int hashCode = Long.hashCode(ComposablesKt.getCurrentCompositeKeyHashCode(composer2, 0));
        CompositionLocalMap currentCompositionLocalMap = composer2.getCurrentCompositionLocalMap();
        Modifier materializeModifier = ComposedModifierKt.materializeModifier(composer2, navigationBarsPadding);
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
        ColumnScopeInstance columnScopeInstance2 = ColumnScopeInstance.INSTANCE;
        ComposerState composerState = bottomBarUiState2.getComposerState();
        if (composerState instanceof ComposerState.ConversationEnded) {
            composer2.startReplaceGroup(517935453);
            ComposerKt.sourceInformationMarkerStart(composer2, 1042775818, "CC(Box)N(modifier,contentAlignment,propagateMinConstraints,content)71@3424L131:Box.kt#2w3rfo");
            Modifier.Companion companion = Modifier.INSTANCE;
            MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false);
            ComposerKt.sourceInformationMarkerStart(composer2, -1159599143, "CC(Layout)P(!1,2)80@3267L27,83@3433L360:Layout.kt#80mrfh");
            int hashCode2 = Long.hashCode(ComposablesKt.getCurrentCompositeKeyHashCode(composer2, 0));
            CompositionLocalMap currentCompositionLocalMap2 = composer2.getCurrentCompositionLocalMap();
            Modifier materializeModifier2 = ComposedModifierKt.materializeModifier(composer2, companion);
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
            Updater.m5340setimpl(m5333constructorimpl2, maybeCachedBoxMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            Updater.m5340setimpl(m5333constructorimpl2, currentCompositionLocalMap2, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
            if (m5333constructorimpl2.getInserting() || !Intrinsics.areEqual(m5333constructorimpl2.rememberedValue(), Integer.valueOf(hashCode2))) {
                m5333constructorimpl2.updateRememberedValue(Integer.valueOf(hashCode2));
                m5333constructorimpl2.apply(Integer.valueOf(hashCode2), setCompositeKeyHash2);
            }
            Updater.m5340setimpl(m5333constructorimpl2, materializeModifier2, ComposeUiNode.INSTANCE.getSetModifier());
            ComposerKt.sourceInformationMarkerStart(composer2, 1833054614, "C72@3469L9:Box.kt#2w3rfo");
            Modifier align = BoxScopeInstance.INSTANCE.align(Modifier.INSTANCE, Alignment.INSTANCE.getCenter());
            ComposerKt.sourceInformationMarkerStart(composer2, 1341605231, "CC(Column)N(modifier,verticalArrangement,horizontalAlignment,content)87@4443L61,88@4509L134:Column.kt#2w3rfo");
            MeasurePolicy columnMeasurePolicy2 = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composer2, 0);
            ComposerKt.sourceInformationMarkerStart(composer2, -1159599143, "CC(Layout)P(!1,2)80@3267L27,83@3433L360:Layout.kt#80mrfh");
            int hashCode3 = Long.hashCode(ComposablesKt.getCurrentCompositeKeyHashCode(composer2, 0));
            CompositionLocalMap currentCompositionLocalMap3 = composer2.getCurrentCompositionLocalMap();
            Modifier materializeModifier3 = ComposedModifierKt.materializeModifier(composer2, align);
            Function0<ComposeUiNode> constructor3 = ComposeUiNode.INSTANCE.getConstructor();
            ComposerKt.sourceInformationMarkerStart(composer2, -553112988, "CC(ReusableComposeNode)N(factory,update,content)399@15590L9:Composables.kt#9igjgp");
            if (!(composer2.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            composer2.startReusableNode();
            if (composer2.getInserting()) {
                composer2.createNode(constructor3);
            } else {
                composer2.useNode();
            }
            Composer m5333constructorimpl3 = Updater.m5333constructorimpl(composer2);
            Updater.m5340setimpl(m5333constructorimpl3, columnMeasurePolicy2, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            Updater.m5340setimpl(m5333constructorimpl3, currentCompositionLocalMap3, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash3 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
            if (m5333constructorimpl3.getInserting() || !Intrinsics.areEqual(m5333constructorimpl3.rememberedValue(), Integer.valueOf(hashCode3))) {
                m5333constructorimpl3.updateRememberedValue(Integer.valueOf(hashCode3));
                m5333constructorimpl3.apply(Integer.valueOf(hashCode3), setCompositeKeyHash3);
            }
            Updater.m5340setimpl(m5333constructorimpl3, materializeModifier3, ComposeUiNode.INSTANCE.getSetModifier());
            ComposerKt.sourceInformationMarkerStart(composer2, 2093002350, "C89@4557L9:Column.kt#2w3rfo");
            ColumnScopeInstance columnScopeInstance3 = ColumnScopeInstance.INSTANCE;
            z = true;
            obj = null;
            IntercomDividerKt.IntercomDivider(null, composer2, 0, 1);
            final ComposerState.ConversationEnded.ConversationEndedCta cta = ((ComposerState.ConversationEnded) bottomBarUiState2.getComposerState()).getCta();
            if (cta != null) {
                String linkedConversationId = cta.getLinkedConversationId();
                if (linkedConversationId != null && linkedConversationId.length() != 0) {
                    function08 = new Function0() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.composer.ConversationBottomBarKt$ConversationBottomBar$6$$ExternalSyntheticLambda0
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            Unit invoke$lambda$13$lambda$4$lambda$3$lambda$2$lambda$1;
                            invoke$lambda$13$lambda$4$lambda$3$lambda$2$lambda$1 = ConversationBottomBarKt$ConversationBottomBar$6.invoke$lambda$13$lambda$4$lambda$3$lambda$2$lambda$1(Function1.this, cta);
                            return invoke$lambda$13$lambda$4$lambda$3$lambda$2$lambda$1;
                        }
                    };
                }
                function0 = function08;
            } else {
                function0 = null;
            }
            ConversationEndedCardKt.ConversationEndedCard(null, function0, (ComposerState.ConversationEnded) bottomBarUiState2.getComposerState(), composer2, (StringProvider.$stable | StringProvider.$stable) << 6, 1);
            ComposerKt.sourceInformationMarkerEnd(composer2);
            composer2.endNode();
            ComposerKt.sourceInformationMarkerEnd(composer2);
            ComposerKt.sourceInformationMarkerEnd(composer2);
            ComposerKt.sourceInformationMarkerEnd(composer2);
            ComposerKt.sourceInformationMarkerEnd(composer2);
            composer2.endNode();
            ComposerKt.sourceInformationMarkerEnd(composer2);
            ComposerKt.sourceInformationMarkerEnd(composer2);
            ComposerKt.sourceInformationMarkerEnd(composer2);
            composer2.endReplaceGroup();
        } else {
            z = true;
            obj = null;
            if (!(composerState instanceof ComposerState.Hidden)) {
                if (composerState instanceof ComposerState.TextInput) {
                    composer2.startReplaceGroup(519156698);
                    float f2 = 16;
                    function1 = function14;
                    state = keyboardAsState;
                    str = "CC(<get-current>):CompositionLocal.kt#9igjgp";
                    columnScopeInstance = columnScopeInstance2;
                    f = 0.0f;
                    MessageComposerKt.MessageComposer(PaddingKt.m1161paddingqDBjuR0$default(Modifier.INSTANCE, Dp.m8798constructorimpl(f2), 0.0f, Dp.m8798constructorimpl(f2), Dp.m8798constructorimpl(8), 2, null), function12, (ComposerState.TextInput) bottomBarUiState2.getComposerState(), function02, function03, function13, function1, function04, sharedFlow, voiceTranscriptionState, stateFlow, function05, function06, function07, composer2, 134218246, 8, 0);
                    composer2 = composer2;
                    composer2.endReplaceGroup();
                    bottomBarUiState = bottomBarUiState2;
                    r9 = 0;
                    r15 = 1;
                } else {
                    str = "CC(<get-current>):CompositionLocal.kt#9igjgp";
                    columnScopeInstance = columnScopeInstance2;
                    state = keyboardAsState;
                    function1 = function14;
                    f = 0.0f;
                    if (!(composerState instanceof ComposerState.Reactions)) {
                        composer2.startReplaceGroup(1956369733);
                        composer2.endReplaceGroup();
                        throw new NoWhenBranchMatchedException();
                    }
                    composer2.startReplaceGroup(520187107);
                    final ConversationReactionListener conversationReactionListener = new ConversationReactionListener(MetricTracker.ReactionLocation.CONVERSATION, ((ComposerState.Reactions) bottomBarUiState2.getComposerState()).getLastPartId(), ((ComposerState.Reactions) bottomBarUiState2.getComposerState()).getConversationId(), Injector.get().getApi(), Injector.get().getMetricTracker());
                    r9 = 0;
                    r15 = 1;
                    bottomBarUiState = bottomBarUiState2;
                    AndroidView_androidKt.AndroidView(new Function1() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.composer.ConversationBottomBarKt$ConversationBottomBar$6$$ExternalSyntheticLambda1
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj2) {
                            ReactionInputView invoke$lambda$13$lambda$6;
                            invoke$lambda$13$lambda$6 = ConversationBottomBarKt$ConversationBottomBar$6.invoke$lambda$13$lambda$6(BottomBarUiState.this, conversationReactionListener, (Context) obj2);
                            return invoke$lambda$13$lambda$6;
                        }
                    }, PaddingKt.m1157padding3ABfNKs(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), Dp.m8798constructorimpl(24)), null, composer2, 48, 4);
                    composer2.endReplaceGroup();
                }
                composer2.startReplaceGroup(1956479606);
                if (!Intrinsics.areEqual(bottomBarUiState.getBottomBadge(), BottomBarUiState.BottomBadgeState.None.INSTANCE)) {
                    composer2.startReplaceGroup(1956481175);
                    Object rememberedValue = composer2.rememberedValue();
                    if (rememberedValue == Composer.INSTANCE.getEmpty()) {
                        final State<KeyboardState> state2 = state;
                        rememberedValue = SnapshotStateKt.derivedStateOf(new Function0() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.composer.ConversationBottomBarKt$ConversationBottomBar$6$$ExternalSyntheticLambda2
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                boolean invoke$lambda$13$lambda$8$lambda$7;
                                invoke$lambda$13$lambda$8$lambda$7 = ConversationBottomBarKt$ConversationBottomBar$6.invoke$lambda$13$lambda$8$lambda$7(State.this);
                                return Boolean.valueOf(invoke$lambda$13$lambda$8$lambda$7);
                            }
                        });
                        composer2.updateRememberedValue(rememberedValue);
                    }
                    composer2.endReplaceGroup();
                    ProvidableCompositionLocal<Density> localDensity = CompositionLocalsKt.getLocalDensity();
                    ComposerKt.sourceInformationMarkerStart(composer2, 2023513938, str);
                    Object consume2 = composer2.consume(localDensity);
                    ComposerKt.sourceInformationMarkerEnd(composer2);
                    final Density density = (Density) consume2;
                    ColumnScopeInstance columnScopeInstance4 = columnScopeInstance;
                    Modifier align2 = columnScopeInstance4.align(Modifier.INSTANCE, Alignment.INSTANCE.getCenterHorizontally());
                    boolean invoke$lambda$13$lambda$9 = invoke$lambda$13$lambda$9((State) rememberedValue);
                    composer2.startReplaceGroup(1956494016);
                    boolean changed = composer2.changed(density);
                    Object rememberedValue2 = composer2.rememberedValue();
                    if (changed || rememberedValue2 == Composer.INSTANCE.getEmpty()) {
                        rememberedValue2 = new Function1() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.composer.ConversationBottomBarKt$ConversationBottomBar$6$$ExternalSyntheticLambda3
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj2) {
                                int invoke$lambda$13$lambda$12$lambda$11;
                                invoke$lambda$13$lambda$12$lambda$11 = ConversationBottomBarKt$ConversationBottomBar$6.invoke$lambda$13$lambda$12$lambda$11(Density.this, ((Integer) obj2).intValue());
                                return Integer.valueOf(invoke$lambda$13$lambda$12$lambda$11);
                            }
                        };
                        composer2.updateRememberedValue(rememberedValue2);
                    }
                    composer2.endReplaceGroup();
                    Composer composer3 = composer2;
                    AnimatedVisibilityKt.AnimatedVisibility(columnScopeInstance4, invoke$lambda$13$lambda$9, align2, EnterExitTransitionKt.slideInVertically$default(r9, (Function1) rememberedValue2, r15, r9).plus(EnterExitTransitionKt.expandVertically$default(null, Alignment.INSTANCE.getTop(), false, null, 13, null)).plus(EnterExitTransitionKt.fadeIn$default(r9, 0.3f, r15, r9)), EnterExitTransitionKt.slideOutVertically$default(r9, r9, 3, r9).plus(EnterExitTransitionKt.shrinkVertically$default(null, null, false, null, 15, null)).plus(EnterExitTransitionKt.fadeOut$default(r9, f, 3, r9)), (String) null, ComposableLambdaKt.rememberComposableLambda(-274395025, r15, new ConversationBottomBarKt$ConversationBottomBar$6$1$4(bottomBarUiState, function09, columnScopeInstance4, function1, context), composer2, 54), composer3, 1597446, 16);
                    composer2 = composer3;
                }
                composer2.endReplaceGroup();
                ComposerKt.sourceInformationMarkerEnd(composer2);
                composer2.endNode();
                ComposerKt.sourceInformationMarkerEnd(composer2);
                ComposerKt.sourceInformationMarkerEnd(composer2);
                ComposerKt.sourceInformationMarkerEnd(composer2);
            }
            composer2.startReplaceGroup(518901630);
            if (((ComposerState.Hidden) bottomBarUiState2.getComposerState()).getHideKeyboard()) {
                ProvidableCompositionLocal<SoftwareKeyboardController> localSoftwareKeyboardController = CompositionLocalsKt.getLocalSoftwareKeyboardController();
                ComposerKt.sourceInformationMarkerStart(composer2, 2023513938, "CC(<get-current>):CompositionLocal.kt#9igjgp");
                Object consume3 = composer2.consume(localSoftwareKeyboardController);
                ComposerKt.sourceInformationMarkerEnd(composer2);
                SoftwareKeyboardController softwareKeyboardController = (SoftwareKeyboardController) consume3;
                if (softwareKeyboardController != null) {
                    softwareKeyboardController.hide();
                    Unit unit = Unit.INSTANCE;
                }
            }
            composer2.endReplaceGroup();
        }
        r15 = z;
        str = "CC(<get-current>):CompositionLocal.kt#9igjgp";
        columnScopeInstance = columnScopeInstance2;
        state = keyboardAsState;
        bottomBarUiState = bottomBarUiState2;
        f = 0.0f;
        r9 = obj;
        function1 = function14;
        composer2.startReplaceGroup(1956479606);
        if (!Intrinsics.areEqual(bottomBarUiState.getBottomBadge(), BottomBarUiState.BottomBadgeState.None.INSTANCE)) {
        }
        composer2.endReplaceGroup();
        ComposerKt.sourceInformationMarkerEnd(composer2);
        composer2.endNode();
        ComposerKt.sourceInformationMarkerEnd(composer2);
        ComposerKt.sourceInformationMarkerEnd(composer2);
        ComposerKt.sourceInformationMarkerEnd(composer2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$13$lambda$4$lambda$3$lambda$2$lambda$1(Function1 navigateToAnotherConversation, ComposerState.ConversationEnded.ConversationEndedCta it) {
        Intrinsics.checkNotNullParameter(navigateToAnotherConversation, "$navigateToAnotherConversation");
        Intrinsics.checkNotNullParameter(it, "$it");
        navigateToAnotherConversation.invoke(it.getLinkedConversationId());
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ReactionInputView invoke$lambda$13$lambda$6(BottomBarUiState bottomBarUiState, ReactionListener reactionListener, Context it) {
        Intrinsics.checkNotNullParameter(bottomBarUiState, "$bottomBarUiState");
        Intrinsics.checkNotNullParameter(reactionListener, "$reactionListener");
        Intrinsics.checkNotNullParameter(it, "it");
        ReactionInputView reactionInputView = new ReactionInputView(it);
        reactionInputView.setUpReactions(((ComposerState.Reactions) bottomBarUiState.getComposerState()).getReactionReply(), true, reactionListener);
        return reactionInputView;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean invoke$lambda$13$lambda$8$lambda$7(State keyboardAsState$delegate) {
        Intrinsics.checkNotNullParameter(keyboardAsState$delegate, "$keyboardAsState$delegate");
        return invoke$lambda$0(keyboardAsState$delegate).isDismissed();
    }

    private static final KeyboardState invoke$lambda$0(State<KeyboardState> state) {
        return state.getValue();
    }

    private static final boolean invoke$lambda$13$lambda$9(State<Boolean> state) {
        return state.getValue().booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int invoke$lambda$13$lambda$12$lambda$11(Density density, int i) {
        Intrinsics.checkNotNullParameter(density, "$density");
        return -density.mo738roundToPx0680j_4(Dp.m8798constructorimpl(40));
    }
}
