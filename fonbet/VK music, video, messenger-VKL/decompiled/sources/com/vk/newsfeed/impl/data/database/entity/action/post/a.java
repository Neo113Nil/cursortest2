package com.vk.newsfeed.impl.data.database.entity.action.post;

import com.vk.newsfeed.common.domain.model.AddLikeAction;
import com.vk.newsfeed.common.domain.model.LikableItemType;
import com.vk.newsfeed.impl.data.database.entity.action.post.AddLikeActionEntity;
import kotlin.NoWhenBranchMatchedException;

/* compiled from: Mappers.kt */
/* loaded from: classes4.dex */
public final class a {

    /* compiled from: Mappers.kt */
    /* renamed from: com.vk.newsfeed.impl.data.database.entity.action.post.a$a, reason: collision with other inner class name */
    public static final /* synthetic */ class C1378a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;
        public static final /* synthetic */ int[] $EnumSwitchMapping$2;
        public static final /* synthetic */ int[] $EnumSwitchMapping$3;

        static {
            int[] iArr = new int[AddLikeAction.TriggerType.values().length];
            try {
                iArr[AddLikeAction.TriggerType.BUTTON.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[AddLikeAction.TriggerType.DOUBLE_TAP.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[AddLikeAction.TriggerType.REACTIONS_MODAL.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[AddLikeAction.TriggerType.REACTIONS_POPUP.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[AddLikeActionEntity.TriggerTypeEntity.values().length];
            try {
                iArr2[AddLikeActionEntity.TriggerTypeEntity.BUTTON.ordinal()] = 1;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr2[AddLikeActionEntity.TriggerTypeEntity.DOUBLE_TAP.ordinal()] = 2;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr2[AddLikeActionEntity.TriggerTypeEntity.REACTIONS_MODAL.ordinal()] = 3;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr2[AddLikeActionEntity.TriggerTypeEntity.REACTIONS_POPUP.ordinal()] = 4;
            } catch (NoSuchFieldError unused8) {
            }
            $EnumSwitchMapping$1 = iArr2;
            int[] iArr3 = new int[LikableItemType.values().length];
            try {
                iArr3[LikableItemType.POST.ordinal()] = 1;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr3[LikableItemType.COMMENT.ordinal()] = 2;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr3[LikableItemType.PHOTO.ordinal()] = 3;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr3[LikableItemType.AUDIO.ordinal()] = 4;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                iArr3[LikableItemType.VIDEO.ordinal()] = 5;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                iArr3[LikableItemType.NOTE.ordinal()] = 6;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                iArr3[LikableItemType.MARKET.ordinal()] = 7;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                iArr3[LikableItemType.PHOTO_COMMENT.ordinal()] = 8;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                iArr3[LikableItemType.VIDEO_COMMENT.ordinal()] = 9;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                iArr3[LikableItemType.TOPIC_COMMENT.ordinal()] = 10;
            } catch (NoSuchFieldError unused18) {
            }
            try {
                iArr3[LikableItemType.MARKET_COMMENT.ordinal()] = 11;
            } catch (NoSuchFieldError unused19) {
            }
            try {
                iArr3[LikableItemType.SITEPAGE.ordinal()] = 12;
            } catch (NoSuchFieldError unused20) {
            }
            try {
                iArr3[LikableItemType.TEXTPOST.ordinal()] = 13;
            } catch (NoSuchFieldError unused21) {
            }
            $EnumSwitchMapping$2 = iArr3;
            int[] iArr4 = new int[LikableItemTypeEntity.values().length];
            try {
                iArr4[LikableItemTypeEntity.POST.ordinal()] = 1;
            } catch (NoSuchFieldError unused22) {
            }
            try {
                iArr4[LikableItemTypeEntity.COMMENT.ordinal()] = 2;
            } catch (NoSuchFieldError unused23) {
            }
            try {
                iArr4[LikableItemTypeEntity.PHOTO.ordinal()] = 3;
            } catch (NoSuchFieldError unused24) {
            }
            try {
                iArr4[LikableItemTypeEntity.AUDIO.ordinal()] = 4;
            } catch (NoSuchFieldError unused25) {
            }
            try {
                iArr4[LikableItemTypeEntity.VIDEO.ordinal()] = 5;
            } catch (NoSuchFieldError unused26) {
            }
            try {
                iArr4[LikableItemTypeEntity.NOTE.ordinal()] = 6;
            } catch (NoSuchFieldError unused27) {
            }
            try {
                iArr4[LikableItemTypeEntity.MARKET.ordinal()] = 7;
            } catch (NoSuchFieldError unused28) {
            }
            try {
                iArr4[LikableItemTypeEntity.PHOTO_COMMENT.ordinal()] = 8;
            } catch (NoSuchFieldError unused29) {
            }
            try {
                iArr4[LikableItemTypeEntity.VIDEO_COMMENT.ordinal()] = 9;
            } catch (NoSuchFieldError unused30) {
            }
            try {
                iArr4[LikableItemTypeEntity.TOPIC_COMMENT.ordinal()] = 10;
            } catch (NoSuchFieldError unused31) {
            }
            try {
                iArr4[LikableItemTypeEntity.MARKET_COMMENT.ordinal()] = 11;
            } catch (NoSuchFieldError unused32) {
            }
            try {
                iArr4[LikableItemTypeEntity.SITEPAGE.ordinal()] = 12;
            } catch (NoSuchFieldError unused33) {
            }
            try {
                iArr4[LikableItemTypeEntity.TEXTPOST.ordinal()] = 13;
            } catch (NoSuchFieldError unused34) {
            }
            $EnumSwitchMapping$3 = iArr4;
        }
    }

    public static final LikableItemTypeEntity a(LikableItemType likableItemType) {
        switch (C1378a.$EnumSwitchMapping$2[likableItemType.ordinal()]) {
            case 1:
                return LikableItemTypeEntity.POST;
            case 2:
                return LikableItemTypeEntity.COMMENT;
            case 3:
                return LikableItemTypeEntity.PHOTO;
            case 4:
                return LikableItemTypeEntity.AUDIO;
            case 5:
                return LikableItemTypeEntity.VIDEO;
            case 6:
                return LikableItemTypeEntity.NOTE;
            case 7:
                return LikableItemTypeEntity.MARKET;
            case 8:
                return LikableItemTypeEntity.PHOTO_COMMENT;
            case 9:
                return LikableItemTypeEntity.VIDEO_COMMENT;
            case 10:
                return LikableItemTypeEntity.TOPIC_COMMENT;
            case 11:
                return LikableItemTypeEntity.MARKET_COMMENT;
            case 12:
                return LikableItemTypeEntity.SITEPAGE;
            case 13:
                return LikableItemTypeEntity.TEXTPOST;
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    public static final LikableItemType b(LikableItemTypeEntity likableItemTypeEntity) {
        switch (C1378a.$EnumSwitchMapping$3[likableItemTypeEntity.ordinal()]) {
            case 1:
                return LikableItemType.POST;
            case 2:
                return LikableItemType.COMMENT;
            case 3:
                return LikableItemType.PHOTO;
            case 4:
                return LikableItemType.AUDIO;
            case 5:
                return LikableItemType.VIDEO;
            case 6:
                return LikableItemType.NOTE;
            case 7:
                return LikableItemType.MARKET;
            case 8:
                return LikableItemType.PHOTO_COMMENT;
            case 9:
                return LikableItemType.VIDEO_COMMENT;
            case 10:
                return LikableItemType.TOPIC_COMMENT;
            case 11:
                return LikableItemType.MARKET_COMMENT;
            case 12:
                return LikableItemType.SITEPAGE;
            case 13:
                return LikableItemType.TEXTPOST;
            default:
                throw new NoWhenBranchMatchedException();
        }
    }
}
