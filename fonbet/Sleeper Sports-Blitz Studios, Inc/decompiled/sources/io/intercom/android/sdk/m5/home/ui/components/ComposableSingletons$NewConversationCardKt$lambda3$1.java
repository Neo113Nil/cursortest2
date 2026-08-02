package io.intercom.android.sdk.m5.home.ui.components;

import androidx.compose.runtime.Composer;
import io.intercom.android.sdk.m5.components.avatar.AvatarWrapper;
import io.intercom.android.sdk.m5.home.data.Action;
import io.intercom.android.sdk.m5.home.data.HomeCardType;
import io.intercom.android.sdk.m5.home.data.HomeCards;
import io.intercom.android.sdk.m5.home.data.IconType;
import io.intercom.android.sdk.models.Avatar;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: NewConversationCard.kt */
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
/* renamed from: io.intercom.android.sdk.m5.home.ui.components.ComposableSingletons$NewConversationCardKt$lambda-3$1, reason: invalid class name */
/* loaded from: classes9.dex */
final class ComposableSingletons$NewConversationCardKt$lambda3$1 implements Function2<Composer, Integer, Unit> {
    public static final ComposableSingletons$NewConversationCardKt$lambda3$1 INSTANCE = new ComposableSingletons$NewConversationCardKt$lambda3$1();

    ComposableSingletons$NewConversationCardKt$lambda3$1() {
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
        invoke(composer, num.intValue());
        return Unit.INSTANCE;
    }

    public final void invoke(Composer composer, int i) {
        if ((i & 11) != 2 || !composer.getSkipping()) {
            HomeCards.HomeNewConversationData homeNewConversationData = new HomeCards.HomeNewConversationData("Get in touch", HomeCardType.NEW_CONVERSATION, new Action("Ask a question", IconType.FACE_PILE, "Team can help if needed"), false, CollectionsKt.emptyList(), true, true, null);
            Avatar create = Avatar.create("", "VR");
            Intrinsics.checkNotNullExpressionValue(create, "create(...)");
            Avatar create2 = Avatar.create("", "PR");
            Intrinsics.checkNotNullExpressionValue(create2, "create(...)");
            Avatar create3 = Avatar.create("", "SK");
            Intrinsics.checkNotNullExpressionValue(create3, "create(...)");
            Avatar create4 = Avatar.create("", "LD");
            Intrinsics.checkNotNullExpressionValue(create4, "create(...)");
            List listOf = CollectionsKt.listOf((Object[]) new AvatarWrapper[]{new AvatarWrapper(create, false, 2, null), new AvatarWrapper(create2, false, 2, null), new AvatarWrapper(create3, false, 2, null), new AvatarWrapper(create4, false, 2, null)});
            Avatar create5 = Avatar.create("", "B");
            Intrinsics.checkNotNullExpressionValue(create5, "create(...)");
            NewConversationCardKt.NewConversationCard(homeNewConversationData, listOf, new AvatarWrapper(create5, false, 2, null), new Function0() { // from class: io.intercom.android.sdk.m5.home.ui.components.ComposableSingletons$NewConversationCardKt$lambda-3$1$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    Unit unit;
                    unit = Unit.INSTANCE;
                    return unit;
                }
            }, composer, 3656, 0);
            return;
        }
        composer.skipToGroupEnd();
    }
}
