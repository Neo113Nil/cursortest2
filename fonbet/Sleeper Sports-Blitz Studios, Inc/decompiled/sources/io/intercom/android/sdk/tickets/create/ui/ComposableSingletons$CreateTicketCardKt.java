package io.intercom.android.sdk.tickets.create.ui;

import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Modifier;
import io.intercom.android.sdk.blocks.lib.models.Block;
import io.intercom.android.sdk.survey.block.BlockRenderData;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: CreateTicketCard.kt */
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class ComposableSingletons$CreateTicketCardKt {
    public static final ComposableSingletons$CreateTicketCardKt INSTANCE = new ComposableSingletons$CreateTicketCardKt();

    /* renamed from: lambda-1, reason: not valid java name */
    public static Function2<Composer, Integer, Unit> f377lambda1 = ComposableLambdaKt.composableLambdaInstance(-1627499370, false, new Function2<Composer, Integer, Unit>() { // from class: io.intercom.android.sdk.tickets.create.ui.ComposableSingletons$CreateTicketCardKt$lambda-1$1
        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            invoke(composer, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(Composer composer, int i) {
            Block block;
            if ((i & 11) != 2 || !composer.getSkipping()) {
                Modifier fillMaxWidth$default = SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null);
                block = CreateTicketCardKt.sampleBlock;
                Intrinsics.checkNotNullExpressionValue(block, "access$getSampleBlock$p(...)");
                CreateTicketCardKt.CreateTicketCard(fillMaxWidth$default, new BlockRenderData(block, null, null, null, null, 30, null), true, null, composer, 454, 8);
                return;
            }
            composer.skipToGroupEnd();
        }
    });

    /* renamed from: lambda-2, reason: not valid java name */
    public static Function2<Composer, Integer, Unit> f378lambda2 = ComposableLambdaKt.composableLambdaInstance(-1398017791, false, new Function2<Composer, Integer, Unit>() { // from class: io.intercom.android.sdk.tickets.create.ui.ComposableSingletons$CreateTicketCardKt$lambda-2$1
        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            invoke(composer, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(Composer composer, int i) {
            Block block;
            if ((i & 11) != 2 || !composer.getSkipping()) {
                Modifier fillMaxWidth$default = SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null);
                block = CreateTicketCardKt.sampleBlock;
                Intrinsics.checkNotNullExpressionValue(block, "access$getSampleBlock$p(...)");
                CreateTicketCardKt.CreateTicketCard(fillMaxWidth$default, new BlockRenderData(block, null, null, null, null, 30, null), false, null, composer, 454, 8);
                return;
            }
            composer.skipToGroupEnd();
        }
    });

    /* renamed from: getLambda-1$intercom_sdk_base_release, reason: not valid java name */
    public final Function2<Composer, Integer, Unit> m12848getLambda1$intercom_sdk_base_release() {
        return f377lambda1;
    }

    /* renamed from: getLambda-2$intercom_sdk_base_release, reason: not valid java name */
    public final Function2<Composer, Integer, Unit> m12849getLambda2$intercom_sdk_base_release() {
        return f378lambda2;
    }
}
