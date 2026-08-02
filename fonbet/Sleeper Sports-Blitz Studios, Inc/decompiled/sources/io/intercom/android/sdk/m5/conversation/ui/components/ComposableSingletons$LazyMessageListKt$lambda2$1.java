package io.intercom.android.sdk.m5.conversation.ui.components;

import androidx.compose.runtime.Composer;
import io.intercom.android.sdk.m5.conversation.states.ContentRow;
import io.intercom.android.sdk.m5.conversation.states.GroupingPosition;
import io.intercom.android.sdk.m5.conversation.ui.components.row.BubbleMessageRowKt;
import io.intercom.android.sdk.models.Part;
import io.intercom.android.sdk.models.ReplyOption;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: LazyMessageList.kt */
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
/* renamed from: io.intercom.android.sdk.m5.conversation.ui.components.ComposableSingletons$LazyMessageListKt$lambda-2$1, reason: invalid class name */
/* loaded from: classes9.dex */
final class ComposableSingletons$LazyMessageListKt$lambda2$1 implements Function2<Composer, Integer, Unit> {
    public static final ComposableSingletons$LazyMessageListKt$lambda2$1 INSTANCE = new ComposableSingletons$LazyMessageListKt$lambda2$1();

    ComposableSingletons$LazyMessageListKt$lambda2$1() {
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
        invoke(composer, num.intValue());
        return Unit.INSTANCE;
    }

    public final void invoke(Composer composer, int i) {
        if ((i & 11) != 2 || !composer.getSkipping()) {
            List createListBuilder = CollectionsKt.createListBuilder();
            createListBuilder.add(new ContentRow.TeamIntroRow("Our team is here to help you with any questions you have"));
            createListBuilder.add(new ContentRow.SpecialNoticeRow("Our response times are slower than usual. We’re working hard to get to your message"));
            Part build = new Part.Builder().withParticipantIsAdmin(true).withBlocks(CollectionsKt.listOf(BubbleMessageRowKt.getParagraphBlock())).withMetadata(BubbleMessageRowKt.getHumanMetadata()).build();
            Intrinsics.checkNotNullExpressionValue(build, "build(...)");
            createListBuilder.add(new ContentRow.BubbleMessageRow(new ContentRow.BubbleMessageRow.PartWrapper(build, false, true, null, null, 24, null), GroupingPosition.STANDALONE, null, false, false, 16, null));
            createListBuilder.add(new ContentRow.DayDividerRow(164138400L));
            Part build2 = new Part.Builder().withParticipantIsAdmin(true).withBlocks(CollectionsKt.listOf(BubbleMessageRowKt.getParagraphBlock())).withMetadata(BubbleMessageRowKt.getHumanMetadata()).build();
            Intrinsics.checkNotNullExpressionValue(build2, "build(...)");
            createListBuilder.add(new ContentRow.BubbleMessageRow(new ContentRow.BubbleMessageRow.PartWrapper(build2, false, true, null, null, 24, null), GroupingPosition.TOP, null, false, false, 16, null));
            Part build3 = new Part.Builder().withParticipantIsAdmin(true).withBlocks(CollectionsKt.listOf(BubbleMessageRowKt.getArticleBlock())).build();
            Intrinsics.checkNotNullExpressionValue(build3, "build(...)");
            createListBuilder.add(new ContentRow.BubbleMessageRow(new ContentRow.BubbleMessageRow.PartWrapper(build3, false, true, null, null, 24, null), GroupingPosition.MIDDLE, null, false, false, 16, null));
            Part build4 = new Part.Builder().withParticipantIsAdmin(true).withBlocks(CollectionsKt.listOf(BubbleMessageRowKt.getCreateTicketBlock())).build();
            Intrinsics.checkNotNullExpressionValue(build4, "build(...)");
            createListBuilder.add(new ContentRow.BubbleMessageRow(new ContentRow.BubbleMessageRow.PartWrapper(build4, false, true, null, null, 24, null), GroupingPosition.BOTTOM, null, false, false, 16, null));
            Part build5 = new Part.Builder().withParticipantIsAdmin(true).withBlocks(CollectionsKt.listOf(BubbleMessageRowKt.getParagraphBlock())).build();
            Intrinsics.checkNotNullExpressionValue(build5, "build(...)");
            createListBuilder.add(new ContentRow.BubbleMessageRow(new ContentRow.BubbleMessageRow.PartWrapper(build5, false, false, null, null, 24, null), GroupingPosition.STANDALONE, null, true, false, 16, null));
            LazyMessageListKt.LazyMessageList(null, CollectionsKt.build(createListBuilder), null, null, new Function1() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.ComposableSingletons$LazyMessageListKt$lambda-2$1$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    Unit invoke$lambda$1;
                    invoke$lambda$1 = ComposableSingletons$LazyMessageListKt$lambda2$1.invoke$lambda$1((ReplyOption) obj);
                    return invoke$lambda$1;
                }
            }, null, null, null, null, null, false, null, false, null, false, null, composer, 24640, 0, 65517);
            return;
        }
        composer.skipToGroupEnd();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$1(ReplyOption it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return Unit.INSTANCE;
    }
}
