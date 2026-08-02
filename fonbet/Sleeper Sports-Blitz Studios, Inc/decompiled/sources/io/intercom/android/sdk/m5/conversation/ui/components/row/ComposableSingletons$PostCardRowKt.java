package io.intercom.android.sdk.m5.conversation.ui.components.row;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import io.intercom.android.sdk.blocks.lib.models.Block;
import io.intercom.android.sdk.models.Avatar;
import io.intercom.android.sdk.models.Part;
import io.intercom.android.sdk.models.Participant;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: PostCardRow.kt */
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class ComposableSingletons$PostCardRowKt {
    public static final ComposableSingletons$PostCardRowKt INSTANCE = new ComposableSingletons$PostCardRowKt();

    /* renamed from: lambda-1, reason: not valid java name */
    public static Function2<Composer, Integer, Unit> f221lambda1 = ComposableLambdaKt.composableLambdaInstance(-1591302201, false, new Function2<Composer, Integer, Unit>() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.row.ComposableSingletons$PostCardRowKt$lambda-1$1
        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            invoke(composer, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(Composer composer, int i) {
            if ((i & 11) != 2 || !composer.getSkipping()) {
                Part build = new Part.Builder().withParticipantIsAdmin(false).withBlocks(CollectionsKt.listOf((Object[]) new Block.Builder[]{BubbleMessageRowKt.getParagraphBlock(), BubbleMessageRowKt.getLongParagraphBlock(), BubbleMessageRowKt.getLongParagraphBlock()})).withStyle(io.intercom.android.sdk.models.MessageStyle.POST).build();
                build.setParticipant(Participant.create("", "Paul", "user", "", Avatar.create("", "PK"), false));
                Intrinsics.checkNotNullExpressionValue(build, "apply(...)");
                PostCardRowKt.PostCardRow(null, build, "SDK Test App", composer, 448, 1);
                return;
            }
            composer.skipToGroupEnd();
        }
    });

    /* renamed from: getLambda-1$intercom_sdk_base_release, reason: not valid java name */
    public final Function2<Composer, Integer, Unit> m12355getLambda1$intercom_sdk_base_release() {
        return f221lambda1;
    }
}
