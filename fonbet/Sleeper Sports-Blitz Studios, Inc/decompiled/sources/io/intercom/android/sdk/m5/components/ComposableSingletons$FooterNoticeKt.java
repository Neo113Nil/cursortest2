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

/* compiled from: FooterNotice.kt */
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class ComposableSingletons$FooterNoticeKt {
    public static final ComposableSingletons$FooterNoticeKt INSTANCE = new ComposableSingletons$FooterNoticeKt();

    /* renamed from: lambda-1, reason: not valid java name */
    public static Function2<Composer, Integer, Unit> f94lambda1 = ComposableLambdaKt.composableLambdaInstance(-316510596, false, new Function2<Composer, Integer, Unit>() { // from class: io.intercom.android.sdk.m5.components.ComposableSingletons$FooterNoticeKt$lambda-1$1
        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            invoke(composer, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(Composer composer, int i) {
            if ((i & 11) != 2 || !composer.getSkipping()) {
                Avatar create = Avatar.create("", "SK");
                Intrinsics.checkNotNullExpressionValue(create, "create(...)");
                FooterNoticeKt.ExpandedFooterNotice(null, "The team will reply in 1314 minutes", "You’ll get replies here and in your email: handover_notice990", CollectionsKt.listOf(new AvatarWrapper(create, false, 2, null)), composer, 4528, 1);
                return;
            }
            composer.skipToGroupEnd();
        }
    });

    /* renamed from: lambda-2, reason: not valid java name */
    public static Function2<Composer, Integer, Unit> f95lambda2 = ComposableLambdaKt.composableLambdaInstance(1192394372, false, new Function2<Composer, Integer, Unit>() { // from class: io.intercom.android.sdk.m5.components.ComposableSingletons$FooterNoticeKt$lambda-2$1
        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            invoke(composer, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(Composer composer, int i) {
            if ((i & 11) != 2 || !composer.getSkipping()) {
                Avatar create = Avatar.create("", "SK");
                Intrinsics.checkNotNullExpressionValue(create, "create(...)");
                Avatar create2 = Avatar.create("", "LD");
                Intrinsics.checkNotNullExpressionValue(create2, "create(...)");
                Avatar create3 = Avatar.create("", "LY");
                Intrinsics.checkNotNullExpressionValue(create3, "create(...)");
                FooterNoticeKt.ExpandedFooterNotice(null, "The team will reply in 1314 minutes", "You’ll get replies here and in your email: handover_notice990", CollectionsKt.listOf((Object[]) new AvatarWrapper[]{new AvatarWrapper(create, false, 2, null), new AvatarWrapper(create2, false, 2, null), new AvatarWrapper(create3, false, 2, null)}), composer, 4528, 1);
                return;
            }
            composer.skipToGroupEnd();
        }
    });

    /* renamed from: lambda-3, reason: not valid java name */
    public static Function2<Composer, Integer, Unit> f96lambda3 = ComposableLambdaKt.composableLambdaInstance(-1618737880, false, new Function2<Composer, Integer, Unit>() { // from class: io.intercom.android.sdk.m5.components.ComposableSingletons$FooterNoticeKt$lambda-3$1
        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            invoke(composer, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(Composer composer, int i) {
            if ((i & 11) != 2 || !composer.getSkipping()) {
                Avatar create = Avatar.create("", "SK");
                Intrinsics.checkNotNullExpressionValue(create, "create(...)");
                FooterNoticeKt.ExpandedFooterNotice(null, "The team will reply in 1314 minutes", "", CollectionsKt.listOf(new AvatarWrapper(create, false, 2, null)), composer, 4528, 1);
                return;
            }
            composer.skipToGroupEnd();
        }
    });

    /* renamed from: lambda-4, reason: not valid java name */
    public static Function2<Composer, Integer, Unit> f97lambda4 = ComposableLambdaKt.composableLambdaInstance(-759832452, false, ComposableSingletons$FooterNoticeKt$lambda4$1.INSTANCE);

    /* renamed from: lambda-5, reason: not valid java name */
    public static Function2<Composer, Integer, Unit> f98lambda5 = ComposableLambdaKt.composableLambdaInstance(1035678920, false, ComposableSingletons$FooterNoticeKt$lambda5$1.INSTANCE);

    /* renamed from: getLambda-1$intercom_sdk_base_release, reason: not valid java name */
    public final Function2<Composer, Integer, Unit> m12057getLambda1$intercom_sdk_base_release() {
        return f94lambda1;
    }

    /* renamed from: getLambda-2$intercom_sdk_base_release, reason: not valid java name */
    public final Function2<Composer, Integer, Unit> m12058getLambda2$intercom_sdk_base_release() {
        return f95lambda2;
    }

    /* renamed from: getLambda-3$intercom_sdk_base_release, reason: not valid java name */
    public final Function2<Composer, Integer, Unit> m12059getLambda3$intercom_sdk_base_release() {
        return f96lambda3;
    }

    /* renamed from: getLambda-4$intercom_sdk_base_release, reason: not valid java name */
    public final Function2<Composer, Integer, Unit> m12060getLambda4$intercom_sdk_base_release() {
        return f97lambda4;
    }

    /* renamed from: getLambda-5$intercom_sdk_base_release, reason: not valid java name */
    public final Function2<Composer, Integer, Unit> m12061getLambda5$intercom_sdk_base_release() {
        return f98lambda5;
    }
}
