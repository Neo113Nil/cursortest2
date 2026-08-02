package io.intercom.android.sdk.survey.block;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import io.intercom.android.sdk.blocks.lib.models.Block;
import io.intercom.android.sdk.blocks.lib.models.BlockAttachment;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: AttachmentBlock.kt */
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class ComposableSingletons$AttachmentBlockKt {
    public static final ComposableSingletons$AttachmentBlockKt INSTANCE = new ComposableSingletons$AttachmentBlockKt();

    /* renamed from: lambda-1, reason: not valid java name */
    public static Function2<Composer, Integer, Unit> f307lambda1 = ComposableLambdaKt.composableLambdaInstance(-27709551, false, new Function2<Composer, Integer, Unit>() { // from class: io.intercom.android.sdk.survey.block.ComposableSingletons$AttachmentBlockKt$lambda-1$1
        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            invoke(composer, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(Composer composer, int i) {
            if ((i & 11) != 2 || !composer.getSkipping()) {
                Block build = new Block.Builder().withAttachments(CollectionsKt.listOf(new BlockAttachment.Builder().withName("Attachment Name.type").build())).build();
                Intrinsics.checkNotNullExpressionValue(build, "build(...)");
                AttachmentBlockKt.AttachmentBlock(null, new BlockRenderData(build, null, null, null, null, 30, null), false, composer, 448, 1);
                return;
            }
            composer.skipToGroupEnd();
        }
    });

    /* renamed from: getLambda-1$intercom_sdk_base_release, reason: not valid java name */
    public final Function2<Composer, Integer, Unit> m12660getLambda1$intercom_sdk_base_release() {
        return f307lambda1;
    }
}
