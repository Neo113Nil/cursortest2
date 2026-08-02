package com.vk.newsfeed.impl.data.database.entity.action.post;

import com.squareup.wire.EnumAdapter;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.Syntax;
import com.squareup.wire.WireEnum;
import ru.ok.android.webrtc.signaling.api.SignalingProtocol;
import xsna.asp;
import xsna.fpf0;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: LikableItemTypeEntity.kt */
/* loaded from: classes4.dex */
public final class LikableItemTypeEntity implements WireEnum {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ LikableItemTypeEntity[] $VALUES;
    public static final ProtoAdapter<LikableItemTypeEntity> ADAPTER;
    public static final LikableItemTypeEntity AUDIO;
    public static final LikableItemTypeEntity COMMENT;
    public static final b Companion;
    public static final LikableItemTypeEntity MARKET;
    public static final LikableItemTypeEntity MARKET_COMMENT;
    public static final LikableItemTypeEntity NOTE;
    public static final LikableItemTypeEntity PHOTO;
    public static final LikableItemTypeEntity PHOTO_COMMENT;
    public static final LikableItemTypeEntity POST;
    public static final LikableItemTypeEntity SITEPAGE;
    public static final LikableItemTypeEntity TEXTPOST;
    public static final LikableItemTypeEntity TOPIC_COMMENT;
    public static final LikableItemTypeEntity VIDEO;
    public static final LikableItemTypeEntity VIDEO_COMMENT;
    private final int value;

    /* compiled from: LikableItemTypeEntity.kt */
    public static final class a extends EnumAdapter<LikableItemTypeEntity> {
        @Override // com.squareup.wire.EnumAdapter
        public final LikableItemTypeEntity fromValue(int i) {
            LikableItemTypeEntity.Companion.getClass();
            switch (i) {
                case 0:
                    return LikableItemTypeEntity.POST;
                case 1:
                    return LikableItemTypeEntity.COMMENT;
                case 2:
                    return LikableItemTypeEntity.PHOTO;
                case 3:
                    return LikableItemTypeEntity.AUDIO;
                case 4:
                    return LikableItemTypeEntity.VIDEO;
                case 5:
                    return LikableItemTypeEntity.NOTE;
                case 6:
                    return LikableItemTypeEntity.MARKET;
                case 7:
                    return LikableItemTypeEntity.PHOTO_COMMENT;
                case 8:
                    return LikableItemTypeEntity.VIDEO_COMMENT;
                case 9:
                    return LikableItemTypeEntity.TOPIC_COMMENT;
                case 10:
                    return LikableItemTypeEntity.MARKET_COMMENT;
                case 11:
                    return LikableItemTypeEntity.SITEPAGE;
                case 12:
                    return LikableItemTypeEntity.TEXTPOST;
                default:
                    return null;
            }
        }
    }

    /* compiled from: LikableItemTypeEntity.kt */
    public static final class b {
    }

    static {
        LikableItemTypeEntity likableItemTypeEntity = new LikableItemTypeEntity("POST", 0, 0);
        POST = likableItemTypeEntity;
        LikableItemTypeEntity likableItemTypeEntity2 = new LikableItemTypeEntity("COMMENT", 1, 1);
        COMMENT = likableItemTypeEntity2;
        LikableItemTypeEntity likableItemTypeEntity3 = new LikableItemTypeEntity("PHOTO", 2, 2);
        PHOTO = likableItemTypeEntity3;
        LikableItemTypeEntity likableItemTypeEntity4 = new LikableItemTypeEntity(SignalingProtocol.MEDIA_OPTION_AUDIO, 3, 3);
        AUDIO = likableItemTypeEntity4;
        LikableItemTypeEntity likableItemTypeEntity5 = new LikableItemTypeEntity(SignalingProtocol.MEDIA_OPTION_VIDEO, 4, 4);
        VIDEO = likableItemTypeEntity5;
        LikableItemTypeEntity likableItemTypeEntity6 = new LikableItemTypeEntity("NOTE", 5, 5);
        NOTE = likableItemTypeEntity6;
        LikableItemTypeEntity likableItemTypeEntity7 = new LikableItemTypeEntity("MARKET", 6, 6);
        MARKET = likableItemTypeEntity7;
        LikableItemTypeEntity likableItemTypeEntity8 = new LikableItemTypeEntity("PHOTO_COMMENT", 7, 7);
        PHOTO_COMMENT = likableItemTypeEntity8;
        LikableItemTypeEntity likableItemTypeEntity9 = new LikableItemTypeEntity("VIDEO_COMMENT", 8, 8);
        VIDEO_COMMENT = likableItemTypeEntity9;
        LikableItemTypeEntity likableItemTypeEntity10 = new LikableItemTypeEntity("TOPIC_COMMENT", 9, 9);
        TOPIC_COMMENT = likableItemTypeEntity10;
        LikableItemTypeEntity likableItemTypeEntity11 = new LikableItemTypeEntity("MARKET_COMMENT", 10, 10);
        MARKET_COMMENT = likableItemTypeEntity11;
        LikableItemTypeEntity likableItemTypeEntity12 = new LikableItemTypeEntity("SITEPAGE", 11, 11);
        SITEPAGE = likableItemTypeEntity12;
        LikableItemTypeEntity likableItemTypeEntity13 = new LikableItemTypeEntity("TEXTPOST", 12, 12);
        TEXTPOST = likableItemTypeEntity13;
        LikableItemTypeEntity[] likableItemTypeEntityArr = {likableItemTypeEntity, likableItemTypeEntity2, likableItemTypeEntity3, likableItemTypeEntity4, likableItemTypeEntity5, likableItemTypeEntity6, likableItemTypeEntity7, likableItemTypeEntity8, likableItemTypeEntity9, likableItemTypeEntity10, likableItemTypeEntity11, likableItemTypeEntity12, likableItemTypeEntity13};
        $VALUES = likableItemTypeEntityArr;
        $ENTRIES = new asp(likableItemTypeEntityArr);
        Companion = new b();
        ADAPTER = new a(fpf0.a(LikableItemTypeEntity.class), Syntax.PROTO_3, likableItemTypeEntity);
    }

    public LikableItemTypeEntity(String str, int i, int i2) {
        this.value = i2;
    }

    public static LikableItemTypeEntity valueOf(String str) {
        return (LikableItemTypeEntity) Enum.valueOf(LikableItemTypeEntity.class, str);
    }

    public static LikableItemTypeEntity[] values() {
        return (LikableItemTypeEntity[]) $VALUES.clone();
    }

    @Override // com.squareup.wire.WireEnum
    public final int getValue() {
        return this.value;
    }
}
