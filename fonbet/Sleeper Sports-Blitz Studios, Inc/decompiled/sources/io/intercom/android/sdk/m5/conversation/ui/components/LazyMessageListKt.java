package io.intercom.android.sdk.m5.conversation.ui.components;

import android.content.Context;
import androidx.compose.animation.core.AnimationSpecKt;
import androidx.compose.animation.core.SpringSpec;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.lazy.LazyDslKt;
import androidx.compose.foundation.lazy.LazyItemScope;
import androidx.compose.foundation.lazy.LazyListScope;
import androidx.compose.foundation.lazy.LazyListState;
import androidx.compose.foundation.lazy.LazyListStateKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.MutableFloatState;
import androidx.compose.runtime.MutableIntState;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.PrimitiveSnapshotStateKt;
import androidx.compose.runtime.ProvidableCompositionLocal;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotIntStateKt;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.res.StringResources_androidKt;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.Dp;
import io.intercom.android.sdk.R;
import io.intercom.android.sdk.blocks.lib.models.Block;
import io.intercom.android.sdk.blocks.lib.models.TicketType;
import io.intercom.android.sdk.m5.components.FooterNoticeKt;
import io.intercom.android.sdk.m5.components.PoweredByBadgeKt;
import io.intercom.android.sdk.m5.components.avatar.AvatarWrapper;
import io.intercom.android.sdk.m5.conversation.states.AttributeData;
import io.intercom.android.sdk.m5.conversation.states.ContentRow;
import io.intercom.android.sdk.m5.conversation.states.ConversationUiStateKt;
import io.intercom.android.sdk.m5.conversation.states.GroupingPosition;
import io.intercom.android.sdk.m5.conversation.states.PendingMessage;
import io.intercom.android.sdk.m5.conversation.states.ReplySuggestion;
import io.intercom.android.sdk.m5.conversation.ui.components.composer.MessageComposerKt;
import io.intercom.android.sdk.m5.conversation.ui.components.row.AskedAboutRowKt;
import io.intercom.android.sdk.m5.conversation.ui.components.row.BigTicketCardKt;
import io.intercom.android.sdk.m5.conversation.ui.components.row.BubbleMessageRowKt;
import io.intercom.android.sdk.m5.conversation.ui.components.row.DayDividerKt;
import io.intercom.android.sdk.m5.conversation.ui.components.row.EventRowKt;
import io.intercom.android.sdk.m5.conversation.ui.components.row.FailedMessage;
import io.intercom.android.sdk.m5.conversation.ui.components.row.FinAnswerRowKt;
import io.intercom.android.sdk.m5.conversation.ui.components.row.FinStreamingRowKt;
import io.intercom.android.sdk.m5.conversation.ui.components.row.MergedConversationRowKt;
import io.intercom.android.sdk.m5.conversation.ui.components.row.NewMessagesRowKt;
import io.intercom.android.sdk.m5.conversation.ui.components.row.NoteCardRowKt;
import io.intercom.android.sdk.m5.conversation.ui.components.row.PostCardRowKt;
import io.intercom.android.sdk.m5.conversation.ui.components.row.QuickRepliesKt;
import io.intercom.android.sdk.m5.conversation.ui.components.row.SpecialNoticeKt;
import io.intercom.android.sdk.m5.conversation.ui.components.row.TeamIntroKt;
import io.intercom.android.sdk.m5.conversation.ui.components.row.TicketStatusRowKt;
import io.intercom.android.sdk.m5.conversation.ui.components.row.TypingIndicatorKt;
import io.intercom.android.sdk.m5.conversation.utils.KeyboardState;
import io.intercom.android.sdk.m5.conversation.utils.KeyboardStateKt;
import io.intercom.android.sdk.models.InlineSource;
import io.intercom.android.sdk.models.Part;
import io.intercom.android.sdk.models.ReplyOption;
import io.intercom.android.sdk.models.Source;
import io.intercom.android.sdk.ui.IntercomPreviews;
import io.intercom.android.sdk.ui.common.IntercomArrangement;
import io.intercom.android.sdk.ui.theme.IntercomThemeKt;
import io.intercom.android.sdk.utilities.TimeFormatterExtKt;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: LazyMessageList.kt */
@Metadata(d1 = {"\u0000|\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\b\n\u0000\u001a±\u0002\u0010\u0000\u001a\u00020\u00012\b\b\u0002\u0010\u0002\u001a\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\b\b\u0002\u0010\u0007\u001a\u00020\b2\u0014\b\u0002\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u00010\n2\u0014\b\u0002\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u00010\n2\u0014\b\u0002\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u00010\n2\u0014\b\u0002\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u00010\n2\u0014\b\u0002\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u00010\n2\u000e\b\u0002\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00010\u00152\u0014\b\u0002\u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\u00010\n2\b\b\u0002\u0010\u0018\u001a\u00020\u00192\u0014\b\u0002\u0010\u001a\u001a\u000e\u0012\u0004\u0012\u00020\u001b\u0012\u0004\u0012\u00020\u00010\n2\b\b\u0002\u0010\u001c\u001a\u00020\u00192(\b\u0002\u0010\u001d\u001a\"\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001f0\u0005\u0012\n\u0012\b\u0012\u0004\u0012\u00020 0\u0005\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u001e2\b\b\u0002\u0010!\u001a\u00020\u00192\u000e\b\u0002\u0010\"\u001a\b\u0012\u0004\u0012\u00020\u00010\u0015H\u0001¢\u0006\u0002\u0010#\u001a\f\u0010$\u001a\u00020\u0019*\u00020\u0006H\u0002\u001a\f\u0010%\u001a\u00020\u0019*\u00020\u0006H\u0002\u001a\r\u0010&\u001a\u00020\u0001H\u0001¢\u0006\u0002\u0010'¨\u0006(²\u0006\n\u0010)\u001a\u00020*X\u008a\u0084\u0002²\u0006\n\u0010+\u001a\u00020,X\u008a\u008e\u0002²\u0006\n\u0010-\u001a\u00020.X\u008a\u008e\u0002²\u0006\n\u0010/\u001a\u00020\u0019X\u008a\u008e\u0002"}, d2 = {"LazyMessageList", "", "modifier", "Landroidx/compose/ui/Modifier;", "contentRows", "", "Lio/intercom/android/sdk/m5/conversation/states/ContentRow;", "lazyListState", "Landroidx/compose/foundation/lazy/LazyListState;", "onSuggestionClick", "Lkotlin/Function1;", "Lio/intercom/android/sdk/m5/conversation/states/ReplySuggestion;", "onReplyClicked", "Lio/intercom/android/sdk/models/ReplyOption;", "onRetryMessageClicked", "Lio/intercom/android/sdk/models/Part;", "onRetryImageClicked", "Lio/intercom/android/sdk/m5/conversation/states/PendingMessage$FailedImageUploadData;", "onSubmitAttribute", "Lio/intercom/android/sdk/m5/conversation/states/AttributeData;", "navigateToTicketDetail", "Lkotlin/Function0;", "onCreateTicket", "Lio/intercom/android/sdk/blocks/lib/models/TicketType;", "addComposerPadding", "", "navigateToAnotherConversation", "", "isIntercomBadgeVisible", "onInlineSourcesClick", "Lkotlin/Function2;", "Lio/intercom/android/sdk/models/InlineSource;", "Lio/intercom/android/sdk/models/Source;", "showReportAiAnswerButton", "onReportAiAnswer", "(Landroidx/compose/ui/Modifier;Ljava/util/List;Landroidx/compose/foundation/lazy/LazyListState;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;ZLkotlin/jvm/functions/Function1;ZLkotlin/jvm/functions/Function2;ZLkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;III)V", "shouldFadeInItem", "shouldFadeOutItem", "LazyMessageListPreview", "(Landroidx/compose/runtime/Composer;I)V", "intercom-sdk-base_release", "keyboardAsState", "Lio/intercom/android/sdk/m5/conversation/utils/KeyboardState;", "keyboardScrollOffset", "", "firstVisibleItemIndex", "", "isListAtTheBottom"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class LazyMessageListKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit LazyMessageList$lambda$28(Modifier modifier, List contentRows, LazyListState lazyListState, Function1 function1, Function1 function12, Function1 function13, Function1 function14, Function1 function15, Function0 function0, Function1 function16, boolean z, Function1 function17, boolean z2, Function2 function2, boolean z3, Function0 function02, int i, int i2, int i3, Composer composer, int i4) {
        Intrinsics.checkNotNullParameter(contentRows, "$contentRows");
        LazyMessageList(modifier, contentRows, lazyListState, function1, function12, function13, function14, function15, function0, function16, z, function17, z2, function2, z3, function02, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), RecomposeScopeImplKt.updateChangedFlags(i2), i3);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit LazyMessageListPreview$lambda$29(int i, Composer composer, int i2) {
        LazyMessageListPreview(composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit LazyMessageList$lambda$0(ReplySuggestion it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit LazyMessageList$lambda$1(ReplyOption it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit LazyMessageList$lambda$2(Part it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit LazyMessageList$lambda$3(PendingMessage.FailedImageUploadData it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit LazyMessageList$lambda$4(AttributeData it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit LazyMessageList$lambda$6(TicketType it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit LazyMessageList$lambda$7(String it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x0306  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x0337  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x03b0  */
    /* JADX WARN: Removed duplicated region for block: B:114:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:116:0x030b  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x0238  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0240  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x027b  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x028e  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x02b9  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x02cc  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void LazyMessageList(Modifier modifier, final List<? extends ContentRow> contentRows, LazyListState lazyListState, Function1<? super ReplySuggestion, Unit> function1, Function1<? super ReplyOption, Unit> function12, Function1<? super Part, Unit> function13, Function1<? super PendingMessage.FailedImageUploadData, Unit> function14, Function1<? super AttributeData, Unit> function15, Function0<Unit> function0, Function1<? super TicketType, Unit> function16, boolean z, Function1<? super String, Unit> function17, boolean z2, Function2<? super List<InlineSource>, ? super List<Source>, Unit> function2, boolean z3, Function0<Unit> function02, Composer composer, final int i, final int i2, final int i3) {
        LazyListState lazyListState2;
        int i4;
        int i5;
        float f;
        Function1<? super PendingMessage.FailedImageUploadData, Unit> function18;
        LazyListState lazyListState3;
        boolean z4;
        boolean z5;
        LazyListState lazyListState4;
        State<KeyboardState> state;
        MutableFloatState mutableFloatState;
        LazyMessageListKt$LazyMessageList$10$1 lazyMessageListKt$LazyMessageList$10$1;
        State<KeyboardState> state2;
        boolean z6;
        boolean z7;
        final LazyListState lazyListState5;
        MutableState mutableState;
        LazyMessageListKt$LazyMessageList$11$1 lazyMessageListKt$LazyMessageList$11$1;
        boolean z8;
        LazyMessageListKt$LazyMessageList$12$1 rememberedValue;
        boolean z9;
        LazyMessageListKt$LazyMessageList$13$1 rememberedValue2;
        Continuation continuation;
        float m8798constructorimpl;
        ContentRow contentRow;
        Arrangement.Vertical itemAtBottom;
        ScopeUpdateScope endRestartGroup;
        Intrinsics.checkNotNullParameter(contentRows, "contentRows");
        Composer startRestartGroup = composer.startRestartGroup(-906198490);
        Modifier.Companion companion = (i3 & 1) != 0 ? Modifier.INSTANCE : modifier;
        if ((i3 & 4) != 0) {
            lazyListState2 = LazyListStateKt.rememberLazyListState(0, 0, startRestartGroup, 0, 3);
            i4 = i & (-897);
        } else {
            lazyListState2 = lazyListState;
            i4 = i;
        }
        Function1<? super ReplySuggestion, Unit> function19 = (i3 & 8) != 0 ? new Function1() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.LazyMessageListKt$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                Unit LazyMessageList$lambda$0;
                LazyMessageList$lambda$0 = LazyMessageListKt.LazyMessageList$lambda$0((ReplySuggestion) obj);
                return LazyMessageList$lambda$0;
            }
        } : function1;
        Function1<? super ReplyOption, Unit> function110 = (i3 & 16) != 0 ? new Function1() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.LazyMessageListKt$$ExternalSyntheticLambda5
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                Unit LazyMessageList$lambda$1;
                LazyMessageList$lambda$1 = LazyMessageListKt.LazyMessageList$lambda$1((ReplyOption) obj);
                return LazyMessageList$lambda$1;
            }
        } : function12;
        final Function1<? super Part, Unit> function111 = (i3 & 32) != 0 ? new Function1() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.LazyMessageListKt$$ExternalSyntheticLambda6
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                Unit LazyMessageList$lambda$2;
                LazyMessageList$lambda$2 = LazyMessageListKt.LazyMessageList$lambda$2((Part) obj);
                return LazyMessageList$lambda$2;
            }
        } : function13;
        Function1<? super PendingMessage.FailedImageUploadData, Unit> function112 = (i3 & 64) != 0 ? new Function1() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.LazyMessageListKt$$ExternalSyntheticLambda7
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                Unit LazyMessageList$lambda$3;
                LazyMessageList$lambda$3 = LazyMessageListKt.LazyMessageList$lambda$3((PendingMessage.FailedImageUploadData) obj);
                return LazyMessageList$lambda$3;
            }
        } : function14;
        Function1<? super AttributeData, Unit> function113 = (i3 & 128) != 0 ? new Function1() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.LazyMessageListKt$$ExternalSyntheticLambda8
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                Unit LazyMessageList$lambda$4;
                LazyMessageList$lambda$4 = LazyMessageListKt.LazyMessageList$lambda$4((AttributeData) obj);
                return LazyMessageList$lambda$4;
            }
        } : function15;
        Function0<Unit> function03 = (i3 & 256) != 0 ? new Function0() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.LazyMessageListKt$$ExternalSyntheticLambda9
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                Unit unit;
                unit = Unit.INSTANCE;
                return unit;
            }
        } : function0;
        Function1<? super TicketType, Unit> function114 = (i3 & 512) != 0 ? new Function1() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.LazyMessageListKt$$ExternalSyntheticLambda10
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                Unit LazyMessageList$lambda$6;
                LazyMessageList$lambda$6 = LazyMessageListKt.LazyMessageList$lambda$6((TicketType) obj);
                return LazyMessageList$lambda$6;
            }
        } : function16;
        boolean z10 = (i3 & 1024) != 0 ? false : z;
        Function1<? super String, Unit> function115 = (i3 & 2048) != 0 ? new Function1() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.LazyMessageListKt$$ExternalSyntheticLambda11
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                Unit LazyMessageList$lambda$7;
                LazyMessageList$lambda$7 = LazyMessageListKt.LazyMessageList$lambda$7((String) obj);
                return LazyMessageList$lambda$7;
            }
        } : function17;
        boolean z11 = (i3 & 4096) != 0 ? false : z2;
        Function2<? super List<InlineSource>, ? super List<Source>, Unit> function22 = (i3 & 8192) != 0 ? null : function2;
        boolean z12 = (i3 & 16384) != 0 ? true : z3;
        Function0<Unit> function04 = (i3 & 32768) != 0 ? new Function0() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.LazyMessageListKt$$ExternalSyntheticLambda12
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                Unit unit;
                unit = Unit.INSTANCE;
                return unit;
            }
        } : function02;
        ProvidableCompositionLocal<Context> localContext = AndroidCompositionLocals_androidKt.getLocalContext();
        final boolean z13 = z12;
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC(<get-current>):CompositionLocal.kt#9igjgp");
        Object consume = startRestartGroup.consume(localContext);
        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        final Context context = (Context) consume;
        State<KeyboardState> keyboardAsState = KeyboardStateKt.keyboardAsState(startRestartGroup, 0);
        startRestartGroup.startReplaceGroup(-1167327746);
        Object rememberedValue3 = startRestartGroup.rememberedValue();
        final Function1<? super ReplySuggestion, Unit> function116 = function19;
        final Function1<? super ReplyOption, Unit> function117 = function110;
        if (rememberedValue3 == Composer.INSTANCE.getEmpty()) {
            rememberedValue3 = PrimitiveSnapshotStateKt.mutableFloatStateOf(0.0f);
            startRestartGroup.updateRememberedValue(rememberedValue3);
        }
        MutableFloatState mutableFloatState2 = (MutableFloatState) rememberedValue3;
        startRestartGroup.endReplaceGroup();
        startRestartGroup.startReplaceGroup(-1167325507);
        if (z11) {
            ProvidableCompositionLocal<Density> localDensity = CompositionLocalsKt.getLocalDensity();
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC(<get-current>):CompositionLocal.kt#9igjgp");
            Object consume2 = startRestartGroup.consume(localDensity);
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            i5 = 0;
            f = ((Density) consume2).mo744toPx0680j_4(PoweredByBadgeKt.getPoweredByBadgeHeight(startRestartGroup, 0));
        } else {
            i5 = 0;
            f = 0.0f;
        }
        startRestartGroup.endReplaceGroup();
        startRestartGroup.startReplaceGroup(-1167320293);
        Object rememberedValue4 = startRestartGroup.rememberedValue();
        int i6 = i5;
        if (rememberedValue4 == Composer.INSTANCE.getEmpty()) {
            rememberedValue4 = SnapshotIntStateKt.mutableIntStateOf(i6);
            startRestartGroup.updateRememberedValue(rememberedValue4);
        }
        final MutableIntState mutableIntState = (MutableIntState) rememberedValue4;
        startRestartGroup.endReplaceGroup();
        startRestartGroup.startReplaceGroup(-1167318276);
        Object rememberedValue5 = startRestartGroup.rememberedValue();
        if (rememberedValue5 == Composer.INSTANCE.getEmpty()) {
            function18 = function112;
            rememberedValue5 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(false, null, 2, null);
            startRestartGroup.updateRememberedValue(rememberedValue5);
        } else {
            function18 = function112;
        }
        MutableState mutableState2 = (MutableState) rememberedValue5;
        startRestartGroup.endReplaceGroup();
        Boolean valueOf = Boolean.valueOf(LazyMessageList$lambda$9(keyboardAsState).isVisible());
        Boolean valueOf2 = Boolean.valueOf(LazyMessageList$lambda$9(keyboardAsState).isAnimating());
        startRestartGroup.startReplaceGroup(-1167313666);
        boolean changed = startRestartGroup.changed(keyboardAsState) | startRestartGroup.changed(f);
        float f2 = f;
        int i7 = (i & 896) ^ 384;
        if (i7 <= 256 || !startRestartGroup.changed(lazyListState2)) {
            lazyListState3 = lazyListState2;
            if ((i & 384) != 256) {
                z4 = false;
                z5 = z4 | changed;
                Object rememberedValue6 = startRestartGroup.rememberedValue();
                if (!z5 || rememberedValue6 == Composer.INSTANCE.getEmpty()) {
                    LazyListState lazyListState6 = lazyListState3;
                    lazyListState4 = lazyListState6;
                    state = keyboardAsState;
                    mutableFloatState = mutableFloatState2;
                    lazyMessageListKt$LazyMessageList$10$1 = new LazyMessageListKt$LazyMessageList$10$1(f2, lazyListState6, keyboardAsState, mutableFloatState2, null);
                    startRestartGroup.updateRememberedValue(lazyMessageListKt$LazyMessageList$10$1);
                } else {
                    state = keyboardAsState;
                    lazyMessageListKt$LazyMessageList$10$1 = rememberedValue6;
                    lazyListState4 = lazyListState3;
                    mutableFloatState = mutableFloatState2;
                }
                startRestartGroup.endReplaceGroup();
                MutableFloatState mutableFloatState3 = mutableFloatState;
                EffectsKt.LaunchedEffect(valueOf, valueOf2, (Function2) lazyMessageListKt$LazyMessageList$10$1, startRestartGroup, 512);
                Boolean valueOf3 = Boolean.valueOf(LazyMessageList$lambda$9(state).isDismissed());
                startRestartGroup.startReplaceGroup(-1167300817);
                boolean changed2 = startRestartGroup.changed(state);
                LazyListState lazyListState7 = lazyListState4;
                if (i7 > 256 || !startRestartGroup.changed(lazyListState7)) {
                    state2 = state;
                    if ((i & 384) != 256) {
                        z6 = false;
                        z7 = z6 | changed2;
                        Object rememberedValue7 = startRestartGroup.rememberedValue();
                        if (!z7 || rememberedValue7 == Composer.INSTANCE.getEmpty()) {
                            LazyMessageListKt$LazyMessageList$11$1 lazyMessageListKt$LazyMessageList$11$12 = new LazyMessageListKt$LazyMessageList$11$1(lazyListState7, state2, mutableState2, mutableFloatState3, null);
                            lazyListState5 = lazyListState7;
                            mutableState = mutableState2;
                            lazyMessageListKt$LazyMessageList$11$1 = lazyMessageListKt$LazyMessageList$11$12;
                            startRestartGroup.updateRememberedValue(lazyMessageListKt$LazyMessageList$11$1);
                        } else {
                            mutableState = mutableState2;
                            lazyMessageListKt$LazyMessageList$11$1 = rememberedValue7;
                            lazyListState5 = lazyListState7;
                        }
                        startRestartGroup.endReplaceGroup();
                        EffectsKt.LaunchedEffect(valueOf3, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) lazyMessageListKt$LazyMessageList$11$1, startRestartGroup, 64);
                        startRestartGroup.startReplaceGroup(-1167292902);
                        z8 = (i7 <= 256 && startRestartGroup.changed(lazyListState5)) || (i & 384) == 256;
                        rememberedValue = startRestartGroup.rememberedValue();
                        if (!z8 || rememberedValue == Composer.INSTANCE.getEmpty()) {
                            rememberedValue = new LazyMessageListKt$LazyMessageList$12$1(lazyListState5, mutableIntState, null);
                            startRestartGroup.updateRememberedValue(rememberedValue);
                        }
                        startRestartGroup.endReplaceGroup();
                        int i8 = ((i4 >> 6) & 14) | 64;
                        EffectsKt.LaunchedEffect(lazyListState5, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) rememberedValue, startRestartGroup, i8);
                        startRestartGroup.startReplaceGroup(-1167286604);
                        z9 = (i7 <= 256 && startRestartGroup.changed(lazyListState5)) || (i & 384) == 256;
                        rememberedValue2 = startRestartGroup.rememberedValue();
                        if (!z9 || rememberedValue2 == Composer.INSTANCE.getEmpty()) {
                            continuation = null;
                            rememberedValue2 = new LazyMessageListKt$LazyMessageList$13$1(lazyListState5, mutableState, null);
                            startRestartGroup.updateRememberedValue(rememberedValue2);
                        } else {
                            continuation = null;
                        }
                        startRestartGroup.endReplaceGroup();
                        EffectsKt.LaunchedEffect(lazyListState5, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) rememberedValue2, startRestartGroup, i8);
                        EffectsKt.LaunchedEffect(contentRows, new LazyMessageListKt$LazyMessageList$14(contentRows, lazyListState5, mutableState, continuation), startRestartGroup, 72);
                        Modifier fillMaxSize$default = SizeKt.fillMaxSize$default(companion, 0.0f, 1, continuation);
                        float m8798constructorimpl2 = Dp.m8798constructorimpl(16);
                        if (z10) {
                            m8798constructorimpl = MessageComposerKt.getComposerHalfSize();
                        } else {
                            m8798constructorimpl = Dp.m8798constructorimpl(0);
                        }
                        PaddingValues m1154PaddingValuesa9UjIt4$default = PaddingKt.m1154PaddingValuesa9UjIt4$default(0.0f, 0.0f, 0.0f, Dp.m8798constructorimpl(m8798constructorimpl2 + m8798constructorimpl), 7, null);
                        contentRow = (ContentRow) CollectionsKt.lastOrNull((List) contentRows);
                        if (!(contentRow instanceof ContentRow.FooterNoticeRow) || (contentRow instanceof ContentRow.ComposerSuggestionRow) || (contentRow instanceof ContentRow.QuickRepliesRow)) {
                            itemAtBottom = IntercomArrangement.INSTANCE.itemAtBottom(CollectionsKt.getLastIndex(contentRows));
                        } else {
                            itemAtBottom = Arrangement.INSTANCE.getTop();
                        }
                        final Modifier modifier2 = companion;
                        final Function1<? super String, Unit> function118 = function115;
                        final MutableState mutableState3 = mutableState;
                        final Function2<? super List<InlineSource>, ? super List<Source>, Unit> function23 = function22;
                        final Function1<? super AttributeData, Unit> function119 = function113;
                        final Function1<? super TicketType, Unit> function120 = function114;
                        final Function0<Unit> function05 = function03;
                        final Function0<Unit> function06 = function04;
                        final Function1<? super PendingMessage.FailedImageUploadData, Unit> function121 = function18;
                        LazyDslKt.LazyColumn(fillMaxSize$default, lazyListState5, m1154PaddingValuesa9UjIt4$default, false, itemAtBottom, Alignment.INSTANCE.getCenterHorizontally(), null, false, null, new Function1() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.LazyMessageListKt$$ExternalSyntheticLambda1
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                Unit LazyMessageList$lambda$27;
                                LazyMessageList$lambda$27 = LazyMessageListKt.LazyMessageList$lambda$27(contentRows, function05, function116, function117, z13, function06, lazyListState5, function118, function119, function121, function120, context, function23, mutableState3, mutableIntState, function111, (LazyListScope) obj);
                                return LazyMessageList$lambda$27;
                            }
                        }, startRestartGroup, ((i4 >> 3) & 112) | 199680, 448);
                        endRestartGroup = startRestartGroup.endRestartGroup();
                        if (endRestartGroup != null) {
                            final Function1<? super Part, Unit> function122 = function111;
                            final boolean z14 = z10;
                            final boolean z15 = z11;
                            final LazyListState lazyListState8 = lazyListState5;
                            final Function1<? super PendingMessage.FailedImageUploadData, Unit> function123 = function18;
                            endRestartGroup.updateScope(new Function2() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.LazyMessageListKt$$ExternalSyntheticLambda4
                                @Override // kotlin.jvm.functions.Function2
                                public final Object invoke(Object obj, Object obj2) {
                                    Unit LazyMessageList$lambda$28;
                                    LazyMessageList$lambda$28 = LazyMessageListKt.LazyMessageList$lambda$28(Modifier.this, contentRows, lazyListState8, function116, function117, function122, function123, function119, function05, function120, z14, function118, z15, function23, z13, function06, i, i2, i3, (Composer) obj, ((Integer) obj2).intValue());
                                    return LazyMessageList$lambda$28;
                                }
                            });
                            return;
                        }
                        return;
                    }
                } else {
                    state2 = state;
                }
                z6 = true;
                z7 = z6 | changed2;
                Object rememberedValue72 = startRestartGroup.rememberedValue();
                if (z7) {
                }
                LazyMessageListKt$LazyMessageList$11$1 lazyMessageListKt$LazyMessageList$11$122 = new LazyMessageListKt$LazyMessageList$11$1(lazyListState7, state2, mutableState2, mutableFloatState3, null);
                lazyListState5 = lazyListState7;
                mutableState = mutableState2;
                lazyMessageListKt$LazyMessageList$11$1 = lazyMessageListKt$LazyMessageList$11$122;
                startRestartGroup.updateRememberedValue(lazyMessageListKt$LazyMessageList$11$1);
                startRestartGroup.endReplaceGroup();
                EffectsKt.LaunchedEffect(valueOf3, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) lazyMessageListKt$LazyMessageList$11$1, startRestartGroup, 64);
                startRestartGroup.startReplaceGroup(-1167292902);
                if (i7 <= 256) {
                }
                rememberedValue = startRestartGroup.rememberedValue();
                if (!z8) {
                }
                rememberedValue = new LazyMessageListKt$LazyMessageList$12$1(lazyListState5, mutableIntState, null);
                startRestartGroup.updateRememberedValue(rememberedValue);
                startRestartGroup.endReplaceGroup();
                int i82 = ((i4 >> 6) & 14) | 64;
                EffectsKt.LaunchedEffect(lazyListState5, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) rememberedValue, startRestartGroup, i82);
                startRestartGroup.startReplaceGroup(-1167286604);
                if (i7 <= 256) {
                }
                rememberedValue2 = startRestartGroup.rememberedValue();
                if (z9) {
                }
                continuation = null;
                rememberedValue2 = new LazyMessageListKt$LazyMessageList$13$1(lazyListState5, mutableState, null);
                startRestartGroup.updateRememberedValue(rememberedValue2);
                startRestartGroup.endReplaceGroup();
                EffectsKt.LaunchedEffect(lazyListState5, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) rememberedValue2, startRestartGroup, i82);
                EffectsKt.LaunchedEffect(contentRows, new LazyMessageListKt$LazyMessageList$14(contentRows, lazyListState5, mutableState, continuation), startRestartGroup, 72);
                Modifier fillMaxSize$default2 = SizeKt.fillMaxSize$default(companion, 0.0f, 1, continuation);
                float m8798constructorimpl22 = Dp.m8798constructorimpl(16);
                if (z10) {
                }
                PaddingValues m1154PaddingValuesa9UjIt4$default2 = PaddingKt.m1154PaddingValuesa9UjIt4$default(0.0f, 0.0f, 0.0f, Dp.m8798constructorimpl(m8798constructorimpl22 + m8798constructorimpl), 7, null);
                contentRow = (ContentRow) CollectionsKt.lastOrNull((List) contentRows);
                if (!(contentRow instanceof ContentRow.FooterNoticeRow)) {
                }
                itemAtBottom = IntercomArrangement.INSTANCE.itemAtBottom(CollectionsKt.getLastIndex(contentRows));
                final Modifier modifier22 = companion;
                final Function1 function1182 = function115;
                final MutableState mutableState32 = mutableState;
                final Function2 function232 = function22;
                final Function1 function1192 = function113;
                final Function1 function1202 = function114;
                final Function0 function052 = function03;
                final Function0 function062 = function04;
                final Function1 function1212 = function18;
                LazyDslKt.LazyColumn(fillMaxSize$default2, lazyListState5, m1154PaddingValuesa9UjIt4$default2, false, itemAtBottom, Alignment.INSTANCE.getCenterHorizontally(), null, false, null, new Function1() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.LazyMessageListKt$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        Unit LazyMessageList$lambda$27;
                        LazyMessageList$lambda$27 = LazyMessageListKt.LazyMessageList$lambda$27(contentRows, function052, function116, function117, z13, function062, lazyListState5, function1182, function1192, function1212, function1202, context, function232, mutableState32, mutableIntState, function111, (LazyListScope) obj);
                        return LazyMessageList$lambda$27;
                    }
                }, startRestartGroup, ((i4 >> 3) & 112) | 199680, 448);
                endRestartGroup = startRestartGroup.endRestartGroup();
                if (endRestartGroup != null) {
                }
            }
        } else {
            lazyListState3 = lazyListState2;
        }
        z4 = true;
        z5 = z4 | changed;
        Object rememberedValue62 = startRestartGroup.rememberedValue();
        if (z5) {
        }
        LazyListState lazyListState62 = lazyListState3;
        lazyListState4 = lazyListState62;
        state = keyboardAsState;
        mutableFloatState = mutableFloatState2;
        lazyMessageListKt$LazyMessageList$10$1 = new LazyMessageListKt$LazyMessageList$10$1(f2, lazyListState62, keyboardAsState, mutableFloatState2, null);
        startRestartGroup.updateRememberedValue(lazyMessageListKt$LazyMessageList$10$1);
        startRestartGroup.endReplaceGroup();
        MutableFloatState mutableFloatState32 = mutableFloatState;
        EffectsKt.LaunchedEffect(valueOf, valueOf2, (Function2) lazyMessageListKt$LazyMessageList$10$1, startRestartGroup, 512);
        Boolean valueOf32 = Boolean.valueOf(LazyMessageList$lambda$9(state).isDismissed());
        startRestartGroup.startReplaceGroup(-1167300817);
        boolean changed22 = startRestartGroup.changed(state);
        LazyListState lazyListState72 = lazyListState4;
        if (i7 > 256) {
        }
        state2 = state;
        if ((i & 384) != 256) {
        }
        z6 = true;
        z7 = z6 | changed22;
        Object rememberedValue722 = startRestartGroup.rememberedValue();
        if (z7) {
        }
        LazyMessageListKt$LazyMessageList$11$1 lazyMessageListKt$LazyMessageList$11$1222 = new LazyMessageListKt$LazyMessageList$11$1(lazyListState72, state2, mutableState2, mutableFloatState32, null);
        lazyListState5 = lazyListState72;
        mutableState = mutableState2;
        lazyMessageListKt$LazyMessageList$11$1 = lazyMessageListKt$LazyMessageList$11$1222;
        startRestartGroup.updateRememberedValue(lazyMessageListKt$LazyMessageList$11$1);
        startRestartGroup.endReplaceGroup();
        EffectsKt.LaunchedEffect(valueOf32, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) lazyMessageListKt$LazyMessageList$11$1, startRestartGroup, 64);
        startRestartGroup.startReplaceGroup(-1167292902);
        if (i7 <= 256) {
        }
        rememberedValue = startRestartGroup.rememberedValue();
        if (!z8) {
        }
        rememberedValue = new LazyMessageListKt$LazyMessageList$12$1(lazyListState5, mutableIntState, null);
        startRestartGroup.updateRememberedValue(rememberedValue);
        startRestartGroup.endReplaceGroup();
        int i822 = ((i4 >> 6) & 14) | 64;
        EffectsKt.LaunchedEffect(lazyListState5, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) rememberedValue, startRestartGroup, i822);
        startRestartGroup.startReplaceGroup(-1167286604);
        if (i7 <= 256) {
        }
        rememberedValue2 = startRestartGroup.rememberedValue();
        if (z9) {
        }
        continuation = null;
        rememberedValue2 = new LazyMessageListKt$LazyMessageList$13$1(lazyListState5, mutableState, null);
        startRestartGroup.updateRememberedValue(rememberedValue2);
        startRestartGroup.endReplaceGroup();
        EffectsKt.LaunchedEffect(lazyListState5, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) rememberedValue2, startRestartGroup, i822);
        EffectsKt.LaunchedEffect(contentRows, new LazyMessageListKt$LazyMessageList$14(contentRows, lazyListState5, mutableState, continuation), startRestartGroup, 72);
        Modifier fillMaxSize$default22 = SizeKt.fillMaxSize$default(companion, 0.0f, 1, continuation);
        float m8798constructorimpl222 = Dp.m8798constructorimpl(16);
        if (z10) {
        }
        PaddingValues m1154PaddingValuesa9UjIt4$default22 = PaddingKt.m1154PaddingValuesa9UjIt4$default(0.0f, 0.0f, 0.0f, Dp.m8798constructorimpl(m8798constructorimpl222 + m8798constructorimpl), 7, null);
        contentRow = (ContentRow) CollectionsKt.lastOrNull((List) contentRows);
        if (!(contentRow instanceof ContentRow.FooterNoticeRow)) {
        }
        itemAtBottom = IntercomArrangement.INSTANCE.itemAtBottom(CollectionsKt.getLastIndex(contentRows));
        final Modifier modifier222 = companion;
        final Function1 function11822 = function115;
        final MutableState mutableState322 = mutableState;
        final Function2 function2322 = function22;
        final Function1 function11922 = function113;
        final Function1 function12022 = function114;
        final Function0 function0522 = function03;
        final Function0 function0622 = function04;
        final Function1 function12122 = function18;
        LazyDslKt.LazyColumn(fillMaxSize$default22, lazyListState5, m1154PaddingValuesa9UjIt4$default22, false, itemAtBottom, Alignment.INSTANCE.getCenterHorizontally(), null, false, null, new Function1() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.LazyMessageListKt$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                Unit LazyMessageList$lambda$27;
                LazyMessageList$lambda$27 = LazyMessageListKt.LazyMessageList$lambda$27(contentRows, function0522, function116, function117, z13, function0622, lazyListState5, function11822, function11922, function12122, function12022, context, function2322, mutableState322, mutableIntState, function111, (LazyListScope) obj);
                return LazyMessageList$lambda$27;
            }
        }, startRestartGroup, ((i4 >> 3) & 112) | 199680, 448);
        endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float LazyMessageList$lambda$11(MutableFloatState mutableFloatState) {
        return mutableFloatState.getFloatValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int LazyMessageList$lambda$15(MutableIntState mutableIntState) {
        return mutableIntState.getIntValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean LazyMessageList$lambda$18(MutableState<Boolean> mutableState) {
        return mutableState.getValue().booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void LazyMessageList$lambda$19(MutableState<Boolean> mutableState, boolean z) {
        mutableState.setValue(Boolean.valueOf(z));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit LazyMessageList$lambda$27(final List contentRows, final Function0 function0, final Function1 function1, final Function1 function12, final boolean z, final Function0 function02, final LazyListState lazyListState, final Function1 function13, final Function1 function14, final Function1 function15, final Function1 function16, final Context context, final Function2 function2, final MutableState isListAtTheBottom$delegate, final MutableIntState firstVisibleItemIndex$delegate, final Function1 function17, LazyListScope LazyColumn) {
        Intrinsics.checkNotNullParameter(contentRows, "$contentRows");
        Intrinsics.checkNotNullParameter(context, "$context");
        Intrinsics.checkNotNullParameter(isListAtTheBottom$delegate, "$isListAtTheBottom$delegate");
        Intrinsics.checkNotNullParameter(firstVisibleItemIndex$delegate, "$firstVisibleItemIndex$delegate");
        Intrinsics.checkNotNullParameter(LazyColumn, "$this$LazyColumn");
        final Function2 function22 = new Function2() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.LazyMessageListKt$$ExternalSyntheticLambda3
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                Object LazyMessageList$lambda$27$lambda$24;
                LazyMessageList$lambda$27$lambda$24 = LazyMessageListKt.LazyMessageList$lambda$27$lambda$24(((Integer) obj).intValue(), (ContentRow) obj2);
                return LazyMessageList$lambda$27$lambda$24;
            }
        };
        LazyColumn.items(contentRows.size(), new Function1<Integer, Object>() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.LazyMessageListKt$LazyMessageList$lambda$27$$inlined$itemsIndexed$default$1
            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Integer num) {
                return invoke(num.intValue());
            }

            public final Object invoke(int i) {
                return Function2.this.invoke(Integer.valueOf(i), contentRows.get(i));
            }
        }, new Function1<Integer, Object>() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.LazyMessageListKt$LazyMessageList$lambda$27$$inlined$itemsIndexed$default$2
            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Integer num) {
                return invoke(num.intValue());
            }

            public final Object invoke(int i) {
                contentRows.get(i);
                return null;
            }
        }, ComposableLambdaKt.composableLambdaInstance(2039820996, true, new Function4<LazyItemScope, Integer, Composer, Integer, Unit>() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.LazyMessageListKt$LazyMessageList$lambda$27$$inlined$itemsIndexed$default$3
            @Override // kotlin.jvm.functions.Function4
            public /* bridge */ /* synthetic */ Unit invoke(LazyItemScope lazyItemScope, Integer num, Composer composer, Integer num2) {
                invoke(lazyItemScope, num.intValue(), composer, num2.intValue());
                return Unit.INSTANCE;
            }

            public final void invoke(LazyItemScope lazyItemScope, int i, Composer composer, int i2) {
                int i3;
                boolean shouldFadeInItem;
                boolean shouldFadeOutItem;
                Modifier modifier;
                FailedMessage failedMessage;
                String conversationId;
                Object obj;
                Composer composer2 = composer;
                ComposerKt.sourceInformation(composer2, "CN(it)214@10668L26:LazyDsl.kt#428nma");
                if ((i2 & 6) == 0) {
                    i3 = i2 | (composer2.changed(lazyItemScope) ? 4 : 2);
                } else {
                    i3 = i2;
                }
                if ((i2 & 48) == 0) {
                    i3 |= composer2.changed(i) ? 32 : 16;
                }
                if (!composer2.shouldExecute((i3 & 147) != 146, i3 & 1)) {
                    composer2.skipToGroupEnd();
                    return;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(2039820996, i3, -1, "androidx.compose.foundation.lazy.itemsIndexed.<anonymous> (LazyDsl.kt:214)");
                }
                final ContentRow contentRow = (ContentRow) contentRows.get(i);
                composer2.startReplaceGroup(890829930);
                Modifier m1161paddingqDBjuR0$default = PaddingKt.m1161paddingqDBjuR0$default(Modifier.INSTANCE, 0.0f, MessageListKt.gapWithPrevious(contentRow, i, contentRows), 0.0f, 0.0f, 13, null);
                shouldFadeInItem = LazyMessageListKt.shouldFadeInItem(contentRow);
                SpringSpec spring$default = shouldFadeInItem ? AnimationSpecKt.spring$default(0.0f, 400.0f, null, 5, null) : null;
                shouldFadeOutItem = LazyMessageListKt.shouldFadeOutItem(contentRow);
                Modifier animateItem = lazyItemScope.animateItem(m1161paddingqDBjuR0$default, spring$default, null, shouldFadeOutItem ? AnimationSpecKt.spring$default(0.0f, 400.0f, null, 5, null) : null);
                if (contentRow instanceof ContentRow.AskedAboutRow) {
                    composer2.startReplaceGroup(891423796);
                    AskedAboutRowKt.AskedAboutRow(SizeKt.fillMaxWidth$default(animateItem, 0.0f, 1, null), ((ContentRow.AskedAboutRow) contentRow).getPart(), composer2, 64, 0);
                    composer2.endReplaceGroup();
                } else if (contentRow instanceof ContentRow.BigTicketRow) {
                    composer2.startReplaceGroup(891655552);
                    BigTicketCardKt.BigTicketCard(((ContentRow.BigTicketRow) contentRow).getTicketDetailContentState(), function0, true, animateItem, composer2, 392, 0);
                    composer2 = composer2;
                    composer2.endReplaceGroup();
                } else if (contentRow instanceof ContentRow.ComposerSuggestionRow) {
                    composer2.startReplaceGroup(892009355);
                    QuickRepliesKt.ComposerSuggestions(PaddingKt.m1159paddingVpY3zN4$default(SizeKt.fillMaxWidth$default(animateItem, 0.0f, 1, null), Dp.m8798constructorimpl(16), 0.0f, 2, null), ((ContentRow.ComposerSuggestionRow) contentRow).getSuggestions(), function1, composer2, 64, 0);
                    composer2.endReplaceGroup();
                } else if (contentRow instanceof ContentRow.QuickRepliesRow) {
                    composer2.startReplaceGroup(892408046);
                    Modifier fillMaxWidth$default = SizeKt.fillMaxWidth$default(animateItem, 0.0f, 1, null);
                    float f = 16;
                    QuickRepliesKt.ReplyOptions(PaddingKt.m1161paddingqDBjuR0$default(fillMaxWidth$default, Dp.m8798constructorimpl(f), 0.0f, Dp.m8798constructorimpl(f), 0.0f, 10, null), ((ContentRow.QuickRepliesRow) contentRow).getReplyOptions(), function12, composer2, 64, 0);
                    composer2.endReplaceGroup();
                } else if (contentRow instanceof ContentRow.DayDividerRow) {
                    composer2.startReplaceGroup(892798305);
                    long timestamp = ((ContentRow.DayDividerRow) contentRow).getTimestamp();
                    ProvidableCompositionLocal<Context> localContext = AndroidCompositionLocals_androidKt.getLocalContext();
                    ComposerKt.sourceInformationMarkerStart(composer2, 2023513938, "CC(<get-current>):CompositionLocal.kt#9igjgp");
                    Object consume = composer2.consume(localContext);
                    ComposerKt.sourceInformationMarkerEnd(composer2);
                    DayDividerKt.DayDivider(TimeFormatterExtKt.formattedDateForDayDivider(timestamp, (Context) consume), SizeKt.fillMaxWidth$default(animateItem, 0.0f, 1, null), composer2, 0, 0);
                    composer2.endReplaceGroup();
                } else if (contentRow instanceof ContentRow.EventRow) {
                    composer2.startReplaceGroup(893073802);
                    ContentRow.EventRow eventRow = (ContentRow.EventRow) contentRow;
                    EventRowKt.EventRow(SizeKt.fillMaxWidth$default(animateItem, 0.0f, 1, null), eventRow.getLabelSegments(), new AvatarWrapper(eventRow.getAvatar(), false, 2, null), composer2, 576, 0);
                    composer2.endReplaceGroup();
                } else if (contentRow instanceof ContentRow.FinAnswerRow) {
                    composer2.startReplaceGroup(893387305);
                    ContentRow.FinAnswerRow finAnswerRow = (ContentRow.FinAnswerRow) contentRow;
                    Part part = finAnswerRow.getPart();
                    GroupingPosition groupingPosition = finAnswerRow.getGroupingPosition();
                    String hourOfDay = TimeFormatterExtKt.toHourOfDay(finAnswerRow.getPart().getCreatedAt());
                    final Function2 function23 = function2;
                    FinAnswerRowKt.FinAnswerRow(part, groupingPosition, animateItem, hourOfDay, new Function1<List<? extends InlineSource>, Unit>() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.LazyMessageListKt$LazyMessageList$15$2$1
                        @Override // kotlin.jvm.functions.Function1
                        public /* bridge */ /* synthetic */ Unit invoke(List<? extends InlineSource> list) {
                            invoke2((List<InlineSource>) list);
                            return Unit.INSTANCE;
                        }

                        /* renamed from: invoke, reason: avoid collision after fix types in other method */
                        public final void invoke2(List<InlineSource> selectedSources) {
                            Intrinsics.checkNotNullParameter(selectedSources, "selectedSources");
                            Function2<List<InlineSource>, List<Source>, Unit> function24 = function23;
                            if (function24 != null) {
                                List<Source> sources = ((ContentRow.FinAnswerRow) contentRow).getPart().getSources();
                                Intrinsics.checkNotNullExpressionValue(sources, "getSources(...)");
                                function24.invoke(selectedSources, sources);
                            }
                        }
                    }, z, function02, composer2, 8, 0);
                    composer2.endReplaceGroup();
                    composer2 = composer2;
                } else if (contentRow instanceof ContentRow.FinStreamingRow) {
                    composer2.startReplaceGroup(894069553);
                    ContentRow.FinStreamingRow finStreamingRow = (ContentRow.FinStreamingRow) contentRow;
                    List<Block> blocks = finStreamingRow.getBlocks();
                    composer2.startReplaceGroup(-248252408);
                    boolean changed = composer2.changed(lazyListState) | ((((i3 & 112) ^ 48) > 32 && composer2.changed(i)) || (i3 & 48) == 32);
                    LazyMessageListKt$LazyMessageList$15$2$2$1 rememberedValue = composer2.rememberedValue();
                    if (changed || rememberedValue == Composer.INSTANCE.getEmpty()) {
                        obj = null;
                        rememberedValue = new LazyMessageListKt$LazyMessageList$15$2$2$1(i, lazyListState, isListAtTheBottom$delegate, firstVisibleItemIndex$delegate, null);
                        composer2.updateRememberedValue(rememberedValue);
                    } else {
                        obj = null;
                    }
                    composer2.endReplaceGroup();
                    EffectsKt.LaunchedEffect(blocks, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) rememberedValue, composer2, 72);
                    composer2 = composer2;
                    FinStreamingRowKt.FinStreamingRow(finStreamingRow.getBlocks(), finStreamingRow.getStreamingPart(), SizeKt.fillMaxWidth$default(animateItem, 0.0f, 1, obj), composer2, 72, 0);
                    composer2.endReplaceGroup();
                } else {
                    composer2 = composer2;
                    if (contentRow instanceof ContentRow.FooterNoticeRow) {
                        composer2.startReplaceGroup(894617013);
                        ContentRow.FooterNoticeRow footerNoticeRow = (ContentRow.FooterNoticeRow) contentRow;
                        FooterNoticeKt.ExpandedFooterNotice(PaddingKt.m1158paddingVpY3zN4(animateItem, Dp.m8798constructorimpl(24), Dp.m8798constructorimpl(4)), footerNoticeRow.getFooterNoticeState().getTitle(), footerNoticeRow.getFooterNoticeState().getSubtitle(), footerNoticeRow.getFooterNoticeState().getAvatars(), composer2, 4096, 0);
                        composer2 = composer2;
                        composer2.endReplaceGroup();
                    } else if (contentRow instanceof ContentRow.MergedConversationRow) {
                        composer2.startReplaceGroup(895046735);
                        ContentRow.MergedConversationRow mergedConversationRow = (ContentRow.MergedConversationRow) contentRow;
                        String description = mergedConversationRow.getDescription();
                        if (description != null && description.length() != 0 && (conversationId = mergedConversationRow.getConversationId()) != null && conversationId.length() != 0) {
                            MergedConversationRowKt.MergedConversationRow(animateItem, mergedConversationRow.getDescription(), mergedConversationRow.getConversationId(), function13, composer, 0, 0);
                            composer2 = composer;
                        }
                        composer2.endReplaceGroup();
                    } else if (contentRow instanceof ContentRow.BubbleMessageRow) {
                        composer2.startReplaceGroup(895596396);
                        Modifier fillMaxWidth$default2 = SizeKt.fillMaxWidth$default(animateItem, 0.0f, 1, null);
                        ContentRow.BubbleMessageRow bubbleMessageRow = (ContentRow.BubbleMessageRow) contentRow;
                        Part part2 = bubbleMessageRow.getPartWrapper().getPart();
                        String hourOfDay2 = TimeFormatterExtKt.toHourOfDay(bubbleMessageRow.getPartWrapper().getPart().getCreatedAt());
                        List<String> failedAttributeIdentifiers = bubbleMessageRow.getPartWrapper().getFailedAttributeIdentifiers();
                        List<String> loadingAttributeIdentifiers = bubbleMessageRow.getPartWrapper().getLoadingAttributeIdentifiers();
                        GroupingPosition groupingPosition2 = bubbleMessageRow.getGroupingPosition();
                        boolean isAdminOrAltParticipant = bubbleMessageRow.getPartWrapper().isAdminOrAltParticipant();
                        PendingMessage.FailedImageUploadData failedImageUploadData = bubbleMessageRow.getFailedImageUploadData();
                        composer2.startReplaceGroup(-248176227);
                        if (bubbleMessageRow.isFailed()) {
                            String stringResource = StringResources_androidKt.stringResource(R.string.intercom_failed_delivery, composer2, 0);
                            final Function1 function18 = function17;
                            modifier = fillMaxWidth$default2;
                            failedMessage = new FailedMessage(stringResource, new Function0<Unit>() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.LazyMessageListKt$LazyMessageList$15$2$3
                                @Override // kotlin.jvm.functions.Function0
                                public /* bridge */ /* synthetic */ Unit invoke() {
                                    invoke2();
                                    return Unit.INSTANCE;
                                }

                                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                                public final void invoke2() {
                                    function18.invoke(((ContentRow.BubbleMessageRow) contentRow).getPartWrapper().getPart());
                                }
                            });
                        } else {
                            modifier = fillMaxWidth$default2;
                            failedMessage = null;
                        }
                        composer.endReplaceGroup();
                        BubbleMessageRowKt.BubbleMessageRow(part2, groupingPosition2, isAdminOrAltParticipant, modifier, hourOfDay2, function14, failedAttributeIdentifiers, loadingAttributeIdentifiers, function15, failedImageUploadData, failedMessage, function16, composer, 18874376, 0, 0);
                        composer2 = composer;
                        composer2.endReplaceGroup();
                    } else if (contentRow instanceof ContentRow.NewMessagesRow) {
                        composer2.startReplaceGroup(896939564);
                        NewMessagesRowKt.NewMessagesRow(animateItem, composer2, 0, 0);
                        composer2.endReplaceGroup();
                    } else if (contentRow instanceof ContentRow.NoteCardRow) {
                        composer2.startReplaceGroup(897114125);
                        ContentRow.NoteCardRow noteCardRow = (ContentRow.NoteCardRow) contentRow;
                        NoteCardRowKt.NoteCardRow(animateItem, noteCardRow.getPart(), noteCardRow.getCompanyName(), composer2, 64, 0);
                        composer2.endReplaceGroup();
                    } else if (contentRow instanceof ContentRow.PostCardRow) {
                        composer2.startReplaceGroup(897379981);
                        ContentRow.PostCardRow postCardRow = (ContentRow.PostCardRow) contentRow;
                        PostCardRowKt.PostCardRow(animateItem, postCardRow.getPart(), postCardRow.getCompanyName(), composer2, 64, 0);
                        composer2.endReplaceGroup();
                    } else if (contentRow instanceof ContentRow.TeamIntroRow) {
                        composer2.startReplaceGroup(897646240);
                        float f2 = 16;
                        TeamIntroKt.TeamIntro(((ContentRow.TeamIntroRow) contentRow).getMessage(), PaddingKt.m1161paddingqDBjuR0$default(animateItem, Dp.m8798constructorimpl(f2), 0.0f, Dp.m8798constructorimpl(f2), 0.0f, 10, null), composer2, 0, 0);
                        composer2.endReplaceGroup();
                    } else if (contentRow instanceof ContentRow.SpecialNoticeRow) {
                        composer2.startReplaceGroup(897898332);
                        float f3 = 16;
                        SpecialNoticeKt.SpecialNotice(((ContentRow.SpecialNoticeRow) contentRow).getMessage(), PaddingKt.m1161paddingqDBjuR0$default(animateItem, Dp.m8798constructorimpl(f3), 0.0f, Dp.m8798constructorimpl(f3), 0.0f, 10, null), composer2, 0, 0);
                        composer2.endReplaceGroup();
                    } else if (contentRow instanceof ContentRow.TicketStatusRow) {
                        composer2.startReplaceGroup(898162049);
                        ContentRow.TicketStatusRow ticketStatusRow = (ContentRow.TicketStatusRow) contentRow;
                        TicketStatusRowKt.TicketStatusRow(ticketStatusRow.getTicketEventStatus(), ticketStatusRow.getTicketStatusText(), TimeFormatterExtKt.formattedDateFromLong(ticketStatusRow.getCreatedAt(), context), PaddingKt.m1159paddingVpY3zN4$default(animateItem, Dp.m8798constructorimpl(16), 0.0f, 2, null), ticketStatusRow.getCustomStateLabel(), ticketStatusRow.getCustomStatePrefix(), composer, 0, 0);
                        composer2 = composer;
                        composer2.endReplaceGroup();
                    } else {
                        if (!(contentRow instanceof ContentRow.TypingIndicatorRow)) {
                            composer2.startReplaceGroup(-248333446);
                            composer2.endReplaceGroup();
                            throw new NoWhenBranchMatchedException();
                        }
                        composer2.startReplaceGroup(898696241);
                        TypingIndicatorKt.m12403TypingIndicator6a0pyJM(PaddingKt.m1159paddingVpY3zN4$default(SizeKt.fillMaxWidth$default(animateItem, 0.0f, 1, null), Dp.m8798constructorimpl(16), 0.0f, 2, null), ((ContentRow.TypingIndicatorRow) contentRow).getCurrentlyTypingState(), Dp.m8798constructorimpl(36), composer2, 448, 0);
                        composer2.endReplaceGroup();
                    }
                }
                composer2.endReplaceGroup();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
        }));
        LazyListScope.item$default(LazyColumn, ConversationUiStateKt.LastAnchorRowKey, null, ComposableSingletons$LazyMessageListKt.INSTANCE.m12192getLambda1$intercom_sdk_base_release(), 2, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object LazyMessageList$lambda$27$lambda$24(int i, ContentRow item) {
        Intrinsics.checkNotNullParameter(item, "item");
        return item.getKey();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean shouldFadeInItem(ContentRow contentRow) {
        if (contentRow instanceof ContentRow.TypingIndicatorRow) {
            return true;
        }
        if (contentRow instanceof ContentRow.BubbleMessageRow) {
            ContentRow.BubbleMessageRow bubbleMessageRow = (ContentRow.BubbleMessageRow) contentRow;
            if (bubbleMessageRow.getPartWrapper().isLastPart() && bubbleMessageRow.getPartWrapper().getPart().getMessageState() == Part.MessageState.SENDING) {
                return true;
            }
        }
        return contentRow instanceof ContentRow.QuickRepliesRow;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean shouldFadeOutItem(ContentRow contentRow) {
        return (contentRow instanceof ContentRow.TypingIndicatorRow) || (contentRow instanceof ContentRow.QuickRepliesRow);
    }

    @IntercomPreviews
    public static final void LazyMessageListPreview(Composer composer, final int i) {
        Composer startRestartGroup = composer.startRestartGroup(834972857);
        if (i != 0 || !startRestartGroup.getSkipping()) {
            IntercomThemeKt.IntercomTheme(null, null, null, ComposableSingletons$LazyMessageListKt.INSTANCE.m12194getLambda3$intercom_sdk_base_release(), startRestartGroup, 3072, 7);
        } else {
            startRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new Function2() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.LazyMessageListKt$$ExternalSyntheticLambda2
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    Unit LazyMessageListPreview$lambda$29;
                    LazyMessageListPreview$lambda$29 = LazyMessageListKt.LazyMessageListPreview$lambda$29(i, (Composer) obj, ((Integer) obj2).intValue());
                    return LazyMessageListPreview$lambda$29;
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final KeyboardState LazyMessageList$lambda$9(State<KeyboardState> state) {
        return state.getValue();
    }
}
