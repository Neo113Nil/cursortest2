package io.intercom.android.sdk.m5.components;

import androidx.compose.runtime.Composer;
import io.intercom.android.sdk.m5.components.avatar.AvatarWrapper;
import io.intercom.android.sdk.models.Avatar;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: FooterNotice.kt */
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
/* renamed from: io.intercom.android.sdk.m5.components.ComposableSingletons$FooterNoticeKt$lambda-4$1, reason: invalid class name */
/* loaded from: classes9.dex */
final class ComposableSingletons$FooterNoticeKt$lambda4$1 implements Function2<Composer, Integer, Unit> {
    public static final ComposableSingletons$FooterNoticeKt$lambda4$1 INSTANCE = new ComposableSingletons$FooterNoticeKt$lambda4$1();

    ComposableSingletons$FooterNoticeKt$lambda4$1() {
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
        invoke(composer, num.intValue());
        return Unit.INSTANCE;
    }

    public final void invoke(Composer composer, int i) {
        if ((i & 11) != 2 || !composer.getSkipping()) {
            Avatar create = Avatar.create("", "SK");
            Intrinsics.checkNotNullExpressionValue(create, "create(...)");
            FooterNoticeKt.FooterNoticePillWithoutAnimation("The team will reply in 1314 minutes", CollectionsKt.listOf(new AvatarWrapper(create, false, 2, null)), new Function0() { // from class: io.intercom.android.sdk.m5.components.ComposableSingletons$FooterNoticeKt$lambda-4$1$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    Unit unit;
                    unit = Unit.INSTANCE;
                    return unit;
                }
            }, composer, 454);
            return;
        }
        composer.skipToGroupEnd();
    }
}
