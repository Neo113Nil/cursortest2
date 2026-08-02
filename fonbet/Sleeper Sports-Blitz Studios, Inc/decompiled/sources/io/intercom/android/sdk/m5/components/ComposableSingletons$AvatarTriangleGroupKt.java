package io.intercom.android.sdk.m5.components;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import io.intercom.android.sdk.m5.components.avatar.AvatarWrapper;
import io.intercom.android.sdk.models.Avatar;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: AvatarTriangleGroup.kt */
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class ComposableSingletons$AvatarTriangleGroupKt {
    public static final ComposableSingletons$AvatarTriangleGroupKt INSTANCE = new ComposableSingletons$AvatarTriangleGroupKt();

    /* renamed from: lambda-1, reason: not valid java name */
    public static Function2<Composer, Integer, Unit> f73lambda1 = ComposableLambdaKt.composableLambdaInstance(-1436103865, false, new Function2<Composer, Integer, Unit>() { // from class: io.intercom.android.sdk.m5.components.ComposableSingletons$AvatarTriangleGroupKt$lambda-1$1
        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            invoke(composer, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(Composer composer, int i) {
            if ((i & 11) != 2 || !composer.getSkipping()) {
                Avatar create = Avatar.create("", "SK");
                Intrinsics.checkNotNullExpressionValue(create, "create(...)");
                AvatarTriangleGroupKt.m12025AvatarTriangleGroupjt2gSs(CollectionsKt.listOf(new AvatarWrapper(create, false, 2, null)), null, null, 0.0f, composer, 8, 14);
                return;
            }
            composer.skipToGroupEnd();
        }
    });

    /* renamed from: lambda-2, reason: not valid java name */
    public static Function2<Composer, Integer, Unit> f74lambda2 = ComposableLambdaKt.composableLambdaInstance(-549018737, false, new Function2<Composer, Integer, Unit>() { // from class: io.intercom.android.sdk.m5.components.ComposableSingletons$AvatarTriangleGroupKt$lambda-2$1
        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            invoke(composer, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(Composer composer, int i) {
            if ((i & 11) != 2 || !composer.getSkipping()) {
                Avatar create = Avatar.create("", "SK");
                Intrinsics.checkNotNullExpressionValue(create, "create(...)");
                Avatar create2 = Avatar.create("", "RS");
                Intrinsics.checkNotNullExpressionValue(create2, "create(...)");
                AvatarTriangleGroupKt.m12025AvatarTriangleGroupjt2gSs(CollectionsKt.listOf((Object[]) new AvatarWrapper[]{new AvatarWrapper(create, false, 2, null), new AvatarWrapper(create2, false, 2, null)}), null, null, 0.0f, composer, 8, 14);
                return;
            }
            composer.skipToGroupEnd();
        }
    });

    /* renamed from: lambda-3, reason: not valid java name */
    public static Function2<Composer, Integer, Unit> f75lambda3 = ComposableLambdaKt.composableLambdaInstance(848463324, false, new Function2<Composer, Integer, Unit>() { // from class: io.intercom.android.sdk.m5.components.ComposableSingletons$AvatarTriangleGroupKt$lambda-3$1
        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            invoke(composer, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(Composer composer, int i) {
            if ((i & 11) != 2 || !composer.getSkipping()) {
                Avatar create = Avatar.create("", "SK");
                Intrinsics.checkNotNullExpressionValue(create, "create(...)");
                Avatar create2 = Avatar.create("", "RS");
                Intrinsics.checkNotNullExpressionValue(create2, "create(...)");
                Avatar create3 = Avatar.create("", "VR");
                Intrinsics.checkNotNullExpressionValue(create3, "create(...)");
                AvatarTriangleGroupKt.m12025AvatarTriangleGroupjt2gSs(CollectionsKt.listOf((Object[]) new AvatarWrapper[]{new AvatarWrapper(create, false, 2, null), new AvatarWrapper(create2, false, 2, null), new AvatarWrapper(create3, false, 2, null)}), null, null, 0.0f, composer, 8, 14);
                return;
            }
            composer.skipToGroupEnd();
        }
    });

    /* renamed from: getLambda-1$intercom_sdk_base_release, reason: not valid java name */
    public final Function2<Composer, Integer, Unit> m12031getLambda1$intercom_sdk_base_release() {
        return f73lambda1;
    }

    /* renamed from: getLambda-2$intercom_sdk_base_release, reason: not valid java name */
    public final Function2<Composer, Integer, Unit> m12032getLambda2$intercom_sdk_base_release() {
        return f74lambda2;
    }

    /* renamed from: getLambda-3$intercom_sdk_base_release, reason: not valid java name */
    public final Function2<Composer, Integer, Unit> m12033getLambda3$intercom_sdk_base_release() {
        return f75lambda3;
    }
}
