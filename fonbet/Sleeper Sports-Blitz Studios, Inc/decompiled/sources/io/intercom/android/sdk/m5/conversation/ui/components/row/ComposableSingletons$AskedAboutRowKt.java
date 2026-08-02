package io.intercom.android.sdk.m5.conversation.ui.components.row;

import androidx.compose.material3.SurfaceKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import io.intercom.android.sdk.blocks.lib.models.Author;
import io.intercom.android.sdk.blocks.lib.models.Block;
import io.intercom.android.sdk.models.Part;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: AskedAboutRow.kt */
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class ComposableSingletons$AskedAboutRowKt {
    public static final ComposableSingletons$AskedAboutRowKt INSTANCE = new ComposableSingletons$AskedAboutRowKt();

    /* renamed from: lambda-1, reason: not valid java name */
    public static Function2<Composer, Integer, Unit> f200lambda1 = ComposableLambdaKt.composableLambdaInstance(92020354, false, new Function2<Composer, Integer, Unit>() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.row.ComposableSingletons$AskedAboutRowKt$lambda-1$1
        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            invoke(composer, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(Composer composer, int i) {
            if ((i & 11) != 2 || !composer.getSkipping()) {
                Part build = new Part.Builder().withBlocks(CollectionsKt.listOf(new Block.Builder().withArticleId("123").withTitle("Article Title Goes Here").withAuthor(new Author.Builder().withName("Namey McNameface").withAvatar("https://www.google.com").build()))).build();
                Intrinsics.checkNotNullExpressionValue(build, "build(...)");
                AskedAboutRowKt.AskedAboutRow(null, build, composer, 64, 1);
                return;
            }
            composer.skipToGroupEnd();
        }
    });

    /* renamed from: lambda-2, reason: not valid java name */
    public static Function2<Composer, Integer, Unit> f201lambda2 = ComposableLambdaKt.composableLambdaInstance(851703911, false, new Function2<Composer, Integer, Unit>() { // from class: io.intercom.android.sdk.m5.conversation.ui.components.row.ComposableSingletons$AskedAboutRowKt$lambda-2$1
        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            invoke(composer, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(Composer composer, int i) {
            if ((i & 11) != 2 || !composer.getSkipping()) {
                SurfaceKt.m3729SurfaceT9BRK9s(null, null, 0L, 0L, 0.0f, 0.0f, null, ComposableSingletons$AskedAboutRowKt.INSTANCE.m12333getLambda1$intercom_sdk_base_release(), composer, 12582912, 127);
            } else {
                composer.skipToGroupEnd();
            }
        }
    });

    /* renamed from: getLambda-1$intercom_sdk_base_release, reason: not valid java name */
    public final Function2<Composer, Integer, Unit> m12333getLambda1$intercom_sdk_base_release() {
        return f200lambda1;
    }

    /* renamed from: getLambda-2$intercom_sdk_base_release, reason: not valid java name */
    public final Function2<Composer, Integer, Unit> m12334getLambda2$intercom_sdk_base_release() {
        return f201lambda2;
    }
}
