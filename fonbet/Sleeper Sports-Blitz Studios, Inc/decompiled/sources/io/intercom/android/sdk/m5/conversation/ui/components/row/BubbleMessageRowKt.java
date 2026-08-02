package io.intercom.android.sdk.m5.conversation.ui.components.row;

import androidx.compose.foundation.BorderStrokeKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.material3.ButtonDefaults;
import androidx.compose.material3.ButtonKt;
import androidx.compose.material3.ColorSchemeKt;
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
import androidx.compose.ui.draw.ClipKt;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.res.PainterResources_androidKt;
import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.unit.Dp;
import androidx.core.text.HtmlCompat;
import com.facebook.react.uimanager.ViewProps;
import io.intercom.android.sdk.R;
import io.intercom.android.sdk.blocks.lib.BlockType;
import io.intercom.android.sdk.blocks.lib.models.Block;
import io.intercom.android.sdk.blocks.lib.models.BlockAttachment;
import io.intercom.android.sdk.blocks.lib.models.TicketType;
import io.intercom.android.sdk.m5.conversation.states.AttributeData;
import io.intercom.android.sdk.m5.conversation.states.GroupingPosition;
import io.intercom.android.sdk.m5.conversation.states.PendingMessage;
import io.intercom.android.sdk.m5.conversation.ui.components.row.MessageStyle;
import io.intercom.android.sdk.models.Attachments;
import io.intercom.android.sdk.models.Attribute;
import io.intercom.android.sdk.models.Avatar;
import io.intercom.android.sdk.models.Part;
import io.intercom.android.sdk.survey.block.BlockRenderData;
import io.intercom.android.sdk.survey.block.BlockRenderTextStyle;
import io.intercom.android.sdk.survey.block.BlockViewKt;
import io.intercom.android.sdk.survey.block.ImageRenderType;
import io.intercom.android.sdk.ui.IntercomPreviews;
import io.intercom.android.sdk.ui.theme.IntercomTheme;
import io.intercom.android.sdk.ui.theme.IntercomThemeKt;
import io.intercom.android.sdk.views.compose.AttributeCollectorCardKt;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: BubbleMessageRow.kt */
@Metadata(d1 = {"\u0000\u0098\u0001\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\u001aµ\u0001\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b2\u0014\b\u0002\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u00010\r2\u000e\b\u0002\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00102\u000e\b\u0002\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00102\u0014\b\u0002\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u00010\r2\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00132\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u00162\u0014\b\u0002\u0010\u0017\u001a\u000e\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\u00010\rH\u0001¢\u0006\u0002\u0010\u0019\u001a%\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u001c\u001a\u00020\u0007H\u0003¢\u0006\u0002\u0010\u001d\u001a\u0017\u0010\u001e\u001a\u00020\u00012\b\b\u0002\u0010\b\u001a\u00020\tH\u0003¢\u0006\u0002\u0010\u001f\u001a±\u0001\u0010 \u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00102\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00102\u0012\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u00010\r2\u0006\u0010!\u001a\u00020\"2\u0006\u0010#\u001a\u00020\u00072\u0006\u0010$\u001a\u00020%2\f\u0010&\u001a\b\u0012\u0004\u0012\u00020\u00010'2\u0012\u0010\u0017\u001a\u000e\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\u00010\r2\u0006\u0010\u0006\u001a\u00020\u00072\b\u0010\u0014\u001a\u0004\u0018\u00010\u00132\u0012\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u00010\r2\b\b\u0002\u0010(\u001a\u00020)H\u0001¢\u0006\u0004\b*\u0010+\u001a\r\u0010,\u001a\u00020\u0001H\u0003¢\u0006\u0002\u0010-\u001a/\u0010.\u001a\u00020\u00012\b\b\u0002\u0010\b\u001a\u00020\t2\u0006\u0010/\u001a\u00020\u000b2\u0006\u00100\u001a\u00020\u000b2\u0006\u0010\u0006\u001a\u00020\u0007H\u0001¢\u0006\u0002\u00101\u001a\f\u00102\u001a\u000203*\u00020\u0003H\u0000\u001a\u0015\u00104\u001a\u0002052\u0006\u0010#\u001a\u00020\u0007H\u0001¢\u0006\u0002\u00106\u001a\f\u0010K\u001a\u00020\u0007*\u00020\u0003H\u0000\"\u001e\u00107\u001a\n 9*\u0004\u0018\u00010808X\u0080\u0004¢\u0006\n\n\u0002\u0010<\u001a\u0004\b:\u0010;\"\u001e\u0010=\u001a\n 9*\u0004\u0018\u00010808X\u0080\u0004¢\u0006\n\n\u0002\u0010<\u001a\u0004\b>\u0010;\"\u001e\u0010?\u001a\n 9*\u0004\u0018\u00010808X\u0080\u0004¢\u0006\n\n\u0002\u0010<\u001a\u0004\b@\u0010;\"\u001e\u0010A\u001a\n 9*\u0004\u0018\u00010808X\u0080\u0004¢\u0006\n\n\u0002\u0010<\u001a\u0004\bB\u0010;\"\u001e\u0010C\u001a\n 9*\u0004\u0018\u00010808X\u0080\u0004¢\u0006\n\n\u0002\u0010<\u001a\u0004\bD\u0010;\"\u0014\u0010E\u001a\u00020FX\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\bG\u0010H\"\u0014\u0010I\u001a\b\u0012\u0004\u0012\u00020J0\u0010X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006L"}, d2 = {"BubbleMessageRow", "", "conversationPart", "Lio/intercom/android/sdk/models/Part;", "groupingPosition", "Lio/intercom/android/sdk/m5/conversation/states/GroupingPosition;", "isAdminOrAltParticipant", "", "modifier", "Landroidx/compose/ui/Modifier;", "timestamp", "", "onSubmitAttribute", "Lkotlin/Function1;", "Lio/intercom/android/sdk/m5/conversation/states/AttributeData;", "failedAttributeIdentifiers", "", "loadingAttributeIdentifiers", "onRetryImageClicked", "Lio/intercom/android/sdk/m5/conversation/states/PendingMessage$FailedImageUploadData;", "failedImageUploadData", "failedMessage", "Lio/intercom/android/sdk/m5/conversation/ui/components/row/FailedMessage;", "onCreateTicket", "Lio/intercom/android/sdk/blocks/lib/models/TicketType;", "(Lio/intercom/android/sdk/models/Part;Lio/intercom/android/sdk/m5/conversation/states/GroupingPosition;ZLandroidx/compose/ui/Modifier;Ljava/lang/String;Lkotlin/jvm/functions/Function1;Ljava/util/List;Ljava/util/List;Lkotlin/jvm/functions/Function1;Lio/intercom/android/sdk/m5/conversation/states/PendingMessage$FailedImageUploadData;Lio/intercom/android/sdk/m5/conversation/ui/components/row/FailedMessage;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;III)V", "getMessageStyle", "Lio/intercom/android/sdk/m5/conversation/ui/components/row/MessageStyle;", "isFailed", "(ZLio/intercom/android/sdk/m5/conversation/states/GroupingPosition;ZLandroidx/compose/runtime/Composer;I)Lio/intercom/android/sdk/m5/conversation/ui/components/row/MessageStyle;", "FailedMessageIcon", "(Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "MessageContent", "contentColor", "Landroidx/compose/ui/graphics/Color;", "enabled", "contentShape", "Landroidx/compose/ui/graphics/Shape;", ViewProps.ON_CLICK, "Lkotlin/Function0;", "spaceBetweenBlocks", "Landroidx/compose/ui/unit/Dp;", "MessageContent-993knro", "(Lio/intercom/android/sdk/models/Part;Ljava/util/List;Ljava/util/List;Lkotlin/jvm/functions/Function1;JZLandroidx/compose/ui/graphics/Shape;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;ZLio/intercom/android/sdk/m5/conversation/states/PendingMessage$FailedImageUploadData;Lkotlin/jvm/functions/Function1;FLandroidx/compose/runtime/Composer;III)V", "BubbleMessageRowPreview", "(Landroidx/compose/runtime/Composer;I)V", "MessageMeta", "metaString", "attributeString", "(Landroidx/compose/ui/Modifier;Ljava/lang/String;Ljava/lang/String;ZLandroidx/compose/runtime/Composer;II)V", "getCopyText", "Landroidx/compose/ui/text/AnnotatedString;", "contentAlpha", "", "(ZLandroidx/compose/runtime/Composer;I)F", "paragraphBlock", "Lio/intercom/android/sdk/blocks/lib/models/Block$Builder;", "kotlin.jvm.PlatformType", "getParagraphBlock", "()Lio/intercom/android/sdk/blocks/lib/models/Block$Builder;", "Lio/intercom/android/sdk/blocks/lib/models/Block$Builder;", "longParagraphBlock", "getLongParagraphBlock", "createTicketBlock", "getCreateTicketBlock", "answerBlock", "getAnswerBlock", "articleBlock", "getArticleBlock", "humanMetadata", "Lio/intercom/android/sdk/models/Metadata;", "getHumanMetadata", "()Lio/intercom/android/sdk/models/Metadata;", "imageBlockTypes", "Lio/intercom/android/sdk/blocks/lib/BlockType;", "shouldShowAttribution", "intercom-sdk-base_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class BubbleMessageRowKt {
    private static final Block.Builder paragraphBlock = new Block.Builder().withText("Hey").withType(BlockType.PARAGRAPH.getSerializedName());
    private static final Block.Builder longParagraphBlock = new Block.Builder().withText("Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua.").withType(BlockType.PARAGRAPH.getSerializedName());
    private static final Block.Builder createTicketBlock = new Block.Builder().withTitle("Create ticket").withTicketType(new TicketType(-1, "Bug", "", CollectionsKt.emptyList(), false)).withType(BlockType.CREATETICKETCARD.getSerializedName());
    private static final Block.Builder answerBlock = new Block.Builder().withText("Yes, you can change the date of your stay for up to seven days before it is due to begin. To do this, first go to your stays and click the relevant one. Then, go to change details and enter a new date. <a class=\"inline-citation\" data-entity-id=\"1\" data-entity-type=\"other\" data-source-index=\"1\" href=\"http://external.source.com\" title=\"Changing the date of your stay using our mobile app\"></a> <a class=\"inline-citation\" data-entity-id=\"2\" data-entity-type=\"article\" data-source-index=\"2\" href=\"http://intercom.com\" title=\"Cancel your booking\"></a>").withType(BlockType.PARAGRAPH.getSerializedName());
    private static final Block.Builder articleBlock = new Block.Builder().withText("I can’t find exactly what you need, but here is an article that could help:<br><br><a href=\"http://www.intercom.com\"> Making a group reservation</a><br>Explains how to make a group reservation with multiple guests.").withType(BlockType.PARAGRAPH.getSerializedName());
    private static final io.intercom.android.sdk.models.Metadata humanMetadata = new io.intercom.android.sdk.models.Metadata("Lisa", null, null, CollectionsKt.listOf(new Avatar.Builder().withInitials("L")), 6, null);
    private static final List<BlockType> imageBlockTypes = CollectionsKt.listOf((Object[]) new BlockType[]{BlockType.IMAGE, BlockType.LOCALIMAGE});

    /* compiled from: BubbleMessageRow.kt */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[BlockType.values().length];
            try {
                iArr[BlockType.SUBHEADING.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[BlockType.HEADING.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[BlockType.CODE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[BlockType.PARAGRAPH.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[BlockType.LINK.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[BlockType.UNORDEREDLIST.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[BlockType.ORDEREDLIST.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit BubbleMessageRow$lambda$5(Part conversationPart, GroupingPosition groupingPosition, boolean z, Modifier modifier, String str, Function1 function1, List list, List list2, Function1 function12, PendingMessage.FailedImageUploadData failedImageUploadData, FailedMessage failedMessage, Function1 function13, int i, int i2, int i3, Composer composer, int i4) {
        Intrinsics.checkNotNullParameter(conversationPart, "$conversationPart");
        Intrinsics.checkNotNullParameter(groupingPosition, "$groupingPosition");
        BubbleMessageRow(conversationPart, groupingPosition, z, modifier, str, function1, list, list2, function12, failedImageUploadData, failedMessage, function13, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), RecomposeScopeImplKt.updateChangedFlags(i2), i3);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit BubbleMessageRowPreview$lambda$13(int i, Composer composer, int i2) {
        BubbleMessageRowPreview(composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit FailedMessageIcon$lambda$6(Modifier modifier, int i, int i2, Composer composer, int i3) {
        FailedMessageIcon(modifier, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit MessageContent_993knro$lambda$12(Part conversationPart, List failedAttributeIdentifiers, List loadingAttributeIdentifiers, Function1 onSubmitAttribute, long j, boolean z, Shape contentShape, Function0 onClick, Function1 onCreateTicket, boolean z2, PendingMessage.FailedImageUploadData failedImageUploadData, Function1 onRetryImageClicked, float f, int i, int i2, int i3, Composer composer, int i4) {
        Intrinsics.checkNotNullParameter(conversationPart, "$conversationPart");
        Intrinsics.checkNotNullParameter(failedAttributeIdentifiers, "$failedAttributeIdentifiers");
        Intrinsics.checkNotNullParameter(loadingAttributeIdentifiers, "$loadingAttributeIdentifiers");
        Intrinsics.checkNotNullParameter(onSubmitAttribute, "$onSubmitAttribute");
        Intrinsics.checkNotNullParameter(contentShape, "$contentShape");
        Intrinsics.checkNotNullParameter(onClick, "$onClick");
        Intrinsics.checkNotNullParameter(onCreateTicket, "$onCreateTicket");
        Intrinsics.checkNotNullParameter(onRetryImageClicked, "$onRetryImageClicked");
        m12330MessageContent993knro(conversationPart, failedAttributeIdentifiers, loadingAttributeIdentifiers, onSubmitAttribute, j, z, contentShape, onClick, onCreateTicket, z2, failedImageUploadData, onRetryImageClicked, f, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), RecomposeScopeImplKt.updateChangedFlags(i2), i3);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit MessageMeta$lambda$15(Modifier modifier, String metaString, String attributeString, boolean z, int i, int i2, Composer composer, int i3) {
        Intrinsics.checkNotNullParameter(metaString, "$metaString");
        Intrinsics.checkNotNullParameter(attributeString, "$attributeString");
        MessageMeta(modifier, metaString, attributeString, z, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit BubbleMessageRow$lambda$0(AttributeData it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit BubbleMessageRow$lambda$1(PendingMessage.FailedImageUploadData it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit BubbleMessageRow$lambda$2(TicketType it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return Unit.INSTANCE;
    }

    public static final void BubbleMessageRow(final Part conversationPart, final GroupingPosition groupingPosition, final boolean z, Modifier modifier, String str, Function1<? super AttributeData, Unit> function1, List<String> list, List<String> list2, Function1<? super PendingMessage.FailedImageUploadData, Unit> function12, PendingMessage.FailedImageUploadData failedImageUploadData, FailedMessage failedMessage, Function1<? super TicketType, Unit> function13, Composer composer, final int i, final int i2, final int i3) {
        String str2;
        BottomMetadata bottomMetadata;
        Intrinsics.checkNotNullParameter(conversationPart, "conversationPart");
        Intrinsics.checkNotNullParameter(groupingPosition, "groupingPosition");
        Composer startRestartGroup = composer.startRestartGroup(1247044792);
        Modifier modifier2 = (i3 & 8) != 0 ? Modifier.INSTANCE : modifier;
        String str3 = (i3 & 16) != 0 ? null : str;
        Function1<? super AttributeData, Unit> function14 = (i3 & 32) != 0 ? new Function1() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.row.BubbleMessageRowKt$$ExternalSyntheticLambda4
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                Unit BubbleMessageRow$lambda$0;
                BubbleMessageRow$lambda$0 = BubbleMessageRowKt.BubbleMessageRow$lambda$0((AttributeData) obj);
                return BubbleMessageRow$lambda$0;
            }
        } : function1;
        List<String> emptyList = (i3 & 64) != 0 ? CollectionsKt.emptyList() : list;
        List<String> emptyList2 = (i3 & 128) != 0 ? CollectionsKt.emptyList() : list2;
        Function1<? super PendingMessage.FailedImageUploadData, Unit> function15 = (i3 & 256) != 0 ? new Function1() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.row.BubbleMessageRowKt$$ExternalSyntheticLambda5
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                Unit BubbleMessageRow$lambda$1;
                BubbleMessageRow$lambda$1 = BubbleMessageRowKt.BubbleMessageRow$lambda$1((PendingMessage.FailedImageUploadData) obj);
                return BubbleMessageRow$lambda$1;
            }
        } : function12;
        final PendingMessage.FailedImageUploadData failedImageUploadData2 = (i3 & 512) != 0 ? null : failedImageUploadData;
        FailedMessage failedMessage2 = (i3 & 1024) != 0 ? null : failedMessage;
        Function1<? super TicketType, Unit> function16 = (i3 & 2048) != 0 ? new Function1() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.row.BubbleMessageRowKt$$ExternalSyntheticLambda6
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                Unit BubbleMessageRow$lambda$2;
                BubbleMessageRow$lambda$2 = BubbleMessageRowKt.BubbleMessageRow$lambda$2((TicketType) obj);
                return BubbleMessageRow$lambda$2;
            }
        } : function13;
        int i4 = i >> 6;
        MessageStyle messageStyle = getMessageStyle(z, groupingPosition, failedMessage2 != null, startRestartGroup, (i4 & 14) | (i & 112));
        if (failedMessage2 != null) {
            bottomMetadata = new BottomMetadata(failedMessage2.getMessage(), 0.0f, true, 2, null);
            str2 = str3;
        } else if (str3 != null) {
            String str4 = str3;
            str2 = str4;
            bottomMetadata = new BottomMetadata(str4, 0.0f, false, 6, null);
        } else {
            str2 = str3;
            bottomMetadata = null;
        }
        Alignment.Horizontal rowAlignment = messageStyle.getRowAlignment();
        PaddingValues rowPadding = messageStyle.getRowPadding();
        Function0<Unit> onRetryMessageClicked = failedMessage2 != null ? failedMessage2.getOnRetryMessageClicked() : null;
        final List<String> list3 = emptyList;
        final Function1<? super AttributeData, Unit> function17 = function14;
        final List<String> list4 = emptyList2;
        final Function1<? super TicketType, Unit> function18 = function16;
        final FailedMessage failedMessage3 = failedMessage2;
        final Function1<? super PendingMessage.FailedImageUploadData, Unit> function19 = function15;
        final Modifier modifier3 = modifier2;
        ClickableMessageRowKt.ClickableMessageRow(conversationPart, modifier3, bottomMetadata, rowAlignment, rowPadding, onRetryMessageClicked, ComposableLambdaKt.rememberComposableLambda(873055205, true, new BubbleMessageRowKt$BubbleMessageRow$6(failedMessage3, messageStyle, groupingPosition, conversationPart, list3, list4, function17, function18, z, failedImageUploadData2, function19), startRestartGroup, 54), startRestartGroup, 1572872 | (i4 & 112), 0);
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            final String str5 = str2;
            endRestartGroup.updateScope(new Function2() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.row.BubbleMessageRowKt$$ExternalSyntheticLambda7
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    Unit BubbleMessageRow$lambda$5;
                    BubbleMessageRow$lambda$5 = BubbleMessageRowKt.BubbleMessageRow$lambda$5(Part.this, groupingPosition, z, modifier3, str5, function17, list3, list4, function19, failedImageUploadData2, failedMessage3, function18, i, i2, i3, (Composer) obj, ((Integer) obj2).intValue());
                    return BubbleMessageRow$lambda$5;
                }
            });
        }
    }

    private static final MessageStyle getMessageStyle(boolean z, GroupingPosition groupingPosition, boolean z2, Composer composer, int i) {
        PaddingValues m1154PaddingValuesa9UjIt4$default;
        MessageStyle messageStyle;
        composer.startReplaceGroup(1733827858);
        if (z) {
            composer.startReplaceGroup(-1196725351);
            float m8798constructorimpl = Dp.m8798constructorimpl(20);
            float m8798constructorimpl2 = Dp.m8798constructorimpl(4);
            long m13092getAdminBackground0d7_KjU = IntercomTheme.INSTANCE.getColors(composer, IntercomTheme.$stable).m13092getAdminBackground0d7_KjU();
            float f = 16;
            PaddingValues m1151PaddingValuesYgX7TsA = PaddingKt.m1151PaddingValuesYgX7TsA(Dp.m8798constructorimpl(f), Dp.m8798constructorimpl(12));
            float f2 = (groupingPosition == GroupingPosition.BOTTOM || groupingPosition == GroupingPosition.MIDDLE) ? m8798constructorimpl2 : m8798constructorimpl;
            if (groupingPosition != GroupingPosition.TOP && groupingPosition != GroupingPosition.MIDDLE) {
                m8798constructorimpl2 = m8798constructorimpl;
            }
            messageStyle = new MessageStyle(new MessageStyle.BubbleStyle(m13092getAdminBackground0d7_KjU, m1151PaddingValuesYgX7TsA, RoundedCornerShapeKt.m1523RoundedCornerShapea9UjIt4(f2, m8798constructorimpl, m8798constructorimpl, m8798constructorimpl2), BorderStrokeKt.m612BorderStrokecXLIe8U(Dp.m8798constructorimpl(1), IntercomTheme.INSTANCE.getColors(composer, IntercomTheme.$stable).m13093getAdminBorder0d7_KjU()), null), Alignment.INSTANCE.getStart(), PaddingKt.m1154PaddingValuesa9UjIt4$default(Dp.m8798constructorimpl(f), 0.0f, Dp.m8798constructorimpl(60), 0.0f, 10, null), RoundedCornerShapeKt.m1522RoundedCornerShape0680j_4(m8798constructorimpl));
            composer.endReplaceGroup();
        } else {
            composer.startReplaceGroup(-1195521993);
            float m8798constructorimpl3 = Dp.m8798constructorimpl(20);
            float m8798constructorimpl4 = Dp.m8798constructorimpl(4);
            long m13089getAction0d7_KjU = IntercomTheme.INSTANCE.getColors(composer, IntercomTheme.$stable).m13089getAction0d7_KjU();
            float f3 = 16;
            PaddingValues m1151PaddingValuesYgX7TsA2 = PaddingKt.m1151PaddingValuesYgX7TsA(Dp.m8798constructorimpl(f3), Dp.m8798constructorimpl(12));
            float f4 = (groupingPosition == GroupingPosition.BOTTOM || groupingPosition == GroupingPosition.MIDDLE) ? m8798constructorimpl4 : m8798constructorimpl3;
            if (groupingPosition != GroupingPosition.TOP && groupingPosition != GroupingPosition.MIDDLE) {
                m8798constructorimpl4 = m8798constructorimpl3;
            }
            MessageStyle.BubbleStyle bubbleStyle = new MessageStyle.BubbleStyle(m13089getAction0d7_KjU, m1151PaddingValuesYgX7TsA2, RoundedCornerShapeKt.m1523RoundedCornerShapea9UjIt4(m8798constructorimpl3, f4, m8798constructorimpl4, m8798constructorimpl3), null, null);
            Alignment.Horizontal end = Alignment.INSTANCE.getEnd();
            if (z2) {
                m1154PaddingValuesa9UjIt4$default = PaddingKt.m1154PaddingValuesa9UjIt4$default(Dp.m8798constructorimpl(36), 0.0f, Dp.m8798constructorimpl(f3), 0.0f, 10, null);
            } else {
                m1154PaddingValuesa9UjIt4$default = PaddingKt.m1154PaddingValuesa9UjIt4$default(Dp.m8798constructorimpl(60), 0.0f, Dp.m8798constructorimpl(f3), 0.0f, 10, null);
            }
            MessageStyle messageStyle2 = new MessageStyle(bubbleStyle, end, m1154PaddingValuesa9UjIt4$default, RoundedCornerShapeKt.m1522RoundedCornerShape0680j_4(m8798constructorimpl3));
            composer.endReplaceGroup();
            messageStyle = messageStyle2;
        }
        composer.endReplaceGroup();
        return messageStyle;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void FailedMessageIcon(final Modifier modifier, Composer composer, final int i, final int i2) {
        int i3;
        Composer startRestartGroup = composer.startRestartGroup(-1829301504);
        int i4 = i2 & 1;
        if (i4 != 0) {
            i3 = i | 6;
        } else if ((i & 14) == 0) {
            i3 = (startRestartGroup.changed(modifier) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i3 & 11) != 2 || !startRestartGroup.getSkipping()) {
            if (i4 != 0) {
                modifier = Modifier.INSTANCE;
            }
            IconKt.m3194Iconww6aTOc(PainterResources_androidKt.painterResource(R.drawable.intercom_message_error, startRestartGroup, 0), (String) null, SizeKt.m1209size3ABfNKs(modifier, Dp.m8798constructorimpl(16)), IntercomTheme.INSTANCE.getColors(startRestartGroup, IntercomTheme.$stable).m13104getError0d7_KjU(), startRestartGroup, 56, 0);
        } else {
            startRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new Function2() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.row.BubbleMessageRowKt$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    Unit FailedMessageIcon$lambda$6;
                    FailedMessageIcon$lambda$6 = BubbleMessageRowKt.FailedMessageIcon$lambda$6(Modifier.this, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                    return FailedMessageIcon$lambda$6;
                }
            });
        }
    }

    /* renamed from: MessageContent-993knro, reason: not valid java name */
    public static final void m12330MessageContent993knro(final Part conversationPart, final List<String> failedAttributeIdentifiers, final List<String> loadingAttributeIdentifiers, final Function1<? super AttributeData, Unit> onSubmitAttribute, final long j, final boolean z, final Shape contentShape, final Function0<Unit> function0, final Function1<? super TicketType, Unit> function1, final boolean z2, final PendingMessage.FailedImageUploadData failedImageUploadData, final Function1<? super PendingMessage.FailedImageUploadData, Unit> onRetryImageClicked, float f, Composer composer, final int i, final int i2, final int i3) {
        Composer composer2;
        List emptyList;
        Intrinsics.checkNotNullParameter(conversationPart, "conversationPart");
        Intrinsics.checkNotNullParameter(failedAttributeIdentifiers, "failedAttributeIdentifiers");
        Intrinsics.checkNotNullParameter(loadingAttributeIdentifiers, "loadingAttributeIdentifiers");
        Intrinsics.checkNotNullParameter(onSubmitAttribute, "onSubmitAttribute");
        Intrinsics.checkNotNullParameter(contentShape, "contentShape");
        Function0<Unit> onClick = function0;
        Intrinsics.checkNotNullParameter(onClick, "onClick");
        Function1<? super TicketType, Unit> onCreateTicket = function1;
        Intrinsics.checkNotNullParameter(onCreateTicket, "onCreateTicket");
        Intrinsics.checkNotNullParameter(onRetryImageClicked, "onRetryImageClicked");
        Composer startRestartGroup = composer.startRestartGroup(-1984008321);
        float m8798constructorimpl = (i3 & 4096) != 0 ? Dp.m8798constructorimpl(0) : f;
        Arrangement.HorizontalOrVertical m1016spacedBy0680j_4 = Arrangement.INSTANCE.m1016spacedBy0680j_4(m8798constructorimpl);
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, 1341605231, "CC(Column)N(modifier,verticalArrangement,horizontalAlignment,content)87@4443L61,88@4509L134:Column.kt#2w3rfo");
        Modifier.Companion companion = Modifier.INSTANCE;
        MeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(m1016spacedBy0680j_4, Alignment.INSTANCE.getStart(), startRestartGroup, 0);
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
        startRestartGroup.startReplaceGroup(1162905429);
        if (conversationPart.getMessageStyle() == io.intercom.android.sdk.models.MessageStyle.ATTRIBUTE_COLLECTOR) {
            Modifier fillMaxWidth$default = SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null);
            List<Attribute> attributes = conversationPart.getForm().getAttributes();
            String id = conversationPart.getId();
            Intrinsics.checkNotNullExpressionValue(id, "getId(...)");
            AttributeCollectorCardKt.AttributeCollectorCard(fillMaxWidth$default, attributes, failedAttributeIdentifiers, loadingAttributeIdentifiers, id, conversationPart.getForm().getDisabled(), onSubmitAttribute, startRestartGroup, ((i << 9) & 3670016) | 4678, 0);
            composer2 = startRestartGroup;
        } else {
            composer2 = startRestartGroup;
        }
        composer2.endReplaceGroup();
        composer2.startReplaceGroup(1162967584);
        List<Block> blocks = conversationPart.getBlocks();
        Intrinsics.checkNotNullExpressionValue(blocks, "getBlocks(...)");
        List<Block> list = blocks;
        List<Attachments> attachments = conversationPart.getAttachments();
        Intrinsics.checkNotNullExpressionValue(attachments, "getAttachments(...)");
        if (!attachments.isEmpty()) {
            Block.Builder withType = new Block.Builder().withType("ATTACHMENTLIST");
            List<Attachments> attachments2 = conversationPart.getAttachments();
            Intrinsics.checkNotNullExpressionValue(attachments2, "getAttachments(...)");
            List<Attachments> list2 = attachments2;
            ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list2, 10));
            for (Attachments attachments3 : list2) {
                arrayList.add(new BlockAttachment.Builder().withName(attachments3.getName()).withUrl(attachments3.getUrl()).withContentType(attachments3.getContentType()).withHumanFileSize(attachments3.getHumanFileSize()).build());
            }
            emptyList = CollectionsKt.listOf(withType.withAttachments(CollectionsKt.toList(arrayList)).build());
        } else {
            emptyList = CollectionsKt.emptyList();
        }
        Iterator it = CollectionsKt.plus((Collection) list, (Iterable) emptyList).iterator();
        while (it.hasNext()) {
            Block block = (Block) it.next();
            ComposerKt.sourceInformationMarkerStart(composer2, 1042775818, "CC(Box)N(modifier,contentAlignment,propagateMinConstraints,content)71@3424L131:Box.kt#2w3rfo");
            Modifier.Companion companion2 = Modifier.INSTANCE;
            MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false);
            ComposerKt.sourceInformationMarkerStart(composer2, -1159599143, "CC(Layout)P(!1,2)80@3267L27,83@3433L360:Layout.kt#80mrfh");
            int hashCode2 = Long.hashCode(ComposablesKt.getCurrentCompositeKeyHashCode(composer2, 0));
            CompositionLocalMap currentCompositionLocalMap2 = composer2.getCurrentCompositionLocalMap();
            Modifier materializeModifier2 = ComposedModifierKt.materializeModifier(composer2, companion2);
            Function0<ComposeUiNode> constructor2 = ComposeUiNode.INSTANCE.getConstructor();
            Iterator it2 = it;
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
            BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
            Modifier clip = ClipKt.clip(Modifier.INSTANCE, contentShape);
            Intrinsics.checkNotNull(block);
            Color m6029boximpl = Color.m6029boximpl(j);
            long m8263getFontSizeXSAIIZE = IntercomTheme.INSTANCE.getTypography(composer2, IntercomTheme.$stable).getType04().m8263getFontSizeXSAIIZE();
            FontWeight fontWeight = IntercomTheme.INSTANCE.getTypography(composer2, IntercomTheme.$stable).getType04().getFontWeight();
            if (fontWeight == null) {
                fontWeight = FontWeight.INSTANCE.getNormal();
            }
            Function0<Unit> function02 = onClick;
            Function1<? super TicketType, Unit> function12 = onCreateTicket;
            BlockViewKt.BlockView(clip, new BlockRenderData(block, m6029boximpl, null, null, new BlockRenderTextStyle(m8263getFontSizeXSAIIZE, fontWeight, IntercomTheme.INSTANCE.getTypography(composer2, IntercomTheme.$stable).getType04().m8271getLineHeightXSAIIZE(), null, null, null, 56, null), 12, null), z2, null, z, conversationPart.getParentConversation().getId(), ImageRenderType.WITH_MAX_SIZE, function02, function12, false, null, null, composer2, ((i >> 21) & 896) | 1572928 | ((i >> 3) & 57344) | (i & 29360128) | (i & 234881024), 0, 3592);
            composer2.startReplaceGroup(1737879325);
            if (failedImageUploadData != null) {
                ButtonKt.Button(new Function0() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.row.BubbleMessageRowKt$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        Unit MessageContent_993knro$lambda$11$lambda$10$lambda$9$lambda$8;
                        MessageContent_993knro$lambda$11$lambda$10$lambda$9$lambda$8 = BubbleMessageRowKt.MessageContent_993knro$lambda$11$lambda$10$lambda$9$lambda$8(Function1.this, failedImageUploadData);
                        return MessageContent_993knro$lambda$11$lambda$10$lambda$9$lambda$8;
                    }
                }, boxScopeInstance.align(Modifier.INSTANCE, Alignment.INSTANCE.getCenter()), false, null, ButtonDefaults.INSTANCE.m2707buttonColorsro_MJ88(IntercomTheme.INSTANCE.getColors(composer2, IntercomTheme.$stable).m13089getAction0d7_KjU(), ColorSchemeKt.m2863contentColorForek8zF_U(IntercomTheme.INSTANCE.getColors(composer2, IntercomTheme.$stable).m13089getAction0d7_KjU(), composer2, 0), 0L, 0L, composer2, ButtonDefaults.$stable << 12, 12), null, null, null, null, ComposableSingletons$BubbleMessageRowKt.INSTANCE.m12338getLambda1$intercom_sdk_base_release(), composer2, 805306368, 492);
            }
            composer2.endReplaceGroup();
            ComposerKt.sourceInformationMarkerEnd(composer2);
            composer2.endNode();
            ComposerKt.sourceInformationMarkerEnd(composer2);
            ComposerKt.sourceInformationMarkerEnd(composer2);
            ComposerKt.sourceInformationMarkerEnd(composer2);
            onClick = function0;
            onCreateTicket = function1;
            it = it2;
        }
        composer2.endReplaceGroup();
        ComposerKt.sourceInformationMarkerEnd(composer2);
        composer2.endNode();
        ComposerKt.sourceInformationMarkerEnd(composer2);
        ComposerKt.sourceInformationMarkerEnd(composer2);
        ComposerKt.sourceInformationMarkerEnd(composer2);
        ScopeUpdateScope endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup != null) {
            final float f2 = m8798constructorimpl;
            endRestartGroup.updateScope(new Function2() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.row.BubbleMessageRowKt$$ExternalSyntheticLambda2
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    Unit MessageContent_993knro$lambda$12;
                    MessageContent_993knro$lambda$12 = BubbleMessageRowKt.MessageContent_993knro$lambda$12(Part.this, failedAttributeIdentifiers, loadingAttributeIdentifiers, onSubmitAttribute, j, z, contentShape, function0, function1, z2, failedImageUploadData, onRetryImageClicked, f2, i, i2, i3, (Composer) obj, ((Integer) obj2).intValue());
                    return MessageContent_993knro$lambda$12;
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit MessageContent_993knro$lambda$11$lambda$10$lambda$9$lambda$8(Function1 onRetryImageClicked, PendingMessage.FailedImageUploadData failedImageUploadData) {
        Intrinsics.checkNotNullParameter(onRetryImageClicked, "$onRetryImageClicked");
        onRetryImageClicked.invoke(failedImageUploadData);
        return Unit.INSTANCE;
    }

    @IntercomPreviews
    private static final void BubbleMessageRowPreview(Composer composer, final int i) {
        Composer startRestartGroup = composer.startRestartGroup(481690275);
        if (i != 0 || !startRestartGroup.getSkipping()) {
            IntercomThemeKt.IntercomTheme(null, null, null, ComposableSingletons$BubbleMessageRowKt.INSTANCE.m12339getLambda2$intercom_sdk_base_release(), startRestartGroup, 3072, 7);
        } else {
            startRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new Function2() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.row.BubbleMessageRowKt$$ExternalSyntheticLambda3
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    Unit BubbleMessageRowPreview$lambda$13;
                    BubbleMessageRowPreview$lambda$13 = BubbleMessageRowKt.BubbleMessageRowPreview$lambda$13(i, (Composer) obj, ((Integer) obj2).intValue());
                    return BubbleMessageRowPreview$lambda$13;
                }
            });
        }
    }

    public static final void MessageMeta(Modifier modifier, final String metaString, final String attributeString, final boolean z, Composer composer, final int i, final int i2) {
        Modifier modifier2;
        int i3;
        Composer composer2;
        Modifier modifier3;
        int i4;
        long j;
        Composer composer3;
        final Modifier modifier4;
        Intrinsics.checkNotNullParameter(metaString, "metaString");
        Intrinsics.checkNotNullParameter(attributeString, "attributeString");
        Composer startRestartGroup = composer.startRestartGroup(302477331);
        int i5 = i2 & 1;
        if (i5 != 0) {
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
            i3 |= startRestartGroup.changed(metaString) ? 32 : 16;
        }
        if ((i2 & 4) != 0) {
            i3 |= 384;
        } else if ((i & 896) == 0) {
            i3 |= startRestartGroup.changed(attributeString) ? 256 : 128;
        }
        if ((i2 & 8) != 0) {
            i3 |= 3072;
        } else if ((i & 7168) == 0) {
            i3 |= startRestartGroup.changed(z) ? 2048 : 1024;
        }
        if ((i3 & 5851) != 1170 || !startRestartGroup.getSkipping()) {
            Modifier.Companion companion = i5 != 0 ? Modifier.INSTANCE : modifier2;
            long m13101getDescriptionText0d7_KjU = IntercomTheme.INSTANCE.getColors(startRestartGroup, IntercomTheme.$stable).m13101getDescriptionText0d7_KjU();
            Arrangement.HorizontalOrVertical spaceBetween = Arrangement.INSTANCE.getSpaceBetween();
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 844473419, "CC(Row)N(modifier,horizontalArrangement,verticalAlignment,content)99@5125L58,100@5188L131:Row.kt#2w3rfo");
            MeasurePolicy rowMeasurePolicy = RowKt.rowMeasurePolicy(spaceBetween, Alignment.INSTANCE.getTop(), startRestartGroup, 6);
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
            Updater.m5340setimpl(m5333constructorimpl, rowMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            Updater.m5340setimpl(m5333constructorimpl, currentCompositionLocalMap, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
            if (m5333constructorimpl.getInserting() || !Intrinsics.areEqual(m5333constructorimpl.rememberedValue(), Integer.valueOf(hashCode))) {
                m5333constructorimpl.updateRememberedValue(Integer.valueOf(hashCode));
                m5333constructorimpl.apply(Integer.valueOf(hashCode), setCompositeKeyHash);
            }
            Updater.m5340setimpl(m5333constructorimpl, materializeModifier, ComposeUiNode.INSTANCE.getSetModifier());
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 1456264949, "C101@5233L9:Row.kt#2w3rfo");
            RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
            startRestartGroup.startReplaceGroup(-1112128243);
            if (z) {
                composer2 = startRestartGroup;
                modifier3 = companion;
                i4 = i3;
                j = m13101getDescriptionText0d7_KjU;
            } else {
                i4 = i3;
                modifier3 = companion;
                TextKt.m3901TextNvy7gAk(attributeString, PaddingKt.m1161paddingqDBjuR0$default(Modifier.INSTANCE, 0.0f, 0.0f, Dp.m8798constructorimpl(8), 0.0f, 11, null), m13101getDescriptionText0d7_KjU, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, IntercomTheme.INSTANCE.getTypography(startRestartGroup, IntercomTheme.$stable).getType05(), startRestartGroup, ((i3 >> 6) & 14) | 48, 0, 131064);
                j = m13101getDescriptionText0d7_KjU;
                composer2 = startRestartGroup;
            }
            composer2.endReplaceGroup();
            Composer composer4 = composer2;
            TextKt.m3901TextNvy7gAk(metaString, null, j, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, IntercomTheme.INSTANCE.getTypography(composer2, IntercomTheme.$stable).getType05(), composer4, (i4 >> 3) & 14, 0, 131066);
            composer4.startReplaceGroup(-1112114674);
            if (z) {
                composer3 = composer4;
                TextKt.m3901TextNvy7gAk(attributeString, PaddingKt.m1161paddingqDBjuR0$default(Modifier.INSTANCE, Dp.m8798constructorimpl(8), 0.0f, 0.0f, 0.0f, 14, null), j, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, IntercomTheme.INSTANCE.getTypography(composer4, IntercomTheme.$stable).getType05(), composer3, ((i4 >> 6) & 14) | 48, 0, 131064);
            } else {
                composer3 = composer4;
            }
            composer3.endReplaceGroup();
            ComposerKt.sourceInformationMarkerEnd(composer3);
            composer3.endNode();
            ComposerKt.sourceInformationMarkerEnd(composer3);
            ComposerKt.sourceInformationMarkerEnd(composer3);
            ComposerKt.sourceInformationMarkerEnd(composer3);
            modifier4 = modifier3;
        } else {
            startRestartGroup.skipToGroupEnd();
            composer3 = startRestartGroup;
            modifier4 = modifier2;
        }
        ScopeUpdateScope endRestartGroup = composer3.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new Function2() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.row.BubbleMessageRowKt$$ExternalSyntheticLambda8
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    Unit MessageMeta$lambda$15;
                    MessageMeta$lambda$15 = BubbleMessageRowKt.MessageMeta$lambda$15(Modifier.this, metaString, attributeString, z, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                    return MessageMeta$lambda$15;
                }
            });
        }
    }

    public static final float contentAlpha(boolean z, Composer composer, int i) {
        composer.startReplaceGroup(1168284893);
        float f = z ? 1.0f : 0.38f;
        composer.endReplaceGroup();
        return f;
    }

    public static final Block.Builder getParagraphBlock() {
        return paragraphBlock;
    }

    public static final Block.Builder getLongParagraphBlock() {
        return longParagraphBlock;
    }

    public static final Block.Builder getCreateTicketBlock() {
        return createTicketBlock;
    }

    public static final Block.Builder getAnswerBlock() {
        return answerBlock;
    }

    public static final Block.Builder getArticleBlock() {
        return articleBlock;
    }

    public static final io.intercom.android.sdk.models.Metadata getHumanMetadata() {
        return humanMetadata;
    }

    public static final boolean shouldShowAttribution(Part part) {
        Intrinsics.checkNotNullParameter(part, "<this>");
        if (part.getBlocks().size() != 1) {
            return false;
        }
        List<BlockType> list = imageBlockTypes;
        List<Block> blocks = part.getBlocks();
        Intrinsics.checkNotNullExpressionValue(blocks, "getBlocks(...)");
        if (!list.contains(((Block) CollectionsKt.first((List) blocks)).getType())) {
            return false;
        }
        List<Block> blocks2 = part.getBlocks();
        Intrinsics.checkNotNullExpressionValue(blocks2, "getBlocks(...)");
        String attribution = ((Block) CollectionsKt.first((List) blocks2)).getAttribution();
        Intrinsics.checkNotNullExpressionValue(attribution, "getAttribution(...)");
        return attribution.length() > 0 && part.getMessageState() == Part.MessageState.NORMAL;
    }

    public static final AnnotatedString getCopyText(Part part) {
        Intrinsics.checkNotNullParameter(part, "<this>");
        AnnotatedString.Builder builder = new AnnotatedString.Builder(0, 1, null);
        for (Block block : part.getBlocks()) {
            BlockType type = block.getType();
            switch (type == null ? -1 : WhenMappings.$EnumSwitchMapping$0[type.ordinal()]) {
                case 1:
                case 2:
                case 3:
                case 4:
                    builder.append(HtmlCompat.fromHtml(block.getText(), 0).toString());
                    break;
                case 5:
                    String url = block.getUrl();
                    Intrinsics.checkNotNullExpressionValue(url, "getUrl(...)");
                    builder.append(url);
                    break;
                case 6:
                case 7:
                    for (String str : block.getItems()) {
                        Intrinsics.checkNotNull(str);
                        builder.append(str);
                    }
                    break;
            }
        }
        AnnotatedString annotatedString = builder.toAnnotatedString();
        if (annotatedString.length() == 0) {
            String summary = part.getSummary();
            Intrinsics.checkNotNullExpressionValue(summary, "getSummary(...)");
            annotatedString = new AnnotatedString(summary, null, 2, null);
        }
        return annotatedString;
    }
}
