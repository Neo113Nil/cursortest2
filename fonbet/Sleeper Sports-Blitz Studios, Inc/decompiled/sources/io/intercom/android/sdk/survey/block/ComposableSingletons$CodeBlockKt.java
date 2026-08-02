package io.intercom.android.sdk.survey.block;

import androidx.compose.material3.SurfaceKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import io.intercom.android.sdk.blocks.lib.BlockType;
import io.intercom.android.sdk.blocks.lib.models.Block;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: CodeBlock.kt */
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class ComposableSingletons$CodeBlockKt {
    public static final ComposableSingletons$CodeBlockKt INSTANCE = new ComposableSingletons$CodeBlockKt();

    /* renamed from: lambda-1, reason: not valid java name */
    public static Function2<Composer, Integer, Unit> f308lambda1 = ComposableLambdaKt.composableLambdaInstance(1197398742, false, new Function2<Composer, Integer, Unit>() { // from class: io.intercom.android.sdk.survey.block.ComposableSingletons$CodeBlockKt$lambda-1$1
        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            invoke(composer, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(Composer composer, int i) {
            if ((i & 11) != 2 || !composer.getSkipping()) {
                Block build = new Block.Builder().withText("This is some code").withType(BlockType.CODE.getSerializedName()).build();
                Intrinsics.checkNotNullExpressionValue(build, "build(...)");
                CodeBlockKt.CodeBlock(build, null, null, composer, 8, 6);
                return;
            }
            composer.skipToGroupEnd();
        }
    });

    /* renamed from: lambda-2, reason: not valid java name */
    public static Function2<Composer, Integer, Unit> f309lambda2 = ComposableLambdaKt.composableLambdaInstance(1026238161, false, new Function2<Composer, Integer, Unit>() { // from class: io.intercom.android.sdk.survey.block.ComposableSingletons$CodeBlockKt$lambda-2$1
        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            invoke(composer, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(Composer composer, int i) {
            if ((i & 11) != 2 || !composer.getSkipping()) {
                SurfaceKt.m3729SurfaceT9BRK9s(null, null, 0L, 0L, 0.0f, 0.0f, null, ComposableSingletons$CodeBlockKt.INSTANCE.m12661getLambda1$intercom_sdk_base_release(), composer, 12582912, 127);
            } else {
                composer.skipToGroupEnd();
            }
        }
    });

    /* renamed from: getLambda-1$intercom_sdk_base_release, reason: not valid java name */
    public final Function2<Composer, Integer, Unit> m12661getLambda1$intercom_sdk_base_release() {
        return f308lambda1;
    }

    /* renamed from: getLambda-2$intercom_sdk_base_release, reason: not valid java name */
    public final Function2<Composer, Integer, Unit> m12662getLambda2$intercom_sdk_base_release() {
        return f309lambda2;
    }
}
