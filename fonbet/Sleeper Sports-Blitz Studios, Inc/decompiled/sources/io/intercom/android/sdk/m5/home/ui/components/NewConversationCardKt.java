package io.intercom.android.sdk.m5.home.ui.components;

import androidx.compose.foundation.layout.ColumnScope;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.unit.Dp;
import io.intercom.android.sdk.R;
import io.intercom.android.sdk.m5.components.BotAndHumansFacePileKt;
import io.intercom.android.sdk.m5.components.HomeItemKt;
import io.intercom.android.sdk.m5.components.avatar.AvatarIconKt;
import io.intercom.android.sdk.m5.components.avatar.AvatarWrapper;
import io.intercom.android.sdk.m5.home.data.HomeCards;
import io.intercom.android.sdk.m5.home.data.IconType;
import io.intercom.android.sdk.models.Avatar;
import io.intercom.android.sdk.models.AvatarDetails;
import io.intercom.android.sdk.models.AvatarType;
import io.intercom.android.sdk.models.OpenMessengerResponse;
import io.intercom.android.sdk.ui.IntercomPreviews;
import io.intercom.android.sdk.ui.component.IntercomCardKt;
import io.intercom.android.sdk.ui.theme.IntercomThemeKt;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: NewConversationCard.kt */
@Metadata(d1 = {"\u0000*\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\u001a=\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00010\tH\u0001¢\u0006\u0002\u0010\n\u001a=\u0010\u000b\u001a\u00020\u00012\u0006\u0010\f\u001a\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00010\tH\u0003¢\u0006\u0002\u0010\n\u001a#\u0010\r\u001a\u00020\u00012\u0006\u0010\u000e\u001a\u00020\u000f2\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00010\tH\u0003¢\u0006\u0002\u0010\u0010\u001a\r\u0010\u0011\u001a\u00020\u0001H\u0003¢\u0006\u0002\u0010\u0012\u001a\r\u0010\u0013\u001a\u00020\u0001H\u0003¢\u0006\u0002\u0010\u0012\u001a\r\u0010\u0014\u001a\u00020\u0001H\u0003¢\u0006\u0002\u0010\u0012\u001a\r\u0010\u0015\u001a\u00020\u0001H\u0003¢\u0006\u0002\u0010\u0012¨\u0006\u0016"}, d2 = {"NewConversationCard", "", "newConversation", "Lio/intercom/android/sdk/m5/home/data/HomeCards$HomeNewConversationData;", "adminAvatars", "", "Lio/intercom/android/sdk/m5/components/avatar/AvatarWrapper;", "botAvatar", "onNewConversationClicked", "Lkotlin/Function0;", "(Lio/intercom/android/sdk/m5/home/data/HomeCards$HomeNewConversationData;Ljava/util/List;Lio/intercom/android/sdk/m5/components/avatar/AvatarWrapper;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;II)V", "NewConversationCardV1", "newConversationData", "NewConversationCardV2", "homeCard", "Lio/intercom/android/sdk/models/OpenMessengerResponse$NewConversationData$HomeCard;", "(Lio/intercom/android/sdk/models/OpenMessengerResponse$NewConversationData$HomeCard;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;I)V", "NewConversationCardTeammatePreview", "(Landroidx/compose/runtime/Composer;I)V", "NewConversationCardBotPreview", "NewConversationCardFinWithHumanAccessPreview", "NewConversationCardFinWithoutHumanAccessPreview", "intercom-sdk-base_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class NewConversationCardKt {

    /* compiled from: NewConversationCard.kt */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        static {
            int[] iArr = new int[IconType.values().length];
            try {
                iArr[IconType.TEAMMATE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[IconType.BOT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[IconType.FIN.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[OpenMessengerResponse.IconType.values().length];
            try {
                iArr2[OpenMessengerResponse.IconType.PAPER_PLANE.ordinal()] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$1 = iArr2;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit NewConversationCard$lambda$0(HomeCards.HomeNewConversationData newConversation, List adminAvatars, AvatarWrapper avatarWrapper, Function0 onNewConversationClicked, int i, int i2, Composer composer, int i3) {
        Intrinsics.checkNotNullParameter(newConversation, "$newConversation");
        Intrinsics.checkNotNullParameter(adminAvatars, "$adminAvatars");
        Intrinsics.checkNotNullParameter(onNewConversationClicked, "$onNewConversationClicked");
        NewConversationCard(newConversation, adminAvatars, avatarWrapper, onNewConversationClicked, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit NewConversationCardBotPreview$lambda$4(int i, Composer composer, int i2) {
        NewConversationCardBotPreview(composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit NewConversationCardFinWithHumanAccessPreview$lambda$5(int i, Composer composer, int i2) {
        NewConversationCardFinWithHumanAccessPreview(composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit NewConversationCardFinWithoutHumanAccessPreview$lambda$6(int i, Composer composer, int i2) {
        NewConversationCardFinWithoutHumanAccessPreview(composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit NewConversationCardTeammatePreview$lambda$3(int i, Composer composer, int i2) {
        NewConversationCardTeammatePreview(composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit NewConversationCardV1$lambda$1(HomeCards.HomeNewConversationData newConversationData, List adminAvatars, AvatarWrapper avatarWrapper, Function0 onNewConversationClicked, int i, int i2, Composer composer, int i3) {
        Intrinsics.checkNotNullParameter(newConversationData, "$newConversationData");
        Intrinsics.checkNotNullParameter(adminAvatars, "$adminAvatars");
        Intrinsics.checkNotNullParameter(onNewConversationClicked, "$onNewConversationClicked");
        NewConversationCardV1(newConversationData, adminAvatars, avatarWrapper, onNewConversationClicked, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit NewConversationCardV2$lambda$2(OpenMessengerResponse.NewConversationData.HomeCard homeCard, Function0 onNewConversationClicked, int i, Composer composer, int i2) {
        Intrinsics.checkNotNullParameter(homeCard, "$homeCard");
        Intrinsics.checkNotNullParameter(onNewConversationClicked, "$onNewConversationClicked");
        NewConversationCardV2(homeCard, onNewConversationClicked, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    public static final void NewConversationCard(final HomeCards.HomeNewConversationData newConversation, final List<AvatarWrapper> adminAvatars, AvatarWrapper avatarWrapper, final Function0<Unit> onNewConversationClicked, Composer composer, final int i, final int i2) {
        Intrinsics.checkNotNullParameter(newConversation, "newConversation");
        Intrinsics.checkNotNullParameter(adminAvatars, "adminAvatars");
        Intrinsics.checkNotNullParameter(onNewConversationClicked, "onNewConversationClicked");
        Composer startRestartGroup = composer.startRestartGroup(-773584515);
        final AvatarWrapper avatarWrapper2 = (i2 & 4) != 0 ? null : avatarWrapper;
        IntercomCardKt.IntercomCard(null, null, ComposableLambdaKt.rememberComposableLambda(-1464624655, true, new Function3<ColumnScope, Composer, Integer, Unit>() { // from class: io.intercom.android.sdk.m5.home.ui.components.NewConversationCardKt$NewConversationCard$1
            @Override // kotlin.jvm.functions.Function3
            public /* bridge */ /* synthetic */ Unit invoke(ColumnScope columnScope, Composer composer2, Integer num) {
                invoke(columnScope, composer2, num.intValue());
                return Unit.INSTANCE;
            }

            public final void invoke(ColumnScope IntercomCard, Composer composer2, int i3) {
                Intrinsics.checkNotNullParameter(IntercomCard, "$this$IntercomCard");
                if ((i3 & 81) != 16 || !composer2.getSkipping()) {
                    if (HomeCards.HomeNewConversationData.this.getHomeCard() != null) {
                        composer2.startReplaceGroup(995075445);
                        NewConversationCardKt.NewConversationCardV2(HomeCards.HomeNewConversationData.this.getHomeCard(), onNewConversationClicked, composer2, 8);
                        composer2.endReplaceGroup();
                        return;
                    } else {
                        composer2.startReplaceGroup(995264607);
                        NewConversationCardKt.NewConversationCardV1(HomeCards.HomeNewConversationData.this, adminAvatars, avatarWrapper2, onNewConversationClicked, composer2, 584, 0);
                        composer2.endReplaceGroup();
                        return;
                    }
                }
                composer2.skipToGroupEnd();
            }
        }, startRestartGroup, 54), startRestartGroup, 384, 3);
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new Function2() { // from class: io.intercom.android.sdk.m5.home.ui.components.NewConversationCardKt$$ExternalSyntheticLambda4
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    Unit NewConversationCard$lambda$0;
                    NewConversationCard$lambda$0 = NewConversationCardKt.NewConversationCard$lambda$0(HomeCards.HomeNewConversationData.this, adminAvatars, avatarWrapper2, onNewConversationClicked, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                    return NewConversationCard$lambda$0;
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Deprecated(message = "Use NewConversationCardV2 instead")
    public static final void NewConversationCardV1(final HomeCards.HomeNewConversationData homeNewConversationData, final List<AvatarWrapper> list, AvatarWrapper avatarWrapper, final Function0<Unit> function0, Composer composer, final int i, final int i2) {
        Modifier.Companion companion;
        Composer startRestartGroup = composer.startRestartGroup(-1141879848);
        Integer num = null;
        final AvatarWrapper avatarWrapper2 = (i2 & 4) != 0 ? null : avatarWrapper;
        Modifier m1194defaultMinSizeVpY3zN4$default = SizeKt.m1194defaultMinSizeVpY3zN4$default(Modifier.INSTANCE, 0.0f, Dp.m8798constructorimpl(64), 1, null);
        IconType icon = homeNewConversationData.getAction().getIcon();
        int i3 = icon == null ? -1 : WhenMappings.$EnumSwitchMapping$0[icon.ordinal()];
        if (i3 == 1) {
            num = Integer.valueOf(R.drawable.intercom_send_message_icon);
        } else if (i3 == 2) {
            num = Integer.valueOf(R.drawable.intercom_conversation_card_question);
        } else if (i3 == 3) {
            num = Integer.valueOf(R.drawable.intercom_chevron);
        }
        IconType icon2 = homeNewConversationData.getAction().getIcon();
        if ((icon2 != null ? WhenMappings.$EnumSwitchMapping$0[icon2.ordinal()] : -1) == 1) {
            companion = SizeKt.m1209size3ABfNKs(Modifier.INSTANCE, Dp.m8798constructorimpl(16));
        } else {
            companion = Modifier.INSTANCE;
        }
        HomeItemKt.HomeItem(m1194defaultMinSizeVpY3zN4$default, num, ComposableLambdaKt.rememberComposableLambda(1023934521, true, new Function2<Composer, Integer, Unit>() { // from class: io.intercom.android.sdk.m5.home.ui.components.NewConversationCardKt$NewConversationCardV1$1

            /* compiled from: NewConversationCard.kt */
            @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
            public /* synthetic */ class WhenMappings {
                public static final /* synthetic */ int[] $EnumSwitchMapping$0;

                static {
                    int[] iArr = new int[IconType.values().length];
                    try {
                        iArr[IconType.FIN.ordinal()] = 1;
                    } catch (NoSuchFieldError unused) {
                    }
                    try {
                        iArr[IconType.FACE_PILE.ordinal()] = 2;
                    } catch (NoSuchFieldError unused2) {
                    }
                    $EnumSwitchMapping$0 = iArr;
                }
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num2) {
                invoke(composer2, num2.intValue());
                return Unit.INSTANCE;
            }

            public final void invoke(Composer composer2, int i4) {
                if ((i4 & 11) != 2 || !composer2.getSkipping()) {
                    IconType icon3 = HomeCards.HomeNewConversationData.this.getAction().getIcon();
                    int i5 = icon3 == null ? -1 : WhenMappings.$EnumSwitchMapping$0[icon3.ordinal()];
                    if (i5 == 1) {
                        composer2.startReplaceGroup(1718791131);
                        if (avatarWrapper2 != null) {
                            AvatarIconKt.m12134AvatarIconRd90Nhg(SizeKt.m1209size3ABfNKs(Modifier.INSTANCE, Dp.m8798constructorimpl(32)), avatarWrapper2, null, false, 0L, null, composer2, 70, 60);
                        }
                        composer2.endReplaceGroup();
                        return;
                    }
                    if (i5 == 2) {
                        composer2.startReplaceGroup(1719018020);
                        if (avatarWrapper2 != null) {
                            List<AvatarWrapper> list2 = list;
                            ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list2, 10));
                            Iterator<T> it = list2.iterator();
                            while (it.hasNext()) {
                                arrayList.add(((AvatarWrapper) it.next()).getAvatar());
                            }
                            BotAndHumansFacePileKt.m12028BotAndHumansFacePilehGBTI10(null, avatarWrapper2.getAvatar(), BotAndHumansFacePileKt.humanAvatarPairForHome(arrayList), Dp.m8798constructorimpl(36), null, composer2, 3648, 17);
                        }
                        composer2.endReplaceGroup();
                        return;
                    }
                    composer2.startReplaceGroup(-83081034);
                    composer2.endReplaceGroup();
                    return;
                }
                composer2.skipToGroupEnd();
            }
        }, startRestartGroup, 54), companion, null, homeNewConversationData.getAction().getLabel(), homeNewConversationData.getAction().getSubtitle(), null, function0, startRestartGroup, ((i << 15) & 234881024) | 390, 144);
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            final AvatarWrapper avatarWrapper3 = avatarWrapper2;
            endRestartGroup.updateScope(new Function2() { // from class: io.intercom.android.sdk.m5.home.ui.components.NewConversationCardKt$$ExternalSyntheticLambda3
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    Unit NewConversationCardV1$lambda$1;
                    NewConversationCardV1$lambda$1 = NewConversationCardKt.NewConversationCardV1$lambda$1(HomeCards.HomeNewConversationData.this, list, avatarWrapper3, function0, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                    return NewConversationCardV1$lambda$1;
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void NewConversationCardV2(final OpenMessengerResponse.NewConversationData.HomeCard homeCard, final Function0<Unit> function0, Composer composer, final int i) {
        Modifier.Companion companion;
        Composer startRestartGroup = composer.startRestartGroup(341363796);
        Modifier m1194defaultMinSizeVpY3zN4$default = SizeKt.m1194defaultMinSizeVpY3zN4$default(Modifier.INSTANCE, 0.0f, Dp.m8798constructorimpl(64), 1, null);
        OpenMessengerResponse.IconType icon = homeCard.getIcon();
        Integer icon2 = icon != null ? icon.getIcon() : null;
        OpenMessengerResponse.IconType icon3 = homeCard.getIcon();
        if ((icon3 == null ? -1 : WhenMappings.$EnumSwitchMapping$1[icon3.ordinal()]) == 1) {
            companion = SizeKt.m1209size3ABfNKs(Modifier.INSTANCE, Dp.m8798constructorimpl(16));
        } else {
            companion = Modifier.INSTANCE;
        }
        HomeItemKt.HomeItem(m1194defaultMinSizeVpY3zN4$default, icon2, ComposableLambdaKt.rememberComposableLambda(94824693, true, new Function2<Composer, Integer, Unit>() { // from class: io.intercom.android.sdk.m5.home.ui.components.NewConversationCardKt$NewConversationCardV2$1
            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                invoke(composer2, num.intValue());
                return Unit.INSTANCE;
            }

            public final void invoke(Composer composer2, int i2) {
                if ((i2 & 11) != 2 || !composer2.getSkipping()) {
                    AvatarDetails avatarDetails = OpenMessengerResponse.NewConversationData.HomeCard.this.getAvatarDetails();
                    if ((avatarDetails != null ? avatarDetails.getAvatarType() : null) == AvatarType.FACEPILE) {
                        Avatar build = OpenMessengerResponse.NewConversationData.HomeCard.this.getAvatarDetails().getAvatars().get(0).build();
                        Intrinsics.checkNotNullExpressionValue(build, "build(...)");
                        List drop = CollectionsKt.drop(OpenMessengerResponse.NewConversationData.HomeCard.this.getAvatarDetails().getAvatars(), 1);
                        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(drop, 10));
                        Iterator it = drop.iterator();
                        while (it.hasNext()) {
                            arrayList.add(((Avatar.Builder) it.next()).build());
                        }
                        BotAndHumansFacePileKt.m12028BotAndHumansFacePilehGBTI10(null, build, BotAndHumansFacePileKt.humanAvatarPairForHome(arrayList), Dp.m8798constructorimpl(36), null, composer2, 3648, 17);
                        return;
                    }
                    return;
                }
                composer2.skipToGroupEnd();
            }
        }, startRestartGroup, 54), companion, null, homeCard.getText(), homeCard.getSubtitle(), null, function0, startRestartGroup, ((i << 21) & 234881024) | 390, 144);
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new Function2() { // from class: io.intercom.android.sdk.m5.home.ui.components.NewConversationCardKt$$ExternalSyntheticLambda5
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    Unit NewConversationCardV2$lambda$2;
                    NewConversationCardV2$lambda$2 = NewConversationCardKt.NewConversationCardV2$lambda$2(OpenMessengerResponse.NewConversationData.HomeCard.this, function0, i, (Composer) obj, ((Integer) obj2).intValue());
                    return NewConversationCardV2$lambda$2;
                }
            });
        }
    }

    @IntercomPreviews
    private static final void NewConversationCardTeammatePreview(Composer composer, final int i) {
        Composer startRestartGroup = composer.startRestartGroup(605107279);
        if (i != 0 || !startRestartGroup.getSkipping()) {
            IntercomThemeKt.IntercomTheme(null, null, null, ComposableSingletons$NewConversationCardKt.INSTANCE.m12488getLambda1$intercom_sdk_base_release(), startRestartGroup, 3072, 7);
        } else {
            startRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new Function2() { // from class: io.intercom.android.sdk.m5.home.ui.components.NewConversationCardKt$$ExternalSyntheticLambda6
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    Unit NewConversationCardTeammatePreview$lambda$3;
                    NewConversationCardTeammatePreview$lambda$3 = NewConversationCardKt.NewConversationCardTeammatePreview$lambda$3(i, (Composer) obj, ((Integer) obj2).intValue());
                    return NewConversationCardTeammatePreview$lambda$3;
                }
            });
        }
    }

    @IntercomPreviews
    private static final void NewConversationCardBotPreview(Composer composer, final int i) {
        Composer startRestartGroup = composer.startRestartGroup(-322151692);
        if (i != 0 || !startRestartGroup.getSkipping()) {
            IntercomThemeKt.IntercomTheme(null, null, null, ComposableSingletons$NewConversationCardKt.INSTANCE.m12489getLambda2$intercom_sdk_base_release(), startRestartGroup, 3072, 7);
        } else {
            startRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new Function2() { // from class: io.intercom.android.sdk.m5.home.ui.components.NewConversationCardKt$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    Unit NewConversationCardBotPreview$lambda$4;
                    NewConversationCardBotPreview$lambda$4 = NewConversationCardKt.NewConversationCardBotPreview$lambda$4(i, (Composer) obj, ((Integer) obj2).intValue());
                    return NewConversationCardBotPreview$lambda$4;
                }
            });
        }
    }

    @IntercomPreviews
    private static final void NewConversationCardFinWithHumanAccessPreview(Composer composer, final int i) {
        Composer startRestartGroup = composer.startRestartGroup(1635839473);
        if (i != 0 || !startRestartGroup.getSkipping()) {
            IntercomThemeKt.IntercomTheme(null, null, null, ComposableSingletons$NewConversationCardKt.INSTANCE.m12490getLambda3$intercom_sdk_base_release(), startRestartGroup, 3072, 7);
        } else {
            startRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new Function2() { // from class: io.intercom.android.sdk.m5.home.ui.components.NewConversationCardKt$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    Unit NewConversationCardFinWithHumanAccessPreview$lambda$5;
                    NewConversationCardFinWithHumanAccessPreview$lambda$5 = NewConversationCardKt.NewConversationCardFinWithHumanAccessPreview$lambda$5(i, (Composer) obj, ((Integer) obj2).intValue());
                    return NewConversationCardFinWithHumanAccessPreview$lambda$5;
                }
            });
        }
    }

    @IntercomPreviews
    private static final void NewConversationCardFinWithoutHumanAccessPreview(Composer composer, final int i) {
        Composer startRestartGroup = composer.startRestartGroup(1289284327);
        if (i != 0 || !startRestartGroup.getSkipping()) {
            IntercomThemeKt.IntercomTheme(null, null, null, ComposableSingletons$NewConversationCardKt.INSTANCE.m12491getLambda4$intercom_sdk_base_release(), startRestartGroup, 3072, 7);
        } else {
            startRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new Function2() { // from class: io.intercom.android.sdk.m5.home.ui.components.NewConversationCardKt$$ExternalSyntheticLambda2
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    Unit NewConversationCardFinWithoutHumanAccessPreview$lambda$6;
                    NewConversationCardFinWithoutHumanAccessPreview$lambda$6 = NewConversationCardKt.NewConversationCardFinWithoutHumanAccessPreview$lambda$6(i, (Composer) obj, ((Integer) obj2).intValue());
                    return NewConversationCardFinWithoutHumanAccessPreview$lambda$6;
                }
            });
        }
    }
}
