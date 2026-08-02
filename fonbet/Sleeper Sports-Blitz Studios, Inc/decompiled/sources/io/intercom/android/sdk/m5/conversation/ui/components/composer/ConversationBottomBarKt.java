package io.intercom.android.sdk.m5.conversation.ui.components.composer;

import androidx.compose.foundation.layout.BoxWithConstraintsKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.unit.Dp;
import io.intercom.android.sdk.m5.conversation.metrics.MetricData;
import io.intercom.android.sdk.m5.conversation.states.BottomBarUiState;
import io.intercom.android.sdk.m5.conversation.states.ComposerUiEffect;
import io.intercom.android.sdk.m5.conversation.states.VoiceTranscriptionState;
import io.intercom.android.sdk.ui.IntercomPreviews;
import io.intercom.android.sdk.ui.theme.IntercomThemeKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.SharedFlow;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;

/* compiled from: ConversationBottomBar.kt */
@Metadata(d1 = {"\u0000`\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\n\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\u001a¡\u0002\u0010\u0000\u001a\u00020\u00012\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00010\u00072\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00010\u00072\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00010\f2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00010\f2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00010\f2\u0014\b\u0002\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u00010\u00072\b\b\u0002\u0010\u0011\u001a\u00020\u00122\u0012\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00010\u00072\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00010\f2\u000e\b\u0002\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00010\f2\u0010\b\u0002\u0010\u0016\u001a\n\u0012\u0004\u0012\u00020\u0018\u0018\u00010\u00172\b\b\u0002\u0010\u0019\u001a\u00020\u001a2\u000e\b\u0002\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001d0\u001c2\u000e\b\u0002\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u00010\f2\u000e\b\u0002\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u00010\f2\u000e\b\u0002\u0010 \u001a\b\u0012\u0004\u0012\u00020\u00010\fH\u0001¢\u0006\u0004\b!\u0010\"\u001a\r\u0010#\u001a\u00020\u0001H\u0003¢\u0006\u0002\u0010$\u001a\r\u0010%\u001a\u00020\u0001H\u0003¢\u0006\u0002\u0010$¨\u0006&²\u0006\n\u0010'\u001a\u00020(X\u008a\u0084\u0002²\u0006\n\u0010)\u001a\u00020*X\u008a\u0084\u0002"}, d2 = {"ConversationBottomBar", "", "modifier", "Landroidx/compose/ui/Modifier;", "bottomBarUiState", "Lio/intercom/android/sdk/m5/conversation/states/BottomBarUiState;", "onSendMessage", "Lkotlin/Function1;", "", "onInputChange", "Lio/intercom/android/sdk/m5/conversation/ui/components/composer/ComposerInputType;", "onGifInputSelected", "Lkotlin/Function0;", "onNewConversationClicked", "onMediaInputSelected", "trackMetric", "Lio/intercom/android/sdk/m5/conversation/metrics/MetricData;", "topSpacing", "Landroidx/compose/ui/unit/Dp;", "navigateToAnotherConversation", "onPrivacyNoticeDismissed", "onTyping", "composerUiEffect", "Lkotlinx/coroutines/flow/SharedFlow;", "Lio/intercom/android/sdk/m5/conversation/states/ComposerUiEffect;", "voiceTranscriptionState", "Lio/intercom/android/sdk/m5/conversation/states/VoiceTranscriptionState;", "amplitudeLevel", "Lkotlinx/coroutines/flow/StateFlow;", "", "onStartVoiceRecording", "onStopVoiceRecording", "onCancelVoiceRecording", "ConversationBottomBar-n745XfY", "(Landroidx/compose/ui/Modifier;Lio/intercom/android/sdk/m5/conversation/states/BottomBarUiState;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;FLkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlinx/coroutines/flow/SharedFlow;Lio/intercom/android/sdk/m5/conversation/states/VoiceTranscriptionState;Lkotlinx/coroutines/flow/StateFlow;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;III)V", "MessageComposerPreview", "(Landroidx/compose/runtime/Composer;I)V", "MessageComposerLongTextPreview", "intercom-sdk-base_release", "keyboardAsState", "Lio/intercom/android/sdk/m5/conversation/utils/KeyboardState;", "bottomBadgeVisibility", ""}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class ConversationBottomBarKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ConversationBottomBar_n745XfY$lambda$5(Modifier modifier, BottomBarUiState bottomBarUiState, Function1 onSendMessage, Function1 onInputChange, Function0 onGifInputSelected, Function0 onNewConversationClicked, Function0 onMediaInputSelected, Function1 function1, float f, Function1 navigateToAnotherConversation, Function0 onPrivacyNoticeDismissed, Function0 function0, SharedFlow sharedFlow, VoiceTranscriptionState voiceTranscriptionState, StateFlow stateFlow, Function0 function02, Function0 function03, Function0 function04, int i, int i2, int i3, Composer composer, int i4) {
        Intrinsics.checkNotNullParameter(bottomBarUiState, "$bottomBarUiState");
        Intrinsics.checkNotNullParameter(onSendMessage, "$onSendMessage");
        Intrinsics.checkNotNullParameter(onInputChange, "$onInputChange");
        Intrinsics.checkNotNullParameter(onGifInputSelected, "$onGifInputSelected");
        Intrinsics.checkNotNullParameter(onNewConversationClicked, "$onNewConversationClicked");
        Intrinsics.checkNotNullParameter(onMediaInputSelected, "$onMediaInputSelected");
        Intrinsics.checkNotNullParameter(navigateToAnotherConversation, "$navigateToAnotherConversation");
        Intrinsics.checkNotNullParameter(onPrivacyNoticeDismissed, "$onPrivacyNoticeDismissed");
        m12289ConversationBottomBarn745XfY(modifier, bottomBarUiState, onSendMessage, onInputChange, onGifInputSelected, onNewConversationClicked, onMediaInputSelected, function1, f, navigateToAnotherConversation, onPrivacyNoticeDismissed, function0, sharedFlow, voiceTranscriptionState, stateFlow, function02, function03, function04, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), RecomposeScopeImplKt.updateChangedFlags(i2), i3);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit MessageComposerLongTextPreview$lambda$7(int i, Composer composer, int i2) {
        MessageComposerLongTextPreview(composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit MessageComposerPreview$lambda$6(int i, Composer composer, int i2) {
        MessageComposerPreview(composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ConversationBottomBar_n745XfY$lambda$0(MetricData it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return Unit.INSTANCE;
    }

    /* renamed from: ConversationBottomBar-n745XfY, reason: not valid java name */
    public static final void m12289ConversationBottomBarn745XfY(Modifier modifier, final BottomBarUiState bottomBarUiState, final Function1<? super String, Unit> onSendMessage, final Function1<? super ComposerInputType, Unit> onInputChange, final Function0<Unit> onGifInputSelected, final Function0<Unit> onNewConversationClicked, final Function0<Unit> onMediaInputSelected, Function1<? super MetricData, Unit> function1, float f, final Function1<? super String, Unit> navigateToAnotherConversation, final Function0<Unit> onPrivacyNoticeDismissed, Function0<Unit> function0, SharedFlow<? extends ComposerUiEffect> sharedFlow, VoiceTranscriptionState voiceTranscriptionState, StateFlow<Float> stateFlow, Function0<Unit> function02, Function0<Unit> function03, Function0<Unit> function04, Composer composer, final int i, final int i2, final int i3) {
        Intrinsics.checkNotNullParameter(bottomBarUiState, "bottomBarUiState");
        Intrinsics.checkNotNullParameter(onSendMessage, "onSendMessage");
        Intrinsics.checkNotNullParameter(onInputChange, "onInputChange");
        Intrinsics.checkNotNullParameter(onGifInputSelected, "onGifInputSelected");
        Intrinsics.checkNotNullParameter(onNewConversationClicked, "onNewConversationClicked");
        Intrinsics.checkNotNullParameter(onMediaInputSelected, "onMediaInputSelected");
        Intrinsics.checkNotNullParameter(navigateToAnotherConversation, "navigateToAnotherConversation");
        Intrinsics.checkNotNullParameter(onPrivacyNoticeDismissed, "onPrivacyNoticeDismissed");
        Composer startRestartGroup = composer.startRestartGroup(-919677456);
        Modifier modifier2 = (i3 & 1) != 0 ? Modifier.INSTANCE : modifier;
        Function1<? super MetricData, Unit> function12 = (i3 & 128) != 0 ? new Function1() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.composer.ConversationBottomBarKt$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                Unit ConversationBottomBar_n745XfY$lambda$0;
                ConversationBottomBar_n745XfY$lambda$0 = ConversationBottomBarKt.ConversationBottomBar_n745XfY$lambda$0((MetricData) obj);
                return ConversationBottomBar_n745XfY$lambda$0;
            }
        } : function1;
        float m8798constructorimpl = (i3 & 256) != 0 ? Dp.m8798constructorimpl(0) : f;
        Function0<Unit> function05 = (i3 & 2048) != 0 ? new Function0() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.composer.ConversationBottomBarKt$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                Unit unit;
                unit = Unit.INSTANCE;
                return unit;
            }
        } : function0;
        SharedFlow<? extends ComposerUiEffect> sharedFlow2 = (i3 & 4096) != 0 ? null : sharedFlow;
        VoiceTranscriptionState.Idle idle = (i3 & 8192) != 0 ? VoiceTranscriptionState.Idle.INSTANCE : voiceTranscriptionState;
        MutableStateFlow MutableStateFlow = (i3 & 16384) != 0 ? StateFlowKt.MutableStateFlow(Float.valueOf(0.0f)) : stateFlow;
        Function0<Unit> function06 = (i3 & 32768) != 0 ? new Function0() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.composer.ConversationBottomBarKt$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                Unit unit;
                unit = Unit.INSTANCE;
                return unit;
            }
        } : function02;
        Function0<Unit> function07 = (i3 & 65536) != 0 ? new Function0() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.composer.ConversationBottomBarKt$$ExternalSyntheticLambda3
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                Unit unit;
                unit = Unit.INSTANCE;
                return unit;
            }
        } : function03;
        final Function0<Unit> function08 = (i3 & 131072) != 0 ? new Function0() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.composer.ConversationBottomBarKt$$ExternalSyntheticLambda4
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                Unit unit;
                unit = Unit.INSTANCE;
                return unit;
            }
        } : function04;
        final Function0<Unit> function09 = function05;
        final VoiceTranscriptionState voiceTranscriptionState2 = idle;
        final Function0<Unit> function010 = function06;
        final SharedFlow<? extends ComposerUiEffect> sharedFlow3 = sharedFlow2;
        final StateFlow<Float> stateFlow2 = MutableStateFlow;
        final Function0<Unit> function011 = function07;
        final float f2 = m8798constructorimpl;
        final Function1<? super MetricData, Unit> function13 = function12;
        final Modifier modifier3 = modifier2;
        BoxWithConstraintsKt.BoxWithConstraints(modifier3, null, false, ComposableLambdaKt.rememberComposableLambda(1065060166, true, new ConversationBottomBarKt$ConversationBottomBar$6(f2, bottomBarUiState, onSendMessage, onGifInputSelected, onMediaInputSelected, onInputChange, function13, function09, sharedFlow3, voiceTranscriptionState2, stateFlow2, function010, function011, function08, onNewConversationClicked, navigateToAnotherConversation, onPrivacyNoticeDismissed), startRestartGroup, 54), startRestartGroup, (i & 14) | 3072, 6);
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new Function2() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.composer.ConversationBottomBarKt$$ExternalSyntheticLambda5
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    Unit ConversationBottomBar_n745XfY$lambda$5;
                    ConversationBottomBar_n745XfY$lambda$5 = ConversationBottomBarKt.ConversationBottomBar_n745XfY$lambda$5(Modifier.this, bottomBarUiState, onSendMessage, onInputChange, onGifInputSelected, onNewConversationClicked, onMediaInputSelected, function13, f2, navigateToAnotherConversation, onPrivacyNoticeDismissed, function09, sharedFlow3, voiceTranscriptionState2, stateFlow2, function010, function011, function08, i, i2, i3, (Composer) obj, ((Integer) obj2).intValue());
                    return ConversationBottomBar_n745XfY$lambda$5;
                }
            });
        }
    }

    @IntercomPreviews
    private static final void MessageComposerPreview(Composer composer, final int i) {
        Composer startRestartGroup = composer.startRestartGroup(-961451097);
        if (i != 0 || !startRestartGroup.getSkipping()) {
            IntercomThemeKt.IntercomTheme(null, null, null, ComposableSingletons$ConversationBottomBarKt.INSTANCE.m12262getLambda2$intercom_sdk_base_release(), startRestartGroup, 3072, 7);
        } else {
            startRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new Function2() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.composer.ConversationBottomBarKt$$ExternalSyntheticLambda7
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    Unit MessageComposerPreview$lambda$6;
                    MessageComposerPreview$lambda$6 = ConversationBottomBarKt.MessageComposerPreview$lambda$6(i, (Composer) obj, ((Integer) obj2).intValue());
                    return MessageComposerPreview$lambda$6;
                }
            });
        }
    }

    @IntercomPreviews
    private static final void MessageComposerLongTextPreview(Composer composer, final int i) {
        Composer startRestartGroup = composer.startRestartGroup(-1582182192);
        if (i != 0 || !startRestartGroup.getSkipping()) {
            IntercomThemeKt.IntercomTheme(null, null, null, ComposableSingletons$ConversationBottomBarKt.INSTANCE.m12264getLambda4$intercom_sdk_base_release(), startRestartGroup, 3072, 7);
        } else {
            startRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new Function2() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.composer.ConversationBottomBarKt$$ExternalSyntheticLambda6
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    Unit MessageComposerLongTextPreview$lambda$7;
                    MessageComposerLongTextPreview$lambda$7 = ConversationBottomBarKt.MessageComposerLongTextPreview$lambda$7(i, (Composer) obj, ((Integer) obj2).intValue());
                    return MessageComposerLongTextPreview$lambda$7;
                }
            });
        }
    }
}
