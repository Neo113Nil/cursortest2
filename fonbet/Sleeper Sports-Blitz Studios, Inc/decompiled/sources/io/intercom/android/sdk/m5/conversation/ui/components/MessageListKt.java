package io.intercom.android.sdk.m5.conversation.ui.components;

import androidx.compose.foundation.ScrollState;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.State;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.layout.LayoutCoordinates;
import androidx.compose.ui.layout.LayoutCoordinatesKt;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.IntSizeKt;
import io.intercom.android.sdk.blocks.lib.models.TicketType;
import io.intercom.android.sdk.m5.conversation.states.AttributeData;
import io.intercom.android.sdk.m5.conversation.states.ContentRow;
import io.intercom.android.sdk.m5.conversation.states.GroupingPosition;
import io.intercom.android.sdk.m5.conversation.states.PendingMessage;
import io.intercom.android.sdk.m5.conversation.states.ReplySuggestion;
import io.intercom.android.sdk.m5.conversation.utils.KeyboardState;
import io.intercom.android.sdk.models.Part;
import io.intercom.android.sdk.models.ReplyOption;
import io.intercom.android.sdk.models.Source;
import io.intercom.android.sdk.ui.IntercomPreviews;
import io.intercom.android.sdk.ui.theme.IntercomThemeKt;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: MessageList.kt */
@Metadata(d1 = {"\u0000\u0086\u0001\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\r\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a§\u0002\u0010\u0000\u001a\u00020\u00012\b\b\u0002\u0010\u0002\u001a\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\b\b\u0002\u0010\u0007\u001a\u00020\b2\u0014\b\u0002\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u00010\n2\u0014\b\u0002\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u00010\n2\u0014\b\u0002\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u00010\n2\u0014\b\u0002\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u00010\n2\u0014\b\u0002\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u00010\n2\u000e\b\u0002\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00010\u00152\u0014\b\u0002\u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\u00010\n2\b\b\u0002\u0010\u0018\u001a\u00020\u00192\u0014\b\u0002\u0010\u001a\u001a\u000e\u0012\u0004\u0012\u00020\u001b\u0012\u0004\u0012\u00020\u00010\n2(\b\u0002\u0010\u001c\u001a\"\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001e0\u0005\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001f0\u0005\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u001d2\b\b\u0002\u0010 \u001a\u00020\u00192\u000e\b\u0002\u0010!\u001a\b\u0012\u0004\u0012\u00020\u00010\u0015H\u0001¢\u0006\u0002\u0010\"\u001a+\u0010#\u001a\u00020$2\u0006\u0010%\u001a\u00020\u00062\u0006\u0010&\u001a\u00020'2\f\u0010(\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H\u0000¢\u0006\u0002\u0010)\u001a\f\u0010/\u001a\u00020\u0019*\u00020\bH\u0002\u001a\r\u00100\u001a\u00020\u0001H\u0001¢\u0006\u0002\u00101\u001a\r\u00102\u001a\u00020\u0001H\u0003¢\u0006\u0002\u00101\"\u0010\u0010*\u001a\u00020$X\u0082\u0004¢\u0006\u0004\n\u0002\u0010+\"\u0010\u0010,\u001a\u00020$X\u0082\u0004¢\u0006\u0004\n\u0002\u0010+\"\u0010\u0010-\u001a\u00020$X\u0082\u0004¢\u0006\u0004\n\u0002\u0010+\"\u0010\u0010.\u001a\u00020$X\u0082\u0004¢\u0006\u0004\n\u0002\u0010+¨\u00063²\u0006\n\u00104\u001a\u000205X\u008a\u0084\u0002²\u0006\n\u00106\u001a\u000207X\u008a\u008e\u0002²\u0006\n\u00108\u001a\u000207X\u008a\u008e\u0002²\u0006\n\u00109\u001a\u00020\u0019X\u008a\u008e\u0002²\u0006\n\u0010:\u001a\u00020\u0019X\u008a\u008e\u0002"}, d2 = {"MessageList", "", "modifier", "Landroidx/compose/ui/Modifier;", "contentRows", "", "Lio/intercom/android/sdk/m5/conversation/states/ContentRow;", "scrollState", "Landroidx/compose/foundation/ScrollState;", "onSuggestionClick", "Lkotlin/Function1;", "Lio/intercom/android/sdk/m5/conversation/states/ReplySuggestion;", "onReplyClicked", "Lio/intercom/android/sdk/models/ReplyOption;", "onRetryMessageClicked", "Lio/intercom/android/sdk/models/Part;", "onRetryImageClicked", "Lio/intercom/android/sdk/m5/conversation/states/PendingMessage$FailedImageUploadData;", "onSubmitAttribute", "Lio/intercom/android/sdk/m5/conversation/states/AttributeData;", "navigateToTicketDetail", "Lkotlin/Function0;", "onCreateTicket", "Lio/intercom/android/sdk/blocks/lib/models/TicketType;", "addComposerPadding", "", "navigateToAnotherConversation", "", "onInlineSourcesClick", "Lkotlin/Function2;", "Lio/intercom/android/sdk/models/InlineSource;", "Lio/intercom/android/sdk/models/Source;", "showReportAiAnswerButton", "onReportAiAnswer", "(Landroidx/compose/ui/Modifier;Ljava/util/List;Landroidx/compose/foundation/ScrollState;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;ZLkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function2;ZLkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;III)V", "gapWithPrevious", "Landroidx/compose/ui/unit/Dp;", "contentRow", "contentRowIndex", "", "allContentRows", "(Lio/intercom/android/sdk/m5/conversation/states/ContentRow;ILjava/util/List;)F", "GroupedMessageGap", "F", "DefaultMessageGap", "BigMessageGap", "LargeMessageGap", "isAtBottom", "MessageListPreview", "(Landroidx/compose/runtime/Composer;I)V", "EmptyMessageListPreview", "intercom-sdk-base_release", "keyboardAsState", "Lio/intercom/android/sdk/m5/conversation/utils/KeyboardState;", "oldBounds", "Lio/intercom/android/sdk/m5/conversation/ui/components/MessageListCoordinates;", "currentBounds", "autoScrollEnabled", "hasUserScrolled"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class MessageListKt {
    private static final float GroupedMessageGap = Dp.m8798constructorimpl(2);
    private static final float DefaultMessageGap = Dp.m8798constructorimpl(16);
    private static final float BigMessageGap = Dp.m8798constructorimpl(24);
    private static final float LargeMessageGap = Dp.m8798constructorimpl(32);

    /* compiled from: MessageList.kt */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[GroupingPosition.values().length];
            try {
                iArr[GroupingPosition.STANDALONE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[GroupingPosition.TOP.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[GroupingPosition.MIDDLE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[GroupingPosition.BOTTOM.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit EmptyMessageListPreview$lambda$43(int i, Composer composer, int i2) {
        EmptyMessageListPreview(composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int MessageList$lambda$39$lambda$38$lambda$36(int i) {
        return i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int MessageList$lambda$39$lambda$38$lambda$37(int i) {
        return i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit MessageList$lambda$41(Modifier modifier, List contentRows, ScrollState scrollState, Function1 function1, Function1 function12, Function1 function13, Function1 function14, Function1 function15, Function0 function0, Function1 function16, boolean z, Function1 function17, Function2 function2, boolean z2, Function0 function02, int i, int i2, int i3, Composer composer, int i4) {
        Intrinsics.checkNotNullParameter(contentRows, "$contentRows");
        MessageList(modifier, contentRows, scrollState, function1, function12, function13, function14, function15, function0, function16, z, function17, function2, z2, function02, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), RecomposeScopeImplKt.updateChangedFlags(i2), i3);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit MessageListPreview$lambda$42(int i, Composer composer, int i2) {
        MessageListPreview(composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit MessageList$lambda$0(ReplySuggestion it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit MessageList$lambda$1(ReplyOption it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit MessageList$lambda$2(Part it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit MessageList$lambda$3(PendingMessage.FailedImageUploadData it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit MessageList$lambda$4(AttributeData it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit MessageList$lambda$6(TicketType it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit MessageList$lambda$7(String it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return Unit.INSTANCE;
    }

    /*  JADX ERROR: Type inference failed
        jadx.core.utils.exceptions.JadxOverflowException: Type inference error: updates count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:77)
        */
    public static final void MessageList(androidx.compose.ui.Modifier r43, java.util.List<? extends io.intercom.android.sdk.m5.conversation.states.ContentRow> r44, androidx.compose.foundation.ScrollState r45, kotlin.jvm.functions.Function1<? super io.intercom.android.sdk.m5.conversation.states.ReplySuggestion, kotlin.Unit> r46, kotlin.jvm.functions.Function1<? super io.intercom.android.sdk.models.ReplyOption, kotlin.Unit> r47, kotlin.jvm.functions.Function1<? super io.intercom.android.sdk.models.Part, kotlin.Unit> r48, kotlin.jvm.functions.Function1<? super io.intercom.android.sdk.m5.conversation.states.PendingMessage.FailedImageUploadData, kotlin.Unit> r49, kotlin.jvm.functions.Function1<? super io.intercom.android.sdk.m5.conversation.states.AttributeData, kotlin.Unit> r50, kotlin.jvm.functions.Function0<kotlin.Unit> r51, kotlin.jvm.functions.Function1<? super io.intercom.android.sdk.blocks.lib.models.TicketType, kotlin.Unit> r52, boolean r53, kotlin.jvm.functions.Function1<? super java.lang.String, kotlin.Unit> r54, kotlin.jvm.functions.Function2<? super java.util.List<io.intercom.android.sdk.models.InlineSource>, ? super java.util.List<io.intercom.android.sdk.models.Source>, kotlin.Unit> r55, boolean r56, kotlin.jvm.functions.Function0<kotlin.Unit> r57, androidx.compose.runtime.Composer r58, int r59, int r60, int r61) {
        /*
            Method dump skipped, instructions count: 2893
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: io.intercom.android.sdk.m5.conversation.ui.components.MessageListKt.MessageList(androidx.compose.ui.Modifier, java.util.List, androidx.compose.foundation.ScrollState, kotlin.jvm.functions.Function1, kotlin.jvm.functions.Function1, kotlin.jvm.functions.Function1, kotlin.jvm.functions.Function1, kotlin.jvm.functions.Function1, kotlin.jvm.functions.Function0, kotlin.jvm.functions.Function1, boolean, kotlin.jvm.functions.Function1, kotlin.jvm.functions.Function2, boolean, kotlin.jvm.functions.Function0, androidx.compose.runtime.Composer, int, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final MessageListCoordinates MessageList$lambda$11(MutableState<MessageListCoordinates> mutableState) {
        return mutableState.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final MessageListCoordinates MessageList$lambda$14(MutableState<MessageListCoordinates> mutableState) {
        return mutableState.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean MessageList$lambda$17(MutableState<Boolean> mutableState) {
        return mutableState.getValue().booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void MessageList$lambda$18(MutableState<Boolean> mutableState, boolean z) {
        mutableState.setValue(Boolean.valueOf(z));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean MessageList$lambda$20(MutableState<Boolean> mutableState) {
        return mutableState.getValue().booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void MessageList$lambda$21(MutableState<Boolean> mutableState, boolean z) {
        mutableState.setValue(Boolean.valueOf(z));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit MessageList$lambda$27$lambda$26(MutableState currentBounds$delegate, LayoutCoordinates layoutCoordinates) {
        Intrinsics.checkNotNullParameter(currentBounds$delegate, "$currentBounds$delegate");
        Intrinsics.checkNotNullParameter(layoutCoordinates, "layoutCoordinates");
        currentBounds$delegate.setValue(new MessageListCoordinates(LayoutCoordinatesKt.boundsInParent(layoutCoordinates), LayoutCoordinatesKt.boundsInWindow(layoutCoordinates), IntSizeKt.m8981toSizeozmzZPI(layoutCoordinates.mo7465getSizeYbymL2g()), null));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit MessageList$lambda$39$lambda$38$lambda$30(Function2 function2, ContentRow item, List clickedSource) {
        Intrinsics.checkNotNullParameter(item, "$item");
        Intrinsics.checkNotNullParameter(clickedSource, "clickedSource");
        if (function2 != null) {
            List<Source> sources = ((ContentRow.FinAnswerRow) item).getPart().getSources();
            Intrinsics.checkNotNullExpressionValue(sources, "getSources(...)");
            function2.invoke(clickedSource, sources);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit MessageList$lambda$39$lambda$38$lambda$33$lambda$32(Density density, float f, MutableState hasUserScrolled$delegate, MutableState currentBounds$delegate, MutableState autoScrollEnabled$delegate, LayoutCoordinates it) {
        Intrinsics.checkNotNullParameter(density, "$density");
        Intrinsics.checkNotNullParameter(hasUserScrolled$delegate, "$hasUserScrolled$delegate");
        Intrinsics.checkNotNullParameter(currentBounds$delegate, "$currentBounds$delegate");
        Intrinsics.checkNotNullParameter(autoScrollEnabled$delegate, "$autoScrollEnabled$delegate");
        Intrinsics.checkNotNullParameter(it, "it");
        Rect boundsInWindow = LayoutCoordinatesKt.boundsInWindow(it);
        float mo744toPx0680j_4 = density.mo744toPx0680j_4(f);
        if (!MessageList$lambda$20(hasUserScrolled$delegate)) {
            MessageList$lambda$18(autoScrollEnabled$delegate, boundsInWindow.getTop() == MessageList$lambda$14(currentBounds$delegate).getBoundsInWindow().getTop() || boundsInWindow.getTop() > MessageList$lambda$14(currentBounds$delegate).getBoundsInWindow().getTop() + mo744toPx0680j_4);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit MessageList$lambda$40(CoroutineScope scope, ScrollState scrollState) {
        Intrinsics.checkNotNullParameter(scope, "$scope");
        BuildersKt__Builders_commonKt.launch$default(scope, null, null, new MessageListKt$MessageList$15$1(scrollState, null), 3, null);
        return Unit.INSTANCE;
    }

    public static final float gapWithPrevious(ContentRow contentRow, int i, List<? extends ContentRow> allContentRows) {
        GroupingPosition groupingPosition;
        Intrinsics.checkNotNullParameter(contentRow, "contentRow");
        Intrinsics.checkNotNullParameter(allContentRows, "allContentRows");
        if (contentRow instanceof ContentRow.DayDividerRow) {
            return LargeMessageGap;
        }
        if ((contentRow instanceof ContentRow.SpecialNoticeRow) || (contentRow instanceof ContentRow.TeamIntroRow) || (contentRow instanceof ContentRow.BubbleMessageRow) || (contentRow instanceof ContentRow.FinAnswerRow) || (contentRow instanceof ContentRow.QuickRepliesRow) || (contentRow instanceof ContentRow.AskedAboutRow) || (contentRow instanceof ContentRow.BigTicketRow) || (contentRow instanceof ContentRow.ComposerSuggestionRow) || (contentRow instanceof ContentRow.EventRow) || (contentRow instanceof ContentRow.TypingIndicatorRow) || (contentRow instanceof ContentRow.NewMessagesRow) || (contentRow instanceof ContentRow.FooterNoticeRow) || (contentRow instanceof ContentRow.PostCardRow) || (contentRow instanceof ContentRow.NoteCardRow) || (contentRow instanceof ContentRow.FinStreamingRow)) {
            ContentRow.BubbleMessageRow bubbleMessageRow = contentRow instanceof ContentRow.BubbleMessageRow ? (ContentRow.BubbleMessageRow) contentRow : null;
            if (bubbleMessageRow == null || (groupingPosition = bubbleMessageRow.getGroupingPosition()) == null) {
                ContentRow.FinAnswerRow finAnswerRow = contentRow instanceof ContentRow.FinAnswerRow ? (ContentRow.FinAnswerRow) contentRow : null;
                groupingPosition = finAnswerRow != null ? finAnswerRow.getGroupingPosition() : GroupingPosition.STANDALONE;
            }
            int i2 = WhenMappings.$EnumSwitchMapping$0[groupingPosition.ordinal()];
            if (i2 != 1 && i2 != 2) {
                if (i2 == 3 || i2 == 4) {
                    return GroupedMessageGap;
                }
                throw new NoWhenBranchMatchedException();
            }
            ContentRow contentRow2 = (ContentRow) CollectionsKt.getOrNull(allContentRows, i - 1);
            if (!(contentRow2 instanceof ContentRow.TicketStatusRow) && !(contentRow2 instanceof ContentRow.MergedConversationRow)) {
                return DefaultMessageGap;
            }
            return BigMessageGap;
        }
        if (!(contentRow instanceof ContentRow.TicketStatusRow) && !(contentRow instanceof ContentRow.MergedConversationRow)) {
            throw new NoWhenBranchMatchedException();
        }
        return BigMessageGap;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean isAtBottom(ScrollState scrollState) {
        return scrollState.getValue() == scrollState.getMaxValue();
    }

    @IntercomPreviews
    public static final void MessageListPreview(Composer composer, final int i) {
        Composer startRestartGroup = composer.startRestartGroup(394311697);
        if (i != 0 || !startRestartGroup.getSkipping()) {
            IntercomThemeKt.IntercomTheme(null, null, null, ComposableSingletons$MessageListKt.INSTANCE.m12200getLambda2$intercom_sdk_base_release(), startRestartGroup, 3072, 7);
        } else {
            startRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new Function2() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.MessageListKt$$ExternalSyntheticLambda8
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    Unit MessageListPreview$lambda$42;
                    MessageListPreview$lambda$42 = MessageListKt.MessageListPreview$lambda$42(i, (Composer) obj, ((Integer) obj2).intValue());
                    return MessageListPreview$lambda$42;
                }
            });
        }
    }

    @IntercomPreviews
    private static final void EmptyMessageListPreview(Composer composer, final int i) {
        Composer startRestartGroup = composer.startRestartGroup(-1882438622);
        if (i != 0 || !startRestartGroup.getSkipping()) {
            IntercomThemeKt.IntercomTheme(null, null, null, ComposableSingletons$MessageListKt.INSTANCE.m12202getLambda4$intercom_sdk_base_release(), startRestartGroup, 3072, 7);
        } else {
            startRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new Function2() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.MessageListKt$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    Unit EmptyMessageListPreview$lambda$43;
                    EmptyMessageListPreview$lambda$43 = MessageListKt.EmptyMessageListPreview$lambda$43(i, (Composer) obj, ((Integer) obj2).intValue());
                    return EmptyMessageListPreview$lambda$43;
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final KeyboardState MessageList$lambda$9(State<KeyboardState> state) {
        return state.getValue();
    }
}
